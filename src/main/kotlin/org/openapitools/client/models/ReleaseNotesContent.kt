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
 * Generated name and body describing a release
 *
 * @param name The generated name of the release
 * @param body The generated body describing the contents of the release supporting markdown formatting
 */
@Serializable

data class ReleaseNotesContent (

    /* The generated name of the release */
    @SerialName(value = "name")
    val name: kotlin.String,

    /* The generated body describing the contents of the release supporting markdown formatting */
    @SerialName(value = "body")
    val body: kotlin.String

)

