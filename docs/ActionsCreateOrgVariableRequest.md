
# ActionsCreateOrgVariableRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the variable. | 
**&#x60;value&#x60;** | **kotlin.String** | The value of the variable. | 
**visibility** | [**inline**](#Visibility) | The type of repositories in the organization that can access the variable. &#x60;selected&#x60; means only the repositories specified by &#x60;selected_repository_ids&#x60; can access the variable. | 
**selectedRepositoryIds** | **kotlin.collections.List&lt;kotlin.Int&gt;** | An array of repository ids that can access the organization variable. You can only provide a list of repository ids when the &#x60;visibility&#x60; is set to &#x60;selected&#x60;. |  [optional]


<a id="Visibility"></a>
## Enum: visibility
Name | Value
---- | -----
visibility | all, private, selected



