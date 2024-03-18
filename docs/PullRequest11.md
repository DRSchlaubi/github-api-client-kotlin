
# PullRequest11

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
**closedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**commentsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**commitsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**diffUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**draft** | **kotlin.Boolean** | Indicates whether or not the pull request is a draft. | 
**head** | [**PullRequest11Head**](PullRequest11Head.md) |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**id** | **kotlin.Int** |  | 
**issueUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**labels** | [**kotlin.collections.List&lt;Label&gt;**](Label.md) |  | 
**locked** | **kotlin.Boolean** |  | 
**mergeCommitSha** | **kotlin.String** |  | 
**mergedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**milestone** | [**Milestone**](Milestone.md) |  | 
**nodeId** | **kotlin.String** |  | 
**number** | **kotlin.Int** | Number uniquely identifying the pull request within its repository. | 
**patchUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**requestedReviewers** | [**kotlin.collections.List&lt;PullRequestRequestedReviewersInner&gt;**](PullRequestRequestedReviewersInner.md) |  | 
**requestedTeams** | [**kotlin.collections.List&lt;Team2&gt;**](Team2.md) |  | 
**reviewCommentUrl** | **kotlin.String** |  | 
**reviewCommentsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**state** | [**inline**](#State) | State of this Pull Request. Either &#x60;open&#x60; or &#x60;closed&#x60;. | 
**statusesUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**title** | **kotlin.String** | The title of the pull request. | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**user** | [**User2**](User2.md) |  | 
**additions** | **kotlin.Int** |  |  [optional]
**changedFiles** | **kotlin.Int** |  |  [optional]
**comments** | **kotlin.Int** |  |  [optional]
**commits** | **kotlin.Int** |  |  [optional]
**deletions** | **kotlin.Int** |  |  [optional]
**maintainerCanModify** | **kotlin.Boolean** | Indicates whether maintainers can modify the pull request. |  [optional]
**mergeable** | **kotlin.Boolean** |  |  [optional]
**mergeableState** | **kotlin.String** |  |  [optional]
**merged** | **kotlin.Boolean** |  |  [optional]
**mergedBy** | [**User**](User.md) |  |  [optional]
**rebaseable** | **kotlin.Boolean** |  |  [optional]
**reviewComments** | **kotlin.Int** |  |  [optional]


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



