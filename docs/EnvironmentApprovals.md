
# EnvironmentApprovals

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**environments** | [**kotlin.collections.List&lt;EnvironmentApprovalsEnvironmentsInner&gt;**](EnvironmentApprovalsEnvironmentsInner.md) | The list of environments that were approved or rejected | 
**state** | [**inline**](#State) | Whether deployment to the environment(s) was approved or rejected or pending (with comments) | 
**user** | [**SimpleUser**](SimpleUser.md) |  | 
**comment** | **kotlin.String** | The comment submitted with the deployment review | 


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | approved, rejected, pending



