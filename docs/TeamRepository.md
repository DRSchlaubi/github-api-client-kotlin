
# TeamRepository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | Unique identifier of the repository | 
**nodeId** | **kotlin.String** |  | 
**name** | **kotlin.String** | The name of the repository. | 
**fullName** | **kotlin.String** |  | 
**license** | [**RepositoryLicense**](RepositoryLicense.md) |  | 
**forks** | **kotlin.Int** |  | 
**owner** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
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
**propertySize** | **kotlin.Int** |  | 
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
**permissions** | [**RepositoryPermissions**](RepositoryPermissions.md) |  |  [optional]
**roleName** | **kotlin.String** |  |  [optional]
**isTemplate** | **kotlin.Boolean** | Whether this repository acts as a template that can be used to generate new repositories. |  [optional]
**topics** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**visibility** | **kotlin.String** | The repository visibility: public, private, or internal. |  [optional]
**allowRebaseMerge** | **kotlin.Boolean** | Whether to allow rebase merges for pull requests. |  [optional]
**tempCloneToken** | **kotlin.String** |  |  [optional]
**allowSquashMerge** | **kotlin.Boolean** | Whether to allow squash merges for pull requests. |  [optional]
**allowAutoMerge** | **kotlin.Boolean** | Whether to allow Auto-merge to be used on pull requests. |  [optional]
**deleteBranchOnMerge** | **kotlin.Boolean** | Whether to delete head branches when pull requests are merged |  [optional]
**allowMergeCommit** | **kotlin.Boolean** | Whether to allow merge commits for pull requests. |  [optional]
**allowForking** | **kotlin.Boolean** | Whether to allow forking this repo |  [optional]
**webCommitSignoffRequired** | **kotlin.Boolean** | Whether to require contributors to sign off on web-based commits |  [optional]
**subscribersCount** | **kotlin.Int** |  |  [optional]
**networkCount** | **kotlin.Int** |  |  [optional]
**masterBranch** | **kotlin.String** |  |  [optional]



