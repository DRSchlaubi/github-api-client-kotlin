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

import org.openapitools.client.models.WebhookDiscussionCommentEditedChangesBody

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param ref 
 * @param sha 
 */
@Serializable

data class WebhookPullRequestEditedChangesBase (

    @SerialName(value = "ref")
    val ref: WebhookDiscussionCommentEditedChangesBody,

    @SerialName(value = "sha")
    val sha: WebhookDiscussionCommentEditedChangesBody

)
