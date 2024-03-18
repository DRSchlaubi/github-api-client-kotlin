
# WebhookInstallationSuspend

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**inline**](#Action) |  | 
**installation** | [**Installation**](Installation.md) |  | 
**sender** | [**SimpleUserWebhooks**](SimpleUserWebhooks.md) |  | 
**enterprise** | [**EnterpriseWebhooks**](EnterpriseWebhooks.md) |  |  [optional]
**organization** | [**OrganizationSimpleWebhooks**](OrganizationSimpleWebhooks.md) |  |  [optional]
**repositories** | [**kotlin.collections.List&lt;PersonalAccessTokenRequestRepositoriesInner&gt;**](PersonalAccessTokenRequestRepositoriesInner.md) | An array of repository objects that the installation can access. |  [optional]
**repository** | [**RepositoryWebhooks**](RepositoryWebhooks.md) |  |  [optional]
**requester** | [**kotlin.Any**](.md) |  |  [optional]


<a id="Action"></a>
## Enum: action
Name | Value
---- | -----
action | suspend



