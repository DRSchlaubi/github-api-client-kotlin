
# WebhookCodeScanningAlertClosedByUserAlert

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the alert was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ.&#x60; | 
**dismissedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the alert was dismissed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | 
**dismissedBy** | [**User**](User.md) |  | 
**dismissedReason** | [**inline**](#DismissedReason) | The reason for dismissing or closing the alert. | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) | The GitHub URL of the alert resource. | 
**number** | **kotlin.Int** | The code scanning alert number. | 
**rule** | [**WebhookCodeScanningAlertClosedByUserAlertRule**](WebhookCodeScanningAlertClosedByUserAlertRule.md) |  | 
**state** | [**inline**](#State) | State of a code scanning alert. | 
**tool** | [**WebhookCodeScanningAlertClosedByUserAlertTool**](WebhookCodeScanningAlertClosedByUserAlertTool.md) |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**mostRecentInstance** | [**AlertInstance**](AlertInstance.md) |  |  [optional]


<a id="DismissedReason"></a>
## Enum: dismissed_reason
Name | Value
---- | -----
dismissedReason | false positive, won&#39;t fix, used in tests, 


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | dismissed, fixed



