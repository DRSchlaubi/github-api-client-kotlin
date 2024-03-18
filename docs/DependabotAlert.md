
# DependabotAlert

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number** | **kotlin.Int** | The security alert number. |  [readonly]
**state** | [**inline**](#State) | The state of the Dependabot alert. |  [readonly]
**dependency** | [**DependabotAlertWithRepositoryDependency**](DependabotAlertWithRepositoryDependency.md) |  | 
**securityAdvisory** | [**DependabotAlertSecurityAdvisory**](DependabotAlertSecurityAdvisory.md) |  | 
**securityVulnerability** | [**DependabotAlertSecurityVulnerability**](DependabotAlertSecurityVulnerability.md) |  | 
**url** | [**java.net.URI**](java.net.URI.md) | The REST API URL of the alert resource. |  [readonly]
**htmlUrl** | [**java.net.URI**](java.net.URI.md) | The GitHub URL of the alert resource. |  [readonly]
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the alert was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly]
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the alert was last updated in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly]
**dismissedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the alert was dismissed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly]
**dismissedBy** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**dismissedReason** | [**inline**](#DismissedReason) | The reason that the alert was dismissed. | 
**dismissedComment** | **kotlin.String** | An optional comment associated with the alert&#39;s dismissal. | 
**fixedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the alert was no longer detected and was considered fixed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly]
**autoDismissedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the alert was auto-dismissed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] [readonly]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | auto_dismissed, dismissed, fixed, open


<a id="DismissedReason"></a>
## Enum: dismissed_reason
Name | Value
---- | -----
dismissedReason | fix_started, inaccurate, no_bandwidth, not_used, tolerable_risk, 



