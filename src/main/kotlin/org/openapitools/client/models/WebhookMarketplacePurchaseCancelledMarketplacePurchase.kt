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

import org.openapitools.client.models.WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfAccount
import org.openapitools.client.models.WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param account 
 * @param billingCycle 
 * @param freeTrialEndsOn 
 * @param nextBillingDate 
 * @param onFreeTrial 
 * @param plan 
 * @param unitCount 
 */
@Serializable

data class WebhookMarketplacePurchaseCancelledMarketplacePurchase (

    @SerialName(value = "account")
    val account: WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfAccount,

    @SerialName(value = "billing_cycle")
    val billingCycle: kotlin.String,

    @SerialName(value = "free_trial_ends_on")
    val freeTrialEndsOn: kotlin.String?,

    @SerialName(value = "next_billing_date")
    val nextBillingDate: kotlin.String?,

    @SerialName(value = "on_free_trial")
    val onFreeTrial: kotlin.Boolean,

    @SerialName(value = "plan")
    val plan: WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfPlan,

    @SerialName(value = "unit_count")
    val unitCount: kotlin.Int

)

