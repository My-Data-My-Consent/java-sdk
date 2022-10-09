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
import com.mydatamyconsent.model.HoldingNominee;
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
 * Holder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-09T10:38:33.868597316Z[Etc/UTC]")
public class Holder {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DOB = "dob";
  @SerializedName(SERIALIZED_NAME_DOB)
  private OffsetDateTime dob;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_NOMINEE = "nominee";
  @SerializedName(SERIALIZED_NAME_NOMINEE)
  private HoldingNominee nominee;

  public static final String SERIALIZED_NAME_DEMAT_ID = "dematId";
  @SerializedName(SERIALIZED_NAME_DEMAT_ID)
  private String dematId;

  public static final String SERIALIZED_NAME_LANDLINE = "landline";
  @SerializedName(SERIALIZED_NAME_LANDLINE)
  private String landline;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PAN = "pan";
  @SerializedName(SERIALIZED_NAME_PAN)
  private String pan;

  public static final String SERIALIZED_NAME_CKYC_COMPLIANCE = "ckycCompliance";
  @SerializedName(SERIALIZED_NAME_CKYC_COMPLIANCE)
  private Boolean ckycCompliance;

  public Holder() {
  }

  public Holder name(String name) {
    
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


  public Holder dob(OffsetDateTime dob) {
    
    this.dob = dob;
    return this;
  }

   /**
   * Get dob
   * @return dob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDob() {
    return dob;
  }


  public void setDob(OffsetDateTime dob) {
    this.dob = dob;
  }


  public Holder mobile(String mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMobile() {
    return mobile;
  }


  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public Holder nominee(HoldingNominee nominee) {
    
    this.nominee = nominee;
    return this;
  }

   /**
   * Get nominee
   * @return nominee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HoldingNominee getNominee() {
    return nominee;
  }


  public void setNominee(HoldingNominee nominee) {
    this.nominee = nominee;
  }


  public Holder dematId(String dematId) {
    
    this.dematId = dematId;
    return this;
  }

   /**
   * Get dematId
   * @return dematId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDematId() {
    return dematId;
  }


  public void setDematId(String dematId) {
    this.dematId = dematId;
  }


  public Holder landline(String landline) {
    
    this.landline = landline;
    return this;
  }

   /**
   * Get landline
   * @return landline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLandline() {
    return landline;
  }


  public void setLandline(String landline) {
    this.landline = landline;
  }


  public Holder address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public Holder email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public Holder pan(String pan) {
    
    this.pan = pan;
    return this;
  }

   /**
   * Get pan
   * @return pan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPan() {
    return pan;
  }


  public void setPan(String pan) {
    this.pan = pan;
  }


  public Holder ckycCompliance(Boolean ckycCompliance) {
    
    this.ckycCompliance = ckycCompliance;
    return this;
  }

   /**
   * Get ckycCompliance
   * @return ckycCompliance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCkycCompliance() {
    return ckycCompliance;
  }


  public void setCkycCompliance(Boolean ckycCompliance) {
    this.ckycCompliance = ckycCompliance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Holder holder = (Holder) o;
    return Objects.equals(this.name, holder.name) &&
        Objects.equals(this.dob, holder.dob) &&
        Objects.equals(this.mobile, holder.mobile) &&
        Objects.equals(this.nominee, holder.nominee) &&
        Objects.equals(this.dematId, holder.dematId) &&
        Objects.equals(this.landline, holder.landline) &&
        Objects.equals(this.address, holder.address) &&
        Objects.equals(this.email, holder.email) &&
        Objects.equals(this.pan, holder.pan) &&
        Objects.equals(this.ckycCompliance, holder.ckycCompliance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dob, mobile, nominee, dematId, landline, address, email, pan, ckycCompliance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Holder {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    nominee: ").append(toIndentedString(nominee)).append("\n");
    sb.append("    dematId: ").append(toIndentedString(dematId)).append("\n");
    sb.append("    landline: ").append(toIndentedString(landline)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    ckycCompliance: ").append(toIndentedString(ckycCompliance)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("dob");
    openapiFields.add("mobile");
    openapiFields.add("nominee");
    openapiFields.add("dematId");
    openapiFields.add("landline");
    openapiFields.add("address");
    openapiFields.add("email");
    openapiFields.add("pan");
    openapiFields.add("ckycCompliance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("dematId");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("ckycCompliance");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Holder
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Holder.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Holder is not found in the empty JSON string", Holder.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Holder.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Holder` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Holder.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("mobile") != null && !jsonObj.get("mobile").isJsonNull()) && !jsonObj.get("mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
      if ((jsonObj.get("dematId") != null && !jsonObj.get("dematId").isJsonNull()) && !jsonObj.get("dematId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dematId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dematId").toString()));
      }
      if ((jsonObj.get("landline") != null && !jsonObj.get("landline").isJsonNull()) && !jsonObj.get("landline").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `landline` to be a primitive type in the JSON string but got `%s`", jsonObj.get("landline").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("pan") != null && !jsonObj.get("pan").isJsonNull()) && !jsonObj.get("pan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pan").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Holder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Holder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Holder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Holder.class));

       return (TypeAdapter<T>) new TypeAdapter<Holder>() {
           @Override
           public void write(JsonWriter out, Holder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Holder read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Holder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Holder
  * @throws IOException if the JSON string is invalid with respect to Holder
  */
  public static Holder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Holder.class);
  }

 /**
  * Convert an instance of Holder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

