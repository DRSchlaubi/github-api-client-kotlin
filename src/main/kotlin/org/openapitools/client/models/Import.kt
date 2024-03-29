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

import org.openapitools.client.models.ImportProjectChoicesInner

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A repository import from an external source.
 *
 * @param vcs 
 * @param vcsUrl The URL of the originating repository.
 * @param status 
 * @param url 
 * @param htmlUrl 
 * @param authorsUrl 
 * @param repositoryUrl 
 * @param useLfs 
 * @param svcRoot 
 * @param tfvcProject 
 * @param statusText 
 * @param failedStep 
 * @param errorMessage 
 * @param importPercent 
 * @param commitCount 
 * @param pushPercent 
 * @param hasLargeFiles 
 * @param largeFilesSize 
 * @param largeFilesCount 
 * @param projectChoices 
 * @param message 
 * @param authorsCount 
 * @param svnRoot 
 */
@Serializable

data class Import (

    @SerialName(value = "vcs")
    val vcs: kotlin.String?,

    /* The URL of the originating repository. */
    @SerialName(value = "vcs_url")
    val vcsUrl: kotlin.String,

    @SerialName(value = "status")
    val status: Import.Status,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    @Contextual @SerialName(value = "authors_url")
    val authorsUrl: java.net.URI,

    @Contextual @SerialName(value = "repository_url")
    val repositoryUrl: java.net.URI,

    @SerialName(value = "use_lfs")
    val useLfs: kotlin.Boolean? = null,

    @SerialName(value = "svc_root")
    val svcRoot: kotlin.String? = null,

    @SerialName(value = "tfvc_project")
    val tfvcProject: kotlin.String? = null,

    @SerialName(value = "status_text")
    val statusText: kotlin.String? = null,

    @SerialName(value = "failed_step")
    val failedStep: kotlin.String? = null,

    @SerialName(value = "error_message")
    val errorMessage: kotlin.String? = null,

    @SerialName(value = "import_percent")
    val importPercent: kotlin.Int? = null,

    @SerialName(value = "commit_count")
    val commitCount: kotlin.Int? = null,

    @SerialName(value = "push_percent")
    val pushPercent: kotlin.Int? = null,

    @SerialName(value = "has_large_files")
    val hasLargeFiles: kotlin.Boolean? = null,

    @SerialName(value = "large_files_size")
    val largeFilesSize: kotlin.Int? = null,

    @SerialName(value = "large_files_count")
    val largeFilesCount: kotlin.Int? = null,

    @SerialName(value = "project_choices")
    val projectChoices: kotlin.collections.List<ImportProjectChoicesInner>? = null,

    @SerialName(value = "message")
    val message: kotlin.String? = null,

    @SerialName(value = "authors_count")
    val authorsCount: kotlin.Int? = null,

    @SerialName(value = "svn_root")
    val svnRoot: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: auth,error,none,detecting,choose,auth_failed,importing,mapping,waiting_to_push,pushing,complete,setup,unknown,detection_found_multiple,detection_found_nothing,detection_needs_auth
     */
    @Serializable
    enum class Status(val value: kotlin.String) {
        @SerialName(value = "auth") auth("auth"),
        @SerialName(value = "error") error("error"),
        @SerialName(value = "none") none("none"),
        @SerialName(value = "detecting") detecting("detecting"),
        @SerialName(value = "choose") choose("choose"),
        @SerialName(value = "auth_failed") auth_failed("auth_failed"),
        @SerialName(value = "importing") importing("importing"),
        @SerialName(value = "mapping") mapping("mapping"),
        @SerialName(value = "waiting_to_push") waiting_to_push("waiting_to_push"),
        @SerialName(value = "pushing") pushing("pushing"),
        @SerialName(value = "complete") complete("complete"),
        @SerialName(value = "setup") setup("setup"),
        @SerialName(value = "unknown") unknown("unknown"),
        @SerialName(value = "detection_found_multiple") detection_found_multiple("detection_found_multiple"),
        @SerialName(value = "detection_found_nothing") detection_found_nothing("detection_found_nothing"),
        @SerialName(value = "detection_needs_auth") detection_needs_auth("detection_needs_auth");
    }
}

