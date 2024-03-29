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
import org.openapitools.client.models.PullRequest9
import org.openapitools.client.models.RepositoryWebhooks
import org.openapitools.client.models.SimpleInstallation
import org.openapitools.client.models.SimpleUserWebhooks
import org.openapitools.client.models.User2

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param number The pull request number.
 * @param pullRequest 
 * @param repository 
 * @param requestedReviewer 
 * @param sender 
 * @param enterprise 
 * @param installation 
 * @param organization 
 */
@Serializable

data class WebhookPullRequestReviewRequestedOneOf (

    @SerialName(value = "action")
    val action: WebhookPullRequestReviewRequestedOneOf.Action,

    /* The pull request number. */
    @SerialName(value = "number")
    val number: kotlin.Int,

    @SerialName(value = "pull_request")
    val pullRequest: PullRequest9,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks,

    @SerialName(value = "requested_reviewer")
    val requestedReviewer: User2,

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
     * Values: review_requested
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "review_requested") review_requested("review_requested");
    }
}

