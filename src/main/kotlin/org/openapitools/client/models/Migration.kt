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

import org.openapitools.client.models.IntegrationOwner
import org.openapitools.client.models.Repository

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A migration.
 *
 * @param id 
 * @param owner 
 * @param guid 
 * @param state 
 * @param lockRepositories 
 * @param excludeMetadata 
 * @param excludeGitData 
 * @param excludeAttachments 
 * @param excludeReleases 
 * @param excludeOwnerProjects 
 * @param orgMetadataOnly 
 * @param repositories The repositories included in the migration. Only returned for export migrations.
 * @param url 
 * @param createdAt 
 * @param updatedAt 
 * @param nodeId 
 * @param archiveUrl 
 * @param exclude Exclude related items from being returned in the response in order to improve performance of the request. The array can include any of: `\"repositories\"`.
 */
@Serializable

data class Migration (

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "owner")
    val owner: IntegrationOwner,

    @SerialName(value = "guid")
    val guid: kotlin.String,

    @SerialName(value = "state")
    val state: kotlin.String,

    @SerialName(value = "lock_repositories")
    val lockRepositories: kotlin.Boolean,

    @SerialName(value = "exclude_metadata")
    val excludeMetadata: kotlin.Boolean,

    @SerialName(value = "exclude_git_data")
    val excludeGitData: kotlin.Boolean,

    @SerialName(value = "exclude_attachments")
    val excludeAttachments: kotlin.Boolean,

    @SerialName(value = "exclude_releases")
    val excludeReleases: kotlin.Boolean,

    @SerialName(value = "exclude_owner_projects")
    val excludeOwnerProjects: kotlin.Boolean,

    @SerialName(value = "org_metadata_only")
    val orgMetadataOnly: kotlin.Boolean,

    /* The repositories included in the migration. Only returned for export migrations. */
    @SerialName(value = "repositories")
    val repositories: kotlin.collections.List<Repository>,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @Contextual @SerialName(value = "archive_url")
    val archiveUrl: java.net.URI? = null,

    /* Exclude related items from being returned in the response in order to improve performance of the request. The array can include any of: `\"repositories\"`. */
    @SerialName(value = "exclude")
    val exclude: kotlin.collections.List<kotlin.String>? = null

)

