# GistsApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gistsCheckIsStarred**](GistsApi.md#gistsCheckIsStarred) | **GET** /gists/{gist_id}/star | Check if a gist is starred
[**gistsCreate**](GistsApi.md#gistsCreate) | **POST** /gists | Create a gist
[**gistsCreateComment**](GistsApi.md#gistsCreateComment) | **POST** /gists/{gist_id}/comments | Create a gist comment
[**gistsDelete**](GistsApi.md#gistsDelete) | **DELETE** /gists/{gist_id} | Delete a gist
[**gistsDeleteComment**](GistsApi.md#gistsDeleteComment) | **DELETE** /gists/{gist_id}/comments/{comment_id} | Delete a gist comment
[**gistsFork**](GistsApi.md#gistsFork) | **POST** /gists/{gist_id}/forks | Fork a gist
[**gistsGet**](GistsApi.md#gistsGet) | **GET** /gists/{gist_id} | Get a gist
[**gistsGetComment**](GistsApi.md#gistsGetComment) | **GET** /gists/{gist_id}/comments/{comment_id} | Get a gist comment
[**gistsGetRevision**](GistsApi.md#gistsGetRevision) | **GET** /gists/{gist_id}/{sha} | Get a gist revision
[**gistsList**](GistsApi.md#gistsList) | **GET** /gists | List gists for the authenticated user
[**gistsListComments**](GistsApi.md#gistsListComments) | **GET** /gists/{gist_id}/comments | List gist comments
[**gistsListCommits**](GistsApi.md#gistsListCommits) | **GET** /gists/{gist_id}/commits | List gist commits
[**gistsListForUser**](GistsApi.md#gistsListForUser) | **GET** /users/{username}/gists | List gists for a user
[**gistsListForks**](GistsApi.md#gistsListForks) | **GET** /gists/{gist_id}/forks | List gist forks
[**gistsListPublic**](GistsApi.md#gistsListPublic) | **GET** /gists/public | List public gists
[**gistsListStarred**](GistsApi.md#gistsListStarred) | **GET** /gists/starred | List starred gists
[**gistsStar**](GistsApi.md#gistsStar) | **PUT** /gists/{gist_id}/star | Star a gist
[**gistsUnstar**](GistsApi.md#gistsUnstar) | **DELETE** /gists/{gist_id}/star | Unstar a gist
[**gistsUpdate**](GistsApi.md#gistsUpdate) | **PATCH** /gists/{gist_id} | Update a gist
[**gistsUpdateComment**](GistsApi.md#gistsUpdateComment) | **PATCH** /gists/{gist_id}/comments/{comment_id} | Update a gist comment


<a id="gistsCheckIsStarred"></a>
# **gistsCheckIsStarred**
> gistsCheckIsStarred(gistId)

Check if a gist is starred



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val gistId : kotlin.String = gistId_example // kotlin.String | The unique identifier of the gist.
try {
    apiInstance.gistsCheckIsStarred(gistId)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsCheckIsStarred")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsCheckIsStarred")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gistId** | **kotlin.String**| The unique identifier of the gist. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gistsCreate"></a>
# **gistsCreate**
> GistSimple gistsCreate(gistsCreateRequest)

Create a gist

Allows you to add a new gist with one or more files.  **Note:** Don&#39;t name your files \&quot;gistfile\&quot; with a numerical suffix. This is the format of the automatic naming scheme that Gist uses internally.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val gistsCreateRequest : GistsCreateRequest = {"description":"Example of a gist","public":false,"files":{"README.md":{"content":"Hello World"}}} // GistsCreateRequest | 
try {
    val result : GistSimple = apiInstance.gistsCreate(gistsCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gistsCreateRequest** | [**GistsCreateRequest**](GistsCreateRequest.md)|  |

### Return type

[**GistSimple**](GistSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="gistsCreateComment"></a>
# **gistsCreateComment**
> GistComment gistsCreateComment(gistId, gistsCreateCommentRequest)

Create a gist comment

Creates a comment on a gist.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.base64+json&#x60;**: Returns the base64-encoded contents. This can be useful if your gist contains any invalid UTF-8 sequences.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val gistId : kotlin.String = gistId_example // kotlin.String | The unique identifier of the gist.
val gistsCreateCommentRequest : GistsCreateCommentRequest = {"body":"This is a comment to a gist"} // GistsCreateCommentRequest | 
try {
    val result : GistComment = apiInstance.gistsCreateComment(gistId, gistsCreateCommentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsCreateComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsCreateComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gistId** | **kotlin.String**| The unique identifier of the gist. |
 **gistsCreateCommentRequest** | [**GistsCreateCommentRequest**](GistsCreateCommentRequest.md)|  |

### Return type

[**GistComment**](GistComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="gistsDelete"></a>
# **gistsDelete**
> gistsDelete(gistId)

Delete a gist



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val gistId : kotlin.String = gistId_example // kotlin.String | The unique identifier of the gist.
try {
    apiInstance.gistsDelete(gistId)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gistId** | **kotlin.String**| The unique identifier of the gist. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gistsDeleteComment"></a>
# **gistsDeleteComment**
> gistsDeleteComment(gistId, commentId)

Delete a gist comment



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val gistId : kotlin.String = gistId_example // kotlin.String | The unique identifier of the gist.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
try {
    apiInstance.gistsDeleteComment(gistId, commentId)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsDeleteComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsDeleteComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gistId** | **kotlin.String**| The unique identifier of the gist. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gistsFork"></a>
# **gistsFork**
> BaseGist gistsFork(gistId)

Fork a gist



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val gistId : kotlin.String = gistId_example // kotlin.String | The unique identifier of the gist.
try {
    val result : BaseGist = apiInstance.gistsFork(gistId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsFork")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsFork")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gistId** | **kotlin.String**| The unique identifier of the gist. |

### Return type

[**BaseGist**](BaseGist.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gistsGet"></a>
# **gistsGet**
> GistSimple gistsGet(gistId)

Get a gist

Gets a specified gist.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.base64+json&#x60;**: Returns the base64-encoded contents. This can be useful if your gist contains any invalid UTF-8 sequences.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val gistId : kotlin.String = gistId_example // kotlin.String | The unique identifier of the gist.
try {
    val result : GistSimple = apiInstance.gistsGet(gistId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gistId** | **kotlin.String**| The unique identifier of the gist. |

### Return type

[**GistSimple**](GistSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gistsGetComment"></a>
# **gistsGetComment**
> GistComment gistsGetComment(gistId, commentId)

Get a gist comment

Gets a comment on a gist.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.base64+json&#x60;**: Returns the base64-encoded contents. This can be useful if your gist contains any invalid UTF-8 sequences.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val gistId : kotlin.String = gistId_example // kotlin.String | The unique identifier of the gist.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
try {
    val result : GistComment = apiInstance.gistsGetComment(gistId, commentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsGetComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsGetComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gistId** | **kotlin.String**| The unique identifier of the gist. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |

### Return type

[**GistComment**](GistComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gistsGetRevision"></a>
# **gistsGetRevision**
> GistSimple gistsGetRevision(gistId, sha)

Get a gist revision

Gets a specified gist revision.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.base64+json&#x60;**: Returns the base64-encoded contents. This can be useful if your gist contains any invalid UTF-8 sequences.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val gistId : kotlin.String = gistId_example // kotlin.String | The unique identifier of the gist.
val sha : kotlin.String = sha_example // kotlin.String | 
try {
    val result : GistSimple = apiInstance.gistsGetRevision(gistId, sha)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsGetRevision")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsGetRevision")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gistId** | **kotlin.String**| The unique identifier of the gist. |
 **sha** | **kotlin.String**|  | [default to &quot;push&quot;]

### Return type

[**GistSimple**](GistSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gistsList"></a>
# **gistsList**
> kotlin.collections.List&lt;BaseGist&gt; gistsList(since, perPage, page)

List gists for the authenticated user

Lists the authenticated user&#39;s gists or if called anonymously, this endpoint returns all public gists:

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val since : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<BaseGist> = apiInstance.gistsList(since, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **kotlinx.datetime.Instant**| Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;BaseGist&gt;**](BaseGist.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gistsListComments"></a>
# **gistsListComments**
> kotlin.collections.List&lt;GistComment&gt; gistsListComments(gistId, perPage, page)

List gist comments

Lists the comments on a gist.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.base64+json&#x60;**: Returns the base64-encoded contents. This can be useful if your gist contains any invalid UTF-8 sequences.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val gistId : kotlin.String = gistId_example // kotlin.String | The unique identifier of the gist.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<GistComment> = apiInstance.gistsListComments(gistId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsListComments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsListComments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gistId** | **kotlin.String**| The unique identifier of the gist. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;GistComment&gt;**](GistComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gistsListCommits"></a>
# **gistsListCommits**
> kotlin.collections.List&lt;GistCommit&gt; gistsListCommits(gistId, perPage, page)

List gist commits



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val gistId : kotlin.String = gistId_example // kotlin.String | The unique identifier of the gist.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<GistCommit> = apiInstance.gistsListCommits(gistId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsListCommits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsListCommits")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gistId** | **kotlin.String**| The unique identifier of the gist. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;GistCommit&gt;**](GistCommit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gistsListForUser"></a>
# **gistsListForUser**
> kotlin.collections.List&lt;BaseGist&gt; gistsListForUser(username, since, perPage, page)

List gists for a user

Lists public gists for the specified user:

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val since : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<BaseGist> = apiInstance.gistsListForUser(username, since, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsListForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsListForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **since** | **kotlinx.datetime.Instant**| Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;BaseGist&gt;**](BaseGist.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gistsListForks"></a>
# **gistsListForks**
> kotlin.collections.List&lt;GistSimple&gt; gistsListForks(gistId, perPage, page)

List gist forks



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val gistId : kotlin.String = gistId_example // kotlin.String | The unique identifier of the gist.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<GistSimple> = apiInstance.gistsListForks(gistId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsListForks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsListForks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gistId** | **kotlin.String**| The unique identifier of the gist. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;GistSimple&gt;**](GistSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gistsListPublic"></a>
# **gistsListPublic**
> kotlin.collections.List&lt;BaseGist&gt; gistsListPublic(since, perPage, page)

List public gists

List public gists sorted by most recently updated to least recently updated.  Note: With [pagination](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api), you can fetch up to 3000 gists. For example, you can fetch 100 pages with 30 gists per page or 30 pages with 100 gists per page.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val since : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<BaseGist> = apiInstance.gistsListPublic(since, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsListPublic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsListPublic")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **kotlinx.datetime.Instant**| Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;BaseGist&gt;**](BaseGist.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gistsListStarred"></a>
# **gistsListStarred**
> kotlin.collections.List&lt;BaseGist&gt; gistsListStarred(since, perPage, page)

List starred gists

List the authenticated user&#39;s starred gists:

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val since : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<BaseGist> = apiInstance.gistsListStarred(since, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsListStarred")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsListStarred")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **kotlinx.datetime.Instant**| Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;BaseGist&gt;**](BaseGist.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gistsStar"></a>
# **gistsStar**
> gistsStar(gistId)

Star a gist

Note that you&#39;ll need to set &#x60;Content-Length&#x60; to zero when calling out to this endpoint. For more information, see \&quot;[HTTP method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val gistId : kotlin.String = gistId_example // kotlin.String | The unique identifier of the gist.
try {
    apiInstance.gistsStar(gistId)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsStar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsStar")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gistId** | **kotlin.String**| The unique identifier of the gist. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gistsUnstar"></a>
# **gistsUnstar**
> gistsUnstar(gistId)

Unstar a gist



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val gistId : kotlin.String = gistId_example // kotlin.String | The unique identifier of the gist.
try {
    apiInstance.gistsUnstar(gistId)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsUnstar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsUnstar")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gistId** | **kotlin.String**| The unique identifier of the gist. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gistsUpdate"></a>
# **gistsUpdate**
> GistSimple gistsUpdate(gistId, gistsUpdateRequest)

Update a gist

Allows you to update a gist&#39;s description and to update, delete, or rename gist files. Files from the previous version of the gist that aren&#39;t explicitly changed during an edit are unchanged.  At least one of &#x60;description&#x60; or &#x60;files&#x60; is required.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.base64+json&#x60;**: Returns the base64-encoded contents. This can be useful if your gist contains any invalid UTF-8 sequences.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val gistId : kotlin.String = gistId_example // kotlin.String | The unique identifier of the gist.
val gistsUpdateRequest : GistsUpdateRequest = {"description":"An updated gist description","files":{"README.md":{"content":"Hello World from GitHub"}}} // GistsUpdateRequest | 
try {
    val result : GistSimple = apiInstance.gistsUpdate(gistId, gistsUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gistId** | **kotlin.String**| The unique identifier of the gist. |
 **gistsUpdateRequest** | [**GistsUpdateRequest**](GistsUpdateRequest.md)|  |

### Return type

[**GistSimple**](GistSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="gistsUpdateComment"></a>
# **gistsUpdateComment**
> GistComment gistsUpdateComment(gistId, commentId, gistsCreateCommentRequest)

Update a gist comment

Updates a comment on a gist.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw markdown. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github.base64+json&#x60;**: Returns the base64-encoded contents. This can be useful if your gist contains any invalid UTF-8 sequences.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GistsApi()
val gistId : kotlin.String = gistId_example // kotlin.String | The unique identifier of the gist.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
val gistsCreateCommentRequest : GistsCreateCommentRequest = {"body":"This is an update to a comment in a gist"} // GistsCreateCommentRequest | 
try {
    val result : GistComment = apiInstance.gistsUpdateComment(gistId, commentId, gistsCreateCommentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GistsApi#gistsUpdateComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GistsApi#gistsUpdateComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gistId** | **kotlin.String**| The unique identifier of the gist. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |
 **gistsCreateCommentRequest** | [**GistsCreateCommentRequest**](GistsCreateCommentRequest.md)|  |

### Return type

[**GistComment**](GistComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

