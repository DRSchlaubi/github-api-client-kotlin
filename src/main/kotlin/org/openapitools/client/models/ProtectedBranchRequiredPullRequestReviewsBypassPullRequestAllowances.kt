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
 * @param users 
 * @param teams 
 * @param apps 
 */
@Serializable

data class ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances (

    @Contextual @SerialName(value = "users")
    val users: kotlin.Any?,

    @Contextual @SerialName(value = "teams")
    val teams: kotlin.Any?,

    @Contextual @SerialName(value = "apps")
    val apps: kotlin.Any? = null

)

