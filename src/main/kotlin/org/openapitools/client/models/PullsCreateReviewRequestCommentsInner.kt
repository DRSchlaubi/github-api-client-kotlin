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
 * @param path The relative path to the file that necessitates a review comment.
 * @param body Text of the review comment.
 * @param position The position in the diff where you want to add a review comment. Note this value is not the same as the line number in the file. The `position` value equals the number of lines down from the first \"@@\" hunk header in the file you want to add a comment. The line just below the \"@@\" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file.
 * @param line 
 * @param side 
 * @param startLine 
 * @param startSide 
 */
@Serializable

data class PullsCreateReviewRequestCommentsInner (

    /* The relative path to the file that necessitates a review comment. */
    @SerialName(value = "path")
    val path: kotlin.String,

    /* Text of the review comment. */
    @SerialName(value = "body")
    val body: kotlin.String,

    /* The position in the diff where you want to add a review comment. Note this value is not the same as the line number in the file. The `position` value equals the number of lines down from the first \"@@\" hunk header in the file you want to add a comment. The line just below the \"@@\" line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file. */
    @SerialName(value = "position")
    val position: kotlin.Int? = null,

    @SerialName(value = "line")
    val line: kotlin.Int? = null,

    @SerialName(value = "side")
    val side: kotlin.String? = null,

    @SerialName(value = "start_line")
    val startLine: kotlin.Int? = null,

    @SerialName(value = "start_side")
    val startSide: kotlin.String? = null

)
