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
 * @param code 
 * @param status 
 * @param message 
 */
@Serializable

data class HookResponse (

    @SerialName(value = "code")
    val code: kotlin.Int?,

    @SerialName(value = "status")
    val status: kotlin.String?,

    @SerialName(value = "message")
    val message: kotlin.String?

)

