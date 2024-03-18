
# RepositoryAdvisory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ghsaId** | **kotlin.String** | The GitHub Security Advisory ID. |  [readonly]
**cveId** | **kotlin.String** | The Common Vulnerabilities and Exposures (CVE) ID. | 
**url** | [**java.net.URI**](java.net.URI.md) | The API URL for the advisory. |  [readonly]
**htmlUrl** | [**java.net.URI**](java.net.URI.md) | The URL for the advisory. |  [readonly]
**summary** | **kotlin.String** | A short summary of the advisory. | 
**description** | **kotlin.String** | A detailed description of what the advisory entails. | 
**severity** | [**inline**](#Severity) | The severity of the advisory. | 
**author** | [**RepositoryAdvisoryAuthor**](RepositoryAdvisoryAuthor.md) |  | 
**publisher** | [**RepositoryAdvisoryPublisher**](RepositoryAdvisoryPublisher.md) |  | 
**identifiers** | [**kotlin.collections.List&lt;GlobalAdvisoryIdentifiersInner&gt;**](GlobalAdvisoryIdentifiersInner.md) |  | 
**state** | [**inline**](#State) | The state of the advisory. | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time of when the advisory was created, in ISO 8601 format. |  [readonly]
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time of when the advisory was last updated, in ISO 8601 format. |  [readonly]
**publishedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time of when the advisory was published, in ISO 8601 format. |  [readonly]
**closedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time of when the advisory was closed, in ISO 8601 format. |  [readonly]
**withdrawnAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time of when the advisory was withdrawn, in ISO 8601 format. |  [readonly]
**submission** | [**RepositoryAdvisorySubmission**](RepositoryAdvisorySubmission.md) |  | 
**vulnerabilities** | [**kotlin.collections.List&lt;RepositoryAdvisoryVulnerability&gt;**](RepositoryAdvisoryVulnerability.md) |  | 
**cvss** | [**GlobalAdvisoryCvss**](GlobalAdvisoryCvss.md) |  | 
**cwes** | [**kotlin.collections.List&lt;GlobalAdvisoryCwesInner&gt;**](GlobalAdvisoryCwesInner.md) |  | 
**cweIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of only the CWE IDs. | 
**credits** | [**kotlin.collections.List&lt;RepositoryAdvisoryCreditsInner&gt;**](RepositoryAdvisoryCreditsInner.md) |  | 
**creditsDetailed** | [**kotlin.collections.List&lt;RepositoryAdvisoryCredit&gt;**](RepositoryAdvisoryCredit.md) |  | 
**collaboratingUsers** | [**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md) | A list of users that collaborate on the advisory. | 
**collaboratingTeams** | [**kotlin.collections.List&lt;Team&gt;**](Team.md) | A list of teams that collaborate on the advisory. | 
**privateFork** | [**RepositoryAdvisoryPrivateFork**](RepositoryAdvisoryPrivateFork.md) |  | 


<a id="Severity"></a>
## Enum: severity
Name | Value
---- | -----
severity | critical, high, medium, low, 


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | published, closed, withdrawn, draft, triage



