
# EnvironmentProtectionRulesInnerAnyOf1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** |  | 
**nodeId** | **kotlin.String** |  | 
**type** | **kotlin.String** |  | 
**preventSelfReview** | **kotlin.Boolean** | Whether deployments to this environment can be approved by the user who created the deployment. |  [optional]
**reviewers** | [**kotlin.collections.List&lt;PendingDeploymentReviewersInner&gt;**](PendingDeploymentReviewersInner.md) | The people or teams that may approve jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed. |  [optional]



