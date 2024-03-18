
# Dependency

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**packageUrl** | **kotlin.String** | Package-url (PURL) of dependency. See https://github.com/package-url/purl-spec for more details. |  [optional]
**metadata** | [**kotlin.Any**](.md) | User-defined metadata to store domain-specific information limited to 8 keys with scalar values. |  [optional]
**relationship** | [**inline**](#Relationship) | A notation of whether a dependency is requested directly by this manifest or is a dependency of another dependency. |  [optional]
**scope** | [**inline**](#Scope) | A notation of whether the dependency is required for the primary build artifact (runtime) or is only used for development. Future versions of this specification may allow for more granular scopes. |  [optional]
**dependencies** | **kotlin.collections.List&lt;kotlin.String&gt;** | Array of package-url (PURLs) of direct child dependencies. |  [optional]


<a id="Relationship"></a>
## Enum: relationship
Name | Value
---- | -----
relationship | direct, indirect


<a id="Scope"></a>
## Enum: scope
Name | Value
---- | -----
scope | runtime, development



