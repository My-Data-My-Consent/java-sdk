# mydatamyconsent-java-sdk

My Data My Consent - Developer API
- API version: 1.0
  - Build date: 2022-10-30T10:36:52.713720562Z[Etc/UTC]

Unleashing the power of consent by establishing trust. The Platform Core Developer API defines a set of capabilities that can be used to request, issue, manage and update data, documents and credentials by organizations. The API can be used to request, manage and update Decentralised Identifiers, Financial Data, Health Data issue Documents, Credentials directly or using OpenID Connect flows, and verify Messages signed with DIDs and much more.

  For more information, please visit [https://mydatamyconsent.com/en-us/contact-us](https://mydatamyconsent.com/en-us/contact-us)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.mydatamyconsent</groupId>
  <artifactId>mydatamyconsent-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'mydatamyconsent-java-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'mydatamyconsent-java-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.mydatamyconsent:mydatamyconsent-java-sdk:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/mydatamyconsent-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.auth.*;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataProcessingAgreementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mydatamyconsent.com");
    
    // Configure OAuth2 access token for authorization: OAuth2ClientCredentials
    OAuth OAuth2ClientCredentials = (OAuth) defaultClient.getAuthentication("OAuth2ClientCredentials");
    OAuth2ClientCredentials.setAccessToken("YOUR ACCESS TOKEN");

    DataProcessingAgreementsApi apiInstance = new DataProcessingAgreementsApi(defaultClient);
    Integer pageNo = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      PaginatedListOfDataProcessingAgreements result = apiInstance.v1DataAgreementsGet(pageNo, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataProcessingAgreementsApi#v1DataAgreementsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.mydatamyconsent.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DataProcessingAgreementsApi* | [**v1DataAgreementsGet**](docs/DataProcessingAgreementsApi.md#v1DataAgreementsGet) | **GET** /v1/data-agreements | Get paginated data processing agreements.
*DataProcessingAgreementsApi* | [**v1DataAgreementsIdDelete**](docs/DataProcessingAgreementsApi.md#v1DataAgreementsIdDelete) | **DELETE** /v1/data-agreements/{id} | Delete a data processing agreement this will not delete a published or a agreement in use with consents.
*DataProcessingAgreementsApi* | [**v1DataAgreementsIdGet**](docs/DataProcessingAgreementsApi.md#v1DataAgreementsIdGet) | **GET** /v1/data-agreements/{id} | Get data processing agreement by id.
*DataProcessingAgreementsApi* | [**v1DataAgreementsIdPut**](docs/DataProcessingAgreementsApi.md#v1DataAgreementsIdPut) | **PUT** /v1/data-agreements/{id} | Update data processing agreement.
*DataProcessingAgreementsApi* | [**v1DataAgreementsIdTerminatePut**](docs/DataProcessingAgreementsApi.md#v1DataAgreementsIdTerminatePut) | **PUT** /v1/data-agreements/{id}/terminate | Terminate a data processing agreement by id.
*DataProcessingAgreementsApi* | [**v1DataAgreementsPost**](docs/DataProcessingAgreementsApi.md#v1DataAgreementsPost) | **POST** /v1/data-agreements | Create a data processing agreement.
*DataProvidersDiscoveryApi* | [**v1DataProvidersGet**](docs/DataProvidersDiscoveryApi.md#v1DataProvidersGet) | **GET** /v1/data-providers | Discover all data providers in my data my consent by country and filters.
*DataProvidersDiscoveryApi* | [**v1DataProvidersIdGet**](docs/DataProvidersDiscoveryApi.md#v1DataProvidersIdGet) | **GET** /v1/data-providers/{id} | Get a data provider details by provider id.
*IndividualsApi* | [**issuerIssuedoc1XmlPost**](docs/IndividualsApi.md#issuerIssuedoc1XmlPost) | **POST** /issuer/issuedoc/1/xml | Digilocker compatible endpoint to issue document.
*IndividualsApi* | [**v1IndividualsConsentRequestsGet**](docs/IndividualsApi.md#v1IndividualsConsentRequestsGet) | **GET** /v1/individuals/consent-requests | Get all consent requests sent to Individuals.
*IndividualsApi* | [**v1IndividualsConsentRequestsPost**](docs/IndividualsApi.md#v1IndividualsConsentRequestsPost) | **POST** /v1/individuals/consent-requests | Create individual consent request.
*IndividualsApi* | [**v1IndividualsConsentRequestsRequestIdCancelPut**](docs/IndividualsApi.md#v1IndividualsConsentRequestsRequestIdCancelPut) | **PUT** /v1/individuals/consent-requests/{request_id}/cancel | Cancel the Individual data request by id.
*IndividualsApi* | [**v1IndividualsConsentRequestsRequestIdGet**](docs/IndividualsApi.md#v1IndividualsConsentRequestsRequestIdGet) | **GET** /v1/individuals/consent-requests/{request_id} | Get Individual data request by id.
*IndividualsApi* | [**v1IndividualsConsentTemplatesGet**](docs/IndividualsApi.md#v1IndividualsConsentTemplatesGet) | **GET** /v1/individuals/consent-templates | Get the paginated list of individual consent templates.
*IndividualsApi* | [**v1IndividualsConsentTemplatesTemplateIdGet**](docs/IndividualsApi.md#v1IndividualsConsentTemplatesTemplateIdGet) | **GET** /v1/individuals/consent-templates/{template_id} | Get Individual consent template details by consent id.
*IndividualsApi* | [**v1IndividualsConsentsConsentIdDocumentsDocumentIdDownloadGet**](docs/IndividualsApi.md#v1IndividualsConsentsConsentIdDocumentsDocumentIdDownloadGet) | **GET** /v1/individuals/consents/{consent_id}/documents/{document_id}/download | Download Individual consented document by document id.
*IndividualsApi* | [**v1IndividualsConsentsConsentIdDocumentsDocumentIdGet**](docs/IndividualsApi.md#v1IndividualsConsentsConsentIdDocumentsDocumentIdGet) | **GET** /v1/individuals/consents/{consent_id}/documents/{document_id} | Get Individual consented document by document id.
*IndividualsApi* | [**v1IndividualsConsentsConsentIdDocumentsGet**](docs/IndividualsApi.md#v1IndividualsConsentsConsentIdDocumentsGet) | **GET** /v1/individuals/consents/{consent_id}/documents | Get Individual consented document by consent id.
*IndividualsApi* | [**v1IndividualsConsentsConsentIdFinancialAccountsAccountIdGet**](docs/IndividualsApi.md#v1IndividualsConsentsConsentIdFinancialAccountsAccountIdGet) | **GET** /v1/individuals/consents/{consent_id}/financial-accounts/{account_id} | Get individual consented financial account details.
*IndividualsApi* | [**v1IndividualsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet**](docs/IndividualsApi.md#v1IndividualsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet) | **GET** /v1/individuals/consents/{consent_id}/financial-accounts/{account_id}/transactions | Get individual consented financial account transactions.
*IndividualsApi* | [**v1IndividualsConsentsConsentIdFinancialAccountsGet**](docs/IndividualsApi.md#v1IndividualsConsentsConsentIdFinancialAccountsGet) | **GET** /v1/individuals/consents/{consent_id}/financial-accounts | Get all individual consented financial accounts.
*IndividualsApi* | [**v1IndividualsConsentsConsentIdGet**](docs/IndividualsApi.md#v1IndividualsConsentsConsentIdGet) | **GET** /v1/individuals/consents/{consent_id} | Get Individuals consent details by consent id.
*IndividualsApi* | [**v1IndividualsConsentsConsentIdHealthFhirBundleGet**](docs/IndividualsApi.md#v1IndividualsConsentsConsentIdHealthFhirBundleGet) | **GET** /v1/individuals/consents/{consent_id}/health/fhir/bundle | Get Individual consented document by consent id.
*IndividualsApi* | [**v1IndividualsConsentsGet**](docs/IndividualsApi.md#v1IndividualsConsentsGet) | **GET** /v1/individuals/consents | Get the paginated list of Individual consents.
*IndividualsApi* | [**v1IndividualsDocumentsIssueIssueRequestIdUploadPost**](docs/IndividualsApi.md#v1IndividualsDocumentsIssueIssueRequestIdUploadPost) | **POST** /v1/individuals/documents/issue/{issue_request_id}/upload | Upload a document for issuance request of individual.
*IndividualsApi* | [**v1IndividualsDocumentsIssuePost**](docs/IndividualsApi.md#v1IndividualsDocumentsIssuePost) | **POST** /v1/individuals/documents/issue | Issue a new document to an individual user.
*IndividualsApi* | [**v1IndividualsDocumentsIssuedDocumentIdGet**](docs/IndividualsApi.md#v1IndividualsDocumentsIssuedDocumentIdGet) | **GET** /v1/individuals/documents/issued/{document_id} | Get issued document.
*IndividualsApi* | [**v1IndividualsDocumentsIssuedGet**](docs/IndividualsApi.md#v1IndividualsDocumentsIssuedGet) | **GET** /v1/individuals/documents/issued | Get paginated list of issued documents of given document type.
*IndividualsApi* | [**v1IndividualsDocumentsTypesGet**](docs/IndividualsApi.md#v1IndividualsDocumentsTypesGet) | **GET** /v1/individuals/documents/types | Get paginated list of registered document types.
*OrganizationsApi* | [**v1OrganizationsConsentRequestsGet**](docs/OrganizationsApi.md#v1OrganizationsConsentRequestsGet) | **GET** /v1/organizations/consent-requests | Get all consent requests sent to Organizations.
*OrganizationsApi* | [**v1OrganizationsConsentRequestsPost**](docs/OrganizationsApi.md#v1OrganizationsConsentRequestsPost) | **POST** /v1/organizations/consent-requests | Create consent request for an Organization.
*OrganizationsApi* | [**v1OrganizationsConsentRequestsRequestIdCancelPut**](docs/OrganizationsApi.md#v1OrganizationsConsentRequestsRequestIdCancelPut) | **PUT** /v1/organizations/consent-requests/{request_id}/cancel | Cancel the  Organization data request by id.
*OrganizationsApi* | [**v1OrganizationsConsentRequestsRequestIdGet**](docs/OrganizationsApi.md#v1OrganizationsConsentRequestsRequestIdGet) | **GET** /v1/organizations/consent-requests/{request_id} | Get Organization data request by id.
*OrganizationsApi* | [**v1OrganizationsConsentTemplatesGet**](docs/OrganizationsApi.md#v1OrganizationsConsentTemplatesGet) | **GET** /v1/organizations/consent-templates | Get the paginated list of organization consent templates.
*OrganizationsApi* | [**v1OrganizationsConsentTemplatesTemplateIdGet**](docs/OrganizationsApi.md#v1OrganizationsConsentTemplatesTemplateIdGet) | **GET** /v1/organizations/consent-templates/{template_id} | Get Organization consent template details by consent id.
*OrganizationsApi* | [**v1OrganizationsConsentsConsentIdDocumentsDocumentIdDownloadGet**](docs/OrganizationsApi.md#v1OrganizationsConsentsConsentIdDocumentsDocumentIdDownloadGet) | **GET** /v1/organizations/consents/{consent_id}/documents/{document_id}/download | Download Organization consent document by document id.
*OrganizationsApi* | [**v1OrganizationsConsentsConsentIdDocumentsDocumentIdGet**](docs/OrganizationsApi.md#v1OrganizationsConsentsConsentIdDocumentsDocumentIdGet) | **GET** /v1/organizations/consents/{consent_id}/documents/{document_id} | Get Organization consent document based on document id and consent id.
*OrganizationsApi* | [**v1OrganizationsConsentsConsentIdDocumentsGet**](docs/OrganizationsApi.md#v1OrganizationsConsentsConsentIdDocumentsGet) | **GET** /v1/organizations/consents/{consent_id}/documents | Get Organization consent document by consent id.
*OrganizationsApi* | [**v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdGet**](docs/OrganizationsApi.md#v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdGet) | **GET** /v1/organizations/consents/{consent_id}/financial-accounts/{account_id} | Get organization consented financial account details.
*OrganizationsApi* | [**v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet**](docs/OrganizationsApi.md#v1OrganizationsConsentsConsentIdFinancialAccountsAccountIdTransactionsGet) | **GET** /v1/organizations/consents/{consent_id}/financial-accounts/{account_id}/transactions | Get organization consented financial account transactions.
*OrganizationsApi* | [**v1OrganizationsConsentsConsentIdFinancialAccountsGet**](docs/OrganizationsApi.md#v1OrganizationsConsentsConsentIdFinancialAccountsGet) | **GET** /v1/organizations/consents/{consent_id}/financial-accounts | Get all organization consented financial accounts.
*OrganizationsApi* | [**v1OrganizationsConsentsConsentIdGet**](docs/OrganizationsApi.md#v1OrganizationsConsentsConsentIdGet) | **GET** /v1/organizations/consents/{consent_id} | Get Organization consent request details by consent id.
*OrganizationsApi* | [**v1OrganizationsConsentsGet**](docs/OrganizationsApi.md#v1OrganizationsConsentsGet) | **GET** /v1/organizations/consents | Get the paginated list of Organization consents.
*OrganizationsApi* | [**v1OrganizationsDocumentsIssuePost**](docs/OrganizationsApi.md#v1OrganizationsDocumentsIssuePost) | **POST** /v1/organizations/documents/issue | Issue a new document to an organization.
*OrganizationsApi* | [**v1OrganizationsDocumentsIssueUploadIssueRequestIdPost**](docs/OrganizationsApi.md#v1OrganizationsDocumentsIssueUploadIssueRequestIdPost) | **POST** /v1/organizations/documents/issue/upload/{issue_request_id} | Upload a document for issuance request of Organization.
*OrganizationsApi* | [**v1OrganizationsDocumentsIssuedDocumentIdGet**](docs/OrganizationsApi.md#v1OrganizationsDocumentsIssuedDocumentIdGet) | **GET** /v1/organizations/documents/issued/{document_id} | Get issued document.
*OrganizationsApi* | [**v1OrganizationsDocumentsIssuedGet**](docs/OrganizationsApi.md#v1OrganizationsDocumentsIssuedGet) | **GET** /v1/organizations/documents/issued | Get paginated list of issued documents of given document type.
*OrganizationsApi* | [**v1OrganizationsDocumentsTypesGet**](docs/OrganizationsApi.md#v1OrganizationsDocumentsTypesGet) | **GET** /v1/organizations/documents/types | Get paginated list of registered document types.
*SupportedIdentifiersApi* | [**v1SupportedIdentifiersCountryIso2CodeGet**](docs/SupportedIdentifiersApi.md#v1SupportedIdentifiersCountryIso2CodeGet) | **GET** /v1/supported-identifiers/{country_iso2_code} | Get all supported identifiers by country.


## Documentation for Models

 - [Aif](docs/Aif.md)
 - [AifTransaction](docs/AifTransaction.md)
 - [ApiErrorType](docs/ApiErrorType.md)
 - [BillPayment](docs/BillPayment.md)
 - [BillPaymentTransaction](docs/BillPaymentTransaction.md)
 - [Bond](docs/Bond.md)
 - [BondTransaction](docs/BondTransaction.md)
 - [CIS](docs/CIS.md)
 - [CISTransaction](docs/CISTransaction.md)
 - [CertificateOfDeposit](docs/CertificateOfDeposit.md)
 - [CertificateOfDepositTransaction](docs/CertificateOfDepositTransaction.md)
 - [CollectibleTypes](docs/CollectibleTypes.md)
 - [CommercialPaper](docs/CommercialPaper.md)
 - [CommercialPaperTransaction](docs/CommercialPaperTransaction.md)
 - [Consent](docs/Consent.md)
 - [ConsentDetails](docs/ConsentDetails.md)
 - [ConsentDocumentIssuer](docs/ConsentDocumentIssuer.md)
 - [ConsentRequest](docs/ConsentRequest.md)
 - [ConsentRequestReceiver](docs/ConsentRequestReceiver.md)
 - [ConsentRequestTemplate](docs/ConsentRequestTemplate.md)
 - [ConsentRequestTemplateStatus](docs/ConsentRequestTemplateStatus.md)
 - [ConsentedDocument](docs/ConsentedDocument.md)
 - [ConsentedFinancialAccount](docs/ConsentedFinancialAccount.md)
 - [ConsentedFinancialAccountTransactionPeriod](docs/ConsentedFinancialAccountTransactionPeriod.md)
 - [ConsentedIdentifier](docs/ConsentedIdentifier.md)
 - [ConsentedMedicalRecord](docs/ConsentedMedicalRecord.md)
 - [CreateConsentRequest](docs/CreateConsentRequest.md)
 - [CreateDataProcessingAgreement](docs/CreateDataProcessingAgreement.md)
 - [CreditCard](docs/CreditCard.md)
 - [CreditCardHolder](docs/CreditCardHolder.md)
 - [CreditCardHolders](docs/CreditCardHolders.md)
 - [CreditCardProfile](docs/CreditCardProfile.md)
 - [CreditCardSummary](docs/CreditCardSummary.md)
 - [CreditCardTransaction](docs/CreditCardTransaction.md)
 - [CreditCardTransactionType](docs/CreditCardTransactionType.md)
 - [DataConsentStatus](docs/DataConsentStatus.md)
 - [DataProcessingAgreement](docs/DataProcessingAgreement.md)
 - [DataProtectionOfficer](docs/DataProtectionOfficer.md)
 - [DataProvider](docs/DataProvider.md)
 - [DataProviderDetails](docs/DataProviderDetails.md)
 - [Debenture](docs/Debenture.md)
 - [DebentureTransaction](docs/DebentureTransaction.md)
 - [Deposit](docs/Deposit.md)
 - [DepositTransaction](docs/DepositTransaction.md)
 - [DocumentCategoryType](docs/DocumentCategoryType.md)
 - [DocumentDigitalSignature](docs/DocumentDigitalSignature.md)
 - [DocumentField](docs/DocumentField.md)
 - [DocumentIssueRequest](docs/DocumentIssueRequest.md)
 - [DocumentIssueRequestDetails](docs/DocumentIssueRequestDetails.md)
 - [DocumentIssueRequestDetailsReceiver](docs/DocumentIssueRequestDetailsReceiver.md)
 - [DocumentIssueRequestPaymentRequest](docs/DocumentIssueRequestPaymentRequest.md)
 - [DocumentIssueRequestReceiver](docs/DocumentIssueRequestReceiver.md)
 - [DocumentIssueRequestStatus](docs/DocumentIssueRequestStatus.md)
 - [DocumentReceiver](docs/DocumentReceiver.md)
 - [DocumentSubCategoryType](docs/DocumentSubCategoryType.md)
 - [DocumentType](docs/DocumentType.md)
 - [Epf](docs/Epf.md)
 - [EpfTransaction](docs/EpfTransaction.md)
 - [Equity](docs/Equity.md)
 - [EquityHolding](docs/EquityHolding.md)
 - [EquityHoldingMode](docs/EquityHoldingMode.md)
 - [EquityHoldings](docs/EquityHoldings.md)
 - [EquityInvestment](docs/EquityInvestment.md)
 - [EquitySummary](docs/EquitySummary.md)
 - [EquityTransaction](docs/EquityTransaction.md)
 - [Error](docs/Error.md)
 - [Etf](docs/Etf.md)
 - [EtfTransaction](docs/EtfTransaction.md)
 - [FinancialAccount](docs/FinancialAccount.md)
 - [FinancialAccountAif](docs/FinancialAccountAif.md)
 - [FinancialAccountAifAllOf](docs/FinancialAccountAifAllOf.md)
 - [FinancialAccountAifTransaction](docs/FinancialAccountAifTransaction.md)
 - [FinancialAccountAifTransactionAllOf](docs/FinancialAccountAifTransactionAllOf.md)
 - [FinancialAccountBillPayment](docs/FinancialAccountBillPayment.md)
 - [FinancialAccountBillPaymentAllOf](docs/FinancialAccountBillPaymentAllOf.md)
 - [FinancialAccountBillPaymentTransaction](docs/FinancialAccountBillPaymentTransaction.md)
 - [FinancialAccountBillPaymentTransactionAllOf](docs/FinancialAccountBillPaymentTransactionAllOf.md)
 - [FinancialAccountBond](docs/FinancialAccountBond.md)
 - [FinancialAccountBondAllOf](docs/FinancialAccountBondAllOf.md)
 - [FinancialAccountBondTransaction](docs/FinancialAccountBondTransaction.md)
 - [FinancialAccountBondTransactionAllOf](docs/FinancialAccountBondTransactionAllOf.md)
 - [FinancialAccountCIS](docs/FinancialAccountCIS.md)
 - [FinancialAccountCISAllOf](docs/FinancialAccountCISAllOf.md)
 - [FinancialAccountCISTransaction](docs/FinancialAccountCISTransaction.md)
 - [FinancialAccountCISTransactionAllOf](docs/FinancialAccountCISTransactionAllOf.md)
 - [FinancialAccountCategoryType](docs/FinancialAccountCategoryType.md)
 - [FinancialAccountCertificateOfDeposit](docs/FinancialAccountCertificateOfDeposit.md)
 - [FinancialAccountCertificateOfDepositAllOf](docs/FinancialAccountCertificateOfDepositAllOf.md)
 - [FinancialAccountCertificateOfDepositTransaction](docs/FinancialAccountCertificateOfDepositTransaction.md)
 - [FinancialAccountCertificateOfDepositTransactionAllOf](docs/FinancialAccountCertificateOfDepositTransactionAllOf.md)
 - [FinancialAccountCommercialPaper](docs/FinancialAccountCommercialPaper.md)
 - [FinancialAccountCommercialPaperAllOf](docs/FinancialAccountCommercialPaperAllOf.md)
 - [FinancialAccountCommercialPaperTransaction](docs/FinancialAccountCommercialPaperTransaction.md)
 - [FinancialAccountCommercialPaperTransactionAllOf](docs/FinancialAccountCommercialPaperTransactionAllOf.md)
 - [FinancialAccountCreditCard](docs/FinancialAccountCreditCard.md)
 - [FinancialAccountCreditCardAllOf](docs/FinancialAccountCreditCardAllOf.md)
 - [FinancialAccountCreditCardTransaction](docs/FinancialAccountCreditCardTransaction.md)
 - [FinancialAccountCreditCardTransactionAllOf](docs/FinancialAccountCreditCardTransactionAllOf.md)
 - [FinancialAccountDebenture](docs/FinancialAccountDebenture.md)
 - [FinancialAccountDebentureAllOf](docs/FinancialAccountDebentureAllOf.md)
 - [FinancialAccountDebentureTransaction](docs/FinancialAccountDebentureTransaction.md)
 - [FinancialAccountDebentureTransactionAllOf](docs/FinancialAccountDebentureTransactionAllOf.md)
 - [FinancialAccountDeposit](docs/FinancialAccountDeposit.md)
 - [FinancialAccountDepositAllOf](docs/FinancialAccountDepositAllOf.md)
 - [FinancialAccountDepositTransaction](docs/FinancialAccountDepositTransaction.md)
 - [FinancialAccountDepositTransactionAllOf](docs/FinancialAccountDepositTransactionAllOf.md)
 - [FinancialAccountDetailsRequired](docs/FinancialAccountDetailsRequired.md)
 - [FinancialAccountEpf](docs/FinancialAccountEpf.md)
 - [FinancialAccountEpfAllOf](docs/FinancialAccountEpfAllOf.md)
 - [FinancialAccountEpfTransaction](docs/FinancialAccountEpfTransaction.md)
 - [FinancialAccountEpfTransactionAllOf](docs/FinancialAccountEpfTransactionAllOf.md)
 - [FinancialAccountEquity](docs/FinancialAccountEquity.md)
 - [FinancialAccountEquityAllOf](docs/FinancialAccountEquityAllOf.md)
 - [FinancialAccountEquityTransaction](docs/FinancialAccountEquityTransaction.md)
 - [FinancialAccountEquityTransactionAllOf](docs/FinancialAccountEquityTransactionAllOf.md)
 - [FinancialAccountEtf](docs/FinancialAccountEtf.md)
 - [FinancialAccountEtfAllOf](docs/FinancialAccountEtfAllOf.md)
 - [FinancialAccountEtfTransaction](docs/FinancialAccountEtfTransaction.md)
 - [FinancialAccountEtfTransactionAllOf](docs/FinancialAccountEtfTransactionAllOf.md)
 - [FinancialAccountField](docs/FinancialAccountField.md)
 - [FinancialAccountGovtSecurity](docs/FinancialAccountGovtSecurity.md)
 - [FinancialAccountGovtSecurityAllOf](docs/FinancialAccountGovtSecurityAllOf.md)
 - [FinancialAccountGovtSecurityTransaction](docs/FinancialAccountGovtSecurityTransaction.md)
 - [FinancialAccountGovtSecurityTransactionAllOf](docs/FinancialAccountGovtSecurityTransactionAllOf.md)
 - [FinancialAccountIdr](docs/FinancialAccountIdr.md)
 - [FinancialAccountIdrAllOf](docs/FinancialAccountIdrAllOf.md)
 - [FinancialAccountIdrTransaction](docs/FinancialAccountIdrTransaction.md)
 - [FinancialAccountIdrTransactionAllOf](docs/FinancialAccountIdrTransactionAllOf.md)
 - [FinancialAccountInsurancePolicy](docs/FinancialAccountInsurancePolicy.md)
 - [FinancialAccountInsurancePolicyAllOf](docs/FinancialAccountInsurancePolicyAllOf.md)
 - [FinancialAccountInsurancePolicyTransaction](docs/FinancialAccountInsurancePolicyTransaction.md)
 - [FinancialAccountInsurancePolicyTransactionAllOf](docs/FinancialAccountInsurancePolicyTransactionAllOf.md)
 - [FinancialAccountInvit](docs/FinancialAccountInvit.md)
 - [FinancialAccountInvitAllOf](docs/FinancialAccountInvitAllOf.md)
 - [FinancialAccountInvitTransaction](docs/FinancialAccountInvitTransaction.md)
 - [FinancialAccountInvitTransactionAllOf](docs/FinancialAccountInvitTransactionAllOf.md)
 - [FinancialAccountLoan](docs/FinancialAccountLoan.md)
 - [FinancialAccountLoanAllOf](docs/FinancialAccountLoanAllOf.md)
 - [FinancialAccountLoanTransaction](docs/FinancialAccountLoanTransaction.md)
 - [FinancialAccountLoanTransactionAllOf](docs/FinancialAccountLoanTransactionAllOf.md)
 - [FinancialAccountMutualFund](docs/FinancialAccountMutualFund.md)
 - [FinancialAccountMutualFundAllOf](docs/FinancialAccountMutualFundAllOf.md)
 - [FinancialAccountMutualFundTransaction](docs/FinancialAccountMutualFundTransaction.md)
 - [FinancialAccountMutualFundTransactionAllOf](docs/FinancialAccountMutualFundTransactionAllOf.md)
 - [FinancialAccountNps](docs/FinancialAccountNps.md)
 - [FinancialAccountNpsAllOf](docs/FinancialAccountNpsAllOf.md)
 - [FinancialAccountNpsTransaction](docs/FinancialAccountNpsTransaction.md)
 - [FinancialAccountNpsTransactionAllOf](docs/FinancialAccountNpsTransactionAllOf.md)
 - [FinancialAccountPpf](docs/FinancialAccountPpf.md)
 - [FinancialAccountPpfAllOf](docs/FinancialAccountPpfAllOf.md)
 - [FinancialAccountPpfTransaction](docs/FinancialAccountPpfTransaction.md)
 - [FinancialAccountPpfTransactionAllOf](docs/FinancialAccountPpfTransactionAllOf.md)
 - [FinancialAccountRecurringDeposit](docs/FinancialAccountRecurringDeposit.md)
 - [FinancialAccountRecurringDepositAllOf](docs/FinancialAccountRecurringDepositAllOf.md)
 - [FinancialAccountRecurringDepositTransaction](docs/FinancialAccountRecurringDepositTransaction.md)
 - [FinancialAccountRecurringDepositTransactionAllOf](docs/FinancialAccountRecurringDepositTransactionAllOf.md)
 - [FinancialAccountReit](docs/FinancialAccountReit.md)
 - [FinancialAccountReitAllOf](docs/FinancialAccountReitAllOf.md)
 - [FinancialAccountReitTransaction](docs/FinancialAccountReitTransaction.md)
 - [FinancialAccountReitTransactionAllOf](docs/FinancialAccountReitTransactionAllOf.md)
 - [FinancialAccountSip](docs/FinancialAccountSip.md)
 - [FinancialAccountSipAllOf](docs/FinancialAccountSipAllOf.md)
 - [FinancialAccountSipTransaction](docs/FinancialAccountSipTransaction.md)
 - [FinancialAccountSipTransactionAllOf](docs/FinancialAccountSipTransactionAllOf.md)
 - [FinancialAccountSubCategoryType](docs/FinancialAccountSubCategoryType.md)
 - [FinancialAccountTermDeposit](docs/FinancialAccountTermDeposit.md)
 - [FinancialAccountTermDepositAllOf](docs/FinancialAccountTermDepositAllOf.md)
 - [FinancialAccountTermDepositTransaction](docs/FinancialAccountTermDepositTransaction.md)
 - [FinancialAccountTermDepositTransactionAllOf](docs/FinancialAccountTermDepositTransactionAllOf.md)
 - [FinancialAccountTransaction](docs/FinancialAccountTransaction.md)
 - [FinancialAccountTransactionPeriod](docs/FinancialAccountTransactionPeriod.md)
 - [FinancialAccountUlip](docs/FinancialAccountUlip.md)
 - [FinancialAccountUlipAllOf](docs/FinancialAccountUlipAllOf.md)
 - [FinancialAccountUlipTransaction](docs/FinancialAccountUlipTransaction.md)
 - [FinancialAccountUlipTransactionAllOf](docs/FinancialAccountUlipTransactionAllOf.md)
 - [GovtSecurity](docs/GovtSecurity.md)
 - [GovtSecurityTransaction](docs/GovtSecurityTransaction.md)
 - [Holder](docs/Holder.md)
 - [Holders](docs/Holders.md)
 - [HoldersType](docs/HoldersType.md)
 - [HoldingNominee](docs/HoldingNominee.md)
 - [IdentificationStrategy](docs/IdentificationStrategy.md)
 - [Identifier](docs/Identifier.md)
 - [IdentityField](docs/IdentityField.md)
 - [Idr](docs/Idr.md)
 - [IdrTransaction](docs/IdrTransaction.md)
 - [IndividualConsentRequestDetails](docs/IndividualConsentRequestDetails.md)
 - [IndividualConsentRequestTemplateDetails](docs/IndividualConsentRequestTemplateDetails.md)
 - [IndividualConsentRequestTemplateDetailsDataFrequency](docs/IndividualConsentRequestTemplateDetailsDataFrequency.md)
 - [IndividualConsentRequestTemplateDetailsDataLife](docs/IndividualConsentRequestTemplateDetailsDataLife.md)
 - [IndividualConsentRequestTemplateDetailsRequestLife](docs/IndividualConsentRequestTemplateDetailsRequestLife.md)
 - [InsurancePolicy](docs/InsurancePolicy.md)
 - [InsurancePolicyTransaction](docs/InsurancePolicyTransaction.md)
 - [Invit](docs/Invit.md)
 - [InvitTransaction](docs/InvitTransaction.md)
 - [IssuedDocument](docs/IssuedDocument.md)
 - [KeyValuePair](docs/KeyValuePair.md)
 - [Life](docs/Life.md)
 - [Loan](docs/Loan.md)
 - [LoanTransaction](docs/LoanTransaction.md)
 - [MedicalRecordField](docs/MedicalRecordField.md)
 - [MutualFund](docs/MutualFund.md)
 - [MutualFundFundType](docs/MutualFundFundType.md)
 - [MutualFundHolding](docs/MutualFundHolding.md)
 - [MutualFundHoldingMode](docs/MutualFundHoldingMode.md)
 - [MutualFundHoldings](docs/MutualFundHoldings.md)
 - [MutualFundInvestment](docs/MutualFundInvestment.md)
 - [MutualFundSchemeCategory](docs/MutualFundSchemeCategory.md)
 - [MutualFundSchemeOption](docs/MutualFundSchemeOption.md)
 - [MutualFundSchemePlan](docs/MutualFundSchemePlan.md)
 - [MutualFundSchemeType](docs/MutualFundSchemeType.md)
 - [MutualFundSummary](docs/MutualFundSummary.md)
 - [MutualFundTransaction](docs/MutualFundTransaction.md)
 - [MutualFundTransactionType](docs/MutualFundTransactionType.md)
 - [Nps](docs/Nps.md)
 - [NpsTransaction](docs/NpsTransaction.md)
 - [OrganizationConsentRequestDetails](docs/OrganizationConsentRequestDetails.md)
 - [OrganizationConsentRequestTemplateDetails](docs/OrganizationConsentRequestTemplateDetails.md)
 - [PaginatedListOfConsentRequestTemplates](docs/PaginatedListOfConsentRequestTemplates.md)
 - [PaginatedListOfConsents](docs/PaginatedListOfConsents.md)
 - [PaginatedListOfDataProcessingAgreements](docs/PaginatedListOfDataProcessingAgreements.md)
 - [PaginatedListOfDataProviders](docs/PaginatedListOfDataProviders.md)
 - [PaginatedListOfDocumentTypes](docs/PaginatedListOfDocumentTypes.md)
 - [PaginatedListOfFinancialAccountTransactions](docs/PaginatedListOfFinancialAccountTransactions.md)
 - [PaginatedListOfIndividualConsentRequestDetailss](docs/PaginatedListOfIndividualConsentRequestDetailss.md)
 - [PaginatedListOfIssuedDocuments](docs/PaginatedListOfIssuedDocuments.md)
 - [PaginatedListOfOrganizationConsentRequestDetailss](docs/PaginatedListOfOrganizationConsentRequestDetailss.md)
 - [PaymentOrderItem](docs/PaymentOrderItem.md)
 - [PaymentRequest](docs/PaymentRequest.md)
 - [Ppf](docs/Ppf.md)
 - [PpfTransaction](docs/PpfTransaction.md)
 - [Profile](docs/Profile.md)
 - [PushUriRequest](docs/PushUriRequest.md)
 - [PushUriResponse](docs/PushUriResponse.md)
 - [RecurringDeposit](docs/RecurringDeposit.md)
 - [RecurringDepositTransaction](docs/RecurringDepositTransaction.md)
 - [Reit](docs/Reit.md)
 - [ReitTransaction](docs/ReitTransaction.md)
 - [SelectedFinancialAccountType](docs/SelectedFinancialAccountType.md)
 - [Sip](docs/Sip.md)
 - [SipTransaction](docs/SipTransaction.md)
 - [SupportedDocumentType](docs/SupportedDocumentType.md)
 - [SupportedEntityType](docs/SupportedEntityType.md)
 - [SupportedIdentifier](docs/SupportedIdentifier.md)
 - [TermDeposit](docs/TermDeposit.md)
 - [TermDepositTransaction](docs/TermDepositTransaction.md)
 - [Ulip](docs/Ulip.md)
 - [UlipTransaction](docs/UlipTransaction.md)
 - [UpdateDataProcessingAgreement](docs/UpdateDataProcessingAgreement.md)
 - [UploadDocumentResponse](docs/UploadDocumentResponse.md)
 - [UriDetails](docs/UriDetails.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### OAuth2ClientCredentials

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - SupportedIdentifiers:Read: Read SupportedIdentifiers.
  - DataProviders:Read: Read DataProviders.
  - DataProcessingAgreements:Read: Read DataProcessingAgreements.
  - DataProcessingAgreements:Write: Read &amp; Write DataProcessingAgreements.
  - Individuals:DocumentTypes:Read: Read Individual DocumentTypes.
  - Individuals:Documents:Read: Read Individual Issued Documents.
  - Individuals:Documents:Issue: Issue Individual Documents.
  - Organizations:DocumentTypes:Read: Read Organization DocumentTypes.
  - Organizations:Documents:Read: Read Organization Issued Documents.
  - Organizations:Documents:Issue: Issue Organization Documents.
  - Individuals:ConsentRequests:Request: Request Individual Consent requests.
  - Individuals:ConsentRequests:Cancel: Cancel Individual Consent requests.
  - Individuals:ConsentRequests:Read: Read Individual Consent requests.
  - Organizations:ConsentRequests:Request: Request Organization Consent requests.
  - Organizations:ConsentRequests:Cancel: Cancel Organization Consent requests.
  - Organizations:ConsentRequests:Read: Read Organization Consent requests.
  - Individuals:Consents:Read: Read Individual Consents.
  - Organizations:Consents:Read: Read Organization Consents.
  - Individuals:ConsentRequestTemplates:Read: Read Individual Consent Request templates.
  - Organizations:ConsentRequestTemplates:Read: Read Organization Consent Request templates.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@mydatamyconsent.com

