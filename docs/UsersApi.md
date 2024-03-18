# UsersApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersAddEmailForAuthenticatedUser**](UsersApi.md#usersAddEmailForAuthenticatedUser) | **POST** /user/emails | Add an email address for the authenticated user
[**usersAddSocialAccountForAuthenticatedUser**](UsersApi.md#usersAddSocialAccountForAuthenticatedUser) | **POST** /user/social_accounts | Add social accounts for the authenticated user
[**usersBlock**](UsersApi.md#usersBlock) | **PUT** /user/blocks/{username} | Block a user
[**usersCheckBlocked**](UsersApi.md#usersCheckBlocked) | **GET** /user/blocks/{username} | Check if a user is blocked by the authenticated user
[**usersCheckFollowingForUser**](UsersApi.md#usersCheckFollowingForUser) | **GET** /users/{username}/following/{target_user} | Check if a user follows another user
[**usersCheckPersonIsFollowedByAuthenticated**](UsersApi.md#usersCheckPersonIsFollowedByAuthenticated) | **GET** /user/following/{username} | Check if a person is followed by the authenticated user
[**usersCreateGpgKeyForAuthenticatedUser**](UsersApi.md#usersCreateGpgKeyForAuthenticatedUser) | **POST** /user/gpg_keys | Create a GPG key for the authenticated user
[**usersCreatePublicSshKeyForAuthenticatedUser**](UsersApi.md#usersCreatePublicSshKeyForAuthenticatedUser) | **POST** /user/keys | Create a public SSH key for the authenticated user
[**usersCreateSshSigningKeyForAuthenticatedUser**](UsersApi.md#usersCreateSshSigningKeyForAuthenticatedUser) | **POST** /user/ssh_signing_keys | Create a SSH signing key for the authenticated user
[**usersDeleteEmailForAuthenticatedUser**](UsersApi.md#usersDeleteEmailForAuthenticatedUser) | **DELETE** /user/emails | Delete an email address for the authenticated user
[**usersDeleteGpgKeyForAuthenticatedUser**](UsersApi.md#usersDeleteGpgKeyForAuthenticatedUser) | **DELETE** /user/gpg_keys/{gpg_key_id} | Delete a GPG key for the authenticated user
[**usersDeletePublicSshKeyForAuthenticatedUser**](UsersApi.md#usersDeletePublicSshKeyForAuthenticatedUser) | **DELETE** /user/keys/{key_id} | Delete a public SSH key for the authenticated user
[**usersDeleteSocialAccountForAuthenticatedUser**](UsersApi.md#usersDeleteSocialAccountForAuthenticatedUser) | **DELETE** /user/social_accounts | Delete social accounts for the authenticated user
[**usersDeleteSshSigningKeyForAuthenticatedUser**](UsersApi.md#usersDeleteSshSigningKeyForAuthenticatedUser) | **DELETE** /user/ssh_signing_keys/{ssh_signing_key_id} | Delete an SSH signing key for the authenticated user
[**usersFollow**](UsersApi.md#usersFollow) | **PUT** /user/following/{username} | Follow a user
[**usersGetAuthenticated**](UsersApi.md#usersGetAuthenticated) | **GET** /user | Get the authenticated user
[**usersGetByUsername**](UsersApi.md#usersGetByUsername) | **GET** /users/{username} | Get a user
[**usersGetContextForUser**](UsersApi.md#usersGetContextForUser) | **GET** /users/{username}/hovercard | Get contextual information for a user
[**usersGetGpgKeyForAuthenticatedUser**](UsersApi.md#usersGetGpgKeyForAuthenticatedUser) | **GET** /user/gpg_keys/{gpg_key_id} | Get a GPG key for the authenticated user
[**usersGetPublicSshKeyForAuthenticatedUser**](UsersApi.md#usersGetPublicSshKeyForAuthenticatedUser) | **GET** /user/keys/{key_id} | Get a public SSH key for the authenticated user
[**usersGetSshSigningKeyForAuthenticatedUser**](UsersApi.md#usersGetSshSigningKeyForAuthenticatedUser) | **GET** /user/ssh_signing_keys/{ssh_signing_key_id} | Get an SSH signing key for the authenticated user
[**usersList**](UsersApi.md#usersList) | **GET** /users | List users
[**usersListBlockedByAuthenticatedUser**](UsersApi.md#usersListBlockedByAuthenticatedUser) | **GET** /user/blocks | List users blocked by the authenticated user
[**usersListEmailsForAuthenticatedUser**](UsersApi.md#usersListEmailsForAuthenticatedUser) | **GET** /user/emails | List email addresses for the authenticated user
[**usersListFollowedByAuthenticatedUser**](UsersApi.md#usersListFollowedByAuthenticatedUser) | **GET** /user/following | List the people the authenticated user follows
[**usersListFollowersForAuthenticatedUser**](UsersApi.md#usersListFollowersForAuthenticatedUser) | **GET** /user/followers | List followers of the authenticated user
[**usersListFollowersForUser**](UsersApi.md#usersListFollowersForUser) | **GET** /users/{username}/followers | List followers of a user
[**usersListFollowingForUser**](UsersApi.md#usersListFollowingForUser) | **GET** /users/{username}/following | List the people a user follows
[**usersListGpgKeysForAuthenticatedUser**](UsersApi.md#usersListGpgKeysForAuthenticatedUser) | **GET** /user/gpg_keys | List GPG keys for the authenticated user
[**usersListGpgKeysForUser**](UsersApi.md#usersListGpgKeysForUser) | **GET** /users/{username}/gpg_keys | List GPG keys for a user
[**usersListPublicEmailsForAuthenticatedUser**](UsersApi.md#usersListPublicEmailsForAuthenticatedUser) | **GET** /user/public_emails | List public email addresses for the authenticated user
[**usersListPublicKeysForUser**](UsersApi.md#usersListPublicKeysForUser) | **GET** /users/{username}/keys | List public keys for a user
[**usersListPublicSshKeysForAuthenticatedUser**](UsersApi.md#usersListPublicSshKeysForAuthenticatedUser) | **GET** /user/keys | List public SSH keys for the authenticated user
[**usersListSocialAccountsForAuthenticatedUser**](UsersApi.md#usersListSocialAccountsForAuthenticatedUser) | **GET** /user/social_accounts | List social accounts for the authenticated user
[**usersListSocialAccountsForUser**](UsersApi.md#usersListSocialAccountsForUser) | **GET** /users/{username}/social_accounts | List social accounts for a user
[**usersListSshSigningKeysForAuthenticatedUser**](UsersApi.md#usersListSshSigningKeysForAuthenticatedUser) | **GET** /user/ssh_signing_keys | List SSH signing keys for the authenticated user
[**usersListSshSigningKeysForUser**](UsersApi.md#usersListSshSigningKeysForUser) | **GET** /users/{username}/ssh_signing_keys | List SSH signing keys for a user
[**usersSetPrimaryEmailVisibilityForAuthenticatedUser**](UsersApi.md#usersSetPrimaryEmailVisibilityForAuthenticatedUser) | **PATCH** /user/email/visibility | Set primary email visibility for the authenticated user
[**usersUnblock**](UsersApi.md#usersUnblock) | **DELETE** /user/blocks/{username} | Unblock a user
[**usersUnfollow**](UsersApi.md#usersUnfollow) | **DELETE** /user/following/{username} | Unfollow a user
[**usersUpdateAuthenticated**](UsersApi.md#usersUpdateAuthenticated) | **PATCH** /user | Update the authenticated user


<a id="usersAddEmailForAuthenticatedUser"></a>
# **usersAddEmailForAuthenticatedUser**
> kotlin.collections.List&lt;Email&gt; usersAddEmailForAuthenticatedUser(usersAddEmailForAuthenticatedUserRequest)

Add an email address for the authenticated user

OAuth app tokens and personal access tokens (classic) need the &#x60;user&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val usersAddEmailForAuthenticatedUserRequest : UsersAddEmailForAuthenticatedUserRequest = {"emails":["octocat@github.com","mona@github.com","octocat@octocat.org"]} // UsersAddEmailForAuthenticatedUserRequest | 
try {
    val result : kotlin.collections.List<Email> = apiInstance.usersAddEmailForAuthenticatedUser(usersAddEmailForAuthenticatedUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersAddEmailForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersAddEmailForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usersAddEmailForAuthenticatedUserRequest** | [**UsersAddEmailForAuthenticatedUserRequest**](UsersAddEmailForAuthenticatedUserRequest.md)|  | [optional]

### Return type

[**kotlin.collections.List&lt;Email&gt;**](Email.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usersAddSocialAccountForAuthenticatedUser"></a>
# **usersAddSocialAccountForAuthenticatedUser**
> kotlin.collections.List&lt;SocialAccount&gt; usersAddSocialAccountForAuthenticatedUser(usersAddSocialAccountForAuthenticatedUserRequest)

Add social accounts for the authenticated user

Add one or more social accounts to the authenticated user&#39;s profile.  OAuth app tokens and personal access tokens (classic) need the &#x60;user&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val usersAddSocialAccountForAuthenticatedUserRequest : UsersAddSocialAccountForAuthenticatedUserRequest = {"account_urls":["https://facebook.com/GitHub","https://www.youtube.com/@GitHub"]} // UsersAddSocialAccountForAuthenticatedUserRequest | 
try {
    val result : kotlin.collections.List<SocialAccount> = apiInstance.usersAddSocialAccountForAuthenticatedUser(usersAddSocialAccountForAuthenticatedUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersAddSocialAccountForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersAddSocialAccountForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usersAddSocialAccountForAuthenticatedUserRequest** | [**UsersAddSocialAccountForAuthenticatedUserRequest**](UsersAddSocialAccountForAuthenticatedUserRequest.md)|  |

### Return type

[**kotlin.collections.List&lt;SocialAccount&gt;**](SocialAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usersBlock"></a>
# **usersBlock**
> usersBlock(username)

Block a user

Blocks the given user and returns a 204. If the authenticated user cannot block the given user a 422 is returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.usersBlock(username)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersBlock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersBlock")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersCheckBlocked"></a>
# **usersCheckBlocked**
> usersCheckBlocked(username)

Check if a user is blocked by the authenticated user

Returns a 204 if the given user is blocked by the authenticated user. Returns a 404 if the given user is not blocked by the authenticated user, or if the given user account has been identified as spam by GitHub.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.usersCheckBlocked(username)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersCheckBlocked")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersCheckBlocked")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersCheckFollowingForUser"></a>
# **usersCheckFollowingForUser**
> usersCheckFollowingForUser(username, targetUser)

Check if a user follows another user



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val targetUser : kotlin.String = targetUser_example // kotlin.String | 
try {
    apiInstance.usersCheckFollowingForUser(username, targetUser)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersCheckFollowingForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersCheckFollowingForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **targetUser** | **kotlin.String**|  | [default to &quot;push&quot;]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="usersCheckPersonIsFollowedByAuthenticated"></a>
# **usersCheckPersonIsFollowedByAuthenticated**
> usersCheckPersonIsFollowedByAuthenticated(username)

Check if a person is followed by the authenticated user



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.usersCheckPersonIsFollowedByAuthenticated(username)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersCheckPersonIsFollowedByAuthenticated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersCheckPersonIsFollowedByAuthenticated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersCreateGpgKeyForAuthenticatedUser"></a>
# **usersCreateGpgKeyForAuthenticatedUser**
> GpgKey usersCreateGpgKeyForAuthenticatedUser(usersCreateGpgKeyForAuthenticatedUserRequest)

Create a GPG key for the authenticated user

Adds a GPG key to the authenticated user&#39;s GitHub account.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:gpg_key&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val usersCreateGpgKeyForAuthenticatedUserRequest : UsersCreateGpgKeyForAuthenticatedUserRequest = {"name":"Octocat's GPG Key","armored_public_key":"-----BEGIN PGP PUBLIC KEY BLOCK-----\nVersion: GnuPG v1\n\nmQINBFnZ2ZIBEADQ2Z7Z7\n-----END PGP PUBLIC KEY BLOCK-----"} // UsersCreateGpgKeyForAuthenticatedUserRequest | 
try {
    val result : GpgKey = apiInstance.usersCreateGpgKeyForAuthenticatedUser(usersCreateGpgKeyForAuthenticatedUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersCreateGpgKeyForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersCreateGpgKeyForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usersCreateGpgKeyForAuthenticatedUserRequest** | [**UsersCreateGpgKeyForAuthenticatedUserRequest**](UsersCreateGpgKeyForAuthenticatedUserRequest.md)|  |

### Return type

[**GpgKey**](GpgKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usersCreatePublicSshKeyForAuthenticatedUser"></a>
# **usersCreatePublicSshKeyForAuthenticatedUser**
> Key usersCreatePublicSshKeyForAuthenticatedUser(usersCreatePublicSshKeyForAuthenticatedUserRequest)

Create a public SSH key for the authenticated user

Adds a public SSH key to the authenticated user&#39;s GitHub account.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:gpg_key&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val usersCreatePublicSshKeyForAuthenticatedUserRequest : UsersCreatePublicSshKeyForAuthenticatedUserRequest = {"title":"ssh-rsa AAAAB3NzaC1yc2EAAA","key":"2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234"} // UsersCreatePublicSshKeyForAuthenticatedUserRequest | 
try {
    val result : Key = apiInstance.usersCreatePublicSshKeyForAuthenticatedUser(usersCreatePublicSshKeyForAuthenticatedUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersCreatePublicSshKeyForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersCreatePublicSshKeyForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usersCreatePublicSshKeyForAuthenticatedUserRequest** | [**UsersCreatePublicSshKeyForAuthenticatedUserRequest**](UsersCreatePublicSshKeyForAuthenticatedUserRequest.md)|  |

### Return type

[**Key**](Key.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usersCreateSshSigningKeyForAuthenticatedUser"></a>
# **usersCreateSshSigningKeyForAuthenticatedUser**
> SshSigningKey usersCreateSshSigningKeyForAuthenticatedUser(usersCreateSshSigningKeyForAuthenticatedUserRequest)

Create a SSH signing key for the authenticated user

Creates an SSH signing key for the authenticated user&#39;s GitHub account.  OAuth app tokens and personal access tokens (classic) need the &#x60;write:ssh_signing_key&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val usersCreateSshSigningKeyForAuthenticatedUserRequest : UsersCreateSshSigningKeyForAuthenticatedUserRequest = {title=ssh-rsa AAAAB3NzaC1yc2EAAA, key=2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234} // UsersCreateSshSigningKeyForAuthenticatedUserRequest | 
try {
    val result : SshSigningKey = apiInstance.usersCreateSshSigningKeyForAuthenticatedUser(usersCreateSshSigningKeyForAuthenticatedUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersCreateSshSigningKeyForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersCreateSshSigningKeyForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usersCreateSshSigningKeyForAuthenticatedUserRequest** | [**UsersCreateSshSigningKeyForAuthenticatedUserRequest**](UsersCreateSshSigningKeyForAuthenticatedUserRequest.md)|  |

### Return type

[**SshSigningKey**](SshSigningKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usersDeleteEmailForAuthenticatedUser"></a>
# **usersDeleteEmailForAuthenticatedUser**
> usersDeleteEmailForAuthenticatedUser(usersDeleteEmailForAuthenticatedUserRequest)

Delete an email address for the authenticated user

OAuth app tokens and personal access tokens (classic) need the &#x60;user&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val usersDeleteEmailForAuthenticatedUserRequest : UsersDeleteEmailForAuthenticatedUserRequest = {"emails":["octocat@github.com","mona@github.com"]} // UsersDeleteEmailForAuthenticatedUserRequest | 
try {
    apiInstance.usersDeleteEmailForAuthenticatedUser(usersDeleteEmailForAuthenticatedUserRequest)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersDeleteEmailForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersDeleteEmailForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usersDeleteEmailForAuthenticatedUserRequest** | [**UsersDeleteEmailForAuthenticatedUserRequest**](UsersDeleteEmailForAuthenticatedUserRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usersDeleteGpgKeyForAuthenticatedUser"></a>
# **usersDeleteGpgKeyForAuthenticatedUser**
> usersDeleteGpgKeyForAuthenticatedUser(gpgKeyId)

Delete a GPG key for the authenticated user

Removes a GPG key from the authenticated user&#39;s GitHub account.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:gpg_key&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val gpgKeyId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the GPG key.
try {
    apiInstance.usersDeleteGpgKeyForAuthenticatedUser(gpgKeyId)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersDeleteGpgKeyForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersDeleteGpgKeyForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gpgKeyId** | **kotlin.Int**| The unique identifier of the GPG key. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersDeletePublicSshKeyForAuthenticatedUser"></a>
# **usersDeletePublicSshKeyForAuthenticatedUser**
> usersDeletePublicSshKeyForAuthenticatedUser(keyId)

Delete a public SSH key for the authenticated user

Removes a public SSH key from the authenticated user&#39;s GitHub account.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:public_key&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val keyId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the key.
try {
    apiInstance.usersDeletePublicSshKeyForAuthenticatedUser(keyId)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersDeletePublicSshKeyForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersDeletePublicSshKeyForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **kotlin.Int**| The unique identifier of the key. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersDeleteSocialAccountForAuthenticatedUser"></a>
# **usersDeleteSocialAccountForAuthenticatedUser**
> usersDeleteSocialAccountForAuthenticatedUser(usersDeleteSocialAccountForAuthenticatedUserRequest)

Delete social accounts for the authenticated user

Deletes one or more social accounts from the authenticated user&#39;s profile.  OAuth app tokens and personal access tokens (classic) need the &#x60;user&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val usersDeleteSocialAccountForAuthenticatedUserRequest : UsersDeleteSocialAccountForAuthenticatedUserRequest = {"account_urls":["https://facebook.com/GitHub","https://www.youtube.com/@GitHub"]} // UsersDeleteSocialAccountForAuthenticatedUserRequest | 
try {
    apiInstance.usersDeleteSocialAccountForAuthenticatedUser(usersDeleteSocialAccountForAuthenticatedUserRequest)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersDeleteSocialAccountForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersDeleteSocialAccountForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usersDeleteSocialAccountForAuthenticatedUserRequest** | [**UsersDeleteSocialAccountForAuthenticatedUserRequest**](UsersDeleteSocialAccountForAuthenticatedUserRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usersDeleteSshSigningKeyForAuthenticatedUser"></a>
# **usersDeleteSshSigningKeyForAuthenticatedUser**
> usersDeleteSshSigningKeyForAuthenticatedUser(sshSigningKeyId)

Delete an SSH signing key for the authenticated user

Deletes an SSH signing key from the authenticated user&#39;s GitHub account.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:ssh_signing_key&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val sshSigningKeyId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the SSH signing key.
try {
    apiInstance.usersDeleteSshSigningKeyForAuthenticatedUser(sshSigningKeyId)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersDeleteSshSigningKeyForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersDeleteSshSigningKeyForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sshSigningKeyId** | **kotlin.Int**| The unique identifier of the SSH signing key. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersFollow"></a>
# **usersFollow**
> usersFollow(username)

Follow a user

Note that you&#39;ll need to set &#x60;Content-Length&#x60; to zero when calling out to this endpoint. For more information, see \&quot;[HTTP verbs](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;user:follow&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.usersFollow(username)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersFollow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersFollow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersGetAuthenticated"></a>
# **usersGetAuthenticated**
> UsersGetAuthenticated200Response usersGetAuthenticated()

Get the authenticated user

OAuth app tokens and personal access tokens (classic) need the &#x60;user&#x60; scope in order for the response to include private profile information.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
try {
    val result : UsersGetAuthenticated200Response = apiInstance.usersGetAuthenticated()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersGetAuthenticated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersGetAuthenticated")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UsersGetAuthenticated200Response**](UsersGetAuthenticated200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersGetByUsername"></a>
# **usersGetByUsername**
> UsersGetAuthenticated200Response usersGetByUsername(username)

Get a user

Provides publicly available information about someone with a GitHub account.  The &#x60;email&#x60; key in the following response is the publicly visible email address from your GitHub [profile page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to be “public” which provides an email entry for this endpoint. If you do not set a public email address for &#x60;email&#x60;, then it will have a value of &#x60;null&#x60;. You only see publicly visible email addresses when authenticated with GitHub. For more information, see [Authentication](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#authentication).  The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly. For more information, see \&quot;[Emails API](https://docs.github.com/rest/users/emails)\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    val result : UsersGetAuthenticated200Response = apiInstance.usersGetByUsername(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersGetByUsername")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersGetByUsername")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

[**UsersGetAuthenticated200Response**](UsersGetAuthenticated200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersGetContextForUser"></a>
# **usersGetContextForUser**
> Hovercard usersGetContextForUser(username, subjectType, subjectId)

Get contextual information for a user

Provides hovercard information. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.    The &#x60;subject_type&#x60; and &#x60;subject_id&#x60; parameters provide context for the person&#39;s hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about &#x60;octocat&#x60; who owns the &#x60;Spoon-Knife&#x60; repository, you would use a &#x60;subject_type&#x60; value of &#x60;repository&#x60; and a &#x60;subject_id&#x60; value of &#x60;1300192&#x60; (the ID of the &#x60;Spoon-Knife&#x60; repository).  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val subjectType : kotlin.String = subjectType_example // kotlin.String | Identifies which additional information you'd like to receive about the person's hovercard. Can be `organization`, `repository`, `issue`, `pull_request`. **Required** when using `subject_id`.
val subjectId : kotlin.String = subjectId_example // kotlin.String | Uses the ID for the `subject_type` you specified. **Required** when using `subject_type`.
try {
    val result : Hovercard = apiInstance.usersGetContextForUser(username, subjectType, subjectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersGetContextForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersGetContextForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **subjectType** | **kotlin.String**| Identifies which additional information you&#39;d like to receive about the person&#39;s hovercard. Can be &#x60;organization&#x60;, &#x60;repository&#x60;, &#x60;issue&#x60;, &#x60;pull_request&#x60;. **Required** when using &#x60;subject_id&#x60;. | [optional] [enum: organization, repository, issue, pull_request]
 **subjectId** | **kotlin.String**| Uses the ID for the &#x60;subject_type&#x60; you specified. **Required** when using &#x60;subject_type&#x60;. | [optional] [default to &quot;push&quot;]

### Return type

[**Hovercard**](Hovercard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersGetGpgKeyForAuthenticatedUser"></a>
# **usersGetGpgKeyForAuthenticatedUser**
> GpgKey usersGetGpgKeyForAuthenticatedUser(gpgKeyId)

Get a GPG key for the authenticated user

View extended details for a single GPG key.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:gpg_key&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val gpgKeyId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the GPG key.
try {
    val result : GpgKey = apiInstance.usersGetGpgKeyForAuthenticatedUser(gpgKeyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersGetGpgKeyForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersGetGpgKeyForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gpgKeyId** | **kotlin.Int**| The unique identifier of the GPG key. |

### Return type

[**GpgKey**](GpgKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersGetPublicSshKeyForAuthenticatedUser"></a>
# **usersGetPublicSshKeyForAuthenticatedUser**
> Key usersGetPublicSshKeyForAuthenticatedUser(keyId)

Get a public SSH key for the authenticated user

View extended details for a single public SSH key.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:public_key&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val keyId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the key.
try {
    val result : Key = apiInstance.usersGetPublicSshKeyForAuthenticatedUser(keyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersGetPublicSshKeyForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersGetPublicSshKeyForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **kotlin.Int**| The unique identifier of the key. |

### Return type

[**Key**](Key.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersGetSshSigningKeyForAuthenticatedUser"></a>
# **usersGetSshSigningKeyForAuthenticatedUser**
> SshSigningKey usersGetSshSigningKeyForAuthenticatedUser(sshSigningKeyId)

Get an SSH signing key for the authenticated user

Gets extended details for an SSH signing key.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:ssh_signing_key&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val sshSigningKeyId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the SSH signing key.
try {
    val result : SshSigningKey = apiInstance.usersGetSshSigningKeyForAuthenticatedUser(sshSigningKeyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersGetSshSigningKeyForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersGetSshSigningKeyForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sshSigningKeyId** | **kotlin.Int**| The unique identifier of the SSH signing key. |

### Return type

[**SshSigningKey**](SshSigningKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersList"></a>
# **usersList**
> kotlin.collections.List&lt;SimpleUser&gt; usersList(since, perPage)

List users

Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.  Note: Pagination is powered exclusively by the &#x60;since&#x60; parameter. Use the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers) to get the URL for the next page of users.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val since : kotlin.Int = 56 // kotlin.Int | A user ID. Only return users with an ID greater than this ID.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.usersList(since, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **kotlin.Int**| A user ID. Only return users with an ID greater than this ID. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersListBlockedByAuthenticatedUser"></a>
# **usersListBlockedByAuthenticatedUser**
> kotlin.collections.List&lt;SimpleUser&gt; usersListBlockedByAuthenticatedUser(perPage, page)

List users blocked by the authenticated user

List the users you&#39;ve blocked on your personal account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.usersListBlockedByAuthenticatedUser(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersListBlockedByAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersListBlockedByAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersListEmailsForAuthenticatedUser"></a>
# **usersListEmailsForAuthenticatedUser**
> kotlin.collections.List&lt;Email&gt; usersListEmailsForAuthenticatedUser(perPage, page)

List email addresses for the authenticated user

Lists all of your email addresses, and specifies which one is visible to the public.  OAuth app tokens and personal access tokens (classic) need the &#x60;user:email&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Email> = apiInstance.usersListEmailsForAuthenticatedUser(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersListEmailsForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersListEmailsForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Email&gt;**](Email.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersListFollowedByAuthenticatedUser"></a>
# **usersListFollowedByAuthenticatedUser**
> kotlin.collections.List&lt;SimpleUser&gt; usersListFollowedByAuthenticatedUser(perPage, page)

List the people the authenticated user follows

Lists the people who the authenticated user follows.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.usersListFollowedByAuthenticatedUser(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersListFollowedByAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersListFollowedByAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersListFollowersForAuthenticatedUser"></a>
# **usersListFollowersForAuthenticatedUser**
> kotlin.collections.List&lt;SimpleUser&gt; usersListFollowersForAuthenticatedUser(perPage, page)

List followers of the authenticated user

Lists the people following the authenticated user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.usersListFollowersForAuthenticatedUser(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersListFollowersForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersListFollowersForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersListFollowersForUser"></a>
# **usersListFollowersForUser**
> kotlin.collections.List&lt;SimpleUser&gt; usersListFollowersForUser(username, perPage, page)

List followers of a user

Lists the people following the specified user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.usersListFollowersForUser(username, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersListFollowersForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersListFollowersForUser")
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

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersListFollowingForUser"></a>
# **usersListFollowingForUser**
> kotlin.collections.List&lt;SimpleUser&gt; usersListFollowingForUser(username, perPage, page)

List the people a user follows

Lists the people who the specified user follows.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.usersListFollowingForUser(username, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersListFollowingForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersListFollowingForUser")
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

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersListGpgKeysForAuthenticatedUser"></a>
# **usersListGpgKeysForAuthenticatedUser**
> kotlin.collections.List&lt;GpgKey&gt; usersListGpgKeysForAuthenticatedUser(perPage, page)

List GPG keys for the authenticated user

Lists the current user&#39;s GPG keys.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:gpg_key&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<GpgKey> = apiInstance.usersListGpgKeysForAuthenticatedUser(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersListGpgKeysForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersListGpgKeysForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;GpgKey&gt;**](GpgKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersListGpgKeysForUser"></a>
# **usersListGpgKeysForUser**
> kotlin.collections.List&lt;GpgKey&gt; usersListGpgKeysForUser(username, perPage, page)

List GPG keys for a user

Lists the GPG keys for a user. This information is accessible by anyone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<GpgKey> = apiInstance.usersListGpgKeysForUser(username, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersListGpgKeysForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersListGpgKeysForUser")
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

[**kotlin.collections.List&lt;GpgKey&gt;**](GpgKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersListPublicEmailsForAuthenticatedUser"></a>
# **usersListPublicEmailsForAuthenticatedUser**
> kotlin.collections.List&lt;Email&gt; usersListPublicEmailsForAuthenticatedUser(perPage, page)

List public email addresses for the authenticated user

Lists your publicly visible email address, which you can set with the [Set primary email visibility for the authenticated user](https://docs.github.com/rest/users/emails#set-primary-email-visibility-for-the-authenticated-user) endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;user:email&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Email> = apiInstance.usersListPublicEmailsForAuthenticatedUser(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersListPublicEmailsForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersListPublicEmailsForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Email&gt;**](Email.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersListPublicKeysForUser"></a>
# **usersListPublicKeysForUser**
> kotlin.collections.List&lt;KeySimple&gt; usersListPublicKeysForUser(username, perPage, page)

List public keys for a user

Lists the _verified_ public SSH keys for a user. This is accessible by anyone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<KeySimple> = apiInstance.usersListPublicKeysForUser(username, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersListPublicKeysForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersListPublicKeysForUser")
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

[**kotlin.collections.List&lt;KeySimple&gt;**](KeySimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersListPublicSshKeysForAuthenticatedUser"></a>
# **usersListPublicSshKeysForAuthenticatedUser**
> kotlin.collections.List&lt;Key&gt; usersListPublicSshKeysForAuthenticatedUser(perPage, page)

List public SSH keys for the authenticated user

Lists the public SSH keys for the authenticated user&#39;s GitHub account.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:public_key&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Key> = apiInstance.usersListPublicSshKeysForAuthenticatedUser(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersListPublicSshKeysForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersListPublicSshKeysForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Key&gt;**](Key.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersListSocialAccountsForAuthenticatedUser"></a>
# **usersListSocialAccountsForAuthenticatedUser**
> kotlin.collections.List&lt;SocialAccount&gt; usersListSocialAccountsForAuthenticatedUser(perPage, page)

List social accounts for the authenticated user

Lists all of your social accounts.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SocialAccount> = apiInstance.usersListSocialAccountsForAuthenticatedUser(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersListSocialAccountsForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersListSocialAccountsForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;SocialAccount&gt;**](SocialAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersListSocialAccountsForUser"></a>
# **usersListSocialAccountsForUser**
> kotlin.collections.List&lt;SocialAccount&gt; usersListSocialAccountsForUser(username, perPage, page)

List social accounts for a user

Lists social media accounts for a user. This endpoint is accessible by anyone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SocialAccount> = apiInstance.usersListSocialAccountsForUser(username, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersListSocialAccountsForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersListSocialAccountsForUser")
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

[**kotlin.collections.List&lt;SocialAccount&gt;**](SocialAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersListSshSigningKeysForAuthenticatedUser"></a>
# **usersListSshSigningKeysForAuthenticatedUser**
> kotlin.collections.List&lt;SshSigningKey&gt; usersListSshSigningKeysForAuthenticatedUser(perPage, page)

List SSH signing keys for the authenticated user

Lists the SSH signing keys for the authenticated user&#39;s GitHub account.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:ssh_signing_key&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SshSigningKey> = apiInstance.usersListSshSigningKeysForAuthenticatedUser(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersListSshSigningKeysForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersListSshSigningKeysForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;SshSigningKey&gt;**](SshSigningKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersListSshSigningKeysForUser"></a>
# **usersListSshSigningKeysForUser**
> kotlin.collections.List&lt;SshSigningKey&gt; usersListSshSigningKeysForUser(username, perPage, page)

List SSH signing keys for a user

Lists the SSH signing keys for a user. This operation is accessible by anyone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SshSigningKey> = apiInstance.usersListSshSigningKeysForUser(username, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersListSshSigningKeysForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersListSshSigningKeysForUser")
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

[**kotlin.collections.List&lt;SshSigningKey&gt;**](SshSigningKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersSetPrimaryEmailVisibilityForAuthenticatedUser"></a>
# **usersSetPrimaryEmailVisibilityForAuthenticatedUser**
> kotlin.collections.List&lt;Email&gt; usersSetPrimaryEmailVisibilityForAuthenticatedUser(usersSetPrimaryEmailVisibilityForAuthenticatedUserRequest)

Set primary email visibility for the authenticated user

Sets the visibility for your primary email addresses.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val usersSetPrimaryEmailVisibilityForAuthenticatedUserRequest : UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest = {"visibility":"private"} // UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest | 
try {
    val result : kotlin.collections.List<Email> = apiInstance.usersSetPrimaryEmailVisibilityForAuthenticatedUser(usersSetPrimaryEmailVisibilityForAuthenticatedUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersSetPrimaryEmailVisibilityForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersSetPrimaryEmailVisibilityForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usersSetPrimaryEmailVisibilityForAuthenticatedUserRequest** | [**UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest**](UsersSetPrimaryEmailVisibilityForAuthenticatedUserRequest.md)|  |

### Return type

[**kotlin.collections.List&lt;Email&gt;**](Email.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="usersUnblock"></a>
# **usersUnblock**
> usersUnblock(username)

Unblock a user

Unblocks the given user and returns a 204.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.usersUnblock(username)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersUnblock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersUnblock")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersUnfollow"></a>
# **usersUnfollow**
> usersUnfollow(username)

Unfollow a user

OAuth app tokens and personal access tokens (classic) need the &#x60;user:follow&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.usersUnfollow(username)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersUnfollow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersUnfollow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="usersUpdateAuthenticated"></a>
# **usersUpdateAuthenticated**
> PrivateUser usersUpdateAuthenticated(usersUpdateAuthenticatedRequest)

Update the authenticated user

**Note:** If your email is set to private and you send an &#x60;email&#x60; parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val usersUpdateAuthenticatedRequest : UsersUpdateAuthenticatedRequest = {"blog":"https://github.com/blog","name":"monalisa octocat"} // UsersUpdateAuthenticatedRequest | 
try {
    val result : PrivateUser = apiInstance.usersUpdateAuthenticated(usersUpdateAuthenticatedRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersUpdateAuthenticated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersUpdateAuthenticated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usersUpdateAuthenticatedRequest** | [**UsersUpdateAuthenticatedRequest**](UsersUpdateAuthenticatedRequest.md)|  | [optional]

### Return type

[**PrivateUser**](PrivateUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

