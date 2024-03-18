
# ActionsReviewPendingDeploymentsForRunRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**environmentIds** | **kotlin.collections.List&lt;kotlin.Int&gt;** | The list of environment ids to approve or reject | 
**state** | [**inline**](#State) | Whether to approve or reject deployment to the specified environments. | 
**comment** | **kotlin.String** | A comment to accompany the deployment review | 


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | approved, rejected



