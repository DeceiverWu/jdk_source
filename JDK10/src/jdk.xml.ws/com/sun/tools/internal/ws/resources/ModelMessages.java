/*
 * Copyright (c) 1997, 2017, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.tools.internal.ws.resources;

import java.util.Locale;
import java.util.ResourceBundle;
import com.sun.istack.internal.localization.Localizable;
import com.sun.istack.internal.localization.LocalizableMessageFactory;
import com.sun.istack.internal.localization.LocalizableMessageFactory.ResourceBundleSupplier;
import com.sun.istack.internal.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 *
 */
public final class ModelMessages {

    private final static String BUNDLE_NAME = "com.sun.tools.internal.ws.resources.model";
    private final static LocalizableMessageFactory MESSAGE_FACTORY = new LocalizableMessageFactory(BUNDLE_NAME, new ModelMessages.BundleSupplier());
    private final static Localizer LOCALIZER = new Localizer();

    public static Localizable localizableMODEL_IMPORTER_INVALID_MINOR_MINOR_OR_PATCH_VERSION(Object arg0, Object arg1, Object arg2) {
        return MESSAGE_FACTORY.getMessage("model.importer.invalidMinorMinorOrPatchVersion", arg0, arg1, arg2);
    }

    /**
     * model version "{1}" newer than runtime version "{2}" (line {0}): need to upgrade to a newer runtime
     *
     */
    public static String MODEL_IMPORTER_INVALID_MINOR_MINOR_OR_PATCH_VERSION(Object arg0, Object arg1, Object arg2) {
        return LOCALIZER.localize(localizableMODEL_IMPORTER_INVALID_MINOR_MINOR_OR_PATCH_VERSION(arg0, arg1, arg2));
    }

    public static Localizable localizableMODEL_SCHEMA_UNSUPPORTED_TYPE(Object arg0, Object arg1, Object arg2) {
        return MESSAGE_FACTORY.getMessage("model.schema.unsupportedType", arg0, arg1, arg2);
    }

    /**
     * unsupported type ({0}): "{1}" (namespace: {2})
     *
     */
    public static String MODEL_SCHEMA_UNSUPPORTED_TYPE(Object arg0, Object arg1, Object arg2) {
        return LOCALIZER.localize(localizableMODEL_SCHEMA_UNSUPPORTED_TYPE(arg0, arg1, arg2));
    }

    public static Localizable localizableMODEL_IMPORTER_INVALID_CLASS(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("model.importer.invalidClass", arg0, arg1);
    }

    /**
     * invalid class name "{1}" in model document (line {0})
     *
     */
    public static String MODEL_IMPORTER_INVALID_CLASS(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableMODEL_IMPORTER_INVALID_CLASS(arg0, arg1));
    }

    public static Localizable localizableMODEL_ARRAYWRAPPER_NO_SUBTYPES() {
        return MESSAGE_FACTORY.getMessage("model.arraywrapper.no.subtypes");
    }

    /**
     * LiteralArrayWrapper cannot have subtypes
     *
     */
    public static String MODEL_ARRAYWRAPPER_NO_SUBTYPES() {
        return LOCALIZER.localize(localizableMODEL_ARRAYWRAPPER_NO_SUBTYPES());
    }

    public static Localizable localizableMODEL_UNIQUENESS_JAVASTRUCTURETYPE(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("model.uniqueness.javastructuretype", arg0, arg1);
    }

    /**
     * uniqueness constraint violation, duplicate member "{0}" added to JavaStructureType "{1}"
     *
     */
    public static String MODEL_UNIQUENESS_JAVASTRUCTURETYPE(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableMODEL_UNIQUENESS_JAVASTRUCTURETYPE(arg0, arg1));
    }

    public static Localizable localizableMODEL_SCHEMA_INVALID_SIMPLE_TYPE_INVALID_ITEM_TYPE(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("model.schema.invalidSimpleType.invalidItemType", arg0, arg1);
    }

    /**
     * in simpleType: "{0}", itemType "{1}" can not be derived by list
     *
     */
    public static String MODEL_SCHEMA_INVALID_SIMPLE_TYPE_INVALID_ITEM_TYPE(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableMODEL_SCHEMA_INVALID_SIMPLE_TYPE_INVALID_ITEM_TYPE(arg0, arg1));
    }

    public static Localizable localizableMODEL_IMPORTER_INVALID_VERSION(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("model.importer.invalidVersion", arg0, arg1);
    }

    /**
     * invalid version "{1}" in model document (line {0})
     *
     */
    public static String MODEL_IMPORTER_INVALID_VERSION(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableMODEL_IMPORTER_INVALID_VERSION(arg0, arg1));
    }

    public static Localizable localizableMODEL_EXPORTER_UNSUPPORTED_CLASS(Object arg0) {
        return MESSAGE_FACTORY.getMessage("model.exporter.unsupportedClass", arg0);
    }

    /**
     * model exporter: unsupported class: {0}
     *
     */
    public static String MODEL_EXPORTER_UNSUPPORTED_CLASS(Object arg0) {
        return LOCALIZER.localize(localizableMODEL_EXPORTER_UNSUPPORTED_CLASS(arg0));
    }

    public static Localizable localizableMODEL_NESTED_MODEL_ERROR(Object arg0) {
        return MESSAGE_FACTORY.getMessage("model.nestedModelError", arg0);
    }

    /**
     * model error: {0}
     *
     */
    public static String MODEL_NESTED_MODEL_ERROR(Object arg0) {
        return LOCALIZER.localize(localizableMODEL_NESTED_MODEL_ERROR(arg0));
    }

    public static Localizable localizableMODEL_EXCEPTION_NOTUNIQUE(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("model.exception.notunique", arg0, arg1);
    }

    /**
     * Failed to generate Java signature: duplicate exception names {0}. Use JAXWS binding customization to rename the wsdl:part "{1}"
     *
     */
    public static String MODEL_EXCEPTION_NOTUNIQUE(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableMODEL_EXCEPTION_NOTUNIQUE(arg0, arg1));
    }

    public static Localizable localizableMODEL_ARRAYWRAPPER_ONLY_ONE_MEMBER() {
        return MESSAGE_FACTORY.getMessage("model.arraywrapper.only.one.member");
    }

    /**
     * LiteralArrayWrapper may only have one element member.
     *
     */
    public static String MODEL_ARRAYWRAPPER_ONLY_ONE_MEMBER() {
        return LOCALIZER.localize(localizableMODEL_ARRAYWRAPPER_ONLY_ONE_MEMBER());
    }

    public static Localizable localizableMODEL_SAXPARSER_EXCEPTION(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("model.saxparser.exception", arg0, arg1);
    }

    /**
     * {0}
     * {1}
     *
     */
    public static String MODEL_SAXPARSER_EXCEPTION(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableMODEL_SAXPARSER_EXCEPTION(arg0, arg1));
    }

    public static Localizable localizableMODEL_IMPORTER_INVALID_ID(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("model.importer.invalidId", arg0, arg1);
    }

    /**
     * invalid id "{1} in model document (line {0})
     *
     */
    public static String MODEL_IMPORTER_INVALID_ID(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableMODEL_IMPORTER_INVALID_ID(arg0, arg1));
    }

    public static Localizable localizableMODEL_PARAMETER_NOTUNIQUE_WRAPPER(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("model.parameter.notunique.wrapper", arg0, arg1);
    }

    /**
     * Failed to generate Java signature: duplicate parameter name "{0}". Try one of these
     *  1. Use JAXWS binding customization to rename the wsdl:part "{1}"
     *  2. Run wsimport with -extension switch.
     *  3. This is wrapper style operation, to resolve parameter name conflict, you can also try disabling wrapper style by using <jaxws:enableWrapperStyle>false</jaxws:enableWrapperStyle> wsdl customization.
     *
     */
    public static String MODEL_PARAMETER_NOTUNIQUE_WRAPPER(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableMODEL_PARAMETER_NOTUNIQUE_WRAPPER(arg0, arg1));
    }

    public static Localizable localizableMODEL_SCHEMA_ELEMENT_NOT_FOUND(Object arg0) {
        return MESSAGE_FACTORY.getMessage("model.schema.elementNotFound", arg0);
    }

    /**
     * Element "{0}" not found.
     *
     */
    public static String MODEL_SCHEMA_ELEMENT_NOT_FOUND(Object arg0) {
        return LOCALIZER.localize(localizableMODEL_SCHEMA_ELEMENT_NOT_FOUND(arg0));
    }

    public static Localizable localizableMODEL_SCHEMA_UNION_NOT_SUPPORTED(Object arg0) {
        return MESSAGE_FACTORY.getMessage("model.schema.unionNotSupported", arg0);
    }

    /**
     * simpleType: "{0}" derivation by xsd:union not supported
     *
     */
    public static String MODEL_SCHEMA_UNION_NOT_SUPPORTED(Object arg0) {
        return LOCALIZER.localize(localizableMODEL_SCHEMA_UNION_NOT_SUPPORTED(arg0));
    }

    public static Localizable localizableCONSOLE_ERROR_REPORTER_UNKNOWN_LOCATION() {
        return MESSAGE_FACTORY.getMessage("ConsoleErrorReporter.UnknownLocation");
    }

    /**
     * unknown location
     *
     */
    public static String CONSOLE_ERROR_REPORTER_UNKNOWN_LOCATION() {
        return LOCALIZER.localize(localizableCONSOLE_ERROR_REPORTER_UNKNOWN_LOCATION());
    }

    public static Localizable localizableMODEL_SCHEMA_INVALID_LITERAL_IN_ENUMERATION_ANONYMOUS(Object arg0) {
        return MESSAGE_FACTORY.getMessage("model.schema.invalidLiteralInEnumeration.anonymous", arg0);
    }

    /**
     * invalid literal "{0}" in anonymous enumeration
     *
     */
    public static String MODEL_SCHEMA_INVALID_LITERAL_IN_ENUMERATION_ANONYMOUS(Object arg0) {
        return LOCALIZER.localize(localizableMODEL_SCHEMA_INVALID_LITERAL_IN_ENUMERATION_ANONYMOUS(arg0));
    }

    public static Localizable localizableMODEL_ARRAYWRAPPER_NO_CONTENT_MEMBER() {
        return MESSAGE_FACTORY.getMessage("model.arraywrapper.no.content.member");
    }

    /**
     * LiteralArrayWrapper cannot have a content member
     *
     */
    public static String MODEL_ARRAYWRAPPER_NO_CONTENT_MEMBER() {
        return LOCALIZER.localize(localizableMODEL_ARRAYWRAPPER_NO_CONTENT_MEMBER());
    }

    public static Localizable localizableMODEL_ARRAYWRAPPER_MEMBER_ALREADY_SET() {
        return MESSAGE_FACTORY.getMessage("model.arraywrapper.member.already.set");
    }

    /**
     * LiteralArrayWrapper element member already set.
     *
     */
    public static String MODEL_ARRAYWRAPPER_MEMBER_ALREADY_SET() {
        return LOCALIZER.localize(localizableMODEL_ARRAYWRAPPER_MEMBER_ALREADY_SET());
    }

    public static Localizable localizableMODEL_INVALID_MESSAGE_TYPE(Object arg0) {
        return MESSAGE_FACTORY.getMessage("model.invalid.message.type", arg0);
    }

    /**
     * invalid message type: {0}
     *
     */
    public static String MODEL_INVALID_MESSAGE_TYPE(Object arg0) {
        return LOCALIZER.localize(localizableMODEL_INVALID_MESSAGE_TYPE(arg0));
    }

    public static Localizable localizableMODEL_SCHEMA_CIRCULARITY(Object arg0) {
        return MESSAGE_FACTORY.getMessage("model.schema.circularity", arg0);
    }

    /**
     * circularity detected in schema: "{0}"
     *
     */
    public static String MODEL_SCHEMA_CIRCULARITY(Object arg0) {
        return LOCALIZER.localize(localizableMODEL_SCHEMA_CIRCULARITY(arg0));
    }

    public static Localizable localizableMODEL_SCHEMA_INVALID_SIMPLE_TYPE_NO_ITEM_LITERAL_TYPE(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("model.schema.invalidSimpleType.noItemLiteralType", arg0, arg1);
    }

    /**
     * in simpleType: "{0}", xsd:list itemType "{1}" is invalid
     *
     */
    public static String MODEL_SCHEMA_INVALID_SIMPLE_TYPE_NO_ITEM_LITERAL_TYPE(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableMODEL_SCHEMA_INVALID_SIMPLE_TYPE_NO_ITEM_LITERAL_TYPE(arg0, arg1));
    }

    public static Localizable localizableMODEL_SCHEMA_LIST_NOT_SUPPORTED(Object arg0) {
        return MESSAGE_FACTORY.getMessage("model.schema.listNotSupported", arg0);
    }

    /**
     * simpleType: "{0}" derivation by xsd:list not supported
     *
     */
    public static String MODEL_SCHEMA_LIST_NOT_SUPPORTED(Object arg0) {
        return LOCALIZER.localize(localizableMODEL_SCHEMA_LIST_NOT_SUPPORTED(arg0));
    }

    public static Localizable localizable_002F_002F_REPLACEMENT() {
        return MESSAGE_FACTORY.getMessage("//replacement");
    }

    /**
     * for Uxxx codes
     *
     */
    public static String _002F_002F_REPLACEMENT() {
        return LOCALIZER.localize(localizable_002F_002F_REPLACEMENT());
    }

    public static Localizable localizableMODEL_PART_NOT_UNIQUE(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("model.part.notUnique", arg0, arg1);
    }

    /**
     * parts in wsdl:message "{0}", reference "{1}", they must reference unique global elements.
     *
     */
    public static String MODEL_PART_NOT_UNIQUE(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableMODEL_PART_NOT_UNIQUE(arg0, arg1));
    }

    public static Localizable localizableMODEL_ARRAYWRAPPER_NO_PARENT() {
        return MESSAGE_FACTORY.getMessage("model.arraywrapper.no.parent");
    }

    /**
     * LiteralArrayWrapper cannot have a parent type
     *
     */
    public static String MODEL_ARRAYWRAPPER_NO_PARENT() {
        return LOCALIZER.localize(localizableMODEL_ARRAYWRAPPER_NO_PARENT());
    }

    public static Localizable localizableMODEL_COMPLEX_TYPE_SIMPLE_CONTENT_RESERVED_NAME(Object arg0) {
        return MESSAGE_FACTORY.getMessage("model.complexType.simpleContent.reservedName", arg0);
    }

    /**
     * invalid attribute name: "_value" in complexType: "{0}", _value is JAXWS reserved name, this name is generated in the generated javabean class to hold content value in the generated javabean class for complexType/simpleContent.
     *
     */
    public static String MODEL_COMPLEX_TYPE_SIMPLE_CONTENT_RESERVED_NAME(Object arg0) {
        return LOCALIZER.localize(localizableMODEL_COMPLEX_TYPE_SIMPLE_CONTENT_RESERVED_NAME(arg0));
    }

    public static Localizable localizableMODEL_SCHEMA_SIMPLE_TYPE_WITH_FACETS(Object arg0) {
        return MESSAGE_FACTORY.getMessage("model.schema.simpleTypeWithFacets", arg0);
    }

    /**
     * facet "{0}" not supported on simple type: "{0}"
     *
     */
    public static String MODEL_SCHEMA_SIMPLE_TYPE_WITH_FACETS(Object arg0) {
        return LOCALIZER.localize(localizableMODEL_SCHEMA_SIMPLE_TYPE_WITH_FACETS(arg0));
    }

    public static Localizable localizableMODEL_SCHEMA_NOT_IMPLEMENTED(Object arg0) {
        return MESSAGE_FACTORY.getMessage("model.schema.notImplemented", arg0);
    }

    /**
     * unsupported XML Schema feature ({0})
     *
     */
    public static String MODEL_SCHEMA_NOT_IMPLEMENTED(Object arg0) {
        return LOCALIZER.localize(localizableMODEL_SCHEMA_NOT_IMPLEMENTED(arg0));
    }

    public static Localizable localizableMODEL_SCHEMA_JAXB_EXCEPTION_MESSAGE(Object arg0) {
        return MESSAGE_FACTORY.getMessage("model.schema.jaxbException.message", arg0);
    }

    /**
     * "{0}"
     *
     */
    public static String MODEL_SCHEMA_JAXB_EXCEPTION_MESSAGE(Object arg0) {
        return LOCALIZER.localize(localizableMODEL_SCHEMA_JAXB_EXCEPTION_MESSAGE(arg0));
    }

    public static Localizable localizableMODEL_UNIQUENESS() {
        return MESSAGE_FACTORY.getMessage("model.uniqueness");
    }

    /**
     * uniqueness constraint violation
     *
     */
    public static String MODEL_UNIQUENESS() {
        return LOCALIZER.localize(localizableMODEL_UNIQUENESS());
    }

    public static Localizable localizableMODEL_SCHEMA_INVALID_WILDCARD_ALL_COMPOSITOR(Object arg0) {
        return MESSAGE_FACTORY.getMessage("model.schema.invalidWildcard.allCompositor", arg0);
    }

    /**
     * xsd:all compositor not supported for the wildcard in schema type: "{0}"
     *
     */
    public static String MODEL_SCHEMA_INVALID_WILDCARD_ALL_COMPOSITOR(Object arg0) {
        return LOCALIZER.localize(localizableMODEL_SCHEMA_INVALID_WILDCARD_ALL_COMPOSITOR(arg0));
    }

    public static Localizable localizableCONSOLE_ERROR_REPORTER_LINE_X_OF_Y(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("ConsoleErrorReporter.LineXOfY", arg0, arg1);
    }

    /**
     *   line {0} of {1}
     *
     */
    public static String CONSOLE_ERROR_REPORTER_LINE_X_OF_Y(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableCONSOLE_ERROR_REPORTER_LINE_X_OF_Y(arg0, arg1));
    }

    public static Localizable localizableMODEL_PARENT_TYPE_ALREADY_SET(Object arg0, Object arg1, Object arg2) {
        return MESSAGE_FACTORY.getMessage("model.parent.type.already.set", arg0, arg1, arg2);
    }

    /**
     * parent of type "{0}" already set to "{1}", new value = "{2}"
     *
     */
    public static String MODEL_PARENT_TYPE_ALREADY_SET(Object arg0, Object arg1, Object arg2) {
        return LOCALIZER.localize(localizableMODEL_PARENT_TYPE_ALREADY_SET(arg0, arg1, arg2));
    }

    public static Localizable localizableMODEL_PARAMETER_NOTUNIQUE(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("model.parameter.notunique", arg0, arg1);
    }

    /**
     * Failed to generate Java signature: duplicate parameter name "{0}". Try one of these
     *  1. Use JAXWS binding customization to rename the wsdl:part "{1}"
     *  2. Run wsimport with -extension switch.
     *
     */
    public static String MODEL_PARAMETER_NOTUNIQUE(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableMODEL_PARAMETER_NOTUNIQUE(arg0, arg1));
    }

    private static class BundleSupplier
        implements ResourceBundleSupplier
    {


        public ResourceBundle getResourceBundle(Locale locale) {
            return ResourceBundle.getBundle(BUNDLE_NAME, locale);
        }

    }

}
