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
import com.mydatamyconsent.model.ConsentDocumentIssuer;
import com.mydatamyconsent.model.DocumentDigitalSignature;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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
 * ConsentedDocument : Consented document details.
 */
@ApiModel(description = "ConsentedDocument : Consented document details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-25T10:33:36.003716622Z[Etc/UTC]")
public class ConsentedDocument {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_FIELD_TITLE = "fieldTitle";
  @SerializedName(SERIALIZED_NAME_FIELD_TITLE)
  private String fieldTitle;

  public static final String SERIALIZED_NAME_FIELD_SLUG = "fieldSlug";
  @SerializedName(SERIALIZED_NAME_FIELD_SLUG)
  private String fieldSlug;

  public static final String SERIALIZED_NAME_ISSUED_AT_UTC = "issuedAtUtc";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT_UTC)
  private OffsetDateTime issuedAtUtc;

  public static final String SERIALIZED_NAME_EXPIRES_AT_UTC = "expiresAtUtc";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT_UTC)
  private OffsetDateTime expiresAtUtc;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private ConsentDocumentIssuer issuer;

  public static final String SERIALIZED_NAME_DIGITAL_SIGNATURES = "digitalSignatures";
  @SerializedName(SERIALIZED_NAME_DIGITAL_SIGNATURES)
  private List<DocumentDigitalSignature> digitalSignatures = new ArrayList<>();

  public ConsentedDocument() {
  }

  public ConsentedDocument id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Document id.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document id.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ConsentedDocument name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Document name.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ConsentedDocument category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Document category.
   * @return category
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document category.")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public ConsentedDocument identifier(String identifier) {
    
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


  public ConsentedDocument fieldTitle(String fieldTitle) {
    
    this.fieldTitle = fieldTitle;
    return this;
  }

   /**
   * Document field title.
   * @return fieldTitle
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document field title.")

  public String getFieldTitle() {
    return fieldTitle;
  }


  public void setFieldTitle(String fieldTitle) {
    this.fieldTitle = fieldTitle;
  }


  public ConsentedDocument fieldSlug(String fieldSlug) {
    
    this.fieldSlug = fieldSlug;
    return this;
  }

   /**
   * Document field slug.
   * @return fieldSlug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document field slug.")

  public String getFieldSlug() {
    return fieldSlug;
  }


  public void setFieldSlug(String fieldSlug) {
    this.fieldSlug = fieldSlug;
  }


  public ConsentedDocument issuedAtUtc(OffsetDateTime issuedAtUtc) {
    
    this.issuedAtUtc = issuedAtUtc;
    return this;
  }

   /**
   * Document issued at datetime in UTC timezone.
   * @return issuedAtUtc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Document issued at datetime in UTC timezone.")

  public OffsetDateTime getIssuedAtUtc() {
    return issuedAtUtc;
  }


  public void setIssuedAtUtc(OffsetDateTime issuedAtUtc) {
    this.issuedAtUtc = issuedAtUtc;
  }


  public ConsentedDocument expiresAtUtc(OffsetDateTime expiresAtUtc) {
    
    this.expiresAtUtc = expiresAtUtc;
    return this;
  }

   /**
   * Document expires at datetime in UTC timezone.
   * @return expiresAtUtc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Document expires at datetime in UTC timezone.")

  public OffsetDateTime getExpiresAtUtc() {
    return expiresAtUtc;
  }


  public void setExpiresAtUtc(OffsetDateTime expiresAtUtc) {
    this.expiresAtUtc = expiresAtUtc;
  }


  public ConsentedDocument issuer(ConsentDocumentIssuer issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ConsentDocumentIssuer getIssuer() {
    return issuer;
  }


  public void setIssuer(ConsentDocumentIssuer issuer) {
    this.issuer = issuer;
  }


  public ConsentedDocument digitalSignatures(List<DocumentDigitalSignature> digitalSignatures) {
    
    this.digitalSignatures = digitalSignatures;
    return this;
  }

  public ConsentedDocument addDigitalSignaturesItem(DocumentDigitalSignature digitalSignaturesItem) {
    this.digitalSignatures.add(digitalSignaturesItem);
    return this;
  }

   /**
   * Digital signatures.
   * @return digitalSignatures
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Digital signatures.")

  public List<DocumentDigitalSignature> getDigitalSignatures() {
    return digitalSignatures;
  }


  public void setDigitalSignatures(List<DocumentDigitalSignature> digitalSignatures) {
    this.digitalSignatures = digitalSignatures;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentedDocument consentedDocument = (ConsentedDocument) o;
    return Objects.equals(this.id, consentedDocument.id) &&
        Objects.equals(this.name, consentedDocument.name) &&
        Objects.equals(this.category, consentedDocument.category) &&
        Objects.equals(this.identifier, consentedDocument.identifier) &&
        Objects.equals(this.fieldTitle, consentedDocument.fieldTitle) &&
        Objects.equals(this.fieldSlug, consentedDocument.fieldSlug) &&
        Objects.equals(this.issuedAtUtc, consentedDocument.issuedAtUtc) &&
        Objects.equals(this.expiresAtUtc, consentedDocument.expiresAtUtc) &&
        Objects.equals(this.issuer, consentedDocument.issuer) &&
        Objects.equals(this.digitalSignatures, consentedDocument.digitalSignatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, category, identifier, fieldTitle, fieldSlug, issuedAtUtc, expiresAtUtc, issuer, digitalSignatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentedDocument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    fieldTitle: ").append(toIndentedString(fieldTitle)).append("\n");
    sb.append("    fieldSlug: ").append(toIndentedString(fieldSlug)).append("\n");
    sb.append("    issuedAtUtc: ").append(toIndentedString(issuedAtUtc)).append("\n");
    sb.append("    expiresAtUtc: ").append(toIndentedString(expiresAtUtc)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    digitalSignatures: ").append(toIndentedString(digitalSignatures)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("category");
    openapiFields.add("identifier");
    openapiFields.add("fieldTitle");
    openapiFields.add("fieldSlug");
    openapiFields.add("issuedAtUtc");
    openapiFields.add("expiresAtUtc");
    openapiFields.add("issuer");
    openapiFields.add("digitalSignatures");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("identifier");
    openapiRequiredFields.add("fieldTitle");
    openapiRequiredFields.add("fieldSlug");
    openapiRequiredFields.add("issuedAtUtc");
    openapiRequiredFields.add("issuer");
    openapiRequiredFields.add("digitalSignatures");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConsentedDocument
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConsentedDocument.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsentedDocument is not found in the empty JSON string", ConsentedDocument.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConsentedDocument.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsentedDocument` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConsentedDocument.openapiRequiredFields) {
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
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("identifier") != null && !jsonObj.get("identifier").isJsonNull()) && !jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
      if ((jsonObj.get("fieldTitle") != null && !jsonObj.get("fieldTitle").isJsonNull()) && !jsonObj.get("fieldTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldTitle").toString()));
      }
      if ((jsonObj.get("fieldSlug") != null && !jsonObj.get("fieldSlug").isJsonNull()) && !jsonObj.get("fieldSlug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldSlug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldSlug").toString()));
      }
      // validate the optional field `issuer`
      if (jsonObj.get("issuer") != null && !jsonObj.get("issuer").isJsonNull()) {
        ConsentDocumentIssuer.validateJsonObject(jsonObj.getAsJsonObject("issuer"));
      }
      if (jsonObj.get("digitalSignatures") != null && !jsonObj.get("digitalSignatures").isJsonNull()) {
        JsonArray jsonArraydigitalSignatures = jsonObj.getAsJsonArray("digitalSignatures");
        if (jsonArraydigitalSignatures != null) {
          // ensure the json data is an array
          if (!jsonObj.get("digitalSignatures").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `digitalSignatures` to be an array in the JSON string but got `%s`", jsonObj.get("digitalSignatures").toString()));
          }

          // validate the optional field `digitalSignatures` (array)
          for (int i = 0; i < jsonArraydigitalSignatures.size(); i++) {
            DocumentDigitalSignature.validateJsonObject(jsonArraydigitalSignatures.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsentedDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsentedDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsentedDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsentedDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsentedDocument>() {
           @Override
           public void write(JsonWriter out, ConsentedDocument value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsentedDocument read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConsentedDocument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConsentedDocument
  * @throws IOException if the JSON string is invalid with respect to ConsentedDocument
  */
  public static ConsentedDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsentedDocument.class);
  }

 /**
  * Convert an instance of ConsentedDocument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

