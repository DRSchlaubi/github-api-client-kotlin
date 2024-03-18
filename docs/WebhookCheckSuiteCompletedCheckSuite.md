
# WebhookCheckSuiteCompletedCheckSuite

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**after** | **kotlin.String** |  | 
**app** | [**App**](App.md) |  | 
**before** | **kotlin.String** |  | 
**checkRunsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**conclusion** | [**inline**](#Conclusion) | The summary conclusion for all check runs that are part of the check suite. This value will be &#x60;null&#x60; until the check run has &#x60;completed&#x60;. | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**headBranch** | **kotlin.String** | The head branch name the changes are on. | 
**headCommit** | [**SimpleCommit**](SimpleCommit.md) |  | 
**headSha** | **kotlin.String** | The SHA of the head commit that is being checked. | 
**id** | **kotlin.Int** |  | 
**latestCheckRunsCount** | **kotlin.Int** |  | 
**nodeId** | **kotlin.String** |  | 
**pullRequests** | [**kotlin.collections.List&lt;CheckRunPullRequest&gt;**](CheckRunPullRequest.md) | An array of pull requests that match this check suite. A pull request matches a check suite if they have the same &#x60;head_sha&#x60; and &#x60;head_branch&#x60;. When the check suite&#39;s &#x60;head_branch&#x60; is in a forked repository it will be &#x60;null&#x60; and the &#x60;pull_requests&#x60; array will be empty. | 
**status** | [**inline**](#Status) | The summary status for all check runs that are part of the check suite. Can be &#x60;requested&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**url** | [**java.net.URI**](java.net.URI.md) | URL that points to the check suite API resource. | 
**rerequestable** | **kotlin.Boolean** |  |  [optional]
**runsRerequestable** | **kotlin.Boolean** |  |  [optional]


<a id="Conclusion"></a>
## Enum: conclusion
Name | Value
---- | -----
conclusion | success, failure, neutral, cancelled, timed_out, action_required, stale, , skipped, startup_failure


<a id="Status"></a>
## Enum: status
Name | Value
---- | -----
status | requested, in_progress, completed, queued, , pending



