
# Page

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | [**java.net.URI**](java.net.URI.md) | The API address for accessing this Page resource. | 
**status** | [**inline**](#Status) | The status of the most recent build of the Page. | 
**cname** | **kotlin.String** | The Pages site&#39;s custom domain | 
**custom404** | **kotlin.Boolean** | Whether the Page has a custom 404 page. | 
**&#x60;public&#x60;** | **kotlin.Boolean** | Whether the GitHub Pages site is publicly visible. If set to &#x60;true&#x60;, the site is accessible to anyone on the internet. If set to &#x60;false&#x60;, the site will only be accessible to users who have at least &#x60;read&#x60; access to the repository that published the site. | 
**protectedDomainState** | [**inline**](#ProtectedDomainState) | The state if the domain is verified |  [optional]
**pendingDomainUnverifiedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The timestamp when a pending domain becomes unverified. |  [optional]
**htmlUrl** | [**java.net.URI**](java.net.URI.md) | The web address the Page can be accessed from. |  [optional]
**buildType** | [**inline**](#BuildType) | The process in which the Page will be built. |  [optional]
**source** | [**PagesSourceHash**](PagesSourceHash.md) |  |  [optional]
**httpsCertificate** | [**PagesHttpsCertificate**](PagesHttpsCertificate.md) |  |  [optional]
**httpsEnforced** | **kotlin.Boolean** | Whether https is enabled on the domain |  [optional]


<a id="Status"></a>
## Enum: status
Name | Value
---- | -----
status | built, building, errored, 


<a id="ProtectedDomainState"></a>
## Enum: protected_domain_state
Name | Value
---- | -----
protectedDomainState | pending, verified, unverified, 


<a id="BuildType"></a>
## Enum: build_type
Name | Value
---- | -----
buildType | legacy, workflow, 



