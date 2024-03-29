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

import org.openapitools.client.models.GitRefObject

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Git references within a repository
 *
 * @param ref 
 * @param nodeId 
 * @param url 
 * @param `object` 
 */
@Serializable

data class GitRef (

    @SerialName(value = "ref")
    val ref: kotlin.String,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @SerialName(value = "object")
    val `object`: GitRefObject

)

