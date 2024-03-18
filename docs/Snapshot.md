
# Snapshot

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**kotlin.Any**](.md) | The version of the repository snapshot submission. | 
**job** | [**SnapshotJob**](SnapshotJob.md) |  | 
**sha** | [**kotlin.Any**](.md) | The commit SHA associated with this dependency snapshot. Maximum length: 40 characters. | 
**ref** | [**kotlin.Any**](.md) | The repository branch that triggered this snapshot. | 
**detector** | [**SnapshotDetector**](SnapshotDetector.md) |  | 
**scanned** | [**kotlin.Any**](.md) | The time at which the snapshot was scanned. | 
**metadata** | [**kotlin.Any**](.md) | User-defined metadata to store domain-specific information limited to 8 keys with scalar values. |  [optional]
**manifests** | [**kotlin.collections.Map&lt;kotlin.String, Manifest&gt;**](Manifest.md) | A collection of package manifests, which are a collection of related dependencies declared in a file or representing a logical group of dependencies. |  [optional]



