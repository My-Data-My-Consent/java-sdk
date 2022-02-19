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
import com.mydatamyconsent.model.DataConsentStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * OrganizationDataConsentInfoDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-19T10:34:06.946929974Z[Etc/UTC]")
public class OrganizationDataConsentInfoDto {
  public static final String SERIALIZED_NAME_CONSENT_REQUEST_ID = "consentRequestId";
  @SerializedName(SERIALIZED_NAME_CONSENT_REQUEST_ID)
  private UUID consentRequestId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_CONSENT_TEMPLATE_ID = "consentTemplateId";
  @SerializedName(SERIALIZED_NAME_CONSENT_TEMPLATE_ID)
  private UUID consentTemplateId;

  public static final String SERIALIZED_NAME_CONSENT_PURPOSE = "consentPurpose";
  @SerializedName(SERIALIZED_NAME_CONSENT_PURPOSE)
  private String consentPurpose;

  public static final String SERIALIZED_NAME_CONSENT_DESCRIPTION = "consentDescription";
  @SerializedName(SERIALIZED_NAME_CONSENT_DESCRIPTION)
  private String consentDescription;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DataConsentStatus status;

  public static final String SERIALIZED_NAME_CREATED_AT_UTC = "createdAtUtc";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_UTC)
  private OffsetDateTime createdAtUtc;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private UUID organizationId;

  public static final String SERIALIZED_NAME_CONSENT_SENT_TO_ORGANIZATION = "consentSentToOrganization";
  @SerializedName(SERIALIZED_NAME_CONSENT_SENT_TO_ORGANIZATION)
  private String consentSentToOrganization;

  public OrganizationDataConsentInfoDto() { 
  }

  public OrganizationDataConsentInfoDto consentRequestId(UUID consentRequestId) {
    
    this.consentRequestId = consentRequestId;
    return this;
  }

   /**
   * Get consentRequestId
   * @return consentRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getConsentRequestId() {
    return consentRequestId;
  }


  public void setConsentRequestId(UUID consentRequestId) {
    this.consentRequestId = consentRequestId;
  }


  public OrganizationDataConsentInfoDto userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public OrganizationDataConsentInfoDto consentTemplateId(UUID consentTemplateId) {
    
    this.consentTemplateId = consentTemplateId;
    return this;
  }

   /**
   * Get consentTemplateId
   * @return consentTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getConsentTemplateId() {
    return consentTemplateId;
  }


  public void setConsentTemplateId(UUID consentTemplateId) {
    this.consentTemplateId = consentTemplateId;
  }


  public OrganizationDataConsentInfoDto consentPurpose(String consentPurpose) {
    
    this.consentPurpose = consentPurpose;
    return this;
  }

   /**
   * Get consentPurpose
   * @return consentPurpose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsentPurpose() {
    return consentPurpose;
  }


  public void setConsentPurpose(String consentPurpose) {
    this.consentPurpose = consentPurpose;
  }


  public OrganizationDataConsentInfoDto consentDescription(String consentDescription) {
    
    this.consentDescription = consentDescription;
    return this;
  }

   /**
   * Get consentDescription
   * @return consentDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsentDescription() {
    return consentDescription;
  }


  public void setConsentDescription(String consentDescription) {
    this.consentDescription = consentDescription;
  }


  public OrganizationDataConsentInfoDto status(DataConsentStatus status) {
    
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


  public OrganizationDataConsentInfoDto createdAtUtc(OffsetDateTime createdAtUtc) {
    
    this.createdAtUtc = createdAtUtc;
    return this;
  }

   /**
   * Get createdAtUtc
   * @return createdAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAtUtc() {
    return createdAtUtc;
  }


  public void setCreatedAtUtc(OffsetDateTime createdAtUtc) {
    this.createdAtUtc = createdAtUtc;
  }


  public OrganizationDataConsentInfoDto organizationId(UUID organizationId) {
    
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


  public OrganizationDataConsentInfoDto consentSentToOrganization(String consentSentToOrganization) {
    
    this.consentSentToOrganization = consentSentToOrganization;
    return this;
  }

   /**
   * Get consentSentToOrganization
   * @return consentSentToOrganization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsentSentToOrganization() {
    return consentSentToOrganization;
  }


  public void setConsentSentToOrganization(String consentSentToOrganization) {
    this.consentSentToOrganization = consentSentToOrganization;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationDataConsentInfoDto organizationDataConsentInfoDto = (OrganizationDataConsentInfoDto) o;
    return Objects.equals(this.consentRequestId, organizationDataConsentInfoDto.consentRequestId) &&
        Objects.equals(this.userId, organizationDataConsentInfoDto.userId) &&
        Objects.equals(this.consentTemplateId, organizationDataConsentInfoDto.consentTemplateId) &&
        Objects.equals(this.consentPurpose, organizationDataConsentInfoDto.consentPurpose) &&
        Objects.equals(this.consentDescription, organizationDataConsentInfoDto.consentDescription) &&
        Objects.equals(this.status, organizationDataConsentInfoDto.status) &&
        Objects.equals(this.createdAtUtc, organizationDataConsentInfoDto.createdAtUtc) &&
        Objects.equals(this.organizationId, organizationDataConsentInfoDto.organizationId) &&
        Objects.equals(this.consentSentToOrganization, organizationDataConsentInfoDto.consentSentToOrganization);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentRequestId, userId, consentTemplateId, consentPurpose, consentDescription, status, createdAtUtc, organizationId, consentSentToOrganization);
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
    sb.append("class OrganizationDataConsentInfoDto {\n");
    sb.append("    consentRequestId: ").append(toIndentedString(consentRequestId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    consentTemplateId: ").append(toIndentedString(consentTemplateId)).append("\n");
    sb.append("    consentPurpose: ").append(toIndentedString(consentPurpose)).append("\n");
    sb.append("    consentDescription: ").append(toIndentedString(consentDescription)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAtUtc: ").append(toIndentedString(createdAtUtc)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    consentSentToOrganization: ").append(toIndentedString(consentSentToOrganization)).append("\n");
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

