
# DiffEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sha** | **kotlin.String** |  | 
**filename** | **kotlin.String** |  | 
**status** | [**inline**](#Status) |  | 
**additions** | **kotlin.Int** |  | 
**deletions** | **kotlin.Int** |  | 
**changes** | **kotlin.Int** |  | 
**blobUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**rawUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**contentsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**patch** | **kotlin.String** |  |  [optional]
**previousFilename** | **kotlin.String** |  |  [optional]


<a id="Status"></a>
## Enum: status
Name | Value
---- | -----
status | added, removed, modified, renamed, copied, changed, unchanged



