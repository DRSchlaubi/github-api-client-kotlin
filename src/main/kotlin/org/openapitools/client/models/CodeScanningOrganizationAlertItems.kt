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

import org.openapitools.client.models.CodeScanningAlertDismissedReason
import org.openapitools.client.models.CodeScanningAlertInstance
import org.openapitools.client.models.CodeScanningAlertRuleSummary
import org.openapitools.client.models.CodeScanningAlertState
import org.openapitools.client.models.CodeScanningAnalysisTool
import org.openapitools.client.models.IntegrationOwner
import org.openapitools.client.models.SimpleRepository

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param number The security alert number.
 * @param createdAt The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
 * @param url The REST API URL of the alert resource.
 * @param htmlUrl The GitHub URL of the alert resource.
 * @param instancesUrl The REST API URL for fetching the list of instances for an alert.
 * @param state 
 * @param dismissedBy 
 * @param dismissedAt The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
 * @param dismissedReason 
 * @param rule 
 * @param tool 
 * @param mostRecentInstance 
 * @param repository 
 * @param updatedAt The time that the alert was last updated in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
 * @param fixedAt The time that the alert was no longer detected and was considered fixed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
 * @param dismissedComment The dismissal comment associated with the dismissal of the alert.
 */
@Serializable

data class CodeScanningOrganizationAlertItems (

    /* The security alert number. */
    @SerialName(value = "number")
    val number: kotlin.Int,

    /* The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. */
    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    /* The REST API URL of the alert resource. */
    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    /* The GitHub URL of the alert resource. */
    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    /* The REST API URL for fetching the list of instances for an alert. */
    @Contextual @SerialName(value = "instances_url")
    val instancesUrl: java.net.URI,

    @Contextual @SerialName(value = "state")
    val state: CodeScanningAlertState,

    @SerialName(value = "dismissed_by")
    val dismissedBy: IntegrationOwner,

    /* The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. */
    @Contextual @SerialName(value = "dismissed_at")
    val dismissedAt: kotlinx.datetime.Instant?,

    @Contextual @SerialName(value = "dismissed_reason")
    val dismissedReason: CodeScanningAlertDismissedReason?,

    @SerialName(value = "rule")
    val rule: CodeScanningAlertRuleSummary,

    @SerialName(value = "tool")
    val tool: CodeScanningAnalysisTool,

    @SerialName(value = "most_recent_instance")
    val mostRecentInstance: CodeScanningAlertInstance,

    @SerialName(value = "repository")
    val repository: SimpleRepository,

    /* The time that the alert was last updated in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. */
    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant? = null,

    /* The time that the alert was no longer detected and was considered fixed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. */
    @Contextual @SerialName(value = "fixed_at")
    val fixedAt: kotlinx.datetime.Instant? = null,

    /* The dismissal comment associated with the dismissal of the alert. */
    @SerialName(value = "dismissed_comment")
    val dismissedComment: kotlin.String? = null

)

