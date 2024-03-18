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
 * @param name The name of the variable.
 * @param `value` The value of the variable.
 */
@Serializable

data class ActionsUpdateRepoVariableRequest (

    /* The name of the variable. */
    @SerialName(value = "name")
    val name: kotlin.String? = null,

    /* The value of the variable. */
    @SerialName(value = "value")
    val `value`: kotlin.String? = null

)
