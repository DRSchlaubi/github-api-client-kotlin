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
 * @param position The position of the card in a column. Can be one of: `top`, `bottom`, or `after:<card_id>` to place after the specified card.
 * @param columnId The unique identifier of the column the card should be moved to
 */
@Serializable

data class ProjectsMoveCardRequest (

    /* The position of the card in a column. Can be one of: `top`, `bottom`, or `after:<card_id>` to place after the specified card. */
    @SerialName(value = "position")
    val position: kotlin.String,

    /* The unique identifier of the column the card should be moved to */
    @SerialName(value = "column_id")
    val columnId: kotlin.Int? = null

)

