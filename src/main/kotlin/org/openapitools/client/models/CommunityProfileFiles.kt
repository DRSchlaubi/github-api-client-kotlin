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

import org.openapitools.client.models.CommunityProfileFilesCodeOfConduct
import org.openapitools.client.models.CommunityProfileFilesCodeOfConductFile
import org.openapitools.client.models.RepositoryLicense

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param codeOfConduct 
 * @param codeOfConductFile 
 * @param license 
 * @param contributing 
 * @param readme 
 * @param issueTemplate 
 * @param pullRequestTemplate 
 */
@Serializable

data class CommunityProfileFiles (

    @SerialName(value = "code_of_conduct")
    val codeOfConduct: CommunityProfileFilesCodeOfConduct,

    @SerialName(value = "code_of_conduct_file")
    val codeOfConductFile: CommunityProfileFilesCodeOfConductFile,

    @SerialName(value = "license")
    val license: RepositoryLicense,

    @SerialName(value = "contributing")
    val contributing: CommunityProfileFilesCodeOfConductFile,

    @SerialName(value = "readme")
    val readme: CommunityProfileFilesCodeOfConductFile,

    @SerialName(value = "issue_template")
    val issueTemplate: CommunityProfileFilesCodeOfConductFile,

    @SerialName(value = "pull_request_template")
    val pullRequestTemplate: CommunityProfileFilesCodeOfConductFile

)

