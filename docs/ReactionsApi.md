# ReactionsApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reactionsCreateForCommitComment**](ReactionsApi.md#reactionsCreateForCommitComment) | **POST** /repos/{owner}/{repo}/comments/{comment_id}/reactions | Create reaction for a commit comment
[**reactionsCreateForIssue**](ReactionsApi.md#reactionsCreateForIssue) | **POST** /repos/{owner}/{repo}/issues/{issue_number}/reactions | Create reaction for an issue
[**reactionsCreateForIssueComment**](ReactionsApi.md#reactionsCreateForIssueComment) | **POST** /repos/{owner}/{repo}/issues/comments/{comment_id}/reactions | Create reaction for an issue comment
[**reactionsCreateForPullRequestReviewComment**](ReactionsApi.md#reactionsCreateForPullRequestReviewComment) | **POST** /repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions | Create reaction for a pull request review comment
[**reactionsCreateForRelease**](ReactionsApi.md#reactionsCreateForRelease) | **POST** /repos/{owner}/{repo}/releases/{release_id}/reactions | Create reaction for a release
[**reactionsCreateForTeamDiscussionCommentInOrg**](ReactionsApi.md#reactionsCreateForTeamDiscussionCommentInOrg) | **POST** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions | Create reaction for a team discussion comment
[**reactionsCreateForTeamDiscussionCommentLegacy**](ReactionsApi.md#reactionsCreateForTeamDiscussionCommentLegacy) | **POST** /teams/{team_id}/discussions/{discussion_number}/comments/{comment_number}/reactions | Create reaction for a team discussion comment (Legacy)
[**reactionsCreateForTeamDiscussionInOrg**](ReactionsApi.md#reactionsCreateForTeamDiscussionInOrg) | **POST** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions | Create reaction for a team discussion
[**reactionsCreateForTeamDiscussionLegacy**](ReactionsApi.md#reactionsCreateForTeamDiscussionLegacy) | **POST** /teams/{team_id}/discussions/{discussion_number}/reactions | Create reaction for a team discussion (Legacy)
[**reactionsDeleteForCommitComment**](ReactionsApi.md#reactionsDeleteForCommitComment) | **DELETE** /repos/{owner}/{repo}/comments/{comment_id}/reactions/{reaction_id} | Delete a commit comment reaction
[**reactionsDeleteForIssue**](ReactionsApi.md#reactionsDeleteForIssue) | **DELETE** /repos/{owner}/{repo}/issues/{issue_number}/reactions/{reaction_id} | Delete an issue reaction
[**reactionsDeleteForIssueComment**](ReactionsApi.md#reactionsDeleteForIssueComment) | **DELETE** /repos/{owner}/{repo}/issues/comments/{comment_id}/reactions/{reaction_id} | Delete an issue comment reaction
[**reactionsDeleteForPullRequestComment**](ReactionsApi.md#reactionsDeleteForPullRequestComment) | **DELETE** /repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions/{reaction_id} | Delete a pull request comment reaction
[**reactionsDeleteForRelease**](ReactionsApi.md#reactionsDeleteForRelease) | **DELETE** /repos/{owner}/{repo}/releases/{release_id}/reactions/{reaction_id} | Delete a release reaction
[**reactionsDeleteForTeamDiscussion**](ReactionsApi.md#reactionsDeleteForTeamDiscussion) | **DELETE** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions/{reaction_id} | Delete team discussion reaction
[**reactionsDeleteForTeamDiscussionComment**](ReactionsApi.md#reactionsDeleteForTeamDiscussionComment) | **DELETE** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions/{reaction_id} | Delete team discussion comment reaction
[**reactionsListForCommitComment**](ReactionsApi.md#reactionsListForCommitComment) | **GET** /repos/{owner}/{repo}/comments/{comment_id}/reactions | List reactions for a commit comment
[**reactionsListForIssue**](ReactionsApi.md#reactionsListForIssue) | **GET** /repos/{owner}/{repo}/issues/{issue_number}/reactions | List reactions for an issue
[**reactionsListForIssueComment**](ReactionsApi.md#reactionsListForIssueComment) | **GET** /repos/{owner}/{repo}/issues/comments/{comment_id}/reactions | List reactions for an issue comment
[**reactionsListForPullRequestReviewComment**](ReactionsApi.md#reactionsListForPullRequestReviewComment) | **GET** /repos/{owner}/{repo}/pulls/comments/{comment_id}/reactions | List reactions for a pull request review comment
[**reactionsListForRelease**](ReactionsApi.md#reactionsListForRelease) | **GET** /repos/{owner}/{repo}/releases/{release_id}/reactions | List reactions for a release
[**reactionsListForTeamDiscussionCommentInOrg**](ReactionsApi.md#reactionsListForTeamDiscussionCommentInOrg) | **GET** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}/reactions | List reactions for a team discussion comment
[**reactionsListForTeamDiscussionCommentLegacy**](ReactionsApi.md#reactionsListForTeamDiscussionCommentLegacy) | **GET** /teams/{team_id}/discussions/{discussion_number}/comments/{comment_number}/reactions | List reactions for a team discussion comment (Legacy)
[**reactionsListForTeamDiscussionInOrg**](ReactionsApi.md#reactionsListForTeamDiscussionInOrg) | **GET** /orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/reactions | List reactions for a team discussion
[**reactionsListForTeamDiscussionLegacy**](ReactionsApi.md#reactionsListForTeamDiscussionLegacy) | **GET** /teams/{team_id}/discussions/{discussion_number}/reactions | List reactions for a team discussion (Legacy)


<a id="reactionsCreateForCommitComment"></a>
# **reactionsCreateForCommitComment**
> Reaction reactionsCreateForCommitComment(owner, repo, commentId, reactionsCreateForCommitCommentRequest)

Create reaction for a commit comment

Create a reaction to a [commit comment](https://docs.github.com/rest/commits/comments#get-a-commit-comment). A response with an HTTP &#x60;200&#x60; status means that you already added the reaction type to this commit comment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
val reactionsCreateForCommitCommentRequest : ReactionsCreateForCommitCommentRequest = {content=heart} // ReactionsCreateForCommitCommentRequest | 
try {
    val result : Reaction = apiInstance.reactionsCreateForCommitComment(owner, repo, commentId, reactionsCreateForCommitCommentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsCreateForCommitComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsCreateForCommitComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |
 **reactionsCreateForCommitCommentRequest** | [**ReactionsCreateForCommitCommentRequest**](ReactionsCreateForCommitCommentRequest.md)|  |

### Return type

[**Reaction**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reactionsCreateForIssue"></a>
# **reactionsCreateForIssue**
> Reaction reactionsCreateForIssue(owner, repo, issueNumber, reactionsCreateForIssueRequest)

Create reaction for an issue

Create a reaction to an [issue](https://docs.github.com/rest/issues/issues#get-an-issue). A response with an HTTP &#x60;200&#x60; status means that you already added the reaction type to this issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
val reactionsCreateForIssueRequest : ReactionsCreateForIssueRequest = {content=heart} // ReactionsCreateForIssueRequest | 
try {
    val result : Reaction = apiInstance.reactionsCreateForIssue(owner, repo, issueNumber, reactionsCreateForIssueRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsCreateForIssue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsCreateForIssue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |
 **reactionsCreateForIssueRequest** | [**ReactionsCreateForIssueRequest**](ReactionsCreateForIssueRequest.md)|  |

### Return type

[**Reaction**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reactionsCreateForIssueComment"></a>
# **reactionsCreateForIssueComment**
> Reaction reactionsCreateForIssueComment(owner, repo, commentId, reactionsCreateForIssueCommentRequest)

Create reaction for an issue comment

Create a reaction to an [issue comment](https://docs.github.com/rest/issues/comments#get-an-issue-comment). A response with an HTTP &#x60;200&#x60; status means that you already added the reaction type to this issue comment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
val reactionsCreateForIssueCommentRequest : ReactionsCreateForIssueCommentRequest = {content=heart} // ReactionsCreateForIssueCommentRequest | 
try {
    val result : Reaction = apiInstance.reactionsCreateForIssueComment(owner, repo, commentId, reactionsCreateForIssueCommentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsCreateForIssueComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsCreateForIssueComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |
 **reactionsCreateForIssueCommentRequest** | [**ReactionsCreateForIssueCommentRequest**](ReactionsCreateForIssueCommentRequest.md)|  |

### Return type

[**Reaction**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reactionsCreateForPullRequestReviewComment"></a>
# **reactionsCreateForPullRequestReviewComment**
> Reaction reactionsCreateForPullRequestReviewComment(owner, repo, commentId, reactionsCreateForPullRequestReviewCommentRequest)

Create reaction for a pull request review comment

Create a reaction to a [pull request review comment](https://docs.github.com/rest/pulls/comments#get-a-review-comment-for-a-pull-request). A response with an HTTP &#x60;200&#x60; status means that you already added the reaction type to this pull request review comment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
val reactionsCreateForPullRequestReviewCommentRequest : ReactionsCreateForPullRequestReviewCommentRequest = {content=heart} // ReactionsCreateForPullRequestReviewCommentRequest | 
try {
    val result : Reaction = apiInstance.reactionsCreateForPullRequestReviewComment(owner, repo, commentId, reactionsCreateForPullRequestReviewCommentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsCreateForPullRequestReviewComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsCreateForPullRequestReviewComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |
 **reactionsCreateForPullRequestReviewCommentRequest** | [**ReactionsCreateForPullRequestReviewCommentRequest**](ReactionsCreateForPullRequestReviewCommentRequest.md)|  |

### Return type

[**Reaction**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reactionsCreateForRelease"></a>
# **reactionsCreateForRelease**
> Reaction reactionsCreateForRelease(owner, repo, releaseId, reactionsCreateForReleaseRequest)

Create reaction for a release

Create a reaction to a [release](https://docs.github.com/rest/releases/releases#get-a-release). A response with a &#x60;Status: 200 OK&#x60; means that you already added the reaction type to this release.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val releaseId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the release.
val reactionsCreateForReleaseRequest : ReactionsCreateForReleaseRequest = {content=heart} // ReactionsCreateForReleaseRequest | 
try {
    val result : Reaction = apiInstance.reactionsCreateForRelease(owner, repo, releaseId, reactionsCreateForReleaseRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsCreateForRelease")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsCreateForRelease")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **releaseId** | **kotlin.Int**| The unique identifier of the release. |
 **reactionsCreateForReleaseRequest** | [**ReactionsCreateForReleaseRequest**](ReactionsCreateForReleaseRequest.md)|  |

### Return type

[**Reaction**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reactionsCreateForTeamDiscussionCommentInOrg"></a>
# **reactionsCreateForTeamDiscussionCommentInOrg**
> Reaction reactionsCreateForTeamDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber, reactionsCreateForTeamDiscussionCommentInOrgRequest)

Create reaction for a team discussion comment

Create a reaction to a [team discussion comment](https://docs.github.com/rest/teams/discussion-comments#get-a-discussion-comment).  A response with an HTTP &#x60;200&#x60; status means that you already added the reaction type to this team discussion comment.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val commentNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the comment.
val reactionsCreateForTeamDiscussionCommentInOrgRequest : ReactionsCreateForTeamDiscussionCommentInOrgRequest = {"content":"heart"} // ReactionsCreateForTeamDiscussionCommentInOrgRequest | 
try {
    val result : Reaction = apiInstance.reactionsCreateForTeamDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber, reactionsCreateForTeamDiscussionCommentInOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsCreateForTeamDiscussionCommentInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsCreateForTeamDiscussionCommentInOrg")
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
 **reactionsCreateForTeamDiscussionCommentInOrgRequest** | [**ReactionsCreateForTeamDiscussionCommentInOrgRequest**](ReactionsCreateForTeamDiscussionCommentInOrgRequest.md)|  |

### Return type

[**Reaction**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reactionsCreateForTeamDiscussionCommentLegacy"></a>
# **reactionsCreateForTeamDiscussionCommentLegacy**
> Reaction reactionsCreateForTeamDiscussionCommentLegacy(teamId, discussionNumber, commentNumber, reactionsCreateForTeamDiscussionCommentInOrgRequest)

Create reaction for a team discussion comment (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new \&quot;[Create reaction for a team discussion comment](https://docs.github.com/rest/reactions/reactions#create-reaction-for-a-team-discussion-comment)\&quot; endpoint.  Create a reaction to a [team discussion comment](https://docs.github.com/rest/teams/discussion-comments#get-a-discussion-comment).  A response with an HTTP &#x60;200&#x60; status means that you already added the reaction type to this team discussion comment.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val commentNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the comment.
val reactionsCreateForTeamDiscussionCommentInOrgRequest : ReactionsCreateForTeamDiscussionCommentInOrgRequest = {content=heart} // ReactionsCreateForTeamDiscussionCommentInOrgRequest | 
try {
    val result : Reaction = apiInstance.reactionsCreateForTeamDiscussionCommentLegacy(teamId, discussionNumber, commentNumber, reactionsCreateForTeamDiscussionCommentInOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsCreateForTeamDiscussionCommentLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsCreateForTeamDiscussionCommentLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **commentNumber** | **kotlin.Int**| The number that identifies the comment. |
 **reactionsCreateForTeamDiscussionCommentInOrgRequest** | [**ReactionsCreateForTeamDiscussionCommentInOrgRequest**](ReactionsCreateForTeamDiscussionCommentInOrgRequest.md)|  |

### Return type

[**Reaction**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reactionsCreateForTeamDiscussionInOrg"></a>
# **reactionsCreateForTeamDiscussionInOrg**
> Reaction reactionsCreateForTeamDiscussionInOrg(org, teamSlug, discussionNumber, reactionsCreateForTeamDiscussionInOrgRequest)

Create reaction for a team discussion

Create a reaction to a [team discussion](https://docs.github.com/rest/teams/discussions#get-a-discussion).  A response with an HTTP &#x60;200&#x60; status means that you already added the reaction type to this team discussion.  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val reactionsCreateForTeamDiscussionInOrgRequest : ReactionsCreateForTeamDiscussionInOrgRequest = {content=heart} // ReactionsCreateForTeamDiscussionInOrgRequest | 
try {
    val result : Reaction = apiInstance.reactionsCreateForTeamDiscussionInOrg(org, teamSlug, discussionNumber, reactionsCreateForTeamDiscussionInOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsCreateForTeamDiscussionInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsCreateForTeamDiscussionInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **reactionsCreateForTeamDiscussionInOrgRequest** | [**ReactionsCreateForTeamDiscussionInOrgRequest**](ReactionsCreateForTeamDiscussionInOrgRequest.md)|  |

### Return type

[**Reaction**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reactionsCreateForTeamDiscussionLegacy"></a>
# **reactionsCreateForTeamDiscussionLegacy**
> Reaction reactionsCreateForTeamDiscussionLegacy(teamId, discussionNumber, reactionsCreateForTeamDiscussionInOrgRequest)

Create reaction for a team discussion (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;Create reaction for a team discussion&#x60;](https://docs.github.com/rest/reactions/reactions#create-reaction-for-a-team-discussion) endpoint.  Create a reaction to a [team discussion](https://docs.github.com/rest/teams/discussions#get-a-discussion).  A response with an HTTP &#x60;200&#x60; status means that you already added the reaction type to this team discussion.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val reactionsCreateForTeamDiscussionInOrgRequest : ReactionsCreateForTeamDiscussionInOrgRequest = {content=heart} // ReactionsCreateForTeamDiscussionInOrgRequest | 
try {
    val result : Reaction = apiInstance.reactionsCreateForTeamDiscussionLegacy(teamId, discussionNumber, reactionsCreateForTeamDiscussionInOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsCreateForTeamDiscussionLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsCreateForTeamDiscussionLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **reactionsCreateForTeamDiscussionInOrgRequest** | [**ReactionsCreateForTeamDiscussionInOrgRequest**](ReactionsCreateForTeamDiscussionInOrgRequest.md)|  |

### Return type

[**Reaction**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reactionsDeleteForCommitComment"></a>
# **reactionsDeleteForCommitComment**
> reactionsDeleteForCommitComment(owner, repo, commentId, reactionId)

Delete a commit comment reaction

**Note:** You can also specify a repository by &#x60;repository_id&#x60; using the route &#x60;DELETE /repositories/:repository_id/comments/:comment_id/reactions/:reaction_id&#x60;.  Delete a reaction to a [commit comment](https://docs.github.com/rest/commits/comments#get-a-commit-comment).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
val reactionId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the reaction.
try {
    apiInstance.reactionsDeleteForCommitComment(owner, repo, commentId, reactionId)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsDeleteForCommitComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsDeleteForCommitComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |
 **reactionId** | **kotlin.Int**| The unique identifier of the reaction. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reactionsDeleteForIssue"></a>
# **reactionsDeleteForIssue**
> reactionsDeleteForIssue(owner, repo, issueNumber, reactionId)

Delete an issue reaction

**Note:** You can also specify a repository by &#x60;repository_id&#x60; using the route &#x60;DELETE /repositories/:repository_id/issues/:issue_number/reactions/:reaction_id&#x60;.  Delete a reaction to an [issue](https://docs.github.com/rest/issues/issues#get-an-issue).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
val reactionId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the reaction.
try {
    apiInstance.reactionsDeleteForIssue(owner, repo, issueNumber, reactionId)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsDeleteForIssue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsDeleteForIssue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |
 **reactionId** | **kotlin.Int**| The unique identifier of the reaction. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reactionsDeleteForIssueComment"></a>
# **reactionsDeleteForIssueComment**
> reactionsDeleteForIssueComment(owner, repo, commentId, reactionId)

Delete an issue comment reaction

**Note:** You can also specify a repository by &#x60;repository_id&#x60; using the route &#x60;DELETE delete /repositories/:repository_id/issues/comments/:comment_id/reactions/:reaction_id&#x60;.  Delete a reaction to an [issue comment](https://docs.github.com/rest/issues/comments#get-an-issue-comment).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
val reactionId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the reaction.
try {
    apiInstance.reactionsDeleteForIssueComment(owner, repo, commentId, reactionId)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsDeleteForIssueComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsDeleteForIssueComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |
 **reactionId** | **kotlin.Int**| The unique identifier of the reaction. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reactionsDeleteForPullRequestComment"></a>
# **reactionsDeleteForPullRequestComment**
> reactionsDeleteForPullRequestComment(owner, repo, commentId, reactionId)

Delete a pull request comment reaction

**Note:** You can also specify a repository by &#x60;repository_id&#x60; using the route &#x60;DELETE /repositories/:repository_id/pulls/comments/:comment_id/reactions/:reaction_id.&#x60;  Delete a reaction to a [pull request review comment](https://docs.github.com/rest/pulls/comments#get-a-review-comment-for-a-pull-request).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
val reactionId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the reaction.
try {
    apiInstance.reactionsDeleteForPullRequestComment(owner, repo, commentId, reactionId)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsDeleteForPullRequestComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsDeleteForPullRequestComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |
 **reactionId** | **kotlin.Int**| The unique identifier of the reaction. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reactionsDeleteForRelease"></a>
# **reactionsDeleteForRelease**
> reactionsDeleteForRelease(owner, repo, releaseId, reactionId)

Delete a release reaction

**Note:** You can also specify a repository by &#x60;repository_id&#x60; using the route &#x60;DELETE delete /repositories/:repository_id/releases/:release_id/reactions/:reaction_id&#x60;.  Delete a reaction to a [release](https://docs.github.com/rest/releases/releases#get-a-release).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val releaseId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the release.
val reactionId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the reaction.
try {
    apiInstance.reactionsDeleteForRelease(owner, repo, releaseId, reactionId)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsDeleteForRelease")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsDeleteForRelease")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **releaseId** | **kotlin.Int**| The unique identifier of the release. |
 **reactionId** | **kotlin.Int**| The unique identifier of the reaction. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reactionsDeleteForTeamDiscussion"></a>
# **reactionsDeleteForTeamDiscussion**
> reactionsDeleteForTeamDiscussion(org, teamSlug, discussionNumber, reactionId)

Delete team discussion reaction

**Note:** You can also specify a team or organization with &#x60;team_id&#x60; and &#x60;org_id&#x60; using the route &#x60;DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions/:reaction_id&#x60;.  Delete a reaction to a [team discussion](https://docs.github.com/rest/teams/discussions#get-a-discussion).  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val reactionId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the reaction.
try {
    apiInstance.reactionsDeleteForTeamDiscussion(org, teamSlug, discussionNumber, reactionId)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsDeleteForTeamDiscussion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsDeleteForTeamDiscussion")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **reactionId** | **kotlin.Int**| The unique identifier of the reaction. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reactionsDeleteForTeamDiscussionComment"></a>
# **reactionsDeleteForTeamDiscussionComment**
> reactionsDeleteForTeamDiscussionComment(org, teamSlug, discussionNumber, commentNumber, reactionId)

Delete team discussion comment reaction

**Note:** You can also specify a team or organization with &#x60;team_id&#x60; and &#x60;org_id&#x60; using the route &#x60;DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions/:reaction_id&#x60;.  Delete a reaction to a [team discussion comment](https://docs.github.com/rest/teams/discussion-comments#get-a-discussion-comment).  OAuth app tokens and personal access tokens (classic) need the &#x60;write:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val commentNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the comment.
val reactionId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the reaction.
try {
    apiInstance.reactionsDeleteForTeamDiscussionComment(org, teamSlug, discussionNumber, commentNumber, reactionId)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsDeleteForTeamDiscussionComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsDeleteForTeamDiscussionComment")
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
 **reactionId** | **kotlin.Int**| The unique identifier of the reaction. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reactionsListForCommitComment"></a>
# **reactionsListForCommitComment**
> kotlin.collections.List&lt;Reaction&gt; reactionsListForCommitComment(owner, repo, commentId, content, perPage, page)

List reactions for a commit comment

List the reactions to a [commit comment](https://docs.github.com/rest/commits/comments#get-a-commit-comment).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
val content : kotlin.String = content_example // kotlin.String | Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to a commit comment.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Reaction> = apiInstance.reactionsListForCommitComment(owner, repo, commentId, content, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsListForCommitComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsListForCommitComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |
 **content** | **kotlin.String**| Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to a commit comment. | [optional] [enum: +1, -1, laugh, confused, heart, hooray, rocket, eyes]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Reaction&gt;**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reactionsListForIssue"></a>
# **reactionsListForIssue**
> kotlin.collections.List&lt;Reaction&gt; reactionsListForIssue(owner, repo, issueNumber, content, perPage, page)

List reactions for an issue

List the reactions to an [issue](https://docs.github.com/rest/issues/issues#get-an-issue).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
val content : kotlin.String = content_example // kotlin.String | Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to an issue.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Reaction> = apiInstance.reactionsListForIssue(owner, repo, issueNumber, content, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsListForIssue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsListForIssue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |
 **content** | **kotlin.String**| Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to an issue. | [optional] [enum: +1, -1, laugh, confused, heart, hooray, rocket, eyes]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Reaction&gt;**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reactionsListForIssueComment"></a>
# **reactionsListForIssueComment**
> kotlin.collections.List&lt;Reaction&gt; reactionsListForIssueComment(owner, repo, commentId, content, perPage, page)

List reactions for an issue comment

List the reactions to an [issue comment](https://docs.github.com/rest/issues/comments#get-an-issue-comment).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
val content : kotlin.String = content_example // kotlin.String | Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to an issue comment.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Reaction> = apiInstance.reactionsListForIssueComment(owner, repo, commentId, content, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsListForIssueComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsListForIssueComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |
 **content** | **kotlin.String**| Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to an issue comment. | [optional] [enum: +1, -1, laugh, confused, heart, hooray, rocket, eyes]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Reaction&gt;**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reactionsListForPullRequestReviewComment"></a>
# **reactionsListForPullRequestReviewComment**
> kotlin.collections.List&lt;Reaction&gt; reactionsListForPullRequestReviewComment(owner, repo, commentId, content, perPage, page)

List reactions for a pull request review comment

List the reactions to a [pull request review comment](https://docs.github.com/rest/pulls/comments#get-a-review-comment-for-a-pull-request).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
val content : kotlin.String = content_example // kotlin.String | Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to a pull request review comment.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Reaction> = apiInstance.reactionsListForPullRequestReviewComment(owner, repo, commentId, content, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsListForPullRequestReviewComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsListForPullRequestReviewComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |
 **content** | **kotlin.String**| Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to a pull request review comment. | [optional] [enum: +1, -1, laugh, confused, heart, hooray, rocket, eyes]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Reaction&gt;**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reactionsListForRelease"></a>
# **reactionsListForRelease**
> kotlin.collections.List&lt;Reaction&gt; reactionsListForRelease(owner, repo, releaseId, content, perPage, page)

List reactions for a release

List the reactions to a [release](https://docs.github.com/rest/releases/releases#get-a-release).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val releaseId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the release.
val content : kotlin.String = content_example // kotlin.String | Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to a release.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Reaction> = apiInstance.reactionsListForRelease(owner, repo, releaseId, content, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsListForRelease")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsListForRelease")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **releaseId** | **kotlin.Int**| The unique identifier of the release. |
 **content** | **kotlin.String**| Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to a release. | [optional] [enum: +1, laugh, heart, hooray, rocket, eyes]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Reaction&gt;**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reactionsListForTeamDiscussionCommentInOrg"></a>
# **reactionsListForTeamDiscussionCommentInOrg**
> kotlin.collections.List&lt;Reaction&gt; reactionsListForTeamDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber, content, perPage, page)

List reactions for a team discussion comment

List the reactions to a [team discussion comment](https://docs.github.com/rest/teams/discussion-comments#get-a-discussion-comment).  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val commentNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the comment.
val content : kotlin.String = content_example // kotlin.String | Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to a team discussion comment.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Reaction> = apiInstance.reactionsListForTeamDiscussionCommentInOrg(org, teamSlug, discussionNumber, commentNumber, content, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsListForTeamDiscussionCommentInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsListForTeamDiscussionCommentInOrg")
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
 **content** | **kotlin.String**| Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to a team discussion comment. | [optional] [enum: +1, -1, laugh, confused, heart, hooray, rocket, eyes]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Reaction&gt;**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reactionsListForTeamDiscussionCommentLegacy"></a>
# **reactionsListForTeamDiscussionCommentLegacy**
> kotlin.collections.List&lt;Reaction&gt; reactionsListForTeamDiscussionCommentLegacy(teamId, discussionNumber, commentNumber, content, perPage, page)

List reactions for a team discussion comment (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;List reactions for a team discussion comment&#x60;](https://docs.github.com/rest/reactions/reactions#list-reactions-for-a-team-discussion-comment) endpoint.  List the reactions to a [team discussion comment](https://docs.github.com/rest/teams/discussion-comments#get-a-discussion-comment).  OAuth app tokens and personal access tokens (classic) need the &#x60;read:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val commentNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the comment.
val content : kotlin.String = content_example // kotlin.String | Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to a team discussion comment.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Reaction> = apiInstance.reactionsListForTeamDiscussionCommentLegacy(teamId, discussionNumber, commentNumber, content, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsListForTeamDiscussionCommentLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsListForTeamDiscussionCommentLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **commentNumber** | **kotlin.Int**| The number that identifies the comment. |
 **content** | **kotlin.String**| Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to a team discussion comment. | [optional] [enum: +1, -1, laugh, confused, heart, hooray, rocket, eyes]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Reaction&gt;**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reactionsListForTeamDiscussionInOrg"></a>
# **reactionsListForTeamDiscussionInOrg**
> kotlin.collections.List&lt;Reaction&gt; reactionsListForTeamDiscussionInOrg(org, teamSlug, discussionNumber, content, perPage, page)

List reactions for a team discussion

List the reactions to a [team discussion](https://docs.github.com/rest/teams/discussions#get-a-discussion).  **Note:** You can also specify a team by &#x60;org_id&#x60; and &#x60;team_id&#x60; using the route &#x60;GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val teamSlug : kotlin.String = teamSlug_example // kotlin.String | The slug of the team name.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val content : kotlin.String = content_example // kotlin.String | Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to a team discussion.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Reaction> = apiInstance.reactionsListForTeamDiscussionInOrg(org, teamSlug, discussionNumber, content, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsListForTeamDiscussionInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsListForTeamDiscussionInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **teamSlug** | **kotlin.String**| The slug of the team name. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **content** | **kotlin.String**| Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to a team discussion. | [optional] [enum: +1, -1, laugh, confused, heart, hooray, rocket, eyes]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Reaction&gt;**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reactionsListForTeamDiscussionLegacy"></a>
# **reactionsListForTeamDiscussionLegacy**
> kotlin.collections.List&lt;Reaction&gt; reactionsListForTeamDiscussionLegacy(teamId, discussionNumber, content, perPage, page)

List reactions for a team discussion (Legacy)

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [&#x60;List reactions for a team discussion&#x60;](https://docs.github.com/rest/reactions/reactions#list-reactions-for-a-team-discussion) endpoint.  List the reactions to a [team discussion](https://docs.github.com/rest/teams/discussions#get-a-discussion).  OAuth app tokens and personal access tokens (classic) need the &#x60;read:discussion&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReactionsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the team.
val discussionNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the discussion.
val content : kotlin.String = content_example // kotlin.String | Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to a team discussion.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Reaction> = apiInstance.reactionsListForTeamDiscussionLegacy(teamId, discussionNumber, content, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReactionsApi#reactionsListForTeamDiscussionLegacy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReactionsApi#reactionsListForTeamDiscussionLegacy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| The unique identifier of the team. |
 **discussionNumber** | **kotlin.Int**| The number that identifies the discussion. |
 **content** | **kotlin.String**| Returns a single [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions). Omit this parameter to list all reactions to a team discussion. | [optional] [enum: +1, -1, laugh, confused, heart, hooray, rocket, eyes]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Reaction&gt;**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

