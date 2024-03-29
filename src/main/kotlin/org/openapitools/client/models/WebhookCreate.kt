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

import org.openapitools.client.models.EnterpriseWebhooks
import org.openapitools.client.models.OrganizationSimpleWebhooks
import org.openapitools.client.models.RepositoryWebhooks
import org.openapitools.client.models.SimpleInstallation
import org.openapitools.client.models.SimpleUserWebhooks

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param description The repository's current description.
 * @param masterBranch The name of the repository's default branch (usually `main`).
 * @param pusherType The pusher type for the event. Can be either `user` or a deploy key.
 * @param ref The [`git ref`](https://docs.github.com/rest/git/refs#get-a-reference) resource.
 * @param refType The type of Git ref object created in the repository.
 * @param repository 
 * @param sender 
 * @param enterprise 
 * @param installation 
 * @param organization 
 */
@Serializable

data class WebhookCreate (

    /* The repository's current description. */
    @SerialName(value = "description")
    val description: kotlin.String?,

    /* The name of the repository's default branch (usually `main`). */
    @SerialName(value = "master_branch")
    val masterBranch: kotlin.String,

    /* The pusher type for the event. Can be either `user` or a deploy key. */
    @SerialName(value = "pusher_type")
    val pusherType: kotlin.String,

    /* The [`git ref`](https://docs.github.com/rest/git/refs#get-a-reference) resource. */
    @SerialName(value = "ref")
    val ref: kotlin.String,

    /* The type of Git ref object created in the repository. */
    @SerialName(value = "ref_type")
    val refType: WebhookCreate.RefType,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks,

    @SerialName(value = "enterprise")
    val enterprise: EnterpriseWebhooks? = null,

    @SerialName(value = "installation")
    val installation: SimpleInstallation? = null,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks? = null

) {

    /**
     * The type of Git ref object created in the repository.
     *
     * Values: tag,branch
     */
    @Serializable
    enum class RefType(val value: kotlin.String) {
        @SerialName(value = "tag") tag("tag"),
        @SerialName(value = "branch") branch("branch");
    }
}

