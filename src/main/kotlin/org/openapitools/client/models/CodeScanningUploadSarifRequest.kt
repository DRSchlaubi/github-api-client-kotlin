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
 * @param commitSha The SHA of the commit to which the analysis you are uploading relates.
 * @param ref The full Git reference, formatted as `refs/heads/<branch name>`, `refs/tags/<tag>`, `refs/pull/<number>/merge`, or `refs/pull/<number>/head`.
 * @param sarif A Base64 string representing the SARIF file to upload. You must first compress your SARIF file using [`gzip`](http://www.gnu.org/software/gzip/manual/gzip.html) and then translate the contents of the file into a Base64 encoding string. For more information, see \"[SARIF support for code scanning](https://docs.github.com/code-security/secure-coding/sarif-support-for-code-scanning).\"
 * @param checkoutUri The base directory used in the analysis, as it appears in the SARIF file. This property is used to convert file paths from absolute to relative, so that alerts can be mapped to their correct location in the repository.
 * @param startedAt The time that the analysis run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
 * @param toolName The name of the tool used to generate the code scanning analysis. If this parameter is not used, the tool name defaults to \"API\". If the uploaded SARIF contains a tool GUID, this will be available for filtering using the `tool_guid` parameter of operations such as `GET /repos/{owner}/{repo}/code-scanning/alerts`.
 * @param validate Whether the SARIF file will be validated according to the code scanning specifications. This parameter is intended to help integrators ensure that the uploaded SARIF files are correctly rendered by code scanning.
 */
@Serializable

data class CodeScanningUploadSarifRequest (

    /* The SHA of the commit to which the analysis you are uploading relates. */
    @SerialName(value = "commit_sha")
    val commitSha: kotlin.String,

    /* The full Git reference, formatted as `refs/heads/<branch name>`, `refs/tags/<tag>`, `refs/pull/<number>/merge`, or `refs/pull/<number>/head`. */
    @SerialName(value = "ref")
    val ref: kotlin.String,

    /* A Base64 string representing the SARIF file to upload. You must first compress your SARIF file using [`gzip`](http://www.gnu.org/software/gzip/manual/gzip.html) and then translate the contents of the file into a Base64 encoding string. For more information, see \"[SARIF support for code scanning](https://docs.github.com/code-security/secure-coding/sarif-support-for-code-scanning).\" */
    @SerialName(value = "sarif")
    val sarif: kotlin.String,

    /* The base directory used in the analysis, as it appears in the SARIF file. This property is used to convert file paths from absolute to relative, so that alerts can be mapped to their correct location in the repository. */
    @Contextual @SerialName(value = "checkout_uri")
    val checkoutUri: kotlin.Any? = null,

    /* The time that the analysis run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. */
    @Contextual @SerialName(value = "started_at")
    val startedAt: kotlin.Any? = null,

    /* The name of the tool used to generate the code scanning analysis. If this parameter is not used, the tool name defaults to \"API\". If the uploaded SARIF contains a tool GUID, this will be available for filtering using the `tool_guid` parameter of operations such as `GET /repos/{owner}/{repo}/code-scanning/alerts`. */
    @Contextual @SerialName(value = "tool_name")
    val toolName: kotlin.Any? = null,

    /* Whether the SARIF file will be validated according to the code scanning specifications. This parameter is intended to help integrators ensure that the uploaded SARIF files are correctly rendered by code scanning. */
    @Contextual @SerialName(value = "validate")
    val validate: kotlin.Any? = null

)

