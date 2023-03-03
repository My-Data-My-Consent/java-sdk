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
import com.mydatamyconsent.model.Holder;
import com.mydatamyconsent.model.SipInvestmentInformation;
import com.mydatamyconsent.model.SipPlanInformation;
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
 * Sip
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-03T10:37:37.629398977Z[Etc/UTC]")
public class Sip {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INVESTMENT_VALUE = "investment_value";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_VALUE)
  private Double investmentValue;

  public static final String SERIALIZED_NAME_CURRENT_VALUE = "current_value";
  @SerializedName(SERIALIZED_NAME_CURRENT_VALUE)
  private Double currentValue;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_PLAN_INFO = "plan_info";
  @SerializedName(SERIALIZED_NAME_PLAN_INFO)
  private SipPlanInformation planInfo;

  public static final String SERIALIZED_NAME_INVESTMENT_INFO = "investment_info";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_INFO)
  private SipInvestmentInformation investmentInfo;

  public static final String SERIALIZED_NAME_HOLDER = "holder";
  @SerializedName(SERIALIZED_NAME_HOLDER)
  private Holder holder;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private Boolean transactions;

  public Sip() {
  }

  public Sip id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Sip name(String name) {
    
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


  public Sip investmentValue(Double investmentValue) {
    
    this.investmentValue = investmentValue;
    return this;
  }

   /**
   * Get investmentValue
   * @return investmentValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getInvestmentValue() {
    return investmentValue;
  }


  public void setInvestmentValue(Double investmentValue) {
    this.investmentValue = investmentValue;
  }


  public Sip currentValue(Double currentValue) {
    
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


  public Sip currencyCode(String currencyCode) {
    
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


  public Sip planInfo(SipPlanInformation planInfo) {
    
    this.planInfo = planInfo;
    return this;
  }

   /**
   * Get planInfo
   * @return planInfo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SipPlanInformation getPlanInfo() {
    return planInfo;
  }


  public void setPlanInfo(SipPlanInformation planInfo) {
    this.planInfo = planInfo;
  }


  public Sip investmentInfo(SipInvestmentInformation investmentInfo) {
    
    this.investmentInfo = investmentInfo;
    return this;
  }

   /**
   * Get investmentInfo
   * @return investmentInfo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SipInvestmentInformation getInvestmentInfo() {
    return investmentInfo;
  }


  public void setInvestmentInfo(SipInvestmentInformation investmentInfo) {
    this.investmentInfo = investmentInfo;
  }


  public Sip holder(Holder holder) {
    
    this.holder = holder;
    return this;
  }

   /**
   * Get holder
   * @return holder
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Holder getHolder() {
    return holder;
  }


  public void setHolder(Holder holder) {
    this.holder = holder;
  }


  public Sip transactions(Boolean transactions) {
    
    this.transactions = transactions;
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getTransactions() {
    return transactions;
  }


  public void setTransactions(Boolean transactions) {
    this.transactions = transactions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sip sip = (Sip) o;
    return Objects.equals(this.id, sip.id) &&
        Objects.equals(this.name, sip.name) &&
        Objects.equals(this.investmentValue, sip.investmentValue) &&
        Objects.equals(this.currentValue, sip.currentValue) &&
        Objects.equals(this.currencyCode, sip.currencyCode) &&
        Objects.equals(this.planInfo, sip.planInfo) &&
        Objects.equals(this.investmentInfo, sip.investmentInfo) &&
        Objects.equals(this.holder, sip.holder) &&
        Objects.equals(this.transactions, sip.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, investmentValue, currentValue, currencyCode, planInfo, investmentInfo, holder, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sip {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    investmentValue: ").append(toIndentedString(investmentValue)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    planInfo: ").append(toIndentedString(planInfo)).append("\n");
    sb.append("    investmentInfo: ").append(toIndentedString(investmentInfo)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("investment_value");
    openapiFields.add("current_value");
    openapiFields.add("currency_code");
    openapiFields.add("plan_info");
    openapiFields.add("investment_info");
    openapiFields.add("holder");
    openapiFields.add("transactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("investment_value");
    openapiRequiredFields.add("current_value");
    openapiRequiredFields.add("currency_code");
    openapiRequiredFields.add("plan_info");
    openapiRequiredFields.add("investment_info");
    openapiRequiredFields.add("holder");
    openapiRequiredFields.add("transactions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Sip
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Sip.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Sip is not found in the empty JSON string", Sip.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Sip.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Sip` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Sip.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonNull()) && !jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      // validate the optional field `plan_info`
      if (jsonObj.get("plan_info") != null && !jsonObj.get("plan_info").isJsonNull()) {
        SipPlanInformation.validateJsonObject(jsonObj.getAsJsonObject("plan_info"));
      }
      // validate the optional field `investment_info`
      if (jsonObj.get("investment_info") != null && !jsonObj.get("investment_info").isJsonNull()) {
        SipInvestmentInformation.validateJsonObject(jsonObj.getAsJsonObject("investment_info"));
      }
      // validate the optional field `holder`
      if (jsonObj.get("holder") != null && !jsonObj.get("holder").isJsonNull()) {
        Holder.validateJsonObject(jsonObj.getAsJsonObject("holder"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Sip.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Sip' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Sip> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Sip.class));

       return (TypeAdapter<T>) new TypeAdapter<Sip>() {
           @Override
           public void write(JsonWriter out, Sip value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Sip read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Sip given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Sip
  * @throws IOException if the JSON string is invalid with respect to Sip
  */
  public static Sip fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Sip.class);
  }

 /**
  * Convert an instance of Sip to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

