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
 * @param name Name of the project
 * @param body Body of the project
 * @param state State of the project; either 'open' or 'closed'
 * @param organizationPermission The baseline permission that all organization members have on this project
 * @param `private` Whether or not this project can be seen by everyone.
 */
@Serializable

data class ProjectsUpdateRequest (

    /* Name of the project */
    @SerialName(value = "name")
    val name: kotlin.String? = null,

    /* Body of the project */
    @SerialName(value = "body")
    val body: kotlin.String? = null,

    /* State of the project; either 'open' or 'closed' */
    @SerialName(value = "state")
    val state: kotlin.String? = null,

    /* The baseline permission that all organization members have on this project */
    @SerialName(value = "organization_permission")
    val organizationPermission: ProjectsUpdateRequest.OrganizationPermission? = null,

    /* Whether or not this project can be seen by everyone. */
    @SerialName(value = "private")
    val `private`: kotlin.Boolean? = null

) {

    /**
     * The baseline permission that all organization members have on this project
     *
     * Values: read,write,admin,none
     */
    @Serializable
    enum class OrganizationPermission(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write"),
        @SerialName(value = "admin") admin("admin"),
        @SerialName(value = "none") none("none");
    }
}
