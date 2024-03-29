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

import org.openapitools.client.models.ContentTreeEntriesInnerLinks

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Content File
 *
 * @param type 
 * @param encoding 
 * @param propertySize 
 * @param name 
 * @param path 
 * @param content 
 * @param sha 
 * @param url 
 * @param gitUrl 
 * @param htmlUrl 
 * @param downloadUrl 
 * @param links 
 * @param target 
 * @param submoduleGitUrl 
 */
@Serializable

data class ContentFile (

    @SerialName(value = "type")
    val type: ContentFile.Type,

    @SerialName(value = "encoding")
    val encoding: kotlin.String,

    @SerialName(value = "size")
    val propertySize: kotlin.Int,

    @SerialName(value = "name")
    val name: kotlin.String,

    @SerialName(value = "path")
    val path: kotlin.String,

    @SerialName(value = "content")
    val content: kotlin.String,

    @SerialName(value = "sha")
    val sha: kotlin.String,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @Contextual @SerialName(value = "git_url")
    val gitUrl: java.net.URI?,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI?,

    @Contextual @SerialName(value = "download_url")
    val downloadUrl: java.net.URI?,

    @SerialName(value = "_links")
    val links: ContentTreeEntriesInnerLinks,

    @SerialName(value = "target")
    val target: kotlin.String? = null,

    @SerialName(value = "submodule_git_url")
    val submoduleGitUrl: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: file
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "file") file("file");
    }
}

