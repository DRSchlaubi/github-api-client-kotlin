
# IssueComment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorAssociation** | [**inline**](#AuthorAssociation) | How the author is associated with the repository. | 
**body** | **kotlin.String** | Contents of the issue comment | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**id** | **kotlin.Long** | Unique identifier of the issue comment | 
**issueUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**nodeId** | **kotlin.String** |  | 
**performedViaGithubApp** | [**IssuePerformedViaGithubApp**](IssuePerformedViaGithubApp.md) |  | 
**reactions** | [**Reactions**](Reactions.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**url** | [**java.net.URI**](java.net.URI.md) | URL for the issue comment | 
**user** | [**User**](User.md) |  | 


<a id="AuthorAssociation"></a>
## Enum: author_association
Name | Value
---- | -----
authorAssociation | COLLABORATOR, CONTRIBUTOR, FIRST_TIMER, FIRST_TIME_CONTRIBUTOR, MANNEQUIN, MEMBER, NONE, OWNER



