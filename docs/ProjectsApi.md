# ProjectsApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**projectsAddCollaborator**](ProjectsApi.md#projectsAddCollaborator) | **PUT** /projects/{project_id}/collaborators/{username} | Add project collaborator
[**projectsCreateCard**](ProjectsApi.md#projectsCreateCard) | **POST** /projects/columns/{column_id}/cards | Create a project card
[**projectsCreateColumn**](ProjectsApi.md#projectsCreateColumn) | **POST** /projects/{project_id}/columns | Create a project column
[**projectsCreateForAuthenticatedUser**](ProjectsApi.md#projectsCreateForAuthenticatedUser) | **POST** /user/projects | Create a user project
[**projectsCreateForOrg**](ProjectsApi.md#projectsCreateForOrg) | **POST** /orgs/{org}/projects | Create an organization project
[**projectsCreateForRepo**](ProjectsApi.md#projectsCreateForRepo) | **POST** /repos/{owner}/{repo}/projects | Create a repository project
[**projectsDelete**](ProjectsApi.md#projectsDelete) | **DELETE** /projects/{project_id} | Delete a project
[**projectsDeleteCard**](ProjectsApi.md#projectsDeleteCard) | **DELETE** /projects/columns/cards/{card_id} | Delete a project card
[**projectsDeleteColumn**](ProjectsApi.md#projectsDeleteColumn) | **DELETE** /projects/columns/{column_id} | Delete a project column
[**projectsGet**](ProjectsApi.md#projectsGet) | **GET** /projects/{project_id} | Get a project
[**projectsGetCard**](ProjectsApi.md#projectsGetCard) | **GET** /projects/columns/cards/{card_id} | Get a project card
[**projectsGetColumn**](ProjectsApi.md#projectsGetColumn) | **GET** /projects/columns/{column_id} | Get a project column
[**projectsGetPermissionForUser**](ProjectsApi.md#projectsGetPermissionForUser) | **GET** /projects/{project_id}/collaborators/{username}/permission | Get project permission for a user
[**projectsListCards**](ProjectsApi.md#projectsListCards) | **GET** /projects/columns/{column_id}/cards | List project cards
[**projectsListCollaborators**](ProjectsApi.md#projectsListCollaborators) | **GET** /projects/{project_id}/collaborators | List project collaborators
[**projectsListColumns**](ProjectsApi.md#projectsListColumns) | **GET** /projects/{project_id}/columns | List project columns
[**projectsListForOrg**](ProjectsApi.md#projectsListForOrg) | **GET** /orgs/{org}/projects | List organization projects
[**projectsListForRepo**](ProjectsApi.md#projectsListForRepo) | **GET** /repos/{owner}/{repo}/projects | List repository projects
[**projectsListForUser**](ProjectsApi.md#projectsListForUser) | **GET** /users/{username}/projects | List user projects
[**projectsMoveCard**](ProjectsApi.md#projectsMoveCard) | **POST** /projects/columns/cards/{card_id}/moves | Move a project card
[**projectsMoveColumn**](ProjectsApi.md#projectsMoveColumn) | **POST** /projects/columns/{column_id}/moves | Move a project column
[**projectsRemoveCollaborator**](ProjectsApi.md#projectsRemoveCollaborator) | **DELETE** /projects/{project_id}/collaborators/{username} | Remove user as a collaborator
[**projectsUpdate**](ProjectsApi.md#projectsUpdate) | **PATCH** /projects/{project_id} | Update a project
[**projectsUpdateCard**](ProjectsApi.md#projectsUpdateCard) | **PATCH** /projects/columns/cards/{card_id} | Update an existing project card
[**projectsUpdateColumn**](ProjectsApi.md#projectsUpdateColumn) | **PATCH** /projects/columns/{column_id} | Update an existing project column


<a id="projectsAddCollaborator"></a>
# **projectsAddCollaborator**
> projectsAddCollaborator(projectId, username, projectsAddCollaboratorRequest)

Add project collaborator

Adds a collaborator to an organization project and sets their permission level. You must be an organization owner or a project &#x60;admin&#x60; to add a collaborator.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the project.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val projectsAddCollaboratorRequest : ProjectsAddCollaboratorRequest = {"permission":"write"} // ProjectsAddCollaboratorRequest | 
try {
    apiInstance.projectsAddCollaborator(projectId, username, projectsAddCollaboratorRequest)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsAddCollaborator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsAddCollaborator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.Int**| The unique identifier of the project. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **projectsAddCollaboratorRequest** | [**ProjectsAddCollaboratorRequest**](ProjectsAddCollaboratorRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="projectsCreateCard"></a>
# **projectsCreateCard**
> ProjectCard projectsCreateCard(columnId, projectsCreateCardRequest)

Create a project card



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val columnId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the column.
val projectsCreateCardRequest : ProjectsCreateCardRequest = {"note":"Add payload for delete Project column"} // ProjectsCreateCardRequest | 
try {
    val result : ProjectCard = apiInstance.projectsCreateCard(columnId, projectsCreateCardRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsCreateCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsCreateCard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columnId** | **kotlin.Int**| The unique identifier of the column. |
 **projectsCreateCardRequest** | [**ProjectsCreateCardRequest**](ProjectsCreateCardRequest.md)|  |

### Return type

[**ProjectCard**](ProjectCard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="projectsCreateColumn"></a>
# **projectsCreateColumn**
> ProjectColumn projectsCreateColumn(projectId, projectsUpdateColumnRequest)

Create a project column

Creates a new project column.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the project.
val projectsUpdateColumnRequest : ProjectsUpdateColumnRequest = {"name":"Remaining tasks"} // ProjectsUpdateColumnRequest | 
try {
    val result : ProjectColumn = apiInstance.projectsCreateColumn(projectId, projectsUpdateColumnRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsCreateColumn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsCreateColumn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.Int**| The unique identifier of the project. |
 **projectsUpdateColumnRequest** | [**ProjectsUpdateColumnRequest**](ProjectsUpdateColumnRequest.md)|  |

### Return type

[**ProjectColumn**](ProjectColumn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="projectsCreateForAuthenticatedUser"></a>
# **projectsCreateForAuthenticatedUser**
> Project projectsCreateForAuthenticatedUser(projectsCreateForAuthenticatedUserRequest)

Create a user project

Creates a user project board. Returns a &#x60;410 Gone&#x60; status if the user does not have existing classic projects. If you do not have sufficient privileges to perform this action, a &#x60;401 Unauthorized&#x60; or &#x60;410 Gone&#x60; status is returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectsCreateForAuthenticatedUserRequest : ProjectsCreateForAuthenticatedUserRequest = {"name":"My Projects","body":"A board to manage my personal projects."} // ProjectsCreateForAuthenticatedUserRequest | 
try {
    val result : Project = apiInstance.projectsCreateForAuthenticatedUser(projectsCreateForAuthenticatedUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsCreateForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsCreateForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectsCreateForAuthenticatedUserRequest** | [**ProjectsCreateForAuthenticatedUserRequest**](ProjectsCreateForAuthenticatedUserRequest.md)|  |

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="projectsCreateForOrg"></a>
# **projectsCreateForOrg**
> Project projectsCreateForOrg(org, projectsCreateForOrgRequest)

Create an organization project

Creates an organization project board. Returns a &#x60;410 Gone&#x60; status if projects are disabled in the organization or if the organization does not have existing classic projects. If you do not have sufficient privileges to perform this action, a &#x60;401 Unauthorized&#x60; or &#x60;410 Gone&#x60; status is returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val projectsCreateForOrgRequest : ProjectsCreateForOrgRequest = {"name":"Organization Roadmap","body":"High-level roadmap for the upcoming year."} // ProjectsCreateForOrgRequest | 
try {
    val result : Project = apiInstance.projectsCreateForOrg(org, projectsCreateForOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsCreateForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsCreateForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **projectsCreateForOrgRequest** | [**ProjectsCreateForOrgRequest**](ProjectsCreateForOrgRequest.md)|  |

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="projectsCreateForRepo"></a>
# **projectsCreateForRepo**
> Project projectsCreateForRepo(owner, repo, projectsCreateForOrgRequest)

Create a repository project

Creates a repository project board. Returns a &#x60;410 Gone&#x60; status if projects are disabled in the repository or if the repository does not have existing classic projects. If you do not have sufficient privileges to perform this action, a &#x60;401 Unauthorized&#x60; or &#x60;410 Gone&#x60; status is returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val projectsCreateForOrgRequest : ProjectsCreateForOrgRequest = {"name":"Projects Documentation","body":"Developer documentation project for the developer site."} // ProjectsCreateForOrgRequest | 
try {
    val result : Project = apiInstance.projectsCreateForRepo(owner, repo, projectsCreateForOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsCreateForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsCreateForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **projectsCreateForOrgRequest** | [**ProjectsCreateForOrgRequest**](ProjectsCreateForOrgRequest.md)|  |

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="projectsDelete"></a>
# **projectsDelete**
> projectsDelete(projectId)

Delete a project

Deletes a project board. Returns a &#x60;404 Not Found&#x60; status if projects are disabled.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the project.
try {
    apiInstance.projectsDelete(projectId)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.Int**| The unique identifier of the project. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="projectsDeleteCard"></a>
# **projectsDeleteCard**
> projectsDeleteCard(cardId)

Delete a project card

Deletes a project card

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val cardId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the card.
try {
    apiInstance.projectsDeleteCard(cardId)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsDeleteCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsDeleteCard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **kotlin.Int**| The unique identifier of the card. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="projectsDeleteColumn"></a>
# **projectsDeleteColumn**
> projectsDeleteColumn(columnId)

Delete a project column

Deletes a project column.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val columnId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the column.
try {
    apiInstance.projectsDeleteColumn(columnId)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsDeleteColumn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsDeleteColumn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columnId** | **kotlin.Int**| The unique identifier of the column. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="projectsGet"></a>
# **projectsGet**
> Project projectsGet(projectId)

Get a project

Gets a project by its &#x60;id&#x60;. Returns a &#x60;404 Not Found&#x60; status if projects are disabled. If you do not have sufficient privileges to perform this action, a &#x60;401 Unauthorized&#x60; or &#x60;410 Gone&#x60; status is returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the project.
try {
    val result : Project = apiInstance.projectsGet(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.Int**| The unique identifier of the project. |

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="projectsGetCard"></a>
# **projectsGetCard**
> ProjectCard projectsGetCard(cardId)

Get a project card

Gets information about a project card.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val cardId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the card.
try {
    val result : ProjectCard = apiInstance.projectsGetCard(cardId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsGetCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsGetCard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **kotlin.Int**| The unique identifier of the card. |

### Return type

[**ProjectCard**](ProjectCard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="projectsGetColumn"></a>
# **projectsGetColumn**
> ProjectColumn projectsGetColumn(columnId)

Get a project column

Gets information about a project column.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val columnId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the column.
try {
    val result : ProjectColumn = apiInstance.projectsGetColumn(columnId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsGetColumn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsGetColumn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columnId** | **kotlin.Int**| The unique identifier of the column. |

### Return type

[**ProjectColumn**](ProjectColumn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="projectsGetPermissionForUser"></a>
# **projectsGetPermissionForUser**
> ProjectCollaboratorPermission projectsGetPermissionForUser(projectId, username)

Get project permission for a user

Returns the collaborator&#39;s permission level for an organization project. Possible values for the &#x60;permission&#x60; key: &#x60;admin&#x60;, &#x60;write&#x60;, &#x60;read&#x60;, &#x60;none&#x60;. You must be an organization owner or a project &#x60;admin&#x60; to review a user&#39;s permission level.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the project.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    val result : ProjectCollaboratorPermission = apiInstance.projectsGetPermissionForUser(projectId, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsGetPermissionForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsGetPermissionForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.Int**| The unique identifier of the project. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

[**ProjectCollaboratorPermission**](ProjectCollaboratorPermission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="projectsListCards"></a>
# **projectsListCards**
> kotlin.collections.List&lt;ProjectCard&gt; projectsListCards(columnId, archivedState, perPage, page)

List project cards

Lists the project cards in a project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val columnId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the column.
val archivedState : kotlin.String = archivedState_example // kotlin.String | Filters the project cards that are returned by the card's state.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<ProjectCard> = apiInstance.projectsListCards(columnId, archivedState, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsListCards")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsListCards")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columnId** | **kotlin.Int**| The unique identifier of the column. |
 **archivedState** | **kotlin.String**| Filters the project cards that are returned by the card&#39;s state. | [optional] [default to not_archived] [enum: all, archived, not_archived]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;ProjectCard&gt;**](ProjectCard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="projectsListCollaborators"></a>
# **projectsListCollaborators**
> kotlin.collections.List&lt;SimpleUser&gt; projectsListCollaborators(projectId, affiliation, perPage, page)

List project collaborators

Lists the collaborators for an organization project. For a project, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. You must be an organization owner or a project &#x60;admin&#x60; to list collaborators.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the project.
val affiliation : kotlin.String = affiliation_example // kotlin.String | Filters the collaborators by their affiliation. `outside` means outside collaborators of a project that are not a member of the project's organization. `direct` means collaborators with permissions to a project, regardless of organization membership status. `all` means all collaborators the authenticated user can see.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.projectsListCollaborators(projectId, affiliation, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsListCollaborators")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsListCollaborators")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.Int**| The unique identifier of the project. |
 **affiliation** | **kotlin.String**| Filters the collaborators by their affiliation. &#x60;outside&#x60; means outside collaborators of a project that are not a member of the project&#39;s organization. &#x60;direct&#x60; means collaborators with permissions to a project, regardless of organization membership status. &#x60;all&#x60; means all collaborators the authenticated user can see. | [optional] [default to all] [enum: outside, direct, all]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="projectsListColumns"></a>
# **projectsListColumns**
> kotlin.collections.List&lt;ProjectColumn&gt; projectsListColumns(projectId, perPage, page)

List project columns

Lists the project columns in a project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the project.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<ProjectColumn> = apiInstance.projectsListColumns(projectId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsListColumns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsListColumns")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.Int**| The unique identifier of the project. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;ProjectColumn&gt;**](ProjectColumn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="projectsListForOrg"></a>
# **projectsListForOrg**
> kotlin.collections.List&lt;Project&gt; projectsListForOrg(org, state, perPage, page)

List organization projects

Lists the projects in an organization. Returns a &#x60;404 Not Found&#x60; status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a &#x60;401 Unauthorized&#x60; or &#x60;410 Gone&#x60; status is returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val state : kotlin.String = state_example // kotlin.String | Indicates the state of the projects to return.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Project> = apiInstance.projectsListForOrg(org, state, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsListForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsListForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **state** | **kotlin.String**| Indicates the state of the projects to return. | [optional] [default to open] [enum: open, closed, all]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Project&gt;**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="projectsListForRepo"></a>
# **projectsListForRepo**
> kotlin.collections.List&lt;Project&gt; projectsListForRepo(owner, repo, state, perPage, page)

List repository projects

Lists the projects in a repository. Returns a &#x60;404 Not Found&#x60; status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a &#x60;401 Unauthorized&#x60; or &#x60;410 Gone&#x60; status is returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val state : kotlin.String = state_example // kotlin.String | Indicates the state of the projects to return.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Project> = apiInstance.projectsListForRepo(owner, repo, state, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsListForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsListForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **state** | **kotlin.String**| Indicates the state of the projects to return. | [optional] [default to open] [enum: open, closed, all]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Project&gt;**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="projectsListForUser"></a>
# **projectsListForUser**
> kotlin.collections.List&lt;Project&gt; projectsListForUser(username, state, perPage, page)

List user projects

Lists projects for a user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val state : kotlin.String = state_example // kotlin.String | Indicates the state of the projects to return.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Project> = apiInstance.projectsListForUser(username, state, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsListForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsListForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **state** | **kotlin.String**| Indicates the state of the projects to return. | [optional] [default to open] [enum: open, closed, all]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Project&gt;**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="projectsMoveCard"></a>
# **projectsMoveCard**
> kotlin.Any projectsMoveCard(cardId, projectsMoveCardRequest)

Move a project card



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val cardId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the card.
val projectsMoveCardRequest : ProjectsMoveCardRequest = {"column_id":42,"position":"bottom"} // ProjectsMoveCardRequest | 
try {
    val result : kotlin.Any = apiInstance.projectsMoveCard(cardId, projectsMoveCardRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsMoveCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsMoveCard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **kotlin.Int**| The unique identifier of the card. |
 **projectsMoveCardRequest** | [**ProjectsMoveCardRequest**](ProjectsMoveCardRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="projectsMoveColumn"></a>
# **projectsMoveColumn**
> kotlin.Any projectsMoveColumn(columnId, projectsMoveColumnRequest)

Move a project column



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val columnId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the column.
val projectsMoveColumnRequest : ProjectsMoveColumnRequest = {"position":"last"} // ProjectsMoveColumnRequest | 
try {
    val result : kotlin.Any = apiInstance.projectsMoveColumn(columnId, projectsMoveColumnRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsMoveColumn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsMoveColumn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columnId** | **kotlin.Int**| The unique identifier of the column. |
 **projectsMoveColumnRequest** | [**ProjectsMoveColumnRequest**](ProjectsMoveColumnRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="projectsRemoveCollaborator"></a>
# **projectsRemoveCollaborator**
> projectsRemoveCollaborator(projectId, username)

Remove user as a collaborator

Removes a collaborator from an organization project. You must be an organization owner or a project &#x60;admin&#x60; to remove a collaborator.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the project.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.projectsRemoveCollaborator(projectId, username)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsRemoveCollaborator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsRemoveCollaborator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.Int**| The unique identifier of the project. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="projectsUpdate"></a>
# **projectsUpdate**
> Project projectsUpdate(projectId, projectsUpdateRequest)

Update a project

Updates a project board&#39;s information. Returns a &#x60;404 Not Found&#x60; status if projects are disabled. If you do not have sufficient privileges to perform this action, a &#x60;401 Unauthorized&#x60; or &#x60;410 Gone&#x60; status is returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the project.
val projectsUpdateRequest : ProjectsUpdateRequest = {"name":"Week One Sprint","state":"open","organization_permission":"write"} // ProjectsUpdateRequest | 
try {
    val result : Project = apiInstance.projectsUpdate(projectId, projectsUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **kotlin.Int**| The unique identifier of the project. |
 **projectsUpdateRequest** | [**ProjectsUpdateRequest**](ProjectsUpdateRequest.md)|  | [optional]

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="projectsUpdateCard"></a>
# **projectsUpdateCard**
> ProjectCard projectsUpdateCard(cardId, projectsUpdateCardRequest)

Update an existing project card



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val cardId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the card.
val projectsUpdateCardRequest : ProjectsUpdateCardRequest = {"note":"Add payload for delete Project column"} // ProjectsUpdateCardRequest | 
try {
    val result : ProjectCard = apiInstance.projectsUpdateCard(cardId, projectsUpdateCardRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsUpdateCard")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsUpdateCard")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **kotlin.Int**| The unique identifier of the card. |
 **projectsUpdateCardRequest** | [**ProjectsUpdateCardRequest**](ProjectsUpdateCardRequest.md)|  | [optional]

### Return type

[**ProjectCard**](ProjectCard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="projectsUpdateColumn"></a>
# **projectsUpdateColumn**
> ProjectColumn projectsUpdateColumn(columnId, projectsUpdateColumnRequest)

Update an existing project column



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val columnId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the column.
val projectsUpdateColumnRequest : ProjectsUpdateColumnRequest = {"name":"To Do"} // ProjectsUpdateColumnRequest | 
try {
    val result : ProjectColumn = apiInstance.projectsUpdateColumn(columnId, projectsUpdateColumnRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#projectsUpdateColumn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#projectsUpdateColumn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columnId** | **kotlin.Int**| The unique identifier of the column. |
 **projectsUpdateColumnRequest** | [**ProjectsUpdateColumnRequest**](ProjectsUpdateColumnRequest.md)|  |

### Return type

[**ProjectColumn**](ProjectColumn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

