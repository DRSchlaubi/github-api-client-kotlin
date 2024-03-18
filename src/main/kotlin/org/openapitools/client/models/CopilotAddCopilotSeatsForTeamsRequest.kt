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
 * @param selectedTeams List of team names within the organization to which to grant access to GitHub Copilot.
 */
@Serializable

data class CopilotAddCopilotSeatsForTeamsRequest (

    /* List of team names within the organization to which to grant access to GitHub Copilot. */
    @SerialName(value = "selected_teams")
    val selectedTeams: kotlin.collections.List<kotlin.String>

)
