
# CodespacesSecret

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the secret | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time at which the secret was created, in ISO 8601 format&#39;:&#39; YYYY-MM-DDTHH:MM:SSZ. | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time at which the secret was last updated, in ISO 8601 format&#39;:&#39; YYYY-MM-DDTHH:MM:SSZ. | 
**visibility** | [**inline**](#Visibility) | The type of repositories in the organization that the secret is visible to | 
**selectedRepositoriesUrl** | [**java.net.URI**](java.net.URI.md) | The API URL at which the list of repositories this secret is visible to can be retrieved | 


<a id="Visibility"></a>
## Enum: visibility
Name | Value
---- | -----
visibility | all, private, selected



