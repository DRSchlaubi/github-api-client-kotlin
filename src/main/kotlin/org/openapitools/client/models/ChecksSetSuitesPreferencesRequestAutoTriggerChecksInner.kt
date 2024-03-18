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
 * @param appId The `id` of the GitHub App.
 * @param setting Set to `true` to enable automatic creation of CheckSuite events upon pushes to the repository, or `false` to disable them.
 */
@Serializable

data class ChecksSetSuitesPreferencesRequestAutoTriggerChecksInner (

    /* The `id` of the GitHub App. */
    @SerialName(value = "app_id")
    val appId: kotlin.Int,

    /* Set to `true` to enable automatic creation of CheckSuite events upon pushes to the repository, or `false` to disable them. */
    @SerialName(value = "setting")
    val setting: kotlin.Boolean = true

)
