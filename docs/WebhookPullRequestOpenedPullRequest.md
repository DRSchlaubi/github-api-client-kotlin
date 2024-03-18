
# WebhookPullRequestOpenedPullRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | [**kotlin.Any**](.md) |  | 
**id** | [**kotlin.Any**](.md) |  | 
**nodeId** | [**kotlin.Any**](.md) |  | 
**htmlUrl** | [**kotlin.Any**](.md) |  | 
**diffUrl** | [**kotlin.Any**](.md) |  | 
**patchUrl** | [**kotlin.Any**](.md) |  | 
**issueUrl** | [**kotlin.Any**](.md) |  | 
**commitsUrl** | [**kotlin.Any**](.md) |  | 
**reviewCommentsUrl** | [**kotlin.Any**](.md) |  | 
**reviewCommentUrl** | [**kotlin.Any**](.md) |  | 
**commentsUrl** | [**kotlin.Any**](.md) |  | 
**statusesUrl** | [**kotlin.Any**](.md) |  | 
**number** | [**kotlin.Any**](.md) | Number uniquely identifying the pull request within its repository. | 
**state** | [**inline**](#State) | State of this Pull Request. Either &#x60;open&#x60; or &#x60;closed&#x60;. | 
**locked** | [**kotlin.Any**](.md) |  | 
**title** | [**kotlin.Any**](.md) | The title of the pull request. | 
**user** | [**SimpleUser**](SimpleUser.md) |  | 
**body** | [**kotlin.Any**](.md) |  | 
**labels** | [**kotlin.Any**](.md) |  | 
**milestone** | [**IssueMilestone**](IssueMilestone.md) |  | 
**createdAt** | [**kotlin.Any**](.md) |  | 
**updatedAt** | [**kotlin.Any**](.md) |  | 
**closedAt** | [**kotlin.Any**](.md) |  | 
**mergedAt** | [**kotlin.Any**](.md) |  | 
**mergeCommitSha** | [**kotlin.Any**](.md) |  | 
**assignee** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**head** | [**PullRequestHead**](PullRequestHead.md) |  | 
**base** | [**PullRequestBase**](PullRequestBase.md) |  | 
**links** | [**PullRequestSimpleLinks**](PullRequestSimpleLinks.md) |  | 
**authorAssociation** | [**AuthorAssociation**](AuthorAssociation.md) |  | 
**autoMerge** | [**AutoMerge**](AutoMerge.md) |  | 
**merged** | [**kotlin.Any**](.md) |  | 
**mergeable** | [**kotlin.Any**](.md) |  | 
**mergeableState** | [**kotlin.Any**](.md) |  | 
**mergedBy** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**comments** | [**kotlin.Any**](.md) |  | 
**reviewComments** | [**kotlin.Any**](.md) |  | 
**maintainerCanModify** | [**kotlin.Any**](.md) | Indicates whether maintainers can modify the pull request. | 
**commits** | [**kotlin.Any**](.md) |  | 
**additions** | [**kotlin.Any**](.md) |  | 
**deletions** | [**kotlin.Any**](.md) |  | 
**changedFiles** | [**kotlin.Any**](.md) |  | 
**activeLockReason** | [**kotlin.Any**](.md) |  |  [optional]
**assignees** | [**kotlin.Any**](.md) |  |  [optional]
**requestedReviewers** | [**kotlin.Any**](.md) |  |  [optional]
**requestedTeams** | [**kotlin.Any**](.md) |  |  [optional]
**draft** | [**kotlin.Any**](.md) | Indicates whether or not the pull request is a draft. |  [optional]
**rebaseable** | [**kotlin.Any**](.md) |  |  [optional]
**allowAutoMerge** | **kotlin.Boolean** | Whether to allow auto-merge for pull requests. |  [optional]
**allowUpdateBranch** | **kotlin.Boolean** | Whether to allow updating the pull request&#39;s branch. |  [optional]
**deleteBranchOnMerge** | **kotlin.Boolean** | Whether to delete head branches when pull requests are merged. |  [optional]
**mergeCommitMessage** | [**inline**](#MergeCommitMessage) | The default value for a merge commit message. - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional]
**mergeCommitTitle** | [**inline**](#MergeCommitTitle) | The default value for a merge commit title. - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;MERGE_MESSAGE&#x60; - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name). |  [optional]
**squashMergeCommitMessage** | [**inline**](#SquashMergeCommitMessage) | The default value for a squash merge commit message: - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;COMMIT_MESSAGES&#x60; - default to the branch&#39;s commit messages. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional]
**squashMergeCommitTitle** | [**inline**](#SquashMergeCommitTitle) | The default value for a squash merge commit title: - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;COMMIT_OR_PR_TITLE&#x60; - default to the commit&#39;s title (if only one commit) or the pull request&#39;s title (when more than one commit). |  [optional]
**useSquashPrTitleAsDefault** | **kotlin.Boolean** | Whether a squash merge commit can use the pull request title as default. **This property has been deprecated. Please use &#x60;squash_merge_commit_title&#x60; instead.** |  [optional]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | open, closed


<a id="MergeCommitMessage"></a>
## Enum: merge_commit_message
Name | Value
---- | -----
mergeCommitMessage | PR_BODY, PR_TITLE, BLANK


<a id="MergeCommitTitle"></a>
## Enum: merge_commit_title
Name | Value
---- | -----
mergeCommitTitle | PR_TITLE, MERGE_MESSAGE


<a id="SquashMergeCommitMessage"></a>
## Enum: squash_merge_commit_message
Name | Value
---- | -----
squashMergeCommitMessage | PR_BODY, COMMIT_MESSAGES, BLANK


<a id="SquashMergeCommitTitle"></a>
## Enum: squash_merge_commit_title
Name | Value
---- | -----
squashMergeCommitTitle | PR_TITLE, COMMIT_OR_PR_TITLE



