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
 * @param contentType 
 * @param createdAt 
 * @param downloadUrl 
 * @param id 
 * @param md5 
 * @param name 
 * @param sha1 
 * @param sha256 
 * @param propertySize 
 * @param state 
 * @param updatedAt 
 */
@Serializable

data class WebhookPackagePublishedPackagePackageVersionPackageFilesInner (

    @SerialName(value = "content_type")
    val contentType: kotlin.String,

    @SerialName(value = "created_at")
    val createdAt: kotlin.String,

    @Contextual @SerialName(value = "download_url")
    val downloadUrl: java.net.URI,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "md5")
    val md5: kotlin.String?,

    @SerialName(value = "name")
    val name: kotlin.String,

    @SerialName(value = "sha1")
    val sha1: kotlin.String?,

    @SerialName(value = "sha256")
    val sha256: kotlin.String?,

    @SerialName(value = "size")
    val propertySize: kotlin.Int,

    @SerialName(value = "state")
    val state: kotlin.String?,

    @SerialName(value = "updated_at")
    val updatedAt: kotlin.String

)

