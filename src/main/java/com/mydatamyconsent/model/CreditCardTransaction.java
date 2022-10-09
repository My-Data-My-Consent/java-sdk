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
import com.mydatamyconsent.model.CreditCardTransactionType;
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
 * CreditCardTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-09T10:38:33.868597316Z[Etc/UTC]")
public class CreditCardTransaction {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TXN_TYPE = "txn_type";
  @SerializedName(SERIALIZED_NAME_TXN_TYPE)
  private CreditCardTransactionType txnType;

  public static final String SERIALIZED_NAME_TXN_DATE = "txn_date";
  @SerializedName(SERIALIZED_NAME_TXN_DATE)
  private OffsetDateTime txnDate;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_VALUE_DATE = "value_date";
  @SerializedName(SERIALIZED_NAME_VALUE_DATE)
  private OffsetDateTime valueDate;

  public static final String SERIALIZED_NAME_NARRATION = "narration";
  @SerializedName(SERIALIZED_NAME_NARRATION)
  private String narration;

  public static final String SERIALIZED_NAME_STATEMENT_DATE = "statement_date";
  @SerializedName(SERIALIZED_NAME_STATEMENT_DATE)
  private OffsetDateTime statementDate;

  public static final String SERIALIZED_NAME_MCC = "mcc";
  @SerializedName(SERIALIZED_NAME_MCC)
  private String mcc;

  public static final String SERIALIZED_NAME_MASKED_CARD_NUMBER = "masked_card_number";
  @SerializedName(SERIALIZED_NAME_MASKED_CARD_NUMBER)
  private String maskedCardNumber;

  public CreditCardTransaction() {
  }

  public CreditCardTransaction id(String id) {
    
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


  public CreditCardTransaction txnType(CreditCardTransactionType txnType) {
    
    this.txnType = txnType;
    return this;
  }

   /**
   * Get txnType
   * @return txnType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CreditCardTransactionType getTxnType() {
    return txnType;
  }


  public void setTxnType(CreditCardTransactionType txnType) {
    this.txnType = txnType;
  }


  public CreditCardTransaction txnDate(OffsetDateTime txnDate) {
    
    this.txnDate = txnDate;
    return this;
  }

   /**
   * Get txnDate
   * @return txnDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getTxnDate() {
    return txnDate;
  }


  public void setTxnDate(OffsetDateTime txnDate) {
    this.txnDate = txnDate;
  }


  public CreditCardTransaction amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public CreditCardTransaction valueDate(OffsetDateTime valueDate) {
    
    this.valueDate = valueDate;
    return this;
  }

   /**
   * Get valueDate
   * @return valueDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getValueDate() {
    return valueDate;
  }


  public void setValueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
  }


  public CreditCardTransaction narration(String narration) {
    
    this.narration = narration;
    return this;
  }

   /**
   * Get narration
   * @return narration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNarration() {
    return narration;
  }


  public void setNarration(String narration) {
    this.narration = narration;
  }


  public CreditCardTransaction statementDate(OffsetDateTime statementDate) {
    
    this.statementDate = statementDate;
    return this;
  }

   /**
   * Get statementDate
   * @return statementDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getStatementDate() {
    return statementDate;
  }


  public void setStatementDate(OffsetDateTime statementDate) {
    this.statementDate = statementDate;
  }


  public CreditCardTransaction mcc(String mcc) {
    
    this.mcc = mcc;
    return this;
  }

   /**
   * Get mcc
   * @return mcc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMcc() {
    return mcc;
  }


  public void setMcc(String mcc) {
    this.mcc = mcc;
  }


  public CreditCardTransaction maskedCardNumber(String maskedCardNumber) {
    
    this.maskedCardNumber = maskedCardNumber;
    return this;
  }

   /**
   * Get maskedCardNumber
   * @return maskedCardNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMaskedCardNumber() {
    return maskedCardNumber;
  }


  public void setMaskedCardNumber(String maskedCardNumber) {
    this.maskedCardNumber = maskedCardNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardTransaction creditCardTransaction = (CreditCardTransaction) o;
    return Objects.equals(this.id, creditCardTransaction.id) &&
        Objects.equals(this.txnType, creditCardTransaction.txnType) &&
        Objects.equals(this.txnDate, creditCardTransaction.txnDate) &&
        Objects.equals(this.amount, creditCardTransaction.amount) &&
        Objects.equals(this.valueDate, creditCardTransaction.valueDate) &&
        Objects.equals(this.narration, creditCardTransaction.narration) &&
        Objects.equals(this.statementDate, creditCardTransaction.statementDate) &&
        Objects.equals(this.mcc, creditCardTransaction.mcc) &&
        Objects.equals(this.maskedCardNumber, creditCardTransaction.maskedCardNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, txnType, txnDate, amount, valueDate, narration, statementDate, mcc, maskedCardNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardTransaction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    txnType: ").append(toIndentedString(txnType)).append("\n");
    sb.append("    txnDate: ").append(toIndentedString(txnDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    narration: ").append(toIndentedString(narration)).append("\n");
    sb.append("    statementDate: ").append(toIndentedString(statementDate)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    maskedCardNumber: ").append(toIndentedString(maskedCardNumber)).append("\n");
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
    openapiFields.add("txn_type");
    openapiFields.add("txn_date");
    openapiFields.add("amount");
    openapiFields.add("value_date");
    openapiFields.add("narration");
    openapiFields.add("statement_date");
    openapiFields.add("mcc");
    openapiFields.add("masked_card_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("txn_type");
    openapiRequiredFields.add("txn_date");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("value_date");
    openapiRequiredFields.add("narration");
    openapiRequiredFields.add("statement_date");
    openapiRequiredFields.add("mcc");
    openapiRequiredFields.add("masked_card_number");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreditCardTransaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreditCardTransaction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreditCardTransaction is not found in the empty JSON string", CreditCardTransaction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreditCardTransaction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreditCardTransaction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreditCardTransaction.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("narration") != null && !jsonObj.get("narration").isJsonNull()) && !jsonObj.get("narration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `narration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("narration").toString()));
      }
      if ((jsonObj.get("mcc") != null && !jsonObj.get("mcc").isJsonNull()) && !jsonObj.get("mcc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc").toString()));
      }
      if ((jsonObj.get("masked_card_number") != null && !jsonObj.get("masked_card_number").isJsonNull()) && !jsonObj.get("masked_card_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `masked_card_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("masked_card_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreditCardTransaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreditCardTransaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreditCardTransaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreditCardTransaction.class));

       return (TypeAdapter<T>) new TypeAdapter<CreditCardTransaction>() {
           @Override
           public void write(JsonWriter out, CreditCardTransaction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreditCardTransaction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreditCardTransaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreditCardTransaction
  * @throws IOException if the JSON string is invalid with respect to CreditCardTransaction
  */
  public static CreditCardTransaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreditCardTransaction.class);
  }

 /**
  * Convert an instance of CreditCardTransaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

