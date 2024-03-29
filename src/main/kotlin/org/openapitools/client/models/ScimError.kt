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
 * Scim Error
 *
 * @param message 
 * @param documentationUrl 
 * @param detail 
 * @param status 
 * @param scimType 
 * @param schemas 
 */
@Serializable

data class ScimError (

    @SerialName(value = "message")
    val message: kotlin.String? = null,

    @SerialName(value = "documentation_url")
    val documentationUrl: kotlin.String? = null,

    @SerialName(value = "detail")
    val detail: kotlin.String? = null,

    @SerialName(value = "status")
    val status: kotlin.Int? = null,

    @SerialName(value = "scimType")
    val scimType: kotlin.String? = null,

    @SerialName(value = "schemas")
    val schemas: kotlin.collections.List<kotlin.String>? = null

)

