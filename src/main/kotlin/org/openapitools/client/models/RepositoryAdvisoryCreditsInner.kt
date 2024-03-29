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

import org.openapitools.client.models.SecurityAdvisoryCreditTypes

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param login The username of the user credited.
 * @param type 
 */
@Serializable

data class RepositoryAdvisoryCreditsInner (

    /* The username of the user credited. */
    @SerialName(value = "login")
    val login: kotlin.String? = null,

    @Contextual @SerialName(value = "type")
    val type: SecurityAdvisoryCreditTypes? = null

)

