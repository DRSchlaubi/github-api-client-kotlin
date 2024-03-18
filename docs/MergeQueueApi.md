# MergeQueueApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mergeGroupChecksRequested**](MergeQueueApi.md#mergeGroupChecksRequested) | **POST** /merge-group-checks-requested | This event occurs when there is activity relating to a merge group in a merge queue. For more information, see \&quot;[Managing a merge queue](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/configuring-pull-request-merges/managing-a-merge-queue).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Merge queues\&quot; repository permission.
[**mergeGroupDestroyed**](MergeQueueApi.md#mergeGroupDestroyed) | **POST** /merge-group-destroyed | This event occurs when there is activity relating to a merge group in a merge queue. For more information, see \&quot;[Managing a merge queue](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/configuring-pull-request-merges/managing-a-merge-queue).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Merge queues\&quot; repository permission.


<a id="mergeGroupChecksRequested"></a>
# **mergeGroupChecksRequested**
> mergeGroupChecksRequested(webhookMergeGroupChecksRequested, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a merge group in a merge queue. For more information, see \&quot;[Managing a merge queue](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/configuring-pull-request-merges/managing-a-merge-queue).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Merge queues\&quot; repository permission.

Status checks were requested for a merge group. This happens when a merge group is created or added to by the merge queue because a pull request was queued.  When you receive this event, you should perform checks on the head SHA and report status back using check runs or commit statuses.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MergeQueueApi()
val webhookMergeGroupChecksRequested : WebhookMergeGroupChecksRequested =  // WebhookMergeGroupChecksRequested | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.mergeGroupChecksRequested(webhookMergeGroupChecksRequested, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling MergeQueueApi#mergeGroupChecksRequested")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MergeQueueApi#mergeGroupChecksRequested")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMergeGroupChecksRequested** | [**WebhookMergeGroupChecksRequested**](WebhookMergeGroupChecksRequested.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="mergeGroupDestroyed"></a>
# **mergeGroupDestroyed**
> mergeGroupDestroyed(webhookMergeGroupDestroyed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a merge group in a merge queue. For more information, see \&quot;[Managing a merge queue](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/configuring-pull-request-merges/managing-a-merge-queue).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Merge queues\&quot; repository permission.

The merge queue groups pull requests together to be merged. This event indicates that one of those merge groups was destroyed. This happens when a pull request is removed from the queue: any group containing that pull request is also destroyed.  When you receive this event, you may want to cancel any checks that are running on the head SHA to avoid wasting computing resources on a merge group that will not be used.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MergeQueueApi()
val webhookMergeGroupDestroyed : WebhookMergeGroupDestroyed =  // WebhookMergeGroupDestroyed | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.mergeGroupDestroyed(webhookMergeGroupDestroyed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling MergeQueueApi#mergeGroupDestroyed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MergeQueueApi#mergeGroupDestroyed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMergeGroupDestroyed** | [**WebhookMergeGroupDestroyed**](WebhookMergeGroupDestroyed.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

