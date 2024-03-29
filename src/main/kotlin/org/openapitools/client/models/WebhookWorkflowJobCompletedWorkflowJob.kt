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
 * 
 *
 * @param checkRunUrl 
 * @param completedAt 
 * @param conclusion 
 * @param createdAt The time that the job created.
 * @param headSha 
 * @param htmlUrl 
 * @param id 
 * @param labels 
 * @param name 
 * @param nodeId 
 * @param runAttempt 
 * @param runId 
 * @param runUrl 
 * @param runnerGroupId 
 * @param runnerGroupName 
 * @param runnerId 
 * @param runnerName 
 * @param startedAt 
 * @param status 
 * @param headBranch The name of the current branch.
 * @param workflowName The name of the workflow.
 * @param steps 
 * @param url 
 */
@Serializable

data class WebhookWorkflowJobCompletedWorkflowJob (

    @SerialName(value = "check_run_url")
    val checkRunUrl: kotlin.String,

    @SerialName(value = "completed_at")
    val completedAt: kotlin.String,

    @SerialName(value = "conclusion")
    val conclusion: WebhookWorkflowJobCompletedWorkflowJob.Conclusion,

    /* The time that the job created. */
    @SerialName(value = "created_at")
    val createdAt: kotlin.String,

    @SerialName(value = "head_sha")
    val headSha: kotlin.String,

    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String,

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "labels")
    val labels: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "name")
    val name: kotlin.String,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "run_attempt")
    val runAttempt: kotlin.Int,

    @SerialName(value = "run_id")
    val runId: kotlin.Int,

    @SerialName(value = "run_url")
    val runUrl: kotlin.String,

    @Contextual @SerialName(value = "runner_group_id")
    val runnerGroupId: java.math.BigDecimal?,

    @SerialName(value = "runner_group_name")
    val runnerGroupName: kotlin.String?,

    @Contextual @SerialName(value = "runner_id")
    val runnerId: java.math.BigDecimal?,

    @SerialName(value = "runner_name")
    val runnerName: kotlin.String?,

    @SerialName(value = "started_at")
    val startedAt: kotlin.String,

    @SerialName(value = "status")
    val status: kotlin.String,

    /* The name of the current branch. */
    @SerialName(value = "head_branch")
    val headBranch: kotlin.String?,

    /* The name of the workflow. */
    @SerialName(value = "workflow_name")
    val workflowName: kotlin.String?,

    @SerialName(value = "steps")
    val steps: kotlin.collections.List<@Contextual kotlin.Any>,

    @SerialName(value = "url")
    val url: kotlin.String

) {

    /**
     * 
     *
     * Values: success,failure,skipped,cancelled,action_required,neutral,timed_out
     */
    @Serializable
    enum class Conclusion(val value: kotlin.String) {
        @SerialName(value = "success") success("success"),
        @SerialName(value = "failure") failure("failure"),
        @SerialName(value = "skipped") skipped("skipped"),
        @SerialName(value = "cancelled") cancelled("cancelled"),
        @SerialName(value = "action_required") action_required("action_required"),
        @SerialName(value = "neutral") neutral("neutral"),
        @SerialName(value = "timed_out") timed_out("timed_out");
    }
}

