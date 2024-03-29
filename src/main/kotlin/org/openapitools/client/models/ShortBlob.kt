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
 * Short Blob
 *
 * @param url 
 * @param sha 
 */
@Serializable

data class ShortBlob (

    @SerialName(value = "url")
    val url: kotlin.String,

    @SerialName(value = "sha")
    val sha: kotlin.String

)

