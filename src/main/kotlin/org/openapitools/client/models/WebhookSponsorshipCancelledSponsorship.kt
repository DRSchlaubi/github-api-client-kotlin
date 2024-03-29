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

import org.openapitools.client.models.BranchRestrictionPolicyUsersInner
import org.openapitools.client.models.SponsorshipTier
import org.openapitools.client.models.User

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param createdAt 
 * @param nodeId 
 * @param privacyLevel 
 * @param sponsor 
 * @param sponsorable 
 * @param tier 
 * @param maintainer 
 */
@Serializable

data class WebhookSponsorshipCancelledSponsorship (

    @SerialName(value = "created_at")
    val createdAt: kotlin.String,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "privacy_level")
    val privacyLevel: kotlin.String,

    @SerialName(value = "sponsor")
    val sponsor: User,

    @SerialName(value = "sponsorable")
    val sponsorable: User,

    @SerialName(value = "tier")
    val tier: SponsorshipTier,

    @SerialName(value = "maintainer")
    val maintainer: BranchRestrictionPolicyUsersInner? = null

)

