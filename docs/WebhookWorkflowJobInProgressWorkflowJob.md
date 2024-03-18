
# WebhookWorkflowJobInProgressWorkflowJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**checkRunUrl** | **kotlin.String** |  | 
**completedAt** | **kotlin.String** |  | 
**conclusion** | **kotlin.String** |  | 
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
**status** | [**inline**](#Status) |  | 
**headBranch** | **kotlin.String** | The name of the current branch. | 
**workflowName** | **kotlin.String** | The name of the workflow. | 
**steps** | [**kotlin.collections.List&lt;WorkflowStep2&gt;**](WorkflowStep2.md) |  | 
**url** | **kotlin.String** |  | 


<a id="Status"></a>
## Enum: status
Name | Value
---- | -----
status | in_progress, completed, queued



