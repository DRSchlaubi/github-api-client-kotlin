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

import org.openapitools.client.models.FileCommitContentLinks

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param name 
 * @param path 
 * @param sha 
 * @param propertySize 
 * @param url 
 * @param htmlUrl 
 * @param gitUrl 
 * @param downloadUrl 
 * @param type 
 * @param links 
 */
@Serializable

data class FileCommitContent (

    @SerialName(value = "name")
    val name: kotlin.String? = null,

    @SerialName(value = "path")
    val path: kotlin.String? = null,

    @SerialName(value = "sha")
    val sha: kotlin.String? = null,

    @SerialName(value = "size")
    val propertySize: kotlin.Int? = null,

    @SerialName(value = "url")
    val url: kotlin.String? = null,

    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String? = null,

    @SerialName(value = "git_url")
    val gitUrl: kotlin.String? = null,

    @SerialName(value = "download_url")
    val downloadUrl: kotlin.String? = null,

    @SerialName(value = "type")
    val type: kotlin.String? = null,

    @SerialName(value = "_links")
    val links: FileCommitContentLinks? = null

)

