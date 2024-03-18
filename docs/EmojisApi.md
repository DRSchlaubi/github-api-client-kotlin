# EmojisApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emojisGet**](EmojisApi.md#emojisGet) | **GET** /emojis | Get emojis


<a id="emojisGet"></a>
# **emojisGet**
> kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt; emojisGet()

Get emojis

Lists all the emojis available to use on GitHub.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmojisApi()
try {
    val result : kotlin.collections.Map<kotlin.String, kotlin.String> = apiInstance.emojisGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmojisApi#emojisGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmojisApi#emojisGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

