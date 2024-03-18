
# WebhookCustomPropertyValuesUpdated

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**inline**](#Action) |  | 
**repository** | [**RepositoryWebhooks**](RepositoryWebhooks.md) |  | 
**organization** | [**OrganizationSimpleWebhooks**](OrganizationSimpleWebhooks.md) |  | 
**newPropertyValues** | [**kotlin.collections.List&lt;CustomPropertyValue&gt;**](CustomPropertyValue.md) | The new custom property values for the repository. | 
**oldPropertyValues** | [**kotlin.collections.List&lt;CustomPropertyValue&gt;**](CustomPropertyValue.md) | The old custom property values for the repository. | 
**enterprise** | [**EnterpriseWebhooks**](EnterpriseWebhooks.md) |  |  [optional]
**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional]
**sender** | [**SimpleUserWebhooks**](SimpleUserWebhooks.md) |  |  [optional]


<a id="Action"></a>
## Enum: action
Name | Value
---- | -----
action | updated



