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

import org.openapitools.client.models.RepositoryRulesetConditionsRefName
import org.openapitools.client.models.RepositoryRulesetConditionsRepositoryIdTargetRepositoryId

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Conditions to target repositories by id and refs by name
 *
 * @param repositoryId 
 * @param refName 
 */
@Serializable

data class RepositoryIdAndRefName (

    @SerialName(value = "repository_id")
    val repositoryId: RepositoryRulesetConditionsRepositoryIdTargetRepositoryId,

    @SerialName(value = "ref_name")
    val refName: RepositoryRulesetConditionsRefName? = null

)
