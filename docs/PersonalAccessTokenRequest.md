
# PersonalAccessTokenRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | Unique identifier of the request for access via fine-grained personal access token. Used as the &#x60;pat_request_id&#x60; parameter in the list and review API calls. | 
**owner** | [**SimpleUser**](SimpleUser.md) |  | 
**permissionsAdded** | [**PersonalAccessTokenRequestPermissionsAdded**](PersonalAccessTokenRequestPermissionsAdded.md) |  | 
**permissionsUpgraded** | [**PersonalAccessTokenRequestPermissionsUpgraded**](PersonalAccessTokenRequestPermissionsUpgraded.md) |  | 
**permissionsResult** | [**PersonalAccessTokenRequestPermissionsResult**](PersonalAccessTokenRequestPermissionsResult.md) |  | 
**repositorySelection** | [**inline**](#RepositorySelection) | Type of repository selection requested. | 
**repositoryCount** | **kotlin.Int** | The number of repositories the token is requesting access to. This field is only populated when &#x60;repository_selection&#x60; is &#x60;subset&#x60;. | 
**repositories** | [**kotlin.collections.List&lt;PersonalAccessTokenRequestRepositoriesInner&gt;**](PersonalAccessTokenRequestRepositoriesInner.md) | An array of repository objects the token is requesting access to. This field is only populated when &#x60;repository_selection&#x60; is &#x60;subset&#x60;. | 
**createdAt** | **kotlin.String** | Date and time when the request for access was created. | 
**tokenExpired** | **kotlin.Boolean** | Whether the associated fine-grained personal access token has expired. | 
**tokenExpiresAt** | **kotlin.String** | Date and time when the associated fine-grained personal access token expires. | 
**tokenLastUsedAt** | **kotlin.String** | Date and time when the associated fine-grained personal access token was last used for authentication. | 


<a id="RepositorySelection"></a>
## Enum: repository_selection
Name | Value
---- | -----
repositorySelection | none, all, subset



