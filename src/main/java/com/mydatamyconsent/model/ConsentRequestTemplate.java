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
import com.mydatamyconsent.model.ConsentRequestTemplateStatus;
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
 * ConsentRequestTemplate : Consent request template.
 */
@ApiModel(description = "ConsentRequestTemplate : Consent request template.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-22T10:36:00.118561430Z[Etc/UTC]")
public class ConsentRequestTemplate {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PURPOSE = "purpose";
  @SerializedName(SERIALIZED_NAME_PURPOSE)
  private String purpose;

  public static final String SERIALIZED_NAME_SHORT_ID = "shortId";
  @SerializedName(SERIALIZED_NAME_SHORT_ID)
  private String shortId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ConsentRequestTemplateStatus status;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CREATED_AT_UTC = "createdAtUtc";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_UTC)
  private OffsetDateTime createdAtUtc;

  public static final String SERIALIZED_NAME_APPROVED_AT_UTC = "approvedAtUtc";
  @SerializedName(SERIALIZED_NAME_APPROVED_AT_UTC)
  private OffsetDateTime approvedAtUtc;

  public static final String SERIALIZED_NAME_REJECTED_AT_UTC = "rejectedAtUtc";
  @SerializedName(SERIALIZED_NAME_REJECTED_AT_UTC)
  private OffsetDateTime rejectedAtUtc;

  public static final String SERIALIZED_NAME_REJECTION_REASON = "rejectionReason";
  @SerializedName(SERIALIZED_NAME_REJECTION_REASON)
  private String rejectionReason;

  public ConsentRequestTemplate() {
  }

  public ConsentRequestTemplate id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Consent request template id.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request template id.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ConsentRequestTemplate title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Consent request template title.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request template title.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ConsentRequestTemplate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Consent request template description.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request template description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ConsentRequestTemplate purpose(String purpose) {
    
    this.purpose = purpose;
    return this;
  }

   /**
   * Consent request template purpose.
   * @return purpose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request template purpose.")

  public String getPurpose() {
    return purpose;
  }


  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  public ConsentRequestTemplate shortId(String shortId) {
    
    this.shortId = shortId;
    return this;
  }

   /**
   * Consent request template short Id.
   * @return shortId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request template short Id.")

  public String getShortId() {
    return shortId;
  }


  public void setShortId(String shortId) {
    this.shortId = shortId;
  }


  public ConsentRequestTemplate status(ConsentRequestTemplateStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ConsentRequestTemplateStatus getStatus() {
    return status;
  }


  public void setStatus(ConsentRequestTemplateStatus status) {
    this.status = status;
  }


  public ConsentRequestTemplate createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Consent request template created by user.
   * @return createdBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request template created by user.")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public ConsentRequestTemplate createdAtUtc(OffsetDateTime createdAtUtc) {
    
    this.createdAtUtc = createdAtUtc;
    return this;
  }

   /**
   * Consent request template created datetime in UTC timezone.
   * @return createdAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Consent request template created datetime in UTC timezone.")

  public OffsetDateTime getCreatedAtUtc() {
    return createdAtUtc;
  }


  public void setCreatedAtUtc(OffsetDateTime createdAtUtc) {
    this.createdAtUtc = createdAtUtc;
  }


  public ConsentRequestTemplate approvedAtUtc(OffsetDateTime approvedAtUtc) {
    
    this.approvedAtUtc = approvedAtUtc;
    return this;
  }

   /**
   * Consent request template approval datetime in UTC timezone.
   * @return approvedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request template approval datetime in UTC timezone.")

  public OffsetDateTime getApprovedAtUtc() {
    return approvedAtUtc;
  }


  public void setApprovedAtUtc(OffsetDateTime approvedAtUtc) {
    this.approvedAtUtc = approvedAtUtc;
  }


  public ConsentRequestTemplate rejectedAtUtc(OffsetDateTime rejectedAtUtc) {
    
    this.rejectedAtUtc = rejectedAtUtc;
    return this;
  }

   /**
   * Consent request template rejection datetime in UTC timezone.
   * @return rejectedAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request template rejection datetime in UTC timezone.")

  public OffsetDateTime getRejectedAtUtc() {
    return rejectedAtUtc;
  }


  public void setRejectedAtUtc(OffsetDateTime rejectedAtUtc) {
    this.rejectedAtUtc = rejectedAtUtc;
  }


  public ConsentRequestTemplate rejectionReason(String rejectionReason) {
    
    this.rejectionReason = rejectionReason;
    return this;
  }

   /**
   * Consent request template rejection reason.
   * @return rejectionReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Consent request template rejection reason.")

  public String getRejectionReason() {
    return rejectionReason;
  }


  public void setRejectionReason(String rejectionReason) {
    this.rejectionReason = rejectionReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentRequestTemplate consentRequestTemplate = (ConsentRequestTemplate) o;
    return Objects.equals(this.id, consentRequestTemplate.id) &&
        Objects.equals(this.title, consentRequestTemplate.title) &&
        Objects.equals(this.description, consentRequestTemplate.description) &&
        Objects.equals(this.purpose, consentRequestTemplate.purpose) &&
        Objects.equals(this.shortId, consentRequestTemplate.shortId) &&
        Objects.equals(this.status, consentRequestTemplate.status) &&
        Objects.equals(this.createdBy, consentRequestTemplate.createdBy) &&
        Objects.equals(this.createdAtUtc, consentRequestTemplate.createdAtUtc) &&
        Objects.equals(this.approvedAtUtc, consentRequestTemplate.approvedAtUtc) &&
        Objects.equals(this.rejectedAtUtc, consentRequestTemplate.rejectedAtUtc) &&
        Objects.equals(this.rejectionReason, consentRequestTemplate.rejectionReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, purpose, shortId, status, createdBy, createdAtUtc, approvedAtUtc, rejectedAtUtc, rejectionReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentRequestTemplate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAtUtc: ").append(toIndentedString(createdAtUtc)).append("\n");
    sb.append("    approvedAtUtc: ").append(toIndentedString(approvedAtUtc)).append("\n");
    sb.append("    rejectedAtUtc: ").append(toIndentedString(rejectedAtUtc)).append("\n");
    sb.append("    rejectionReason: ").append(toIndentedString(rejectionReason)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("purpose");
    openapiFields.add("shortId");
    openapiFields.add("status");
    openapiFields.add("createdBy");
    openapiFields.add("createdAtUtc");
    openapiFields.add("approvedAtUtc");
    openapiFields.add("rejectedAtUtc");
    openapiFields.add("rejectionReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("shortId");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("createdBy");
    openapiRequiredFields.add("createdAtUtc");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConsentRequestTemplate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConsentRequestTemplate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsentRequestTemplate is not found in the empty JSON string", ConsentRequestTemplate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConsentRequestTemplate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsentRequestTemplate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConsentRequestTemplate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("purpose") != null && !jsonObj.get("purpose").isJsonNull()) && !jsonObj.get("purpose").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purpose` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purpose").toString()));
      }
      if ((jsonObj.get("shortId") != null && !jsonObj.get("shortId").isJsonNull()) && !jsonObj.get("shortId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortId").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        ConsentRequestTemplateStatus.validateJsonObject(jsonObj.getAsJsonObject("status"));
      }
      if ((jsonObj.get("createdBy") != null && !jsonObj.get("createdBy").isJsonNull()) && !jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      if ((jsonObj.get("rejectionReason") != null && !jsonObj.get("rejectionReason").isJsonNull()) && !jsonObj.get("rejectionReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rejectionReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rejectionReason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsentRequestTemplate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsentRequestTemplate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsentRequestTemplate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsentRequestTemplate.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsentRequestTemplate>() {
           @Override
           public void write(JsonWriter out, ConsentRequestTemplate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsentRequestTemplate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConsentRequestTemplate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConsentRequestTemplate
  * @throws IOException if the JSON string is invalid with respect to ConsentRequestTemplate
  */
  public static ConsentRequestTemplate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsentRequestTemplate.class);
  }

 /**
  * Convert an instance of ConsentRequestTemplate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

