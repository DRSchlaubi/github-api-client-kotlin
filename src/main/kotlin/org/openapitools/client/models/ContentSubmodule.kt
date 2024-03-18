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
 * An object describing a submodule
 *
 * @param type 
 * @param submoduleGitUrl 
 * @param propertySize 
 * @param name 
 * @param path 
 * @param sha 
 * @param url 
 * @param gitUrl 
 * @param htmlUrl 
 * @param downloadUrl 
 * @param links 
 */
@Serializable

data class ContentSubmodule (

    @SerialName(value = "type")
    val type: ContentSubmodule.Type,

    @Contextual @SerialName(value = "submodule_git_url")
    val submoduleGitUrl: java.net.URI,

    @SerialName(value = "size")
    val propertySize: kotlin.Int,

    @SerialName(value = "name")
    val name: kotlin.String,

    @SerialName(value = "path")
    val path: kotlin.String,

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
    val links: ContentTreeEntriesInnerLinks

) {

    /**
     * 
     *
     * Values: submodule
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "submodule") submodule("submodule");
    }
}
