/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import org.openapitools.client.models.BasicError
import org.openapitools.client.models.Blob
import org.openapitools.client.models.GitCommit
import org.openapitools.client.models.GitCreateBlobRequest
import org.openapitools.client.models.GitCreateCommitRequest
import org.openapitools.client.models.GitCreateRefRequest
import org.openapitools.client.models.GitCreateTagRequest
import org.openapitools.client.models.GitCreateTreeRequest
import org.openapitools.client.models.GitRef
import org.openapitools.client.models.GitTag
import org.openapitools.client.models.GitTree
import org.openapitools.client.models.GitUpdateRefRequest
import org.openapitools.client.models.ShortBlob
import org.openapitools.client.models.ValidationError

import org.openapitools.client.infrastructure.*
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder

    open class GitApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    ) : ApiClient(
        baseUrl,
        httpClientEngine,
        httpClientConfig,
    ) {

        /**
        * Create a blob
        * 
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param gitCreateBlobRequest  
         * @return ShortBlob
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun gitCreateBlob(owner: kotlin.String, repo: kotlin.String, gitCreateBlobRequest: GitCreateBlobRequest): HttpResponse<ShortBlob> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = gitCreateBlobRequest

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/repos/{owner}/{repo}/git/blobs".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Create a commit
        * Creates a new Git [commit object](https://git-scm.com/book/en/v2/Git-Internals-Git-Objects).  **Signature verification object**  The response will include a &#x60;verification&#x60; object that describes the result of verifying the commit&#39;s signature. The following fields are included in the &#x60;verification&#x60; object:  | Name | Type | Description | | ---- | ---- | ----------- | | &#x60;verified&#x60; | &#x60;boolean&#x60; | Indicates whether GitHub considers the signature in this commit to be verified. | | &#x60;reason&#x60; | &#x60;string&#x60; | The reason for verified value. Possible values and their meanings are enumerated in the table below. | | &#x60;signature&#x60; | &#x60;string&#x60; | The signature that was extracted from the commit. | | &#x60;payload&#x60; | &#x60;string&#x60; | The value that was signed. |  These are the possible values for &#x60;reason&#x60; in the &#x60;verification&#x60; object:  | Value | Description | | ----- | ----------- | | &#x60;expired_key&#x60; | The key that made the signature is expired. | | &#x60;not_signing_key&#x60; | The \&quot;signing\&quot; flag is not among the usage flags in the GPG key that made the signature. | | &#x60;gpgverify_error&#x60; | There was an error communicating with the signature verification service. | | &#x60;gpgverify_unavailable&#x60; | The signature verification service is currently unavailable. | | &#x60;unsigned&#x60; | The object does not include a signature. | | &#x60;unknown_signature_type&#x60; | A non-PGP signature was found in the commit. | | &#x60;no_user&#x60; | No user was associated with the &#x60;committer&#x60; email address in the commit. | | &#x60;unverified_email&#x60; | The &#x60;committer&#x60; email address in the commit was associated with a user, but the email address is not verified on their account. | | &#x60;bad_email&#x60; | The &#x60;committer&#x60; email address in the commit is not included in the identities of the PGP key that made the signature. | | &#x60;unknown_key&#x60; | The key that made the signature has not been registered with any user&#39;s account. | | &#x60;malformed_signature&#x60; | There was an error parsing the signature. | | &#x60;invalid&#x60; | The signature could not be cryptographically verified using the key whose key-id was found in the signature. | | &#x60;valid&#x60; | None of the above errors applied, so the signature is considered to be verified. |
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param gitCreateCommitRequest  
         * @return GitCommit
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun gitCreateCommit(owner: kotlin.String, repo: kotlin.String, gitCreateCommitRequest: GitCreateCommitRequest): HttpResponse<GitCommit> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = gitCreateCommitRequest

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/repos/{owner}/{repo}/git/commits".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Create a reference
        * Creates a reference for your repository. You are unable to create new references for empty repositories, even if the commit SHA-1 hash used exists. Empty repositories are repositories without branches.
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param gitCreateRefRequest  
         * @return GitRef
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun gitCreateRef(owner: kotlin.String, repo: kotlin.String, gitCreateRefRequest: GitCreateRefRequest): HttpResponse<GitRef> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = gitCreateRefRequest

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/repos/{owner}/{repo}/git/refs".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Create a tag object
        * Note that creating a tag object does not create the reference that makes a tag in Git. If you want to create an annotated tag in Git, you have to do this call to create the tag object, and then [create](https://docs.github.com/rest/git/refs#create-a-reference) the &#x60;refs/tags/[tag]&#x60; reference. If you want to create a lightweight tag, you only have to [create](https://docs.github.com/rest/git/refs#create-a-reference) the tag reference - this call would be unnecessary.  **Signature verification object**  The response will include a &#x60;verification&#x60; object that describes the result of verifying the commit&#39;s signature. The following fields are included in the &#x60;verification&#x60; object:  | Name | Type | Description | | ---- | ---- | ----------- | | &#x60;verified&#x60; | &#x60;boolean&#x60; | Indicates whether GitHub considers the signature in this commit to be verified. | | &#x60;reason&#x60; | &#x60;string&#x60; | The reason for verified value. Possible values and their meanings are enumerated in table below. | | &#x60;signature&#x60; | &#x60;string&#x60; | The signature that was extracted from the commit. | | &#x60;payload&#x60; | &#x60;string&#x60; | The value that was signed. |  These are the possible values for &#x60;reason&#x60; in the &#x60;verification&#x60; object:  | Value | Description | | ----- | ----------- | | &#x60;expired_key&#x60; | The key that made the signature is expired. | | &#x60;not_signing_key&#x60; | The \&quot;signing\&quot; flag is not among the usage flags in the GPG key that made the signature. | | &#x60;gpgverify_error&#x60; | There was an error communicating with the signature verification service. | | &#x60;gpgverify_unavailable&#x60; | The signature verification service is currently unavailable. | | &#x60;unsigned&#x60; | The object does not include a signature. | | &#x60;unknown_signature_type&#x60; | A non-PGP signature was found in the commit. | | &#x60;no_user&#x60; | No user was associated with the &#x60;committer&#x60; email address in the commit. | | &#x60;unverified_email&#x60; | The &#x60;committer&#x60; email address in the commit was associated with a user, but the email address is not verified on their account. | | &#x60;bad_email&#x60; | The &#x60;committer&#x60; email address in the commit is not included in the identities of the PGP key that made the signature. | | &#x60;unknown_key&#x60; | The key that made the signature has not been registered with any user&#39;s account. | | &#x60;malformed_signature&#x60; | There was an error parsing the signature. | | &#x60;invalid&#x60; | The signature could not be cryptographically verified using the key whose key-id was found in the signature. | | &#x60;valid&#x60; | None of the above errors applied, so the signature is considered to be verified. |
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param gitCreateTagRequest  
         * @return GitTag
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun gitCreateTag(owner: kotlin.String, repo: kotlin.String, gitCreateTagRequest: GitCreateTagRequest): HttpResponse<GitTag> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = gitCreateTagRequest

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/repos/{owner}/{repo}/git/tags".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Create a tree
        * The tree creation API accepts nested entries. If you specify both a tree and a nested path modifying that tree, this endpoint will overwrite the contents of the tree with the new path contents, and create a new tree structure.  If you use this endpoint to add, delete, or modify the file contents in a tree, you will need to commit the tree and then update a branch to point to the commit. For more information see \&quot;[Create a commit](https://docs.github.com/rest/git/commits#create-a-commit)\&quot; and \&quot;[Update a reference](https://docs.github.com/rest/git/refs#update-a-reference).\&quot;  Returns an error if you try to delete a file that does not exist.
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param gitCreateTreeRequest  
         * @return GitTree
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun gitCreateTree(owner: kotlin.String, repo: kotlin.String, gitCreateTreeRequest: GitCreateTreeRequest): HttpResponse<GitTree> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = gitCreateTreeRequest

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/repos/{owner}/{repo}/git/trees".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Delete a reference
        * Deletes the provided reference.
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param ref The Git reference. For more information, see \&quot;[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\&quot; in the Git documentation. 
         * @return void
        */
        open suspend fun gitDeleteRef(owner: kotlin.String, repo: kotlin.String, ref: kotlin.String): HttpResponse<Unit> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/repos/{owner}/{repo}/git/refs/{ref}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "ref" + "}", "$ref"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Get a blob
        * The &#x60;content&#x60; in the response will always be Base64 encoded.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw blob data. - **&#x60;application/vnd.github+json&#x60;**: Returns a JSON representation of the blob with &#x60;content&#x60; as a base64 encoded string. This is the default if no media type is specified.  **Note** This endpoint supports blobs up to 100 megabytes in size.
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param fileSha  
         * @return Blob
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun gitGetBlob(owner: kotlin.String, repo: kotlin.String, fileSha: kotlin.String): HttpResponse<Blob> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/repos/{owner}/{repo}/git/blobs/{file_sha}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "file_sha" + "}", "$fileSha"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Get a commit object
        * Gets a Git [commit object](https://git-scm.com/book/en/v2/Git-Internals-Git-Objects).  To get the contents of a commit, see \&quot;[Get a commit](/rest/commits/commits#get-a-commit).\&quot;  **Signature verification object**  The response will include a &#x60;verification&#x60; object that describes the result of verifying the commit&#39;s signature. The following fields are included in the &#x60;verification&#x60; object:  | Name | Type | Description | | ---- | ---- | ----------- | | &#x60;verified&#x60; | &#x60;boolean&#x60; | Indicates whether GitHub considers the signature in this commit to be verified. | | &#x60;reason&#x60; | &#x60;string&#x60; | The reason for verified value. Possible values and their meanings are enumerated in the table below. | | &#x60;signature&#x60; | &#x60;string&#x60; | The signature that was extracted from the commit. | | &#x60;payload&#x60; | &#x60;string&#x60; | The value that was signed. |  These are the possible values for &#x60;reason&#x60; in the &#x60;verification&#x60; object:  | Value | Description | | ----- | ----------- | | &#x60;expired_key&#x60; | The key that made the signature is expired. | | &#x60;not_signing_key&#x60; | The \&quot;signing\&quot; flag is not among the usage flags in the GPG key that made the signature. | | &#x60;gpgverify_error&#x60; | There was an error communicating with the signature verification service. | | &#x60;gpgverify_unavailable&#x60; | The signature verification service is currently unavailable. | | &#x60;unsigned&#x60; | The object does not include a signature. | | &#x60;unknown_signature_type&#x60; | A non-PGP signature was found in the commit. | | &#x60;no_user&#x60; | No user was associated with the &#x60;committer&#x60; email address in the commit. | | &#x60;unverified_email&#x60; | The &#x60;committer&#x60; email address in the commit was associated with a user, but the email address is not verified on their account. | | &#x60;bad_email&#x60; | The &#x60;committer&#x60; email address in the commit is not included in the identities of the PGP key that made the signature. | | &#x60;unknown_key&#x60; | The key that made the signature has not been registered with any user&#39;s account. | | &#x60;malformed_signature&#x60; | There was an error parsing the signature. | | &#x60;invalid&#x60; | The signature could not be cryptographically verified using the key whose key-id was found in the signature. | | &#x60;valid&#x60; | None of the above errors applied, so the signature is considered to be verified. |
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param commitSha The SHA of the commit. 
         * @return GitCommit
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun gitGetCommit(owner: kotlin.String, repo: kotlin.String, commitSha: kotlin.String): HttpResponse<GitCommit> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/repos/{owner}/{repo}/git/commits/{commit_sha}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "commit_sha" + "}", "$commitSha"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Get a reference
        * Returns a single reference from your Git database. The &#x60;:ref&#x60; in the URL must be formatted as &#x60;heads/&lt;branch name&gt;&#x60; for branches and &#x60;tags/&lt;tag name&gt;&#x60; for tags. If the &#x60;:ref&#x60; doesn&#39;t match an existing ref, a &#x60;404&#x60; is returned.  **Note:** You need to explicitly [request a pull request](https://docs.github.com/rest/pulls/pulls#get-a-pull-request) to trigger a test merge commit, which checks the mergeability of pull requests. For more information, see \&quot;[Checking mergeability of pull requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pull-requests)\&quot;.
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param ref The Git reference. For more information, see \&quot;[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\&quot; in the Git documentation. 
         * @return GitRef
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun gitGetRef(owner: kotlin.String, repo: kotlin.String, ref: kotlin.String): HttpResponse<GitRef> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/repos/{owner}/{repo}/git/ref/{ref}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "ref" + "}", "$ref"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Get a tag
        * **Signature verification object**  The response will include a &#x60;verification&#x60; object that describes the result of verifying the commit&#39;s signature. The following fields are included in the &#x60;verification&#x60; object:  | Name | Type | Description | | ---- | ---- | ----------- | | &#x60;verified&#x60; | &#x60;boolean&#x60; | Indicates whether GitHub considers the signature in this commit to be verified. | | &#x60;reason&#x60; | &#x60;string&#x60; | The reason for verified value. Possible values and their meanings are enumerated in table below. | | &#x60;signature&#x60; | &#x60;string&#x60; | The signature that was extracted from the commit. | | &#x60;payload&#x60; | &#x60;string&#x60; | The value that was signed. |  These are the possible values for &#x60;reason&#x60; in the &#x60;verification&#x60; object:  | Value | Description | | ----- | ----------- | | &#x60;expired_key&#x60; | The key that made the signature is expired. | | &#x60;not_signing_key&#x60; | The \&quot;signing\&quot; flag is not among the usage flags in the GPG key that made the signature. | | &#x60;gpgverify_error&#x60; | There was an error communicating with the signature verification service. | | &#x60;gpgverify_unavailable&#x60; | The signature verification service is currently unavailable. | | &#x60;unsigned&#x60; | The object does not include a signature. | | &#x60;unknown_signature_type&#x60; | A non-PGP signature was found in the commit. | | &#x60;no_user&#x60; | No user was associated with the &#x60;committer&#x60; email address in the commit. | | &#x60;unverified_email&#x60; | The &#x60;committer&#x60; email address in the commit was associated with a user, but the email address is not verified on their account. | | &#x60;bad_email&#x60; | The &#x60;committer&#x60; email address in the commit is not included in the identities of the PGP key that made the signature. | | &#x60;unknown_key&#x60; | The key that made the signature has not been registered with any user&#39;s account. | | &#x60;malformed_signature&#x60; | There was an error parsing the signature. | | &#x60;invalid&#x60; | The signature could not be cryptographically verified using the key whose key-id was found in the signature. | | &#x60;valid&#x60; | None of the above errors applied, so the signature is considered to be verified. |
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param tagSha  
         * @return GitTag
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun gitGetTag(owner: kotlin.String, repo: kotlin.String, tagSha: kotlin.String): HttpResponse<GitTag> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/repos/{owner}/{repo}/git/tags/{tag_sha}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "tag_sha" + "}", "$tagSha"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Get a tree
        * Returns a single tree using the SHA1 value or ref name for that tree.  If &#x60;truncated&#x60; is &#x60;true&#x60; in the response then the number of items in the &#x60;tree&#x60; array exceeded our maximum limit. If you need to fetch more items, use the non-recursive method of fetching trees, and fetch one sub-tree at a time.   **Note**: The limit for the &#x60;tree&#x60; array is 100,000 entries with a maximum size of 7 MB when using the &#x60;recursive&#x60; parameter.
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param treeSha The SHA1 value or ref (branch or tag) name of the tree. 
         * @param recursive Setting this parameter to any value returns the objects or subtrees referenced by the tree specified in &#x60;:tree_sha&#x60;. For example, setting &#x60;recursive&#x60; to any of the following will enable returning objects or subtrees: &#x60;0&#x60;, &#x60;1&#x60;, &#x60;\&quot;true\&quot;&#x60;, and &#x60;\&quot;false\&quot;&#x60;. Omit this parameter to prevent recursively returning objects or subtrees. (optional, default to "push")
         * @return GitTree
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun gitGetTree(owner: kotlin.String, repo: kotlin.String, treeSha: kotlin.String, recursive: kotlin.String?): HttpResponse<GitTree> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()
            recursive?.apply { localVariableQuery["recursive"] = listOf("$recursive") }

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/repos/{owner}/{repo}/git/trees/{tree_sha}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "tree_sha" + "}", "$treeSha"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * List matching references
        * Returns an array of references from your Git database that match the supplied name. The &#x60;:ref&#x60; in the URL must be formatted as &#x60;heads/&lt;branch name&gt;&#x60; for branches and &#x60;tags/&lt;tag name&gt;&#x60; for tags. If the &#x60;:ref&#x60; doesn&#39;t exist in the repository, but existing refs start with &#x60;:ref&#x60;, they will be returned as an array.  When you use this endpoint without providing a &#x60;:ref&#x60;, it will return an array of all the references from your Git database, including notes and stashes if they exist on the server. Anything in the namespace is returned, not just &#x60;heads&#x60; and &#x60;tags&#x60;.  **Note:** You need to explicitly [request a pull request](https://docs.github.com/rest/pulls/pulls#get-a-pull-request) to trigger a test merge commit, which checks the mergeability of pull requests. For more information, see \&quot;[Checking mergeability of pull requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pull-requests)\&quot;.  If you request matching references for a branch named &#x60;feature&#x60; but the branch &#x60;feature&#x60; doesn&#39;t exist, the response can still include other matching head refs that start with the word &#x60;feature&#x60;, such as &#x60;featureA&#x60; and &#x60;featureB&#x60;.
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param ref The Git reference. For more information, see \&quot;[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\&quot; in the Git documentation. 
         * @return kotlin.collections.List<GitRef>
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun gitListMatchingRefs(owner: kotlin.String, repo: kotlin.String, ref: kotlin.String): HttpResponse<kotlin.collections.List<GitRef>> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/repos/{owner}/{repo}/git/matching-refs/{ref}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "ref" + "}", "$ref"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Update a reference
        * Updates the provided reference to point to a new SHA. For more information, see \&quot;[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\&quot; in the Git documentation.
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param ref The Git reference. For more information, see \&quot;[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\&quot; in the Git documentation. 
         * @param gitUpdateRefRequest  
         * @return GitRef
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun gitUpdateRef(owner: kotlin.String, repo: kotlin.String, ref: kotlin.String, gitUpdateRefRequest: GitUpdateRefRequest): HttpResponse<GitRef> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = gitUpdateRefRequest

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PATCH,
            "/repos/{owner}/{repo}/git/refs/{ref}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "ref" + "}", "$ref"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        }
