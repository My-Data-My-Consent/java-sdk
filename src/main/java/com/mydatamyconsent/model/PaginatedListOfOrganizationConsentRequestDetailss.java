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
import com.mydatamyconsent.model.OrganizationConsentRequestDetails;
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
 * PaginatedListOfOrganizationConsentRequestDetailss
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-28T10:35:19.078417588Z[Etc/UTC]")
public class PaginatedListOfOrganizationConsentRequestDetailss {
  public static final String SERIALIZED_NAME_PAGE_NO = "pageNo";
  @SerializedName(SERIALIZED_NAME_PAGE_NO)
  private Integer pageNo;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL_PAGE = "totalPage";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE)
  private Integer totalPage;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OrganizationConsentRequestDetails> items = new ArrayList<>();

  public PaginatedListOfOrganizationConsentRequestDetailss() {
  }

  public PaginatedListOfOrganizationConsentRequestDetailss pageNo(Integer pageNo) {
    
    this.pageNo = pageNo;
    return this;
  }

   /**
   * Get pageNo
   * @return pageNo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getPageNo() {
    return pageNo;
  }


  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }


  public PaginatedListOfOrganizationConsentRequestDetailss pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public PaginatedListOfOrganizationConsentRequestDetailss totalPage(Integer totalPage) {
    
    this.totalPage = totalPage;
    return this;
  }

   /**
   * Get totalPage
   * @return totalPage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTotalPage() {
    return totalPage;
  }


  public void setTotalPage(Integer totalPage) {
    this.totalPage = totalPage;
  }


  public PaginatedListOfOrganizationConsentRequestDetailss items(List<OrganizationConsentRequestDetails> items) {
    
    this.items = items;
    return this;
  }

  public PaginatedListOfOrganizationConsentRequestDetailss addItemsItem(OrganizationConsentRequestDetails itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<OrganizationConsentRequestDetails> getItems() {
    return items;
  }


  public void setItems(List<OrganizationConsentRequestDetails> items) {
    this.items = items;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedListOfOrganizationConsentRequestDetailss paginatedListOfOrganizationConsentRequestDetailss = (PaginatedListOfOrganizationConsentRequestDetailss) o;
    return Objects.equals(this.pageNo, paginatedListOfOrganizationConsentRequestDetailss.pageNo) &&
        Objects.equals(this.pageSize, paginatedListOfOrganizationConsentRequestDetailss.pageSize) &&
        Objects.equals(this.totalPage, paginatedListOfOrganizationConsentRequestDetailss.totalPage) &&
        Objects.equals(this.items, paginatedListOfOrganizationConsentRequestDetailss.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNo, pageSize, totalPage, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedListOfOrganizationConsentRequestDetailss {\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("pageNo");
    openapiFields.add("pageSize");
    openapiFields.add("totalPage");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pageNo");
    openapiRequiredFields.add("pageSize");
    openapiRequiredFields.add("totalPage");
    openapiRequiredFields.add("items");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaginatedListOfOrganizationConsentRequestDetailss
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaginatedListOfOrganizationConsentRequestDetailss.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaginatedListOfOrganizationConsentRequestDetailss is not found in the empty JSON string", PaginatedListOfOrganizationConsentRequestDetailss.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaginatedListOfOrganizationConsentRequestDetailss.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaginatedListOfOrganizationConsentRequestDetailss` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaginatedListOfOrganizationConsentRequestDetailss.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            OrganizationConsentRequestDetails.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaginatedListOfOrganizationConsentRequestDetailss.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaginatedListOfOrganizationConsentRequestDetailss' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaginatedListOfOrganizationConsentRequestDetailss> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaginatedListOfOrganizationConsentRequestDetailss.class));

       return (TypeAdapter<T>) new TypeAdapter<PaginatedListOfOrganizationConsentRequestDetailss>() {
           @Override
           public void write(JsonWriter out, PaginatedListOfOrganizationConsentRequestDetailss value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaginatedListOfOrganizationConsentRequestDetailss read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaginatedListOfOrganizationConsentRequestDetailss given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaginatedListOfOrganizationConsentRequestDetailss
  * @throws IOException if the JSON string is invalid with respect to PaginatedListOfOrganizationConsentRequestDetailss
  */
  public static PaginatedListOfOrganizationConsentRequestDetailss fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaginatedListOfOrganizationConsentRequestDetailss.class);
  }

 /**
  * Convert an instance of PaginatedListOfOrganizationConsentRequestDetailss to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

