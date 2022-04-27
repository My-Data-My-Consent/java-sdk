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
import com.mydatamyconsent.model.DataProtectionOfficer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * DataProvider
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-27T10:37:04.552457587Z[Etc/UTC]")
public class DataProvider {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_LOGO_URL = "logoUrl";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_SUPPORT_EMAIL = "supportEmail";
  @SerializedName(SERIALIZED_NAME_SUPPORT_EMAIL)
  private String supportEmail;

  public static final String SERIALIZED_NAME_HELP_LINE_NUMBER = "helpLineNumber";
  @SerializedName(SERIALIZED_NAME_HELP_LINE_NUMBER)
  private String helpLineNumber;

  public static final String SERIALIZED_NAME_PRIVACY_POLICY = "privacyPolicy";
  @SerializedName(SERIALIZED_NAME_PRIVACY_POLICY)
  private String privacyPolicy;

  public static final String SERIALIZED_NAME_TERM_OF_SERVICE = "termOfService";
  @SerializedName(SERIALIZED_NAME_TERM_OF_SERVICE)
  private String termOfService;

  public static final String SERIALIZED_NAME_DATA_PROTECTION_OFFICER = "dataProtectionOfficer";
  @SerializedName(SERIALIZED_NAME_DATA_PROTECTION_OFFICER)
  private DataProtectionOfficer dataProtectionOfficer;

  public static final String SERIALIZED_NAME_SUPPORTED_DOCUMENT_TYPES = "supportedDocumentTypes";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_DOCUMENT_TYPES)
  private List<String> supportedDocumentTypes = new ArrayList<String>();

  public static final String SERIALIZED_NAME_SUPPORTED_ACCOUNT_TYPES = "supportedAccountTypes";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_ACCOUNT_TYPES)
  private List<String> supportedAccountTypes = null;

  public DataProvider() { 
  }

  public DataProvider id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DataProvider name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DataProvider category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public DataProvider logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public DataProvider website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  public DataProvider supportEmail(String supportEmail) {
    
    this.supportEmail = supportEmail;
    return this;
  }

   /**
   * Get supportEmail
   * @return supportEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSupportEmail() {
    return supportEmail;
  }


  public void setSupportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
  }


  public DataProvider helpLineNumber(String helpLineNumber) {
    
    this.helpLineNumber = helpLineNumber;
    return this;
  }

   /**
   * Get helpLineNumber
   * @return helpLineNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHelpLineNumber() {
    return helpLineNumber;
  }


  public void setHelpLineNumber(String helpLineNumber) {
    this.helpLineNumber = helpLineNumber;
  }


  public DataProvider privacyPolicy(String privacyPolicy) {
    
    this.privacyPolicy = privacyPolicy;
    return this;
  }

   /**
   * Get privacyPolicy
   * @return privacyPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrivacyPolicy() {
    return privacyPolicy;
  }


  public void setPrivacyPolicy(String privacyPolicy) {
    this.privacyPolicy = privacyPolicy;
  }


  public DataProvider termOfService(String termOfService) {
    
    this.termOfService = termOfService;
    return this;
  }

   /**
   * Get termOfService
   * @return termOfService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTermOfService() {
    return termOfService;
  }


  public void setTermOfService(String termOfService) {
    this.termOfService = termOfService;
  }


  public DataProvider dataProtectionOfficer(DataProtectionOfficer dataProtectionOfficer) {
    
    this.dataProtectionOfficer = dataProtectionOfficer;
    return this;
  }

   /**
   * Get dataProtectionOfficer
   * @return dataProtectionOfficer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DataProtectionOfficer getDataProtectionOfficer() {
    return dataProtectionOfficer;
  }


  public void setDataProtectionOfficer(DataProtectionOfficer dataProtectionOfficer) {
    this.dataProtectionOfficer = dataProtectionOfficer;
  }


  public DataProvider supportedDocumentTypes(List<String> supportedDocumentTypes) {
    
    this.supportedDocumentTypes = supportedDocumentTypes;
    return this;
  }

  public DataProvider addSupportedDocumentTypesItem(String supportedDocumentTypesItem) {
    this.supportedDocumentTypes.add(supportedDocumentTypesItem);
    return this;
  }

   /**
   * Get supportedDocumentTypes
   * @return supportedDocumentTypes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getSupportedDocumentTypes() {
    return supportedDocumentTypes;
  }


  public void setSupportedDocumentTypes(List<String> supportedDocumentTypes) {
    this.supportedDocumentTypes = supportedDocumentTypes;
  }


  public DataProvider supportedAccountTypes(List<String> supportedAccountTypes) {
    
    this.supportedAccountTypes = supportedAccountTypes;
    return this;
  }

  public DataProvider addSupportedAccountTypesItem(String supportedAccountTypesItem) {
    if (this.supportedAccountTypes == null) {
      this.supportedAccountTypes = new ArrayList<String>();
    }
    this.supportedAccountTypes.add(supportedAccountTypesItem);
    return this;
  }

   /**
   * Get supportedAccountTypes
   * @return supportedAccountTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSupportedAccountTypes() {
    return supportedAccountTypes;
  }


  public void setSupportedAccountTypes(List<String> supportedAccountTypes) {
    this.supportedAccountTypes = supportedAccountTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataProvider dataProvider = (DataProvider) o;
    return Objects.equals(this.id, dataProvider.id) &&
        Objects.equals(this.name, dataProvider.name) &&
        Objects.equals(this.category, dataProvider.category) &&
        Objects.equals(this.logoUrl, dataProvider.logoUrl) &&
        Objects.equals(this.website, dataProvider.website) &&
        Objects.equals(this.supportEmail, dataProvider.supportEmail) &&
        Objects.equals(this.helpLineNumber, dataProvider.helpLineNumber) &&
        Objects.equals(this.privacyPolicy, dataProvider.privacyPolicy) &&
        Objects.equals(this.termOfService, dataProvider.termOfService) &&
        Objects.equals(this.dataProtectionOfficer, dataProvider.dataProtectionOfficer) &&
        Objects.equals(this.supportedDocumentTypes, dataProvider.supportedDocumentTypes) &&
        Objects.equals(this.supportedAccountTypes, dataProvider.supportedAccountTypes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, category, logoUrl, website, supportEmail, helpLineNumber, privacyPolicy, termOfService, dataProtectionOfficer, supportedDocumentTypes, supportedAccountTypes);
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
    sb.append("class DataProvider {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    supportEmail: ").append(toIndentedString(supportEmail)).append("\n");
    sb.append("    helpLineNumber: ").append(toIndentedString(helpLineNumber)).append("\n");
    sb.append("    privacyPolicy: ").append(toIndentedString(privacyPolicy)).append("\n");
    sb.append("    termOfService: ").append(toIndentedString(termOfService)).append("\n");
    sb.append("    dataProtectionOfficer: ").append(toIndentedString(dataProtectionOfficer)).append("\n");
    sb.append("    supportedDocumentTypes: ").append(toIndentedString(supportedDocumentTypes)).append("\n");
    sb.append("    supportedAccountTypes: ").append(toIndentedString(supportedAccountTypes)).append("\n");
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

