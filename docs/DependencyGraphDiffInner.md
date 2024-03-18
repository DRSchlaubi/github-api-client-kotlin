
# DependencyGraphDiffInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**changeType** | [**inline**](#ChangeType) |  | 
**manifest** | **kotlin.String** |  | 
**ecosystem** | **kotlin.String** |  | 
**name** | **kotlin.String** |  | 
**version** | **kotlin.String** |  | 
**packageUrl** | **kotlin.String** |  | 
**license** | **kotlin.String** |  | 
**sourceRepositoryUrl** | **kotlin.String** |  | 
**vulnerabilities** | [**kotlin.collections.List&lt;DependencyGraphDiffInnerVulnerabilitiesInner&gt;**](DependencyGraphDiffInnerVulnerabilitiesInner.md) |  | 
**scope** | [**inline**](#Scope) | Where the dependency is utilized. &#x60;development&#x60; means that the dependency is only utilized in the development environment. &#x60;runtime&#x60; means that the dependency is utilized at runtime and in the development environment. | 


<a id="ChangeType"></a>
## Enum: change_type
Name | Value
---- | -----
changeType | added, removed


<a id="Scope"></a>
## Enum: scope
Name | Value
---- | -----
scope | unknown, runtime, development



