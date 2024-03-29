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
 * @param environmentName The name of the environment to approve or reject.
 * @param comment Comment associated with the pending deployment protection rule. **Required when state is not provided.**
 */
@Serializable

data class ReviewCustomGatesCommentRequired (

    /* The name of the environment to approve or reject. */
    @SerialName(value = "environment_name")
    val environmentName: kotlin.String,

    /* Comment associated with the pending deployment protection rule. **Required when state is not provided.** */
    @SerialName(value = "comment")
    val comment: kotlin.String

)

