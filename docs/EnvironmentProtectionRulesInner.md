
# EnvironmentProtectionRulesInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Any**](.md) |  | 
**nodeId** | [**kotlin.Any**](.md) |  | 
**type** | [**kotlin.Any**](.md) |  | 
**waitTimer** | [**kotlin.Any**](.md) | The amount of time to delay a job after the job is initially triggered. The time (in minutes) must be an integer between 0 and 43,200 (30 days). |  [optional]
**preventSelfReview** | [**kotlin.Any**](.md) | Whether deployments to this environment can be approved by the user who created the deployment. |  [optional]
**reviewers** | [**kotlin.Any**](.md) | The people or teams that may approve jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed. |  [optional]



