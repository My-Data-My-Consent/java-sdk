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
import com.mydatamyconsent.model.DataConsentIdentifier;
import com.mydatamyconsent.model.DataConsentRequestedDocument;
import com.mydatamyconsent.model.DataConsentRequestedFinancialAccount;
import com.mydatamyconsent.model.DataConsentRequesterDto;
import com.mydatamyconsent.model.DataConsentStatus;
import com.mydatamyconsent.model.GetConsentTemplateDetailsDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * DataConsentDetailsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-20T20:13:46.154803077Z[Etc/UTC]")
public class DataConsentDetailsDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DataConsentStatus status;

  public static final String SERIALIZED_NAME_APPROVED_AT_UTC = "approvedAtUtc";
  @SerializedName(SERIALIZED_NAME_APPROVED_AT_UTC)
  private OffsetDateTime approvedAtUtc;

  public static final String SERIALIZED_NAME_REJECTED_AT_UTC = "rejectedAtUtc";
  @SerializedName(SERIALIZED_NAME_REJECTED_AT_UTC)
  private OffsetDateTime rejectedAtUtc;

  public static final String SERIALIZED_NAME_EXPIRES_AT_UTC = "expiresAtUtc";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT_UTC)
  private OffsetDateTime expiresAtUtc;

  public static final String SERIALIZED_NAME_REQUESTED_AT_UTC = "requestedAtUtc";
  @SerializedName(SERIALIZED_NAME_REQUESTED_AT_UTC)
  private OffsetDateTime requestedAtUtc;

  public static final String SERIALIZED_NAME_REQUESTER = "requester";
  @SerializedName(SERIALIZED_NAME_REQUESTER)
  private DataConsentRequesterDto requester;

  public static final String SERIALIZED_NAME_CONSENT_DETAILS = "consentDetails";
  @SerializedName(SERIALIZED_NAME_CONSENT_DETAILS)
  private GetConsentTemplateDetailsDto consentDetails;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private List<DataConsentIdentifier> identifiers = null;

  public static final String SERIALIZED_NAME_APPROVED_DOCUMENTS = "approvedDocuments";
  @SerializedName(SERIALIZED_NAME_APPROVED_DOCUMENTS)
  private List<DataConsentRequestedDocument> approvedDocuments = null;

  public static final String SERIALIZED_NAME_APPROVED_FINANCIALS = "approvedFinancials";
  @SerializedName(SERIALIZED_NAME_APPROVED_FINANCIALS)
  private List<DataConsentRequestedFinancialAccount> approvedFinancials = null;

  public DataConsentDetailsDto() { 
  }

  public DataConsentDetailsDto id(UUID id) {
    
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


  public DataConsentDetailsDto status(DataConsentStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DataConsentStatus getStatus() {
    return status;
  }


  public void setStatus(DataConsentStatus status) {
    this.status = status;
  }


  public DataConsentDetailsDto approvedAtUtc(OffsetDateTime approvedAtUtc) {
    
    this.approvedAtUtc = approvedAtUtc;
    return this;
  }

   /**
   * Get approvedAtUtc
   * @return approvedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getApprovedAtUtc() {
    return approvedAtUtc;
  }


  public void setApprovedAtUtc(OffsetDateTime approvedAtUtc) {
    this.approvedAtUtc = approvedAtUtc;
  }


  public DataConsentDetailsDto rejectedAtUtc(OffsetDateTime rejectedAtUtc) {
    
    this.rejectedAtUtc = rejectedAtUtc;
    return this;
  }

   /**
   * Get rejectedAtUtc
   * @return rejectedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getRejectedAtUtc() {
    return rejectedAtUtc;
  }


  public void setRejectedAtUtc(OffsetDateTime rejectedAtUtc) {
    this.rejectedAtUtc = rejectedAtUtc;
  }


  public DataConsentDetailsDto expiresAtUtc(OffsetDateTime expiresAtUtc) {
    
    this.expiresAtUtc = expiresAtUtc;
    return this;
  }

   /**
   * Get expiresAtUtc
   * @return expiresAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpiresAtUtc() {
    return expiresAtUtc;
  }


  public void setExpiresAtUtc(OffsetDateTime expiresAtUtc) {
    this.expiresAtUtc = expiresAtUtc;
  }


  public DataConsentDetailsDto requestedAtUtc(OffsetDateTime requestedAtUtc) {
    
    this.requestedAtUtc = requestedAtUtc;
    return this;
  }

   /**
   * Get requestedAtUtc
   * @return requestedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getRequestedAtUtc() {
    return requestedAtUtc;
  }


  public void setRequestedAtUtc(OffsetDateTime requestedAtUtc) {
    this.requestedAtUtc = requestedAtUtc;
  }


  public DataConsentDetailsDto requester(DataConsentRequesterDto requester) {
    
    this.requester = requester;
    return this;
  }

   /**
   * Get requester
   * @return requester
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DataConsentRequesterDto getRequester() {
    return requester;
  }


  public void setRequester(DataConsentRequesterDto requester) {
    this.requester = requester;
  }


  public DataConsentDetailsDto consentDetails(GetConsentTemplateDetailsDto consentDetails) {
    
    this.consentDetails = consentDetails;
    return this;
  }

   /**
   * Get consentDetails
   * @return consentDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetConsentTemplateDetailsDto getConsentDetails() {
    return consentDetails;
  }


  public void setConsentDetails(GetConsentTemplateDetailsDto consentDetails) {
    this.consentDetails = consentDetails;
  }


  public DataConsentDetailsDto identifiers(List<DataConsentIdentifier> identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  public DataConsentDetailsDto addIdentifiersItem(DataConsentIdentifier identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<DataConsentIdentifier>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

   /**
   * Get identifiers
   * @return identifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DataConsentIdentifier> getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(List<DataConsentIdentifier> identifiers) {
    this.identifiers = identifiers;
  }


  public DataConsentDetailsDto approvedDocuments(List<DataConsentRequestedDocument> approvedDocuments) {
    
    this.approvedDocuments = approvedDocuments;
    return this;
  }

  public DataConsentDetailsDto addApprovedDocumentsItem(DataConsentRequestedDocument approvedDocumentsItem) {
    if (this.approvedDocuments == null) {
      this.approvedDocuments = new ArrayList<DataConsentRequestedDocument>();
    }
    this.approvedDocuments.add(approvedDocumentsItem);
    return this;
  }

   /**
   * Get approvedDocuments
   * @return approvedDocuments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DataConsentRequestedDocument> getApprovedDocuments() {
    return approvedDocuments;
  }


  public void setApprovedDocuments(List<DataConsentRequestedDocument> approvedDocuments) {
    this.approvedDocuments = approvedDocuments;
  }


  public DataConsentDetailsDto approvedFinancials(List<DataConsentRequestedFinancialAccount> approvedFinancials) {
    
    this.approvedFinancials = approvedFinancials;
    return this;
  }

  public DataConsentDetailsDto addApprovedFinancialsItem(DataConsentRequestedFinancialAccount approvedFinancialsItem) {
    if (this.approvedFinancials == null) {
      this.approvedFinancials = new ArrayList<DataConsentRequestedFinancialAccount>();
    }
    this.approvedFinancials.add(approvedFinancialsItem);
    return this;
  }

   /**
   * Get approvedFinancials
   * @return approvedFinancials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DataConsentRequestedFinancialAccount> getApprovedFinancials() {
    return approvedFinancials;
  }


  public void setApprovedFinancials(List<DataConsentRequestedFinancialAccount> approvedFinancials) {
    this.approvedFinancials = approvedFinancials;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataConsentDetailsDto dataConsentDetailsDto = (DataConsentDetailsDto) o;
    return Objects.equals(this.id, dataConsentDetailsDto.id) &&
        Objects.equals(this.status, dataConsentDetailsDto.status) &&
        Objects.equals(this.approvedAtUtc, dataConsentDetailsDto.approvedAtUtc) &&
        Objects.equals(this.rejectedAtUtc, dataConsentDetailsDto.rejectedAtUtc) &&
        Objects.equals(this.expiresAtUtc, dataConsentDetailsDto.expiresAtUtc) &&
        Objects.equals(this.requestedAtUtc, dataConsentDetailsDto.requestedAtUtc) &&
        Objects.equals(this.requester, dataConsentDetailsDto.requester) &&
        Objects.equals(this.consentDetails, dataConsentDetailsDto.consentDetails) &&
        Objects.equals(this.identifiers, dataConsentDetailsDto.identifiers) &&
        Objects.equals(this.approvedDocuments, dataConsentDetailsDto.approvedDocuments) &&
        Objects.equals(this.approvedFinancials, dataConsentDetailsDto.approvedFinancials);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, approvedAtUtc, rejectedAtUtc, expiresAtUtc, requestedAtUtc, requester, consentDetails, identifiers, approvedDocuments, approvedFinancials);
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
    sb.append("class DataConsentDetailsDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    approvedAtUtc: ").append(toIndentedString(approvedAtUtc)).append("\n");
    sb.append("    rejectedAtUtc: ").append(toIndentedString(rejectedAtUtc)).append("\n");
    sb.append("    expiresAtUtc: ").append(toIndentedString(expiresAtUtc)).append("\n");
    sb.append("    requestedAtUtc: ").append(toIndentedString(requestedAtUtc)).append("\n");
    sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
    sb.append("    consentDetails: ").append(toIndentedString(consentDetails)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    approvedDocuments: ").append(toIndentedString(approvedDocuments)).append("\n");
    sb.append("    approvedFinancials: ").append(toIndentedString(approvedFinancials)).append("\n");
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

