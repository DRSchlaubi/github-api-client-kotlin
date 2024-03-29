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

import org.openapitools.client.models.AppPermissions
import org.openapitools.client.models.SimpleUser

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param permissions 
 * @param repositorySelection Describe whether all repositories have been selected or there's a selection involved
 * @param singleFileName 
 * @param repositoriesUrl 
 * @param account 
 * @param hasMultipleSingleFiles 
 * @param singleFilePaths 
 */
@Serializable

data class ScopedInstallation (

    @SerialName(value = "permissions")
    val permissions: AppPermissions,

    /* Describe whether all repositories have been selected or there's a selection involved */
    @SerialName(value = "repository_selection")
    val repositorySelection: ScopedInstallation.RepositorySelection,

    @SerialName(value = "single_file_name")
    val singleFileName: kotlin.String?,

    @Contextual @SerialName(value = "repositories_url")
    val repositoriesUrl: java.net.URI,

    @SerialName(value = "account")
    val account: SimpleUser,

    @SerialName(value = "has_multiple_single_files")
    val hasMultipleSingleFiles: kotlin.Boolean? = null,

    @SerialName(value = "single_file_paths")
    val singleFilePaths: kotlin.collections.List<kotlin.String>? = null

) {

    /**
     * Describe whether all repositories have been selected or there's a selection involved
     *
     * Values: all,selected
     */
    @Serializable
    enum class RepositorySelection(val value: kotlin.String) {
        @SerialName(value = "all") all("all"),
        @SerialName(value = "selected") selected("selected");
    }
}

