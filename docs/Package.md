
# Package

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | Unique identifier of the package. | 
**name** | **kotlin.String** | The name of the package. | 
**packageType** | [**inline**](#PackageType) |  | 
**url** | **kotlin.String** |  | 
**htmlUrl** | **kotlin.String** |  | 
**versionCount** | **kotlin.Int** | The number of versions of the package. | 
**visibility** | [**inline**](#Visibility) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**owner** | [**IntegrationOwner**](IntegrationOwner.md) |  |  [optional]
**repository** | [**PackageRepository**](PackageRepository.md) |  |  [optional]


<a id="PackageType"></a>
## Enum: package_type
Name | Value
---- | -----
packageType | npm, maven, rubygems, docker, nuget, container


<a id="Visibility"></a>
## Enum: visibility
Name | Value
---- | -----
visibility | private, public



