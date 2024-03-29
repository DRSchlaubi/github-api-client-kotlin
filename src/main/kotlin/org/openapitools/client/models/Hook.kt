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

import org.openapitools.client.models.HookResponse
import org.openapitools.client.models.WebhookConfig

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Webhooks for repositories.
 *
 * @param type 
 * @param id Unique identifier of the webhook.
 * @param name The name of a valid service, use 'web' for a webhook.
 * @param active Determines whether the hook is actually triggered on pushes.
 * @param events Determines what events the hook is triggered for. Default: ['push'].
 * @param config 
 * @param updatedAt 
 * @param createdAt 
 * @param url 
 * @param testUrl 
 * @param pingUrl 
 * @param lastResponse 
 * @param deliveriesUrl 
 */
@Serializable

data class Hook (

    @SerialName(value = "type")
    val type: kotlin.String,

    /* Unique identifier of the webhook. */
    @SerialName(value = "id")
    val id: kotlin.Int,

    /* The name of a valid service, use 'web' for a webhook. */
    @SerialName(value = "name")
    val name: kotlin.String,

    /* Determines whether the hook is actually triggered on pushes. */
    @SerialName(value = "active")
    val active: kotlin.Boolean,

    /* Determines what events the hook is triggered for. Default: ['push']. */
    @SerialName(value = "events")
    val events: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "config")
    val config: WebhookConfig,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @Contextual @SerialName(value = "test_url")
    val testUrl: java.net.URI,

    @Contextual @SerialName(value = "ping_url")
    val pingUrl: java.net.URI,

    @SerialName(value = "last_response")
    val lastResponse: HookResponse,

    @Contextual @SerialName(value = "deliveries_url")
    val deliveriesUrl: java.net.URI? = null

)

