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
import com.mydatamyconsent.model.MutualFundHoldingMode;
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
 * MutualFundHolding
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-29T10:38:54.976455555Z[Etc/UTC]")
public class MutualFundHolding {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AMC = "amc";
  @SerializedName(SERIALIZED_NAME_AMC)
  private String amc;

  public static final String SERIALIZED_NAME_REGISTRAR = "registrar";
  @SerializedName(SERIALIZED_NAME_REGISTRAR)
  private String registrar;

  public static final String SERIALIZED_NAME_SCHEME_CODE = "schemeCode";
  @SerializedName(SERIALIZED_NAME_SCHEME_CODE)
  private String schemeCode;

  public static final String SERIALIZED_NAME_ISIN = "isin";
  @SerializedName(SERIALIZED_NAME_ISIN)
  private String isin;

  public static final String SERIALIZED_NAME_UCC = "ucc";
  @SerializedName(SERIALIZED_NAME_UCC)
  private String ucc;

  public static final String SERIALIZED_NAME_AMFI_CODE = "amfiCode";
  @SerializedName(SERIALIZED_NAME_AMFI_CODE)
  private String amfiCode;

  public static final String SERIALIZED_NAME_FOLIO_NO = "folioNo";
  @SerializedName(SERIALIZED_NAME_FOLIO_NO)
  private String folioNo;

  public static final String SERIALIZED_NAME_DIVIDEND_TYPE = "dividendType";
  @SerializedName(SERIALIZED_NAME_DIVIDEND_TYPE)
  private String dividendType;

  public static final String SERIALIZED_NAME_FATCA_STATUS = "fatcaStatus";
  @SerializedName(SERIALIZED_NAME_FATCA_STATUS)
  private String fatcaStatus;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private MutualFundHoldingMode mode;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private Double units;

  public static final String SERIALIZED_NAME_CLOSING_UNITS = "closingUnits";
  @SerializedName(SERIALIZED_NAME_CLOSING_UNITS)
  private String closingUnits;

  public static final String SERIALIZED_NAME_LIEN_UNITS = "lienUnits";
  @SerializedName(SERIALIZED_NAME_LIEN_UNITS)
  private String lienUnits;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private String rate;

  public static final String SERIALIZED_NAME_NAV = "nav";
  @SerializedName(SERIALIZED_NAME_NAV)
  private String nav;

  public static final String SERIALIZED_NAME_LOCKING_UNITS = "lockingUnits";
  @SerializedName(SERIALIZED_NAME_LOCKING_UNITS)
  private String lockingUnits;

  public MutualFundHolding() {
  }

  public MutualFundHolding name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MutualFundHolding amc(String amc) {
    
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


  public MutualFundHolding registrar(String registrar) {
    
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


  public MutualFundHolding schemeCode(String schemeCode) {
    
    this.schemeCode = schemeCode;
    return this;
  }

   /**
   * Get schemeCode
   * @return schemeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSchemeCode() {
    return schemeCode;
  }


  public void setSchemeCode(String schemeCode) {
    this.schemeCode = schemeCode;
  }


  public MutualFundHolding isin(String isin) {
    
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


  public MutualFundHolding ucc(String ucc) {
    
    this.ucc = ucc;
    return this;
  }

   /**
   * Get ucc
   * @return ucc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUcc() {
    return ucc;
  }


  public void setUcc(String ucc) {
    this.ucc = ucc;
  }


  public MutualFundHolding amfiCode(String amfiCode) {
    
    this.amfiCode = amfiCode;
    return this;
  }

   /**
   * Get amfiCode
   * @return amfiCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAmfiCode() {
    return amfiCode;
  }


  public void setAmfiCode(String amfiCode) {
    this.amfiCode = amfiCode;
  }


  public MutualFundHolding folioNo(String folioNo) {
    
    this.folioNo = folioNo;
    return this;
  }

   /**
   * Get folioNo
   * @return folioNo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFolioNo() {
    return folioNo;
  }


  public void setFolioNo(String folioNo) {
    this.folioNo = folioNo;
  }


  public MutualFundHolding dividendType(String dividendType) {
    
    this.dividendType = dividendType;
    return this;
  }

   /**
   * Get dividendType
   * @return dividendType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDividendType() {
    return dividendType;
  }


  public void setDividendType(String dividendType) {
    this.dividendType = dividendType;
  }


  public MutualFundHolding fatcaStatus(String fatcaStatus) {
    
    this.fatcaStatus = fatcaStatus;
    return this;
  }

   /**
   * Get fatcaStatus
   * @return fatcaStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFatcaStatus() {
    return fatcaStatus;
  }


  public void setFatcaStatus(String fatcaStatus) {
    this.fatcaStatus = fatcaStatus;
  }


  public MutualFundHolding mode(MutualFundHoldingMode mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MutualFundHoldingMode getMode() {
    return mode;
  }


  public void setMode(MutualFundHoldingMode mode) {
    this.mode = mode;
  }


  public MutualFundHolding units(Double units) {
    
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getUnits() {
    return units;
  }


  public void setUnits(Double units) {
    this.units = units;
  }


  public MutualFundHolding closingUnits(String closingUnits) {
    
    this.closingUnits = closingUnits;
    return this;
  }

   /**
   * Get closingUnits
   * @return closingUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClosingUnits() {
    return closingUnits;
  }


  public void setClosingUnits(String closingUnits) {
    this.closingUnits = closingUnits;
  }


  public MutualFundHolding lienUnits(String lienUnits) {
    
    this.lienUnits = lienUnits;
    return this;
  }

   /**
   * Get lienUnits
   * @return lienUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLienUnits() {
    return lienUnits;
  }


  public void setLienUnits(String lienUnits) {
    this.lienUnits = lienUnits;
  }


  public MutualFundHolding rate(String rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRate() {
    return rate;
  }


  public void setRate(String rate) {
    this.rate = rate;
  }


  public MutualFundHolding nav(String nav) {
    
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


  public MutualFundHolding lockingUnits(String lockingUnits) {
    
    this.lockingUnits = lockingUnits;
    return this;
  }

   /**
   * Get lockingUnits
   * @return lockingUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLockingUnits() {
    return lockingUnits;
  }


  public void setLockingUnits(String lockingUnits) {
    this.lockingUnits = lockingUnits;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MutualFundHolding mutualFundHolding = (MutualFundHolding) o;
    return Objects.equals(this.name, mutualFundHolding.name) &&
        Objects.equals(this.amc, mutualFundHolding.amc) &&
        Objects.equals(this.registrar, mutualFundHolding.registrar) &&
        Objects.equals(this.schemeCode, mutualFundHolding.schemeCode) &&
        Objects.equals(this.isin, mutualFundHolding.isin) &&
        Objects.equals(this.ucc, mutualFundHolding.ucc) &&
        Objects.equals(this.amfiCode, mutualFundHolding.amfiCode) &&
        Objects.equals(this.folioNo, mutualFundHolding.folioNo) &&
        Objects.equals(this.dividendType, mutualFundHolding.dividendType) &&
        Objects.equals(this.fatcaStatus, mutualFundHolding.fatcaStatus) &&
        Objects.equals(this.mode, mutualFundHolding.mode) &&
        Objects.equals(this.units, mutualFundHolding.units) &&
        Objects.equals(this.closingUnits, mutualFundHolding.closingUnits) &&
        Objects.equals(this.lienUnits, mutualFundHolding.lienUnits) &&
        Objects.equals(this.rate, mutualFundHolding.rate) &&
        Objects.equals(this.nav, mutualFundHolding.nav) &&
        Objects.equals(this.lockingUnits, mutualFundHolding.lockingUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, amc, registrar, schemeCode, isin, ucc, amfiCode, folioNo, dividendType, fatcaStatus, mode, units, closingUnits, lienUnits, rate, nav, lockingUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MutualFundHolding {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    amc: ").append(toIndentedString(amc)).append("\n");
    sb.append("    registrar: ").append(toIndentedString(registrar)).append("\n");
    sb.append("    schemeCode: ").append(toIndentedString(schemeCode)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    ucc: ").append(toIndentedString(ucc)).append("\n");
    sb.append("    amfiCode: ").append(toIndentedString(amfiCode)).append("\n");
    sb.append("    folioNo: ").append(toIndentedString(folioNo)).append("\n");
    sb.append("    dividendType: ").append(toIndentedString(dividendType)).append("\n");
    sb.append("    fatcaStatus: ").append(toIndentedString(fatcaStatus)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    closingUnits: ").append(toIndentedString(closingUnits)).append("\n");
    sb.append("    lienUnits: ").append(toIndentedString(lienUnits)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    nav: ").append(toIndentedString(nav)).append("\n");
    sb.append("    lockingUnits: ").append(toIndentedString(lockingUnits)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("amc");
    openapiFields.add("registrar");
    openapiFields.add("schemeCode");
    openapiFields.add("isin");
    openapiFields.add("ucc");
    openapiFields.add("amfiCode");
    openapiFields.add("folioNo");
    openapiFields.add("dividendType");
    openapiFields.add("fatcaStatus");
    openapiFields.add("mode");
    openapiFields.add("units");
    openapiFields.add("closingUnits");
    openapiFields.add("lienUnits");
    openapiFields.add("rate");
    openapiFields.add("nav");
    openapiFields.add("lockingUnits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("isin");
    openapiRequiredFields.add("folioNo");
    openapiRequiredFields.add("mode");
    openapiRequiredFields.add("units");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MutualFundHolding
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MutualFundHolding.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MutualFundHolding is not found in the empty JSON string", MutualFundHolding.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MutualFundHolding.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MutualFundHolding` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MutualFundHolding.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("amc") != null && !jsonObj.get("amc").isJsonNull()) && !jsonObj.get("amc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amc").toString()));
      }
      if ((jsonObj.get("registrar") != null && !jsonObj.get("registrar").isJsonNull()) && !jsonObj.get("registrar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrar").toString()));
      }
      if ((jsonObj.get("schemeCode") != null && !jsonObj.get("schemeCode").isJsonNull()) && !jsonObj.get("schemeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schemeCode").toString()));
      }
      if ((jsonObj.get("isin") != null && !jsonObj.get("isin").isJsonNull()) && !jsonObj.get("isin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isin").toString()));
      }
      if ((jsonObj.get("ucc") != null && !jsonObj.get("ucc").isJsonNull()) && !jsonObj.get("ucc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ucc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ucc").toString()));
      }
      if ((jsonObj.get("amfiCode") != null && !jsonObj.get("amfiCode").isJsonNull()) && !jsonObj.get("amfiCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amfiCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amfiCode").toString()));
      }
      if ((jsonObj.get("folioNo") != null && !jsonObj.get("folioNo").isJsonNull()) && !jsonObj.get("folioNo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `folioNo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("folioNo").toString()));
      }
      if ((jsonObj.get("dividendType") != null && !jsonObj.get("dividendType").isJsonNull()) && !jsonObj.get("dividendType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dividendType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dividendType").toString()));
      }
      if ((jsonObj.get("fatcaStatus") != null && !jsonObj.get("fatcaStatus").isJsonNull()) && !jsonObj.get("fatcaStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fatcaStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fatcaStatus").toString()));
      }
      if ((jsonObj.get("closingUnits") != null && !jsonObj.get("closingUnits").isJsonNull()) && !jsonObj.get("closingUnits").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `closingUnits` to be a primitive type in the JSON string but got `%s`", jsonObj.get("closingUnits").toString()));
      }
      if ((jsonObj.get("lienUnits") != null && !jsonObj.get("lienUnits").isJsonNull()) && !jsonObj.get("lienUnits").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lienUnits` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lienUnits").toString()));
      }
      if ((jsonObj.get("rate") != null && !jsonObj.get("rate").isJsonNull()) && !jsonObj.get("rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rate").toString()));
      }
      if ((jsonObj.get("nav") != null && !jsonObj.get("nav").isJsonNull()) && !jsonObj.get("nav").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nav` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nav").toString()));
      }
      if ((jsonObj.get("lockingUnits") != null && !jsonObj.get("lockingUnits").isJsonNull()) && !jsonObj.get("lockingUnits").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lockingUnits` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lockingUnits").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MutualFundHolding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MutualFundHolding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MutualFundHolding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MutualFundHolding.class));

       return (TypeAdapter<T>) new TypeAdapter<MutualFundHolding>() {
           @Override
           public void write(JsonWriter out, MutualFundHolding value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MutualFundHolding read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MutualFundHolding given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MutualFundHolding
  * @throws IOException if the JSON string is invalid with respect to MutualFundHolding
  */
  public static MutualFundHolding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MutualFundHolding.class);
  }

 /**
  * Convert an instance of MutualFundHolding to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

