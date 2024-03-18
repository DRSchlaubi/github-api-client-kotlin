
# ReposCreateWebhookRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**kotlin.Any**](.md) | Use &#x60;web&#x60; to create a webhook. Default: &#x60;web&#x60;. This parameter only accepts the value &#x60;web&#x60;. |  [optional]
**config** | [**ReposCreateWebhookRequestConfig**](ReposCreateWebhookRequestConfig.md) |  |  [optional]
**events** | [**kotlin.Any**](.md) | Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for. |  [optional]
**active** | **kotlin.Boolean** | Determines if notifications are sent when the webhook is triggered. Set to &#x60;true&#x60; to send notifications. |  [optional]



