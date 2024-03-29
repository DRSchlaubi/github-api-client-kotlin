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

import org.openapitools.client.models.SimpleUserWebhooks

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param sender 
 */
@Serializable

data class WebhookGithubAppAuthorizationRevoked (

    @SerialName(value = "action")
    val action: WebhookGithubAppAuthorizationRevoked.Action,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks

) {

    /**
     * 
     *
     * Values: revoked
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "revoked") revoked("revoked");
    }
}

