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
import com.mydatamyconsent.model.SupportedDocumentDetailsDto;
import com.mydatamyconsent.model.SupportedDocumentProviderDetailsDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SupportedDocumentTypeCategoryDetailsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-12T10:34:34.181008316Z[Etc/UTC]")
public class SupportedDocumentTypeCategoryDetailsDto {
  public static final String SERIALIZED_NAME_DOCUMENT_TYPE_CATEGORY_ID = "documentTypeCategoryId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE_CATEGORY_ID)
  private UUID documentTypeCategoryId;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE_CATEGORY_NAME = "documentTypeCategoryName";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE_CATEGORY_NAME)
  private String documentTypeCategoryName;

  public static final String SERIALIZED_NAME_SUPPORTED_DOCUMENTS = "supportedDocuments";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_DOCUMENTS)
  private List<SupportedDocumentDetailsDto> supportedDocuments = new ArrayList<SupportedDocumentDetailsDto>();

  public static final String SERIALIZED_NAME_SUPPORTED_DOCUMENT_PROVIDER_DETAILS = "supportedDocumentProviderDetails";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_DOCUMENT_PROVIDER_DETAILS)
  private List<SupportedDocumentProviderDetailsDto> supportedDocumentProviderDetails = null;

  public SupportedDocumentTypeCategoryDetailsDto() { 
  }

  public SupportedDocumentTypeCategoryDetailsDto documentTypeCategoryId(UUID documentTypeCategoryId) {
    
    this.documentTypeCategoryId = documentTypeCategoryId;
    return this;
  }

   /**
   * Get documentTypeCategoryId
   * @return documentTypeCategoryId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getDocumentTypeCategoryId() {
    return documentTypeCategoryId;
  }


  public void setDocumentTypeCategoryId(UUID documentTypeCategoryId) {
    this.documentTypeCategoryId = documentTypeCategoryId;
  }


  public SupportedDocumentTypeCategoryDetailsDto documentTypeCategoryName(String documentTypeCategoryName) {
    
    this.documentTypeCategoryName = documentTypeCategoryName;
    return this;
  }

   /**
   * Get documentTypeCategoryName
   * @return documentTypeCategoryName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDocumentTypeCategoryName() {
    return documentTypeCategoryName;
  }


  public void setDocumentTypeCategoryName(String documentTypeCategoryName) {
    this.documentTypeCategoryName = documentTypeCategoryName;
  }


  public SupportedDocumentTypeCategoryDetailsDto supportedDocuments(List<SupportedDocumentDetailsDto> supportedDocuments) {
    
    this.supportedDocuments = supportedDocuments;
    return this;
  }

  public SupportedDocumentTypeCategoryDetailsDto addSupportedDocumentsItem(SupportedDocumentDetailsDto supportedDocumentsItem) {
    this.supportedDocuments.add(supportedDocumentsItem);
    return this;
  }

   /**
   * Get supportedDocuments
   * @return supportedDocuments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<SupportedDocumentDetailsDto> getSupportedDocuments() {
    return supportedDocuments;
  }


  public void setSupportedDocuments(List<SupportedDocumentDetailsDto> supportedDocuments) {
    this.supportedDocuments = supportedDocuments;
  }


  public SupportedDocumentTypeCategoryDetailsDto supportedDocumentProviderDetails(List<SupportedDocumentProviderDetailsDto> supportedDocumentProviderDetails) {
    
    this.supportedDocumentProviderDetails = supportedDocumentProviderDetails;
    return this;
  }

  public SupportedDocumentTypeCategoryDetailsDto addSupportedDocumentProviderDetailsItem(SupportedDocumentProviderDetailsDto supportedDocumentProviderDetailsItem) {
    if (this.supportedDocumentProviderDetails == null) {
      this.supportedDocumentProviderDetails = new ArrayList<SupportedDocumentProviderDetailsDto>();
    }
    this.supportedDocumentProviderDetails.add(supportedDocumentProviderDetailsItem);
    return this;
  }

   /**
   * Get supportedDocumentProviderDetails
   * @return supportedDocumentProviderDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SupportedDocumentProviderDetailsDto> getSupportedDocumentProviderDetails() {
    return supportedDocumentProviderDetails;
  }


  public void setSupportedDocumentProviderDetails(List<SupportedDocumentProviderDetailsDto> supportedDocumentProviderDetails) {
    this.supportedDocumentProviderDetails = supportedDocumentProviderDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedDocumentTypeCategoryDetailsDto supportedDocumentTypeCategoryDetailsDto = (SupportedDocumentTypeCategoryDetailsDto) o;
    return Objects.equals(this.documentTypeCategoryId, supportedDocumentTypeCategoryDetailsDto.documentTypeCategoryId) &&
        Objects.equals(this.documentTypeCategoryName, supportedDocumentTypeCategoryDetailsDto.documentTypeCategoryName) &&
        Objects.equals(this.supportedDocuments, supportedDocumentTypeCategoryDetailsDto.supportedDocuments) &&
        Objects.equals(this.supportedDocumentProviderDetails, supportedDocumentTypeCategoryDetailsDto.supportedDocumentProviderDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentTypeCategoryId, documentTypeCategoryName, supportedDocuments, supportedDocumentProviderDetails);
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
    sb.append("class SupportedDocumentTypeCategoryDetailsDto {\n");
    sb.append("    documentTypeCategoryId: ").append(toIndentedString(documentTypeCategoryId)).append("\n");
    sb.append("    documentTypeCategoryName: ").append(toIndentedString(documentTypeCategoryName)).append("\n");
    sb.append("    supportedDocuments: ").append(toIndentedString(supportedDocuments)).append("\n");
    sb.append("    supportedDocumentProviderDetails: ").append(toIndentedString(supportedDocumentProviderDetails)).append("\n");
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

