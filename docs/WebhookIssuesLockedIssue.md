
# WebhookIssuesLockedIssue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeLockReason** | [**inline**](#ActiveLockReason) |  | 
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
**labelsUrl** | **kotlin.String** |  | 
**locked** | [**inline**](#Locked) |  | 
**milestone** | [**kotlin.Any**](.md) |  | 
**nodeId** | **kotlin.String** |  | 
**number** | **kotlin.Int** |  | 
**reactions** | [**WebhookDiscussionCreatedDiscussionAllOfReactions**](WebhookDiscussionCreatedDiscussionAllOfReactions.md) |  | 
**repositoryUrl** | **kotlin.String** |  | 
**title** | **kotlin.String** |  | 
**updatedAt** | **kotlin.String** |  | 
**url** | **kotlin.String** |  | 
**user** | [**BranchRestrictionPolicyUsersInner**](BranchRestrictionPolicyUsersInner.md) |  | 
**assignee** | [**kotlin.Any**](.md) |  |  [optional]
**draft** | **kotlin.Boolean** |  |  [optional]
**labels** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**performedViaGithubApp** | [**kotlin.Any**](.md) |  |  [optional]
**pullRequest** | [**IssuePullRequest**](IssuePullRequest.md) |  |  [optional]
**state** | **kotlin.String** |  |  [optional]
**stateReason** | **kotlin.String** |  |  [optional]
**timelineUrl** | **kotlin.String** |  |  [optional]


<a id="ActiveLockReason"></a>
## Enum: active_lock_reason
Name | Value
---- | -----
activeLockReason | resolved, off-topic, too heated, spam, 


<a id="Locked"></a>
## Enum: locked
Name | Value
---- | -----
locked | true



