# BillingApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**billingGetGithubActionsBillingOrg**](BillingApi.md#billingGetGithubActionsBillingOrg) | **GET** /orgs/{org}/settings/billing/actions | Get GitHub Actions billing for an organization
[**billingGetGithubActionsBillingUser**](BillingApi.md#billingGetGithubActionsBillingUser) | **GET** /users/{username}/settings/billing/actions | Get GitHub Actions billing for a user
[**billingGetGithubPackagesBillingOrg**](BillingApi.md#billingGetGithubPackagesBillingOrg) | **GET** /orgs/{org}/settings/billing/packages | Get GitHub Packages billing for an organization
[**billingGetGithubPackagesBillingUser**](BillingApi.md#billingGetGithubPackagesBillingUser) | **GET** /users/{username}/settings/billing/packages | Get GitHub Packages billing for a user
[**billingGetSharedStorageBillingOrg**](BillingApi.md#billingGetSharedStorageBillingOrg) | **GET** /orgs/{org}/settings/billing/shared-storage | Get shared storage billing for an organization
[**billingGetSharedStorageBillingUser**](BillingApi.md#billingGetSharedStorageBillingUser) | **GET** /users/{username}/settings/billing/shared-storage | Get shared storage billing for a user


<a id="billingGetGithubActionsBillingOrg"></a>
# **billingGetGithubActionsBillingOrg**
> ActionsBillingUsage billingGetGithubActionsBillingOrg(org)

Get GitHub Actions billing for an organization

Gets the summary of the free and paid GitHub Actions minutes used.  Paid minutes only apply to workflows in private repositories that use GitHub-hosted runners. Minutes used is listed for each GitHub-hosted runner operating system. Any job re-runs are also included in the usage. The usage returned includes any minute multipliers for macOS and Windows runners, and is rounded up to the nearest whole minute. For more information, see \&quot;[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)\&quot;.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillingApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : ActionsBillingUsage = apiInstance.billingGetGithubActionsBillingOrg(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#billingGetGithubActionsBillingOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#billingGetGithubActionsBillingOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**ActionsBillingUsage**](ActionsBillingUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="billingGetGithubActionsBillingUser"></a>
# **billingGetGithubActionsBillingUser**
> ActionsBillingUsage billingGetGithubActionsBillingUser(username)

Get GitHub Actions billing for a user

Gets the summary of the free and paid GitHub Actions minutes used.  Paid minutes only apply to workflows in private repositories that use GitHub-hosted runners. Minutes used is listed for each GitHub-hosted runner operating system. Any job re-runs are also included in the usage. The usage returned includes any minute multipliers for macOS and Windows runners, and is rounded up to the nearest whole minute. For more information, see \&quot;[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)\&quot;.  OAuth app tokens and personal access tokens (classic) need the &#x60;user&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillingApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    val result : ActionsBillingUsage = apiInstance.billingGetGithubActionsBillingUser(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#billingGetGithubActionsBillingUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#billingGetGithubActionsBillingUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

[**ActionsBillingUsage**](ActionsBillingUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="billingGetGithubPackagesBillingOrg"></a>
# **billingGetGithubPackagesBillingOrg**
> PackagesBillingUsage billingGetGithubPackagesBillingOrg(org)

Get GitHub Packages billing for an organization

Gets the free and paid storage used for GitHub Packages in gigabytes.  Paid minutes only apply to packages stored for private repositories. For more information, see \&quot;[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillingApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : PackagesBillingUsage = apiInstance.billingGetGithubPackagesBillingOrg(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#billingGetGithubPackagesBillingOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#billingGetGithubPackagesBillingOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**PackagesBillingUsage**](PackagesBillingUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="billingGetGithubPackagesBillingUser"></a>
# **billingGetGithubPackagesBillingUser**
> PackagesBillingUsage billingGetGithubPackagesBillingUser(username)

Get GitHub Packages billing for a user

Gets the free and paid storage used for GitHub Packages in gigabytes.  Paid minutes only apply to packages stored for private repositories. For more information, see \&quot;[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;user&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillingApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    val result : PackagesBillingUsage = apiInstance.billingGetGithubPackagesBillingUser(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#billingGetGithubPackagesBillingUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#billingGetGithubPackagesBillingUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

[**PackagesBillingUsage**](PackagesBillingUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="billingGetSharedStorageBillingOrg"></a>
# **billingGetSharedStorageBillingOrg**
> CombinedBillingUsage billingGetSharedStorageBillingOrg(org)

Get shared storage billing for an organization

Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub Packages.  Paid minutes only apply to packages stored for private repositories. For more information, see \&quot;[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillingApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : CombinedBillingUsage = apiInstance.billingGetSharedStorageBillingOrg(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#billingGetSharedStorageBillingOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#billingGetSharedStorageBillingOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**CombinedBillingUsage**](CombinedBillingUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="billingGetSharedStorageBillingUser"></a>
# **billingGetSharedStorageBillingUser**
> CombinedBillingUsage billingGetSharedStorageBillingUser(username)

Get shared storage billing for a user

Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub Packages.  Paid minutes only apply to packages stored for private repositories. For more information, see \&quot;[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;user&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillingApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    val result : CombinedBillingUsage = apiInstance.billingGetSharedStorageBillingUser(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingApi#billingGetSharedStorageBillingUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingApi#billingGetSharedStorageBillingUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

[**CombinedBillingUsage**](CombinedBillingUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

