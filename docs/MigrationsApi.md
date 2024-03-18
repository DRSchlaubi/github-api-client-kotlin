# MigrationsApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**migrationsCancelImport**](MigrationsApi.md#migrationsCancelImport) | **DELETE** /repos/{owner}/{repo}/import | Cancel an import
[**migrationsDeleteArchiveForAuthenticatedUser**](MigrationsApi.md#migrationsDeleteArchiveForAuthenticatedUser) | **DELETE** /user/migrations/{migration_id}/archive | Delete a user migration archive
[**migrationsDeleteArchiveForOrg**](MigrationsApi.md#migrationsDeleteArchiveForOrg) | **DELETE** /orgs/{org}/migrations/{migration_id}/archive | Delete an organization migration archive
[**migrationsDownloadArchiveForOrg**](MigrationsApi.md#migrationsDownloadArchiveForOrg) | **GET** /orgs/{org}/migrations/{migration_id}/archive | Download an organization migration archive
[**migrationsGetArchiveForAuthenticatedUser**](MigrationsApi.md#migrationsGetArchiveForAuthenticatedUser) | **GET** /user/migrations/{migration_id}/archive | Download a user migration archive
[**migrationsGetCommitAuthors**](MigrationsApi.md#migrationsGetCommitAuthors) | **GET** /repos/{owner}/{repo}/import/authors | Get commit authors
[**migrationsGetImportStatus**](MigrationsApi.md#migrationsGetImportStatus) | **GET** /repos/{owner}/{repo}/import | Get an import status
[**migrationsGetLargeFiles**](MigrationsApi.md#migrationsGetLargeFiles) | **GET** /repos/{owner}/{repo}/import/large_files | Get large files
[**migrationsGetStatusForAuthenticatedUser**](MigrationsApi.md#migrationsGetStatusForAuthenticatedUser) | **GET** /user/migrations/{migration_id} | Get a user migration status
[**migrationsGetStatusForOrg**](MigrationsApi.md#migrationsGetStatusForOrg) | **GET** /orgs/{org}/migrations/{migration_id} | Get an organization migration status
[**migrationsListForAuthenticatedUser**](MigrationsApi.md#migrationsListForAuthenticatedUser) | **GET** /user/migrations | List user migrations
[**migrationsListForOrg**](MigrationsApi.md#migrationsListForOrg) | **GET** /orgs/{org}/migrations | List organization migrations
[**migrationsListReposForAuthenticatedUser**](MigrationsApi.md#migrationsListReposForAuthenticatedUser) | **GET** /user/migrations/{migration_id}/repositories | List repositories for a user migration
[**migrationsListReposForOrg**](MigrationsApi.md#migrationsListReposForOrg) | **GET** /orgs/{org}/migrations/{migration_id}/repositories | List repositories in an organization migration
[**migrationsMapCommitAuthor**](MigrationsApi.md#migrationsMapCommitAuthor) | **PATCH** /repos/{owner}/{repo}/import/authors/{author_id} | Map a commit author
[**migrationsSetLfsPreference**](MigrationsApi.md#migrationsSetLfsPreference) | **PATCH** /repos/{owner}/{repo}/import/lfs | Update Git LFS preference
[**migrationsStartForAuthenticatedUser**](MigrationsApi.md#migrationsStartForAuthenticatedUser) | **POST** /user/migrations | Start a user migration
[**migrationsStartForOrg**](MigrationsApi.md#migrationsStartForOrg) | **POST** /orgs/{org}/migrations | Start an organization migration
[**migrationsStartImport**](MigrationsApi.md#migrationsStartImport) | **PUT** /repos/{owner}/{repo}/import | Start an import
[**migrationsUnlockRepoForAuthenticatedUser**](MigrationsApi.md#migrationsUnlockRepoForAuthenticatedUser) | **DELETE** /user/migrations/{migration_id}/repos/{repo_name}/lock | Unlock a user repository
[**migrationsUnlockRepoForOrg**](MigrationsApi.md#migrationsUnlockRepoForOrg) | **DELETE** /orgs/{org}/migrations/{migration_id}/repos/{repo_name}/lock | Unlock an organization repository
[**migrationsUpdateImport**](MigrationsApi.md#migrationsUpdateImport) | **PATCH** /repos/{owner}/{repo}/import | Update an import


<a id="migrationsCancelImport"></a>
# **migrationsCancelImport**
> migrationsCancelImport(owner, repo)

Cancel an import

Stop an import for a repository.  **Warning:** Due to very low levels of usage and available alternatives, this endpoint is deprecated and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives, see the [changelog](https://gh.io/source-imports-api-deprecation). 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    apiInstance.migrationsCancelImport(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsCancelImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsCancelImport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="migrationsDeleteArchiveForAuthenticatedUser"></a>
# **migrationsDeleteArchiveForAuthenticatedUser**
> migrationsDeleteArchiveForAuthenticatedUser(migrationId)

Delete a user migration archive

Deletes a previous migration archive. Downloadable migration archives are automatically deleted after seven days. Migration metadata, which is returned in the [List user migrations](https://docs.github.com/rest/migrations/users#list-user-migrations) and [Get a user migration status](https://docs.github.com/rest/migrations/users#get-a-user-migration-status) endpoints, will continue to be available even after an archive is deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val migrationId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the migration.
try {
    apiInstance.migrationsDeleteArchiveForAuthenticatedUser(migrationId)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsDeleteArchiveForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsDeleteArchiveForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **migrationId** | **kotlin.Int**| The unique identifier of the migration. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="migrationsDeleteArchiveForOrg"></a>
# **migrationsDeleteArchiveForOrg**
> migrationsDeleteArchiveForOrg(org, migrationId)

Delete an organization migration archive

Deletes a previous migration archive. Migration archives are automatically deleted after seven days.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val migrationId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the migration.
try {
    apiInstance.migrationsDeleteArchiveForOrg(org, migrationId)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsDeleteArchiveForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsDeleteArchiveForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **migrationId** | **kotlin.Int**| The unique identifier of the migration. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="migrationsDownloadArchiveForOrg"></a>
# **migrationsDownloadArchiveForOrg**
> migrationsDownloadArchiveForOrg(org, migrationId)

Download an organization migration archive

Fetches the URL to a migration archive.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val migrationId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the migration.
try {
    apiInstance.migrationsDownloadArchiveForOrg(org, migrationId)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsDownloadArchiveForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsDownloadArchiveForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **migrationId** | **kotlin.Int**| The unique identifier of the migration. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="migrationsGetArchiveForAuthenticatedUser"></a>
# **migrationsGetArchiveForAuthenticatedUser**
> migrationsGetArchiveForAuthenticatedUser(migrationId)

Download a user migration archive

Fetches the URL to download the migration archive as a &#x60;tar.gz&#x60; file. Depending on the resources your repository uses, the migration archive can contain JSON files with data for these objects:  *   attachments *   bases *   commit\\_comments *   issue\\_comments *   issue\\_events *   issues *   milestones *   organizations *   projects *   protected\\_branches *   pull\\_request\\_reviews *   pull\\_requests *   releases *   repositories *   review\\_comments *   schema *   users  The archive will also contain an &#x60;attachments&#x60; directory that includes all attachment files uploaded to GitHub.com and a &#x60;repositories&#x60; directory that contains the repository&#39;s Git data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val migrationId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the migration.
try {
    apiInstance.migrationsGetArchiveForAuthenticatedUser(migrationId)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsGetArchiveForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsGetArchiveForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **migrationId** | **kotlin.Int**| The unique identifier of the migration. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="migrationsGetCommitAuthors"></a>
# **migrationsGetCommitAuthors**
> kotlin.collections.List&lt;PorterAuthor&gt; migrationsGetCommitAuthors(owner, repo, since)

Get commit authors

Each type of source control system represents authors in a different way. For example, a Git commit author has a display name and an email address, but a Subversion commit author just has a username. The GitHub Importer will make the author information valid, but the author might not be correct. For example, it will change the bare Subversion username &#x60;hubot&#x60; into something like &#x60;hubot &lt;hubot@12341234-abab-fefe-8787-fedcba987654&gt;&#x60;.  This endpoint and the [Map a commit author](https://docs.github.com/rest/migrations/source-imports#map-a-commit-author) endpoint allow you to provide correct Git author information.  **Warning:** Due to very low levels of usage and available alternatives, this endpoint is deprecated and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives, see the [changelog](https://gh.io/source-imports-api-deprecation).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val since : kotlin.Int = 56 // kotlin.Int | A user ID. Only return users with an ID greater than this ID.
try {
    val result : kotlin.collections.List<PorterAuthor> = apiInstance.migrationsGetCommitAuthors(owner, repo, since)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsGetCommitAuthors")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsGetCommitAuthors")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **since** | **kotlin.Int**| A user ID. Only return users with an ID greater than this ID. | [optional]

### Return type

[**kotlin.collections.List&lt;PorterAuthor&gt;**](PorterAuthor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="migrationsGetImportStatus"></a>
# **migrationsGetImportStatus**
> Import migrationsGetImportStatus(owner, repo)

Get an import status

View the progress of an import.  **Warning:** Due to very low levels of usage and available alternatives, this endpoint is deprecated and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives, see the [changelog](https://gh.io/source-imports-api-deprecation).  **Import status**  This section includes details about the possible values of the &#x60;status&#x60; field of the Import Progress response.  An import that does not have errors will progress through these steps:  *   &#x60;detecting&#x60; - the \&quot;detection\&quot; step of the import is in progress because the request did not include a &#x60;vcs&#x60; parameter. The import is identifying the type of source control present at the URL. *   &#x60;importing&#x60; - the \&quot;raw\&quot; step of the import is in progress. This is where commit data is fetched from the original repository. The import progress response will include &#x60;commit_count&#x60; (the total number of raw commits that will be imported) and &#x60;percent&#x60; (0 - 100, the current progress through the import). *   &#x60;mapping&#x60; - the \&quot;rewrite\&quot; step of the import is in progress. This is where SVN branches are converted to Git branches, and where author updates are applied. The import progress response does not include progress information. *   &#x60;pushing&#x60; - the \&quot;push\&quot; step of the import is in progress. This is where the importer updates the repository on GitHub. The import progress response will include &#x60;push_percent&#x60;, which is the percent value reported by &#x60;git push&#x60; when it is \&quot;Writing objects\&quot;. *   &#x60;complete&#x60; - the import is complete, and the repository is ready on GitHub.  If there are problems, you will see one of these in the &#x60;status&#x60; field:  *   &#x60;auth_failed&#x60; - the import requires authentication in order to connect to the original repository. To update authentication for the import, please see the [Update an import](https://docs.github.com/rest/migrations/source-imports#update-an-import) section. *   &#x60;error&#x60; - the import encountered an error. The import progress response will include the &#x60;failed_step&#x60; and an error message. Contact [GitHub Support](https://support.github.com/contact?tags&#x3D;dotcom-rest-api) for more information. *   &#x60;detection_needs_auth&#x60; - the importer requires authentication for the originating repository to continue detection. To update authentication for the import, please see the [Update an import](https://docs.github.com/rest/migrations/source-imports#update-an-import) section. *   &#x60;detection_found_nothing&#x60; - the importer didn&#39;t recognize any source control at the URL. To resolve, [Cancel the import](https://docs.github.com/rest/migrations/source-imports#cancel-an-import) and [retry](https://docs.github.com/rest/migrations/source-imports#start-an-import) with the correct URL. *   &#x60;detection_found_multiple&#x60; - the importer found several projects or repositories at the provided URL. When this is the case, the Import Progress response will also include a &#x60;project_choices&#x60; field with the possible project choices as values. To update project choice, please see the [Update an import](https://docs.github.com/rest/migrations/source-imports#update-an-import) section.  **The project_choices field**  When multiple projects are found at the provided URL, the response hash will include a &#x60;project_choices&#x60; field, the value of which is an array of hashes each representing a project choice. The exact key/value pairs of the project hashes will differ depending on the version control type.  **Git LFS related fields**  This section includes details about Git LFS related fields that may be present in the Import Progress response.  *   &#x60;use_lfs&#x60; - describes whether the import has been opted in or out of using Git LFS. The value can be &#x60;opt_in&#x60;, &#x60;opt_out&#x60;, or &#x60;undecided&#x60; if no action has been taken. *   &#x60;has_large_files&#x60; - the boolean value describing whether files larger than 100MB were found during the &#x60;importing&#x60; step. *   &#x60;large_files_size&#x60; - the total size in gigabytes of files larger than 100MB found in the originating repository. *   &#x60;large_files_count&#x60; - the total number of files larger than 100MB found in the originating repository. To see a list of these files, make a \&quot;Get Large Files\&quot; request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : Import = apiInstance.migrationsGetImportStatus(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsGetImportStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsGetImportStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**Import**](Import.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="migrationsGetLargeFiles"></a>
# **migrationsGetLargeFiles**
> kotlin.collections.List&lt;PorterLargeFile&gt; migrationsGetLargeFiles(owner, repo)

Get large files

List files larger than 100MB found during the import  **Warning:** Due to very low levels of usage and available alternatives, this endpoint is deprecated and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives, see the [changelog](https://gh.io/source-imports-api-deprecation). 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : kotlin.collections.List<PorterLargeFile> = apiInstance.migrationsGetLargeFiles(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsGetLargeFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsGetLargeFiles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**kotlin.collections.List&lt;PorterLargeFile&gt;**](PorterLargeFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="migrationsGetStatusForAuthenticatedUser"></a>
# **migrationsGetStatusForAuthenticatedUser**
> Migration migrationsGetStatusForAuthenticatedUser(migrationId, exclude)

Get a user migration status

Fetches a single user migration. The response includes the &#x60;state&#x60; of the migration, which can be one of the following values:  *   &#x60;pending&#x60; - the migration hasn&#39;t started yet. *   &#x60;exporting&#x60; - the migration is in progress. *   &#x60;exported&#x60; - the migration finished successfully. *   &#x60;failed&#x60; - the migration failed.  Once the migration has been &#x60;exported&#x60; you can [download the migration archive](https://docs.github.com/rest/migrations/users#download-a-user-migration-archive).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val migrationId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the migration.
val exclude : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
try {
    val result : Migration = apiInstance.migrationsGetStatusForAuthenticatedUser(migrationId, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsGetStatusForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsGetStatusForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **migrationId** | **kotlin.Int**| The unique identifier of the migration. |
 **exclude** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional]

### Return type

[**Migration**](Migration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="migrationsGetStatusForOrg"></a>
# **migrationsGetStatusForOrg**
> Migration migrationsGetStatusForOrg(org, migrationId, exclude)

Get an organization migration status

Fetches the status of a migration.  The &#x60;state&#x60; of a migration can be one of the following values:  *   &#x60;pending&#x60;, which means the migration hasn&#39;t started yet. *   &#x60;exporting&#x60;, which means the migration is in progress. *   &#x60;exported&#x60;, which means the migration finished successfully. *   &#x60;failed&#x60;, which means the migration failed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val migrationId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the migration.
val exclude : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Exclude attributes from the API response to improve performance
try {
    val result : Migration = apiInstance.migrationsGetStatusForOrg(org, migrationId, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsGetStatusForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsGetStatusForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **migrationId** | **kotlin.Int**| The unique identifier of the migration. |
 **exclude** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Exclude attributes from the API response to improve performance | [optional] [enum: repositories]

### Return type

[**Migration**](Migration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="migrationsListForAuthenticatedUser"></a>
# **migrationsListForAuthenticatedUser**
> kotlin.collections.List&lt;Migration&gt; migrationsListForAuthenticatedUser(perPage, page)

List user migrations

Lists all migrations a user has started.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Migration> = apiInstance.migrationsListForAuthenticatedUser(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsListForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsListForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Migration&gt;**](Migration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="migrationsListForOrg"></a>
# **migrationsListForOrg**
> kotlin.collections.List&lt;Migration&gt; migrationsListForOrg(org, perPage, page, exclude)

List organization migrations

Lists the most recent migrations, including both exports (which can be started through the REST API) and imports (which cannot be started using the REST API).  A list of &#x60;repositories&#x60; is only returned for export migrations.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val exclude : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Exclude attributes from the API response to improve performance
try {
    val result : kotlin.collections.List<Migration> = apiInstance.migrationsListForOrg(org, perPage, page, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsListForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsListForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **exclude** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Exclude attributes from the API response to improve performance | [optional] [enum: repositories]

### Return type

[**kotlin.collections.List&lt;Migration&gt;**](Migration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="migrationsListReposForAuthenticatedUser"></a>
# **migrationsListReposForAuthenticatedUser**
> kotlin.collections.List&lt;MinimalRepository&gt; migrationsListReposForAuthenticatedUser(migrationId, perPage, page)

List repositories for a user migration

Lists all the repositories for this user migration.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val migrationId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the migration.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<MinimalRepository> = apiInstance.migrationsListReposForAuthenticatedUser(migrationId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsListReposForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsListReposForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **migrationId** | **kotlin.Int**| The unique identifier of the migration. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="migrationsListReposForOrg"></a>
# **migrationsListReposForOrg**
> kotlin.collections.List&lt;MinimalRepository&gt; migrationsListReposForOrg(org, migrationId, perPage, page)

List repositories in an organization migration

List all the repositories for this organization migration.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val migrationId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the migration.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<MinimalRepository> = apiInstance.migrationsListReposForOrg(org, migrationId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsListReposForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsListReposForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **migrationId** | **kotlin.Int**| The unique identifier of the migration. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="migrationsMapCommitAuthor"></a>
# **migrationsMapCommitAuthor**
> PorterAuthor migrationsMapCommitAuthor(owner, repo, authorId, migrationsMapCommitAuthorRequest)

Map a commit author

Update an author&#39;s identity for the import. Your application can continue updating authors any time before you push new commits to the repository.  **Warning:** Due to very low levels of usage and available alternatives, this endpoint is deprecated and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives, see the [changelog](https://gh.io/source-imports-api-deprecation). 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val authorId : kotlin.Int = 56 // kotlin.Int | 
val migrationsMapCommitAuthorRequest : MigrationsMapCommitAuthorRequest = {"email":"hubot@github.com","name":"Hubot the Robot"} // MigrationsMapCommitAuthorRequest | 
try {
    val result : PorterAuthor = apiInstance.migrationsMapCommitAuthor(owner, repo, authorId, migrationsMapCommitAuthorRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsMapCommitAuthor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsMapCommitAuthor")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **authorId** | **kotlin.Int**|  |
 **migrationsMapCommitAuthorRequest** | [**MigrationsMapCommitAuthorRequest**](MigrationsMapCommitAuthorRequest.md)|  | [optional]

### Return type

[**PorterAuthor**](PorterAuthor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="migrationsSetLfsPreference"></a>
# **migrationsSetLfsPreference**
> Import migrationsSetLfsPreference(owner, repo, migrationsSetLfsPreferenceRequest)

Update Git LFS preference

You can import repositories from Subversion, Mercurial, and TFS that include files larger than 100MB. This ability is powered by [Git LFS](https://git-lfs.com).  You can learn more about our LFS feature and working with large files [on our help site](https://docs.github.com/repositories/working-with-files/managing-large-files).  **Warning:** Due to very low levels of usage and available alternatives, this endpoint is deprecated and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives, see the [changelog](https://gh.io/source-imports-api-deprecation). 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val migrationsSetLfsPreferenceRequest : MigrationsSetLfsPreferenceRequest = {"use_lfs":"opt_in"} // MigrationsSetLfsPreferenceRequest | 
try {
    val result : Import = apiInstance.migrationsSetLfsPreference(owner, repo, migrationsSetLfsPreferenceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsSetLfsPreference")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsSetLfsPreference")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **migrationsSetLfsPreferenceRequest** | [**MigrationsSetLfsPreferenceRequest**](MigrationsSetLfsPreferenceRequest.md)|  |

### Return type

[**Import**](Import.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="migrationsStartForAuthenticatedUser"></a>
# **migrationsStartForAuthenticatedUser**
> Migration migrationsStartForAuthenticatedUser(migrationsStartForAuthenticatedUserRequest)

Start a user migration

Initiates the generation of a user migration archive.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val migrationsStartForAuthenticatedUserRequest : MigrationsStartForAuthenticatedUserRequest = {"repositories":["octocat/Hello-World"],"lock_repositories":true} // MigrationsStartForAuthenticatedUserRequest | 
try {
    val result : Migration = apiInstance.migrationsStartForAuthenticatedUser(migrationsStartForAuthenticatedUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsStartForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsStartForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **migrationsStartForAuthenticatedUserRequest** | [**MigrationsStartForAuthenticatedUserRequest**](MigrationsStartForAuthenticatedUserRequest.md)|  |

### Return type

[**Migration**](Migration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="migrationsStartForOrg"></a>
# **migrationsStartForOrg**
> Migration migrationsStartForOrg(org, migrationsStartForOrgRequest)

Start an organization migration

Initiates the generation of a migration archive.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val migrationsStartForOrgRequest : MigrationsStartForOrgRequest = {"repositories":["github/Hello-World"],"lock_repositories":true} // MigrationsStartForOrgRequest | 
try {
    val result : Migration = apiInstance.migrationsStartForOrg(org, migrationsStartForOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsStartForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsStartForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **migrationsStartForOrgRequest** | [**MigrationsStartForOrgRequest**](MigrationsStartForOrgRequest.md)|  |

### Return type

[**Migration**](Migration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="migrationsStartImport"></a>
# **migrationsStartImport**
> Import migrationsStartImport(owner, repo, migrationsStartImportRequest)

Start an import

Start a source import to a GitHub repository using GitHub Importer. Importing into a GitHub repository with GitHub Actions enabled is not supported and will return a status &#x60;422 Unprocessable Entity&#x60; response.  **Warning:** Due to very low levels of usage and available alternatives, this endpoint is deprecated and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives, see the [changelog](https://gh.io/source-imports-api-deprecation). 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val migrationsStartImportRequest : MigrationsStartImportRequest = {"vcs":"subversion","vcs_url":"http://svn.mycompany.com/svn/myproject","vcs_username":"octocat","vcs_password":"secret"} // MigrationsStartImportRequest | 
try {
    val result : Import = apiInstance.migrationsStartImport(owner, repo, migrationsStartImportRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsStartImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsStartImport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **migrationsStartImportRequest** | [**MigrationsStartImportRequest**](MigrationsStartImportRequest.md)|  |

### Return type

[**Import**](Import.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="migrationsUnlockRepoForAuthenticatedUser"></a>
# **migrationsUnlockRepoForAuthenticatedUser**
> migrationsUnlockRepoForAuthenticatedUser(migrationId, repoName)

Unlock a user repository

Unlocks a repository. You can lock repositories when you [start a user migration](https://docs.github.com/rest/migrations/users#start-a-user-migration). Once the migration is complete you can unlock each repository to begin using it again or [delete the repository](https://docs.github.com/rest/repos/repos#delete-a-repository) if you no longer need the source data. Returns a status of &#x60;404 Not Found&#x60; if the repository is not locked.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val migrationId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the migration.
val repoName : kotlin.String = repoName_example // kotlin.String | repo_name parameter
try {
    apiInstance.migrationsUnlockRepoForAuthenticatedUser(migrationId, repoName)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsUnlockRepoForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsUnlockRepoForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **migrationId** | **kotlin.Int**| The unique identifier of the migration. |
 **repoName** | **kotlin.String**| repo_name parameter |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="migrationsUnlockRepoForOrg"></a>
# **migrationsUnlockRepoForOrg**
> migrationsUnlockRepoForOrg(org, migrationId, repoName)

Unlock an organization repository

Unlocks a repository that was locked for migration. You should unlock each migrated repository and [delete them](https://docs.github.com/rest/repos/repos#delete-a-repository) when the migration is complete and you no longer need the source data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val migrationId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the migration.
val repoName : kotlin.String = repoName_example // kotlin.String | repo_name parameter
try {
    apiInstance.migrationsUnlockRepoForOrg(org, migrationId, repoName)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsUnlockRepoForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsUnlockRepoForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **migrationId** | **kotlin.Int**| The unique identifier of the migration. |
 **repoName** | **kotlin.String**| repo_name parameter |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="migrationsUpdateImport"></a>
# **migrationsUpdateImport**
> Import migrationsUpdateImport(owner, repo, migrationsUpdateImportRequest)

Update an import

An import can be updated with credentials or a project choice by passing in the appropriate parameters in this API request. If no parameters are provided, the import will be restarted.  Some servers (e.g. TFS servers) can have several projects at a single URL. In those cases the import progress will have the status &#x60;detection_found_multiple&#x60; and the Import Progress response will include a &#x60;project_choices&#x60; array. You can select the project to import by providing one of the objects in the &#x60;project_choices&#x60; array in the update request.  **Warning:** Due to very low levels of usage and available alternatives, this endpoint is deprecated and will no longer be available from 00:00 UTC on April 12, 2024. For more details and alternatives, see the [changelog](https://gh.io/source-imports-api-deprecation).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val migrationsUpdateImportRequest : MigrationsUpdateImportRequest = {"vcs_username":"octocat","vcs_password":"secret"} // MigrationsUpdateImportRequest | 
try {
    val result : Import = apiInstance.migrationsUpdateImport(owner, repo, migrationsUpdateImportRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#migrationsUpdateImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#migrationsUpdateImport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **migrationsUpdateImportRequest** | [**MigrationsUpdateImportRequest**](MigrationsUpdateImportRequest.md)|  | [optional]

### Return type

[**Import**](Import.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

