
# ReposUpdateReleaseRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tagName** | **kotlin.String** | The name of the tag. |  [optional]
**targetCommitish** | **kotlin.String** | Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository&#39;s default branch. |  [optional]
**name** | **kotlin.String** | The name of the release. |  [optional]
**body** | **kotlin.String** | Text describing the contents of the tag. |  [optional]
**draft** | **kotlin.Boolean** | &#x60;true&#x60; makes the release a draft, and &#x60;false&#x60; publishes the release. |  [optional]
**prerelease** | **kotlin.Boolean** | &#x60;true&#x60; to identify the release as a prerelease, &#x60;false&#x60; to identify the release as a full release. |  [optional]
**makeLatest** | [**inline**](#MakeLatest) | Specifies whether this release should be set as the latest release for the repository. Drafts and prereleases cannot be set as latest. Defaults to &#x60;true&#x60; for newly published releases. &#x60;legacy&#x60; specifies that the latest release should be determined based on the release creation date and higher semantic version. |  [optional]
**discussionCategoryName** | **kotlin.String** | If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. If there is already a discussion linked to the release, this parameter is ignored. For more information, see \&quot;[Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository).\&quot; |  [optional]


<a id="MakeLatest"></a>
## Enum: make_latest
Name | Value
---- | -----
makeLatest | true, false, legacy



