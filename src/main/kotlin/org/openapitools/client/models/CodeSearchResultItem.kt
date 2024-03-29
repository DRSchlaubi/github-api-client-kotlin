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

import org.openapitools.client.models.MinimalRepository
import org.openapitools.client.models.SearchResultTextMatchesInner

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Code Search Result Item
 *
 * @param name 
 * @param path 
 * @param sha 
 * @param url 
 * @param gitUrl 
 * @param htmlUrl 
 * @param repository 
 * @param score 
 * @param fileSize 
 * @param language 
 * @param lastModifiedAt 
 * @param lineNumbers 
 * @param textMatches 
 */
@Serializable

data class CodeSearchResultItem (

    @SerialName(value = "name")
    val name: kotlin.String,

    @SerialName(value = "path")
    val path: kotlin.String,

    @SerialName(value = "sha")
    val sha: kotlin.String,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @Contextual @SerialName(value = "git_url")
    val gitUrl: java.net.URI,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    @SerialName(value = "repository")
    val repository: MinimalRepository,

    @Contextual @SerialName(value = "score")
    val score: java.math.BigDecimal,

    @SerialName(value = "file_size")
    val fileSize: kotlin.Int? = null,

    @SerialName(value = "language")
    val language: kotlin.String? = null,

    @Contextual @SerialName(value = "last_modified_at")
    val lastModifiedAt: kotlinx.datetime.Instant? = null,

    @SerialName(value = "line_numbers")
    val lineNumbers: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "text_matches")
    val textMatches: kotlin.collections.List<SearchResultTextMatchesInner>? = null

)

