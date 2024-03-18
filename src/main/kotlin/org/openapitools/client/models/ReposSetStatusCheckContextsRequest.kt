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

import org.openapitools.client.models.ReposSetStatusCheckContextsRequestOneOf

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param contexts The name of the status checks
 */
@Serializable

data class ReposSetStatusCheckContextsRequest (

    /* The name of the status checks */
    @Contextual @SerialName(value = "contexts")
    val contexts: kotlin.Any?

)
