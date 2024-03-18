
# Hook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **kotlin.String** |  | 
**id** | **kotlin.Int** | Unique identifier of the webhook. | 
**name** | **kotlin.String** | The name of a valid service, use &#39;web&#39; for a webhook. | 
**active** | **kotlin.Boolean** | Determines whether the hook is actually triggered on pushes. | 
**events** | **kotlin.collections.List&lt;kotlin.String&gt;** | Determines what events the hook is triggered for. Default: [&#39;push&#39;]. | 
**config** | [**WebhookConfig**](WebhookConfig.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**testUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**pingUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**lastResponse** | [**HookResponse**](HookResponse.md) |  | 
**deliveriesUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional]



