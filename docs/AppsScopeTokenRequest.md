
# AppsScopeTokenRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessToken** | **kotlin.String** | The access token used to authenticate to the GitHub API. | 
**target** | **kotlin.String** | The name of the user or organization to scope the user access token to. **Required** unless &#x60;target_id&#x60; is specified. |  [optional]
**targetId** | **kotlin.Int** | The ID of the user or organization to scope the user access token to. **Required** unless &#x60;target&#x60; is specified. |  [optional]
**repositories** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of repository names to scope the user access token to. &#x60;repositories&#x60; may not be specified if &#x60;repository_ids&#x60; is specified. |  [optional]
**repositoryIds** | **kotlin.collections.List&lt;kotlin.Int&gt;** | The list of repository IDs to scope the user access token to. &#x60;repository_ids&#x60; may not be specified if &#x60;repositories&#x60; is specified. |  [optional]
**permissions** | [**AppPermissions**](AppPermissions.md) |  |  [optional]



