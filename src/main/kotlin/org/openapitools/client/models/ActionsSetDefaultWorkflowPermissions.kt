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

import org.openapitools.client.models.ActionsDefaultWorkflowPermissions

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param defaultWorkflowPermissions 
 * @param canApprovePullRequestReviews Whether GitHub Actions can approve pull requests. Enabling this can be a security risk.
 */
@Serializable

data class ActionsSetDefaultWorkflowPermissions (

    @Contextual @SerialName(value = "default_workflow_permissions")
    val defaultWorkflowPermissions: ActionsDefaultWorkflowPermissions? = null,

    /* Whether GitHub Actions can approve pull requests. Enabling this can be a security risk. */
    @SerialName(value = "can_approve_pull_request_reviews")
    val canApprovePullRequestReviews: kotlin.Boolean? = null

)

