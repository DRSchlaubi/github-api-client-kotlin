
# DeploymentWorkflowRun1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actor** | [**User**](User.md) |  | 
**checkSuiteId** | **kotlin.Int** |  | 
**checkSuiteNodeId** | **kotlin.String** |  | 
**conclusion** | [**inline**](#Conclusion) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**displayTitle** | **kotlin.String** |  | 
**event** | **kotlin.String** |  | 
**headBranch** | **kotlin.String** |  | 
**headSha** | **kotlin.String** |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**id** | **kotlin.Int** |  | 
**name** | **kotlin.String** |  | 
**nodeId** | **kotlin.String** |  | 
**path** | **kotlin.String** |  | 
**pullRequests** | [**kotlin.collections.List&lt;CheckRunPullRequest&gt;**](CheckRunPullRequest.md) |  | 
**runAttempt** | **kotlin.Int** |  | 
**runNumber** | **kotlin.Int** |  | 
**runStartedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**status** | [**inline**](#Status) |  | 
**triggeringActor** | [**User**](User.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**workflowId** | **kotlin.Int** |  | 
**artifactsUrl** | **kotlin.String** |  |  [optional]
**cancelUrl** | **kotlin.String** |  |  [optional]
**checkSuiteUrl** | **kotlin.String** |  |  [optional]
**headCommit** | [**kotlin.Any**](.md) |  |  [optional]
**headRepository** | [**DeploymentWorkflowRun1HeadRepository**](DeploymentWorkflowRun1HeadRepository.md) |  |  [optional]
**jobsUrl** | **kotlin.String** |  |  [optional]
**logsUrl** | **kotlin.String** |  |  [optional]
**previousAttemptUrl** | **kotlin.String** |  |  [optional]
**referencedWorkflows** | [**kotlin.collections.List&lt;DeploymentWorkflowRunReferencedWorkflowsInner&gt;**](DeploymentWorkflowRunReferencedWorkflowsInner.md) |  |  [optional]
**repository** | [**DeploymentWorkflowRun1HeadRepository**](DeploymentWorkflowRun1HeadRepository.md) |  |  [optional]
**rerunUrl** | **kotlin.String** |  |  [optional]
**workflowUrl** | **kotlin.String** |  |  [optional]


<a id="Conclusion"></a>
## Enum: conclusion
Name | Value
---- | -----
conclusion | success, failure, neutral, cancelled, timed_out, action_required, stale, 


<a id="Status"></a>
## Enum: status
Name | Value
---- | -----
status | requested, in_progress, completed, queued, waiting, pending



