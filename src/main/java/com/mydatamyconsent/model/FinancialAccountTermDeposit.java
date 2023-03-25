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
import com.mydatamyconsent.model.TermDepositAccountDetails;
import com.mydatamyconsent.model.TermDepositAccountType;
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
 * FinancialAccountTermDeposit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-25T10:33:36.003716622Z[Etc/UTC]")
public class FinancialAccountTermDeposit {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private TermDepositAccountType accountType;

  public static final String SERIALIZED_NAME_ISSUER_NAME = "issuer_name";
  @SerializedName(SERIALIZED_NAME_ISSUER_NAME)
  private String issuerName;

  public static final String SERIALIZED_NAME_ISSUER_LOGO_URL = "issuer_logo_url";
  @SerializedName(SERIALIZED_NAME_ISSUER_LOGO_URL)
  private String issuerLogoUrl;

  public static final String SERIALIZED_NAME_CURRENT_VALUE = "current_value";
  @SerializedName(SERIALIZED_NAME_CURRENT_VALUE)
  private Double currentValue;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_ACCOUNT_DETAILS = "account_details";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_DETAILS)
  private TermDepositAccountDetails accountDetails;

  public FinancialAccountTermDeposit() {
  }

  public FinancialAccountTermDeposit type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "TermDeposit", required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public FinancialAccountTermDeposit accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public FinancialAccountTermDeposit accountType(TermDepositAccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TermDepositAccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(TermDepositAccountType accountType) {
    this.accountType = accountType;
  }


  public FinancialAccountTermDeposit issuerName(String issuerName) {
    
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Get issuerName
   * @return issuerName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIssuerName() {
    return issuerName;
  }


  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }


  public FinancialAccountTermDeposit issuerLogoUrl(String issuerLogoUrl) {
    
    this.issuerLogoUrl = issuerLogoUrl;
    return this;
  }

   /**
   * Get issuerLogoUrl
   * @return issuerLogoUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIssuerLogoUrl() {
    return issuerLogoUrl;
  }


  public void setIssuerLogoUrl(String issuerLogoUrl) {
    this.issuerLogoUrl = issuerLogoUrl;
  }


  public FinancialAccountTermDeposit currentValue(Double currentValue) {
    
    this.currentValue = currentValue;
    return this;
  }

   /**
   * Get currentValue
   * @return currentValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getCurrentValue() {
    return currentValue;
  }


  public void setCurrentValue(Double currentValue) {
    this.currentValue = currentValue;
  }


  public FinancialAccountTermDeposit currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public FinancialAccountTermDeposit accountDetails(TermDepositAccountDetails accountDetails) {
    
    this.accountDetails = accountDetails;
    return this;
  }

   /**
   * Get accountDetails
   * @return accountDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TermDepositAccountDetails getAccountDetails() {
    return accountDetails;
  }


  public void setAccountDetails(TermDepositAccountDetails accountDetails) {
    this.accountDetails = accountDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialAccountTermDeposit financialAccountTermDeposit = (FinancialAccountTermDeposit) o;
    return Objects.equals(this.type, financialAccountTermDeposit.type) &&
        Objects.equals(this.accountNumber, financialAccountTermDeposit.accountNumber) &&
        Objects.equals(this.accountType, financialAccountTermDeposit.accountType) &&
        Objects.equals(this.issuerName, financialAccountTermDeposit.issuerName) &&
        Objects.equals(this.issuerLogoUrl, financialAccountTermDeposit.issuerLogoUrl) &&
        Objects.equals(this.currentValue, financialAccountTermDeposit.currentValue) &&
        Objects.equals(this.currencyCode, financialAccountTermDeposit.currencyCode) &&
        Objects.equals(this.accountDetails, financialAccountTermDeposit.accountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, accountNumber, accountType, issuerName, issuerLogoUrl, currentValue, currencyCode, accountDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialAccountTermDeposit {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    issuerLogoUrl: ").append(toIndentedString(issuerLogoUrl)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    accountDetails: ").append(toIndentedString(accountDetails)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("account_number");
    openapiFields.add("account_type");
    openapiFields.add("issuer_name");
    openapiFields.add("issuer_logo_url");
    openapiFields.add("current_value");
    openapiFields.add("currency_code");
    openapiFields.add("account_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("account_number");
    openapiRequiredFields.add("account_type");
    openapiRequiredFields.add("issuer_name");
    openapiRequiredFields.add("issuer_logo_url");
    openapiRequiredFields.add("current_value");
    openapiRequiredFields.add("currency_code");
    openapiRequiredFields.add("account_details");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FinancialAccountTermDeposit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FinancialAccountTermDeposit.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialAccountTermDeposit is not found in the empty JSON string", FinancialAccountTermDeposit.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinancialAccountTermDeposit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinancialAccountTermDeposit` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FinancialAccountTermDeposit.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("account_number") != null && !jsonObj.get("account_number").isJsonNull()) && !jsonObj.get("account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_number").toString()));
      }
      if ((jsonObj.get("issuer_name") != null && !jsonObj.get("issuer_name").isJsonNull()) && !jsonObj.get("issuer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer_name").toString()));
      }
      if ((jsonObj.get("issuer_logo_url") != null && !jsonObj.get("issuer_logo_url").isJsonNull()) && !jsonObj.get("issuer_logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer_logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer_logo_url").toString()));
      }
      if ((jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonNull()) && !jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      // validate the optional field `account_details`
      if (jsonObj.get("account_details") != null && !jsonObj.get("account_details").isJsonNull()) {
        TermDepositAccountDetails.validateJsonObject(jsonObj.getAsJsonObject("account_details"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialAccountTermDeposit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialAccountTermDeposit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialAccountTermDeposit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccountTermDeposit.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialAccountTermDeposit>() {
           @Override
           public void write(JsonWriter out, FinancialAccountTermDeposit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinancialAccountTermDeposit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinancialAccountTermDeposit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialAccountTermDeposit
  * @throws IOException if the JSON string is invalid with respect to FinancialAccountTermDeposit
  */
  public static FinancialAccountTermDeposit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialAccountTermDeposit.class);
  }

 /**
  * Convert an instance of FinancialAccountTermDeposit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

