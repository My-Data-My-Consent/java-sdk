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
import com.mydatamyconsent.model.DataConsentDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * DataConsentDetailsPaginatedList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-23T10:36:50.524054954Z[Etc/UTC]")
public class DataConsentDetailsPaginatedList {
  public static final String SERIALIZED_NAME_PAGE_INDEX = "pageIndex";
  @SerializedName(SERIALIZED_NAME_PAGE_INDEX)
  private Integer pageIndex;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public static final String SERIALIZED_NAME_TOTAL_ITEMS = "totalItems";
  @SerializedName(SERIALIZED_NAME_TOTAL_ITEMS)
  private Long totalItems;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<DataConsentDetails> items = null;

  public DataConsentDetailsPaginatedList() { 
  }

  
  public DataConsentDetailsPaginatedList(
     Integer totalPages
  ) {
    this();
    this.totalPages = totalPages;
  }

  public DataConsentDetailsPaginatedList pageIndex(Integer pageIndex) {
    
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * Get pageIndex
   * @return pageIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPageIndex() {
    return pageIndex;
  }


  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }


  public DataConsentDetailsPaginatedList pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


   /**
   * Get totalPages
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalPages() {
    return totalPages;
  }




  public DataConsentDetailsPaginatedList totalItems(Long totalItems) {
    
    this.totalItems = totalItems;
    return this;
  }

   /**
   * Get totalItems
   * @return totalItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalItems() {
    return totalItems;
  }


  public void setTotalItems(Long totalItems) {
    this.totalItems = totalItems;
  }


  public DataConsentDetailsPaginatedList items(List<DataConsentDetails> items) {
    
    this.items = items;
    return this;
  }

  public DataConsentDetailsPaginatedList addItemsItem(DataConsentDetails itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DataConsentDetails> getItems() {
    return items;
  }


  public void setItems(List<DataConsentDetails> items) {
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
    DataConsentDetailsPaginatedList dataConsentDetailsPaginatedList = (DataConsentDetailsPaginatedList) o;
    return Objects.equals(this.pageIndex, dataConsentDetailsPaginatedList.pageIndex) &&
        Objects.equals(this.pageSize, dataConsentDetailsPaginatedList.pageSize) &&
        Objects.equals(this.totalPages, dataConsentDetailsPaginatedList.totalPages) &&
        Objects.equals(this.totalItems, dataConsentDetailsPaginatedList.totalItems) &&
        Objects.equals(this.items, dataConsentDetailsPaginatedList.items);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageIndex, pageSize, totalPages, totalItems, items);
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
    sb.append("class DataConsentDetailsPaginatedList {\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
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
    openapiFields.add("pageIndex");
    openapiFields.add("pageSize");
    openapiFields.add("totalPages");
    openapiFields.add("totalItems");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DataConsentDetailsPaginatedList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DataConsentDetailsPaginatedList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataConsentDetailsPaginatedList is not found in the empty JSON string", DataConsentDetailsPaginatedList.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DataConsentDetailsPaginatedList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataConsentDetailsPaginatedList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      if (jsonArrayitems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
        }

        // validate the optional field `items` (array)
        for (int i = 0; i < jsonArrayitems.size(); i++) {
          DataConsentDetails.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataConsentDetailsPaginatedList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataConsentDetailsPaginatedList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataConsentDetailsPaginatedList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataConsentDetailsPaginatedList.class));

       return (TypeAdapter<T>) new TypeAdapter<DataConsentDetailsPaginatedList>() {
           @Override
           public void write(JsonWriter out, DataConsentDetailsPaginatedList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataConsentDetailsPaginatedList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataConsentDetailsPaginatedList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataConsentDetailsPaginatedList
  * @throws IOException if the JSON string is invalid with respect to DataConsentDetailsPaginatedList
  */
  public static DataConsentDetailsPaginatedList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataConsentDetailsPaginatedList.class);
  }

 /**
  * Convert an instance of DataConsentDetailsPaginatedList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

