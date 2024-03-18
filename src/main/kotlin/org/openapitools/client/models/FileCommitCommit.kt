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

package org.openapitools.client.models

import org.openapitools.client.models.FileCommitCommitAuthor
import org.openapitools.client.models.FileCommitCommitParentsInner
import org.openapitools.client.models.FileCommitCommitTree
import org.openapitools.client.models.FileCommitCommitVerification

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param sha 
 * @param nodeId 
 * @param url 
 * @param htmlUrl 
 * @param author 
 * @param committer 
 * @param message 
 * @param tree 
 * @param parents 
 * @param verification 
 */
@Serializable

data class FileCommitCommit (

    @SerialName(value = "sha")
    val sha: kotlin.String? = null,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String? = null,

    @SerialName(value = "url")
    val url: kotlin.String? = null,

    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String? = null,

    @SerialName(value = "author")
    val author: FileCommitCommitAuthor? = null,

    @SerialName(value = "committer")
    val committer: FileCommitCommitAuthor? = null,

    @SerialName(value = "message")
    val message: kotlin.String? = null,

    @SerialName(value = "tree")
    val tree: FileCommitCommitTree? = null,

    @SerialName(value = "parents")
    val parents: kotlin.collections.List<FileCommitCommitParentsInner>? = null,

    @SerialName(value = "verification")
    val verification: FileCommitCommitVerification? = null

)
