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
 * @param appId 
 * @param setting 
 */
@Serializable

data class CheckSuitePreferencePreferencesAutoTriggerChecksInner (

    @SerialName(value = "app_id")
    val appId: kotlin.Int,

    @SerialName(value = "setting")
    val setting: kotlin.Boolean

)

