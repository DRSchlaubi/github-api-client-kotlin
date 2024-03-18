
# WebhookDeploymentReviewRequested

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**inline**](#Action) |  | 
**environment** | **kotlin.String** |  | 
**organization** | [**OrganizationSimpleWebhooks**](OrganizationSimpleWebhooks.md) |  | 
**repository** | [**RepositoryWebhooks**](RepositoryWebhooks.md) |  | 
**requestor** | [**User**](User.md) |  | 
**reviewers** | [**kotlin.collections.List&lt;WebhookDeploymentReviewRequestedReviewersInner&gt;**](WebhookDeploymentReviewRequestedReviewersInner.md) |  | 
**sender** | [**SimpleUserWebhooks**](SimpleUserWebhooks.md) |  | 
**since** | **kotlin.String** |  | 
**workflowJobRun** | [**WebhookDeploymentReviewRequestedWorkflowJobRun**](WebhookDeploymentReviewRequestedWorkflowJobRun.md) |  | 
**workflowRun** | [**DeploymentWorkflowRun1**](DeploymentWorkflowRun1.md) |  | 
**enterprise** | [**EnterpriseWebhooks**](EnterpriseWebhooks.md) |  |  [optional]
**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional]


<a id="Action"></a>
## Enum: action
Name | Value
---- | -----
action | requested



