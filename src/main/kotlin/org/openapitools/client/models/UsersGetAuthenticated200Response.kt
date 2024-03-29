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

import org.openapitools.client.models.PrivateUser
import org.openapitools.client.models.PublicUser
import org.openapitools.client.models.PublicUserPlan

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
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
 * @param privateGists 
 * @param totalPrivateRepos 
 * @param ownedPrivateRepos 
 * @param diskUsage 
 * @param collaborators 
 * @param twoFactorAuthentication 
 * @param twitterUsername 
 * @param plan 
 * @param suspendedAt 
 * @param businessPlus 
 * @param ldapDn 
 */
@Serializable

data class UsersGetAuthenticated200Response (

    @Contextual @SerialName(value = "login")
    val login: kotlin.Any?,

    @Contextual @SerialName(value = "id")
    val id: kotlin.Any?,

    @Contextual @SerialName(value = "node_id")
    val nodeId: kotlin.Any?,

    @Contextual @SerialName(value = "avatar_url")
    val avatarUrl: kotlin.Any?,

    @Contextual @SerialName(value = "gravatar_id")
    val gravatarId: kotlin.Any?,

    @Contextual @SerialName(value = "url")
    val url: kotlin.Any?,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: kotlin.Any?,

    @Contextual @SerialName(value = "followers_url")
    val followersUrl: kotlin.Any?,

    @Contextual @SerialName(value = "following_url")
    val followingUrl: kotlin.Any?,

    @Contextual @SerialName(value = "gists_url")
    val gistsUrl: kotlin.Any?,

    @Contextual @SerialName(value = "starred_url")
    val starredUrl: kotlin.Any?,

    @Contextual @SerialName(value = "subscriptions_url")
    val subscriptionsUrl: kotlin.Any?,

    @Contextual @SerialName(value = "organizations_url")
    val organizationsUrl: kotlin.Any?,

    @Contextual @SerialName(value = "repos_url")
    val reposUrl: kotlin.Any?,

    @Contextual @SerialName(value = "events_url")
    val eventsUrl: kotlin.Any?,

    @Contextual @SerialName(value = "received_events_url")
    val receivedEventsUrl: kotlin.Any?,

    @Contextual @SerialName(value = "type")
    val type: kotlin.Any?,

    @Contextual @SerialName(value = "site_admin")
    val siteAdmin: kotlin.Any?,

    @Contextual @SerialName(value = "name")
    val name: kotlin.Any?,

    @Contextual @SerialName(value = "company")
    val company: kotlin.Any?,

    @Contextual @SerialName(value = "blog")
    val blog: kotlin.Any?,

    @Contextual @SerialName(value = "location")
    val location: kotlin.Any?,

    @Contextual @SerialName(value = "email")
    val email: kotlin.Any?,

    @Contextual @SerialName(value = "hireable")
    val hireable: kotlin.Any?,

    @Contextual @SerialName(value = "bio")
    val bio: kotlin.Any?,

    @Contextual @SerialName(value = "public_repos")
    val publicRepos: kotlin.Any?,

    @Contextual @SerialName(value = "public_gists")
    val publicGists: kotlin.Any?,

    @Contextual @SerialName(value = "followers")
    val followers: kotlin.Any?,

    @Contextual @SerialName(value = "following")
    val following: kotlin.Any?,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlin.Any?,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlin.Any?,

    @Contextual @SerialName(value = "private_gists")
    val privateGists: kotlin.Any?,

    @Contextual @SerialName(value = "total_private_repos")
    val totalPrivateRepos: kotlin.Any?,

    @Contextual @SerialName(value = "owned_private_repos")
    val ownedPrivateRepos: kotlin.Any?,

    @Contextual @SerialName(value = "disk_usage")
    val diskUsage: kotlin.Any?,

    @Contextual @SerialName(value = "collaborators")
    val collaborators: kotlin.Any?,

    @Contextual @SerialName(value = "two_factor_authentication")
    val twoFactorAuthentication: kotlin.Any?,

    @Contextual @SerialName(value = "twitter_username")
    val twitterUsername: kotlin.Any? = null,

    @SerialName(value = "plan")
    val plan: PublicUserPlan? = null,

    @Contextual @SerialName(value = "suspended_at")
    val suspendedAt: kotlin.Any? = null,

    @Contextual @SerialName(value = "business_plus")
    val businessPlus: kotlin.Any? = null,

    @Contextual @SerialName(value = "ldap_dn")
    val ldapDn: kotlin.Any? = null

)

