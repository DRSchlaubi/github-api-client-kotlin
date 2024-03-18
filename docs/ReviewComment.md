
# ReviewComment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**pullRequestReviewId** | **kotlin.Int** |  | 
**id** | **kotlin.Int** |  | 
**nodeId** | **kotlin.String** |  | 
**diffHunk** | **kotlin.String** |  | 
**path** | **kotlin.String** |  | 
**position** | **kotlin.Int** |  | 
**originalPosition** | **kotlin.Int** |  | 
**commitId** | **kotlin.String** |  | 
**originalCommitId** | **kotlin.String** |  | 
**user** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**body** | **kotlin.String** |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**pullRequestUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**authorAssociation** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**links** | [**ReviewCommentLinks**](ReviewCommentLinks.md) |  | 
**inReplyToId** | **kotlin.Int** |  |  [optional]
**bodyText** | **kotlin.String** |  |  [optional]
**bodyHtml** | **kotlin.String** |  |  [optional]
**reactions** | [**ReactionRollup**](ReactionRollup.md) |  |  [optional]
**side** | [**inline**](#Side) | The side of the first line of the range for a multi-line comment. |  [optional]
**startSide** | [**inline**](#StartSide) | The side of the first line of the range for a multi-line comment. |  [optional]
**line** | **kotlin.Int** | The line of the blob to which the comment applies. The last line of the range for a multi-line comment |  [optional]
**originalLine** | **kotlin.Int** | The original line of the blob to which the comment applies. The last line of the range for a multi-line comment |  [optional]
**startLine** | **kotlin.Int** | The first line of the range for a multi-line comment. |  [optional]
**originalStartLine** | **kotlin.Int** | The original first line of the range for a multi-line comment. |  [optional]


<a id="Side"></a>
## Enum: side
Name | Value
---- | -----
side | LEFT, RIGHT


<a id="StartSide"></a>
## Enum: start_side
Name | Value
---- | -----
startSide | LEFT, RIGHT, 



