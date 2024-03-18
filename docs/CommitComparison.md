
# CommitComparison

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**permalinkUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**diffUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**patchUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**baseCommit** | [**Commit**](Commit.md) |  | 
**mergeBaseCommit** | [**Commit**](Commit.md) |  | 
**status** | [**inline**](#Status) |  | 
**aheadBy** | **kotlin.Int** |  | 
**behindBy** | **kotlin.Int** |  | 
**totalCommits** | **kotlin.Int** |  | 
**commits** | [**kotlin.collections.List&lt;Commit&gt;**](Commit.md) |  | 
**files** | [**kotlin.collections.List&lt;DiffEntry&gt;**](DiffEntry.md) |  |  [optional]


<a id="Status"></a>
## Enum: status
Name | Value
---- | -----
status | diverged, ahead, behind, identical



