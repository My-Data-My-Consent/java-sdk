/*
 * My Data My Consent - Developer API
 * Unleashing the power of consent by establishing trust. The Platform Core Developer API defines a set of capabilities that can be used to request, issue, manage and update data, documents and credentials by organizations. The API can be used to request, manage and update Decentralised Identifiers, Financial Data, Health Data issue Documents, Credentials directly or using OpenID Connect flows, and verify Messages signed with DIDs and much more.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@mydatamyconsent.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mydatamyconsent.model;

import com.mydatamyconsent.ApiException;
import java.util.Objects;
import java.lang.reflect.Type;
import java.util.Map;
import javax.ws.rs.core.GenericType;

//import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Abstract class for oneOf,anyOf schemas defined in OpenAPI spec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T10:34:24.768905159Z[Etc/UTC]")
public abstract class AbstractOpenApiSchema {

    // store the actual instance of the schema/object
    private Object instance;

    // is nullable
    private Boolean isNullable;

    // schema type (e.g. oneOf, anyOf)
    private final String schemaType;

    public AbstractOpenApiSchema(String schemaType, Boolean isNullable) {
        this.schemaType = schemaType;
        this.isNullable = isNullable;
    }

    /**
     * Get the list of oneOf/anyOf composed schemas allowed to be stored in this object
     *
     * @return an instance of the actual schema/object
     */
    public abstract Map<String, GenericType> getSchemas();

    /**
     * Get the actual instance
     *
     * @return an instance of the actual schema/object
     */
    //@JsonValue
    public Object getActualInstance() {return instance;}

    /**
     * Set the actual instance
     *
     * @param instance the actual instance of the schema/object
     */
    public void setActualInstance(Object instance) {this.instance = instance;}

    /**
     * Get the instant recursively when the schemas defined in oneOf/anyof happen to be oneOf/anyOf schema as well
     *
     * @return an instance of the actual schema/object
     */
    public Object getActualInstanceRecursively() {
        return getActualInstanceRecursively(this);
    }

    private Object getActualInstanceRecursively(AbstractOpenApiSchema object) {
        if (object.getActualInstance() == null) {
            return null;
        } else if (object.getActualInstance() instanceof AbstractOpenApiSchema) {
            return getActualInstanceRecursively((AbstractOpenApiSchema)object.getActualInstance());
        } else {
            return object.getActualInstance();
        }
    }

    /**
     * Get the schema type (e.g. anyOf, oneOf)
     *
     * @return the schema type
     */
    public String getSchemaType() {
        return schemaType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ").append(getClass()).append(" {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    isNullable: ").append(toIndentedString(isNullable)).append("\n");
        sb.append("    schemaType: ").append(toIndentedString(schemaType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractOpenApiSchema a = (AbstractOpenApiSchema) o;
        return Objects.equals(this.instance, a.instance) &&
            Objects.equals(this.isNullable, a.isNullable) &&
            Objects.equals(this.schemaType, a.schemaType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance, isNullable, schemaType);
    }

    /**
     * Is nullable
     *
     * @return true if it's nullable
     */
    public Boolean isNullable() {
        if (Boolean.TRUE.equals(isNullable)) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }



}
