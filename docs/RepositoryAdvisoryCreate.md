
# RepositoryAdvisoryCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**summary** | [**kotlin.Any**](.md) | A short summary of the advisory. | 
**description** | [**kotlin.Any**](.md) | A detailed description of what the advisory impacts. | 
**vulnerabilities** | [**kotlin.Any**](.md) | A product affected by the vulnerability detailed in a repository security advisory. | 
**cveId** | [**kotlin.Any**](.md) | The Common Vulnerabilities and Exposures (CVE) ID. |  [optional]
**cweIds** | [**kotlin.Any**](.md) | A list of Common Weakness Enumeration (CWE) IDs. |  [optional]
**credits** | [**kotlin.Any**](.md) | A list of users receiving credit for their participation in the security advisory. |  [optional]
**severity** | [**inline**](#Severity) | The severity of the advisory. You must choose between setting this field or &#x60;cvss_vector_string&#x60;. |  [optional]
**cvssVectorString** | [**kotlin.Any**](.md) | The CVSS vector that calculates the severity of the advisory. You must choose between setting this field or &#x60;severity&#x60;. |  [optional]
**startPrivateFork** | [**kotlin.Any**](.md) | Whether to create a temporary private fork of the repository to collaborate on a fix. |  [optional]


<a id="Severity"></a>
## Enum: severity
Name | Value
---- | -----
severity | critical, high, medium, low, 



