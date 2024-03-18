
# WebhookSponsorshipPendingTierChange

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**inline**](#Action) |  | 
**changes** | [**WebhookSponsorshipPendingTierChangeChanges**](WebhookSponsorshipPendingTierChangeChanges.md) |  | 
**sender** | [**SimpleUserWebhooks**](SimpleUserWebhooks.md) |  | 
**sponsorship** | [**WebhookSponsorshipCancelledSponsorship**](WebhookSponsorshipCancelledSponsorship.md) |  | 
**effectiveDate** | **kotlin.String** | The &#x60;pending_cancellation&#x60; and &#x60;pending_tier_change&#x60; event types will include the date the cancellation or tier change will take effect. |  [optional]
**enterprise** | [**EnterpriseWebhooks**](EnterpriseWebhooks.md) |  |  [optional]
**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional]
**organization** | [**OrganizationSimpleWebhooks**](OrganizationSimpleWebhooks.md) |  |  [optional]
**repository** | [**RepositoryWebhooks**](RepositoryWebhooks.md) |  |  [optional]


<a id="Action"></a>
## Enum: action
Name | Value
---- | -----
action | pending_tier_change



