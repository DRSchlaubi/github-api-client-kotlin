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
 * @param id 
 * @param login 
 * @param nodeId 
 * @param organizationBillingEmail 
 * @param type 
 */
@Serializable

data class WebhookMarketplacePurchaseCancelledMarketplacePurchaseAllOfAccount (

    @SerialName(value = "id")
    val id: kotlin.Int? = null,

    @SerialName(value = "login")
    val login: kotlin.String? = null,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String? = null,

    @SerialName(value = "organization_billing_email")
    val organizationBillingEmail: kotlin.String? = null,

    @SerialName(value = "type")
    val type: kotlin.String? = null

)

