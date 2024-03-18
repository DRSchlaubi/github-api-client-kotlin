# CopilotApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copilotAddCopilotSeatsForTeams**](CopilotApi.md#copilotAddCopilotSeatsForTeams) | **POST** /orgs/{org}/copilot/billing/selected_teams | Add teams to the Copilot subscription for an organization
[**copilotAddCopilotSeatsForUsers**](CopilotApi.md#copilotAddCopilotSeatsForUsers) | **POST** /orgs/{org}/copilot/billing/selected_users | Add users to the Copilot subscription for an organization
[**copilotCancelCopilotSeatAssignmentForTeams**](CopilotApi.md#copilotCancelCopilotSeatAssignmentForTeams) | **DELETE** /orgs/{org}/copilot/billing/selected_teams | Remove teams from the Copilot subscription for an organization
[**copilotCancelCopilotSeatAssignmentForUsers**](CopilotApi.md#copilotCancelCopilotSeatAssignmentForUsers) | **DELETE** /orgs/{org}/copilot/billing/selected_users | Remove users from the Copilot subscription for an organization
[**copilotGetCopilotOrganizationDetails**](CopilotApi.md#copilotGetCopilotOrganizationDetails) | **GET** /orgs/{org}/copilot/billing | Get Copilot seat information and settings for an organization
[**copilotGetCopilotSeatDetailsForUser**](CopilotApi.md#copilotGetCopilotSeatDetailsForUser) | **GET** /orgs/{org}/members/{username}/copilot | Get Copilot seat assignment details for a user
[**copilotListCopilotSeats**](CopilotApi.md#copilotListCopilotSeats) | **GET** /orgs/{org}/copilot/billing/seats | List all Copilot seat assignments for an organization


<a id="copilotAddCopilotSeatsForTeams"></a>
# **copilotAddCopilotSeatsForTeams**
> CopilotAddCopilotSeatsForTeams201Response copilotAddCopilotSeatsForTeams(org, copilotAddCopilotSeatsForTeamsRequest)

Add teams to the Copilot subscription for an organization

**Note**: This endpoint is in beta and is subject to change.  Purchases a GitHub Copilot seat for all users within each specified team. The organization will be billed accordingly. For more information about Copilot pricing, see \&quot;[Pricing for GitHub Copilot](https://docs.github.com/billing/managing-billing-for-github-copilot/about-billing-for-github-copilot#about-billing-for-github-copilot)\&quot;.  Only organization owners can configure GitHub Copilot in their organization.  In order for an admin to use this endpoint, the organization must have a Copilot Business or Enterprise subscription and a configured suggestion matching policy. For more information about setting up a Copilot subscription, see \&quot;[Setting up a Copilot subscription for your organization](https://docs.github.com/billing/managing-billing-for-github-copilot/managing-your-github-copilot-subscription-for-your-organization-or-enterprise)\&quot;. For more information about setting a suggestion matching policy, see \&quot;[Configuring suggestion matching policies for GitHub Copilot in your organization](https://docs.github.com/copilot/managing-copilot/managing-policies-for-github-copilot-in-your-organization#configuring-suggestion-matching-policies-for-github-copilot-in-your-organization)\&quot;.  OAuth app tokens and personal access tokens (classic) need the &#x60;manage_billing:copilot&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CopilotApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val copilotAddCopilotSeatsForTeamsRequest : CopilotAddCopilotSeatsForTeamsRequest = {selected_teams=[engteam1, engteam2, engteam3]} // CopilotAddCopilotSeatsForTeamsRequest | 
try {
    val result : CopilotAddCopilotSeatsForTeams201Response = apiInstance.copilotAddCopilotSeatsForTeams(org, copilotAddCopilotSeatsForTeamsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CopilotApi#copilotAddCopilotSeatsForTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CopilotApi#copilotAddCopilotSeatsForTeams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **copilotAddCopilotSeatsForTeamsRequest** | [**CopilotAddCopilotSeatsForTeamsRequest**](CopilotAddCopilotSeatsForTeamsRequest.md)|  |

### Return type

[**CopilotAddCopilotSeatsForTeams201Response**](CopilotAddCopilotSeatsForTeams201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="copilotAddCopilotSeatsForUsers"></a>
# **copilotAddCopilotSeatsForUsers**
> CopilotAddCopilotSeatsForTeams201Response copilotAddCopilotSeatsForUsers(org, copilotAddCopilotSeatsForUsersRequest)

Add users to the Copilot subscription for an organization

**Note**: This endpoint is in beta and is subject to change.  Purchases a GitHub Copilot seat for each user specified. The organization will be billed accordingly. For more information about Copilot pricing, see \&quot;[Pricing for GitHub Copilot](https://docs.github.com/billing/managing-billing-for-github-copilot/about-billing-for-github-copilot#about-billing-for-github-copilot)\&quot;.  Only organization owners can configure GitHub Copilot in their organization.  In order for an admin to use this endpoint, the organization must have a Copilot Business or Enterprise subscription and a configured suggestion matching policy. For more information about setting up a Copilot subscription, see \&quot;[Setting up a Copilot subscription for your organization](https://docs.github.com/billing/managing-billing-for-github-copilot/managing-your-github-copilot-subscription-for-your-organization-or-enterprise)\&quot;. For more information about setting a suggestion matching policy, see \&quot;[Configuring suggestion matching policies for GitHub Copilot in your organization](https://docs.github.com/copilot/managing-copilot/managing-policies-for-github-copilot-in-your-organization#configuring-suggestion-matching-policies-for-github-copilot-in-your-organization)\&quot;.  OAuth app tokens and personal access tokens (classic) need the &#x60;manage_billing:copilot&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CopilotApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val copilotAddCopilotSeatsForUsersRequest : CopilotAddCopilotSeatsForUsersRequest = {selected_usernames=[cooluser1, hacker2, octocat]} // CopilotAddCopilotSeatsForUsersRequest | 
try {
    val result : CopilotAddCopilotSeatsForTeams201Response = apiInstance.copilotAddCopilotSeatsForUsers(org, copilotAddCopilotSeatsForUsersRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CopilotApi#copilotAddCopilotSeatsForUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CopilotApi#copilotAddCopilotSeatsForUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **copilotAddCopilotSeatsForUsersRequest** | [**CopilotAddCopilotSeatsForUsersRequest**](CopilotAddCopilotSeatsForUsersRequest.md)|  |

### Return type

[**CopilotAddCopilotSeatsForTeams201Response**](CopilotAddCopilotSeatsForTeams201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="copilotCancelCopilotSeatAssignmentForTeams"></a>
# **copilotCancelCopilotSeatAssignmentForTeams**
> CopilotCancelCopilotSeatAssignmentForTeams200Response copilotCancelCopilotSeatAssignmentForTeams(org, copilotCancelCopilotSeatAssignmentForTeamsRequest)

Remove teams from the Copilot subscription for an organization

**Note**: This endpoint is in beta and is subject to change.  Cancels the Copilot seat assignment for all members of each team specified. This will cause the members of the specified team(s) to lose access to GitHub Copilot at the end of the current billing cycle, and the organization will not be billed further for those users.  For more information about Copilot pricing, see \&quot;[Pricing for GitHub Copilot](https://docs.github.com/billing/managing-billing-for-github-copilot/about-billing-for-github-copilot#about-billing-for-github-copilot)\&quot;.  For more information about disabling access to Copilot Business or Enterprise, see \&quot;[Revoking access to GitHub Copilot for specific users in your organization](https://docs.github.com/copilot/managing-copilot/managing-access-for-copilot-in-your-organization#revoking-access-to-github-copilot-for-specific-users-in-your-organization)\&quot;.  Only organization owners can configure GitHub Copilot in their organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;manage_billing:copilot&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CopilotApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val copilotCancelCopilotSeatAssignmentForTeamsRequest : CopilotCancelCopilotSeatAssignmentForTeamsRequest = {"selected_teams":["engteam1","engteam2","engteam3"]} // CopilotCancelCopilotSeatAssignmentForTeamsRequest | 
try {
    val result : CopilotCancelCopilotSeatAssignmentForTeams200Response = apiInstance.copilotCancelCopilotSeatAssignmentForTeams(org, copilotCancelCopilotSeatAssignmentForTeamsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CopilotApi#copilotCancelCopilotSeatAssignmentForTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CopilotApi#copilotCancelCopilotSeatAssignmentForTeams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **copilotCancelCopilotSeatAssignmentForTeamsRequest** | [**CopilotCancelCopilotSeatAssignmentForTeamsRequest**](CopilotCancelCopilotSeatAssignmentForTeamsRequest.md)|  |

### Return type

[**CopilotCancelCopilotSeatAssignmentForTeams200Response**](CopilotCancelCopilotSeatAssignmentForTeams200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="copilotCancelCopilotSeatAssignmentForUsers"></a>
# **copilotCancelCopilotSeatAssignmentForUsers**
> CopilotCancelCopilotSeatAssignmentForTeams200Response copilotCancelCopilotSeatAssignmentForUsers(org, copilotCancelCopilotSeatAssignmentForUsersRequest)

Remove users from the Copilot subscription for an organization

**Note**: This endpoint is in beta and is subject to change.  Cancels the Copilot seat assignment for each user specified. This will cause the specified users to lose access to GitHub Copilot at the end of the current billing cycle, and the organization will not be billed further for those users.  For more information about Copilot pricing, see \&quot;[Pricing for GitHub Copilot](https://docs.github.com/billing/managing-billing-for-github-copilot/about-billing-for-github-copilot#about-billing-for-github-copilot)\&quot;.  For more information about disabling access to Copilot Business or Enterprise, see \&quot;[Revoking access to GitHub Copilot for specific users in your organization](https://docs.github.com/copilot/managing-copilot/managing-access-for-copilot-in-your-organization#revoking-access-to-github-copilot-for-specific-users-in-your-organization)\&quot;.  Only organization owners can configure GitHub Copilot in their organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;manage_billing:copilot&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CopilotApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val copilotCancelCopilotSeatAssignmentForUsersRequest : CopilotCancelCopilotSeatAssignmentForUsersRequest = {"selected_usernames":["cooluser1","hacker2","octocat"]} // CopilotCancelCopilotSeatAssignmentForUsersRequest | 
try {
    val result : CopilotCancelCopilotSeatAssignmentForTeams200Response = apiInstance.copilotCancelCopilotSeatAssignmentForUsers(org, copilotCancelCopilotSeatAssignmentForUsersRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CopilotApi#copilotCancelCopilotSeatAssignmentForUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CopilotApi#copilotCancelCopilotSeatAssignmentForUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **copilotCancelCopilotSeatAssignmentForUsersRequest** | [**CopilotCancelCopilotSeatAssignmentForUsersRequest**](CopilotCancelCopilotSeatAssignmentForUsersRequest.md)|  |

### Return type

[**CopilotCancelCopilotSeatAssignmentForTeams200Response**](CopilotCancelCopilotSeatAssignmentForTeams200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="copilotGetCopilotOrganizationDetails"></a>
# **copilotGetCopilotOrganizationDetails**
> CopilotOrganizationDetails copilotGetCopilotOrganizationDetails(org)

Get Copilot seat information and settings for an organization

**Note**: This endpoint is in beta and is subject to change.  Gets information about an organization&#39;s Copilot subscription, including seat breakdown and code matching policies. To configure these settings, go to your organization&#39;s settings on GitHub.com. For more information, see \&quot;[Managing policies for Copilot in your organization](https://docs.github.com/copilot/managing-copilot/managing-policies-for-copilot-business-in-your-organization)\&quot;.  Only organization owners can configure and view details about the organization&#39;s Copilot Business subscription.  OAuth app tokens and personal access tokens (classic) need the &#x60;manage_billing:copilot&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CopilotApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : CopilotOrganizationDetails = apiInstance.copilotGetCopilotOrganizationDetails(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CopilotApi#copilotGetCopilotOrganizationDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CopilotApi#copilotGetCopilotOrganizationDetails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**CopilotOrganizationDetails**](CopilotOrganizationDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="copilotGetCopilotSeatDetailsForUser"></a>
# **copilotGetCopilotSeatDetailsForUser**
> CopilotSeatDetails copilotGetCopilotSeatDetailsForUser(org, username)

Get Copilot seat assignment details for a user

**Note**: This endpoint is in beta and is subject to change.  Gets the GitHub Copilot seat assignment details for a member of an organization who currently has access to GitHub Copilot.  Organization owners can view GitHub Copilot seat assignment details for members in their organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;manage_billing:copilot&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CopilotApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    val result : CopilotSeatDetails = apiInstance.copilotGetCopilotSeatDetailsForUser(org, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CopilotApi#copilotGetCopilotSeatDetailsForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CopilotApi#copilotGetCopilotSeatDetailsForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

[**CopilotSeatDetails**](CopilotSeatDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="copilotListCopilotSeats"></a>
# **copilotListCopilotSeats**
> CopilotListCopilotSeats200Response copilotListCopilotSeats(org, page, perPage)

List all Copilot seat assignments for an organization

**Note**: This endpoint is in beta and is subject to change.  Lists all Copilot seat assignments for an organization that are currently being billed (either active or pending cancellation at the start of the next billing cycle).  Only organization owners can configure and view details about the organization&#39;s Copilot Business or Enterprise subscription.  OAuth app tokens and personal access tokens (classic) need the &#x60;manage_billing:copilot&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CopilotApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : CopilotListCopilotSeats200Response = apiInstance.copilotListCopilotSeats(org, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CopilotApi#copilotListCopilotSeats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CopilotApi#copilotListCopilotSeats")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 50]

### Return type

[**CopilotListCopilotSeats200Response**](CopilotListCopilotSeats200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

