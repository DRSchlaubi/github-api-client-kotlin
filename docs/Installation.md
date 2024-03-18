
# Installation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | The ID of the installation. | 
**account** | [**IntegrationInstallationRequestAccount**](IntegrationInstallationRequestAccount.md) |  | 
**repositorySelection** | [**inline**](#RepositorySelection) | Describe whether all repositories have been selected or there&#39;s a selection involved | 
**accessTokensUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**repositoriesUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**appId** | **kotlin.Int** |  | 
**targetId** | **kotlin.Int** | The ID of the user or organization this token is being scoped to. | 
**targetType** | **kotlin.String** |  | 
**permissions** | [**AppPermissions**](AppPermissions.md) |  | 
**events** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**singleFileName** | **kotlin.String** |  | 
**appSlug** | **kotlin.String** |  | 
**suspendedBy** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**suspendedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**hasMultipleSingleFiles** | **kotlin.Boolean** |  |  [optional]
**singleFilePaths** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**contactEmail** | **kotlin.String** |  |  [optional]


<a id="RepositorySelection"></a>
## Enum: repository_selection
Name | Value
---- | -----
repositorySelection | all, selected



