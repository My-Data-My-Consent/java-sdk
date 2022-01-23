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
import com.mydatamyconsent.model.CollectibleTypes;
import com.mydatamyconsent.model.ConsentTemplateTypes;
import com.mydatamyconsent.model.Document;
import com.mydatamyconsent.model.FetchTypes;
import com.mydatamyconsent.model.Financial;
import com.mydatamyconsent.model.IdentitySupportedFields;
import com.mydatamyconsent.model.Life;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * GetConsentTemplateDetailsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-23T09:17:28.641664129Z[Etc/UTC]")
public class GetConsentTemplateDetailsDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CONSENT_PURPOSE = "consentPurpose";
  @SerializedName(SERIALIZED_NAME_CONSENT_PURPOSE)
  private String consentPurpose;

  public static final String SERIALIZED_NAME_COLLECTABLES = "collectables";
  @SerializedName(SERIALIZED_NAME_COLLECTABLES)
  private List<CollectibleTypes> collectables = null;

  public static final String SERIALIZED_NAME_FETCH_TYPE = "fetchType";
  @SerializedName(SERIALIZED_NAME_FETCH_TYPE)
  private FetchTypes fetchType;

  public static final String SERIALIZED_NAME_SHORT_ID = "shortId";
  @SerializedName(SERIALIZED_NAME_SHORT_ID)
  private String shortId;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CREATED_AT_UTC = "createdAtUtc";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_UTC)
  private OffsetDateTime createdAtUtc;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TEMPLATE_TYPE = "templateType";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TYPE)
  private ConsentTemplateTypes templateType;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private Life frequency;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private List<IdentitySupportedFields> identity = null;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<Document> documents = null;

  public static final String SERIALIZED_NAME_FINANCIALS = "financials";
  @SerializedName(SERIALIZED_NAME_FINANCIALS)
  private List<Financial> financials = null;


  public GetConsentTemplateDetailsDto id(UUID id) {
    
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


  public GetConsentTemplateDetailsDto name(String name) {
    
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


  public GetConsentTemplateDetailsDto description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetConsentTemplateDetailsDto consentPurpose(String consentPurpose) {
    
    this.consentPurpose = consentPurpose;
    return this;
  }

   /**
   * Get consentPurpose
   * @return consentPurpose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsentPurpose() {
    return consentPurpose;
  }


  public void setConsentPurpose(String consentPurpose) {
    this.consentPurpose = consentPurpose;
  }


  public GetConsentTemplateDetailsDto collectables(List<CollectibleTypes> collectables) {
    
    this.collectables = collectables;
    return this;
  }

  public GetConsentTemplateDetailsDto addCollectablesItem(CollectibleTypes collectablesItem) {
    if (this.collectables == null) {
      this.collectables = new ArrayList<CollectibleTypes>();
    }
    this.collectables.add(collectablesItem);
    return this;
  }

   /**
   * Get collectables
   * @return collectables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CollectibleTypes> getCollectables() {
    return collectables;
  }


  public void setCollectables(List<CollectibleTypes> collectables) {
    this.collectables = collectables;
  }


  public GetConsentTemplateDetailsDto fetchType(FetchTypes fetchType) {
    
    this.fetchType = fetchType;
    return this;
  }

   /**
   * Get fetchType
   * @return fetchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FetchTypes getFetchType() {
    return fetchType;
  }


  public void setFetchType(FetchTypes fetchType) {
    this.fetchType = fetchType;
  }


  public GetConsentTemplateDetailsDto shortId(String shortId) {
    
    this.shortId = shortId;
    return this;
  }

   /**
   * Get shortId
   * @return shortId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShortId() {
    return shortId;
  }


  public void setShortId(String shortId) {
    this.shortId = shortId;
  }


  public GetConsentTemplateDetailsDto createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public GetConsentTemplateDetailsDto createdAtUtc(OffsetDateTime createdAtUtc) {
    
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


  public GetConsentTemplateDetailsDto status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public GetConsentTemplateDetailsDto templateType(ConsentTemplateTypes templateType) {
    
    this.templateType = templateType;
    return this;
  }

   /**
   * Get templateType
   * @return templateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsentTemplateTypes getTemplateType() {
    return templateType;
  }


  public void setTemplateType(ConsentTemplateTypes templateType) {
    this.templateType = templateType;
  }


  public GetConsentTemplateDetailsDto frequency(Life frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Life getFrequency() {
    return frequency;
  }


  public void setFrequency(Life frequency) {
    this.frequency = frequency;
  }


  public GetConsentTemplateDetailsDto identity(List<IdentitySupportedFields> identity) {
    
    this.identity = identity;
    return this;
  }

  public GetConsentTemplateDetailsDto addIdentityItem(IdentitySupportedFields identityItem) {
    if (this.identity == null) {
      this.identity = new ArrayList<IdentitySupportedFields>();
    }
    this.identity.add(identityItem);
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IdentitySupportedFields> getIdentity() {
    return identity;
  }


  public void setIdentity(List<IdentitySupportedFields> identity) {
    this.identity = identity;
  }


  public GetConsentTemplateDetailsDto documents(List<Document> documents) {
    
    this.documents = documents;
    return this;
  }

  public GetConsentTemplateDetailsDto addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<Document>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Get documents
   * @return documents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Document> getDocuments() {
    return documents;
  }


  public void setDocuments(List<Document> documents) {
    this.documents = documents;
  }


  public GetConsentTemplateDetailsDto financials(List<Financial> financials) {
    
    this.financials = financials;
    return this;
  }

  public GetConsentTemplateDetailsDto addFinancialsItem(Financial financialsItem) {
    if (this.financials == null) {
      this.financials = new ArrayList<Financial>();
    }
    this.financials.add(financialsItem);
    return this;
  }

   /**
   * Get financials
   * @return financials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Financial> getFinancials() {
    return financials;
  }


  public void setFinancials(List<Financial> financials) {
    this.financials = financials;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetConsentTemplateDetailsDto getConsentTemplateDetailsDto = (GetConsentTemplateDetailsDto) o;
    return Objects.equals(this.id, getConsentTemplateDetailsDto.id) &&
        Objects.equals(this.name, getConsentTemplateDetailsDto.name) &&
        Objects.equals(this.description, getConsentTemplateDetailsDto.description) &&
        Objects.equals(this.consentPurpose, getConsentTemplateDetailsDto.consentPurpose) &&
        Objects.equals(this.collectables, getConsentTemplateDetailsDto.collectables) &&
        Objects.equals(this.fetchType, getConsentTemplateDetailsDto.fetchType) &&
        Objects.equals(this.shortId, getConsentTemplateDetailsDto.shortId) &&
        Objects.equals(this.createdBy, getConsentTemplateDetailsDto.createdBy) &&
        Objects.equals(this.createdAtUtc, getConsentTemplateDetailsDto.createdAtUtc) &&
        Objects.equals(this.status, getConsentTemplateDetailsDto.status) &&
        Objects.equals(this.templateType, getConsentTemplateDetailsDto.templateType) &&
        Objects.equals(this.frequency, getConsentTemplateDetailsDto.frequency) &&
        Objects.equals(this.identity, getConsentTemplateDetailsDto.identity) &&
        Objects.equals(this.documents, getConsentTemplateDetailsDto.documents) &&
        Objects.equals(this.financials, getConsentTemplateDetailsDto.financials);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, consentPurpose, collectables, fetchType, shortId, createdBy, createdAtUtc, status, templateType, frequency, identity, documents, financials);
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
    sb.append("class GetConsentTemplateDetailsDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    consentPurpose: ").append(toIndentedString(consentPurpose)).append("\n");
    sb.append("    collectables: ").append(toIndentedString(collectables)).append("\n");
    sb.append("    fetchType: ").append(toIndentedString(fetchType)).append("\n");
    sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAtUtc: ").append(toIndentedString(createdAtUtc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    financials: ").append(toIndentedString(financials)).append("\n");
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

