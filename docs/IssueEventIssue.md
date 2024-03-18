
# IssueEventIssue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Any**](.md) |  | 
**nodeId** | [**kotlin.Any**](.md) |  | 
**url** | [**kotlin.Any**](.md) | URL for the issue | 
**repositoryUrl** | [**kotlin.Any**](.md) |  | 
**labelsUrl** | [**kotlin.Any**](.md) |  | 
**commentsUrl** | [**kotlin.Any**](.md) |  | 
**eventsUrl** | [**kotlin.Any**](.md) |  | 
**htmlUrl** | [**kotlin.Any**](.md) |  | 
**number** | [**kotlin.Any**](.md) | Number uniquely identifying the issue within its repository | 
**state** | [**kotlin.Any**](.md) | State of the issue; either &#39;open&#39; or &#39;closed&#39; | 
**title** | [**kotlin.Any**](.md) | Title of the issue | 
**user** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**labels** | [**kotlin.Any**](.md) | Labels to associate with this issue; pass one or more label names to replace the set of labels on this issue; send an empty array to clear all labels from the issue; note that the labels are silently dropped for users without push access to the repository | 
**assignee** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**milestone** | [**IssueMilestone**](IssueMilestone.md) |  | 
**locked** | [**kotlin.Any**](.md) |  | 
**comments** | [**kotlin.Any**](.md) |  | 
**closedAt** | [**kotlin.Any**](.md) |  | 
**createdAt** | [**kotlin.Any**](.md) |  | 
**updatedAt** | [**kotlin.Any**](.md) |  | 
**authorAssociation** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**stateReason** | [**inline**](#StateReason) | The reason for the current state |  [optional]
**body** | [**kotlin.Any**](.md) | Contents of the issue |  [optional]
**assignees** | [**kotlin.Any**](.md) |  |  [optional]
**activeLockReason** | [**kotlin.Any**](.md) |  |  [optional]
**pullRequest** | [**IssuePullRequest**](IssuePullRequest.md) |  |  [optional]
**draft** | [**kotlin.Any**](.md) |  |  [optional]
**closedBy** | [**IntegrationOwner**](IntegrationOwner.md) |  |  [optional]
**bodyHtml** | [**kotlin.Any**](.md) |  |  [optional]
**bodyText** | [**kotlin.Any**](.md) |  |  [optional]
**timelineUrl** | [**kotlin.Any**](.md) |  |  [optional]
**repository** | [**Repository**](Repository.md) |  |  [optional]
**performedViaGithubApp** | [**IssuePerformedViaGithubApp**](IssuePerformedViaGithubApp.md) |  |  [optional]
**reactions** | [**ReactionRollup**](ReactionRollup.md) |  |  [optional]


<a id="StateReason"></a>
## Enum: state_reason
Name | Value
---- | -----
stateReason | completed, reopened, not_planned, 



