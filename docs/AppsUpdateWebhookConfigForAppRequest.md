
# AppsUpdateWebhookConfigForAppRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | [**java.net.URI**](java.net.URI.md) | The URL to which the payloads will be delivered. |  [optional]
**contentType** | **kotlin.String** | The media type used to serialize the payloads. Supported values include &#x60;json&#x60; and &#x60;form&#x60;. The default is &#x60;form&#x60;. |  [optional]
**secret** | **kotlin.String** | If provided, the &#x60;secret&#x60; will be used as the &#x60;key&#x60; to generate the HMAC hex digest value for [delivery signature headers](https://docs.github.com/webhooks/event-payloads/#delivery-headers). |  [optional]
**insecureSsl** | [**WebhookConfigInsecureSsl**](WebhookConfigInsecureSsl.md) |  |  [optional]



