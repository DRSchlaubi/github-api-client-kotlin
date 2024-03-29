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
 * @param title The discussion post's title.
 * @param body The discussion post's body text.
 */
@Serializable

data class TeamsUpdateDiscussionInOrgRequest (

    /* The discussion post's title. */
    @SerialName(value = "title")
    val title: kotlin.String? = null,

    /* The discussion post's body text. */
    @SerialName(value = "body")
    val body: kotlin.String? = null

)

