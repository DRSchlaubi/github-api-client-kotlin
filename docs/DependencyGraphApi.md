# DependencyGraphApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dependencyGraphCreateRepositorySnapshot**](DependencyGraphApi.md#dependencyGraphCreateRepositorySnapshot) | **POST** /repos/{owner}/{repo}/dependency-graph/snapshots | Create a snapshot of dependencies for a repository
[**dependencyGraphDiffRange**](DependencyGraphApi.md#dependencyGraphDiffRange) | **GET** /repos/{owner}/{repo}/dependency-graph/compare/{basehead} | Get a diff of the dependencies between commits
[**dependencyGraphExportSbom**](DependencyGraphApi.md#dependencyGraphExportSbom) | **GET** /repos/{owner}/{repo}/dependency-graph/sbom | Export a software bill of materials (SBOM) for a repository.


<a id="dependencyGraphCreateRepositorySnapshot"></a>
# **dependencyGraphCreateRepositorySnapshot**
> DependencyGraphCreateRepositorySnapshot201Response dependencyGraphCreateRepositorySnapshot(owner, repo, snapshot)

Create a snapshot of dependencies for a repository

Create a new snapshot of a repository&#39;s dependencies.  The authenticated user must have access to the repository.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependencyGraphApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val snapshot : Snapshot =  // Snapshot | 
try {
    val result : DependencyGraphCreateRepositorySnapshot201Response = apiInstance.dependencyGraphCreateRepositorySnapshot(owner, repo, snapshot)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DependencyGraphApi#dependencyGraphCreateRepositorySnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependencyGraphApi#dependencyGraphCreateRepositorySnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **snapshot** | [**Snapshot**](Snapshot.md)|  |

### Return type

[**DependencyGraphCreateRepositorySnapshot201Response**](DependencyGraphCreateRepositorySnapshot201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="dependencyGraphDiffRange"></a>
# **dependencyGraphDiffRange**
> kotlin.collections.List&lt;DependencyGraphDiffInner&gt; dependencyGraphDiffRange(owner, repo, basehead, name)

Get a diff of the dependencies between commits

Gets the diff of the dependency changes between two commits of a repository, based on the changes to the dependency manifests made in those commits.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependencyGraphApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val basehead : kotlin.String = basehead_example // kotlin.String | The base and head Git revisions to compare. The Git revisions will be resolved to commit SHAs. Named revisions will be resolved to their corresponding HEAD commits, and an appropriate merge base will be determined. This parameter expects the format `{base}...{head}`.
val name : kotlin.String = name_example // kotlin.String | The full path, relative to the repository root, of the dependency manifest file.
try {
    val result : kotlin.collections.List<DependencyGraphDiffInner> = apiInstance.dependencyGraphDiffRange(owner, repo, basehead, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DependencyGraphApi#dependencyGraphDiffRange")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependencyGraphApi#dependencyGraphDiffRange")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **basehead** | **kotlin.String**| The base and head Git revisions to compare. The Git revisions will be resolved to commit SHAs. Named revisions will be resolved to their corresponding HEAD commits, and an appropriate merge base will be determined. This parameter expects the format &#x60;{base}...{head}&#x60;. | [default to &quot;push&quot;]
 **name** | **kotlin.String**| The full path, relative to the repository root, of the dependency manifest file. | [optional]

### Return type

[**kotlin.collections.List&lt;DependencyGraphDiffInner&gt;**](DependencyGraphDiffInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="dependencyGraphExportSbom"></a>
# **dependencyGraphExportSbom**
> DependencyGraphSpdxSbom dependencyGraphExportSbom(owner, repo)

Export a software bill of materials (SBOM) for a repository.

Exports the software bill of materials (SBOM) for a repository in SPDX JSON format.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependencyGraphApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : DependencyGraphSpdxSbom = apiInstance.dependencyGraphExportSbom(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DependencyGraphApi#dependencyGraphExportSbom")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependencyGraphApi#dependencyGraphExportSbom")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**DependencyGraphSpdxSbom**](DependencyGraphSpdxSbom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

