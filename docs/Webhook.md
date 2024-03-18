
# Webhook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **kotlin.Boolean** | Determines whether the hook is actually triggered for the events it subscribes to. | 
**config** | [**AppsUpdateWebhookConfigForAppRequest**](AppsUpdateWebhookConfigForAppRequest.md) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**events** | **kotlin.collections.List&lt;kotlin.String&gt;** | Determines what events the hook is triggered for. Default: [&#39;push&#39;]. | 
**id** | **kotlin.Int** | Unique identifier of the webhook. | 
**name** | [**inline**](#Name) | The type of webhook. The only valid value is &#39;web&#39;. | 
**type** | **kotlin.String** |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**appId** | **kotlin.Int** | Only included for GitHub Apps. When you register a new GitHub App, GitHub sends a ping event to the webhook URL you specified during registration. The GitHub App ID sent in this field is required for authenticating an app. |  [optional]
**deliveriesUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**lastResponse** | [**HookResponse**](HookResponse.md) |  |  [optional]
**pingUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**testUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**url** | [**java.net.URI**](java.net.URI.md) |  |  [optional]


<a id="Name"></a>
## Enum: name
Name | Value
---- | -----
name | web



