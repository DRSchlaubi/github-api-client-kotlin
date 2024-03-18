
# FullRepository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** |  | 
**nodeId** | **kotlin.String** |  | 
**name** | **kotlin.String** |  | 
**fullName** | **kotlin.String** |  | 
**owner** | [**SimpleUser**](SimpleUser.md) |  | 
**&#x60;private&#x60;** | **kotlin.Boolean** |  | 
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
**defaultBranch** | **kotlin.String** |  | 
**openIssuesCount** | **kotlin.Int** |  | 
**hasIssues** | **kotlin.Boolean** |  | 
**hasProjects** | **kotlin.Boolean** |  | 
**hasWiki** | **kotlin.Boolean** |  | 
**hasPages** | **kotlin.Boolean** |  | 
**hasDiscussions** | **kotlin.Boolean** |  | 
**archived** | **kotlin.Boolean** |  | 
**disabled** | **kotlin.Boolean** | Returns whether or not this repository disabled. | 
**pushedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**subscribersCount** | **kotlin.Int** |  | 
**networkCount** | **kotlin.Int** |  | 
**license** | [**RepositoryLicense**](RepositoryLicense.md) |  | 
**forks** | **kotlin.Int** |  | 
**openIssues** | **kotlin.Int** |  | 
**watchers** | **kotlin.Int** |  | 
**isTemplate** | **kotlin.Boolean** |  |  [optional]
**topics** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**hasDownloads** | **kotlin.Boolean** |  |  [optional]
**visibility** | **kotlin.String** | The repository visibility: public, private, or internal. |  [optional]
**permissions** | [**RepositoryPermissions**](RepositoryPermissions.md) |  |  [optional]
**allowRebaseMerge** | **kotlin.Boolean** |  |  [optional]
**templateRepository** | [**FullRepositoryTemplateRepository**](FullRepositoryTemplateRepository.md) |  |  [optional]
**tempCloneToken** | **kotlin.String** |  |  [optional]
**allowSquashMerge** | **kotlin.Boolean** |  |  [optional]
**allowAutoMerge** | **kotlin.Boolean** |  |  [optional]
**deleteBranchOnMerge** | **kotlin.Boolean** |  |  [optional]
**allowMergeCommit** | **kotlin.Boolean** |  |  [optional]
**allowUpdateBranch** | **kotlin.Boolean** |  |  [optional]
**useSquashPrTitleAsDefault** | **kotlin.Boolean** |  |  [optional]
**squashMergeCommitTitle** | [**inline**](#SquashMergeCommitTitle) | The default value for a squash merge commit title:  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;COMMIT_OR_PR_TITLE&#x60; - default to the commit&#39;s title (if only one commit) or the pull request&#39;s title (when more than one commit). |  [optional]
**squashMergeCommitMessage** | [**inline**](#SquashMergeCommitMessage) | The default value for a squash merge commit message:  - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;COMMIT_MESSAGES&#x60; - default to the branch&#39;s commit messages. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional]
**mergeCommitTitle** | [**inline**](#MergeCommitTitle) | The default value for a merge commit title.    - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title.   - &#x60;MERGE_MESSAGE&#x60; - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name). |  [optional]
**mergeCommitMessage** | [**inline**](#MergeCommitMessage) | The default value for a merge commit message.  - &#x60;PR_TITLE&#x60; - default to the pull request&#39;s title. - &#x60;PR_BODY&#x60; - default to the pull request&#39;s body. - &#x60;BLANK&#x60; - default to a blank commit message. |  [optional]
**allowForking** | **kotlin.Boolean** |  |  [optional]
**webCommitSignoffRequired** | **kotlin.Boolean** |  |  [optional]
**organization** | [**IntegrationOwner**](IntegrationOwner.md) |  |  [optional]
**parent** | [**Repository**](Repository.md) |  |  [optional]
**source** | [**Repository**](Repository.md) |  |  [optional]
**masterBranch** | **kotlin.String** |  |  [optional]
**anonymousAccessEnabled** | **kotlin.Boolean** | Whether anonymous git access is allowed. |  [optional]
**codeOfConduct** | [**CodeOfConductSimple**](CodeOfConductSimple.md) |  |  [optional]
**securityAndAnalysis** | [**SecurityAndAnalysis**](SecurityAndAnalysis.md) |  |  [optional]
**customProperties** | [**kotlin.Any**](.md) | The custom properties that were defined for the repository. The keys are the custom property names, and the values are the corresponding custom property values. |  [optional]


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



