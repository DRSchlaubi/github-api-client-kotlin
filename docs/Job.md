
# Job

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | The id of the job. | 
**runId** | **kotlin.Int** | The id of the associated workflow run. | 
**runUrl** | **kotlin.String** |  | 
**nodeId** | **kotlin.String** |  | 
**headSha** | **kotlin.String** | The SHA of the commit that is being run. | 
**url** | **kotlin.String** |  | 
**htmlUrl** | **kotlin.String** |  | 
**status** | [**inline**](#Status) | The phase of the lifecycle that the job is currently in. | 
**conclusion** | [**inline**](#Conclusion) | The outcome of the job. | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the job created, in ISO 8601 format. | 
**startedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the job started, in ISO 8601 format. | 
**completedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the job finished, in ISO 8601 format. | 
**name** | **kotlin.String** | The name of the job. | 
**checkRunUrl** | **kotlin.String** |  | 
**labels** | **kotlin.collections.List&lt;kotlin.String&gt;** | Labels for the workflow job. Specified by the \&quot;runs_on\&quot; attribute in the action&#39;s workflow file. | 
**runnerId** | **kotlin.Int** | The ID of the runner to which this job has been assigned. (If a runner hasn&#39;t yet been assigned, this will be null.) | 
**runnerName** | **kotlin.String** | The name of the runner to which this job has been assigned. (If a runner hasn&#39;t yet been assigned, this will be null.) | 
**runnerGroupId** | **kotlin.Int** | The ID of the runner group to which this job has been assigned. (If a runner hasn&#39;t yet been assigned, this will be null.) | 
**runnerGroupName** | **kotlin.String** | The name of the runner group to which this job has been assigned. (If a runner hasn&#39;t yet been assigned, this will be null.) | 
**workflowName** | **kotlin.String** | The name of the workflow. | 
**headBranch** | **kotlin.String** | The name of the current branch. | 
**runAttempt** | **kotlin.Int** | Attempt number of the associated workflow run, 1 for first attempt and higher if the workflow was re-run. |  [optional]
**steps** | [**kotlin.collections.List&lt;JobStepsInner&gt;**](JobStepsInner.md) | Steps in this job. |  [optional]


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



