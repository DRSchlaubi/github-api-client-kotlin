
# WebhookMembershipRemoved

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**inline**](#Action) |  | 
**member** | [**User**](User.md) |  | 
**organization** | [**OrganizationSimpleWebhooks**](OrganizationSimpleWebhooks.md) |  | 
**scope** | [**inline**](#Scope) | The scope of the membership. Currently, can only be &#x60;team&#x60;. | 
**sender** | [**User**](User.md) |  | 
**team** | [**Team**](Team.md) |  | 
**enterprise** | [**EnterpriseWebhooks**](EnterpriseWebhooks.md) |  |  [optional]
**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional]
**repository** | [**RepositoryWebhooks**](RepositoryWebhooks.md) |  |  [optional]


<a id="Action"></a>
## Enum: action
Name | Value
---- | -----
action | removed


<a id="Scope"></a>
## Enum: scope
Name | Value
---- | -----
scope | team, organization



