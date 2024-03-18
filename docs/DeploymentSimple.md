
# DeploymentSimple

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**id** | **kotlin.Int** | Unique identifier of the deployment | 
**nodeId** | **kotlin.String** |  | 
**task** | **kotlin.String** | Parameter to specify a task to execute | 
**environment** | **kotlin.String** | Name for the target deployment environment. | 
**description** | **kotlin.String** |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**statusesUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**repositoryUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**originalEnvironment** | **kotlin.String** |  |  [optional]
**transientEnvironment** | **kotlin.Boolean** | Specifies if the given environment is will no longer exist at some point in the future. Default: false. |  [optional]
**productionEnvironment** | **kotlin.Boolean** | Specifies if the given environment is one that end-users directly interact with. Default: false. |  [optional]
**performedViaGithubApp** | [**IssuePerformedViaGithubApp**](IssuePerformedViaGithubApp.md) |  |  [optional]



