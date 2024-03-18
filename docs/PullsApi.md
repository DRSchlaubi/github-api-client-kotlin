# PullsApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pullsCheckIfMerged**](PullsApi.md#pullsCheckIfMerged) | **GET** /repos/{owner}/{repo}/pulls/{pull_number}/merge | Check if a pull request has been merged
[**pullsCreate**](PullsApi.md#pullsCreate) | **POST** /repos/{owner}/{repo}/pulls | Create a pull request
[**pullsCreateReplyForReviewComment**](PullsApi.md#pullsCreateReplyForReviewComment) | **POST** /repos/{owner}/{repo}/pulls/{pull_number}/comments/{comment_id}/replies | Create a reply for a review comment
[**pullsCreateReview**](PullsApi.md#pullsCreateReview) | **POST** /repos/{owner}/{repo}/pulls/{pull_number}/reviews | Create a review for a pull request
[**pullsCreateReviewComment**](PullsApi.md#pullsCreateReviewComment) | **POST** /repos/{owner}/{repo}/pulls/{pull_number}/comments | Create a review comment for a pull request
[**pullsDeletePendingReview**](PullsApi.md#pullsDeletePendingReview) | **DELETE** /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id} | Delete a pending review for a pull request
[**pullsDeleteReviewComment**](PullsApi.md#pullsDeleteReviewComment) | **DELETE** /repos/{owner}/{repo}/pulls/comments/{comment_id} | Delete a review comment for a pull request
[**pullsDismissReview**](PullsApi.md#pullsDismissReview) | **PUT** /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/dismissals | Dismiss a review for a pull request
[**pullsGet**](PullsApi.md#pullsGet) | **GET** /repos/{owner}/{repo}/pulls/{pull_number} | Get a pull request
[**pullsGetReview**](PullsApi.md#pullsGetReview) | **GET** /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id} | Get a review for a pull request
[**pullsGetReviewComment**](PullsApi.md#pullsGetReviewComment) | **GET** /repos/{owner}/{repo}/pulls/comments/{comment_id} | Get a review comment for a pull request
[**pullsList**](PullsApi.md#pullsList) | **GET** /repos/{owner}/{repo}/pulls | List pull requests
[**pullsListCommentsForReview**](PullsApi.md#pullsListCommentsForReview) | **GET** /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/comments | List comments for a pull request review
[**pullsListCommits**](PullsApi.md#pullsListCommits) | **GET** /repos/{owner}/{repo}/pulls/{pull_number}/commits | List commits on a pull request
[**pullsListFiles**](PullsApi.md#pullsListFiles) | **GET** /repos/{owner}/{repo}/pulls/{pull_number}/files | List pull requests files
[**pullsListRequestedReviewers**](PullsApi.md#pullsListRequestedReviewers) | **GET** /repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers | Get all requested reviewers for a pull request
[**pullsListReviewComments**](PullsApi.md#pullsListReviewComments) | **GET** /repos/{owner}/{repo}/pulls/{pull_number}/comments | List review comments on a pull request
[**pullsListReviewCommentsForRepo**](PullsApi.md#pullsListReviewCommentsForRepo) | **GET** /repos/{owner}/{repo}/pulls/comments | List review comments in a repository
[**pullsListReviews**](PullsApi.md#pullsListReviews) | **GET** /repos/{owner}/{repo}/pulls/{pull_number}/reviews | List reviews for a pull request
[**pullsMerge**](PullsApi.md#pullsMerge) | **PUT** /repos/{owner}/{repo}/pulls/{pull_number}/merge | Merge a pull request
[**pullsRemoveRequestedReviewers**](PullsApi.md#pullsRemoveRequestedReviewers) | **DELETE** /repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers | Remove requested reviewers from a pull request
[**pullsRequestReviewers**](PullsApi.md#pullsRequestReviewers) | **POST** /repos/{owner}/{repo}/pulls/{pull_number}/requested_reviewers | Request reviewers for a pull request
[**pullsSubmitReview**](PullsApi.md#pullsSubmitReview) | **POST** /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id}/events | Submit a review for a pull request
[**pullsUpdate**](PullsApi.md#pullsUpdate) | **PATCH** /repos/{owner}/{repo}/pulls/{pull_number} | Update a pull request
[**pullsUpdateBranch**](PullsApi.md#pullsUpdateBranch) | **PUT** /repos/{owner}/{repo}/pulls/{pull_number}/update-branch | Update a pull request branch
[**pullsUpdateReview**](PullsApi.md#pullsUpdateReview) | **PUT** /repos/{owner}/{repo}/pulls/{pull_number}/reviews/{review_id} | Update a review for a pull request
[**pullsUpdateReviewComment**](PullsApi.md#pullsUpdateReviewComment) | **PATCH** /repos/{owner}/{repo}/pulls/comments/{comment_id} | Update a review comment for a pull request


<a id="pullsCheckIfMerged"></a>
# **pullsCheckIfMerged**
> pullsCheckIfMerged(owner, repo, pullNumber)

Check if a pull request has been merged

Checks if a pull request has been merged into the base branch. The HTTP status of the response indicates whether or not the pull request has been merged; the response body is empty.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
try {
    apiInstance.pullsCheckIfMerged(owner, repo, pullNumber)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsCheckIfMerged")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsCheckIfMerged")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="pullsCreate"></a>
# **pullsCreate**
> PullRequest pullsCreate(owner, repo, pullsCreateRequest)

Create a pull request

Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information, see \&quot;[Rate limits for the API](https://docs.github.com/rest/overview/rate-limits-for-the-rest-api#about-secondary-rate-limits)\&quot; and \&quot;[Best practices for using the REST API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api).\&quot;  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;. - **&#x60;application/vnd.github.diff&#x60;**: For more information, see \&quot;[git-diff](https://git-scm.com/docs/git-diff)\&quot; in the Git documentation. If a diff is corrupt, contact us through the [GitHub Support portal](https://support.github.com/). Include the repository name and pull request ID in your message.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullsCreateRequest : PullsCreateRequest = {"title":"Amazing new feature","body":"Please pull these awesome changes in!","head":"octocat:new-feature","base":"master"} // PullsCreateRequest | 
try {
    val result : PullRequest = apiInstance.pullsCreate(owner, repo, pullsCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullsCreateRequest** | [**PullsCreateRequest**](PullsCreateRequest.md)|  |

### Return type

[**PullRequest**](PullRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="pullsCreateReplyForReviewComment"></a>
# **pullsCreateReplyForReviewComment**
> PullRequestReviewComment pullsCreateReplyForReviewComment(owner, repo, pullNumber, commentId, pullsCreateReplyForReviewCommentRequest)

Create a reply for a review comment

Creates a reply to a review comment for a pull request. For the &#x60;comment_id&#x60;, provide the ID of the review comment you are replying to. This must be the ID of a _top-level review comment_, not a reply to that comment. Replies to replies are not supported.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information, see \&quot;[Rate limits for the API](https://docs.github.com/rest/overview/rate-limits-for-the-rest-api#about-secondary-rate-limits)\&quot; and \&quot;[Best practices for using the REST API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api).\&quot;  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
val pullsCreateReplyForReviewCommentRequest : PullsCreateReplyForReviewCommentRequest = {"body":"Great stuff!"} // PullsCreateReplyForReviewCommentRequest | 
try {
    val result : PullRequestReviewComment = apiInstance.pullsCreateReplyForReviewComment(owner, repo, pullNumber, commentId, pullsCreateReplyForReviewCommentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsCreateReplyForReviewComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsCreateReplyForReviewComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |
 **pullsCreateReplyForReviewCommentRequest** | [**PullsCreateReplyForReviewCommentRequest**](PullsCreateReplyForReviewCommentRequest.md)|  |

### Return type

[**PullRequestReviewComment**](PullRequestReviewComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="pullsCreateReview"></a>
# **pullsCreateReview**
> PullRequestReview pullsCreateReview(owner, repo, pullNumber, pullsCreateReviewRequest)

Create a review for a pull request

Creates a review on a specified pull request.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information, see \&quot;[Rate limits for the API](https://docs.github.com/rest/overview/rate-limits-for-the-rest-api#about-secondary-rate-limits)\&quot; and \&quot;[Best practices for using the REST API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api).\&quot;  Pull request reviews created in the &#x60;PENDING&#x60; state are not submitted and therefore do not include the &#x60;submitted_at&#x60; property in the response. To create a pending review for a pull request, leave the &#x60;event&#x60; parameter blank. For more information about submitting a &#x60;PENDING&#x60; review, see \&quot;[Submit a review for a pull request](https://docs.github.com/rest/pulls/reviews#submit-a-review-for-a-pull-request).\&quot;  **Note:** To comment on a specific line in a file, you need to first determine the position of that line in the diff. To see a pull request diff, add the &#x60;application/vnd.github.v3.diff&#x60; media type to the &#x60;Accept&#x60; header of a call to the [Get a pull request](https://docs.github.com/rest/pulls/pulls#get-a-pull-request) endpoint.  The &#x60;position&#x60; value equals the number of lines down from the first \&quot;@@\&quot; hunk header in the file you want to add a comment. The line just below the \&quot;@@\&quot; line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val pullsCreateReviewRequest : PullsCreateReviewRequest = {"commit_id":"ecdd80bb57125d7ba9641ffaa4d7d2c19d3f3091","body":"This is close to perfect! Please address the suggested inline change.","event":"REQUEST_CHANGES","comments":[{"path":"file.md","position":6,"body":"Please add more information here, and fix this typo."}]} // PullsCreateReviewRequest | 
try {
    val result : PullRequestReview = apiInstance.pullsCreateReview(owner, repo, pullNumber, pullsCreateReviewRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsCreateReview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsCreateReview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **pullsCreateReviewRequest** | [**PullsCreateReviewRequest**](PullsCreateReviewRequest.md)|  | [optional]

### Return type

[**PullRequestReview**](PullRequestReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="pullsCreateReviewComment"></a>
# **pullsCreateReviewComment**
> PullRequestReviewComment pullsCreateReviewComment(owner, repo, pullNumber, pullsCreateReviewCommentRequest)

Create a review comment for a pull request

Creates a review comment on the diff of a specified pull request. To add a regular comment to a pull request timeline, see \&quot;[Create an issue comment](https://docs.github.com/rest/issues/comments#create-an-issue-comment).\&quot;  If your comment applies to more than one line in the pull request diff, you should use the parameters &#x60;line&#x60;, &#x60;side&#x60;, and optionally &#x60;start_line&#x60; and &#x60;start_side&#x60; in your request.  The &#x60;position&#x60; parameter is deprecated. If you use &#x60;position&#x60;, the &#x60;line&#x60;, &#x60;side&#x60;, &#x60;start_line&#x60;, and &#x60;start_side&#x60; parameters are not required.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information, see \&quot;[Rate limits for the API](https://docs.github.com/rest/overview/rate-limits-for-the-rest-api#about-secondary-rate-limits)\&quot; and \&quot;[Best practices for using the REST API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api).\&quot;  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val pullsCreateReviewCommentRequest : PullsCreateReviewCommentRequest = {"body":"Great stuff!","commit_id":"6dcb09b5b57875f334f61aebed695e2e4193db5e","path":"file1.txt","start_line":1,"start_side":"RIGHT","line":2,"side":"RIGHT"} // PullsCreateReviewCommentRequest | 
try {
    val result : PullRequestReviewComment = apiInstance.pullsCreateReviewComment(owner, repo, pullNumber, pullsCreateReviewCommentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsCreateReviewComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsCreateReviewComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **pullsCreateReviewCommentRequest** | [**PullsCreateReviewCommentRequest**](PullsCreateReviewCommentRequest.md)|  |

### Return type

[**PullRequestReviewComment**](PullRequestReviewComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="pullsDeletePendingReview"></a>
# **pullsDeletePendingReview**
> PullRequestReview pullsDeletePendingReview(owner, repo, pullNumber, reviewId)

Delete a pending review for a pull request

Deletes a pull request review that has not been submitted. Submitted reviews cannot be deleted.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val reviewId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the review.
try {
    val result : PullRequestReview = apiInstance.pullsDeletePendingReview(owner, repo, pullNumber, reviewId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsDeletePendingReview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsDeletePendingReview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **reviewId** | **kotlin.Int**| The unique identifier of the review. |

### Return type

[**PullRequestReview**](PullRequestReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pullsDeleteReviewComment"></a>
# **pullsDeleteReviewComment**
> pullsDeleteReviewComment(owner, repo, commentId)

Delete a review comment for a pull request

Deletes a review comment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
try {
    apiInstance.pullsDeleteReviewComment(owner, repo, commentId)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsDeleteReviewComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsDeleteReviewComment")
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
 - **Accept**: application/json

<a id="pullsDismissReview"></a>
# **pullsDismissReview**
> PullRequestReview pullsDismissReview(owner, repo, pullNumber, reviewId, pullsDismissReviewRequest)

Dismiss a review for a pull request

Dismisses a specified review on a pull request.  **Note:** To dismiss a pull request review on a [protected branch](https://docs.github.com/rest/branches/branch-protection), you must be a repository administrator or be included in the list of people or teams who can dismiss pull request reviews.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val reviewId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the review.
val pullsDismissReviewRequest : PullsDismissReviewRequest = {"message":"You are dismissed","event":"DISMISS"} // PullsDismissReviewRequest | 
try {
    val result : PullRequestReview = apiInstance.pullsDismissReview(owner, repo, pullNumber, reviewId, pullsDismissReviewRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsDismissReview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsDismissReview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **reviewId** | **kotlin.Int**| The unique identifier of the review. |
 **pullsDismissReviewRequest** | [**PullsDismissReviewRequest**](PullsDismissReviewRequest.md)|  |

### Return type

[**PullRequestReview**](PullRequestReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="pullsGet"></a>
# **pullsGet**
> PullRequest pullsGet(owner, repo, pullNumber)

Get a pull request

Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Lists details of a pull request by providing its number.  When you get, [create](https://docs.github.com/rest/pulls/pulls/#create-a-pull-request), or [edit](https://docs.github.com/rest/pulls/pulls#update-a-pull-request) a pull request, GitHub creates a merge commit to test whether the pull request can be automatically merged into the base branch. This test commit is not added to the base branch or the head branch. You can review the status of the test commit using the &#x60;mergeable&#x60; key. For more information, see \&quot;[Checking mergeability of pull requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pull-requests)\&quot;.  The value of the &#x60;mergeable&#x60; attribute can be &#x60;true&#x60;, &#x60;false&#x60;, or &#x60;null&#x60;. If the value is &#x60;null&#x60;, then GitHub has started a background job to compute the mergeability. After giving the job time to complete, resubmit the request. When the job finishes, you will see a non-&#x60;null&#x60; value for the &#x60;mergeable&#x60; attribute in the response. If &#x60;mergeable&#x60; is &#x60;true&#x60;, then &#x60;merge_commit_sha&#x60; will be the SHA of the _test_ merge commit.  The value of the &#x60;merge_commit_sha&#x60; attribute changes depending on the state of the pull request. Before merging a pull request, the &#x60;merge_commit_sha&#x60; attribute holds the SHA of the _test_ merge commit. After merging a pull request, the &#x60;merge_commit_sha&#x60; attribute changes depending on how you merged the pull request:  *   If merged as a [merge commit](https://docs.github.com/articles/about-merge-methods-on-github/), &#x60;merge_commit_sha&#x60; represents the SHA of the merge commit. *   If merged via a [squash](https://docs.github.com/articles/about-merge-methods-on-github/#squashing-your-merge-commits), &#x60;merge_commit_sha&#x60; represents the SHA of the squashed commit on the base branch. *   If [rebased](https://docs.github.com/articles/about-merge-methods-on-github/#rebasing-and-merging-your-commits), &#x60;merge_commit_sha&#x60; represents the commit that the base branch was updated to.  Pass the appropriate [media type](https://docs.github.com/rest/overview/media-types/#commits-commit-comparison-and-pull-requests) to fetch diff and patch formats.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;. - **&#x60;application/vnd.github.diff&#x60;**: For more information, see \&quot;[git-diff](https://git-scm.com/docs/git-diff)\&quot; in the Git documentation. If a diff is corrupt, contact us through the [GitHub Support portal](https://support.github.com/). Include the repository name and pull request ID in your message.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
try {
    val result : PullRequest = apiInstance.pullsGet(owner, repo, pullNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |

### Return type

[**PullRequest**](PullRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pullsGetReview"></a>
# **pullsGetReview**
> PullRequestReview pullsGetReview(owner, repo, pullNumber, reviewId)

Get a review for a pull request

Retrieves a pull request review by its ID.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val reviewId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the review.
try {
    val result : PullRequestReview = apiInstance.pullsGetReview(owner, repo, pullNumber, reviewId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsGetReview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsGetReview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **reviewId** | **kotlin.Int**| The unique identifier of the review. |

### Return type

[**PullRequestReview**](PullRequestReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pullsGetReviewComment"></a>
# **pullsGetReviewComment**
> PullRequestReviewComment pullsGetReviewComment(owner, repo, commentId)

Get a review comment for a pull request

Provides details for a specified review comment.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
try {
    val result : PullRequestReviewComment = apiInstance.pullsGetReviewComment(owner, repo, commentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsGetReviewComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsGetReviewComment")
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

[**PullRequestReviewComment**](PullRequestReviewComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pullsList"></a>
# **pullsList**
> kotlin.collections.List&lt;PullRequestSimple&gt; pullsList(owner, repo, state, head, base, sort, direction, perPage, page)

List pull requests

Lists pull requests in a specified repository.  Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;. - **&#x60;application/vnd.github.diff&#x60;**: For more information, see \&quot;[git-diff](https://git-scm.com/docs/git-diff)\&quot; in the Git documentation. If a diff is corrupt, contact us through the [GitHub Support portal](https://support.github.com/). Include the repository name and pull request ID in your message. - **&#x60;application/vnd.github.patch&#x60;**: For more information, see \&quot;[git-format-patch](https://git-scm.com/docs/git-format-patch)\&quot; in the Git documentation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val state : kotlin.String = state_example // kotlin.String | Either `open`, `closed`, or `all` to filter by state.
val head : kotlin.String = head_example // kotlin.String | Filter pulls by head user or head organization and branch name in the format of `user:ref-name` or `organization:ref-name`. For example: `github:new-script-format` or `octocat:test-branch`.
val base : kotlin.String = base_example // kotlin.String | Filter pulls by base branch name. Example: `gh-pages`.
val sort : kotlin.String = sort_example // kotlin.String | What to sort results by. `popularity` will sort by the number of comments. `long-running` will sort by date created and will limit the results to pull requests that have been open for more than a month and have had activity within the past month.
val direction : kotlin.String = direction_example // kotlin.String | The direction of the sort. Default: `desc` when sort is `created` or sort is not specified, otherwise `asc`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<PullRequestSimple> = apiInstance.pullsList(owner, repo, state, head, base, sort, direction, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **state** | **kotlin.String**| Either &#x60;open&#x60;, &#x60;closed&#x60;, or &#x60;all&#x60; to filter by state. | [optional] [default to open] [enum: open, closed, all]
 **head** | **kotlin.String**| Filter pulls by head user or head organization and branch name in the format of &#x60;user:ref-name&#x60; or &#x60;organization:ref-name&#x60;. For example: &#x60;github:new-script-format&#x60; or &#x60;octocat:test-branch&#x60;. | [optional] [default to &quot;push&quot;]
 **base** | **kotlin.String**| Filter pulls by base branch name. Example: &#x60;gh-pages&#x60;. | [optional] [default to &quot;push&quot;]
 **sort** | **kotlin.String**| What to sort results by. &#x60;popularity&#x60; will sort by the number of comments. &#x60;long-running&#x60; will sort by date created and will limit the results to pull requests that have been open for more than a month and have had activity within the past month. | [optional] [default to created] [enum: created, updated, popularity, long-running]
 **direction** | **kotlin.String**| The direction of the sort. Default: &#x60;desc&#x60; when sort is &#x60;created&#x60; or sort is not specified, otherwise &#x60;asc&#x60;. | [optional] [enum: asc, desc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;PullRequestSimple&gt;**](PullRequestSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pullsListCommentsForReview"></a>
# **pullsListCommentsForReview**
> kotlin.collections.List&lt;ReviewComment&gt; pullsListCommentsForReview(owner, repo, pullNumber, reviewId, perPage, page)

List comments for a pull request review

Lists comments for a specific pull request review.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val reviewId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the review.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<ReviewComment> = apiInstance.pullsListCommentsForReview(owner, repo, pullNumber, reviewId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsListCommentsForReview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsListCommentsForReview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **reviewId** | **kotlin.Int**| The unique identifier of the review. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;ReviewComment&gt;**](ReviewComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pullsListCommits"></a>
# **pullsListCommits**
> kotlin.collections.List&lt;Commit&gt; pullsListCommits(owner, repo, pullNumber, perPage, page)

List commits on a pull request

Lists a maximum of 250 commits for a pull request. To receive a complete commit list for pull requests with more than 250 commits, use the [List commits](https://docs.github.com/rest/commits/commits#list-commits) endpoint.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;. - **&#x60;application/vnd.github.diff&#x60;**: For more information, see \&quot;[git-diff](https://git-scm.com/docs/git-diff)\&quot; in the Git documentation. If a diff is corrupt, contact us through the [GitHub Support portal](https://support.github.com/). Include the repository name and pull request ID in your message.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Commit> = apiInstance.pullsListCommits(owner, repo, pullNumber, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsListCommits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsListCommits")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Commit&gt;**](Commit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pullsListFiles"></a>
# **pullsListFiles**
> kotlin.collections.List&lt;DiffEntry&gt; pullsListFiles(owner, repo, pullNumber, perPage, page)

List pull requests files

Lists the files in a specified pull request.  **Note:** Responses include a maximum of 3000 files. The paginated response returns 30 files per page by default.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;. - **&#x60;application/vnd.github.diff&#x60;**: For more information, see \&quot;[git-diff](https://git-scm.com/docs/git-diff)\&quot; in the Git documentation. If a diff is corrupt, contact us through the [GitHub Support portal](https://support.github.com/). Include the repository name and pull request ID in your message.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<DiffEntry> = apiInstance.pullsListFiles(owner, repo, pullNumber, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsListFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsListFiles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;DiffEntry&gt;**](DiffEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pullsListRequestedReviewers"></a>
# **pullsListRequestedReviewers**
> PullRequestReviewRequest pullsListRequestedReviewers(owner, repo, pullNumber)

Get all requested reviewers for a pull request

Gets the users or teams whose review is requested for a pull request. Once a requested reviewer submits a review, they are no longer considered a requested reviewer. Their review will instead be returned by the [List reviews for a pull request](https://docs.github.com/rest/pulls/reviews#list-reviews-for-a-pull-request) operation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
try {
    val result : PullRequestReviewRequest = apiInstance.pullsListRequestedReviewers(owner, repo, pullNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsListRequestedReviewers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsListRequestedReviewers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |

### Return type

[**PullRequestReviewRequest**](PullRequestReviewRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pullsListReviewComments"></a>
# **pullsListReviewComments**
> kotlin.collections.List&lt;PullRequestReviewComment&gt; pullsListReviewComments(owner, repo, pullNumber, sort, direction, since, perPage, page)

List review comments on a pull request

Lists all review comments for a specified pull request. By default, review comments are in ascending order by ID.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val sort : kotlin.String = sort_example // kotlin.String | The property to sort the results by.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort results. Ignored without `sort` parameter.
val since : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<PullRequestReviewComment> = apiInstance.pullsListReviewComments(owner, repo, pullNumber, sort, direction, since, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsListReviewComments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsListReviewComments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **sort** | **kotlin.String**| The property to sort the results by. | [optional] [default to created] [enum: created, updated]
 **direction** | **kotlin.String**| The direction to sort results. Ignored without &#x60;sort&#x60; parameter. | [optional] [enum: asc, desc]
 **since** | **kotlinx.datetime.Instant**| Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;PullRequestReviewComment&gt;**](PullRequestReviewComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pullsListReviewCommentsForRepo"></a>
# **pullsListReviewCommentsForRepo**
> kotlin.collections.List&lt;PullRequestReviewComment&gt; pullsListReviewCommentsForRepo(owner, repo, sort, direction, since, perPage, page)

List review comments in a repository

Lists review comments for all pull requests in a repository. By default, review comments are in ascending order by ID.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val sort : kotlin.String = sort_example // kotlin.String | 
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort results. Ignored without `sort` parameter.
val since : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<PullRequestReviewComment> = apiInstance.pullsListReviewCommentsForRepo(owner, repo, sort, direction, since, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsListReviewCommentsForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsListReviewCommentsForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **sort** | **kotlin.String**|  | [optional] [enum: created, updated, created_at]
 **direction** | **kotlin.String**| The direction to sort results. Ignored without &#x60;sort&#x60; parameter. | [optional] [enum: asc, desc]
 **since** | **kotlinx.datetime.Instant**| Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;PullRequestReviewComment&gt;**](PullRequestReviewComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pullsListReviews"></a>
# **pullsListReviews**
> kotlin.collections.List&lt;PullRequestReview&gt; pullsListReviews(owner, repo, pullNumber, perPage, page)

List reviews for a pull request

Lists all reviews for a specified pull request. The list of reviews returns in chronological order.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<PullRequestReview> = apiInstance.pullsListReviews(owner, repo, pullNumber, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsListReviews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsListReviews")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;PullRequestReview&gt;**](PullRequestReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pullsMerge"></a>
# **pullsMerge**
> PullRequestMergeResult pullsMerge(owner, repo, pullNumber, pullsMergeRequest)

Merge a pull request

Merges a pull request into the base branch. This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information, see \&quot;[Rate limits for the API](https://docs.github.com/rest/overview/rate-limits-for-the-rest-api#about-secondary-rate-limits)\&quot; and \&quot;[Best practices for using the REST API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val pullsMergeRequest : PullsMergeRequest = {"commit_title":"Expand enum","commit_message":"Add a new value to the merge_method enum"} // PullsMergeRequest | 
try {
    val result : PullRequestMergeResult = apiInstance.pullsMerge(owner, repo, pullNumber, pullsMergeRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsMerge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsMerge")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **pullsMergeRequest** | [**PullsMergeRequest**](PullsMergeRequest.md)|  | [optional]

### Return type

[**PullRequestMergeResult**](PullRequestMergeResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="pullsRemoveRequestedReviewers"></a>
# **pullsRemoveRequestedReviewers**
> PullRequestSimple pullsRemoveRequestedReviewers(owner, repo, pullNumber, pullsRemoveRequestedReviewersRequest)

Remove requested reviewers from a pull request

Removes review requests from a pull request for a given set of users and/or teams.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val pullsRemoveRequestedReviewersRequest : PullsRemoveRequestedReviewersRequest = {"reviewers":["octocat","hubot","other_user"],"team_reviewers":["justice-league"]} // PullsRemoveRequestedReviewersRequest | 
try {
    val result : PullRequestSimple = apiInstance.pullsRemoveRequestedReviewers(owner, repo, pullNumber, pullsRemoveRequestedReviewersRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsRemoveRequestedReviewers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsRemoveRequestedReviewers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **pullsRemoveRequestedReviewersRequest** | [**PullsRemoveRequestedReviewersRequest**](PullsRemoveRequestedReviewersRequest.md)|  |

### Return type

[**PullRequestSimple**](PullRequestSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="pullsRequestReviewers"></a>
# **pullsRequestReviewers**
> PullRequestSimple pullsRequestReviewers(owner, repo, pullNumber, pullsRequestReviewersRequest)

Request reviewers for a pull request

Requests reviews for a pull request from a given set of users and/or teams. This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information, see \&quot;[Rate limits for the API](https://docs.github.com/rest/overview/rate-limits-for-the-rest-api#about-secondary-rate-limits)\&quot; and \&quot;[Best practices for using the REST API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val pullsRequestReviewersRequest : PullsRequestReviewersRequest = {reviewers=[octocat, hubot, other_user], team_reviewers=[justice-league]} // PullsRequestReviewersRequest | 
try {
    val result : PullRequestSimple = apiInstance.pullsRequestReviewers(owner, repo, pullNumber, pullsRequestReviewersRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsRequestReviewers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsRequestReviewers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **pullsRequestReviewersRequest** | [**PullsRequestReviewersRequest**](PullsRequestReviewersRequest.md)|  | [optional]

### Return type

[**PullRequestSimple**](PullRequestSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="pullsSubmitReview"></a>
# **pullsSubmitReview**
> PullRequestReview pullsSubmitReview(owner, repo, pullNumber, reviewId, pullsSubmitReviewRequest)

Submit a review for a pull request

Submits a pending review for a pull request. For more information about creating a pending review for a pull request, see \&quot;[Create a review for a pull request](https://docs.github.com/rest/pulls/reviews#create-a-review-for-a-pull-request).\&quot;  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val reviewId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the review.
val pullsSubmitReviewRequest : PullsSubmitReviewRequest = {"body":"Here is the body for the review.","event":"REQUEST_CHANGES"} // PullsSubmitReviewRequest | 
try {
    val result : PullRequestReview = apiInstance.pullsSubmitReview(owner, repo, pullNumber, reviewId, pullsSubmitReviewRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsSubmitReview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsSubmitReview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **reviewId** | **kotlin.Int**| The unique identifier of the review. |
 **pullsSubmitReviewRequest** | [**PullsSubmitReviewRequest**](PullsSubmitReviewRequest.md)|  |

### Return type

[**PullRequestReview**](PullRequestReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="pullsUpdate"></a>
# **pullsUpdate**
> PullRequest pullsUpdate(owner, repo, pullNumber, pullsUpdateRequest)

Update a pull request

Draft pull requests are available in public repositories with GitHub Free and GitHub Free for organizations, GitHub Pro, and legacy per-repository billing plans, and in public and private repositories with GitHub Team and GitHub Enterprise Cloud. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  To open or update a pull request in a public repository, you must have write access to the head or the source branch. For organization-owned repositories, you must be a member of the organization that owns the repository to open or update a pull request.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;. - **&#x60;application/vnd.github.diff&#x60;**: For more information, see \&quot;[git-diff](https://git-scm.com/docs/git-diff)\&quot; in the Git documentation. If a diff is corrupt, contact us through the [GitHub Support portal](https://support.github.com/). Include the repository name and pull request ID in your message.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val pullsUpdateRequest : PullsUpdateRequest = {"title":"new title","body":"updated body","state":"open","base":"master"} // PullsUpdateRequest | 
try {
    val result : PullRequest = apiInstance.pullsUpdate(owner, repo, pullNumber, pullsUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **pullsUpdateRequest** | [**PullsUpdateRequest**](PullsUpdateRequest.md)|  | [optional]

### Return type

[**PullRequest**](PullRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="pullsUpdateBranch"></a>
# **pullsUpdateBranch**
> ActivityMarkRepoNotificationsAsRead202Response pullsUpdateBranch(owner, repo, pullNumber, pullsUpdateBranchRequest)

Update a pull request branch

Updates the pull request branch with the latest upstream changes by merging HEAD from the base branch into the pull request branch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val pullsUpdateBranchRequest : PullsUpdateBranchRequest = {"expected_head_sha":"6dcb09b5b57875f334f61aebed695e2e4193db5e"} // PullsUpdateBranchRequest | 
try {
    val result : ActivityMarkRepoNotificationsAsRead202Response = apiInstance.pullsUpdateBranch(owner, repo, pullNumber, pullsUpdateBranchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsUpdateBranch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsUpdateBranch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **pullsUpdateBranchRequest** | [**PullsUpdateBranchRequest**](PullsUpdateBranchRequest.md)|  | [optional]

### Return type

[**ActivityMarkRepoNotificationsAsRead202Response**](ActivityMarkRepoNotificationsAsRead202Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="pullsUpdateReview"></a>
# **pullsUpdateReview**
> PullRequestReview pullsUpdateReview(owner, repo, pullNumber, reviewId, pullsUpdateReviewRequest)

Update a review for a pull request

Updates the contents of a specified review summary comment.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val reviewId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the review.
val pullsUpdateReviewRequest : PullsUpdateReviewRequest = {"body":"This is close to perfect! Please address the suggested inline change. And add more about this."} // PullsUpdateReviewRequest | 
try {
    val result : PullRequestReview = apiInstance.pullsUpdateReview(owner, repo, pullNumber, reviewId, pullsUpdateReviewRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsUpdateReview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsUpdateReview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **reviewId** | **kotlin.Int**| The unique identifier of the review. |
 **pullsUpdateReviewRequest** | [**PullsUpdateReviewRequest**](PullsUpdateReviewRequest.md)|  |

### Return type

[**PullRequestReview**](PullRequestReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="pullsUpdateReviewComment"></a>
# **pullsUpdateReviewComment**
> PullRequestReviewComment pullsUpdateReviewComment(owner, repo, commentId, pullsUpdateReviewCommentRequest)

Update a review comment for a pull request

Edits the content of a specified review comment.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PullsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
val pullsUpdateReviewCommentRequest : PullsUpdateReviewCommentRequest = {"body":"I like this too!"} // PullsUpdateReviewCommentRequest | 
try {
    val result : PullRequestReviewComment = apiInstance.pullsUpdateReviewComment(owner, repo, commentId, pullsUpdateReviewCommentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PullsApi#pullsUpdateReviewComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PullsApi#pullsUpdateReviewComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |
 **pullsUpdateReviewCommentRequest** | [**PullsUpdateReviewCommentRequest**](PullsUpdateReviewCommentRequest.md)|  |

### Return type

[**PullRequestReviewComment**](PullRequestReviewComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

