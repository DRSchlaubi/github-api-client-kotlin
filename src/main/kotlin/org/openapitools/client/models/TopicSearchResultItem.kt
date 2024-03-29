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

import org.openapitools.client.models.SearchResultTextMatchesInner
import org.openapitools.client.models.TopicSearchResultItemRelatedInner

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Topic Search Result Item
 *
 * @param name 
 * @param displayName 
 * @param shortDescription 
 * @param description 
 * @param createdBy 
 * @param released 
 * @param createdAt 
 * @param updatedAt 
 * @param featured 
 * @param curated 
 * @param score 
 * @param repositoryCount 
 * @param logoUrl 
 * @param textMatches 
 * @param related 
 * @param aliases 
 */
@Serializable

data class TopicSearchResultItem (

    @SerialName(value = "name")
    val name: kotlin.String,

    @SerialName(value = "display_name")
    val displayName: kotlin.String?,

    @SerialName(value = "short_description")
    val shortDescription: kotlin.String?,

    @SerialName(value = "description")
    val description: kotlin.String?,

    @SerialName(value = "created_by")
    val createdBy: kotlin.String?,

    @SerialName(value = "released")
    val released: kotlin.String?,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    @SerialName(value = "featured")
    val featured: kotlin.Boolean,

    @SerialName(value = "curated")
    val curated: kotlin.Boolean,

    @Contextual @SerialName(value = "score")
    val score: java.math.BigDecimal,

    @SerialName(value = "repository_count")
    val repositoryCount: kotlin.Int? = null,

    @Contextual @SerialName(value = "logo_url")
    val logoUrl: java.net.URI? = null,

    @SerialName(value = "text_matches")
    val textMatches: kotlin.collections.List<SearchResultTextMatchesInner>? = null,

    @SerialName(value = "related")
    val related: kotlin.collections.List<TopicSearchResultItemRelatedInner>? = null,

    @SerialName(value = "aliases")
    val aliases: kotlin.collections.List<TopicSearchResultItemRelatedInner>? = null

)

