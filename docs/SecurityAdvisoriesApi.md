# SecurityAdvisoriesApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**securityAdvisoriesCreateFork**](SecurityAdvisoriesApi.md#securityAdvisoriesCreateFork) | **POST** /repos/{owner}/{repo}/security-advisories/{ghsa_id}/forks | Create a temporary private fork
[**securityAdvisoriesCreatePrivateVulnerabilityReport**](SecurityAdvisoriesApi.md#securityAdvisoriesCreatePrivateVulnerabilityReport) | **POST** /repos/{owner}/{repo}/security-advisories/reports | Privately report a security vulnerability
[**securityAdvisoriesCreateRepositoryAdvisory**](SecurityAdvisoriesApi.md#securityAdvisoriesCreateRepositoryAdvisory) | **POST** /repos/{owner}/{repo}/security-advisories | Create a repository security advisory
[**securityAdvisoriesCreateRepositoryAdvisoryCveRequest**](SecurityAdvisoriesApi.md#securityAdvisoriesCreateRepositoryAdvisoryCveRequest) | **POST** /repos/{owner}/{repo}/security-advisories/{ghsa_id}/cve | Request a CVE for a repository security advisory
[**securityAdvisoriesGetGlobalAdvisory**](SecurityAdvisoriesApi.md#securityAdvisoriesGetGlobalAdvisory) | **GET** /advisories/{ghsa_id} | Get a global security advisory
[**securityAdvisoriesGetRepositoryAdvisory**](SecurityAdvisoriesApi.md#securityAdvisoriesGetRepositoryAdvisory) | **GET** /repos/{owner}/{repo}/security-advisories/{ghsa_id} | Get a repository security advisory
[**securityAdvisoriesListGlobalAdvisories**](SecurityAdvisoriesApi.md#securityAdvisoriesListGlobalAdvisories) | **GET** /advisories | List global security advisories
[**securityAdvisoriesListOrgRepositoryAdvisories**](SecurityAdvisoriesApi.md#securityAdvisoriesListOrgRepositoryAdvisories) | **GET** /orgs/{org}/security-advisories | List repository security advisories for an organization
[**securityAdvisoriesListRepositoryAdvisories**](SecurityAdvisoriesApi.md#securityAdvisoriesListRepositoryAdvisories) | **GET** /repos/{owner}/{repo}/security-advisories | List repository security advisories
[**securityAdvisoriesUpdateRepositoryAdvisory**](SecurityAdvisoriesApi.md#securityAdvisoriesUpdateRepositoryAdvisory) | **PATCH** /repos/{owner}/{repo}/security-advisories/{ghsa_id} | Update a repository security advisory


<a id="securityAdvisoriesCreateFork"></a>
# **securityAdvisoriesCreateFork**
> FullRepository securityAdvisoriesCreateFork(owner, repo, ghsaId)

Create a temporary private fork

Create a temporary private fork to collaborate on fixing a security vulnerability in your repository.  **Note**: Forking a repository happens asynchronously. You may have to wait up to 5 minutes before you can access the fork.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecurityAdvisoriesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ghsaId : kotlin.String = ghsaId_example // kotlin.String | The GHSA (GitHub Security Advisory) identifier of the advisory.
try {
    val result : FullRepository = apiInstance.securityAdvisoriesCreateFork(owner, repo, ghsaId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecurityAdvisoriesApi#securityAdvisoriesCreateFork")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityAdvisoriesApi#securityAdvisoriesCreateFork")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ghsaId** | **kotlin.String**| The GHSA (GitHub Security Advisory) identifier of the advisory. |

### Return type

[**FullRepository**](FullRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="securityAdvisoriesCreatePrivateVulnerabilityReport"></a>
# **securityAdvisoriesCreatePrivateVulnerabilityReport**
> RepositoryAdvisory securityAdvisoriesCreatePrivateVulnerabilityReport(owner, repo, privateVulnerabilityReportCreate)

Privately report a security vulnerability

Report a security vulnerability to the maintainers of the repository. See \&quot;[Privately reporting a security vulnerability](https://docs.github.com/code-security/security-advisories/guidance-on-reporting-and-writing/privately-reporting-a-security-vulnerability)\&quot; for more information about private vulnerability reporting.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecurityAdvisoriesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val privateVulnerabilityReportCreate : PrivateVulnerabilityReportCreate = {"summary":"A newly discovered vulnerability","description":"A more in-depth description of what the problem is.","severity":"high","vulnerabilities":[{"package":{"name":"a-package","ecosystem":"npm"},"vulnerable_version_range":"< 1.0.0","patched_versions":"1.0.0","vulnerable_functions":["important_function"]}],"cwe_ids":["CWE-123"]} // PrivateVulnerabilityReportCreate | 
try {
    val result : RepositoryAdvisory = apiInstance.securityAdvisoriesCreatePrivateVulnerabilityReport(owner, repo, privateVulnerabilityReportCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecurityAdvisoriesApi#securityAdvisoriesCreatePrivateVulnerabilityReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityAdvisoriesApi#securityAdvisoriesCreatePrivateVulnerabilityReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **privateVulnerabilityReportCreate** | [**PrivateVulnerabilityReportCreate**](PrivateVulnerabilityReportCreate.md)|  |

### Return type

[**RepositoryAdvisory**](RepositoryAdvisory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="securityAdvisoriesCreateRepositoryAdvisory"></a>
# **securityAdvisoriesCreateRepositoryAdvisory**
> RepositoryAdvisory securityAdvisoriesCreateRepositoryAdvisory(owner, repo, repositoryAdvisoryCreate)

Create a repository security advisory

Creates a new repository security advisory.  In order to create a draft repository security advisory, the authenticated user must be a security manager or administrator of that repository.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;repository_advisories:write&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecurityAdvisoriesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val repositoryAdvisoryCreate : RepositoryAdvisoryCreate = {"summary":"A new important advisory","description":"A more in-depth description of what the problem is.","severity":"high","cve_id":null,"vulnerabilities":[{"package":{"name":"a-package","ecosystem":"npm"},"vulnerable_version_range":"< 1.0.0","patched_versions":"1.0.0","vulnerable_functions":["important_function"]}],"cwe_ids":["CWE-1101","CWE-20"],"credits":[{"login":"monalisa","type":"reporter"},{"login":"octocat","type":"analyst"}]} // RepositoryAdvisoryCreate | 
try {
    val result : RepositoryAdvisory = apiInstance.securityAdvisoriesCreateRepositoryAdvisory(owner, repo, repositoryAdvisoryCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecurityAdvisoriesApi#securityAdvisoriesCreateRepositoryAdvisory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityAdvisoriesApi#securityAdvisoriesCreateRepositoryAdvisory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **repositoryAdvisoryCreate** | [**RepositoryAdvisoryCreate**](RepositoryAdvisoryCreate.md)|  |

### Return type

[**RepositoryAdvisory**](RepositoryAdvisory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="securityAdvisoriesCreateRepositoryAdvisoryCveRequest"></a>
# **securityAdvisoriesCreateRepositoryAdvisoryCveRequest**
> kotlin.Any securityAdvisoriesCreateRepositoryAdvisoryCveRequest(owner, repo, ghsaId)

Request a CVE for a repository security advisory

If you want a CVE identification number for the security vulnerability in your project, and don&#39;t already have one, you can request a CVE identification number from GitHub. For more information see \&quot;[Requesting a CVE identification number](https://docs.github.com/code-security/security-advisories/repository-security-advisories/publishing-a-repository-security-advisory#requesting-a-cve-identification-number-optional).\&quot;  You may request a CVE for public repositories, but cannot do so for private repositories.  In order to request a CVE for a repository security advisory, the authenticated user must be a security manager or administrator of that repository.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;repository_advisories:write&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecurityAdvisoriesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ghsaId : kotlin.String = ghsaId_example // kotlin.String | The GHSA (GitHub Security Advisory) identifier of the advisory.
try {
    val result : kotlin.Any = apiInstance.securityAdvisoriesCreateRepositoryAdvisoryCveRequest(owner, repo, ghsaId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecurityAdvisoriesApi#securityAdvisoriesCreateRepositoryAdvisoryCveRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityAdvisoriesApi#securityAdvisoriesCreateRepositoryAdvisoryCveRequest")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ghsaId** | **kotlin.String**| The GHSA (GitHub Security Advisory) identifier of the advisory. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="securityAdvisoriesGetGlobalAdvisory"></a>
# **securityAdvisoriesGetGlobalAdvisory**
> GlobalAdvisory securityAdvisoriesGetGlobalAdvisory(ghsaId)

Get a global security advisory

Gets a global security advisory using its GitHub Security Advisory (GHSA) identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecurityAdvisoriesApi()
val ghsaId : kotlin.String = ghsaId_example // kotlin.String | The GHSA (GitHub Security Advisory) identifier of the advisory.
try {
    val result : GlobalAdvisory = apiInstance.securityAdvisoriesGetGlobalAdvisory(ghsaId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecurityAdvisoriesApi#securityAdvisoriesGetGlobalAdvisory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityAdvisoriesApi#securityAdvisoriesGetGlobalAdvisory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ghsaId** | **kotlin.String**| The GHSA (GitHub Security Advisory) identifier of the advisory. |

### Return type

[**GlobalAdvisory**](GlobalAdvisory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="securityAdvisoriesGetRepositoryAdvisory"></a>
# **securityAdvisoriesGetRepositoryAdvisory**
> RepositoryAdvisory securityAdvisoriesGetRepositoryAdvisory(owner, repo, ghsaId)

Get a repository security advisory

Get a repository security advisory using its GitHub Security Advisory (GHSA) identifier.  Anyone can access any published security advisory on a public repository.  The authenticated user can access an unpublished security advisory from a repository if they are a security manager or administrator of that repository, or if they are a collaborator on the security advisory.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;repository_advisories:read&#x60; scope to to get a published security advisory in a private repository, or any unpublished security advisory that the authenticated user has access to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecurityAdvisoriesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ghsaId : kotlin.String = ghsaId_example // kotlin.String | The GHSA (GitHub Security Advisory) identifier of the advisory.
try {
    val result : RepositoryAdvisory = apiInstance.securityAdvisoriesGetRepositoryAdvisory(owner, repo, ghsaId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecurityAdvisoriesApi#securityAdvisoriesGetRepositoryAdvisory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityAdvisoriesApi#securityAdvisoriesGetRepositoryAdvisory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ghsaId** | **kotlin.String**| The GHSA (GitHub Security Advisory) identifier of the advisory. |

### Return type

[**RepositoryAdvisory**](RepositoryAdvisory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="securityAdvisoriesListGlobalAdvisories"></a>
# **securityAdvisoriesListGlobalAdvisories**
> kotlin.collections.List&lt;GlobalAdvisory&gt; securityAdvisoriesListGlobalAdvisories(ghsaId, type, cveId, ecosystem, severity, cwes, isWithdrawn, affects, published, updated, modified, before, after, direction, perPage, sort)

List global security advisories

Lists all global security advisories that match the specified parameters. If no other parameters are defined, the request will return only GitHub-reviewed advisories that are not malware.  By default, all responses will exclude advisories for malware, because malware are not standard vulnerabilities. To list advisories for malware, you must include the &#x60;type&#x60; parameter in your request, with the value &#x60;malware&#x60;. For more information about the different types of security advisories, see \&quot;[About the GitHub Advisory database](https://docs.github.com/code-security/security-advisories/global-security-advisories/about-the-github-advisory-database#about-types-of-security-advisories).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecurityAdvisoriesApi()
val ghsaId : kotlin.String = ghsaId_example // kotlin.String | If specified, only advisories with this GHSA (GitHub Security Advisory) identifier will be returned.
val type : kotlin.String = type_example // kotlin.String | If specified, only advisories of this type will be returned. By default, a request with no other parameters defined will only return reviewed advisories that are not malware.
val cveId : kotlin.String = cveId_example // kotlin.String | If specified, only advisories with this CVE (Common Vulnerabilities and Exposures) identifier will be returned.
val ecosystem : kotlin.String = ecosystem_example // kotlin.String | If specified, only advisories for these ecosystems will be returned.
val severity : kotlin.String = severity_example // kotlin.String | If specified, only advisories with these severities will be returned.
val cwes : SecurityAdvisoriesListGlobalAdvisoriesCwesParameter =  // SecurityAdvisoriesListGlobalAdvisoriesCwesParameter | If specified, only advisories with these Common Weakness Enumerations (CWEs) will be returned.  Example: `cwes=79,284,22` or `cwes[]=79&cwes[]=284&cwes[]=22`
val isWithdrawn : kotlin.Boolean = true // kotlin.Boolean | Whether to only return advisories that have been withdrawn.
val affects : SecurityAdvisoriesListGlobalAdvisoriesAffectsParameter =  // SecurityAdvisoriesListGlobalAdvisoriesAffectsParameter | If specified, only return advisories that affect any of `package` or `package@version`. A maximum of 1000 packages can be specified. If the query parameter causes the URL to exceed the maximum URL length supported by your client, you must specify fewer packages.  Example: `affects=package1,package2@1.0.0,package3@^2.0.0` or `affects[]=package1&affects[]=package2@1.0.0`
val published : kotlin.String = published_example // kotlin.String | If specified, only return advisories that were published on a date or date range.  For more information on the syntax of the date range, see \"[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\"
val updated : kotlin.String = updated_example // kotlin.String | If specified, only return advisories that were updated on a date or date range.  For more information on the syntax of the date range, see \"[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\"
val modified : kotlin.String = modified_example // kotlin.String | If specified, only show advisories that were updated or published on a date or date range.  For more information on the syntax of the date range, see \"[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\"
val before : kotlin.String = before_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val after : kotlin.String = after_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val sort : kotlin.String = sort_example // kotlin.String | The property to sort the results by.
try {
    val result : kotlin.collections.List<GlobalAdvisory> = apiInstance.securityAdvisoriesListGlobalAdvisories(ghsaId, type, cveId, ecosystem, severity, cwes, isWithdrawn, affects, published, updated, modified, before, after, direction, perPage, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecurityAdvisoriesApi#securityAdvisoriesListGlobalAdvisories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityAdvisoriesApi#securityAdvisoriesListGlobalAdvisories")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ghsaId** | **kotlin.String**| If specified, only advisories with this GHSA (GitHub Security Advisory) identifier will be returned. | [optional]
 **type** | **kotlin.String**| If specified, only advisories of this type will be returned. By default, a request with no other parameters defined will only return reviewed advisories that are not malware. | [optional] [default to reviewed] [enum: reviewed, malware, unreviewed]
 **cveId** | **kotlin.String**| If specified, only advisories with this CVE (Common Vulnerabilities and Exposures) identifier will be returned. | [optional] [default to &quot;push&quot;]
 **ecosystem** | **kotlin.String**| If specified, only advisories for these ecosystems will be returned. | [optional] [enum: actions, composer, erlang, go, maven, npm, nuget, other, pip, pub, rubygems, rust]
 **severity** | **kotlin.String**| If specified, only advisories with these severities will be returned. | [optional] [enum: unknown, low, medium, high, critical]
 **cwes** | [**SecurityAdvisoriesListGlobalAdvisoriesCwesParameter**](.md)| If specified, only advisories with these Common Weakness Enumerations (CWEs) will be returned.  Example: &#x60;cwes&#x3D;79,284,22&#x60; or &#x60;cwes[]&#x3D;79&amp;cwes[]&#x3D;284&amp;cwes[]&#x3D;22&#x60; | [optional]
 **isWithdrawn** | **kotlin.Boolean**| Whether to only return advisories that have been withdrawn. | [optional]
 **affects** | [**SecurityAdvisoriesListGlobalAdvisoriesAffectsParameter**](.md)| If specified, only return advisories that affect any of &#x60;package&#x60; or &#x60;package@version&#x60;. A maximum of 1000 packages can be specified. If the query parameter causes the URL to exceed the maximum URL length supported by your client, you must specify fewer packages.  Example: &#x60;affects&#x3D;package1,package2@1.0.0,package3@^2.0.0&#x60; or &#x60;affects[]&#x3D;package1&amp;affects[]&#x3D;package2@1.0.0&#x60; | [optional]
 **published** | **kotlin.String**| If specified, only return advisories that were published on a date or date range.  For more information on the syntax of the date range, see \&quot;[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\&quot; | [optional] [default to &quot;push&quot;]
 **updated** | **kotlin.String**| If specified, only return advisories that were updated on a date or date range.  For more information on the syntax of the date range, see \&quot;[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\&quot; | [optional] [default to &quot;push&quot;]
 **modified** | **kotlin.String**| If specified, only show advisories that were updated or published on a date or date range.  For more information on the syntax of the date range, see \&quot;[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\&quot; | [optional] [default to &quot;push&quot;]
 **before** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **after** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **sort** | **kotlin.String**| The property to sort the results by. | [optional] [default to published] [enum: updated, published]

### Return type

[**kotlin.collections.List&lt;GlobalAdvisory&gt;**](GlobalAdvisory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="securityAdvisoriesListOrgRepositoryAdvisories"></a>
# **securityAdvisoriesListOrgRepositoryAdvisories**
> kotlin.collections.List&lt;RepositoryAdvisory&gt; securityAdvisoriesListOrgRepositoryAdvisories(org, direction, sort, before, after, perPage, state)

List repository security advisories for an organization

Lists repository security advisories for an organization.  The authenticated user must be an owner or security manager for the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;repository_advisories:write&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecurityAdvisoriesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val sort : kotlin.String = sort_example // kotlin.String | The property to sort the results by.
val before : kotlin.String = before_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val after : kotlin.String = after_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of advisories to return per page. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val state : kotlin.String = state_example // kotlin.String | Filter by the state of the repository advisories. Only advisories of this state will be returned.
try {
    val result : kotlin.collections.List<RepositoryAdvisory> = apiInstance.securityAdvisoriesListOrgRepositoryAdvisories(org, direction, sort, before, after, perPage, state)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecurityAdvisoriesApi#securityAdvisoriesListOrgRepositoryAdvisories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityAdvisoriesApi#securityAdvisoriesListOrgRepositoryAdvisories")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **sort** | **kotlin.String**| The property to sort the results by. | [optional] [default to created] [enum: created, updated, published]
 **before** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **after** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **perPage** | **kotlin.Int**| The number of advisories to return per page. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **state** | **kotlin.String**| Filter by the state of the repository advisories. Only advisories of this state will be returned. | [optional] [enum: triage, draft, published, closed]

### Return type

[**kotlin.collections.List&lt;RepositoryAdvisory&gt;**](RepositoryAdvisory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="securityAdvisoriesListRepositoryAdvisories"></a>
# **securityAdvisoriesListRepositoryAdvisories**
> kotlin.collections.List&lt;RepositoryAdvisory&gt; securityAdvisoriesListRepositoryAdvisories(owner, repo, direction, sort, before, after, perPage, state)

List repository security advisories

Lists security advisories in a repository.  The authenticated user can access unpublished security advisories from a repository if they are a security manager or administrator of that repository, or if they are a collaborator on any security advisory.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;repository_advisories:read&#x60; scope to to get a published security advisory in a private repository, or any unpublished security advisory that the authenticated user has access to.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecurityAdvisoriesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val sort : kotlin.String = sort_example // kotlin.String | The property to sort the results by.
val before : kotlin.String = before_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val after : kotlin.String = after_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of advisories to return per page. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val state : kotlin.String = state_example // kotlin.String | Filter by state of the repository advisories. Only advisories of this state will be returned.
try {
    val result : kotlin.collections.List<RepositoryAdvisory> = apiInstance.securityAdvisoriesListRepositoryAdvisories(owner, repo, direction, sort, before, after, perPage, state)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecurityAdvisoriesApi#securityAdvisoriesListRepositoryAdvisories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityAdvisoriesApi#securityAdvisoriesListRepositoryAdvisories")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **sort** | **kotlin.String**| The property to sort the results by. | [optional] [default to created] [enum: created, updated, published]
 **before** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **after** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **perPage** | **kotlin.Int**| The number of advisories to return per page. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **state** | **kotlin.String**| Filter by state of the repository advisories. Only advisories of this state will be returned. | [optional] [enum: triage, draft, published, closed]

### Return type

[**kotlin.collections.List&lt;RepositoryAdvisory&gt;**](RepositoryAdvisory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="securityAdvisoriesUpdateRepositoryAdvisory"></a>
# **securityAdvisoriesUpdateRepositoryAdvisory**
> RepositoryAdvisory securityAdvisoriesUpdateRepositoryAdvisory(owner, repo, ghsaId, repositoryAdvisoryUpdate)

Update a repository security advisory

Update a repository security advisory using its GitHub Security Advisory (GHSA) identifier.  In order to update any security advisory, the authenticated user must be a security manager or administrator of that repository, or a collaborator on the repository security advisory.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;repository_advisories:write&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecurityAdvisoriesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ghsaId : kotlin.String = ghsaId_example // kotlin.String | The GHSA (GitHub Security Advisory) identifier of the advisory.
val repositoryAdvisoryUpdate : RepositoryAdvisoryUpdate = {"severity":"critical","state":"published"} // RepositoryAdvisoryUpdate | 
try {
    val result : RepositoryAdvisory = apiInstance.securityAdvisoriesUpdateRepositoryAdvisory(owner, repo, ghsaId, repositoryAdvisoryUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecurityAdvisoriesApi#securityAdvisoriesUpdateRepositoryAdvisory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityAdvisoriesApi#securityAdvisoriesUpdateRepositoryAdvisory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ghsaId** | **kotlin.String**| The GHSA (GitHub Security Advisory) identifier of the advisory. |
 **repositoryAdvisoryUpdate** | [**RepositoryAdvisoryUpdate**](RepositoryAdvisoryUpdate.md)|  |

### Return type

[**RepositoryAdvisory**](RepositoryAdvisory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

