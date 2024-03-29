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

import org.openapitools.client.models.DeploymentBranchPolicySettings

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param waitTimer The amount of time to delay a job after the job is initially triggered. The time (in minutes) must be an integer between 0 and 43,200 (30 days).
 * @param preventSelfReview Whether or not a user who created the job is prevented from approving their own job.
 * @param reviewers The people or teams that may review jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed.
 * @param deploymentBranchPolicy 
 */
@Serializable

data class ReposCreateOrUpdateEnvironmentRequest (

    /* The amount of time to delay a job after the job is initially triggered. The time (in minutes) must be an integer between 0 and 43,200 (30 days). */
    @SerialName(value = "wait_timer")
    val waitTimer: kotlin.Int? = null,

    /* Whether or not a user who created the job is prevented from approving their own job. */
    @SerialName(value = "prevent_self_review")
    val preventSelfReview: kotlin.Boolean? = null,

    /* The people or teams that may review jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed. */
    @Contextual @SerialName(value = "reviewers")
    val reviewers: kotlin.Any? = null,

    @SerialName(value = "deployment_branch_policy")
    val deploymentBranchPolicy: DeploymentBranchPolicySettings? = null

)

