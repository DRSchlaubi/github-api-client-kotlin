# ActivityApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activityCheckRepoIsStarredByAuthenticatedUser**](ActivityApi.md#activityCheckRepoIsStarredByAuthenticatedUser) | **GET** /user/starred/{owner}/{repo} | Check if a repository is starred by the authenticated user
[**activityDeleteRepoSubscription**](ActivityApi.md#activityDeleteRepoSubscription) | **DELETE** /repos/{owner}/{repo}/subscription | Delete a repository subscription
[**activityDeleteThreadSubscription**](ActivityApi.md#activityDeleteThreadSubscription) | **DELETE** /notifications/threads/{thread_id}/subscription | Delete a thread subscription
[**activityGetFeeds**](ActivityApi.md#activityGetFeeds) | **GET** /feeds | Get feeds
[**activityGetRepoSubscription**](ActivityApi.md#activityGetRepoSubscription) | **GET** /repos/{owner}/{repo}/subscription | Get a repository subscription
[**activityGetThread**](ActivityApi.md#activityGetThread) | **GET** /notifications/threads/{thread_id} | Get a thread
[**activityGetThreadSubscriptionForAuthenticatedUser**](ActivityApi.md#activityGetThreadSubscriptionForAuthenticatedUser) | **GET** /notifications/threads/{thread_id}/subscription | Get a thread subscription for the authenticated user
[**activityListEventsForAuthenticatedUser**](ActivityApi.md#activityListEventsForAuthenticatedUser) | **GET** /users/{username}/events | List events for the authenticated user
[**activityListNotificationsForAuthenticatedUser**](ActivityApi.md#activityListNotificationsForAuthenticatedUser) | **GET** /notifications | List notifications for the authenticated user
[**activityListOrgEventsForAuthenticatedUser**](ActivityApi.md#activityListOrgEventsForAuthenticatedUser) | **GET** /users/{username}/events/orgs/{org} | List organization events for the authenticated user
[**activityListPublicEvents**](ActivityApi.md#activityListPublicEvents) | **GET** /events | List public events
[**activityListPublicEventsForRepoNetwork**](ActivityApi.md#activityListPublicEventsForRepoNetwork) | **GET** /networks/{owner}/{repo}/events | List public events for a network of repositories
[**activityListPublicEventsForUser**](ActivityApi.md#activityListPublicEventsForUser) | **GET** /users/{username}/events/public | List public events for a user
[**activityListPublicOrgEvents**](ActivityApi.md#activityListPublicOrgEvents) | **GET** /orgs/{org}/events | List public organization events
[**activityListReceivedEventsForUser**](ActivityApi.md#activityListReceivedEventsForUser) | **GET** /users/{username}/received_events | List events received by the authenticated user
[**activityListReceivedPublicEventsForUser**](ActivityApi.md#activityListReceivedPublicEventsForUser) | **GET** /users/{username}/received_events/public | List public events received by a user
[**activityListRepoEvents**](ActivityApi.md#activityListRepoEvents) | **GET** /repos/{owner}/{repo}/events | List repository events
[**activityListRepoNotificationsForAuthenticatedUser**](ActivityApi.md#activityListRepoNotificationsForAuthenticatedUser) | **GET** /repos/{owner}/{repo}/notifications | List repository notifications for the authenticated user
[**activityListReposStarredByAuthenticatedUser**](ActivityApi.md#activityListReposStarredByAuthenticatedUser) | **GET** /user/starred | List repositories starred by the authenticated user
[**activityListReposStarredByUser**](ActivityApi.md#activityListReposStarredByUser) | **GET** /users/{username}/starred | List repositories starred by a user
[**activityListReposWatchedByUser**](ActivityApi.md#activityListReposWatchedByUser) | **GET** /users/{username}/subscriptions | List repositories watched by a user
[**activityListStargazersForRepo**](ActivityApi.md#activityListStargazersForRepo) | **GET** /repos/{owner}/{repo}/stargazers | List stargazers
[**activityListWatchedReposForAuthenticatedUser**](ActivityApi.md#activityListWatchedReposForAuthenticatedUser) | **GET** /user/subscriptions | List repositories watched by the authenticated user
[**activityListWatchersForRepo**](ActivityApi.md#activityListWatchersForRepo) | **GET** /repos/{owner}/{repo}/subscribers | List watchers
[**activityMarkNotificationsAsRead**](ActivityApi.md#activityMarkNotificationsAsRead) | **PUT** /notifications | Mark notifications as read
[**activityMarkRepoNotificationsAsRead**](ActivityApi.md#activityMarkRepoNotificationsAsRead) | **PUT** /repos/{owner}/{repo}/notifications | Mark repository notifications as read
[**activityMarkThreadAsDone**](ActivityApi.md#activityMarkThreadAsDone) | **DELETE** /notifications/threads/{thread_id} | Mark a thread as done
[**activityMarkThreadAsRead**](ActivityApi.md#activityMarkThreadAsRead) | **PATCH** /notifications/threads/{thread_id} | Mark a thread as read
[**activitySetRepoSubscription**](ActivityApi.md#activitySetRepoSubscription) | **PUT** /repos/{owner}/{repo}/subscription | Set a repository subscription
[**activitySetThreadSubscription**](ActivityApi.md#activitySetThreadSubscription) | **PUT** /notifications/threads/{thread_id}/subscription | Set a thread subscription
[**activityStarRepoForAuthenticatedUser**](ActivityApi.md#activityStarRepoForAuthenticatedUser) | **PUT** /user/starred/{owner}/{repo} | Star a repository for the authenticated user
[**activityUnstarRepoForAuthenticatedUser**](ActivityApi.md#activityUnstarRepoForAuthenticatedUser) | **DELETE** /user/starred/{owner}/{repo} | Unstar a repository for the authenticated user


<a id="activityCheckRepoIsStarredByAuthenticatedUser"></a>
# **activityCheckRepoIsStarredByAuthenticatedUser**
> activityCheckRepoIsStarredByAuthenticatedUser(owner, repo)

Check if a repository is starred by the authenticated user

Whether the authenticated user has starred the repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    apiInstance.activityCheckRepoIsStarredByAuthenticatedUser(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityCheckRepoIsStarredByAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityCheckRepoIsStarredByAuthenticatedUser")
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

<a id="activityDeleteRepoSubscription"></a>
# **activityDeleteRepoSubscription**
> activityDeleteRepoSubscription(owner, repo)

Delete a repository subscription

This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository&#39;s subscription manually](https://docs.github.com/rest/activity/watching#set-a-repository-subscription).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    apiInstance.activityDeleteRepoSubscription(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityDeleteRepoSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityDeleteRepoSubscription")
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
 - **Accept**: Not defined

<a id="activityDeleteThreadSubscription"></a>
# **activityDeleteThreadSubscription**
> activityDeleteThreadSubscription(threadId)

Delete a thread subscription

Mutes all future notifications for a conversation until you comment on the thread or get an **@mention**. If you are watching the repository of the thread, you will still receive notifications. To ignore future notifications for a repository you are watching, use the [Set a thread subscription](https://docs.github.com/rest/activity/notifications#set-a-thread-subscription) endpoint and set &#x60;ignore&#x60; to &#x60;true&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val threadId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the notification thread. This corresponds to the value returned in the `id` field when you retrieve notifications (for example with the [`GET /notifications` operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
try {
    apiInstance.activityDeleteThreadSubscription(threadId)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityDeleteThreadSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityDeleteThreadSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.Int**| The unique identifier of the notification thread. This corresponds to the value returned in the &#x60;id&#x60; field when you retrieve notifications (for example with the [&#x60;GET /notifications&#x60; operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)). |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityGetFeeds"></a>
# **activityGetFeeds**
> Feed activityGetFeeds()

Get feeds

Lists the feeds available to the authenticated user. The response provides a URL for each feed. You can then get a specific feed by sending a request to one of the feed URLs.  *   **Timeline**: The GitHub global public timeline *   **User**: The public timeline for any user, using &#x60;uri_template&#x60;. For more information, see \&quot;[Hypermedia](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#hypermedia).\&quot; *   **Current user public**: The public timeline for the authenticated user *   **Current user**: The private timeline for the authenticated user *   **Current user actor**: The private timeline for activity created by the authenticated user *   **Current user organizations**: The private timeline for the organizations the authenticated user is a member of. *   **Security advisories**: A collection of public announcements that provide information about security-related vulnerabilities in software on GitHub.  By default, timeline resources are returned in JSON. You can specify the &#x60;application/atom+xml&#x60; type in the &#x60;Accept&#x60; header to return timeline resources in Atom format. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  **Note**: Private feeds are only returned when [authenticating via Basic Auth](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) since current feed URIs use the older, non revocable auth tokens.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
try {
    val result : Feed = apiInstance.activityGetFeeds()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityGetFeeds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityGetFeeds")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Feed**](Feed.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityGetRepoSubscription"></a>
# **activityGetRepoSubscription**
> RepositorySubscription activityGetRepoSubscription(owner, repo)

Get a repository subscription

Gets information about whether the authenticated user is subscribed to the repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : RepositorySubscription = apiInstance.activityGetRepoSubscription(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityGetRepoSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityGetRepoSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**RepositorySubscription**](RepositorySubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityGetThread"></a>
# **activityGetThread**
> Thread activityGetThread(threadId)

Get a thread

Gets information about a notification thread.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val threadId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the notification thread. This corresponds to the value returned in the `id` field when you retrieve notifications (for example with the [`GET /notifications` operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
try {
    val result : Thread = apiInstance.activityGetThread(threadId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityGetThread")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityGetThread")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.Int**| The unique identifier of the notification thread. This corresponds to the value returned in the &#x60;id&#x60; field when you retrieve notifications (for example with the [&#x60;GET /notifications&#x60; operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)). |

### Return type

[**Thread**](Thread.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityGetThreadSubscriptionForAuthenticatedUser"></a>
# **activityGetThreadSubscriptionForAuthenticatedUser**
> ThreadSubscription activityGetThreadSubscriptionForAuthenticatedUser(threadId)

Get a thread subscription for the authenticated user

This checks to see if the current user is subscribed to a thread. You can also [get a repository subscription](https://docs.github.com/rest/activity/watching#get-a-repository-subscription).  Note that subscriptions are only generated if a user is participating in a conversation--for example, they&#39;ve replied to the thread, were **@mentioned**, or manually subscribe to a thread.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val threadId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the notification thread. This corresponds to the value returned in the `id` field when you retrieve notifications (for example with the [`GET /notifications` operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
try {
    val result : ThreadSubscription = apiInstance.activityGetThreadSubscriptionForAuthenticatedUser(threadId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityGetThreadSubscriptionForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityGetThreadSubscriptionForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.Int**| The unique identifier of the notification thread. This corresponds to the value returned in the &#x60;id&#x60; field when you retrieve notifications (for example with the [&#x60;GET /notifications&#x60; operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)). |

### Return type

[**ThreadSubscription**](ThreadSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityListEventsForAuthenticatedUser"></a>
# **activityListEventsForAuthenticatedUser**
> kotlin.collections.List&lt;Event&gt; activityListEventsForAuthenticatedUser(username, perPage, page)

List events for the authenticated user

If you are authenticated as the given user, you will see your private events. Otherwise, you&#39;ll only see public events.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Event> = apiInstance.activityListEventsForAuthenticatedUser(username, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityListEventsForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityListEventsForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Event&gt;**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityListNotificationsForAuthenticatedUser"></a>
# **activityListNotificationsForAuthenticatedUser**
> kotlin.collections.List&lt;Thread&gt; activityListNotificationsForAuthenticatedUser(all, participating, since, before, page, perPage)

List notifications for the authenticated user

List all notifications for the current user, sorted by most recently updated.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val all : kotlin.Boolean = true // kotlin.Boolean | If `true`, show notifications marked as read.
val participating : kotlin.Boolean = true // kotlin.Boolean | If `true`, only shows notifications in which the user is directly participating or mentioned.
val since : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val before : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show notifications updated before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 50). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Thread> = apiInstance.activityListNotificationsForAuthenticatedUser(all, participating, since, before, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityListNotificationsForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityListNotificationsForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **all** | **kotlin.Boolean**| If &#x60;true&#x60;, show notifications marked as read. | [optional] [default to false]
 **participating** | **kotlin.Boolean**| If &#x60;true&#x60;, only shows notifications in which the user is directly participating or mentioned. | [optional] [default to false]
 **since** | **kotlinx.datetime.Instant**| Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **before** | **kotlinx.datetime.Instant**| Only show notifications updated before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 50). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 50]

### Return type

[**kotlin.collections.List&lt;Thread&gt;**](Thread.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityListOrgEventsForAuthenticatedUser"></a>
# **activityListOrgEventsForAuthenticatedUser**
> kotlin.collections.List&lt;Event&gt; activityListOrgEventsForAuthenticatedUser(username, org, perPage, page)

List organization events for the authenticated user

This is the user&#39;s organization dashboard. You must be authenticated as the user to view this.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Event> = apiInstance.activityListOrgEventsForAuthenticatedUser(username, org, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityListOrgEventsForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityListOrgEventsForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Event&gt;**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityListPublicEvents"></a>
# **activityListPublicEvents**
> kotlin.collections.List&lt;Event&gt; activityListPublicEvents(perPage, page)

List public events

We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Event> = apiInstance.activityListPublicEvents(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityListPublicEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityListPublicEvents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Event&gt;**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityListPublicEventsForRepoNetwork"></a>
# **activityListPublicEventsForRepoNetwork**
> kotlin.collections.List&lt;Event&gt; activityListPublicEventsForRepoNetwork(owner, repo, perPage, page)

List public events for a network of repositories



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Event> = apiInstance.activityListPublicEventsForRepoNetwork(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityListPublicEventsForRepoNetwork")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityListPublicEventsForRepoNetwork")
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

[**kotlin.collections.List&lt;Event&gt;**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityListPublicEventsForUser"></a>
# **activityListPublicEventsForUser**
> kotlin.collections.List&lt;Event&gt; activityListPublicEventsForUser(username, perPage, page)

List public events for a user



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Event> = apiInstance.activityListPublicEventsForUser(username, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityListPublicEventsForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityListPublicEventsForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Event&gt;**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityListPublicOrgEvents"></a>
# **activityListPublicOrgEvents**
> kotlin.collections.List&lt;Event&gt; activityListPublicOrgEvents(org, perPage, page)

List public organization events



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Event> = apiInstance.activityListPublicOrgEvents(org, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityListPublicOrgEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityListPublicOrgEvents")
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

[**kotlin.collections.List&lt;Event&gt;**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityListReceivedEventsForUser"></a>
# **activityListReceivedEventsForUser**
> kotlin.collections.List&lt;Event&gt; activityListReceivedEventsForUser(username, perPage, page)

List events received by the authenticated user

These are events that you&#39;ve received by watching repositories and following users. If you are authenticated as the given user, you will see private events. Otherwise, you&#39;ll only see public events.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Event> = apiInstance.activityListReceivedEventsForUser(username, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityListReceivedEventsForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityListReceivedEventsForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Event&gt;**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityListReceivedPublicEventsForUser"></a>
# **activityListReceivedPublicEventsForUser**
> kotlin.collections.List&lt;Event&gt; activityListReceivedPublicEventsForUser(username, perPage, page)

List public events received by a user



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Event> = apiInstance.activityListReceivedPublicEventsForUser(username, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityListReceivedPublicEventsForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityListReceivedPublicEventsForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Event&gt;**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityListRepoEvents"></a>
# **activityListRepoEvents**
> kotlin.collections.List&lt;Event&gt; activityListRepoEvents(owner, repo, perPage, page)

List repository events

**Note**: This API is not built to serve real-time use cases. Depending on the time of day, event latency can be anywhere from 30s to 6h. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Event> = apiInstance.activityListRepoEvents(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityListRepoEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityListRepoEvents")
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

[**kotlin.collections.List&lt;Event&gt;**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityListRepoNotificationsForAuthenticatedUser"></a>
# **activityListRepoNotificationsForAuthenticatedUser**
> kotlin.collections.List&lt;Thread&gt; activityListRepoNotificationsForAuthenticatedUser(owner, repo, all, participating, since, before, perPage, page)

List repository notifications for the authenticated user

Lists all notifications for the current user in the specified repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val all : kotlin.Boolean = true // kotlin.Boolean | If `true`, show notifications marked as read.
val participating : kotlin.Boolean = true // kotlin.Boolean | If `true`, only shows notifications in which the user is directly participating or mentioned.
val since : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val before : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show notifications updated before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Thread> = apiInstance.activityListRepoNotificationsForAuthenticatedUser(owner, repo, all, participating, since, before, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityListRepoNotificationsForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityListRepoNotificationsForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **all** | **kotlin.Boolean**| If &#x60;true&#x60;, show notifications marked as read. | [optional] [default to false]
 **participating** | **kotlin.Boolean**| If &#x60;true&#x60;, only shows notifications in which the user is directly participating or mentioned. | [optional] [default to false]
 **since** | **kotlinx.datetime.Instant**| Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **before** | **kotlinx.datetime.Instant**| Only show notifications updated before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Thread&gt;**](Thread.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityListReposStarredByAuthenticatedUser"></a>
# **activityListReposStarredByAuthenticatedUser**
> kotlin.collections.List&lt;Repository&gt; activityListReposStarredByAuthenticatedUser(sort, direction, perPage, page)

List repositories starred by the authenticated user

Lists repositories the authenticated user has starred.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.star+json&#x60;**: Includes a timestamp of when the star was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val sort : kotlin.String = sort_example // kotlin.String | The property to sort the results by. `created` means when the repository was starred. `updated` means when the repository was last pushed to.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Repository> = apiInstance.activityListReposStarredByAuthenticatedUser(sort, direction, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityListReposStarredByAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityListReposStarredByAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **kotlin.String**| The property to sort the results by. &#x60;created&#x60; means when the repository was starred. &#x60;updated&#x60; means when the repository was last pushed to. | [optional] [default to created] [enum: created, updated]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Repository&gt;**](Repository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.github.v3.star+json

<a id="activityListReposStarredByUser"></a>
# **activityListReposStarredByUser**
> ActivityListReposStarredByUser200Response activityListReposStarredByUser(username, sort, direction, perPage, page)

List repositories starred by a user

Lists repositories a user has starred.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.star+json&#x60;**: Includes a timestamp of when the star was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val sort : kotlin.String = sort_example // kotlin.String | The property to sort the results by. `created` means when the repository was starred. `updated` means when the repository was last pushed to.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActivityListReposStarredByUser200Response = apiInstance.activityListReposStarredByUser(username, sort, direction, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityListReposStarredByUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityListReposStarredByUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **sort** | **kotlin.String**| The property to sort the results by. &#x60;created&#x60; means when the repository was starred. &#x60;updated&#x60; means when the repository was last pushed to. | [optional] [default to created] [enum: created, updated]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**ActivityListReposStarredByUser200Response**](ActivityListReposStarredByUser200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityListReposWatchedByUser"></a>
# **activityListReposWatchedByUser**
> kotlin.collections.List&lt;MinimalRepository&gt; activityListReposWatchedByUser(username, perPage, page)

List repositories watched by a user

Lists repositories a user is watching.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<MinimalRepository> = apiInstance.activityListReposWatchedByUser(username, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityListReposWatchedByUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityListReposWatchedByUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityListStargazersForRepo"></a>
# **activityListStargazersForRepo**
> ActivityListStargazersForRepo200Response activityListStargazersForRepo(owner, repo, perPage, page)

List stargazers

Lists the people that have starred the repository.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.star+json&#x60;**: Includes a timestamp of when the star was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActivityListStargazersForRepo200Response = apiInstance.activityListStargazersForRepo(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityListStargazersForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityListStargazersForRepo")
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

[**ActivityListStargazersForRepo200Response**](ActivityListStargazersForRepo200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityListWatchedReposForAuthenticatedUser"></a>
# **activityListWatchedReposForAuthenticatedUser**
> kotlin.collections.List&lt;MinimalRepository&gt; activityListWatchedReposForAuthenticatedUser(perPage, page)

List repositories watched by the authenticated user

Lists repositories the authenticated user is watching.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<MinimalRepository> = apiInstance.activityListWatchedReposForAuthenticatedUser(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityListWatchedReposForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityListWatchedReposForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityListWatchersForRepo"></a>
# **activityListWatchersForRepo**
> kotlin.collections.List&lt;SimpleUser&gt; activityListWatchersForRepo(owner, repo, perPage, page)

List watchers

Lists the people watching the specified repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.activityListWatchersForRepo(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityListWatchersForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityListWatchersForRepo")
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

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activityMarkNotificationsAsRead"></a>
# **activityMarkNotificationsAsRead**
> ActivityMarkNotificationsAsRead202Response activityMarkNotificationsAsRead(activityMarkNotificationsAsReadRequest)

Mark notifications as read

Marks all notifications as \&quot;read\&quot; for the current user. If the number of notifications is too large to complete in one request, you will receive a &#x60;202 Accepted&#x60; status and GitHub will run an asynchronous process to mark notifications as \&quot;read.\&quot; To check whether any \&quot;unread\&quot; notifications remain, you can use the [List notifications for the authenticated user](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user) endpoint and pass the query parameter &#x60;all&#x3D;false&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val activityMarkNotificationsAsReadRequest : ActivityMarkNotificationsAsReadRequest = {"last_read_at":"2022-06-10T00:00:00Z","read":true} // ActivityMarkNotificationsAsReadRequest | 
try {
    val result : ActivityMarkNotificationsAsRead202Response = apiInstance.activityMarkNotificationsAsRead(activityMarkNotificationsAsReadRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityMarkNotificationsAsRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityMarkNotificationsAsRead")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityMarkNotificationsAsReadRequest** | [**ActivityMarkNotificationsAsReadRequest**](ActivityMarkNotificationsAsReadRequest.md)|  | [optional]

### Return type

[**ActivityMarkNotificationsAsRead202Response**](ActivityMarkNotificationsAsRead202Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="activityMarkRepoNotificationsAsRead"></a>
# **activityMarkRepoNotificationsAsRead**
> ActivityMarkRepoNotificationsAsRead202Response activityMarkRepoNotificationsAsRead(owner, repo, activityMarkRepoNotificationsAsReadRequest)

Mark repository notifications as read

Marks all notifications in a repository as \&quot;read\&quot; for the current user. If the number of notifications is too large to complete in one request, you will receive a &#x60;202 Accepted&#x60; status and GitHub will run an asynchronous process to mark notifications as \&quot;read.\&quot; To check whether any \&quot;unread\&quot; notifications remain, you can use the [List repository notifications for the authenticated user](https://docs.github.com/rest/activity/notifications#list-repository-notifications-for-the-authenticated-user) endpoint and pass the query parameter &#x60;all&#x3D;false&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val activityMarkRepoNotificationsAsReadRequest : ActivityMarkRepoNotificationsAsReadRequest = {"last_read_at":"2019-01-01T00:00:00Z"} // ActivityMarkRepoNotificationsAsReadRequest | 
try {
    val result : ActivityMarkRepoNotificationsAsRead202Response = apiInstance.activityMarkRepoNotificationsAsRead(owner, repo, activityMarkRepoNotificationsAsReadRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityMarkRepoNotificationsAsRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityMarkRepoNotificationsAsRead")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **activityMarkRepoNotificationsAsReadRequest** | [**ActivityMarkRepoNotificationsAsReadRequest**](ActivityMarkRepoNotificationsAsReadRequest.md)|  | [optional]

### Return type

[**ActivityMarkRepoNotificationsAsRead202Response**](ActivityMarkRepoNotificationsAsRead202Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="activityMarkThreadAsDone"></a>
# **activityMarkThreadAsDone**
> activityMarkThreadAsDone(threadId)

Mark a thread as done

Marks a thread as \&quot;done.\&quot; Marking a thread as \&quot;done\&quot; is equivalent to marking a notification in your notification inbox on GitHub as done: https://github.com/notifications.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val threadId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the notification thread. This corresponds to the value returned in the `id` field when you retrieve notifications (for example with the [`GET /notifications` operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
try {
    apiInstance.activityMarkThreadAsDone(threadId)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityMarkThreadAsDone")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityMarkThreadAsDone")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.Int**| The unique identifier of the notification thread. This corresponds to the value returned in the &#x60;id&#x60; field when you retrieve notifications (for example with the [&#x60;GET /notifications&#x60; operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)). |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="activityMarkThreadAsRead"></a>
# **activityMarkThreadAsRead**
> activityMarkThreadAsRead(threadId)

Mark a thread as read

Marks a thread as \&quot;read.\&quot; Marking a thread as \&quot;read\&quot; is equivalent to clicking a notification in your notification inbox on GitHub: https://github.com/notifications.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val threadId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the notification thread. This corresponds to the value returned in the `id` field when you retrieve notifications (for example with the [`GET /notifications` operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
try {
    apiInstance.activityMarkThreadAsRead(threadId)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityMarkThreadAsRead")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityMarkThreadAsRead")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.Int**| The unique identifier of the notification thread. This corresponds to the value returned in the &#x60;id&#x60; field when you retrieve notifications (for example with the [&#x60;GET /notifications&#x60; operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)). |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="activitySetRepoSubscription"></a>
# **activitySetRepoSubscription**
> RepositorySubscription activitySetRepoSubscription(owner, repo, activitySetRepoSubscriptionRequest)

Set a repository subscription

If you would like to watch a repository, set &#x60;subscribed&#x60; to &#x60;true&#x60;. If you would like to ignore notifications made within a repository, set &#x60;ignored&#x60; to &#x60;true&#x60;. If you would like to stop watching a repository, [delete the repository&#39;s subscription](https://docs.github.com/rest/activity/watching#delete-a-repository-subscription) completely.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val activitySetRepoSubscriptionRequest : ActivitySetRepoSubscriptionRequest = {"subscribed":true,"ignored":false} // ActivitySetRepoSubscriptionRequest | 
try {
    val result : RepositorySubscription = apiInstance.activitySetRepoSubscription(owner, repo, activitySetRepoSubscriptionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activitySetRepoSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activitySetRepoSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **activitySetRepoSubscriptionRequest** | [**ActivitySetRepoSubscriptionRequest**](ActivitySetRepoSubscriptionRequest.md)|  | [optional]

### Return type

[**RepositorySubscription**](RepositorySubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="activitySetThreadSubscription"></a>
# **activitySetThreadSubscription**
> ThreadSubscription activitySetThreadSubscription(threadId, activitySetThreadSubscriptionRequest)

Set a thread subscription

If you are watching a repository, you receive notifications for all threads by default. Use this endpoint to ignore future notifications for threads until you comment on the thread or get an **@mention**.  You can also use this endpoint to subscribe to threads that you are currently not receiving notifications for or to subscribed to threads that you have previously ignored.  Unsubscribing from a conversation in a repository that you are not watching is functionally equivalent to the [Delete a thread subscription](https://docs.github.com/rest/activity/notifications#delete-a-thread-subscription) endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val threadId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the notification thread. This corresponds to the value returned in the `id` field when you retrieve notifications (for example with the [`GET /notifications` operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
val activitySetThreadSubscriptionRequest : ActivitySetThreadSubscriptionRequest = {"ignored":false} // ActivitySetThreadSubscriptionRequest | 
try {
    val result : ThreadSubscription = apiInstance.activitySetThreadSubscription(threadId, activitySetThreadSubscriptionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activitySetThreadSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activitySetThreadSubscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **kotlin.Int**| The unique identifier of the notification thread. This corresponds to the value returned in the &#x60;id&#x60; field when you retrieve notifications (for example with the [&#x60;GET /notifications&#x60; operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)). |
 **activitySetThreadSubscriptionRequest** | [**ActivitySetThreadSubscriptionRequest**](ActivitySetThreadSubscriptionRequest.md)|  | [optional]

### Return type

[**ThreadSubscription**](ThreadSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="activityStarRepoForAuthenticatedUser"></a>
# **activityStarRepoForAuthenticatedUser**
> activityStarRepoForAuthenticatedUser(owner, repo)

Star a repository for the authenticated user

Note that you&#39;ll need to set &#x60;Content-Length&#x60; to zero when calling out to this endpoint. For more information, see \&quot;[HTTP method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    apiInstance.activityStarRepoForAuthenticatedUser(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityStarRepoForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityStarRepoForAuthenticatedUser")
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

<a id="activityUnstarRepoForAuthenticatedUser"></a>
# **activityUnstarRepoForAuthenticatedUser**
> activityUnstarRepoForAuthenticatedUser(owner, repo)

Unstar a repository for the authenticated user

Unstar a repository that the authenticated user has previously starred.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    apiInstance.activityUnstarRepoForAuthenticatedUser(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling ActivityApi#activityUnstarRepoForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityApi#activityUnstarRepoForAuthenticatedUser")
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

