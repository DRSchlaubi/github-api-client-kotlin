
# AuthenticationToken

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **kotlin.String** | The token used for authentication | 
**expiresAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time this token expires | 
**permissions** | [**kotlin.Any**](.md) |  |  [optional]
**repositories** | [**kotlin.collections.List&lt;Repository&gt;**](Repository.md) | The repositories this token has access to |  [optional]
**singleFile** | **kotlin.String** |  |  [optional]
**repositorySelection** | [**inline**](#RepositorySelection) | Describe whether all repositories have been selected or there&#39;s a selection involved |  [optional]


<a id="RepositorySelection"></a>
## Enum: repository_selection
Name | Value
---- | -----
repositorySelection | all, selected



