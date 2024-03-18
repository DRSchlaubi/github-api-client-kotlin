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

import org.openapitools.client.models.OrganizationFullPlan

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Team Organization
 *
 * @param login 
 * @param id 
 * @param nodeId 
 * @param url 
 * @param reposUrl 
 * @param eventsUrl 
 * @param hooksUrl 
 * @param issuesUrl 
 * @param membersUrl 
 * @param publicMembersUrl 
 * @param avatarUrl 
 * @param description 
 * @param hasOrganizationProjects 
 * @param hasRepositoryProjects 
 * @param publicRepos 
 * @param publicGists 
 * @param followers 
 * @param following 
 * @param htmlUrl 
 * @param createdAt 
 * @param type 
 * @param updatedAt 
 * @param archivedAt 
 * @param name 
 * @param company 
 * @param blog 
 * @param location 
 * @param email 
 * @param twitterUsername 
 * @param isVerified 
 * @param totalPrivateRepos 
 * @param ownedPrivateRepos 
 * @param privateGists 
 * @param diskUsage 
 * @param collaborators 
 * @param billingEmail 
 * @param plan 
 * @param defaultRepositoryPermission 
 * @param membersCanCreateRepositories 
 * @param twoFactorRequirementEnabled 
 * @param membersAllowedRepositoryCreationType 
 * @param membersCanCreatePublicRepositories 
 * @param membersCanCreatePrivateRepositories 
 * @param membersCanCreateInternalRepositories 
 * @param membersCanCreatePages 
 * @param membersCanCreatePublicPages 
 * @param membersCanCreatePrivatePages 
 * @param membersCanForkPrivateRepositories 
 * @param webCommitSignoffRequired 
 */
@Serializable

data class TeamOrganization (

    @SerialName(value = "login")
    val login: kotlin.String,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @Contextual @SerialName(value = "repos_url")
    val reposUrl: java.net.URI,

    @Contextual @SerialName(value = "events_url")
    val eventsUrl: java.net.URI,

    @SerialName(value = "hooks_url")
    val hooksUrl: kotlin.String,

    @SerialName(value = "issues_url")
    val issuesUrl: kotlin.String,

    @SerialName(value = "members_url")
    val membersUrl: kotlin.String,

    @SerialName(value = "public_members_url")
    val publicMembersUrl: kotlin.String,

    @SerialName(value = "avatar_url")
    val avatarUrl: kotlin.String,

    @SerialName(value = "description")
    val description: kotlin.String?,

    @SerialName(value = "has_organization_projects")
    val hasOrganizationProjects: kotlin.Boolean,

    @SerialName(value = "has_repository_projects")
    val hasRepositoryProjects: kotlin.Boolean,

    @SerialName(value = "public_repos")
    val publicRepos: kotlin.Int,

    @SerialName(value = "public_gists")
    val publicGists: kotlin.Int,

    @SerialName(value = "followers")
    val followers: kotlin.Int,

    @SerialName(value = "following")
    val following: kotlin.Int,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @SerialName(value = "type")
    val type: kotlin.String,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "archived_at")
    val archivedAt: kotlinx.datetime.Instant?,

    @SerialName(value = "name")
    val name: kotlin.String? = null,

    @SerialName(value = "company")
    val company: kotlin.String? = null,

    @Contextual @SerialName(value = "blog")
    val blog: java.net.URI? = null,

    @SerialName(value = "location")
    val location: kotlin.String? = null,

    @SerialName(value = "email")
    val email: kotlin.String? = null,

    @SerialName(value = "twitter_username")
    val twitterUsername: kotlin.String? = null,

    @SerialName(value = "is_verified")
    val isVerified: kotlin.Boolean? = null,

    @SerialName(value = "total_private_repos")
    val totalPrivateRepos: kotlin.Int? = null,

    @SerialName(value = "owned_private_repos")
    val ownedPrivateRepos: kotlin.Int? = null,

    @SerialName(value = "private_gists")
    val privateGists: kotlin.Int? = null,

    @SerialName(value = "disk_usage")
    val diskUsage: kotlin.Int? = null,

    @SerialName(value = "collaborators")
    val collaborators: kotlin.Int? = null,

    @SerialName(value = "billing_email")
    val billingEmail: kotlin.String? = null,

    @SerialName(value = "plan")
    val plan: OrganizationFullPlan? = null,

    @SerialName(value = "default_repository_permission")
    val defaultRepositoryPermission: kotlin.String? = null,

    @SerialName(value = "members_can_create_repositories")
    val membersCanCreateRepositories: kotlin.Boolean? = null,

    @SerialName(value = "two_factor_requirement_enabled")
    val twoFactorRequirementEnabled: kotlin.Boolean? = null,

    @SerialName(value = "members_allowed_repository_creation_type")
    val membersAllowedRepositoryCreationType: kotlin.String? = null,

    @SerialName(value = "members_can_create_public_repositories")
    val membersCanCreatePublicRepositories: kotlin.Boolean? = null,

    @SerialName(value = "members_can_create_private_repositories")
    val membersCanCreatePrivateRepositories: kotlin.Boolean? = null,

    @SerialName(value = "members_can_create_internal_repositories")
    val membersCanCreateInternalRepositories: kotlin.Boolean? = null,

    @SerialName(value = "members_can_create_pages")
    val membersCanCreatePages: kotlin.Boolean? = null,

    @SerialName(value = "members_can_create_public_pages")
    val membersCanCreatePublicPages: kotlin.Boolean? = null,

    @SerialName(value = "members_can_create_private_pages")
    val membersCanCreatePrivatePages: kotlin.Boolean? = null,

    @SerialName(value = "members_can_fork_private_repositories")
    val membersCanForkPrivateRepositories: kotlin.Boolean? = null,

    @SerialName(value = "web_commit_signoff_required")
    val webCommitSignoffRequired: kotlin.Boolean? = null

)
