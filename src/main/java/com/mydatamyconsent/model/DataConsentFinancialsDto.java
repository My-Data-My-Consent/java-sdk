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
import com.mydatamyconsent.model.DataConsentRequestedFinancialAccount;
import com.mydatamyconsent.model.Financial;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
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
 * DataConsentFinancialsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-22T10:36:45.340479622Z[Etc/UTC]")
public class DataConsentFinancialsDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_FINANCIALS = "financials";
  @SerializedName(SERIALIZED_NAME_FINANCIALS)
  private List<Financial> financials = null;

  public static final String SERIALIZED_NAME_APPROVED_FINANCIALS = "approvedFinancials";
  @SerializedName(SERIALIZED_NAME_APPROVED_FINANCIALS)
  private List<DataConsentRequestedFinancialAccount> approvedFinancials = null;

  public DataConsentFinancialsDto() { 
  }

  public DataConsentFinancialsDto id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public DataConsentFinancialsDto financials(List<Financial> financials) {
    
    this.financials = financials;
    return this;
  }

  public DataConsentFinancialsDto addFinancialsItem(Financial financialsItem) {
    if (this.financials == null) {
      this.financials = new ArrayList<>();
    }
    this.financials.add(financialsItem);
    return this;
  }

   /**
   * Get financials
   * @return financials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Financial> getFinancials() {
    return financials;
  }


  public void setFinancials(List<Financial> financials) {
    this.financials = financials;
  }


  public DataConsentFinancialsDto approvedFinancials(List<DataConsentRequestedFinancialAccount> approvedFinancials) {
    
    this.approvedFinancials = approvedFinancials;
    return this;
  }

  public DataConsentFinancialsDto addApprovedFinancialsItem(DataConsentRequestedFinancialAccount approvedFinancialsItem) {
    if (this.approvedFinancials == null) {
      this.approvedFinancials = new ArrayList<>();
    }
    this.approvedFinancials.add(approvedFinancialsItem);
    return this;
  }

   /**
   * Get approvedFinancials
   * @return approvedFinancials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DataConsentRequestedFinancialAccount> getApprovedFinancials() {
    return approvedFinancials;
  }


  public void setApprovedFinancials(List<DataConsentRequestedFinancialAccount> approvedFinancials) {
    this.approvedFinancials = approvedFinancials;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataConsentFinancialsDto dataConsentFinancialsDto = (DataConsentFinancialsDto) o;
    return Objects.equals(this.id, dataConsentFinancialsDto.id) &&
        Objects.equals(this.financials, dataConsentFinancialsDto.financials) &&
        Objects.equals(this.approvedFinancials, dataConsentFinancialsDto.approvedFinancials);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, financials, approvedFinancials);
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
    sb.append("class DataConsentFinancialsDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    financials: ").append(toIndentedString(financials)).append("\n");
    sb.append("    approvedFinancials: ").append(toIndentedString(approvedFinancials)).append("\n");
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
    openapiFields.add("financials");
    openapiFields.add("approvedFinancials");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DataConsentFinancialsDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DataConsentFinancialsDto.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataConsentFinancialsDto is not found in the empty JSON string", DataConsentFinancialsDto.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DataConsentFinancialsDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataConsentFinancialsDto` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      JsonArray jsonArrayfinancials = jsonObj.getAsJsonArray("financials");
      if (jsonArrayfinancials != null) {
        // ensure the json data is an array
        if (!jsonObj.get("financials").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `financials` to be an array in the JSON string but got `%s`", jsonObj.get("financials").toString()));
        }

        // validate the optional field `financials` (array)
        for (int i = 0; i < jsonArrayfinancials.size(); i++) {
          Financial.validateJsonObject(jsonArrayfinancials.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayapprovedFinancials = jsonObj.getAsJsonArray("approvedFinancials");
      if (jsonArrayapprovedFinancials != null) {
        // ensure the json data is an array
        if (!jsonObj.get("approvedFinancials").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `approvedFinancials` to be an array in the JSON string but got `%s`", jsonObj.get("approvedFinancials").toString()));
        }

        // validate the optional field `approvedFinancials` (array)
        for (int i = 0; i < jsonArrayapprovedFinancials.size(); i++) {
          DataConsentRequestedFinancialAccount.validateJsonObject(jsonArrayapprovedFinancials.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataConsentFinancialsDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataConsentFinancialsDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataConsentFinancialsDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataConsentFinancialsDto.class));

       return (TypeAdapter<T>) new TypeAdapter<DataConsentFinancialsDto>() {
           @Override
           public void write(JsonWriter out, DataConsentFinancialsDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataConsentFinancialsDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataConsentFinancialsDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataConsentFinancialsDto
  * @throws IOException if the JSON string is invalid with respect to DataConsentFinancialsDto
  */
  public static DataConsentFinancialsDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataConsentFinancialsDto.class);
  }

 /**
  * Convert an instance of DataConsentFinancialsDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

