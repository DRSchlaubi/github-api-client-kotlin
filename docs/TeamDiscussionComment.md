
# TeamDiscussionComment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**body** | **kotlin.String** | The main text of the comment. | 
**bodyHtml** | **kotlin.String** |  | 
**bodyVersion** | **kotlin.String** | The current version of the body content. If provided, this update operation will be rejected if the given version does not match the latest version on the server. | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**lastEditedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**discussionUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**nodeId** | **kotlin.String** |  | 
**number** | **kotlin.Int** | The unique sequence number of a team discussion comment. | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**reactions** | [**ReactionRollup**](ReactionRollup.md) |  |  [optional]



