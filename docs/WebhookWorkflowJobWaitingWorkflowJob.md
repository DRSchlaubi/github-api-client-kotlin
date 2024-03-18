
# WebhookWorkflowJobWaitingWorkflowJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**checkRunUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**completedAt** | **kotlin.String** |  | 
**conclusion** | **kotlin.String** |  | 
**createdAt** | **kotlin.String** | The time that the job created. | 
**headSha** | **kotlin.String** |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**id** | **kotlin.Int** |  | 
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**name** | **kotlin.String** |  | 
**nodeId** | **kotlin.String** |  | 
**runAttempt** | **kotlin.Int** |  | 
**runId** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**runUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**runnerGroupId** | **kotlin.Int** |  | 
**runnerGroupName** | **kotlin.String** |  | 
**runnerId** | **kotlin.Int** |  | 
**runnerName** | **kotlin.String** |  | 
**startedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**headBranch** | **kotlin.String** | The name of the current branch. | 
**workflowName** | **kotlin.String** | The name of the workflow. | 
**status** | [**inline**](#Status) |  | 
**steps** | [**kotlin.collections.List&lt;WorkflowStep4&gt;**](WorkflowStep4.md) |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 


<a id="Status"></a>
## Enum: status
Name | Value
---- | -----
status | queued, in_progress, completed, waiting



