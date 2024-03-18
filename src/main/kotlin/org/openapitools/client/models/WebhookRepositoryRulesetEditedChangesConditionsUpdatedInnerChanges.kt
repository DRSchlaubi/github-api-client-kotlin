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

import org.openapitools.client.models.WebhookOrganizationRenamedChangesLogin
import org.openapitools.client.models.WebhookRepositoryEditedChangesTopics

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param conditionType 
 * @param target 
 * @param include 
 * @param exclude 
 */
@Serializable

data class WebhookRepositoryRulesetEditedChangesConditionsUpdatedInnerChanges (

    @SerialName(value = "condition_type")
    val conditionType: WebhookOrganizationRenamedChangesLogin? = null,

    @SerialName(value = "target")
    val target: WebhookOrganizationRenamedChangesLogin? = null,

    @SerialName(value = "include")
    val include: WebhookRepositoryEditedChangesTopics? = null,

    @SerialName(value = "exclude")
    val exclude: WebhookRepositoryEditedChangesTopics? = null

)
