# InteractionsApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**interactionsGetRestrictionsForAuthenticatedUser**](InteractionsApi.md#interactionsGetRestrictionsForAuthenticatedUser) | **GET** /user/interaction-limits | Get interaction restrictions for your public repositories
[**interactionsGetRestrictionsForOrg**](InteractionsApi.md#interactionsGetRestrictionsForOrg) | **GET** /orgs/{org}/interaction-limits | Get interaction restrictions for an organization
[**interactionsGetRestrictionsForRepo**](InteractionsApi.md#interactionsGetRestrictionsForRepo) | **GET** /repos/{owner}/{repo}/interaction-limits | Get interaction restrictions for a repository
[**interactionsRemoveRestrictionsForAuthenticatedUser**](InteractionsApi.md#interactionsRemoveRestrictionsForAuthenticatedUser) | **DELETE** /user/interaction-limits | Remove interaction restrictions from your public repositories
[**interactionsRemoveRestrictionsForOrg**](InteractionsApi.md#interactionsRemoveRestrictionsForOrg) | **DELETE** /orgs/{org}/interaction-limits | Remove interaction restrictions for an organization
[**interactionsRemoveRestrictionsForRepo**](InteractionsApi.md#interactionsRemoveRestrictionsForRepo) | **DELETE** /repos/{owner}/{repo}/interaction-limits | Remove interaction restrictions for a repository
[**interactionsSetRestrictionsForAuthenticatedUser**](InteractionsApi.md#interactionsSetRestrictionsForAuthenticatedUser) | **PUT** /user/interaction-limits | Set interaction restrictions for your public repositories
[**interactionsSetRestrictionsForOrg**](InteractionsApi.md#interactionsSetRestrictionsForOrg) | **PUT** /orgs/{org}/interaction-limits | Set interaction restrictions for an organization
[**interactionsSetRestrictionsForRepo**](InteractionsApi.md#interactionsSetRestrictionsForRepo) | **PUT** /repos/{owner}/{repo}/interaction-limits | Set interaction restrictions for a repository


<a id="interactionsGetRestrictionsForAuthenticatedUser"></a>
# **interactionsGetRestrictionsForAuthenticatedUser**
> InteractionsGetRestrictionsForOrg200Response interactionsGetRestrictionsForAuthenticatedUser()

Get interaction restrictions for your public repositories

Shows which type of GitHub user can interact with your public repositories and when the restriction expires.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InteractionsApi()
try {
    val result : InteractionsGetRestrictionsForOrg200Response = apiInstance.interactionsGetRestrictionsForAuthenticatedUser()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InteractionsApi#interactionsGetRestrictionsForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InteractionsApi#interactionsGetRestrictionsForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InteractionsGetRestrictionsForOrg200Response**](InteractionsGetRestrictionsForOrg200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="interactionsGetRestrictionsForOrg"></a>
# **interactionsGetRestrictionsForOrg**
> InteractionsGetRestrictionsForOrg200Response interactionsGetRestrictionsForOrg(org)

Get interaction restrictions for an organization

Shows which type of GitHub user can interact with this organization and when the restriction expires. If there is no restrictions, you will see an empty response.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InteractionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : InteractionsGetRestrictionsForOrg200Response = apiInstance.interactionsGetRestrictionsForOrg(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InteractionsApi#interactionsGetRestrictionsForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InteractionsApi#interactionsGetRestrictionsForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**InteractionsGetRestrictionsForOrg200Response**](InteractionsGetRestrictionsForOrg200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="interactionsGetRestrictionsForRepo"></a>
# **interactionsGetRestrictionsForRepo**
> InteractionsGetRestrictionsForOrg200Response interactionsGetRestrictionsForRepo(owner, repo)

Get interaction restrictions for a repository

Shows which type of GitHub user can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InteractionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : InteractionsGetRestrictionsForOrg200Response = apiInstance.interactionsGetRestrictionsForRepo(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InteractionsApi#interactionsGetRestrictionsForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InteractionsApi#interactionsGetRestrictionsForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**InteractionsGetRestrictionsForOrg200Response**](InteractionsGetRestrictionsForOrg200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="interactionsRemoveRestrictionsForAuthenticatedUser"></a>
# **interactionsRemoveRestrictionsForAuthenticatedUser**
> interactionsRemoveRestrictionsForAuthenticatedUser()

Remove interaction restrictions from your public repositories

Removes any interaction restrictions from your public repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InteractionsApi()
try {
    apiInstance.interactionsRemoveRestrictionsForAuthenticatedUser()
} catch (e: ClientException) {
    println("4xx response calling InteractionsApi#interactionsRemoveRestrictionsForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InteractionsApi#interactionsRemoveRestrictionsForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="interactionsRemoveRestrictionsForOrg"></a>
# **interactionsRemoveRestrictionsForOrg**
> interactionsRemoveRestrictionsForOrg(org)

Remove interaction restrictions for an organization

Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InteractionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    apiInstance.interactionsRemoveRestrictionsForOrg(org)
} catch (e: ClientException) {
    println("4xx response calling InteractionsApi#interactionsRemoveRestrictionsForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InteractionsApi#interactionsRemoveRestrictionsForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="interactionsRemoveRestrictionsForRepo"></a>
# **interactionsRemoveRestrictionsForRepo**
> interactionsRemoveRestrictionsForRepo(owner, repo)

Remove interaction restrictions for a repository

Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions. If the interaction limit is set for the user or organization that owns this repository, you will receive a &#x60;409 Conflict&#x60; response and will not be able to use this endpoint to change the interaction limit for a single repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InteractionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    apiInstance.interactionsRemoveRestrictionsForRepo(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling InteractionsApi#interactionsRemoveRestrictionsForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InteractionsApi#interactionsRemoveRestrictionsForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="interactionsSetRestrictionsForAuthenticatedUser"></a>
# **interactionsSetRestrictionsForAuthenticatedUser**
> InteractionLimitResponse interactionsSetRestrictionsForAuthenticatedUser(interactionLimit)

Set interaction restrictions for your public repositories

Temporarily restricts which type of GitHub user can interact with your public repositories. Setting the interaction limit at the user level will overwrite any interaction limits that are set for individual repositories owned by the user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InteractionsApi()
val interactionLimit : InteractionLimit = {limit=collaborators_only, expiry=one_month} // InteractionLimit | 
try {
    val result : InteractionLimitResponse = apiInstance.interactionsSetRestrictionsForAuthenticatedUser(interactionLimit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InteractionsApi#interactionsSetRestrictionsForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InteractionsApi#interactionsSetRestrictionsForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interactionLimit** | [**InteractionLimit**](InteractionLimit.md)|  |

### Return type

[**InteractionLimitResponse**](InteractionLimitResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="interactionsSetRestrictionsForOrg"></a>
# **interactionsSetRestrictionsForOrg**
> InteractionLimitResponse interactionsSetRestrictionsForOrg(org, interactionLimit)

Set interaction restrictions for an organization

Temporarily restricts interactions to a certain type of GitHub user in any public repository in the given organization. You must be an organization owner to set these restrictions. Setting the interaction limit at the organization level will overwrite any interaction limits that are set for individual repositories owned by the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InteractionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val interactionLimit : InteractionLimit = {"limit":"collaborators_only","expiry":"one_month"} // InteractionLimit | 
try {
    val result : InteractionLimitResponse = apiInstance.interactionsSetRestrictionsForOrg(org, interactionLimit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InteractionsApi#interactionsSetRestrictionsForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InteractionsApi#interactionsSetRestrictionsForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **interactionLimit** | [**InteractionLimit**](InteractionLimit.md)|  |

### Return type

[**InteractionLimitResponse**](InteractionLimitResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="interactionsSetRestrictionsForRepo"></a>
# **interactionsSetRestrictionsForRepo**
> InteractionLimitResponse interactionsSetRestrictionsForRepo(owner, repo, interactionLimit)

Set interaction restrictions for a repository

Temporarily restricts interactions to a certain type of GitHub user within the given repository. You must have owner or admin access to set these restrictions. If an interaction limit is set for the user or organization that owns this repository, you will receive a &#x60;409 Conflict&#x60; response and will not be able to use this endpoint to change the interaction limit for a single repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InteractionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val interactionLimit : InteractionLimit = {"limit":"collaborators_only","expiry":"one_day"} // InteractionLimit | 
try {
    val result : InteractionLimitResponse = apiInstance.interactionsSetRestrictionsForRepo(owner, repo, interactionLimit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InteractionsApi#interactionsSetRestrictionsForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InteractionsApi#interactionsSetRestrictionsForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **interactionLimit** | [**InteractionLimit**](InteractionLimit.md)|  |

### Return type

[**InteractionLimitResponse**](InteractionLimitResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

