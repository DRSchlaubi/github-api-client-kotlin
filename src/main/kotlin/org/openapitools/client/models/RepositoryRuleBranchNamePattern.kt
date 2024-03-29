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

import org.openapitools.client.models.RepositoryRuleCommitMessagePatternParameters

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Parameters to be used for the branch_name_pattern rule
 *
 * @param type 
 * @param parameters 
 */
@Serializable

data class RepositoryRuleBranchNamePattern (

    @SerialName(value = "type")
    val type: RepositoryRuleBranchNamePattern.Type,

    @SerialName(value = "parameters")
    val parameters: RepositoryRuleCommitMessagePatternParameters? = null

) {

    /**
     * 
     *
     * Values: branch_name_pattern
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "branch_name_pattern") branch_name_pattern("branch_name_pattern");
    }
}

