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
import com.mydatamyconsent.model.IssuerType;
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
 * DataProcessingAgreement : Data processing agreement details.
 */
@ApiModel(description = "DataProcessingAgreement : Data processing agreement details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-25T10:35:49.843604063Z[Etc/UTC]")
public class DataProcessingAgreement {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ISSUER_TYPE = "issuerType";
  @SerializedName(SERIALIZED_NAME_ISSUER_TYPE)
  private IssuerType issuerType;

  public static final String SERIALIZED_NAME_AGREEMENT_URL = "agreementUrl";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_URL)
  private String agreementUrl;

  public DataProcessingAgreement() {
  }

  public DataProcessingAgreement id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Agreement id.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Agreement id.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DataProcessingAgreement name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Agreement name.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Agreement name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DataProcessingAgreement issuerType(IssuerType issuerType) {
    
    this.issuerType = issuerType;
    return this;
  }

   /**
   * Get issuerType
   * @return issuerType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IssuerType getIssuerType() {
    return issuerType;
  }


  public void setIssuerType(IssuerType issuerType) {
    this.issuerType = issuerType;
  }


  public DataProcessingAgreement agreementUrl(String agreementUrl) {
    
    this.agreementUrl = agreementUrl;
    return this;
  }

   /**
   * Agreement attachment file URL.
   * @return agreementUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Agreement attachment file URL.")

  public String getAgreementUrl() {
    return agreementUrl;
  }


  public void setAgreementUrl(String agreementUrl) {
    this.agreementUrl = agreementUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataProcessingAgreement dataProcessingAgreement = (DataProcessingAgreement) o;
    return Objects.equals(this.id, dataProcessingAgreement.id) &&
        Objects.equals(this.name, dataProcessingAgreement.name) &&
        Objects.equals(this.issuerType, dataProcessingAgreement.issuerType) &&
        Objects.equals(this.agreementUrl, dataProcessingAgreement.agreementUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, issuerType, agreementUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataProcessingAgreement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    issuerType: ").append(toIndentedString(issuerType)).append("\n");
    sb.append("    agreementUrl: ").append(toIndentedString(agreementUrl)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("issuerType");
    openapiFields.add("agreementUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("issuerType");
    openapiRequiredFields.add("agreementUrl");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DataProcessingAgreement
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DataProcessingAgreement.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataProcessingAgreement is not found in the empty JSON string", DataProcessingAgreement.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DataProcessingAgreement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataProcessingAgreement` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DataProcessingAgreement.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("agreementUrl") != null && !jsonObj.get("agreementUrl").isJsonNull()) && !jsonObj.get("agreementUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreementUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreementUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataProcessingAgreement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataProcessingAgreement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataProcessingAgreement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataProcessingAgreement.class));

       return (TypeAdapter<T>) new TypeAdapter<DataProcessingAgreement>() {
           @Override
           public void write(JsonWriter out, DataProcessingAgreement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataProcessingAgreement read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataProcessingAgreement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataProcessingAgreement
  * @throws IOException if the JSON string is invalid with respect to DataProcessingAgreement
  */
  public static DataProcessingAgreement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataProcessingAgreement.class);
  }

 /**
  * Convert an instance of DataProcessingAgreement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

