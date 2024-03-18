
# HookDeliveryItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | Unique identifier of the webhook delivery. | 
**guid** | **kotlin.String** | Unique identifier for the event (shared with all deliveries for all webhooks that subscribe to this event). | 
**deliveredAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | Time when the webhook delivery occurred. | 
**redelivery** | **kotlin.Boolean** | Whether the webhook delivery is a redelivery. | 
**duration** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Time spent delivering. | 
**status** | **kotlin.String** | Describes the response returned after attempting the delivery. | 
**statusCode** | **kotlin.Int** | Status code received when delivery was made. | 
**event** | **kotlin.String** | The event that triggered the delivery. | 
**action** | **kotlin.String** | The type of activity for the event that triggered the delivery. | 
**installationId** | **kotlin.Int** | The id of the GitHub App installation associated with this event. | 
**repositoryId** | **kotlin.Int** | The id of the repository associated with this event. | 



