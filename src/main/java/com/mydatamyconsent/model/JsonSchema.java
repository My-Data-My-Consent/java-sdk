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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * JsonSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-27T10:34:27.227980464Z[Etc/UTC]")
public class JsonSchema {
  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<Object> keywords = null;

  public static final String SERIALIZED_NAME_OTHER_DATA = "otherData";
  @SerializedName(SERIALIZED_NAME_OTHER_DATA)
  private Map<String, Object> otherData = null;

  public static final String SERIALIZED_NAME_BOOL_VALUE = "boolValue";
  @SerializedName(SERIALIZED_NAME_BOOL_VALUE)
  private Boolean boolValue;

  public JsonSchema() { 
  }

  
  public JsonSchema(
     List<Object> keywords, 
     Map<String, Object> otherData, 
     Boolean boolValue
  ) {
    this();
    this.keywords = keywords;
    this.otherData = otherData;
    this.boolValue = boolValue;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getKeywords() {
    return keywords;
  }




   /**
   * Get otherData
   * @return otherData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getOtherData() {
    return otherData;
  }




   /**
   * Get boolValue
   * @return boolValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBoolValue() {
    return boolValue;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSchema jsonSchema = (JsonSchema) o;
    return Objects.equals(this.keywords, jsonSchema.keywords) &&
        Objects.equals(this.otherData, jsonSchema.otherData) &&
        Objects.equals(this.boolValue, jsonSchema.boolValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords, otherData, boolValue);
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
    sb.append("class JsonSchema {\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    otherData: ").append(toIndentedString(otherData)).append("\n");
    sb.append("    boolValue: ").append(toIndentedString(boolValue)).append("\n");
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

}

