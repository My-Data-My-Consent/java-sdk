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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OrganizationFinancialTransactionsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-27T10:34:27.227980464Z[Etc/UTC]")
public class OrganizationFinancialTransactionsDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private UUID accountId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INSTRUMENT_ID = "instrumentId";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_ID)
  private UUID instrumentId;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private String transactionType;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_AVERAGE_PRICE = "averagePrice";
  @SerializedName(SERIALIZED_NAME_AVERAGE_PRICE)
  private Double averagePrice;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public OrganizationFinancialTransactionsDto() { 
  }

  public OrganizationFinancialTransactionsDto id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public OrganizationFinancialTransactionsDto accountId(UUID accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getAccountId() {
    return accountId;
  }


  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }


  public OrganizationFinancialTransactionsDto name(String name) {
    
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


  public OrganizationFinancialTransactionsDto instrumentId(UUID instrumentId) {
    
    this.instrumentId = instrumentId;
    return this;
  }

   /**
   * Get instrumentId
   * @return instrumentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getInstrumentId() {
    return instrumentId;
  }


  public void setInstrumentId(UUID instrumentId) {
    this.instrumentId = instrumentId;
  }


  public OrganizationFinancialTransactionsDto transactionType(String transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  public OrganizationFinancialTransactionsDto quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public OrganizationFinancialTransactionsDto averagePrice(Double averagePrice) {
    
    this.averagePrice = averagePrice;
    return this;
  }

   /**
   * Get averagePrice
   * @return averagePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getAveragePrice() {
    return averagePrice;
  }


  public void setAveragePrice(Double averagePrice) {
    this.averagePrice = averagePrice;
  }


  public OrganizationFinancialTransactionsDto currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationFinancialTransactionsDto organizationFinancialTransactionsDto = (OrganizationFinancialTransactionsDto) o;
    return Objects.equals(this.id, organizationFinancialTransactionsDto.id) &&
        Objects.equals(this.accountId, organizationFinancialTransactionsDto.accountId) &&
        Objects.equals(this.name, organizationFinancialTransactionsDto.name) &&
        Objects.equals(this.instrumentId, organizationFinancialTransactionsDto.instrumentId) &&
        Objects.equals(this.transactionType, organizationFinancialTransactionsDto.transactionType) &&
        Objects.equals(this.quantity, organizationFinancialTransactionsDto.quantity) &&
        Objects.equals(this.averagePrice, organizationFinancialTransactionsDto.averagePrice) &&
        Objects.equals(this.currency, organizationFinancialTransactionsDto.currency);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, name, instrumentId, transactionType, quantity, averagePrice, currency);
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
    sb.append("class OrganizationFinancialTransactionsDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    instrumentId: ").append(toIndentedString(instrumentId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    averagePrice: ").append(toIndentedString(averagePrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

