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
import com.mydatamyconsent.model.ConsentedFinancialAccount;
import com.mydatamyconsent.model.ConsentedFinancialAccountFieldTransactionPeriod;
import com.mydatamyconsent.model.FinancialAccountDetailsRequired;
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
 * ConsentedFinancialAccountField : Consented financial account field details.
 */
@ApiModel(description = "ConsentedFinancialAccountField : Consented financial account field details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-02T10:35:04.848219626Z[Etc/UTC]")
public class ConsentedFinancialAccountField {
  public static final String SERIALIZED_NAME_FIELD_TITLE = "fieldTitle";
  @SerializedName(SERIALIZED_NAME_FIELD_TITLE)
  private String fieldTitle;

  public static final String SERIALIZED_NAME_FIELD_SLUG = "fieldSlug";
  @SerializedName(SERIALIZED_NAME_FIELD_SLUG)
  private String fieldSlug;

  public static final String SERIALIZED_NAME_REQUESTED_DETAILS = "requestedDetails";
  @SerializedName(SERIALIZED_NAME_REQUESTED_DETAILS)
  private List<FinancialAccountDetailsRequired> requestedDetails = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRANSACTION_PERIOD = "transactionPeriod";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_PERIOD)
  private ConsentedFinancialAccountFieldTransactionPeriod transactionPeriod;

  public static final String SERIALIZED_NAME_CONSENTED_ACCOUNTS = "consentedAccounts";
  @SerializedName(SERIALIZED_NAME_CONSENTED_ACCOUNTS)
  private List<ConsentedFinancialAccount> consentedAccounts = new ArrayList<>();

  public ConsentedFinancialAccountField() {
  }

  public ConsentedFinancialAccountField fieldTitle(String fieldTitle) {
    
    this.fieldTitle = fieldTitle;
    return this;
  }

   /**
   * Financial account field title.
   * @return fieldTitle
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Financial account field title.")

  public String getFieldTitle() {
    return fieldTitle;
  }


  public void setFieldTitle(String fieldTitle) {
    this.fieldTitle = fieldTitle;
  }


  public ConsentedFinancialAccountField fieldSlug(String fieldSlug) {
    
    this.fieldSlug = fieldSlug;
    return this;
  }

   /**
   * Financial account field slug.
   * @return fieldSlug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Financial account field slug.")

  public String getFieldSlug() {
    return fieldSlug;
  }


  public void setFieldSlug(String fieldSlug) {
    this.fieldSlug = fieldSlug;
  }


  public ConsentedFinancialAccountField requestedDetails(List<FinancialAccountDetailsRequired> requestedDetails) {
    
    this.requestedDetails = requestedDetails;
    return this;
  }

  public ConsentedFinancialAccountField addRequestedDetailsItem(FinancialAccountDetailsRequired requestedDetailsItem) {
    this.requestedDetails.add(requestedDetailsItem);
    return this;
  }

   /**
   * Requested financial account details.
   * @return requestedDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Requested financial account details.")

  public List<FinancialAccountDetailsRequired> getRequestedDetails() {
    return requestedDetails;
  }


  public void setRequestedDetails(List<FinancialAccountDetailsRequired> requestedDetails) {
    this.requestedDetails = requestedDetails;
  }


  public ConsentedFinancialAccountField transactionPeriod(ConsentedFinancialAccountFieldTransactionPeriod transactionPeriod) {
    
    this.transactionPeriod = transactionPeriod;
    return this;
  }

   /**
   * Get transactionPeriod
   * @return transactionPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsentedFinancialAccountFieldTransactionPeriod getTransactionPeriod() {
    return transactionPeriod;
  }


  public void setTransactionPeriod(ConsentedFinancialAccountFieldTransactionPeriod transactionPeriod) {
    this.transactionPeriod = transactionPeriod;
  }


  public ConsentedFinancialAccountField consentedAccounts(List<ConsentedFinancialAccount> consentedAccounts) {
    
    this.consentedAccounts = consentedAccounts;
    return this;
  }

  public ConsentedFinancialAccountField addConsentedAccountsItem(ConsentedFinancialAccount consentedAccountsItem) {
    this.consentedAccounts.add(consentedAccountsItem);
    return this;
  }

   /**
   * Consented financial accounts.
   * @return consentedAccounts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consented financial accounts.")

  public List<ConsentedFinancialAccount> getConsentedAccounts() {
    return consentedAccounts;
  }


  public void setConsentedAccounts(List<ConsentedFinancialAccount> consentedAccounts) {
    this.consentedAccounts = consentedAccounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentedFinancialAccountField consentedFinancialAccountField = (ConsentedFinancialAccountField) o;
    return Objects.equals(this.fieldTitle, consentedFinancialAccountField.fieldTitle) &&
        Objects.equals(this.fieldSlug, consentedFinancialAccountField.fieldSlug) &&
        Objects.equals(this.requestedDetails, consentedFinancialAccountField.requestedDetails) &&
        Objects.equals(this.transactionPeriod, consentedFinancialAccountField.transactionPeriod) &&
        Objects.equals(this.consentedAccounts, consentedFinancialAccountField.consentedAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldTitle, fieldSlug, requestedDetails, transactionPeriod, consentedAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentedFinancialAccountField {\n");
    sb.append("    fieldTitle: ").append(toIndentedString(fieldTitle)).append("\n");
    sb.append("    fieldSlug: ").append(toIndentedString(fieldSlug)).append("\n");
    sb.append("    requestedDetails: ").append(toIndentedString(requestedDetails)).append("\n");
    sb.append("    transactionPeriod: ").append(toIndentedString(transactionPeriod)).append("\n");
    sb.append("    consentedAccounts: ").append(toIndentedString(consentedAccounts)).append("\n");
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
    openapiFields.add("fieldTitle");
    openapiFields.add("fieldSlug");
    openapiFields.add("requestedDetails");
    openapiFields.add("transactionPeriod");
    openapiFields.add("consentedAccounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fieldTitle");
    openapiRequiredFields.add("fieldSlug");
    openapiRequiredFields.add("requestedDetails");
    openapiRequiredFields.add("consentedAccounts");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConsentedFinancialAccountField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConsentedFinancialAccountField.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsentedFinancialAccountField is not found in the empty JSON string", ConsentedFinancialAccountField.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConsentedFinancialAccountField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsentedFinancialAccountField` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConsentedFinancialAccountField.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("fieldTitle") != null && !jsonObj.get("fieldTitle").isJsonNull()) && !jsonObj.get("fieldTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldTitle").toString()));
      }
      if ((jsonObj.get("fieldSlug") != null && !jsonObj.get("fieldSlug").isJsonNull()) && !jsonObj.get("fieldSlug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldSlug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldSlug").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("requestedDetails") != null && !jsonObj.get("requestedDetails").isJsonNull()) && !jsonObj.get("requestedDetails").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestedDetails` to be an array in the JSON string but got `%s`", jsonObj.get("requestedDetails").toString()));
      }
      // validate the optional field `transactionPeriod`
      if (jsonObj.get("transactionPeriod") != null && !jsonObj.get("transactionPeriod").isJsonNull()) {
        ConsentedFinancialAccountFieldTransactionPeriod.validateJsonObject(jsonObj.getAsJsonObject("transactionPeriod"));
      }
      if (jsonObj.get("consentedAccounts") != null && !jsonObj.get("consentedAccounts").isJsonNull()) {
        JsonArray jsonArrayconsentedAccounts = jsonObj.getAsJsonArray("consentedAccounts");
        if (jsonArrayconsentedAccounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("consentedAccounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `consentedAccounts` to be an array in the JSON string but got `%s`", jsonObj.get("consentedAccounts").toString()));
          }

          // validate the optional field `consentedAccounts` (array)
          for (int i = 0; i < jsonArrayconsentedAccounts.size(); i++) {
            ConsentedFinancialAccount.validateJsonObject(jsonArrayconsentedAccounts.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsentedFinancialAccountField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsentedFinancialAccountField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsentedFinancialAccountField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsentedFinancialAccountField.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsentedFinancialAccountField>() {
           @Override
           public void write(JsonWriter out, ConsentedFinancialAccountField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsentedFinancialAccountField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConsentedFinancialAccountField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConsentedFinancialAccountField
  * @throws IOException if the JSON string is invalid with respect to ConsentedFinancialAccountField
  */
  public static ConsentedFinancialAccountField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsentedFinancialAccountField.class);
  }

 /**
  * Convert an instance of ConsentedFinancialAccountField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

