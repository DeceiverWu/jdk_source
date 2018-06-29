/*
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.marlin;

public interface DMarlinRenderer extends DPathConsumer2D {

    public DMarlinRenderer init(final int pix_boundsX, final int pix_boundsY,
                                final int pix_boundsWidth, final int pix_boundsHeight,
                                final int windingRule);

    /**
     * Disposes this renderer and recycle it clean up before reusing this instance
     */
    public void dispose();

    public int getOutpixMinX();
    public int getOutpixMaxX();
    public int getOutpixMinY();
    public int getOutpixMaxY();

    public void produceAlphas(MarlinAlphaConsumer ac);

    public double getOffsetX();
    public double getOffsetY();

}
