
# DeploymentStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**id** | **kotlin.Int** |  | 
**nodeId** | **kotlin.String** |  | 
**state** | [**inline**](#State) | The state of the status. | 
**creator** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**description** | **kotlin.String** | A short description of the status. | 
**targetUrl** | [**java.net.URI**](java.net.URI.md) | Deprecated: the URL to associate with this status. | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**deploymentUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**repositoryUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**environment** | **kotlin.String** | The environment of the deployment that the status is for. |  [optional]
**environmentUrl** | [**java.net.URI**](java.net.URI.md) | The URL for accessing your environment. |  [optional]
**logUrl** | [**java.net.URI**](java.net.URI.md) | The URL to associate with this status. |  [optional]
**performedViaGithubApp** | [**IssuePerformedViaGithubApp**](IssuePerformedViaGithubApp.md) |  |  [optional]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | error, failure, inactive, pending, success, queued, in_progress



