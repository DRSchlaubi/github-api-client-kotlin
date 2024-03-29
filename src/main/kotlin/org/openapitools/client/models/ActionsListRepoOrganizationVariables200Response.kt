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

import org.openapitools.client.models.ActionsVariable

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param totalCount 
 * @param variables 
 */
@Serializable

data class ActionsListRepoOrganizationVariables200Response (

    @SerialName(value = "total_count")
    val totalCount: kotlin.Int,

    @SerialName(value = "variables")
    val variables: kotlin.collections.List<ActionsVariable>

)

