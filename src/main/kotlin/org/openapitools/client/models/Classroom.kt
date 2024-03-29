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

import org.openapitools.client.models.SimpleClassroomOrganization

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A GitHub Classroom classroom
 *
 * @param id Unique identifier of the classroom.
 * @param name The name of the classroom.
 * @param archived Whether classroom is archived.
 * @param organization 
 * @param url The URL of the classroom on GitHub Classroom.
 */
@Serializable

data class Classroom (

    /* Unique identifier of the classroom. */
    @SerialName(value = "id")
    val id: kotlin.Int,

    /* The name of the classroom. */
    @SerialName(value = "name")
    val name: kotlin.String,

    /* Whether classroom is archived. */
    @SerialName(value = "archived")
    val archived: kotlin.Boolean,

    @SerialName(value = "organization")
    val organization: SimpleClassroomOrganization,

    /* The URL of the classroom on GitHub Classroom. */
    @SerialName(value = "url")
    val url: kotlin.String

)

