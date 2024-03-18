
# CheckSuite

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** |  | 
**nodeId** | **kotlin.String** |  | 
**headBranch** | **kotlin.String** |  | 
**headSha** | **kotlin.String** | The SHA of the head commit that is being checked. | 
**status** | [**inline**](#Status) | The phase of the lifecycle that the check suite is currently in. Statuses of waiting, requested, and pending are reserved for GitHub Actions check suites. | 
**conclusion** | [**inline**](#Conclusion) |  | 
**url** | **kotlin.String** |  | 
**before** | **kotlin.String** |  | 
**after** | **kotlin.String** |  | 
**pullRequests** | [**kotlin.collections.List&lt;PullRequestMinimal&gt;**](PullRequestMinimal.md) |  | 
**app** | [**IssuePerformedViaGithubApp**](IssuePerformedViaGithubApp.md) |  | 
**repository** | [**MinimalRepository**](MinimalRepository.md) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**headCommit** | [**SimpleCommit**](SimpleCommit.md) |  | 
**latestCheckRunsCount** | **kotlin.Int** |  | 
**checkRunsUrl** | **kotlin.String** |  | 
**rerequestable** | **kotlin.Boolean** |  |  [optional]
**runsRerequestable** | **kotlin.Boolean** |  |  [optional]


<a id="Status"></a>
## Enum: status
Name | Value
---- | -----
status | queued, in_progress, completed, waiting, requested, pending, 


<a id="Conclusion"></a>
## Enum: conclusion
Name | Value
---- | -----
conclusion | success, failure, neutral, cancelled, skipped, timed_out, action_required, startup_failure, stale, 



