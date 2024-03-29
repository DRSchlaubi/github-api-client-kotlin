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

import org.openapitools.client.models.PullsCreateReviewRequestCommentsInner

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param commitId The SHA of the commit that needs a review. Not using the latest commit SHA may render your review comment outdated if a subsequent commit modifies the line you specify as the `position`. Defaults to the most recent commit in the pull request when you do not specify a value.
 * @param body **Required** when using `REQUEST_CHANGES` or `COMMENT` for the `event` parameter. The body text of the pull request review.
 * @param event The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. By leaving this blank, you set the review action state to `PENDING`, which means you will need to [submit the pull request review](https://docs.github.com/rest/pulls/reviews#submit-a-review-for-a-pull-request) when you are ready.
 * @param comments Use the following table to specify the location, destination, and contents of the draft review comment.
 */
@Serializable

data class PullsCreateReviewRequest (

    /* The SHA of the commit that needs a review. Not using the latest commit SHA may render your review comment outdated if a subsequent commit modifies the line you specify as the `position`. Defaults to the most recent commit in the pull request when you do not specify a value. */
    @SerialName(value = "commit_id")
    val commitId: kotlin.String? = null,

    /* **Required** when using `REQUEST_CHANGES` or `COMMENT` for the `event` parameter. The body text of the pull request review. */
    @SerialName(value = "body")
    val body: kotlin.String? = null,

    /* The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. By leaving this blank, you set the review action state to `PENDING`, which means you will need to [submit the pull request review](https://docs.github.com/rest/pulls/reviews#submit-a-review-for-a-pull-request) when you are ready. */
    @SerialName(value = "event")
    val event: PullsCreateReviewRequest.Event? = null,

    /* Use the following table to specify the location, destination, and contents of the draft review comment. */
    @SerialName(value = "comments")
    val comments: kotlin.collections.List<PullsCreateReviewRequestCommentsInner>? = null

) {

    /**
     * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. By leaving this blank, you set the review action state to `PENDING`, which means you will need to [submit the pull request review](https://docs.github.com/rest/pulls/reviews#submit-a-review-for-a-pull-request) when you are ready.
     *
     * Values: APPROVE,REQUEST_CHANGES,COMMENT
     */
    @Serializable
    enum class Event(val value: kotlin.String) {
        @SerialName(value = "APPROVE") APPROVE("APPROVE"),
        @SerialName(value = "REQUEST_CHANGES") REQUEST_CHANGES("REQUEST_CHANGES"),
        @SerialName(value = "COMMENT") COMMENT("COMMENT");
    }
}

