
# Authorization

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**scopes** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of scopes that this authorization is in. | 
**token** | **kotlin.String** |  | 
**tokenLastEight** | **kotlin.String** |  | 
**hashedToken** | **kotlin.String** |  | 
**app** | [**AuthorizationApp**](AuthorizationApp.md) |  | 
**note** | **kotlin.String** |  | 
**noteUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**fingerprint** | **kotlin.String** |  | 
**expiresAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**user** | [**IntegrationOwner**](IntegrationOwner.md) |  |  [optional]
**installation** | [**AuthorizationInstallation**](AuthorizationInstallation.md) |  |  [optional]



