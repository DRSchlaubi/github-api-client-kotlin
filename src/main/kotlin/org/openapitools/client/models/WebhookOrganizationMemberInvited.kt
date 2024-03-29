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
import org.openapitools.client.models.User
import org.openapitools.client.models.WebhookOrganizationMemberInvitedInvitation

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param invitation 
 * @param organization 
 * @param sender 
 * @param enterprise 
 * @param installation 
 * @param repository 
 * @param user 
 */
@Serializable

data class WebhookOrganizationMemberInvited (

    @SerialName(value = "action")
    val action: WebhookOrganizationMemberInvited.Action,

    @SerialName(value = "invitation")
    val invitation: WebhookOrganizationMemberInvitedInvitation,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks,

    @SerialName(value = "enterprise")
    val enterprise: EnterpriseWebhooks? = null,

    @SerialName(value = "installation")
    val installation: SimpleInstallation? = null,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks? = null,

    @SerialName(value = "user")
    val user: User? = null

) {

    /**
     * 
     *
     * Values: member_invited
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "member_invited") member_invited("member_invited");
    }
}

