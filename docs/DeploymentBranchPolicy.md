
# DeploymentBranchPolicy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | The unique identifier of the branch or tag policy. |  [optional]
**nodeId** | **kotlin.String** |  |  [optional]
**name** | **kotlin.String** | The name pattern that branches or tags must match in order to deploy to the environment. |  [optional]
**type** | [**inline**](#Type) | Whether this rule targets a branch or tag. |  [optional]


<a id="Type"></a>
## Enum: type
Name | Value
---- | -----
type | branch, tag



