
# WebhookIssueCommentCreatedIssue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeLockReason** | **kotlin.String** |  | 
**assignee** | [**User2**](User2.md) |  | 
**assignees** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  | 
**authorAssociation** | **kotlin.String** |  | 
**body** | **kotlin.String** |  | 
**closedAt** | **kotlin.String** |  | 
**comments** | **kotlin.Int** |  | 
**commentsUrl** | **kotlin.String** |  | 
**createdAt** | **kotlin.String** |  | 
**eventsUrl** | **kotlin.String** |  | 
**htmlUrl** | **kotlin.String** |  | 
**id** | **kotlin.Int** |  | 
**labels** | [**kotlin.collections.List&lt;Label&gt;**](Label.md) |  | 
**labelsUrl** | **kotlin.String** |  | 
**locked** | **kotlin.Boolean** |  | 
**milestone** | [**kotlin.Any**](.md) |  | 
**nodeId** | **kotlin.String** |  | 
**number** | **kotlin.Int** |  | 
**reactions** | [**WebhookDiscussionCreatedDiscussionAllOfReactions**](WebhookDiscussionCreatedDiscussionAllOfReactions.md) |  | 
**repositoryUrl** | **kotlin.String** |  | 
**state** | [**inline**](#State) | State of the issue; either &#39;open&#39; or &#39;closed&#39; | 
**title** | **kotlin.String** |  | 
**updatedAt** | **kotlin.String** |  | 
**url** | **kotlin.String** |  | 
**user** | [**BranchRestrictionPolicyUsersInner**](BranchRestrictionPolicyUsersInner.md) |  | 
**draft** | **kotlin.Boolean** |  |  [optional]
**performedViaGithubApp** | [**kotlin.Any**](.md) |  |  [optional]
**pullRequest** | [**IssuePullRequest**](IssuePullRequest.md) |  |  [optional]
**stateReason** | **kotlin.String** |  |  [optional]
**timelineUrl** | **kotlin.String** |  |  [optional]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | open, closed



