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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PushUriResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-30T10:35:53.315065290Z[Etc/UTC]")
public class PushUriResponse {
  public static final String SERIALIZED_NAME_RESPONSE_STATUS = "responseStatus";
  @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS)
  private String responseStatus;

  public static final String SERIALIZED_NAME_RESPONSE_MESSAGE = "responseMessage";
  @SerializedName(SERIALIZED_NAME_RESPONSE_MESSAGE)
  private String responseMessage;

  public static final String SERIALIZED_NAME_NS2 = "ns2";
  @SerializedName(SERIALIZED_NAME_NS2)
  private String ns2;

  public static final String SERIALIZED_NAME_VER = "ver";
  @SerializedName(SERIALIZED_NAME_VER)
  private String ver;

  public static final String SERIALIZED_NAME_TS = "ts";
  @SerializedName(SERIALIZED_NAME_TS)
  private String ts;

  public static final String SERIALIZED_NAME_TXN = "txn";
  @SerializedName(SERIALIZED_NAME_TXN)
  private String txn;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public PushUriResponse() { 
  }

  public PushUriResponse responseStatus(String responseStatus) {
    
    this.responseStatus = responseStatus;
    return this;
  }

   /**
   * Get responseStatus
   * @return responseStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResponseStatus() {
    return responseStatus;
  }


  public void setResponseStatus(String responseStatus) {
    this.responseStatus = responseStatus;
  }


  public PushUriResponse responseMessage(String responseMessage) {
    
    this.responseMessage = responseMessage;
    return this;
  }

   /**
   * Get responseMessage
   * @return responseMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResponseMessage() {
    return responseMessage;
  }


  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }


  public PushUriResponse ns2(String ns2) {
    
    this.ns2 = ns2;
    return this;
  }

   /**
   * Get ns2
   * @return ns2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNs2() {
    return ns2;
  }


  public void setNs2(String ns2) {
    this.ns2 = ns2;
  }


  public PushUriResponse ver(String ver) {
    
    this.ver = ver;
    return this;
  }

   /**
   * Get ver
   * @return ver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVer() {
    return ver;
  }


  public void setVer(String ver) {
    this.ver = ver;
  }


  public PushUriResponse ts(String ts) {
    
    this.ts = ts;
    return this;
  }

   /**
   * Get ts
   * @return ts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTs() {
    return ts;
  }


  public void setTs(String ts) {
    this.ts = ts;
  }


  public PushUriResponse txn(String txn) {
    
    this.txn = txn;
    return this;
  }

   /**
   * Get txn
   * @return txn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTxn() {
    return txn;
  }


  public void setTxn(String txn) {
    this.txn = txn;
  }


  public PushUriResponse orgId(String orgId) {
    
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrgId() {
    return orgId;
  }


  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushUriResponse pushUriResponse = (PushUriResponse) o;
    return Objects.equals(this.responseStatus, pushUriResponse.responseStatus) &&
        Objects.equals(this.responseMessage, pushUriResponse.responseMessage) &&
        Objects.equals(this.ns2, pushUriResponse.ns2) &&
        Objects.equals(this.ver, pushUriResponse.ver) &&
        Objects.equals(this.ts, pushUriResponse.ts) &&
        Objects.equals(this.txn, pushUriResponse.txn) &&
        Objects.equals(this.orgId, pushUriResponse.orgId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseStatus, responseMessage, ns2, ver, ts, txn, orgId);
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
    sb.append("class PushUriResponse {\n");
    sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
    sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
    sb.append("    ns2: ").append(toIndentedString(ns2)).append("\n");
    sb.append("    ver: ").append(toIndentedString(ver)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    txn: ").append(toIndentedString(txn)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
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

