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
 * @param action Action to apply to the fine-grained personal access token.
 * @param patIds The IDs of the fine-grained personal access tokens.
 */
@Serializable

data class OrgsUpdatePatAccessesRequest (

    /* Action to apply to the fine-grained personal access token. */
    @SerialName(value = "action")
    val action: OrgsUpdatePatAccessesRequest.Action,

    /* The IDs of the fine-grained personal access tokens. */
    @SerialName(value = "pat_ids")
    val patIds: kotlin.collections.List<kotlin.Int>

) {

    /**
     * Action to apply to the fine-grained personal access token.
     *
     * Values: revoke
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "revoke") revoke("revoke");
    }
}
