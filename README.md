# mydatamyconsent-java-sdk

My Data My Consent - Developer API
- API version: v1
  - Build date: 2021-12-26T05:51:57.689420532Z[Etc/UTC]

Unleashing the power of data consent by establishing trust. The Platform Core Developer API defines a set of capabilities that can be used to request, issue, manage and update data, documents and credentials by organizations. The API can be used to request, manage and update Decentralised Identifiers, Financial Data, Health Data issue Documents, Credentials directly or using OpenID Connect flows, and verify Messages signed with DIDs and much more.

  For more information, please visit [https://mydatamyconsent.com/en-us/developers](https://mydatamyconsent.com/en-us/developers)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

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
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.mydatamyconsent:mydatamyconsent-java-sdk:v1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/mydatamyconsent-java-sdk-v1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.mydatamyconsent.ApiClient;
import com.mydatamyconsent.ApiException;
import com.mydatamyconsent.Configuration;
import com.mydatamyconsent.models.*;
import com.mydatamyconsent.api.DataConsentRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DataConsentRequestsApi apiInstance = new DataConsentRequestsApi(defaultClient);
    UUID requestId = new UUID(); // UUID | consent request id.
    try {
      apiInstance.cancelConsentRequest(requestId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataConsentRequestsApi#cancelConsentRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DataConsentRequestsApi* | [**cancelConsentRequest**](docs/DataConsentRequestsApi.md#cancelConsentRequest) | **DELETE** /v1/consent-requests/{requestId}/cancel | Cancel a Consent Request by ID.
*DataConsentRequestsApi* | [**createRequest**](docs/DataConsentRequestsApi.md#createRequest) | **POST** /v1/consent-requests | Create a consent request.
*DataConsentRequestsApi* | [**getAllConsentRequests**](docs/DataConsentRequestsApi.md#getAllConsentRequests) | **GET** /v1/consent-requests | Get all Consent Requests.
*DataConsentRequestsApi* | [**getConsentRequestById**](docs/DataConsentRequestsApi.md#getConsentRequestById) | **GET** /v1/consent-requests/{requestId} | Get a Consent Request by ID.
*DataConsentsApi* | [**v1ConsentsConsentIdAccountsAccountIdGet**](docs/DataConsentsApi.md#v1ConsentsConsentIdAccountsAccountIdGet) | **GET** /v1/consents/{consentId}/accounts/{accountId} | Get consented financial account details.
*DataConsentsApi* | [**v1ConsentsConsentIdAccountsAccountIdInsightsGet**](docs/DataConsentsApi.md#v1ConsentsConsentIdAccountsAccountIdInsightsGet) | **GET** /v1/consents/{consentId}/accounts/{accountId}/insights | Get consented financial account insights.
*DataConsentsApi* | [**v1ConsentsConsentIdAccountsAccountIdTransactionsGet**](docs/DataConsentsApi.md#v1ConsentsConsentIdAccountsAccountIdTransactionsGet) | **GET** /v1/consents/{consentId}/accounts/{accountId}/transactions | Get consented financial account transactions.
*DataConsentsApi* | [**v1ConsentsConsentIdAccountsGet**](docs/DataConsentsApi.md#v1ConsentsConsentIdAccountsGet) | **GET** /v1/consents/{consentId}/accounts | Get all accounts in a consent.
*DataConsentsApi* | [**v1ConsentsConsentIdDocumentsDocumentIdAnalysisGet**](docs/DataConsentsApi.md#v1ConsentsConsentIdDocumentsDocumentIdAnalysisGet) | **GET** /v1/consents/{consentId}/documents/{documentId}/analysis | Get analysis of a consented document.
*DataConsentsApi* | [**v1ConsentsConsentIdDocumentsDocumentIdDownloadGet**](docs/DataConsentsApi.md#v1ConsentsConsentIdDocumentsDocumentIdDownloadGet) | **GET** /v1/consents/{consentId}/documents/{documentId}/download | Download a consented document.
*DataConsentsApi* | [**v1ConsentsConsentIdDocumentsDocumentIdGet**](docs/DataConsentsApi.md#v1ConsentsConsentIdDocumentsDocumentIdGet) | **GET** /v1/consents/{consentId}/documents/{documentId} | Get consented document details.
*DataConsentsApi* | [**v1ConsentsConsentIdDocumentsGet**](docs/DataConsentsApi.md#v1ConsentsConsentIdDocumentsGet) | **GET** /v1/consents/{consentId}/documents | Get all documents in a consent.
*DataConsentsApi* | [**v1ConsentsConsentIdGet**](docs/DataConsentsApi.md#v1ConsentsConsentIdGet) | **GET** /v1/consents/{consentId} | Get consent details by consent id.
*DataConsentsApi* | [**v1ConsentsGet**](docs/DataConsentsApi.md#v1ConsentsGet) | **GET** /v1/consents | Get all consents filtered by status and time.
*DataProcessingAgreementsApi* | [**v1DataAgreementsGet**](docs/DataProcessingAgreementsApi.md#v1DataAgreementsGet) | **GET** /v1/data-agreements | Get all data processing agreements.
*DataProcessingAgreementsApi* | [**v1DataAgreementsIdDelete**](docs/DataProcessingAgreementsApi.md#v1DataAgreementsIdDelete) | **DELETE** /v1/data-agreements/{id} | Delete a data processing agreement. This will not delete a published or a agreement in use with consents.
*DataProcessingAgreementsApi* | [**v1DataAgreementsIdGet**](docs/DataProcessingAgreementsApi.md#v1DataAgreementsIdGet) | **GET** /v1/data-agreements/{id} | Get data processing agreement by Id.
*DataProcessingAgreementsApi* | [**v1DataAgreementsIdPut**](docs/DataProcessingAgreementsApi.md#v1DataAgreementsIdPut) | **PUT** /v1/data-agreements/{id} | Update a data processing agreement.
*DataProcessingAgreementsApi* | [**v1DataAgreementsIdTerminatePut**](docs/DataProcessingAgreementsApi.md#v1DataAgreementsIdTerminatePut) | **PUT** /v1/data-agreements/{id}/terminate | Terminate a data processing agreement.
*DataProcessingAgreementsApi* | [**v1DataAgreementsPost**](docs/DataProcessingAgreementsApi.md#v1DataAgreementsPost) | **POST** /v1/data-agreements | Create a data processing agreement.
*DataProviderDiscoveryApi* | [**v1DataProvidersGet**](docs/DataProviderDiscoveryApi.md#v1DataProvidersGet) | **GET** /v1/data-providers | Discover all data providers in My Data My Consent by country and filters.
*DataProviderDiscoveryApi* | [**v1DataProvidersProviderIdGet**](docs/DataProviderDiscoveryApi.md#v1DataProvidersProviderIdGet) | **GET** /v1/data-providers/{providerId} | Get a Data Provider details.
*DigiLockerCompatIssuerApi* | [**issuerIssuedoc1XmlPost**](docs/DigiLockerCompatIssuerApi.md#issuerIssuedoc1XmlPost) | **POST** /issuer/issuedoc/1/xml | Digilocker Compatible endpoint to Issue Documents.
*DocumentsApi* | [**issueDocument**](docs/DocumentsApi.md#issueDocument) | **POST** /v1/documents/issue | Issue a new document.
*DocumentsApi* | [**v1DocumentsIssuedDocumentIdGet**](docs/DocumentsApi.md#v1DocumentsIssuedDocumentIdGet) | **GET** /v1/documents/issued/{documentId} | Get issued document.
*DocumentsApi* | [**v1DocumentsIssuedGet**](docs/DocumentsApi.md#v1DocumentsIssuedGet) | **GET** /v1/documents/issued | Get issued documents.
*DocumentsApi* | [**v1DocumentsTypesGet**](docs/DocumentsApi.md#v1DocumentsTypesGet) | **GET** /v1/documents/types | Get registered document types.


## Documentation for Models

 - [ApplicationUser](docs/ApplicationUser.md)
 - [AuthorizedPersonnelKycDocumentType](docs/AuthorizedPersonnelKycDocumentType.md)
 - [BankAccountType](docs/BankAccountType.md)
 - [CategoryIconFontFamily](docs/CategoryIconFontFamily.md)
 - [Country](docs/Country.md)
 - [CountryState](docs/CountryState.md)
 - [DataConsent](docs/DataConsent.md)
 - [DataConsentDetailsDto](docs/DataConsentDetailsDto.md)
 - [DataConsentIdentifier](docs/DataConsentIdentifier.md)
 - [DataConsentRequestModel](docs/DataConsentRequestModel.md)
 - [DataConsentRequestedAccountDto](docs/DataConsentRequestedAccountDto.md)
 - [DataConsentRequestedDocument](docs/DataConsentRequestedDocument.md)
 - [DataConsentRequestedDocumentDto](docs/DataConsentRequestedDocumentDto.md)
 - [DataConsentRequestedFaDto](docs/DataConsentRequestedFaDto.md)
 - [DataConsentRequestedFinancialAccount](docs/DataConsentRequestedFinancialAccount.md)
 - [DataConsentRequesterDto](docs/DataConsentRequesterDto.md)
 - [DataConsentRfaFilter](docs/DataConsentRfaFilter.md)
 - [DataConsentRfaFilterDto](docs/DataConsentRfaFilterDto.md)
 - [DataConsentStatus](docs/DataConsentStatus.md)
 - [DataFetchFrequencyUnit](docs/DataFetchFrequencyUnit.md)
 - [DataFetchType](docs/DataFetchType.md)
 - [DataLifeUnit](docs/DataLifeUnit.md)
 - [DataProcessingAgreement](docs/DataProcessingAgreement.md)
 - [DataProcessingAgreementPaginatedList](docs/DataProcessingAgreementPaginatedList.md)
 - [DataProtectionOfficer](docs/DataProtectionOfficer.md)
 - [DataProvider](docs/DataProvider.md)
 - [DataProviderPaginatedList](docs/DataProviderPaginatedList.md)
 - [DocumentIssueRequest](docs/DocumentIssueRequest.md)
 - [DocumentProviderCategory](docs/DocumentProviderCategory.md)
 - [FileType](docs/FileType.md)
 - [FilterType](docs/FilterType.md)
 - [FinancialAccountTypes](docs/FinancialAccountTypes.md)
 - [Gender](docs/Gender.md)
 - [IdentificationStrategy](docs/IdentificationStrategy.md)
 - [Identifier](docs/Identifier.md)
 - [IdentifierStringKeyValuePair](docs/IdentifierStringKeyValuePair.md)
 - [IdentityClaim](docs/IdentityClaim.md)
 - [JsonSchema](docs/JsonSchema.md)
 - [Operator](docs/Operator.md)
 - [Organization](docs/Organization.md)
 - [OrganizationAddress](docs/OrganizationAddress.md)
 - [OrganizationAddressType](docs/OrganizationAddressType.md)
 - [OrganizationCategory](docs/OrganizationCategory.md)
 - [OrganizationFinancialAccount](docs/OrganizationFinancialAccount.md)
 - [OrganizationKyoDocument](docs/OrganizationKyoDocument.md)
 - [OrganizationMetaData](docs/OrganizationMetaData.md)
 - [OrganizationStatus](docs/OrganizationStatus.md)
 - [OrganizationType](docs/OrganizationType.md)
 - [ProblemDetails](docs/ProblemDetails.md)
 - [ProofDocumentType](docs/ProofDocumentType.md)
 - [PushUriRequest](docs/PushUriRequest.md)
 - [PushUriResponse](docs/PushUriResponse.md)
 - [Receiver](docs/Receiver.md)
 - [ReceiverType](docs/ReceiverType.md)
 - [RefreshToken](docs/RefreshToken.md)
 - [Rejection](docs/Rejection.md)
 - [SuggestedAccountDto](docs/SuggestedAccountDto.md)
 - [Theme](docs/Theme.md)
 - [UriDetails](docs/UriDetails.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@mydatamyconsent.com

