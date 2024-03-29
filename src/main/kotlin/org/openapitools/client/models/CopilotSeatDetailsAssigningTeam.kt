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

import org.openapitools.client.models.Team
import org.openapitools.client.models.TeamParent
import org.openapitools.client.models.TeamPermissions

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * The team that granted access to GitHub Copilot to the assignee. This will be null if the user was assigned a seat individually.
 *
 * @param id 
 * @param nodeId 
 * @param name 
 * @param slug 
 * @param description 
 * @param permission 
 * @param url 
 * @param htmlUrl 
 * @param membersUrl 
 * @param repositoriesUrl 
 * @param parent 
 * @param privacy 
 * @param notificationSetting 
 * @param permissions 
 */
@Serializable

data class CopilotSeatDetailsAssigningTeam (

    @Contextual @SerialName(value = "id")
    val id: kotlin.Any?,

    @Contextual @SerialName(value = "node_id")
    val nodeId: kotlin.Any?,

    @Contextual @SerialName(value = "name")
    val name: kotlin.Any?,

    @Contextual @SerialName(value = "slug")
    val slug: kotlin.Any?,

    @Contextual @SerialName(value = "description")
    val description: kotlin.Any?,

    @Contextual @SerialName(value = "permission")
    val permission: kotlin.Any?,

    @Contextual @SerialName(value = "url")
    val url: kotlin.Any?,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: kotlin.Any?,

    @Contextual @SerialName(value = "members_url")
    val membersUrl: kotlin.Any?,

    @Contextual @SerialName(value = "repositories_url")
    val repositoriesUrl: kotlin.Any?,

    @SerialName(value = "parent")
    val parent: TeamParent,

    @Contextual @SerialName(value = "privacy")
    val privacy: kotlin.Any? = null,

    @Contextual @SerialName(value = "notification_setting")
    val notificationSetting: kotlin.Any? = null,

    @SerialName(value = "permissions")
    val permissions: TeamPermissions? = null

)

