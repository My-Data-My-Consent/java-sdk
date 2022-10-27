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
 * UpdateDataProcessingAgreement : Update data processing agreement details.
 */
@ApiModel(description = "UpdateDataProcessingAgreement : Update data processing agreement details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T10:37:56.753208054Z[Etc/UTC]")
public class UpdateDataProcessingAgreement {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_ATTACHMENT_URL = "attachmentUrl";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_URL)
  private String attachmentUrl;

  public UpdateDataProcessingAgreement() {
  }

  public UpdateDataProcessingAgreement version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Agreement version.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Agreement version.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public UpdateDataProcessingAgreement body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Agreement body content.
   * @return body
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Agreement body content.")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public UpdateDataProcessingAgreement attachmentUrl(String attachmentUrl) {
    
    this.attachmentUrl = attachmentUrl;
    return this;
  }

   /**
   * Agreement attachment file URL.
   * @return attachmentUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Agreement attachment file URL.")

  public String getAttachmentUrl() {
    return attachmentUrl;
  }


  public void setAttachmentUrl(String attachmentUrl) {
    this.attachmentUrl = attachmentUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDataProcessingAgreement updateDataProcessingAgreement = (UpdateDataProcessingAgreement) o;
    return Objects.equals(this.version, updateDataProcessingAgreement.version) &&
        Objects.equals(this.body, updateDataProcessingAgreement.body) &&
        Objects.equals(this.attachmentUrl, updateDataProcessingAgreement.attachmentUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, body, attachmentUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDataProcessingAgreement {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    attachmentUrl: ").append(toIndentedString(attachmentUrl)).append("\n");
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
    openapiFields.add("version");
    openapiFields.add("body");
    openapiFields.add("attachmentUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("body");
    openapiRequiredFields.add("attachmentUrl");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateDataProcessingAgreement
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateDataProcessingAgreement.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateDataProcessingAgreement is not found in the empty JSON string", UpdateDataProcessingAgreement.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateDataProcessingAgreement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateDataProcessingAgreement` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateDataProcessingAgreement.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("body") != null && !jsonObj.get("body").isJsonNull()) && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if ((jsonObj.get("attachmentUrl") != null && !jsonObj.get("attachmentUrl").isJsonNull()) && !jsonObj.get("attachmentUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachmentUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attachmentUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateDataProcessingAgreement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateDataProcessingAgreement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateDataProcessingAgreement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateDataProcessingAgreement.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateDataProcessingAgreement>() {
           @Override
           public void write(JsonWriter out, UpdateDataProcessingAgreement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateDataProcessingAgreement read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateDataProcessingAgreement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateDataProcessingAgreement
  * @throws IOException if the JSON string is invalid with respect to UpdateDataProcessingAgreement
  */
  public static UpdateDataProcessingAgreement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateDataProcessingAgreement.class);
  }

 /**
  * Convert an instance of UpdateDataProcessingAgreement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

