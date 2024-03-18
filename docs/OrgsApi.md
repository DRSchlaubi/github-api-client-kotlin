# OrgsApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orgsAddSecurityManagerTeam**](OrgsApi.md#orgsAddSecurityManagerTeam) | **PUT** /orgs/{org}/security-managers/teams/{team_slug} | Add a security manager team
[**orgsAssignTeamToOrgRole**](OrgsApi.md#orgsAssignTeamToOrgRole) | **PUT** /orgs/{org}/organization-roles/teams/{team_slug}/{role_id} | Assign an organization role to a team
[**orgsAssignUserToOrgRole**](OrgsApi.md#orgsAssignUserToOrgRole) | **PUT** /orgs/{org}/organization-roles/users/{username}/{role_id} | Assign an organization role to a user
[**orgsBlockUser**](OrgsApi.md#orgsBlockUser) | **PUT** /orgs/{org}/blocks/{username} | Block a user from an organization
[**orgsCancelInvitation**](OrgsApi.md#orgsCancelInvitation) | **DELETE** /orgs/{org}/invitations/{invitation_id} | Cancel an organization invitation
[**orgsCheckBlockedUser**](OrgsApi.md#orgsCheckBlockedUser) | **GET** /orgs/{org}/blocks/{username} | Check if a user is blocked by an organization
[**orgsCheckMembershipForUser**](OrgsApi.md#orgsCheckMembershipForUser) | **GET** /orgs/{org}/members/{username} | Check organization membership for a user
[**orgsCheckPublicMembershipForUser**](OrgsApi.md#orgsCheckPublicMembershipForUser) | **GET** /orgs/{org}/public_members/{username} | Check public organization membership for a user
[**orgsConvertMemberToOutsideCollaborator**](OrgsApi.md#orgsConvertMemberToOutsideCollaborator) | **PUT** /orgs/{org}/outside_collaborators/{username} | Convert an organization member to outside collaborator
[**orgsCreateCustomOrganizationRole**](OrgsApi.md#orgsCreateCustomOrganizationRole) | **POST** /orgs/{org}/organization-roles | Create a custom organization role
[**orgsCreateInvitation**](OrgsApi.md#orgsCreateInvitation) | **POST** /orgs/{org}/invitations | Create an organization invitation
[**orgsCreateOrUpdateCustomProperties**](OrgsApi.md#orgsCreateOrUpdateCustomProperties) | **PATCH** /orgs/{org}/properties/schema | Create or update custom properties for an organization
[**orgsCreateOrUpdateCustomPropertiesValuesForRepos**](OrgsApi.md#orgsCreateOrUpdateCustomPropertiesValuesForRepos) | **PATCH** /orgs/{org}/properties/values | Create or update custom property values for organization repositories
[**orgsCreateOrUpdateCustomProperty**](OrgsApi.md#orgsCreateOrUpdateCustomProperty) | **PUT** /orgs/{org}/properties/schema/{custom_property_name} | Create or update a custom property for an organization
[**orgsCreateWebhook**](OrgsApi.md#orgsCreateWebhook) | **POST** /orgs/{org}/hooks | Create an organization webhook
[**orgsDelete**](OrgsApi.md#orgsDelete) | **DELETE** /orgs/{org} | Delete an organization
[**orgsDeleteCustomOrganizationRole**](OrgsApi.md#orgsDeleteCustomOrganizationRole) | **DELETE** /orgs/{org}/organization-roles/{role_id} | Delete a custom organization role.
[**orgsDeleteWebhook**](OrgsApi.md#orgsDeleteWebhook) | **DELETE** /orgs/{org}/hooks/{hook_id} | Delete an organization webhook
[**orgsEnableOrDisableSecurityProductOnAllOrgRepos**](OrgsApi.md#orgsEnableOrDisableSecurityProductOnAllOrgRepos) | **POST** /orgs/{org}/{security_product}/{enablement} | Enable or disable a security feature for an organization
[**orgsGet**](OrgsApi.md#orgsGet) | **GET** /orgs/{org} | Get an organization
[**orgsGetAllCustomProperties**](OrgsApi.md#orgsGetAllCustomProperties) | **GET** /orgs/{org}/properties/schema | Get all custom properties for an organization
[**orgsGetCustomProperty**](OrgsApi.md#orgsGetCustomProperty) | **GET** /orgs/{org}/properties/schema/{custom_property_name} | Get a custom property for an organization
[**orgsGetMembershipForAuthenticatedUser**](OrgsApi.md#orgsGetMembershipForAuthenticatedUser) | **GET** /user/memberships/orgs/{org} | Get an organization membership for the authenticated user
[**orgsGetMembershipForUser**](OrgsApi.md#orgsGetMembershipForUser) | **GET** /orgs/{org}/memberships/{username} | Get organization membership for a user
[**orgsGetOrgRole**](OrgsApi.md#orgsGetOrgRole) | **GET** /orgs/{org}/organization-roles/{role_id} | Get an organization role
[**orgsGetWebhook**](OrgsApi.md#orgsGetWebhook) | **GET** /orgs/{org}/hooks/{hook_id} | Get an organization webhook
[**orgsGetWebhookConfigForOrg**](OrgsApi.md#orgsGetWebhookConfigForOrg) | **GET** /orgs/{org}/hooks/{hook_id}/config | Get a webhook configuration for an organization
[**orgsGetWebhookDelivery**](OrgsApi.md#orgsGetWebhookDelivery) | **GET** /orgs/{org}/hooks/{hook_id}/deliveries/{delivery_id} | Get a webhook delivery for an organization webhook
[**orgsList**](OrgsApi.md#orgsList) | **GET** /organizations | List organizations
[**orgsListAppInstallations**](OrgsApi.md#orgsListAppInstallations) | **GET** /orgs/{org}/installations | List app installations for an organization
[**orgsListBlockedUsers**](OrgsApi.md#orgsListBlockedUsers) | **GET** /orgs/{org}/blocks | List users blocked by an organization
[**orgsListCustomPropertiesValuesForRepos**](OrgsApi.md#orgsListCustomPropertiesValuesForRepos) | **GET** /orgs/{org}/properties/values | List custom property values for organization repositories
[**orgsListFailedInvitations**](OrgsApi.md#orgsListFailedInvitations) | **GET** /orgs/{org}/failed_invitations | List failed organization invitations
[**orgsListForAuthenticatedUser**](OrgsApi.md#orgsListForAuthenticatedUser) | **GET** /user/orgs | List organizations for the authenticated user
[**orgsListForUser**](OrgsApi.md#orgsListForUser) | **GET** /users/{username}/orgs | List organizations for a user
[**orgsListInvitationTeams**](OrgsApi.md#orgsListInvitationTeams) | **GET** /orgs/{org}/invitations/{invitation_id}/teams | List organization invitation teams
[**orgsListMembers**](OrgsApi.md#orgsListMembers) | **GET** /orgs/{org}/members | List organization members
[**orgsListMembershipsForAuthenticatedUser**](OrgsApi.md#orgsListMembershipsForAuthenticatedUser) | **GET** /user/memberships/orgs | List organization memberships for the authenticated user
[**orgsListOrgRoleTeams**](OrgsApi.md#orgsListOrgRoleTeams) | **GET** /orgs/{org}/organization-roles/{role_id}/teams | List teams that are assigned to an organization role
[**orgsListOrgRoleUsers**](OrgsApi.md#orgsListOrgRoleUsers) | **GET** /orgs/{org}/organization-roles/{role_id}/users | List users that are assigned to an organization role
[**orgsListOrgRoles**](OrgsApi.md#orgsListOrgRoles) | **GET** /orgs/{org}/organization-roles | Get all organization roles for an organization
[**orgsListOrganizationFineGrainedPermissions**](OrgsApi.md#orgsListOrganizationFineGrainedPermissions) | **GET** /orgs/{org}/organization-fine-grained-permissions | List organization fine-grained permissions for an organization
[**orgsListOutsideCollaborators**](OrgsApi.md#orgsListOutsideCollaborators) | **GET** /orgs/{org}/outside_collaborators | List outside collaborators for an organization
[**orgsListPatGrantRepositories**](OrgsApi.md#orgsListPatGrantRepositories) | **GET** /orgs/{org}/personal-access-tokens/{pat_id}/repositories | List repositories a fine-grained personal access token has access to
[**orgsListPatGrantRequestRepositories**](OrgsApi.md#orgsListPatGrantRequestRepositories) | **GET** /orgs/{org}/personal-access-token-requests/{pat_request_id}/repositories | List repositories requested to be accessed by a fine-grained personal access token
[**orgsListPatGrantRequests**](OrgsApi.md#orgsListPatGrantRequests) | **GET** /orgs/{org}/personal-access-token-requests | List requests to access organization resources with fine-grained personal access tokens
[**orgsListPatGrants**](OrgsApi.md#orgsListPatGrants) | **GET** /orgs/{org}/personal-access-tokens | List fine-grained personal access tokens with access to organization resources
[**orgsListPendingInvitations**](OrgsApi.md#orgsListPendingInvitations) | **GET** /orgs/{org}/invitations | List pending organization invitations
[**orgsListPublicMembers**](OrgsApi.md#orgsListPublicMembers) | **GET** /orgs/{org}/public_members | List public organization members
[**orgsListSecurityManagerTeams**](OrgsApi.md#orgsListSecurityManagerTeams) | **GET** /orgs/{org}/security-managers | List security manager teams
[**orgsListWebhookDeliveries**](OrgsApi.md#orgsListWebhookDeliveries) | **GET** /orgs/{org}/hooks/{hook_id}/deliveries | List deliveries for an organization webhook
[**orgsListWebhooks**](OrgsApi.md#orgsListWebhooks) | **GET** /orgs/{org}/hooks | List organization webhooks
[**orgsPatchCustomOrganizationRole**](OrgsApi.md#orgsPatchCustomOrganizationRole) | **PATCH** /orgs/{org}/organization-roles/{role_id} | Update a custom organization role
[**orgsPingWebhook**](OrgsApi.md#orgsPingWebhook) | **POST** /orgs/{org}/hooks/{hook_id}/pings | Ping an organization webhook
[**orgsRedeliverWebhookDelivery**](OrgsApi.md#orgsRedeliverWebhookDelivery) | **POST** /orgs/{org}/hooks/{hook_id}/deliveries/{delivery_id}/attempts | Redeliver a delivery for an organization webhook
[**orgsRemoveCustomProperty**](OrgsApi.md#orgsRemoveCustomProperty) | **DELETE** /orgs/{org}/properties/schema/{custom_property_name} | Remove a custom property for an organization
[**orgsRemoveMember**](OrgsApi.md#orgsRemoveMember) | **DELETE** /orgs/{org}/members/{username} | Remove an organization member
[**orgsRemoveMembershipForUser**](OrgsApi.md#orgsRemoveMembershipForUser) | **DELETE** /orgs/{org}/memberships/{username} | Remove organization membership for a user
[**orgsRemoveOutsideCollaborator**](OrgsApi.md#orgsRemoveOutsideCollaborator) | **DELETE** /orgs/{org}/outside_collaborators/{username} | Remove outside collaborator from an organization
[**orgsRemovePublicMembershipForAuthenticatedUser**](OrgsApi.md#orgsRemovePublicMembershipForAuthenticatedUser) | **DELETE** /orgs/{org}/public_members/{username} | Remove public organization membership for the authenticated user
[**orgsRemoveSecurityManagerTeam**](OrgsApi.md#orgsRemoveSecurityManagerTeam) | **DELETE** /orgs/{org}/security-managers/teams/{team_slug} | Remove a security manager team
[**orgsReviewPatGrantRequest**](OrgsApi.md#orgsReviewPatGrantRequest) | **POST** /orgs/{org}/personal-access-token-requests/{pat_request_id} | Review a request to access organization resources with a fine-grained personal access token
[**orgsReviewPatGrantRequestsInBulk**](OrgsApi.md#orgsReviewPatGrantRequestsInBulk) | **POST** /orgs/{org}/personal-access-token-requests | Review requests to access organization resources with fine-grained personal access tokens
[**orgsRevokeAllOrgRolesTeam**](OrgsApi.md#orgsRevokeAllOrgRolesTeam) | **DELETE** /orgs/{org}/organization-roles/teams/{team_slug} | Remove all organization roles for a team
[**orgsRevokeAllOrgRolesUser**](OrgsApi.md#orgsRevokeAllOrgRolesUser) | **DELETE** /orgs/{org}/organization-roles/users/{username} | Remove all organization roles for a user
[**orgsRevokeOrgRoleTeam**](OrgsApi.md#orgsRevokeOrgRoleTeam) | **DELETE** /orgs/{org}/organization-roles/teams/{team_slug}/{role_id} | Remove an organization role from a team
[**orgsRevokeOrgRoleUser**](OrgsApi.md#orgsRevokeOrgRoleUser) | **DELETE** /orgs/{org}/organization-roles/users/{username}/{role_id} | Remove an organization role from a user
[**orgsSetMembershipForUser**](OrgsApi.md#orgsSetMembershipForUser) | **PUT** /orgs/{org}/memberships/{username} | Set organization membership for a user
[**orgsSetPublicMembershipForAuthenticatedUser**](OrgsApi.md#orgsSetPublicMembershipForAuthenticatedUser) | **PUT** /orgs/{org}/public_members/{username} | Set public organization membership for the authenticated user
[**orgsUnblockUser**](OrgsApi.md#orgsUnblockUser) | **DELETE** /orgs/{org}/blocks/{username} | Unblock a user from an organization
[**orgsUpdate**](OrgsApi.md#orgsUpdate) | **PATCH** /orgs/{org} | Update an organization
[**orgsUpdateMembershipForAuthenticatedUser**](OrgsApi.md#orgsUpdateMembershipForAuthenticatedUser) | **PATCH** /user/memberships/orgs/{org} | Update an organization membership for the authenticated user
[**orgsUpdatePatAccess**](OrgsApi.md#orgsUpdatePatAccess) | **POST** /orgs/{org}/personal-access-tokens/{pat_id} | Update the access a fine-grained personal access token has to organization resources
[**orgsUpdatePatAccesses**](OrgsApi.md#orgsUpdatePatAccesses) | **POST** /orgs/{org}/personal-access-tokens | Update the access to organization resources via fine-grained personal access tokens
[**orgsUpdateWebhook**](OrgsApi.md#orgsUpdateWebhook) | **PATCH** /orgs/{org}/hooks/{hook_id} | Update an organization webhook
[**orgsUpdateWebhookConfigForOrg**](OrgsApi.md#orgsUpdateWebhookConfigForOrg) | **PATCH** /orgs/{org}/hooks/{hook_id}/config | Update a webhook configuration for an organization


<a id="orgsAddSecurityManagerTeam"></a>
# **orgsAddSecurityManagerTeam**
> orgsAddSecurityManagerTeam(org, teamSlug)

Add a security manager team

Adds a team as a security manager for an organization. For more information, see \&quot;[Managing security for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization) for an organization.\&quot;  The authenticated user must be an administrator for the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
try {
    apiInstance.orgsAddSecurityManagerTeam(org, teamSlug)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsAddSecurityManagerTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsAddSecurityManagerTeam")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="orgsAssignTeamToOrgRole"></a>
# **orgsAssignTeamToOrgRole**
> orgsAssignTeamToOrgRole(org, teamSlug, roleId)

Assign an organization role to a team

Assigns an organization role to a team in an organization. For more information on organization roles, see \&quot;[Managing people&#39;s access to your organization with roles](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/about-custom-organization-roles).\&quot;  The authenticated user must be an administrator for the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val roleId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the role.
try {
    apiInstance.orgsAssignTeamToOrgRole(org, teamSlug, roleId)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsAssignTeamToOrgRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsAssignTeamToOrgRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **roleId** | **kotlin.Int**| The unique identifier of the role. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="orgsAssignUserToOrgRole"></a>
# **orgsAssignUserToOrgRole**
> orgsAssignUserToOrgRole(org, username, roleId)

Assign an organization role to a user

Assigns an organization role to a member of an organization. For more information on organization roles, see \&quot;[Managing people&#39;s access to your organization with roles](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/about-custom-organization-roles).\&quot;  The authenticated user must be an administrator for the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val roleId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the role.
try {
    apiInstance.orgsAssignUserToOrgRole(org, username, roleId)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsAssignUserToOrgRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsAssignUserToOrgRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **roleId** | **kotlin.Int**| The unique identifier of the role. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="orgsBlockUser"></a>
# **orgsBlockUser**
> orgsBlockUser(org, username)

Block a user from an organization

Blocks the given user on behalf of the specified organization and returns a 204. If the organization cannot block the given user a 422 is returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.orgsBlockUser(org, username)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsBlockUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsBlockUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsCancelInvitation"></a>
# **orgsCancelInvitation**
> orgsCancelInvitation(org, invitationId)

Cancel an organization invitation

Cancel an organization invitation. In order to cancel an organization invitation, the authenticated user must be an organization owner.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val invitationId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the invitation.
try {
    apiInstance.orgsCancelInvitation(org, invitationId)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsCancelInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsCancelInvitation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **invitationId** | **kotlin.Int**| The unique identifier of the invitation. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsCheckBlockedUser"></a>
# **orgsCheckBlockedUser**
> orgsCheckBlockedUser(org, username)

Check if a user is blocked by an organization

Returns a 204 if the given user is blocked by the given organization. Returns a 404 if the organization is not blocking the user, or if the user account has been identified as spam by GitHub.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.orgsCheckBlockedUser(org, username)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsCheckBlockedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsCheckBlockedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsCheckMembershipForUser"></a>
# **orgsCheckMembershipForUser**
> orgsCheckMembershipForUser(org, username)

Check organization membership for a user

Check if a user is, publicly or privately, a member of the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.orgsCheckMembershipForUser(org, username)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsCheckMembershipForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsCheckMembershipForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="orgsCheckPublicMembershipForUser"></a>
# **orgsCheckPublicMembershipForUser**
> orgsCheckPublicMembershipForUser(org, username)

Check public organization membership for a user

Check if the provided user is a public member of the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.orgsCheckPublicMembershipForUser(org, username)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsCheckPublicMembershipForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsCheckPublicMembershipForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="orgsConvertMemberToOutsideCollaborator"></a>
# **orgsConvertMemberToOutsideCollaborator**
> kotlin.Any orgsConvertMemberToOutsideCollaborator(org, username, orgsConvertMemberToOutsideCollaboratorRequest)

Convert an organization member to outside collaborator

When an organization member is converted to an outside collaborator, they&#39;ll only have access to the repositories that their current team membership allows. The user will no longer be a member of the organization. For more information, see \&quot;[Converting an organization member to an outside collaborator](https://docs.github.com/articles/converting-an-organization-member-to-an-outside-collaborator/)\&quot;. Converting an organization member to an outside collaborator may be restricted by enterprise administrators. For more information, see \&quot;[Enforcing repository management policies in your enterprise](https://docs.github.com/admin/policies/enforcing-policies-for-your-enterprise/enforcing-repository-management-policies-in-your-enterprise#enforcing-a-policy-for-inviting-outside-collaborators-to-repositories).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val orgsConvertMemberToOutsideCollaboratorRequest : OrgsConvertMemberToOutsideCollaboratorRequest = {"async":true} // OrgsConvertMemberToOutsideCollaboratorRequest | 
try {
    val result : kotlin.Any = apiInstance.orgsConvertMemberToOutsideCollaborator(org, username, orgsConvertMemberToOutsideCollaboratorRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsConvertMemberToOutsideCollaborator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsConvertMemberToOutsideCollaborator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **orgsConvertMemberToOutsideCollaboratorRequest** | [**OrgsConvertMemberToOutsideCollaboratorRequest**](OrgsConvertMemberToOutsideCollaboratorRequest.md)|  | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="orgsCreateCustomOrganizationRole"></a>
# **orgsCreateCustomOrganizationRole**
> OrganizationRole orgsCreateCustomOrganizationRole(org, orgsCreateCustomOrganizationRoleRequest)

Create a custom organization role

Creates a custom organization role that can be assigned to users and teams, granting them specific permissions over the organization. For more information on custom organization roles, see \&quot;[Managing people&#39;s access to your organization with roles](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/about-custom-organization-roles).\&quot;  To use this endpoint, the authenticated user must be one of:  - An administrator for the organization. - A user, or a user on a team, with the fine-grained permissions of &#x60;write_organization_custom_org_role&#x60; in the organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val orgsCreateCustomOrganizationRoleRequest : OrgsCreateCustomOrganizationRoleRequest = {"name":"Custom Role Manager","description":"Permissions to manage custom roles within an org","permissions":["write_organization_custom_repo_role","write_organization_custom_org_role","read_organization_custom_repo_role","read_organization_custom_org_role"]} // OrgsCreateCustomOrganizationRoleRequest | 
try {
    val result : OrganizationRole = apiInstance.orgsCreateCustomOrganizationRole(org, orgsCreateCustomOrganizationRoleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsCreateCustomOrganizationRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsCreateCustomOrganizationRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **orgsCreateCustomOrganizationRoleRequest** | [**OrgsCreateCustomOrganizationRoleRequest**](OrgsCreateCustomOrganizationRoleRequest.md)|  |

### Return type

[**OrganizationRole**](OrganizationRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="orgsCreateInvitation"></a>
# **orgsCreateInvitation**
> OrganizationInvitation orgsCreateInvitation(org, orgsCreateInvitationRequest)

Create an organization invitation

Invite people to an organization by using their GitHub user ID or their email address. In order to create invitations in an organization, the authenticated user must be an organization owner.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information, see \&quot;[Rate limits for the API](https://docs.github.com/rest/overview/rate-limits-for-the-rest-api#about-secondary-rate-limits)\&quot; and \&quot;[Best practices for using the REST API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val orgsCreateInvitationRequest : OrgsCreateInvitationRequest = {"email":"octocat@github.com","role":"direct_member","team_ids":[12,26]} // OrgsCreateInvitationRequest | 
try {
    val result : OrganizationInvitation = apiInstance.orgsCreateInvitation(org, orgsCreateInvitationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsCreateInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsCreateInvitation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **orgsCreateInvitationRequest** | [**OrgsCreateInvitationRequest**](OrgsCreateInvitationRequest.md)|  | [optional]

### Return type

[**OrganizationInvitation**](OrganizationInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="orgsCreateOrUpdateCustomProperties"></a>
# **orgsCreateOrUpdateCustomProperties**
> kotlin.collections.List&lt;OrgCustomProperty&gt; orgsCreateOrUpdateCustomProperties(org, orgsCreateOrUpdateCustomPropertiesRequest)

Create or update custom properties for an organization

Creates new or updates existing custom properties defined for an organization in a batch.  To use this endpoint, the authenticated user must be one of:   - An administrator for the organization.   - A user, or a user on a team, with the fine-grained permission of &#x60;custom_properties_org_definitions_manager&#x60; in the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val orgsCreateOrUpdateCustomPropertiesRequest : OrgsCreateOrUpdateCustomPropertiesRequest = {"properties":[{"property_name":"environment","value_type":"single_select","required":true,"default_value":"production","description":"Prod or dev environment","allowed_values":["production","development"],"values_editable_by":"org_actors"},{"property_name":"service","value_type":"string"},{"property_name":"team","value_type":"string","description":"Team owning the repository"}]} // OrgsCreateOrUpdateCustomPropertiesRequest | 
try {
    val result : kotlin.collections.List<OrgCustomProperty> = apiInstance.orgsCreateOrUpdateCustomProperties(org, orgsCreateOrUpdateCustomPropertiesRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsCreateOrUpdateCustomProperties")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsCreateOrUpdateCustomProperties")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **orgsCreateOrUpdateCustomPropertiesRequest** | [**OrgsCreateOrUpdateCustomPropertiesRequest**](OrgsCreateOrUpdateCustomPropertiesRequest.md)|  |

### Return type

[**kotlin.collections.List&lt;OrgCustomProperty&gt;**](OrgCustomProperty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="orgsCreateOrUpdateCustomPropertiesValuesForRepos"></a>
# **orgsCreateOrUpdateCustomPropertiesValuesForRepos**
> orgsCreateOrUpdateCustomPropertiesValuesForRepos(org, orgsCreateOrUpdateCustomPropertiesValuesForReposRequest)

Create or update custom property values for organization repositories

Create new or update existing custom property values for repositories in a batch that belong to an organization. Each target repository will have its custom property values updated to match the values provided in the request.  A maximum of 30 repositories can be updated in a single request.  Using a value of &#x60;null&#x60; for a custom property will remove or &#39;unset&#39; the property value from the repository.  To use this endpoint, the authenticated user must be one of:   - An administrator for the organization.   - A user, or a user on a team, with the fine-grained permission of &#x60;custom_properties_org_values_editor&#x60; in the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val orgsCreateOrUpdateCustomPropertiesValuesForReposRequest : OrgsCreateOrUpdateCustomPropertiesValuesForReposRequest =  // OrgsCreateOrUpdateCustomPropertiesValuesForReposRequest | 
try {
    apiInstance.orgsCreateOrUpdateCustomPropertiesValuesForRepos(org, orgsCreateOrUpdateCustomPropertiesValuesForReposRequest)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsCreateOrUpdateCustomPropertiesValuesForRepos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsCreateOrUpdateCustomPropertiesValuesForRepos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **orgsCreateOrUpdateCustomPropertiesValuesForReposRequest** | [**OrgsCreateOrUpdateCustomPropertiesValuesForReposRequest**](OrgsCreateOrUpdateCustomPropertiesValuesForReposRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="orgsCreateOrUpdateCustomProperty"></a>
# **orgsCreateOrUpdateCustomProperty**
> OrgCustomProperty orgsCreateOrUpdateCustomProperty(org, customPropertyName, orgsCreateOrUpdateCustomPropertyRequest)

Create or update a custom property for an organization

Creates a new or updates an existing custom property that is defined for an organization.  To use this endpoint, the authenticated user must be one of: - An administrator for the organization. - A user, or a user on a team, with the fine-grained permission of &#x60;custom_properties_org_definitions_manager&#x60; in the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val customPropertyName : kotlin.String = customPropertyName_example // kotlin.String | The custom property name. The name is case sensitive.
val orgsCreateOrUpdateCustomPropertyRequest : OrgsCreateOrUpdateCustomPropertyRequest = {"value_type":"single_select","required":true,"default_value":"production","description":"Prod or dev environment","allowed_values":["production","development"]} // OrgsCreateOrUpdateCustomPropertyRequest | 
try {
    val result : OrgCustomProperty = apiInstance.orgsCreateOrUpdateCustomProperty(org, customPropertyName, orgsCreateOrUpdateCustomPropertyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsCreateOrUpdateCustomProperty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsCreateOrUpdateCustomProperty")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **customPropertyName** | **kotlin.String**| The custom property name. The name is case sensitive. |
 **orgsCreateOrUpdateCustomPropertyRequest** | [**OrgsCreateOrUpdateCustomPropertyRequest**](OrgsCreateOrUpdateCustomPropertyRequest.md)|  |

### Return type

[**OrgCustomProperty**](OrgCustomProperty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="orgsCreateWebhook"></a>
# **orgsCreateWebhook**
> OrgHook orgsCreateWebhook(org, orgsCreateWebhookRequest)

Create an organization webhook

Here&#39;s how you can create a hook that posts payloads in JSON format:

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val orgsCreateWebhookRequest : OrgsCreateWebhookRequest = {"name":"web","active":true,"events":["push","pull_request"],"config":{"url":"http://example.com/webhook","content_type":"json"}} // OrgsCreateWebhookRequest | 
try {
    val result : OrgHook = apiInstance.orgsCreateWebhook(org, orgsCreateWebhookRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsCreateWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsCreateWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **orgsCreateWebhookRequest** | [**OrgsCreateWebhookRequest**](OrgsCreateWebhookRequest.md)|  |

### Return type

[**OrgHook**](OrgHook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="orgsDelete"></a>
# **orgsDelete**
> kotlin.Any orgsDelete(org)

Delete an organization

Deletes an organization and all its repositories.  The organization login will be unavailable for 90 days after deletion.  Please review the Terms of Service regarding account deletion before using this endpoint:  https://docs.github.com/site-policy/github-terms/github-terms-of-service

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : kotlin.Any = apiInstance.orgsDelete(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsDeleteCustomOrganizationRole"></a>
# **orgsDeleteCustomOrganizationRole**
> orgsDeleteCustomOrganizationRole(org, roleId)

Delete a custom organization role.

Deletes a custom organization role. For more information on custom organization roles, see \&quot;[Managing people&#39;s access to your organization with roles](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/about-custom-organization-roles).\&quot;  To use this endpoint, the authenticated user must be one of:  - An administrator for the organization. - A user, or a user on a team, with the fine-grained permissions of &#x60;write_organization_custom_org_role&#x60; in the organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val roleId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the role.
try {
    apiInstance.orgsDeleteCustomOrganizationRole(org, roleId)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsDeleteCustomOrganizationRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsDeleteCustomOrganizationRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **roleId** | **kotlin.Int**| The unique identifier of the role. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="orgsDeleteWebhook"></a>
# **orgsDeleteWebhook**
> orgsDeleteWebhook(org, hookId)

Delete an organization webhook



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
try {
    apiInstance.orgsDeleteWebhook(org, hookId)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsDeleteWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsDeleteWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsEnableOrDisableSecurityProductOnAllOrgRepos"></a>
# **orgsEnableOrDisableSecurityProductOnAllOrgRepos**
> orgsEnableOrDisableSecurityProductOnAllOrgRepos(org, securityProduct, enablement, orgsEnableOrDisableSecurityProductOnAllOrgReposRequest)

Enable or disable a security feature for an organization

Enables or disables the specified security feature for all eligible repositories in an organization. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  The authenticated user must be an organization owner or be member of a team with the security manager role to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val securityProduct : kotlin.String = securityProduct_example // kotlin.String | The security feature to enable or disable.
val enablement : kotlin.String = enablement_example // kotlin.String | The action to take.  `enable_all` means to enable the specified security feature for all repositories in the organization. `disable_all` means to disable the specified security feature for all repositories in the organization.
val orgsEnableOrDisableSecurityProductOnAllOrgReposRequest : OrgsEnableOrDisableSecurityProductOnAllOrgReposRequest =  // OrgsEnableOrDisableSecurityProductOnAllOrgReposRequest | 
try {
    apiInstance.orgsEnableOrDisableSecurityProductOnAllOrgRepos(org, securityProduct, enablement, orgsEnableOrDisableSecurityProductOnAllOrgReposRequest)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsEnableOrDisableSecurityProductOnAllOrgRepos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsEnableOrDisableSecurityProductOnAllOrgRepos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **securityProduct** | **kotlin.String**| The security feature to enable or disable. | [enum: dependency_graph, dependabot_alerts, dependabot_security_updates, advanced_security, code_scanning_default_setup, secret_scanning, secret_scanning_push_protection]
 **enablement** | **kotlin.String**| The action to take.  &#x60;enable_all&#x60; means to enable the specified security feature for all repositories in the organization. &#x60;disable_all&#x60; means to disable the specified security feature for all repositories in the organization. | [enum: enable_all, disable_all]
 **orgsEnableOrDisableSecurityProductOnAllOrgReposRequest** | [**OrgsEnableOrDisableSecurityProductOnAllOrgReposRequest**](OrgsEnableOrDisableSecurityProductOnAllOrgReposRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="orgsGet"></a>
# **orgsGet**
> OrganizationFull orgsGet(org)

Get an organization

Gets information about an organization.  When the value of &#x60;two_factor_requirement_enabled&#x60; is &#x60;true&#x60;, the organization requires all members, billing managers, and outside collaborators to enable [two-factor authentication](https://docs.github.com/articles/securing-your-account-with-two-factor-authentication-2fa/).  To see the full details about an organization, the authenticated user must be an organization owner.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to see the full details about an organization.  To see information about an organization&#39;s GitHub plan, GitHub Apps need the &#x60;Organization plan&#x60; permission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : OrganizationFull = apiInstance.orgsGet(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**OrganizationFull**](OrganizationFull.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsGetAllCustomProperties"></a>
# **orgsGetAllCustomProperties**
> kotlin.collections.List&lt;OrgCustomProperty&gt; orgsGetAllCustomProperties(org)

Get all custom properties for an organization

Gets all custom properties defined for an organization. Organization members can read these properties.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : kotlin.collections.List<OrgCustomProperty> = apiInstance.orgsGetAllCustomProperties(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsGetAllCustomProperties")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsGetAllCustomProperties")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**kotlin.collections.List&lt;OrgCustomProperty&gt;**](OrgCustomProperty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsGetCustomProperty"></a>
# **orgsGetCustomProperty**
> OrgCustomProperty orgsGetCustomProperty(org, customPropertyName)

Get a custom property for an organization

Gets a custom property that is defined for an organization. Organization members can read these properties.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val customPropertyName : kotlin.String = customPropertyName_example // kotlin.String | The custom property name. The name is case sensitive.
try {
    val result : OrgCustomProperty = apiInstance.orgsGetCustomProperty(org, customPropertyName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsGetCustomProperty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsGetCustomProperty")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **customPropertyName** | **kotlin.String**| The custom property name. The name is case sensitive. |

### Return type

[**OrgCustomProperty**](OrgCustomProperty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsGetMembershipForAuthenticatedUser"></a>
# **orgsGetMembershipForAuthenticatedUser**
> OrgMembership orgsGetMembershipForAuthenticatedUser(org)

Get an organization membership for the authenticated user

If the authenticated user is an active or pending member of the organization, this endpoint will return the user&#39;s membership. If the authenticated user is not affiliated with the organization, a &#x60;404&#x60; is returned. This endpoint will return a &#x60;403&#x60; if the request is made by a GitHub App that is blocked by the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : OrgMembership = apiInstance.orgsGetMembershipForAuthenticatedUser(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsGetMembershipForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsGetMembershipForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**OrgMembership**](OrgMembership.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsGetMembershipForUser"></a>
# **orgsGetMembershipForUser**
> OrgMembership orgsGetMembershipForUser(org, username)

Get organization membership for a user

In order to get a user&#39;s membership with an organization, the authenticated user must be an organization member. The &#x60;state&#x60; parameter in the response can be used to identify the user&#39;s membership status.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    val result : OrgMembership = apiInstance.orgsGetMembershipForUser(org, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsGetMembershipForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsGetMembershipForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

[**OrgMembership**](OrgMembership.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsGetOrgRole"></a>
# **orgsGetOrgRole**
> OrganizationRole orgsGetOrgRole(org, roleId)

Get an organization role

Gets an organization role that is available to this organization. For more information on organization roles, see \&quot;[Managing people&#39;s access to your organization with roles](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/about-custom-organization-roles).\&quot;  To use this endpoint, the authenticated user must be one of:  - An administrator for the organization. - A user, or a user on a team, with the fine-grained permissions of &#x60;read_organization_custom_org_role&#x60; in the organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val roleId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the role.
try {
    val result : OrganizationRole = apiInstance.orgsGetOrgRole(org, roleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsGetOrgRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsGetOrgRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **roleId** | **kotlin.Int**| The unique identifier of the role. |

### Return type

[**OrganizationRole**](OrganizationRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsGetWebhook"></a>
# **orgsGetWebhook**
> OrgHook orgsGetWebhook(org, hookId)

Get an organization webhook

Returns a webhook configured in an organization. To get only the webhook &#x60;config&#x60; properties, see \&quot;[Get a webhook configuration for an organization](/rest/orgs/webhooks#get-a-webhook-configuration-for-an-organization).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
try {
    val result : OrgHook = apiInstance.orgsGetWebhook(org, hookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsGetWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsGetWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |

### Return type

[**OrgHook**](OrgHook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsGetWebhookConfigForOrg"></a>
# **orgsGetWebhookConfigForOrg**
> WebhookConfig orgsGetWebhookConfigForOrg(org, hookId)

Get a webhook configuration for an organization

Returns the webhook configuration for an organization. To get more information about the webhook, including the &#x60;active&#x60; state and &#x60;events&#x60;, use \&quot;[Get an organization webhook ](/rest/orgs/webhooks#get-an-organization-webhook).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org_hook&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
try {
    val result : WebhookConfig = apiInstance.orgsGetWebhookConfigForOrg(org, hookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsGetWebhookConfigForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsGetWebhookConfigForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |

### Return type

[**WebhookConfig**](WebhookConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsGetWebhookDelivery"></a>
# **orgsGetWebhookDelivery**
> HookDelivery orgsGetWebhookDelivery(org, hookId, deliveryId)

Get a webhook delivery for an organization webhook

Returns a delivery for a webhook configured in an organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
val deliveryId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : HookDelivery = apiInstance.orgsGetWebhookDelivery(org, hookId, deliveryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsGetWebhookDelivery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsGetWebhookDelivery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |
 **deliveryId** | **kotlin.Int**|  |

### Return type

[**HookDelivery**](HookDelivery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="orgsList"></a>
# **orgsList**
> kotlin.collections.List&lt;OrganizationSimple&gt; orgsList(since, perPage)

List organizations

Lists all organizations, in the order that they were created.  **Note:** Pagination is powered exclusively by the &#x60;since&#x60; parameter. Use the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers) to get the URL for the next page of organizations.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val since : kotlin.Int = 56 // kotlin.Int | An organization ID. Only return organizations with an ID greater than this ID.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<OrganizationSimple> = apiInstance.orgsList(since, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **kotlin.Int**| An organization ID. Only return organizations with an ID greater than this ID. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;OrganizationSimple&gt;**](OrganizationSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListAppInstallations"></a>
# **orgsListAppInstallations**
> OrgsListAppInstallations200Response orgsListAppInstallations(org, perPage, page)

List app installations for an organization

Lists all GitHub Apps in an organization. The installation count includes all GitHub Apps installed on repositories in the organization.  The authenticated user must be an organization owner to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:read&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : OrgsListAppInstallations200Response = apiInstance.orgsListAppInstallations(org, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListAppInstallations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListAppInstallations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**OrgsListAppInstallations200Response**](OrgsListAppInstallations200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListBlockedUsers"></a>
# **orgsListBlockedUsers**
> kotlin.collections.List&lt;SimpleUser&gt; orgsListBlockedUsers(org, perPage, page)

List users blocked by an organization

List the users blocked by an organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.orgsListBlockedUsers(org, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListBlockedUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListBlockedUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListCustomPropertiesValuesForRepos"></a>
# **orgsListCustomPropertiesValuesForRepos**
> kotlin.collections.List&lt;OrgRepoCustomPropertyValues&gt; orgsListCustomPropertiesValuesForRepos(org, perPage, page, repositoryQuery)

List custom property values for organization repositories

Lists organization repositories with all of their custom property values. Organization members can read these properties.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val repositoryQuery : kotlin.String = repositoryQuery_example // kotlin.String | Finds repositories in the organization with a query containing one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn more about the format of the query, see [Constructing a search query](https://docs.github.com/rest/search/search#constructing-a-search-query). See \"[Searching for repositories](https://docs.github.com/articles/searching-for-repositories/)\" for a detailed list of qualifiers.
try {
    val result : kotlin.collections.List<OrgRepoCustomPropertyValues> = apiInstance.orgsListCustomPropertiesValuesForRepos(org, perPage, page, repositoryQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListCustomPropertiesValuesForRepos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListCustomPropertiesValuesForRepos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **repositoryQuery** | **kotlin.String**| Finds repositories in the organization with a query containing one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn more about the format of the query, see [Constructing a search query](https://docs.github.com/rest/search/search#constructing-a-search-query). See \&quot;[Searching for repositories](https://docs.github.com/articles/searching-for-repositories/)\&quot; for a detailed list of qualifiers. | [optional] [default to &quot;push&quot;]

### Return type

[**kotlin.collections.List&lt;OrgRepoCustomPropertyValues&gt;**](OrgRepoCustomPropertyValues.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListFailedInvitations"></a>
# **orgsListFailedInvitations**
> kotlin.collections.List&lt;OrganizationInvitation&gt; orgsListFailedInvitations(org, perPage, page)

List failed organization invitations

The return hash contains &#x60;failed_at&#x60; and &#x60;failed_reason&#x60; fields which represent the time at which the invitation failed and the reason for the failure.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<OrganizationInvitation> = apiInstance.orgsListFailedInvitations(org, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListFailedInvitations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListFailedInvitations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;OrganizationInvitation&gt;**](OrganizationInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListForAuthenticatedUser"></a>
# **orgsListForAuthenticatedUser**
> kotlin.collections.List&lt;OrganizationSimple&gt; orgsListForAuthenticatedUser(perPage, page)

List organizations for the authenticated user

List organizations for the authenticated user.  For OAuth app tokens and personal access tokens (classic), this endpoint only lists organizations that your authorization allows you to operate on in some way (e.g., you can list teams with &#x60;read:org&#x60; scope, you can publicize your organization membership with &#x60;user&#x60; scope, etc.). Therefore, this API requires at least &#x60;user&#x60; or &#x60;read:org&#x60; scope for OAuth app tokens and personal access tokens (classic). Requests with insufficient scope will receive a &#x60;403 Forbidden&#x60; response.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<OrganizationSimple> = apiInstance.orgsListForAuthenticatedUser(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;OrganizationSimple&gt;**](OrganizationSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListForUser"></a>
# **orgsListForUser**
> kotlin.collections.List&lt;OrganizationSimple&gt; orgsListForUser(username, perPage, page)

List organizations for a user

List [public organization memberships](https://docs.github.com/articles/publicizing-or-concealing-organization-membership) for the specified user.  This method only lists _public_ memberships, regardless of authentication. If you need to fetch all of the organization memberships (public and private) for the authenticated user, use the [List organizations for the authenticated user](https://docs.github.com/rest/orgs/orgs#list-organizations-for-the-authenticated-user) API instead.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<OrganizationSimple> = apiInstance.orgsListForUser(username, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;OrganizationSimple&gt;**](OrganizationSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListInvitationTeams"></a>
# **orgsListInvitationTeams**
> kotlin.collections.List&lt;Team&gt; orgsListInvitationTeams(org, invitationId, perPage, page)

List organization invitation teams

List all teams associated with an invitation. In order to see invitations in an organization, the authenticated user must be an organization owner.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val invitationId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the invitation.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Team> = apiInstance.orgsListInvitationTeams(org, invitationId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListInvitationTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListInvitationTeams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **invitationId** | **kotlin.Int**| The unique identifier of the invitation. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListMembers"></a>
# **orgsListMembers**
> kotlin.collections.List&lt;SimpleUser&gt; orgsListMembers(org, filter, role, perPage, page)

List organization members

List all users who are members of an organization. If the authenticated user is also a member of this organization then both concealed and public members will be returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val filter : kotlin.String = filter_example // kotlin.String | Filter members returned in the list. `2fa_disabled` means that only members without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled will be returned. This options is only available for organization owners.
val role : kotlin.String = role_example // kotlin.String | Filter members returned by their role.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.orgsListMembers(org, filter, role, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListMembers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **filter** | **kotlin.String**| Filter members returned in the list. &#x60;2fa_disabled&#x60; means that only members without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled will be returned. This options is only available for organization owners. | [optional] [default to all] [enum: 2fa_disabled, all]
 **role** | **kotlin.String**| Filter members returned by their role. | [optional] [default to all] [enum: all, admin, member]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListMembershipsForAuthenticatedUser"></a>
# **orgsListMembershipsForAuthenticatedUser**
> kotlin.collections.List&lt;OrgMembership&gt; orgsListMembershipsForAuthenticatedUser(state, perPage, page)

List organization memberships for the authenticated user

Lists all of the authenticated user&#39;s organization memberships.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val state : kotlin.String = state_example // kotlin.String | Indicates the state of the memberships to return. If not specified, the API returns both active and pending memberships.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<OrgMembership> = apiInstance.orgsListMembershipsForAuthenticatedUser(state, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListMembershipsForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListMembershipsForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **kotlin.String**| Indicates the state of the memberships to return. If not specified, the API returns both active and pending memberships. | [optional] [enum: active, pending]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;OrgMembership&gt;**](OrgMembership.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListOrgRoleTeams"></a>
# **orgsListOrgRoleTeams**
> kotlin.collections.List&lt;Team&gt; orgsListOrgRoleTeams(org, roleId, perPage, page)

List teams that are assigned to an organization role

Lists the teams that are assigned to an organization role. For more information on organization roles, see \&quot;[Managing people&#39;s access to your organization with roles](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/about-custom-organization-roles).\&quot;  To use this endpoint, you must be an administrator for the organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val roleId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the role.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Team> = apiInstance.orgsListOrgRoleTeams(org, roleId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListOrgRoleTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListOrgRoleTeams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **roleId** | **kotlin.Int**| The unique identifier of the role. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListOrgRoleUsers"></a>
# **orgsListOrgRoleUsers**
> kotlin.collections.List&lt;SimpleUser&gt; orgsListOrgRoleUsers(org, roleId, perPage, page)

List users that are assigned to an organization role

Lists organization members that are assigned to an organization role. For more information on organization roles, see \&quot;[Managing people&#39;s access to your organization with roles](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/about-custom-organization-roles).\&quot;  To use this endpoint, you must be an administrator for the organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val roleId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the role.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.orgsListOrgRoleUsers(org, roleId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListOrgRoleUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListOrgRoleUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **roleId** | **kotlin.Int**| The unique identifier of the role. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListOrgRoles"></a>
# **orgsListOrgRoles**
> OrgsListOrgRoles200Response orgsListOrgRoles(org)

Get all organization roles for an organization

Lists the organization roles available in this organization. For more information on organization roles, see \&quot;[Managing people&#39;s access to your organization with roles](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/about-custom-organization-roles).\&quot;  To use this endpoint, the authenticated user must be one of:  - An administrator for the organization. - A user, or a user on a team, with the fine-grained permissions of &#x60;read_organization_custom_org_role&#x60; in the organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : OrgsListOrgRoles200Response = apiInstance.orgsListOrgRoles(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListOrgRoles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListOrgRoles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**OrgsListOrgRoles200Response**](OrgsListOrgRoles200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListOrganizationFineGrainedPermissions"></a>
# **orgsListOrganizationFineGrainedPermissions**
> kotlin.collections.List&lt;OrganizationFineGrainedPermission&gt; orgsListOrganizationFineGrainedPermissions(org)

List organization fine-grained permissions for an organization

Lists the fine-grained permissions that can be used in custom organization roles for an organization. For more information, see \&quot;[Managing people&#39;s access to your organization with roles](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/about-custom-organization-roles).\&quot;  To list the fine-grained permissions that can be used in custom repository roles for an organization, see \&quot;[List repository fine-grained permissions for an organization](https://docs.github.com/rest/orgs/organization-roles#list-repository-fine-grained-permissions-for-an-organization).\&quot;  To use this endpoint, the authenticated user must be one of:  - An administrator for the organization. - A user, or a user on a team, with the fine-grained permissions of &#x60;read_organization_custom_org_role&#x60; in the organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : kotlin.collections.List<OrganizationFineGrainedPermission> = apiInstance.orgsListOrganizationFineGrainedPermissions(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListOrganizationFineGrainedPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListOrganizationFineGrainedPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**kotlin.collections.List&lt;OrganizationFineGrainedPermission&gt;**](OrganizationFineGrainedPermission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListOutsideCollaborators"></a>
# **orgsListOutsideCollaborators**
> kotlin.collections.List&lt;SimpleUser&gt; orgsListOutsideCollaborators(org, filter, perPage, page)

List outside collaborators for an organization

List all users who are outside collaborators of an organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val filter : kotlin.String = filter_example // kotlin.String | Filter the list of outside collaborators. `2fa_disabled` means that only outside collaborators without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled will be returned.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.orgsListOutsideCollaborators(org, filter, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListOutsideCollaborators")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListOutsideCollaborators")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **filter** | **kotlin.String**| Filter the list of outside collaborators. &#x60;2fa_disabled&#x60; means that only outside collaborators without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled will be returned. | [optional] [default to all] [enum: 2fa_disabled, all]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListPatGrantRepositories"></a>
# **orgsListPatGrantRepositories**
> kotlin.collections.List&lt;MinimalRepository&gt; orgsListPatGrantRepositories(org, patId, perPage, page)

List repositories a fine-grained personal access token has access to

Lists the repositories a fine-grained personal access token has access to.  Only GitHub Apps can use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val patId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the fine-grained personal access token.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<MinimalRepository> = apiInstance.orgsListPatGrantRepositories(org, patId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListPatGrantRepositories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListPatGrantRepositories")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **patId** | **kotlin.Int**| Unique identifier of the fine-grained personal access token. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListPatGrantRequestRepositories"></a>
# **orgsListPatGrantRequestRepositories**
> kotlin.collections.List&lt;MinimalRepository&gt; orgsListPatGrantRequestRepositories(org, patRequestId, perPage, page)

List repositories requested to be accessed by a fine-grained personal access token

Lists the repositories a fine-grained personal access token request is requesting access to.  Only GitHub Apps can use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val patRequestId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the request for access via fine-grained personal access token.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<MinimalRepository> = apiInstance.orgsListPatGrantRequestRepositories(org, patRequestId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListPatGrantRequestRepositories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListPatGrantRequestRepositories")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **patRequestId** | **kotlin.Int**| Unique identifier of the request for access via fine-grained personal access token. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListPatGrantRequests"></a>
# **orgsListPatGrantRequests**
> kotlin.collections.List&lt;OrganizationProgrammaticAccessGrantRequest&gt; orgsListPatGrantRequests(org, perPage, page, sort, direction, owner, repository, permission, lastUsedBefore, lastUsedAfter)

List requests to access organization resources with fine-grained personal access tokens

Lists requests from organization members to access organization resources with a fine-grained personal access token.  Only GitHub Apps can use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val sort : kotlin.String = sort_example // kotlin.String | The property by which to sort the results.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val owner : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | A list of owner usernames to use to filter the results.
val repository : kotlin.String = repository_example // kotlin.String | The name of the repository to use to filter the results.
val permission : kotlin.String = permission_example // kotlin.String | The permission to use to filter the results.
val lastUsedBefore : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show fine-grained personal access tokens used before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val lastUsedAfter : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show fine-grained personal access tokens used after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
try {
    val result : kotlin.collections.List<OrganizationProgrammaticAccessGrantRequest> = apiInstance.orgsListPatGrantRequests(org, perPage, page, sort, direction, owner, repository, permission, lastUsedBefore, lastUsedAfter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListPatGrantRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListPatGrantRequests")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **sort** | **kotlin.String**| The property by which to sort the results. | [optional] [default to created_at] [enum: created_at]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **owner** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| A list of owner usernames to use to filter the results. | [optional]
 **repository** | **kotlin.String**| The name of the repository to use to filter the results. | [optional]
 **permission** | **kotlin.String**| The permission to use to filter the results. | [optional]
 **lastUsedBefore** | **kotlinx.datetime.Instant**| Only show fine-grained personal access tokens used before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **lastUsedAfter** | **kotlinx.datetime.Instant**| Only show fine-grained personal access tokens used after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]

### Return type

[**kotlin.collections.List&lt;OrganizationProgrammaticAccessGrantRequest&gt;**](OrganizationProgrammaticAccessGrantRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListPatGrants"></a>
# **orgsListPatGrants**
> kotlin.collections.List&lt;OrganizationProgrammaticAccessGrant&gt; orgsListPatGrants(org, perPage, page, sort, direction, owner, repository, permission, lastUsedBefore, lastUsedAfter)

List fine-grained personal access tokens with access to organization resources

Lists approved fine-grained personal access tokens owned by organization members that can access organization resources.  Only GitHub Apps can use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val sort : kotlin.String = sort_example // kotlin.String | The property by which to sort the results.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val owner : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | A list of owner usernames to use to filter the results.
val repository : kotlin.String = repository_example // kotlin.String | The name of the repository to use to filter the results.
val permission : kotlin.String = permission_example // kotlin.String | The permission to use to filter the results.
val lastUsedBefore : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show fine-grained personal access tokens used before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val lastUsedAfter : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show fine-grained personal access tokens used after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
try {
    val result : kotlin.collections.List<OrganizationProgrammaticAccessGrant> = apiInstance.orgsListPatGrants(org, perPage, page, sort, direction, owner, repository, permission, lastUsedBefore, lastUsedAfter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListPatGrants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListPatGrants")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **sort** | **kotlin.String**| The property by which to sort the results. | [optional] [default to created_at] [enum: created_at]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **owner** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| A list of owner usernames to use to filter the results. | [optional]
 **repository** | **kotlin.String**| The name of the repository to use to filter the results. | [optional]
 **permission** | **kotlin.String**| The permission to use to filter the results. | [optional]
 **lastUsedBefore** | **kotlinx.datetime.Instant**| Only show fine-grained personal access tokens used before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **lastUsedAfter** | **kotlinx.datetime.Instant**| Only show fine-grained personal access tokens used after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]

### Return type

[**kotlin.collections.List&lt;OrganizationProgrammaticAccessGrant&gt;**](OrganizationProgrammaticAccessGrant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListPendingInvitations"></a>
# **orgsListPendingInvitations**
> kotlin.collections.List&lt;OrganizationInvitation&gt; orgsListPendingInvitations(org, perPage, page, role, invitationSource)

List pending organization invitations

The return hash contains a &#x60;role&#x60; field which refers to the Organization Invitation role and will be one of the following values: &#x60;direct_member&#x60;, &#x60;admin&#x60;, &#x60;billing_manager&#x60;, or &#x60;hiring_manager&#x60;. If the invitee is not a GitHub member, the &#x60;login&#x60; field in the return hash will be &#x60;null&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val role : kotlin.String = role_example // kotlin.String | Filter invitations by their member role.
val invitationSource : kotlin.String = invitationSource_example // kotlin.String | Filter invitations by their invitation source.
try {
    val result : kotlin.collections.List<OrganizationInvitation> = apiInstance.orgsListPendingInvitations(org, perPage, page, role, invitationSource)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListPendingInvitations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListPendingInvitations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **role** | **kotlin.String**| Filter invitations by their member role. | [optional] [default to all] [enum: all, admin, direct_member, billing_manager, hiring_manager]
 **invitationSource** | **kotlin.String**| Filter invitations by their invitation source. | [optional] [default to all] [enum: all, member, scim]

### Return type

[**kotlin.collections.List&lt;OrganizationInvitation&gt;**](OrganizationInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListPublicMembers"></a>
# **orgsListPublicMembers**
> kotlin.collections.List&lt;SimpleUser&gt; orgsListPublicMembers(org, perPage, page)

List public organization members

Members of an organization can choose to have their membership publicized or not.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.orgsListPublicMembers(org, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListPublicMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListPublicMembers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListSecurityManagerTeams"></a>
# **orgsListSecurityManagerTeams**
> kotlin.collections.List&lt;TeamSimple&gt; orgsListSecurityManagerTeams(org)

List security manager teams

Lists teams that are security managers for an organization. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  The authenticated user must be an administrator or security manager for the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : kotlin.collections.List<TeamSimple> = apiInstance.orgsListSecurityManagerTeams(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListSecurityManagerTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListSecurityManagerTeams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**kotlin.collections.List&lt;TeamSimple&gt;**](TeamSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsListWebhookDeliveries"></a>
# **orgsListWebhookDeliveries**
> kotlin.collections.List&lt;HookDeliveryItem&gt; orgsListWebhookDeliveries(org, hookId, perPage, cursor, redelivery)

List deliveries for an organization webhook

Returns a list of webhook deliveries for a webhook configured in an organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val cursor : kotlin.String = cursor_example // kotlin.String | Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the `link` header for the next and previous page cursors.
val redelivery : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.collections.List<HookDeliveryItem> = apiInstance.orgsListWebhookDeliveries(org, hookId, perPage, cursor, redelivery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListWebhookDeliveries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListWebhookDeliveries")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |
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

<a id="orgsListWebhooks"></a>
# **orgsListWebhooks**
> kotlin.collections.List&lt;OrgHook&gt; orgsListWebhooks(org, perPage, page)

List organization webhooks



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<OrgHook> = apiInstance.orgsListWebhooks(org, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsListWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsListWebhooks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;OrgHook&gt;**](OrgHook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsPatchCustomOrganizationRole"></a>
# **orgsPatchCustomOrganizationRole**
> OrganizationRole orgsPatchCustomOrganizationRole(org, roleId, orgsPatchCustomOrganizationRoleRequest)

Update a custom organization role

Updates an existing custom organization role. Permission changes will apply to all assignees. For more information on custom organization roles, see \&quot;[Managing people&#39;s access to your organization with roles](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/about-custom-organization-roles).\&quot;   To use this endpoint, the authenticated user must be one of:  - An administrator for the organization. - A user, or a user on a team, with the fine-grained permissions of &#x60;write_organization_custom_org_role&#x60; in the organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val roleId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the role.
val orgsPatchCustomOrganizationRoleRequest : OrgsPatchCustomOrganizationRoleRequest = {"description":"Permissions to manage custom roles within an org."} // OrgsPatchCustomOrganizationRoleRequest | 
try {
    val result : OrganizationRole = apiInstance.orgsPatchCustomOrganizationRole(org, roleId, orgsPatchCustomOrganizationRoleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsPatchCustomOrganizationRole")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsPatchCustomOrganizationRole")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **roleId** | **kotlin.Int**| The unique identifier of the role. |
 **orgsPatchCustomOrganizationRoleRequest** | [**OrgsPatchCustomOrganizationRoleRequest**](OrgsPatchCustomOrganizationRoleRequest.md)|  |

### Return type

[**OrganizationRole**](OrganizationRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="orgsPingWebhook"></a>
# **orgsPingWebhook**
> orgsPingWebhook(org, hookId)

Ping an organization webhook

This will trigger a [ping event](https://docs.github.com/webhooks/#ping-event) to be sent to the hook.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
try {
    apiInstance.orgsPingWebhook(org, hookId)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsPingWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsPingWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsRedeliverWebhookDelivery"></a>
# **orgsRedeliverWebhookDelivery**
> kotlin.Any orgsRedeliverWebhookDelivery(org, hookId, deliveryId)

Redeliver a delivery for an organization webhook

Redeliver a delivery for a webhook configured in an organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
val deliveryId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.orgsRedeliverWebhookDelivery(org, hookId, deliveryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsRedeliverWebhookDelivery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsRedeliverWebhookDelivery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |
 **deliveryId** | **kotlin.Int**|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="orgsRemoveCustomProperty"></a>
# **orgsRemoveCustomProperty**
> orgsRemoveCustomProperty(org, customPropertyName)

Remove a custom property for an organization

Removes a custom property that is defined for an organization.  To use this endpoint, the authenticated user must be one of:   - An administrator for the organization.   - A user, or a user on a team, with the fine-grained permission of &#x60;custom_properties_org_definitions_manager&#x60; in the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val customPropertyName : kotlin.String = customPropertyName_example // kotlin.String | The custom property name. The name is case sensitive.
try {
    apiInstance.orgsRemoveCustomProperty(org, customPropertyName)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsRemoveCustomProperty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsRemoveCustomProperty")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **customPropertyName** | **kotlin.String**| The custom property name. The name is case sensitive. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsRemoveMember"></a>
# **orgsRemoveMember**
> orgsRemoveMember(org, username)

Remove an organization member

Removing a user from this list will remove them from all teams and they will no longer have any access to the organization&#39;s repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.orgsRemoveMember(org, username)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsRemoveMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsRemoveMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsRemoveMembershipForUser"></a>
# **orgsRemoveMembershipForUser**
> orgsRemoveMembershipForUser(org, username)

Remove organization membership for a user

In order to remove a user&#39;s membership with an organization, the authenticated user must be an organization owner.  If the specified user is an active member of the organization, this will remove them from the organization. If the specified user has been invited to the organization, this will cancel their invitation. The specified user will receive an email notification in both cases.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.orgsRemoveMembershipForUser(org, username)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsRemoveMembershipForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsRemoveMembershipForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsRemoveOutsideCollaborator"></a>
# **orgsRemoveOutsideCollaborator**
> orgsRemoveOutsideCollaborator(org, username)

Remove outside collaborator from an organization

Removing a user from this list will remove them from all the organization&#39;s repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.orgsRemoveOutsideCollaborator(org, username)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsRemoveOutsideCollaborator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsRemoveOutsideCollaborator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsRemovePublicMembershipForAuthenticatedUser"></a>
# **orgsRemovePublicMembershipForAuthenticatedUser**
> orgsRemovePublicMembershipForAuthenticatedUser(org, username)

Remove public organization membership for the authenticated user

Removes the public membership for the authenticated user from the specified organization, unless public visibility is enforced by default.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.orgsRemovePublicMembershipForAuthenticatedUser(org, username)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsRemovePublicMembershipForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsRemovePublicMembershipForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="orgsRemoveSecurityManagerTeam"></a>
# **orgsRemoveSecurityManagerTeam**
> orgsRemoveSecurityManagerTeam(org, teamSlug)

Remove a security manager team

Removes the security manager role from a team for an organization. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization) team from an organization.\&quot;  The authenticated user must be an administrator for the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
try {
    apiInstance.orgsRemoveSecurityManagerTeam(org, teamSlug)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsRemoveSecurityManagerTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsRemoveSecurityManagerTeam")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="orgsReviewPatGrantRequest"></a>
# **orgsReviewPatGrantRequest**
> orgsReviewPatGrantRequest(org, patRequestId, orgsReviewPatGrantRequestRequest)

Review a request to access organization resources with a fine-grained personal access token

Approves or denies a pending request to access organization resources via a fine-grained personal access token.  Only GitHub Apps can use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val patRequestId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the request for access via fine-grained personal access token.
val orgsReviewPatGrantRequestRequest : OrgsReviewPatGrantRequestRequest = {"action":"deny","reason":"This request is denied because the access is too broad."} // OrgsReviewPatGrantRequestRequest | 
try {
    apiInstance.orgsReviewPatGrantRequest(org, patRequestId, orgsReviewPatGrantRequestRequest)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsReviewPatGrantRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsReviewPatGrantRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **patRequestId** | **kotlin.Int**| Unique identifier of the request for access via fine-grained personal access token. |
 **orgsReviewPatGrantRequestRequest** | [**OrgsReviewPatGrantRequestRequest**](OrgsReviewPatGrantRequestRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="orgsReviewPatGrantRequestsInBulk"></a>
# **orgsReviewPatGrantRequestsInBulk**
> kotlin.Any orgsReviewPatGrantRequestsInBulk(org, orgsReviewPatGrantRequestsInBulkRequest)

Review requests to access organization resources with fine-grained personal access tokens

Approves or denies multiple pending requests to access organization resources via a fine-grained personal access token.  Only GitHub Apps can use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val orgsReviewPatGrantRequestsInBulkRequest : OrgsReviewPatGrantRequestsInBulkRequest = {"pat_request_ids":[42,73],"action":"deny","reason":"Access is too broad."} // OrgsReviewPatGrantRequestsInBulkRequest | 
try {
    val result : kotlin.Any = apiInstance.orgsReviewPatGrantRequestsInBulk(org, orgsReviewPatGrantRequestsInBulkRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsReviewPatGrantRequestsInBulk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsReviewPatGrantRequestsInBulk")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **orgsReviewPatGrantRequestsInBulkRequest** | [**OrgsReviewPatGrantRequestsInBulkRequest**](OrgsReviewPatGrantRequestsInBulkRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="orgsRevokeAllOrgRolesTeam"></a>
# **orgsRevokeAllOrgRolesTeam**
> orgsRevokeAllOrgRolesTeam(org, teamSlug)

Remove all organization roles for a team

Removes all assigned organization roles from a team. For more information on organization roles, see \&quot;[Managing people&#39;s access to your organization with roles](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/about-custom-organization-roles).\&quot;  The authenticated user must be an administrator for the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
try {
    apiInstance.orgsRevokeAllOrgRolesTeam(org, teamSlug)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsRevokeAllOrgRolesTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsRevokeAllOrgRolesTeam")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="orgsRevokeAllOrgRolesUser"></a>
# **orgsRevokeAllOrgRolesUser**
> orgsRevokeAllOrgRolesUser(org, username)

Remove all organization roles for a user

Revokes all assigned organization roles from a user. For more information on organization roles, see \&quot;[Managing people&#39;s access to your organization with roles](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/about-custom-organization-roles).\&quot;  The authenticated user must be an administrator for the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.orgsRevokeAllOrgRolesUser(org, username)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsRevokeAllOrgRolesUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsRevokeAllOrgRolesUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="orgsRevokeOrgRoleTeam"></a>
# **orgsRevokeOrgRoleTeam**
> orgsRevokeOrgRoleTeam(org, teamSlug, roleId)

Remove an organization role from a team

Removes an organization role from a team. For more information on organization roles, see \&quot;[Managing people&#39;s access to your organization with roles](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/about-custom-organization-roles).\&quot;  The authenticated user must be an administrator for the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val roleId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the role.
try {
    apiInstance.orgsRevokeOrgRoleTeam(org, teamSlug, roleId)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsRevokeOrgRoleTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsRevokeOrgRoleTeam")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **roleId** | **kotlin.Int**| The unique identifier of the role. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="orgsRevokeOrgRoleUser"></a>
# **orgsRevokeOrgRoleUser**
> orgsRevokeOrgRoleUser(org, username, roleId)

Remove an organization role from a user

Remove an organization role from a user. For more information on organization roles, see \&quot;[Managing people&#39;s access to your organization with roles](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/about-custom-organization-roles).\&quot;  The authenticated user must be an administrator for the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val roleId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the role.
try {
    apiInstance.orgsRevokeOrgRoleUser(org, username, roleId)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsRevokeOrgRoleUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsRevokeOrgRoleUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **roleId** | **kotlin.Int**| The unique identifier of the role. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="orgsSetMembershipForUser"></a>
# **orgsSetMembershipForUser**
> OrgMembership orgsSetMembershipForUser(org, username, orgsSetMembershipForUserRequest)

Set organization membership for a user

Only authenticated organization owners can add a member to the organization or update the member&#39;s role.  *   If the authenticated user is _adding_ a member to the organization, the invited user will receive an email inviting them to the organization. The user&#39;s [membership status](https://docs.github.com/rest/orgs/members#get-organization-membership-for-a-user) will be &#x60;pending&#x60; until they accept the invitation.      *   Authenticated users can _update_ a user&#39;s membership by passing the &#x60;role&#x60; parameter. If the authenticated user changes a member&#39;s role to &#x60;admin&#x60;, the affected user will receive an email notifying them that they&#39;ve been made an organization owner. If the authenticated user changes an owner&#39;s role to &#x60;member&#x60;, no email will be sent.  **Rate limits**  To prevent abuse, the authenticated user is limited to 50 organization invitations per 24 hour period. If the organization is more than one month old or on a paid plan, the limit is 500 invitations per 24 hour period.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val orgsSetMembershipForUserRequest : OrgsSetMembershipForUserRequest = {"role":"member"} // OrgsSetMembershipForUserRequest | 
try {
    val result : OrgMembership = apiInstance.orgsSetMembershipForUser(org, username, orgsSetMembershipForUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsSetMembershipForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsSetMembershipForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **orgsSetMembershipForUserRequest** | [**OrgsSetMembershipForUserRequest**](OrgsSetMembershipForUserRequest.md)|  | [optional]

### Return type

[**OrgMembership**](OrgMembership.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="orgsSetPublicMembershipForAuthenticatedUser"></a>
# **orgsSetPublicMembershipForAuthenticatedUser**
> orgsSetPublicMembershipForAuthenticatedUser(org, username)

Set public organization membership for the authenticated user

The user can publicize their own membership. (A user cannot publicize the membership for another user.)  Note that you&#39;ll need to set &#x60;Content-Length&#x60; to zero when calling out to this endpoint. For more information, see \&quot;[HTTP method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.orgsSetPublicMembershipForAuthenticatedUser(org, username)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsSetPublicMembershipForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsSetPublicMembershipForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="orgsUnblockUser"></a>
# **orgsUnblockUser**
> orgsUnblockUser(org, username)

Unblock a user from an organization

Unblocks the given user on behalf of the specified organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.orgsUnblockUser(org, username)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsUnblockUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsUnblockUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="orgsUpdate"></a>
# **orgsUpdate**
> OrganizationFull orgsUpdate(org, orgsUpdateRequest)

Update an organization

**Parameter Deprecation Notice:** GitHub will replace and discontinue &#x60;members_allowed_repository_creation_type&#x60; in favor of more granular permissions. The new input parameters are &#x60;members_can_create_public_repositories&#x60;, &#x60;members_can_create_private_repositories&#x60; for all organizations and &#x60;members_can_create_internal_repositories&#x60; for organizations associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see the [blog post](https://developer.github.com/changes/2019-12-03-internal-visibility-changes).  Updates the organization&#39;s profile and member privileges.  The authenticated user must be an organization owner to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; or &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val orgsUpdateRequest : OrgsUpdateRequest = {"billing_email":"mona@github.com","company":"GitHub","email":"mona@github.com","twitter_username":"github","location":"San Francisco","name":"github","description":"GitHub, the company.","default_repository_permission":"read","members_can_create_repositories":true,"members_allowed_repository_creation_type":"all"} // OrgsUpdateRequest | 
try {
    val result : OrganizationFull = apiInstance.orgsUpdate(org, orgsUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **orgsUpdateRequest** | [**OrgsUpdateRequest**](OrgsUpdateRequest.md)|  | [optional]

### Return type

[**OrganizationFull**](OrganizationFull.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="orgsUpdateMembershipForAuthenticatedUser"></a>
# **orgsUpdateMembershipForAuthenticatedUser**
> OrgMembership orgsUpdateMembershipForAuthenticatedUser(org, orgsUpdateMembershipForAuthenticatedUserRequest)

Update an organization membership for the authenticated user

Converts the authenticated user to an active member of the organization, if that user has a pending invitation from the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val orgsUpdateMembershipForAuthenticatedUserRequest : OrgsUpdateMembershipForAuthenticatedUserRequest = {"state":"active"} // OrgsUpdateMembershipForAuthenticatedUserRequest | 
try {
    val result : OrgMembership = apiInstance.orgsUpdateMembershipForAuthenticatedUser(org, orgsUpdateMembershipForAuthenticatedUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsUpdateMembershipForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsUpdateMembershipForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **orgsUpdateMembershipForAuthenticatedUserRequest** | [**OrgsUpdateMembershipForAuthenticatedUserRequest**](OrgsUpdateMembershipForAuthenticatedUserRequest.md)|  |

### Return type

[**OrgMembership**](OrgMembership.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="orgsUpdatePatAccess"></a>
# **orgsUpdatePatAccess**
> orgsUpdatePatAccess(org, patId, orgsUpdatePatAccessRequest)

Update the access a fine-grained personal access token has to organization resources

Updates the access an organization member has to organization resources via a fine-grained personal access token. Limited to revoking the token&#39;s existing access. Limited to revoking a token&#39;s existing access.  Only GitHub Apps can use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val patId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the fine-grained personal access token.
val orgsUpdatePatAccessRequest : OrgsUpdatePatAccessRequest = {"action":"revoke"} // OrgsUpdatePatAccessRequest | 
try {
    apiInstance.orgsUpdatePatAccess(org, patId, orgsUpdatePatAccessRequest)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsUpdatePatAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsUpdatePatAccess")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **patId** | **kotlin.Int**| The unique identifier of the fine-grained personal access token. |
 **orgsUpdatePatAccessRequest** | [**OrgsUpdatePatAccessRequest**](OrgsUpdatePatAccessRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="orgsUpdatePatAccesses"></a>
# **orgsUpdatePatAccesses**
> kotlin.Any orgsUpdatePatAccesses(org, orgsUpdatePatAccessesRequest)

Update the access to organization resources via fine-grained personal access tokens

Updates the access organization members have to organization resources via fine-grained personal access tokens. Limited to revoking a token&#39;s existing access.  Only GitHub Apps can use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val orgsUpdatePatAccessesRequest : OrgsUpdatePatAccessesRequest = {"action":"revoke","pat_ids":[1296269,1296280]} // OrgsUpdatePatAccessesRequest | 
try {
    val result : kotlin.Any = apiInstance.orgsUpdatePatAccesses(org, orgsUpdatePatAccessesRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsUpdatePatAccesses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsUpdatePatAccesses")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **orgsUpdatePatAccessesRequest** | [**OrgsUpdatePatAccessesRequest**](OrgsUpdatePatAccessesRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="orgsUpdateWebhook"></a>
# **orgsUpdateWebhook**
> OrgHook orgsUpdateWebhook(org, hookId, orgsUpdateWebhookRequest)

Update an organization webhook

Updates a webhook configured in an organization. When you update a webhook, the &#x60;secret&#x60; will be overwritten. If you previously had a &#x60;secret&#x60; set, you must provide the same &#x60;secret&#x60; or set a new &#x60;secret&#x60; or the secret will be removed. If you are only updating individual webhook &#x60;config&#x60; properties, use \&quot;[Update a webhook configuration for an organization](/rest/orgs/webhooks#update-a-webhook-configuration-for-an-organization).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
val orgsUpdateWebhookRequest : OrgsUpdateWebhookRequest = {"active":true,"events":["pull_request"]} // OrgsUpdateWebhookRequest | 
try {
    val result : OrgHook = apiInstance.orgsUpdateWebhook(org, hookId, orgsUpdateWebhookRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsUpdateWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsUpdateWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |
 **orgsUpdateWebhookRequest** | [**OrgsUpdateWebhookRequest**](OrgsUpdateWebhookRequest.md)|  | [optional]

### Return type

[**OrgHook**](OrgHook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="orgsUpdateWebhookConfigForOrg"></a>
# **orgsUpdateWebhookConfigForOrg**
> WebhookConfig orgsUpdateWebhookConfigForOrg(org, hookId, appsUpdateWebhookConfigForAppRequest)

Update a webhook configuration for an organization

Updates the webhook configuration for an organization. To update more information about the webhook, including the &#x60;active&#x60; state and &#x60;events&#x60;, use \&quot;[Update an organization webhook ](/rest/orgs/webhooks#update-an-organization-webhook).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org_hook&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrgsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
val appsUpdateWebhookConfigForAppRequest : AppsUpdateWebhookConfigForAppRequest = {"url":"http://example.com/webhook","content_type":"json","insecure_ssl":"0","secret":"********"} // AppsUpdateWebhookConfigForAppRequest | 
try {
    val result : WebhookConfig = apiInstance.orgsUpdateWebhookConfigForOrg(org, hookId, appsUpdateWebhookConfigForAppRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrgsApi#orgsUpdateWebhookConfigForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrgsApi#orgsUpdateWebhookConfigForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |
 **appsUpdateWebhookConfigForAppRequest** | [**AppsUpdateWebhookConfigForAppRequest**](AppsUpdateWebhookConfigForAppRequest.md)|  | [optional]

### Return type

[**WebhookConfig**](WebhookConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

