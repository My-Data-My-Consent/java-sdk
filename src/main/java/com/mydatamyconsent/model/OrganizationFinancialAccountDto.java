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
import com.mydatamyconsent.model.BankAccountType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
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
 * OrganizationFinancialAccountDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T10:36:32.567147376Z[Etc/UTC]")
public class OrganizationFinancialAccountDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private UUID organizationId;

  public static final String SERIALIZED_NAME_ORGANIZATION_NAME = "organizationName";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_NAME)
  private String organizationName;

  public static final String SERIALIZED_NAME_BENEFICIARY_NAME = "beneficiaryName";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_NAME)
  private String beneficiaryName;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routingNumber";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_IS_PRIMARY = "isPrimary";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY)
  private Boolean isPrimary;

  public static final String SERIALIZED_NAME_IS_VERIFIED = "isVerified";
  @SerializedName(SERIALIZED_NAME_IS_VERIFIED)
  private Boolean isVerified;

  public static final String SERIALIZED_NAME_LOGO_URL = "logoUrl";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_BANK_NAME = "bankName";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT_TYPE = "bankAccountType";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_TYPE)
  private BankAccountType bankAccountType;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT_PROOF_URL = "bankAccountProofUrl";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_PROOF_URL)
  private String bankAccountProofUrl;

  public OrganizationFinancialAccountDto() { 
  }

  public OrganizationFinancialAccountDto id(UUID id) {
    
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


  public OrganizationFinancialAccountDto organizationId(UUID organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(UUID organizationId) {
    this.organizationId = organizationId;
  }


  public OrganizationFinancialAccountDto organizationName(String organizationName) {
    
    this.organizationName = organizationName;
    return this;
  }

   /**
   * Get organizationName
   * @return organizationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrganizationName() {
    return organizationName;
  }


  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }


  public OrganizationFinancialAccountDto beneficiaryName(String beneficiaryName) {
    
    this.beneficiaryName = beneficiaryName;
    return this;
  }

   /**
   * Get beneficiaryName
   * @return beneficiaryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBeneficiaryName() {
    return beneficiaryName;
  }


  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }


  public OrganizationFinancialAccountDto accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public OrganizationFinancialAccountDto routingNumber(String routingNumber) {
    
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRoutingNumber() {
    return routingNumber;
  }


  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }


  public OrganizationFinancialAccountDto isPrimary(Boolean isPrimary) {
    
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Get isPrimary
   * @return isPrimary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsPrimary() {
    return isPrimary;
  }


  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }


  public OrganizationFinancialAccountDto isVerified(Boolean isVerified) {
    
    this.isVerified = isVerified;
    return this;
  }

   /**
   * Get isVerified
   * @return isVerified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsVerified() {
    return isVerified;
  }


  public void setIsVerified(Boolean isVerified) {
    this.isVerified = isVerified;
  }


  public OrganizationFinancialAccountDto logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public OrganizationFinancialAccountDto bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public OrganizationFinancialAccountDto bankAccountType(BankAccountType bankAccountType) {
    
    this.bankAccountType = bankAccountType;
    return this;
  }

   /**
   * Get bankAccountType
   * @return bankAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BankAccountType getBankAccountType() {
    return bankAccountType;
  }


  public void setBankAccountType(BankAccountType bankAccountType) {
    this.bankAccountType = bankAccountType;
  }


  public OrganizationFinancialAccountDto bankAccountProofUrl(String bankAccountProofUrl) {
    
    this.bankAccountProofUrl = bankAccountProofUrl;
    return this;
  }

   /**
   * Get bankAccountProofUrl
   * @return bankAccountProofUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBankAccountProofUrl() {
    return bankAccountProofUrl;
  }


  public void setBankAccountProofUrl(String bankAccountProofUrl) {
    this.bankAccountProofUrl = bankAccountProofUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationFinancialAccountDto organizationFinancialAccountDto = (OrganizationFinancialAccountDto) o;
    return Objects.equals(this.id, organizationFinancialAccountDto.id) &&
        Objects.equals(this.organizationId, organizationFinancialAccountDto.organizationId) &&
        Objects.equals(this.organizationName, organizationFinancialAccountDto.organizationName) &&
        Objects.equals(this.beneficiaryName, organizationFinancialAccountDto.beneficiaryName) &&
        Objects.equals(this.accountNumber, organizationFinancialAccountDto.accountNumber) &&
        Objects.equals(this.routingNumber, organizationFinancialAccountDto.routingNumber) &&
        Objects.equals(this.isPrimary, organizationFinancialAccountDto.isPrimary) &&
        Objects.equals(this.isVerified, organizationFinancialAccountDto.isVerified) &&
        Objects.equals(this.logoUrl, organizationFinancialAccountDto.logoUrl) &&
        Objects.equals(this.bankName, organizationFinancialAccountDto.bankName) &&
        Objects.equals(this.bankAccountType, organizationFinancialAccountDto.bankAccountType) &&
        Objects.equals(this.bankAccountProofUrl, organizationFinancialAccountDto.bankAccountProofUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, organizationName, beneficiaryName, accountNumber, routingNumber, isPrimary, isVerified, logoUrl, bankName, bankAccountType, bankAccountProofUrl);
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
    sb.append("class OrganizationFinancialAccountDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankAccountType: ").append(toIndentedString(bankAccountType)).append("\n");
    sb.append("    bankAccountProofUrl: ").append(toIndentedString(bankAccountProofUrl)).append("\n");
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
    openapiFields.add("organizationId");
    openapiFields.add("organizationName");
    openapiFields.add("beneficiaryName");
    openapiFields.add("accountNumber");
    openapiFields.add("routingNumber");
    openapiFields.add("isPrimary");
    openapiFields.add("isVerified");
    openapiFields.add("logoUrl");
    openapiFields.add("bankName");
    openapiFields.add("bankAccountType");
    openapiFields.add("bankAccountProofUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrganizationFinancialAccountDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrganizationFinancialAccountDto.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrganizationFinancialAccountDto is not found in the empty JSON string", OrganizationFinancialAccountDto.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrganizationFinancialAccountDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrganizationFinancialAccountDto` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("organizationId") != null && !jsonObj.get("organizationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organizationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organizationId").toString()));
      }
      if (jsonObj.get("organizationName") != null && !jsonObj.get("organizationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organizationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organizationName").toString()));
      }
      if (jsonObj.get("beneficiaryName") != null && !jsonObj.get("beneficiaryName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiaryName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiaryName").toString()));
      }
      if (jsonObj.get("accountNumber") != null && !jsonObj.get("accountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumber").toString()));
      }
      if (jsonObj.get("routingNumber") != null && !jsonObj.get("routingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `routingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("routingNumber").toString()));
      }
      if (jsonObj.get("logoUrl") != null && !jsonObj.get("logoUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoUrl").toString()));
      }
      if (jsonObj.get("bankName") != null && !jsonObj.get("bankName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bankName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankName").toString()));
      }
      if (jsonObj.get("bankAccountProofUrl") != null && !jsonObj.get("bankAccountProofUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bankAccountProofUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankAccountProofUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrganizationFinancialAccountDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrganizationFinancialAccountDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrganizationFinancialAccountDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrganizationFinancialAccountDto.class));

       return (TypeAdapter<T>) new TypeAdapter<OrganizationFinancialAccountDto>() {
           @Override
           public void write(JsonWriter out, OrganizationFinancialAccountDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrganizationFinancialAccountDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrganizationFinancialAccountDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrganizationFinancialAccountDto
  * @throws IOException if the JSON string is invalid with respect to OrganizationFinancialAccountDto
  */
  public static OrganizationFinancialAccountDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrganizationFinancialAccountDto.class);
  }

 /**
  * Convert an instance of OrganizationFinancialAccountDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

