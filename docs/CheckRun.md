
# CheckRun

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | The id of the check. | 
**headSha** | **kotlin.String** | The SHA of the commit that is being checked. | 
**nodeId** | **kotlin.String** |  | 
**externalId** | **kotlin.String** |  | 
**url** | **kotlin.String** |  | 
**htmlUrl** | **kotlin.String** |  | 
**detailsUrl** | **kotlin.String** |  | 
**status** | [**inline**](#Status) | The phase of the lifecycle that the check is currently in. Statuses of waiting, requested, and pending are reserved for GitHub Actions check runs. | 
**conclusion** | [**inline**](#Conclusion) |  | 
**startedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**completedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**output** | [**CheckRunOutput**](CheckRunOutput.md) |  | 
**name** | **kotlin.String** | The name of the check. | 
**checkSuite** | [**CheckRunCheckSuite**](CheckRunCheckSuite.md) |  | 
**app** | [**IssuePerformedViaGithubApp**](IssuePerformedViaGithubApp.md) |  | 
**pullRequests** | [**kotlin.collections.List&lt;PullRequestMinimal&gt;**](PullRequestMinimal.md) | Pull requests that are open with a &#x60;head_sha&#x60; or &#x60;head_branch&#x60; that matches the check. The returned pull requests do not necessarily indicate pull requests that triggered the check. | 
**deployment** | [**DeploymentSimple**](DeploymentSimple.md) |  |  [optional]


<a id="Status"></a>
## Enum: status
Name | Value
---- | -----
status | queued, in_progress, completed, waiting, requested, pending


<a id="Conclusion"></a>
## Enum: conclusion
Name | Value
---- | -----
conclusion | success, failure, neutral, cancelled, skipped, timed_out, action_required, 



