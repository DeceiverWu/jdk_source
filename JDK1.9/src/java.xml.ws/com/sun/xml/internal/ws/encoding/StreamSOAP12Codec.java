/*
 * Copyright (c) 1997, 2013, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.xml.internal.ws.encoding;

import com.sun.xml.internal.stream.buffer.XMLStreamBuffer;
import com.sun.xml.internal.ws.api.SOAPVersion;
import com.sun.xml.internal.ws.api.WSBinding;
import com.sun.xml.internal.ws.api.WSFeatureList;
import com.sun.xml.internal.ws.api.message.Header;
import com.sun.xml.internal.ws.api.message.Packet;
import com.sun.xml.internal.ws.api.message.AttachmentSet;
import com.sun.xml.internal.ws.api.pipe.ContentType;
import com.sun.xml.internal.ws.message.stream.StreamHeader12;

import javax.xml.stream.XMLStreamReader;
import java.util.Collections;
import java.util.List;
import java.io.InputStream;
import java.io.IOException;

/**
 * {@link StreamSOAPCodec} for SOAP 1.2.
 *
 * @author Paul.Sandoz@Sun.Com
 */
final class StreamSOAP12Codec extends StreamSOAPCodec {

    public static final String SOAP12_MIME_TYPE = "application/soap+xml";
    public static final String DEFAULT_SOAP12_CONTENT_TYPE =
            SOAP12_MIME_TYPE+"; charset="+SOAPBindingCodec.DEFAULT_ENCODING;
    private static final List<String> EXPECTED_CONTENT_TYPES = Collections.singletonList(SOAP12_MIME_TYPE);

    /*package*/  StreamSOAP12Codec() {
        super(SOAPVersion.SOAP_12);
    }

    /*package*/ StreamSOAP12Codec(WSBinding binding) {
        super(binding);
    }

    /*package*/  StreamSOAP12Codec(WSFeatureList features) {
        super(features);
    }

    public String getMimeType() {
        return SOAP12_MIME_TYPE;
    }

    @Override
    protected ContentType getContentType(Packet packet) {
        ContentTypeImpl.Builder b = getContenTypeBuilder(packet);
        // TODO: set accept header
        if (packet.soapAction == null) {
            return b.build();
        } else {
            b.contentType = b.contentType + ";action="+fixQuotesAroundSoapAction(packet.soapAction);
            return b.build();
        }
    }

    @Override
    public void decode(InputStream in, String contentType, Packet packet, AttachmentSet att ) throws IOException {
        com.sun.xml.internal.ws.encoding.ContentType ct = new com.sun.xml.internal.ws.encoding.ContentType(contentType);
        packet.soapAction = fixQuotesAroundSoapAction(ct.getParameter("action"));
        super.decode(in,contentType,packet,att);
    }

    private String fixQuotesAroundSoapAction(String soapAction) {
        if(soapAction != null && (!soapAction.startsWith("\"") || !soapAction.endsWith("\"")) ) {
            String fixedSoapAction = soapAction;
            if(!soapAction.startsWith("\""))
                fixedSoapAction = "\"" + fixedSoapAction;
            if(!soapAction.endsWith("\""))
                fixedSoapAction = fixedSoapAction + "\"";
            return fixedSoapAction;
        }
        return soapAction;
    }

    protected List<String> getExpectedContentTypes() {
        return EXPECTED_CONTENT_TYPES;
    }

    @Override
    protected String getDefaultContentType() {
        return DEFAULT_SOAP12_CONTENT_TYPE;
    }
}
