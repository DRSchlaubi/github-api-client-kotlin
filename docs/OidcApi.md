# OidcApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oidcGetOidcCustomSubTemplateForOrg**](OidcApi.md#oidcGetOidcCustomSubTemplateForOrg) | **GET** /orgs/{org}/actions/oidc/customization/sub | Get the customization template for an OIDC subject claim for an organization
[**oidcUpdateOidcCustomSubTemplateForOrg**](OidcApi.md#oidcUpdateOidcCustomSubTemplateForOrg) | **PUT** /orgs/{org}/actions/oidc/customization/sub | Set the customization template for an OIDC subject claim for an organization


<a id="oidcGetOidcCustomSubTemplateForOrg"></a>
# **oidcGetOidcCustomSubTemplateForOrg**
> OidcCustomSub oidcGetOidcCustomSubTemplateForOrg(org)

Get the customization template for an OIDC subject claim for an organization

Gets the customization template for an OpenID Connect (OIDC) subject claim.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OidcApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : OidcCustomSub = apiInstance.oidcGetOidcCustomSubTemplateForOrg(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OidcApi#oidcGetOidcCustomSubTemplateForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OidcApi#oidcGetOidcCustomSubTemplateForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**OidcCustomSub**](OidcCustomSub.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="oidcUpdateOidcCustomSubTemplateForOrg"></a>
# **oidcUpdateOidcCustomSubTemplateForOrg**
> kotlin.Any oidcUpdateOidcCustomSubTemplateForOrg(org, oidcCustomSub)

Set the customization template for an OIDC subject claim for an organization

Creates or updates the customization template for an OpenID Connect (OIDC) subject claim.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OidcApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val oidcCustomSub : OidcCustomSub =  // OidcCustomSub | 
try {
    val result : kotlin.Any = apiInstance.oidcUpdateOidcCustomSubTemplateForOrg(org, oidcCustomSub)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OidcApi#oidcUpdateOidcCustomSubTemplateForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OidcApi#oidcUpdateOidcCustomSubTemplateForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **oidcCustomSub** | [**OidcCustomSub**](OidcCustomSub.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

