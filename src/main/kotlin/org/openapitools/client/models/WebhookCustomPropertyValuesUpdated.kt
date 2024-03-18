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

import org.openapitools.client.models.CustomPropertyValue
import org.openapitools.client.models.EnterpriseWebhooks
import org.openapitools.client.models.OrganizationSimpleWebhooks
import org.openapitools.client.models.RepositoryWebhooks
import org.openapitools.client.models.SimpleInstallation
import org.openapitools.client.models.SimpleUserWebhooks

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param action 
 * @param repository 
 * @param organization 
 * @param newPropertyValues The new custom property values for the repository.
 * @param oldPropertyValues The old custom property values for the repository.
 * @param enterprise 
 * @param installation 
 * @param sender 
 */
@Serializable

data class WebhookCustomPropertyValuesUpdated (

    @SerialName(value = "action")
    val action: WebhookCustomPropertyValuesUpdated.Action,

    @SerialName(value = "repository")
    val repository: RepositoryWebhooks,

    @SerialName(value = "organization")
    val organization: OrganizationSimpleWebhooks,

    /* The new custom property values for the repository. */
    @SerialName(value = "new_property_values")
    val newPropertyValues: kotlin.collections.List<CustomPropertyValue>,

    /* The old custom property values for the repository. */
    @SerialName(value = "old_property_values")
    val oldPropertyValues: kotlin.collections.List<CustomPropertyValue>,

    @SerialName(value = "enterprise")
    val enterprise: EnterpriseWebhooks? = null,

    @SerialName(value = "installation")
    val installation: SimpleInstallation? = null,

    @SerialName(value = "sender")
    val sender: SimpleUserWebhooks? = null

) {

    /**
     * 
     *
     * Values: updated
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "updated") updated("updated");
    }
}
