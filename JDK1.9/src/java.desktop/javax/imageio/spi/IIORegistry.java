/*
 * Copyright (c) 1999, 2017, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javax.imageio.spi;

import java.security.PrivilegedAction;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Vector;
import com.sun.imageio.spi.FileImageInputStreamSpi;
import com.sun.imageio.spi.FileImageOutputStreamSpi;
import com.sun.imageio.spi.InputStreamImageInputStreamSpi;
import com.sun.imageio.spi.OutputStreamImageOutputStreamSpi;
import com.sun.imageio.spi.RAFImageInputStreamSpi;
import com.sun.imageio.spi.RAFImageOutputStreamSpi;
import com.sun.imageio.plugins.gif.GIFImageReaderSpi;
import com.sun.imageio.plugins.gif.GIFImageWriterSpi;
import com.sun.imageio.plugins.jpeg.JPEGImageReaderSpi;
import com.sun.imageio.plugins.jpeg.JPEGImageWriterSpi;
import com.sun.imageio.plugins.png.PNGImageReaderSpi;
import com.sun.imageio.plugins.png.PNGImageWriterSpi;
import com.sun.imageio.plugins.bmp.BMPImageReaderSpi;
import com.sun.imageio.plugins.bmp.BMPImageWriterSpi;
import com.sun.imageio.plugins.wbmp.WBMPImageReaderSpi;
import com.sun.imageio.plugins.wbmp.WBMPImageWriterSpi;
import com.sun.imageio.plugins.tiff.TIFFImageReaderSpi;
import com.sun.imageio.plugins.tiff.TIFFImageWriterSpi;
import sun.awt.AppContext;
import java.util.ServiceLoader;
import java.util.ServiceConfigurationError;

/**
 * A registry for service provider instances.  Service provider
 * classes may be detected at run time by means of meta-information in
 * the JAR files containing them.  The intent is that it be relatively
 * inexpensive to load and inspect all available service provider
 * classes.  These classes may them be used to locate and instantiate
 * more heavyweight classes that will perform actual work, in this
 * case instances of {@code ImageReader},
 * {@code ImageWriter}, {@code ImageTranscoder},
 * {@code ImageInputStream}, and {@code ImageOutputStream}.
 *
 * Service providers found from the Java platform are automatically
 * loaded as soon as this class is instantiated.
 *
 * <p> When the {@code registerApplicationClasspathSpis} method
 * is called, service provider instances declared in the
 * meta-information section of JAR files on the application class path
 * are loaded.  To declare a service provider, a {@code services}
 * subdirectory is placed within the {@code META-INF} directory
 * that is present in every JAR file.  This directory contains a file
 * for each service provider interface that has one or more
 * implementation classes present in the JAR file.  For example, if
 * the JAR file contained a class named
 * {@code com.mycompany.imageio.MyFormatReaderSpi} which
 * implements the {@code ImageReaderSpi} interface, the JAR file
 * would contain a file named:
 *
 * <pre>
 * META-INF/services/javax.imageio.spi.ImageReaderSpi
 * </pre>
 *
 * containing the line:
 *
 * <pre>
 * com.mycompany.imageio.MyFormatReaderSpi
 * </pre>
 *
 * <p> The service provider classes are intended to be lightweight
 * and quick to load.  Implementations of these interfaces
 * should avoid complex dependencies on other classes and on
 * native code.
 *
 * <p> It is also possible to manually add service providers not found
 * automatically, as well as to remove those that are using the
 * interfaces of the {@code ServiceRegistry} class.  Thus
 * the application may customize the contents of the registry as it
 * sees fit.
 *
 * <p> For more details on declaring service providers, and the JAR
 * format in general, see the
 * <a href="{@docRoot}/../specs/jar/jar.html">JAR File Specification</a>.
 */
public final class IIORegistry extends ServiceRegistry {

    /**
     * A {@code Vector} containing the valid IIO registry
     * categories (superinterfaces) to be used in the constructor.
     */
    private static final Vector<Class<?>> initialCategories = new Vector<>(5);

    static {
        initialCategories.add(ImageReaderSpi.class);
        initialCategories.add(ImageWriterSpi.class);
        initialCategories.add(ImageTranscoderSpi.class);
        initialCategories.add(ImageInputStreamSpi.class);
        initialCategories.add(ImageOutputStreamSpi.class);
    }

    /**
     * Set up the valid service provider categories and automatically
     * register all available service providers.
     *
     * <p> The constructor is private in order to prevent creation of
     * additional instances.
     */
    private IIORegistry() {
        super(initialCategories.iterator());
        registerStandardSpis();
        registerApplicationClasspathSpis();
    }

    /**
     * Returns the default {@code IIORegistry} instance used by
     * the Image I/O API.  This instance should be used for all
     * registry functions.
     *
     * <p> Each {@code ThreadGroup} will receive its own
     * instance; this allows different {@code Applet}s in the
     * same browser (for example) to each have their own registry.
     *
     * @return the default registry for the current
     * {@code ThreadGroup}.
     */
    public static IIORegistry getDefaultInstance() {
        AppContext context = AppContext.getAppContext();
        IIORegistry registry =
            (IIORegistry)context.get(IIORegistry.class);
        if (registry == null) {
            // Create an instance for this AppContext
            registry = new IIORegistry();
            context.put(IIORegistry.class, registry);
        }
        return registry;
    }

    private void registerStandardSpis() {
        // Hardwire standard SPIs
        registerServiceProvider(new GIFImageReaderSpi());
        registerServiceProvider(new GIFImageWriterSpi());
        registerServiceProvider(new BMPImageReaderSpi());
        registerServiceProvider(new BMPImageWriterSpi());
        registerServiceProvider(new WBMPImageReaderSpi());
        registerServiceProvider(new WBMPImageWriterSpi());
        registerServiceProvider(new TIFFImageReaderSpi());
        registerServiceProvider(new TIFFImageWriterSpi());
        registerServiceProvider(new PNGImageReaderSpi());
        registerServiceProvider(new PNGImageWriterSpi());
        registerServiceProvider(new JPEGImageReaderSpi());
        registerServiceProvider(new JPEGImageWriterSpi());
        registerServiceProvider(new FileImageInputStreamSpi());
        registerServiceProvider(new FileImageOutputStreamSpi());
        registerServiceProvider(new InputStreamImageInputStreamSpi());
        registerServiceProvider(new OutputStreamImageOutputStreamSpi());
        registerServiceProvider(new RAFImageInputStreamSpi());
        registerServiceProvider(new RAFImageOutputStreamSpi());

        registerInstalledProviders();
    }

    /**
     * Registers all available service providers found on the
     * application class path, using the default
     * {@code ClassLoader}.  This method is typically invoked by
     * the {@code ImageIO.scanForPlugins} method.
     *
     * @see javax.imageio.ImageIO#scanForPlugins
     * @see ClassLoader#getResources
     */
    public void registerApplicationClasspathSpis() {
        // FIX: load only from application classpath

        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        Iterator<Class<?>> categories = getCategories();
        while (categories.hasNext()) {
            @SuppressWarnings("unchecked")
            Class<IIOServiceProvider> c = (Class<IIOServiceProvider>)categories.next();
            Iterator<IIOServiceProvider> riter =
                    ServiceLoader.load(c, loader).iterator();
            while (riter.hasNext()) {
                try {
                    // Note that the next() call is required to be inside
                    // the try/catch block; see 6342404.
                    IIOServiceProvider r = riter.next();
                    registerServiceProvider(r);
                } catch (ServiceConfigurationError err) {
                    if (System.getSecurityManager() != null) {
                        // In the applet case, we will catch the  error so
                        // registration of other plugins can  proceed
                        err.printStackTrace();
                    } else {
                        // In the application case, we will  throw the
                        // error to indicate app/system  misconfiguration
                        throw err;
                    }
                }
            }
        }
    }

    private void registerInstalledProviders() {
        /*
          We need to load installed providers
          in the privileged mode in order to
          be able read corresponding jar files even if
          file read capability is restricted (like the
          applet context case).
         */
        PrivilegedAction<Object> doRegistration =
            new PrivilegedAction<Object>() {
                public Object run() {
                    Iterator<Class<?>> categories = getCategories();
                    while (categories.hasNext()) {
                        @SuppressWarnings("unchecked")
                        Class<IIOServiceProvider> c = (Class<IIOServiceProvider>)categories.next();
                        for (IIOServiceProvider p : ServiceLoader.loadInstalled(c)) {
                            registerServiceProvider(p);
                        }
                    }
                    return this;
                }
            };

        AccessController.doPrivileged(doRegistration);
    }
}
