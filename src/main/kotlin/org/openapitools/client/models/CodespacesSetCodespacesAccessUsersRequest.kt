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
 * @param selectedUsernames The usernames of the organization members whose codespaces be billed to the organization.
 */
@Serializable

data class CodespacesSetCodespacesAccessUsersRequest (

    /* The usernames of the organization members whose codespaces be billed to the organization. */
    @SerialName(value = "selected_usernames")
    val selectedUsernames: kotlin.collections.List<kotlin.String>

)
