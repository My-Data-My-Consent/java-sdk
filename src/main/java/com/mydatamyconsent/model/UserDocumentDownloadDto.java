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
 * UserDocumentDownloadDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-24T10:35:00.587855006Z[Etc/UTC]")
public class UserDocumentDownloadDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_STORAGE_URL = "storageUrl";
  @SerializedName(SERIALIZED_NAME_STORAGE_URL)
  private String storageUrl;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private UUID ownerId;

  public UserDocumentDownloadDto() { 
  }

  public UserDocumentDownloadDto id(UUID id) {
    
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


  public UserDocumentDownloadDto storageUrl(String storageUrl) {
    
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


  public UserDocumentDownloadDto ownerId(UUID ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(UUID ownerId) {
    this.ownerId = ownerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDocumentDownloadDto userDocumentDownloadDto = (UserDocumentDownloadDto) o;
    return Objects.equals(this.id, userDocumentDownloadDto.id) &&
        Objects.equals(this.storageUrl, userDocumentDownloadDto.storageUrl) &&
        Objects.equals(this.ownerId, userDocumentDownloadDto.ownerId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, storageUrl, ownerId);
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
    sb.append("class UserDocumentDownloadDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    storageUrl: ").append(toIndentedString(storageUrl)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

