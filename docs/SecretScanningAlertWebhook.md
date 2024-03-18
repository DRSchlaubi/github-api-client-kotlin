
# SecretScanningAlertWebhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number** | **kotlin.Int** | The security alert number. |  [optional] [readonly]
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the alert was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] [readonly]
**updatedAt** | [**OrganizationSecretScanningAlertUpdatedAt**](OrganizationSecretScanningAlertUpdatedAt.md) |  |  [optional]
**url** | [**java.net.URI**](java.net.URI.md) | The REST API URL of the alert resource. |  [optional] [readonly]
**htmlUrl** | [**java.net.URI**](java.net.URI.md) | The GitHub URL of the alert resource. |  [optional] [readonly]
**locationsUrl** | [**java.net.URI**](java.net.URI.md) | The REST API URL of the code locations for this alert. |  [optional]
**resolution** | [**SecretScanningAlertResolutionWebhook**](SecretScanningAlertResolutionWebhook.md) |  |  [optional]
**resolvedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the alert was resolved in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional]
**resolvedBy** | [**IntegrationOwner**](IntegrationOwner.md) |  |  [optional]
**resolutionComment** | **kotlin.String** | An optional comment to resolve an alert. |  [optional]
**secretType** | **kotlin.String** | The type of secret that secret scanning detected. |  [optional]
**validity** | [**inline**](#Validity) | The token status as of the latest validity check. |  [optional]
**pushProtectionBypassed** | **kotlin.Boolean** | Whether push protection was bypassed for the detected secret. |  [optional]
**pushProtectionBypassedBy** | [**IntegrationOwner**](IntegrationOwner.md) |  |  [optional]
**pushProtectionBypassedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that push protection was bypassed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional]


<a id="Validity"></a>
## Enum: validity
Name | Value
---- | -----
validity | active, inactive, unknown



