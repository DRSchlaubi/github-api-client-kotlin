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


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param daysLeftInBillingCycle Numbers of days left in billing cycle.
 * @param estimatedPaidStorageForMonth Estimated storage space (GB) used in billing cycle.
 * @param estimatedStorageForMonth Estimated sum of free and paid storage space (GB) used in billing cycle.
 */
@Serializable

data class CombinedBillingUsage (

    /* Numbers of days left in billing cycle. */
    @SerialName(value = "days_left_in_billing_cycle")
    val daysLeftInBillingCycle: kotlin.Int,

    /* Estimated storage space (GB) used in billing cycle. */
    @SerialName(value = "estimated_paid_storage_for_month")
    val estimatedPaidStorageForMonth: kotlin.Int,

    /* Estimated sum of free and paid storage space (GB) used in billing cycle. */
    @SerialName(value = "estimated_storage_for_month")
    val estimatedStorageForMonth: kotlin.Int

)
