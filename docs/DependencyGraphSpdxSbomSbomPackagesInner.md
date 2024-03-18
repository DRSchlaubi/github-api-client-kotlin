
# DependencyGraphSpdxSbomSbomPackagesInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SPDXID** | **kotlin.String** | A unique SPDX identifier for the package. |  [optional]
**name** | **kotlin.String** | The name of the package. |  [optional]
**versionInfo** | **kotlin.String** | The version of the package. If the package does not have an exact version specified, a version range is given. |  [optional]
**downloadLocation** | **kotlin.String** | The location where the package can be downloaded, or NOASSERTION if this has not been determined. |  [optional]
**filesAnalyzed** | **kotlin.Boolean** | Whether the package&#39;s file content has been subjected to analysis during the creation of the SPDX document. |  [optional]
**licenseConcluded** | **kotlin.String** | The license of the package as determined while creating the SPDX document. |  [optional]
**licenseDeclared** | **kotlin.String** | The license of the package as declared by its author, or NOASSERTION if this information was not available when the SPDX document was created. |  [optional]
**supplier** | **kotlin.String** | The distribution source of this package, or NOASSERTION if this was not determined. |  [optional]
**externalRefs** | [**kotlin.collections.List&lt;DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner&gt;**](DependencyGraphSpdxSbomSbomPackagesInnerExternalRefsInner.md) |  |  [optional]



