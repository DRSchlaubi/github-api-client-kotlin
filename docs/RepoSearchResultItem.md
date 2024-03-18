
# RepoSearchResultItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** |  | 
**nodeId** | **kotlin.String** |  | 
**name** | **kotlin.String** |  | 
**fullName** | **kotlin.String** |  | 
**owner** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**&#x60;private&#x60;** | **kotlin.Boolean** |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**description** | **kotlin.String** |  | 
**fork** | **kotlin.Boolean** |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**pushedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**homepage** | [**java.net.URI**](java.net.URI.md) |  | 
**propertySize** | **kotlin.Int** |  | 
**stargazersCount** | **kotlin.Int** |  | 
**watchersCount** | **kotlin.Int** |  | 
**language** | **kotlin.String** |  | 
**forksCount** | **kotlin.Int** |  | 
**openIssuesCount** | **kotlin.Int** |  | 
**defaultBranch** | **kotlin.String** |  | 
**score** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**forksUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**keysUrl** | **kotlin.String** |  | 
**collaboratorsUrl** | **kotlin.String** |  | 
**teamsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**hooksUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**issueEventsUrl** | **kotlin.String** |  | 
**eventsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**assigneesUrl** | **kotlin.String** |  | 
**branchesUrl** | **kotlin.String** |  | 
**tagsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**blobsUrl** | **kotlin.String** |  | 
**gitTagsUrl** | **kotlin.String** |  | 
**gitRefsUrl** | **kotlin.String** |  | 
**treesUrl** | **kotlin.String** |  | 
**statusesUrl** | **kotlin.String** |  | 
**languagesUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**stargazersUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**contributorsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**subscribersUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**subscriptionUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**commitsUrl** | **kotlin.String** |  | 
**gitCommitsUrl** | **kotlin.String** |  | 
**commentsUrl** | **kotlin.String** |  | 
**issueCommentUrl** | **kotlin.String** |  | 
**contentsUrl** | **kotlin.String** |  | 
**compareUrl** | **kotlin.String** |  | 
**mergesUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**archiveUrl** | **kotlin.String** |  | 
**downloadsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**issuesUrl** | **kotlin.String** |  | 
**pullsUrl** | **kotlin.String** |  | 
**milestonesUrl** | **kotlin.String** |  | 
**notificationsUrl** | **kotlin.String** |  | 
**labelsUrl** | **kotlin.String** |  | 
**releasesUrl** | **kotlin.String** |  | 
**deploymentsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**gitUrl** | **kotlin.String** |  | 
**sshUrl** | **kotlin.String** |  | 
**cloneUrl** | **kotlin.String** |  | 
**svnUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**forks** | **kotlin.Int** |  | 
**openIssues** | **kotlin.Int** |  | 
**watchers** | **kotlin.Int** |  | 
**mirrorUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**hasIssues** | **kotlin.Boolean** |  | 
**hasProjects** | **kotlin.Boolean** |  | 
**hasPages** | **kotlin.Boolean** |  | 
**hasWiki** | **kotlin.Boolean** |  | 
**hasDownloads** | **kotlin.Boolean** |  | 
**archived** | **kotlin.Boolean** |  | 
**disabled** | **kotlin.Boolean** | Returns whether or not this repository disabled. | 
**license** | [**RepositoryLicense**](RepositoryLicense.md) |  | 
**masterBranch** | **kotlin.String** |  |  [optional]
**topics** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**hasDiscussions** | **kotlin.Boolean** |  |  [optional]
**visibility** | **kotlin.String** | The repository visibility: public, private, or internal. |  [optional]
**permissions** | [**RepositoryPermissions**](RepositoryPermissions.md) |  |  [optional]
**textMatches** | [**kotlin.collections.List&lt;SearchResultTextMatchesInner&gt;**](SearchResultTextMatchesInner.md) |  |  [optional]
**tempCloneToken** | **kotlin.String** |  |  [optional]
**allowMergeCommit** | **kotlin.Boolean** |  |  [optional]
**allowSquashMerge** | **kotlin.Boolean** |  |  [optional]
**allowRebaseMerge** | **kotlin.Boolean** |  |  [optional]
**allowAutoMerge** | **kotlin.Boolean** |  |  [optional]
**deleteBranchOnMerge** | **kotlin.Boolean** |  |  [optional]
**allowForking** | **kotlin.Boolean** |  |  [optional]
**isTemplate** | **kotlin.Boolean** |  |  [optional]
**webCommitSignoffRequired** | **kotlin.Boolean** |  |  [optional]



