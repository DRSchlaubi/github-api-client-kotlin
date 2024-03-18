
# CodeScanningAlertItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number** | **kotlin.Int** | The security alert number. |  [readonly]
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the alert was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly]
**url** | [**java.net.URI**](java.net.URI.md) | The REST API URL of the alert resource. |  [readonly]
**htmlUrl** | [**java.net.URI**](java.net.URI.md) | The GitHub URL of the alert resource. |  [readonly]
**instancesUrl** | [**java.net.URI**](java.net.URI.md) | The REST API URL for fetching the list of instances for an alert. |  [readonly]
**state** | [**CodeScanningAlertState**](CodeScanningAlertState.md) |  | 
**dismissedBy** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**dismissedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the alert was dismissed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly]
**dismissedReason** | [**CodeScanningAlertDismissedReason**](CodeScanningAlertDismissedReason.md) |  | 
**rule** | [**CodeScanningAlertRuleSummary**](CodeScanningAlertRuleSummary.md) |  | 
**tool** | [**CodeScanningAnalysisTool**](CodeScanningAnalysisTool.md) |  | 
**mostRecentInstance** | [**CodeScanningAlertInstance**](CodeScanningAlertInstance.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the alert was last updated in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] [readonly]
**fixedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the alert was no longer detected and was considered fixed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] [readonly]
**dismissedComment** | **kotlin.String** | The dismissal comment associated with the dismissal of the alert. |  [optional]



