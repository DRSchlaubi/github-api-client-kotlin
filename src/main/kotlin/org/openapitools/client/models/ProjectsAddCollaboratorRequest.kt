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
 * @param permission The permission to grant the collaborator.
 */
@Serializable

data class ProjectsAddCollaboratorRequest (

    /* The permission to grant the collaborator. */
    @SerialName(value = "permission")
    val permission: ProjectsAddCollaboratorRequest.Permission? = Permission.write

) {

    /**
     * The permission to grant the collaborator.
     *
     * Values: read,write,admin
     */
    @Serializable
    enum class Permission(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write"),
        @SerialName(value = "admin") admin("admin");
    }
}

