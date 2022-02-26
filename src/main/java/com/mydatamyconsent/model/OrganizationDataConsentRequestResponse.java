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
 * OrganizationDataConsentRequestResponse
 */
@ApiModel(description = "OrganizationDataConsentRequestResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-26T10:34:22.569965547Z[Etc/UTC]")
public class OrganizationDataConsentRequestResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private UUID templateId;

  public static final String SERIALIZED_NAME_REQUESTED_AT_UTC = "requestedAtUtc";
  @SerializedName(SERIALIZED_NAME_REQUESTED_AT_UTC)
  private OffsetDateTime requestedAtUtc;

  public static final String SERIALIZED_NAME_REQUEST_EXPIRES_AT_UTC = "requestExpiresAtUtc";
  @SerializedName(SERIALIZED_NAME_REQUEST_EXPIRES_AT_UTC)
  private OffsetDateTime requestExpiresAtUtc;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DataConsentStatus status;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public OrganizationDataConsentRequestResponse() { 
  }

  public OrganizationDataConsentRequestResponse id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Consent request id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request id")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public OrganizationDataConsentRequestResponse templateId(UUID templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Consent request template id
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request template id")

  public UUID getTemplateId() {
    return templateId;
  }


  public void setTemplateId(UUID templateId) {
    this.templateId = templateId;
  }


  public OrganizationDataConsentRequestResponse requestedAtUtc(OffsetDateTime requestedAtUtc) {
    
    this.requestedAtUtc = requestedAtUtc;
    return this;
  }

   /**
   * Requested date time in utc zone
   * @return requestedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requested date time in utc zone")

  public OffsetDateTime getRequestedAtUtc() {
    return requestedAtUtc;
  }


  public void setRequestedAtUtc(OffsetDateTime requestedAtUtc) {
    this.requestedAtUtc = requestedAtUtc;
  }


  public OrganizationDataConsentRequestResponse requestExpiresAtUtc(OffsetDateTime requestExpiresAtUtc) {
    
    this.requestExpiresAtUtc = requestExpiresAtUtc;
    return this;
  }

   /**
   * Request expires date time in utc zone
   * @return requestExpiresAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request expires date time in utc zone")

  public OffsetDateTime getRequestExpiresAtUtc() {
    return requestExpiresAtUtc;
  }


  public void setRequestExpiresAtUtc(OffsetDateTime requestExpiresAtUtc) {
    this.requestExpiresAtUtc = requestExpiresAtUtc;
  }


  public OrganizationDataConsentRequestResponse status(DataConsentStatus status) {
    
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


  public OrganizationDataConsentRequestResponse transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Requested transaction id
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requested transaction id")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationDataConsentRequestResponse organizationDataConsentRequestResponse = (OrganizationDataConsentRequestResponse) o;
    return Objects.equals(this.id, organizationDataConsentRequestResponse.id) &&
        Objects.equals(this.templateId, organizationDataConsentRequestResponse.templateId) &&
        Objects.equals(this.requestedAtUtc, organizationDataConsentRequestResponse.requestedAtUtc) &&
        Objects.equals(this.requestExpiresAtUtc, organizationDataConsentRequestResponse.requestExpiresAtUtc) &&
        Objects.equals(this.status, organizationDataConsentRequestResponse.status) &&
        Objects.equals(this.transactionId, organizationDataConsentRequestResponse.transactionId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, templateId, requestedAtUtc, requestExpiresAtUtc, status, transactionId);
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
    sb.append("class OrganizationDataConsentRequestResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    requestedAtUtc: ").append(toIndentedString(requestedAtUtc)).append("\n");
    sb.append("    requestExpiresAtUtc: ").append(toIndentedString(requestExpiresAtUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

