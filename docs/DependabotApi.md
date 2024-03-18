# DependabotApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dependabotAddSelectedRepoToOrgSecret**](DependabotApi.md#dependabotAddSelectedRepoToOrgSecret) | **PUT** /orgs/{org}/dependabot/secrets/{secret_name}/repositories/{repository_id} | Add selected repository to an organization secret
[**dependabotCreateOrUpdateOrgSecret**](DependabotApi.md#dependabotCreateOrUpdateOrgSecret) | **PUT** /orgs/{org}/dependabot/secrets/{secret_name} | Create or update an organization secret
[**dependabotCreateOrUpdateRepoSecret**](DependabotApi.md#dependabotCreateOrUpdateRepoSecret) | **PUT** /repos/{owner}/{repo}/dependabot/secrets/{secret_name} | Create or update a repository secret
[**dependabotDeleteOrgSecret**](DependabotApi.md#dependabotDeleteOrgSecret) | **DELETE** /orgs/{org}/dependabot/secrets/{secret_name} | Delete an organization secret
[**dependabotDeleteRepoSecret**](DependabotApi.md#dependabotDeleteRepoSecret) | **DELETE** /repos/{owner}/{repo}/dependabot/secrets/{secret_name} | Delete a repository secret
[**dependabotGetAlert**](DependabotApi.md#dependabotGetAlert) | **GET** /repos/{owner}/{repo}/dependabot/alerts/{alert_number} | Get a Dependabot alert
[**dependabotGetOrgPublicKey**](DependabotApi.md#dependabotGetOrgPublicKey) | **GET** /orgs/{org}/dependabot/secrets/public-key | Get an organization public key
[**dependabotGetOrgSecret**](DependabotApi.md#dependabotGetOrgSecret) | **GET** /orgs/{org}/dependabot/secrets/{secret_name} | Get an organization secret
[**dependabotGetRepoPublicKey**](DependabotApi.md#dependabotGetRepoPublicKey) | **GET** /repos/{owner}/{repo}/dependabot/secrets/public-key | Get a repository public key
[**dependabotGetRepoSecret**](DependabotApi.md#dependabotGetRepoSecret) | **GET** /repos/{owner}/{repo}/dependabot/secrets/{secret_name} | Get a repository secret
[**dependabotListAlertsForEnterprise**](DependabotApi.md#dependabotListAlertsForEnterprise) | **GET** /enterprises/{enterprise}/dependabot/alerts | List Dependabot alerts for an enterprise
[**dependabotListAlertsForOrg**](DependabotApi.md#dependabotListAlertsForOrg) | **GET** /orgs/{org}/dependabot/alerts | List Dependabot alerts for an organization
[**dependabotListAlertsForRepo**](DependabotApi.md#dependabotListAlertsForRepo) | **GET** /repos/{owner}/{repo}/dependabot/alerts | List Dependabot alerts for a repository
[**dependabotListOrgSecrets**](DependabotApi.md#dependabotListOrgSecrets) | **GET** /orgs/{org}/dependabot/secrets | List organization secrets
[**dependabotListRepoSecrets**](DependabotApi.md#dependabotListRepoSecrets) | **GET** /repos/{owner}/{repo}/dependabot/secrets | List repository secrets
[**dependabotListSelectedReposForOrgSecret**](DependabotApi.md#dependabotListSelectedReposForOrgSecret) | **GET** /orgs/{org}/dependabot/secrets/{secret_name}/repositories | List selected repositories for an organization secret
[**dependabotRemoveSelectedRepoFromOrgSecret**](DependabotApi.md#dependabotRemoveSelectedRepoFromOrgSecret) | **DELETE** /orgs/{org}/dependabot/secrets/{secret_name}/repositories/{repository_id} | Remove selected repository from an organization secret
[**dependabotSetSelectedReposForOrgSecret**](DependabotApi.md#dependabotSetSelectedReposForOrgSecret) | **PUT** /orgs/{org}/dependabot/secrets/{secret_name}/repositories | Set selected repositories for an organization secret
[**dependabotUpdateAlert**](DependabotApi.md#dependabotUpdateAlert) | **PATCH** /repos/{owner}/{repo}/dependabot/alerts/{alert_number} | Update a Dependabot alert


<a id="dependabotAddSelectedRepoToOrgSecret"></a>
# **dependabotAddSelectedRepoToOrgSecret**
> dependabotAddSelectedRepoToOrgSecret(org, secretName, repositoryId)

Add selected repository to an organization secret

Adds a repository to an organization secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/dependabot/secrets#create-or-update-an-organization-secret).  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val repositoryId : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.dependabotAddSelectedRepoToOrgSecret(org, secretName, repositoryId)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotAddSelectedRepoToOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotAddSelectedRepoToOrgSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |
 **repositoryId** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="dependabotCreateOrUpdateOrgSecret"></a>
# **dependabotCreateOrUpdateOrgSecret**
> kotlin.Any dependabotCreateOrUpdateOrgSecret(org, secretName, dependabotCreateOrUpdateOrgSecretRequest)

Create or update an organization secret

Creates or updates an organization secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see \&quot;[Encrypting secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val dependabotCreateOrUpdateOrgSecretRequest : DependabotCreateOrUpdateOrgSecretRequest = {"encrypted_value":"c2VjcmV0","key_id":"012345678912345678","visibility":"selected","selected_repository_ids":["1296269","1296280"]} // DependabotCreateOrUpdateOrgSecretRequest | 
try {
    val result : kotlin.Any = apiInstance.dependabotCreateOrUpdateOrgSecret(org, secretName, dependabotCreateOrUpdateOrgSecretRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotCreateOrUpdateOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotCreateOrUpdateOrgSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |
 **dependabotCreateOrUpdateOrgSecretRequest** | [**DependabotCreateOrUpdateOrgSecretRequest**](DependabotCreateOrUpdateOrgSecretRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="dependabotCreateOrUpdateRepoSecret"></a>
# **dependabotCreateOrUpdateRepoSecret**
> kotlin.Any dependabotCreateOrUpdateRepoSecret(owner, repo, secretName, dependabotCreateOrUpdateRepoSecretRequest)

Create or update a repository secret

Creates or updates a repository secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see \&quot;[Encrypting secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val dependabotCreateOrUpdateRepoSecretRequest : DependabotCreateOrUpdateRepoSecretRequest = {encrypted_value=c2VjcmV0, key_id=012345678912345678} // DependabotCreateOrUpdateRepoSecretRequest | 
try {
    val result : kotlin.Any = apiInstance.dependabotCreateOrUpdateRepoSecret(owner, repo, secretName, dependabotCreateOrUpdateRepoSecretRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotCreateOrUpdateRepoSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotCreateOrUpdateRepoSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |
 **dependabotCreateOrUpdateRepoSecretRequest** | [**DependabotCreateOrUpdateRepoSecretRequest**](DependabotCreateOrUpdateRepoSecretRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="dependabotDeleteOrgSecret"></a>
# **dependabotDeleteOrgSecret**
> dependabotDeleteOrgSecret(org, secretName)

Delete an organization secret

Deletes a secret in an organization using the secret name.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
try {
    apiInstance.dependabotDeleteOrgSecret(org, secretName)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotDeleteOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotDeleteOrgSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="dependabotDeleteRepoSecret"></a>
# **dependabotDeleteRepoSecret**
> dependabotDeleteRepoSecret(owner, repo, secretName)

Delete a repository secret

Deletes a secret in a repository using the secret name.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
try {
    apiInstance.dependabotDeleteRepoSecret(owner, repo, secretName)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotDeleteRepoSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotDeleteRepoSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="dependabotGetAlert"></a>
# **dependabotGetAlert**
> DependabotAlert dependabotGetAlert(owner, repo, alertNumber)

Get a Dependabot alert

OAuth app tokens and personal access tokens (classic) need the &#x60;security_events&#x60; scope to use this endpoint. If this endpoint is only used with public repositories, the token can use the &#x60;public_repo&#x60; scope instead.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val alertNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies a Dependabot alert in its repository. You can find this at the end of the URL for a Dependabot alert within GitHub, or in `number` fields in the response from the `GET /repos/{owner}/{repo}/dependabot/alerts` operation.
try {
    val result : DependabotAlert = apiInstance.dependabotGetAlert(owner, repo, alertNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotGetAlert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotGetAlert")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **alertNumber** | **kotlin.Int**| The number that identifies a Dependabot alert in its repository. You can find this at the end of the URL for a Dependabot alert within GitHub, or in &#x60;number&#x60; fields in the response from the &#x60;GET /repos/{owner}/{repo}/dependabot/alerts&#x60; operation. |

### Return type

[**DependabotAlert**](DependabotAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="dependabotGetOrgPublicKey"></a>
# **dependabotGetOrgPublicKey**
> DependabotPublicKey dependabotGetOrgPublicKey(org)

Get an organization public key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : DependabotPublicKey = apiInstance.dependabotGetOrgPublicKey(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotGetOrgPublicKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotGetOrgPublicKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**DependabotPublicKey**](DependabotPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="dependabotGetOrgSecret"></a>
# **dependabotGetOrgSecret**
> OrganizationDependabotSecret dependabotGetOrgSecret(org, secretName)

Get an organization secret

Gets a single organization secret without revealing its encrypted value.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
try {
    val result : OrganizationDependabotSecret = apiInstance.dependabotGetOrgSecret(org, secretName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotGetOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotGetOrgSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |

### Return type

[**OrganizationDependabotSecret**](OrganizationDependabotSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="dependabotGetRepoPublicKey"></a>
# **dependabotGetRepoPublicKey**
> DependabotPublicKey dependabotGetRepoPublicKey(owner, repo)

Get a repository public key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint if the repository is private.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : DependabotPublicKey = apiInstance.dependabotGetRepoPublicKey(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotGetRepoPublicKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotGetRepoPublicKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**DependabotPublicKey**](DependabotPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="dependabotGetRepoSecret"></a>
# **dependabotGetRepoSecret**
> DependabotSecret dependabotGetRepoSecret(owner, repo, secretName)

Get a repository secret

Gets a single repository secret without revealing its encrypted value.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
try {
    val result : DependabotSecret = apiInstance.dependabotGetRepoSecret(owner, repo, secretName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotGetRepoSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotGetRepoSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |

### Return type

[**DependabotSecret**](DependabotSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="dependabotListAlertsForEnterprise"></a>
# **dependabotListAlertsForEnterprise**
> kotlin.collections.List&lt;DependabotAlertWithRepository&gt; dependabotListAlertsForEnterprise(enterprise, state, severity, ecosystem, `package`, scope, sort, direction, before, after, first, last, perPage)

List Dependabot alerts for an enterprise

Lists Dependabot alerts for repositories that are owned by the specified enterprise.  The authenticated user must be a member of the enterprise to use this endpoint.  Alerts are only returned for organizations in the enterprise for which you are an organization owner or a security manager. For more information about security managers, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;security_events&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val enterprise : kotlin.String = enterprise_example // kotlin.String | The slug version of the enterprise name. You can also substitute this value with the enterprise id.
val state : kotlin.String = state_example // kotlin.String | A comma-separated list of states. If specified, only alerts with these states will be returned.  Can be: `auto_dismissed`, `dismissed`, `fixed`, `open`
val severity : kotlin.String = severity_example // kotlin.String | A comma-separated list of severities. If specified, only alerts with these severities will be returned.  Can be: `low`, `medium`, `high`, `critical`
val ecosystem : kotlin.String = ecosystem_example // kotlin.String | A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.  Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `pub`, `rubygems`, `rust`
val `package` : kotlin.String = `package`_example // kotlin.String | A comma-separated list of package names. If specified, only alerts for these packages will be returned.
val scope : kotlin.String = scope_example // kotlin.String | The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned.
val sort : kotlin.String = sort_example // kotlin.String | The property by which to sort the results. `created` means when the alert was created. `updated` means when the alert's state last changed.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val before : kotlin.String = before_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val after : kotlin.String = after_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val first : kotlin.Int = 56 // kotlin.Int | **Deprecated**. The number of results per page (max 100), starting from the first matching result. This parameter must not be used in combination with `last`. Instead, use `per_page` in combination with `after` to fetch the first page of results.
val last : kotlin.Int = 56 // kotlin.Int | **Deprecated**. The number of results per page (max 100), starting from the last matching result. This parameter must not be used in combination with `first`. Instead, use `per_page` in combination with `before` to fetch the last page of results.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<DependabotAlertWithRepository> = apiInstance.dependabotListAlertsForEnterprise(enterprise, state, severity, ecosystem, `package`, scope, sort, direction, before, after, first, last, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotListAlertsForEnterprise")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotListAlertsForEnterprise")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enterprise** | **kotlin.String**| The slug version of the enterprise name. You can also substitute this value with the enterprise id. |
 **state** | **kotlin.String**| A comma-separated list of states. If specified, only alerts with these states will be returned.  Can be: &#x60;auto_dismissed&#x60;, &#x60;dismissed&#x60;, &#x60;fixed&#x60;, &#x60;open&#x60; | [optional]
 **severity** | **kotlin.String**| A comma-separated list of severities. If specified, only alerts with these severities will be returned.  Can be: &#x60;low&#x60;, &#x60;medium&#x60;, &#x60;high&#x60;, &#x60;critical&#x60; | [optional]
 **ecosystem** | **kotlin.String**| A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.  Can be: &#x60;composer&#x60;, &#x60;go&#x60;, &#x60;maven&#x60;, &#x60;npm&#x60;, &#x60;nuget&#x60;, &#x60;pip&#x60;, &#x60;pub&#x60;, &#x60;rubygems&#x60;, &#x60;rust&#x60; | [optional]
 **&#x60;package&#x60;** | **kotlin.String**| A comma-separated list of package names. If specified, only alerts for these packages will be returned. | [optional]
 **scope** | **kotlin.String**| The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned. | [optional] [enum: development, runtime]
 **sort** | **kotlin.String**| The property by which to sort the results. &#x60;created&#x60; means when the alert was created. &#x60;updated&#x60; means when the alert&#39;s state last changed. | [optional] [default to created] [enum: created, updated]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **before** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **after** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **first** | **kotlin.Int**| **Deprecated**. The number of results per page (max 100), starting from the first matching result. This parameter must not be used in combination with &#x60;last&#x60;. Instead, use &#x60;per_page&#x60; in combination with &#x60;after&#x60; to fetch the first page of results. | [optional] [default to 30]
 **last** | **kotlin.Int**| **Deprecated**. The number of results per page (max 100), starting from the last matching result. This parameter must not be used in combination with &#x60;first&#x60;. Instead, use &#x60;per_page&#x60; in combination with &#x60;before&#x60; to fetch the last page of results. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;DependabotAlertWithRepository&gt;**](DependabotAlertWithRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="dependabotListAlertsForOrg"></a>
# **dependabotListAlertsForOrg**
> kotlin.collections.List&lt;DependabotAlertWithRepository&gt; dependabotListAlertsForOrg(org, state, severity, ecosystem, `package`, scope, sort, direction, before, after, first, last, perPage)

List Dependabot alerts for an organization

Lists Dependabot alerts for an organization.  The authenticated user must be an owner or security manager for the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;security_events&#x60; scope to use this endpoint. If this endpoint is only used with public repositories, the token can use the &#x60;public_repo&#x60; scope instead.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val state : kotlin.String = state_example // kotlin.String | A comma-separated list of states. If specified, only alerts with these states will be returned.  Can be: `auto_dismissed`, `dismissed`, `fixed`, `open`
val severity : kotlin.String = severity_example // kotlin.String | A comma-separated list of severities. If specified, only alerts with these severities will be returned.  Can be: `low`, `medium`, `high`, `critical`
val ecosystem : kotlin.String = ecosystem_example // kotlin.String | A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.  Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `pub`, `rubygems`, `rust`
val `package` : kotlin.String = `package`_example // kotlin.String | A comma-separated list of package names. If specified, only alerts for these packages will be returned.
val scope : kotlin.String = scope_example // kotlin.String | The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned.
val sort : kotlin.String = sort_example // kotlin.String | The property by which to sort the results. `created` means when the alert was created. `updated` means when the alert's state last changed.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val before : kotlin.String = before_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val after : kotlin.String = after_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val first : kotlin.Int = 56 // kotlin.Int | **Deprecated**. The number of results per page (max 100), starting from the first matching result. This parameter must not be used in combination with `last`. Instead, use `per_page` in combination with `after` to fetch the first page of results.
val last : kotlin.Int = 56 // kotlin.Int | **Deprecated**. The number of results per page (max 100), starting from the last matching result. This parameter must not be used in combination with `first`. Instead, use `per_page` in combination with `before` to fetch the last page of results.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<DependabotAlertWithRepository> = apiInstance.dependabotListAlertsForOrg(org, state, severity, ecosystem, `package`, scope, sort, direction, before, after, first, last, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotListAlertsForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotListAlertsForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **state** | **kotlin.String**| A comma-separated list of states. If specified, only alerts with these states will be returned.  Can be: &#x60;auto_dismissed&#x60;, &#x60;dismissed&#x60;, &#x60;fixed&#x60;, &#x60;open&#x60; | [optional]
 **severity** | **kotlin.String**| A comma-separated list of severities. If specified, only alerts with these severities will be returned.  Can be: &#x60;low&#x60;, &#x60;medium&#x60;, &#x60;high&#x60;, &#x60;critical&#x60; | [optional]
 **ecosystem** | **kotlin.String**| A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.  Can be: &#x60;composer&#x60;, &#x60;go&#x60;, &#x60;maven&#x60;, &#x60;npm&#x60;, &#x60;nuget&#x60;, &#x60;pip&#x60;, &#x60;pub&#x60;, &#x60;rubygems&#x60;, &#x60;rust&#x60; | [optional]
 **&#x60;package&#x60;** | **kotlin.String**| A comma-separated list of package names. If specified, only alerts for these packages will be returned. | [optional]
 **scope** | **kotlin.String**| The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned. | [optional] [enum: development, runtime]
 **sort** | **kotlin.String**| The property by which to sort the results. &#x60;created&#x60; means when the alert was created. &#x60;updated&#x60; means when the alert&#39;s state last changed. | [optional] [default to created] [enum: created, updated]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **before** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **after** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **first** | **kotlin.Int**| **Deprecated**. The number of results per page (max 100), starting from the first matching result. This parameter must not be used in combination with &#x60;last&#x60;. Instead, use &#x60;per_page&#x60; in combination with &#x60;after&#x60; to fetch the first page of results. | [optional] [default to 30]
 **last** | **kotlin.Int**| **Deprecated**. The number of results per page (max 100), starting from the last matching result. This parameter must not be used in combination with &#x60;first&#x60;. Instead, use &#x60;per_page&#x60; in combination with &#x60;before&#x60; to fetch the last page of results. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;DependabotAlertWithRepository&gt;**](DependabotAlertWithRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="dependabotListAlertsForRepo"></a>
# **dependabotListAlertsForRepo**
> kotlin.collections.List&lt;DependabotAlert&gt; dependabotListAlertsForRepo(owner, repo, state, severity, ecosystem, `package`, manifest, scope, sort, direction, page, perPage, before, after, first, last)

List Dependabot alerts for a repository

OAuth app tokens and personal access tokens (classic) need the &#x60;security_events&#x60; scope to use this endpoint. If this endpoint is only used with public repositories, the token can use the &#x60;public_repo&#x60; scope instead.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val state : kotlin.String = state_example // kotlin.String | A comma-separated list of states. If specified, only alerts with these states will be returned.  Can be: `auto_dismissed`, `dismissed`, `fixed`, `open`
val severity : kotlin.String = severity_example // kotlin.String | A comma-separated list of severities. If specified, only alerts with these severities will be returned.  Can be: `low`, `medium`, `high`, `critical`
val ecosystem : kotlin.String = ecosystem_example // kotlin.String | A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.  Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `pub`, `rubygems`, `rust`
val `package` : kotlin.String = `package`_example // kotlin.String | A comma-separated list of package names. If specified, only alerts for these packages will be returned.
val manifest : kotlin.String = manifest_example // kotlin.String | A comma-separated list of full manifest paths. If specified, only alerts for these manifests will be returned.
val scope : kotlin.String = scope_example // kotlin.String | The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned.
val sort : kotlin.String = sort_example // kotlin.String | The property by which to sort the results. `created` means when the alert was created. `updated` means when the alert's state last changed.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val page : kotlin.Int = 56 // kotlin.Int | **Deprecated**. Page number of the results to fetch. Use cursor-based pagination with `before` or `after` instead.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val before : kotlin.String = before_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val after : kotlin.String = after_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val first : kotlin.Int = 56 // kotlin.Int | **Deprecated**. The number of results per page (max 100), starting from the first matching result. This parameter must not be used in combination with `last`. Instead, use `per_page` in combination with `after` to fetch the first page of results.
val last : kotlin.Int = 56 // kotlin.Int | **Deprecated**. The number of results per page (max 100), starting from the last matching result. This parameter must not be used in combination with `first`. Instead, use `per_page` in combination with `before` to fetch the last page of results.
try {
    val result : kotlin.collections.List<DependabotAlert> = apiInstance.dependabotListAlertsForRepo(owner, repo, state, severity, ecosystem, `package`, manifest, scope, sort, direction, page, perPage, before, after, first, last)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotListAlertsForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotListAlertsForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **state** | **kotlin.String**| A comma-separated list of states. If specified, only alerts with these states will be returned.  Can be: &#x60;auto_dismissed&#x60;, &#x60;dismissed&#x60;, &#x60;fixed&#x60;, &#x60;open&#x60; | [optional]
 **severity** | **kotlin.String**| A comma-separated list of severities. If specified, only alerts with these severities will be returned.  Can be: &#x60;low&#x60;, &#x60;medium&#x60;, &#x60;high&#x60;, &#x60;critical&#x60; | [optional]
 **ecosystem** | **kotlin.String**| A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.  Can be: &#x60;composer&#x60;, &#x60;go&#x60;, &#x60;maven&#x60;, &#x60;npm&#x60;, &#x60;nuget&#x60;, &#x60;pip&#x60;, &#x60;pub&#x60;, &#x60;rubygems&#x60;, &#x60;rust&#x60; | [optional]
 **&#x60;package&#x60;** | **kotlin.String**| A comma-separated list of package names. If specified, only alerts for these packages will be returned. | [optional]
 **manifest** | **kotlin.String**| A comma-separated list of full manifest paths. If specified, only alerts for these manifests will be returned. | [optional]
 **scope** | **kotlin.String**| The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned. | [optional] [enum: development, runtime]
 **sort** | **kotlin.String**| The property by which to sort the results. &#x60;created&#x60; means when the alert was created. &#x60;updated&#x60; means when the alert&#39;s state last changed. | [optional] [default to created] [enum: created, updated]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **page** | **kotlin.Int**| **Deprecated**. Page number of the results to fetch. Use cursor-based pagination with &#x60;before&#x60; or &#x60;after&#x60; instead. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **before** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **after** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **first** | **kotlin.Int**| **Deprecated**. The number of results per page (max 100), starting from the first matching result. This parameter must not be used in combination with &#x60;last&#x60;. Instead, use &#x60;per_page&#x60; in combination with &#x60;after&#x60; to fetch the first page of results. | [optional] [default to 30]
 **last** | **kotlin.Int**| **Deprecated**. The number of results per page (max 100), starting from the last matching result. This parameter must not be used in combination with &#x60;first&#x60;. Instead, use &#x60;per_page&#x60; in combination with &#x60;before&#x60; to fetch the last page of results. | [optional]

### Return type

[**kotlin.collections.List&lt;DependabotAlert&gt;**](DependabotAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="dependabotListOrgSecrets"></a>
# **dependabotListOrgSecrets**
> DependabotListOrgSecrets200Response dependabotListOrgSecrets(org, perPage, page)

List organization secrets

Lists all secrets available in an organization without revealing their encrypted values.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : DependabotListOrgSecrets200Response = apiInstance.dependabotListOrgSecrets(org, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotListOrgSecrets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotListOrgSecrets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**DependabotListOrgSecrets200Response**](DependabotListOrgSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="dependabotListRepoSecrets"></a>
# **dependabotListRepoSecrets**
> DependabotListRepoSecrets200Response dependabotListRepoSecrets(owner, repo, perPage, page)

List repository secrets

Lists all secrets available in a repository without revealing their encrypted values.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : DependabotListRepoSecrets200Response = apiInstance.dependabotListRepoSecrets(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotListRepoSecrets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotListRepoSecrets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**DependabotListRepoSecrets200Response**](DependabotListRepoSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="dependabotListSelectedReposForOrgSecret"></a>
# **dependabotListSelectedReposForOrgSecret**
> ActionsListSelectedReposForOrgSecret200Response dependabotListSelectedReposForOrgSecret(org, secretName, page, perPage)

List selected repositories for an organization secret

Lists all repositories that have been selected when the &#x60;visibility&#x60; for repository access to a secret is set to &#x60;selected&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListSelectedReposForOrgSecret200Response = apiInstance.dependabotListSelectedReposForOrgSecret(org, secretName, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotListSelectedReposForOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotListSelectedReposForOrgSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**ActionsListSelectedReposForOrgSecret200Response**](ActionsListSelectedReposForOrgSecret200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="dependabotRemoveSelectedRepoFromOrgSecret"></a>
# **dependabotRemoveSelectedRepoFromOrgSecret**
> dependabotRemoveSelectedRepoFromOrgSecret(org, secretName, repositoryId)

Remove selected repository from an organization secret

Removes a repository from an organization secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/dependabot/secrets#create-or-update-an-organization-secret).  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val repositoryId : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.dependabotRemoveSelectedRepoFromOrgSecret(org, secretName, repositoryId)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotRemoveSelectedRepoFromOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotRemoveSelectedRepoFromOrgSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |
 **repositoryId** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="dependabotSetSelectedReposForOrgSecret"></a>
# **dependabotSetSelectedReposForOrgSecret**
> dependabotSetSelectedReposForOrgSecret(org, secretName, dependabotSetSelectedReposForOrgSecretRequest)

Set selected repositories for an organization secret

Replaces all repositories for an organization secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/dependabot/secrets#create-or-update-an-organization-secret).  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val dependabotSetSelectedReposForOrgSecretRequest : DependabotSetSelectedReposForOrgSecretRequest = {selected_repository_ids=[64780797]} // DependabotSetSelectedReposForOrgSecretRequest | 
try {
    apiInstance.dependabotSetSelectedReposForOrgSecret(org, secretName, dependabotSetSelectedReposForOrgSecretRequest)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotSetSelectedReposForOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotSetSelectedReposForOrgSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |
 **dependabotSetSelectedReposForOrgSecretRequest** | [**DependabotSetSelectedReposForOrgSecretRequest**](DependabotSetSelectedReposForOrgSecretRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="dependabotUpdateAlert"></a>
# **dependabotUpdateAlert**
> DependabotAlert dependabotUpdateAlert(owner, repo, alertNumber, dependabotUpdateAlertRequest)

Update a Dependabot alert

The authenticated user must have access to security alerts for the repository to use this endpoint. For more information, see \&quot;[Granting access to security alerts](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-security-and-analysis-settings-for-your-repository#granting-access-to-security-alerts).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;security_events&#x60; scope to use this endpoint. If this endpoint is only used with public repositories, the token can use the &#x60;public_repo&#x60; scope instead.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DependabotApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val alertNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies a Dependabot alert in its repository. You can find this at the end of the URL for a Dependabot alert within GitHub, or in `number` fields in the response from the `GET /repos/{owner}/{repo}/dependabot/alerts` operation.
val dependabotUpdateAlertRequest : DependabotUpdateAlertRequest = {"state":"dismissed","dismissed_reason":"tolerable_risk","dismissed_comment":"This alert is accurate but we use a sanitizer."} // DependabotUpdateAlertRequest | 
try {
    val result : DependabotAlert = apiInstance.dependabotUpdateAlert(owner, repo, alertNumber, dependabotUpdateAlertRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DependabotApi#dependabotUpdateAlert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DependabotApi#dependabotUpdateAlert")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **alertNumber** | **kotlin.Int**| The number that identifies a Dependabot alert in its repository. You can find this at the end of the URL for a Dependabot alert within GitHub, or in &#x60;number&#x60; fields in the response from the &#x60;GET /repos/{owner}/{repo}/dependabot/alerts&#x60; operation. |
 **dependabotUpdateAlertRequest** | [**DependabotUpdateAlertRequest**](DependabotUpdateAlertRequest.md)|  |

### Return type

[**DependabotAlert**](DependabotAlert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/scim+json

