
# OrgsCreateWebhookRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Must be passed as \&quot;web\&quot;. | 
**config** | [**OrgsCreateWebhookRequestConfig**](OrgsCreateWebhookRequestConfig.md) |  | 
**events** | **kotlin.collections.List&lt;kotlin.String&gt;** | Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for. Set to &#x60;[\&quot;*\&quot;]&#x60; to receive all possible events. |  [optional]
**active** | **kotlin.Boolean** | Determines if notifications are sent when the webhook is triggered. Set to &#x60;true&#x60; to send notifications. |  [optional]



