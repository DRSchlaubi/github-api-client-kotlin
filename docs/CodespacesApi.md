# CodespacesApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**codespacesAddRepositoryForSecretForAuthenticatedUser**](CodespacesApi.md#codespacesAddRepositoryForSecretForAuthenticatedUser) | **PUT** /user/codespaces/secrets/{secret_name}/repositories/{repository_id} | Add a selected repository to a user secret
[**codespacesAddSelectedRepoToOrgSecret**](CodespacesApi.md#codespacesAddSelectedRepoToOrgSecret) | **PUT** /orgs/{org}/codespaces/secrets/{secret_name}/repositories/{repository_id} | Add selected repository to an organization secret
[**codespacesCheckPermissionsForDevcontainer**](CodespacesApi.md#codespacesCheckPermissionsForDevcontainer) | **GET** /repos/{owner}/{repo}/codespaces/permissions_check | Check if permissions defined by a devcontainer have been accepted by the authenticated user
[**codespacesCodespaceMachinesForAuthenticatedUser**](CodespacesApi.md#codespacesCodespaceMachinesForAuthenticatedUser) | **GET** /user/codespaces/{codespace_name}/machines | List machine types for a codespace
[**codespacesCreateForAuthenticatedUser**](CodespacesApi.md#codespacesCreateForAuthenticatedUser) | **POST** /user/codespaces | Create a codespace for the authenticated user
[**codespacesCreateOrUpdateOrgSecret**](CodespacesApi.md#codespacesCreateOrUpdateOrgSecret) | **PUT** /orgs/{org}/codespaces/secrets/{secret_name} | Create or update an organization secret
[**codespacesCreateOrUpdateRepoSecret**](CodespacesApi.md#codespacesCreateOrUpdateRepoSecret) | **PUT** /repos/{owner}/{repo}/codespaces/secrets/{secret_name} | Create or update a repository secret
[**codespacesCreateOrUpdateSecretForAuthenticatedUser**](CodespacesApi.md#codespacesCreateOrUpdateSecretForAuthenticatedUser) | **PUT** /user/codespaces/secrets/{secret_name} | Create or update a secret for the authenticated user
[**codespacesCreateWithPrForAuthenticatedUser**](CodespacesApi.md#codespacesCreateWithPrForAuthenticatedUser) | **POST** /repos/{owner}/{repo}/pulls/{pull_number}/codespaces | Create a codespace from a pull request
[**codespacesCreateWithRepoForAuthenticatedUser**](CodespacesApi.md#codespacesCreateWithRepoForAuthenticatedUser) | **POST** /repos/{owner}/{repo}/codespaces | Create a codespace in a repository
[**codespacesDeleteCodespacesAccessUsers**](CodespacesApi.md#codespacesDeleteCodespacesAccessUsers) | **DELETE** /orgs/{org}/codespaces/access/selected_users | Remove users from Codespaces access for an organization
[**codespacesDeleteForAuthenticatedUser**](CodespacesApi.md#codespacesDeleteForAuthenticatedUser) | **DELETE** /user/codespaces/{codespace_name} | Delete a codespace for the authenticated user
[**codespacesDeleteFromOrganization**](CodespacesApi.md#codespacesDeleteFromOrganization) | **DELETE** /orgs/{org}/members/{username}/codespaces/{codespace_name} | Delete a codespace from the organization
[**codespacesDeleteOrgSecret**](CodespacesApi.md#codespacesDeleteOrgSecret) | **DELETE** /orgs/{org}/codespaces/secrets/{secret_name} | Delete an organization secret
[**codespacesDeleteRepoSecret**](CodespacesApi.md#codespacesDeleteRepoSecret) | **DELETE** /repos/{owner}/{repo}/codespaces/secrets/{secret_name} | Delete a repository secret
[**codespacesDeleteSecretForAuthenticatedUser**](CodespacesApi.md#codespacesDeleteSecretForAuthenticatedUser) | **DELETE** /user/codespaces/secrets/{secret_name} | Delete a secret for the authenticated user
[**codespacesExportForAuthenticatedUser**](CodespacesApi.md#codespacesExportForAuthenticatedUser) | **POST** /user/codespaces/{codespace_name}/exports | Export a codespace for the authenticated user
[**codespacesGetCodespacesForUserInOrg**](CodespacesApi.md#codespacesGetCodespacesForUserInOrg) | **GET** /orgs/{org}/members/{username}/codespaces | List codespaces for a user in organization
[**codespacesGetExportDetailsForAuthenticatedUser**](CodespacesApi.md#codespacesGetExportDetailsForAuthenticatedUser) | **GET** /user/codespaces/{codespace_name}/exports/{export_id} | Get details about a codespace export
[**codespacesGetForAuthenticatedUser**](CodespacesApi.md#codespacesGetForAuthenticatedUser) | **GET** /user/codespaces/{codespace_name} | Get a codespace for the authenticated user
[**codespacesGetOrgPublicKey**](CodespacesApi.md#codespacesGetOrgPublicKey) | **GET** /orgs/{org}/codespaces/secrets/public-key | Get an organization public key
[**codespacesGetOrgSecret**](CodespacesApi.md#codespacesGetOrgSecret) | **GET** /orgs/{org}/codespaces/secrets/{secret_name} | Get an organization secret
[**codespacesGetPublicKeyForAuthenticatedUser**](CodespacesApi.md#codespacesGetPublicKeyForAuthenticatedUser) | **GET** /user/codespaces/secrets/public-key | Get public key for the authenticated user
[**codespacesGetRepoPublicKey**](CodespacesApi.md#codespacesGetRepoPublicKey) | **GET** /repos/{owner}/{repo}/codespaces/secrets/public-key | Get a repository public key
[**codespacesGetRepoSecret**](CodespacesApi.md#codespacesGetRepoSecret) | **GET** /repos/{owner}/{repo}/codespaces/secrets/{secret_name} | Get a repository secret
[**codespacesGetSecretForAuthenticatedUser**](CodespacesApi.md#codespacesGetSecretForAuthenticatedUser) | **GET** /user/codespaces/secrets/{secret_name} | Get a secret for the authenticated user
[**codespacesListDevcontainersInRepositoryForAuthenticatedUser**](CodespacesApi.md#codespacesListDevcontainersInRepositoryForAuthenticatedUser) | **GET** /repos/{owner}/{repo}/codespaces/devcontainers | List devcontainer configurations in a repository for the authenticated user
[**codespacesListForAuthenticatedUser**](CodespacesApi.md#codespacesListForAuthenticatedUser) | **GET** /user/codespaces | List codespaces for the authenticated user
[**codespacesListInOrganization**](CodespacesApi.md#codespacesListInOrganization) | **GET** /orgs/{org}/codespaces | List codespaces for the organization
[**codespacesListInRepositoryForAuthenticatedUser**](CodespacesApi.md#codespacesListInRepositoryForAuthenticatedUser) | **GET** /repos/{owner}/{repo}/codespaces | List codespaces in a repository for the authenticated user
[**codespacesListOrgSecrets**](CodespacesApi.md#codespacesListOrgSecrets) | **GET** /orgs/{org}/codespaces/secrets | List organization secrets
[**codespacesListRepoSecrets**](CodespacesApi.md#codespacesListRepoSecrets) | **GET** /repos/{owner}/{repo}/codespaces/secrets | List repository secrets
[**codespacesListRepositoriesForSecretForAuthenticatedUser**](CodespacesApi.md#codespacesListRepositoriesForSecretForAuthenticatedUser) | **GET** /user/codespaces/secrets/{secret_name}/repositories | List selected repositories for a user secret
[**codespacesListSecretsForAuthenticatedUser**](CodespacesApi.md#codespacesListSecretsForAuthenticatedUser) | **GET** /user/codespaces/secrets | List secrets for the authenticated user
[**codespacesListSelectedReposForOrgSecret**](CodespacesApi.md#codespacesListSelectedReposForOrgSecret) | **GET** /orgs/{org}/codespaces/secrets/{secret_name}/repositories | List selected repositories for an organization secret
[**codespacesPreFlightWithRepoForAuthenticatedUser**](CodespacesApi.md#codespacesPreFlightWithRepoForAuthenticatedUser) | **GET** /repos/{owner}/{repo}/codespaces/new | Get default attributes for a codespace
[**codespacesPublishForAuthenticatedUser**](CodespacesApi.md#codespacesPublishForAuthenticatedUser) | **POST** /user/codespaces/{codespace_name}/publish | Create a repository from an unpublished codespace
[**codespacesRemoveRepositoryForSecretForAuthenticatedUser**](CodespacesApi.md#codespacesRemoveRepositoryForSecretForAuthenticatedUser) | **DELETE** /user/codespaces/secrets/{secret_name}/repositories/{repository_id} | Remove a selected repository from a user secret
[**codespacesRemoveSelectedRepoFromOrgSecret**](CodespacesApi.md#codespacesRemoveSelectedRepoFromOrgSecret) | **DELETE** /orgs/{org}/codespaces/secrets/{secret_name}/repositories/{repository_id} | Remove selected repository from an organization secret
[**codespacesRepoMachinesForAuthenticatedUser**](CodespacesApi.md#codespacesRepoMachinesForAuthenticatedUser) | **GET** /repos/{owner}/{repo}/codespaces/machines | List available machine types for a repository
[**codespacesSetCodespacesAccess**](CodespacesApi.md#codespacesSetCodespacesAccess) | **PUT** /orgs/{org}/codespaces/access | Manage access control for organization codespaces
[**codespacesSetCodespacesAccessUsers**](CodespacesApi.md#codespacesSetCodespacesAccessUsers) | **POST** /orgs/{org}/codespaces/access/selected_users | Add users to Codespaces access for an organization
[**codespacesSetRepositoriesForSecretForAuthenticatedUser**](CodespacesApi.md#codespacesSetRepositoriesForSecretForAuthenticatedUser) | **PUT** /user/codespaces/secrets/{secret_name}/repositories | Set selected repositories for a user secret
[**codespacesSetSelectedReposForOrgSecret**](CodespacesApi.md#codespacesSetSelectedReposForOrgSecret) | **PUT** /orgs/{org}/codespaces/secrets/{secret_name}/repositories | Set selected repositories for an organization secret
[**codespacesStartForAuthenticatedUser**](CodespacesApi.md#codespacesStartForAuthenticatedUser) | **POST** /user/codespaces/{codespace_name}/start | Start a codespace for the authenticated user
[**codespacesStopForAuthenticatedUser**](CodespacesApi.md#codespacesStopForAuthenticatedUser) | **POST** /user/codespaces/{codespace_name}/stop | Stop a codespace for the authenticated user
[**codespacesStopInOrganization**](CodespacesApi.md#codespacesStopInOrganization) | **POST** /orgs/{org}/members/{username}/codespaces/{codespace_name}/stop | Stop a codespace for an organization user
[**codespacesUpdateForAuthenticatedUser**](CodespacesApi.md#codespacesUpdateForAuthenticatedUser) | **PATCH** /user/codespaces/{codespace_name} | Update a codespace for the authenticated user


<a id="codespacesAddRepositoryForSecretForAuthenticatedUser"></a>
# **codespacesAddRepositoryForSecretForAuthenticatedUser**
> codespacesAddRepositoryForSecretForAuthenticatedUser(secretName, repositoryId)

Add a selected repository to a user secret

Adds a repository to the selected repositories for a user&#39;s development environment secret.  The authenticated user must have Codespaces access to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val repositoryId : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.codespacesAddRepositoryForSecretForAuthenticatedUser(secretName, repositoryId)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesAddRepositoryForSecretForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesAddRepositoryForSecretForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretName** | **kotlin.String**| The name of the secret. |
 **repositoryId** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesAddSelectedRepoToOrgSecret"></a>
# **codespacesAddSelectedRepoToOrgSecret**
> codespacesAddSelectedRepoToOrgSecret(org, secretName, repositoryId)

Add selected repository to an organization secret

Adds a repository to an organization development environment secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/codespaces/organization-secrets#create-or-update-an-organization-secret). OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val repositoryId : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.codespacesAddSelectedRepoToOrgSecret(org, secretName, repositoryId)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesAddSelectedRepoToOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesAddSelectedRepoToOrgSecret")
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
 - **Accept**: application/json

<a id="codespacesCheckPermissionsForDevcontainer"></a>
# **codespacesCheckPermissionsForDevcontainer**
> CodespacesPermissionsCheckForDevcontainer codespacesCheckPermissionsForDevcontainer(owner, repo, ref, devcontainerPath)

Check if permissions defined by a devcontainer have been accepted by the authenticated user

Checks whether the permissions defined by a given devcontainer configuration have been accepted by the authenticated user.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ref : kotlin.String = ref_example // kotlin.String | The git reference that points to the location of the devcontainer configuration to use for the permission check. The value of `ref` will typically be a branch name (`heads/BRANCH_NAME`). For more information, see \"[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\" in the Git documentation.
val devcontainerPath : kotlin.String = devcontainerPath_example // kotlin.String | Path to the devcontainer.json configuration to use for the permission check.
try {
    val result : CodespacesPermissionsCheckForDevcontainer = apiInstance.codespacesCheckPermissionsForDevcontainer(owner, repo, ref, devcontainerPath)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesCheckPermissionsForDevcontainer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesCheckPermissionsForDevcontainer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ref** | **kotlin.String**| The git reference that points to the location of the devcontainer configuration to use for the permission check. The value of &#x60;ref&#x60; will typically be a branch name (&#x60;heads/BRANCH_NAME&#x60;). For more information, see \&quot;[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\&quot; in the Git documentation. |
 **devcontainerPath** | **kotlin.String**| Path to the devcontainer.json configuration to use for the permission check. |

### Return type

[**CodespacesPermissionsCheckForDevcontainer**](CodespacesPermissionsCheckForDevcontainer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesCodespaceMachinesForAuthenticatedUser"></a>
# **codespacesCodespaceMachinesForAuthenticatedUser**
> CodespacesRepoMachinesForAuthenticatedUser200Response codespacesCodespaceMachinesForAuthenticatedUser(codespaceName)

List machine types for a codespace

List the machine types a codespace can transition to use.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val codespaceName : kotlin.String = codespaceName_example // kotlin.String | The name of the codespace.
try {
    val result : CodespacesRepoMachinesForAuthenticatedUser200Response = apiInstance.codespacesCodespaceMachinesForAuthenticatedUser(codespaceName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesCodespaceMachinesForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesCodespaceMachinesForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codespaceName** | **kotlin.String**| The name of the codespace. |

### Return type

[**CodespacesRepoMachinesForAuthenticatedUser200Response**](CodespacesRepoMachinesForAuthenticatedUser200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesCreateForAuthenticatedUser"></a>
# **codespacesCreateForAuthenticatedUser**
> Codespace codespacesCreateForAuthenticatedUser(codespacesCreateForAuthenticatedUserRequest)

Create a codespace for the authenticated user

Creates a new codespace, owned by the authenticated user.  This endpoint requires either a &#x60;repository_id&#x60; OR a &#x60;pull_request&#x60; but not both.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val codespacesCreateForAuthenticatedUserRequest : CodespacesCreateForAuthenticatedUserRequest = {"repository_id":1,"ref":"main","geo":"UsWest"} // CodespacesCreateForAuthenticatedUserRequest | 
try {
    val result : Codespace = apiInstance.codespacesCreateForAuthenticatedUser(codespacesCreateForAuthenticatedUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesCreateForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesCreateForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codespacesCreateForAuthenticatedUserRequest** | [**CodespacesCreateForAuthenticatedUserRequest**](CodespacesCreateForAuthenticatedUserRequest.md)|  |

### Return type

[**Codespace**](Codespace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="codespacesCreateOrUpdateOrgSecret"></a>
# **codespacesCreateOrUpdateOrgSecret**
> kotlin.Any codespacesCreateOrUpdateOrgSecret(org, secretName, codespacesCreateOrUpdateOrgSecretRequest)

Create or update an organization secret

Creates or updates an organization development environment secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see \&quot;[Encrypting secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val codespacesCreateOrUpdateOrgSecretRequest : CodespacesCreateOrUpdateOrgSecretRequest = {encrypted_value=c2VjcmV0, key_id=012345678912345678, visibility=selected, selected_repository_ids=[1296269, 1296280]} // CodespacesCreateOrUpdateOrgSecretRequest | 
try {
    val result : kotlin.Any = apiInstance.codespacesCreateOrUpdateOrgSecret(org, secretName, codespacesCreateOrUpdateOrgSecretRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesCreateOrUpdateOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesCreateOrUpdateOrgSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |
 **codespacesCreateOrUpdateOrgSecretRequest** | [**CodespacesCreateOrUpdateOrgSecretRequest**](CodespacesCreateOrUpdateOrgSecretRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="codespacesCreateOrUpdateRepoSecret"></a>
# **codespacesCreateOrUpdateRepoSecret**
> kotlin.Any codespacesCreateOrUpdateRepoSecret(owner, repo, secretName, codespacesCreateOrUpdateRepoSecretRequest)

Create or update a repository secret

Creates or updates a repository development environment secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see \&quot;[Encrypting secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val codespacesCreateOrUpdateRepoSecretRequest : CodespacesCreateOrUpdateRepoSecretRequest = {encrypted_value=c2VjcmV0, key_id=012345678912345678} // CodespacesCreateOrUpdateRepoSecretRequest | 
try {
    val result : kotlin.Any = apiInstance.codespacesCreateOrUpdateRepoSecret(owner, repo, secretName, codespacesCreateOrUpdateRepoSecretRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesCreateOrUpdateRepoSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesCreateOrUpdateRepoSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |
 **codespacesCreateOrUpdateRepoSecretRequest** | [**CodespacesCreateOrUpdateRepoSecretRequest**](CodespacesCreateOrUpdateRepoSecretRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="codespacesCreateOrUpdateSecretForAuthenticatedUser"></a>
# **codespacesCreateOrUpdateSecretForAuthenticatedUser**
> kotlin.Any codespacesCreateOrUpdateSecretForAuthenticatedUser(secretName, codespacesCreateOrUpdateSecretForAuthenticatedUserRequest)

Create or update a secret for the authenticated user

Creates or updates a development environment secret for a user&#39;s codespace with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see \&quot;[Encrypting secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api).\&quot;  The authenticated user must have Codespaces access to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val codespacesCreateOrUpdateSecretForAuthenticatedUserRequest : CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest = {"encrypted_value":"c2VjcmV0","key_id":"012345678912345678","selected_repository_ids":["1234567","2345678"]} // CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest | 
try {
    val result : kotlin.Any = apiInstance.codespacesCreateOrUpdateSecretForAuthenticatedUser(secretName, codespacesCreateOrUpdateSecretForAuthenticatedUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesCreateOrUpdateSecretForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesCreateOrUpdateSecretForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretName** | **kotlin.String**| The name of the secret. |
 **codespacesCreateOrUpdateSecretForAuthenticatedUserRequest** | [**CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest**](CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="codespacesCreateWithPrForAuthenticatedUser"></a>
# **codespacesCreateWithPrForAuthenticatedUser**
> Codespace codespacesCreateWithPrForAuthenticatedUser(owner, repo, pullNumber, codespacesCreateWithPrForAuthenticatedUserRequest)

Create a codespace from a pull request

Creates a codespace owned by the authenticated user for the specified pull request.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pullNumber : kotlin.Int = 56 // kotlin.Int | The number that identifies the pull request.
val codespacesCreateWithPrForAuthenticatedUserRequest : CodespacesCreateWithPrForAuthenticatedUserRequest = {"repository_id":1,"ref":"main"} // CodespacesCreateWithPrForAuthenticatedUserRequest | 
try {
    val result : Codespace = apiInstance.codespacesCreateWithPrForAuthenticatedUser(owner, repo, pullNumber, codespacesCreateWithPrForAuthenticatedUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesCreateWithPrForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesCreateWithPrForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pullNumber** | **kotlin.Int**| The number that identifies the pull request. |
 **codespacesCreateWithPrForAuthenticatedUserRequest** | [**CodespacesCreateWithPrForAuthenticatedUserRequest**](CodespacesCreateWithPrForAuthenticatedUserRequest.md)|  |

### Return type

[**Codespace**](Codespace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="codespacesCreateWithRepoForAuthenticatedUser"></a>
# **codespacesCreateWithRepoForAuthenticatedUser**
> Codespace codespacesCreateWithRepoForAuthenticatedUser(owner, repo, codespacesCreateWithRepoForAuthenticatedUserRequest)

Create a codespace in a repository

Creates a codespace owned by the authenticated user in the specified repository.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val codespacesCreateWithRepoForAuthenticatedUserRequest : CodespacesCreateWithRepoForAuthenticatedUserRequest = {"ref":"main","machine":"standardLinux32gb"} // CodespacesCreateWithRepoForAuthenticatedUserRequest | 
try {
    val result : Codespace = apiInstance.codespacesCreateWithRepoForAuthenticatedUser(owner, repo, codespacesCreateWithRepoForAuthenticatedUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesCreateWithRepoForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesCreateWithRepoForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **codespacesCreateWithRepoForAuthenticatedUserRequest** | [**CodespacesCreateWithRepoForAuthenticatedUserRequest**](CodespacesCreateWithRepoForAuthenticatedUserRequest.md)|  |

### Return type

[**Codespace**](Codespace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/scim+json

<a id="codespacesDeleteCodespacesAccessUsers"></a>
# **codespacesDeleteCodespacesAccessUsers**
> codespacesDeleteCodespacesAccessUsers(org, codespacesDeleteCodespacesAccessUsersRequest)

Remove users from Codespaces access for an organization

Codespaces for the specified users will no longer be billed to the organization.  To use this endpoint, the access settings for the organization must be set to &#x60;selected_members&#x60;. For information on how to change this setting, see \&quot;[Manage access control for organization codespaces](https://docs.github.com/rest/codespaces/organizations#manage-access-control-for-organization-codespaces).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val codespacesDeleteCodespacesAccessUsersRequest : CodespacesDeleteCodespacesAccessUsersRequest = {"selected_usernames":["johnDoe","atomIO"]} // CodespacesDeleteCodespacesAccessUsersRequest | 
try {
    apiInstance.codespacesDeleteCodespacesAccessUsers(org, codespacesDeleteCodespacesAccessUsersRequest)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesDeleteCodespacesAccessUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesDeleteCodespacesAccessUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **codespacesDeleteCodespacesAccessUsersRequest** | [**CodespacesDeleteCodespacesAccessUsersRequest**](CodespacesDeleteCodespacesAccessUsersRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="codespacesDeleteForAuthenticatedUser"></a>
# **codespacesDeleteForAuthenticatedUser**
> kotlin.Any codespacesDeleteForAuthenticatedUser(codespaceName)

Delete a codespace for the authenticated user

Deletes a user&#39;s codespace.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val codespaceName : kotlin.String = codespaceName_example // kotlin.String | The name of the codespace.
try {
    val result : kotlin.Any = apiInstance.codespacesDeleteForAuthenticatedUser(codespaceName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesDeleteForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesDeleteForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codespaceName** | **kotlin.String**| The name of the codespace. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesDeleteFromOrganization"></a>
# **codespacesDeleteFromOrganization**
> kotlin.Any codespacesDeleteFromOrganization(org, username, codespaceName)

Delete a codespace from the organization

Deletes a user&#39;s codespace.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val codespaceName : kotlin.String = codespaceName_example // kotlin.String | The name of the codespace.
try {
    val result : kotlin.Any = apiInstance.codespacesDeleteFromOrganization(org, username, codespaceName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesDeleteFromOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesDeleteFromOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **codespaceName** | **kotlin.String**| The name of the codespace. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesDeleteOrgSecret"></a>
# **codespacesDeleteOrgSecret**
> codespacesDeleteOrgSecret(org, secretName)

Delete an organization secret

Deletes an organization development environment secret using the secret name.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
try {
    apiInstance.codespacesDeleteOrgSecret(org, secretName)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesDeleteOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesDeleteOrgSecret")
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
 - **Accept**: application/json

<a id="codespacesDeleteRepoSecret"></a>
# **codespacesDeleteRepoSecret**
> codespacesDeleteRepoSecret(owner, repo, secretName)

Delete a repository secret

Deletes a development environment secret in a repository using the secret name.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
try {
    apiInstance.codespacesDeleteRepoSecret(owner, repo, secretName)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesDeleteRepoSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesDeleteRepoSecret")
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

<a id="codespacesDeleteSecretForAuthenticatedUser"></a>
# **codespacesDeleteSecretForAuthenticatedUser**
> codespacesDeleteSecretForAuthenticatedUser(secretName)

Delete a secret for the authenticated user

Deletes a development environment secret from a user&#39;s codespaces using the secret name. Deleting the secret will remove access from all codespaces that were allowed to access the secret.  The authenticated user must have Codespaces access to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
try {
    apiInstance.codespacesDeleteSecretForAuthenticatedUser(secretName)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesDeleteSecretForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesDeleteSecretForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretName** | **kotlin.String**| The name of the secret. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="codespacesExportForAuthenticatedUser"></a>
# **codespacesExportForAuthenticatedUser**
> CodespaceExportDetails codespacesExportForAuthenticatedUser(codespaceName)

Export a codespace for the authenticated user

Triggers an export of the specified codespace and returns a URL and ID where the status of the export can be monitored.  If changes cannot be pushed to the codespace&#39;s repository, they will be pushed to a new or previously-existing fork instead.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val codespaceName : kotlin.String = codespaceName_example // kotlin.String | The name of the codespace.
try {
    val result : CodespaceExportDetails = apiInstance.codespacesExportForAuthenticatedUser(codespaceName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesExportForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesExportForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codespaceName** | **kotlin.String**| The name of the codespace. |

### Return type

[**CodespaceExportDetails**](CodespaceExportDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesGetCodespacesForUserInOrg"></a>
# **codespacesGetCodespacesForUserInOrg**
> CodespacesListInOrganization200Response codespacesGetCodespacesForUserInOrg(org, username, perPage, page)

List codespaces for a user in organization

Lists the codespaces that a member of an organization has for repositories in that organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : CodespacesListInOrganization200Response = apiInstance.codespacesGetCodespacesForUserInOrg(org, username, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesGetCodespacesForUserInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesGetCodespacesForUserInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**CodespacesListInOrganization200Response**](CodespacesListInOrganization200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesGetExportDetailsForAuthenticatedUser"></a>
# **codespacesGetExportDetailsForAuthenticatedUser**
> CodespaceExportDetails codespacesGetExportDetailsForAuthenticatedUser(codespaceName, exportId)

Get details about a codespace export

Gets information about an export of a codespace.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val codespaceName : kotlin.String = codespaceName_example // kotlin.String | The name of the codespace.
val exportId : kotlin.String = exportId_example // kotlin.String | The ID of the export operation, or `latest`. Currently only `latest` is currently supported.
try {
    val result : CodespaceExportDetails = apiInstance.codespacesGetExportDetailsForAuthenticatedUser(codespaceName, exportId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesGetExportDetailsForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesGetExportDetailsForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codespaceName** | **kotlin.String**| The name of the codespace. |
 **exportId** | **kotlin.String**| The ID of the export operation, or &#x60;latest&#x60;. Currently only &#x60;latest&#x60; is currently supported. |

### Return type

[**CodespaceExportDetails**](CodespaceExportDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesGetForAuthenticatedUser"></a>
# **codespacesGetForAuthenticatedUser**
> Codespace codespacesGetForAuthenticatedUser(codespaceName)

Get a codespace for the authenticated user

Gets information about a user&#39;s codespace.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val codespaceName : kotlin.String = codespaceName_example // kotlin.String | The name of the codespace.
try {
    val result : Codespace = apiInstance.codespacesGetForAuthenticatedUser(codespaceName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesGetForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesGetForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codespaceName** | **kotlin.String**| The name of the codespace. |

### Return type

[**Codespace**](Codespace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesGetOrgPublicKey"></a>
# **codespacesGetOrgPublicKey**
> CodespacesPublicKey codespacesGetOrgPublicKey(org)

Get an organization public key

Gets a public key for an organization, which is required in order to encrypt secrets. You need to encrypt the value of a secret before you can create or update secrets. OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : CodespacesPublicKey = apiInstance.codespacesGetOrgPublicKey(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesGetOrgPublicKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesGetOrgPublicKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**CodespacesPublicKey**](CodespacesPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesGetOrgSecret"></a>
# **codespacesGetOrgSecret**
> CodespacesOrgSecret codespacesGetOrgSecret(org, secretName)

Get an organization secret

Gets an organization development environment secret without revealing its encrypted value.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
try {
    val result : CodespacesOrgSecret = apiInstance.codespacesGetOrgSecret(org, secretName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesGetOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesGetOrgSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |

### Return type

[**CodespacesOrgSecret**](CodespacesOrgSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesGetPublicKeyForAuthenticatedUser"></a>
# **codespacesGetPublicKeyForAuthenticatedUser**
> CodespacesUserPublicKey codespacesGetPublicKeyForAuthenticatedUser()

Get public key for the authenticated user

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets.  The authenticated user must have Codespaces access to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
try {
    val result : CodespacesUserPublicKey = apiInstance.codespacesGetPublicKeyForAuthenticatedUser()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesGetPublicKeyForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesGetPublicKeyForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CodespacesUserPublicKey**](CodespacesUserPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesGetRepoPublicKey"></a>
# **codespacesGetRepoPublicKey**
> CodespacesPublicKey codespacesGetRepoPublicKey(owner, repo)

Get a repository public key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets.  Anyone with read access to the repository can use this endpoint.  If the repository is private, OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : CodespacesPublicKey = apiInstance.codespacesGetRepoPublicKey(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesGetRepoPublicKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesGetRepoPublicKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**CodespacesPublicKey**](CodespacesPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesGetRepoSecret"></a>
# **codespacesGetRepoSecret**
> RepoCodespacesSecret codespacesGetRepoSecret(owner, repo, secretName)

Get a repository secret

Gets a single repository development environment secret without revealing its encrypted value.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
try {
    val result : RepoCodespacesSecret = apiInstance.codespacesGetRepoSecret(owner, repo, secretName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesGetRepoSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesGetRepoSecret")
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

[**RepoCodespacesSecret**](RepoCodespacesSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesGetSecretForAuthenticatedUser"></a>
# **codespacesGetSecretForAuthenticatedUser**
> CodespacesSecret codespacesGetSecretForAuthenticatedUser(secretName)

Get a secret for the authenticated user

Gets a development environment secret available to a user&#39;s codespaces without revealing its encrypted value.  The authenticated user must have Codespaces access to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
try {
    val result : CodespacesSecret = apiInstance.codespacesGetSecretForAuthenticatedUser(secretName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesGetSecretForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesGetSecretForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretName** | **kotlin.String**| The name of the secret. |

### Return type

[**CodespacesSecret**](CodespacesSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesListDevcontainersInRepositoryForAuthenticatedUser"></a>
# **codespacesListDevcontainersInRepositoryForAuthenticatedUser**
> CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response codespacesListDevcontainersInRepositoryForAuthenticatedUser(owner, repo, perPage, page)

List devcontainer configurations in a repository for the authenticated user

Lists the devcontainer.json files associated with a specified repository and the authenticated user. These files specify launchpoint configurations for codespaces created within the repository.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response = apiInstance.codespacesListDevcontainersInRepositoryForAuthenticatedUser(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesListDevcontainersInRepositoryForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesListDevcontainersInRepositoryForAuthenticatedUser")
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

[**CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response**](CodespacesListDevcontainersInRepositoryForAuthenticatedUser200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="codespacesListForAuthenticatedUser"></a>
# **codespacesListForAuthenticatedUser**
> CodespacesListInOrganization200Response codespacesListForAuthenticatedUser(perPage, page, repositoryId)

List codespaces for the authenticated user

Lists the authenticated user&#39;s codespaces.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val repositoryId : kotlin.Int = 56 // kotlin.Int | ID of the Repository to filter on
try {
    val result : CodespacesListInOrganization200Response = apiInstance.codespacesListForAuthenticatedUser(perPage, page, repositoryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesListForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesListForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **repositoryId** | **kotlin.Int**| ID of the Repository to filter on | [optional]

### Return type

[**CodespacesListInOrganization200Response**](CodespacesListInOrganization200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesListInOrganization"></a>
# **codespacesListInOrganization**
> CodespacesListInOrganization200Response codespacesListInOrganization(org, perPage, page)

List codespaces for the organization

Lists the codespaces associated to a specified organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : CodespacesListInOrganization200Response = apiInstance.codespacesListInOrganization(org, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesListInOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesListInOrganization")
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

[**CodespacesListInOrganization200Response**](CodespacesListInOrganization200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesListInRepositoryForAuthenticatedUser"></a>
# **codespacesListInRepositoryForAuthenticatedUser**
> CodespacesListInOrganization200Response codespacesListInRepositoryForAuthenticatedUser(owner, repo, perPage, page)

List codespaces in a repository for the authenticated user

Lists the codespaces associated to a specified repository and the authenticated user.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : CodespacesListInOrganization200Response = apiInstance.codespacesListInRepositoryForAuthenticatedUser(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesListInRepositoryForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesListInRepositoryForAuthenticatedUser")
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

[**CodespacesListInOrganization200Response**](CodespacesListInOrganization200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesListOrgSecrets"></a>
# **codespacesListOrgSecrets**
> CodespacesListOrgSecrets200Response codespacesListOrgSecrets(org, perPage, page)

List organization secrets

Lists all Codespaces development environment secrets available at the organization-level without revealing their encrypted values.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : CodespacesListOrgSecrets200Response = apiInstance.codespacesListOrgSecrets(org, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesListOrgSecrets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesListOrgSecrets")
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

[**CodespacesListOrgSecrets200Response**](CodespacesListOrgSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesListRepoSecrets"></a>
# **codespacesListRepoSecrets**
> CodespacesListRepoSecrets200Response codespacesListRepoSecrets(owner, repo, perPage, page)

List repository secrets

Lists all development environment secrets available in a repository without revealing their encrypted values.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : CodespacesListRepoSecrets200Response = apiInstance.codespacesListRepoSecrets(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesListRepoSecrets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesListRepoSecrets")
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

[**CodespacesListRepoSecrets200Response**](CodespacesListRepoSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesListRepositoriesForSecretForAuthenticatedUser"></a>
# **codespacesListRepositoriesForSecretForAuthenticatedUser**
> ActionsListSelectedReposForOrgSecret200Response codespacesListRepositoriesForSecretForAuthenticatedUser(secretName)

List selected repositories for a user secret

List the repositories that have been granted the ability to use a user&#39;s development environment secret.  The authenticated user must have Codespaces access to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
try {
    val result : ActionsListSelectedReposForOrgSecret200Response = apiInstance.codespacesListRepositoriesForSecretForAuthenticatedUser(secretName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesListRepositoriesForSecretForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesListRepositoriesForSecretForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretName** | **kotlin.String**| The name of the secret. |

### Return type

[**ActionsListSelectedReposForOrgSecret200Response**](ActionsListSelectedReposForOrgSecret200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesListSecretsForAuthenticatedUser"></a>
# **codespacesListSecretsForAuthenticatedUser**
> CodespacesListSecretsForAuthenticatedUser200Response codespacesListSecretsForAuthenticatedUser(perPage, page)

List secrets for the authenticated user

Lists all development environment secrets available for a user&#39;s codespaces without revealing their encrypted values.  The authenticated user must have Codespaces access to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : CodespacesListSecretsForAuthenticatedUser200Response = apiInstance.codespacesListSecretsForAuthenticatedUser(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesListSecretsForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesListSecretsForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**CodespacesListSecretsForAuthenticatedUser200Response**](CodespacesListSecretsForAuthenticatedUser200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesListSelectedReposForOrgSecret"></a>
# **codespacesListSelectedReposForOrgSecret**
> ActionsListSelectedReposForOrgSecret200Response codespacesListSelectedReposForOrgSecret(org, secretName, page, perPage)

List selected repositories for an organization secret

Lists all repositories that have been selected when the &#x60;visibility&#x60; for repository access to a secret is set to &#x60;selected&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListSelectedReposForOrgSecret200Response = apiInstance.codespacesListSelectedReposForOrgSecret(org, secretName, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesListSelectedReposForOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesListSelectedReposForOrgSecret")
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

<a id="codespacesPreFlightWithRepoForAuthenticatedUser"></a>
# **codespacesPreFlightWithRepoForAuthenticatedUser**
> CodespacesPreFlightWithRepoForAuthenticatedUser200Response codespacesPreFlightWithRepoForAuthenticatedUser(owner, repo, ref, clientIp)

Get default attributes for a codespace

Gets the default attributes for codespaces created by the user with the repository.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ref : kotlin.String = ref_example // kotlin.String | The branch or commit to check for a default devcontainer path. If not specified, the default branch will be checked.
val clientIp : kotlin.String = clientIp_example // kotlin.String | An alternative IP for default location auto-detection, such as when proxying a request.
try {
    val result : CodespacesPreFlightWithRepoForAuthenticatedUser200Response = apiInstance.codespacesPreFlightWithRepoForAuthenticatedUser(owner, repo, ref, clientIp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesPreFlightWithRepoForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesPreFlightWithRepoForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ref** | **kotlin.String**| The branch or commit to check for a default devcontainer path. If not specified, the default branch will be checked. | [optional]
 **clientIp** | **kotlin.String**| An alternative IP for default location auto-detection, such as when proxying a request. | [optional]

### Return type

[**CodespacesPreFlightWithRepoForAuthenticatedUser200Response**](CodespacesPreFlightWithRepoForAuthenticatedUser200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesPublishForAuthenticatedUser"></a>
# **codespacesPublishForAuthenticatedUser**
> CodespaceWithFullRepository codespacesPublishForAuthenticatedUser(codespaceName, codespacesPublishForAuthenticatedUserRequest)

Create a repository from an unpublished codespace

Publishes an unpublished codespace, creating a new repository and assigning it to the codespace.  The codespace&#39;s token is granted write permissions to the repository, allowing the user to push their changes.  This will fail for a codespace that is already published, meaning it has an associated repository.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val codespaceName : kotlin.String = codespaceName_example // kotlin.String | The name of the codespace.
val codespacesPublishForAuthenticatedUserRequest : CodespacesPublishForAuthenticatedUserRequest = {"repository":"monalisa-octocat-hello-world-g4wpq6h95q","private":false} // CodespacesPublishForAuthenticatedUserRequest | 
try {
    val result : CodespaceWithFullRepository = apiInstance.codespacesPublishForAuthenticatedUser(codespaceName, codespacesPublishForAuthenticatedUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesPublishForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesPublishForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codespaceName** | **kotlin.String**| The name of the codespace. |
 **codespacesPublishForAuthenticatedUserRequest** | [**CodespacesPublishForAuthenticatedUserRequest**](CodespacesPublishForAuthenticatedUserRequest.md)|  |

### Return type

[**CodespaceWithFullRepository**](CodespaceWithFullRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="codespacesRemoveRepositoryForSecretForAuthenticatedUser"></a>
# **codespacesRemoveRepositoryForSecretForAuthenticatedUser**
> codespacesRemoveRepositoryForSecretForAuthenticatedUser(secretName, repositoryId)

Remove a selected repository from a user secret

Removes a repository from the selected repositories for a user&#39;s development environment secret.  The authenticated user must have Codespaces access to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val repositoryId : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.codespacesRemoveRepositoryForSecretForAuthenticatedUser(secretName, repositoryId)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesRemoveRepositoryForSecretForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesRemoveRepositoryForSecretForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretName** | **kotlin.String**| The name of the secret. |
 **repositoryId** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesRemoveSelectedRepoFromOrgSecret"></a>
# **codespacesRemoveSelectedRepoFromOrgSecret**
> codespacesRemoveSelectedRepoFromOrgSecret(org, secretName, repositoryId)

Remove selected repository from an organization secret

Removes a repository from an organization development environment secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/codespaces/organization-secrets#create-or-update-an-organization-secret).  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val repositoryId : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.codespacesRemoveSelectedRepoFromOrgSecret(org, secretName, repositoryId)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesRemoveSelectedRepoFromOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesRemoveSelectedRepoFromOrgSecret")
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
 - **Accept**: application/json

<a id="codespacesRepoMachinesForAuthenticatedUser"></a>
# **codespacesRepoMachinesForAuthenticatedUser**
> CodespacesRepoMachinesForAuthenticatedUser200Response codespacesRepoMachinesForAuthenticatedUser(owner, repo, location, clientIp, ref)

List available machine types for a repository

List the machine types available for a given repository based on its configuration.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val location : kotlin.String = location_example // kotlin.String | The location to check for available machines. Assigned by IP if not provided.
val clientIp : kotlin.String = clientIp_example // kotlin.String | IP for location auto-detection when proxying a request
val ref : kotlin.String = ref_example // kotlin.String | The branch or commit to check for prebuild availability and devcontainer restrictions.
try {
    val result : CodespacesRepoMachinesForAuthenticatedUser200Response = apiInstance.codespacesRepoMachinesForAuthenticatedUser(owner, repo, location, clientIp, ref)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesRepoMachinesForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesRepoMachinesForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **location** | **kotlin.String**| The location to check for available machines. Assigned by IP if not provided. | [optional]
 **clientIp** | **kotlin.String**| IP for location auto-detection when proxying a request | [optional] [default to &quot;push&quot;]
 **ref** | **kotlin.String**| The branch or commit to check for prebuild availability and devcontainer restrictions. | [optional]

### Return type

[**CodespacesRepoMachinesForAuthenticatedUser200Response**](CodespacesRepoMachinesForAuthenticatedUser200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesSetCodespacesAccess"></a>
# **codespacesSetCodespacesAccess**
> codespacesSetCodespacesAccess(org, codespacesSetCodespacesAccessRequest)

Manage access control for organization codespaces

Sets which users can access codespaces in an organization. This is synonymous with granting or revoking codespaces access permissions for users according to the visibility. OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val codespacesSetCodespacesAccessRequest : CodespacesSetCodespacesAccessRequest = {"visibility":"selected_members","selected_usernames":["johnDoe","atomIO"]} // CodespacesSetCodespacesAccessRequest | 
try {
    apiInstance.codespacesSetCodespacesAccess(org, codespacesSetCodespacesAccessRequest)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesSetCodespacesAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesSetCodespacesAccess")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **codespacesSetCodespacesAccessRequest** | [**CodespacesSetCodespacesAccessRequest**](CodespacesSetCodespacesAccessRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="codespacesSetCodespacesAccessUsers"></a>
# **codespacesSetCodespacesAccessUsers**
> codespacesSetCodespacesAccessUsers(org, codespacesSetCodespacesAccessUsersRequest)

Add users to Codespaces access for an organization

Codespaces for the specified users will be billed to the organization.  To use this endpoint, the access settings for the organization must be set to &#x60;selected_members&#x60;. For information on how to change this setting, see \&quot;[Manage access control for organization codespaces](https://docs.github.com/rest/codespaces/organizations#manage-access-control-for-organization-codespaces).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val codespacesSetCodespacesAccessUsersRequest : CodespacesSetCodespacesAccessUsersRequest = {selected_usernames=[johnDoe, atomIO]} // CodespacesSetCodespacesAccessUsersRequest | 
try {
    apiInstance.codespacesSetCodespacesAccessUsers(org, codespacesSetCodespacesAccessUsersRequest)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesSetCodespacesAccessUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesSetCodespacesAccessUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **codespacesSetCodespacesAccessUsersRequest** | [**CodespacesSetCodespacesAccessUsersRequest**](CodespacesSetCodespacesAccessUsersRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="codespacesSetRepositoriesForSecretForAuthenticatedUser"></a>
# **codespacesSetRepositoriesForSecretForAuthenticatedUser**
> codespacesSetRepositoriesForSecretForAuthenticatedUser(secretName, codespacesSetRepositoriesForSecretForAuthenticatedUserRequest)

Set selected repositories for a user secret

Select the repositories that will use a user&#39;s development environment secret.  The authenticated user must have Codespaces access to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; or &#x60;codespace:secrets&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val codespacesSetRepositoriesForSecretForAuthenticatedUserRequest : CodespacesSetRepositoriesForSecretForAuthenticatedUserRequest = {"selected_repository_ids":["1296269","1296280"]} // CodespacesSetRepositoriesForSecretForAuthenticatedUserRequest | 
try {
    apiInstance.codespacesSetRepositoriesForSecretForAuthenticatedUser(secretName, codespacesSetRepositoriesForSecretForAuthenticatedUserRequest)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesSetRepositoriesForSecretForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesSetRepositoriesForSecretForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secretName** | **kotlin.String**| The name of the secret. |
 **codespacesSetRepositoriesForSecretForAuthenticatedUserRequest** | [**CodespacesSetRepositoriesForSecretForAuthenticatedUserRequest**](CodespacesSetRepositoriesForSecretForAuthenticatedUserRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="codespacesSetSelectedReposForOrgSecret"></a>
# **codespacesSetSelectedReposForOrgSecret**
> codespacesSetSelectedReposForOrgSecret(org, secretName, codespacesSetSelectedReposForOrgSecretRequest)

Set selected repositories for an organization secret

Replaces all repositories for an organization development environment secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/codespaces/organization-secrets#create-or-update-an-organization-secret).  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val codespacesSetSelectedReposForOrgSecretRequest : CodespacesSetSelectedReposForOrgSecretRequest = {selected_repository_ids=[64780797]} // CodespacesSetSelectedReposForOrgSecretRequest | 
try {
    apiInstance.codespacesSetSelectedReposForOrgSecret(org, secretName, codespacesSetSelectedReposForOrgSecretRequest)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesSetSelectedReposForOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesSetSelectedReposForOrgSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |
 **codespacesSetSelectedReposForOrgSecretRequest** | [**CodespacesSetSelectedReposForOrgSecretRequest**](CodespacesSetSelectedReposForOrgSecretRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="codespacesStartForAuthenticatedUser"></a>
# **codespacesStartForAuthenticatedUser**
> Codespace codespacesStartForAuthenticatedUser(codespaceName)

Start a codespace for the authenticated user

Starts a user&#39;s codespace.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val codespaceName : kotlin.String = codespaceName_example // kotlin.String | The name of the codespace.
try {
    val result : Codespace = apiInstance.codespacesStartForAuthenticatedUser(codespaceName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesStartForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesStartForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codespaceName** | **kotlin.String**| The name of the codespace. |

### Return type

[**Codespace**](Codespace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="codespacesStopForAuthenticatedUser"></a>
# **codespacesStopForAuthenticatedUser**
> Codespace codespacesStopForAuthenticatedUser(codespaceName)

Stop a codespace for the authenticated user

Stops a user&#39;s codespace.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val codespaceName : kotlin.String = codespaceName_example // kotlin.String | The name of the codespace.
try {
    val result : Codespace = apiInstance.codespacesStopForAuthenticatedUser(codespaceName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesStopForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesStopForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codespaceName** | **kotlin.String**| The name of the codespace. |

### Return type

[**Codespace**](Codespace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesStopInOrganization"></a>
# **codespacesStopInOrganization**
> Codespace codespacesStopInOrganization(org, username, codespaceName)

Stop a codespace for an organization user

Stops a user&#39;s codespace.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val codespaceName : kotlin.String = codespaceName_example // kotlin.String | The name of the codespace.
try {
    val result : Codespace = apiInstance.codespacesStopInOrganization(org, username, codespaceName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesStopInOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesStopInOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **codespaceName** | **kotlin.String**| The name of the codespace. |

### Return type

[**Codespace**](Codespace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="codespacesUpdateForAuthenticatedUser"></a>
# **codespacesUpdateForAuthenticatedUser**
> Codespace codespacesUpdateForAuthenticatedUser(codespaceName, codespacesUpdateForAuthenticatedUserRequest)

Update a codespace for the authenticated user

Updates a codespace owned by the authenticated user. Currently only the codespace&#39;s machine type and recent folders can be modified using this endpoint.  If you specify a new machine type it will be applied the next time your codespace is started.  OAuth app tokens and personal access tokens (classic) need the &#x60;codespace&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CodespacesApi()
val codespaceName : kotlin.String = codespaceName_example // kotlin.String | The name of the codespace.
val codespacesUpdateForAuthenticatedUserRequest : CodespacesUpdateForAuthenticatedUserRequest = {"machine":"standardLinux"} // CodespacesUpdateForAuthenticatedUserRequest | 
try {
    val result : Codespace = apiInstance.codespacesUpdateForAuthenticatedUser(codespaceName, codespacesUpdateForAuthenticatedUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CodespacesApi#codespacesUpdateForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CodespacesApi#codespacesUpdateForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codespaceName** | **kotlin.String**| The name of the codespace. |
 **codespacesUpdateForAuthenticatedUserRequest** | [**CodespacesUpdateForAuthenticatedUserRequest**](CodespacesUpdateForAuthenticatedUserRequest.md)|  | [optional]

### Return type

[**Codespace**](Codespace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

