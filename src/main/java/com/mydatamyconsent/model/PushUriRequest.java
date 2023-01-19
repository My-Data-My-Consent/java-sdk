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
import com.mydatamyconsent.model.UriDetails;
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
 * PushUriRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-19T10:37:09.575318484Z[Etc/UTC]")
public class PushUriRequest {
  public static final String SERIALIZED_NAME_URI_DETAILS = "uriDetails";
  @SerializedName(SERIALIZED_NAME_URI_DETAILS)
  private UriDetails uriDetails;

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

  public static final String SERIALIZED_NAME_KEY_HASH = "keyHash";
  @SerializedName(SERIALIZED_NAME_KEY_HASH)
  private String keyHash;

  public PushUriRequest() {
  }

  public PushUriRequest uriDetails(UriDetails uriDetails) {
    
    this.uriDetails = uriDetails;
    return this;
  }

   /**
   * Get uriDetails
   * @return uriDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UriDetails getUriDetails() {
    return uriDetails;
  }


  public void setUriDetails(UriDetails uriDetails) {
    this.uriDetails = uriDetails;
  }


  public PushUriRequest ns2(String ns2) {
    
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


  public PushUriRequest ver(String ver) {
    
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


  public PushUriRequest ts(String ts) {
    
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


  public PushUriRequest txn(String txn) {
    
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


  public PushUriRequest orgId(String orgId) {
    
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


  public PushUriRequest keyHash(String keyHash) {
    
    this.keyHash = keyHash;
    return this;
  }

   /**
   * Get keyHash
   * @return keyHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyHash() {
    return keyHash;
  }


  public void setKeyHash(String keyHash) {
    this.keyHash = keyHash;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushUriRequest pushUriRequest = (PushUriRequest) o;
    return Objects.equals(this.uriDetails, pushUriRequest.uriDetails) &&
        Objects.equals(this.ns2, pushUriRequest.ns2) &&
        Objects.equals(this.ver, pushUriRequest.ver) &&
        Objects.equals(this.ts, pushUriRequest.ts) &&
        Objects.equals(this.txn, pushUriRequest.txn) &&
        Objects.equals(this.orgId, pushUriRequest.orgId) &&
        Objects.equals(this.keyHash, pushUriRequest.keyHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uriDetails, ns2, ver, ts, txn, orgId, keyHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushUriRequest {\n");
    sb.append("    uriDetails: ").append(toIndentedString(uriDetails)).append("\n");
    sb.append("    ns2: ").append(toIndentedString(ns2)).append("\n");
    sb.append("    ver: ").append(toIndentedString(ver)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    txn: ").append(toIndentedString(txn)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    keyHash: ").append(toIndentedString(keyHash)).append("\n");
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
    openapiFields.add("uriDetails");
    openapiFields.add("ns2");
    openapiFields.add("ver");
    openapiFields.add("ts");
    openapiFields.add("txn");
    openapiFields.add("orgId");
    openapiFields.add("keyHash");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uriDetails");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PushUriRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PushUriRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PushUriRequest is not found in the empty JSON string", PushUriRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PushUriRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PushUriRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PushUriRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `uriDetails`
      if (jsonObj.get("uriDetails") != null && !jsonObj.get("uriDetails").isJsonNull()) {
        UriDetails.validateJsonObject(jsonObj.getAsJsonObject("uriDetails"));
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
      if ((jsonObj.get("keyHash") != null && !jsonObj.get("keyHash").isJsonNull()) && !jsonObj.get("keyHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyHash").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PushUriRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PushUriRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PushUriRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PushUriRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PushUriRequest>() {
           @Override
           public void write(JsonWriter out, PushUriRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PushUriRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PushUriRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PushUriRequest
  * @throws IOException if the JSON string is invalid with respect to PushUriRequest
  */
  public static PushUriRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PushUriRequest.class);
  }

 /**
  * Convert an instance of PushUriRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

