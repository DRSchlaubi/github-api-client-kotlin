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

import org.openapitools.client.models.WebhookBranchProtectionRuleEditedChangesAdminEnforced
import org.openapitools.client.models.WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames
import org.openapitools.client.models.WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * If the action was `edited`, the changes to the rule.
 *
 * @param adminEnforced 
 * @param authorizedActorNames 
 * @param authorizedActorsOnly 
 * @param authorizedDismissalActorsOnly 
 * @param linearHistoryRequirementEnforcementLevel 
 * @param requiredStatusChecks 
 * @param requiredStatusChecksEnforcementLevel 
 */
@Serializable

data class WebhookBranchProtectionRuleEditedChanges (

    @SerialName(value = "admin_enforced")
    val adminEnforced: WebhookBranchProtectionRuleEditedChangesAdminEnforced? = null,

    @SerialName(value = "authorized_actor_names")
    val authorizedActorNames: WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames? = null,

    @SerialName(value = "authorized_actors_only")
    val authorizedActorsOnly: WebhookBranchProtectionRuleEditedChangesAdminEnforced? = null,

    @SerialName(value = "authorized_dismissal_actors_only")
    val authorizedDismissalActorsOnly: WebhookBranchProtectionRuleEditedChangesAdminEnforced? = null,

    @SerialName(value = "linear_history_requirement_enforcement_level")
    val linearHistoryRequirementEnforcementLevel: WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel? = null,

    @SerialName(value = "required_status_checks")
    val requiredStatusChecks: WebhookBranchProtectionRuleEditedChangesAuthorizedActorNames? = null,

    @SerialName(value = "required_status_checks_enforcement_level")
    val requiredStatusChecksEnforcementLevel: WebhookBranchProtectionRuleEditedChangesLinearHistoryRequirementEnforcementLevel? = null

)
