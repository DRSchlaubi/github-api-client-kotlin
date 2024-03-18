
# TimelineReviewedEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **kotlin.String** |  | 
**id** | **kotlin.Int** | Unique identifier of the review | 
**nodeId** | **kotlin.String** |  | 
**user** | [**SimpleUser**](SimpleUser.md) |  | 
**body** | **kotlin.String** | The text of the review. | 
**state** | **kotlin.String** |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**pullRequestUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**links** | [**TimelineReviewedEventLinks**](TimelineReviewedEventLinks.md) |  | 
**commitId** | **kotlin.String** | A commit SHA for the review. | 
**authorAssociation** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**submittedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional]
**bodyHtml** | **kotlin.String** |  |  [optional]
**bodyText** | **kotlin.String** |  |  [optional]



