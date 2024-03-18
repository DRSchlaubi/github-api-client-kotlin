
# WebhookMarketplacePurchasePendingChange

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**inline**](#Action) |  | 
**effectiveDate** | **kotlin.String** |  | 
**marketplacePurchase** | [**WebhookMarketplacePurchaseCancelledMarketplacePurchase**](WebhookMarketplacePurchaseCancelledMarketplacePurchase.md) |  | 
**sender** | [**SimpleUserWebhooks**](SimpleUserWebhooks.md) |  | 
**enterprise** | [**EnterpriseWebhooks**](EnterpriseWebhooks.md) |  |  [optional]
**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional]
**organization** | [**OrganizationSimpleWebhooks**](OrganizationSimpleWebhooks.md) |  |  [optional]
**previousMarketplacePurchase** | [**MarketplacePurchase2**](MarketplacePurchase2.md) |  |  [optional]
**repository** | [**RepositoryWebhooks**](RepositoryWebhooks.md) |  |  [optional]


<a id="Action"></a>
## Enum: action
Name | Value
---- | -----
action | pending_change



