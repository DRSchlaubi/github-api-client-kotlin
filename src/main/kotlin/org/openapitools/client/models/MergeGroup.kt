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

import org.openapitools.client.models.SimpleCommit

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A group of pull requests that the merge queue has grouped together to be merged. 
 *
 * @param headSha The SHA of the merge group.
 * @param headRef The full ref of the merge group.
 * @param baseSha The SHA of the merge group's parent commit.
 * @param baseRef The full ref of the branch the merge group will be merged into.
 * @param headCommit 
 */
@Serializable

data class MergeGroup (

    /* The SHA of the merge group. */
    @SerialName(value = "head_sha")
    val headSha: kotlin.String,

    /* The full ref of the merge group. */
    @SerialName(value = "head_ref")
    val headRef: kotlin.String,

    /* The SHA of the merge group's parent commit. */
    @SerialName(value = "base_sha")
    val baseSha: kotlin.String,

    /* The full ref of the branch the merge group will be merged into. */
    @SerialName(value = "base_ref")
    val baseRef: kotlin.String,

    @SerialName(value = "head_commit")
    val headCommit: SimpleCommit

)

