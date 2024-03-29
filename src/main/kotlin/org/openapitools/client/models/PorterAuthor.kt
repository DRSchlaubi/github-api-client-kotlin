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
 * Porter Author
 *
 * @param id 
 * @param remoteId 
 * @param remoteName 
 * @param email 
 * @param name 
 * @param url 
 * @param importUrl 
 */
@Serializable

data class PorterAuthor (

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "remote_id")
    val remoteId: kotlin.String,

    @SerialName(value = "remote_name")
    val remoteName: kotlin.String,

    @SerialName(value = "email")
    val email: kotlin.String,

    @SerialName(value = "name")
    val name: kotlin.String,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @Contextual @SerialName(value = "import_url")
    val importUrl: java.net.URI

)

