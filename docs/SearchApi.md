# SearchApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchCode**](SearchApi.md#searchCode) | **GET** /search/code | Search code
[**searchCommits**](SearchApi.md#searchCommits) | **GET** /search/commits | Search commits
[**searchIssuesAndPullRequests**](SearchApi.md#searchIssuesAndPullRequests) | **GET** /search/issues | Search issues and pull requests
[**searchLabels**](SearchApi.md#searchLabels) | **GET** /search/labels | Search labels
[**searchRepos**](SearchApi.md#searchRepos) | **GET** /search/repositories | Search repositories
[**searchTopics**](SearchApi.md#searchTopics) | **GET** /search/topics | Search topics
[**searchUsers**](SearchApi.md#searchUsers) | **GET** /search/users | Search users


<a id="searchCode"></a>
# **searchCode**
> SearchCode200Response searchCode(q, sort, order, perPage, page)

Search code

Searches for query terms inside of a file. This method returns up to 100 results [per page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).  When searching for code, you can get text match metadata for the file **content** and file **path** fields when you pass the &#x60;text-match&#x60; media type. For more details about how to receive highlighted search results, see [Text match metadata](https://docs.github.com/rest/search/search#text-match-metadata).  For example, if you want to find the definition of the &#x60;addClass&#x60; function inside [jQuery](https://github.com/jquery/jquery) repository, your query would look something like this:  &#x60;q&#x3D;addClass+in:file+language:js+repo:jquery/jquery&#x60;  This query searches for the keyword &#x60;addClass&#x60; within a file&#39;s contents. The query limits the search to files where the language is JavaScript in the &#x60;jquery/jquery&#x60; repository.  Considerations for code search:  Due to the complexity of searching code, there are a few restrictions on how searches are performed:  *   Only the _default branch_ is considered. In most cases, this will be the &#x60;master&#x60; branch. *   Only files smaller than 384 KB are searchable. *   You must always include at least one search term when searching source code. For example, searching for [&#x60;language:go&#x60;](https://github.com/search?utf8&#x3D;%E2%9C%93&amp;q&#x3D;language%3Ago&amp;type&#x3D;Code) is not valid, while [&#x60;amazing language:go&#x60;](https://github.com/search?utf8&#x3D;%E2%9C%93&amp;q&#x3D;amazing+language%3Ago&amp;type&#x3D;Code) is.  This endpoint requires you to authenticate and limits you to 10 requests per minute.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SearchApi()
val q : kotlin.String = q_example // kotlin.String | The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn more about the format of the query, see [Constructing a search query](https://docs.github.com/rest/search/search#constructing-a-search-query). See \"[Searching code](https://docs.github.com/search-github/searching-on-github/searching-code)\" for a detailed list of qualifiers.
val sort : kotlin.String = sort_example // kotlin.String | **This field is deprecated.** Sorts the results of your query. Can only be `indexed`, which indicates how recently a file has been indexed by the GitHub search infrastructure. Default: [best match](https://docs.github.com/rest/search/search#ranking-search-results)
val order : kotlin.String = order_example // kotlin.String | **This field is deprecated.** Determines whether the first search result returned is the highest number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`. 
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : SearchCode200Response = apiInstance.searchCode(q, sort, order, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#searchCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#searchCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**| The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn more about the format of the query, see [Constructing a search query](https://docs.github.com/rest/search/search#constructing-a-search-query). See \&quot;[Searching code](https://docs.github.com/search-github/searching-on-github/searching-code)\&quot; for a detailed list of qualifiers. | [default to &quot;push&quot;]
 **sort** | **kotlin.String**| **This field is deprecated.** Sorts the results of your query. Can only be &#x60;indexed&#x60;, which indicates how recently a file has been indexed by the GitHub search infrastructure. Default: [best match](https://docs.github.com/rest/search/search#ranking-search-results) | [optional] [enum: indexed]
 **order** | **kotlin.String**| **This field is deprecated.** Determines whether the first search result returned is the highest number of matches (&#x60;desc&#x60;) or lowest number of matches (&#x60;asc&#x60;). This parameter is ignored unless you provide &#x60;sort&#x60;.  | [optional] [default to desc] [enum: desc, asc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**SearchCode200Response**](SearchCode200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="searchCommits"></a>
# **searchCommits**
> SearchCommits200Response searchCommits(q, sort, order, perPage, page)

Search commits

Find commits via various criteria on the default branch (usually &#x60;main&#x60;). This method returns up to 100 results [per page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).  When searching for commits, you can get text match metadata for the **message** field when you provide the &#x60;text-match&#x60; media type. For more details about how to receive highlighted search results, see [Text match metadata](https://docs.github.com/rest/search/search#text-match-metadata).  For example, if you want to find commits related to CSS in the [octocat/Spoon-Knife](https://github.com/octocat/Spoon-Knife) repository. Your query would look something like this:  &#x60;q&#x3D;repo:octocat/Spoon-Knife+css&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SearchApi()
val q : kotlin.String = q_example // kotlin.String | The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn more about the format of the query, see [Constructing a search query](https://docs.github.com/rest/search/search#constructing-a-search-query). See \"[Searching commits](https://docs.github.com/search-github/searching-on-github/searching-commits)\" for a detailed list of qualifiers.
val sort : kotlin.String = sort_example // kotlin.String | Sorts the results of your query by `author-date` or `committer-date`. Default: [best match](https://docs.github.com/rest/search/search#ranking-search-results)
val order : kotlin.String = order_example // kotlin.String | Determines whether the first search result returned is the highest number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : SearchCommits200Response = apiInstance.searchCommits(q, sort, order, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#searchCommits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#searchCommits")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**| The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn more about the format of the query, see [Constructing a search query](https://docs.github.com/rest/search/search#constructing-a-search-query). See \&quot;[Searching commits](https://docs.github.com/search-github/searching-on-github/searching-commits)\&quot; for a detailed list of qualifiers. | [default to &quot;push&quot;]
 **sort** | **kotlin.String**| Sorts the results of your query by &#x60;author-date&#x60; or &#x60;committer-date&#x60;. Default: [best match](https://docs.github.com/rest/search/search#ranking-search-results) | [optional] [enum: author-date, committer-date]
 **order** | **kotlin.String**| Determines whether the first search result returned is the highest number of matches (&#x60;desc&#x60;) or lowest number of matches (&#x60;asc&#x60;). This parameter is ignored unless you provide &#x60;sort&#x60;. | [optional] [default to desc] [enum: desc, asc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**SearchCommits200Response**](SearchCommits200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="searchIssuesAndPullRequests"></a>
# **searchIssuesAndPullRequests**
> SearchIssuesAndPullRequests200Response searchIssuesAndPullRequests(q, sort, order, perPage, page)

Search issues and pull requests

Find issues by state and keyword. This method returns up to 100 results [per page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).  When searching for issues, you can get text match metadata for the issue **title**, issue **body**, and issue **comment body** fields when you pass the &#x60;text-match&#x60; media type. For more details about how to receive highlighted search results, see [Text match metadata](https://docs.github.com/rest/search/search#text-match-metadata).  For example, if you want to find the oldest unresolved Python bugs on Windows. Your query might look something like this.  &#x60;q&#x3D;windows+label:bug+language:python+state:open&amp;sort&#x3D;created&amp;order&#x3D;asc&#x60;  This query searches for the keyword &#x60;windows&#x60;, within any open issue that is labeled as &#x60;bug&#x60;. The search runs across repositories whose primary language is Python. The results are sorted by creation date in ascending order, which means the oldest issues appear first in the search results.  **Note:** For requests made by GitHub Apps with a user access token, you can&#39;t retrieve a combination of issues and pull requests in a single query. Requests that don&#39;t include the &#x60;is:issue&#x60; or &#x60;is:pull-request&#x60; qualifier will receive an HTTP &#x60;422 Unprocessable Entity&#x60; response. To get results for both issues and pull requests, you must send separate queries for issues and pull requests. For more information about the &#x60;is&#x60; qualifier, see \&quot;[Searching only issues or pull requests](https://docs.github.com/github/searching-for-information-on-github/searching-issues-and-pull-requests#search-only-issues-or-pull-requests).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SearchApi()
val q : kotlin.String = q_example // kotlin.String | The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn more about the format of the query, see [Constructing a search query](https://docs.github.com/rest/search/search#constructing-a-search-query). See \"[Searching issues and pull requests](https://docs.github.com/search-github/searching-on-github/searching-issues-and-pull-requests)\" for a detailed list of qualifiers.
val sort : kotlin.String = sort_example // kotlin.String | Sorts the results of your query by the number of `comments`, `reactions`, `reactions-+1`, `reactions--1`, `reactions-smile`, `reactions-thinking_face`, `reactions-heart`, `reactions-tada`, or `interactions`. You can also sort results by how recently the items were `created` or `updated`, Default: [best match](https://docs.github.com/rest/search/search#ranking-search-results)
val order : kotlin.String = order_example // kotlin.String | Determines whether the first search result returned is the highest number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : SearchIssuesAndPullRequests200Response = apiInstance.searchIssuesAndPullRequests(q, sort, order, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#searchIssuesAndPullRequests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#searchIssuesAndPullRequests")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**| The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn more about the format of the query, see [Constructing a search query](https://docs.github.com/rest/search/search#constructing-a-search-query). See \&quot;[Searching issues and pull requests](https://docs.github.com/search-github/searching-on-github/searching-issues-and-pull-requests)\&quot; for a detailed list of qualifiers. | [default to &quot;push&quot;]
 **sort** | **kotlin.String**| Sorts the results of your query by the number of &#x60;comments&#x60;, &#x60;reactions&#x60;, &#x60;reactions-+1&#x60;, &#x60;reactions--1&#x60;, &#x60;reactions-smile&#x60;, &#x60;reactions-thinking_face&#x60;, &#x60;reactions-heart&#x60;, &#x60;reactions-tada&#x60;, or &#x60;interactions&#x60;. You can also sort results by how recently the items were &#x60;created&#x60; or &#x60;updated&#x60;, Default: [best match](https://docs.github.com/rest/search/search#ranking-search-results) | [optional] [enum: comments, reactions, reactions-+1, reactions--1, reactions-smile, reactions-thinking_face, reactions-heart, reactions-tada, interactions, created, updated]
 **order** | **kotlin.String**| Determines whether the first search result returned is the highest number of matches (&#x60;desc&#x60;) or lowest number of matches (&#x60;asc&#x60;). This parameter is ignored unless you provide &#x60;sort&#x60;. | [optional] [default to desc] [enum: desc, asc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**SearchIssuesAndPullRequests200Response**](SearchIssuesAndPullRequests200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="searchLabels"></a>
# **searchLabels**
> SearchLabels200Response searchLabels(repositoryId, q, sort, order, perPage, page)

Search labels

Find labels in a repository with names or descriptions that match search keywords. Returns up to 100 results [per page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).  When searching for labels, you can get text match metadata for the label **name** and **description** fields when you pass the &#x60;text-match&#x60; media type. For more details about how to receive highlighted search results, see [Text match metadata](https://docs.github.com/rest/search/search#text-match-metadata).  For example, if you want to find labels in the &#x60;linguist&#x60; repository that match &#x60;bug&#x60;, &#x60;defect&#x60;, or &#x60;enhancement&#x60;. Your query might look like this:  &#x60;q&#x3D;bug+defect+enhancement&amp;repository_id&#x3D;64778136&#x60;  The labels that best match the query appear first in the search results.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SearchApi()
val repositoryId : kotlin.Int = 56 // kotlin.Int | The id of the repository.
val q : kotlin.String = q_example // kotlin.String | The search keywords. This endpoint does not accept qualifiers in the query. To learn more about the format of the query, see [Constructing a search query](https://docs.github.com/rest/search/search#constructing-a-search-query).
val sort : kotlin.String = sort_example // kotlin.String | Sorts the results of your query by when the label was `created` or `updated`. Default: [best match](https://docs.github.com/rest/search/search#ranking-search-results)
val order : kotlin.String = order_example // kotlin.String | Determines whether the first search result returned is the highest number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : SearchLabels200Response = apiInstance.searchLabels(repositoryId, q, sort, order, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#searchLabels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#searchLabels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryId** | **kotlin.Int**| The id of the repository. |
 **q** | **kotlin.String**| The search keywords. This endpoint does not accept qualifiers in the query. To learn more about the format of the query, see [Constructing a search query](https://docs.github.com/rest/search/search#constructing-a-search-query). | [default to &quot;push&quot;]
 **sort** | **kotlin.String**| Sorts the results of your query by when the label was &#x60;created&#x60; or &#x60;updated&#x60;. Default: [best match](https://docs.github.com/rest/search/search#ranking-search-results) | [optional] [enum: created, updated]
 **order** | **kotlin.String**| Determines whether the first search result returned is the highest number of matches (&#x60;desc&#x60;) or lowest number of matches (&#x60;asc&#x60;). This parameter is ignored unless you provide &#x60;sort&#x60;. | [optional] [default to desc] [enum: desc, asc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**SearchLabels200Response**](SearchLabels200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="searchRepos"></a>
# **searchRepos**
> SearchRepos200Response searchRepos(q, sort, order, perPage, page)

Search repositories

Find repositories via various criteria. This method returns up to 100 results [per page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).  When searching for repositories, you can get text match metadata for the **name** and **description** fields when you pass the &#x60;text-match&#x60; media type. For more details about how to receive highlighted search results, see [Text match metadata](https://docs.github.com/rest/search/search#text-match-metadata).  For example, if you want to search for popular Tetris repositories written in assembly code, your query might look like this:  &#x60;q&#x3D;tetris+language:assembly&amp;sort&#x3D;stars&amp;order&#x3D;desc&#x60;  This query searches for repositories with the word &#x60;tetris&#x60; in the name, the description, or the README. The results are limited to repositories where the primary language is assembly. The results are sorted by stars in descending order, so that the most popular repositories appear first in the search results.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SearchApi()
val q : kotlin.String = q_example // kotlin.String | The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn more about the format of the query, see [Constructing a search query](https://docs.github.com/rest/search/search#constructing-a-search-query). See \"[Searching for repositories](https://docs.github.com/articles/searching-for-repositories/)\" for a detailed list of qualifiers.
val sort : kotlin.String = sort_example // kotlin.String | Sorts the results of your query by number of `stars`, `forks`, or `help-wanted-issues` or how recently the items were `updated`. Default: [best match](https://docs.github.com/rest/search/search#ranking-search-results)
val order : kotlin.String = order_example // kotlin.String | Determines whether the first search result returned is the highest number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : SearchRepos200Response = apiInstance.searchRepos(q, sort, order, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#searchRepos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#searchRepos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**| The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn more about the format of the query, see [Constructing a search query](https://docs.github.com/rest/search/search#constructing-a-search-query). See \&quot;[Searching for repositories](https://docs.github.com/articles/searching-for-repositories/)\&quot; for a detailed list of qualifiers. | [default to &quot;push&quot;]
 **sort** | **kotlin.String**| Sorts the results of your query by number of &#x60;stars&#x60;, &#x60;forks&#x60;, or &#x60;help-wanted-issues&#x60; or how recently the items were &#x60;updated&#x60;. Default: [best match](https://docs.github.com/rest/search/search#ranking-search-results) | [optional] [enum: stars, forks, help-wanted-issues, updated]
 **order** | **kotlin.String**| Determines whether the first search result returned is the highest number of matches (&#x60;desc&#x60;) or lowest number of matches (&#x60;asc&#x60;). This parameter is ignored unless you provide &#x60;sort&#x60;. | [optional] [default to desc] [enum: desc, asc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**SearchRepos200Response**](SearchRepos200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="searchTopics"></a>
# **searchTopics**
> SearchTopics200Response searchTopics(q, perPage, page)

Search topics

Find topics via various criteria. Results are sorted by best match. This method returns up to 100 results [per page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api). See \&quot;[Searching topics](https://docs.github.com/articles/searching-topics/)\&quot; for a detailed list of qualifiers.  When searching for topics, you can get text match metadata for the topic&#39;s **short\\_description**, **description**, **name**, or **display\\_name** field when you pass the &#x60;text-match&#x60; media type. For more details about how to receive highlighted search results, see [Text match metadata](https://docs.github.com/rest/search/search#text-match-metadata).  For example, if you want to search for topics related to Ruby that are featured on https://github.com/topics. Your query might look like this:  &#x60;q&#x3D;ruby+is:featured&#x60;  This query searches for topics with the keyword &#x60;ruby&#x60; and limits the results to find only topics that are featured. The topics that are the best match for the query appear first in the search results.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SearchApi()
val q : kotlin.String = q_example // kotlin.String | The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn more about the format of the query, see [Constructing a search query](https://docs.github.com/rest/search/search#constructing-a-search-query).
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : SearchTopics200Response = apiInstance.searchTopics(q, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#searchTopics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#searchTopics")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**| The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn more about the format of the query, see [Constructing a search query](https://docs.github.com/rest/search/search#constructing-a-search-query). | [default to &quot;push&quot;]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**SearchTopics200Response**](SearchTopics200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="searchUsers"></a>
# **searchUsers**
> SearchUsers200Response searchUsers(q, sort, order, perPage, page)

Search users

Find users via various criteria. This method returns up to 100 results [per page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).  When searching for users, you can get text match metadata for the issue **login**, public **email**, and **name** fields when you pass the &#x60;text-match&#x60; media type. For more details about highlighting search results, see [Text match metadata](https://docs.github.com/rest/search/search#text-match-metadata). For more details about how to receive highlighted search results, see [Text match metadata](https://docs.github.com/rest/search/search#text-match-metadata).  For example, if you&#39;re looking for a list of popular users, you might try this query:  &#x60;q&#x3D;tom+repos:%3E42+followers:%3E1000&#x60;  This query searches for users with the name &#x60;tom&#x60;. The results are restricted to users with more than 42 repositories and over 1,000 followers.  This endpoint does not accept authentication and will only include publicly visible users. As an alternative, you can use the GraphQL API. The GraphQL API requires authentication and will return private users, including Enterprise Managed Users (EMUs), that you are authorized to view. For more information, see \&quot;[GraphQL Queries](https://docs.github.com/graphql/reference/queries#search).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SearchApi()
val q : kotlin.String = q_example // kotlin.String | The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn more about the format of the query, see [Constructing a search query](https://docs.github.com/rest/search/search#constructing-a-search-query). See \"[Searching users](https://docs.github.com/search-github/searching-on-github/searching-users)\" for a detailed list of qualifiers.
val sort : kotlin.String = sort_example // kotlin.String | Sorts the results of your query by number of `followers` or `repositories`, or when the person `joined` GitHub. Default: [best match](https://docs.github.com/rest/search/search#ranking-search-results)
val order : kotlin.String = order_example // kotlin.String | Determines whether the first search result returned is the highest number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : SearchUsers200Response = apiInstance.searchUsers(q, sort, order, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#searchUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#searchUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**| The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn more about the format of the query, see [Constructing a search query](https://docs.github.com/rest/search/search#constructing-a-search-query). See \&quot;[Searching users](https://docs.github.com/search-github/searching-on-github/searching-users)\&quot; for a detailed list of qualifiers. | [default to &quot;push&quot;]
 **sort** | **kotlin.String**| Sorts the results of your query by number of &#x60;followers&#x60; or &#x60;repositories&#x60;, or when the person &#x60;joined&#x60; GitHub. Default: [best match](https://docs.github.com/rest/search/search#ranking-search-results) | [optional] [enum: followers, repositories, joined]
 **order** | **kotlin.String**| Determines whether the first search result returned is the highest number of matches (&#x60;desc&#x60;) or lowest number of matches (&#x60;asc&#x60;). This parameter is ignored unless you provide &#x60;sort&#x60;. | [optional] [default to desc] [enum: desc, asc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**SearchUsers200Response**](SearchUsers200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

