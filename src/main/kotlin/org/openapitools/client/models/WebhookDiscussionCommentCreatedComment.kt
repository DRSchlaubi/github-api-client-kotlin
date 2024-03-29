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

import org.openapitools.client.models.Reactions
import org.openapitools.client.models.User

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param authorAssociation How the author is associated with the repository.
 * @param body 
 * @param childCommentCount 
 * @param createdAt 
 * @param discussionId 
 * @param htmlUrl 
 * @param id 
 * @param nodeId 
 * @param parentId 
 * @param reactions 
 * @param repositoryUrl 
 * @param updatedAt 
 * @param user 
 */
@Serializable

data class WebhookDiscussionCommentCreatedComment (

    /* How the author is associated with the repository. */
    @SerialName(value = "author_association")
    val authorAssociation: WebhookDiscussionCommentCreatedComment.AuthorAssociation,

    @SerialName(value = "body")
    val body: kotlin.String,

    @SerialName(value = "child_comment_count")
    val childCommentCount: kotlin.Int,

    @SerialName(value = "created_at")
    val createdAt: kotlin.String,

    @SerialName(value = "discussion_id")
    val discussionId: kotlin.Int,

    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "parent_id")
    val parentId: kotlin.Int?,

    @SerialName(value = "reactions")
    val reactions: Reactions,

    @SerialName(value = "repository_url")
    val repositoryUrl: kotlin.String,

    @SerialName(value = "updated_at")
    val updatedAt: kotlin.String,

    @SerialName(value = "user")
    val user: User

) {

    /**
     * How the author is associated with the repository.
     *
     * Values: COLLABORATOR,CONTRIBUTOR,FIRST_TIMER,FIRST_TIME_CONTRIBUTOR,MANNEQUIN,MEMBER,NONE,OWNER
     */
    @Serializable
    enum class AuthorAssociation(val value: kotlin.String) {
        @SerialName(value = "COLLABORATOR") COLLABORATOR("COLLABORATOR"),
        @SerialName(value = "CONTRIBUTOR") CONTRIBUTOR("CONTRIBUTOR"),
        @SerialName(value = "FIRST_TIMER") FIRST_TIMER("FIRST_TIMER"),
        @SerialName(value = "FIRST_TIME_CONTRIBUTOR") FIRST_TIME_CONTRIBUTOR("FIRST_TIME_CONTRIBUTOR"),
        @SerialName(value = "MANNEQUIN") MANNEQUIN("MANNEQUIN"),
        @SerialName(value = "MEMBER") MEMBER("MEMBER"),
        @SerialName(value = "NONE") NONE("NONE"),
        @SerialName(value = "OWNER") OWNER("OWNER");
    }
}

