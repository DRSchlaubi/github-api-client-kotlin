
# WebhookDiscussionCreatedDiscussion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeLockReason** | [**kotlin.Any**](.md) |  | 
**answerChosenAt** | [**kotlin.Any**](.md) |  | 
**answerChosenBy** | [**kotlin.Any**](.md) |  | 
**answerHtmlUrl** | **kotlin.String** |  | 
**authorAssociation** | **kotlin.String** |  | 
**body** | **kotlin.String** |  | 
**category** | [**WebhookDiscussionCreatedDiscussionAllOfCategory**](WebhookDiscussionCreatedDiscussionAllOfCategory.md) |  | 
**comments** | **kotlin.Int** |  | 
**createdAt** | **kotlin.String** |  | 
**htmlUrl** | **kotlin.String** |  | 
**id** | **kotlin.Int** |  | 
**locked** | [**inline**](#Locked) |  | 
**nodeId** | **kotlin.String** |  | 
**number** | **kotlin.Int** |  | 
**repositoryUrl** | **kotlin.String** |  | 
**state** | [**inline**](#State) |  | 
**title** | **kotlin.String** |  | 
**updatedAt** | **kotlin.String** |  | 
**user** | [**BranchRestrictionPolicyUsersInner**](BranchRestrictionPolicyUsersInner.md) |  | 
**reactions** | [**WebhookDiscussionCreatedDiscussionAllOfReactions**](WebhookDiscussionCreatedDiscussionAllOfReactions.md) |  |  [optional]
**timelineUrl** | **kotlin.String** |  |  [optional]


<a id="Locked"></a>
## Enum: locked
Name | Value
---- | -----
locked | false


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | open, converting, transferring



