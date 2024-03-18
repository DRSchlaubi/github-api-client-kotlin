
# WebhookCodeScanningAlertReopenedByUserAlert

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the alert was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ.&#x60; | 
**dismissedAt** | [**kotlin.Any**](.md) | The time that the alert was dismissed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | 
**dismissedBy** | [**kotlin.Any**](.md) |  | 
**dismissedReason** | [**kotlin.Any**](.md) | The reason for dismissing or closing the alert. Can be one of: &#x60;false positive&#x60;, &#x60;won&#39;t fix&#x60;, and &#x60;used in tests&#x60;. | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) | The GitHub URL of the alert resource. | 
**number** | **kotlin.Int** | The code scanning alert number. | 
**rule** | [**WebhookCodeScanningAlertAppearedInBranchAlertRule**](WebhookCodeScanningAlertAppearedInBranchAlertRule.md) |  | 
**state** | [**inline**](#State) | State of a code scanning alert. | 
**tool** | [**WebhookCodeScanningAlertAppearedInBranchAlertTool**](WebhookCodeScanningAlertAppearedInBranchAlertTool.md) |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**mostRecentInstance** | [**AlertInstance**](AlertInstance.md) |  |  [optional]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | open, fixed



