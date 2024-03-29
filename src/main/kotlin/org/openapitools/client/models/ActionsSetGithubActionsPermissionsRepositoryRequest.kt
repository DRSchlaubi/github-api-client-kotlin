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

import org.openapitools.client.models.AllowedActions

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param enabled Whether GitHub Actions is enabled on the repository.
 * @param allowedActions 
 */
@Serializable

data class ActionsSetGithubActionsPermissionsRepositoryRequest (

    /* Whether GitHub Actions is enabled on the repository. */
    @SerialName(value = "enabled")
    val enabled: kotlin.Boolean,

    @Contextual @SerialName(value = "allowed_actions")
    val allowedActions: AllowedActions? = null

)

