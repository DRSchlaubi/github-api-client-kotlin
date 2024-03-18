
# TeamDiscussion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**body** | **kotlin.String** | The main text of the discussion. | 
**bodyHtml** | **kotlin.String** |  | 
**bodyVersion** | **kotlin.String** | The current version of the body content. If provided, this update operation will be rejected if the given version does not match the latest version on the server. | 
**commentsCount** | **kotlin.Int** |  | 
**commentsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**lastEditedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**nodeId** | **kotlin.String** |  | 
**number** | **kotlin.Int** | The unique sequence number of a team discussion. | 
**pinned** | **kotlin.Boolean** | Whether or not this discussion should be pinned for easy retrieval. | 
**&#x60;private&#x60;** | **kotlin.Boolean** | Whether or not this discussion should be restricted to team members and organization owners. | 
**teamUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**title** | **kotlin.String** | The title of the discussion. | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**reactions** | [**ReactionRollup**](ReactionRollup.md) |  |  [optional]



