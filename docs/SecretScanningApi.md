# SecretScanningApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**secretScanningGetAlert**](SecretScanningApi.md#secretScanningGetAlert) | **GET** /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number} | Get a secret scanning alert
[**secretScanningListAlertsForEnterprise**](SecretScanningApi.md#secretScanningListAlertsForEnterprise) | **GET** /enterprises/{enterprise}/secret-scanning/alerts | List secret scanning alerts for an enterprise
[**secretScanningListAlertsForOrg**](SecretScanningApi.md#secretScanningListAlertsForOrg) | **GET** /orgs/{org}/secret-scanning/alerts | List secret scanning alerts for an organization
[**secretScanningListAlertsForRepo**](SecretScanningApi.md#secretScanningListAlertsForRepo) | **GET** /repos/{owner}/{repo}/secret-scanning/alerts | List secret scanning alerts for a repository
[**secretScanningListLocationsForAlert**](SecretScanningApi.md#secretScanningListLocationsForAlert) | **GET** /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}/locations | List locations for a secret scanning alert
[**secretScanningUpdateAlert**](SecretScanningApi.md#secretScanningUpdateAlert) | **PATCH** /repos/{owner}/{repo}/secret-scanning/alerts/{alert_number} | Update a secret scanning alert


<a id="secretScanningGetAlert"></a>
# **secretScanningGetAlert**
> SecretScanningAlert secretScanningGetAlert(owner, repo, alertNumber)

Get a secret scanning alert

Gets a single secret scanning alert detected in an eligible repository.  The authenticated user must be an administrator for the repository or for the organization that owns the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;security_events&#x60; scope to use this endpoint. If this endpoint is only used with public repositories, the token can use the &#x60;public_repo&#x60; scope instead.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecretScanningApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val alertNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation.
try {
    val result : SecretScanningAlert = apiInstance.secretScanningGetAlert(owner, repo, alertNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecretScanningApi#secretScanningGetAlert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecretScanningApi#secretScanningGetAlert")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **alertNumber** | **kotlin.Int**| The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the &#x60;number&#x60; field in the response from the &#x60;GET /repos/{owner}/{repo}/code-scanning/alerts&#x60; operation. |

### Return type

[**SecretScanningAlert**](SecretScanningAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="secretScanningListAlertsForEnterprise"></a>
# **secretScanningListAlertsForEnterprise**
> kotlin.collections.List&lt;OrganizationSecretScanningAlert&gt; secretScanningListAlertsForEnterprise(enterprise, state, secretType, resolution, sort, direction, perPage, before, after, validity)

List secret scanning alerts for an enterprise

Lists secret scanning alerts for eligible repositories in an enterprise, from newest to oldest.  Alerts are only returned for organizations in the enterprise for which the authenticated user is an organization owner or a [security manager](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).  The authenticated user must be a member of the enterprise in order to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope or &#x60;security_events&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecretScanningApi()
val enterprise : kotlin.String = enterprise_example // kotlin.String | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
val state : kotlin.String = state_example // kotlin.String | Set to `open` or `resolved` to only list secret scanning alerts in a specific state.
val secretType : kotlin.String = secretType_example // kotlin.String | A comma-separated list of secret types to return. By default all secret types are returned. See \"[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)\" for a complete list of secret types.
val resolution : kotlin.String = resolution_example // kotlin.String | A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are `false_positive`, `wont_fix`, `revoked`, `pattern_edited`, `pattern_deleted` or `used_in_tests`.
val sort : kotlin.String = sort_example // kotlin.String | The property to sort the results by. `created` means when the alert was created. `updated` means when the alert was updated or resolved.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val before : kotlin.String = before_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val after : kotlin.String = after_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val validity : kotlin.String = validity_example // kotlin.String | A comma-separated list of validities that, when present, will return alerts that match the validities in this list. Valid options are `active`, `inactive`, and `unknown`.
try {
    val result : kotlin.collections.List<OrganizationSecretScanningAlert> = apiInstance.secretScanningListAlertsForEnterprise(enterprise, state, secretType, resolution, sort, direction, perPage, before, after, validity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecretScanningApi#secretScanningListAlertsForEnterprise")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecretScanningApi#secretScanningListAlertsForEnterprise")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **kotlin.String**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. |
 **state** | **kotlin.String**| Set to &#x60;open&#x60; or &#x60;resolved&#x60; to only list secret scanning alerts in a specific state. | [optional] [enum: open, resolved]
 **secretType** | **kotlin.String**| A comma-separated list of secret types to return. By default all secret types are returned. See \&quot;[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)\&quot; for a complete list of secret types. | [optional]
 **resolution** | **kotlin.String**| A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are &#x60;false_positive&#x60;, &#x60;wont_fix&#x60;, &#x60;revoked&#x60;, &#x60;pattern_edited&#x60;, &#x60;pattern_deleted&#x60; or &#x60;used_in_tests&#x60;. | [optional]
 **sort** | **kotlin.String**| The property to sort the results by. &#x60;created&#x60; means when the alert was created. &#x60;updated&#x60; means when the alert was updated or resolved. | [optional] [default to created] [enum: created, updated]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **before** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **after** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **validity** | **kotlin.String**| A comma-separated list of validities that, when present, will return alerts that match the validities in this list. Valid options are &#x60;active&#x60;, &#x60;inactive&#x60;, and &#x60;unknown&#x60;. | [optional]

### Return type

[**kotlin.collections.List&lt;OrganizationSecretScanningAlert&gt;**](OrganizationSecretScanningAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="secretScanningListAlertsForOrg"></a>
# **secretScanningListAlertsForOrg**
> kotlin.collections.List&lt;OrganizationSecretScanningAlert&gt; secretScanningListAlertsForOrg(org, state, secretType, resolution, sort, direction, page, perPage, before, after, validity)

List secret scanning alerts for an organization

Lists secret scanning alerts for eligible repositories in an organization, from newest to oldest.  The authenticated user must be an administrator or security manager for the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;security_events&#x60; scope to use this endpoint. If this endpoint is only used with public repositories, the token can use the &#x60;public_repo&#x60; scope instead.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecretScanningApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val state : kotlin.String = state_example // kotlin.String | Set to `open` or `resolved` to only list secret scanning alerts in a specific state.
val secretType : kotlin.String = secretType_example // kotlin.String | A comma-separated list of secret types to return. By default all secret types are returned. See \"[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)\" for a complete list of secret types.
val resolution : kotlin.String = resolution_example // kotlin.String | A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are `false_positive`, `wont_fix`, `revoked`, `pattern_edited`, `pattern_deleted` or `used_in_tests`.
val sort : kotlin.String = sort_example // kotlin.String | The property to sort the results by. `created` means when the alert was created. `updated` means when the alert was updated or resolved.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val before : kotlin.String = before_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for events before this cursor. To receive an initial cursor on your first request, include an empty \"before\" query string.
val after : kotlin.String = after_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for events after this cursor.  To receive an initial cursor on your first request, include an empty \"after\" query string.
val validity : kotlin.String = validity_example // kotlin.String | A comma-separated list of validities that, when present, will return alerts that match the validities in this list. Valid options are `active`, `inactive`, and `unknown`.
try {
    val result : kotlin.collections.List<OrganizationSecretScanningAlert> = apiInstance.secretScanningListAlertsForOrg(org, state, secretType, resolution, sort, direction, page, perPage, before, after, validity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecretScanningApi#secretScanningListAlertsForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecretScanningApi#secretScanningListAlertsForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **state** | **kotlin.String**| Set to &#x60;open&#x60; or &#x60;resolved&#x60; to only list secret scanning alerts in a specific state. | [optional] [enum: open, resolved]
 **secretType** | **kotlin.String**| A comma-separated list of secret types to return. By default all secret types are returned. See \&quot;[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)\&quot; for a complete list of secret types. | [optional]
 **resolution** | **kotlin.String**| A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are &#x60;false_positive&#x60;, &#x60;wont_fix&#x60;, &#x60;revoked&#x60;, &#x60;pattern_edited&#x60;, &#x60;pattern_deleted&#x60; or &#x60;used_in_tests&#x60;. | [optional]
 **sort** | **kotlin.String**| The property to sort the results by. &#x60;created&#x60; means when the alert was created. &#x60;updated&#x60; means when the alert was updated or resolved. | [optional] [default to created] [enum: created, updated]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **before** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for events before this cursor. To receive an initial cursor on your first request, include an empty \&quot;before\&quot; query string. | [optional]
 **after** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for events after this cursor.  To receive an initial cursor on your first request, include an empty \&quot;after\&quot; query string. | [optional]
 **validity** | **kotlin.String**| A comma-separated list of validities that, when present, will return alerts that match the validities in this list. Valid options are &#x60;active&#x60;, &#x60;inactive&#x60;, and &#x60;unknown&#x60;. | [optional]

### Return type

[**kotlin.collections.List&lt;OrganizationSecretScanningAlert&gt;**](OrganizationSecretScanningAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="secretScanningListAlertsForRepo"></a>
# **secretScanningListAlertsForRepo**
> kotlin.collections.List&lt;SecretScanningAlert&gt; secretScanningListAlertsForRepo(owner, repo, state, secretType, resolution, sort, direction, page, perPage, before, after, validity)

List secret scanning alerts for a repository

Lists secret scanning alerts for an eligible repository, from newest to oldest.  The authenticated user must be an administrator for the repository or for the organization that owns the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;security_events&#x60; scope to use this endpoint. If this endpoint is only used with public repositories, the token can use the &#x60;public_repo&#x60; scope instead.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecretScanningApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val state : kotlin.String = state_example // kotlin.String | Set to `open` or `resolved` to only list secret scanning alerts in a specific state.
val secretType : kotlin.String = secretType_example // kotlin.String | A comma-separated list of secret types to return. By default all secret types are returned. See \"[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)\" for a complete list of secret types.
val resolution : kotlin.String = resolution_example // kotlin.String | A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are `false_positive`, `wont_fix`, `revoked`, `pattern_edited`, `pattern_deleted` or `used_in_tests`.
val sort : kotlin.String = sort_example // kotlin.String | The property to sort the results by. `created` means when the alert was created. `updated` means when the alert was updated or resolved.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val before : kotlin.String = before_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for events before this cursor. To receive an initial cursor on your first request, include an empty \"before\" query string.
val after : kotlin.String = after_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for events after this cursor.  To receive an initial cursor on your first request, include an empty \"after\" query string.
val validity : kotlin.String = validity_example // kotlin.String | A comma-separated list of validities that, when present, will return alerts that match the validities in this list. Valid options are `active`, `inactive`, and `unknown`.
try {
    val result : kotlin.collections.List<SecretScanningAlert> = apiInstance.secretScanningListAlertsForRepo(owner, repo, state, secretType, resolution, sort, direction, page, perPage, before, after, validity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecretScanningApi#secretScanningListAlertsForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecretScanningApi#secretScanningListAlertsForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **state** | **kotlin.String**| Set to &#x60;open&#x60; or &#x60;resolved&#x60; to only list secret scanning alerts in a specific state. | [optional] [enum: open, resolved]
 **secretType** | **kotlin.String**| A comma-separated list of secret types to return. By default all secret types are returned. See \&quot;[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)\&quot; for a complete list of secret types. | [optional]
 **resolution** | **kotlin.String**| A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are &#x60;false_positive&#x60;, &#x60;wont_fix&#x60;, &#x60;revoked&#x60;, &#x60;pattern_edited&#x60;, &#x60;pattern_deleted&#x60; or &#x60;used_in_tests&#x60;. | [optional]
 **sort** | **kotlin.String**| The property to sort the results by. &#x60;created&#x60; means when the alert was created. &#x60;updated&#x60; means when the alert was updated or resolved. | [optional] [default to created] [enum: created, updated]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **before** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for events before this cursor. To receive an initial cursor on your first request, include an empty \&quot;before\&quot; query string. | [optional]
 **after** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for events after this cursor.  To receive an initial cursor on your first request, include an empty \&quot;after\&quot; query string. | [optional]
 **validity** | **kotlin.String**| A comma-separated list of validities that, when present, will return alerts that match the validities in this list. Valid options are &#x60;active&#x60;, &#x60;inactive&#x60;, and &#x60;unknown&#x60;. | [optional]

### Return type

[**kotlin.collections.List&lt;SecretScanningAlert&gt;**](SecretScanningAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="secretScanningListLocationsForAlert"></a>
# **secretScanningListLocationsForAlert**
> kotlin.collections.List&lt;SecretScanningLocation&gt; secretScanningListLocationsForAlert(owner, repo, alertNumber, page, perPage)

List locations for a secret scanning alert

Lists all locations for a given secret scanning alert for an eligible repository.  The authenticated user must be an administrator for the repository or for the organization that owns the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;security_events&#x60; scope to use this endpoint. If this endpoint is only used with public repositories, the token can use the &#x60;public_repo&#x60; scope instead.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecretScanningApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val alertNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SecretScanningLocation> = apiInstance.secretScanningListLocationsForAlert(owner, repo, alertNumber, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecretScanningApi#secretScanningListLocationsForAlert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecretScanningApi#secretScanningListLocationsForAlert")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **alertNumber** | **kotlin.Int**| The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the &#x60;number&#x60; field in the response from the &#x60;GET /repos/{owner}/{repo}/code-scanning/alerts&#x60; operation. |
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;SecretScanningLocation&gt;**](SecretScanningLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="secretScanningUpdateAlert"></a>
# **secretScanningUpdateAlert**
> SecretScanningAlert secretScanningUpdateAlert(owner, repo, alertNumber, secretScanningUpdateAlertRequest)

Update a secret scanning alert

Updates the status of a secret scanning alert in an eligible repository.  The authenticated user must be an administrator for the repository or for the organization that owns the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;security_events&#x60; scope to use this endpoint. If this endpoint is only used with public repositories, the token can use the &#x60;public_repo&#x60; scope instead.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecretScanningApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val alertNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation.
val secretScanningUpdateAlertRequest : SecretScanningUpdateAlertRequest = {"state":"resolved","resolution":"false_positive"} // SecretScanningUpdateAlertRequest | 
try {
    val result : SecretScanningAlert = apiInstance.secretScanningUpdateAlert(owner, repo, alertNumber, secretScanningUpdateAlertRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecretScanningApi#secretScanningUpdateAlert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecretScanningApi#secretScanningUpdateAlert")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **alertNumber** | **kotlin.Int**| The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the &#x60;number&#x60; field in the response from the &#x60;GET /repos/{owner}/{repo}/code-scanning/alerts&#x60; operation. |
 **secretScanningUpdateAlertRequest** | [**SecretScanningUpdateAlertRequest**](SecretScanningUpdateAlertRequest.md)|  |

### Return type

[**SecretScanningAlert**](SecretScanningAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

