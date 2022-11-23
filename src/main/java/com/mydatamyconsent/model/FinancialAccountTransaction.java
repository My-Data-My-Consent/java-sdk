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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mydatamyconsent.model.FinancialAccountEquityTransaction;
import com.mydatamyconsent.model.FinancialAccountMutualFundTransaction;
import com.mydatamyconsent.model.FinancialAccountSipTransaction;
import com.mydatamyconsent.model.MutualFundFundType;
import com.mydatamyconsent.model.MutualFundHoldingMode;
import com.mydatamyconsent.model.MutualFundSchemeCategory;
import com.mydatamyconsent.model.MutualFundSchemeOption;
import com.mydatamyconsent.model.MutualFundSchemePlan;
import com.mydatamyconsent.model.MutualFundSchemeType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.mydatamyconsent.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-23T10:34:47.571295784Z[Etc/UTC]")
public class FinancialAccountTransaction extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(FinancialAccountTransaction.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FinancialAccountTransaction.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FinancialAccountTransaction' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FinancialAccountEquityTransaction> adapterFinancialAccountEquityTransaction = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccountEquityTransaction.class));
            final TypeAdapter<FinancialAccountMutualFundTransaction> adapterFinancialAccountMutualFundTransaction = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccountMutualFundTransaction.class));
            final TypeAdapter<FinancialAccountSipTransaction> adapterFinancialAccountSipTransaction = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccountSipTransaction.class));

            return (TypeAdapter<T>) new TypeAdapter<FinancialAccountTransaction>() {
                @Override
                public void write(JsonWriter out, FinancialAccountTransaction value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `FinancialAccountEquityTransaction`
                    if (value.getActualInstance() instanceof FinancialAccountEquityTransaction) {
                        JsonObject obj = adapterFinancialAccountEquityTransaction.toJsonTree((FinancialAccountEquityTransaction)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `FinancialAccountMutualFundTransaction`
                    if (value.getActualInstance() instanceof FinancialAccountMutualFundTransaction) {
                        JsonObject obj = adapterFinancialAccountMutualFundTransaction.toJsonTree((FinancialAccountMutualFundTransaction)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `FinancialAccountSipTransaction`
                    if (value.getActualInstance() instanceof FinancialAccountSipTransaction) {
                        JsonObject obj = adapterFinancialAccountSipTransaction.toJsonTree((FinancialAccountSipTransaction)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: FinancialAccountEquityTransaction, FinancialAccountMutualFundTransaction, FinancialAccountSipTransaction");
                }

                @Override
                public FinancialAccountTransaction read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize FinancialAccountEquityTransaction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FinancialAccountEquityTransaction.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'FinancialAccountEquityTransaction'");
                        FinancialAccountTransaction ret = new FinancialAccountTransaction();
                        ret.setActualInstance(adapterFinancialAccountEquityTransaction.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'FinancialAccountEquityTransaction'", e);
                    }

                    // deserialize FinancialAccountMutualFundTransaction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FinancialAccountMutualFundTransaction.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'FinancialAccountMutualFundTransaction'");
                        FinancialAccountTransaction ret = new FinancialAccountTransaction();
                        ret.setActualInstance(adapterFinancialAccountMutualFundTransaction.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'FinancialAccountMutualFundTransaction'", e);
                    }

                    // deserialize FinancialAccountSipTransaction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FinancialAccountSipTransaction.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'FinancialAccountSipTransaction'");
                        FinancialAccountTransaction ret = new FinancialAccountTransaction();
                        ret.setActualInstance(adapterFinancialAccountSipTransaction.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'FinancialAccountSipTransaction'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for FinancialAccountTransaction: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public FinancialAccountTransaction() {
        super("anyOf", Boolean.FALSE);
    }

    public FinancialAccountTransaction(FinancialAccountEquityTransaction o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FinancialAccountTransaction(FinancialAccountMutualFundTransaction o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FinancialAccountTransaction(FinancialAccountSipTransaction o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("FinancialAccountEquityTransaction", new GenericType<FinancialAccountEquityTransaction>() {
        });
        schemas.put("FinancialAccountMutualFundTransaction", new GenericType<FinancialAccountMutualFundTransaction>() {
        });
        schemas.put("FinancialAccountSipTransaction", new GenericType<FinancialAccountSipTransaction>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return FinancialAccountTransaction.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * FinancialAccountEquityTransaction, FinancialAccountMutualFundTransaction, FinancialAccountSipTransaction
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof FinancialAccountEquityTransaction) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FinancialAccountMutualFundTransaction) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof FinancialAccountSipTransaction) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be FinancialAccountEquityTransaction, FinancialAccountMutualFundTransaction, FinancialAccountSipTransaction");
    }

    /**
     * Get the actual instance, which can be the following:
     * FinancialAccountEquityTransaction, FinancialAccountMutualFundTransaction, FinancialAccountSipTransaction
     *
     * @return The actual instance (FinancialAccountEquityTransaction, FinancialAccountMutualFundTransaction, FinancialAccountSipTransaction)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `FinancialAccountEquityTransaction`. If the actual instance is not `FinancialAccountEquityTransaction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FinancialAccountEquityTransaction`
     * @throws ClassCastException if the instance is not `FinancialAccountEquityTransaction`
     */
    public FinancialAccountEquityTransaction getFinancialAccountEquityTransaction() throws ClassCastException {
        return (FinancialAccountEquityTransaction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FinancialAccountMutualFundTransaction`. If the actual instance is not `FinancialAccountMutualFundTransaction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FinancialAccountMutualFundTransaction`
     * @throws ClassCastException if the instance is not `FinancialAccountMutualFundTransaction`
     */
    public FinancialAccountMutualFundTransaction getFinancialAccountMutualFundTransaction() throws ClassCastException {
        return (FinancialAccountMutualFundTransaction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `FinancialAccountSipTransaction`. If the actual instance is not `FinancialAccountSipTransaction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FinancialAccountSipTransaction`
     * @throws ClassCastException if the instance is not `FinancialAccountSipTransaction`
     */
    public FinancialAccountSipTransaction getFinancialAccountSipTransaction() throws ClassCastException {
        return (FinancialAccountSipTransaction)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FinancialAccountTransaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with FinancialAccountEquityTransaction
    try {
      FinancialAccountEquityTransaction.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with FinancialAccountMutualFundTransaction
    try {
      FinancialAccountMutualFundTransaction.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with FinancialAccountSipTransaction
    try {
      FinancialAccountSipTransaction.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for FinancialAccountTransaction with anyOf schemas: FinancialAccountEquityTransaction, FinancialAccountMutualFundTransaction, FinancialAccountSipTransaction. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of FinancialAccountTransaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialAccountTransaction
  * @throws IOException if the JSON string is invalid with respect to FinancialAccountTransaction
  */
  public static FinancialAccountTransaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialAccountTransaction.class);
  }

 /**
  * Convert an instance of FinancialAccountTransaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

