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
import org.openapitools.client.models.ReactionRollup

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A team discussion is a persistent record of a free-form conversation within a team.
 *
 * @param author 
 * @param body The main text of the discussion.
 * @param bodyHtml 
 * @param bodyVersion The current version of the body content. If provided, this update operation will be rejected if the given version does not match the latest version on the server.
 * @param commentsCount 
 * @param commentsUrl 
 * @param createdAt 
 * @param lastEditedAt 
 * @param htmlUrl 
 * @param nodeId 
 * @param number The unique sequence number of a team discussion.
 * @param pinned Whether or not this discussion should be pinned for easy retrieval.
 * @param `private` Whether or not this discussion should be restricted to team members and organization owners.
 * @param teamUrl 
 * @param title The title of the discussion.
 * @param updatedAt 
 * @param url 
 * @param reactions 
 */
@Serializable

data class TeamDiscussion (

    @SerialName(value = "author")
    val author: IntegrationOwner,

    /* The main text of the discussion. */
    @SerialName(value = "body")
    val body: kotlin.String,

    @SerialName(value = "body_html")
    val bodyHtml: kotlin.String,

    /* The current version of the body content. If provided, this update operation will be rejected if the given version does not match the latest version on the server. */
    @SerialName(value = "body_version")
    val bodyVersion: kotlin.String,

    @SerialName(value = "comments_count")
    val commentsCount: kotlin.Int,

    @Contextual @SerialName(value = "comments_url")
    val commentsUrl: java.net.URI,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "last_edited_at")
    val lastEditedAt: kotlinx.datetime.Instant?,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    /* The unique sequence number of a team discussion. */
    @SerialName(value = "number")
    val number: kotlin.Int,

    /* Whether or not this discussion should be pinned for easy retrieval. */
    @SerialName(value = "pinned")
    val pinned: kotlin.Boolean,

    /* Whether or not this discussion should be restricted to team members and organization owners. */
    @SerialName(value = "private")
    val `private`: kotlin.Boolean,

    @Contextual @SerialName(value = "team_url")
    val teamUrl: java.net.URI,

    /* The title of the discussion. */
    @SerialName(value = "title")
    val title: kotlin.String,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @SerialName(value = "reactions")
    val reactions: ReactionRollup? = null

)

