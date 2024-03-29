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

import org.openapitools.client.models.PageDeploymentId

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * The GitHub Pages deployment status.
 *
 * @param id 
 * @param statusUrl The URI to monitor GitHub Pages deployment status.
 * @param pageUrl The URI to the deployed GitHub Pages.
 * @param previewUrl The URI to the deployed GitHub Pages preview.
 */
@Serializable

data class PageDeployment (

    @SerialName(value = "id")
    val id: PageDeploymentId,

    /* The URI to monitor GitHub Pages deployment status. */
    @Contextual @SerialName(value = "status_url")
    val statusUrl: java.net.URI,

    /* The URI to the deployed GitHub Pages. */
    @Contextual @SerialName(value = "page_url")
    val pageUrl: java.net.URI,

    /* The URI to the deployed GitHub Pages preview. */
    @Contextual @SerialName(value = "preview_url")
    val previewUrl: java.net.URI? = null

)

