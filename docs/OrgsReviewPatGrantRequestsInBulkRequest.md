
# OrgsReviewPatGrantRequestsInBulkRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**inline**](#Action) | Action to apply to the requests. | 
**patRequestIds** | **kotlin.collections.List&lt;kotlin.Int&gt;** | Unique identifiers of the requests for access via fine-grained personal access token. Must be formed of between 1 and 100 &#x60;pat_request_id&#x60; values. |  [optional]
**reason** | **kotlin.String** | Reason for approving or denying the requests. Max 1024 characters. |  [optional]


<a id="Action"></a>
## Enum: action
Name | Value
---- | -----
action | approve, deny



