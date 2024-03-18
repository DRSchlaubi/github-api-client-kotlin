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

import org.openapitools.client.models.CheckRunPullRequestBase

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param base 
 * @param head 
 * @param id 
 * @param number 
 * @param url 
 */
@Serializable

data class WorkflowRunPullRequestsInner (

    @SerialName(value = "base")
    val base: CheckRunPullRequestBase,

    @SerialName(value = "head")
    val head: CheckRunPullRequestBase,

    @Contextual @SerialName(value = "id")
    val id: java.math.BigDecimal,

    @Contextual @SerialName(value = "number")
    val number: java.math.BigDecimal,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI

)
