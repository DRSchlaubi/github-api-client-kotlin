
# Commit1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**Committer**](Committer.md) |  | 
**committer** | [**Committer**](Committer.md) |  | 
**distinct** | **kotlin.Boolean** | Whether this commit is distinct from any that have been pushed before. | 
**id** | **kotlin.String** |  | 
**message** | **kotlin.String** | The commit message. | 
**timestamp** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The ISO 8601 timestamp of the commit. | 
**treeId** | **kotlin.String** |  | 
**url** | [**java.net.URI**](java.net.URI.md) | URL that points to the commit API resource. | 
**added** | **kotlin.collections.List&lt;kotlin.String&gt;** | An array of files added in the commit. |  [optional]
**modified** | **kotlin.collections.List&lt;kotlin.String&gt;** | An array of files modified by the commit. |  [optional]
**removed** | **kotlin.collections.List&lt;kotlin.String&gt;** | An array of files removed in the commit. |  [optional]



