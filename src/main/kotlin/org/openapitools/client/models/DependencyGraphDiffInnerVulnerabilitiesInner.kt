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
 * @param severity 
 * @param advisoryGhsaId 
 * @param advisorySummary 
 * @param advisoryUrl 
 */
@Serializable

data class DependencyGraphDiffInnerVulnerabilitiesInner (

    @SerialName(value = "severity")
    val severity: kotlin.String,

    @SerialName(value = "advisory_ghsa_id")
    val advisoryGhsaId: kotlin.String,

    @SerialName(value = "advisory_summary")
    val advisorySummary: kotlin.String,

    @SerialName(value = "advisory_url")
    val advisoryUrl: kotlin.String

)
