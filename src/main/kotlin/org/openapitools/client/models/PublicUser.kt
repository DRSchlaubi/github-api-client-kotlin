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

import org.openapitools.client.models.PublicUserPlan

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Public User
 *
 * @param login 
 * @param id 
 * @param nodeId 
 * @param avatarUrl 
 * @param gravatarId 
 * @param url 
 * @param htmlUrl 
 * @param followersUrl 
 * @param followingUrl 
 * @param gistsUrl 
 * @param starredUrl 
 * @param subscriptionsUrl 
 * @param organizationsUrl 
 * @param reposUrl 
 * @param eventsUrl 
 * @param receivedEventsUrl 
 * @param type 
 * @param siteAdmin 
 * @param name 
 * @param company 
 * @param blog 
 * @param location 
 * @param email 
 * @param hireable 
 * @param bio 
 * @param publicRepos 
 * @param publicGists 
 * @param followers 
 * @param following 
 * @param createdAt 
 * @param updatedAt 
 * @param twitterUsername 
 * @param plan 
 * @param suspendedAt 
 * @param privateGists 
 * @param totalPrivateRepos 
 * @param ownedPrivateRepos 
 * @param diskUsage 
 * @param collaborators 
 */
@Serializable

data class PublicUser (

    @SerialName(value = "login")
    val login: kotlin.String,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @Contextual @SerialName(value = "avatar_url")
    val avatarUrl: java.net.URI,

    @SerialName(value = "gravatar_id")
    val gravatarId: kotlin.String?,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    @Contextual @SerialName(value = "followers_url")
    val followersUrl: java.net.URI,

    @SerialName(value = "following_url")
    val followingUrl: kotlin.String,

    @SerialName(value = "gists_url")
    val gistsUrl: kotlin.String,

    @SerialName(value = "starred_url")
    val starredUrl: kotlin.String,

    @Contextual @SerialName(value = "subscriptions_url")
    val subscriptionsUrl: java.net.URI,

    @Contextual @SerialName(value = "organizations_url")
    val organizationsUrl: java.net.URI,

    @Contextual @SerialName(value = "repos_url")
    val reposUrl: java.net.URI,

    @SerialName(value = "events_url")
    val eventsUrl: kotlin.String,

    @Contextual @SerialName(value = "received_events_url")
    val receivedEventsUrl: java.net.URI,

    @SerialName(value = "type")
    val type: kotlin.String,

    @SerialName(value = "site_admin")
    val siteAdmin: kotlin.Boolean,

    @SerialName(value = "name")
    val name: kotlin.String?,

    @SerialName(value = "company")
    val company: kotlin.String?,

    @SerialName(value = "blog")
    val blog: kotlin.String?,

    @SerialName(value = "location")
    val location: kotlin.String?,

    @SerialName(value = "email")
    val email: kotlin.String?,

    @SerialName(value = "hireable")
    val hireable: kotlin.Boolean?,

    @SerialName(value = "bio")
    val bio: kotlin.String?,

    @SerialName(value = "public_repos")
    val publicRepos: kotlin.Int,

    @SerialName(value = "public_gists")
    val publicGists: kotlin.Int,

    @SerialName(value = "followers")
    val followers: kotlin.Int,

    @SerialName(value = "following")
    val following: kotlin.Int,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    @SerialName(value = "twitter_username")
    val twitterUsername: kotlin.String? = null,

    @SerialName(value = "plan")
    val plan: PublicUserPlan? = null,

    @Contextual @SerialName(value = "suspended_at")
    val suspendedAt: kotlinx.datetime.Instant? = null,

    @SerialName(value = "private_gists")
    val privateGists: kotlin.Int? = null,

    @SerialName(value = "total_private_repos")
    val totalPrivateRepos: kotlin.Int? = null,

    @SerialName(value = "owned_private_repos")
    val ownedPrivateRepos: kotlin.Int? = null,

    @SerialName(value = "disk_usage")
    val diskUsage: kotlin.Int? = null,

    @SerialName(value = "collaborators")
    val collaborators: kotlin.Int? = null

)

