# PackagesApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**packagesDeletePackageForAuthenticatedUser**](PackagesApi.md#packagesDeletePackageForAuthenticatedUser) | **DELETE** /user/packages/{package_type}/{package_name} | Delete a package for the authenticated user
[**packagesDeletePackageForOrg**](PackagesApi.md#packagesDeletePackageForOrg) | **DELETE** /orgs/{org}/packages/{package_type}/{package_name} | Delete a package for an organization
[**packagesDeletePackageForUser**](PackagesApi.md#packagesDeletePackageForUser) | **DELETE** /users/{username}/packages/{package_type}/{package_name} | Delete a package for a user
[**packagesDeletePackageVersionForAuthenticatedUser**](PackagesApi.md#packagesDeletePackageVersionForAuthenticatedUser) | **DELETE** /user/packages/{package_type}/{package_name}/versions/{package_version_id} | Delete a package version for the authenticated user
[**packagesDeletePackageVersionForOrg**](PackagesApi.md#packagesDeletePackageVersionForOrg) | **DELETE** /orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id} | Delete package version for an organization
[**packagesDeletePackageVersionForUser**](PackagesApi.md#packagesDeletePackageVersionForUser) | **DELETE** /users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id} | Delete package version for a user
[**packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUser**](PackagesApi.md#packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUser) | **GET** /user/packages/{package_type}/{package_name}/versions | List package versions for a package owned by the authenticated user
[**packagesGetAllPackageVersionsForPackageOwnedByOrg**](PackagesApi.md#packagesGetAllPackageVersionsForPackageOwnedByOrg) | **GET** /orgs/{org}/packages/{package_type}/{package_name}/versions | List package versions for a package owned by an organization
[**packagesGetAllPackageVersionsForPackageOwnedByUser**](PackagesApi.md#packagesGetAllPackageVersionsForPackageOwnedByUser) | **GET** /users/{username}/packages/{package_type}/{package_name}/versions | List package versions for a package owned by a user
[**packagesGetPackageForAuthenticatedUser**](PackagesApi.md#packagesGetPackageForAuthenticatedUser) | **GET** /user/packages/{package_type}/{package_name} | Get a package for the authenticated user
[**packagesGetPackageForOrganization**](PackagesApi.md#packagesGetPackageForOrganization) | **GET** /orgs/{org}/packages/{package_type}/{package_name} | Get a package for an organization
[**packagesGetPackageForUser**](PackagesApi.md#packagesGetPackageForUser) | **GET** /users/{username}/packages/{package_type}/{package_name} | Get a package for a user
[**packagesGetPackageVersionForAuthenticatedUser**](PackagesApi.md#packagesGetPackageVersionForAuthenticatedUser) | **GET** /user/packages/{package_type}/{package_name}/versions/{package_version_id} | Get a package version for the authenticated user
[**packagesGetPackageVersionForOrganization**](PackagesApi.md#packagesGetPackageVersionForOrganization) | **GET** /orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id} | Get a package version for an organization
[**packagesGetPackageVersionForUser**](PackagesApi.md#packagesGetPackageVersionForUser) | **GET** /users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id} | Get a package version for a user
[**packagesListDockerMigrationConflictingPackagesForAuthenticatedUser**](PackagesApi.md#packagesListDockerMigrationConflictingPackagesForAuthenticatedUser) | **GET** /user/docker/conflicts | Get list of conflicting packages during Docker migration for authenticated-user
[**packagesListDockerMigrationConflictingPackagesForOrganization**](PackagesApi.md#packagesListDockerMigrationConflictingPackagesForOrganization) | **GET** /orgs/{org}/docker/conflicts | Get list of conflicting packages during Docker migration for organization
[**packagesListDockerMigrationConflictingPackagesForUser**](PackagesApi.md#packagesListDockerMigrationConflictingPackagesForUser) | **GET** /users/{username}/docker/conflicts | Get list of conflicting packages during Docker migration for user
[**packagesListPackagesForAuthenticatedUser**](PackagesApi.md#packagesListPackagesForAuthenticatedUser) | **GET** /user/packages | List packages for the authenticated user&#39;s namespace
[**packagesListPackagesForOrganization**](PackagesApi.md#packagesListPackagesForOrganization) | **GET** /orgs/{org}/packages | List packages for an organization
[**packagesListPackagesForUser**](PackagesApi.md#packagesListPackagesForUser) | **GET** /users/{username}/packages | List packages for a user
[**packagesRestorePackageForAuthenticatedUser**](PackagesApi.md#packagesRestorePackageForAuthenticatedUser) | **POST** /user/packages/{package_type}/{package_name}/restore | Restore a package for the authenticated user
[**packagesRestorePackageForOrg**](PackagesApi.md#packagesRestorePackageForOrg) | **POST** /orgs/{org}/packages/{package_type}/{package_name}/restore | Restore a package for an organization
[**packagesRestorePackageForUser**](PackagesApi.md#packagesRestorePackageForUser) | **POST** /users/{username}/packages/{package_type}/{package_name}/restore | Restore a package for a user
[**packagesRestorePackageVersionForAuthenticatedUser**](PackagesApi.md#packagesRestorePackageVersionForAuthenticatedUser) | **POST** /user/packages/{package_type}/{package_name}/versions/{package_version_id}/restore | Restore a package version for the authenticated user
[**packagesRestorePackageVersionForOrg**](PackagesApi.md#packagesRestorePackageVersionForOrg) | **POST** /orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id}/restore | Restore package version for an organization
[**packagesRestorePackageVersionForUser**](PackagesApi.md#packagesRestorePackageVersionForUser) | **POST** /users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id}/restore | Restore package version for a user


<a id="packagesDeletePackageForAuthenticatedUser"></a>
# **packagesDeletePackageForAuthenticatedUser**
> packagesDeletePackageForAuthenticatedUser(packageType, packageName)

Delete a package for the authenticated user

Deletes a package owned by the authenticated user. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; and &#x60;delete:packages&#x60; scopes to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, &#x60;repo&#x60; scope is also required. For the list these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
try {
    apiInstance.packagesDeletePackageForAuthenticatedUser(packageType, packageName)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesDeletePackageForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesDeletePackageForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesDeletePackageForOrg"></a>
# **packagesDeletePackageForOrg**
> packagesDeletePackageForOrg(packageType, packageName, org)

Delete a package for an organization

Deletes an entire package in an organization. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.  The authenticated user must have admin permissions in the organization to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that supports granular permissions, the authenticated user must also have admin permissions to the package. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; and &#x60;delete:packages&#x60; scopes to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    apiInstance.packagesDeletePackageForOrg(packageType, packageName, org)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesDeletePackageForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesDeletePackageForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesDeletePackageForUser"></a>
# **packagesDeletePackageForUser**
> packagesDeletePackageForUser(packageType, packageName, username)

Delete a package for a user

Deletes an entire package for a user. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.  If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that supports granular permissions, the authenticated user must have admin permissions to the package. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; and &#x60;delete:packages&#x60; scopes to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.packagesDeletePackageForUser(packageType, packageName, username)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesDeletePackageForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesDeletePackageForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesDeletePackageVersionForAuthenticatedUser"></a>
# **packagesDeletePackageVersionForAuthenticatedUser**
> packagesDeletePackageVersionForAuthenticatedUser(packageType, packageName, packageVersionId)

Delete a package version for the authenticated user

Deletes a specific package version for a package owned by the authenticated user.  If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.  The authenticated user must have admin permissions in the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; and &#x60;delete:packages&#x60; scopes to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val packageVersionId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the package version.
try {
    apiInstance.packagesDeletePackageVersionForAuthenticatedUser(packageType, packageName, packageVersionId)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesDeletePackageVersionForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesDeletePackageVersionForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **packageVersionId** | **kotlin.Int**| Unique identifier of the package version. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesDeletePackageVersionForOrg"></a>
# **packagesDeletePackageVersionForOrg**
> packagesDeletePackageVersionForOrg(packageType, packageName, org, packageVersionId)

Delete package version for an organization

Deletes a specific package version in an organization. If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.  The authenticated user must have admin permissions in the organization to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that supports granular permissions, the authenticated user must also have admin permissions to the package. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; and &#x60;delete:packages&#x60; scopes to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val packageVersionId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the package version.
try {
    apiInstance.packagesDeletePackageVersionForOrg(packageType, packageName, org, packageVersionId)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesDeletePackageVersionForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesDeletePackageVersionForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **packageVersionId** | **kotlin.Int**| Unique identifier of the package version. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesDeletePackageVersionForUser"></a>
# **packagesDeletePackageVersionForUser**
> packagesDeletePackageVersionForUser(packageType, packageName, username, packageVersionId)

Delete package version for a user

Deletes a specific package version for a user. If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.  If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that supports granular permissions, the authenticated user must have admin permissions to the package. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; and &#x60;delete:packages&#x60; scopes to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val packageVersionId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the package version.
try {
    apiInstance.packagesDeletePackageVersionForUser(packageType, packageName, username, packageVersionId)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesDeletePackageVersionForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesDeletePackageVersionForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **packageVersionId** | **kotlin.Int**| Unique identifier of the package version. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUser"></a>
# **packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUser**
> kotlin.collections.List&lt;PackageVersion&gt; packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUser(packageType, packageName, page, perPage, state)

List package versions for a package owned by the authenticated user

Lists package versions for a package owned by the authenticated user.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; scope to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val state : kotlin.String = state_example // kotlin.String | The state of the package, either active or deleted.
try {
    val result : kotlin.collections.List<PackageVersion> = apiInstance.packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUser(packageType, packageName, page, perPage, state)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **state** | **kotlin.String**| The state of the package, either active or deleted. | [optional] [default to active] [enum: active, deleted]

### Return type

[**kotlin.collections.List&lt;PackageVersion&gt;**](PackageVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesGetAllPackageVersionsForPackageOwnedByOrg"></a>
# **packagesGetAllPackageVersionsForPackageOwnedByOrg**
> kotlin.collections.List&lt;PackageVersion&gt; packagesGetAllPackageVersionsForPackageOwnedByOrg(packageType, packageName, org, page, perPage, state)

List package versions for a package owned by an organization

Lists package versions for a package owned by an organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint if the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val state : kotlin.String = state_example // kotlin.String | The state of the package, either active or deleted.
try {
    val result : kotlin.collections.List<PackageVersion> = apiInstance.packagesGetAllPackageVersionsForPackageOwnedByOrg(packageType, packageName, org, page, perPage, state)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesGetAllPackageVersionsForPackageOwnedByOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesGetAllPackageVersionsForPackageOwnedByOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **state** | **kotlin.String**| The state of the package, either active or deleted. | [optional] [default to active] [enum: active, deleted]

### Return type

[**kotlin.collections.List&lt;PackageVersion&gt;**](PackageVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesGetAllPackageVersionsForPackageOwnedByUser"></a>
# **packagesGetAllPackageVersionsForPackageOwnedByUser**
> kotlin.collections.List&lt;PackageVersion&gt; packagesGetAllPackageVersionsForPackageOwnedByUser(packageType, packageName, username)

List package versions for a package owned by a user

Lists package versions for a public package owned by a specified user.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; scope to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    val result : kotlin.collections.List<PackageVersion> = apiInstance.packagesGetAllPackageVersionsForPackageOwnedByUser(packageType, packageName, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesGetAllPackageVersionsForPackageOwnedByUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesGetAllPackageVersionsForPackageOwnedByUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

[**kotlin.collections.List&lt;PackageVersion&gt;**](PackageVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesGetPackageForAuthenticatedUser"></a>
# **packagesGetPackageForAuthenticatedUser**
> Package packagesGetPackageForAuthenticatedUser(packageType, packageName)

Get a package for the authenticated user

Gets a specific package for a package owned by the authenticated user.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; scope to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
try {
    val result : Package = apiInstance.packagesGetPackageForAuthenticatedUser(packageType, packageName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesGetPackageForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesGetPackageForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |

### Return type

[**Package**](Package.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesGetPackageForOrganization"></a>
# **packagesGetPackageForOrganization**
> Package packagesGetPackageForOrganization(packageType, packageName, org)

Get a package for an organization

Gets a specific package in an organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; scope to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : Package = apiInstance.packagesGetPackageForOrganization(packageType, packageName, org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesGetPackageForOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesGetPackageForOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**Package**](Package.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesGetPackageForUser"></a>
# **packagesGetPackageForUser**
> Package packagesGetPackageForUser(packageType, packageName, username)

Get a package for a user

Gets a specific package metadata for a public package owned by a user.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; scope to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    val result : Package = apiInstance.packagesGetPackageForUser(packageType, packageName, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesGetPackageForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesGetPackageForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

[**Package**](Package.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesGetPackageVersionForAuthenticatedUser"></a>
# **packagesGetPackageVersionForAuthenticatedUser**
> PackageVersion packagesGetPackageVersionForAuthenticatedUser(packageType, packageName, packageVersionId)

Get a package version for the authenticated user

Gets a specific package version for a package owned by the authenticated user.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; scope to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val packageVersionId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the package version.
try {
    val result : PackageVersion = apiInstance.packagesGetPackageVersionForAuthenticatedUser(packageType, packageName, packageVersionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesGetPackageVersionForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesGetPackageVersionForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **packageVersionId** | **kotlin.Int**| Unique identifier of the package version. |

### Return type

[**PackageVersion**](PackageVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesGetPackageVersionForOrganization"></a>
# **packagesGetPackageVersionForOrganization**
> PackageVersion packagesGetPackageVersionForOrganization(packageType, packageName, org, packageVersionId)

Get a package version for an organization

Gets a specific package version in an organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; scope to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val packageVersionId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the package version.
try {
    val result : PackageVersion = apiInstance.packagesGetPackageVersionForOrganization(packageType, packageName, org, packageVersionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesGetPackageVersionForOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesGetPackageVersionForOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **packageVersionId** | **kotlin.Int**| Unique identifier of the package version. |

### Return type

[**PackageVersion**](PackageVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesGetPackageVersionForUser"></a>
# **packagesGetPackageVersionForUser**
> PackageVersion packagesGetPackageVersionForUser(packageType, packageName, packageVersionId, username)

Get a package version for a user

Gets a specific package version for a public package owned by a specified user.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; scope to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val packageVersionId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the package version.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    val result : PackageVersion = apiInstance.packagesGetPackageVersionForUser(packageType, packageName, packageVersionId, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesGetPackageVersionForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesGetPackageVersionForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **packageVersionId** | **kotlin.Int**| Unique identifier of the package version. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

[**PackageVersion**](PackageVersion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesListDockerMigrationConflictingPackagesForAuthenticatedUser"></a>
# **packagesListDockerMigrationConflictingPackagesForAuthenticatedUser**
> kotlin.collections.List&lt;Package&gt; packagesListDockerMigrationConflictingPackagesForAuthenticatedUser()

Get list of conflicting packages during Docker migration for authenticated-user

Lists all packages that are owned by the authenticated user within the user&#39;s namespace, and that encountered a conflict during a Docker migration.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
try {
    val result : kotlin.collections.List<Package> = apiInstance.packagesListDockerMigrationConflictingPackagesForAuthenticatedUser()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesListDockerMigrationConflictingPackagesForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesListDockerMigrationConflictingPackagesForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Package&gt;**](Package.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesListDockerMigrationConflictingPackagesForOrganization"></a>
# **packagesListDockerMigrationConflictingPackagesForOrganization**
> kotlin.collections.List&lt;Package&gt; packagesListDockerMigrationConflictingPackagesForOrganization(org)

Get list of conflicting packages during Docker migration for organization

Lists all packages that are in a specific organization, are readable by the requesting user, and that encountered a conflict during a Docker migration.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : kotlin.collections.List<Package> = apiInstance.packagesListDockerMigrationConflictingPackagesForOrganization(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesListDockerMigrationConflictingPackagesForOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesListDockerMigrationConflictingPackagesForOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**kotlin.collections.List&lt;Package&gt;**](Package.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesListDockerMigrationConflictingPackagesForUser"></a>
# **packagesListDockerMigrationConflictingPackagesForUser**
> kotlin.collections.List&lt;Package&gt; packagesListDockerMigrationConflictingPackagesForUser(username)

Get list of conflicting packages during Docker migration for user

Lists all packages that are in a specific user&#39;s namespace, that the requesting user has access to, and that encountered a conflict during Docker migration.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    val result : kotlin.collections.List<Package> = apiInstance.packagesListDockerMigrationConflictingPackagesForUser(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesListDockerMigrationConflictingPackagesForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesListDockerMigrationConflictingPackagesForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

[**kotlin.collections.List&lt;Package&gt;**](Package.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesListPackagesForAuthenticatedUser"></a>
# **packagesListPackagesForAuthenticatedUser**
> kotlin.collections.List&lt;Package&gt; packagesListPackagesForAuthenticatedUser(packageType, visibility, page, perPage)

List packages for the authenticated user&#39;s namespace

Lists packages owned by the authenticated user within the user&#39;s namespace.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; scope to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val visibility : kotlin.String = visibility_example // kotlin.String | The selected visibility of the packages.  This parameter is optional and only filters an existing result set.  The `internal` visibility is only supported for GitHub Packages registries that allow for granular permissions. For other ecosystems `internal` is synonymous with `private`. For the list of GitHub Packages registries that support granular permissions, see \"[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Package> = apiInstance.packagesListPackagesForAuthenticatedUser(packageType, visibility, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesListPackagesForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesListPackagesForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **visibility** | **kotlin.String**| The selected visibility of the packages.  This parameter is optional and only filters an existing result set.  The &#x60;internal&#x60; visibility is only supported for GitHub Packages registries that allow for granular permissions. For other ecosystems &#x60;internal&#x60; is synonymous with &#x60;private&#x60;. For the list of GitHub Packages registries that support granular permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot; | [optional] [enum: public, private, internal]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;Package&gt;**](Package.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesListPackagesForOrganization"></a>
# **packagesListPackagesForOrganization**
> kotlin.collections.List&lt;Package&gt; packagesListPackagesForOrganization(org, packageType, visibility, page, perPage)

List packages for an organization

Lists packages in an organization readable by the user.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; scope to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val visibility : kotlin.String = visibility_example // kotlin.String | The selected visibility of the packages.  This parameter is optional and only filters an existing result set.  The `internal` visibility is only supported for GitHub Packages registries that allow for granular permissions. For other ecosystems `internal` is synonymous with `private`. For the list of GitHub Packages registries that support granular permissions, see \"[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Package> = apiInstance.packagesListPackagesForOrganization(org, packageType, visibility, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesListPackagesForOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesListPackagesForOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **visibility** | **kotlin.String**| The selected visibility of the packages.  This parameter is optional and only filters an existing result set.  The &#x60;internal&#x60; visibility is only supported for GitHub Packages registries that allow for granular permissions. For other ecosystems &#x60;internal&#x60; is synonymous with &#x60;private&#x60;. For the list of GitHub Packages registries that support granular permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot; | [optional] [enum: public, private, internal]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;Package&gt;**](Package.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesListPackagesForUser"></a>
# **packagesListPackagesForUser**
> kotlin.collections.List&lt;Package&gt; packagesListPackagesForUser(username, packageType, visibility, page, perPage)

List packages for a user

Lists all packages in a user&#39;s namespace for which the requesting user has access.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; scope to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val visibility : kotlin.String = visibility_example // kotlin.String | The selected visibility of the packages.  This parameter is optional and only filters an existing result set.  The `internal` visibility is only supported for GitHub Packages registries that allow for granular permissions. For other ecosystems `internal` is synonymous with `private`. For the list of GitHub Packages registries that support granular permissions, see \"[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Package> = apiInstance.packagesListPackagesForUser(username, packageType, visibility, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesListPackagesForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesListPackagesForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **visibility** | **kotlin.String**| The selected visibility of the packages.  This parameter is optional and only filters an existing result set.  The &#x60;internal&#x60; visibility is only supported for GitHub Packages registries that allow for granular permissions. For other ecosystems &#x60;internal&#x60; is synonymous with &#x60;private&#x60;. For the list of GitHub Packages registries that support granular permissions, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot; | [optional] [enum: public, private, internal]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;Package&gt;**](Package.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesRestorePackageForAuthenticatedUser"></a>
# **packagesRestorePackageForAuthenticatedUser**
> packagesRestorePackageForAuthenticatedUser(packageType, packageName, token)

Restore a package for the authenticated user

Restores a package owned by the authenticated user.  You can restore a deleted package under the following conditions:   - The package was deleted within the last 30 days.   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package&#39;s namespace first.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; and &#x60;write:packages&#x60; scopes to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val token : kotlin.String = token_example // kotlin.String | package token
try {
    apiInstance.packagesRestorePackageForAuthenticatedUser(packageType, packageName, token)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesRestorePackageForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesRestorePackageForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **token** | **kotlin.String**| package token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesRestorePackageForOrg"></a>
# **packagesRestorePackageForOrg**
> packagesRestorePackageForOrg(packageType, packageName, org, token)

Restore a package for an organization

Restores an entire package in an organization.  You can restore a deleted package under the following conditions:   - The package was deleted within the last 30 days.   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package&#39;s namespace first.  The authenticated user must have admin permissions in the organization to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that supports granular permissions, the authenticated user must also have admin permissions to the package. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; and &#x60;write:packages&#x60; scopes to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val token : kotlin.String = token_example // kotlin.String | package token
try {
    apiInstance.packagesRestorePackageForOrg(packageType, packageName, org, token)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesRestorePackageForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesRestorePackageForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **token** | **kotlin.String**| package token | [optional] [default to &quot;push&quot;]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesRestorePackageForUser"></a>
# **packagesRestorePackageForUser**
> packagesRestorePackageForUser(packageType, packageName, username, token)

Restore a package for a user

Restores an entire package for a user.  You can restore a deleted package under the following conditions:   - The package was deleted within the last 30 days.   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package&#39;s namespace first.  If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that supports granular permissions, the authenticated user must have admin permissions to the package. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; and &#x60;write:packages&#x60; scopes to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val token : kotlin.String = token_example // kotlin.String | package token
try {
    apiInstance.packagesRestorePackageForUser(packageType, packageName, username, token)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesRestorePackageForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesRestorePackageForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **token** | **kotlin.String**| package token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesRestorePackageVersionForAuthenticatedUser"></a>
# **packagesRestorePackageVersionForAuthenticatedUser**
> packagesRestorePackageVersionForAuthenticatedUser(packageType, packageName, packageVersionId)

Restore a package version for the authenticated user

Restores a package version owned by the authenticated user.  You can restore a deleted package version under the following conditions:   - The package was deleted within the last 30 days.   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package&#39;s namespace first.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; and &#x60;write:packages&#x60; scopes to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val packageVersionId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the package version.
try {
    apiInstance.packagesRestorePackageVersionForAuthenticatedUser(packageType, packageName, packageVersionId)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesRestorePackageVersionForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesRestorePackageVersionForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **packageVersionId** | **kotlin.Int**| Unique identifier of the package version. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesRestorePackageVersionForOrg"></a>
# **packagesRestorePackageVersionForOrg**
> packagesRestorePackageVersionForOrg(packageType, packageName, org, packageVersionId)

Restore package version for an organization

Restores a specific package version in an organization.  You can restore a deleted package under the following conditions:   - The package was deleted within the last 30 days.   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package&#39;s namespace first.  The authenticated user must have admin permissions in the organization to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that supports granular permissions, the authenticated user must also have admin permissions to the package. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; and &#x60;write:packages&#x60; scopes to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val packageVersionId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the package version.
try {
    apiInstance.packagesRestorePackageVersionForOrg(packageType, packageName, org, packageVersionId)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesRestorePackageVersionForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesRestorePackageVersionForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **packageVersionId** | **kotlin.Int**| Unique identifier of the package version. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="packagesRestorePackageVersionForUser"></a>
# **packagesRestorePackageVersionForUser**
> packagesRestorePackageVersionForUser(packageType, packageName, username, packageVersionId)

Restore package version for a user

Restores a specific package version for a user.  You can restore a deleted package under the following conditions:   - The package was deleted within the last 30 days.   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package&#39;s namespace first.  If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that supports granular permissions, the authenticated user must have admin permissions to the package. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;read:packages&#x60; and &#x60;write:packages&#x60; scopes to use this endpoint. If the &#x60;package_type&#x60; belongs to a GitHub Packages registry that only supports repository-scoped permissions, the &#x60;repo&#x60; scope is also required. For the list of these registries, see \&quot;[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PackagesApi()
val packageType : kotlin.String = packageType_example // kotlin.String | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry.
val packageName : kotlin.String = packageName_example // kotlin.String | The name of the package.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val packageVersionId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the package version.
try {
    apiInstance.packagesRestorePackageVersionForUser(packageType, packageName, username, packageVersionId)
} catch (e: ClientException) {
    println("4xx response calling PackagesApi#packagesRestorePackageVersionForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PackagesApi#packagesRestorePackageVersionForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageType** | **kotlin.String**| The type of supported package. Packages in GitHub&#39;s Gradle registry have the type &#x60;maven&#x60;. Docker images pushed to GitHub&#39;s Container registry (&#x60;ghcr.io&#x60;) have the type &#x60;container&#x60;. You can use the type &#x60;docker&#x60; to find images that were pushed to GitHub&#39;s Docker registry (&#x60;docker.pkg.github.com&#x60;), even if these have now been migrated to the Container registry. | [enum: npm, maven, rubygems, docker, nuget, container]
 **packageName** | **kotlin.String**| The name of the package. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **packageVersionId** | **kotlin.Int**| Unique identifier of the package version. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

