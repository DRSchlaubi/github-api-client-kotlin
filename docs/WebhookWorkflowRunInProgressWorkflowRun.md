
# WebhookWorkflowRunInProgressWorkflowRun

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actor** | [**BranchRestrictionPolicyUsersInner**](BranchRestrictionPolicyUsersInner.md) |  | 
**artifactsUrl** | **kotlin.String** |  | 
**cancelUrl** | **kotlin.String** |  | 
**checkSuiteId** | **kotlin.Int** |  | 
**checkSuiteNodeId** | **kotlin.String** |  | 
**checkSuiteUrl** | **kotlin.String** |  | 
**conclusion** | [**inline**](#Conclusion) |  | 
**createdAt** | **kotlin.String** |  | 
**event** | **kotlin.String** |  | 
**headBranch** | **kotlin.String** |  | 
**headCommit** | [**WebhookWorkflowRunCompletedWorkflowRunAllOfHeadCommit**](WebhookWorkflowRunCompletedWorkflowRunAllOfHeadCommit.md) |  | 
**headRepository** | [**WebhookWorkflowRunInProgressWorkflowRunAllOfHeadRepository**](WebhookWorkflowRunInProgressWorkflowRunAllOfHeadRepository.md) |  | 
**headSha** | **kotlin.String** |  | 
**htmlUrl** | **kotlin.String** |  | 
**id** | **kotlin.Int** |  | 
**jobsUrl** | **kotlin.String** |  | 
**logsUrl** | **kotlin.String** |  | 
**name** | **kotlin.String** |  | 
**nodeId** | **kotlin.String** |  | 
**path** | **kotlin.String** |  | 
**previousAttemptUrl** | **kotlin.String** |  | 
**pullRequests** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  | 
**repository** | [**DeploymentWorkflowRun1HeadRepository**](DeploymentWorkflowRun1HeadRepository.md) |  | 
**rerunUrl** | **kotlin.String** |  | 
**runAttempt** | **kotlin.Int** |  | 
**runNumber** | **kotlin.Int** |  | 
**runStartedAt** | **kotlin.String** |  | 
**status** | **kotlin.String** |  | 
**triggeringActor** | [**BranchRestrictionPolicyUsersInner**](BranchRestrictionPolicyUsersInner.md) |  | 
**updatedAt** | **kotlin.String** |  | 
**url** | **kotlin.String** |  | 
**workflowId** | **kotlin.Int** |  | 
**workflowUrl** | **kotlin.String** |  | 
**referencedWorkflows** | [**kotlin.collections.List&lt;DeploymentWorkflowRunReferencedWorkflowsInner&gt;**](DeploymentWorkflowRunReferencedWorkflowsInner.md) |  |  [optional]


<a id="Conclusion"></a>
## Enum: conclusion
Name | Value
---- | -----
conclusion | success, failure, neutral, cancelled, timed_out, action_required, skipped, stale, 



