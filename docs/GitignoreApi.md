# GitignoreApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gitignoreGetAllTemplates**](GitignoreApi.md#gitignoreGetAllTemplates) | **GET** /gitignore/templates | Get all gitignore templates
[**gitignoreGetTemplate**](GitignoreApi.md#gitignoreGetTemplate) | **GET** /gitignore/templates/{name} | Get a gitignore template


<a id="gitignoreGetAllTemplates"></a>
# **gitignoreGetAllTemplates**
> kotlin.collections.List&lt;kotlin.String&gt; gitignoreGetAllTemplates()

Get all gitignore templates

List all templates available to pass as an option when [creating a repository](https://docs.github.com/rest/repos/repos#create-a-repository-for-the-authenticated-user).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GitignoreApi()
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.gitignoreGetAllTemplates()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitignoreApi#gitignoreGetAllTemplates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitignoreApi#gitignoreGetAllTemplates")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gitignoreGetTemplate"></a>
# **gitignoreGetTemplate**
> GitignoreTemplate gitignoreGetTemplate(name)

Get a gitignore template

Get the content of a gitignore template.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw .gitignore contents.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GitignoreApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : GitignoreTemplate = apiInstance.gitignoreGetTemplate(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitignoreApi#gitignoreGetTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitignoreApi#gitignoreGetTemplate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  | [default to &quot;push&quot;]

### Return type

[**GitignoreTemplate**](GitignoreTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

