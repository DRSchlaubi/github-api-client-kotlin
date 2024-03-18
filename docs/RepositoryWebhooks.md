
# RepositoryWebhooks

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | Unique identifier of the repository | 
**nodeId** | **kotlin.String** |  | 
**name** | **kotlin.String** | The name of the repository. | 
**fullName** | **kotlin.String** |  | 
**license** | [**RepositoryLicense**](RepositoryLicense.md) |  | 
**forks** | **kotlin.Int** |  | 
**owner** | [**SimpleUser**](SimpleUser.md) |  | 
**&#x60;private&#x60;** | **kotlin.Boolean** | Whether the repository is private or public. | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**description** | **kotlin.String** |  | 
**fork** | **kotlin.Boolean** |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**archiveUrl** | **kotlin.String** |  | 
**assigneesUrl** | **kotlin.String** |  | 
**blobsUrl** | **kotlin.String** |  | 
**branchesUrl** | **kotlin.String** |  | 
**collaboratorsUrl** | **kotlin.String** |  | 
**commentsUrl** | **kotlin.String** |  | 
**commitsUrl** | **kotlin.String** |  | 
**compareUrl** | **kotlin.String** |  | 
**contentsUrl** | **kotlin.String** |  | 
**contributorsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**deploymentsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**downloadsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**eventsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**forksUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**gitCommitsUrl** | **kotlin.String** |  | 
**gitRefsUrl** | **kotlin.String** |  | 
**gitTagsUrl** | **kotlin.String** |  | 
**gitUrl** | **kotlin.String** |  | 
**issueCommentUrl** | **kotlin.String** |  | 
**issueEventsUrl** | **kotlin.String** |  | 
**issuesUrl** | **kotlin.String** |  | 
**keysUrl** | **kotlin.String** |  | 
**labelsUrl** | **kotlin.String** |  | 
**languagesUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**mergesUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**milestonesUrl** | **kotlin.String** |  | 
**notificationsUrl** | **kotlin.String** |  | 
**pullsUrl** | **kotlin.String** |  | 
**releasesUrl** | **kotlin.String** |  | 
**sshUrl** | **kotlin.String** |  | 
**stargazersUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**statusesUrl** | **kotlin.String** |  | 
**subscribersUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**subscriptionUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**tagsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**teamsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**treesUrl** | **kotlin.String** |  | 
**cloneUrl** | **kotlin.String** |  | 
**mirrorUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**hooksUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**svnUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**homepage** | [**java.net.URI**](java.net.URI.md) |  | 
**language** | **kotlin.String** |  | 
**forksCount** | **kotlin.Int** |  | 
**stargazersCount** | **kotlin.Int** |  | 
**watchersCount** | **kotlin.Int** |  | 
**propertySize** | **kotlin.Int** | The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the size is 0. | 
**defaultBranch** | **kotlin.String** | The default branch of the repository. | 
**openIssuesCount** | **kotlin.Int** |  | 
**hasIssues** | **kotlin.Boolean** | Whether issues are enabled. | 
**hasProjects** | **kotlin.Boolean** | Whether projects are enabled. | 
**hasWiki** | **kotlin.Boolean** | Whether the wiki is enabled. | 
**hasPages** | **kotlin.Boolean** |  | 
**hasDownloads** | **kotlin.Boolean** | Whether downloads are enabled. | 
**archived** | **kotlin.Boolean** | Whether the repository is archived. | 
**disabled** | **kotlin.Boolean** | Returns whether or not this repository disabled. | 
**pushedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**openIssues** | **kotlin.Int** |  | 
**watchers** | **kotlin.Int** |  | 
**organization** | [**IntegrationOwner**](IntegrationOwner.md) |  |  [optional]
**permissions** | [**RepositoryPermissions**](RepositoryPermissions.md) |  |  [optional]
**isTemplate** | **kotlin.Boolean** | Whether this repository acts as a template that can be used to generate new repositories. |  [optional]
**topics** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**customProperties** | [**kotlin.Any**](.md) | The custom properties that were defined for the repository. The keys are the custom property names, and the values are the corresponding custom property values. |  [optional]
**hasDiscussions** | **kotlin.Boolean** | Whether discussions are enabled. |  [optional]
**visibility** | **kotlin.String** | The repository visibility: public, private, or internal. |  [optional]
**allowRebaseMerge** | **kotlin.Boolean** | Whether to allow rebase merges for pull requests. |  [optional]
**templateRepository** | [**RepositoryWebhooksTemplateRepository**](RepositoryWebhooksTemplateRepository.md) |  |  [optional]
**tempCloneToken** | **kotlin.String** |  |  [optional]
**allowSquashMerge** | **kotlin.Boolean** | Whether to allow squash merges for pull requests. |  [optional]
**allowAutoMerge** | **kotlin.Boolean** | Whether to allow Auto-merge to be used on pull requests. |  [optional]
**deleteBranchOnMerge** | **kotlin.Boolean** | Whether to delete head branches when pull requests are merged |  [optional]
**allowUpdateBranch** | **kotlin.Boolean** | Whether or not a pull request head branch that is behind its base branch can always be updated even if it is not required to be up to date before merging. |  [optional]
**useSquashPrTitleAsDefault** | **kotlin.Boolean** | Whether a squash merge commit can use the pull request title as default. **This property has been deprecated. Please use &#x60;squash_merge_commit_title&#x60; instead. |  [optional]
**squashMergeCommitTitle** | [**inline**](#SquashMergeCommitTitle) | The default value for a squash merge commit title:  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;COMMIT_OR_PR_TITLE&#x60; - default to the commit&#39;s title (if only one commit) or the pull request&#39;s title (when more than one commit). |  [optional]
**squashMergeCommitMessage** | [**inline**](#SquashMergeCommitMessage) | The default value for a squash merge commit message:  - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;COMMIT_MESSAGES&#x60; - default to the branch&#39;s commit messages. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional]
**mergeCommitTitle** | [**inline**](#MergeCommitTitle) | The default value for a merge commit title.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;MERGE_MESSAGE&#x60; - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name). |  [optional]
**mergeCommitMessage** | [**inline**](#MergeCommitMessage) | The default value for a merge commit message.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional]
**allowMergeCommit** | **kotlin.Boolean** | Whether to allow merge commits for pull requests. |  [optional]
**allowForking** | **kotlin.Boolean** | Whether to allow forking this repo |  [optional]
**webCommitSignoffRequired** | **kotlin.Boolean** | Whether to require contributors to sign off on web-based commits |  [optional]
**subscribersCount** | **kotlin.Int** |  |  [optional]
**networkCount** | **kotlin.Int** |  |  [optional]
**masterBranch** | **kotlin.String** |  |  [optional]
**starredAt** | **kotlin.String** |  |  [optional]
**anonymousAccessEnabled** | **kotlin.Boolean** | Whether anonymous git access is enabled for this repository |  [optional]


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



