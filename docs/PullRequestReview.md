
# PullRequestReview

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | Unique identifier of the review | 
**nodeId** | **kotlin.String** |  | 
**user** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**body** | **kotlin.String** | The text of the review. | 
**state** | **kotlin.String** |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**pullRequestUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**links** | [**TimelineReviewedEventLinks**](TimelineReviewedEventLinks.md) |  | 
**commitId** | **kotlin.String** | A commit SHA for the review. If the commit object was garbage collected or forcibly deleted, then it no longer exists in Git and this value will be &#x60;null&#x60;. | 
**authorAssociation** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**submittedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional]
**bodyHtml** | **kotlin.String** |  |  [optional]
**bodyText** | **kotlin.String** |  |  [optional]



