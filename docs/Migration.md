
# Migration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** |  | 
**owner** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**guid** | **kotlin.String** |  | 
**state** | **kotlin.String** |  | 
**lockRepositories** | **kotlin.Boolean** |  | 
**excludeMetadata** | **kotlin.Boolean** |  | 
**excludeGitData** | **kotlin.Boolean** |  | 
**excludeAttachments** | **kotlin.Boolean** |  | 
**excludeReleases** | **kotlin.Boolean** |  | 
**excludeOwnerProjects** | **kotlin.Boolean** |  | 
**orgMetadataOnly** | **kotlin.Boolean** |  | 
**repositories** | [**kotlin.collections.List&lt;Repository&gt;**](Repository.md) | The repositories included in the migration. Only returned for export migrations. | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**nodeId** | **kotlin.String** |  | 
**archiveUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**exclude** | **kotlin.collections.List&lt;kotlin.String&gt;** | Exclude related items from being returned in the response in order to improve performance of the request. The array can include any of: &#x60;\&quot;repositories\&quot;&#x60;. |  [optional]



