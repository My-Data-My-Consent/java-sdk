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
import com.mydatamyconsent.model.DocumentIssueRequestDetailsReceiver;
import com.mydatamyconsent.model.DocumentIssueRequestStatus;
import com.mydatamyconsent.model.PaymentRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * DocumentIssueRequestDetails : Document issue request details.
 */
@ApiModel(description = "DocumentIssueRequestDetails : Document issue request details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-20T10:36:46.395666745Z[Etc/UTC]")
public class DocumentIssueRequestDetails {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE_ID = "documentTypeId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE_ID)
  private String documentTypeId;

  public static final String SERIALIZED_NAME_TYPE_NAME = "typeName";
  @SerializedName(SERIALIZED_NAME_TYPE_NAME)
  private String typeName;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DocumentIssueRequestStatus status;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RECEIVER = "receiver";
  @SerializedName(SERIALIZED_NAME_RECEIVER)
  private DocumentIssueRequestDetailsReceiver receiver;

  public static final String SERIALIZED_NAME_PAYMENT_REQUEST = "paymentRequest";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REQUEST)
  private PaymentRequest paymentRequest;

  public static final String SERIALIZED_NAME_ISSUED_AT_UTC = "issuedAtUtc";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT_UTC)
  private OffsetDateTime issuedAtUtc;

  public static final String SERIALIZED_NAME_VALID_FROM_UTC = "validFromUtc";
  @SerializedName(SERIALIZED_NAME_VALID_FROM_UTC)
  private OffsetDateTime validFromUtc;

  public static final String SERIALIZED_NAME_EXPIRES_AT_UTC = "expiresAtUtc";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT_UTC)
  private OffsetDateTime expiresAtUtc;

  public static final String SERIALIZED_NAME_META_DATA = "metaData";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private Object metaData = null;

  public static final String SERIALIZED_NAME_CREATED_AT_UTC = "createdAtUtc";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_UTC)
  private OffsetDateTime createdAtUtc;

  public DocumentIssueRequestDetails() {
  }

  public DocumentIssueRequestDetails id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Document issue request Id.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document issue request Id.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DocumentIssueRequestDetails documentTypeId(String documentTypeId) {
    
    this.documentTypeId = documentTypeId;
    return this;
  }

   /**
   * Document type Id.
   * @return documentTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document type Id.")

  public String getDocumentTypeId() {
    return documentTypeId;
  }


  public void setDocumentTypeId(String documentTypeId) {
    this.documentTypeId = documentTypeId;
  }


  public DocumentIssueRequestDetails typeName(String typeName) {
    
    this.typeName = typeName;
    return this;
  }

   /**
   * Document type name.
   * @return typeName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document type name.")

  public String getTypeName() {
    return typeName;
  }


  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  public DocumentIssueRequestDetails identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Document identifier.
   * @return identifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document identifier.")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public DocumentIssueRequestDetails status(DocumentIssueRequestStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DocumentIssueRequestStatus getStatus() {
    return status;
  }


  public void setStatus(DocumentIssueRequestStatus status) {
    this.status = status;
  }


  public DocumentIssueRequestDetails description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Document description.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DocumentIssueRequestDetails receiver(DocumentIssueRequestDetailsReceiver receiver) {
    
    this.receiver = receiver;
    return this;
  }

   /**
   * Get receiver
   * @return receiver
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DocumentIssueRequestDetailsReceiver getReceiver() {
    return receiver;
  }


  public void setReceiver(DocumentIssueRequestDetailsReceiver receiver) {
    this.receiver = receiver;
  }


  public DocumentIssueRequestDetails paymentRequest(PaymentRequest paymentRequest) {
    
    this.paymentRequest = paymentRequest;
    return this;
  }

   /**
   * Get paymentRequest
   * @return paymentRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentRequest getPaymentRequest() {
    return paymentRequest;
  }


  public void setPaymentRequest(PaymentRequest paymentRequest) {
    this.paymentRequest = paymentRequest;
  }


  public DocumentIssueRequestDetails issuedAtUtc(OffsetDateTime issuedAtUtc) {
    
    this.issuedAtUtc = issuedAtUtc;
    return this;
  }

   /**
   * Datetime of issue in UTC timezone.
   * @return issuedAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Datetime of issue in UTC timezone.")

  public OffsetDateTime getIssuedAtUtc() {
    return issuedAtUtc;
  }


  public void setIssuedAtUtc(OffsetDateTime issuedAtUtc) {
    this.issuedAtUtc = issuedAtUtc;
  }


  public DocumentIssueRequestDetails validFromUtc(OffsetDateTime validFromUtc) {
    
    this.validFromUtc = validFromUtc;
    return this;
  }

   /**
   * Valid from datetime in UTC timezone.
   * @return validFromUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Valid from datetime in UTC timezone.")

  public OffsetDateTime getValidFromUtc() {
    return validFromUtc;
  }


  public void setValidFromUtc(OffsetDateTime validFromUtc) {
    this.validFromUtc = validFromUtc;
  }


  public DocumentIssueRequestDetails expiresAtUtc(OffsetDateTime expiresAtUtc) {
    
    this.expiresAtUtc = expiresAtUtc;
    return this;
  }

   /**
   * Datetime of expiry in UTC timezone.
   * @return expiresAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datetime of expiry in UTC timezone.")

  public OffsetDateTime getExpiresAtUtc() {
    return expiresAtUtc;
  }


  public void setExpiresAtUtc(OffsetDateTime expiresAtUtc) {
    this.expiresAtUtc = expiresAtUtc;
  }


  public DocumentIssueRequestDetails metaData(Object metaData) {
    
    this.metaData = metaData;
    return this;
  }

   /**
   * Metadata.
   * @return metaData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata.")

  public Object getMetaData() {
    return metaData;
  }


  public void setMetaData(Object metaData) {
    this.metaData = metaData;
  }


  public DocumentIssueRequestDetails createdAtUtc(OffsetDateTime createdAtUtc) {
    
    this.createdAtUtc = createdAtUtc;
    return this;
  }

   /**
   * Creation datetime of issue request in UTC timezone.
   * @return createdAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Creation datetime of issue request in UTC timezone.")

  public OffsetDateTime getCreatedAtUtc() {
    return createdAtUtc;
  }


  public void setCreatedAtUtc(OffsetDateTime createdAtUtc) {
    this.createdAtUtc = createdAtUtc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentIssueRequestDetails documentIssueRequestDetails = (DocumentIssueRequestDetails) o;
    return Objects.equals(this.id, documentIssueRequestDetails.id) &&
        Objects.equals(this.documentTypeId, documentIssueRequestDetails.documentTypeId) &&
        Objects.equals(this.typeName, documentIssueRequestDetails.typeName) &&
        Objects.equals(this.identifier, documentIssueRequestDetails.identifier) &&
        Objects.equals(this.status, documentIssueRequestDetails.status) &&
        Objects.equals(this.description, documentIssueRequestDetails.description) &&
        Objects.equals(this.receiver, documentIssueRequestDetails.receiver) &&
        Objects.equals(this.paymentRequest, documentIssueRequestDetails.paymentRequest) &&
        Objects.equals(this.issuedAtUtc, documentIssueRequestDetails.issuedAtUtc) &&
        Objects.equals(this.validFromUtc, documentIssueRequestDetails.validFromUtc) &&
        Objects.equals(this.expiresAtUtc, documentIssueRequestDetails.expiresAtUtc) &&
        Objects.equals(this.metaData, documentIssueRequestDetails.metaData) &&
        Objects.equals(this.createdAtUtc, documentIssueRequestDetails.createdAtUtc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, documentTypeId, typeName, identifier, status, description, receiver, paymentRequest, issuedAtUtc, validFromUtc, expiresAtUtc, metaData, createdAtUtc);
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
    sb.append("class DocumentIssueRequestDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    documentTypeId: ").append(toIndentedString(documentTypeId)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    paymentRequest: ").append(toIndentedString(paymentRequest)).append("\n");
    sb.append("    issuedAtUtc: ").append(toIndentedString(issuedAtUtc)).append("\n");
    sb.append("    validFromUtc: ").append(toIndentedString(validFromUtc)).append("\n");
    sb.append("    expiresAtUtc: ").append(toIndentedString(expiresAtUtc)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    createdAtUtc: ").append(toIndentedString(createdAtUtc)).append("\n");
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
    openapiFields.add("documentTypeId");
    openapiFields.add("typeName");
    openapiFields.add("identifier");
    openapiFields.add("status");
    openapiFields.add("description");
    openapiFields.add("receiver");
    openapiFields.add("paymentRequest");
    openapiFields.add("issuedAtUtc");
    openapiFields.add("validFromUtc");
    openapiFields.add("expiresAtUtc");
    openapiFields.add("metaData");
    openapiFields.add("createdAtUtc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("documentTypeId");
    openapiRequiredFields.add("typeName");
    openapiRequiredFields.add("identifier");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("receiver");
    openapiRequiredFields.add("issuedAtUtc");
    openapiRequiredFields.add("validFromUtc");
    openapiRequiredFields.add("createdAtUtc");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocumentIssueRequestDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DocumentIssueRequestDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentIssueRequestDetails is not found in the empty JSON string", DocumentIssueRequestDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DocumentIssueRequestDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentIssueRequestDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DocumentIssueRequestDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("documentTypeId") != null && !jsonObj.get("documentTypeId").isJsonNull()) && !jsonObj.get("documentTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentTypeId").toString()));
      }
      if ((jsonObj.get("typeName") != null && !jsonObj.get("typeName").isJsonNull()) && !jsonObj.get("typeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typeName").toString()));
      }
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `receiver`
      if (jsonObj.get("receiver") != null && !jsonObj.get("receiver").isJsonNull()) {
        DocumentIssueRequestDetailsReceiver.validateJsonObject(jsonObj.getAsJsonObject("receiver"));
      }
      // validate the optional field `paymentRequest`
      if (jsonObj.get("paymentRequest") != null && !jsonObj.get("paymentRequest").isJsonNull()) {
        PaymentRequest.validateJsonObject(jsonObj.getAsJsonObject("paymentRequest"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentIssueRequestDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentIssueRequestDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentIssueRequestDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentIssueRequestDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentIssueRequestDetails>() {
           @Override
           public void write(JsonWriter out, DocumentIssueRequestDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentIssueRequestDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentIssueRequestDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentIssueRequestDetails
  * @throws IOException if the JSON string is invalid with respect to DocumentIssueRequestDetails
  */
  public static DocumentIssueRequestDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentIssueRequestDetails.class);
  }

 /**
  * Convert an instance of DocumentIssueRequestDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

