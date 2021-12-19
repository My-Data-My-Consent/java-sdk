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
import com.mydatamyconsent.model.DataConsentRequestedDocumentDto;
import com.mydatamyconsent.model.DataConsentRequestedFaDto;
import com.mydatamyconsent.model.DataFetchFrequencyUnit;
import com.mydatamyconsent.model.DataFetchType;
import com.mydatamyconsent.model.DataLifeUnit;
import com.mydatamyconsent.model.IdentityClaim;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * DataConsentRequestModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T10:04:53.682265678Z[Etc/UTC]")
public class DataConsentRequestModel {
  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private UUID organizationId;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private Map<String, String> identifiers = null;

  public static final String SERIALIZED_NAME_START_DATE_TIME = "startDateTime";
  @SerializedName(SERIALIZED_NAME_START_DATE_TIME)
  private OffsetDateTime startDateTime;

  public static final String SERIALIZED_NAME_EXPIRY_DATE_TIME = "expiryDateTime";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE_TIME)
  private OffsetDateTime expiryDateTime;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PURPOSE_CODE = "purposeCode";
  @SerializedName(SERIALIZED_NAME_PURPOSE_CODE)
  private String purposeCode;

  public static final String SERIALIZED_NAME_PURPOSE_LINK = "purposeLink";
  @SerializedName(SERIALIZED_NAME_PURPOSE_LINK)
  private String purposeLink;

  public static final String SERIALIZED_NAME_DATA_LIFE_UNIT = "dataLifeUnit";
  @SerializedName(SERIALIZED_NAME_DATA_LIFE_UNIT)
  private DataLifeUnit dataLifeUnit;

  public static final String SERIALIZED_NAME_DATA_LIFE_VALUE = "dataLifeValue";
  @SerializedName(SERIALIZED_NAME_DATA_LIFE_VALUE)
  private Integer dataLifeValue;

  public static final String SERIALIZED_NAME_DATA_FETCH_FREQUENCY_UNIT = "dataFetchFrequencyUnit";
  @SerializedName(SERIALIZED_NAME_DATA_FETCH_FREQUENCY_UNIT)
  private DataFetchFrequencyUnit dataFetchFrequencyUnit;

  public static final String SERIALIZED_NAME_DATA_FETCH_FREQUENCY_UNIT_VALUE = "dataFetchFrequencyUnitValue";
  @SerializedName(SERIALIZED_NAME_DATA_FETCH_FREQUENCY_UNIT_VALUE)
  private Integer dataFetchFrequencyUnitValue;

  public static final String SERIALIZED_NAME_DATA_FETCH_TYPE = "dataFetchType";
  @SerializedName(SERIALIZED_NAME_DATA_FETCH_TYPE)
  private DataFetchType dataFetchType;

  public static final String SERIALIZED_NAME_AGREEMENT_ID = "agreementId";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_ID)
  private UUID agreementId;

  public static final String SERIALIZED_NAME_IDENTITY_CLAIMS = "identityClaims";
  @SerializedName(SERIALIZED_NAME_IDENTITY_CLAIMS)
  private List<IdentityClaim> identityClaims = null;

  public static final String SERIALIZED_NAME_FINANCIAL_ACCOUNTS = "financialAccounts";
  @SerializedName(SERIALIZED_NAME_FINANCIAL_ACCOUNTS)
  private List<DataConsentRequestedFaDto> financialAccounts = null;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<DataConsentRequestedDocumentDto> documents = null;


  public DataConsentRequestModel organizationId(UUID organizationId) {
    
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


  public DataConsentRequestModel transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public DataConsentRequestModel identifiers(Map<String, String> identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  public DataConsentRequestModel putIdentifiersItem(String key, String identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new HashMap<String, String>();
    }
    this.identifiers.put(key, identifiersItem);
    return this;
  }

   /**
   * Get identifiers
   * @return identifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(Map<String, String> identifiers) {
    this.identifiers = identifiers;
  }


  public DataConsentRequestModel startDateTime(OffsetDateTime startDateTime) {
    
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Get startDateTime
   * @return startDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }


  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }


  public DataConsentRequestModel expiryDateTime(OffsetDateTime expiryDateTime) {
    
    this.expiryDateTime = expiryDateTime;
    return this;
  }

   /**
   * Get expiryDateTime
   * @return expiryDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpiryDateTime() {
    return expiryDateTime;
  }


  public void setExpiryDateTime(OffsetDateTime expiryDateTime) {
    this.expiryDateTime = expiryDateTime;
  }


  public DataConsentRequestModel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DataConsentRequestModel purposeCode(String purposeCode) {
    
    this.purposeCode = purposeCode;
    return this;
  }

   /**
   * Get purposeCode
   * @return purposeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPurposeCode() {
    return purposeCode;
  }


  public void setPurposeCode(String purposeCode) {
    this.purposeCode = purposeCode;
  }


  public DataConsentRequestModel purposeLink(String purposeLink) {
    
    this.purposeLink = purposeLink;
    return this;
  }

   /**
   * Get purposeLink
   * @return purposeLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPurposeLink() {
    return purposeLink;
  }


  public void setPurposeLink(String purposeLink) {
    this.purposeLink = purposeLink;
  }


  public DataConsentRequestModel dataLifeUnit(DataLifeUnit dataLifeUnit) {
    
    this.dataLifeUnit = dataLifeUnit;
    return this;
  }

   /**
   * Get dataLifeUnit
   * @return dataLifeUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DataLifeUnit getDataLifeUnit() {
    return dataLifeUnit;
  }


  public void setDataLifeUnit(DataLifeUnit dataLifeUnit) {
    this.dataLifeUnit = dataLifeUnit;
  }


  public DataConsentRequestModel dataLifeValue(Integer dataLifeValue) {
    
    this.dataLifeValue = dataLifeValue;
    return this;
  }

   /**
   * Get dataLifeValue
   * @return dataLifeValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDataLifeValue() {
    return dataLifeValue;
  }


  public void setDataLifeValue(Integer dataLifeValue) {
    this.dataLifeValue = dataLifeValue;
  }


  public DataConsentRequestModel dataFetchFrequencyUnit(DataFetchFrequencyUnit dataFetchFrequencyUnit) {
    
    this.dataFetchFrequencyUnit = dataFetchFrequencyUnit;
    return this;
  }

   /**
   * Get dataFetchFrequencyUnit
   * @return dataFetchFrequencyUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DataFetchFrequencyUnit getDataFetchFrequencyUnit() {
    return dataFetchFrequencyUnit;
  }


  public void setDataFetchFrequencyUnit(DataFetchFrequencyUnit dataFetchFrequencyUnit) {
    this.dataFetchFrequencyUnit = dataFetchFrequencyUnit;
  }


  public DataConsentRequestModel dataFetchFrequencyUnitValue(Integer dataFetchFrequencyUnitValue) {
    
    this.dataFetchFrequencyUnitValue = dataFetchFrequencyUnitValue;
    return this;
  }

   /**
   * Get dataFetchFrequencyUnitValue
   * @return dataFetchFrequencyUnitValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDataFetchFrequencyUnitValue() {
    return dataFetchFrequencyUnitValue;
  }


  public void setDataFetchFrequencyUnitValue(Integer dataFetchFrequencyUnitValue) {
    this.dataFetchFrequencyUnitValue = dataFetchFrequencyUnitValue;
  }


  public DataConsentRequestModel dataFetchType(DataFetchType dataFetchType) {
    
    this.dataFetchType = dataFetchType;
    return this;
  }

   /**
   * Get dataFetchType
   * @return dataFetchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DataFetchType getDataFetchType() {
    return dataFetchType;
  }


  public void setDataFetchType(DataFetchType dataFetchType) {
    this.dataFetchType = dataFetchType;
  }


  public DataConsentRequestModel agreementId(UUID agreementId) {
    
    this.agreementId = agreementId;
    return this;
  }

   /**
   * Get agreementId
   * @return agreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getAgreementId() {
    return agreementId;
  }


  public void setAgreementId(UUID agreementId) {
    this.agreementId = agreementId;
  }


  public DataConsentRequestModel identityClaims(List<IdentityClaim> identityClaims) {
    
    this.identityClaims = identityClaims;
    return this;
  }

  public DataConsentRequestModel addIdentityClaimsItem(IdentityClaim identityClaimsItem) {
    if (this.identityClaims == null) {
      this.identityClaims = new ArrayList<IdentityClaim>();
    }
    this.identityClaims.add(identityClaimsItem);
    return this;
  }

   /**
   * Get identityClaims
   * @return identityClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IdentityClaim> getIdentityClaims() {
    return identityClaims;
  }


  public void setIdentityClaims(List<IdentityClaim> identityClaims) {
    this.identityClaims = identityClaims;
  }


  public DataConsentRequestModel financialAccounts(List<DataConsentRequestedFaDto> financialAccounts) {
    
    this.financialAccounts = financialAccounts;
    return this;
  }

  public DataConsentRequestModel addFinancialAccountsItem(DataConsentRequestedFaDto financialAccountsItem) {
    if (this.financialAccounts == null) {
      this.financialAccounts = new ArrayList<DataConsentRequestedFaDto>();
    }
    this.financialAccounts.add(financialAccountsItem);
    return this;
  }

   /**
   * Get financialAccounts
   * @return financialAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DataConsentRequestedFaDto> getFinancialAccounts() {
    return financialAccounts;
  }


  public void setFinancialAccounts(List<DataConsentRequestedFaDto> financialAccounts) {
    this.financialAccounts = financialAccounts;
  }


  public DataConsentRequestModel documents(List<DataConsentRequestedDocumentDto> documents) {
    
    this.documents = documents;
    return this;
  }

  public DataConsentRequestModel addDocumentsItem(DataConsentRequestedDocumentDto documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<DataConsentRequestedDocumentDto>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Get documents
   * @return documents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DataConsentRequestedDocumentDto> getDocuments() {
    return documents;
  }


  public void setDocuments(List<DataConsentRequestedDocumentDto> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataConsentRequestModel dataConsentRequestModel = (DataConsentRequestModel) o;
    return Objects.equals(this.organizationId, dataConsentRequestModel.organizationId) &&
        Objects.equals(this.transactionId, dataConsentRequestModel.transactionId) &&
        Objects.equals(this.identifiers, dataConsentRequestModel.identifiers) &&
        Objects.equals(this.startDateTime, dataConsentRequestModel.startDateTime) &&
        Objects.equals(this.expiryDateTime, dataConsentRequestModel.expiryDateTime) &&
        Objects.equals(this.description, dataConsentRequestModel.description) &&
        Objects.equals(this.purposeCode, dataConsentRequestModel.purposeCode) &&
        Objects.equals(this.purposeLink, dataConsentRequestModel.purposeLink) &&
        Objects.equals(this.dataLifeUnit, dataConsentRequestModel.dataLifeUnit) &&
        Objects.equals(this.dataLifeValue, dataConsentRequestModel.dataLifeValue) &&
        Objects.equals(this.dataFetchFrequencyUnit, dataConsentRequestModel.dataFetchFrequencyUnit) &&
        Objects.equals(this.dataFetchFrequencyUnitValue, dataConsentRequestModel.dataFetchFrequencyUnitValue) &&
        Objects.equals(this.dataFetchType, dataConsentRequestModel.dataFetchType) &&
        Objects.equals(this.agreementId, dataConsentRequestModel.agreementId) &&
        Objects.equals(this.identityClaims, dataConsentRequestModel.identityClaims) &&
        Objects.equals(this.financialAccounts, dataConsentRequestModel.financialAccounts) &&
        Objects.equals(this.documents, dataConsentRequestModel.documents);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, transactionId, identifiers, startDateTime, expiryDateTime, description, purposeCode, purposeLink, dataLifeUnit, dataLifeValue, dataFetchFrequencyUnit, dataFetchFrequencyUnitValue, dataFetchType, agreementId, identityClaims, financialAccounts, documents);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent()
      ? (a.get().getClass().isArray() ? Arrays.hashCode((T[])a.get()) : Objects.hashCode(a.get()))
      : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataConsentRequestModel {\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    expiryDateTime: ").append(toIndentedString(expiryDateTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    purposeCode: ").append(toIndentedString(purposeCode)).append("\n");
    sb.append("    purposeLink: ").append(toIndentedString(purposeLink)).append("\n");
    sb.append("    dataLifeUnit: ").append(toIndentedString(dataLifeUnit)).append("\n");
    sb.append("    dataLifeValue: ").append(toIndentedString(dataLifeValue)).append("\n");
    sb.append("    dataFetchFrequencyUnit: ").append(toIndentedString(dataFetchFrequencyUnit)).append("\n");
    sb.append("    dataFetchFrequencyUnitValue: ").append(toIndentedString(dataFetchFrequencyUnitValue)).append("\n");
    sb.append("    dataFetchType: ").append(toIndentedString(dataFetchType)).append("\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    identityClaims: ").append(toIndentedString(identityClaims)).append("\n");
    sb.append("    financialAccounts: ").append(toIndentedString(financialAccounts)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

