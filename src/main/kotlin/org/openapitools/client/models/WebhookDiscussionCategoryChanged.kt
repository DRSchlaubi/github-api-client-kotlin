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
import org.openapitools.client.models.EnterpriseWebhooks
import org.openapitools.client.models.OrganizationSimpleWebhooks
import org.openapitools.client.models.RepositoryWebhooks
import org.openapitools.client.models.SimpleInstallation
import org.openapitools.client.models.SimpleUserWebhooks
import org.openapitools.client.models.WebhookDiscussionCategoryChangedChanges

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param changes 
 * @param discussion 
 * @param repository 
 * @param sender 
 * @param enterprise 
 * @param installation 
 * @param organization 
 */
@Serializable

data class WebhookDiscussionCategoryChanged (

    @SerialName(value = "action")
    val action: WebhookDiscussionCategoryChanged.Action,

    @SerialName(value = "changes")
    val changes: WebhookDiscussionCategoryChangedChanges,

    @SerialName(value = "discussion")
    val discussion: Discussion,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks,

    @SerialName(value = "enterprise")
    val enterprise: EnterpriseWebhooks? = null,

    @SerialName(value = "installation")
    val installation: SimpleInstallation? = null,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks? = null

) {

    /**
     * 
     *
     * Values: category_changed
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "category_changed") category_changed("category_changed");
    }
}

