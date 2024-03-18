
# WebhookInstallationRepositoriesAdded

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**inline**](#Action) |  | 
**installation** | [**Installation**](Installation.md) |  | 
**repositoriesAdded** | [**kotlin.collections.List&lt;PersonalAccessTokenRequestRepositoriesInner&gt;**](PersonalAccessTokenRequestRepositoriesInner.md) | An array of repository objects, which were added to the installation. | 
**repositoriesRemoved** | [**kotlin.collections.List&lt;WebhookInstallationRepositoriesAddedRepositoriesRemovedInner&gt;**](WebhookInstallationRepositoriesAddedRepositoriesRemovedInner.md) | An array of repository objects, which were removed from the installation. | 
**repositorySelection** | [**inline**](#RepositorySelection) | Describe whether all repositories have been selected or there&#39;s a selection involved | 
**requester** | [**User**](User.md) |  | 
**sender** | [**SimpleUserWebhooks**](SimpleUserWebhooks.md) |  | 
**enterprise** | [**EnterpriseWebhooks**](EnterpriseWebhooks.md) |  |  [optional]
**organization** | [**OrganizationSimpleWebhooks**](OrganizationSimpleWebhooks.md) |  |  [optional]
**repository** | [**RepositoryWebhooks**](RepositoryWebhooks.md) |  |  [optional]


<a id="Action"></a>
## Enum: action
Name | Value
---- | -----
action | added


<a id="RepositorySelection"></a>
## Enum: repository_selection
Name | Value
---- | -----
repositorySelection | all, selected



