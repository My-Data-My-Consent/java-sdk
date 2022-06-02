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
import org.threeten.bp.OffsetDateTime;

/**
 * Document digital signature.
 */
@ApiModel(description = "Document digital signature.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T10:37:49.068193984Z[Etc/UTC]")
public class DocumentDigitalSignature {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ISSUED_BY = "issuedBy";
  @SerializedName(SERIALIZED_NAME_ISSUED_BY)
  private String issuedBy;

  public static final String SERIALIZED_NAME_ISSUER_NAME = "issuerName";
  @SerializedName(SERIALIZED_NAME_ISSUER_NAME)
  private String issuerName;

  public static final String SERIALIZED_NAME_VALID_FROM_UTC = "validFromUtc";
  @SerializedName(SERIALIZED_NAME_VALID_FROM_UTC)
  private OffsetDateTime validFromUtc;

  public static final String SERIALIZED_NAME_VALID_TO_UTC = "validToUtc";
  @SerializedName(SERIALIZED_NAME_VALID_TO_UTC)
  private OffsetDateTime validToUtc;

  public DocumentDigitalSignature() { 
  }

  public DocumentDigitalSignature name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DocumentDigitalSignature issuedBy(String issuedBy) {
    
    this.issuedBy = issuedBy;
    return this;
  }

   /**
   * Signature issued by.
   * @return issuedBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Signature issued by.")

  public String getIssuedBy() {
    return issuedBy;
  }


  public void setIssuedBy(String issuedBy) {
    this.issuedBy = issuedBy;
  }


  public DocumentDigitalSignature issuerName(String issuerName) {
    
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Signature issuer name.
   * @return issuerName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Signature issuer name.")

  public String getIssuerName() {
    return issuerName;
  }


  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }


  public DocumentDigitalSignature validFromUtc(OffsetDateTime validFromUtc) {
    
    this.validFromUtc = validFromUtc;
    return this;
  }

   /**
   * Signature valid from datatime in UTC timezone.
   * @return validFromUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Signature valid from datatime in UTC timezone.")

  public OffsetDateTime getValidFromUtc() {
    return validFromUtc;
  }


  public void setValidFromUtc(OffsetDateTime validFromUtc) {
    this.validFromUtc = validFromUtc;
  }


  public DocumentDigitalSignature validToUtc(OffsetDateTime validToUtc) {
    
    this.validToUtc = validToUtc;
    return this;
  }

   /**
   * Signature valid to datatime in UTC timezone.
   * @return validToUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Signature valid to datatime in UTC timezone.")

  public OffsetDateTime getValidToUtc() {
    return validToUtc;
  }


  public void setValidToUtc(OffsetDateTime validToUtc) {
    this.validToUtc = validToUtc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentDigitalSignature documentDigitalSignature = (DocumentDigitalSignature) o;
    return Objects.equals(this.name, documentDigitalSignature.name) &&
        Objects.equals(this.issuedBy, documentDigitalSignature.issuedBy) &&
        Objects.equals(this.issuerName, documentDigitalSignature.issuerName) &&
        Objects.equals(this.validFromUtc, documentDigitalSignature.validFromUtc) &&
        Objects.equals(this.validToUtc, documentDigitalSignature.validToUtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, issuedBy, issuerName, validFromUtc, validToUtc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentDigitalSignature {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    issuedBy: ").append(toIndentedString(issuedBy)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    validFromUtc: ").append(toIndentedString(validFromUtc)).append("\n");
    sb.append("    validToUtc: ").append(toIndentedString(validToUtc)).append("\n");
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

