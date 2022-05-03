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
import com.mydatamyconsent.model.DocumentIssueRequestStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * Document issue request details.
 */
@ApiModel(description = "Document issue request details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T10:38:02.393855662Z[Etc/UTC]")
public class DocumentIssueRequestDetails {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE_ID = "documentTypeId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE_ID)
  private UUID documentTypeId;

  public static final String SERIALIZED_NAME_TYPE_NAME = "typeName";
  @SerializedName(SERIALIZED_NAME_TYPE_NAME)
  private String typeName;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DocumentIssueRequestStatus status;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RECEIVER = "receiver";
  @SerializedName(SERIALIZED_NAME_RECEIVER)
  private Object receiver = null;

  public static final String SERIALIZED_NAME_ISSUED_AT_UTC = "issuedAtUtc";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT_UTC)
  private OffsetDateTime issuedAtUtc;

  public static final String SERIALIZED_NAME_VALID_FROM_UTC = "validFromUtc";
  @SerializedName(SERIALIZED_NAME_VALID_FROM_UTC)
  private OffsetDateTime validFromUtc;

  public static final String SERIALIZED_NAME_EXPIRES_AT_UTC = "expiresAtUtc";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT_UTC)
  private OffsetDateTime expiresAtUtc;

  public static final String SERIALIZED_NAME_META_DATA = "metaData";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private Object metaData = null;

  public static final String SERIALIZED_NAME_CREATED_AT_UTC = "createdAtUtc";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_UTC)
  private OffsetDateTime createdAtUtc;

  public DocumentIssueRequestDetails() { 
  }

  public DocumentIssueRequestDetails id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Document issue request Id.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document issue request Id.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public DocumentIssueRequestDetails documentTypeId(UUID documentTypeId) {
    
    this.documentTypeId = documentTypeId;
    return this;
  }

   /**
   * Document type Id.
   * @return documentTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document type Id.")

  public UUID getDocumentTypeId() {
    return documentTypeId;
  }


  public void setDocumentTypeId(UUID documentTypeId) {
    this.documentTypeId = documentTypeId;
  }


  public DocumentIssueRequestDetails typeName(String typeName) {
    
    this.typeName = typeName;
    return this;
  }

   /**
   * Document type name.
   * @return typeName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Driving License.", required = true, value = "Document type name.")

  public String getTypeName() {
    return typeName;
  }


  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  public DocumentIssueRequestDetails identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Document identifier.
   * @return identifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "GJ05FG67866586.", required = true, value = "Document identifier.")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public DocumentIssueRequestDetails status(DocumentIssueRequestStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DocumentIssueRequestStatus getStatus() {
    return status;
  }


  public void setStatus(DocumentIssueRequestStatus status) {
    this.status = status;
  }


  public DocumentIssueRequestDetails description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Document description.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DocumentIssueRequestDetails receiver(Object receiver) {
    
    this.receiver = receiver;
    return this;
  }

   /**
   * Document receiver details.
   * @return receiver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Document receiver details.")

  public Object getReceiver() {
    return receiver;
  }


  public void setReceiver(Object receiver) {
    this.receiver = receiver;
  }


  public DocumentIssueRequestDetails issuedAtUtc(OffsetDateTime issuedAtUtc) {
    
    this.issuedAtUtc = issuedAtUtc;
    return this;
  }

   /**
   * Datetime of issue in UTC timezone.
   * @return issuedAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Datetime of issue in UTC timezone.")

  public OffsetDateTime getIssuedAtUtc() {
    return issuedAtUtc;
  }


  public void setIssuedAtUtc(OffsetDateTime issuedAtUtc) {
    this.issuedAtUtc = issuedAtUtc;
  }


  public DocumentIssueRequestDetails validFromUtc(OffsetDateTime validFromUtc) {
    
    this.validFromUtc = validFromUtc;
    return this;
  }

   /**
   * Valid from datetime in UTC timezone.
   * @return validFromUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Valid from datetime in UTC timezone.")

  public OffsetDateTime getValidFromUtc() {
    return validFromUtc;
  }


  public void setValidFromUtc(OffsetDateTime validFromUtc) {
    this.validFromUtc = validFromUtc;
  }


  public DocumentIssueRequestDetails expiresAtUtc(OffsetDateTime expiresAtUtc) {
    
    this.expiresAtUtc = expiresAtUtc;
    return this;
  }

   /**
   * Datetime of expiry in UTC timezone.
   * @return expiresAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datetime of expiry in UTC timezone.")

  public OffsetDateTime getExpiresAtUtc() {
    return expiresAtUtc;
  }


  public void setExpiresAtUtc(OffsetDateTime expiresAtUtc) {
    this.expiresAtUtc = expiresAtUtc;
  }


  public DocumentIssueRequestDetails metaData(Object metaData) {
    
    this.metaData = metaData;
    return this;
  }

   /**
   * Metadata.
   * @return metaData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata.")

  public Object getMetaData() {
    return metaData;
  }


  public void setMetaData(Object metaData) {
    this.metaData = metaData;
  }


  public DocumentIssueRequestDetails createdAtUtc(OffsetDateTime createdAtUtc) {
    
    this.createdAtUtc = createdAtUtc;
    return this;
  }

   /**
   * Creation datetime of issue request in UTC timezone.
   * @return createdAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Creation datetime of issue request in UTC timezone.")

  public OffsetDateTime getCreatedAtUtc() {
    return createdAtUtc;
  }


  public void setCreatedAtUtc(OffsetDateTime createdAtUtc) {
    this.createdAtUtc = createdAtUtc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentIssueRequestDetails documentIssueRequestDetails = (DocumentIssueRequestDetails) o;
    return Objects.equals(this.id, documentIssueRequestDetails.id) &&
        Objects.equals(this.documentTypeId, documentIssueRequestDetails.documentTypeId) &&
        Objects.equals(this.typeName, documentIssueRequestDetails.typeName) &&
        Objects.equals(this.identifier, documentIssueRequestDetails.identifier) &&
        Objects.equals(this.status, documentIssueRequestDetails.status) &&
        Objects.equals(this.description, documentIssueRequestDetails.description) &&
        Objects.equals(this.receiver, documentIssueRequestDetails.receiver) &&
        Objects.equals(this.issuedAtUtc, documentIssueRequestDetails.issuedAtUtc) &&
        Objects.equals(this.validFromUtc, documentIssueRequestDetails.validFromUtc) &&
        Objects.equals(this.expiresAtUtc, documentIssueRequestDetails.expiresAtUtc) &&
        Objects.equals(this.metaData, documentIssueRequestDetails.metaData) &&
        Objects.equals(this.createdAtUtc, documentIssueRequestDetails.createdAtUtc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, documentTypeId, typeName, identifier, status, description, receiver, issuedAtUtc, validFromUtc, expiresAtUtc, metaData, createdAtUtc);
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
    sb.append("class DocumentIssueRequestDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    documentTypeId: ").append(toIndentedString(documentTypeId)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    issuedAtUtc: ").append(toIndentedString(issuedAtUtc)).append("\n");
    sb.append("    validFromUtc: ").append(toIndentedString(validFromUtc)).append("\n");
    sb.append("    expiresAtUtc: ").append(toIndentedString(expiresAtUtc)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    createdAtUtc: ").append(toIndentedString(createdAtUtc)).append("\n");
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

