
# GlobalAdvisory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ghsaId** | **kotlin.String** | The GitHub Security Advisory ID. |  [readonly]
**cveId** | **kotlin.String** | The Common Vulnerabilities and Exposures (CVE) ID. |  [readonly]
**url** | **kotlin.String** | The API URL for the advisory. |  [readonly]
**htmlUrl** | [**java.net.URI**](java.net.URI.md) | The URL for the advisory. |  [readonly]
**repositoryAdvisoryUrl** | [**java.net.URI**](java.net.URI.md) | The API URL for the repository advisory. |  [readonly]
**summary** | **kotlin.String** | A short summary of the advisory. | 
**description** | **kotlin.String** | A detailed description of what the advisory entails. | 
**type** | [**inline**](#Type) | The type of advisory. |  [readonly]
**severity** | [**inline**](#Severity) | The severity of the advisory. | 
**sourceCodeLocation** | [**java.net.URI**](java.net.URI.md) | The URL of the advisory&#39;s source code. | 
**identifiers** | [**kotlin.collections.List&lt;GlobalAdvisoryIdentifiersInner&gt;**](GlobalAdvisoryIdentifiersInner.md) |  | 
**references** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**publishedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time of when the advisory was published, in ISO 8601 format. |  [readonly]
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time of when the advisory was last updated, in ISO 8601 format. |  [readonly]
**githubReviewedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time of when the advisory was reviewed by GitHub, in ISO 8601 format. |  [readonly]
**nvdPublishedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time when the advisory was published in the National Vulnerability Database, in ISO 8601 format. This field is only populated when the advisory is imported from the National Vulnerability Database. |  [readonly]
**withdrawnAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time of when the advisory was withdrawn, in ISO 8601 format. |  [readonly]
**vulnerabilities** | [**kotlin.collections.List&lt;GlobalAdvisoryVulnerabilitiesInner&gt;**](GlobalAdvisoryVulnerabilitiesInner.md) | The products and respective version ranges affected by the advisory. | 
**cvss** | [**GlobalAdvisoryCvss**](GlobalAdvisoryCvss.md) |  | 
**cwes** | [**kotlin.collections.List&lt;GlobalAdvisoryCwesInner&gt;**](GlobalAdvisoryCwesInner.md) |  | 
**credits** | [**kotlin.collections.List&lt;GlobalAdvisoryCreditsInner&gt;**](GlobalAdvisoryCreditsInner.md) | The users who contributed to the advisory. | 


<a id="Type"></a>
## Enum: type
Name | Value
---- | -----
type | reviewed, unreviewed, malware


<a id="Severity"></a>
## Enum: severity
Name | Value
---- | -----
severity | critical, high, medium, low, unknown



