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


package com.mydatamyconsent;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
                .registerTypeSelector(com.mydatamyconsent.model.FinancialAccount.class, new TypeSelector<com.mydatamyconsent.model.FinancialAccount>() {
                    @Override
                    public Class<? extends com.mydatamyconsent.model.FinancialAccount> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Equity", com.mydatamyconsent.model.FinancialAccountEquity.class);
                        classByDiscriminatorValue.put("FinancialAccount_Equity", com.mydatamyconsent.model.FinancialAccountEquity.class);
                        classByDiscriminatorValue.put("FinancialAccount_MutualFund", com.mydatamyconsent.model.FinancialAccountMutualFund.class);
                        classByDiscriminatorValue.put("FinancialAccount_Sip", com.mydatamyconsent.model.FinancialAccountSip.class);
                        classByDiscriminatorValue.put("MutualFund", com.mydatamyconsent.model.FinancialAccountMutualFund.class);
                        classByDiscriminatorValue.put("Sip", com.mydatamyconsent.model.FinancialAccountSip.class);
                        classByDiscriminatorValue.put("FinancialAccount", com.mydatamyconsent.model.FinancialAccount.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(com.mydatamyconsent.model.FinancialAccountTransaction.class, new TypeSelector<com.mydatamyconsent.model.FinancialAccountTransaction>() {
                    @Override
                    public Class<? extends com.mydatamyconsent.model.FinancialAccountTransaction> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("EquityTransaction", com.mydatamyconsent.model.FinancialAccountTransactionEquityTransaction.class);
                        classByDiscriminatorValue.put("FinancialAccountTransaction_EquityTransaction", com.mydatamyconsent.model.FinancialAccountTransactionEquityTransaction.class);
                        classByDiscriminatorValue.put("FinancialAccountTransaction_MutualFundTransaction", com.mydatamyconsent.model.FinancialAccountTransactionMutualFundTransaction.class);
                        classByDiscriminatorValue.put("FinancialAccountTransaction_SipTransaction", com.mydatamyconsent.model.FinancialAccountTransactionSipTransaction.class);
                        classByDiscriminatorValue.put("MutualFundTransaction", com.mydatamyconsent.model.FinancialAccountTransactionMutualFundTransaction.class);
                        classByDiscriminatorValue.put("SipTransaction", com.mydatamyconsent.model.FinancialAccountTransactionSipTransaction.class);
                        classByDiscriminatorValue.put("FinancialAccountTransaction", com.mydatamyconsent.model.FinancialAccountTransaction.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.Consent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.ConsentDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.ConsentDocumentIssuer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.ConsentRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.ConsentRequestReceiver.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.ConsentRequestTemplate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.ConsentedDocument.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.ConsentedFinancialAccount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.ConsentedFinancialAccountField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.ConsentedFinancialAccountFieldTransactionPeriod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.ConsentedIdentifier.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.ConsentedMedicalRecord.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.CreateConsentRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.CreateDataProcessingAgreement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.DataProcessingAgreement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.DataProtectionOfficer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.DataProvider.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.DataProviderDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.DocumentDigitalSignature.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.DocumentField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.DocumentIssueRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.DocumentIssueRequestDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.DocumentIssueRequestDetailsReceiver.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.DocumentIssueRequestPaymentRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.DocumentIssueRequestReceiver.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.DocumentReceiver.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.DocumentType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.Equity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.EquityTransaction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.Error.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.FhirBundleany.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.FinancialAccount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.FinancialAccountEquity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.FinancialAccountEquityAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.FinancialAccountField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.FinancialAccountMutualFund.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.FinancialAccountMutualFundAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.FinancialAccountSip.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.FinancialAccountSipAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.FinancialAccountTransaction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.FinancialAccountTransactionEquityTransaction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.FinancialAccountTransactionEquityTransactionAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.FinancialAccountTransactionMutualFundTransaction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.FinancialAccountTransactionMutualFundTransactionAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.FinancialAccountTransactionPeriod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.FinancialAccountTransactionSipTransaction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.FinancialAccountTransactionSipTransactionAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.Holder.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.Identifier.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.IdentityField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.IndividualConsentRequestDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.IndividualConsentRequestTemplateDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.IndividualConsentRequestTemplateDetailsDataFrequency.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.IndividualConsentRequestTemplateDetailsDataLife.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.IndividualConsentRequestTemplateDetailsRequestLife.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.IssuedDocument.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.KeyValuePair.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.Life.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.MedicalRecordField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.MutualFund.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.MutualFundTransaction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.OrganizationConsentRequestDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.OrganizationConsentRequestTemplateDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.PaginatedListOfConsentRequestTemplates.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.PaginatedListOfConsents.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.PaginatedListOfDataProcessingAgreements.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.PaginatedListOfDataProviders.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.PaginatedListOfDocumentTypes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.PaginatedListOfFinancialAccountTransactions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.PaginatedListOfIndividualConsentRequestDetailss.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.PaginatedListOfIssuedDocuments.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.PaginatedListOfOrganizationConsentRequestDetailss.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.PaymentOrderItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.PaymentRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.PushUriRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.PushUriResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.SelectedFinancialAccountType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.Sip.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.SipInvestmentInformation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.SipPlanInformation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.SipTransaction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.SupportedDocumentType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.SupportedIdentifier.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.UpdateDataProcessingAgreement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.UploadDocumentResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mydatamyconsent.model.UriDetails.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
