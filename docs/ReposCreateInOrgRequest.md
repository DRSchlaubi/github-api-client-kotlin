
# ReposCreateInOrgRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the repository. | 
**description** | **kotlin.String** | A short description of the repository. |  [optional]
**homepage** | **kotlin.String** | A URL with more information about the repository. |  [optional]
**&#x60;private&#x60;** | **kotlin.Boolean** | Whether the repository is private. |  [optional]
**visibility** | [**inline**](#Visibility) | The visibility of the repository. |  [optional]
**hasIssues** | **kotlin.Boolean** | Either &#x60;true&#x60; to enable issues for this repository or &#x60;false&#x60; to disable them. |  [optional]
**hasProjects** | **kotlin.Boolean** | Either &#x60;true&#x60; to enable projects for this repository or &#x60;false&#x60; to disable them. **Note:** If you&#39;re creating a repository in an organization that has disabled repository projects, the default is &#x60;false&#x60;, and if you pass &#x60;true&#x60;, the API returns an error. |  [optional]
**hasWiki** | **kotlin.Boolean** | Either &#x60;true&#x60; to enable the wiki for this repository or &#x60;false&#x60; to disable it. |  [optional]
**hasDownloads** | **kotlin.Boolean** | Whether downloads are enabled. |  [optional]
**isTemplate** | **kotlin.Boolean** | Either &#x60;true&#x60; to make this repo available as a template repository or &#x60;false&#x60; to prevent it. |  [optional]
**teamId** | **kotlin.Int** | The id of the team that will be granted access to this repository. This is only valid when creating a repository in an organization. |  [optional]
**autoInit** | **kotlin.Boolean** | Pass &#x60;true&#x60; to create an initial commit with empty README. |  [optional]
**gitignoreTemplate** | **kotlin.String** | Desired language or platform [.gitignore template](https://github.com/github/gitignore) to apply. Use the name of the template without the extension. For example, \&quot;Haskell\&quot;. |  [optional]
**licenseTemplate** | **kotlin.String** | Choose an [open source license template](https://choosealicense.com/) that best suits your needs, and then use the [license keyword](https://docs.github.com/articles/licensing-a-repository/#searching-github-by-license-type) as the &#x60;license_template&#x60; string. For example, \&quot;mit\&quot; or \&quot;mpl-2.0\&quot;. |  [optional]
**allowSquashMerge** | **kotlin.Boolean** | Either &#x60;true&#x60; to allow squash-merging pull requests, or &#x60;false&#x60; to prevent squash-merging. |  [optional]
**allowMergeCommit** | **kotlin.Boolean** | Either &#x60;true&#x60; to allow merging pull requests with a merge commit, or &#x60;false&#x60; to prevent merging pull requests with merge commits. |  [optional]
**allowRebaseMerge** | **kotlin.Boolean** | Either &#x60;true&#x60; to allow rebase-merging pull requests, or &#x60;false&#x60; to prevent rebase-merging. |  [optional]
**allowAutoMerge** | **kotlin.Boolean** | Either &#x60;true&#x60; to allow auto-merge on pull requests, or &#x60;false&#x60; to disallow auto-merge. |  [optional]
**deleteBranchOnMerge** | **kotlin.Boolean** | Either &#x60;true&#x60; to allow automatically deleting head branches when pull requests are merged, or &#x60;false&#x60; to prevent automatic deletion. **The authenticated user must be an organization owner to set this property to &#x60;true&#x60;.** |  [optional]
**useSquashPrTitleAsDefault** | **kotlin.Boolean** | Either &#x60;true&#x60; to allow squash-merge commits to use pull request title, or &#x60;false&#x60; to use commit message. **This property has been deprecated. Please use &#x60;squash_merge_commit_title&#x60; instead. |  [optional]
**squashMergeCommitTitle** | [**inline**](#SquashMergeCommitTitle) | The default value for a squash merge commit title:  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;COMMIT_OR_PR_TITLE&#x60; - default to the commit&#39;s title (if only one commit) or the pull request&#39;s title (when more than one commit). |  [optional]
**squashMergeCommitMessage** | [**inline**](#SquashMergeCommitMessage) | The default value for a squash merge commit message:  - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;COMMIT_MESSAGES&#x60; - default to the branch&#39;s commit messages. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional]
**mergeCommitTitle** | [**inline**](#MergeCommitTitle) | The default value for a merge commit title.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;MERGE_MESSAGE&#x60; - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name). |  [optional]
**mergeCommitMessage** | [**inline**](#MergeCommitMessage) | The default value for a merge commit message.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional]
**customProperties** | [**kotlin.Any**](.md) | The custom properties for the new repository. The keys are the custom property names, and the values are the corresponding custom property values. |  [optional]


<a id="Visibility"></a>
## Enum: visibility
Name | Value
---- | -----
visibility | public, private


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



