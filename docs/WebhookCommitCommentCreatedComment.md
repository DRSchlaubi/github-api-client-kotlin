
# WebhookCommitCommentCreatedComment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorAssociation** | [**inline**](#AuthorAssociation) | How the author is associated with the repository. | 
**body** | **kotlin.String** | The text of the comment. | 
**commitId** | **kotlin.String** | The SHA of the commit to which the comment applies. | 
**createdAt** | **kotlin.String** |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**id** | **kotlin.Int** | The ID of the commit comment. | 
**line** | **kotlin.Int** | The line of the blob to which the comment applies. The last line of the range for a multi-line comment | 
**nodeId** | **kotlin.String** | The node ID of the commit comment. | 
**path** | **kotlin.String** | The relative path of the file to which the comment applies. | 
**position** | **kotlin.Int** | The line index in the diff to which the comment applies. | 
**updatedAt** | **kotlin.String** |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**user** | [**User**](User.md) |  | 
**reactions** | [**Reactions**](Reactions.md) |  |  [optional]


<a id="AuthorAssociation"></a>
## Enum: author_association
Name | Value
---- | -----
authorAssociation | COLLABORATOR, CONTRIBUTOR, FIRST_TIMER, FIRST_TIME_CONTRIBUTOR, MANNEQUIN, MEMBER, NONE, OWNER



