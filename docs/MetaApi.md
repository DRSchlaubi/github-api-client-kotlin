# MetaApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**metaGet**](MetaApi.md#metaGet) | **GET** /meta | Get GitHub meta information
[**metaGetAllVersions**](MetaApi.md#metaGetAllVersions) | **GET** /versions | Get all API versions
[**metaGetOctocat**](MetaApi.md#metaGetOctocat) | **GET** /octocat | Get Octocat
[**metaGetZen**](MetaApi.md#metaGetZen) | **GET** /zen | Get the Zen of GitHub
[**metaRoot**](MetaApi.md#metaRoot) | **GET** / | GitHub API Root


<a id="metaGet"></a>
# **metaGet**
> ApiOverview metaGet()

Get GitHub meta information

Returns meta information about GitHub, including a list of GitHub&#39;s IP addresses. For more information, see \&quot;[About GitHub&#39;s IP addresses](https://docs.github.com/articles/about-github-s-ip-addresses/).\&quot;  The API&#39;s response also includes a list of GitHub&#39;s domain names.  The values shown in the documentation&#39;s response are example values. You must always query the API directly to get the latest values.  **Note:** This endpoint returns both IPv4 and IPv6 addresses. However, not all features support IPv6. You should refer to the specific documentation for each feature to determine if IPv6 is supported.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetaApi()
try {
    val result : ApiOverview = apiInstance.metaGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetaApi#metaGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetaApi#metaGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiOverview**](ApiOverview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="metaGetAllVersions"></a>
# **metaGetAllVersions**
> kotlin.collections.List&lt;java.time.LocalDate&gt; metaGetAllVersions()

Get all API versions

Get all supported GitHub API versions.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetaApi()
try {
    val result : kotlin.collections.List<java.time.LocalDate> = apiInstance.metaGetAllVersions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetaApi#metaGetAllVersions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetaApi#metaGetAllVersions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;java.time.LocalDate&gt;**](java.time.LocalDate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="metaGetOctocat"></a>
# **metaGetOctocat**
> kotlin.String metaGetOctocat(s)

Get Octocat

Get the octocat as ASCII art

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetaApi()
val s : kotlin.String = s_example // kotlin.String | The words to show in Octocat's speech bubble
try {
    val result : kotlin.String = apiInstance.metaGetOctocat(s)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetaApi#metaGetOctocat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetaApi#metaGetOctocat")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **s** | **kotlin.String**| The words to show in Octocat&#39;s speech bubble | [optional] [default to &quot;push&quot;]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octocat-stream

<a id="metaGetZen"></a>
# **metaGetZen**
> kotlin.String metaGetZen()

Get the Zen of GitHub

Get a random sentence from the Zen of GitHub

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetaApi()
try {
    val result : kotlin.String = apiInstance.metaGetZen()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetaApi#metaGetZen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetaApi#metaGetZen")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="metaRoot"></a>
# **metaRoot**
> Root metaRoot()

GitHub API Root

Get Hypermedia links to resources accessible in GitHub&#39;s REST API

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetaApi()
try {
    val result : Root = apiInstance.metaRoot()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetaApi#metaRoot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetaApi#metaRoot")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Root**](Root.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

