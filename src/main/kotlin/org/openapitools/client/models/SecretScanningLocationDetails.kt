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

import org.openapitools.client.models.SecretScanningLocationCommit
import org.openapitools.client.models.SecretScanningLocationDiscussionBody
import org.openapitools.client.models.SecretScanningLocationDiscussionComment
import org.openapitools.client.models.SecretScanningLocationDiscussionTitle
import org.openapitools.client.models.SecretScanningLocationIssueBody
import org.openapitools.client.models.SecretScanningLocationIssueComment
import org.openapitools.client.models.SecretScanningLocationIssueTitle
import org.openapitools.client.models.SecretScanningLocationPullRequestBody
import org.openapitools.client.models.SecretScanningLocationPullRequestComment
import org.openapitools.client.models.SecretScanningLocationPullRequestReview
import org.openapitools.client.models.SecretScanningLocationPullRequestReviewComment
import org.openapitools.client.models.SecretScanningLocationPullRequestTitle

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param path The file path in the repository
 * @param startLine Line number at which the secret starts in the file
 * @param endLine Line number at which the secret ends in the file
 * @param startColumn The column at which the secret starts within the start line when the file is interpreted as 8BIT ASCII
 * @param endColumn The column at which the secret ends within the end line when the file is interpreted as 8BIT ASCII
 * @param blobSha SHA-1 hash ID of the associated blob
 * @param blobUrl The API URL to get the associated blob resource
 * @param commitSha SHA-1 hash ID of the associated commit
 * @param commitUrl The API URL to get the associated commit resource
 * @param issueTitleUrl The API URL to get the issue where the secret was detected.
 * @param issueBodyUrl The API URL to get the issue where the secret was detected.
 * @param issueCommentUrl The API URL to get the issue comment where the secret was detected.
 * @param discussionTitleUrl The URL to the discussion where the secret was detected.
 * @param discussionBodyUrl The URL to the discussion where the secret was detected.
 * @param discussionCommentUrl The API URL to get the discussion comment where the secret was detected.
 * @param pullRequestTitleUrl The API URL to get the pull request where the secret was detected.
 * @param pullRequestBodyUrl The API URL to get the pull request where the secret was detected.
 * @param pullRequestCommentUrl The API URL to get the pull request comment where the secret was detected.
 * @param pullRequestReviewUrl The API URL to get the pull request review where the secret was detected.
 * @param pullRequestReviewCommentUrl The API URL to get the pull request review comment where the secret was detected.
 */
@Serializable

data class SecretScanningLocationDetails (

    /* The file path in the repository */
    @Contextual @SerialName(value = "path")
    val path: kotlin.Any?,

    /* Line number at which the secret starts in the file */
    @Contextual @SerialName(value = "start_line")
    val startLine: kotlin.Any?,

    /* Line number at which the secret ends in the file */
    @Contextual @SerialName(value = "end_line")
    val endLine: kotlin.Any?,

    /* The column at which the secret starts within the start line when the file is interpreted as 8BIT ASCII */
    @Contextual @SerialName(value = "start_column")
    val startColumn: kotlin.Any?,

    /* The column at which the secret ends within the end line when the file is interpreted as 8BIT ASCII */
    @Contextual @SerialName(value = "end_column")
    val endColumn: kotlin.Any?,

    /* SHA-1 hash ID of the associated blob */
    @Contextual @SerialName(value = "blob_sha")
    val blobSha: kotlin.Any?,

    /* The API URL to get the associated blob resource */
    @Contextual @SerialName(value = "blob_url")
    val blobUrl: kotlin.Any?,

    /* SHA-1 hash ID of the associated commit */
    @Contextual @SerialName(value = "commit_sha")
    val commitSha: kotlin.Any?,

    /* The API URL to get the associated commit resource */
    @Contextual @SerialName(value = "commit_url")
    val commitUrl: kotlin.Any?,

    /* The API URL to get the issue where the secret was detected. */
    @Contextual @SerialName(value = "issue_title_url")
    val issueTitleUrl: kotlin.Any?,

    /* The API URL to get the issue where the secret was detected. */
    @Contextual @SerialName(value = "issue_body_url")
    val issueBodyUrl: kotlin.Any?,

    /* The API URL to get the issue comment where the secret was detected. */
    @Contextual @SerialName(value = "issue_comment_url")
    val issueCommentUrl: kotlin.Any?,

    /* The URL to the discussion where the secret was detected. */
    @Contextual @SerialName(value = "discussion_title_url")
    val discussionTitleUrl: kotlin.Any?,

    /* The URL to the discussion where the secret was detected. */
    @Contextual @SerialName(value = "discussion_body_url")
    val discussionBodyUrl: kotlin.Any?,

    /* The API URL to get the discussion comment where the secret was detected. */
    @Contextual @SerialName(value = "discussion_comment_url")
    val discussionCommentUrl: kotlin.Any?,

    /* The API URL to get the pull request where the secret was detected. */
    @Contextual @SerialName(value = "pull_request_title_url")
    val pullRequestTitleUrl: kotlin.Any?,

    /* The API URL to get the pull request where the secret was detected. */
    @Contextual @SerialName(value = "pull_request_body_url")
    val pullRequestBodyUrl: kotlin.Any?,

    /* The API URL to get the pull request comment where the secret was detected. */
    @Contextual @SerialName(value = "pull_request_comment_url")
    val pullRequestCommentUrl: kotlin.Any?,

    /* The API URL to get the pull request review where the secret was detected. */
    @Contextual @SerialName(value = "pull_request_review_url")
    val pullRequestReviewUrl: kotlin.Any?,

    /* The API URL to get the pull request review comment where the secret was detected. */
    @Contextual @SerialName(value = "pull_request_review_comment_url")
    val pullRequestReviewCommentUrl: kotlin.Any?

)

