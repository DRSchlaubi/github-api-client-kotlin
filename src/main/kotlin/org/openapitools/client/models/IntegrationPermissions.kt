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
 * The set of permissions for the GitHub app
 *
 * @param issues 
 * @param checks 
 * @param metadata 
 * @param contents 
 * @param deployments 
 */
@Serializable

data class IntegrationPermissions (

    @Contextual @SerialName(value = "issues")
    val issues: kotlin.Any? = null,

    @Contextual @SerialName(value = "checks")
    val checks: kotlin.Any? = null,

    @Contextual @SerialName(value = "metadata")
    val metadata: kotlin.Any? = null,

    @Contextual @SerialName(value = "contents")
    val contents: kotlin.Any? = null,

    @Contextual @SerialName(value = "deployments")
    val deployments: kotlin.Any? = null

) : kotlin.collections.HashMap<String, kotlin.String>()

