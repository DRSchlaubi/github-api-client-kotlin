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
 * A GitHub organization.
 *
 * @param id 
 * @param login 
 * @param nodeId 
 * @param htmlUrl 
 * @param name 
 * @param avatarUrl 
 */
@Serializable

data class SimpleClassroomOrganization (

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "login")
    val login: kotlin.String,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    @SerialName(value = "name")
    val name: kotlin.String?,

    @SerialName(value = "avatar_url")
    val avatarUrl: kotlin.String

)

