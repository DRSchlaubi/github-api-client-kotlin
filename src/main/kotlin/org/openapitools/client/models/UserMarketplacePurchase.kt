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

import org.openapitools.client.models.MarketplaceAccount
import org.openapitools.client.models.MarketplaceListingPlan

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * User Marketplace Purchase
 *
 * @param billingCycle 
 * @param nextBillingDate 
 * @param unitCount 
 * @param onFreeTrial 
 * @param freeTrialEndsOn 
 * @param updatedAt 
 * @param account 
 * @param plan 
 */
@Serializable

data class UserMarketplacePurchase (

    @SerialName(value = "billing_cycle")
    val billingCycle: kotlin.String,

    @Contextual @SerialName(value = "next_billing_date")
    val nextBillingDate: kotlinx.datetime.Instant?,

    @SerialName(value = "unit_count")
    val unitCount: kotlin.Int?,

    @SerialName(value = "on_free_trial")
    val onFreeTrial: kotlin.Boolean,

    @Contextual @SerialName(value = "free_trial_ends_on")
    val freeTrialEndsOn: kotlinx.datetime.Instant?,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant?,

    @SerialName(value = "account")
    val account: MarketplaceAccount,

    @SerialName(value = "plan")
    val plan: MarketplaceListingPlan

)

