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
 * OrganizationDocumentDetailsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-05T10:32:06.127911629Z[Etc/UTC]")
public class OrganizationDocumentDetailsDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private UUID organizationId;

  public static final String SERIALIZED_NAME_ORGANIZATION_NAME = "organizationName";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_NAME)
  private String organizationName;

  public static final String SERIALIZED_NAME_TYPE_ID = "typeId";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private UUID typeId;

  public static final String SERIALIZED_NAME_TYPE_NAME = "typeName";
  @SerializedName(SERIALIZED_NAME_TYPE_NAME)
  private String typeName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_STORAGE_URL = "storageUrl";
  @SerializedName(SERIALIZED_NAME_STORAGE_URL)
  private String storageUrl;

  public static final String SERIALIZED_NAME_COUNTRY_ISO2 = "countryIso2";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ISO2)
  private String countryIso2;

  public static final String SERIALIZED_NAME_ISSUER_ID = "issuerId";
  @SerializedName(SERIALIZED_NAME_ISSUER_ID)
  private UUID issuerId;

  public static final String SERIALIZED_NAME_ISSUER_NAME = "issuerName";
  @SerializedName(SERIALIZED_NAME_ISSUER_NAME)
  private String issuerName;

  public OrganizationDocumentDetailsDto() { 
  }

  public OrganizationDocumentDetailsDto id(UUID id) {
    
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


  public OrganizationDocumentDetailsDto organizationId(UUID organizationId) {
    
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


  public OrganizationDocumentDetailsDto organizationName(String organizationName) {
    
    this.organizationName = organizationName;
    return this;
  }

   /**
   * Get organizationName
   * @return organizationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrganizationName() {
    return organizationName;
  }


  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }


  public OrganizationDocumentDetailsDto typeId(UUID typeId) {
    
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getTypeId() {
    return typeId;
  }


  public void setTypeId(UUID typeId) {
    this.typeId = typeId;
  }


  public OrganizationDocumentDetailsDto typeName(String typeName) {
    
    this.typeName = typeName;
    return this;
  }

   /**
   * Get typeName
   * @return typeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTypeName() {
    return typeName;
  }


  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  public OrganizationDocumentDetailsDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OrganizationDocumentDetailsDto identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public OrganizationDocumentDetailsDto storageUrl(String storageUrl) {
    
    this.storageUrl = storageUrl;
    return this;
  }

   /**
   * Get storageUrl
   * @return storageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStorageUrl() {
    return storageUrl;
  }


  public void setStorageUrl(String storageUrl) {
    this.storageUrl = storageUrl;
  }


  public OrganizationDocumentDetailsDto countryIso2(String countryIso2) {
    
    this.countryIso2 = countryIso2;
    return this;
  }

   /**
   * Get countryIso2
   * @return countryIso2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountryIso2() {
    return countryIso2;
  }


  public void setCountryIso2(String countryIso2) {
    this.countryIso2 = countryIso2;
  }


  public OrganizationDocumentDetailsDto issuerId(UUID issuerId) {
    
    this.issuerId = issuerId;
    return this;
  }

   /**
   * Get issuerId
   * @return issuerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getIssuerId() {
    return issuerId;
  }


  public void setIssuerId(UUID issuerId) {
    this.issuerId = issuerId;
  }


  public OrganizationDocumentDetailsDto issuerName(String issuerName) {
    
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Get issuerName
   * @return issuerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIssuerName() {
    return issuerName;
  }


  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationDocumentDetailsDto organizationDocumentDetailsDto = (OrganizationDocumentDetailsDto) o;
    return Objects.equals(this.id, organizationDocumentDetailsDto.id) &&
        Objects.equals(this.organizationId, organizationDocumentDetailsDto.organizationId) &&
        Objects.equals(this.organizationName, organizationDocumentDetailsDto.organizationName) &&
        Objects.equals(this.typeId, organizationDocumentDetailsDto.typeId) &&
        Objects.equals(this.typeName, organizationDocumentDetailsDto.typeName) &&
        Objects.equals(this.name, organizationDocumentDetailsDto.name) &&
        Objects.equals(this.identifier, organizationDocumentDetailsDto.identifier) &&
        Objects.equals(this.storageUrl, organizationDocumentDetailsDto.storageUrl) &&
        Objects.equals(this.countryIso2, organizationDocumentDetailsDto.countryIso2) &&
        Objects.equals(this.issuerId, organizationDocumentDetailsDto.issuerId) &&
        Objects.equals(this.issuerName, organizationDocumentDetailsDto.issuerName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, organizationName, typeId, typeName, name, identifier, storageUrl, countryIso2, issuerId, issuerName);
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
    sb.append("class OrganizationDocumentDetailsDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    storageUrl: ").append(toIndentedString(storageUrl)).append("\n");
    sb.append("    countryIso2: ").append(toIndentedString(countryIso2)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
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

