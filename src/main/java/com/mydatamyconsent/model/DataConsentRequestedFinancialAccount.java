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
 * DataConsentRequestedFinancialAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-27T10:37:04.552457587Z[Etc/UTC]")
public class DataConsentRequestedFinancialAccount {
  public static final String SERIALIZED_NAME_CUSTOM_KEY = "custom_key";
  @SerializedName(SERIALIZED_NAME_CUSTOM_KEY)
  private String customKey;

  public static final String SERIALIZED_NAME_DRN = "drn";
  @SerializedName(SERIALIZED_NAME_DRN)
  private String drn;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE_ID = "accountTypeId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE_ID)
  private UUID accountTypeId;

  public static final String SERIALIZED_NAME_ACCOUNT_IDENTIFIER = "accountIdentifier";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDENTIFIER)
  private UUID accountIdentifier;

  public DataConsentRequestedFinancialAccount() { 
  }

  public DataConsentRequestedFinancialAccount customKey(String customKey) {
    
    this.customKey = customKey;
    return this;
  }

   /**
   * Get customKey
   * @return customKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomKey() {
    return customKey;
  }


  public void setCustomKey(String customKey) {
    this.customKey = customKey;
  }


  public DataConsentRequestedFinancialAccount drn(String drn) {
    
    this.drn = drn;
    return this;
  }

   /**
   * Get drn
   * @return drn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDrn() {
    return drn;
  }


  public void setDrn(String drn) {
    this.drn = drn;
  }


  public DataConsentRequestedFinancialAccount accountTypeId(UUID accountTypeId) {
    
    this.accountTypeId = accountTypeId;
    return this;
  }

   /**
   * Get accountTypeId
   * @return accountTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getAccountTypeId() {
    return accountTypeId;
  }


  public void setAccountTypeId(UUID accountTypeId) {
    this.accountTypeId = accountTypeId;
  }


  public DataConsentRequestedFinancialAccount accountIdentifier(UUID accountIdentifier) {
    
    this.accountIdentifier = accountIdentifier;
    return this;
  }

   /**
   * Get accountIdentifier
   * @return accountIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getAccountIdentifier() {
    return accountIdentifier;
  }


  public void setAccountIdentifier(UUID accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataConsentRequestedFinancialAccount dataConsentRequestedFinancialAccount = (DataConsentRequestedFinancialAccount) o;
    return Objects.equals(this.customKey, dataConsentRequestedFinancialAccount.customKey) &&
        Objects.equals(this.drn, dataConsentRequestedFinancialAccount.drn) &&
        Objects.equals(this.accountTypeId, dataConsentRequestedFinancialAccount.accountTypeId) &&
        Objects.equals(this.accountIdentifier, dataConsentRequestedFinancialAccount.accountIdentifier);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customKey, drn, accountTypeId, accountIdentifier);
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
    sb.append("class DataConsentRequestedFinancialAccount {\n");
    sb.append("    customKey: ").append(toIndentedString(customKey)).append("\n");
    sb.append("    drn: ").append(toIndentedString(drn)).append("\n");
    sb.append("    accountTypeId: ").append(toIndentedString(accountTypeId)).append("\n");
    sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
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

