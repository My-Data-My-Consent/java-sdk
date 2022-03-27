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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * UriDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-27T10:34:35.500819370Z[Etc/UTC]")
public class UriDetails {
  public static final String SERIALIZED_NAME_AADHAAR = "aadhaar";
  @SerializedName(SERIALIZED_NAME_AADHAAR)
  private String aadhaar;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_DOC_TYPE = "docType";
  @SerializedName(SERIALIZED_NAME_DOC_TYPE)
  private String docType;

  public static final String SERIALIZED_NAME_DOC_NAME = "docName";
  @SerializedName(SERIALIZED_NAME_DOC_NAME)
  private String docName;

  public static final String SERIALIZED_NAME_DOC_ID = "docId";
  @SerializedName(SERIALIZED_NAME_DOC_ID)
  private String docId;

  public static final String SERIALIZED_NAME_ISSUED_ON = "issuedOn";
  @SerializedName(SERIALIZED_NAME_ISSUED_ON)
  private String issuedOn;

  public static final String SERIALIZED_NAME_VALID_FROM = "validFrom";
  @SerializedName(SERIALIZED_NAME_VALID_FROM)
  private String validFrom;

  public static final String SERIALIZED_NAME_VALID_TO = "validTo";
  @SerializedName(SERIALIZED_NAME_VALID_TO)
  private String validTo;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public UriDetails() { 
  }

  public UriDetails aadhaar(String aadhaar) {
    
    this.aadhaar = aadhaar;
    return this;
  }

   /**
   * Get aadhaar
   * @return aadhaar
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAadhaar() {
    return aadhaar;
  }


  public void setAadhaar(String aadhaar) {
    this.aadhaar = aadhaar;
  }


  public UriDetails uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public UriDetails docType(String docType) {
    
    this.docType = docType;
    return this;
  }

   /**
   * Get docType
   * @return docType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDocType() {
    return docType;
  }


  public void setDocType(String docType) {
    this.docType = docType;
  }


  public UriDetails docName(String docName) {
    
    this.docName = docName;
    return this;
  }

   /**
   * Get docName
   * @return docName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDocName() {
    return docName;
  }


  public void setDocName(String docName) {
    this.docName = docName;
  }


  public UriDetails docId(String docId) {
    
    this.docId = docId;
    return this;
  }

   /**
   * Get docId
   * @return docId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDocId() {
    return docId;
  }


  public void setDocId(String docId) {
    this.docId = docId;
  }


  public UriDetails issuedOn(String issuedOn) {
    
    this.issuedOn = issuedOn;
    return this;
  }

   /**
   * Get issuedOn
   * @return issuedOn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIssuedOn() {
    return issuedOn;
  }


  public void setIssuedOn(String issuedOn) {
    this.issuedOn = issuedOn;
  }


  public UriDetails validFrom(String validFrom) {
    
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Get validFrom
   * @return validFrom
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getValidFrom() {
    return validFrom;
  }


  public void setValidFrom(String validFrom) {
    this.validFrom = validFrom;
  }


  public UriDetails validTo(String validTo) {
    
    this.validTo = validTo;
    return this;
  }

   /**
   * Get validTo
   * @return validTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValidTo() {
    return validTo;
  }


  public void setValidTo(String validTo) {
    this.validTo = validTo;
  }


  public UriDetails timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public UriDetails action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UriDetails uriDetails = (UriDetails) o;
    return Objects.equals(this.aadhaar, uriDetails.aadhaar) &&
        Objects.equals(this.uri, uriDetails.uri) &&
        Objects.equals(this.docType, uriDetails.docType) &&
        Objects.equals(this.docName, uriDetails.docName) &&
        Objects.equals(this.docId, uriDetails.docId) &&
        Objects.equals(this.issuedOn, uriDetails.issuedOn) &&
        Objects.equals(this.validFrom, uriDetails.validFrom) &&
        Objects.equals(this.validTo, uriDetails.validTo) &&
        Objects.equals(this.timestamp, uriDetails.timestamp) &&
        Objects.equals(this.action, uriDetails.action);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(aadhaar, uri, docType, docName, docId, issuedOn, validFrom, validTo, timestamp, action);
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
    sb.append("class UriDetails {\n");
    sb.append("    aadhaar: ").append(toIndentedString(aadhaar)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
    sb.append("    docName: ").append(toIndentedString(docName)).append("\n");
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
    sb.append("    issuedOn: ").append(toIndentedString(issuedOn)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

