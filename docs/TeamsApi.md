# TeamsApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**teamsAddMemberLegacy**](TeamsApi.md#teamsAddMemberLegacy) | **PUT** /teams/{team_id}/members/{username} | Add team member (Legacy)
[**teamsAddOrUpdateMembershipForUserInOrg**](TeamsApi.md#teamsAddOrUpdateMembershipForUserInOrg) | **PUT** /orgs/{org}/teams/{team_slug}/memberships/{username} | Add or update team membership for a user
[**teamsAddOrUpdateMembershipForUserLegacy**](TeamsApi.md#teamsAddOrUpdateMembershipForUserLegacy) | **PUT** /teams/{team_id}/memberships/{username} | Add or update team membership for a user (Legacy)
[**teamsAddOrUpdateProjectPermissionsInOrg**](TeamsApi.md#teamsAddOrUpdateProjectPermissionsInOrg) | **PUT** /orgs/{org}/teams/{team_slug}/projects/{project_id} | Add or update team project permissions
[**teamsAddOrUpdateProjectPermissionsLegacy**](TeamsApi.md#teamsAddOrUpdateProjectPermissionsLegacy) | **PUT** /teams/{team_id}/projects/{project_id} | Add or update team project permissions (Legacy)
[**teamsAddOrUpdateRepoPermissionsInOrg**](TeamsApi.md#teamsAddOrUpdateRepoPermissionsInOrg) | **PUT** /orgs/{org}/teams/{team_slug}/repos/{owner}/{repo} | Add or update team repository permissions
[**teamsAddOrUpdateRepoPermissionsLegacy**](TeamsApi.md#teamsAddOrUpdateRepoPermissionsLegacy) | **PUT** /teams/{team_id}/repos/{owner}/{repo} | Add or update team repository permissions (Legacy)
[**teamsCheckPermissionsForProjectInOrg**](TeamsApi.md#teamsCheckPermissionsForProjectInOrg) | **GET** /orgs/{org}/teams/{team_slug}/projects/{project_id} | Check team permissions for a project
[**teamsCheckPermissionsForProjectLegacy**](TeamsApi.md#teamsCheckPermissionsForProjectLegacy) | **GET** /teams/{team_id}/projects/{project_id} | Check team permissions for a project (Legacy)
[**teamsCheckPermissionsForRepoInOrg**](TeamsApi.md#teamsCheckPermissionsForRepoInOrg) | **GET** /orgs/{org}/teams/{team_slug}/repos/{owner}/{repo} | Check team permissions for a repository
[**teamsCheckPermissionsForRepoLegacy**](TeamsApi.md#teamsCheckPermissionsForRepoLegacy) | **GET** /teams/{team_id}/repos/{owner}/{repo} | Check team permissions for a repository (Legacy)
[**teamsCreate**](TeamsApi.md#teamsCreate) | **POST** /orgs/{org}/teams | Create a team
[**teamsCreateDiscussionCommentInOrg**](TeamsApi.md#teamsCreateDiscussionCommentInOrg) | **POST** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments | Create a discussion comment
[**teamsCreateDiscussionCommentLegacy**](TeamsApi.md#teamsCreateDiscussionCommentLegacy) | **POST** /teams/{team_id}/discussions/{discussion_number}/comments | Create a discussion comment (Legacy)
[**teamsCreateDiscussionInOrg**](TeamsApi.md#teamsCreateDiscussionInOrg) | **POST** /orgs/{org}/teams/{team_slug}/discussions | Create a discussion
[**teamsCreateDiscussionLegacy**](TeamsApi.md#teamsCreateDiscussionLegacy) | **POST** /teams/{team_id}/discussions | Create a discussion (Legacy)
[**teamsDeleteDiscussionCommentInOrg**](TeamsApi.md#teamsDeleteDiscussionCommentInOrg) | **DELETE** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number} | Delete a discussion comment
[**teamsDeleteDiscussionCommentLegacy**](TeamsApi.md#teamsDeleteDiscussionCommentLegacy) | **DELETE** /teams/{team_id}/discussions/{discussion_number}/comments/{comment_number} | Delete a discussion comment (Legacy)
[**teamsDeleteDiscussionInOrg**](TeamsApi.md#teamsDeleteDiscussionInOrg) | **DELETE** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number} | Delete a discussion
[**teamsDeleteDiscussionLegacy**](TeamsApi.md#teamsDeleteDiscussionLegacy) | **DELETE** /teams/{team_id}/discussions/{discussion_number} | Delete a discussion (Legacy)
[**teamsDeleteInOrg**](TeamsApi.md#teamsDeleteInOrg) | **DELETE** /orgs/{org}/teams/{team_slug} | Delete a team
[**teamsDeleteLegacy**](TeamsApi.md#teamsDeleteLegacy) | **DELETE** /teams/{team_id} | Delete a team (Legacy)
[**teamsGetByName**](TeamsApi.md#teamsGetByName) | **GET** /orgs/{org}/teams/{team_slug} | Get a team by name
[**teamsGetDiscussionCommentInOrg**](TeamsApi.md#teamsGetDiscussionCommentInOrg) | **GET** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number} | Get a discussion comment
[**teamsGetDiscussionCommentLegacy**](TeamsApi.md#teamsGetDiscussionCommentLegacy) | **GET** /teams/{team_id}/discussions/{discussion_number}/comments/{comment_number} | Get a discussion comment (Legacy)
[**teamsGetDiscussionInOrg**](TeamsApi.md#teamsGetDiscussionInOrg) | **GET** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number} | Get a discussion
[**teamsGetDiscussionLegacy**](TeamsApi.md#teamsGetDiscussionLegacy) | **GET** /teams/{team_id}/discussions/{discussion_number} | Get a discussion (Legacy)
[**teamsGetLegacy**](TeamsApi.md#teamsGetLegacy) | **GET** /teams/{team_id} | Get a team (Legacy)
[**teamsGetMemberLegacy**](TeamsApi.md#teamsGetMemberLegacy) | **GET** /teams/{team_id}/members/{username} | Get team member (Legacy)
[**teamsGetMembershipForUserInOrg**](TeamsApi.md#teamsGetMembershipForUserInOrg) | **GET** /orgs/{org}/teams/{team_slug}/memberships/{username} | Get team membership for a user
[**teamsGetMembershipForUserLegacy**](TeamsApi.md#teamsGetMembershipForUserLegacy) | **GET** /teams/{team_id}/memberships/{username} | Get team membership for a user (Legacy)
[**teamsList**](TeamsApi.md#teamsList) | **GET** /orgs/{org}/teams | List teams
[**teamsListChildInOrg**](TeamsApi.md#teamsListChildInOrg) | **GET** /orgs/{org}/teams/{team_slug}/teams | List child teams
[**teamsListChildLegacy**](TeamsApi.md#teamsListChildLegacy) | **GET** /teams/{team_id}/teams | List child teams (Legacy)
[**teamsListDiscussionCommentsInOrg**](TeamsApi.md#teamsListDiscussionCommentsInOrg) | **GET** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments | List discussion comments
[**teamsListDiscussionCommentsLegacy**](TeamsApi.md#teamsListDiscussionCommentsLegacy) | **GET** /teams/{team_id}/discussions/{discussion_number}/comments | List discussion comments (Legacy)
[**teamsListDiscussionsInOrg**](TeamsApi.md#teamsListDiscussionsInOrg) | **GET** /orgs/{org}/teams/{team_slug}/discussions | List discussions
[**teamsListDiscussionsLegacy**](TeamsApi.md#teamsListDiscussionsLegacy) | **GET** /teams/{team_id}/discussions | List discussions (Legacy)
[**teamsListForAuthenticatedUser**](TeamsApi.md#teamsListForAuthenticatedUser) | **GET** /user/teams | List teams for the authenticated user
[**teamsListMembersInOrg**](TeamsApi.md#teamsListMembersInOrg) | **GET** /orgs/{org}/teams/{team_slug}/members | List team members
[**teamsListMembersLegacy**](TeamsApi.md#teamsListMembersLegacy) | **GET** /teams/{team_id}/members | List team members (Legacy)
[**teamsListPendingInvitationsInOrg**](TeamsApi.md#teamsListPendingInvitationsInOrg) | **GET** /orgs/{org}/teams/{team_slug}/invitations | List pending team invitations
[**teamsListPendingInvitationsLegacy**](TeamsApi.md#teamsListPendingInvitationsLegacy) | **GET** /teams/{team_id}/invitations | List pending team invitations (Legacy)
[**teamsListProjectsInOrg**](TeamsApi.md#teamsListProjectsInOrg) | **GET** /orgs/{org}/teams/{team_slug}/projects | List team projects
[**teamsListProjectsLegacy**](TeamsApi.md#teamsListProjectsLegacy) | **GET** /teams/{team_id}/projects | List team projects (Legacy)
[**teamsListReposInOrg**](TeamsApi.md#teamsListReposInOrg) | **GET** /orgs/{org}/teams/{team_slug}/repos | List team repositories
[**teamsListReposLegacy**](TeamsApi.md#teamsListReposLegacy) | **GET** /teams/{team_id}/repos | List team repositories (Legacy)
[**teamsRemoveMemberLegacy**](TeamsApi.md#teamsRemoveMemberLegacy) | **DELETE** /teams/{team_id}/members/{username} | Remove team member (Legacy)
[**teamsRemoveMembershipForUserInOrg**](TeamsApi.md#teamsRemoveMembershipForUserInOrg) | **DELETE** /orgs/{org}/teams/{team_slug}/memberships/{username} | Remove team membership for a user
[**teamsRemoveMembershipForUserLegacy**](TeamsApi.md#teamsRemoveMembershipForUserLegacy) | **DELETE** /teams/{team_id}/memberships/{username} | Remove team membership for a user (Legacy)
[**teamsRemoveProjectInOrg**](TeamsApi.md#teamsRemoveProjectInOrg) | **DELETE** /orgs/{org}/teams/{team_slug}/projects/{project_id} | Remove a project from a team
[**teamsRemoveProjectLegacy**](TeamsApi.md#teamsRemoveProjectLegacy) | **DELETE** /teams/{team_id}/projects/{project_id} | Remove a project from a team (Legacy)
[**teamsRemoveRepoInOrg**](TeamsApi.md#teamsRemoveRepoInOrg) | **DELETE** /orgs/{org}/teams/{team_slug}/repos/{owner}/{repo} | Remove a repository from a team
[**teamsRemoveRepoLegacy**](TeamsApi.md#teamsRemoveRepoLegacy) | **DELETE** /teams/{team_id}/repos/{owner}/{repo} | Remove a repository from a team (Legacy)
[**teamsUpdateDiscussionCommentInOrg**](TeamsApi.md#teamsUpdateDiscussionCommentInOrg) | **PATCH** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number} | Update a discussion comment
[**teamsUpdateDiscussionCommentLegacy**](TeamsApi.md#teamsUpdateDiscussionCommentLegacy) | **PATCH** /teams/{team_id}/discussions/{discussion_number}/comments/{comment_number} | Update a discussion comment (Legacy)
[**teamsUpdateDiscussionInOrg**](TeamsApi.md#teamsUpdateDiscussionInOrg) | **PATCH** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number} | Update a discussion
[**teamsUpdateDiscussionLegacy**](TeamsApi.md#teamsUpdateDiscussionLegacy) | **PATCH** /teams/{team_id}/discussions/{discussion_number} | Update a discussion (Legacy)
[**teamsUpdateInOrg**](TeamsApi.md#teamsUpdateInOrg) | **PATCH** /orgs/{org}/teams/{team_slug} | Update a team
[**teamsUpdateLegacy**](TeamsApi.md#teamsUpdateLegacy) | **PATCH** /teams/{team_id} | Update a team (Legacy)


<a id="teamsAddMemberLegacy"></a>
# **teamsAddMemberLegacy**
> teamsAddMemberLegacy(teamId, username)

Add team member (Legacy)

The \&quot;Add team member\&quot; endpoint (described below) is deprecated.  We recommend using the [Add or update team membership for a user](https://docs.github.com/rest/teams/members#add-or-update-team-membership-for-a-user) endpoint instead. It allows you to invite new organization members to your teams.  Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  To add someone to a team, the authenticated user must be an organization owner or a team maintainer in the team they&#39;re changing. The person being added to the team must be a member of the team&#39;s organization.  **Note:** When you have team synchronization set up for a team with your organization&#39;s identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team&#39;s membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see \&quot;[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/).\&quot;  Note that you&#39;ll need to set &#x60;Content-Length&#x60; to zero when calling out to this endpoint. For more information, see \&quot;[HTTP method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.teamsAddMemberLegacy(teamId, username)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsAddMemberLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsAddMemberLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsAddOrUpdateMembershipForUserInOrg"></a>
# **teamsAddOrUpdateMembershipForUserInOrg**
> TeamMembership teamsAddOrUpdateMembershipForUserInOrg(org, teamSlug, username, teamsAddOrUpdateMembershipForUserInOrgRequest)

Add or update team membership for a user

Adds an organization member to a team. An authenticated organization owner or team maintainer can add organization members to a team.  Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  **Note:** When you have team synchronization set up for a team with your organization&#39;s identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team&#39;s membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see \&quot;[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/).\&quot;  An organization owner can add someone who is not part of the team&#39;s organization to a team. When an organization owner adds someone to a team who is not an organization member, this endpoint will send an invitation to the person via email. This newly-created membership will be in the \&quot;pending\&quot; state until the person accepts the invitation, at which point the membership will transition to the \&quot;active\&quot; state and the user will be added as a member of the team.  If the user is already a member of the team, this endpoint will update the role of the team member&#39;s role. To update the membership of a team member, the authenticated user must be an organization owner or a team maintainer.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;PUT /organizations/{org_id}/team/{team_id}/memberships/{username}&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val teamsAddOrUpdateMembershipForUserInOrgRequest : TeamsAddOrUpdateMembershipForUserInOrgRequest = {"role":"maintainer"} // TeamsAddOrUpdateMembershipForUserInOrgRequest | 
try {
    val result : TeamMembership = apiInstance.teamsAddOrUpdateMembershipForUserInOrg(org, teamSlug, username, teamsAddOrUpdateMembershipForUserInOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsAddOrUpdateMembershipForUserInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsAddOrUpdateMembershipForUserInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **teamsAddOrUpdateMembershipForUserInOrgRequest** | [**TeamsAddOrUpdateMembershipForUserInOrgRequest**](TeamsAddOrUpdateMembershipForUserInOrgRequest.md)|  | [optional]

### Return type

[**TeamMembership**](TeamMembership.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="teamsAddOrUpdateMembershipForUserLegacy"></a>
# **teamsAddOrUpdateMembershipForUserLegacy**
> TeamMembership teamsAddOrUpdateMembershipForUserLegacy(teamId, username, teamsAddOrUpdateMembershipForUserInOrgRequest)

Add or update team membership for a user (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Add or update team membership for a user](https://docs.github.com/rest/teams/members#add-or-update-team-membership-for-a-user) endpoint.  Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  If the user is already a member of the team&#39;s organization, this endpoint will add the user to the team. To add a membership between an organization member and a team, the authenticated user must be an organization owner or a team maintainer.  **Note:** When you have team synchronization set up for a team with your organization&#39;s identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team&#39;s membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see \&quot;[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/).\&quot;  If the user is unaffiliated with the team&#39;s organization, this endpoint will send an invitation to the user via email. This newly-created membership will be in the \&quot;pending\&quot; state until the user accepts the invitation, at which point the membership will transition to the \&quot;active\&quot; state and the user will be added as a member of the team. To add a membership between an unaffiliated user and a team, the authenticated user must be an organization owner.  If the user is already a member of the team, this endpoint will update the role of the team member&#39;s role. To update the membership of a team member, the authenticated user must be an organization owner or a team maintainer.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val teamsAddOrUpdateMembershipForUserInOrgRequest : TeamsAddOrUpdateMembershipForUserInOrgRequest = {"role":"member"} // TeamsAddOrUpdateMembershipForUserInOrgRequest | 
try {
    val result : TeamMembership = apiInstance.teamsAddOrUpdateMembershipForUserLegacy(teamId, username, teamsAddOrUpdateMembershipForUserInOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsAddOrUpdateMembershipForUserLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsAddOrUpdateMembershipForUserLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **teamsAddOrUpdateMembershipForUserInOrgRequest** | [**TeamsAddOrUpdateMembershipForUserInOrgRequest**](TeamsAddOrUpdateMembershipForUserInOrgRequest.md)|  | [optional]

### Return type

[**TeamMembership**](TeamMembership.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="teamsAddOrUpdateProjectPermissionsInOrg"></a>
# **teamsAddOrUpdateProjectPermissionsInOrg**
> teamsAddOrUpdateProjectPermissionsInOrg(org, teamSlug, projectId, teamsAddOrUpdateProjectPermissionsInOrgRequest)

Add or update team project permissions

Adds an organization project to a team. To add a project to a team or update the team&#39;s permission on a project, the authenticated user must have &#x60;admin&#x60; permissions for the project. The project and team must be part of the same organization.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;PUT /organizations/{org_id}/team/{team_id}/projects/{project_id}&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val projectId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the project.
val teamsAddOrUpdateProjectPermissionsInOrgRequest : TeamsAddOrUpdateProjectPermissionsInOrgRequest = {"permission":"write"} // TeamsAddOrUpdateProjectPermissionsInOrgRequest | 
try {
    apiInstance.teamsAddOrUpdateProjectPermissionsInOrg(org, teamSlug, projectId, teamsAddOrUpdateProjectPermissionsInOrgRequest)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsAddOrUpdateProjectPermissionsInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsAddOrUpdateProjectPermissionsInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **projectId** | **kotlin.Int**| The unique identifier of the project. |
 **teamsAddOrUpdateProjectPermissionsInOrgRequest** | [**TeamsAddOrUpdateProjectPermissionsInOrgRequest**](TeamsAddOrUpdateProjectPermissionsInOrgRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="teamsAddOrUpdateProjectPermissionsLegacy"></a>
# **teamsAddOrUpdateProjectPermissionsLegacy**
> teamsAddOrUpdateProjectPermissionsLegacy(teamId, projectId, teamsAddOrUpdateProjectPermissionsInOrgRequest)

Add or update team project permissions (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Add or update team project permissions](https://docs.github.com/rest/teams/teams#add-or-update-team-project-permissions) endpoint.  Adds an organization project to a team. To add a project to a team or update the team&#39;s permission on a project, the authenticated user must have &#x60;admin&#x60; permissions for the project. The project and team must be part of the same organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val projectId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the project.
val teamsAddOrUpdateProjectPermissionsInOrgRequest : TeamsAddOrUpdateProjectPermissionsInOrgRequest = {"permission":"read"} // TeamsAddOrUpdateProjectPermissionsInOrgRequest | 
try {
    apiInstance.teamsAddOrUpdateProjectPermissionsLegacy(teamId, projectId, teamsAddOrUpdateProjectPermissionsInOrgRequest)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsAddOrUpdateProjectPermissionsLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsAddOrUpdateProjectPermissionsLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **projectId** | **kotlin.Int**| The unique identifier of the project. |
 **teamsAddOrUpdateProjectPermissionsInOrgRequest** | [**TeamsAddOrUpdateProjectPermissionsInOrgRequest**](TeamsAddOrUpdateProjectPermissionsInOrgRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="teamsAddOrUpdateRepoPermissionsInOrg"></a>
# **teamsAddOrUpdateRepoPermissionsInOrg**
> teamsAddOrUpdateRepoPermissionsInOrg(org, teamSlug, owner, repo, teamsAddOrUpdateRepoPermissionsInOrgRequest)

Add or update team repository permissions

To add a repository to a team or update the team&#39;s permission on a repository, the authenticated user must have admin access to the repository, and must be able to see the team. The repository must be owned by the organization, or a direct fork of a repository owned by the organization. You will get a &#x60;422 Unprocessable Entity&#x60; status if you attempt to add a repository to a team that is not owned by the organization. Note that, if you choose not to pass any parameters, you&#39;ll need to set &#x60;Content-Length&#x60; to zero when calling out to this endpoint. For more information, see \&quot;[HTTP method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method).\&quot;  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;PUT /organizations/{org_id}/team/{team_id}/repos/{owner}/{repo}&#x60;.  For more information about the permission levels, see \&quot;[Repository permission levels for an organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/repository-permission-levels-for-an-organization#permission-levels-for-repositories-owned-by-an-organization)\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val teamsAddOrUpdateRepoPermissionsInOrgRequest : TeamsAddOrUpdateRepoPermissionsInOrgRequest = {"permission":"push"} // TeamsAddOrUpdateRepoPermissionsInOrgRequest | 
try {
    apiInstance.teamsAddOrUpdateRepoPermissionsInOrg(org, teamSlug, owner, repo, teamsAddOrUpdateRepoPermissionsInOrgRequest)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsAddOrUpdateRepoPermissionsInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsAddOrUpdateRepoPermissionsInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **teamsAddOrUpdateRepoPermissionsInOrgRequest** | [**TeamsAddOrUpdateRepoPermissionsInOrgRequest**](TeamsAddOrUpdateRepoPermissionsInOrgRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="teamsAddOrUpdateRepoPermissionsLegacy"></a>
# **teamsAddOrUpdateRepoPermissionsLegacy**
> teamsAddOrUpdateRepoPermissionsLegacy(teamId, owner, repo, teamsAddOrUpdateRepoPermissionsLegacyRequest)

Add or update team repository permissions (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new \&quot;[Add or update team repository permissions](https://docs.github.com/rest/teams/teams#add-or-update-team-repository-permissions)\&quot; endpoint.  To add a repository to a team or update the team&#39;s permission on a repository, the authenticated user must have admin access to the repository, and must be able to see the team. The repository must be owned by the organization, or a direct fork of a repository owned by the organization. You will get a &#x60;422 Unprocessable Entity&#x60; status if you attempt to add a repository to a team that is not owned by the organization.  Note that, if you choose not to pass any parameters, you&#39;ll need to set &#x60;Content-Length&#x60; to zero when calling out to this endpoint. For more information, see \&quot;[HTTP method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val teamsAddOrUpdateRepoPermissionsLegacyRequest : TeamsAddOrUpdateRepoPermissionsLegacyRequest = {"permission":"push"} // TeamsAddOrUpdateRepoPermissionsLegacyRequest | 
try {
    apiInstance.teamsAddOrUpdateRepoPermissionsLegacy(teamId, owner, repo, teamsAddOrUpdateRepoPermissionsLegacyRequest)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsAddOrUpdateRepoPermissionsLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsAddOrUpdateRepoPermissionsLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **teamsAddOrUpdateRepoPermissionsLegacyRequest** | [**TeamsAddOrUpdateRepoPermissionsLegacyRequest**](TeamsAddOrUpdateRepoPermissionsLegacyRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="teamsCheckPermissionsForProjectInOrg"></a>
# **teamsCheckPermissionsForProjectInOrg**
> TeamProject teamsCheckPermissionsForProjectInOrg(org, teamSlug, projectId)

Check team permissions for a project

Checks whether a team has &#x60;read&#x60;, &#x60;write&#x60;, or &#x60;admin&#x60; permissions for an organization project. The response includes projects inherited from a parent team.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/projects/{project_id}&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val projectId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the project.
try {
    val result : TeamProject = apiInstance.teamsCheckPermissionsForProjectInOrg(org, teamSlug, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsCheckPermissionsForProjectInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsCheckPermissionsForProjectInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **projectId** | **kotlin.Int**| The unique identifier of the project. |

### Return type

[**TeamProject**](TeamProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsCheckPermissionsForProjectLegacy"></a>
# **teamsCheckPermissionsForProjectLegacy**
> TeamProject teamsCheckPermissionsForProjectLegacy(teamId, projectId)

Check team permissions for a project (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Check team permissions for a project](https://docs.github.com/rest/teams/teams#check-team-permissions-for-a-project) endpoint.  Checks whether a team has &#x60;read&#x60;, &#x60;write&#x60;, or &#x60;admin&#x60; permissions for an organization project. The response includes projects inherited from a parent team.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val projectId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the project.
try {
    val result : TeamProject = apiInstance.teamsCheckPermissionsForProjectLegacy(teamId, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsCheckPermissionsForProjectLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsCheckPermissionsForProjectLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **projectId** | **kotlin.Int**| The unique identifier of the project. |

### Return type

[**TeamProject**](TeamProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsCheckPermissionsForRepoInOrg"></a>
# **teamsCheckPermissionsForRepoInOrg**
> TeamRepository teamsCheckPermissionsForRepoInOrg(org, teamSlug, owner, repo)

Check team permissions for a repository

Checks whether a team has &#x60;admin&#x60;, &#x60;push&#x60;, &#x60;maintain&#x60;, &#x60;triage&#x60;, or &#x60;pull&#x60; permission for a repository. Repositories inherited through a parent team will also be checked.  You can also get information about the specified repository, including what permissions the team grants on it, by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the &#x60;application/vnd.github.v3.repository+json&#x60; accept header.  If a team doesn&#39;t have permission for the repository, you will receive a &#x60;404 Not Found&#x60; response status.  If the repository is private, you must have at least &#x60;read&#x60; permission for that repository, and your token must have the &#x60;repo&#x60; or &#x60;admin:org&#x60; scope. Otherwise, you will receive a &#x60;404 Not Found&#x60; response status.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/repos/{owner}/{repo}&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : TeamRepository = apiInstance.teamsCheckPermissionsForRepoInOrg(org, teamSlug, owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsCheckPermissionsForRepoInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsCheckPermissionsForRepoInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**TeamRepository**](TeamRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsCheckPermissionsForRepoLegacy"></a>
# **teamsCheckPermissionsForRepoLegacy**
> TeamRepository teamsCheckPermissionsForRepoLegacy(teamId, owner, repo)

Check team permissions for a repository (Legacy)

**Note**: Repositories inherited through a parent team will also be checked.  **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Check team permissions for a repository](https://docs.github.com/rest/teams/teams#check-team-permissions-for-a-repository) endpoint.  You can also get information about the specified repository, including what permissions the team grants on it, by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the &#x60;Accept&#x60; header:

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : TeamRepository = apiInstance.teamsCheckPermissionsForRepoLegacy(teamId, owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsCheckPermissionsForRepoLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsCheckPermissionsForRepoLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**TeamRepository**](TeamRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsCreate"></a>
# **teamsCreate**
> TeamFull teamsCreate(org, teamsCreateRequest)

Create a team

To create a team, the authenticated user must be a member or owner of &#x60;{org}&#x60;. By default, organization members can create teams. Organization owners can limit team creation to organization owners. For more information, see \&quot;[Setting team creation permissions](https://docs.github.com/articles/setting-team-creation-permissions-in-your-organization).\&quot;  When you create a new team, you automatically become a team maintainer without explicitly adding yourself to the optional array of &#x60;maintainers&#x60;. For more information, see \&quot;[About teams](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/about-teams)\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamsCreateRequest : TeamsCreateRequest = {"name":"Justice League","description":"A great team","permission":"push","notification_setting":"notifications_enabled","privacy":"closed"} // TeamsCreateRequest | 
try {
    val result : TeamFull = apiInstance.teamsCreate(org, teamsCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamsCreateRequest** | [**TeamsCreateRequest**](TeamsCreateRequest.md)|  |

### Return type

[**TeamFull**](TeamFull.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="teamsCreateDiscussionCommentInOrg"></a>
# **teamsCreateDiscussionCommentInOrg**
> TeamDiscussionComment teamsCreateDiscussionCommentInOrg(org, teamSlug, discussionNumber, teamsCreateDiscussionCommentInOrgRequest)

Create a discussion comment

Creates a new comment on a team discussion.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information, see \&quot;[Rate limits for the API](https://docs.github.com/rest/overview/rate-limits-for-the-rest-api#about-secondary-rate-limits)\&quot; and \&quot;[Best practices for using the REST API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api).\&quot;  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;POST /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val teamsCreateDiscussionCommentInOrgRequest : TeamsCreateDiscussionCommentInOrgRequest = {"body":"Do you like apples?"} // TeamsCreateDiscussionCommentInOrgRequest | 
try {
    val result : TeamDiscussionComment = apiInstance.teamsCreateDiscussionCommentInOrg(org, teamSlug, discussionNumber, teamsCreateDiscussionCommentInOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsCreateDiscussionCommentInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsCreateDiscussionCommentInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **teamsCreateDiscussionCommentInOrgRequest** | [**TeamsCreateDiscussionCommentInOrgRequest**](TeamsCreateDiscussionCommentInOrgRequest.md)|  |

### Return type

[**TeamDiscussionComment**](TeamDiscussionComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="teamsCreateDiscussionCommentLegacy"></a>
# **teamsCreateDiscussionCommentLegacy**
> TeamDiscussionComment teamsCreateDiscussionCommentLegacy(teamId, discussionNumber, teamsCreateDiscussionCommentInOrgRequest)

Create a discussion comment (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Create a discussion comment](https://docs.github.com/rest/teams/discussion-comments#create-a-discussion-comment) endpoint.  Creates a new comment on a team discussion.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information, see \&quot;[Rate limits for the API](https://docs.github.com/rest/overview/rate-limits-for-the-rest-api#about-secondary-rate-limits)\&quot; and \&quot;[Best practices for using the REST API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val teamsCreateDiscussionCommentInOrgRequest : TeamsCreateDiscussionCommentInOrgRequest = {body=Do you like apples?} // TeamsCreateDiscussionCommentInOrgRequest | 
try {
    val result : TeamDiscussionComment = apiInstance.teamsCreateDiscussionCommentLegacy(teamId, discussionNumber, teamsCreateDiscussionCommentInOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsCreateDiscussionCommentLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsCreateDiscussionCommentLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **teamsCreateDiscussionCommentInOrgRequest** | [**TeamsCreateDiscussionCommentInOrgRequest**](TeamsCreateDiscussionCommentInOrgRequest.md)|  |

### Return type

[**TeamDiscussionComment**](TeamDiscussionComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="teamsCreateDiscussionInOrg"></a>
# **teamsCreateDiscussionInOrg**
> TeamDiscussion teamsCreateDiscussionInOrg(org, teamSlug, teamsCreateDiscussionInOrgRequest)

Create a discussion

Creates a new discussion post on a team&#39;s page.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information, see \&quot;[Rate limits for the API](https://docs.github.com/rest/overview/rate-limits-for-the-rest-api#about-secondary-rate-limits)\&quot; and \&quot;[Best practices for using the REST API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api).\&quot;  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;POST /organizations/{org_id}/team/{team_id}/discussions&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val teamsCreateDiscussionInOrgRequest : TeamsCreateDiscussionInOrgRequest = {"title":"Our first team post","body":"Hi! This is an area for us to collaborate as a team."} // TeamsCreateDiscussionInOrgRequest | 
try {
    val result : TeamDiscussion = apiInstance.teamsCreateDiscussionInOrg(org, teamSlug, teamsCreateDiscussionInOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsCreateDiscussionInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsCreateDiscussionInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **teamsCreateDiscussionInOrgRequest** | [**TeamsCreateDiscussionInOrgRequest**](TeamsCreateDiscussionInOrgRequest.md)|  |

### Return type

[**TeamDiscussion**](TeamDiscussion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="teamsCreateDiscussionLegacy"></a>
# **teamsCreateDiscussionLegacy**
> TeamDiscussion teamsCreateDiscussionLegacy(teamId, teamsCreateDiscussionInOrgRequest)

Create a discussion (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;Create a discussion&#x60;](https://docs.github.com/rest/teams/discussions#create-a-discussion) endpoint.  Creates a new discussion post on a team&#39;s page.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information, see \&quot;[Rate limits for the API](https://docs.github.com/rest/overview/rate-limits-for-the-rest-api#about-secondary-rate-limits)\&quot; and \&quot;[Best practices for using the REST API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val teamsCreateDiscussionInOrgRequest : TeamsCreateDiscussionInOrgRequest = {title=Our first team post, body=Hi! This is an area for us to collaborate as a team.} // TeamsCreateDiscussionInOrgRequest | 
try {
    val result : TeamDiscussion = apiInstance.teamsCreateDiscussionLegacy(teamId, teamsCreateDiscussionInOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsCreateDiscussionLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsCreateDiscussionLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **teamsCreateDiscussionInOrgRequest** | [**TeamsCreateDiscussionInOrgRequest**](TeamsCreateDiscussionInOrgRequest.md)|  |

### Return type

[**TeamDiscussion**](TeamDiscussion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="teamsDeleteDiscussionCommentInOrg"></a>
# **teamsDeleteDiscussionCommentInOrg**
> teamsDeleteDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber)

Delete a discussion comment

Deletes a comment on a team discussion.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;DELETE /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments/{comment_number}&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val commentNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the comment.
try {
    apiInstance.teamsDeleteDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsDeleteDiscussionCommentInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsDeleteDiscussionCommentInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **commentNumber** | **kotlin.Int**| The number that identifies the comment. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="teamsDeleteDiscussionCommentLegacy"></a>
# **teamsDeleteDiscussionCommentLegacy**
> teamsDeleteDiscussionCommentLegacy(teamId, discussionNumber, commentNumber)

Delete a discussion comment (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Delete a discussion comment](https://docs.github.com/rest/teams/discussion-comments#delete-a-discussion-comment) endpoint.  Deletes a comment on a team discussion.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val commentNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the comment.
try {
    apiInstance.teamsDeleteDiscussionCommentLegacy(teamId, discussionNumber, commentNumber)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsDeleteDiscussionCommentLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsDeleteDiscussionCommentLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **commentNumber** | **kotlin.Int**| The number that identifies the comment. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="teamsDeleteDiscussionInOrg"></a>
# **teamsDeleteDiscussionInOrg**
> teamsDeleteDiscussionInOrg(org, teamSlug, discussionNumber)

Delete a discussion

Delete a discussion from a team&#39;s page.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;DELETE /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
try {
    apiInstance.teamsDeleteDiscussionInOrg(org, teamSlug, discussionNumber)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsDeleteDiscussionInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsDeleteDiscussionInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="teamsDeleteDiscussionLegacy"></a>
# **teamsDeleteDiscussionLegacy**
> teamsDeleteDiscussionLegacy(teamId, discussionNumber)

Delete a discussion (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;Delete a discussion&#x60;](https://docs.github.com/rest/teams/discussions#delete-a-discussion) endpoint.  Delete a discussion from a team&#39;s page.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
try {
    apiInstance.teamsDeleteDiscussionLegacy(teamId, discussionNumber)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsDeleteDiscussionLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsDeleteDiscussionLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="teamsDeleteInOrg"></a>
# **teamsDeleteInOrg**
> teamsDeleteInOrg(org, teamSlug)

Delete a team

To delete a team, the authenticated user must be an organization owner or team maintainer.  If you are an organization owner, deleting a parent team will delete all of its child teams as well.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;DELETE /organizations/{org_id}/team/{team_id}&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
try {
    apiInstance.teamsDeleteInOrg(org, teamSlug)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsDeleteInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsDeleteInOrg")
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

<a id="teamsDeleteLegacy"></a>
# **teamsDeleteLegacy**
> teamsDeleteLegacy(teamId)

Delete a team (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Delete a team](https://docs.github.com/rest/teams/teams#delete-a-team) endpoint.  To delete a team, the authenticated user must be an organization owner or team maintainer.  If you are an organization owner, deleting a parent team will delete all of its child teams as well.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
try {
    apiInstance.teamsDeleteLegacy(teamId)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsDeleteLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsDeleteLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsGetByName"></a>
# **teamsGetByName**
> TeamFull teamsGetByName(org, teamSlug)

Get a team by name

Gets a team using the team&#39;s &#x60;slug&#x60;. To create the &#x60;slug&#x60;, GitHub replaces special characters in the &#x60;name&#x60; string, changes all words to lowercase, and replaces spaces with a &#x60;-&#x60; separator. For example, &#x60;\&quot;My TEam Näme\&quot;&#x60; would become &#x60;my-team-name&#x60;.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
try {
    val result : TeamFull = apiInstance.teamsGetByName(org, teamSlug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsGetByName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsGetByName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |

### Return type

[**TeamFull**](TeamFull.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsGetDiscussionCommentInOrg"></a>
# **teamsGetDiscussionCommentInOrg**
> TeamDiscussionComment teamsGetDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber)

Get a discussion comment

Get a specific comment on a team discussion.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments/{comment_number}&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val commentNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the comment.
try {
    val result : TeamDiscussionComment = apiInstance.teamsGetDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsGetDiscussionCommentInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsGetDiscussionCommentInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **commentNumber** | **kotlin.Int**| The number that identifies the comment. |

### Return type

[**TeamDiscussionComment**](TeamDiscussionComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsGetDiscussionCommentLegacy"></a>
# **teamsGetDiscussionCommentLegacy**
> TeamDiscussionComment teamsGetDiscussionCommentLegacy(teamId, discussionNumber, commentNumber)

Get a discussion comment (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Get a discussion comment](https://docs.github.com/rest/teams/discussion-comments#get-a-discussion-comment) endpoint.  Get a specific comment on a team discussion.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val commentNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the comment.
try {
    val result : TeamDiscussionComment = apiInstance.teamsGetDiscussionCommentLegacy(teamId, discussionNumber, commentNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsGetDiscussionCommentLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsGetDiscussionCommentLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **commentNumber** | **kotlin.Int**| The number that identifies the comment. |

### Return type

[**TeamDiscussionComment**](TeamDiscussionComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsGetDiscussionInOrg"></a>
# **teamsGetDiscussionInOrg**
> TeamDiscussion teamsGetDiscussionInOrg(org, teamSlug, discussionNumber)

Get a discussion

Get a specific discussion on a team&#39;s page.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
try {
    val result : TeamDiscussion = apiInstance.teamsGetDiscussionInOrg(org, teamSlug, discussionNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsGetDiscussionInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsGetDiscussionInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |

### Return type

[**TeamDiscussion**](TeamDiscussion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsGetDiscussionLegacy"></a>
# **teamsGetDiscussionLegacy**
> TeamDiscussion teamsGetDiscussionLegacy(teamId, discussionNumber)

Get a discussion (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Get a discussion](https://docs.github.com/rest/teams/discussions#get-a-discussion) endpoint.  Get a specific discussion on a team&#39;s page.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
try {
    val result : TeamDiscussion = apiInstance.teamsGetDiscussionLegacy(teamId, discussionNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsGetDiscussionLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsGetDiscussionLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |

### Return type

[**TeamDiscussion**](TeamDiscussion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsGetLegacy"></a>
# **teamsGetLegacy**
> TeamFull teamsGetLegacy(teamId)

Get a team (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the [Get a team by name](https://docs.github.com/rest/teams/teams#get-a-team-by-name) endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
try {
    val result : TeamFull = apiInstance.teamsGetLegacy(teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsGetLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsGetLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |

### Return type

[**TeamFull**](TeamFull.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsGetMemberLegacy"></a>
# **teamsGetMemberLegacy**
> teamsGetMemberLegacy(teamId, username)

Get team member (Legacy)

The \&quot;Get team member\&quot; endpoint (described below) is deprecated.  We recommend using the [Get team membership for a user](https://docs.github.com/rest/teams/members#get-team-membership-for-a-user) endpoint instead. It allows you to get both active and pending memberships.  To list members in a team, the team must be visible to the authenticated user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.teamsGetMemberLegacy(teamId, username)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsGetMemberLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsGetMemberLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="teamsGetMembershipForUserInOrg"></a>
# **teamsGetMembershipForUserInOrg**
> TeamMembership teamsGetMembershipForUserInOrg(org, teamSlug, username)

Get team membership for a user

Team members will include the members of child teams.  To get a user&#39;s membership with a team, the team must be visible to the authenticated user.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/memberships/{username}&#x60;.  **Note:** The response contains the &#x60;state&#x60; of the membership and the member&#39;s &#x60;role&#x60;.  The &#x60;role&#x60; for organization owners is set to &#x60;maintainer&#x60;. For more information about &#x60;maintainer&#x60; roles, see [Create a team](https://docs.github.com/rest/teams/teams#create-a-team).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    val result : TeamMembership = apiInstance.teamsGetMembershipForUserInOrg(org, teamSlug, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsGetMembershipForUserInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsGetMembershipForUserInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

[**TeamMembership**](TeamMembership.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsGetMembershipForUserLegacy"></a>
# **teamsGetMembershipForUserLegacy**
> TeamMembership teamsGetMembershipForUserLegacy(teamId, username)

Get team membership for a user (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Get team membership for a user](https://docs.github.com/rest/teams/members#get-team-membership-for-a-user) endpoint.  Team members will include the members of child teams.  To get a user&#39;s membership with a team, the team must be visible to the authenticated user.  **Note:** The response contains the &#x60;state&#x60; of the membership and the member&#39;s &#x60;role&#x60;.  The &#x60;role&#x60; for organization owners is set to &#x60;maintainer&#x60;. For more information about &#x60;maintainer&#x60; roles, see [Create a team](https://docs.github.com/rest/teams/teams#create-a-team).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    val result : TeamMembership = apiInstance.teamsGetMembershipForUserLegacy(teamId, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsGetMembershipForUserLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsGetMembershipForUserLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

[**TeamMembership**](TeamMembership.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsList"></a>
# **teamsList**
> kotlin.collections.List&lt;Team&gt; teamsList(org, perPage, page)

List teams

Lists all teams in an organization that are visible to the authenticated user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Team> = apiInstance.teamsList(org, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsList")
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

[**kotlin.collections.List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsListChildInOrg"></a>
# **teamsListChildInOrg**
> kotlin.collections.List&lt;Team&gt; teamsListChildInOrg(org, teamSlug, perPage, page)

List child teams

Lists the child teams of the team specified by &#x60;{team_slug}&#x60;.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/teams&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Team> = apiInstance.teamsListChildInOrg(org, teamSlug, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsListChildInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsListChildInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsListChildLegacy"></a>
# **teamsListChildLegacy**
> kotlin.collections.List&lt;Team&gt; teamsListChildLegacy(teamId, perPage, page)

List child teams (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;List child teams&#x60;](https://docs.github.com/rest/teams/teams#list-child-teams) endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Team> = apiInstance.teamsListChildLegacy(teamId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsListChildLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsListChildLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsListDiscussionCommentsInOrg"></a>
# **teamsListDiscussionCommentsInOrg**
> kotlin.collections.List&lt;TeamDiscussionComment&gt; teamsListDiscussionCommentsInOrg(org, teamSlug, discussionNumber, direction, perPage, page)

List discussion comments

List all comments on a team discussion.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<TeamDiscussionComment> = apiInstance.teamsListDiscussionCommentsInOrg(org, teamSlug, discussionNumber, direction, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsListDiscussionCommentsInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsListDiscussionCommentsInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;TeamDiscussionComment&gt;**](TeamDiscussionComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsListDiscussionCommentsLegacy"></a>
# **teamsListDiscussionCommentsLegacy**
> kotlin.collections.List&lt;TeamDiscussionComment&gt; teamsListDiscussionCommentsLegacy(teamId, discussionNumber, direction, perPage, page)

List discussion comments (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [List discussion comments](https://docs.github.com/rest/teams/discussion-comments#list-discussion-comments) endpoint.  List all comments on a team discussion.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<TeamDiscussionComment> = apiInstance.teamsListDiscussionCommentsLegacy(teamId, discussionNumber, direction, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsListDiscussionCommentsLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsListDiscussionCommentsLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;TeamDiscussionComment&gt;**](TeamDiscussionComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsListDiscussionsInOrg"></a>
# **teamsListDiscussionsInOrg**
> kotlin.collections.List&lt;TeamDiscussion&gt; teamsListDiscussionsInOrg(org, teamSlug, direction, perPage, page, pinned)

List discussions

List all discussions on a team&#39;s page.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/discussions&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val pinned : kotlin.String = pinned_example // kotlin.String | Pinned discussions only filter
try {
    val result : kotlin.collections.List<TeamDiscussion> = apiInstance.teamsListDiscussionsInOrg(org, teamSlug, direction, perPage, page, pinned)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsListDiscussionsInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsListDiscussionsInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **pinned** | **kotlin.String**| Pinned discussions only filter | [optional] [default to &quot;push&quot;]

### Return type

[**kotlin.collections.List&lt;TeamDiscussion&gt;**](TeamDiscussion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsListDiscussionsLegacy"></a>
# **teamsListDiscussionsLegacy**
> kotlin.collections.List&lt;TeamDiscussion&gt; teamsListDiscussionsLegacy(teamId, direction, perPage, page)

List discussions (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;List discussions&#x60;](https://docs.github.com/rest/teams/discussions#list-discussions) endpoint.  List all discussions on a team&#39;s page.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<TeamDiscussion> = apiInstance.teamsListDiscussionsLegacy(teamId, direction, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsListDiscussionsLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsListDiscussionsLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;TeamDiscussion&gt;**](TeamDiscussion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsListForAuthenticatedUser"></a>
# **teamsListForAuthenticatedUser**
> kotlin.collections.List&lt;TeamFull&gt; teamsListForAuthenticatedUser(perPage, page)

List teams for the authenticated user

List all of the teams across all of the organizations to which the authenticated user belongs.  OAuth app tokens and personal access tokens (classic) need the &#x60;user&#x60;, &#x60;repo&#x60;, or &#x60;read:org&#x60; scope to use this endpoint.  When using a fine-grained personal access token, the resource owner of the token must be a single organization, and the response will only include the teams from that organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<TeamFull> = apiInstance.teamsListForAuthenticatedUser(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsListForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsListForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;TeamFull&gt;**](TeamFull.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsListMembersInOrg"></a>
# **teamsListMembersInOrg**
> kotlin.collections.List&lt;SimpleUser&gt; teamsListMembersInOrg(org, teamSlug, role, perPage, page)

List team members

Team members will include the members of child teams.  To list members in a team, the team must be visible to the authenticated user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val role : kotlin.String = role_example // kotlin.String | Filters members returned by their role in the team.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.teamsListMembersInOrg(org, teamSlug, role, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsListMembersInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsListMembersInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **role** | **kotlin.String**| Filters members returned by their role in the team. | [optional] [default to all] [enum: member, maintainer, all]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsListMembersLegacy"></a>
# **teamsListMembersLegacy**
> kotlin.collections.List&lt;SimpleUser&gt; teamsListMembersLegacy(teamId, role, perPage, page)

List team members (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;List team members&#x60;](https://docs.github.com/rest/teams/members#list-team-members) endpoint.  Team members will include the members of child teams.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val role : kotlin.String = role_example // kotlin.String | Filters members returned by their role in the team.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.teamsListMembersLegacy(teamId, role, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsListMembersLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsListMembersLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **role** | **kotlin.String**| Filters members returned by their role in the team. | [optional] [default to all] [enum: member, maintainer, all]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsListPendingInvitationsInOrg"></a>
# **teamsListPendingInvitationsInOrg**
> kotlin.collections.List&lt;OrganizationInvitation&gt; teamsListPendingInvitationsInOrg(org, teamSlug, perPage, page)

List pending team invitations

The return hash contains a &#x60;role&#x60; field which refers to the Organization Invitation role and will be one of the following values: &#x60;direct_member&#x60;, &#x60;admin&#x60;, &#x60;billing_manager&#x60;, &#x60;hiring_manager&#x60;, or &#x60;reinstate&#x60;. If the invitee is not a GitHub member, the &#x60;login&#x60; field in the return hash will be &#x60;null&#x60;.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/invitations&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<OrganizationInvitation> = apiInstance.teamsListPendingInvitationsInOrg(org, teamSlug, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsListPendingInvitationsInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsListPendingInvitationsInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;OrganizationInvitation&gt;**](OrganizationInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsListPendingInvitationsLegacy"></a>
# **teamsListPendingInvitationsLegacy**
> kotlin.collections.List&lt;OrganizationInvitation&gt; teamsListPendingInvitationsLegacy(teamId, perPage, page)

List pending team invitations (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;List pending team invitations&#x60;](https://docs.github.com/rest/teams/members#list-pending-team-invitations) endpoint.  The return hash contains a &#x60;role&#x60; field which refers to the Organization Invitation role and will be one of the following values: &#x60;direct_member&#x60;, &#x60;admin&#x60;, &#x60;billing_manager&#x60;, &#x60;hiring_manager&#x60;, or &#x60;reinstate&#x60;. If the invitee is not a GitHub member, the &#x60;login&#x60; field in the return hash will be &#x60;null&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<OrganizationInvitation> = apiInstance.teamsListPendingInvitationsLegacy(teamId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsListPendingInvitationsLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsListPendingInvitationsLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;OrganizationInvitation&gt;**](OrganizationInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsListProjectsInOrg"></a>
# **teamsListProjectsInOrg**
> kotlin.collections.List&lt;TeamProject&gt; teamsListProjectsInOrg(org, teamSlug, perPage, page)

List team projects

Lists the organization projects for a team.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/projects&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<TeamProject> = apiInstance.teamsListProjectsInOrg(org, teamSlug, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsListProjectsInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsListProjectsInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;TeamProject&gt;**](TeamProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsListProjectsLegacy"></a>
# **teamsListProjectsLegacy**
> kotlin.collections.List&lt;TeamProject&gt; teamsListProjectsLegacy(teamId, perPage, page)

List team projects (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;List team projects&#x60;](https://docs.github.com/rest/teams/teams#list-team-projects) endpoint.  Lists the organization projects for a team.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<TeamProject> = apiInstance.teamsListProjectsLegacy(teamId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsListProjectsLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsListProjectsLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;TeamProject&gt;**](TeamProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsListReposInOrg"></a>
# **teamsListReposInOrg**
> kotlin.collections.List&lt;MinimalRepository&gt; teamsListReposInOrg(org, teamSlug, perPage, page)

List team repositories

Lists a team&#39;s repositories visible to the authenticated user.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/{org_id}/team/{team_id}/repos&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<MinimalRepository> = apiInstance.teamsListReposInOrg(org, teamSlug, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsListReposInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsListReposInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsListReposLegacy"></a>
# **teamsListReposLegacy**
> kotlin.collections.List&lt;MinimalRepository&gt; teamsListReposLegacy(teamId, perPage, page)

List team repositories (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [List team repositories](https://docs.github.com/rest/teams/teams#list-team-repositories) endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<MinimalRepository> = apiInstance.teamsListReposLegacy(teamId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsListReposLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsListReposLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsRemoveMemberLegacy"></a>
# **teamsRemoveMemberLegacy**
> teamsRemoveMemberLegacy(teamId, username)

Remove team member (Legacy)

The \&quot;Remove team member\&quot; endpoint (described below) is deprecated.  We recommend using the [Remove team membership for a user](https://docs.github.com/rest/teams/members#remove-team-membership-for-a-user) endpoint instead. It allows you to remove both active and pending memberships.  Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  To remove a team member, the authenticated user must have &#39;admin&#39; permissions to the team or be an owner of the org that the team is associated with. Removing a team member does not delete the user, it just removes them from the team.  **Note:** When you have team synchronization set up for a team with your organization&#39;s identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team&#39;s membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see \&quot;[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.teamsRemoveMemberLegacy(teamId, username)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsRemoveMemberLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsRemoveMemberLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="teamsRemoveMembershipForUserInOrg"></a>
# **teamsRemoveMembershipForUserInOrg**
> teamsRemoveMembershipForUserInOrg(org, teamSlug, username)

Remove team membership for a user

To remove a membership between a user and a team, the authenticated user must have &#39;admin&#39; permissions to the team or be an owner of the organization that the team is associated with. Removing team membership does not delete the user, it just removes their membership from the team.  Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  **Note:** When you have team synchronization set up for a team with your organization&#39;s identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team&#39;s membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see \&quot;[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/).\&quot;  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;DELETE /organizations/{org_id}/team/{team_id}/memberships/{username}&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.teamsRemoveMembershipForUserInOrg(org, teamSlug, username)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsRemoveMembershipForUserInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsRemoveMembershipForUserInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="teamsRemoveMembershipForUserLegacy"></a>
# **teamsRemoveMembershipForUserLegacy**
> teamsRemoveMembershipForUserLegacy(teamId, username)

Remove team membership for a user (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Remove team membership for a user](https://docs.github.com/rest/teams/members#remove-team-membership-for-a-user) endpoint.  Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  To remove a membership between a user and a team, the authenticated user must have &#39;admin&#39; permissions to the team or be an owner of the organization that the team is associated with. Removing team membership does not delete the user, it just removes their membership from the team.  **Note:** When you have team synchronization set up for a team with your organization&#39;s identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team&#39;s membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see \&quot;[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.teamsRemoveMembershipForUserLegacy(teamId, username)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsRemoveMembershipForUserLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsRemoveMembershipForUserLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="teamsRemoveProjectInOrg"></a>
# **teamsRemoveProjectInOrg**
> teamsRemoveProjectInOrg(org, teamSlug, projectId)

Remove a project from a team

Removes an organization project from a team. An organization owner or a team maintainer can remove any project from the team. To remove a project from a team as an organization member, the authenticated user must have &#x60;read&#x60; access to both the team and project, or &#x60;admin&#x60; access to the team or project. This endpoint removes the project from the team, but does not delete the project.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;DELETE /organizations/{org_id}/team/{team_id}/projects/{project_id}&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val projectId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the project.
try {
    apiInstance.teamsRemoveProjectInOrg(org, teamSlug, projectId)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsRemoveProjectInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsRemoveProjectInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **projectId** | **kotlin.Int**| The unique identifier of the project. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="teamsRemoveProjectLegacy"></a>
# **teamsRemoveProjectLegacy**
> teamsRemoveProjectLegacy(teamId, projectId)

Remove a project from a team (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Remove a project from a team](https://docs.github.com/rest/teams/teams#remove-a-project-from-a-team) endpoint.  Removes an organization project from a team. An organization owner or a team maintainer can remove any project from the team. To remove a project from a team as an organization member, the authenticated user must have &#x60;read&#x60; access to both the team and project, or &#x60;admin&#x60; access to the team or project. **Note:** This endpoint removes the project from the team, but does not delete it.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val projectId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the project.
try {
    apiInstance.teamsRemoveProjectLegacy(teamId, projectId)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsRemoveProjectLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsRemoveProjectLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **projectId** | **kotlin.Int**| The unique identifier of the project. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="teamsRemoveRepoInOrg"></a>
# **teamsRemoveRepoInOrg**
> teamsRemoveRepoInOrg(org, teamSlug, owner, repo)

Remove a repository from a team

If the authenticated user is an organization owner or a team maintainer, they can remove any repositories from the team. To remove a repository from a team as an organization member, the authenticated user must have admin access to the repository and must be able to see the team. This does not delete the repository, it just removes it from the team.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;DELETE /organizations/{org_id}/team/{team_id}/repos/{owner}/{repo}&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    apiInstance.teamsRemoveRepoInOrg(org, teamSlug, owner, repo)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsRemoveRepoInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsRemoveRepoInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="teamsRemoveRepoLegacy"></a>
# **teamsRemoveRepoLegacy**
> teamsRemoveRepoLegacy(teamId, owner, repo)

Remove a repository from a team (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Remove a repository from a team](https://docs.github.com/rest/teams/teams#remove-a-repository-from-a-team) endpoint.  If the authenticated user is an organization owner or a team maintainer, they can remove any repositories from the team. To remove a repository from a team as an organization member, the authenticated user must have admin access to the repository and must be able to see the team. NOTE: This does not delete the repository, it just removes it from the team.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    apiInstance.teamsRemoveRepoLegacy(teamId, owner, repo)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsRemoveRepoLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsRemoveRepoLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="teamsUpdateDiscussionCommentInOrg"></a>
# **teamsUpdateDiscussionCommentInOrg**
> TeamDiscussionComment teamsUpdateDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber, teamsCreateDiscussionCommentInOrgRequest)

Update a discussion comment

Edits the body text of a discussion comment.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;PATCH /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments/{comment_number}&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val commentNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the comment.
val teamsCreateDiscussionCommentInOrgRequest : TeamsCreateDiscussionCommentInOrgRequest = {"body":"Do you like pineapples?"} // TeamsCreateDiscussionCommentInOrgRequest | 
try {
    val result : TeamDiscussionComment = apiInstance.teamsUpdateDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber, teamsCreateDiscussionCommentInOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsUpdateDiscussionCommentInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsUpdateDiscussionCommentInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **commentNumber** | **kotlin.Int**| The number that identifies the comment. |
 **teamsCreateDiscussionCommentInOrgRequest** | [**TeamsCreateDiscussionCommentInOrgRequest**](TeamsCreateDiscussionCommentInOrgRequest.md)|  |

### Return type

[**TeamDiscussionComment**](TeamDiscussionComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="teamsUpdateDiscussionCommentLegacy"></a>
# **teamsUpdateDiscussionCommentLegacy**
> TeamDiscussionComment teamsUpdateDiscussionCommentLegacy(teamId, discussionNumber, commentNumber, teamsCreateDiscussionCommentInOrgRequest)

Update a discussion comment (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Update a discussion comment](https://docs.github.com/rest/teams/discussion-comments#update-a-discussion-comment) endpoint.  Edits the body text of a discussion comment.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val commentNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the comment.
val teamsCreateDiscussionCommentInOrgRequest : TeamsCreateDiscussionCommentInOrgRequest = {body=Do you like pineapples?} // TeamsCreateDiscussionCommentInOrgRequest | 
try {
    val result : TeamDiscussionComment = apiInstance.teamsUpdateDiscussionCommentLegacy(teamId, discussionNumber, commentNumber, teamsCreateDiscussionCommentInOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsUpdateDiscussionCommentLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsUpdateDiscussionCommentLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **commentNumber** | **kotlin.Int**| The number that identifies the comment. |
 **teamsCreateDiscussionCommentInOrgRequest** | [**TeamsCreateDiscussionCommentInOrgRequest**](TeamsCreateDiscussionCommentInOrgRequest.md)|  |

### Return type

[**TeamDiscussionComment**](TeamDiscussionComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="teamsUpdateDiscussionInOrg"></a>
# **teamsUpdateDiscussionInOrg**
> TeamDiscussion teamsUpdateDiscussionInOrg(org, teamSlug, discussionNumber, teamsUpdateDiscussionInOrgRequest)

Update a discussion

Edits the title and body text of a discussion post. Only the parameters you provide are updated.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;PATCH /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val teamsUpdateDiscussionInOrgRequest : TeamsUpdateDiscussionInOrgRequest = {"title":"Welcome to our first team post"} // TeamsUpdateDiscussionInOrgRequest | 
try {
    val result : TeamDiscussion = apiInstance.teamsUpdateDiscussionInOrg(org, teamSlug, discussionNumber, teamsUpdateDiscussionInOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsUpdateDiscussionInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsUpdateDiscussionInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **teamsUpdateDiscussionInOrgRequest** | [**TeamsUpdateDiscussionInOrgRequest**](TeamsUpdateDiscussionInOrgRequest.md)|  | [optional]

### Return type

[**TeamDiscussion**](TeamDiscussion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="teamsUpdateDiscussionLegacy"></a>
# **teamsUpdateDiscussionLegacy**
> TeamDiscussion teamsUpdateDiscussionLegacy(teamId, discussionNumber, teamsUpdateDiscussionInOrgRequest)

Update a discussion (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Update a discussion](https://docs.github.com/rest/teams/discussions#update-a-discussion) endpoint.  Edits the title and body text of a discussion post. Only the parameters you provide are updated.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val teamsUpdateDiscussionInOrgRequest : TeamsUpdateDiscussionInOrgRequest = {title=Welcome to our first team post} // TeamsUpdateDiscussionInOrgRequest | 
try {
    val result : TeamDiscussion = apiInstance.teamsUpdateDiscussionLegacy(teamId, discussionNumber, teamsUpdateDiscussionInOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsUpdateDiscussionLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsUpdateDiscussionLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **teamsUpdateDiscussionInOrgRequest** | [**TeamsUpdateDiscussionInOrgRequest**](TeamsUpdateDiscussionInOrgRequest.md)|  | [optional]

### Return type

[**TeamDiscussion**](TeamDiscussion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="teamsUpdateInOrg"></a>
# **teamsUpdateInOrg**
> TeamFull teamsUpdateInOrg(org, teamSlug, teamsUpdateInOrgRequest)

Update a team

To edit a team, the authenticated user must either be an organization owner or a team maintainer.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;PATCH /organizations/{org_id}/team/{team_id}&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val teamsUpdateInOrgRequest : TeamsUpdateInOrgRequest = {"name":"new team name","description":"new team description","privacy":"closed","notification_setting":"notifications_enabled"} // TeamsUpdateInOrgRequest | 
try {
    val result : TeamFull = apiInstance.teamsUpdateInOrg(org, teamSlug, teamsUpdateInOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsUpdateInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsUpdateInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **teamsUpdateInOrgRequest** | [**TeamsUpdateInOrgRequest**](TeamsUpdateInOrgRequest.md)|  | [optional]

### Return type

[**TeamFull**](TeamFull.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="teamsUpdateLegacy"></a>
# **teamsUpdateLegacy**
> TeamFull teamsUpdateLegacy(teamId, teamsUpdateLegacyRequest)

Update a team (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Update a team](https://docs.github.com/rest/teams/teams#update-a-team) endpoint.  To edit a team, the authenticated user must either be an organization owner or a team maintainer.  **Note:** With nested teams, the &#x60;privacy&#x60; for parent teams cannot be &#x60;secret&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val teamsUpdateLegacyRequest : TeamsUpdateLegacyRequest = {name=new team name, description=new team description, privacy=closed, notification_setting=notifications_enabled} // TeamsUpdateLegacyRequest | 
try {
    val result : TeamFull = apiInstance.teamsUpdateLegacy(teamId, teamsUpdateLegacyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsUpdateLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsUpdateLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **teamsUpdateLegacyRequest** | [**TeamsUpdateLegacyRequest**](TeamsUpdateLegacyRequest.md)|  |

### Return type

[**TeamFull**](TeamFull.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

