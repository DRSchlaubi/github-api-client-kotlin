
# WebhookDeploymentReviewApproved

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**inline**](#Action) |  | 
**organization** | [**OrganizationSimpleWebhooks**](OrganizationSimpleWebhooks.md) |  | 
**repository** | [**RepositoryWebhooks**](RepositoryWebhooks.md) |  | 
**sender** | [**SimpleUserWebhooks**](SimpleUserWebhooks.md) |  | 
**since** | **kotlin.String** |  | 
**workflowRun** | [**DeploymentWorkflowRun1**](DeploymentWorkflowRun1.md) |  | 
**approver** | [**BranchRestrictionPolicyUsersInner**](BranchRestrictionPolicyUsersInner.md) |  |  [optional]
**comment** | **kotlin.String** |  |  [optional]
**enterprise** | [**EnterpriseWebhooks**](EnterpriseWebhooks.md) |  |  [optional]
**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional]
**reviewers** | [**kotlin.collections.List&lt;WebhookDeploymentReviewApprovedReviewersInner&gt;**](WebhookDeploymentReviewApprovedReviewersInner.md) |  |  [optional]
**workflowJobRun** | [**WebhookDeploymentReviewApprovedWorkflowJobRun**](WebhookDeploymentReviewApprovedWorkflowJobRun.md) |  |  [optional]
**workflowJobRuns** | [**kotlin.collections.List&lt;WebhookDeploymentReviewApprovedWorkflowJobRunsInner&gt;**](WebhookDeploymentReviewApprovedWorkflowJobRunsInner.md) |  |  [optional]


<a id="Action"></a>
## Enum: action
Name | Value
---- | -----
action | approved



