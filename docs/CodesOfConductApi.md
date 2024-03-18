# CodesOfConductApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**codesOfConductGetAllCodesOfConduct**](CodesOfConductApi.md#codesOfConductGetAllCodesOfConduct) | **GET** /codes_of_conduct | Get all codes of conduct
[**codesOfConductGetConductCode**](CodesOfConductApi.md#codesOfConductGetConductCode) | **GET** /codes_of_conduct/{key} | Get a code of conduct


<a id="codesOfConductGetAllCodesOfConduct"></a>
# **codesOfConductGetAllCodesOfConduct**
> kotlin.collections.List&lt;CodeOfConduct&gt; codesOfConductGetAllCodesOfConduct()

Get all codes of conduct

Returns array of all GitHub&#39;s codes of conduct.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodesOfConductApi()
try {
    val result : kotlin.collections.List<CodeOfConduct> = apiInstance.codesOfConductGetAllCodesOfConduct()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodesOfConductApi#codesOfConductGetAllCodesOfConduct")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodesOfConductApi#codesOfConductGetAllCodesOfConduct")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;CodeOfConduct&gt;**](CodeOfConduct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codesOfConductGetConductCode"></a>
# **codesOfConductGetConductCode**
> CodeOfConduct codesOfConductGetConductCode(key)

Get a code of conduct

Returns information about the specified GitHub code of conduct.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodesOfConductApi()
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : CodeOfConduct = apiInstance.codesOfConductGetConductCode(key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodesOfConductApi#codesOfConductGetConductCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodesOfConductApi#codesOfConductGetConductCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  | [default to &quot;push&quot;]

### Return type

[**CodeOfConduct**](CodeOfConduct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

