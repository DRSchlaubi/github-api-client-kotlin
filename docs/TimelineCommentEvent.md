
# TimelineCommentEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **kotlin.String** |  | 
**actor** | [**SimpleUser**](SimpleUser.md) |  | 
**id** | **kotlin.Int** | Unique identifier of the issue comment | 
**nodeId** | **kotlin.String** |  | 
**url** | [**java.net.URI**](java.net.URI.md) | URL for the issue comment | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**user** | [**SimpleUser**](SimpleUser.md) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**issueUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**authorAssociation** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**body** | **kotlin.String** | Contents of the issue comment |  [optional]
**bodyText** | **kotlin.String** |  |  [optional]
**bodyHtml** | **kotlin.String** |  |  [optional]
**performedViaGithubApp** | [**IssuePerformedViaGithubApp**](IssuePerformedViaGithubApp.md) |  |  [optional]
**reactions** | [**ReactionRollup**](ReactionRollup.md) |  |  [optional]



