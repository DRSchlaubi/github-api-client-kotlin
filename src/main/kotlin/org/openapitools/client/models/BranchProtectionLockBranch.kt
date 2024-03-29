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
 * Whether to set the branch as read-only. If this is true, users will not be able to push to the branch.
 *
 * @param enabled 
 */
@Serializable

data class BranchProtectionLockBranch (

    @SerialName(value = "enabled")
    val enabled: kotlin.Boolean? = false

)

