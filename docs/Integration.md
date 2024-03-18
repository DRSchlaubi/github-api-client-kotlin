
# Integration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | Unique identifier of the GitHub app | 
**nodeId** | **kotlin.String** |  | 
**owner** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**name** | **kotlin.String** | The name of the GitHub app | 
**description** | **kotlin.String** |  | 
**externalUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**permissions** | [**IntegrationPermissions**](IntegrationPermissions.md) |  | 
**events** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of events for the GitHub app | 
**slug** | **kotlin.String** | The slug name of the GitHub app |  [optional]
**installationsCount** | **kotlin.Int** | The number of installations associated with the GitHub app |  [optional]
**clientId** | **kotlin.String** |  |  [optional]
**clientSecret** | **kotlin.String** |  |  [optional]
**webhookSecret** | **kotlin.String** |  |  [optional]
**pem** | **kotlin.String** |  |  [optional]



