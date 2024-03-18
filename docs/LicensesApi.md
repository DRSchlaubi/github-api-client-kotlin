# LicensesApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**licensesGet**](LicensesApi.md#licensesGet) | **GET** /licenses/{license} | Get a license
[**licensesGetAllCommonlyUsed**](LicensesApi.md#licensesGetAllCommonlyUsed) | **GET** /licenses | Get all commonly used licenses
[**licensesGetForRepo**](LicensesApi.md#licensesGetForRepo) | **GET** /repos/{owner}/{repo}/license | Get the license for a repository


<a id="licensesGet"></a>
# **licensesGet**
> License licensesGet(license)

Get a license

Gets information about a specific license. For more information, see \&quot;[Licensing a repository ](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/licensing-a-repository).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensesApi()
val license : kotlin.String = license_example // kotlin.String | 
try {
    val result : License = apiInstance.licensesGet(license)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicensesApi#licensesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensesApi#licensesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **license** | **kotlin.String**|  | [default to &quot;push&quot;]

### Return type

[**License**](License.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="licensesGetAllCommonlyUsed"></a>
# **licensesGetAllCommonlyUsed**
> kotlin.collections.List&lt;LicenseSimple&gt; licensesGetAllCommonlyUsed(featured, perPage, page)

Get all commonly used licenses

Lists the most commonly used licenses on GitHub. For more information, see \&quot;[Licensing a repository ](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/licensing-a-repository).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensesApi()
val featured : kotlin.Boolean = true // kotlin.Boolean | 
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<LicenseSimple> = apiInstance.licensesGetAllCommonlyUsed(featured, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicensesApi#licensesGetAllCommonlyUsed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensesApi#licensesGetAllCommonlyUsed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featured** | **kotlin.Boolean**|  | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;LicenseSimple&gt;**](LicenseSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="licensesGetForRepo"></a>
# **licensesGetForRepo**
> LicenseContent licensesGetForRepo(owner, repo, ref)

Get the license for a repository

This method returns the contents of the repository&#39;s license file, if one is detected.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw contents of the license. - **&#x60;application/vnd.github.html+json&#x60;**: Returns the license contents in HTML. Markup languages are rendered to HTML using GitHub&#39;s open-source [Markup library](https://github.com/github/markup).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ref : kotlin.String = ref_example // kotlin.String | The Git reference for the results you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
try {
    val result : LicenseContent = apiInstance.licensesGetForRepo(owner, repo, ref)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicensesApi#licensesGetForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensesApi#licensesGetForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ref** | **kotlin.String**| The Git reference for the results you want to list. The &#x60;ref&#x60; for a branch can be formatted either as &#x60;refs/heads/&lt;branch name&gt;&#x60; or simply &#x60;&lt;branch name&gt;&#x60;. To reference a pull request use &#x60;refs/pull/&lt;number&gt;/merge&#x60;. | [optional]

### Return type

[**LicenseContent**](LicenseContent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

