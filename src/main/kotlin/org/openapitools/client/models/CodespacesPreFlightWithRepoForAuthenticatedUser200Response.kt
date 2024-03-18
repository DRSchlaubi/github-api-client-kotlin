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

import org.openapitools.client.models.CodespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults
import org.openapitools.client.models.SimpleUser

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param billableOwner 
 * @param defaults 
 */
@Serializable

data class CodespacesPreFlightWithRepoForAuthenticatedUser200Response (

    @SerialName(value = "billable_owner")
    val billableOwner: SimpleUser? = null,

    @SerialName(value = "defaults")
    val defaults: CodespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults? = null

)
