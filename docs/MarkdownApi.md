# MarkdownApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**markdownRender**](MarkdownApi.md#markdownRender) | **POST** /markdown | Render a Markdown document
[**markdownRenderRaw**](MarkdownApi.md#markdownRenderRaw) | **POST** /markdown/raw | Render a Markdown document in raw mode


<a id="markdownRender"></a>
# **markdownRender**
> kotlin.String markdownRender(markdownRenderRequest)

Render a Markdown document



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarkdownApi()
val markdownRenderRequest : MarkdownRenderRequest = {"text":"Hello **world**"} // MarkdownRenderRequest | 
try {
    val result : kotlin.String = apiInstance.markdownRender(markdownRenderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarkdownApi#markdownRender")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarkdownApi#markdownRender")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **markdownRenderRequest** | [**MarkdownRenderRequest**](MarkdownRenderRequest.md)|  |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html

<a id="markdownRenderRaw"></a>
# **markdownRenderRaw**
> kotlin.String markdownRenderRaw(body)

Render a Markdown document in raw mode

You must send Markdown as plain text (using a &#x60;Content-Type&#x60; header of &#x60;text/plain&#x60; or &#x60;text/x-markdown&#x60;) to this endpoint, rather than using JSON format. In raw mode, [GitHub Flavored Markdown](https://github.github.com/gfm/) is not supported and Markdown will be rendered in plain format like a README.md file. Markdown content must be 400 KB or less.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarkdownApi()
val body : kotlin.String = {"text":"Hello **world**"} // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.markdownRenderRaw(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarkdownApi#markdownRenderRaw")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarkdownApi#markdownRenderRaw")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain, text/x-markdown
 - **Accept**: text/html

