# RateLimitApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rateLimitGet**](RateLimitApi.md#rateLimitGet) | **GET** /rate_limit | Get rate limit status for the authenticated user


<a id="rateLimitGet"></a>
# **rateLimitGet**
> RateLimitOverview rateLimitGet()

Get rate limit status for the authenticated user

**Note:** Accessing this endpoint does not count against your REST API rate limit.  Some categories of endpoints have custom rate limits that are separate from the rate limit governing the other REST API endpoints. For this reason, the API response categorizes your rate limit. Under &#x60;resources&#x60;, you&#39;ll see objects relating to different categories: * The &#x60;core&#x60; object provides your rate limit status for all non-search-related resources in the REST API. * The &#x60;search&#x60; object provides your rate limit status for the REST API for searching (excluding code searches). For more information, see \&quot;[Search](https://docs.github.com/rest/search/search).\&quot; * The &#x60;code_search&#x60; object provides your rate limit status for the REST API for searching code. For more information, see \&quot;[Search code](https://docs.github.com/rest/search/search#search-code).\&quot; * The &#x60;graphql&#x60; object provides your rate limit status for the GraphQL API. For more information, see \&quot;[Resource limitations](https://docs.github.com/graphql/overview/resource-limitations#rate-limit).\&quot; * The &#x60;integration_manifest&#x60; object provides your rate limit status for the &#x60;POST /app-manifests/{code}/conversions&#x60; operation. For more information, see \&quot;[Creating a GitHub App from a manifest](https://docs.github.com/apps/creating-github-apps/setting-up-a-github-app/creating-a-github-app-from-a-manifest#3-you-exchange-the-temporary-code-to-retrieve-the-app-configuration).\&quot; * The &#x60;dependency_snapshots&#x60; object provides your rate limit status for submitting snapshots to the dependency graph. For more information, see \&quot;[Dependency graph](https://docs.github.com/rest/dependency-graph).\&quot; * The &#x60;code_scanning_upload&#x60; object provides your rate limit status for uploading SARIF results to code scanning. For more information, see \&quot;[Uploading a SARIF file to GitHub](https://docs.github.com/code-security/code-scanning/integrating-with-code-scanning/uploading-a-sarif-file-to-github).\&quot; * The &#x60;actions_runner_registration&#x60; object provides your rate limit status for registering self-hosted runners in GitHub Actions. For more information, see \&quot;[Self-hosted runners](https://docs.github.com/rest/actions/self-hosted-runners).\&quot; * The &#x60;source_import&#x60; object is no longer in use for any API endpoints, and it will be removed in the next API version. For more information about API versions, see \&quot;[API Versions](https://docs.github.com/rest/overview/api-versions).\&quot;  **Note:** The &#x60;rate&#x60; object is deprecated. If you&#39;re writing new API client code or updating existing code, you should use the &#x60;core&#x60; object instead of the &#x60;rate&#x60; object. The &#x60;core&#x60; object contains the same information that is present in the &#x60;rate&#x60; object.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RateLimitApi()
try {
    val result : RateLimitOverview = apiInstance.rateLimitGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RateLimitApi#rateLimitGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RateLimitApi#rateLimitGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RateLimitOverview**](RateLimitOverview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

