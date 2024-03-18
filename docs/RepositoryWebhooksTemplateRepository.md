
# RepositoryWebhooksTemplateRepository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** |  |  [optional]
**nodeId** | **kotlin.String** |  |  [optional]
**name** | **kotlin.String** |  |  [optional]
**fullName** | **kotlin.String** |  |  [optional]
**owner** | [**BranchRestrictionPolicyUsersInner**](BranchRestrictionPolicyUsersInner.md) |  |  [optional]
**&#x60;private&#x60;** | **kotlin.Boolean** |  |  [optional]
**htmlUrl** | **kotlin.String** |  |  [optional]
**description** | **kotlin.String** |  |  [optional]
**fork** | **kotlin.Boolean** |  |  [optional]
**url** | **kotlin.String** |  |  [optional]
**archiveUrl** | **kotlin.String** |  |  [optional]
**assigneesUrl** | **kotlin.String** |  |  [optional]
**blobsUrl** | **kotlin.String** |  |  [optional]
**branchesUrl** | **kotlin.String** |  |  [optional]
**collaboratorsUrl** | **kotlin.String** |  |  [optional]
**commentsUrl** | **kotlin.String** |  |  [optional]
**commitsUrl** | **kotlin.String** |  |  [optional]
**compareUrl** | **kotlin.String** |  |  [optional]
**contentsUrl** | **kotlin.String** |  |  [optional]
**contributorsUrl** | **kotlin.String** |  |  [optional]
**deploymentsUrl** | **kotlin.String** |  |  [optional]
**downloadsUrl** | **kotlin.String** |  |  [optional]
**eventsUrl** | **kotlin.String** |  |  [optional]
**forksUrl** | **kotlin.String** |  |  [optional]
**gitCommitsUrl** | **kotlin.String** |  |  [optional]
**gitRefsUrl** | **kotlin.String** |  |  [optional]
**gitTagsUrl** | **kotlin.String** |  |  [optional]
**gitUrl** | **kotlin.String** |  |  [optional]
**issueCommentUrl** | **kotlin.String** |  |  [optional]
**issueEventsUrl** | **kotlin.String** |  |  [optional]
**issuesUrl** | **kotlin.String** |  |  [optional]
**keysUrl** | **kotlin.String** |  |  [optional]
**labelsUrl** | **kotlin.String** |  |  [optional]
**languagesUrl** | **kotlin.String** |  |  [optional]
**mergesUrl** | **kotlin.String** |  |  [optional]
**milestonesUrl** | **kotlin.String** |  |  [optional]
**notificationsUrl** | **kotlin.String** |  |  [optional]
**pullsUrl** | **kotlin.String** |  |  [optional]
**releasesUrl** | **kotlin.String** |  |  [optional]
**sshUrl** | **kotlin.String** |  |  [optional]
**stargazersUrl** | **kotlin.String** |  |  [optional]
**statusesUrl** | **kotlin.String** |  |  [optional]
**subscribersUrl** | **kotlin.String** |  |  [optional]
**subscriptionUrl** | **kotlin.String** |  |  [optional]
**tagsUrl** | **kotlin.String** |  |  [optional]
**teamsUrl** | **kotlin.String** |  |  [optional]
**treesUrl** | **kotlin.String** |  |  [optional]
**cloneUrl** | **kotlin.String** |  |  [optional]
**mirrorUrl** | **kotlin.String** |  |  [optional]
**hooksUrl** | **kotlin.String** |  |  [optional]
**svnUrl** | **kotlin.String** |  |  [optional]
**homepage** | **kotlin.String** |  |  [optional]
**language** | **kotlin.String** |  |  [optional]
**forksCount** | **kotlin.Int** |  |  [optional]
**stargazersCount** | **kotlin.Int** |  |  [optional]
**watchersCount** | **kotlin.Int** |  |  [optional]
**propertySize** | **kotlin.Int** |  |  [optional]
**defaultBranch** | **kotlin.String** |  |  [optional]
**openIssuesCount** | **kotlin.Int** |  |  [optional]
**isTemplate** | **kotlin.Boolean** |  |  [optional]
**topics** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**hasIssues** | **kotlin.Boolean** |  |  [optional]
**hasProjects** | **kotlin.Boolean** |  |  [optional]
**hasWiki** | **kotlin.Boolean** |  |  [optional]
**hasPages** | **kotlin.Boolean** |  |  [optional]
**hasDownloads** | **kotlin.Boolean** |  |  [optional]
**archived** | **kotlin.Boolean** |  |  [optional]
**disabled** | **kotlin.Boolean** |  |  [optional]
**visibility** | **kotlin.String** |  |  [optional]
**pushedAt** | **kotlin.String** |  |  [optional]
**createdAt** | **kotlin.String** |  |  [optional]
**updatedAt** | **kotlin.String** |  |  [optional]
**permissions** | [**MinimalRepositoryPermissions**](MinimalRepositoryPermissions.md) |  |  [optional]
**allowRebaseMerge** | **kotlin.Boolean** |  |  [optional]
**tempCloneToken** | **kotlin.String** |  |  [optional]
**allowSquashMerge** | **kotlin.Boolean** |  |  [optional]
**allowAutoMerge** | **kotlin.Boolean** |  |  [optional]
**deleteBranchOnMerge** | **kotlin.Boolean** |  |  [optional]
**allowUpdateBranch** | **kotlin.Boolean** |  |  [optional]
**useSquashPrTitleAsDefault** | **kotlin.Boolean** |  |  [optional]
**squashMergeCommitTitle** | [**inline**](#SquashMergeCommitTitle) | The default value for a squash merge commit title:  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;COMMIT_OR_PR_TITLE&#x60; - default to the commit&#39;s title (if only one commit) or the pull request&#39;s title (when more than one commit). |  [optional]
**squashMergeCommitMessage** | [**inline**](#SquashMergeCommitMessage) | The default value for a squash merge commit message:  - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;COMMIT_MESSAGES&#x60; - default to the branch&#39;s commit messages. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional]
**mergeCommitTitle** | [**inline**](#MergeCommitTitle) | The default value for a merge commit title.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;MERGE_MESSAGE&#x60; - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name). |  [optional]
**mergeCommitMessage** | [**inline**](#MergeCommitMessage) | The default value for a merge commit message.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional]
**allowMergeCommit** | **kotlin.Boolean** |  |  [optional]
**subscribersCount** | **kotlin.Int** |  |  [optional]
**networkCount** | **kotlin.Int** |  |  [optional]


<a id="SquashMergeCommitTitle"></a>
## Enum: squash_merge_commit_title
Name | Value
---- | -----
squashMergeCommitTitle | PR_TITLE, COMMIT_OR_PR_TITLE


<a id="SquashMergeCommitMessage"></a>
## Enum: squash_merge_commit_message
Name | Value
---- | -----
squashMergeCommitMessage | PR_BODY, COMMIT_MESSAGES, BLANK


<a id="MergeCommitTitle"></a>
## Enum: merge_commit_title
Name | Value
---- | -----
mergeCommitTitle | PR_TITLE, MERGE_MESSAGE


<a id="MergeCommitMessage"></a>
## Enum: merge_commit_message
Name | Value
---- | -----
mergeCommitMessage | PR_BODY, PR_TITLE, BLANK



