# GitApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gitCreateBlob**](GitApi.md#gitCreateBlob) | **POST** /repos/{owner}/{repo}/git/blobs | Create a blob
[**gitCreateCommit**](GitApi.md#gitCreateCommit) | **POST** /repos/{owner}/{repo}/git/commits | Create a commit
[**gitCreateRef**](GitApi.md#gitCreateRef) | **POST** /repos/{owner}/{repo}/git/refs | Create a reference
[**gitCreateTag**](GitApi.md#gitCreateTag) | **POST** /repos/{owner}/{repo}/git/tags | Create a tag object
[**gitCreateTree**](GitApi.md#gitCreateTree) | **POST** /repos/{owner}/{repo}/git/trees | Create a tree
[**gitDeleteRef**](GitApi.md#gitDeleteRef) | **DELETE** /repos/{owner}/{repo}/git/refs/{ref} | Delete a reference
[**gitGetBlob**](GitApi.md#gitGetBlob) | **GET** /repos/{owner}/{repo}/git/blobs/{file_sha} | Get a blob
[**gitGetCommit**](GitApi.md#gitGetCommit) | **GET** /repos/{owner}/{repo}/git/commits/{commit_sha} | Get a commit object
[**gitGetRef**](GitApi.md#gitGetRef) | **GET** /repos/{owner}/{repo}/git/ref/{ref} | Get a reference
[**gitGetTag**](GitApi.md#gitGetTag) | **GET** /repos/{owner}/{repo}/git/tags/{tag_sha} | Get a tag
[**gitGetTree**](GitApi.md#gitGetTree) | **GET** /repos/{owner}/{repo}/git/trees/{tree_sha} | Get a tree
[**gitListMatchingRefs**](GitApi.md#gitListMatchingRefs) | **GET** /repos/{owner}/{repo}/git/matching-refs/{ref} | List matching references
[**gitUpdateRef**](GitApi.md#gitUpdateRef) | **PATCH** /repos/{owner}/{repo}/git/refs/{ref} | Update a reference


<a id="gitCreateBlob"></a>
# **gitCreateBlob**
> ShortBlob gitCreateBlob(owner, repo, gitCreateBlobRequest)

Create a blob



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GitApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val gitCreateBlobRequest : GitCreateBlobRequest = {"content":"Content of the blob","encoding":"utf-8"} // GitCreateBlobRequest | 
try {
    val result : ShortBlob = apiInstance.gitCreateBlob(owner, repo, gitCreateBlobRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitApi#gitCreateBlob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitApi#gitCreateBlob")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **gitCreateBlobRequest** | [**GitCreateBlobRequest**](GitCreateBlobRequest.md)|  |

### Return type

[**ShortBlob**](ShortBlob.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="gitCreateCommit"></a>
# **gitCreateCommit**
> GitCommit gitCreateCommit(owner, repo, gitCreateCommitRequest)

Create a commit

Creates a new Git [commit object](https://git-scm.com/book/en/v2/Git-Internals-Git-Objects).  **Signature verification object**  The response will include a &#x60;verification&#x60; object that describes the result of verifying the commit&#39;s signature. The following fields are included in the &#x60;verification&#x60; object:  | Name | Type | Description | | ---- | ---- | ----------- | | &#x60;verified&#x60; | &#x60;boolean&#x60; | Indicates whether GitHub considers the signature in this commit to be verified. | | &#x60;reason&#x60; | &#x60;string&#x60; | The reason for verified value. Possible values and their meanings are enumerated in the table below. | | &#x60;signature&#x60; | &#x60;string&#x60; | The signature that was extracted from the commit. | | &#x60;payload&#x60; | &#x60;string&#x60; | The value that was signed. |  These are the possible values for &#x60;reason&#x60; in the &#x60;verification&#x60; object:  | Value | Description | | ----- | ----------- | | &#x60;expired_key&#x60; | The key that made the signature is expired. | | &#x60;not_signing_key&#x60; | The \&quot;signing\&quot; flag is not among the usage flags in the GPG key that made the signature. | | &#x60;gpgverify_error&#x60; | There was an error communicating with the signature verification service. | | &#x60;gpgverify_unavailable&#x60; | The signature verification service is currently unavailable. | | &#x60;unsigned&#x60; | The object does not include a signature. | | &#x60;unknown_signature_type&#x60; | A non-PGP signature was found in the commit. | | &#x60;no_user&#x60; | No user was associated with the &#x60;committer&#x60; email address in the commit. | | &#x60;unverified_email&#x60; | The &#x60;committer&#x60; email address in the commit was associated with a user, but the email address is not verified on their account. | | &#x60;bad_email&#x60; | The &#x60;committer&#x60; email address in the commit is not included in the identities of the PGP key that made the signature. | | &#x60;unknown_key&#x60; | The key that made the signature has not been registered with any user&#39;s account. | | &#x60;malformed_signature&#x60; | There was an error parsing the signature. | | &#x60;invalid&#x60; | The signature could not be cryptographically verified using the key whose key-id was found in the signature. | | &#x60;valid&#x60; | None of the above errors applied, so the signature is considered to be verified. |

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GitApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val gitCreateCommitRequest : GitCreateCommitRequest = {"message":"my commit message","author":{"name":"Mona Octocat","email":"octocat@github.com","date":"2008-07-09T16:13:30+12:00"},"parents":["7d1b31e74ee336d15cbd21741bc88a537ed063a0"],"tree":"827efc6d56897b048c772eb4087f854f46256132","signature":"-----BEGIN PGP SIGNATURE-----\n\niQIzBAABAQAdFiEESn/54jMNIrGSE6Tp6cQjvhfv7nAFAlnT71cACgkQ6cQjvhfv\n7nCWwA//XVqBKWO0zF+bZl6pggvky3Oc2j1pNFuRWZ29LXpNuD5WUGXGG209B0hI\nDkmcGk19ZKUTnEUJV2Xd0R7AW01S/YSub7OYcgBkI7qUE13FVHN5ln1KvH2all2n\n2+JCV1HcJLEoTjqIFZSSu/sMdhkLQ9/NsmMAzpf/iIM0nQOyU4YRex9eD1bYj6nA\nOQPIDdAuaTQj1gFPHYLzM4zJnCqGdRlg0sOM/zC5apBNzIwlgREatOYQSCfCKV7k\nnrU34X8b9BzQaUx48Qa+Dmfn5KQ8dl27RNeWAqlkuWyv3pUauH9UeYW+KyuJeMkU\n+NyHgAsWFaCFl23kCHThbLStMZOYEnGagrd0hnm1TPS4GJkV4wfYMwnI4KuSlHKB\njHl3Js9vNzEUQipQJbgCgTiWvRJoK3ENwBTMVkKHaqT4x9U4Jk/XZB6Q8MA09ezJ\n3QgiTjTAGcum9E9QiJqMYdWQPWkaBIRRz5cET6HPB48YNXAAUsfmuYsGrnVLYbG+\nUpC6I97VybYHTy2O9XSGoaLeMI9CsFn38ycAxxbWagk5mhclNTP5mezIq6wKSwmr\nX11FW3n1J23fWZn5HJMBsRnUCgzqzX3871IqLYHqRJ/bpZ4h20RhTyPj5c/z7QXp\neSakNQMfbbMcljkha+ZMuVQX1K9aRlVqbmv3ZMWh+OijLYVU2bc=\n=5Io4\n-----END PGP SIGNATURE-----\n"} // GitCreateCommitRequest | 
try {
    val result : GitCommit = apiInstance.gitCreateCommit(owner, repo, gitCreateCommitRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitApi#gitCreateCommit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitApi#gitCreateCommit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **gitCreateCommitRequest** | [**GitCreateCommitRequest**](GitCreateCommitRequest.md)|  |

### Return type

[**GitCommit**](GitCommit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="gitCreateRef"></a>
# **gitCreateRef**
> GitRef gitCreateRef(owner, repo, gitCreateRefRequest)

Create a reference

Creates a reference for your repository. You are unable to create new references for empty repositories, even if the commit SHA-1 hash used exists. Empty repositories are repositories without branches.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GitApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val gitCreateRefRequest : GitCreateRefRequest = {"ref":"refs/heads/featureA","sha":"aa218f56b14c9653891f9e74264a383fa43fefbd"} // GitCreateRefRequest | 
try {
    val result : GitRef = apiInstance.gitCreateRef(owner, repo, gitCreateRefRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitApi#gitCreateRef")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitApi#gitCreateRef")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **gitCreateRefRequest** | [**GitCreateRefRequest**](GitCreateRefRequest.md)|  |

### Return type

[**GitRef**](GitRef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="gitCreateTag"></a>
# **gitCreateTag**
> GitTag gitCreateTag(owner, repo, gitCreateTagRequest)

Create a tag object

Note that creating a tag object does not create the reference that makes a tag in Git. If you want to create an annotated tag in Git, you have to do this call to create the tag object, and then [create](https://docs.github.com/rest/git/refs#create-a-reference) the &#x60;refs/tags/[tag]&#x60; reference. If you want to create a lightweight tag, you only have to [create](https://docs.github.com/rest/git/refs#create-a-reference) the tag reference - this call would be unnecessary.  **Signature verification object**  The response will include a &#x60;verification&#x60; object that describes the result of verifying the commit&#39;s signature. The following fields are included in the &#x60;verification&#x60; object:  | Name | Type | Description | | ---- | ---- | ----------- | | &#x60;verified&#x60; | &#x60;boolean&#x60; | Indicates whether GitHub considers the signature in this commit to be verified. | | &#x60;reason&#x60; | &#x60;string&#x60; | The reason for verified value. Possible values and their meanings are enumerated in table below. | | &#x60;signature&#x60; | &#x60;string&#x60; | The signature that was extracted from the commit. | | &#x60;payload&#x60; | &#x60;string&#x60; | The value that was signed. |  These are the possible values for &#x60;reason&#x60; in the &#x60;verification&#x60; object:  | Value | Description | | ----- | ----------- | | &#x60;expired_key&#x60; | The key that made the signature is expired. | | &#x60;not_signing_key&#x60; | The \&quot;signing\&quot; flag is not among the usage flags in the GPG key that made the signature. | | &#x60;gpgverify_error&#x60; | There was an error communicating with the signature verification service. | | &#x60;gpgverify_unavailable&#x60; | The signature verification service is currently unavailable. | | &#x60;unsigned&#x60; | The object does not include a signature. | | &#x60;unknown_signature_type&#x60; | A non-PGP signature was found in the commit. | | &#x60;no_user&#x60; | No user was associated with the &#x60;committer&#x60; email address in the commit. | | &#x60;unverified_email&#x60; | The &#x60;committer&#x60; email address in the commit was associated with a user, but the email address is not verified on their account. | | &#x60;bad_email&#x60; | The &#x60;committer&#x60; email address in the commit is not included in the identities of the PGP key that made the signature. | | &#x60;unknown_key&#x60; | The key that made the signature has not been registered with any user&#39;s account. | | &#x60;malformed_signature&#x60; | There was an error parsing the signature. | | &#x60;invalid&#x60; | The signature could not be cryptographically verified using the key whose key-id was found in the signature. | | &#x60;valid&#x60; | None of the above errors applied, so the signature is considered to be verified. |

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GitApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val gitCreateTagRequest : GitCreateTagRequest = {"tag":"v0.0.1","message":"initial version","object":"c3d0be41ecbe669545ee3e94d31ed9a4bc91ee3c","type":"commit","tagger":{"name":"Monalisa Octocat","email":"octocat@github.com","date":"2011-06-17T14:53:35-07:00"}} // GitCreateTagRequest | 
try {
    val result : GitTag = apiInstance.gitCreateTag(owner, repo, gitCreateTagRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitApi#gitCreateTag")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitApi#gitCreateTag")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **gitCreateTagRequest** | [**GitCreateTagRequest**](GitCreateTagRequest.md)|  |

### Return type

[**GitTag**](GitTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="gitCreateTree"></a>
# **gitCreateTree**
> GitTree gitCreateTree(owner, repo, gitCreateTreeRequest)

Create a tree

The tree creation API accepts nested entries. If you specify both a tree and a nested path modifying that tree, this endpoint will overwrite the contents of the tree with the new path contents, and create a new tree structure.  If you use this endpoint to add, delete, or modify the file contents in a tree, you will need to commit the tree and then update a branch to point to the commit. For more information see \&quot;[Create a commit](https://docs.github.com/rest/git/commits#create-a-commit)\&quot; and \&quot;[Update a reference](https://docs.github.com/rest/git/refs#update-a-reference).\&quot;  Returns an error if you try to delete a file that does not exist.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GitApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val gitCreateTreeRequest : GitCreateTreeRequest = {"base_tree":"9fb037999f264ba9a7fc6274d15fa3ae2ab98312","tree":[{"path":"file.rb","mode":"100644","type":"blob","sha":"44b4fc6d56897b048c772eb4087f854f46256132"}]} // GitCreateTreeRequest | 
try {
    val result : GitTree = apiInstance.gitCreateTree(owner, repo, gitCreateTreeRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitApi#gitCreateTree")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitApi#gitCreateTree")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **gitCreateTreeRequest** | [**GitCreateTreeRequest**](GitCreateTreeRequest.md)|  |

### Return type

[**GitTree**](GitTree.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="gitDeleteRef"></a>
# **gitDeleteRef**
> gitDeleteRef(owner, repo, ref)

Delete a reference

Deletes the provided reference.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GitApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ref : kotlin.String = heads/feature-a // kotlin.String | The Git reference. For more information, see \"[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\" in the Git documentation.
try {
    apiInstance.gitDeleteRef(owner, repo, ref)
} catch (e: ClientException) {
    println("4xx response calling GitApi#gitDeleteRef")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitApi#gitDeleteRef")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ref** | **kotlin.String**| The Git reference. For more information, see \&quot;[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\&quot; in the Git documentation. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gitGetBlob"></a>
# **gitGetBlob**
> Blob gitGetBlob(owner, repo, fileSha)

Get a blob

The &#x60;content&#x60; in the response will always be Base64 encoded.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw blob data. - **&#x60;application/vnd.github+json&#x60;**: Returns a JSON representation of the blob with &#x60;content&#x60; as a base64 encoded string. This is the default if no media type is specified.  **Note** This endpoint supports blobs up to 100 megabytes in size.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GitApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val fileSha : kotlin.String = fileSha_example // kotlin.String | 
try {
    val result : Blob = apiInstance.gitGetBlob(owner, repo, fileSha)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitApi#gitGetBlob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitApi#gitGetBlob")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **fileSha** | **kotlin.String**|  | [default to &quot;push&quot;]

### Return type

[**Blob**](Blob.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gitGetCommit"></a>
# **gitGetCommit**
> GitCommit gitGetCommit(owner, repo, commitSha)

Get a commit object

Gets a Git [commit object](https://git-scm.com/book/en/v2/Git-Internals-Git-Objects).  To get the contents of a commit, see \&quot;[Get a commit](/rest/commits/commits#get-a-commit).\&quot;  **Signature verification object**  The response will include a &#x60;verification&#x60; object that describes the result of verifying the commit&#39;s signature. The following fields are included in the &#x60;verification&#x60; object:  | Name | Type | Description | | ---- | ---- | ----------- | | &#x60;verified&#x60; | &#x60;boolean&#x60; | Indicates whether GitHub considers the signature in this commit to be verified. | | &#x60;reason&#x60; | &#x60;string&#x60; | The reason for verified value. Possible values and their meanings are enumerated in the table below. | | &#x60;signature&#x60; | &#x60;string&#x60; | The signature that was extracted from the commit. | | &#x60;payload&#x60; | &#x60;string&#x60; | The value that was signed. |  These are the possible values for &#x60;reason&#x60; in the &#x60;verification&#x60; object:  | Value | Description | | ----- | ----------- | | &#x60;expired_key&#x60; | The key that made the signature is expired. | | &#x60;not_signing_key&#x60; | The \&quot;signing\&quot; flag is not among the usage flags in the GPG key that made the signature. | | &#x60;gpgverify_error&#x60; | There was an error communicating with the signature verification service. | | &#x60;gpgverify_unavailable&#x60; | The signature verification service is currently unavailable. | | &#x60;unsigned&#x60; | The object does not include a signature. | | &#x60;unknown_signature_type&#x60; | A non-PGP signature was found in the commit. | | &#x60;no_user&#x60; | No user was associated with the &#x60;committer&#x60; email address in the commit. | | &#x60;unverified_email&#x60; | The &#x60;committer&#x60; email address in the commit was associated with a user, but the email address is not verified on their account. | | &#x60;bad_email&#x60; | The &#x60;committer&#x60; email address in the commit is not included in the identities of the PGP key that made the signature. | | &#x60;unknown_key&#x60; | The key that made the signature has not been registered with any user&#39;s account. | | &#x60;malformed_signature&#x60; | There was an error parsing the signature. | | &#x60;invalid&#x60; | The signature could not be cryptographically verified using the key whose key-id was found in the signature. | | &#x60;valid&#x60; | None of the above errors applied, so the signature is considered to be verified. |

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GitApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commitSha : kotlin.String = commitSha_example // kotlin.String | The SHA of the commit.
try {
    val result : GitCommit = apiInstance.gitGetCommit(owner, repo, commitSha)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitApi#gitGetCommit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitApi#gitGetCommit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commitSha** | **kotlin.String**| The SHA of the commit. |

### Return type

[**GitCommit**](GitCommit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gitGetRef"></a>
# **gitGetRef**
> GitRef gitGetRef(owner, repo, ref)

Get a reference

Returns a single reference from your Git database. The &#x60;:ref&#x60; in the URL must be formatted as &#x60;heads/&lt;branch name&gt;&#x60; for branches and &#x60;tags/&lt;tag name&gt;&#x60; for tags. If the &#x60;:ref&#x60; doesn&#39;t match an existing ref, a &#x60;404&#x60; is returned.  **Note:** You need to explicitly [request a pull request](https://docs.github.com/rest/pulls/pulls#get-a-pull-request) to trigger a test merge commit, which checks the mergeability of pull requests. For more information, see \&quot;[Checking mergeability of pull requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pull-requests)\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GitApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ref : kotlin.String = heads/feature-a // kotlin.String | The Git reference. For more information, see \"[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\" in the Git documentation.
try {
    val result : GitRef = apiInstance.gitGetRef(owner, repo, ref)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitApi#gitGetRef")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitApi#gitGetRef")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ref** | **kotlin.String**| The Git reference. For more information, see \&quot;[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\&quot; in the Git documentation. |

### Return type

[**GitRef**](GitRef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gitGetTag"></a>
# **gitGetTag**
> GitTag gitGetTag(owner, repo, tagSha)

Get a tag

**Signature verification object**  The response will include a &#x60;verification&#x60; object that describes the result of verifying the commit&#39;s signature. The following fields are included in the &#x60;verification&#x60; object:  | Name | Type | Description | | ---- | ---- | ----------- | | &#x60;verified&#x60; | &#x60;boolean&#x60; | Indicates whether GitHub considers the signature in this commit to be verified. | | &#x60;reason&#x60; | &#x60;string&#x60; | The reason for verified value. Possible values and their meanings are enumerated in table below. | | &#x60;signature&#x60; | &#x60;string&#x60; | The signature that was extracted from the commit. | | &#x60;payload&#x60; | &#x60;string&#x60; | The value that was signed. |  These are the possible values for &#x60;reason&#x60; in the &#x60;verification&#x60; object:  | Value | Description | | ----- | ----------- | | &#x60;expired_key&#x60; | The key that made the signature is expired. | | &#x60;not_signing_key&#x60; | The \&quot;signing\&quot; flag is not among the usage flags in the GPG key that made the signature. | | &#x60;gpgverify_error&#x60; | There was an error communicating with the signature verification service. | | &#x60;gpgverify_unavailable&#x60; | The signature verification service is currently unavailable. | | &#x60;unsigned&#x60; | The object does not include a signature. | | &#x60;unknown_signature_type&#x60; | A non-PGP signature was found in the commit. | | &#x60;no_user&#x60; | No user was associated with the &#x60;committer&#x60; email address in the commit. | | &#x60;unverified_email&#x60; | The &#x60;committer&#x60; email address in the commit was associated with a user, but the email address is not verified on their account. | | &#x60;bad_email&#x60; | The &#x60;committer&#x60; email address in the commit is not included in the identities of the PGP key that made the signature. | | &#x60;unknown_key&#x60; | The key that made the signature has not been registered with any user&#39;s account. | | &#x60;malformed_signature&#x60; | There was an error parsing the signature. | | &#x60;invalid&#x60; | The signature could not be cryptographically verified using the key whose key-id was found in the signature. | | &#x60;valid&#x60; | None of the above errors applied, so the signature is considered to be verified. |

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GitApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val tagSha : kotlin.String = tagSha_example // kotlin.String | 
try {
    val result : GitTag = apiInstance.gitGetTag(owner, repo, tagSha)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitApi#gitGetTag")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitApi#gitGetTag")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **tagSha** | **kotlin.String**|  | [default to &quot;push&quot;]

### Return type

[**GitTag**](GitTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gitGetTree"></a>
# **gitGetTree**
> GitTree gitGetTree(owner, repo, treeSha, recursive)

Get a tree

Returns a single tree using the SHA1 value or ref name for that tree.  If &#x60;truncated&#x60; is &#x60;true&#x60; in the response then the number of items in the &#x60;tree&#x60; array exceeded our maximum limit. If you need to fetch more items, use the non-recursive method of fetching trees, and fetch one sub-tree at a time.   **Note**: The limit for the &#x60;tree&#x60; array is 100,000 entries with a maximum size of 7 MB when using the &#x60;recursive&#x60; parameter.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GitApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val treeSha : kotlin.String = treeSha_example // kotlin.String | The SHA1 value or ref (branch or tag) name of the tree.
val recursive : kotlin.String = recursive_example // kotlin.String | Setting this parameter to any value returns the objects or subtrees referenced by the tree specified in `:tree_sha`. For example, setting `recursive` to any of the following will enable returning objects or subtrees: `0`, `1`, `\"true\"`, and `\"false\"`. Omit this parameter to prevent recursively returning objects or subtrees.
try {
    val result : GitTree = apiInstance.gitGetTree(owner, repo, treeSha, recursive)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitApi#gitGetTree")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitApi#gitGetTree")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **treeSha** | **kotlin.String**| The SHA1 value or ref (branch or tag) name of the tree. | [default to &quot;push&quot;]
 **recursive** | **kotlin.String**| Setting this parameter to any value returns the objects or subtrees referenced by the tree specified in &#x60;:tree_sha&#x60;. For example, setting &#x60;recursive&#x60; to any of the following will enable returning objects or subtrees: &#x60;0&#x60;, &#x60;1&#x60;, &#x60;\&quot;true\&quot;&#x60;, and &#x60;\&quot;false\&quot;&#x60;. Omit this parameter to prevent recursively returning objects or subtrees. | [optional] [default to &quot;push&quot;]

### Return type

[**GitTree**](GitTree.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gitListMatchingRefs"></a>
# **gitListMatchingRefs**
> kotlin.collections.List&lt;GitRef&gt; gitListMatchingRefs(owner, repo, ref)

List matching references

Returns an array of references from your Git database that match the supplied name. The &#x60;:ref&#x60; in the URL must be formatted as &#x60;heads/&lt;branch name&gt;&#x60; for branches and &#x60;tags/&lt;tag name&gt;&#x60; for tags. If the &#x60;:ref&#x60; doesn&#39;t exist in the repository, but existing refs start with &#x60;:ref&#x60;, they will be returned as an array.  When you use this endpoint without providing a &#x60;:ref&#x60;, it will return an array of all the references from your Git database, including notes and stashes if they exist on the server. Anything in the namespace is returned, not just &#x60;heads&#x60; and &#x60;tags&#x60;.  **Note:** You need to explicitly [request a pull request](https://docs.github.com/rest/pulls/pulls#get-a-pull-request) to trigger a test merge commit, which checks the mergeability of pull requests. For more information, see \&quot;[Checking mergeability of pull requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pull-requests)\&quot;.  If you request matching references for a branch named &#x60;feature&#x60; but the branch &#x60;feature&#x60; doesn&#39;t exist, the response can still include other matching head refs that start with the word &#x60;feature&#x60;, such as &#x60;featureA&#x60; and &#x60;featureB&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GitApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ref : kotlin.String = heads/feature-a // kotlin.String | The Git reference. For more information, see \"[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\" in the Git documentation.
try {
    val result : kotlin.collections.List<GitRef> = apiInstance.gitListMatchingRefs(owner, repo, ref)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitApi#gitListMatchingRefs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitApi#gitListMatchingRefs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ref** | **kotlin.String**| The Git reference. For more information, see \&quot;[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\&quot; in the Git documentation. |

### Return type

[**kotlin.collections.List&lt;GitRef&gt;**](GitRef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="gitUpdateRef"></a>
# **gitUpdateRef**
> GitRef gitUpdateRef(owner, repo, ref, gitUpdateRefRequest)

Update a reference

Updates the provided reference to point to a new SHA. For more information, see \&quot;[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\&quot; in the Git documentation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GitApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ref : kotlin.String = heads/feature-a // kotlin.String | The Git reference. For more information, see \"[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\" in the Git documentation.
val gitUpdateRefRequest : GitUpdateRefRequest = {"sha":"aa218f56b14c9653891f9e74264a383fa43fefbd","force":true} // GitUpdateRefRequest | 
try {
    val result : GitRef = apiInstance.gitUpdateRef(owner, repo, ref, gitUpdateRefRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GitApi#gitUpdateRef")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GitApi#gitUpdateRef")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ref** | **kotlin.String**| The Git reference. For more information, see \&quot;[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\&quot; in the Git documentation. |
 **gitUpdateRefRequest** | [**GitUpdateRefRequest**](GitUpdateRefRequest.md)|  |

### Return type

[**GitRef**](GitRef.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

