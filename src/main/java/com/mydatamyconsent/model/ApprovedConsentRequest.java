/*
 * My Data My Consent - Developer API
 * Unleashing the power of data consent by establishing trust. The Platform Core Developer API defines a set of capabilities that can be used to request, issue, manage and update data, documents and credentials by organizations. The API can be used to request, manage and update Decentralised Identifiers, Financial Data, Health Data issue Documents, Credentials directly or using OpenID Connect flows, and verify Messages signed with DIDs and much more.
 *
 * The version of the OpenAPI document: v1
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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * ApprovedConsentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-11T10:36:37.032190407Z[Etc/UTC]")
public class ApprovedConsentRequest {
  public static final String SERIALIZED_NAME_LOGO_URL = "logoUrl";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public ApprovedConsentRequest() { 
  }

  public ApprovedConsentRequest logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovedConsentRequest approvedConsentRequest = (ApprovedConsentRequest) o;
    return Objects.equals(this.logoUrl, approvedConsentRequest.logoUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(logoUrl);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovedConsentRequest {\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
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
    openapiFields.add("logoUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApprovedConsentRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ApprovedConsentRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApprovedConsentRequest is not found in the empty JSON string", ApprovedConsentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApprovedConsentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApprovedConsentRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("logoUrl") != null && !jsonObj.get("logoUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApprovedConsentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApprovedConsentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApprovedConsentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApprovedConsentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ApprovedConsentRequest>() {
           @Override
           public void write(JsonWriter out, ApprovedConsentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApprovedConsentRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApprovedConsentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApprovedConsentRequest
  * @throws IOException if the JSON string is invalid with respect to ApprovedConsentRequest
  */
  public static ApprovedConsentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApprovedConsentRequest.class);
  }

 /**
  * Convert an instance of ApprovedConsentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

