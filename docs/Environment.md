
# Environment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | The id of the environment. | 
**nodeId** | **kotlin.String** |  | 
**name** | **kotlin.String** | The name of the environment. | 
**url** | **kotlin.String** |  | 
**htmlUrl** | **kotlin.String** |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the environment was created, in ISO 8601 format. | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the environment was last updated, in ISO 8601 format. | 
**protectionRules** | [**kotlin.collections.List&lt;EnvironmentProtectionRulesInner&gt;**](EnvironmentProtectionRulesInner.md) | Built-in deployment protection rules for the environment. |  [optional]
**deploymentBranchPolicy** | [**DeploymentBranchPolicySettings**](DeploymentBranchPolicySettings.md) |  |  [optional]



