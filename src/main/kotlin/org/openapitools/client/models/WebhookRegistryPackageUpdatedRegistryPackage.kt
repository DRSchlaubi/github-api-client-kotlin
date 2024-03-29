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

import org.openapitools.client.models.WebhookRegistryPackagePublishedRegistryPackageOwner
import org.openapitools.client.models.WebhookRegistryPackageUpdatedRegistryPackagePackageVersion

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param createdAt 
 * @param description 
 * @param ecosystem 
 * @param htmlUrl 
 * @param id 
 * @param name 
 * @param namespace 
 * @param owner 
 * @param packageType 
 * @param packageVersion 
 * @param registry 
 * @param updatedAt 
 */
@Serializable

data class WebhookRegistryPackageUpdatedRegistryPackage (

    @SerialName(value = "created_at")
    val createdAt: kotlin.String,

    @Contextual @SerialName(value = "description")
    val description: kotlin.Any?,

    @SerialName(value = "ecosystem")
    val ecosystem: kotlin.String,

    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "name")
    val name: kotlin.String,

    @SerialName(value = "namespace")
    val namespace: kotlin.String,

    @SerialName(value = "owner")
    val owner: WebhookRegistryPackagePublishedRegistryPackageOwner,

    @SerialName(value = "package_type")
    val packageType: kotlin.String,

    @SerialName(value = "package_version")
    val packageVersion: WebhookRegistryPackageUpdatedRegistryPackagePackageVersion,

    @Contextual @SerialName(value = "registry")
    val registry: kotlin.Any?,

    @SerialName(value = "updated_at")
    val updatedAt: kotlin.String

)

