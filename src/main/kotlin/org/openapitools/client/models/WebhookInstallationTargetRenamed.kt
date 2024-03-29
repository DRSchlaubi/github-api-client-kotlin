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
import org.openapitools.client.models.RepositoryWebhooks
import org.openapitools.client.models.SimpleInstallation
import org.openapitools.client.models.SimpleUserWebhooks
import org.openapitools.client.models.WebhookInstallationTargetRenamedAccount
import org.openapitools.client.models.WebhookInstallationTargetRenamedChanges

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param account 
 * @param action 
 * @param changes 
 * @param installation 
 * @param targetType 
 * @param enterprise 
 * @param organization 
 * @param repository 
 * @param sender 
 */
@Serializable

data class WebhookInstallationTargetRenamed (

    @SerialName(value = "account")
    val account: WebhookInstallationTargetRenamedAccount,

    @SerialName(value = "action")
    val action: WebhookInstallationTargetRenamed.Action,

    @SerialName(value = "changes")
    val changes: WebhookInstallationTargetRenamedChanges,

    @SerialName(value = "installation")
    val installation: SimpleInstallation,

    @SerialName(value = "target_type")
    val targetType: kotlin.String,

    @SerialName(value = "enterprise")
    val enterprise: EnterpriseWebhooks? = null,

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
     * Values: renamed
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "renamed") renamed("renamed");
    }
}

