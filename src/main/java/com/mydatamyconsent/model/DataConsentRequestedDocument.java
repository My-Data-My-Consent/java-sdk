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
 * DataConsentRequestedDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-10T10:35:10.300987462Z[Etc/UTC]")
public class DataConsentRequestedDocument {
  public static final String SERIALIZED_NAME_CUSTOM_KEY = "custom_key";
  @SerializedName(SERIALIZED_NAME_CUSTOM_KEY)
  private String customKey;

  public static final String SERIALIZED_NAME_DRN = "drn";
  @SerializedName(SERIALIZED_NAME_DRN)
  private String drn;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE_ID = "documentTypeId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE_ID)
  private UUID documentTypeId;

  public static final String SERIALIZED_NAME_DOCUMENT_IDENTIFIER = "documentIdentifier";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_IDENTIFIER)
  private UUID documentIdentifier;

  public DataConsentRequestedDocument() { 
  }

  public DataConsentRequestedDocument customKey(String customKey) {
    
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


  public DataConsentRequestedDocument drn(String drn) {
    
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


  public DataConsentRequestedDocument documentTypeId(UUID documentTypeId) {
    
    this.documentTypeId = documentTypeId;
    return this;
  }

   /**
   * Get documentTypeId
   * @return documentTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getDocumentTypeId() {
    return documentTypeId;
  }


  public void setDocumentTypeId(UUID documentTypeId) {
    this.documentTypeId = documentTypeId;
  }


  public DataConsentRequestedDocument documentIdentifier(UUID documentIdentifier) {
    
    this.documentIdentifier = documentIdentifier;
    return this;
  }

   /**
   * Get documentIdentifier
   * @return documentIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getDocumentIdentifier() {
    return documentIdentifier;
  }


  public void setDocumentIdentifier(UUID documentIdentifier) {
    this.documentIdentifier = documentIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataConsentRequestedDocument dataConsentRequestedDocument = (DataConsentRequestedDocument) o;
    return Objects.equals(this.customKey, dataConsentRequestedDocument.customKey) &&
        Objects.equals(this.drn, dataConsentRequestedDocument.drn) &&
        Objects.equals(this.documentTypeId, dataConsentRequestedDocument.documentTypeId) &&
        Objects.equals(this.documentIdentifier, dataConsentRequestedDocument.documentIdentifier);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customKey, drn, documentTypeId, documentIdentifier);
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
    sb.append("class DataConsentRequestedDocument {\n");
    sb.append("    customKey: ").append(toIndentedString(customKey)).append("\n");
    sb.append("    drn: ").append(toIndentedString(drn)).append("\n");
    sb.append("    documentTypeId: ").append(toIndentedString(documentTypeId)).append("\n");
    sb.append("    documentIdentifier: ").append(toIndentedString(documentIdentifier)).append("\n");
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

