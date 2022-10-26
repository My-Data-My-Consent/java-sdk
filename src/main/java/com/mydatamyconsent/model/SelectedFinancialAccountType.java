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
import com.mydatamyconsent.model.FinancialAccountSubCategoryType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * SelectedFinancialAccountType : Selected financial account type of financial account field of consent request template.
 */
@ApiModel(description = "SelectedFinancialAccountType : Selected financial account type of financial account field of consent request template.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-26T10:37:32.569789488Z[Etc/UTC]")
public class SelectedFinancialAccountType {
  public static final String SERIALIZED_NAME_SUB_CATEGORY = "subCategory";
  @SerializedName(SERIALIZED_NAME_SUB_CATEGORY)
  private FinancialAccountSubCategoryType subCategory;

  public static final String SERIALIZED_NAME_DRNS = "drns";
  @SerializedName(SERIALIZED_NAME_DRNS)
  private List<String> drns = new ArrayList<>();

  public SelectedFinancialAccountType() {
  }

  public SelectedFinancialAccountType subCategory(FinancialAccountSubCategoryType subCategory) {
    
    this.subCategory = subCategory;
    return this;
  }

   /**
   * Get subCategory
   * @return subCategory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FinancialAccountSubCategoryType getSubCategory() {
    return subCategory;
  }


  public void setSubCategory(FinancialAccountSubCategoryType subCategory) {
    this.subCategory = subCategory;
  }


  public SelectedFinancialAccountType drns(List<String> drns) {
    
    this.drns = drns;
    return this;
  }

  public SelectedFinancialAccountType addDrnsItem(String drnsItem) {
    this.drns.add(drnsItem);
    return this;
  }

   /**
   * DRNs.
   * @return drns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "DRNs.")

  public List<String> getDrns() {
    return drns;
  }


  public void setDrns(List<String> drns) {
    this.drns = drns;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectedFinancialAccountType selectedFinancialAccountType = (SelectedFinancialAccountType) o;
    return Objects.equals(this.subCategory, selectedFinancialAccountType.subCategory) &&
        Objects.equals(this.drns, selectedFinancialAccountType.drns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subCategory, drns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectedFinancialAccountType {\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    drns: ").append(toIndentedString(drns)).append("\n");
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
    openapiFields.add("subCategory");
    openapiFields.add("drns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subCategory");
    openapiRequiredFields.add("drns");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SelectedFinancialAccountType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SelectedFinancialAccountType.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SelectedFinancialAccountType is not found in the empty JSON string", SelectedFinancialAccountType.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SelectedFinancialAccountType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SelectedFinancialAccountType` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SelectedFinancialAccountType.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `subCategory`
      if (jsonObj.get("subCategory") != null && !jsonObj.get("subCategory").isJsonNull()) {
        FinancialAccountSubCategoryType.validateJsonObject(jsonObj.getAsJsonObject("subCategory"));
      }
      // ensure the json data is an array
      if ((jsonObj.get("drns") != null && !jsonObj.get("drns").isJsonNull()) && !jsonObj.get("drns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `drns` to be an array in the JSON string but got `%s`", jsonObj.get("drns").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SelectedFinancialAccountType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SelectedFinancialAccountType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SelectedFinancialAccountType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SelectedFinancialAccountType.class));

       return (TypeAdapter<T>) new TypeAdapter<SelectedFinancialAccountType>() {
           @Override
           public void write(JsonWriter out, SelectedFinancialAccountType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SelectedFinancialAccountType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SelectedFinancialAccountType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SelectedFinancialAccountType
  * @throws IOException if the JSON string is invalid with respect to SelectedFinancialAccountType
  */
  public static SelectedFinancialAccountType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SelectedFinancialAccountType.class);
  }

 /**
  * Convert an instance of SelectedFinancialAccountType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

