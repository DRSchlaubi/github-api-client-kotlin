# IssuesApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**issuesAddAssignees**](IssuesApi.md#issuesAddAssignees) | **POST** /repos/{owner}/{repo}/issues/{issue_number}/assignees | Add assignees to an issue
[**issuesAddLabels**](IssuesApi.md#issuesAddLabels) | **POST** /repos/{owner}/{repo}/issues/{issue_number}/labels | Add labels to an issue
[**issuesCheckUserCanBeAssigned**](IssuesApi.md#issuesCheckUserCanBeAssigned) | **GET** /repos/{owner}/{repo}/assignees/{assignee} | Check if a user can be assigned
[**issuesCheckUserCanBeAssignedToIssue**](IssuesApi.md#issuesCheckUserCanBeAssignedToIssue) | **GET** /repos/{owner}/{repo}/issues/{issue_number}/assignees/{assignee} | Check if a user can be assigned to a issue
[**issuesCreate**](IssuesApi.md#issuesCreate) | **POST** /repos/{owner}/{repo}/issues | Create an issue
[**issuesCreateComment**](IssuesApi.md#issuesCreateComment) | **POST** /repos/{owner}/{repo}/issues/{issue_number}/comments | Create an issue comment
[**issuesCreateLabel**](IssuesApi.md#issuesCreateLabel) | **POST** /repos/{owner}/{repo}/labels | Create a label
[**issuesCreateMilestone**](IssuesApi.md#issuesCreateMilestone) | **POST** /repos/{owner}/{repo}/milestones | Create a milestone
[**issuesDeleteComment**](IssuesApi.md#issuesDeleteComment) | **DELETE** /repos/{owner}/{repo}/issues/comments/{comment_id} | Delete an issue comment
[**issuesDeleteLabel**](IssuesApi.md#issuesDeleteLabel) | **DELETE** /repos/{owner}/{repo}/labels/{name} | Delete a label
[**issuesDeleteMilestone**](IssuesApi.md#issuesDeleteMilestone) | **DELETE** /repos/{owner}/{repo}/milestones/{milestone_number} | Delete a milestone
[**issuesGet**](IssuesApi.md#issuesGet) | **GET** /repos/{owner}/{repo}/issues/{issue_number} | Get an issue
[**issuesGetComment**](IssuesApi.md#issuesGetComment) | **GET** /repos/{owner}/{repo}/issues/comments/{comment_id} | Get an issue comment
[**issuesGetEvent**](IssuesApi.md#issuesGetEvent) | **GET** /repos/{owner}/{repo}/issues/events/{event_id} | Get an issue event
[**issuesGetLabel**](IssuesApi.md#issuesGetLabel) | **GET** /repos/{owner}/{repo}/labels/{name} | Get a label
[**issuesGetMilestone**](IssuesApi.md#issuesGetMilestone) | **GET** /repos/{owner}/{repo}/milestones/{milestone_number} | Get a milestone
[**issuesList**](IssuesApi.md#issuesList) | **GET** /issues | List issues assigned to the authenticated user
[**issuesListAssignees**](IssuesApi.md#issuesListAssignees) | **GET** /repos/{owner}/{repo}/assignees | List assignees
[**issuesListComments**](IssuesApi.md#issuesListComments) | **GET** /repos/{owner}/{repo}/issues/{issue_number}/comments | List issue comments
[**issuesListCommentsForRepo**](IssuesApi.md#issuesListCommentsForRepo) | **GET** /repos/{owner}/{repo}/issues/comments | List issue comments for a repository
[**issuesListEvents**](IssuesApi.md#issuesListEvents) | **GET** /repos/{owner}/{repo}/issues/{issue_number}/events | List issue events
[**issuesListEventsForRepo**](IssuesApi.md#issuesListEventsForRepo) | **GET** /repos/{owner}/{repo}/issues/events | List issue events for a repository
[**issuesListEventsForTimeline**](IssuesApi.md#issuesListEventsForTimeline) | **GET** /repos/{owner}/{repo}/issues/{issue_number}/timeline | List timeline events for an issue
[**issuesListForAuthenticatedUser**](IssuesApi.md#issuesListForAuthenticatedUser) | **GET** /user/issues | List user account issues assigned to the authenticated user
[**issuesListForOrg**](IssuesApi.md#issuesListForOrg) | **GET** /orgs/{org}/issues | List organization issues assigned to the authenticated user
[**issuesListForRepo**](IssuesApi.md#issuesListForRepo) | **GET** /repos/{owner}/{repo}/issues | List repository issues
[**issuesListLabelsForMilestone**](IssuesApi.md#issuesListLabelsForMilestone) | **GET** /repos/{owner}/{repo}/milestones/{milestone_number}/labels | List labels for issues in a milestone
[**issuesListLabelsForRepo**](IssuesApi.md#issuesListLabelsForRepo) | **GET** /repos/{owner}/{repo}/labels | List labels for a repository
[**issuesListLabelsOnIssue**](IssuesApi.md#issuesListLabelsOnIssue) | **GET** /repos/{owner}/{repo}/issues/{issue_number}/labels | List labels for an issue
[**issuesListMilestones**](IssuesApi.md#issuesListMilestones) | **GET** /repos/{owner}/{repo}/milestones | List milestones
[**issuesLock**](IssuesApi.md#issuesLock) | **PUT** /repos/{owner}/{repo}/issues/{issue_number}/lock | Lock an issue
[**issuesRemoveAllLabels**](IssuesApi.md#issuesRemoveAllLabels) | **DELETE** /repos/{owner}/{repo}/issues/{issue_number}/labels | Remove all labels from an issue
[**issuesRemoveAssignees**](IssuesApi.md#issuesRemoveAssignees) | **DELETE** /repos/{owner}/{repo}/issues/{issue_number}/assignees | Remove assignees from an issue
[**issuesRemoveLabel**](IssuesApi.md#issuesRemoveLabel) | **DELETE** /repos/{owner}/{repo}/issues/{issue_number}/labels/{name} | Remove a label from an issue
[**issuesSetLabels**](IssuesApi.md#issuesSetLabels) | **PUT** /repos/{owner}/{repo}/issues/{issue_number}/labels | Set labels for an issue
[**issuesUnlock**](IssuesApi.md#issuesUnlock) | **DELETE** /repos/{owner}/{repo}/issues/{issue_number}/lock | Unlock an issue
[**issuesUpdate**](IssuesApi.md#issuesUpdate) | **PATCH** /repos/{owner}/{repo}/issues/{issue_number} | Update an issue
[**issuesUpdateComment**](IssuesApi.md#issuesUpdateComment) | **PATCH** /repos/{owner}/{repo}/issues/comments/{comment_id} | Update an issue comment
[**issuesUpdateLabel**](IssuesApi.md#issuesUpdateLabel) | **PATCH** /repos/{owner}/{repo}/labels/{name} | Update a label
[**issuesUpdateMilestone**](IssuesApi.md#issuesUpdateMilestone) | **PATCH** /repos/{owner}/{repo}/milestones/{milestone_number} | Update a milestone


<a id="issuesAddAssignees"></a>
# **issuesAddAssignees**
> Issue issuesAddAssignees(owner, repo, issueNumber, issuesAddAssigneesRequest)

Add assignees to an issue

Adds up to 10 assignees to an issue. Users already assigned to an issue are not replaced.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
val issuesAddAssigneesRequest : IssuesAddAssigneesRequest = {assignees=[hubot, other_user]} // IssuesAddAssigneesRequest | 
try {
    val result : Issue = apiInstance.issuesAddAssignees(owner, repo, issueNumber, issuesAddAssigneesRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesAddAssignees")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesAddAssignees")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |
 **issuesAddAssigneesRequest** | [**IssuesAddAssigneesRequest**](IssuesAddAssigneesRequest.md)|  | [optional]

### Return type

[**Issue**](Issue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="issuesAddLabels"></a>
# **issuesAddLabels**
> kotlin.collections.List&lt;Label&gt; issuesAddLabels(owner, repo, issueNumber, issuesAddLabelsRequest)

Add labels to an issue

Adds labels to an issue. If you provide an empty array of labels, all labels are removed from the issue. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
val issuesAddLabelsRequest : IssuesAddLabelsRequest = {labels=[bug, enhancement]} // IssuesAddLabelsRequest | 
try {
    val result : kotlin.collections.List<Label> = apiInstance.issuesAddLabels(owner, repo, issueNumber, issuesAddLabelsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesAddLabels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesAddLabels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |
 **issuesAddLabelsRequest** | [**IssuesAddLabelsRequest**](IssuesAddLabelsRequest.md)|  | [optional]

### Return type

[**kotlin.collections.List&lt;Label&gt;**](Label.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="issuesCheckUserCanBeAssigned"></a>
# **issuesCheckUserCanBeAssigned**
> issuesCheckUserCanBeAssigned(owner, repo, assignee)

Check if a user can be assigned

Checks if a user has permission to be assigned to an issue in this repository.  If the &#x60;assignee&#x60; can be assigned to issues in the repository, a &#x60;204&#x60; header with no content is returned.  Otherwise a &#x60;404&#x60; status code is returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val assignee : kotlin.String = assignee_example // kotlin.String | 
try {
    apiInstance.issuesCheckUserCanBeAssigned(owner, repo, assignee)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesCheckUserCanBeAssigned")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesCheckUserCanBeAssigned")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **assignee** | **kotlin.String**|  | [default to &quot;push&quot;]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesCheckUserCanBeAssignedToIssue"></a>
# **issuesCheckUserCanBeAssignedToIssue**
> issuesCheckUserCanBeAssignedToIssue(owner, repo, issueNumber, assignee)

Check if a user can be assigned to a issue

Checks if a user has permission to be assigned to a specific issue.  If the &#x60;assignee&#x60; can be assigned to this issue, a &#x60;204&#x60; status code with no content is returned.  Otherwise a &#x60;404&#x60; status code is returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
val assignee : kotlin.String = assignee_example // kotlin.String | 
try {
    apiInstance.issuesCheckUserCanBeAssignedToIssue(owner, repo, issueNumber, assignee)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesCheckUserCanBeAssignedToIssue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesCheckUserCanBeAssignedToIssue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |
 **assignee** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesCreate"></a>
# **issuesCreate**
> Issue issuesCreate(owner, repo, issuesCreateRequest)

Create an issue

Any user with pull access to a repository can create an issue. If [issues are disabled in the repository](https://docs.github.com/articles/disabling-issues/), the API returns a &#x60;410 Gone&#x60; status.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information, see \&quot;[Rate limits for the API](https://docs.github.com/rest/overview/rate-limits-for-the-rest-api#about-secondary-rate-limits)\&quot; and \&quot;[Best practices for using the REST API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api).\&quot;  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issuesCreateRequest : IssuesCreateRequest = {"title":"Found a bug","body":"I'm having a problem with this.","assignees":["octocat"],"milestone":1,"labels":["bug"]} // IssuesCreateRequest | 
try {
    val result : Issue = apiInstance.issuesCreate(owner, repo, issuesCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issuesCreateRequest** | [**IssuesCreateRequest**](IssuesCreateRequest.md)|  |

### Return type

[**Issue**](Issue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/scim+json

<a id="issuesCreateComment"></a>
# **issuesCreateComment**
> IssueComment issuesCreateComment(owner, repo, issueNumber, issuesUpdateCommentRequest)

Create an issue comment

You can use the REST API to create comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information, see \&quot;[Rate limits for the API](https://docs.github.com/rest/overview/rate-limits-for-the-rest-api#about-secondary-rate-limits)\&quot; and \&quot;[Best practices for using the REST API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api).\&quot;  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
val issuesUpdateCommentRequest : IssuesUpdateCommentRequest = {body=Me too} // IssuesUpdateCommentRequest | 
try {
    val result : IssueComment = apiInstance.issuesCreateComment(owner, repo, issueNumber, issuesUpdateCommentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesCreateComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesCreateComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |
 **issuesUpdateCommentRequest** | [**IssuesUpdateCommentRequest**](IssuesUpdateCommentRequest.md)|  |

### Return type

[**IssueComment**](IssueComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="issuesCreateLabel"></a>
# **issuesCreateLabel**
> Label issuesCreateLabel(owner, repo, issuesCreateLabelRequest)

Create a label

Creates a label for the specified repository with the given name and color. The name and color parameters are required. The color must be a valid [hexadecimal color code](http://www.color-hex.com/).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issuesCreateLabelRequest : IssuesCreateLabelRequest = {"name":"bug","description":"Something isn't working","color":"f29513"} // IssuesCreateLabelRequest | 
try {
    val result : Label = apiInstance.issuesCreateLabel(owner, repo, issuesCreateLabelRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesCreateLabel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesCreateLabel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issuesCreateLabelRequest** | [**IssuesCreateLabelRequest**](IssuesCreateLabelRequest.md)|  |

### Return type

[**Label**](Label.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="issuesCreateMilestone"></a>
# **issuesCreateMilestone**
> Milestone issuesCreateMilestone(owner, repo, issuesCreateMilestoneRequest)

Create a milestone

Creates a milestone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issuesCreateMilestoneRequest : IssuesCreateMilestoneRequest = {"title":"v1.0","state":"open","description":"Tracking milestone for version 1.0","due_on":"2012-10-09T23:39:01Z"} // IssuesCreateMilestoneRequest | 
try {
    val result : Milestone = apiInstance.issuesCreateMilestone(owner, repo, issuesCreateMilestoneRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesCreateMilestone")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesCreateMilestone")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issuesCreateMilestoneRequest** | [**IssuesCreateMilestoneRequest**](IssuesCreateMilestoneRequest.md)|  |

### Return type

[**Milestone**](Milestone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="issuesDeleteComment"></a>
# **issuesDeleteComment**
> issuesDeleteComment(owner, repo, commentId)

Delete an issue comment

You can use the REST API to delete comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
try {
    apiInstance.issuesDeleteComment(owner, repo, commentId)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesDeleteComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesDeleteComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="issuesDeleteLabel"></a>
# **issuesDeleteLabel**
> issuesDeleteLabel(owner, repo, name)

Delete a label

Deletes a label using the given label name.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val name : kotlin.String = name_example // kotlin.String | 
try {
    apiInstance.issuesDeleteLabel(owner, repo, name)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesDeleteLabel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesDeleteLabel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **name** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="issuesDeleteMilestone"></a>
# **issuesDeleteMilestone**
> issuesDeleteMilestone(owner, repo, milestoneNumber)

Delete a milestone

Deletes a milestone using the given milestone number.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val milestoneNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the milestone.
try {
    apiInstance.issuesDeleteMilestone(owner, repo, milestoneNumber)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesDeleteMilestone")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesDeleteMilestone")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **milestoneNumber** | **kotlin.Int**| The number that identifies the milestone. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesGet"></a>
# **issuesGet**
> Issue issuesGet(owner, repo, issueNumber)

Get an issue

The API returns a [&#x60;301 Moved Permanently&#x60; status](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api#follow-redirects) if the issue was [transferred](https://docs.github.com/articles/transferring-an-issue-to-another-repository/) to another repository. If the issue was transferred to or deleted from a repository where the authenticated user lacks read access, the API returns a &#x60;404 Not Found&#x60; status. If the issue was deleted from a repository where the authenticated user has read access, the API returns a &#x60;410 Gone&#x60; status. To receive webhook events for transferred and deleted issues, subscribe to the [&#x60;issues&#x60;](https://docs.github.com/webhooks/event-payloads/#issues) webhook.  **Note**: GitHub&#39;s REST API considers every pull request an issue, but not every issue is a pull request. For this reason, \&quot;Issues\&quot; endpoints may return both issues and pull requests in the response. You can identify pull requests by the &#x60;pull_request&#x60; key. Be aware that the &#x60;id&#x60; of a pull request returned from \&quot;Issues\&quot; endpoints will be an _issue id_. To find out the pull request id, use the \&quot;[List pull requests](https://docs.github.com/rest/pulls/pulls#list-pull-requests)\&quot; endpoint.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
try {
    val result : Issue = apiInstance.issuesGet(owner, repo, issueNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |

### Return type

[**Issue**](Issue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesGetComment"></a>
# **issuesGetComment**
> IssueComment issuesGetComment(owner, repo, commentId)

Get an issue comment

You can use the REST API to get comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
try {
    val result : IssueComment = apiInstance.issuesGetComment(owner, repo, commentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesGetComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesGetComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |

### Return type

[**IssueComment**](IssueComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesGetEvent"></a>
# **issuesGetEvent**
> IssueEvent issuesGetEvent(owner, repo, eventId)

Get an issue event

Gets a single event by the event id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val eventId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : IssueEvent = apiInstance.issuesGetEvent(owner, repo, eventId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesGetEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesGetEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **eventId** | **kotlin.Int**|  |

### Return type

[**IssueEvent**](IssueEvent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesGetLabel"></a>
# **issuesGetLabel**
> Label issuesGetLabel(owner, repo, name)

Get a label

Gets a label using the given name.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : Label = apiInstance.issuesGetLabel(owner, repo, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesGetLabel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesGetLabel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **name** | **kotlin.String**|  |

### Return type

[**Label**](Label.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesGetMilestone"></a>
# **issuesGetMilestone**
> Milestone issuesGetMilestone(owner, repo, milestoneNumber)

Get a milestone

Gets a milestone using the given milestone number.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val milestoneNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the milestone.
try {
    val result : Milestone = apiInstance.issuesGetMilestone(owner, repo, milestoneNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesGetMilestone")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesGetMilestone")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **milestoneNumber** | **kotlin.Int**| The number that identifies the milestone. |

### Return type

[**Milestone**](Milestone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesList"></a>
# **issuesList**
> kotlin.collections.List&lt;Issue&gt; issuesList(filter, state, labels, sort, direction, since, collab, orgs, owned, pulls, perPage, page)

List issues assigned to the authenticated user

List issues assigned to the authenticated user across all visible repositories including owned repositories, member repositories, and organization repositories. You can use the &#x60;filter&#x60; query parameter to fetch issues that are not necessarily assigned to you.  **Note**: GitHub&#39;s REST API considers every pull request an issue, but not every issue is a pull request. For this reason, \&quot;Issues\&quot; endpoints may return both issues and pull requests in the response. You can identify pull requests by the &#x60;pull_request&#x60; key. Be aware that the &#x60;id&#x60; of a pull request returned from \&quot;Issues\&quot; endpoints will be an _issue id_. To find out the pull request id, use the \&quot;[List pull requests](https://docs.github.com/rest/pulls/pulls#list-pull-requests)\&quot; endpoint.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val filter : kotlin.String = filter_example // kotlin.String | Indicates which sorts of issues to return. `assigned` means issues assigned to you. `created` means issues created by you. `mentioned` means issues mentioning you. `subscribed` means issues you're subscribed to updates for. `all` or `repos` means all issues you can see, regardless of participation or creation.
val state : kotlin.String = state_example // kotlin.String | Indicates the state of the issues to return.
val labels : kotlin.String = labels_example // kotlin.String | A list of comma separated label names. Example: `bug,ui,@high`
val sort : kotlin.String = sort_example // kotlin.String | What to sort results by.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val since : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val collab : kotlin.Boolean = true // kotlin.Boolean | 
val orgs : kotlin.Boolean = true // kotlin.Boolean | 
val owned : kotlin.Boolean = true // kotlin.Boolean | 
val pulls : kotlin.Boolean = true // kotlin.Boolean | 
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Issue> = apiInstance.issuesList(filter, state, labels, sort, direction, since, collab, orgs, owned, pulls, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **kotlin.String**| Indicates which sorts of issues to return. &#x60;assigned&#x60; means issues assigned to you. &#x60;created&#x60; means issues created by you. &#x60;mentioned&#x60; means issues mentioning you. &#x60;subscribed&#x60; means issues you&#39;re subscribed to updates for. &#x60;all&#x60; or &#x60;repos&#x60; means all issues you can see, regardless of participation or creation. | [optional] [default to assigned] [enum: assigned, created, mentioned, subscribed, repos, all]
 **state** | **kotlin.String**| Indicates the state of the issues to return. | [optional] [default to open] [enum: open, closed, all]
 **labels** | **kotlin.String**| A list of comma separated label names. Example: &#x60;bug,ui,@high&#x60; | [optional]
 **sort** | **kotlin.String**| What to sort results by. | [optional] [default to created] [enum: created, updated, comments]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **since** | **kotlinx.datetime.Instant**| Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **collab** | **kotlin.Boolean**|  | [optional]
 **orgs** | **kotlin.Boolean**|  | [optional]
 **owned** | **kotlin.Boolean**|  | [optional]
 **pulls** | **kotlin.Boolean**|  | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Issue&gt;**](Issue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesListAssignees"></a>
# **issuesListAssignees**
> kotlin.collections.List&lt;SimpleUser&gt; issuesListAssignees(owner, repo, perPage, page)

List assignees

Lists the [available assignees](https://docs.github.com/articles/assigning-issues-and-pull-requests-to-other-github-users/) for issues in a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.issuesListAssignees(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesListAssignees")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesListAssignees")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesListComments"></a>
# **issuesListComments**
> kotlin.collections.List&lt;IssueComment&gt; issuesListComments(owner, repo, issueNumber, since, perPage, page)

List issue comments

You can use the REST API to list comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.  Issue comments are ordered by ascending ID.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
val since : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<IssueComment> = apiInstance.issuesListComments(owner, repo, issueNumber, since, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesListComments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesListComments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |
 **since** | **kotlinx.datetime.Instant**| Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;IssueComment&gt;**](IssueComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesListCommentsForRepo"></a>
# **issuesListCommentsForRepo**
> kotlin.collections.List&lt;IssueComment&gt; issuesListCommentsForRepo(owner, repo, sort, direction, since, perPage, page)

List issue comments for a repository

You can use the REST API to list comments on issues and pull requests for a repository. Every pull request is an issue, but not every issue is a pull request.  By default, issue comments are ordered by ascending ID.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val sort : kotlin.String = sort_example // kotlin.String | The property to sort the results by.
val direction : kotlin.String = direction_example // kotlin.String | Either `asc` or `desc`. Ignored without the `sort` parameter.
val since : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<IssueComment> = apiInstance.issuesListCommentsForRepo(owner, repo, sort, direction, since, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesListCommentsForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesListCommentsForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **sort** | **kotlin.String**| The property to sort the results by. | [optional] [default to created] [enum: created, updated]
 **direction** | **kotlin.String**| Either &#x60;asc&#x60; or &#x60;desc&#x60;. Ignored without the &#x60;sort&#x60; parameter. | [optional] [enum: asc, desc]
 **since** | **kotlinx.datetime.Instant**| Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;IssueComment&gt;**](IssueComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesListEvents"></a>
# **issuesListEvents**
> kotlin.collections.List&lt;IssueEventForIssue&gt; issuesListEvents(owner, repo, issueNumber, perPage, page)

List issue events

Lists all events for an issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<IssueEventForIssue> = apiInstance.issuesListEvents(owner, repo, issueNumber, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesListEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesListEvents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;IssueEventForIssue&gt;**](IssueEventForIssue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesListEventsForRepo"></a>
# **issuesListEventsForRepo**
> kotlin.collections.List&lt;IssueEvent&gt; issuesListEventsForRepo(owner, repo, perPage, page)

List issue events for a repository

Lists events for a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<IssueEvent> = apiInstance.issuesListEventsForRepo(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesListEventsForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesListEventsForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;IssueEvent&gt;**](IssueEvent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesListEventsForTimeline"></a>
# **issuesListEventsForTimeline**
> kotlin.collections.List&lt;TimelineIssueEvents&gt; issuesListEventsForTimeline(owner, repo, issueNumber, perPage, page)

List timeline events for an issue

List all timeline events for an issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<TimelineIssueEvents> = apiInstance.issuesListEventsForTimeline(owner, repo, issueNumber, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesListEventsForTimeline")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesListEventsForTimeline")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;TimelineIssueEvents&gt;**](TimelineIssueEvents.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesListForAuthenticatedUser"></a>
# **issuesListForAuthenticatedUser**
> kotlin.collections.List&lt;Issue&gt; issuesListForAuthenticatedUser(filter, state, labels, sort, direction, since, perPage, page)

List user account issues assigned to the authenticated user

List issues across owned and member repositories assigned to the authenticated user.  **Note**: GitHub&#39;s REST API considers every pull request an issue, but not every issue is a pull request. For this reason, \&quot;Issues\&quot; endpoints may return both issues and pull requests in the response. You can identify pull requests by the &#x60;pull_request&#x60; key. Be aware that the &#x60;id&#x60; of a pull request returned from \&quot;Issues\&quot; endpoints will be an _issue id_. To find out the pull request id, use the \&quot;[List pull requests](https://docs.github.com/rest/pulls/pulls#list-pull-requests)\&quot; endpoint.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val filter : kotlin.String = filter_example // kotlin.String | Indicates which sorts of issues to return. `assigned` means issues assigned to you. `created` means issues created by you. `mentioned` means issues mentioning you. `subscribed` means issues you're subscribed to updates for. `all` or `repos` means all issues you can see, regardless of participation or creation.
val state : kotlin.String = state_example // kotlin.String | Indicates the state of the issues to return.
val labels : kotlin.String = labels_example // kotlin.String | A list of comma separated label names. Example: `bug,ui,@high`
val sort : kotlin.String = sort_example // kotlin.String | What to sort results by.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val since : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Issue> = apiInstance.issuesListForAuthenticatedUser(filter, state, labels, sort, direction, since, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesListForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesListForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **kotlin.String**| Indicates which sorts of issues to return. &#x60;assigned&#x60; means issues assigned to you. &#x60;created&#x60; means issues created by you. &#x60;mentioned&#x60; means issues mentioning you. &#x60;subscribed&#x60; means issues you&#39;re subscribed to updates for. &#x60;all&#x60; or &#x60;repos&#x60; means all issues you can see, regardless of participation or creation. | [optional] [default to assigned] [enum: assigned, created, mentioned, subscribed, repos, all]
 **state** | **kotlin.String**| Indicates the state of the issues to return. | [optional] [default to open] [enum: open, closed, all]
 **labels** | **kotlin.String**| A list of comma separated label names. Example: &#x60;bug,ui,@high&#x60; | [optional]
 **sort** | **kotlin.String**| What to sort results by. | [optional] [default to created] [enum: created, updated, comments]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **since** | **kotlinx.datetime.Instant**| Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Issue&gt;**](Issue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesListForOrg"></a>
# **issuesListForOrg**
> kotlin.collections.List&lt;Issue&gt; issuesListForOrg(org, filter, state, labels, sort, direction, since, perPage, page)

List organization issues assigned to the authenticated user

List issues in an organization assigned to the authenticated user.  **Note**: GitHub&#39;s REST API considers every pull request an issue, but not every issue is a pull request. For this reason, \&quot;Issues\&quot; endpoints may return both issues and pull requests in the response. You can identify pull requests by the &#x60;pull_request&#x60; key. Be aware that the &#x60;id&#x60; of a pull request returned from \&quot;Issues\&quot; endpoints will be an _issue id_. To find out the pull request id, use the \&quot;[List pull requests](https://docs.github.com/rest/pulls/pulls#list-pull-requests)\&quot; endpoint.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val filter : kotlin.String = filter_example // kotlin.String | Indicates which sorts of issues to return. `assigned` means issues assigned to you. `created` means issues created by you. `mentioned` means issues mentioning you. `subscribed` means issues you're subscribed to updates for. `all` or `repos` means all issues you can see, regardless of participation or creation.
val state : kotlin.String = state_example // kotlin.String | Indicates the state of the issues to return.
val labels : kotlin.String = labels_example // kotlin.String | A list of comma separated label names. Example: `bug,ui,@high`
val sort : kotlin.String = sort_example // kotlin.String | What to sort results by.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val since : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Issue> = apiInstance.issuesListForOrg(org, filter, state, labels, sort, direction, since, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesListForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesListForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **filter** | **kotlin.String**| Indicates which sorts of issues to return. &#x60;assigned&#x60; means issues assigned to you. &#x60;created&#x60; means issues created by you. &#x60;mentioned&#x60; means issues mentioning you. &#x60;subscribed&#x60; means issues you&#39;re subscribed to updates for. &#x60;all&#x60; or &#x60;repos&#x60; means all issues you can see, regardless of participation or creation. | [optional] [default to assigned] [enum: assigned, created, mentioned, subscribed, repos, all]
 **state** | **kotlin.String**| Indicates the state of the issues to return. | [optional] [default to open] [enum: open, closed, all]
 **labels** | **kotlin.String**| A list of comma separated label names. Example: &#x60;bug,ui,@high&#x60; | [optional]
 **sort** | **kotlin.String**| What to sort results by. | [optional] [default to created] [enum: created, updated, comments]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **since** | **kotlinx.datetime.Instant**| Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Issue&gt;**](Issue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesListForRepo"></a>
# **issuesListForRepo**
> kotlin.collections.List&lt;Issue&gt; issuesListForRepo(owner, repo, milestone, state, assignee, creator, mentioned, labels, sort, direction, since, perPage, page)

List repository issues

List issues in a repository. Only open issues will be listed.  **Note**: GitHub&#39;s REST API considers every pull request an issue, but not every issue is a pull request. For this reason, \&quot;Issues\&quot; endpoints may return both issues and pull requests in the response. You can identify pull requests by the &#x60;pull_request&#x60; key. Be aware that the &#x60;id&#x60; of a pull request returned from \&quot;Issues\&quot; endpoints will be an _issue id_. To find out the pull request id, use the \&quot;[List pull requests](https://docs.github.com/rest/pulls/pulls#list-pull-requests)\&quot; endpoint.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val milestone : kotlin.String = milestone_example // kotlin.String | If an `integer` is passed, it should refer to a milestone by its `number` field. If the string `*` is passed, issues with any milestone are accepted. If the string `none` is passed, issues without milestones are returned.
val state : kotlin.String = state_example // kotlin.String | Indicates the state of the issues to return.
val assignee : kotlin.String = assignee_example // kotlin.String | Can be the name of a user. Pass in `none` for issues with no assigned user, and `*` for issues assigned to any user.
val creator : kotlin.String = creator_example // kotlin.String | The user that created the issue.
val mentioned : kotlin.String = mentioned_example // kotlin.String | A user that's mentioned in the issue.
val labels : kotlin.String = labels_example // kotlin.String | A list of comma separated label names. Example: `bug,ui,@high`
val sort : kotlin.String = sort_example // kotlin.String | What to sort results by.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val since : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Issue> = apiInstance.issuesListForRepo(owner, repo, milestone, state, assignee, creator, mentioned, labels, sort, direction, since, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesListForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesListForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **milestone** | **kotlin.String**| If an &#x60;integer&#x60; is passed, it should refer to a milestone by its &#x60;number&#x60; field. If the string &#x60;*&#x60; is passed, issues with any milestone are accepted. If the string &#x60;none&#x60; is passed, issues without milestones are returned. | [optional] [default to &quot;push&quot;]
 **state** | **kotlin.String**| Indicates the state of the issues to return. | [optional] [default to open] [enum: open, closed, all]
 **assignee** | **kotlin.String**| Can be the name of a user. Pass in &#x60;none&#x60; for issues with no assigned user, and &#x60;*&#x60; for issues assigned to any user. | [optional] [default to &quot;push&quot;]
 **creator** | **kotlin.String**| The user that created the issue. | [optional] [default to &quot;push&quot;]
 **mentioned** | **kotlin.String**| A user that&#39;s mentioned in the issue. | [optional] [default to &quot;push&quot;]
 **labels** | **kotlin.String**| A list of comma separated label names. Example: &#x60;bug,ui,@high&#x60; | [optional]
 **sort** | **kotlin.String**| What to sort results by. | [optional] [default to created] [enum: created, updated, comments]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **since** | **kotlinx.datetime.Instant**| Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Issue&gt;**](Issue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesListLabelsForMilestone"></a>
# **issuesListLabelsForMilestone**
> kotlin.collections.List&lt;Label&gt; issuesListLabelsForMilestone(owner, repo, milestoneNumber, perPage, page)

List labels for issues in a milestone

Lists labels for issues in a milestone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val milestoneNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the milestone.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Label> = apiInstance.issuesListLabelsForMilestone(owner, repo, milestoneNumber, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesListLabelsForMilestone")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesListLabelsForMilestone")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **milestoneNumber** | **kotlin.Int**| The number that identifies the milestone. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Label&gt;**](Label.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesListLabelsForRepo"></a>
# **issuesListLabelsForRepo**
> kotlin.collections.List&lt;Label&gt; issuesListLabelsForRepo(owner, repo, perPage, page)

List labels for a repository

Lists all labels for a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Label> = apiInstance.issuesListLabelsForRepo(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesListLabelsForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesListLabelsForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Label&gt;**](Label.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesListLabelsOnIssue"></a>
# **issuesListLabelsOnIssue**
> kotlin.collections.List&lt;Label&gt; issuesListLabelsOnIssue(owner, repo, issueNumber, perPage, page)

List labels for an issue

Lists all labels for an issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Label> = apiInstance.issuesListLabelsOnIssue(owner, repo, issueNumber, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesListLabelsOnIssue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesListLabelsOnIssue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Label&gt;**](Label.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesListMilestones"></a>
# **issuesListMilestones**
> kotlin.collections.List&lt;Milestone&gt; issuesListMilestones(owner, repo, state, sort, direction, perPage, page)

List milestones

Lists milestones for a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val state : kotlin.String = state_example // kotlin.String | The state of the milestone. Either `open`, `closed`, or `all`.
val sort : kotlin.String = sort_example // kotlin.String | What to sort results by. Either `due_on` or `completeness`.
val direction : kotlin.String = direction_example // kotlin.String | The direction of the sort. Either `asc` or `desc`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Milestone> = apiInstance.issuesListMilestones(owner, repo, state, sort, direction, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesListMilestones")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesListMilestones")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **state** | **kotlin.String**| The state of the milestone. Either &#x60;open&#x60;, &#x60;closed&#x60;, or &#x60;all&#x60;. | [optional] [default to open] [enum: open, closed, all]
 **sort** | **kotlin.String**| What to sort results by. Either &#x60;due_on&#x60; or &#x60;completeness&#x60;. | [optional] [default to due_on] [enum: due_on, completeness]
 **direction** | **kotlin.String**| The direction of the sort. Either &#x60;asc&#x60; or &#x60;desc&#x60;. | [optional] [default to asc] [enum: asc, desc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Milestone&gt;**](Milestone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesLock"></a>
# **issuesLock**
> issuesLock(owner, repo, issueNumber, issuesLockRequest)

Lock an issue

Users with push access can lock an issue or pull request&#39;s conversation.  Note that, if you choose not to pass any parameters, you&#39;ll need to set &#x60;Content-Length&#x60; to zero when calling out to this endpoint. For more information, see \&quot;[HTTP method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
val issuesLockRequest : IssuesLockRequest = {"lock_reason":"off-topic"} // IssuesLockRequest | 
try {
    apiInstance.issuesLock(owner, repo, issueNumber, issuesLockRequest)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesLock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesLock")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |
 **issuesLockRequest** | [**IssuesLockRequest**](IssuesLockRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="issuesRemoveAllLabels"></a>
# **issuesRemoveAllLabels**
> issuesRemoveAllLabels(owner, repo, issueNumber)

Remove all labels from an issue

Removes all labels from an issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
try {
    apiInstance.issuesRemoveAllLabels(owner, repo, issueNumber)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesRemoveAllLabels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesRemoveAllLabels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesRemoveAssignees"></a>
# **issuesRemoveAssignees**
> Issue issuesRemoveAssignees(owner, repo, issueNumber, issuesRemoveAssigneesRequest)

Remove assignees from an issue

Removes one or more assignees from an issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
val issuesRemoveAssigneesRequest : IssuesRemoveAssigneesRequest = {"assignees":["hubot","other_user"]} // IssuesRemoveAssigneesRequest | 
try {
    val result : Issue = apiInstance.issuesRemoveAssignees(owner, repo, issueNumber, issuesRemoveAssigneesRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesRemoveAssignees")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesRemoveAssignees")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |
 **issuesRemoveAssigneesRequest** | [**IssuesRemoveAssigneesRequest**](IssuesRemoveAssigneesRequest.md)|  | [optional]

### Return type

[**Issue**](Issue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="issuesRemoveLabel"></a>
# **issuesRemoveLabel**
> kotlin.collections.List&lt;Label&gt; issuesRemoveLabel(owner, repo, issueNumber, name)

Remove a label from an issue

Removes the specified label from the issue, and returns the remaining labels on the issue. This endpoint returns a &#x60;404 Not Found&#x60; status if the label does not exist.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : kotlin.collections.List<Label> = apiInstance.issuesRemoveLabel(owner, repo, issueNumber, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesRemoveLabel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesRemoveLabel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |
 **name** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;Label&gt;**](Label.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesSetLabels"></a>
# **issuesSetLabels**
> kotlin.collections.List&lt;Label&gt; issuesSetLabels(owner, repo, issueNumber, issuesSetLabelsRequest)

Set labels for an issue

Removes any previous labels and sets the new labels for an issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
val issuesSetLabelsRequest : IssuesSetLabelsRequest = {"labels":["bug","enhancement"]} // IssuesSetLabelsRequest | 
try {
    val result : kotlin.collections.List<Label> = apiInstance.issuesSetLabels(owner, repo, issueNumber, issuesSetLabelsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesSetLabels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesSetLabels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |
 **issuesSetLabelsRequest** | [**IssuesSetLabelsRequest**](IssuesSetLabelsRequest.md)|  | [optional]

### Return type

[**kotlin.collections.List&lt;Label&gt;**](Label.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="issuesUnlock"></a>
# **issuesUnlock**
> issuesUnlock(owner, repo, issueNumber)

Unlock an issue

Users with push access can unlock an issue&#39;s conversation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
try {
    apiInstance.issuesUnlock(owner, repo, issueNumber)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesUnlock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesUnlock")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="issuesUpdate"></a>
# **issuesUpdate**
> Issue issuesUpdate(owner, repo, issueNumber, issuesUpdateRequest)

Update an issue

Issue owners and users with push access can edit an issue.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val issueNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the issue.
val issuesUpdateRequest : IssuesUpdateRequest = {"title":"Found a bug","body":"I'm having a problem with this.","assignees":["octocat"],"milestone":1,"state":"open","labels":["bug"]} // IssuesUpdateRequest | 
try {
    val result : Issue = apiInstance.issuesUpdate(owner, repo, issueNumber, issuesUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **issueNumber** | **kotlin.Int**| The number that identifies the issue. |
 **issuesUpdateRequest** | [**IssuesUpdateRequest**](IssuesUpdateRequest.md)|  | [optional]

### Return type

[**Issue**](Issue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="issuesUpdateComment"></a>
# **issuesUpdateComment**
> IssueComment issuesUpdateComment(owner, repo, commentId, issuesUpdateCommentRequest)

Update an issue comment

You can use the REST API to update comments on issues and pull requests. Every pull request is an issue, but not every issue is a pull request.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
val issuesUpdateCommentRequest : IssuesUpdateCommentRequest = {"body":"Me too"} // IssuesUpdateCommentRequest | 
try {
    val result : IssueComment = apiInstance.issuesUpdateComment(owner, repo, commentId, issuesUpdateCommentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesUpdateComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesUpdateComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |
 **issuesUpdateCommentRequest** | [**IssuesUpdateCommentRequest**](IssuesUpdateCommentRequest.md)|  |

### Return type

[**IssueComment**](IssueComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="issuesUpdateLabel"></a>
# **issuesUpdateLabel**
> Label issuesUpdateLabel(owner, repo, name, issuesUpdateLabelRequest)

Update a label

Updates a label using the given label name.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val name : kotlin.String = name_example // kotlin.String | 
val issuesUpdateLabelRequest : IssuesUpdateLabelRequest = {"new_name":"bug :bug:","description":"Small bug fix required","color":"b01f26"} // IssuesUpdateLabelRequest | 
try {
    val result : Label = apiInstance.issuesUpdateLabel(owner, repo, name, issuesUpdateLabelRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesUpdateLabel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesUpdateLabel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **name** | **kotlin.String**|  |
 **issuesUpdateLabelRequest** | [**IssuesUpdateLabelRequest**](IssuesUpdateLabelRequest.md)|  | [optional]

### Return type

[**Label**](Label.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="issuesUpdateMilestone"></a>
# **issuesUpdateMilestone**
> Milestone issuesUpdateMilestone(owner, repo, milestoneNumber, issuesUpdateMilestoneRequest)

Update a milestone



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val milestoneNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the milestone.
val issuesUpdateMilestoneRequest : IssuesUpdateMilestoneRequest = {title=v1.0, state=open, description=Tracking milestone for version 1.0, due_on=2012-10-09T23:39:01Z} // IssuesUpdateMilestoneRequest | 
try {
    val result : Milestone = apiInstance.issuesUpdateMilestone(owner, repo, milestoneNumber, issuesUpdateMilestoneRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#issuesUpdateMilestone")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#issuesUpdateMilestone")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **milestoneNumber** | **kotlin.Int**| The number that identifies the milestone. |
 **issuesUpdateMilestoneRequest** | [**IssuesUpdateMilestoneRequest**](IssuesUpdateMilestoneRequest.md)|  | [optional]

### Return type

[**Milestone**](Milestone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

