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
import com.mydatamyconsent.model.CategoryIconFontFamily;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * DocumentProviderCategory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T10:04:53.682265678Z[Etc/UTC]")
public class DocumentProviderCategory {
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

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ICON_CODE_POINT = "iconCodePoint";
  @SerializedName(SERIALIZED_NAME_ICON_CODE_POINT)
  private Integer iconCodePoint;

  public static final String SERIALIZED_NAME_ICON_FONT_FAMILY = "iconFontFamily";
  @SerializedName(SERIALIZED_NAME_ICON_FONT_FAMILY)
  private CategoryIconFontFamily iconFontFamily;

  public static final String SERIALIZED_NAME_META_DATA = "metaData";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private Object metaData = null;


  public DocumentProviderCategory createdBy(UUID createdBy) {
    
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


  public DocumentProviderCategory createdAtUtc(OffsetDateTime createdAtUtc) {
    
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


  public DocumentProviderCategory updatedBy(UUID updatedBy) {
    
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


  public DocumentProviderCategory updatedAtUtc(OffsetDateTime updatedAtUtc) {
    
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


  public DocumentProviderCategory createdByUser(ApplicationUser createdByUser) {
    
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


  public DocumentProviderCategory updatedByUser(ApplicationUser updatedByUser) {
    
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


  public DocumentProviderCategory deletedBy(UUID deletedBy) {
    
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


  public DocumentProviderCategory deletedAtUtc(OffsetDateTime deletedAtUtc) {
    
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


  public DocumentProviderCategory deletedByUser(ApplicationUser deletedByUser) {
    
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


  public DocumentProviderCategory id(UUID id) {
    
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


  public DocumentProviderCategory name(String name) {
    
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


  public DocumentProviderCategory iconCodePoint(Integer iconCodePoint) {
    
    this.iconCodePoint = iconCodePoint;
    return this;
  }

   /**
   * Get iconCodePoint
   * @return iconCodePoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIconCodePoint() {
    return iconCodePoint;
  }


  public void setIconCodePoint(Integer iconCodePoint) {
    this.iconCodePoint = iconCodePoint;
  }


  public DocumentProviderCategory iconFontFamily(CategoryIconFontFamily iconFontFamily) {
    
    this.iconFontFamily = iconFontFamily;
    return this;
  }

   /**
   * Get iconFontFamily
   * @return iconFontFamily
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CategoryIconFontFamily getIconFontFamily() {
    return iconFontFamily;
  }


  public void setIconFontFamily(CategoryIconFontFamily iconFontFamily) {
    this.iconFontFamily = iconFontFamily;
  }


  public DocumentProviderCategory metaData(Object metaData) {
    
    this.metaData = metaData;
    return this;
  }

   /**
   * Get metaData
   * @return metaData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMetaData() {
    return metaData;
  }


  public void setMetaData(Object metaData) {
    this.metaData = metaData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentProviderCategory documentProviderCategory = (DocumentProviderCategory) o;
    return Objects.equals(this.createdBy, documentProviderCategory.createdBy) &&
        Objects.equals(this.createdAtUtc, documentProviderCategory.createdAtUtc) &&
        Objects.equals(this.updatedBy, documentProviderCategory.updatedBy) &&
        Objects.equals(this.updatedAtUtc, documentProviderCategory.updatedAtUtc) &&
        Objects.equals(this.createdByUser, documentProviderCategory.createdByUser) &&
        Objects.equals(this.updatedByUser, documentProviderCategory.updatedByUser) &&
        Objects.equals(this.deletedBy, documentProviderCategory.deletedBy) &&
        Objects.equals(this.deletedAtUtc, documentProviderCategory.deletedAtUtc) &&
        Objects.equals(this.deletedByUser, documentProviderCategory.deletedByUser) &&
        Objects.equals(this.id, documentProviderCategory.id) &&
        Objects.equals(this.name, documentProviderCategory.name) &&
        Objects.equals(this.iconCodePoint, documentProviderCategory.iconCodePoint) &&
        Objects.equals(this.iconFontFamily, documentProviderCategory.iconFontFamily) &&
        Objects.equals(this.metaData, documentProviderCategory.metaData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdAtUtc, updatedBy, updatedAtUtc, createdByUser, updatedByUser, deletedBy, deletedAtUtc, deletedByUser, id, name, iconCodePoint, iconFontFamily, metaData);
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
    sb.append("class DocumentProviderCategory {\n");
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
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    iconCodePoint: ").append(toIndentedString(iconCodePoint)).append("\n");
    sb.append("    iconFontFamily: ").append(toIndentedString(iconFontFamily)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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

