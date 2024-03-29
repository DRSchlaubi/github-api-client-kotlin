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
 * @param id 
 * @param url 
 * @param projectId 
 * @param projectUrl 
 * @param columnName 
 * @param previousColumnName 
 */
@Serializable

data class AddedToProjectIssueEventProjectCard (

    @SerialName(value = "id")
    val id: kotlin.Int,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @SerialName(value = "project_id")
    val projectId: kotlin.Int,

    @Contextual @SerialName(value = "project_url")
    val projectUrl: java.net.URI,

    @SerialName(value = "column_name")
    val columnName: kotlin.String,

    @SerialName(value = "previous_column_name")
    val previousColumnName: kotlin.String? = null

)

