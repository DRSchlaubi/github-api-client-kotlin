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
import org.openapitools.client.models.WebhookSponsorshipCancelledSponsorship

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param sender 
 * @param sponsorship 
 * @param effectiveDate The `pending_cancellation` and `pending_tier_change` event types will include the date the cancellation or tier change will take effect.
 * @param enterprise 
 * @param installation 
 * @param organization 
 * @param repository 
 */
@Serializable

data class WebhookSponsorshipPendingCancellation (

    @SerialName(value = "action")
    val action: WebhookSponsorshipPendingCancellation.Action,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks,

    @SerialName(value = "sponsorship")
    val sponsorship: WebhookSponsorshipCancelledSponsorship,

    /* The `pending_cancellation` and `pending_tier_change` event types will include the date the cancellation or tier change will take effect. */
    @SerialName(value = "effective_date")
    val effectiveDate: kotlin.String? = null,

    @SerialName(value = "enterprise")
    val enterprise: EnterpriseWebhooks? = null,

    @SerialName(value = "installation")
    val installation: SimpleInstallation? = null,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks? = null,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks? = null

) {

    /**
     * 
     *
     * Values: pending_cancellation
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "pending_cancellation") pending_cancellation("pending_cancellation");
    }
}

