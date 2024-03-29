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
 * A GitHub App that is providing a custom deployment protection rule.
 *
 * @param id The unique identifier of the deployment protection rule integration.
 * @param slug The slugified name of the deployment protection rule integration.
 * @param integrationUrl The URL for the endpoint to get details about the app.
 * @param nodeId The node ID for the deployment protection rule integration.
 */
@Serializable

data class CustomDeploymentRuleApp (

    /* The unique identifier of the deployment protection rule integration. */
    @SerialName(value = "id")
    val id: kotlin.Int,

    /* The slugified name of the deployment protection rule integration. */
    @SerialName(value = "slug")
    val slug: kotlin.String,

    /* The URL for the endpoint to get details about the app. */
    @SerialName(value = "integration_url")
    val integrationUrl: kotlin.String,

    /* The node ID for the deployment protection rule integration. */
    @SerialName(value = "node_id")
    val nodeId: kotlin.String

)

