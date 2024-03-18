
# IssueSearchResultItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**repositoryUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**labelsUrl** | **kotlin.String** |  | 
**commentsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**eventsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**id** | **kotlin.Long** |  | 
**nodeId** | **kotlin.String** |  | 
**number** | **kotlin.Int** |  | 
**title** | **kotlin.String** |  | 
**locked** | **kotlin.Boolean** |  | 
**user** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**labels** | [**kotlin.collections.List&lt;IssueSearchResultItemLabelsInner&gt;**](IssueSearchResultItemLabelsInner.md) |  | 
**state** | **kotlin.String** |  | 
**assignee** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**milestone** | [**IssueMilestone**](IssueMilestone.md) |  | 
**comments** | **kotlin.Int** |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**closedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**score** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**authorAssociation** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**activeLockReason** | **kotlin.String** |  |  [optional]
**assignees** | [**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md) |  |  [optional]
**stateReason** | **kotlin.String** |  |  [optional]
**textMatches** | [**kotlin.collections.List&lt;SearchResultTextMatchesInner&gt;**](SearchResultTextMatchesInner.md) |  |  [optional]
**pullRequest** | [**IssuePullRequest**](IssuePullRequest.md) |  |  [optional]
**body** | **kotlin.String** |  |  [optional]
**draft** | **kotlin.Boolean** |  |  [optional]
**repository** | [**Repository**](Repository.md) |  |  [optional]
**bodyHtml** | **kotlin.String** |  |  [optional]
**bodyText** | **kotlin.String** |  |  [optional]
**timelineUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**performedViaGithubApp** | [**IssuePerformedViaGithubApp**](IssuePerformedViaGithubApp.md) |  |  [optional]
**reactions** | [**ReactionRollup**](ReactionRollup.md) |  |  [optional]



