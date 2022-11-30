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
import com.mydatamyconsent.model.MutualFundFundType;
import com.mydatamyconsent.model.MutualFundHoldingMode;
import com.mydatamyconsent.model.MutualFundSchemeCategory;
import com.mydatamyconsent.model.MutualFundSchemeOption;
import com.mydatamyconsent.model.MutualFundSchemePlan;
import com.mydatamyconsent.model.MutualFundSchemeType;
import com.mydatamyconsent.model.MutualFundTransactionType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * FinancialAccountMutualFundTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-30T10:35:25.825720195Z[Etc/UTC]")
public class FinancialAccountMutualFundTransaction {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private MutualFundTransactionType type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_AMC = "amc";
  @SerializedName(SERIALIZED_NAME_AMC)
  private String amc;

  public static final String SERIALIZED_NAME_REGISTRAR = "registrar";
  @SerializedName(SERIALIZED_NAME_REGISTRAR)
  private String registrar;

  public static final String SERIALIZED_NAME_SCHEME_CODE = "scheme_code";
  @SerializedName(SERIALIZED_NAME_SCHEME_CODE)
  private String schemeCode;

  public static final String SERIALIZED_NAME_SCHEME_PLAN = "scheme_plan";
  @SerializedName(SERIALIZED_NAME_SCHEME_PLAN)
  private MutualFundSchemePlan schemePlan;

  public static final String SERIALIZED_NAME_ISIN = "isin";
  @SerializedName(SERIALIZED_NAME_ISIN)
  private String isin;

  public static final String SERIALIZED_NAME_AMFI_CODE = "amfi_code";
  @SerializedName(SERIALIZED_NAME_AMFI_CODE)
  private String amfiCode;

  public static final String SERIALIZED_NAME_FUND_TYPE = "fund_type";
  @SerializedName(SERIALIZED_NAME_FUND_TYPE)
  private MutualFundFundType fundType;

  public static final String SERIALIZED_NAME_SCHEME_OPTION = "scheme_option";
  @SerializedName(SERIALIZED_NAME_SCHEME_OPTION)
  private MutualFundSchemeOption schemeOption;

  public static final String SERIALIZED_NAME_SCHEME_TYPES = "scheme_types";
  @SerializedName(SERIALIZED_NAME_SCHEME_TYPES)
  private MutualFundSchemeType schemeTypes;

  public static final String SERIALIZED_NAME_SCHEME_CATEGORY = "scheme_category";
  @SerializedName(SERIALIZED_NAME_SCHEME_CATEGORY)
  private MutualFundSchemeCategory schemeCategory;

  public static final String SERIALIZED_NAME_UCC = "ucc";
  @SerializedName(SERIALIZED_NAME_UCC)
  private String ucc;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CLOSING_UNITS = "closing_units";
  @SerializedName(SERIALIZED_NAME_CLOSING_UNITS)
  private String closingUnits;

  public static final String SERIALIZED_NAME_LIEN_UNITS = "lien_units";
  @SerializedName(SERIALIZED_NAME_LIEN_UNITS)
  private String lienUnits;

  public static final String SERIALIZED_NAME_NAV = "nav";
  @SerializedName(SERIALIZED_NAME_NAV)
  private String nav;

  public static final String SERIALIZED_NAME_NAV_DATE = "nav_date";
  @SerializedName(SERIALIZED_NAME_NAV_DATE)
  private OffsetDateTime navDate;

  public static final String SERIALIZED_NAME_ORDER_DATE = "order_date";
  @SerializedName(SERIALIZED_NAME_ORDER_DATE)
  private OffsetDateTime orderDate;

  public static final String SERIALIZED_NAME_EXECUTION_DATE = "execution_date";
  @SerializedName(SERIALIZED_NAME_EXECUTION_DATE)
  private OffsetDateTime executionDate;

  public static final String SERIALIZED_NAME_LOCKIN_FLAG = "lockin_flag";
  @SerializedName(SERIALIZED_NAME_LOCKIN_FLAG)
  private String lockinFlag;

  public static final String SERIALIZED_NAME_LOCKIN_DAYS = "lockin_days";
  @SerializedName(SERIALIZED_NAME_LOCKIN_DAYS)
  private String lockinDays;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private MutualFundHoldingMode mode;

  public static final String SERIALIZED_NAME_NARRATION = "narration";
  @SerializedName(SERIALIZED_NAME_NARRATION)
  private String narration;

  public FinancialAccountMutualFundTransaction() {
  }

  public FinancialAccountMutualFundTransaction type(MutualFundTransactionType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MutualFundTransactionType getType() {
    return type;
  }


  public void setType(MutualFundTransactionType type) {
    this.type = type;
  }


  public FinancialAccountMutualFundTransaction id(String id) {
    
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


  public FinancialAccountMutualFundTransaction amc(String amc) {
    
    this.amc = amc;
    return this;
  }

   /**
   * Get amc
   * @return amc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAmc() {
    return amc;
  }


  public void setAmc(String amc) {
    this.amc = amc;
  }


  public FinancialAccountMutualFundTransaction registrar(String registrar) {
    
    this.registrar = registrar;
    return this;
  }

   /**
   * Get registrar
   * @return registrar
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRegistrar() {
    return registrar;
  }


  public void setRegistrar(String registrar) {
    this.registrar = registrar;
  }


  public FinancialAccountMutualFundTransaction schemeCode(String schemeCode) {
    
    this.schemeCode = schemeCode;
    return this;
  }

   /**
   * Get schemeCode
   * @return schemeCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSchemeCode() {
    return schemeCode;
  }


  public void setSchemeCode(String schemeCode) {
    this.schemeCode = schemeCode;
  }


  public FinancialAccountMutualFundTransaction schemePlan(MutualFundSchemePlan schemePlan) {
    
    this.schemePlan = schemePlan;
    return this;
  }

   /**
   * Get schemePlan
   * @return schemePlan
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MutualFundSchemePlan getSchemePlan() {
    return schemePlan;
  }


  public void setSchemePlan(MutualFundSchemePlan schemePlan) {
    this.schemePlan = schemePlan;
  }


  public FinancialAccountMutualFundTransaction isin(String isin) {
    
    this.isin = isin;
    return this;
  }

   /**
   * Get isin
   * @return isin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIsin() {
    return isin;
  }


  public void setIsin(String isin) {
    this.isin = isin;
  }


  public FinancialAccountMutualFundTransaction amfiCode(String amfiCode) {
    
    this.amfiCode = amfiCode;
    return this;
  }

   /**
   * Get amfiCode
   * @return amfiCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAmfiCode() {
    return amfiCode;
  }


  public void setAmfiCode(String amfiCode) {
    this.amfiCode = amfiCode;
  }


  public FinancialAccountMutualFundTransaction fundType(MutualFundFundType fundType) {
    
    this.fundType = fundType;
    return this;
  }

   /**
   * Get fundType
   * @return fundType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MutualFundFundType getFundType() {
    return fundType;
  }


  public void setFundType(MutualFundFundType fundType) {
    this.fundType = fundType;
  }


  public FinancialAccountMutualFundTransaction schemeOption(MutualFundSchemeOption schemeOption) {
    
    this.schemeOption = schemeOption;
    return this;
  }

   /**
   * Get schemeOption
   * @return schemeOption
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MutualFundSchemeOption getSchemeOption() {
    return schemeOption;
  }


  public void setSchemeOption(MutualFundSchemeOption schemeOption) {
    this.schemeOption = schemeOption;
  }


  public FinancialAccountMutualFundTransaction schemeTypes(MutualFundSchemeType schemeTypes) {
    
    this.schemeTypes = schemeTypes;
    return this;
  }

   /**
   * Get schemeTypes
   * @return schemeTypes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MutualFundSchemeType getSchemeTypes() {
    return schemeTypes;
  }


  public void setSchemeTypes(MutualFundSchemeType schemeTypes) {
    this.schemeTypes = schemeTypes;
  }


  public FinancialAccountMutualFundTransaction schemeCategory(MutualFundSchemeCategory schemeCategory) {
    
    this.schemeCategory = schemeCategory;
    return this;
  }

   /**
   * Get schemeCategory
   * @return schemeCategory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MutualFundSchemeCategory getSchemeCategory() {
    return schemeCategory;
  }


  public void setSchemeCategory(MutualFundSchemeCategory schemeCategory) {
    this.schemeCategory = schemeCategory;
  }


  public FinancialAccountMutualFundTransaction ucc(String ucc) {
    
    this.ucc = ucc;
    return this;
  }

   /**
   * Get ucc
   * @return ucc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUcc() {
    return ucc;
  }


  public void setUcc(String ucc) {
    this.ucc = ucc;
  }


  public FinancialAccountMutualFundTransaction amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public FinancialAccountMutualFundTransaction closingUnits(String closingUnits) {
    
    this.closingUnits = closingUnits;
    return this;
  }

   /**
   * Get closingUnits
   * @return closingUnits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getClosingUnits() {
    return closingUnits;
  }


  public void setClosingUnits(String closingUnits) {
    this.closingUnits = closingUnits;
  }


  public FinancialAccountMutualFundTransaction lienUnits(String lienUnits) {
    
    this.lienUnits = lienUnits;
    return this;
  }

   /**
   * Get lienUnits
   * @return lienUnits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLienUnits() {
    return lienUnits;
  }


  public void setLienUnits(String lienUnits) {
    this.lienUnits = lienUnits;
  }


  public FinancialAccountMutualFundTransaction nav(String nav) {
    
    this.nav = nav;
    return this;
  }

   /**
   * Get nav
   * @return nav
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNav() {
    return nav;
  }


  public void setNav(String nav) {
    this.nav = nav;
  }


  public FinancialAccountMutualFundTransaction navDate(OffsetDateTime navDate) {
    
    this.navDate = navDate;
    return this;
  }

   /**
   * Get navDate
   * @return navDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getNavDate() {
    return navDate;
  }


  public void setNavDate(OffsetDateTime navDate) {
    this.navDate = navDate;
  }


  public FinancialAccountMutualFundTransaction orderDate(OffsetDateTime orderDate) {
    
    this.orderDate = orderDate;
    return this;
  }

   /**
   * Get orderDate
   * @return orderDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getOrderDate() {
    return orderDate;
  }


  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }


  public FinancialAccountMutualFundTransaction executionDate(OffsetDateTime executionDate) {
    
    this.executionDate = executionDate;
    return this;
  }

   /**
   * Get executionDate
   * @return executionDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getExecutionDate() {
    return executionDate;
  }


  public void setExecutionDate(OffsetDateTime executionDate) {
    this.executionDate = executionDate;
  }


  public FinancialAccountMutualFundTransaction lockinFlag(String lockinFlag) {
    
    this.lockinFlag = lockinFlag;
    return this;
  }

   /**
   * Get lockinFlag
   * @return lockinFlag
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLockinFlag() {
    return lockinFlag;
  }


  public void setLockinFlag(String lockinFlag) {
    this.lockinFlag = lockinFlag;
  }


  public FinancialAccountMutualFundTransaction lockinDays(String lockinDays) {
    
    this.lockinDays = lockinDays;
    return this;
  }

   /**
   * Get lockinDays
   * @return lockinDays
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLockinDays() {
    return lockinDays;
  }


  public void setLockinDays(String lockinDays) {
    this.lockinDays = lockinDays;
  }


  public FinancialAccountMutualFundTransaction mode(MutualFundHoldingMode mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MutualFundHoldingMode getMode() {
    return mode;
  }


  public void setMode(MutualFundHoldingMode mode) {
    this.mode = mode;
  }


  public FinancialAccountMutualFundTransaction narration(String narration) {
    
    this.narration = narration;
    return this;
  }

   /**
   * Get narration
   * @return narration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNarration() {
    return narration;
  }


  public void setNarration(String narration) {
    this.narration = narration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialAccountMutualFundTransaction financialAccountMutualFundTransaction = (FinancialAccountMutualFundTransaction) o;
    return Objects.equals(this.type, financialAccountMutualFundTransaction.type) &&
        Objects.equals(this.id, financialAccountMutualFundTransaction.id) &&
        Objects.equals(this.amc, financialAccountMutualFundTransaction.amc) &&
        Objects.equals(this.registrar, financialAccountMutualFundTransaction.registrar) &&
        Objects.equals(this.schemeCode, financialAccountMutualFundTransaction.schemeCode) &&
        Objects.equals(this.schemePlan, financialAccountMutualFundTransaction.schemePlan) &&
        Objects.equals(this.isin, financialAccountMutualFundTransaction.isin) &&
        Objects.equals(this.amfiCode, financialAccountMutualFundTransaction.amfiCode) &&
        Objects.equals(this.fundType, financialAccountMutualFundTransaction.fundType) &&
        Objects.equals(this.schemeOption, financialAccountMutualFundTransaction.schemeOption) &&
        Objects.equals(this.schemeTypes, financialAccountMutualFundTransaction.schemeTypes) &&
        Objects.equals(this.schemeCategory, financialAccountMutualFundTransaction.schemeCategory) &&
        Objects.equals(this.ucc, financialAccountMutualFundTransaction.ucc) &&
        Objects.equals(this.amount, financialAccountMutualFundTransaction.amount) &&
        Objects.equals(this.closingUnits, financialAccountMutualFundTransaction.closingUnits) &&
        Objects.equals(this.lienUnits, financialAccountMutualFundTransaction.lienUnits) &&
        Objects.equals(this.nav, financialAccountMutualFundTransaction.nav) &&
        Objects.equals(this.navDate, financialAccountMutualFundTransaction.navDate) &&
        Objects.equals(this.orderDate, financialAccountMutualFundTransaction.orderDate) &&
        Objects.equals(this.executionDate, financialAccountMutualFundTransaction.executionDate) &&
        Objects.equals(this.lockinFlag, financialAccountMutualFundTransaction.lockinFlag) &&
        Objects.equals(this.lockinDays, financialAccountMutualFundTransaction.lockinDays) &&
        Objects.equals(this.mode, financialAccountMutualFundTransaction.mode) &&
        Objects.equals(this.narration, financialAccountMutualFundTransaction.narration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, amc, registrar, schemeCode, schemePlan, isin, amfiCode, fundType, schemeOption, schemeTypes, schemeCategory, ucc, amount, closingUnits, lienUnits, nav, navDate, orderDate, executionDate, lockinFlag, lockinDays, mode, narration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialAccountMutualFundTransaction {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amc: ").append(toIndentedString(amc)).append("\n");
    sb.append("    registrar: ").append(toIndentedString(registrar)).append("\n");
    sb.append("    schemeCode: ").append(toIndentedString(schemeCode)).append("\n");
    sb.append("    schemePlan: ").append(toIndentedString(schemePlan)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    amfiCode: ").append(toIndentedString(amfiCode)).append("\n");
    sb.append("    fundType: ").append(toIndentedString(fundType)).append("\n");
    sb.append("    schemeOption: ").append(toIndentedString(schemeOption)).append("\n");
    sb.append("    schemeTypes: ").append(toIndentedString(schemeTypes)).append("\n");
    sb.append("    schemeCategory: ").append(toIndentedString(schemeCategory)).append("\n");
    sb.append("    ucc: ").append(toIndentedString(ucc)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    closingUnits: ").append(toIndentedString(closingUnits)).append("\n");
    sb.append("    lienUnits: ").append(toIndentedString(lienUnits)).append("\n");
    sb.append("    nav: ").append(toIndentedString(nav)).append("\n");
    sb.append("    navDate: ").append(toIndentedString(navDate)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    lockinFlag: ").append(toIndentedString(lockinFlag)).append("\n");
    sb.append("    lockinDays: ").append(toIndentedString(lockinDays)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    narration: ").append(toIndentedString(narration)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("id");
    openapiFields.add("amc");
    openapiFields.add("registrar");
    openapiFields.add("scheme_code");
    openapiFields.add("scheme_plan");
    openapiFields.add("isin");
    openapiFields.add("amfi_code");
    openapiFields.add("fund_type");
    openapiFields.add("scheme_option");
    openapiFields.add("scheme_types");
    openapiFields.add("scheme_category");
    openapiFields.add("ucc");
    openapiFields.add("amount");
    openapiFields.add("closing_units");
    openapiFields.add("lien_units");
    openapiFields.add("nav");
    openapiFields.add("nav_date");
    openapiFields.add("order_date");
    openapiFields.add("execution_date");
    openapiFields.add("lockin_flag");
    openapiFields.add("lockin_days");
    openapiFields.add("mode");
    openapiFields.add("narration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("amc");
    openapiRequiredFields.add("registrar");
    openapiRequiredFields.add("scheme_code");
    openapiRequiredFields.add("scheme_plan");
    openapiRequiredFields.add("isin");
    openapiRequiredFields.add("amfi_code");
    openapiRequiredFields.add("fund_type");
    openapiRequiredFields.add("scheme_option");
    openapiRequiredFields.add("scheme_types");
    openapiRequiredFields.add("scheme_category");
    openapiRequiredFields.add("ucc");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("closing_units");
    openapiRequiredFields.add("lien_units");
    openapiRequiredFields.add("nav");
    openapiRequiredFields.add("nav_date");
    openapiRequiredFields.add("order_date");
    openapiRequiredFields.add("execution_date");
    openapiRequiredFields.add("lockin_flag");
    openapiRequiredFields.add("lockin_days");
    openapiRequiredFields.add("mode");
    openapiRequiredFields.add("narration");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FinancialAccountMutualFundTransaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FinancialAccountMutualFundTransaction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinancialAccountMutualFundTransaction is not found in the empty JSON string", FinancialAccountMutualFundTransaction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinancialAccountMutualFundTransaction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinancialAccountMutualFundTransaction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FinancialAccountMutualFundTransaction.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("amc") != null && !jsonObj.get("amc").isJsonNull()) && !jsonObj.get("amc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amc").toString()));
      }
      if ((jsonObj.get("registrar") != null && !jsonObj.get("registrar").isJsonNull()) && !jsonObj.get("registrar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrar").toString()));
      }
      if ((jsonObj.get("scheme_code") != null && !jsonObj.get("scheme_code").isJsonNull()) && !jsonObj.get("scheme_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheme_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheme_code").toString()));
      }
      if ((jsonObj.get("isin") != null && !jsonObj.get("isin").isJsonNull()) && !jsonObj.get("isin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isin").toString()));
      }
      if ((jsonObj.get("amfi_code") != null && !jsonObj.get("amfi_code").isJsonNull()) && !jsonObj.get("amfi_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amfi_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amfi_code").toString()));
      }
      if ((jsonObj.get("ucc") != null && !jsonObj.get("ucc").isJsonNull()) && !jsonObj.get("ucc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ucc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ucc").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("closing_units") != null && !jsonObj.get("closing_units").isJsonNull()) && !jsonObj.get("closing_units").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `closing_units` to be a primitive type in the JSON string but got `%s`", jsonObj.get("closing_units").toString()));
      }
      if ((jsonObj.get("lien_units") != null && !jsonObj.get("lien_units").isJsonNull()) && !jsonObj.get("lien_units").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lien_units` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lien_units").toString()));
      }
      if ((jsonObj.get("nav") != null && !jsonObj.get("nav").isJsonNull()) && !jsonObj.get("nav").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nav` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nav").toString()));
      }
      if ((jsonObj.get("lockin_flag") != null && !jsonObj.get("lockin_flag").isJsonNull()) && !jsonObj.get("lockin_flag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lockin_flag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lockin_flag").toString()));
      }
      if ((jsonObj.get("lockin_days") != null && !jsonObj.get("lockin_days").isJsonNull()) && !jsonObj.get("lockin_days").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lockin_days` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lockin_days").toString()));
      }
      if ((jsonObj.get("narration") != null && !jsonObj.get("narration").isJsonNull()) && !jsonObj.get("narration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `narration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("narration").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinancialAccountMutualFundTransaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinancialAccountMutualFundTransaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinancialAccountMutualFundTransaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinancialAccountMutualFundTransaction.class));

       return (TypeAdapter<T>) new TypeAdapter<FinancialAccountMutualFundTransaction>() {
           @Override
           public void write(JsonWriter out, FinancialAccountMutualFundTransaction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinancialAccountMutualFundTransaction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinancialAccountMutualFundTransaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinancialAccountMutualFundTransaction
  * @throws IOException if the JSON string is invalid with respect to FinancialAccountMutualFundTransaction
  */
  public static FinancialAccountMutualFundTransaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinancialAccountMutualFundTransaction.class);
  }

 /**
  * Convert an instance of FinancialAccountMutualFundTransaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

