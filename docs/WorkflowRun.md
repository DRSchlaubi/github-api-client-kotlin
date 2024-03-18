
# WorkflowRun

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actor** | [**User**](User.md) |  | 
**artifactsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**cancelUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**checkSuiteId** | **kotlin.Int** |  | 
**checkSuiteNodeId** | **kotlin.String** |  | 
**checkSuiteUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**conclusion** | [**inline**](#Conclusion) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**event** | **kotlin.String** |  | 
**headBranch** | **kotlin.String** |  | 
**headCommit** | [**SimpleCommit**](SimpleCommit.md) |  | 
**headRepository** | [**RepositoryLite**](RepositoryLite.md) |  | 
**headSha** | **kotlin.String** |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**id** | **kotlin.Int** |  | 
**jobsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**logsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**name** | **kotlin.String** |  | 
**nodeId** | **kotlin.String** |  | 
**path** | **kotlin.String** |  | 
**previousAttemptUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**pullRequests** | [**kotlin.collections.List&lt;WorkflowRunPullRequestsInner&gt;**](WorkflowRunPullRequestsInner.md) |  | 
**repository** | [**RepositoryLite**](RepositoryLite.md) |  | 
**rerunUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**runAttempt** | **kotlin.Int** |  | 
**runNumber** | **kotlin.Int** |  | 
**runStartedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**status** | [**inline**](#Status) |  | 
**triggeringActor** | [**User**](User.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**workflowId** | **kotlin.Int** |  | 
**workflowUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**displayTitle** | **kotlin.String** |  | 
**referencedWorkflows** | [**kotlin.collections.List&lt;DeploymentWorkflowRunReferencedWorkflowsInner&gt;**](DeploymentWorkflowRunReferencedWorkflowsInner.md) |  |  [optional]


<a id="Conclusion"></a>
## Enum: conclusion
Name | Value
---- | -----
conclusion | success, failure, neutral, cancelled, timed_out, action_required, stale, , skipped, startup_failure


<a id="Status"></a>
## Enum: status
Name | Value
---- | -----
status | requested, in_progress, completed, queued, pending, waiting



