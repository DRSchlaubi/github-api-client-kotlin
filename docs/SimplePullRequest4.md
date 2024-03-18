
# SimplePullRequest4

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**PullRequestLinks**](PullRequestLinks.md) |  | 
**activeLockReason** | [**inline**](#ActiveLockReason) |  | 
**assignee** | [**User**](User.md) |  | 
**assignees** | [**kotlin.collections.List&lt;User&gt;**](User.md) |  | 
**authorAssociation** | [**inline**](#AuthorAssociation) | How the author is associated with the repository. | 
**autoMerge** | [**PullRequestAutoMerge1**](PullRequestAutoMerge1.md) |  | 
**base** | [**SimplePullRequest3Base**](SimplePullRequest3Base.md) |  | 
**body** | **kotlin.String** |  | 
**closedAt** | **kotlin.String** |  | 
**commentsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**commitsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**createdAt** | **kotlin.String** |  | 
**diffUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**draft** | **kotlin.Boolean** |  | 
**head** | [**SimplePullRequest3Base**](SimplePullRequest3Base.md) |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**id** | **kotlin.Int** |  | 
**issueUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**labels** | [**kotlin.collections.List&lt;Label&gt;**](Label.md) |  | 
**locked** | **kotlin.Boolean** |  | 
**mergeCommitSha** | **kotlin.String** |  | 
**mergedAt** | **kotlin.String** |  | 
**milestone** | [**Milestone1**](Milestone1.md) |  | 
**nodeId** | **kotlin.String** |  | 
**number** | **kotlin.Int** |  | 
**patchUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**requestedReviewers** | [**kotlin.collections.List&lt;PullRequest3RequestedReviewersInner&gt;**](PullRequest3RequestedReviewersInner.md) |  | 
**requestedTeams** | [**kotlin.collections.List&lt;Team2&gt;**](Team2.md) |  | 
**reviewCommentUrl** | **kotlin.String** |  | 
**reviewCommentsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**state** | [**inline**](#State) |  | 
**statusesUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**title** | **kotlin.String** |  | 
**updatedAt** | **kotlin.String** |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**user** | [**User**](User.md) |  | 


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



