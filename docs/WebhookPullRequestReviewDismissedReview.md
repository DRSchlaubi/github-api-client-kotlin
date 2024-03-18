
# WebhookPullRequestReviewDismissedReview

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**WebhookPullRequestReviewDismissedReviewLinks**](WebhookPullRequestReviewDismissedReviewLinks.md) |  | 
**authorAssociation** | [**inline**](#AuthorAssociation) | How the author is associated with the repository. | 
**body** | **kotlin.String** | The text of the review. | 
**commitId** | **kotlin.String** | A commit SHA for the review. | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**id** | **kotlin.Int** | Unique identifier of the review | 
**nodeId** | **kotlin.String** |  | 
**pullRequestUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**state** | [**inline**](#State) |  | 
**submittedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**user** | [**User2**](User2.md) |  | 


<a id="AuthorAssociation"></a>
## Enum: author_association
Name | Value
---- | -----
authorAssociation | COLLABORATOR, CONTRIBUTOR, FIRST_TIMER, FIRST_TIME_CONTRIBUTOR, MANNEQUIN, MEMBER, NONE, OWNER


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | dismissed, approved, changes_requested



