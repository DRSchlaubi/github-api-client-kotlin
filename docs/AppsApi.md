# AppsApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appsAddRepoToInstallationForAuthenticatedUser**](AppsApi.md#appsAddRepoToInstallationForAuthenticatedUser) | **PUT** /user/installations/{installation_id}/repositories/{repository_id} | Add a repository to an app installation
[**appsCheckToken**](AppsApi.md#appsCheckToken) | **POST** /applications/{client_id}/token | Check a token
[**appsCreateFromManifest**](AppsApi.md#appsCreateFromManifest) | **POST** /app-manifests/{code}/conversions | Create a GitHub App from a manifest
[**appsCreateInstallationAccessToken**](AppsApi.md#appsCreateInstallationAccessToken) | **POST** /app/installations/{installation_id}/access_tokens | Create an installation access token for an app
[**appsDeleteAuthorization**](AppsApi.md#appsDeleteAuthorization) | **DELETE** /applications/{client_id}/grant | Delete an app authorization
[**appsDeleteInstallation**](AppsApi.md#appsDeleteInstallation) | **DELETE** /app/installations/{installation_id} | Delete an installation for the authenticated app
[**appsDeleteToken**](AppsApi.md#appsDeleteToken) | **DELETE** /applications/{client_id}/token | Delete an app token
[**appsGetAuthenticated**](AppsApi.md#appsGetAuthenticated) | **GET** /app | Get the authenticated app
[**appsGetBySlug**](AppsApi.md#appsGetBySlug) | **GET** /apps/{app_slug} | Get an app
[**appsGetInstallation**](AppsApi.md#appsGetInstallation) | **GET** /app/installations/{installation_id} | Get an installation for the authenticated app
[**appsGetOrgInstallation**](AppsApi.md#appsGetOrgInstallation) | **GET** /orgs/{org}/installation | Get an organization installation for the authenticated app
[**appsGetRepoInstallation**](AppsApi.md#appsGetRepoInstallation) | **GET** /repos/{owner}/{repo}/installation | Get a repository installation for the authenticated app
[**appsGetSubscriptionPlanForAccount**](AppsApi.md#appsGetSubscriptionPlanForAccount) | **GET** /marketplace_listing/accounts/{account_id} | Get a subscription plan for an account
[**appsGetSubscriptionPlanForAccountStubbed**](AppsApi.md#appsGetSubscriptionPlanForAccountStubbed) | **GET** /marketplace_listing/stubbed/accounts/{account_id} | Get a subscription plan for an account (stubbed)
[**appsGetUserInstallation**](AppsApi.md#appsGetUserInstallation) | **GET** /users/{username}/installation | Get a user installation for the authenticated app
[**appsGetWebhookConfigForApp**](AppsApi.md#appsGetWebhookConfigForApp) | **GET** /app/hook/config | Get a webhook configuration for an app
[**appsGetWebhookDelivery**](AppsApi.md#appsGetWebhookDelivery) | **GET** /app/hook/deliveries/{delivery_id} | Get a delivery for an app webhook
[**appsListAccountsForPlan**](AppsApi.md#appsListAccountsForPlan) | **GET** /marketplace_listing/plans/{plan_id}/accounts | List accounts for a plan
[**appsListAccountsForPlanStubbed**](AppsApi.md#appsListAccountsForPlanStubbed) | **GET** /marketplace_listing/stubbed/plans/{plan_id}/accounts | List accounts for a plan (stubbed)
[**appsListInstallationReposForAuthenticatedUser**](AppsApi.md#appsListInstallationReposForAuthenticatedUser) | **GET** /user/installations/{installation_id}/repositories | List repositories accessible to the user access token
[**appsListInstallationRequestsForAuthenticatedApp**](AppsApi.md#appsListInstallationRequestsForAuthenticatedApp) | **GET** /app/installation-requests | List installation requests for the authenticated app
[**appsListInstallations**](AppsApi.md#appsListInstallations) | **GET** /app/installations | List installations for the authenticated app
[**appsListInstallationsForAuthenticatedUser**](AppsApi.md#appsListInstallationsForAuthenticatedUser) | **GET** /user/installations | List app installations accessible to the user access token
[**appsListPlans**](AppsApi.md#appsListPlans) | **GET** /marketplace_listing/plans | List plans
[**appsListPlansStubbed**](AppsApi.md#appsListPlansStubbed) | **GET** /marketplace_listing/stubbed/plans | List plans (stubbed)
[**appsListReposAccessibleToInstallation**](AppsApi.md#appsListReposAccessibleToInstallation) | **GET** /installation/repositories | List repositories accessible to the app installation
[**appsListSubscriptionsForAuthenticatedUser**](AppsApi.md#appsListSubscriptionsForAuthenticatedUser) | **GET** /user/marketplace_purchases | List subscriptions for the authenticated user
[**appsListSubscriptionsForAuthenticatedUserStubbed**](AppsApi.md#appsListSubscriptionsForAuthenticatedUserStubbed) | **GET** /user/marketplace_purchases/stubbed | List subscriptions for the authenticated user (stubbed)
[**appsListWebhookDeliveries**](AppsApi.md#appsListWebhookDeliveries) | **GET** /app/hook/deliveries | List deliveries for an app webhook
[**appsRedeliverWebhookDelivery**](AppsApi.md#appsRedeliverWebhookDelivery) | **POST** /app/hook/deliveries/{delivery_id}/attempts | Redeliver a delivery for an app webhook
[**appsRemoveRepoFromInstallationForAuthenticatedUser**](AppsApi.md#appsRemoveRepoFromInstallationForAuthenticatedUser) | **DELETE** /user/installations/{installation_id}/repositories/{repository_id} | Remove a repository from an app installation
[**appsResetToken**](AppsApi.md#appsResetToken) | **PATCH** /applications/{client_id}/token | Reset a token
[**appsRevokeInstallationAccessToken**](AppsApi.md#appsRevokeInstallationAccessToken) | **DELETE** /installation/token | Revoke an installation access token
[**appsScopeToken**](AppsApi.md#appsScopeToken) | **POST** /applications/{client_id}/token/scoped | Create a scoped access token
[**appsSuspendInstallation**](AppsApi.md#appsSuspendInstallation) | **PUT** /app/installations/{installation_id}/suspended | Suspend an app installation
[**appsUnsuspendInstallation**](AppsApi.md#appsUnsuspendInstallation) | **DELETE** /app/installations/{installation_id}/suspended | Unsuspend an app installation
[**appsUpdateWebhookConfigForApp**](AppsApi.md#appsUpdateWebhookConfigForApp) | **PATCH** /app/hook/config | Update a webhook configuration for an app


<a id="appsAddRepoToInstallationForAuthenticatedUser"></a>
# **appsAddRepoToInstallationForAuthenticatedUser**
> appsAddRepoToInstallationForAuthenticatedUser(installationId, repositoryId)

Add a repository to an app installation

Add a single repository to an installation. The authenticated user must have admin access to the repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val installationId : kotlin.Int = 1 // kotlin.Int | The unique identifier of the installation.
val repositoryId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the repository.
try {
    apiInstance.appsAddRepoToInstallationForAuthenticatedUser(installationId, repositoryId)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsAddRepoToInstallationForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsAddRepoToInstallationForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installationId** | **kotlin.Int**| The unique identifier of the installation. |
 **repositoryId** | **kotlin.Int**| The unique identifier of the repository. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsCheckToken"></a>
# **appsCheckToken**
> Authorization appsCheckToken(clientId, appsCheckTokenRequest)

Check a token

OAuth applications and GitHub applications with OAuth authorizations can use this API method for checking OAuth token validity without exceeding the normal rate limits for failed login attempts. Authentication works differently with this particular endpoint. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) to use this endpoint, where the username is the application &#x60;client_id&#x60; and the password is its &#x60;client_secret&#x60;. Invalid tokens will return &#x60;404 NOT FOUND&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val clientId : kotlin.String = Iv1.8a61f9b3a7aba766 // kotlin.String | The client ID of the GitHub app.
val appsCheckTokenRequest : AppsCheckTokenRequest = {access_token=e72e16c7e42f292c6912e7710c838347ae178b4a} // AppsCheckTokenRequest | 
try {
    val result : Authorization = apiInstance.appsCheckToken(clientId, appsCheckTokenRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsCheckToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsCheckToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **kotlin.String**| The client ID of the GitHub app. |
 **appsCheckTokenRequest** | [**AppsCheckTokenRequest**](AppsCheckTokenRequest.md)|  |

### Return type

[**Authorization**](Authorization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="appsCreateFromManifest"></a>
# **appsCreateFromManifest**
> AppsCreateFromManifest201Response appsCreateFromManifest(code)

Create a GitHub App from a manifest

Use this endpoint to complete the handshake necessary when implementing the [GitHub App Manifest flow](https://docs.github.com/apps/building-github-apps/creating-github-apps-from-a-manifest/). When you create a GitHub App with the manifest flow, you receive a temporary &#x60;code&#x60; used to retrieve the GitHub App&#39;s &#x60;id&#x60;, &#x60;pem&#x60; (private key), and &#x60;webhook_secret&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val code : kotlin.String = code_example // kotlin.String | 
try {
    val result : AppsCreateFromManifest201Response = apiInstance.appsCreateFromManifest(code)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsCreateFromManifest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsCreateFromManifest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**|  | [default to &quot;push&quot;]

### Return type

[**AppsCreateFromManifest201Response**](AppsCreateFromManifest201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsCreateInstallationAccessToken"></a>
# **appsCreateInstallationAccessToken**
> InstallationToken appsCreateInstallationAccessToken(installationId, appsCreateInstallationAccessTokenRequest)

Create an installation access token for an app

Creates an installation access token that enables a GitHub App to make authenticated API requests for the app&#39;s installation on an organization or individual account. Installation tokens expire one hour from the time you create them. Using an expired token produces a status code of &#x60;401 - Unauthorized&#x60;, and requires creating a new installation token. By default the installation token has access to all repositories that the installation can access.   Optionally, you can use the &#x60;repositories&#x60; or &#x60;repository_ids&#x60; body parameters to specify individual repositories that the installation access token can access. If you don&#39;t use &#x60;repositories&#x60; or &#x60;repository_ids&#x60; to grant access to specific repositories, the installation access token will have access to all repositories that the installation was granted access to. The installation access token cannot be granted access to repositories that the installation was not granted access to. Up to 500 repositories can be listed in this manner.  Optionally, use the &#x60;permissions&#x60; body parameter to specify the permissions that the installation access token should have. If &#x60;permissions&#x60; is not specified, the installation access token will have all of the permissions that were granted to the app. The installation access token cannot be granted permissions that the app was not granted.  When using the repository or permission parameters to reduce the access of the token, the complexity of the token is increased due to both the number of permissions in the request and the number of repositories the token will have access to. If the complexity is too large, the token will fail to be issued. If this occurs, the error message will indicate the maximum number of repositories that should be requested. For the average application requesting 8 permissions, this limit is around 5000 repositories. With fewer permissions requested, more repositories are supported.   You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val installationId : kotlin.Int = 1 // kotlin.Int | The unique identifier of the installation.
val appsCreateInstallationAccessTokenRequest : AppsCreateInstallationAccessTokenRequest = {"repositories":["Hello-World"],"permissions":{"issues":"write","contents":"read"}} // AppsCreateInstallationAccessTokenRequest | 
try {
    val result : InstallationToken = apiInstance.appsCreateInstallationAccessToken(installationId, appsCreateInstallationAccessTokenRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsCreateInstallationAccessToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsCreateInstallationAccessToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installationId** | **kotlin.Int**| The unique identifier of the installation. |
 **appsCreateInstallationAccessTokenRequest** | [**AppsCreateInstallationAccessTokenRequest**](AppsCreateInstallationAccessTokenRequest.md)|  | [optional]

### Return type

[**InstallationToken**](InstallationToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="appsDeleteAuthorization"></a>
# **appsDeleteAuthorization**
> appsDeleteAuthorization(clientId, appsDeleteAuthorizationRequest)

Delete an app authorization

OAuth and GitHub application owners can revoke a grant for their application and a specific user. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the OAuth application&#39;s &#x60;client_id&#x60; and &#x60;client_secret&#x60; as the username and password. You must also provide a valid OAuth &#x60;access_token&#x60; as an input parameter and the grant for the token&#39;s owner will be deleted. Deleting an application&#39;s grant will also delete all OAuth tokens associated with the application for the user. Once deleted, the application will have no access to the user&#39;s account and will no longer be listed on [the application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val clientId : kotlin.String = Iv1.8a61f9b3a7aba766 // kotlin.String | The client ID of the GitHub app.
val appsDeleteAuthorizationRequest : AppsDeleteAuthorizationRequest = {"access_token":"e72e16c7e42f292c6912e7710c838347ae178b4a"} // AppsDeleteAuthorizationRequest | 
try {
    apiInstance.appsDeleteAuthorization(clientId, appsDeleteAuthorizationRequest)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsDeleteAuthorization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsDeleteAuthorization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **kotlin.String**| The client ID of the GitHub app. |
 **appsDeleteAuthorizationRequest** | [**AppsDeleteAuthorizationRequest**](AppsDeleteAuthorizationRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="appsDeleteInstallation"></a>
# **appsDeleteInstallation**
> appsDeleteInstallation(installationId)

Delete an installation for the authenticated app

Uninstalls a GitHub App on a user, organization, or business account. If you prefer to temporarily suspend an app&#39;s access to your account&#39;s resources, then we recommend the \&quot;[Suspend an app installation](https://docs.github.com/rest/apps/apps#suspend-an-app-installation)\&quot; endpoint.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val installationId : kotlin.Int = 1 // kotlin.Int | The unique identifier of the installation.
try {
    apiInstance.appsDeleteInstallation(installationId)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsDeleteInstallation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsDeleteInstallation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installationId** | **kotlin.Int**| The unique identifier of the installation. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsDeleteToken"></a>
# **appsDeleteToken**
> appsDeleteToken(clientId, appsDeleteAuthorizationRequest)

Delete an app token

OAuth  or GitHub application owners can revoke a single token for an OAuth application or a GitHub application with an OAuth authorization. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the application&#39;s &#x60;client_id&#x60; and &#x60;client_secret&#x60; as the username and password.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val clientId : kotlin.String = Iv1.8a61f9b3a7aba766 // kotlin.String | The client ID of the GitHub app.
val appsDeleteAuthorizationRequest : AppsDeleteAuthorizationRequest = {access_token=e72e16c7e42f292c6912e7710c838347ae178b4a} // AppsDeleteAuthorizationRequest | 
try {
    apiInstance.appsDeleteToken(clientId, appsDeleteAuthorizationRequest)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsDeleteToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsDeleteToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **kotlin.String**| The client ID of the GitHub app. |
 **appsDeleteAuthorizationRequest** | [**AppsDeleteAuthorizationRequest**](AppsDeleteAuthorizationRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="appsGetAuthenticated"></a>
# **appsGetAuthenticated**
> Integration appsGetAuthenticated()

Get the authenticated app

Returns the GitHub App associated with the authentication credentials used. To see how many app installations are associated with this GitHub App, see the &#x60;installations_count&#x60; in the response. For more details about your app&#39;s installations, see the \&quot;[List installations for the authenticated app](https://docs.github.com/rest/apps/apps#list-installations-for-the-authenticated-app)\&quot; endpoint.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
try {
    val result : Integration = apiInstance.appsGetAuthenticated()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsGetAuthenticated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsGetAuthenticated")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Integration**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsGetBySlug"></a>
# **appsGetBySlug**
> Integration appsGetBySlug(appSlug)

Get an app

**Note**: The &#x60;:app_slug&#x60; is just the URL-friendly name of your GitHub App. You can find this on the settings page for your GitHub App (e.g., &#x60;https://github.com/settings/apps/:app_slug&#x60;).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val appSlug : kotlin.String = appSlug_example // kotlin.String | 
try {
    val result : Integration = apiInstance.appsGetBySlug(appSlug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsGetBySlug")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsGetBySlug")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appSlug** | **kotlin.String**|  |

### Return type

[**Integration**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsGetInstallation"></a>
# **appsGetInstallation**
> Installation appsGetInstallation(installationId)

Get an installation for the authenticated app

Enables an authenticated GitHub App to find an installation&#39;s information using the installation id.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val installationId : kotlin.Int = 1 // kotlin.Int | The unique identifier of the installation.
try {
    val result : Installation = apiInstance.appsGetInstallation(installationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsGetInstallation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsGetInstallation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installationId** | **kotlin.Int**| The unique identifier of the installation. |

### Return type

[**Installation**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsGetOrgInstallation"></a>
# **appsGetOrgInstallation**
> Installation appsGetOrgInstallation(org)

Get an organization installation for the authenticated app

Enables an authenticated GitHub App to find the organization&#39;s installation information.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : Installation = apiInstance.appsGetOrgInstallation(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsGetOrgInstallation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsGetOrgInstallation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**Installation**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsGetRepoInstallation"></a>
# **appsGetRepoInstallation**
> Installation appsGetRepoInstallation(owner, repo)

Get a repository installation for the authenticated app

Enables an authenticated GitHub App to find the repository&#39;s installation information. The installation&#39;s account type will be either an organization or a user account, depending which account the repository belongs to.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : Installation = apiInstance.appsGetRepoInstallation(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsGetRepoInstallation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsGetRepoInstallation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**Installation**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsGetSubscriptionPlanForAccount"></a>
# **appsGetSubscriptionPlanForAccount**
> MarketplacePurchase appsGetSubscriptionPlanForAccount(accountId)

Get a subscription plan for an account

Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won&#39;t be processed until the end of their billing cycle, you will also see the upcoming pending change.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val accountId : kotlin.Int = 56 // kotlin.Int | account_id parameter
try {
    val result : MarketplacePurchase = apiInstance.appsGetSubscriptionPlanForAccount(accountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsGetSubscriptionPlanForAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsGetSubscriptionPlanForAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.Int**| account_id parameter |

### Return type

[**MarketplacePurchase**](MarketplacePurchase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsGetSubscriptionPlanForAccountStubbed"></a>
# **appsGetSubscriptionPlanForAccountStubbed**
> MarketplacePurchase appsGetSubscriptionPlanForAccountStubbed(accountId)

Get a subscription plan for an account (stubbed)

Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won&#39;t be processed until the end of their billing cycle, you will also see the upcoming pending change.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val accountId : kotlin.Int = 56 // kotlin.Int | account_id parameter
try {
    val result : MarketplacePurchase = apiInstance.appsGetSubscriptionPlanForAccountStubbed(accountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsGetSubscriptionPlanForAccountStubbed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsGetSubscriptionPlanForAccountStubbed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.Int**| account_id parameter |

### Return type

[**MarketplacePurchase**](MarketplacePurchase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsGetUserInstallation"></a>
# **appsGetUserInstallation**
> Installation appsGetUserInstallation(username)

Get a user installation for the authenticated app

Enables an authenticated GitHub App to find the user’s installation information.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    val result : Installation = apiInstance.appsGetUserInstallation(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsGetUserInstallation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsGetUserInstallation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

[**Installation**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsGetWebhookConfigForApp"></a>
# **appsGetWebhookConfigForApp**
> WebhookConfig appsGetWebhookConfigForApp()

Get a webhook configuration for an app

Returns the webhook configuration for a GitHub App. For more information about configuring a webhook for your app, see \&quot;[Creating a GitHub App](/developers/apps/creating-a-github-app).\&quot;  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
try {
    val result : WebhookConfig = apiInstance.appsGetWebhookConfigForApp()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsGetWebhookConfigForApp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsGetWebhookConfigForApp")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhookConfig**](WebhookConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsGetWebhookDelivery"></a>
# **appsGetWebhookDelivery**
> HookDelivery appsGetWebhookDelivery(deliveryId)

Get a delivery for an app webhook

Returns a delivery for the webhook configured for a GitHub App.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val deliveryId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : HookDelivery = apiInstance.appsGetWebhookDelivery(deliveryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsGetWebhookDelivery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsGetWebhookDelivery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deliveryId** | **kotlin.Int**|  |

### Return type

[**HookDelivery**](HookDelivery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="appsListAccountsForPlan"></a>
# **appsListAccountsForPlan**
> kotlin.collections.List&lt;MarketplacePurchase&gt; appsListAccountsForPlan(planId, sort, direction, perPage, page)

List accounts for a plan

Returns user and organization accounts associated with the specified plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won&#39;t be processed until the end of their billing cycle, you will also see the upcoming pending change.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val planId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the plan.
val sort : kotlin.String = sort_example // kotlin.String | The property to sort the results by.
val direction : kotlin.String = direction_example // kotlin.String | To return the oldest accounts first, set to `asc`. Ignored without the `sort` parameter.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<MarketplacePurchase> = apiInstance.appsListAccountsForPlan(planId, sort, direction, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsListAccountsForPlan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsListAccountsForPlan")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planId** | **kotlin.Int**| The unique identifier of the plan. |
 **sort** | **kotlin.String**| The property to sort the results by. | [optional] [default to created] [enum: created, updated]
 **direction** | **kotlin.String**| To return the oldest accounts first, set to &#x60;asc&#x60;. Ignored without the &#x60;sort&#x60; parameter. | [optional] [enum: asc, desc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;MarketplacePurchase&gt;**](MarketplacePurchase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsListAccountsForPlanStubbed"></a>
# **appsListAccountsForPlanStubbed**
> kotlin.collections.List&lt;MarketplacePurchase&gt; appsListAccountsForPlanStubbed(planId, sort, direction, perPage, page)

List accounts for a plan (stubbed)

Returns repository and organization accounts associated with the specified plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won&#39;t be processed until the end of their billing cycle, you will also see the upcoming pending change.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val planId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the plan.
val sort : kotlin.String = sort_example // kotlin.String | The property to sort the results by.
val direction : kotlin.String = direction_example // kotlin.String | To return the oldest accounts first, set to `asc`. Ignored without the `sort` parameter.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<MarketplacePurchase> = apiInstance.appsListAccountsForPlanStubbed(planId, sort, direction, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsListAccountsForPlanStubbed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsListAccountsForPlanStubbed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planId** | **kotlin.Int**| The unique identifier of the plan. |
 **sort** | **kotlin.String**| The property to sort the results by. | [optional] [default to created] [enum: created, updated]
 **direction** | **kotlin.String**| To return the oldest accounts first, set to &#x60;asc&#x60;. Ignored without the &#x60;sort&#x60; parameter. | [optional] [enum: asc, desc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;MarketplacePurchase&gt;**](MarketplacePurchase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsListInstallationReposForAuthenticatedUser"></a>
# **appsListInstallationReposForAuthenticatedUser**
> AppsListInstallationReposForAuthenticatedUser200Response appsListInstallationReposForAuthenticatedUser(installationId, perPage, page)

List repositories accessible to the user access token

List repositories that the authenticated user has explicit permission (&#x60;:read&#x60;, &#x60;:write&#x60;, or &#x60;:admin&#x60;) to access for an installation.  The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.  The access the user has to each repository is included in the hash under the &#x60;permissions&#x60; key.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val installationId : kotlin.Int = 1 // kotlin.Int | The unique identifier of the installation.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : AppsListInstallationReposForAuthenticatedUser200Response = apiInstance.appsListInstallationReposForAuthenticatedUser(installationId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsListInstallationReposForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsListInstallationReposForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installationId** | **kotlin.Int**| The unique identifier of the installation. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**AppsListInstallationReposForAuthenticatedUser200Response**](AppsListInstallationReposForAuthenticatedUser200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsListInstallationRequestsForAuthenticatedApp"></a>
# **appsListInstallationRequestsForAuthenticatedApp**
> kotlin.collections.List&lt;IntegrationInstallationRequest&gt; appsListInstallationRequestsForAuthenticatedApp(perPage, page)

List installation requests for the authenticated app

Lists all the pending installation requests for the authenticated GitHub App.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<IntegrationInstallationRequest> = apiInstance.appsListInstallationRequestsForAuthenticatedApp(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsListInstallationRequestsForAuthenticatedApp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsListInstallationRequestsForAuthenticatedApp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;IntegrationInstallationRequest&gt;**](IntegrationInstallationRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsListInstallations"></a>
# **appsListInstallations**
> kotlin.collections.List&lt;Installation&gt; appsListInstallations(perPage, page, since, outdated)

List installations for the authenticated app

The permissions the installation has are included under the &#x60;permissions&#x60; key.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val since : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val outdated : kotlin.String = outdated_example // kotlin.String | 
try {
    val result : kotlin.collections.List<Installation> = apiInstance.appsListInstallations(perPage, page, since, outdated)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsListInstallations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsListInstallations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **since** | **kotlinx.datetime.Instant**| Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **outdated** | **kotlin.String**|  | [optional] [default to &quot;push&quot;]

### Return type

[**kotlin.collections.List&lt;Installation&gt;**](Installation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsListInstallationsForAuthenticatedUser"></a>
# **appsListInstallationsForAuthenticatedUser**
> OrgsListAppInstallations200Response appsListInstallationsForAuthenticatedUser(perPage, page)

List app installations accessible to the user access token

Lists installations of your GitHub App that the authenticated user has explicit permission (&#x60;:read&#x60;, &#x60;:write&#x60;, or &#x60;:admin&#x60;) to access.  The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.  You can find the permissions for the installation under the &#x60;permissions&#x60; key.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : OrgsListAppInstallations200Response = apiInstance.appsListInstallationsForAuthenticatedUser(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsListInstallationsForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsListInstallationsForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**OrgsListAppInstallations200Response**](OrgsListAppInstallations200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsListPlans"></a>
# **appsListPlans**
> kotlin.collections.List&lt;MarketplaceListingPlan&gt; appsListPlans(perPage, page)

List plans

Lists all plans that are part of your GitHub Marketplace listing.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<MarketplaceListingPlan> = apiInstance.appsListPlans(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsListPlans")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsListPlans")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;MarketplaceListingPlan&gt;**](MarketplaceListingPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsListPlansStubbed"></a>
# **appsListPlansStubbed**
> kotlin.collections.List&lt;MarketplaceListingPlan&gt; appsListPlansStubbed(perPage, page)

List plans (stubbed)

Lists all plans that are part of your GitHub Marketplace listing.  GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<MarketplaceListingPlan> = apiInstance.appsListPlansStubbed(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsListPlansStubbed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsListPlansStubbed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;MarketplaceListingPlan&gt;**](MarketplaceListingPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsListReposAccessibleToInstallation"></a>
# **appsListReposAccessibleToInstallation**
> AppsListReposAccessibleToInstallation200Response appsListReposAccessibleToInstallation(perPage, page)

List repositories accessible to the app installation

List repositories that an app installation can access.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : AppsListReposAccessibleToInstallation200Response = apiInstance.appsListReposAccessibleToInstallation(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsListReposAccessibleToInstallation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsListReposAccessibleToInstallation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**AppsListReposAccessibleToInstallation200Response**](AppsListReposAccessibleToInstallation200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsListSubscriptionsForAuthenticatedUser"></a>
# **appsListSubscriptionsForAuthenticatedUser**
> kotlin.collections.List&lt;UserMarketplacePurchase&gt; appsListSubscriptionsForAuthenticatedUser(perPage, page)

List subscriptions for the authenticated user

Lists the active subscriptions for the authenticated user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<UserMarketplacePurchase> = apiInstance.appsListSubscriptionsForAuthenticatedUser(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsListSubscriptionsForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsListSubscriptionsForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;UserMarketplacePurchase&gt;**](UserMarketplacePurchase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsListSubscriptionsForAuthenticatedUserStubbed"></a>
# **appsListSubscriptionsForAuthenticatedUserStubbed**
> kotlin.collections.List&lt;UserMarketplacePurchase&gt; appsListSubscriptionsForAuthenticatedUserStubbed(perPage, page)

List subscriptions for the authenticated user (stubbed)

Lists the active subscriptions for the authenticated user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<UserMarketplacePurchase> = apiInstance.appsListSubscriptionsForAuthenticatedUserStubbed(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsListSubscriptionsForAuthenticatedUserStubbed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsListSubscriptionsForAuthenticatedUserStubbed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;UserMarketplacePurchase&gt;**](UserMarketplacePurchase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsListWebhookDeliveries"></a>
# **appsListWebhookDeliveries**
> kotlin.collections.List&lt;HookDeliveryItem&gt; appsListWebhookDeliveries(perPage, cursor, redelivery)

List deliveries for an app webhook

Returns a list of webhook deliveries for the webhook configured for a GitHub App.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val cursor : kotlin.String = cursor_example // kotlin.String | Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the `link` header for the next and previous page cursors.
val redelivery : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.collections.List<HookDeliveryItem> = apiInstance.appsListWebhookDeliveries(perPage, cursor, redelivery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsListWebhookDeliveries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsListWebhookDeliveries")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **cursor** | **kotlin.String**| Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the &#x60;link&#x60; header for the next and previous page cursors. | [optional]
 **redelivery** | **kotlin.Boolean**|  | [optional]

### Return type

[**kotlin.collections.List&lt;HookDeliveryItem&gt;**](HookDeliveryItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="appsRedeliverWebhookDelivery"></a>
# **appsRedeliverWebhookDelivery**
> kotlin.Any appsRedeliverWebhookDelivery(deliveryId)

Redeliver a delivery for an app webhook

Redeliver a delivery for the webhook configured for a GitHub App.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val deliveryId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.appsRedeliverWebhookDelivery(deliveryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsRedeliverWebhookDelivery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsRedeliverWebhookDelivery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deliveryId** | **kotlin.Int**|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="appsRemoveRepoFromInstallationForAuthenticatedUser"></a>
# **appsRemoveRepoFromInstallationForAuthenticatedUser**
> appsRemoveRepoFromInstallationForAuthenticatedUser(installationId, repositoryId)

Remove a repository from an app installation

Remove a single repository from an installation. The authenticated user must have admin access to the repository. The installation must have the &#x60;repository_selection&#x60; of &#x60;selected&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val installationId : kotlin.Int = 1 // kotlin.Int | The unique identifier of the installation.
val repositoryId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the repository.
try {
    apiInstance.appsRemoveRepoFromInstallationForAuthenticatedUser(installationId, repositoryId)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsRemoveRepoFromInstallationForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsRemoveRepoFromInstallationForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installationId** | **kotlin.Int**| The unique identifier of the installation. |
 **repositoryId** | **kotlin.Int**| The unique identifier of the repository. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsResetToken"></a>
# **appsResetToken**
> Authorization appsResetToken(clientId, appsCheckTokenRequest)

Reset a token

OAuth applications and GitHub applications with OAuth authorizations can use this API method to reset a valid OAuth token without end-user involvement. Applications must save the \&quot;token\&quot; property in the response because changes take effect immediately. You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the application&#39;s &#x60;client_id&#x60; and &#x60;client_secret&#x60; as the username and password. Invalid tokens will return &#x60;404 NOT FOUND&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val clientId : kotlin.String = Iv1.8a61f9b3a7aba766 // kotlin.String | The client ID of the GitHub app.
val appsCheckTokenRequest : AppsCheckTokenRequest = {access_token=e72e16c7e42f292c6912e7710c838347ae178b4a} // AppsCheckTokenRequest | 
try {
    val result : Authorization = apiInstance.appsResetToken(clientId, appsCheckTokenRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsResetToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsResetToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **kotlin.String**| The client ID of the GitHub app. |
 **appsCheckTokenRequest** | [**AppsCheckTokenRequest**](AppsCheckTokenRequest.md)|  |

### Return type

[**Authorization**](Authorization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="appsRevokeInstallationAccessToken"></a>
# **appsRevokeInstallationAccessToken**
> appsRevokeInstallationAccessToken()

Revoke an installation access token

Revokes the installation token you&#39;re using to authenticate as an installation and access this endpoint.  Once an installation token is revoked, the token is invalidated and cannot be used. Other endpoints that require the revoked installation token must have a new installation token to work. You can create a new token using the \&quot;[Create an installation access token for an app](https://docs.github.com/rest/apps/apps#create-an-installation-access-token-for-an-app)\&quot; endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
try {
    apiInstance.appsRevokeInstallationAccessToken()
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsRevokeInstallationAccessToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsRevokeInstallationAccessToken")
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

<a id="appsScopeToken"></a>
# **appsScopeToken**
> Authorization appsScopeToken(clientId, appsScopeTokenRequest)

Create a scoped access token

Use a non-scoped user access token to create a repository-scoped and/or permission-scoped user access token. You can specify which repositories the token can access and which permissions are granted to the token.  Invalid tokens will return &#x60;404 NOT FOUND&#x60;.  You must use [Basic Authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) when accessing this endpoint, using the &#x60;client_id&#x60; and &#x60;client_secret&#x60; of the GitHub App as the username and password.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val clientId : kotlin.String = Iv1.8a61f9b3a7aba766 // kotlin.String | The client ID of the GitHub app.
val appsScopeTokenRequest : AppsScopeTokenRequest = {"access_token":"e72e16c7e42f292c6912e7710c838347ae178b4a","target":"octocat","permissions":{"metadata":"read","issues":"write","contents":"read"}} // AppsScopeTokenRequest | 
try {
    val result : Authorization = apiInstance.appsScopeToken(clientId, appsScopeTokenRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsScopeToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsScopeToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **kotlin.String**| The client ID of the GitHub app. |
 **appsScopeTokenRequest** | [**AppsScopeTokenRequest**](AppsScopeTokenRequest.md)|  |

### Return type

[**Authorization**](Authorization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="appsSuspendInstallation"></a>
# **appsSuspendInstallation**
> appsSuspendInstallation(installationId)

Suspend an app installation

Suspends a GitHub App on a user, organization, or business account, which blocks the app from accessing the account&#39;s resources. When a GitHub App is suspended, the app&#39;s access to the GitHub API or webhook events is blocked for that account.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val installationId : kotlin.Int = 1 // kotlin.Int | The unique identifier of the installation.
try {
    apiInstance.appsSuspendInstallation(installationId)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsSuspendInstallation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsSuspendInstallation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installationId** | **kotlin.Int**| The unique identifier of the installation. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsUnsuspendInstallation"></a>
# **appsUnsuspendInstallation**
> appsUnsuspendInstallation(installationId)

Unsuspend an app installation

Removes a GitHub App installation suspension.  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val installationId : kotlin.Int = 1 // kotlin.Int | The unique identifier of the installation.
try {
    apiInstance.appsUnsuspendInstallation(installationId)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsUnsuspendInstallation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsUnsuspendInstallation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **installationId** | **kotlin.Int**| The unique identifier of the installation. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="appsUpdateWebhookConfigForApp"></a>
# **appsUpdateWebhookConfigForApp**
> WebhookConfig appsUpdateWebhookConfigForApp(appsUpdateWebhookConfigForAppRequest)

Update a webhook configuration for an app

Updates the webhook configuration for a GitHub App. For more information about configuring a webhook for your app, see \&quot;[Creating a GitHub App](/developers/apps/creating-a-github-app).\&quot;  You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppsApi()
val appsUpdateWebhookConfigForAppRequest : AppsUpdateWebhookConfigForAppRequest = {content_type=json, insecure_ssl=0, secret=********, url=https://example.com/webhook} // AppsUpdateWebhookConfigForAppRequest | 
try {
    val result : WebhookConfig = apiInstance.appsUpdateWebhookConfigForApp(appsUpdateWebhookConfigForAppRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppsApi#appsUpdateWebhookConfigForApp")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppsApi#appsUpdateWebhookConfigForApp")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appsUpdateWebhookConfigForAppRequest** | [**AppsUpdateWebhookConfigForAppRequest**](AppsUpdateWebhookConfigForAppRequest.md)|  |

### Return type

[**WebhookConfig**](WebhookConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

