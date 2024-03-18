
# CheckRunWithSimpleCheckSuite

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app** | [**IssuePerformedViaGithubApp**](IssuePerformedViaGithubApp.md) |  | 
**checkSuite** | [**SimpleCheckSuite**](SimpleCheckSuite.md) |  | 
**completedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**conclusion** | [**inline**](#Conclusion) |  | 
**detailsUrl** | **kotlin.String** |  | 
**externalId** | **kotlin.String** |  | 
**headSha** | **kotlin.String** | The SHA of the commit that is being checked. | 
**htmlUrl** | **kotlin.String** |  | 
**id** | **kotlin.Int** | The id of the check. | 
**name** | **kotlin.String** | The name of the check. | 
**nodeId** | **kotlin.String** |  | 
**output** | [**CheckRunOutput**](CheckRunOutput.md) |  | 
**pullRequests** | [**kotlin.collections.List&lt;PullRequestMinimal&gt;**](PullRequestMinimal.md) |  | 
**startedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**status** | [**inline**](#Status) | The phase of the lifecycle that the check is currently in. | 
**url** | **kotlin.String** |  | 
**deployment** | [**DeploymentSimple**](DeploymentSimple.md) |  |  [optional]


<a id="Conclusion"></a>
## Enum: conclusion
Name | Value
---- | -----
conclusion | waiting, pending, startup_failure, stale, success, failure, neutral, cancelled, skipped, timed_out, action_required, 


<a id="Status"></a>
## Enum: status
Name | Value
---- | -----
status | queued, in_progress, completed, pending



