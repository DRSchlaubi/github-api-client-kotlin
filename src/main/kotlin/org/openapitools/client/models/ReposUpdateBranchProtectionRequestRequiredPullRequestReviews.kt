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

import org.openapitools.client.models.ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances
import org.openapitools.client.models.ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Require at least one approving review on a pull request, before merging. Set to `null` to disable.
 *
 * @param dismissalRestrictions 
 * @param dismissStaleReviews Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit.
 * @param requireCodeOwnerReviews Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) review them.
 * @param requiredApprovingReviewCount Specify the number of reviewers required to approve pull requests. Use a number between 1 and 6 or 0 to not require reviewers.
 * @param requireLastPushApproval Whether the most recent push must be approved by someone other than the person who pushed it. Default: `false`.
 * @param bypassPullRequestAllowances 
 */
@Serializable

data class ReposUpdateBranchProtectionRequestRequiredPullRequestReviews (

    @SerialName(value = "dismissal_restrictions")
    val dismissalRestrictions: ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions? = null,

    /* Set to `true` if you want to automatically dismiss approving reviews when someone pushes a new commit. */
    @SerialName(value = "dismiss_stale_reviews")
    val dismissStaleReviews: kotlin.Boolean? = null,

    /* Blocks merging pull requests until [code owners](https://docs.github.com/articles/about-code-owners/) review them. */
    @SerialName(value = "require_code_owner_reviews")
    val requireCodeOwnerReviews: kotlin.Boolean? = null,

    /* Specify the number of reviewers required to approve pull requests. Use a number between 1 and 6 or 0 to not require reviewers. */
    @SerialName(value = "required_approving_review_count")
    val requiredApprovingReviewCount: kotlin.Int? = null,

    /* Whether the most recent push must be approved by someone other than the person who pushed it. Default: `false`. */
    @SerialName(value = "require_last_push_approval")
    val requireLastPushApproval: kotlin.Boolean? = false,

    @SerialName(value = "bypass_pull_request_allowances")
    val bypassPullRequestAllowances: ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances? = null

)

