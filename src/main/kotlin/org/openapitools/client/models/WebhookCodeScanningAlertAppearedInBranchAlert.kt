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

import org.openapitools.client.models.AlertInstance
import org.openapitools.client.models.User
import org.openapitools.client.models.WebhookCodeScanningAlertAppearedInBranchAlertRule
import org.openapitools.client.models.WebhookCodeScanningAlertAppearedInBranchAlertTool

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * The code scanning alert involved in the event.
 *
 * @param createdAt The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ.`
 * @param dismissedAt The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
 * @param dismissedBy 
 * @param dismissedReason The reason for dismissing or closing the alert.
 * @param htmlUrl The GitHub URL of the alert resource.
 * @param number The code scanning alert number.
 * @param rule 
 * @param state State of a code scanning alert.
 * @param tool 
 * @param url 
 * @param mostRecentInstance 
 */
@Serializable

data class WebhookCodeScanningAlertAppearedInBranchAlert (

    /* The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ.` */
    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    /* The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. */
    @Contextual @SerialName(value = "dismissed_at")
    val dismissedAt: kotlinx.datetime.Instant?,

    @SerialName(value = "dismissed_by")
    val dismissedBy: User,

    /* The reason for dismissing or closing the alert. */
    @SerialName(value = "dismissed_reason")
    val dismissedReason: WebhookCodeScanningAlertAppearedInBranchAlert.DismissedReason?,

    /* The GitHub URL of the alert resource. */
    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    /* The code scanning alert number. */
    @SerialName(value = "number")
    val number: kotlin.Int,

    @SerialName(value = "rule")
    val rule: WebhookCodeScanningAlertAppearedInBranchAlertRule,

    /* State of a code scanning alert. */
    @SerialName(value = "state")
    val state: WebhookCodeScanningAlertAppearedInBranchAlert.State,

    @SerialName(value = "tool")
    val tool: WebhookCodeScanningAlertAppearedInBranchAlertTool,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @SerialName(value = "most_recent_instance")
    val mostRecentInstance: AlertInstance? = null

) {

    /**
     * The reason for dismissing or closing the alert.
     *
     * Values: false_positive,wonQuoteT_fix,used_in_tests,`null`
     */
    @Serializable
    enum class DismissedReason(val value: kotlin.String) {
        @SerialName(value = "false positive") false_positive("false positive"),
        @SerialName(value = "won't fix") wonQuoteT_fix("won't fix"),
        @SerialName(value = "used in tests") used_in_tests("used in tests"),
        @SerialName(value = "null") `null`("null");
    }
    /**
     * State of a code scanning alert.
     *
     * Values: `open`,dismissed,fixed
     */
    @Serializable
    enum class State(val value: kotlin.String) {
        @SerialName(value = "open") `open`("open"),
        @SerialName(value = "dismissed") dismissed("dismissed"),
        @SerialName(value = "fixed") fixed("fixed");
    }
}
