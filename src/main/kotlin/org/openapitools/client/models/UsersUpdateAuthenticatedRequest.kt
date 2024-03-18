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
 * @param name The new name of the user.
 * @param email The publicly visible email address of the user.
 * @param blog The new blog URL of the user.
 * @param twitterUsername The new Twitter username of the user.
 * @param company The new company of the user.
 * @param location The new location of the user.
 * @param hireable The new hiring availability of the user.
 * @param bio The new short biography of the user.
 */
@Serializable

data class UsersUpdateAuthenticatedRequest (

    /* The new name of the user. */
    @SerialName(value = "name")
    val name: kotlin.String? = null,

    /* The publicly visible email address of the user. */
    @SerialName(value = "email")
    val email: kotlin.String? = null,

    /* The new blog URL of the user. */
    @SerialName(value = "blog")
    val blog: kotlin.String? = null,

    /* The new Twitter username of the user. */
    @SerialName(value = "twitter_username")
    val twitterUsername: kotlin.String? = null,

    /* The new company of the user. */
    @SerialName(value = "company")
    val company: kotlin.String? = null,

    /* The new location of the user. */
    @SerialName(value = "location")
    val location: kotlin.String? = null,

    /* The new hiring availability of the user. */
    @SerialName(value = "hireable")
    val hireable: kotlin.Boolean? = null,

    /* The new short biography of the user. */
    @SerialName(value = "bio")
    val bio: kotlin.String? = null

)
