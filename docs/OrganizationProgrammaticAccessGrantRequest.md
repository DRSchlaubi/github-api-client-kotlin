
# OrganizationProgrammaticAccessGrantRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | Unique identifier of the request for access via fine-grained personal access token. The &#x60;pat_request_id&#x60; used to review PAT requests. | 
**reason** | **kotlin.String** | Reason for requesting access. | 
**owner** | [**SimpleUser**](SimpleUser.md) |  | 
**repositorySelection** | [**inline**](#RepositorySelection) | Type of repository selection requested. | 
**repositoriesUrl** | **kotlin.String** | URL to the list of repositories requested to be accessed via fine-grained personal access token. Should only be followed when &#x60;repository_selection&#x60; is &#x60;subset&#x60;. | 
**permissions** | [**OrganizationProgrammaticAccessGrantRequestPermissions**](OrganizationProgrammaticAccessGrantRequestPermissions.md) |  | 
**createdAt** | **kotlin.String** | Date and time when the request for access was created. | 
**tokenExpired** | **kotlin.Boolean** | Whether the associated fine-grained personal access token has expired. | 
**tokenExpiresAt** | **kotlin.String** | Date and time when the associated fine-grained personal access token expires. | 
**tokenLastUsedAt** | **kotlin.String** | Date and time when the associated fine-grained personal access token was last used for authentication. | 


<a id="RepositorySelection"></a>
## Enum: repository_selection
Name | Value
---- | -----
repositorySelection | none, all, subset



