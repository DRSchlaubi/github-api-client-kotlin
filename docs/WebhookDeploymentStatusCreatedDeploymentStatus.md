
# WebhookDeploymentStatusCreatedDeploymentStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **kotlin.String** |  | 
**creator** | [**User**](User.md) |  | 
**deploymentUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**description** | **kotlin.String** | The optional human-readable description added to the status. | 
**environment** | **kotlin.String** |  | 
**id** | **kotlin.Int** |  | 
**nodeId** | **kotlin.String** |  | 
**repositoryUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**state** | **kotlin.String** | The new state. Can be &#x60;pending&#x60;, &#x60;success&#x60;, &#x60;failure&#x60;, or &#x60;error&#x60;. | 
**targetUrl** | **kotlin.String** | The optional link added to the status. | 
**updatedAt** | **kotlin.String** |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**environmentUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**logUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**performedViaGithubApp** | [**App5**](App5.md) |  |  [optional]



