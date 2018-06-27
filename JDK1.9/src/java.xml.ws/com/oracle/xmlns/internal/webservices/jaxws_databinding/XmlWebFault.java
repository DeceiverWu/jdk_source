/*
 * Copyright (c) 2012, 2013, Oracle and/or its affiliates. All rights reserved.
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

package com.oracle.xmlns.internal.webservices.jaxws_databinding;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.lang.annotation.Annotation;

import static com.oracle.xmlns.internal.webservices.jaxws_databinding.Util.nullSafe;


/**
 * This file was generated by JAXB-RI v2.2.6 and afterwards modified
 * to implement appropriate Annotation
 *
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="faultBean" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "web-fault")
public class XmlWebFault implements javax.xml.ws.WebFault {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "targetNamespace")
    protected String targetNamespace;
    @XmlAttribute(name = "faultBean")
    protected String faultBean;
    @XmlAttribute(name = "messageName")
    protected String messageName;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the targetNamespace property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * Sets the value of the targetNamespace property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTargetNamespace(String value) {
        this.targetNamespace = value;
    }

    /**
     * Gets the value of the faultBean property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFaultBean() {
        return faultBean;
    }

    /**
     * Sets the value of the faultBean property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFaultBean(String value) {
        this.faultBean = value;
    }

    @Override
    public String name() {
        return nullSafe(name);
    }

    @Override
    public String targetNamespace() {
        return nullSafe(targetNamespace);
    }

    @Override
    public String faultBean() {
        return nullSafe(faultBean);
    }

    @Override
    public String messageName() {
        return nullSafe(messageName);
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return javax.xml.ws.WebFault.class;
    }
}
