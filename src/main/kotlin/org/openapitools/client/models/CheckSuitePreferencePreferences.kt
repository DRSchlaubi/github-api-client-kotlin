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

import org.openapitools.client.models.CheckSuitePreferencePreferencesAutoTriggerChecksInner

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param autoTriggerChecks 
 */
@Serializable

data class CheckSuitePreferencePreferences (

    @SerialName(value = "auto_trigger_checks")
    val autoTriggerChecks: kotlin.collections.List<CheckSuitePreferencePreferencesAutoTriggerChecksInner>? = null

)

