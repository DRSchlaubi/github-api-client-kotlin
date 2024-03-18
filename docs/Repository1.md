
# Repository1

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
**hasDiscussions** | **kotlin.Boolean** | Whether discussions are enabled. | 
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
**customProperties** | [**kotlin.Any**](.md) | The custom properties that were defined for the repository. The keys are the custom property names, and the values are the corresponding custom property values. |  [optional]
**deleteBranchOnMerge** | **kotlin.Boolean** | Whether to delete head branches when pull requests are merged |  [optional]
**disabled** | **kotlin.Boolean** | Returns whether or not this repository is disabled. |  [optional]
**isTemplate** | **kotlin.Boolean** |  |  [optional]
**masterBranch** | **kotlin.String** |  |  [optional]
**organization** | **kotlin.String** |  |  [optional]
**permissions** | [**RepositoryPermissions**](RepositoryPermissions.md) |  |  [optional]
**&#x60;public&#x60;** | **kotlin.Boolean** |  |  [optional]
**roleName** | **kotlin.String** |  |  [optional]
**stargazers** | **kotlin.Int** |  |  [optional]
**webCommitSignoffRequired** | **kotlin.Boolean** | Whether to require contributors to sign off on web-based commits |  [optional]


<a id="Visibility"></a>
## Enum: visibility
Name | Value
---- | -----
visibility | public, private, internal



