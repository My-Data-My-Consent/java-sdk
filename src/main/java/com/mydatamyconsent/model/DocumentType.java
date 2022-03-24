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
import com.mydatamyconsent.model.DocumentCategoryType;
import com.mydatamyconsent.model.DocumentSubCategoryType;
import com.mydatamyconsent.model.SupportedEntityType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * Issuable Document Type details.
 */
@ApiModel(description = "Issuable Document Type details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-24T10:35:29.713278495Z[Etc/UTC]")
public class DocumentType {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CATEGORY_TYPE = "categoryType";
  @SerializedName(SERIALIZED_NAME_CATEGORY_TYPE)
  private DocumentCategoryType categoryType;

  public static final String SERIALIZED_NAME_SUB_CATEGORY_TYPE = "subCategoryType";
  @SerializedName(SERIALIZED_NAME_SUB_CATEGORY_TYPE)
  private DocumentSubCategoryType subCategoryType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LOGO_URL = "logoUrl";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_SEARCH_SERVICE_NAME = "searchServiceName";
  @SerializedName(SERIALIZED_NAME_SEARCH_SERVICE_NAME)
  private String searchServiceName;

  public static final String SERIALIZED_NAME_REPOSITORY_SERVICE_NAME = "repositoryServiceName";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_SERVICE_NAME)
  private String repositoryServiceName;

  public static final String SERIALIZED_NAME_SUPPORTED_ENTITY_TYPES = "supportedEntityTypes";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_ENTITY_TYPES)
  private List<SupportedEntityType> supportedEntityTypes = new ArrayList<SupportedEntityType>();

  public static final String SERIALIZED_NAME_ADDED_BY = "addedBy";
  @SerializedName(SERIALIZED_NAME_ADDED_BY)
  private String addedBy;

  public static final String SERIALIZED_NAME_PAYABLE_AMOUNT = "payableAmount";
  @SerializedName(SERIALIZED_NAME_PAYABLE_AMOUNT)
  private Double payableAmount;

  public static final String SERIALIZED_NAME_PAYABLE_AMOUNT_CURRENCY = "payableAmountCurrency";
  @SerializedName(SERIALIZED_NAME_PAYABLE_AMOUNT_CURRENCY)
  private String payableAmountCurrency;

  public static final String SERIALIZED_NAME_APPROVED_AT_UTC = "approvedAtUtc";
  @SerializedName(SERIALIZED_NAME_APPROVED_AT_UTC)
  private OffsetDateTime approvedAtUtc;

  public static final String SERIALIZED_NAME_APPROVED = "approved";
  @SerializedName(SERIALIZED_NAME_APPROVED)
  private Boolean approved;

  public DocumentType() { 
  }

  public DocumentType id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Document Type Identifier.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document Type Identifier.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public DocumentType categoryType(DocumentCategoryType categoryType) {
    
    this.categoryType = categoryType;
    return this;
  }

   /**
   * Get categoryType
   * @return categoryType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DocumentCategoryType getCategoryType() {
    return categoryType;
  }


  public void setCategoryType(DocumentCategoryType categoryType) {
    this.categoryType = categoryType;
  }


  public DocumentType subCategoryType(DocumentSubCategoryType subCategoryType) {
    
    this.subCategoryType = subCategoryType;
    return this;
  }

   /**
   * Get subCategoryType
   * @return subCategoryType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DocumentSubCategoryType getSubCategoryType() {
    return subCategoryType;
  }


  public void setSubCategoryType(DocumentSubCategoryType subCategoryType) {
    this.subCategoryType = subCategoryType;
  }


  public DocumentType name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Document Type Name. eg: Driving License.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document Type Name. eg: Driving License.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DocumentType slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Document Type Unique Slug. eg: \&quot;in.gov.gj.transport.dl\&quot;.
   * @return slug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document Type Unique Slug. eg: \"in.gov.gj.transport.dl\".")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  public DocumentType description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Document Type description. eg: Gujarat State Driving License.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document Type description. eg: Gujarat State Driving License.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DocumentType logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Logo URL of document type.
   * @return logoUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Logo URL of document type.")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public DocumentType searchServiceName(String searchServiceName) {
    
    this.searchServiceName = searchServiceName;
    return this;
  }

   /**
   * Document search repository service name.
   * @return searchServiceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document search repository service name.")

  public String getSearchServiceName() {
    return searchServiceName;
  }


  public void setSearchServiceName(String searchServiceName) {
    this.searchServiceName = searchServiceName;
  }


  public DocumentType repositoryServiceName(String repositoryServiceName) {
    
    this.repositoryServiceName = repositoryServiceName;
    return this;
  }

   /**
   * Document repository service name.
   * @return repositoryServiceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document repository service name.")

  public String getRepositoryServiceName() {
    return repositoryServiceName;
  }


  public void setRepositoryServiceName(String repositoryServiceName) {
    this.repositoryServiceName = repositoryServiceName;
  }


  public DocumentType supportedEntityTypes(List<SupportedEntityType> supportedEntityTypes) {
    
    this.supportedEntityTypes = supportedEntityTypes;
    return this;
  }

  public DocumentType addSupportedEntityTypesItem(SupportedEntityType supportedEntityTypesItem) {
    this.supportedEntityTypes.add(supportedEntityTypesItem);
    return this;
  }

   /**
   * Supported entity types. eg: Individual, Organization.
   * @return supportedEntityTypes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Supported entity types. eg: Individual, Organization.")

  public List<SupportedEntityType> getSupportedEntityTypes() {
    return supportedEntityTypes;
  }


  public void setSupportedEntityTypes(List<SupportedEntityType> supportedEntityTypes) {
    this.supportedEntityTypes = supportedEntityTypes;
  }


  public DocumentType addedBy(String addedBy) {
    
    this.addedBy = addedBy;
    return this;
  }

   /**
   * Name of the document type creator.
   * @return addedBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the document type creator.")

  public String getAddedBy() {
    return addedBy;
  }


  public void setAddedBy(String addedBy) {
    this.addedBy = addedBy;
  }


  public DocumentType payableAmount(Double payableAmount) {
    
    this.payableAmount = payableAmount;
    return this;
  }

   /**
   * Payable amount if document is chargeable. eg: 10.25.
   * @return payableAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payable amount if document is chargeable. eg: 10.25.")

  public Double getPayableAmount() {
    return payableAmount;
  }


  public void setPayableAmount(Double payableAmount) {
    this.payableAmount = payableAmount;
  }


  public DocumentType payableAmountCurrency(String payableAmountCurrency) {
    
    this.payableAmountCurrency = payableAmountCurrency;
    return this;
  }

   /**
   * Payable amount currency. eg: INR, USD etc.,.
   * @return payableAmountCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payable amount currency. eg: INR, USD etc.,.")

  public String getPayableAmountCurrency() {
    return payableAmountCurrency;
  }


  public void setPayableAmountCurrency(String payableAmountCurrency) {
    this.payableAmountCurrency = payableAmountCurrency;
  }


  public DocumentType approvedAtUtc(OffsetDateTime approvedAtUtc) {
    
    this.approvedAtUtc = approvedAtUtc;
    return this;
  }

   /**
   * DateTime of approval in UTC timezone.
   * @return approvedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DateTime of approval in UTC timezone.")

  public OffsetDateTime getApprovedAtUtc() {
    return approvedAtUtc;
  }


  public void setApprovedAtUtc(OffsetDateTime approvedAtUtc) {
    this.approvedAtUtc = approvedAtUtc;
  }


  public DocumentType approved(Boolean approved) {
    
    this.approved = approved;
    return this;
  }

   /**
   * Document type approval status.
   * @return approved
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document type approval status.")

  public Boolean getApproved() {
    return approved;
  }


  public void setApproved(Boolean approved) {
    this.approved = approved;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentType documentType = (DocumentType) o;
    return Objects.equals(this.id, documentType.id) &&
        Objects.equals(this.categoryType, documentType.categoryType) &&
        Objects.equals(this.subCategoryType, documentType.subCategoryType) &&
        Objects.equals(this.name, documentType.name) &&
        Objects.equals(this.slug, documentType.slug) &&
        Objects.equals(this.description, documentType.description) &&
        Objects.equals(this.logoUrl, documentType.logoUrl) &&
        Objects.equals(this.searchServiceName, documentType.searchServiceName) &&
        Objects.equals(this.repositoryServiceName, documentType.repositoryServiceName) &&
        Objects.equals(this.supportedEntityTypes, documentType.supportedEntityTypes) &&
        Objects.equals(this.addedBy, documentType.addedBy) &&
        Objects.equals(this.payableAmount, documentType.payableAmount) &&
        Objects.equals(this.payableAmountCurrency, documentType.payableAmountCurrency) &&
        Objects.equals(this.approvedAtUtc, documentType.approvedAtUtc) &&
        Objects.equals(this.approved, documentType.approved);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, categoryType, subCategoryType, name, slug, description, logoUrl, searchServiceName, repositoryServiceName, supportedEntityTypes, addedBy, payableAmount, payableAmountCurrency, approvedAtUtc, approved);
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
    sb.append("class DocumentType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    categoryType: ").append(toIndentedString(categoryType)).append("\n");
    sb.append("    subCategoryType: ").append(toIndentedString(subCategoryType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    searchServiceName: ").append(toIndentedString(searchServiceName)).append("\n");
    sb.append("    repositoryServiceName: ").append(toIndentedString(repositoryServiceName)).append("\n");
    sb.append("    supportedEntityTypes: ").append(toIndentedString(supportedEntityTypes)).append("\n");
    sb.append("    addedBy: ").append(toIndentedString(addedBy)).append("\n");
    sb.append("    payableAmount: ").append(toIndentedString(payableAmount)).append("\n");
    sb.append("    payableAmountCurrency: ").append(toIndentedString(payableAmountCurrency)).append("\n");
    sb.append("    approvedAtUtc: ").append(toIndentedString(approvedAtUtc)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
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

