
# ReposCreateForAuthenticatedUserRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the repository. | 
**description** | **kotlin.String** | A short description of the repository. |  [optional]
**homepage** | **kotlin.String** | A URL with more information about the repository. |  [optional]
**&#x60;private&#x60;** | **kotlin.Boolean** | Whether the repository is private. |  [optional]
**hasIssues** | **kotlin.Boolean** | Whether issues are enabled. |  [optional]
**hasProjects** | **kotlin.Boolean** | Whether projects are enabled. |  [optional]
**hasWiki** | **kotlin.Boolean** | Whether the wiki is enabled. |  [optional]
**hasDiscussions** | **kotlin.Boolean** | Whether discussions are enabled. |  [optional]
**teamId** | **kotlin.Int** | The id of the team that will be granted access to this repository. This is only valid when creating a repository in an organization. |  [optional]
**autoInit** | **kotlin.Boolean** | Whether the repository is initialized with a minimal README. |  [optional]
**gitignoreTemplate** | **kotlin.String** | The desired language or platform to apply to the .gitignore. |  [optional]
**licenseTemplate** | **kotlin.String** | The license keyword of the open source license for this repository. |  [optional]
**allowSquashMerge** | **kotlin.Boolean** | Whether to allow squash merges for pull requests. |  [optional]
**allowMergeCommit** | **kotlin.Boolean** | Whether to allow merge commits for pull requests. |  [optional]
**allowRebaseMerge** | **kotlin.Boolean** | Whether to allow rebase merges for pull requests. |  [optional]
**allowAutoMerge** | **kotlin.Boolean** | Whether to allow Auto-merge to be used on pull requests. |  [optional]
**deleteBranchOnMerge** | **kotlin.Boolean** | Whether to delete head branches when pull requests are merged |  [optional]
**squashMergeCommitTitle** | [**inline**](#SquashMergeCommitTitle) | The default value for a squash merge commit title:  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;COMMIT_OR_PR_TITLE&#x60; - default to the commit&#39;s title (if only one commit) or the pull request&#39;s title (when more than one commit). |  [optional]
**squashMergeCommitMessage** | [**inline**](#SquashMergeCommitMessage) | The default value for a squash merge commit message:  - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;COMMIT_MESSAGES&#x60; - default to the branch&#39;s commit messages. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional]
**mergeCommitTitle** | [**inline**](#MergeCommitTitle) | The default value for a merge commit title.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;MERGE_MESSAGE&#x60; - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name). |  [optional]
**mergeCommitMessage** | [**inline**](#MergeCommitMessage) | The default value for a merge commit message.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional]
**hasDownloads** | **kotlin.Boolean** | Whether downloads are enabled. |  [optional]
**isTemplate** | **kotlin.Boolean** | Whether this repository acts as a template that can be used to generate new repositories. |  [optional]


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



