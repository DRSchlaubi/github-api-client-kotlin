# ChecksApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checksCreate**](ChecksApi.md#checksCreate) | **POST** /repos/{owner}/{repo}/check-runs | Create a check run
[**checksCreateSuite**](ChecksApi.md#checksCreateSuite) | **POST** /repos/{owner}/{repo}/check-suites | Create a check suite
[**checksGet**](ChecksApi.md#checksGet) | **GET** /repos/{owner}/{repo}/check-runs/{check_run_id} | Get a check run
[**checksGetSuite**](ChecksApi.md#checksGetSuite) | **GET** /repos/{owner}/{repo}/check-suites/{check_suite_id} | Get a check suite
[**checksListAnnotations**](ChecksApi.md#checksListAnnotations) | **GET** /repos/{owner}/{repo}/check-runs/{check_run_id}/annotations | List check run annotations
[**checksListForRef**](ChecksApi.md#checksListForRef) | **GET** /repos/{owner}/{repo}/commits/{ref}/check-runs | List check runs for a Git reference
[**checksListForSuite**](ChecksApi.md#checksListForSuite) | **GET** /repos/{owner}/{repo}/check-suites/{check_suite_id}/check-runs | List check runs in a check suite
[**checksListSuitesForRef**](ChecksApi.md#checksListSuitesForRef) | **GET** /repos/{owner}/{repo}/commits/{ref}/check-suites | List check suites for a Git reference
[**checksRerequestRun**](ChecksApi.md#checksRerequestRun) | **POST** /repos/{owner}/{repo}/check-runs/{check_run_id}/rerequest | Rerequest a check run
[**checksRerequestSuite**](ChecksApi.md#checksRerequestSuite) | **POST** /repos/{owner}/{repo}/check-suites/{check_suite_id}/rerequest | Rerequest a check suite
[**checksSetSuitesPreferences**](ChecksApi.md#checksSetSuitesPreferences) | **PATCH** /repos/{owner}/{repo}/check-suites/preferences | Update repository preferences for check suites
[**checksUpdate**](ChecksApi.md#checksUpdate) | **PATCH** /repos/{owner}/{repo}/check-runs/{check_run_id} | Update a check run


<a id="checksCreate"></a>
# **checksCreate**
> CheckRun checksCreate(owner, repo, checksCreateRequest)

Create a check run

Creates a new check run for a specific commit in a repository.  To create a check run, you must use a GitHub App. OAuth apps and authenticated users are not able to create a check suite.  In a check suite, GitHub limits the number of check runs with the same name to 1000. Once these check runs exceed 1000, GitHub will start to automatically delete older check runs.  **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChecksApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val checksCreateRequest : ChecksCreateRequest = {"name":"mighty_readme","head_sha":"ce587453ced02b1526dfb4cb910479d431683101","status":"in_progress","external_id":"42","started_at":"2018-05-04T01:14:52Z","output":{"title":"Mighty Readme report","summary":"","text":""}} // ChecksCreateRequest | 
try {
    val result : CheckRun = apiInstance.checksCreate(owner, repo, checksCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChecksApi#checksCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChecksApi#checksCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **checksCreateRequest** | [**ChecksCreateRequest**](ChecksCreateRequest.md)|  |

### Return type

[**CheckRun**](CheckRun.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="checksCreateSuite"></a>
# **checksCreateSuite**
> CheckSuite checksCreateSuite(owner, repo, checksCreateSuiteRequest)

Create a check suite

Creates a check suite manually. By default, check suites are automatically created when you create a [check run](https://docs.github.com/rest/checks/runs). You only need to use this endpoint for manually creating check suites when you&#39;ve disabled automatic creation using \&quot;[Update repository preferences for check suites](https://docs.github.com/rest/checks/suites#update-repository-preferences-for-check-suites)\&quot;.  **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array and a &#x60;null&#x60; value for &#x60;head_branch&#x60;.  OAuth apps and personal access tokens (classic) cannot use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChecksApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val checksCreateSuiteRequest : ChecksCreateSuiteRequest = {"head_sha":"d6fde92930d4715a2b49857d24b940956b26d2d3"} // ChecksCreateSuiteRequest | 
try {
    val result : CheckSuite = apiInstance.checksCreateSuite(owner, repo, checksCreateSuiteRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChecksApi#checksCreateSuite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChecksApi#checksCreateSuite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **checksCreateSuiteRequest** | [**ChecksCreateSuiteRequest**](ChecksCreateSuiteRequest.md)|  |

### Return type

[**CheckSuite**](CheckSuite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="checksGet"></a>
# **checksGet**
> CheckRun checksGet(owner, repo, checkRunId)

Get a check run

Gets a single check run using its &#x60;id&#x60;.  **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint on a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChecksApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val checkRunId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the check run.
try {
    val result : CheckRun = apiInstance.checksGet(owner, repo, checkRunId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChecksApi#checksGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChecksApi#checksGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **checkRunId** | **kotlin.Int**| The unique identifier of the check run. |

### Return type

[**CheckRun**](CheckRun.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="checksGetSuite"></a>
# **checksGetSuite**
> CheckSuite checksGetSuite(owner, repo, checkSuiteId)

Get a check suite

Gets a single check suite using its &#x60;id&#x60;.  **Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array and a &#x60;null&#x60; value for &#x60;head_branch&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint on a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChecksApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val checkSuiteId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the check suite.
try {
    val result : CheckSuite = apiInstance.checksGetSuite(owner, repo, checkSuiteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChecksApi#checksGetSuite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChecksApi#checksGetSuite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **checkSuiteId** | **kotlin.Int**| The unique identifier of the check suite. |

### Return type

[**CheckSuite**](CheckSuite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="checksListAnnotations"></a>
# **checksListAnnotations**
> kotlin.collections.List&lt;CheckAnnotation&gt; checksListAnnotations(owner, repo, checkRunId, perPage, page)

List check run annotations

Lists annotations for a check run using the annotation &#x60;id&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint on a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChecksApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val checkRunId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the check run.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<CheckAnnotation> = apiInstance.checksListAnnotations(owner, repo, checkRunId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChecksApi#checksListAnnotations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChecksApi#checksListAnnotations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **checkRunId** | **kotlin.Int**| The unique identifier of the check run. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;CheckAnnotation&gt;**](CheckAnnotation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="checksListForRef"></a>
# **checksListForRef**
> ChecksListForSuite200Response checksListForRef(owner, repo, ref, checkName, status, filter, perPage, page, appId)

List check runs for a Git reference

Lists check runs for a commit ref. The &#x60;ref&#x60; can be a SHA, branch name, or a tag name.  **Note:** The endpoints to manage checks only look for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array.  If there are more than 1000 check suites on a single git reference, this endpoint will limit check runs to the 1000 most recent check suites. To iterate over all possible check runs, use the [List check suites for a Git reference](https://docs.github.com/rest/reference/checks#list-check-suites-for-a-git-reference) endpoint and provide the &#x60;check_suite_id&#x60; parameter to the [List check runs in a check suite](https://docs.github.com/rest/reference/checks#list-check-runs-in-a-check-suite) endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint on a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChecksApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ref : kotlin.String = ref_example // kotlin.String | The commit reference. Can be a commit SHA, branch name (`heads/BRANCH_NAME`), or tag name (`tags/TAG_NAME`). For more information, see \"[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\" in the Git documentation.
val checkName : kotlin.String = checkName_example // kotlin.String | Returns check runs with the specified `name`.
val status : kotlin.String = status_example // kotlin.String | Returns check runs with the specified `status`.
val filter : kotlin.String = filter_example // kotlin.String | Filters check runs by their `completed_at` timestamp. `latest` returns the most recent check runs.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val appId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ChecksListForSuite200Response = apiInstance.checksListForRef(owner, repo, ref, checkName, status, filter, perPage, page, appId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChecksApi#checksListForRef")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChecksApi#checksListForRef")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ref** | **kotlin.String**| The commit reference. Can be a commit SHA, branch name (&#x60;heads/BRANCH_NAME&#x60;), or tag name (&#x60;tags/TAG_NAME&#x60;). For more information, see \&quot;[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\&quot; in the Git documentation. |
 **checkName** | **kotlin.String**| Returns check runs with the specified &#x60;name&#x60;. | [optional]
 **status** | **kotlin.String**| Returns check runs with the specified &#x60;status&#x60;. | [optional] [enum: queued, in_progress, completed]
 **filter** | **kotlin.String**| Filters check runs by their &#x60;completed_at&#x60; timestamp. &#x60;latest&#x60; returns the most recent check runs. | [optional] [default to latest] [enum: latest, all]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **appId** | **kotlin.Int**|  | [optional]

### Return type

[**ChecksListForSuite200Response**](ChecksListForSuite200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="checksListForSuite"></a>
# **checksListForSuite**
> ChecksListForSuite200Response checksListForSuite(owner, repo, checkSuiteId, checkName, status, filter, perPage, page)

List check runs in a check suite

Lists check runs for a check suite using its &#x60;id&#x60;.  **Note:** The endpoints to manage checks only look for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint on a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChecksApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val checkSuiteId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the check suite.
val checkName : kotlin.String = checkName_example // kotlin.String | Returns check runs with the specified `name`.
val status : kotlin.String = status_example // kotlin.String | Returns check runs with the specified `status`.
val filter : kotlin.String = filter_example // kotlin.String | Filters check runs by their `completed_at` timestamp. `latest` returns the most recent check runs.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ChecksListForSuite200Response = apiInstance.checksListForSuite(owner, repo, checkSuiteId, checkName, status, filter, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChecksApi#checksListForSuite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChecksApi#checksListForSuite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **checkSuiteId** | **kotlin.Int**| The unique identifier of the check suite. |
 **checkName** | **kotlin.String**| Returns check runs with the specified &#x60;name&#x60;. | [optional]
 **status** | **kotlin.String**| Returns check runs with the specified &#x60;status&#x60;. | [optional] [enum: queued, in_progress, completed]
 **filter** | **kotlin.String**| Filters check runs by their &#x60;completed_at&#x60; timestamp. &#x60;latest&#x60; returns the most recent check runs. | [optional] [default to latest] [enum: latest, all]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**ChecksListForSuite200Response**](ChecksListForSuite200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="checksListSuitesForRef"></a>
# **checksListSuitesForRef**
> ChecksListSuitesForRef200Response checksListSuitesForRef(owner, repo, ref, appId, checkName, perPage, page)

List check suites for a Git reference

Lists check suites for a commit &#x60;ref&#x60;. The &#x60;ref&#x60; can be a SHA, branch name, or a tag name.  **Note:** The endpoints to manage checks only look for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array and a &#x60;null&#x60; value for &#x60;head_branch&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint on a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChecksApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ref : kotlin.String = ref_example // kotlin.String | The commit reference. Can be a commit SHA, branch name (`heads/BRANCH_NAME`), or tag name (`tags/TAG_NAME`). For more information, see \"[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\" in the Git documentation.
val appId : kotlin.Int = 1 // kotlin.Int | Filters check suites by GitHub App `id`.
val checkName : kotlin.String = checkName_example // kotlin.String | Returns check runs with the specified `name`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ChecksListSuitesForRef200Response = apiInstance.checksListSuitesForRef(owner, repo, ref, appId, checkName, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChecksApi#checksListSuitesForRef")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChecksApi#checksListSuitesForRef")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ref** | **kotlin.String**| The commit reference. Can be a commit SHA, branch name (&#x60;heads/BRANCH_NAME&#x60;), or tag name (&#x60;tags/TAG_NAME&#x60;). For more information, see \&quot;[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\&quot; in the Git documentation. |
 **appId** | **kotlin.Int**| Filters check suites by GitHub App &#x60;id&#x60;. | [optional]
 **checkName** | **kotlin.String**| Returns check runs with the specified &#x60;name&#x60;. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**ChecksListSuitesForRef200Response**](ChecksListSuitesForRef200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="checksRerequestRun"></a>
# **checksRerequestRun**
> kotlin.Any checksRerequestRun(owner, repo, checkRunId)

Rerequest a check run

Triggers GitHub to rerequest an existing check run, without pushing new code to a repository. This endpoint will trigger the [&#x60;check_run&#x60; webhook](https://docs.github.com/webhooks/event-payloads/#check_run) event with the action &#x60;rerequested&#x60;. When a check run is &#x60;rerequested&#x60;, its &#x60;status&#x60; is reset to &#x60;queued&#x60; and the &#x60;conclusion&#x60; is cleared.  For more information about how to re-run GitHub Actions jobs, see \&quot;[Re-run a job from a workflow run](https://docs.github.com/rest/actions/workflow-runs#re-run-a-job-from-a-workflow-run)\&quot;.  OAuth apps and personal access tokens (classic) cannot use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChecksApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val checkRunId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the check run.
try {
    val result : kotlin.Any = apiInstance.checksRerequestRun(owner, repo, checkRunId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChecksApi#checksRerequestRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChecksApi#checksRerequestRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **checkRunId** | **kotlin.Int**| The unique identifier of the check run. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="checksRerequestSuite"></a>
# **checksRerequestSuite**
> kotlin.Any checksRerequestSuite(owner, repo, checkSuiteId)

Rerequest a check suite

Triggers GitHub to rerequest an existing check suite, without pushing new code to a repository. This endpoint will trigger the [&#x60;check_suite&#x60; webhook](https://docs.github.com/webhooks/event-payloads/#check_suite) event with the action &#x60;rerequested&#x60;. When a check suite is &#x60;rerequested&#x60;, its &#x60;status&#x60; is reset to &#x60;queued&#x60; and the &#x60;conclusion&#x60; is cleared.  OAuth apps and personal access tokens (classic) cannot use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChecksApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val checkSuiteId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the check suite.
try {
    val result : kotlin.Any = apiInstance.checksRerequestSuite(owner, repo, checkSuiteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChecksApi#checksRerequestSuite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChecksApi#checksRerequestSuite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **checkSuiteId** | **kotlin.Int**| The unique identifier of the check suite. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="checksSetSuitesPreferences"></a>
# **checksSetSuitesPreferences**
> CheckSuitePreference checksSetSuitesPreferences(owner, repo, checksSetSuitesPreferencesRequest)

Update repository preferences for check suites

Changes the default automatic flow when creating check suites. By default, a check suite is automatically created each time code is pushed to a repository. When you disable the automatic creation of check suites, you can manually [Create a check suite](https://docs.github.com/rest/checks/suites#create-a-check-suite). You must have admin permissions in the repository to set preferences for check suites.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChecksApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val checksSetSuitesPreferencesRequest : ChecksSetSuitesPreferencesRequest = {"auto_trigger_checks":[{"app_id":4,"setting":false}]} // ChecksSetSuitesPreferencesRequest | 
try {
    val result : CheckSuitePreference = apiInstance.checksSetSuitesPreferences(owner, repo, checksSetSuitesPreferencesRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChecksApi#checksSetSuitesPreferences")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChecksApi#checksSetSuitesPreferences")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **checksSetSuitesPreferencesRequest** | [**ChecksSetSuitesPreferencesRequest**](ChecksSetSuitesPreferencesRequest.md)|  |

### Return type

[**CheckSuitePreference**](CheckSuitePreference.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="checksUpdate"></a>
# **checksUpdate**
> CheckRun checksUpdate(owner, repo, checkRunId, checksUpdateRequest)

Update a check run

Updates a check run for a specific commit in a repository.  **Note:** The endpoints to manage checks only look for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array.  OAuth apps and personal access tokens (classic) cannot use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ChecksApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val checkRunId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the check run.
val checksUpdateRequest : ChecksUpdateRequest = {"name":"mighty_readme","started_at":"2018-05-04T01:14:52Z","status":"completed","conclusion":"success","completed_at":"2018-05-04T01:14:52Z","output":{"title":"Mighty Readme report","summary":"There are 0 failures, 2 warnings, and 1 notices.","text":"You may have some misspelled words on lines 2 and 4. You also may want to add a section in your README about how to install your app.","annotations":[{"path":"README.md","annotation_level":"warning","title":"Spell Checker","message":"Check your spelling for 'banaas'.","raw_details":"Do you mean 'bananas' or 'banana'?","start_line":2,"end_line":2},{"path":"README.md","annotation_level":"warning","title":"Spell Checker","message":"Check your spelling for 'aples'","raw_details":"Do you mean 'apples' or 'Naples'","start_line":4,"end_line":4}],"images":[{"alt":"Super bananas","image_url":"http://example.com/images/42"}]}} // ChecksUpdateRequest | 
try {
    val result : CheckRun = apiInstance.checksUpdate(owner, repo, checkRunId, checksUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChecksApi#checksUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChecksApi#checksUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **checkRunId** | **kotlin.Int**| The unique identifier of the check run. |
 **checksUpdateRequest** | [**ChecksUpdateRequest**](ChecksUpdateRequest.md)|  |

### Return type

[**CheckRun**](CheckRun.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

