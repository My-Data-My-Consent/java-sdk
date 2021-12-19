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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Identifier
 */
@JsonAdapter(Identifier.Adapter.class)
public enum Identifier {
  
  EMAIL("Email"),
  
  PERMANENTACCOUNTNUMBER("PermanentAccountNumber"),
  
  AADHAARNUMBER("AadhaarNumber"),
  
  MOBILENUMBER("MobileNumber"),
  
  CORPORATEIDENTIFICATIONNUMBER("CorporateIdentificationNumber"),
  
  TAXDEDUCTIONACCOUNTNUMBER("TaxDeductionAccountNumber"),
  
  GOODSANDSERVICESTAXIDENTIFICATIONNUMBER("GoodsAndServicesTaxIdentificationNumber");

  private String value;

  Identifier(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Identifier fromValue(String value) {
    for (Identifier b : Identifier.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Identifier> {
    @Override
    public void write(final JsonWriter jsonWriter, final Identifier enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Identifier read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Identifier.fromValue(value);
    }
  }
}

