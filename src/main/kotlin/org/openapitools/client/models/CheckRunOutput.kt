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
 * @param title 
 * @param summary 
 * @param text 
 * @param annotationsCount 
 * @param annotationsUrl 
 */
@Serializable

data class CheckRunOutput (

    @SerialName(value = "title")
    val title: kotlin.String?,

    @SerialName(value = "summary")
    val summary: kotlin.String?,

    @SerialName(value = "text")
    val text: kotlin.String?,

    @SerialName(value = "annotations_count")
    val annotationsCount: kotlin.Int,

    @Contextual @SerialName(value = "annotations_url")
    val annotationsUrl: java.net.URI

)
