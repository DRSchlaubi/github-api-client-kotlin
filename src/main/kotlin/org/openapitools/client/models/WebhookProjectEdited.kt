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

import org.openapitools.client.models.EnterpriseWebhooks
import org.openapitools.client.models.OrganizationSimpleWebhooks
import org.openapitools.client.models.Project
import org.openapitools.client.models.RepositoryWebhooks
import org.openapitools.client.models.SimpleInstallation
import org.openapitools.client.models.SimpleUserWebhooks
import org.openapitools.client.models.WebhookProjectEditedChanges

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param project 
 * @param changes 
 * @param enterprise 
 * @param installation 
 * @param organization 
 * @param repository 
 * @param sender 
 */
@Serializable

data class WebhookProjectEdited (

    @SerialName(value = "action")
    val action: WebhookProjectEdited.Action,

    @SerialName(value = "project")
    val project: Project,

    @SerialName(value = "changes")
    val changes: WebhookProjectEditedChanges? = null,

    @SerialName(value = "enterprise")
    val enterprise: EnterpriseWebhooks? = null,

    @SerialName(value = "installation")
    val installation: SimpleInstallation? = null,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks? = null,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks? = null,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks? = null

) {

    /**
     * 
     *
     * Values: edited
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "edited") edited("edited");
    }
}

