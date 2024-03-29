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

import org.openapitools.client.models.ProjectsV2ItemContentType
import org.openapitools.client.models.SimpleUser

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * An item belonging to a project
 *
 * @param id 
 * @param contentNodeId 
 * @param contentType 
 * @param createdAt 
 * @param updatedAt 
 * @param archivedAt 
 * @param nodeId 
 * @param projectNodeId 
 * @param creator 
 */
@Serializable

data class ProjectsV2Item (

    @Contextual @SerialName(value = "id")
    val id: java.math.BigDecimal,

    @SerialName(value = "content_node_id")
    val contentNodeId: kotlin.String,

    @Contextual @SerialName(value = "content_type")
    val contentType: ProjectsV2ItemContentType,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "archived_at")
    val archivedAt: kotlinx.datetime.Instant?,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String? = null,

    @SerialName(value = "project_node_id")
    val projectNodeId: kotlin.String? = null,

    @SerialName(value = "creator")
    val creator: SimpleUser? = null

)

