
# ReposUpdateWebhookRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**config** | [**WebhookConfig**](WebhookConfig.md) |  |  [optional]
**events** | **kotlin.collections.List&lt;kotlin.String&gt;** | Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for. This replaces the entire array of events. |  [optional]
**addEvents** | **kotlin.collections.List&lt;kotlin.String&gt;** | Determines a list of events to be added to the list of events that the Hook triggers for. |  [optional]
**removeEvents** | **kotlin.collections.List&lt;kotlin.String&gt;** | Determines a list of events to be removed from the list of events that the Hook triggers for. |  [optional]
**active** | **kotlin.Boolean** | Determines if notifications are sent when the webhook is triggered. Set to &#x60;true&#x60; to send notifications. |  [optional]



