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
import com.mydatamyconsent.model.ApplicationUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * RefreshToken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-26T11:36:08.780773+05:30[Asia/Kolkata]")
public class RefreshToken {
  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private UUID createdBy;

  public static final String SERIALIZED_NAME_CREATED_AT_UTC = "createdAtUtc";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_UTC)
  private OffsetDateTime createdAtUtc;

  public static final String SERIALIZED_NAME_UPDATED_BY = "updatedBy";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY)
  private UUID updatedBy;

  public static final String SERIALIZED_NAME_UPDATED_AT_UTC = "updatedAtUtc";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_UTC)
  private OffsetDateTime updatedAtUtc;

  public static final String SERIALIZED_NAME_CREATED_BY_USER = "createdByUser";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_USER)
  private ApplicationUser createdByUser;

  public static final String SERIALIZED_NAME_UPDATED_BY_USER = "updatedByUser";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY_USER)
  private ApplicationUser updatedByUser;

  public static final String SERIALIZED_NAME_DELETED_BY = "deletedBy";
  @SerializedName(SERIALIZED_NAME_DELETED_BY)
  private UUID deletedBy;

  public static final String SERIALIZED_NAME_DELETED_AT_UTC = "deletedAtUtc";
  @SerializedName(SERIALIZED_NAME_DELETED_AT_UTC)
  private OffsetDateTime deletedAtUtc;

  public static final String SERIALIZED_NAME_DELETED_BY_USER = "deletedByUser";
  @SerializedName(SERIALIZED_NAME_DELETED_BY_USER)
  private ApplicationUser deletedByUser;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_INSTALLATION_ID = "installationId";
  @SerializedName(SERIALIZED_NAME_INSTALLATION_ID)
  private String installationId;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "accessToken";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN_EXPIRES = "accessTokenExpires";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN_EXPIRES)
  private OffsetDateTime accessTokenExpires;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private OffsetDateTime expires;

  public static final String SERIALIZED_NAME_IS_EXPIRED = "isExpired";
  @SerializedName(SERIALIZED_NAME_IS_EXPIRED)
  private Boolean isExpired;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_REVOKED = "revoked";
  @SerializedName(SERIALIZED_NAME_REVOKED)
  private OffsetDateTime revoked;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private ApplicationUser user;


  public RefreshToken createdBy(UUID createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(UUID createdBy) {
    this.createdBy = createdBy;
  }


  public RefreshToken createdAtUtc(OffsetDateTime createdAtUtc) {
    
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


  public RefreshToken updatedBy(UUID updatedBy) {
    
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Get updatedBy
   * @return updatedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getUpdatedBy() {
    return updatedBy;
  }


  public void setUpdatedBy(UUID updatedBy) {
    this.updatedBy = updatedBy;
  }


  public RefreshToken updatedAtUtc(OffsetDateTime updatedAtUtc) {
    
    this.updatedAtUtc = updatedAtUtc;
    return this;
  }

   /**
   * Get updatedAtUtc
   * @return updatedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAtUtc() {
    return updatedAtUtc;
  }


  public void setUpdatedAtUtc(OffsetDateTime updatedAtUtc) {
    this.updatedAtUtc = updatedAtUtc;
  }


  public RefreshToken createdByUser(ApplicationUser createdByUser) {
    
    this.createdByUser = createdByUser;
    return this;
  }

   /**
   * Get createdByUser
   * @return createdByUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationUser getCreatedByUser() {
    return createdByUser;
  }


  public void setCreatedByUser(ApplicationUser createdByUser) {
    this.createdByUser = createdByUser;
  }


  public RefreshToken updatedByUser(ApplicationUser updatedByUser) {
    
    this.updatedByUser = updatedByUser;
    return this;
  }

   /**
   * Get updatedByUser
   * @return updatedByUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationUser getUpdatedByUser() {
    return updatedByUser;
  }


  public void setUpdatedByUser(ApplicationUser updatedByUser) {
    this.updatedByUser = updatedByUser;
  }


  public RefreshToken deletedBy(UUID deletedBy) {
    
    this.deletedBy = deletedBy;
    return this;
  }

   /**
   * Get deletedBy
   * @return deletedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getDeletedBy() {
    return deletedBy;
  }


  public void setDeletedBy(UUID deletedBy) {
    this.deletedBy = deletedBy;
  }


  public RefreshToken deletedAtUtc(OffsetDateTime deletedAtUtc) {
    
    this.deletedAtUtc = deletedAtUtc;
    return this;
  }

   /**
   * Get deletedAtUtc
   * @return deletedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDeletedAtUtc() {
    return deletedAtUtc;
  }


  public void setDeletedAtUtc(OffsetDateTime deletedAtUtc) {
    this.deletedAtUtc = deletedAtUtc;
  }


  public RefreshToken deletedByUser(ApplicationUser deletedByUser) {
    
    this.deletedByUser = deletedByUser;
    return this;
  }

   /**
   * Get deletedByUser
   * @return deletedByUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationUser getDeletedByUser() {
    return deletedByUser;
  }


  public void setDeletedByUser(ApplicationUser deletedByUser) {
    this.deletedByUser = deletedByUser;
  }


  public RefreshToken id(UUID id) {
    
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


  public RefreshToken installationId(String installationId) {
    
    this.installationId = installationId;
    return this;
  }

   /**
   * Get installationId
   * @return installationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInstallationId() {
    return installationId;
  }


  public void setInstallationId(String installationId) {
    this.installationId = installationId;
  }


  public RefreshToken token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public RefreshToken accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public RefreshToken accessTokenExpires(OffsetDateTime accessTokenExpires) {
    
    this.accessTokenExpires = accessTokenExpires;
    return this;
  }

   /**
   * Get accessTokenExpires
   * @return accessTokenExpires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getAccessTokenExpires() {
    return accessTokenExpires;
  }


  public void setAccessTokenExpires(OffsetDateTime accessTokenExpires) {
    this.accessTokenExpires = accessTokenExpires;
  }


  public RefreshToken expires(OffsetDateTime expires) {
    
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpires() {
    return expires;
  }


  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }


   /**
   * Get isExpired
   * @return isExpired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsExpired() {
    return isExpired;
  }




  public RefreshToken created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public RefreshToken revoked(OffsetDateTime revoked) {
    
    this.revoked = revoked;
    return this;
  }

   /**
   * Get revoked
   * @return revoked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getRevoked() {
    return revoked;
  }


  public void setRevoked(OffsetDateTime revoked) {
    this.revoked = revoked;
  }


   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsActive() {
    return isActive;
  }




  public RefreshToken userId(UUID userId) {
    
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


  public RefreshToken user(ApplicationUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationUser getUser() {
    return user;
  }


  public void setUser(ApplicationUser user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefreshToken refreshToken = (RefreshToken) o;
    return Objects.equals(this.createdBy, refreshToken.createdBy) &&
        Objects.equals(this.createdAtUtc, refreshToken.createdAtUtc) &&
        Objects.equals(this.updatedBy, refreshToken.updatedBy) &&
        Objects.equals(this.updatedAtUtc, refreshToken.updatedAtUtc) &&
        Objects.equals(this.createdByUser, refreshToken.createdByUser) &&
        Objects.equals(this.updatedByUser, refreshToken.updatedByUser) &&
        Objects.equals(this.deletedBy, refreshToken.deletedBy) &&
        Objects.equals(this.deletedAtUtc, refreshToken.deletedAtUtc) &&
        Objects.equals(this.deletedByUser, refreshToken.deletedByUser) &&
        Objects.equals(this.id, refreshToken.id) &&
        Objects.equals(this.installationId, refreshToken.installationId) &&
        Objects.equals(this.token, refreshToken.token) &&
        Objects.equals(this.accessToken, refreshToken.accessToken) &&
        Objects.equals(this.accessTokenExpires, refreshToken.accessTokenExpires) &&
        Objects.equals(this.expires, refreshToken.expires) &&
        Objects.equals(this.isExpired, refreshToken.isExpired) &&
        Objects.equals(this.created, refreshToken.created) &&
        Objects.equals(this.revoked, refreshToken.revoked) &&
        Objects.equals(this.isActive, refreshToken.isActive) &&
        Objects.equals(this.userId, refreshToken.userId) &&
        Objects.equals(this.user, refreshToken.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdAtUtc, updatedBy, updatedAtUtc, createdByUser, updatedByUser, deletedBy, deletedAtUtc, deletedByUser, id, installationId, token, accessToken, accessTokenExpires, expires, isExpired, created, revoked, isActive, userId, user);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent()
      ? (a.get().getClass().isArray() ? Arrays.hashCode((T[])a.get()) : Objects.hashCode(a.get()))
      : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefreshToken {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAtUtc: ").append(toIndentedString(createdAtUtc)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedAtUtc: ").append(toIndentedString(updatedAtUtc)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    updatedByUser: ").append(toIndentedString(updatedByUser)).append("\n");
    sb.append("    deletedBy: ").append(toIndentedString(deletedBy)).append("\n");
    sb.append("    deletedAtUtc: ").append(toIndentedString(deletedAtUtc)).append("\n");
    sb.append("    deletedByUser: ").append(toIndentedString(deletedByUser)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    installationId: ").append(toIndentedString(installationId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    accessTokenExpires: ").append(toIndentedString(accessTokenExpires)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    isExpired: ").append(toIndentedString(isExpired)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    revoked: ").append(toIndentedString(revoked)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

