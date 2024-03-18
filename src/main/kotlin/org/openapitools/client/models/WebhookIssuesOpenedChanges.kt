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

import org.openapitools.client.models.Issue4
import org.openapitools.client.models.Repository

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param oldIssue 
 * @param oldRepository 
 */
@Serializable

data class WebhookIssuesOpenedChanges (

    @SerialName(value = "old_issue")
    val oldIssue: Issue4,

    @SerialName(value = "old_repository")
    val oldRepository: Repository

)
