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
 * Prevent merge commits from being pushed to matching refs.
 *
 * @param type 
 */
@Serializable

data class RepositoryRuleRequiredLinearHistory (

    @SerialName(value = "type")
    val type: RepositoryRuleRequiredLinearHistory.Type

) {

    /**
     * 
     *
     * Values: required_linear_history
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "required_linear_history") required_linear_history("required_linear_history");
    }
}

