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
 * @param newName The new name of the label. Emoji can be added to label names, using either native emoji or colon-style markup. For example, typing `:strawberry:` will render the emoji ![:strawberry:](https://github.githubassets.com/images/icons/emoji/unicode/1f353.png \":strawberry:\"). For a full list of available emoji and codes, see \"[Emoji cheat sheet](https://github.com/ikatyang/emoji-cheat-sheet).\"
 * @param color The [hexadecimal color code](http://www.color-hex.com/) for the label, without the leading `#`.
 * @param description A short description of the label. Must be 100 characters or fewer.
 */
@Serializable

data class IssuesUpdateLabelRequest (

    /* The new name of the label. Emoji can be added to label names, using either native emoji or colon-style markup. For example, typing `:strawberry:` will render the emoji ![:strawberry:](https://github.githubassets.com/images/icons/emoji/unicode/1f353.png \":strawberry:\"). For a full list of available emoji and codes, see \"[Emoji cheat sheet](https://github.com/ikatyang/emoji-cheat-sheet).\" */
    @SerialName(value = "new_name")
    val newName: kotlin.String? = null,

    /* The [hexadecimal color code](http://www.color-hex.com/) for the label, without the leading `#`. */
    @SerialName(value = "color")
    val color: kotlin.String? = null,

    /* A short description of the label. Must be 100 characters or fewer. */
    @SerialName(value = "description")
    val description: kotlin.String? = null

)

