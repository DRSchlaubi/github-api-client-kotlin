
# WebhookDeploymentStatusCreatedCheckRun

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**conclusion** | [**inline**](#Conclusion) | The result of the completed check run. This value will be &#x60;null&#x60; until the check run has completed. | 
**detailsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**externalId** | **kotlin.String** |  | 
**headSha** | **kotlin.String** | The SHA of the commit that is being checked. | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**id** | **kotlin.Int** | The id of the check. | 
**name** | **kotlin.String** | The name of the check run. | 
**nodeId** | **kotlin.String** |  | 
**startedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**status** | [**inline**](#Status) | The current status of the check run. Can be &#x60;queued&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 


<a id="Conclusion"></a>
## Enum: conclusion
Name | Value
---- | -----
conclusion | success, failure, neutral, cancelled, timed_out, action_required, stale, skipped, 


<a id="Status"></a>
## Enum: status
Name | Value
---- | -----
status | queued, in_progress, completed, waiting, pending



