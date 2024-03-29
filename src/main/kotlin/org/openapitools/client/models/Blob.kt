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
 * Blob
 *
 * @param content 
 * @param encoding 
 * @param url 
 * @param sha 
 * @param propertySize 
 * @param nodeId 
 * @param highlightedContent 
 */
@Serializable

data class Blob (

    @SerialName(value = "content")
    val content: kotlin.String,

    @SerialName(value = "encoding")
    val encoding: kotlin.String,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @SerialName(value = "sha")
    val sha: kotlin.String,

    @SerialName(value = "size")
    val propertySize: kotlin.Int?,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "highlighted_content")
    val highlightedContent: kotlin.String? = null

)

