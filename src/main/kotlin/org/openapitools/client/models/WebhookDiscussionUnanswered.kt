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

import org.openapitools.client.models.Discussion
import org.openapitools.client.models.OrganizationSimpleWebhooks
import org.openapitools.client.models.RepositoryWebhooks
import org.openapitools.client.models.SimpleUserWebhooks
import org.openapitools.client.models.WebhookDiscussionAnsweredAnswer

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param discussion 
 * @param oldAnswer 
 * @param repository 
 * @param organization 
 * @param sender 
 */
@Serializable

data class WebhookDiscussionUnanswered (

    @SerialName(value = "action")
    val action: WebhookDiscussionUnanswered.Action,

    @SerialName(value = "discussion")
    val discussion: Discussion,

    @SerialName(value = "old_answer")
    val oldAnswer: WebhookDiscussionAnsweredAnswer,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks? = null,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks? = null

) {

    /**
     * 
     *
     * Values: unanswered
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "unanswered") unanswered("unanswered");
    }
}

