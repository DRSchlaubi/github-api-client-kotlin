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

import org.openapitools.client.models.ReposCreateDeploymentRequestPayload

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param ref The ref to deploy. This can be a branch, tag, or SHA.
 * @param task Specifies a task to execute (e.g., `deploy` or `deploy:migrations`).
 * @param autoMerge Attempts to automatically merge the default branch into the requested ref, if it's behind the default branch.
 * @param requiredContexts The [status](https://docs.github.com/rest/commits/statuses) contexts to verify against commit status checks. If you omit this parameter, GitHub verifies all unique contexts before creating a deployment. To bypass checking entirely, pass an empty array. Defaults to all unique contexts.
 * @param payload 
 * @param environment Name for the target deployment environment (e.g., `production`, `staging`, `qa`).
 * @param description Short description of the deployment.
 * @param transientEnvironment Specifies if the given environment is specific to the deployment and will no longer exist at some point in the future. Default: `false`
 * @param productionEnvironment Specifies if the given environment is one that end-users directly interact with. Default: `true` when `environment` is `production` and `false` otherwise.
 */
@Serializable

data class ReposCreateDeploymentRequest (

    /* The ref to deploy. This can be a branch, tag, or SHA. */
    @SerialName(value = "ref")
    val ref: kotlin.String,

    /* Specifies a task to execute (e.g., `deploy` or `deploy:migrations`). */
    @SerialName(value = "task")
    val task: kotlin.String? = "deploy",

    /* Attempts to automatically merge the default branch into the requested ref, if it's behind the default branch. */
    @SerialName(value = "auto_merge")
    val autoMerge: kotlin.Boolean? = true,

    /* The [status](https://docs.github.com/rest/commits/statuses) contexts to verify against commit status checks. If you omit this parameter, GitHub verifies all unique contexts before creating a deployment. To bypass checking entirely, pass an empty array. Defaults to all unique contexts. */
    @SerialName(value = "required_contexts")
    val requiredContexts: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "payload")
    val payload: ReposCreateDeploymentRequestPayload? = null,

    /* Name for the target deployment environment (e.g., `production`, `staging`, `qa`). */
    @SerialName(value = "environment")
    val environment: kotlin.String? = "production",

    /* Short description of the deployment. */
    @SerialName(value = "description")
    val description: kotlin.String? = "",

    /* Specifies if the given environment is specific to the deployment and will no longer exist at some point in the future. Default: `false` */
    @SerialName(value = "transient_environment")
    val transientEnvironment: kotlin.Boolean? = false,

    /* Specifies if the given environment is one that end-users directly interact with. Default: `true` when `environment` is `production` and `false` otherwise. */
    @SerialName(value = "production_environment")
    val productionEnvironment: kotlin.Boolean? = null

)

