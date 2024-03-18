
# OrganizationActionsVariable

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the variable. | 
**&#x60;value&#x60;** | **kotlin.String** | The value of the variable. | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time at which the variable was created, in ISO 8601 format&#39;:&#39; YYYY-MM-DDTHH:MM:SSZ. | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time at which the variable was last updated, in ISO 8601 format&#39;:&#39; YYYY-MM-DDTHH:MM:SSZ. | 
**visibility** | [**inline**](#Visibility) | Visibility of a variable | 
**selectedRepositoriesUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional]


<a id="Visibility"></a>
## Enum: visibility
Name | Value
---- | -----
visibility | all, private, selected



