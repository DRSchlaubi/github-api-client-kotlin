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
import org.openapitools.client.models.WebhookCodeScanningAlertReopenedAlert

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param alert 
 * @param commitOid The commit SHA of the code scanning alert. When the action is `reopened_by_user` or `closed_by_user`, the event was triggered by the `sender` and this value will be empty.
 * @param ref The Git reference of the code scanning alert. When the action is `reopened_by_user` or `closed_by_user`, the event was triggered by the `sender` and this value will be empty.
 * @param repository 
 * @param sender 
 * @param enterprise 
 * @param installation 
 * @param organization 
 */
@Serializable

data class WebhookCodeScanningAlertReopened (

    @SerialName(value = "action")
    val action: WebhookCodeScanningAlertReopened.Action,

    @SerialName(value = "alert")
    val alert: WebhookCodeScanningAlertReopenedAlert,

    /* The commit SHA of the code scanning alert. When the action is `reopened_by_user` or `closed_by_user`, the event was triggered by the `sender` and this value will be empty. */
    @SerialName(value = "commit_oid")
    val commitOid: kotlin.String?,

    /* The Git reference of the code scanning alert. When the action is `reopened_by_user` or `closed_by_user`, the event was triggered by the `sender` and this value will be empty. */
    @SerialName(value = "ref")
    val ref: kotlin.String?,

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
     * Values: reopened
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "reopened") reopened("reopened");
    }
}

