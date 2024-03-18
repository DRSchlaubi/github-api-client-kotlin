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

import org.openapitools.client.models.IntegrationOwner
import org.openapitools.client.models.OrgMembershipPermissions
import org.openapitools.client.models.OrganizationSimple

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Org Membership
 *
 * @param url 
 * @param state The state of the member in the organization. The `pending` state indicates the user has not yet accepted an invitation.
 * @param role The user's membership type in the organization.
 * @param organizationUrl 
 * @param organization 
 * @param user 
 * @param permissions 
 */
@Serializable

data class OrgMembership (

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    /* The state of the member in the organization. The `pending` state indicates the user has not yet accepted an invitation. */
    @SerialName(value = "state")
    val state: OrgMembership.State,

    /* The user's membership type in the organization. */
    @SerialName(value = "role")
    val role: OrgMembership.Role,

    @Contextual @SerialName(value = "organization_url")
    val organizationUrl: java.net.URI,

    @SerialName(value = "organization")
    val organization: OrganizationSimple,

    @SerialName(value = "user")
    val user: IntegrationOwner,

    @SerialName(value = "permissions")
    val permissions: OrgMembershipPermissions? = null

) {

    /**
     * The state of the member in the organization. The `pending` state indicates the user has not yet accepted an invitation.
     *
     * Values: active,pending
     */
    @Serializable
    enum class State(val value: kotlin.String) {
        @SerialName(value = "active") active("active"),
        @SerialName(value = "pending") pending("pending");
    }
    /**
     * The user's membership type in the organization.
     *
     * Values: admin,member,billing_manager
     */
    @Serializable
    enum class Role(val value: kotlin.String) {
        @SerialName(value = "admin") admin("admin"),
        @SerialName(value = "member") member("member"),
        @SerialName(value = "billing_manager") billing_manager("billing_manager");
    }
}
