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
 * @param message 
 * @param url 
 */
@Serializable

data class ActivityMarkRepoNotificationsAsRead202Response (

    @SerialName(value = "message")
    val message: kotlin.String? = "push",

    @SerialName(value = "url")
    val url: kotlin.String? = "push"

)

