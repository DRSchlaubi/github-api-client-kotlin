
# Discussion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeLockReason** | **kotlin.String** |  | 
**answerChosenAt** | **kotlin.String** |  | 
**answerChosenBy** | [**User**](User.md) |  | 
**answerHtmlUrl** | **kotlin.String** |  | 
**authorAssociation** | [**inline**](#AuthorAssociation) | How the author is associated with the repository. | 
**body** | **kotlin.String** |  | 
**category** | [**DiscussionCategory**](DiscussionCategory.md) |  | 
**comments** | **kotlin.Int** |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**htmlUrl** | **kotlin.String** |  | 
**id** | **kotlin.Int** |  | 
**locked** | **kotlin.Boolean** |  | 
**nodeId** | **kotlin.String** |  | 
**number** | **kotlin.Int** |  | 
**repositoryUrl** | **kotlin.String** |  | 
**state** | [**inline**](#State) | The current state of the discussion. &#x60;converting&#x60; means that the discussion is being converted from an issue. &#x60;transferring&#x60; means that the discussion is being transferred from another repository. | 
**stateReason** | [**inline**](#StateReason) | The reason for the current state | 
**title** | **kotlin.String** |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**user** | [**User**](User.md) |  | 
**reactions** | [**Reactions**](Reactions.md) |  |  [optional]
**timelineUrl** | **kotlin.String** |  |  [optional]


<a id="AuthorAssociation"></a>
## Enum: author_association
Name | Value
---- | -----
authorAssociation | COLLABORATOR, CONTRIBUTOR, FIRST_TIMER, FIRST_TIME_CONTRIBUTOR, MANNEQUIN, MEMBER, NONE, OWNER


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | open, closed, locked, converting, transferring


<a id="StateReason"></a>
## Enum: state_reason
Name | Value
---- | -----
stateReason | resolved, outdated, duplicate, reopened, 



