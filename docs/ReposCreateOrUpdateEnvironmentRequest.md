
# ReposCreateOrUpdateEnvironmentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**waitTimer** | **kotlin.Int** | The amount of time to delay a job after the job is initially triggered. The time (in minutes) must be an integer between 0 and 43,200 (30 days). |  [optional]
**preventSelfReview** | **kotlin.Boolean** | Whether or not a user who created the job is prevented from approving their own job. |  [optional]
**reviewers** | [**kotlin.Any**](.md) | The people or teams that may review jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed. |  [optional]
**deploymentBranchPolicy** | [**DeploymentBranchPolicySettings**](DeploymentBranchPolicySettings.md) |  |  [optional]



