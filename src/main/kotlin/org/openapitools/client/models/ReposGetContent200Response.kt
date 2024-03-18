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

import org.openapitools.client.models.ContentDirectoryInner
import org.openapitools.client.models.ContentFile
import org.openapitools.client.models.ContentSubmodule
import org.openapitools.client.models.ContentSymlink
import org.openapitools.client.models.ContentTreeEntriesInnerLinks

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
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

data class ReposGetContent200Response (

    @SerialName(value = "type")
    val type: ReposGetContent200Response.Type?,

    @Contextual @SerialName(value = "encoding")
    val encoding: kotlin.Any?,

    @Contextual @SerialName(value = "size")
    val propertySize: kotlin.Any?,

    @Contextual @SerialName(value = "name")
    val name: kotlin.Any?,

    @Contextual @SerialName(value = "path")
    val path: kotlin.Any?,

    @Contextual @SerialName(value = "content")
    val content: kotlin.Any?,

    @Contextual @SerialName(value = "sha")
    val sha: kotlin.Any?,

    @Contextual @SerialName(value = "url")
    val url: kotlin.Any?,

    @Contextual @SerialName(value = "git_url")
    val gitUrl: kotlin.Any?,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: kotlin.Any?,

    @Contextual @SerialName(value = "download_url")
    val downloadUrl: kotlin.Any?,

    @SerialName(value = "_links")
    val links: ContentTreeEntriesInnerLinks,

    @Contextual @SerialName(value = "target")
    val target: kotlin.Any?,

    @Contextual @SerialName(value = "submodule_git_url")
    val submoduleGitUrl: kotlin.Any?

) {

    /**
     * 
     *
     * Values: file,symlink,submodule
     */
    @Serializable
    enum class Type(val value: kotlin.Any) {
        @SerialName(value = "file") file("file"),
        @SerialName(value = "symlink") symlink("symlink"),
        @SerialName(value = "submodule") submodule("submodule");
    }
}
