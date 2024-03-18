
# Issue2

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeLockReason** | [**inline**](#ActiveLockReason) |  | 
**assignees** | [**kotlin.collections.List&lt;User2&gt;**](User2.md) |  | 
**authorAssociation** | [**inline**](#AuthorAssociation) | How the author is associated with the repository. | 
**body** | **kotlin.String** | Contents of the issue | 
**closedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**comments** | **kotlin.Int** |  | 
**commentsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**eventsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**id** | **kotlin.Long** |  | 
**labelsUrl** | **kotlin.String** |  | 
**milestone** | [**Milestone**](Milestone.md) |  | 
**nodeId** | **kotlin.String** |  | 
**number** | **kotlin.Int** |  | 
**reactions** | [**Reactions**](Reactions.md) |  | 
**repositoryUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**title** | **kotlin.String** | Title of the issue | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**url** | [**java.net.URI**](java.net.URI.md) | URL for the issue | 
**user** | [**User2**](User2.md) |  | 
**assignee** | [**User2**](User2.md) |  |  [optional]
**draft** | **kotlin.Boolean** |  |  [optional]
**labels** | [**kotlin.collections.List&lt;Label&gt;**](Label.md) |  |  [optional]
**locked** | **kotlin.Boolean** |  |  [optional]
**performedViaGithubApp** | [**App12**](App12.md) |  |  [optional]
**pullRequest** | [**IssuePullRequest**](IssuePullRequest.md) |  |  [optional]
**state** | [**inline**](#State) | State of the issue; either &#39;open&#39; or &#39;closed&#39; |  [optional]
**stateReason** | **kotlin.String** |  |  [optional]
**timelineUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional]


<a id="ActiveLockReason"></a>
## Enum: active_lock_reason
Name | Value
---- | -----
activeLockReason | resolved, off-topic, too heated, spam, 


<a id="AuthorAssociation"></a>
## Enum: author_association
Name | Value
---- | -----
authorAssociation | COLLABORATOR, CONTRIBUTOR, FIRST_TIMER, FIRST_TIME_CONTRIBUTOR, MANNEQUIN, MEMBER, NONE, OWNER


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | open, closed



