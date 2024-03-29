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

import org.openapitools.client.models.ProtectedBranchPullRequestReviewBypassPullRequestAllowances
import org.openapitools.client.models.ProtectedBranchPullRequestReviewDismissalRestrictions

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Protected Branch Pull Request Review
 *
 * @param dismissStaleReviews 
 * @param requireCodeOwnerReviews 
 * @param url 
 * @param dismissalRestrictions 
 * @param bypassPullRequestAllowances 
 * @param requiredApprovingReviewCount 
 * @param requireLastPushApproval Whether the most recent push must be approved by someone other than the person who pushed it.
 */
@Serializable

data class ProtectedBranchPullRequestReview (

    @SerialName(value = "dismiss_stale_reviews")
    val dismissStaleReviews: kotlin.Boolean,

    @SerialName(value = "require_code_owner_reviews")
    val requireCodeOwnerReviews: kotlin.Boolean,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI? = null,

    @SerialName(value = "dismissal_restrictions")
    val dismissalRestrictions: ProtectedBranchPullRequestReviewDismissalRestrictions? = null,

    @SerialName(value = "bypass_pull_request_allowances")
    val bypassPullRequestAllowances: ProtectedBranchPullRequestReviewBypassPullRequestAllowances? = null,

    @SerialName(value = "required_approving_review_count")
    val requiredApprovingReviewCount: kotlin.Int? = null,

    /* Whether the most recent push must be approved by someone other than the person who pushed it. */
    @SerialName(value = "require_last_push_approval")
    val requireLastPushApproval: kotlin.Boolean? = false

)

