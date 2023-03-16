/*
 * My Data My Consent - Developer API
 * Unleashing the power of consent by establishing trust. The Platform Core Developer API defines a set of capabilities that can be used to request, issue, manage and update data, documents and credentials by organizations. The API can be used to request, manage and update Decentralised Identifiers, Financial Data, Health Data issue Documents, Credentials directly or using OpenID Connect flows, and verify Messages signed with DIDs and much more.
 *
 * The version of the OpenAPI document: 1.0
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
import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.mydatamyconsent.JSON;

/**
 * DocumentType : Issuable Document Type details.
 */
@ApiModel(description = "DocumentType : Issuable Document Type details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-16T10:37:10.536926942Z[Etc/UTC]")
public class DocumentType {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

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

  public static final String SERIALIZED_NAME_SUPPORTED_ENTITY_TYPE = "supportedEntityType";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_ENTITY_TYPE)
  private SupportedEntityType supportedEntityType;

  public static final String SERIALIZED_NAME_ADDED_BY = "addedBy";
  @SerializedName(SERIALIZED_NAME_ADDED_BY)
  private String addedBy;

  public static final String SERIALIZED_NAME_PAYABLE_AMOUNT = "payableAmount";
  @SerializedName(SERIALIZED_NAME_PAYABLE_AMOUNT)
  private BigDecimal payableAmount;

  public static final String SERIALIZED_NAME_PAYABLE_AMOUNT_CURRENCY = "payableAmountCurrency";
  @SerializedName(SERIALIZED_NAME_PAYABLE_AMOUNT_CURRENCY)
  private String payableAmountCurrency;

  public static final String SERIALIZED_NAME_APPROVED_AT_UTC = "approvedAtUtc";
  @SerializedName(SERIALIZED_NAME_APPROVED_AT_UTC)
  private OffsetDateTime approvedAtUtc;

  public DocumentType() {
  }

  public DocumentType id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Document Type Identifier.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document Type Identifier.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
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
   * Document Type Unique Slug. eg: \\\&quot;in.gov.gj.transport.dl\\\&quot;.
   * @return slug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document Type Unique Slug. eg: \\\"in.gov.gj.transport.dl\\\".")

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


  public DocumentType supportedEntityType(SupportedEntityType supportedEntityType) {
    
    this.supportedEntityType = supportedEntityType;
    return this;
  }

   /**
   * Get supportedEntityType
   * @return supportedEntityType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SupportedEntityType getSupportedEntityType() {
    return supportedEntityType;
  }


  public void setSupportedEntityType(SupportedEntityType supportedEntityType) {
    this.supportedEntityType = supportedEntityType;
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


  public DocumentType payableAmount(BigDecimal payableAmount) {
    
    this.payableAmount = payableAmount;
    return this;
  }

   /**
   * Payable amount if document is chargeable. eg: 10.25.
   * @return payableAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Payable amount if document is chargeable. eg: 10.25.")

  public BigDecimal getPayableAmount() {
    return payableAmount;
  }


  public void setPayableAmount(BigDecimal payableAmount) {
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
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Payable amount currency. eg: INR, USD etc.,.")

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
        Objects.equals(this.supportedEntityType, documentType.supportedEntityType) &&
        Objects.equals(this.addedBy, documentType.addedBy) &&
        Objects.equals(this.payableAmount, documentType.payableAmount) &&
        Objects.equals(this.payableAmountCurrency, documentType.payableAmountCurrency) &&
        Objects.equals(this.approvedAtUtc, documentType.approvedAtUtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, categoryType, subCategoryType, name, slug, description, logoUrl, searchServiceName, repositoryServiceName, supportedEntityType, addedBy, payableAmount, payableAmountCurrency, approvedAtUtc);
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
    sb.append("    supportedEntityType: ").append(toIndentedString(supportedEntityType)).append("\n");
    sb.append("    addedBy: ").append(toIndentedString(addedBy)).append("\n");
    sb.append("    payableAmount: ").append(toIndentedString(payableAmount)).append("\n");
    sb.append("    payableAmountCurrency: ").append(toIndentedString(payableAmountCurrency)).append("\n");
    sb.append("    approvedAtUtc: ").append(toIndentedString(approvedAtUtc)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("categoryType");
    openapiFields.add("subCategoryType");
    openapiFields.add("name");
    openapiFields.add("slug");
    openapiFields.add("description");
    openapiFields.add("logoUrl");
    openapiFields.add("searchServiceName");
    openapiFields.add("repositoryServiceName");
    openapiFields.add("supportedEntityType");
    openapiFields.add("addedBy");
    openapiFields.add("payableAmount");
    openapiFields.add("payableAmountCurrency");
    openapiFields.add("approvedAtUtc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("categoryType");
    openapiRequiredFields.add("subCategoryType");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("slug");
    openapiRequiredFields.add("logoUrl");
    openapiRequiredFields.add("supportedEntityType");
    openapiRequiredFields.add("addedBy");
    openapiRequiredFields.add("payableAmount");
    openapiRequiredFields.add("payableAmountCurrency");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocumentType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DocumentType.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentType is not found in the empty JSON string", DocumentType.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DocumentType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentType` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DocumentType.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonNull()) && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("logoUrl") != null && !jsonObj.get("logoUrl").isJsonNull()) && !jsonObj.get("logoUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoUrl").toString()));
      }
      if ((jsonObj.get("searchServiceName") != null && !jsonObj.get("searchServiceName").isJsonNull()) && !jsonObj.get("searchServiceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchServiceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchServiceName").toString()));
      }
      if ((jsonObj.get("repositoryServiceName") != null && !jsonObj.get("repositoryServiceName").isJsonNull()) && !jsonObj.get("repositoryServiceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repositoryServiceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repositoryServiceName").toString()));
      }
      // validate the optional field `supportedEntityType`
      if (jsonObj.get("supportedEntityType") != null && !jsonObj.get("supportedEntityType").isJsonNull()) {
        SupportedEntityType.validateJsonObject(jsonObj.getAsJsonObject("supportedEntityType"));
      }
      if ((jsonObj.get("addedBy") != null && !jsonObj.get("addedBy").isJsonNull()) && !jsonObj.get("addedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addedBy").toString()));
      }
      if ((jsonObj.get("payableAmount") != null && !jsonObj.get("payableAmount").isJsonNull()) && !jsonObj.get("payableAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payableAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payableAmount").toString()));
      }
      if ((jsonObj.get("payableAmountCurrency") != null && !jsonObj.get("payableAmountCurrency").isJsonNull()) && !jsonObj.get("payableAmountCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payableAmountCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payableAmountCurrency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentType.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentType>() {
           @Override
           public void write(JsonWriter out, DocumentType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentType
  * @throws IOException if the JSON string is invalid with respect to DocumentType
  */
  public static DocumentType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentType.class);
  }

 /**
  * Convert an instance of DocumentType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

