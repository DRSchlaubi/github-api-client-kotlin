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

import org.openapitools.client.models.CommitComment

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Timeline Commit Commented Event
 *
 * @param event 
 * @param nodeId 
 * @param commitId 
 * @param comments 
 */
@Serializable

data class TimelineCommitCommentedEvent (

    @SerialName(value = "event")
    val event: kotlin.String? = null,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String? = null,

    @SerialName(value = "commit_id")
    val commitId: kotlin.String? = null,

    @SerialName(value = "comments")
    val comments: kotlin.collections.List<CommitComment>? = null

)
