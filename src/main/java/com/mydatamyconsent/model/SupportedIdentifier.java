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
import com.mydatamyconsent.model.Identifier;
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
 * SupportedIdentifier
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-18T10:38:11.227982270Z[Etc/UTC]")
public class SupportedIdentifier {
  public static final String SERIALIZED_NAME_ISO2 = "iso2";
  @SerializedName(SERIALIZED_NAME_ISO2)
  private String iso2;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INDIVIDUAL_IDENTIFIERS = "individualIdentifiers";
  @SerializedName(SERIALIZED_NAME_INDIVIDUAL_IDENTIFIERS)
  private List<Identifier> individualIdentifiers = null;

  public static final String SERIALIZED_NAME_ORGANIZATION_IDENTIFIERS = "organizationIdentifiers";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_IDENTIFIERS)
  private List<Identifier> organizationIdentifiers = null;

  public SupportedIdentifier() { 
  }

  public SupportedIdentifier iso2(String iso2) {
    
    this.iso2 = iso2;
    return this;
  }

   /**
   * Get iso2
   * @return iso2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIso2() {
    return iso2;
  }


  public void setIso2(String iso2) {
    this.iso2 = iso2;
  }


  public SupportedIdentifier name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SupportedIdentifier individualIdentifiers(List<Identifier> individualIdentifiers) {
    
    this.individualIdentifiers = individualIdentifiers;
    return this;
  }

  public SupportedIdentifier addIndividualIdentifiersItem(Identifier individualIdentifiersItem) {
    if (this.individualIdentifiers == null) {
      this.individualIdentifiers = new ArrayList<>();
    }
    this.individualIdentifiers.add(individualIdentifiersItem);
    return this;
  }

   /**
   * Get individualIdentifiers
   * @return individualIdentifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Identifier> getIndividualIdentifiers() {
    return individualIdentifiers;
  }


  public void setIndividualIdentifiers(List<Identifier> individualIdentifiers) {
    this.individualIdentifiers = individualIdentifiers;
  }


  public SupportedIdentifier organizationIdentifiers(List<Identifier> organizationIdentifiers) {
    
    this.organizationIdentifiers = organizationIdentifiers;
    return this;
  }

  public SupportedIdentifier addOrganizationIdentifiersItem(Identifier organizationIdentifiersItem) {
    if (this.organizationIdentifiers == null) {
      this.organizationIdentifiers = new ArrayList<>();
    }
    this.organizationIdentifiers.add(organizationIdentifiersItem);
    return this;
  }

   /**
   * Get organizationIdentifiers
   * @return organizationIdentifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Identifier> getOrganizationIdentifiers() {
    return organizationIdentifiers;
  }


  public void setOrganizationIdentifiers(List<Identifier> organizationIdentifiers) {
    this.organizationIdentifiers = organizationIdentifiers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedIdentifier supportedIdentifier = (SupportedIdentifier) o;
    return Objects.equals(this.iso2, supportedIdentifier.iso2) &&
        Objects.equals(this.name, supportedIdentifier.name) &&
        Objects.equals(this.individualIdentifiers, supportedIdentifier.individualIdentifiers) &&
        Objects.equals(this.organizationIdentifiers, supportedIdentifier.organizationIdentifiers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(iso2, name, individualIdentifiers, organizationIdentifiers);
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
    sb.append("class SupportedIdentifier {\n");
    sb.append("    iso2: ").append(toIndentedString(iso2)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    individualIdentifiers: ").append(toIndentedString(individualIdentifiers)).append("\n");
    sb.append("    organizationIdentifiers: ").append(toIndentedString(organizationIdentifiers)).append("\n");
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
    openapiFields.add("iso2");
    openapiFields.add("name");
    openapiFields.add("individualIdentifiers");
    openapiFields.add("organizationIdentifiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SupportedIdentifier
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SupportedIdentifier.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SupportedIdentifier is not found in the empty JSON string", SupportedIdentifier.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SupportedIdentifier.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SupportedIdentifier` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("iso2") != null && !jsonObj.get("iso2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iso2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iso2").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      JsonArray jsonArrayindividualIdentifiers = jsonObj.getAsJsonArray("individualIdentifiers");
      if (jsonArrayindividualIdentifiers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("individualIdentifiers").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `individualIdentifiers` to be an array in the JSON string but got `%s`", jsonObj.get("individualIdentifiers").toString()));
        }

        // validate the optional field `individualIdentifiers` (array)
        for (int i = 0; i < jsonArrayindividualIdentifiers.size(); i++) {
          Identifier.validateJsonObject(jsonArrayindividualIdentifiers.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayorganizationIdentifiers = jsonObj.getAsJsonArray("organizationIdentifiers");
      if (jsonArrayorganizationIdentifiers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("organizationIdentifiers").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `organizationIdentifiers` to be an array in the JSON string but got `%s`", jsonObj.get("organizationIdentifiers").toString()));
        }

        // validate the optional field `organizationIdentifiers` (array)
        for (int i = 0; i < jsonArrayorganizationIdentifiers.size(); i++) {
          Identifier.validateJsonObject(jsonArrayorganizationIdentifiers.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SupportedIdentifier.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SupportedIdentifier' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SupportedIdentifier> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SupportedIdentifier.class));

       return (TypeAdapter<T>) new TypeAdapter<SupportedIdentifier>() {
           @Override
           public void write(JsonWriter out, SupportedIdentifier value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SupportedIdentifier read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SupportedIdentifier given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SupportedIdentifier
  * @throws IOException if the JSON string is invalid with respect to SupportedIdentifier
  */
  public static SupportedIdentifier fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SupportedIdentifier.class);
  }

 /**
  * Convert an instance of SupportedIdentifier to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

