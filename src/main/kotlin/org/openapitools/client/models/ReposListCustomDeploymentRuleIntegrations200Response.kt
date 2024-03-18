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

import org.openapitools.client.models.CustomDeploymentRuleApp

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param totalCount The total number of custom deployment protection rule integrations available for this environment.
 * @param availableCustomDeploymentProtectionRuleIntegrations 
 */
@Serializable

data class ReposListCustomDeploymentRuleIntegrations200Response (

    /* The total number of custom deployment protection rule integrations available for this environment. */
    @SerialName(value = "total_count")
    val totalCount: kotlin.Int? = null,

    @SerialName(value = "available_custom_deployment_protection_rule_integrations")
    val availableCustomDeploymentProtectionRuleIntegrations: kotlin.collections.List<CustomDeploymentRuleApp>? = null

)
