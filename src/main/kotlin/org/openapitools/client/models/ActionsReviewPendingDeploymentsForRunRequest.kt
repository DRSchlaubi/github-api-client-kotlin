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
 * @param environmentIds The list of environment ids to approve or reject
 * @param state Whether to approve or reject deployment to the specified environments.
 * @param comment A comment to accompany the deployment review
 */
@Serializable

data class ActionsReviewPendingDeploymentsForRunRequest (

    /* The list of environment ids to approve or reject */
    @SerialName(value = "environment_ids")
    val environmentIds: kotlin.collections.List<kotlin.Int>,

    /* Whether to approve or reject deployment to the specified environments. */
    @SerialName(value = "state")
    val state: ActionsReviewPendingDeploymentsForRunRequest.State,

    /* A comment to accompany the deployment review */
    @SerialName(value = "comment")
    val comment: kotlin.String

) {

    /**
     * Whether to approve or reject deployment to the specified environments.
     *
     * Values: approved,rejected
     */
    @Serializable
    enum class State(val value: kotlin.String) {
        @SerialName(value = "approved") approved("approved"),
        @SerialName(value = "rejected") rejected("rejected");
    }
}

