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
 * @param currentUserUrl 
 * @param currentUserAuthorizationsHtmlUrl 
 * @param authorizationsUrl 
 * @param codeSearchUrl 
 * @param commitSearchUrl 
 * @param emailsUrl 
 * @param emojisUrl 
 * @param eventsUrl 
 * @param feedsUrl 
 * @param followersUrl 
 * @param followingUrl 
 * @param gistsUrl 
 * @param issueSearchUrl 
 * @param issuesUrl 
 * @param keysUrl 
 * @param labelSearchUrl 
 * @param notificationsUrl 
 * @param organizationUrl 
 * @param organizationRepositoriesUrl 
 * @param organizationTeamsUrl 
 * @param publicGistsUrl 
 * @param rateLimitUrl 
 * @param repositoryUrl 
 * @param repositorySearchUrl 
 * @param currentUserRepositoriesUrl 
 * @param starredUrl 
 * @param starredGistsUrl 
 * @param userUrl 
 * @param userOrganizationsUrl 
 * @param userRepositoriesUrl 
 * @param userSearchUrl 
 * @param hubUrl 
 * @param topicSearchUrl 
 */
@Serializable

data class Root (

    @SerialName(value = "current_user_url")
    val currentUserUrl: kotlin.String,

    @SerialName(value = "current_user_authorizations_html_url")
    val currentUserAuthorizationsHtmlUrl: kotlin.String,

    @SerialName(value = "authorizations_url")
    val authorizationsUrl: kotlin.String,

    @SerialName(value = "code_search_url")
    val codeSearchUrl: kotlin.String,

    @SerialName(value = "commit_search_url")
    val commitSearchUrl: kotlin.String,

    @SerialName(value = "emails_url")
    val emailsUrl: kotlin.String,

    @SerialName(value = "emojis_url")
    val emojisUrl: kotlin.String,

    @SerialName(value = "events_url")
    val eventsUrl: kotlin.String,

    @SerialName(value = "feeds_url")
    val feedsUrl: kotlin.String,

    @SerialName(value = "followers_url")
    val followersUrl: kotlin.String,

    @SerialName(value = "following_url")
    val followingUrl: kotlin.String,

    @SerialName(value = "gists_url")
    val gistsUrl: kotlin.String,

    @SerialName(value = "issue_search_url")
    val issueSearchUrl: kotlin.String,

    @SerialName(value = "issues_url")
    val issuesUrl: kotlin.String,

    @SerialName(value = "keys_url")
    val keysUrl: kotlin.String,

    @SerialName(value = "label_search_url")
    val labelSearchUrl: kotlin.String,

    @SerialName(value = "notifications_url")
    val notificationsUrl: kotlin.String,

    @SerialName(value = "organization_url")
    val organizationUrl: kotlin.String,

    @SerialName(value = "organization_repositories_url")
    val organizationRepositoriesUrl: kotlin.String,

    @SerialName(value = "organization_teams_url")
    val organizationTeamsUrl: kotlin.String,

    @SerialName(value = "public_gists_url")
    val publicGistsUrl: kotlin.String,

    @SerialName(value = "rate_limit_url")
    val rateLimitUrl: kotlin.String,

    @SerialName(value = "repository_url")
    val repositoryUrl: kotlin.String,

    @SerialName(value = "repository_search_url")
    val repositorySearchUrl: kotlin.String,

    @SerialName(value = "current_user_repositories_url")
    val currentUserRepositoriesUrl: kotlin.String,

    @SerialName(value = "starred_url")
    val starredUrl: kotlin.String,

    @SerialName(value = "starred_gists_url")
    val starredGistsUrl: kotlin.String,

    @SerialName(value = "user_url")
    val userUrl: kotlin.String,

    @SerialName(value = "user_organizations_url")
    val userOrganizationsUrl: kotlin.String,

    @SerialName(value = "user_repositories_url")
    val userRepositoriesUrl: kotlin.String,

    @SerialName(value = "user_search_url")
    val userSearchUrl: kotlin.String,

    @SerialName(value = "hub_url")
    @Deprecated(message = "This property is deprecated.")
    val hubUrl: kotlin.String? = null,

    @SerialName(value = "topic_search_url")
    val topicSearchUrl: kotlin.String? = null

)

