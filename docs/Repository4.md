
# Repository4

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archiveUrl** | **kotlin.String** |  | 
**archived** | **kotlin.Boolean** | Whether the repository is archived. | 
**assigneesUrl** | **kotlin.String** |  | 
**blobsUrl** | **kotlin.String** |  | 
**branchesUrl** | **kotlin.String** |  | 
**cloneUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**collaboratorsUrl** | **kotlin.String** |  | 
**commentsUrl** | **kotlin.String** |  | 
**commitsUrl** | **kotlin.String** |  | 
**compareUrl** | **kotlin.String** |  | 
**contentsUrl** | **kotlin.String** |  | 
**contributorsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**createdAt** | [**RepositoryCreatedAt**](RepositoryCreatedAt.md) |  | 
**defaultBranch** | **kotlin.String** | The default branch of the repository. | 
**deploymentsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**description** | **kotlin.String** |  | 
**downloadsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**eventsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**fork** | **kotlin.Boolean** |  | 
**forks** | **kotlin.Int** |  | 
**forksCount** | **kotlin.Int** |  | 
**forksUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**fullName** | **kotlin.String** |  | 
**gitCommitsUrl** | **kotlin.String** |  | 
**gitRefsUrl** | **kotlin.String** |  | 
**gitTagsUrl** | **kotlin.String** |  | 
**gitUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**hasDownloads** | **kotlin.Boolean** | Whether downloads are enabled. | 
**hasIssues** | **kotlin.Boolean** | Whether issues are enabled. | 
**hasPages** | **kotlin.Boolean** |  | 
**hasProjects** | **kotlin.Boolean** | Whether projects are enabled. | 
**hasWiki** | **kotlin.Boolean** | Whether the wiki is enabled. | 
**homepage** | **kotlin.String** |  | 
**hooksUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**id** | **kotlin.Int** | Unique identifier of the repository | 
**issueCommentUrl** | **kotlin.String** |  | 
**issueEventsUrl** | **kotlin.String** |  | 
**issuesUrl** | **kotlin.String** |  | 
**keysUrl** | **kotlin.String** |  | 
**labelsUrl** | **kotlin.String** |  | 
**language** | **kotlin.String** |  | 
**languagesUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**license** | [**License**](License.md) |  | 
**mergesUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**milestonesUrl** | **kotlin.String** |  | 
**mirrorUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**name** | **kotlin.String** | The name of the repository. | 
**nodeId** | **kotlin.String** |  | 
**notificationsUrl** | **kotlin.String** |  | 
**openIssues** | **kotlin.Int** |  | 
**openIssuesCount** | **kotlin.Int** |  | 
**owner** | [**User**](User.md) |  | 
**&#x60;private&#x60;** | **kotlin.Boolean** | Whether the repository is private or public. | 
**pullsUrl** | **kotlin.String** |  | 
**pushedAt** | [**RepositoryCreatedAt**](RepositoryCreatedAt.md) |  | 
**releasesUrl** | **kotlin.String** |  | 
**propertySize** | **kotlin.Int** |  | 
**sshUrl** | **kotlin.String** |  | 
**stargazersCount** | **kotlin.Int** |  | 
**stargazersUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**statusesUrl** | **kotlin.String** |  | 
**subscribersUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**subscriptionUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**svnUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**tagsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**teamsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**topics** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**treesUrl** | **kotlin.String** |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**visibility** | [**inline**](#Visibility) |  | 
**watchers** | **kotlin.Int** |  | 
**watchersCount** | **kotlin.Int** |  | 
**allowAutoMerge** | **kotlin.Boolean** | Whether to allow auto-merge for pull requests. |  [optional]
**allowForking** | **kotlin.Boolean** | Whether to allow private forks |  [optional]
**allowMergeCommit** | **kotlin.Boolean** | Whether to allow merge commits for pull requests. |  [optional]
**allowRebaseMerge** | **kotlin.Boolean** | Whether to allow rebase merges for pull requests. |  [optional]
**allowSquashMerge** | **kotlin.Boolean** | Whether to allow squash merges for pull requests. |  [optional]
**allowUpdateBranch** | **kotlin.Boolean** |  |  [optional]
**deleteBranchOnMerge** | **kotlin.Boolean** | Whether to delete head branches when pull requests are merged |  [optional]
**disabled** | **kotlin.Boolean** | Returns whether or not this repository is disabled. |  [optional]
**hasDiscussions** | **kotlin.Boolean** | Whether discussions are enabled. |  [optional]
**isTemplate** | **kotlin.Boolean** |  |  [optional]
**masterBranch** | **kotlin.String** |  |  [optional]
**mergeCommitMessage** | [**inline**](#MergeCommitMessage) | The default value for a merge commit message.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional]
**mergeCommitTitle** | [**inline**](#MergeCommitTitle) | The default value for a merge commit title.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;MERGE_MESSAGE&#x60; - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name). |  [optional]
**organization** | **kotlin.String** |  |  [optional]
**permissions** | [**RepositoryPermissions**](RepositoryPermissions.md) |  |  [optional]
**&#x60;public&#x60;** | **kotlin.Boolean** |  |  [optional]
**roleName** | **kotlin.String** |  |  [optional]
**squashMergeCommitMessage** | [**inline**](#SquashMergeCommitMessage) | The default value for a squash merge commit message:  - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;COMMIT_MESSAGES&#x60; - default to the branch&#39;s commit messages. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional]
**squashMergeCommitTitle** | [**inline**](#SquashMergeCommitTitle) | The default value for a squash merge commit title:  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;COMMIT_OR_PR_TITLE&#x60; - default to the commit&#39;s title (if only one commit) or the pull request&#39;s title (when more than one commit). |  [optional]
**stargazers** | **kotlin.Int** |  |  [optional]
**useSquashPrTitleAsDefault** | **kotlin.Boolean** | Whether a squash merge commit can use the pull request title as default. **This property has been deprecated. Please use &#x60;squash_merge_commit_title&#x60; instead. |  [optional]
**webCommitSignoffRequired** | **kotlin.Boolean** | Whether to require contributors to sign off on web-based commits |  [optional]


<a id="Visibility"></a>
## Enum: visibility
Name | Value
---- | -----
visibility | public, private, internal


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



