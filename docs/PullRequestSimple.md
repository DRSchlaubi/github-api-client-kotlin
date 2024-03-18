
# PullRequestSimple

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**id** | **kotlin.Int** |  | 
**nodeId** | **kotlin.String** |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**diffUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**patchUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**issueUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**commitsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**reviewCommentsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**reviewCommentUrl** | **kotlin.String** |  | 
**commentsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**statusesUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**number** | **kotlin.Int** |  | 
**state** | **kotlin.String** |  | 
**locked** | **kotlin.Boolean** |  | 
**title** | **kotlin.String** |  | 
**user** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**body** | **kotlin.String** |  | 
**labels** | [**kotlin.collections.List&lt;PullRequestSimpleLabelsInner&gt;**](PullRequestSimpleLabelsInner.md) |  | 
**milestone** | [**IssueMilestone**](IssueMilestone.md) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**closedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**mergedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**mergeCommitSha** | **kotlin.String** |  | 
**assignee** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**head** | [**PullRequestSimpleHead**](PullRequestSimpleHead.md) |  | 
**base** | [**PullRequestSimpleHead**](PullRequestSimpleHead.md) |  | 
**links** | [**PullRequestSimpleLinks**](PullRequestSimpleLinks.md) |  | 
**authorAssociation** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**autoMerge** | [**AutoMerge**](AutoMerge.md) |  | 
**activeLockReason** | **kotlin.String** |  |  [optional]
**assignees** | [**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md) |  |  [optional]
**requestedReviewers** | [**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md) |  |  [optional]
**requestedTeams** | [**kotlin.collections.List&lt;Team&gt;**](Team.md) |  |  [optional]
**draft** | **kotlin.Boolean** | Indicates whether or not the pull request is a draft. |  [optional]



