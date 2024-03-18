
# SimplePullRequest2

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**PullRequestLinks**](PullRequestLinks.md) |  | 
**activeLockReason** | [**inline**](#ActiveLockReason) |  | 
**assignee** | [**User2**](User2.md) |  | 
**assignees** | [**kotlin.collections.List&lt;User2&gt;**](User2.md) |  | 
**authorAssociation** | [**inline**](#AuthorAssociation) | How the author is associated with the repository. | 
**autoMerge** | [**PullRequestAutoMerge**](PullRequestAutoMerge.md) |  | 
**base** | [**PullRequestBase**](PullRequestBase.md) |  | 
**body** | **kotlin.String** |  | 
**closedAt** | **kotlin.String** |  | 
**commentsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**commitsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**createdAt** | **kotlin.String** |  | 
**diffUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**draft** | **kotlin.Boolean** |  | 
**head** | [**PullRequestHead**](PullRequestHead.md) |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**id** | **kotlin.Int** |  | 
**issueUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**labels** | [**kotlin.collections.List&lt;Label&gt;**](Label.md) |  | 
**locked** | **kotlin.Boolean** |  | 
**mergeCommitSha** | **kotlin.String** |  | 
**mergedAt** | **kotlin.String** |  | 
**milestone** | [**Milestone**](Milestone.md) |  | 
**nodeId** | **kotlin.String** |  | 
**number** | **kotlin.Int** |  | 
**patchUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**requestedReviewers** | [**kotlin.collections.List&lt;PullRequestRequestedReviewersInner&gt;**](PullRequestRequestedReviewersInner.md) |  | 
**requestedTeams** | [**kotlin.collections.List&lt;Team2&gt;**](Team2.md) |  | 
**reviewCommentUrl** | **kotlin.String** |  | 
**reviewCommentsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**state** | [**inline**](#State) |  | 
**statusesUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**title** | **kotlin.String** |  | 
**updatedAt** | **kotlin.String** |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**user** | [**User2**](User2.md) |  | 


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



