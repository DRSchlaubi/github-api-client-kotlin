
# OrganizationSecretScanningAlert

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number** | **kotlin.Int** | The security alert number. |  [optional] [readonly]
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the alert was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional] [readonly]
**updatedAt** | [**OrganizationSecretScanningAlertUpdatedAt**](OrganizationSecretScanningAlertUpdatedAt.md) |  |  [optional]
**url** | [**java.net.URI**](java.net.URI.md) | The REST API URL of the alert resource. |  [optional] [readonly]
**htmlUrl** | [**java.net.URI**](java.net.URI.md) | The GitHub URL of the alert resource. |  [optional] [readonly]
**locationsUrl** | [**java.net.URI**](java.net.URI.md) | The REST API URL of the code locations for this alert. |  [optional]
**state** | [**SecretScanningAlertState**](SecretScanningAlertState.md) |  |  [optional]
**resolution** | [**SecretScanningAlertResolution**](SecretScanningAlertResolution.md) |  |  [optional]
**resolvedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the alert was resolved in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional]
**resolvedBy** | [**IntegrationOwner**](IntegrationOwner.md) |  |  [optional]
**secretType** | **kotlin.String** | The type of secret that secret scanning detected. |  [optional]
**secretTypeDisplayName** | **kotlin.String** | User-friendly name for the detected secret, matching the &#x60;secret_type&#x60;. For a list of built-in patterns, see \&quot;[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security).\&quot; |  [optional]
**secret** | **kotlin.String** | The secret that was detected. |  [optional]
**repository** | [**SimpleRepository**](SimpleRepository.md) |  |  [optional]
**pushProtectionBypassed** | **kotlin.Boolean** | Whether push protection was bypassed for the detected secret. |  [optional]
**pushProtectionBypassedBy** | [**IntegrationOwner**](IntegrationOwner.md) |  |  [optional]
**pushProtectionBypassedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that push protection was bypassed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional]
**resolutionComment** | **kotlin.String** | The comment that was optionally added when this alert was closed |  [optional]
**validity** | [**inline**](#Validity) | The token status as of the latest validity check. |  [optional]


<a id="Validity"></a>
## Enum: validity
Name | Value
---- | -----
validity | active, inactive, unknown



