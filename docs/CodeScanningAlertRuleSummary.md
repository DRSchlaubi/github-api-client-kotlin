
# CodeScanningAlertRuleSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | A unique identifier for the rule used to detect the alert. |  [optional]
**name** | **kotlin.String** | The name of the rule used to detect the alert. |  [optional]
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | A set of tags applicable for the rule. |  [optional]
**severity** | [**inline**](#Severity) | The severity of the alert. |  [optional]
**securitySeverityLevel** | [**inline**](#SecuritySeverityLevel) | The security severity of the alert. |  [optional]
**description** | **kotlin.String** | A short description of the rule used to detect the alert. |  [optional]


<a id="Severity"></a>
## Enum: severity
Name | Value
---- | -----
severity | none, note, warning, error, 


<a id="SecuritySeverityLevel"></a>
## Enum: security_severity_level
Name | Value
---- | -----
securitySeverityLevel | low, medium, high, critical, 



