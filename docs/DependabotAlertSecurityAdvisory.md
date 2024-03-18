
# DependabotAlertSecurityAdvisory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ghsaId** | [**kotlin.Any**](.md) | The unique GitHub Security Advisory ID assigned to the advisory. |  [readonly]
**cveId** | [**kotlin.Any**](.md) | The unique CVE ID assigned to the advisory. |  [readonly]
**summary** | [**kotlin.Any**](.md) | A short, plain text summary of the advisory. |  [readonly]
**description** | [**kotlin.Any**](.md) | A long-form Markdown-supported description of the advisory. |  [readonly]
**vulnerabilities** | [**kotlin.Any**](.md) | Vulnerable version range information for the advisory. |  [readonly]
**severity** | [**inline**](#Severity) | The severity of the advisory. |  [readonly]
**cvss** | [**DependabotAlertSecurityAdvisoryCvss**](DependabotAlertSecurityAdvisoryCvss.md) |  | 
**cwes** | [**kotlin.Any**](.md) | Details for the advisory pertaining to Common Weakness Enumeration. |  [readonly]
**identifiers** | [**kotlin.Any**](.md) | Values that identify this advisory among security information sources. |  [readonly]
**references** | [**kotlin.Any**](.md) | Links to additional advisory information. |  [readonly]
**publishedAt** | [**kotlin.Any**](.md) | The time that the advisory was published in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly]
**updatedAt** | [**kotlin.Any**](.md) | The time that the advisory was last modified in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly]
**withdrawnAt** | [**kotlin.Any**](.md) | The time that the advisory was withdrawn in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly]


<a id="Severity"></a>
## Enum: severity
Name | Value
---- | -----
severity | low, medium, high, critical



