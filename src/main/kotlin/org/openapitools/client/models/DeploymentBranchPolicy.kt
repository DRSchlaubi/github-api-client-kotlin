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
 * Details of a deployment branch or tag policy.
 *
 * @param id The unique identifier of the branch or tag policy.
 * @param nodeId 
 * @param name The name pattern that branches or tags must match in order to deploy to the environment.
 * @param type Whether this rule targets a branch or tag.
 */
@Serializable

data class DeploymentBranchPolicy (

    /* The unique identifier of the branch or tag policy. */
    @SerialName(value = "id")
    val id: kotlin.Int? = null,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String? = null,

    /* The name pattern that branches or tags must match in order to deploy to the environment. */
    @SerialName(value = "name")
    val name: kotlin.String? = null,

    /* Whether this rule targets a branch or tag. */
    @SerialName(value = "type")
    val type: DeploymentBranchPolicy.Type? = null

) {

    /**
     * Whether this rule targets a branch or tag.
     *
     * Values: branch,tag
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "branch") branch("branch"),
        @SerialName(value = "tag") tag("tag");
    }
}
