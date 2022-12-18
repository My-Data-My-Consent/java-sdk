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
import java.time.OffsetDateTime;

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
 * SipPlanInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-18T10:32:11.726337111Z[Etc/UTC]")
public class SipPlanInformation {
  public static final String SERIALIZED_NAME_AMC = "amc";
  @SerializedName(SERIALIZED_NAME_AMC)
  private String amc;

  public static final String SERIALIZED_NAME_REGISTRAR = "registrar";
  @SerializedName(SERIALIZED_NAME_REGISTRAR)
  private String registrar;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;

  public static final String SERIALIZED_NAME_ISIN = "isin";
  @SerializedName(SERIALIZED_NAME_ISIN)
  private String isin;

  public static final String SERIALIZED_NAME_FOLIO_NUMBER = "folio_number";
  @SerializedName(SERIALIZED_NAME_FOLIO_NUMBER)
  private String folioNumber;

  public static final String SERIALIZED_NAME_NAV = "nav";
  @SerializedName(SERIALIZED_NAME_NAV)
  private String nav;

  public static final String SERIALIZED_NAME_DIVIDEND_TYPE = "dividend_type";
  @SerializedName(SERIALIZED_NAME_DIVIDEND_TYPE)
  private String dividendType;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public SipPlanInformation() {
  }

  public SipPlanInformation amc(String amc) {
    
    this.amc = amc;
    return this;
  }

   /**
   * Get amc
   * @return amc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAmc() {
    return amc;
  }


  public void setAmc(String amc) {
    this.amc = amc;
  }


  public SipPlanInformation registrar(String registrar) {
    
    this.registrar = registrar;
    return this;
  }

   /**
   * Get registrar
   * @return registrar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegistrar() {
    return registrar;
  }


  public void setRegistrar(String registrar) {
    this.registrar = registrar;
  }


  public SipPlanInformation scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * Get scheme
   * @return scheme
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getScheme() {
    return scheme;
  }


  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public SipPlanInformation isin(String isin) {
    
    this.isin = isin;
    return this;
  }

   /**
   * Get isin
   * @return isin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIsin() {
    return isin;
  }


  public void setIsin(String isin) {
    this.isin = isin;
  }


  public SipPlanInformation folioNumber(String folioNumber) {
    
    this.folioNumber = folioNumber;
    return this;
  }

   /**
   * Get folioNumber
   * @return folioNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFolioNumber() {
    return folioNumber;
  }


  public void setFolioNumber(String folioNumber) {
    this.folioNumber = folioNumber;
  }


  public SipPlanInformation nav(String nav) {
    
    this.nav = nav;
    return this;
  }

   /**
   * Get nav
   * @return nav
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNav() {
    return nav;
  }


  public void setNav(String nav) {
    this.nav = nav;
  }


  public SipPlanInformation dividendType(String dividendType) {
    
    this.dividendType = dividendType;
    return this;
  }

   /**
   * Get dividendType
   * @return dividendType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDividendType() {
    return dividendType;
  }


  public void setDividendType(String dividendType) {
    this.dividendType = dividendType;
  }


  public SipPlanInformation creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SipPlanInformation sipPlanInformation = (SipPlanInformation) o;
    return Objects.equals(this.amc, sipPlanInformation.amc) &&
        Objects.equals(this.registrar, sipPlanInformation.registrar) &&
        Objects.equals(this.scheme, sipPlanInformation.scheme) &&
        Objects.equals(this.isin, sipPlanInformation.isin) &&
        Objects.equals(this.folioNumber, sipPlanInformation.folioNumber) &&
        Objects.equals(this.nav, sipPlanInformation.nav) &&
        Objects.equals(this.dividendType, sipPlanInformation.dividendType) &&
        Objects.equals(this.creationDate, sipPlanInformation.creationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amc, registrar, scheme, isin, folioNumber, nav, dividendType, creationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SipPlanInformation {\n");
    sb.append("    amc: ").append(toIndentedString(amc)).append("\n");
    sb.append("    registrar: ").append(toIndentedString(registrar)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    folioNumber: ").append(toIndentedString(folioNumber)).append("\n");
    sb.append("    nav: ").append(toIndentedString(nav)).append("\n");
    sb.append("    dividendType: ").append(toIndentedString(dividendType)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
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
    openapiFields.add("amc");
    openapiFields.add("registrar");
    openapiFields.add("scheme");
    openapiFields.add("isin");
    openapiFields.add("folio_number");
    openapiFields.add("nav");
    openapiFields.add("dividend_type");
    openapiFields.add("creation_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("scheme");
    openapiRequiredFields.add("isin");
    openapiRequiredFields.add("dividend_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SipPlanInformation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SipPlanInformation.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SipPlanInformation is not found in the empty JSON string", SipPlanInformation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SipPlanInformation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SipPlanInformation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SipPlanInformation.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("amc") != null && !jsonObj.get("amc").isJsonNull()) && !jsonObj.get("amc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amc").toString()));
      }
      if ((jsonObj.get("registrar") != null && !jsonObj.get("registrar").isJsonNull()) && !jsonObj.get("registrar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrar").toString()));
      }
      if ((jsonObj.get("scheme") != null && !jsonObj.get("scheme").isJsonNull()) && !jsonObj.get("scheme").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheme` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheme").toString()));
      }
      if ((jsonObj.get("isin") != null && !jsonObj.get("isin").isJsonNull()) && !jsonObj.get("isin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isin").toString()));
      }
      if ((jsonObj.get("folio_number") != null && !jsonObj.get("folio_number").isJsonNull()) && !jsonObj.get("folio_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `folio_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("folio_number").toString()));
      }
      if ((jsonObj.get("nav") != null && !jsonObj.get("nav").isJsonNull()) && !jsonObj.get("nav").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nav` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nav").toString()));
      }
      if ((jsonObj.get("dividend_type") != null && !jsonObj.get("dividend_type").isJsonNull()) && !jsonObj.get("dividend_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dividend_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dividend_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SipPlanInformation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SipPlanInformation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SipPlanInformation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SipPlanInformation.class));

       return (TypeAdapter<T>) new TypeAdapter<SipPlanInformation>() {
           @Override
           public void write(JsonWriter out, SipPlanInformation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SipPlanInformation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SipPlanInformation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SipPlanInformation
  * @throws IOException if the JSON string is invalid with respect to SipPlanInformation
  */
  public static SipPlanInformation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SipPlanInformation.class);
  }

 /**
  * Convert an instance of SipPlanInformation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

