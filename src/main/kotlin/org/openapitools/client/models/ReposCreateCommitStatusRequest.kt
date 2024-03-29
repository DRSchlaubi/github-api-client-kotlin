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
 * @param state The state of the status.
 * @param targetUrl The target URL to associate with this status. This URL will be linked from the GitHub UI to allow users to easily see the source of the status.   For example, if your continuous integration system is posting build status, you would want to provide the deep link for the build output for this specific SHA:   `http://ci.example.com/user/repo/build/sha`
 * @param description A short description of the status.
 * @param context A string label to differentiate this status from the status of other systems. This field is case-insensitive.
 */
@Serializable

data class ReposCreateCommitStatusRequest (

    /* The state of the status. */
    @SerialName(value = "state")
    val state: ReposCreateCommitStatusRequest.State,

    /* The target URL to associate with this status. This URL will be linked from the GitHub UI to allow users to easily see the source of the status.   For example, if your continuous integration system is posting build status, you would want to provide the deep link for the build output for this specific SHA:   `http://ci.example.com/user/repo/build/sha` */
    @SerialName(value = "target_url")
    val targetUrl: kotlin.String? = null,

    /* A short description of the status. */
    @SerialName(value = "description")
    val description: kotlin.String? = null,

    /* A string label to differentiate this status from the status of other systems. This field is case-insensitive. */
    @SerialName(value = "context")
    val context: kotlin.String? = "default"

) {

    /**
     * The state of the status.
     *
     * Values: error,failure,pending,success
     */
    @Serializable
    enum class State(val value: kotlin.String) {
        @SerialName(value = "error") error("error"),
        @SerialName(value = "failure") failure("failure"),
        @SerialName(value = "pending") pending("pending"),
        @SerialName(value = "success") success("success");
    }
}

