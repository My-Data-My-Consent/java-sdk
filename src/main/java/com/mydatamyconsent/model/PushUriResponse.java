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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.mydatamyconsent.JSON;

/**
 * PushUriResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-18T10:36:55.513860939Z[Etc/UTC]")
public class PushUriResponse {
  public static final String SERIALIZED_NAME_RESPONSE_STATUS = "responseStatus";
  @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS)
  private String responseStatus;

  public static final String SERIALIZED_NAME_RESPONSE_MESSAGE = "responseMessage";
  @SerializedName(SERIALIZED_NAME_RESPONSE_MESSAGE)
  private String responseMessage;

  public static final String SERIALIZED_NAME_NS2 = "ns2";
  @SerializedName(SERIALIZED_NAME_NS2)
  private String ns2;

  public static final String SERIALIZED_NAME_VER = "ver";
  @SerializedName(SERIALIZED_NAME_VER)
  private String ver;

  public static final String SERIALIZED_NAME_TS = "ts";
  @SerializedName(SERIALIZED_NAME_TS)
  private String ts;

  public static final String SERIALIZED_NAME_TXN = "txn";
  @SerializedName(SERIALIZED_NAME_TXN)
  private String txn;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public PushUriResponse() {
  }

  public PushUriResponse responseStatus(String responseStatus) {
    
    this.responseStatus = responseStatus;
    return this;
  }

   /**
   * Get responseStatus
   * @return responseStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResponseStatus() {
    return responseStatus;
  }


  public void setResponseStatus(String responseStatus) {
    this.responseStatus = responseStatus;
  }


  public PushUriResponse responseMessage(String responseMessage) {
    
    this.responseMessage = responseMessage;
    return this;
  }

   /**
   * Get responseMessage
   * @return responseMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResponseMessage() {
    return responseMessage;
  }


  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }


  public PushUriResponse ns2(String ns2) {
    
    this.ns2 = ns2;
    return this;
  }

   /**
   * Get ns2
   * @return ns2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNs2() {
    return ns2;
  }


  public void setNs2(String ns2) {
    this.ns2 = ns2;
  }


  public PushUriResponse ver(String ver) {
    
    this.ver = ver;
    return this;
  }

   /**
   * Get ver
   * @return ver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVer() {
    return ver;
  }


  public void setVer(String ver) {
    this.ver = ver;
  }


  public PushUriResponse ts(String ts) {
    
    this.ts = ts;
    return this;
  }

   /**
   * Get ts
   * @return ts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTs() {
    return ts;
  }


  public void setTs(String ts) {
    this.ts = ts;
  }


  public PushUriResponse txn(String txn) {
    
    this.txn = txn;
    return this;
  }

   /**
   * Get txn
   * @return txn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTxn() {
    return txn;
  }


  public void setTxn(String txn) {
    this.txn = txn;
  }


  public PushUriResponse orgId(String orgId) {
    
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrgId() {
    return orgId;
  }


  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushUriResponse pushUriResponse = (PushUriResponse) o;
    return Objects.equals(this.responseStatus, pushUriResponse.responseStatus) &&
        Objects.equals(this.responseMessage, pushUriResponse.responseMessage) &&
        Objects.equals(this.ns2, pushUriResponse.ns2) &&
        Objects.equals(this.ver, pushUriResponse.ver) &&
        Objects.equals(this.ts, pushUriResponse.ts) &&
        Objects.equals(this.txn, pushUriResponse.txn) &&
        Objects.equals(this.orgId, pushUriResponse.orgId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseStatus, responseMessage, ns2, ver, ts, txn, orgId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushUriResponse {\n");
    sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
    sb.append("    ns2: ").append(toIndentedString(ns2)).append("\n");
    sb.append("    ver: ").append(toIndentedString(ver)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    txn: ").append(toIndentedString(txn)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("responseStatus");
    openapiFields.add("responseMessage");
    openapiFields.add("ns2");
    openapiFields.add("ver");
    openapiFields.add("ts");
    openapiFields.add("txn");
    openapiFields.add("orgId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PushUriResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PushUriResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PushUriResponse is not found in the empty JSON string", PushUriResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PushUriResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PushUriResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("responseStatus") != null && !jsonObj.get("responseStatus").isJsonNull()) && !jsonObj.get("responseStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseStatus").toString()));
      }
      if ((jsonObj.get("responseMessage") != null && !jsonObj.get("responseMessage").isJsonNull()) && !jsonObj.get("responseMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseMessage").toString()));
      }
      if ((jsonObj.get("ns2") != null && !jsonObj.get("ns2").isJsonNull()) && !jsonObj.get("ns2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ns2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ns2").toString()));
      }
      if ((jsonObj.get("ver") != null && !jsonObj.get("ver").isJsonNull()) && !jsonObj.get("ver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ver").toString()));
      }
      if ((jsonObj.get("ts") != null && !jsonObj.get("ts").isJsonNull()) && !jsonObj.get("ts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ts").toString()));
      }
      if ((jsonObj.get("txn") != null && !jsonObj.get("txn").isJsonNull()) && !jsonObj.get("txn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `txn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("txn").toString()));
      }
      if ((jsonObj.get("orgId") != null && !jsonObj.get("orgId").isJsonNull()) && !jsonObj.get("orgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PushUriResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PushUriResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PushUriResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PushUriResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PushUriResponse>() {
           @Override
           public void write(JsonWriter out, PushUriResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PushUriResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PushUriResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PushUriResponse
  * @throws IOException if the JSON string is invalid with respect to PushUriResponse
  */
  public static PushUriResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PushUriResponse.class);
  }

 /**
  * Convert an instance of PushUriResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

