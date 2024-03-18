
# WebhookWorkflowJobCompletedWorkflowJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**checkRunUrl** | **kotlin.String** |  | 
**completedAt** | **kotlin.String** |  | 
**conclusion** | [**inline**](#Conclusion) |  | 
**createdAt** | **kotlin.String** | The time that the job created. | 
**headSha** | **kotlin.String** |  | 
**htmlUrl** | **kotlin.String** |  | 
**id** | **kotlin.Int** |  | 
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**name** | **kotlin.String** |  | 
**nodeId** | **kotlin.String** |  | 
**runAttempt** | **kotlin.Int** |  | 
**runId** | **kotlin.Int** |  | 
**runUrl** | **kotlin.String** |  | 
**runnerGroupId** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**runnerGroupName** | **kotlin.String** |  | 
**runnerId** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**runnerName** | **kotlin.String** |  | 
**startedAt** | **kotlin.String** |  | 
**status** | **kotlin.String** |  | 
**headBranch** | **kotlin.String** | The name of the current branch. | 
**workflowName** | **kotlin.String** | The name of the workflow. | 
**steps** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  | 
**url** | **kotlin.String** |  | 


<a id="Conclusion"></a>
## Enum: conclusion
Name | Value
---- | -----
conclusion | success, failure, skipped, cancelled, action_required, neutral, timed_out



