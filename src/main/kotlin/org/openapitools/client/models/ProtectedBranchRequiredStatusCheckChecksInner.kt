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
 * @param context 
 * @param appId 
 */
@Serializable

data class ProtectedBranchRequiredStatusCheckChecksInner (

    @SerialName(value = "context")
    val context: kotlin.String,

    @SerialName(value = "app_id")
    val appId: kotlin.Int?

)

