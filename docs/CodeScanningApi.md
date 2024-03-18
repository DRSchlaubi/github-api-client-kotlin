# CodeScanningApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**codeScanningDeleteAnalysis**](CodeScanningApi.md#codeScanningDeleteAnalysis) | **DELETE** /repos/{owner}/{repo}/code-scanning/analyses/{analysis_id} | Delete a code scanning analysis from a repository
[**codeScanningGetAlert**](CodeScanningApi.md#codeScanningGetAlert) | **GET** /repos/{owner}/{repo}/code-scanning/alerts/{alert_number} | Get a code scanning alert
[**codeScanningGetAnalysis**](CodeScanningApi.md#codeScanningGetAnalysis) | **GET** /repos/{owner}/{repo}/code-scanning/analyses/{analysis_id} | Get a code scanning analysis for a repository
[**codeScanningGetCodeqlDatabase**](CodeScanningApi.md#codeScanningGetCodeqlDatabase) | **GET** /repos/{owner}/{repo}/code-scanning/codeql/databases/{language} | Get a CodeQL database for a repository
[**codeScanningGetDefaultSetup**](CodeScanningApi.md#codeScanningGetDefaultSetup) | **GET** /repos/{owner}/{repo}/code-scanning/default-setup | Get a code scanning default setup configuration
[**codeScanningGetSarif**](CodeScanningApi.md#codeScanningGetSarif) | **GET** /repos/{owner}/{repo}/code-scanning/sarifs/{sarif_id} | Get information about a SARIF upload
[**codeScanningListAlertInstances**](CodeScanningApi.md#codeScanningListAlertInstances) | **GET** /repos/{owner}/{repo}/code-scanning/alerts/{alert_number}/instances | List instances of a code scanning alert
[**codeScanningListAlertsForOrg**](CodeScanningApi.md#codeScanningListAlertsForOrg) | **GET** /orgs/{org}/code-scanning/alerts | List code scanning alerts for an organization
[**codeScanningListAlertsForRepo**](CodeScanningApi.md#codeScanningListAlertsForRepo) | **GET** /repos/{owner}/{repo}/code-scanning/alerts | List code scanning alerts for a repository
[**codeScanningListCodeqlDatabases**](CodeScanningApi.md#codeScanningListCodeqlDatabases) | **GET** /repos/{owner}/{repo}/code-scanning/codeql/databases | List CodeQL databases for a repository
[**codeScanningListRecentAnalyses**](CodeScanningApi.md#codeScanningListRecentAnalyses) | **GET** /repos/{owner}/{repo}/code-scanning/analyses | List code scanning analyses for a repository
[**codeScanningUpdateAlert**](CodeScanningApi.md#codeScanningUpdateAlert) | **PATCH** /repos/{owner}/{repo}/code-scanning/alerts/{alert_number} | Update a code scanning alert
[**codeScanningUpdateDefaultSetup**](CodeScanningApi.md#codeScanningUpdateDefaultSetup) | **PATCH** /repos/{owner}/{repo}/code-scanning/default-setup | Update a code scanning default setup configuration
[**codeScanningUploadSarif**](CodeScanningApi.md#codeScanningUploadSarif) | **POST** /repos/{owner}/{repo}/code-scanning/sarifs | Upload an analysis as SARIF data


<a id="codeScanningDeleteAnalysis"></a>
# **codeScanningDeleteAnalysis**
> CodeScanningAnalysisDeletion codeScanningDeleteAnalysis(owner, repo, analysisId, confirmDelete)

Delete a code scanning analysis from a repository

Deletes a specified code scanning analysis from a repository.  You can delete one analysis at a time. To delete a series of analyses, start with the most recent analysis and work backwards. Conceptually, the process is similar to the undo function in a text editor.  When you list the analyses for a repository, one or more will be identified as deletable in the response:  &#x60;&#x60;&#x60; \&quot;deletable\&quot;: true &#x60;&#x60;&#x60;  An analysis is deletable when it&#39;s the most recent in a set of analyses. Typically, a repository will have multiple sets of analyses for each enabled code scanning tool, where a set is determined by a unique combination of analysis values:  * &#x60;ref&#x60; * &#x60;tool&#x60; * &#x60;category&#x60;  If you attempt to delete an analysis that is not the most recent in a set, you&#39;ll get a 400 response with the message:  &#x60;&#x60;&#x60; Analysis specified is not deletable. &#x60;&#x60;&#x60;  The response from a successful &#x60;DELETE&#x60; operation provides you with two alternative URLs for deleting the next analysis in the set: &#x60;next_analysis_url&#x60; and &#x60;confirm_delete_url&#x60;. Use the &#x60;next_analysis_url&#x60; URL if you want to avoid accidentally deleting the final analysis in a set. This is a useful option if you want to preserve at least one analysis for the specified tool in your repository. Use the &#x60;confirm_delete_url&#x60; URL if you are content to remove all analyses for a tool. When you delete the last analysis in a set, the value of &#x60;next_analysis_url&#x60; and &#x60;confirm_delete_url&#x60; in the 200 response is &#x60;null&#x60;.  As an example of the deletion process, let&#39;s imagine that you added a workflow that configured a particular code scanning tool to analyze the code in a repository. This tool has added 15 analyses: 10 on the default branch, and another 5 on a topic branch. You therefore have two separate sets of analyses for this tool. You&#39;ve now decided that you want to remove all of the analyses for the tool. To do this you must make 15 separate deletion requests. To start, you must find an analysis that&#39;s identified as deletable. Each set of analyses always has one that&#39;s identified as deletable. Having found the deletable analysis for one of the two sets, delete this analysis and then continue deleting the next analysis in the set until they&#39;re all deleted. Then repeat the process for the second set. The procedure therefore consists of a nested loop:  **Outer loop**: * List the analyses for the repository, filtered by tool. * Parse this list to find a deletable analysis. If found:    **Inner loop**:   * Delete the identified analysis.   * Parse the response for the value of &#x60;confirm_delete_url&#x60; and, if found, use this in the next iteration.  The above process assumes that you want to remove all trace of the tool&#39;s analyses from the GitHub user interface, for the specified repository, and it therefore uses the &#x60;confirm_delete_url&#x60; value. Alternatively, you could use the &#x60;next_analysis_url&#x60; value, which would leave the last analysis in each set undeleted to avoid removing a tool&#39;s analysis entirely.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with private or public repositories, or the &#x60;public_repo&#x60; scope to use this endpoint with only public repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodeScanningApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val analysisId : kotlin.Int = 56 // kotlin.Int | The ID of the analysis, as returned from the `GET /repos/{owner}/{repo}/code-scanning/analyses` operation.
val confirmDelete : kotlin.String = confirmDelete_example // kotlin.String | Allow deletion if the specified analysis is the last in a set. If you attempt to delete the final analysis in a set without setting this parameter to `true`, you'll get a 400 response with the message: `Analysis is last of its type and deletion may result in the loss of historical alert data. Please specify confirm_delete.`
try {
    val result : CodeScanningAnalysisDeletion = apiInstance.codeScanningDeleteAnalysis(owner, repo, analysisId, confirmDelete)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodeScanningApi#codeScanningDeleteAnalysis")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodeScanningApi#codeScanningDeleteAnalysis")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **analysisId** | **kotlin.Int**| The ID of the analysis, as returned from the &#x60;GET /repos/{owner}/{repo}/code-scanning/analyses&#x60; operation. |
 **confirmDelete** | **kotlin.String**| Allow deletion if the specified analysis is the last in a set. If you attempt to delete the final analysis in a set without setting this parameter to &#x60;true&#x60;, you&#39;ll get a 400 response with the message: &#x60;Analysis is last of its type and deletion may result in the loss of historical alert data. Please specify confirm_delete.&#x60; | [optional]

### Return type

[**CodeScanningAnalysisDeletion**](CodeScanningAnalysisDeletion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="codeScanningGetAlert"></a>
# **codeScanningGetAlert**
> CodeScanningAlert codeScanningGetAlert(owner, repo, alertNumber)

Get a code scanning alert

Gets a single code scanning alert.  OAuth app tokens and personal access tokens (classic) need the &#x60;security_events&#x60; scope to use this endpoint with private or public repositories, or the &#x60;public_repo&#x60; scope to use this endpoint with only public repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodeScanningApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val alertNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation.
try {
    val result : CodeScanningAlert = apiInstance.codeScanningGetAlert(owner, repo, alertNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodeScanningApi#codeScanningGetAlert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodeScanningApi#codeScanningGetAlert")
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

[**CodeScanningAlert**](CodeScanningAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codeScanningGetAnalysis"></a>
# **codeScanningGetAnalysis**
> CodeScanningAnalysis codeScanningGetAnalysis(owner, repo, analysisId)

Get a code scanning analysis for a repository

Gets a specified code scanning analysis for a repository.  The default JSON response contains fields that describe the analysis. This includes the Git reference and commit SHA to which the analysis relates, the datetime of the analysis, the name of the code scanning tool, and the number of alerts.  The &#x60;rules_count&#x60; field in the default response give the number of rules that were run in the analysis. For very old analyses this data is not available, and &#x60;0&#x60; is returned in this field.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/sarif+json&#x60;**: Instead of returning a summary of the analysis, this endpoint returns a subset of the analysis data that was uploaded. The data is formatted as [SARIF version 2.1.0](https://docs.oasis-open.org/sarif/sarif/v2.1.0/cs01/sarif-v2.1.0-cs01.html). It also returns additional data such as the &#x60;github/alertNumber&#x60; and &#x60;github/alertUrl&#x60; properties.  OAuth app tokens and personal access tokens (classic) need the &#x60;security_events&#x60; scope to use this endpoint with private or public repositories, or the &#x60;public_repo&#x60; scope to use this endpoint with only public repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodeScanningApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val analysisId : kotlin.Int = 56 // kotlin.Int | The ID of the analysis, as returned from the `GET /repos/{owner}/{repo}/code-scanning/analyses` operation.
try {
    val result : CodeScanningAnalysis = apiInstance.codeScanningGetAnalysis(owner, repo, analysisId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodeScanningApi#codeScanningGetAnalysis")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodeScanningApi#codeScanningGetAnalysis")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **analysisId** | **kotlin.Int**| The ID of the analysis, as returned from the &#x60;GET /repos/{owner}/{repo}/code-scanning/analyses&#x60; operation. |

### Return type

[**CodeScanningAnalysis**](CodeScanningAnalysis.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json+sarif

<a id="codeScanningGetCodeqlDatabase"></a>
# **codeScanningGetCodeqlDatabase**
> CodeScanningCodeqlDatabase codeScanningGetCodeqlDatabase(owner, repo, language)

Get a CodeQL database for a repository

Gets a CodeQL database for a language in a repository.  By default this endpoint returns JSON metadata about the CodeQL database. To download the CodeQL database binary content, set the &#x60;Accept&#x60; header of the request to [&#x60;application/zip&#x60;](https://docs.github.com/rest/overview/media-types), and make sure your HTTP client is configured to follow redirects or use the &#x60;Location&#x60; header to make a second request to get the redirect URL.  OAuth app tokens and personal access tokens (classic) need the &#x60;security_events&#x60; scope to use this endpoint with private or public repositories, or the &#x60;public_repo&#x60; scope to use this endpoint with only public repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodeScanningApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val language : kotlin.String = language_example // kotlin.String | The language of the CodeQL database.
try {
    val result : CodeScanningCodeqlDatabase = apiInstance.codeScanningGetCodeqlDatabase(owner, repo, language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodeScanningApi#codeScanningGetCodeqlDatabase")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodeScanningApi#codeScanningGetCodeqlDatabase")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **language** | **kotlin.String**| The language of the CodeQL database. | [default to &quot;push&quot;]

### Return type

[**CodeScanningCodeqlDatabase**](CodeScanningCodeqlDatabase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codeScanningGetDefaultSetup"></a>
# **codeScanningGetDefaultSetup**
> CodeScanningDefaultSetup codeScanningGetDefaultSetup(owner, repo)

Get a code scanning default setup configuration

Gets a code scanning default setup configuration.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with private or public repositories, or the &#x60;public_repo&#x60; scope to use this endpoint with only public repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodeScanningApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : CodeScanningDefaultSetup = apiInstance.codeScanningGetDefaultSetup(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodeScanningApi#codeScanningGetDefaultSetup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodeScanningApi#codeScanningGetDefaultSetup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**CodeScanningDefaultSetup**](CodeScanningDefaultSetup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codeScanningGetSarif"></a>
# **codeScanningGetSarif**
> CodeScanningSarifsStatus codeScanningGetSarif(owner, repo, sarifId)

Get information about a SARIF upload

Gets information about a SARIF upload, including the status and the URL of the analysis that was uploaded so that you can retrieve details of the analysis. For more information, see \&quot;[Get a code scanning analysis for a repository](/rest/code-scanning/code-scanning#get-a-code-scanning-analysis-for-a-repository).\&quot; OAuth app tokens and personal access tokens (classic) need the &#x60;security_events&#x60; scope to use this endpoint with private or public repositories, or the &#x60;public_repo&#x60; scope to use this endpoint with only public repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodeScanningApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val sarifId : kotlin.String = sarifId_example // kotlin.String | The SARIF ID obtained after uploading.
try {
    val result : CodeScanningSarifsStatus = apiInstance.codeScanningGetSarif(owner, repo, sarifId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodeScanningApi#codeScanningGetSarif")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodeScanningApi#codeScanningGetSarif")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **sarifId** | **kotlin.String**| The SARIF ID obtained after uploading. | [default to &quot;push&quot;]

### Return type

[**CodeScanningSarifsStatus**](CodeScanningSarifsStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codeScanningListAlertInstances"></a>
# **codeScanningListAlertInstances**
> kotlin.collections.List&lt;CodeScanningAlertInstance&gt; codeScanningListAlertInstances(owner, repo, alertNumber, page, perPage, ref)

List instances of a code scanning alert

Lists all instances of the specified code scanning alert.  OAuth app tokens and personal access tokens (classic) need the &#x60;security_events&#x60; scope to use this endpoint with private or public repositories, or the &#x60;public_repo&#x60; scope to use this endpoint with only public repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodeScanningApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val alertNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val ref : kotlin.String = ref_example // kotlin.String | The Git reference for the results you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
try {
    val result : kotlin.collections.List<CodeScanningAlertInstance> = apiInstance.codeScanningListAlertInstances(owner, repo, alertNumber, page, perPage, ref)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodeScanningApi#codeScanningListAlertInstances")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodeScanningApi#codeScanningListAlertInstances")
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
 **ref** | **kotlin.String**| The Git reference for the results you want to list. The &#x60;ref&#x60; for a branch can be formatted either as &#x60;refs/heads/&lt;branch name&gt;&#x60; or simply &#x60;&lt;branch name&gt;&#x60;. To reference a pull request use &#x60;refs/pull/&lt;number&gt;/merge&#x60;. | [optional]

### Return type

[**kotlin.collections.List&lt;CodeScanningAlertInstance&gt;**](CodeScanningAlertInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codeScanningListAlertsForOrg"></a>
# **codeScanningListAlertsForOrg**
> kotlin.collections.List&lt;CodeScanningOrganizationAlertItems&gt; codeScanningListAlertsForOrg(org, toolName, toolGuid, before, after, page, perPage, direction, state, sort, severity)

List code scanning alerts for an organization

Lists code scanning alerts for the default branch for all eligible repositories in an organization. Eligible repositories are repositories that are owned by organizations that you own or for which you are a security manager. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  The authenticated user must be an owner or security manager for the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;security_events&#x60; or &#x60;repo&#x60;s cope to use this endpoint with private or public repositories, or the &#x60;public_repo&#x60; scope to use this endpoint with only public repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodeScanningApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val toolName : kotlin.String = toolName_example // kotlin.String | The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either `tool_name` or `tool_guid`, but not both.
val toolGuid : kotlin.String = toolGuid_example // kotlin.String | The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid` or `tool_name`, but not both.
val before : kotlin.String = before_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val after : kotlin.String = after_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val state : CodeScanningAlertStateQuery =  // CodeScanningAlertStateQuery | If specified, only code scanning alerts with this state will be returned.
val sort : kotlin.String = sort_example // kotlin.String | The property by which to sort the results.
val severity : CodeScanningAlertSeverity =  // CodeScanningAlertSeverity | If specified, only code scanning alerts with this severity will be returned.
try {
    val result : kotlin.collections.List<CodeScanningOrganizationAlertItems> = apiInstance.codeScanningListAlertsForOrg(org, toolName, toolGuid, before, after, page, perPage, direction, state, sort, severity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodeScanningApi#codeScanningListAlertsForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodeScanningApi#codeScanningListAlertsForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **toolName** | **kotlin.String**| The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either &#x60;tool_name&#x60; or &#x60;tool_guid&#x60;, but not both. | [optional]
 **toolGuid** | **kotlin.String**| The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either &#x60;tool_guid&#x60; or &#x60;tool_name&#x60;, but not both. | [optional]
 **before** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **after** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **state** | [**CodeScanningAlertStateQuery**](.md)| If specified, only code scanning alerts with this state will be returned. | [optional] [enum: open, closed, dismissed, fixed]
 **sort** | **kotlin.String**| The property by which to sort the results. | [optional] [default to created] [enum: created, updated]
 **severity** | [**CodeScanningAlertSeverity**](.md)| If specified, only code scanning alerts with this severity will be returned. | [optional] [enum: critical, high, medium, low, warning, note, error]

### Return type

[**kotlin.collections.List&lt;CodeScanningOrganizationAlertItems&gt;**](CodeScanningOrganizationAlertItems.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codeScanningListAlertsForRepo"></a>
# **codeScanningListAlertsForRepo**
> kotlin.collections.List&lt;CodeScanningAlertItems&gt; codeScanningListAlertsForRepo(owner, repo, toolName, toolGuid, page, perPage, ref, direction, sort, state, severity)

List code scanning alerts for a repository

Lists code scanning alerts.  The response includes a &#x60;most_recent_instance&#x60; object. This provides details of the most recent instance of this alert for the default branch (or for the specified Git reference if you used &#x60;ref&#x60; in the request).  OAuth app tokens and personal access tokens (classic) need the &#x60;security_events&#x60; scope to use this endpoint with private or public repositories, or the &#x60;public_repo&#x60; scope to use this endpoint with only public repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodeScanningApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val toolName : kotlin.String = toolName_example // kotlin.String | The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either `tool_name` or `tool_guid`, but not both.
val toolGuid : kotlin.String = toolGuid_example // kotlin.String | The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid` or `tool_name`, but not both.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val ref : kotlin.String = ref_example // kotlin.String | The Git reference for the results you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val sort : kotlin.String = sort_example // kotlin.String | The property by which to sort the results.
val state : CodeScanningAlertStateQuery =  // CodeScanningAlertStateQuery | If specified, only code scanning alerts with this state will be returned.
val severity : CodeScanningAlertSeverity =  // CodeScanningAlertSeverity | If specified, only code scanning alerts with this severity will be returned.
try {
    val result : kotlin.collections.List<CodeScanningAlertItems> = apiInstance.codeScanningListAlertsForRepo(owner, repo, toolName, toolGuid, page, perPage, ref, direction, sort, state, severity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodeScanningApi#codeScanningListAlertsForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodeScanningApi#codeScanningListAlertsForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **toolName** | **kotlin.String**| The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either &#x60;tool_name&#x60; or &#x60;tool_guid&#x60;, but not both. | [optional]
 **toolGuid** | **kotlin.String**| The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either &#x60;tool_guid&#x60; or &#x60;tool_name&#x60;, but not both. | [optional]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **ref** | **kotlin.String**| The Git reference for the results you want to list. The &#x60;ref&#x60; for a branch can be formatted either as &#x60;refs/heads/&lt;branch name&gt;&#x60; or simply &#x60;&lt;branch name&gt;&#x60;. To reference a pull request use &#x60;refs/pull/&lt;number&gt;/merge&#x60;. | [optional]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **sort** | **kotlin.String**| The property by which to sort the results. | [optional] [default to created] [enum: created, updated]
 **state** | [**CodeScanningAlertStateQuery**](.md)| If specified, only code scanning alerts with this state will be returned. | [optional] [enum: open, closed, dismissed, fixed]
 **severity** | [**CodeScanningAlertSeverity**](.md)| If specified, only code scanning alerts with this severity will be returned. | [optional] [enum: critical, high, medium, low, warning, note, error]

### Return type

[**kotlin.collections.List&lt;CodeScanningAlertItems&gt;**](CodeScanningAlertItems.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codeScanningListCodeqlDatabases"></a>
# **codeScanningListCodeqlDatabases**
> kotlin.collections.List&lt;CodeScanningCodeqlDatabase&gt; codeScanningListCodeqlDatabases(owner, repo)

List CodeQL databases for a repository

Lists the CodeQL databases that are available in a repository.  OAuth app tokens and personal access tokens (classic) need the &#x60;security_events&#x60; scope to use this endpoint with private or public repositories, or the &#x60;public_repo&#x60; scope to use this endpoint with only public repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodeScanningApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : kotlin.collections.List<CodeScanningCodeqlDatabase> = apiInstance.codeScanningListCodeqlDatabases(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodeScanningApi#codeScanningListCodeqlDatabases")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodeScanningApi#codeScanningListCodeqlDatabases")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**kotlin.collections.List&lt;CodeScanningCodeqlDatabase&gt;**](CodeScanningCodeqlDatabase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codeScanningListRecentAnalyses"></a>
# **codeScanningListRecentAnalyses**
> kotlin.collections.List&lt;CodeScanningAnalysis&gt; codeScanningListRecentAnalyses(owner, repo, toolName, toolGuid, page, perPage, ref, sarifId, direction, sort)

List code scanning analyses for a repository

Lists the details of all code scanning analyses for a repository, starting with the most recent. The response is paginated and you can use the &#x60;page&#x60; and &#x60;per_page&#x60; parameters to list the analyses you&#39;re interested in. By default 30 analyses are listed per page.  The &#x60;rules_count&#x60; field in the response give the number of rules that were run in the analysis. For very old analyses this data is not available, and &#x60;0&#x60; is returned in this field.  **Deprecation notice**: The &#x60;tool_name&#x60; field is deprecated and will, in future, not be included in the response for this endpoint. The example response reflects this change. The tool name can now be found inside the &#x60;tool&#x60; field.  OAuth app tokens and personal access tokens (classic) need the &#x60;security_events&#x60; scope to use this endpoint with private or public repositories, or the &#x60;public_repo&#x60; scope to use this endpoint with only public repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodeScanningApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val toolName : kotlin.String = toolName_example // kotlin.String | The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either `tool_name` or `tool_guid`, but not both.
val toolGuid : kotlin.String = toolGuid_example // kotlin.String | The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid` or `tool_name`, but not both.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val ref : kotlin.String = ref_example // kotlin.String | The Git reference for the analyses you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
val sarifId : kotlin.String = sarifId_example // kotlin.String | Filter analyses belonging to the same SARIF upload.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val sort : kotlin.String = sort_example // kotlin.String | The property by which to sort the results.
try {
    val result : kotlin.collections.List<CodeScanningAnalysis> = apiInstance.codeScanningListRecentAnalyses(owner, repo, toolName, toolGuid, page, perPage, ref, sarifId, direction, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodeScanningApi#codeScanningListRecentAnalyses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodeScanningApi#codeScanningListRecentAnalyses")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **toolName** | **kotlin.String**| The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either &#x60;tool_name&#x60; or &#x60;tool_guid&#x60;, but not both. | [optional]
 **toolGuid** | **kotlin.String**| The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either &#x60;tool_guid&#x60; or &#x60;tool_name&#x60;, but not both. | [optional]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **ref** | **kotlin.String**| The Git reference for the analyses you want to list. The &#x60;ref&#x60; for a branch can be formatted either as &#x60;refs/heads/&lt;branch name&gt;&#x60; or simply &#x60;&lt;branch name&gt;&#x60;. To reference a pull request use &#x60;refs/pull/&lt;number&gt;/merge&#x60;. | [optional]
 **sarifId** | **kotlin.String**| Filter analyses belonging to the same SARIF upload. | [optional]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **sort** | **kotlin.String**| The property by which to sort the results. | [optional] [default to created] [enum: created]

### Return type

[**kotlin.collections.List&lt;CodeScanningAnalysis&gt;**](CodeScanningAnalysis.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codeScanningUpdateAlert"></a>
# **codeScanningUpdateAlert**
> CodeScanningAlert codeScanningUpdateAlert(owner, repo, alertNumber, codeScanningUpdateAlertRequest)

Update a code scanning alert

Updates the status of a single code scanning alert. OAuth app tokens and personal access tokens (classic) need the &#x60;security_events&#x60; scope to use this endpoint with private or public repositories, or the &#x60;public_repo&#x60; scope to use this endpoint with only public repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodeScanningApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val alertNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation.
val codeScanningUpdateAlertRequest : CodeScanningUpdateAlertRequest = {"state":"dismissed","dismissed_reason":"false positive","dismissed_comment":"This alert is not actually correct, because there's a sanitizer included in the library."} // CodeScanningUpdateAlertRequest | 
try {
    val result : CodeScanningAlert = apiInstance.codeScanningUpdateAlert(owner, repo, alertNumber, codeScanningUpdateAlertRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodeScanningApi#codeScanningUpdateAlert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodeScanningApi#codeScanningUpdateAlert")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **alertNumber** | **kotlin.Int**| The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the &#x60;number&#x60; field in the response from the &#x60;GET /repos/{owner}/{repo}/code-scanning/alerts&#x60; operation. |
 **codeScanningUpdateAlertRequest** | [**CodeScanningUpdateAlertRequest**](CodeScanningUpdateAlertRequest.md)|  |

### Return type

[**CodeScanningAlert**](CodeScanningAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="codeScanningUpdateDefaultSetup"></a>
# **codeScanningUpdateDefaultSetup**
> kotlin.Any codeScanningUpdateDefaultSetup(owner, repo, codeScanningDefaultSetupUpdate)

Update a code scanning default setup configuration

Updates a code scanning default setup configuration.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with private or public repositories, or the &#x60;public_repo&#x60; scope to use this endpoint with only public repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodeScanningApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val codeScanningDefaultSetupUpdate : CodeScanningDefaultSetupUpdate =  // CodeScanningDefaultSetupUpdate | 
try {
    val result : kotlin.Any = apiInstance.codeScanningUpdateDefaultSetup(owner, repo, codeScanningDefaultSetupUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodeScanningApi#codeScanningUpdateDefaultSetup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodeScanningApi#codeScanningUpdateDefaultSetup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **codeScanningDefaultSetupUpdate** | [**CodeScanningDefaultSetupUpdate**](CodeScanningDefaultSetupUpdate.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="codeScanningUploadSarif"></a>
# **codeScanningUploadSarif**
> CodeScanningSarifsReceipt codeScanningUploadSarif(owner, repo, codeScanningUploadSarifRequest)

Upload an analysis as SARIF data

Uploads SARIF data containing the results of a code scanning analysis to make the results available in a repository. For troubleshooting information, see \&quot;[Troubleshooting SARIF uploads](https://docs.github.com/code-security/code-scanning/troubleshooting-sarif).\&quot;  There are two places where you can upload code scanning results.  - If you upload to a pull request, for example &#x60;--ref refs/pull/42/merge&#x60; or &#x60;--ref refs/pull/42/head&#x60;, then the results appear as alerts in a pull request check. For more information, see \&quot;[Triaging code scanning alerts in pull requests](/code-security/secure-coding/triaging-code-scanning-alerts-in-pull-requests).\&quot;  - If you upload to a branch, for example &#x60;--ref refs/heads/my-branch&#x60;, then the results appear in the **Security** tab for your repository. For more information, see \&quot;[Managing code scanning alerts for your repository](/code-security/secure-coding/managing-code-scanning-alerts-for-your-repository#viewing-the-alerts-for-a-repository).\&quot;  You must compress the SARIF-formatted analysis data that you want to upload, using &#x60;gzip&#x60;, and then encode it as a Base64 format string. For example:  &#x60;&#x60;&#x60; gzip -c analysis-data.sarif | base64 -w0 &#x60;&#x60;&#x60;  SARIF upload supports a maximum number of entries per the following data objects, and an analysis will be rejected if any of these objects is above its maximum value. For some objects, there are additional values over which the entries will be ignored while keeping the most important entries whenever applicable. To get the most out of your analysis when it includes data above the supported limits, try to optimize the analysis configuration. For example, for the CodeQL tool, identify and remove the most noisy queries. For more information, see \&quot;[SARIF results exceed one or more limits](https://docs.github.com/code-security/code-scanning/troubleshooting-sarif/results-exceed-limit).\&quot;   | **SARIF data**                   | **Maximum values** | **Additional limits**                                                            | |----------------------------------|:------------------:|----------------------------------------------------------------------------------| | Runs per file                    |         20         |                                                                                  | | Results per run                  |       25,000       | Only the top 5,000 results will be included, prioritized by severity.            | | Rules per run                    |       25,000       |                                                                                  | | Tool extensions per run          |        100         |                                                                                  | | Thread Flow Locations per result |       10,000       | Only the top 1,000 Thread Flow Locations will be included, using prioritization. | | Location per result              |       1,000        | Only 100 locations will be included.                                             | | Tags per rule                    |         20         | Only 10 tags will be included.                                                   |   The &#x60;202 Accepted&#x60; response includes an &#x60;id&#x60; value. You can use this ID to check the status of the upload by using it in the &#x60;/sarifs/{sarif_id}&#x60; endpoint. For more information, see \&quot;[Get information about a SARIF upload](/rest/code-scanning/code-scanning#get-information-about-a-sarif-upload).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;security_events&#x60; scope to use this endpoint with private or public repositories, or the &#x60;public_repo&#x60; scope to use this endpoint with only public repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodeScanningApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val codeScanningUploadSarifRequest : CodeScanningUploadSarifRequest = {"commit_sha":"4b6472266afd7b471e86085a6659e8c7f2b119da","ref":"refs/heads/master","sarif":"H4sICMLGdF4AA2V4YW1wbGUuc2FyaWYAvVjdbts2FL7PUxDCijaA/CM7iRNfLkPXYgHSNstumlzQ0pHFVCI1korjFgH2ONtr7Ul2KFmy/mOn6QIkjsjDw0/nfN85NL8dEGL9pNwAImqRObECrWM1H40kXQ2XTAfJIlEgXcE1cD10RTQSVDE10K4aKSqZP1AxuKOIKg1ydJU60jSfSh8Hk6EzHA/vlOCWbfa7B6kYPpj90rlsWCZcmbHP5Bs+4oAWIjQD2SMOeJLh2vIQDnIaQerqXHjw8YIgxohybxAyDsS4cAPKsp03K4RcUs6+Up2D+JXpd8mibKIQN9fM/aMCdbyBujGSSQgVxJtx5qX2d2qUcIweQhEuDQf3GBO6CKHkogx/N3MVCKl/AeVKFuf4y5ubsMGDTj1ep+5I7sgmLIpxtU38hLtmMRGSuCFVyip5eKzs5ydh+LztVL6f2m6oih1BkYiuyQIIJWodxVpERPj4sEiWBNNH8EWT0DMG8EAjzKVHXCrB4FkPu/F64NMk1OeC+2yZSNoBOoR7CC0EzYWGbm+xFDFIzbI011+cLjfZtyJkmMZfumAh02uL3NpV2y+MZ6RAjxibyKrNxxJcVjANSb4eBGwZ1M0KsuyR2poLr5rMl8vaDSeVn6eTWEO2j2xIEcmhwlTKNOi4GMOI8gfuZYkvJ7b4v5Tiumyz7RnHeodFzpS8ASIZCH/AYdWi2z3sG8JtFxJ6fF9yR9CdifBr9Pd6d5V2+zbJKjjCFGGmsHuYFy2ytJq9tUxcLSRSQecppOGKrpUxYfxefMEFK+wOGa4hudQByBVT0L+EKtyACxnRsABhEx1QjVDs1KNI9MbpnhqfE45B6FJvu3hRu5VRU9MhZLmK7fqkKyQSTHNoyMqUFMqXCV3CwAeqEwmVokraK8IuBaGvHjQ0gMYrKjnjyw7uk9uD8tgmsBbFMPnU1bV2ZhkJNkuolUiWys3UPWzs5aaIUz9TBe8zMb+6+nT+6fLy91dlE3xzeDDT4zYszb0bW6NjJd0Rvn2EnLvWLFSdKPpBzInzfRgu8ETyMcH8nIfMnJCeC2PyfTA+UKngcnGH7Hw2hGkVQs5YlIRCtdWZYQ4/73es2JlxkfViOEIhoWJq5Oo6UBBfiKIqFBWhiE3jJGbFwVoxBHTRSuIS67sMeplei24X20shLjG+8gqbKC/bESiNMC+wd5q5id0yeS7CJEqXzmrTWNq3k05l84P6f4/bEmXFJjI0fIt1BGQssUnUDkBYeVhE5TqPnMH3jqogDcP0zKcTgLPTMSzOjhbjuVOmW23l1fYNStulfo6sXlFsGLhbDy5RECPRYGCTgOj2bd4nUQEivEd0H7KKYxqnEhFohuur3a3UPskbH/+Yg0+M5P2MHRJu3ziHh3Z2NCrWt3XF1rWTw8Ne/pfbWYXnDSE0SNZQQt1i18q7te2vOhu7ehWuvVyeu0wbLZi24mhoo6aOOTltzG/lgdVvVoXQq5V+pewkFIzL8fjEcadT55jOjpzFzHuOTtDNrMkJPMVQDd7F09RID72O/UPZ0tmctqZ7kWX6EmSZnDpP8GU67SXM8XE3YSrxbKsx6UReZ4y6n/FVZfJjs9Z7stma75W5yQtkzjk5eSJxk1lv4o7+j8TlhaJ2lsKWZO6lruDPBLib3x5ZN/KGWzZ+pn///evv7OOf4iIBv3oY9L/l1wiJ9p0Tc+F1zZnOE9NxXWEus6IQhr5pMfoqxi8WPsuu0azsns4UC6WzNzHIzbeEx4P/AJ3SefgcFAAA"} // CodeScanningUploadSarifRequest | 
try {
    val result : CodeScanningSarifsReceipt = apiInstance.codeScanningUploadSarif(owner, repo, codeScanningUploadSarifRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodeScanningApi#codeScanningUploadSarif")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodeScanningApi#codeScanningUploadSarif")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **codeScanningUploadSarifRequest** | [**CodeScanningUploadSarifRequest**](CodeScanningUploadSarifRequest.md)|  |

### Return type

[**CodeScanningSarifsReceipt**](CodeScanningSarifsReceipt.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

