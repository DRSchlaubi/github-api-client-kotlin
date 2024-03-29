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

import org.openapitools.client.models.ReposDeleteFileRequestAuthor
import org.openapitools.client.models.ReposDeleteFileRequestCommitter

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param message The commit message.
 * @param sha The blob SHA of the file being deleted.
 * @param branch The branch name. Default: the repository’s default branch
 * @param committer 
 * @param author 
 */
@Serializable

data class ReposDeleteFileRequest (

    /* The commit message. */
    @SerialName(value = "message")
    val message: kotlin.String,

    /* The blob SHA of the file being deleted. */
    @SerialName(value = "sha")
    val sha: kotlin.String,

    /* The branch name. Default: the repository’s default branch */
    @SerialName(value = "branch")
    val branch: kotlin.String? = null,

    @SerialName(value = "committer")
    val committer: ReposDeleteFileRequestCommitter? = null,

    @SerialName(value = "author")
    val author: ReposDeleteFileRequestAuthor? = null

)

