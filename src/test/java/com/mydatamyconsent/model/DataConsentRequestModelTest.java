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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mydatamyconsent.model.DataConsentRequestedDocumentDto;
import com.mydatamyconsent.model.DataConsentRequestedFaDto;
import com.mydatamyconsent.model.DataFetchFrequencyUnit;
import com.mydatamyconsent.model.DataFetchType;
import com.mydatamyconsent.model.DataLifeUnit;
import com.mydatamyconsent.model.IdentityClaim;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for DataConsentRequestModel
 */
public class DataConsentRequestModelTest {
    private final DataConsentRequestModel model = new DataConsentRequestModel();

    /**
     * Model tests for DataConsentRequestModel
     */
    @Test
    public void testDataConsentRequestModel() {
        // TODO: test DataConsentRequestModel
    }

    /**
     * Test the property 'organizationId'
     */
    @Test
    public void organizationIdTest() {
        // TODO: test organizationId
    }

    /**
     * Test the property 'transactionId'
     */
    @Test
    public void transactionIdTest() {
        // TODO: test transactionId
    }

    /**
     * Test the property 'identifiers'
     */
    @Test
    public void identifiersTest() {
        // TODO: test identifiers
    }

    /**
     * Test the property 'startDateTime'
     */
    @Test
    public void startDateTimeTest() {
        // TODO: test startDateTime
    }

    /**
     * Test the property 'expiryDateTime'
     */
    @Test
    public void expiryDateTimeTest() {
        // TODO: test expiryDateTime
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'purposeCode'
     */
    @Test
    public void purposeCodeTest() {
        // TODO: test purposeCode
    }

    /**
     * Test the property 'purposeLink'
     */
    @Test
    public void purposeLinkTest() {
        // TODO: test purposeLink
    }

    /**
     * Test the property 'dataLifeUnit'
     */
    @Test
    public void dataLifeUnitTest() {
        // TODO: test dataLifeUnit
    }

    /**
     * Test the property 'dataLifeValue'
     */
    @Test
    public void dataLifeValueTest() {
        // TODO: test dataLifeValue
    }

    /**
     * Test the property 'dataFetchFrequencyUnit'
     */
    @Test
    public void dataFetchFrequencyUnitTest() {
        // TODO: test dataFetchFrequencyUnit
    }

    /**
     * Test the property 'dataFetchFrequencyUnitValue'
     */
    @Test
    public void dataFetchFrequencyUnitValueTest() {
        // TODO: test dataFetchFrequencyUnitValue
    }

    /**
     * Test the property 'dataFetchType'
     */
    @Test
    public void dataFetchTypeTest() {
        // TODO: test dataFetchType
    }

    /**
     * Test the property 'agreementId'
     */
    @Test
    public void agreementIdTest() {
        // TODO: test agreementId
    }

    /**
     * Test the property 'identityClaims'
     */
    @Test
    public void identityClaimsTest() {
        // TODO: test identityClaims
    }

    /**
     * Test the property 'financialAccounts'
     */
    @Test
    public void financialAccountsTest() {
        // TODO: test financialAccounts
    }

    /**
     * Test the property 'documents'
     */
    @Test
    public void documentsTest() {
        // TODO: test documents
    }

}
