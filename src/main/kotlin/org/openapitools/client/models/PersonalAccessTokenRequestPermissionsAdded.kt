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
 * New requested permissions, categorized by type of permission.
 *
 * @param organization 
 * @param repository 
 * @param other 
 */
@Serializable

data class PersonalAccessTokenRequestPermissionsAdded (

    @SerialName(value = "organization")
    val organization: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @SerialName(value = "repository")
    val repository: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @SerialName(value = "other")
    val other: kotlin.collections.Map<kotlin.String, kotlin.String>? = null

)

