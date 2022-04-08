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
import com.mydatamyconsent.model.CollectibleTypes;
import com.mydatamyconsent.model.DataConsentStatus;
import com.mydatamyconsent.model.Life;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * Data consent request details.
 */
@ApiModel(description = "Data consent request details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-08T10:37:00.625278065Z[Etc/UTC]")
public class DataConsentRequest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private UUID templateId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PURPOSE = "purpose";
  @SerializedName(SERIALIZED_NAME_PURPOSE)
  private String purpose;

  public static final String SERIALIZED_NAME_DATA_LIFE = "dataLife";
  @SerializedName(SERIALIZED_NAME_DATA_LIFE)
  private Life dataLife;

  public static final String SERIALIZED_NAME_COLLECTABLES = "collectables";
  @SerializedName(SERIALIZED_NAME_COLLECTABLES)
  private List<CollectibleTypes> collectables = new ArrayList<CollectibleTypes>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DataConsentStatus status;

  public static final String SERIALIZED_NAME_CREATED_AT_UTC = "createdAtUtc";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_UTC)
  private OffsetDateTime createdAtUtc;

  public static final String SERIALIZED_NAME_EXPIRES_AT_UTC = "expiresAtUtc";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT_UTC)
  private OffsetDateTime expiresAtUtc;

  public static final String SERIALIZED_NAME_APPROVED_AT_UTC = "approvedAtUtc";
  @SerializedName(SERIALIZED_NAME_APPROVED_AT_UTC)
  private OffsetDateTime approvedAtUtc;

  public static final String SERIALIZED_NAME_DATA_ACCESS_EXPIRES_AT_UTC = "dataAccessExpiresAtUtc";
  @SerializedName(SERIALIZED_NAME_DATA_ACCESS_EXPIRES_AT_UTC)
  private OffsetDateTime dataAccessExpiresAtUtc;

  public static final String SERIALIZED_NAME_REJECTED_AT_UTC = "rejectedAtUtc";
  @SerializedName(SERIALIZED_NAME_REJECTED_AT_UTC)
  private OffsetDateTime rejectedAtUtc;

  public static final String SERIALIZED_NAME_REVOKED_AT_UTC = "revokedAtUtc";
  @SerializedName(SERIALIZED_NAME_REVOKED_AT_UTC)
  private OffsetDateTime revokedAtUtc;

  public DataConsentRequest() { 
  }

  public DataConsentRequest id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Data consent request id.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Data consent request id.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public DataConsentRequest templateId(UUID templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Data consent template id.
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data consent template id.")

  public UUID getTemplateId() {
    return templateId;
  }


  public void setTemplateId(UUID templateId) {
    this.templateId = templateId;
  }


  public DataConsentRequest title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Data consent title.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Data consent title.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public DataConsentRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Data consent description.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Data consent description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DataConsentRequest purpose(String purpose) {
    
    this.purpose = purpose;
    return this;
  }

   /**
   * Data consent purpose.
   * @return purpose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data consent purpose.")

  public String getPurpose() {
    return purpose;
  }


  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  public DataConsentRequest dataLife(Life dataLife) {
    
    this.dataLife = dataLife;
    return this;
  }

   /**
   * Get dataLife
   * @return dataLife
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Life getDataLife() {
    return dataLife;
  }


  public void setDataLife(Life dataLife) {
    this.dataLife = dataLife;
  }


  public DataConsentRequest collectables(List<CollectibleTypes> collectables) {
    
    this.collectables = collectables;
    return this;
  }

  public DataConsentRequest addCollectablesItem(CollectibleTypes collectablesItem) {
    this.collectables.add(collectablesItem);
    return this;
  }

   /**
   * List of supported collectables.
   * @return collectables
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of supported collectables.")

  public List<CollectibleTypes> getCollectables() {
    return collectables;
  }


  public void setCollectables(List<CollectibleTypes> collectables) {
    this.collectables = collectables;
  }


  public DataConsentRequest status(DataConsentStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DataConsentStatus getStatus() {
    return status;
  }


  public void setStatus(DataConsentStatus status) {
    this.status = status;
  }


  public DataConsentRequest createdAtUtc(OffsetDateTime createdAtUtc) {
    
    this.createdAtUtc = createdAtUtc;
    return this;
  }

   /**
   * Request creation datetime in UTC timezone.
   * @return createdAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Request creation datetime in UTC timezone.")

  public OffsetDateTime getCreatedAtUtc() {
    return createdAtUtc;
  }


  public void setCreatedAtUtc(OffsetDateTime createdAtUtc) {
    this.createdAtUtc = createdAtUtc;
  }


  public DataConsentRequest expiresAtUtc(OffsetDateTime expiresAtUtc) {
    
    this.expiresAtUtc = expiresAtUtc;
    return this;
  }

   /**
   * Request expiration datetime in UTC timezone.
   * @return expiresAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Request expiration datetime in UTC timezone.")

  public OffsetDateTime getExpiresAtUtc() {
    return expiresAtUtc;
  }


  public void setExpiresAtUtc(OffsetDateTime expiresAtUtc) {
    this.expiresAtUtc = expiresAtUtc;
  }


  public DataConsentRequest approvedAtUtc(OffsetDateTime approvedAtUtc) {
    
    this.approvedAtUtc = approvedAtUtc;
    return this;
  }

   /**
   * Request approval datetime in UTC timezone.
   * @return approvedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request approval datetime in UTC timezone.")

  public OffsetDateTime getApprovedAtUtc() {
    return approvedAtUtc;
  }


  public void setApprovedAtUtc(OffsetDateTime approvedAtUtc) {
    this.approvedAtUtc = approvedAtUtc;
  }


  public DataConsentRequest dataAccessExpiresAtUtc(OffsetDateTime dataAccessExpiresAtUtc) {
    
    this.dataAccessExpiresAtUtc = dataAccessExpiresAtUtc;
    return this;
  }

   /**
   * Data access expiration datetime in UTC timezone.
   * @return dataAccessExpiresAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data access expiration datetime in UTC timezone.")

  public OffsetDateTime getDataAccessExpiresAtUtc() {
    return dataAccessExpiresAtUtc;
  }


  public void setDataAccessExpiresAtUtc(OffsetDateTime dataAccessExpiresAtUtc) {
    this.dataAccessExpiresAtUtc = dataAccessExpiresAtUtc;
  }


  public DataConsentRequest rejectedAtUtc(OffsetDateTime rejectedAtUtc) {
    
    this.rejectedAtUtc = rejectedAtUtc;
    return this;
  }

   /**
   * Request rejection datetime in UTC timezone.
   * @return rejectedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request rejection datetime in UTC timezone.")

  public OffsetDateTime getRejectedAtUtc() {
    return rejectedAtUtc;
  }


  public void setRejectedAtUtc(OffsetDateTime rejectedAtUtc) {
    this.rejectedAtUtc = rejectedAtUtc;
  }


  public DataConsentRequest revokedAtUtc(OffsetDateTime revokedAtUtc) {
    
    this.revokedAtUtc = revokedAtUtc;
    return this;
  }

   /**
   * Request revocation datetime in UTC timezone.
   * @return revokedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request revocation datetime in UTC timezone.")

  public OffsetDateTime getRevokedAtUtc() {
    return revokedAtUtc;
  }


  public void setRevokedAtUtc(OffsetDateTime revokedAtUtc) {
    this.revokedAtUtc = revokedAtUtc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataConsentRequest dataConsentRequest = (DataConsentRequest) o;
    return Objects.equals(this.id, dataConsentRequest.id) &&
        Objects.equals(this.templateId, dataConsentRequest.templateId) &&
        Objects.equals(this.title, dataConsentRequest.title) &&
        Objects.equals(this.description, dataConsentRequest.description) &&
        Objects.equals(this.purpose, dataConsentRequest.purpose) &&
        Objects.equals(this.dataLife, dataConsentRequest.dataLife) &&
        Objects.equals(this.collectables, dataConsentRequest.collectables) &&
        Objects.equals(this.status, dataConsentRequest.status) &&
        Objects.equals(this.createdAtUtc, dataConsentRequest.createdAtUtc) &&
        Objects.equals(this.expiresAtUtc, dataConsentRequest.expiresAtUtc) &&
        Objects.equals(this.approvedAtUtc, dataConsentRequest.approvedAtUtc) &&
        Objects.equals(this.dataAccessExpiresAtUtc, dataConsentRequest.dataAccessExpiresAtUtc) &&
        Objects.equals(this.rejectedAtUtc, dataConsentRequest.rejectedAtUtc) &&
        Objects.equals(this.revokedAtUtc, dataConsentRequest.revokedAtUtc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, templateId, title, description, purpose, dataLife, collectables, status, createdAtUtc, expiresAtUtc, approvedAtUtc, dataAccessExpiresAtUtc, rejectedAtUtc, revokedAtUtc);
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
    sb.append("class DataConsentRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    dataLife: ").append(toIndentedString(dataLife)).append("\n");
    sb.append("    collectables: ").append(toIndentedString(collectables)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAtUtc: ").append(toIndentedString(createdAtUtc)).append("\n");
    sb.append("    expiresAtUtc: ").append(toIndentedString(expiresAtUtc)).append("\n");
    sb.append("    approvedAtUtc: ").append(toIndentedString(approvedAtUtc)).append("\n");
    sb.append("    dataAccessExpiresAtUtc: ").append(toIndentedString(dataAccessExpiresAtUtc)).append("\n");
    sb.append("    rejectedAtUtc: ").append(toIndentedString(rejectedAtUtc)).append("\n");
    sb.append("    revokedAtUtc: ").append(toIndentedString(revokedAtUtc)).append("\n");
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

