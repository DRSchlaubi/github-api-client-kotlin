
# OrganizationProgrammaticAccessGrant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | Unique identifier of the fine-grained personal access token. The &#x60;pat_id&#x60; used to get details about an approved fine-grained personal access token. | 
**owner** | [**SimpleUser**](SimpleUser.md) |  | 
**repositorySelection** | [**inline**](#RepositorySelection) | Type of repository selection requested. | 
**repositoriesUrl** | **kotlin.String** | URL to the list of repositories the fine-grained personal access token can access. Only follow when &#x60;repository_selection&#x60; is &#x60;subset&#x60;. | 
**permissions** | [**OrganizationProgrammaticAccessGrantRequestPermissions**](OrganizationProgrammaticAccessGrantRequestPermissions.md) |  | 
**accessGrantedAt** | **kotlin.String** | Date and time when the fine-grained personal access token was approved to access the organization. | 
**tokenExpired** | **kotlin.Boolean** | Whether the associated fine-grained personal access token has expired. | 
**tokenExpiresAt** | **kotlin.String** | Date and time when the associated fine-grained personal access token expires. | 
**tokenLastUsedAt** | **kotlin.String** | Date and time when the associated fine-grained personal access token was last used for authentication. | 


<a id="RepositorySelection"></a>
## Enum: repository_selection
Name | Value
---- | -----
repositorySelection | none, all, subset



