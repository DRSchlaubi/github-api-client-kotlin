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

import org.openapitools.client.models.Integration
import org.openapitools.client.models.SimpleUser
import org.openapitools.client.models.Team

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param url 
 * @param usersUrl 
 * @param teamsUrl 
 * @param users 
 * @param teams 
 * @param apps 
 */
@Serializable

data class ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions (

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @Contextual @SerialName(value = "users_url")
    val usersUrl: java.net.URI,

    @Contextual @SerialName(value = "teams_url")
    val teamsUrl: java.net.URI,

    @SerialName(value = "users")
    val users: kotlin.collections.List<SimpleUser>,

    @SerialName(value = "teams")
    val teams: kotlin.collections.List<Team>,

    @SerialName(value = "apps")
    val apps: kotlin.collections.List<Integration>? = null

)
