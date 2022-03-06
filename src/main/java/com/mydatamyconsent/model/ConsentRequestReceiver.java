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
import com.mydatamyconsent.model.IdentificationStrategy;
import com.mydatamyconsent.model.StringStringKeyValuePair;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Consent request receiver details
 */
@ApiModel(description = "Consent request receiver details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-06T10:34:16.102435984Z[Etc/UTC]")
public class ConsentRequestReceiver {
  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private List<StringStringKeyValuePair> identifiers = null;

  public static final String SERIALIZED_NAME_IDENTIFICATION_STRATEGY = "identificationStrategy";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATION_STRATEGY)
  private IdentificationStrategy identificationStrategy;

  public ConsentRequestReceiver() { 
  }

  public ConsentRequestReceiver identifiers(List<StringStringKeyValuePair> identifiers) {
    
    this.identifiers = identifiers;
    return this;
  }

  public ConsentRequestReceiver addIdentifiersItem(StringStringKeyValuePair identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<StringStringKeyValuePair>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

   /**
   * Consent request receiver identifiers
   * @return identifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request receiver identifiers")

  public List<StringStringKeyValuePair> getIdentifiers() {
    return identifiers;
  }


  public void setIdentifiers(List<StringStringKeyValuePair> identifiers) {
    this.identifiers = identifiers;
  }


  public ConsentRequestReceiver identificationStrategy(IdentificationStrategy identificationStrategy) {
    
    this.identificationStrategy = identificationStrategy;
    return this;
  }

   /**
   * Get identificationStrategy
   * @return identificationStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentificationStrategy getIdentificationStrategy() {
    return identificationStrategy;
  }


  public void setIdentificationStrategy(IdentificationStrategy identificationStrategy) {
    this.identificationStrategy = identificationStrategy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentRequestReceiver consentRequestReceiver = (ConsentRequestReceiver) o;
    return Objects.equals(this.identifiers, consentRequestReceiver.identifiers) &&
        Objects.equals(this.identificationStrategy, consentRequestReceiver.identificationStrategy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifiers, identificationStrategy);
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
    sb.append("class ConsentRequestReceiver {\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    identificationStrategy: ").append(toIndentedString(identificationStrategy)).append("\n");
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

