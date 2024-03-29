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

import org.openapitools.client.models.OrgRulesetConditions
import org.openapitools.client.models.RepositoryRule
import org.openapitools.client.models.RepositoryRuleEnforcement
import org.openapitools.client.models.RepositoryRulesetBypassActor

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param name The name of the ruleset.
 * @param enforcement 
 * @param target The target of the ruleset.
 * @param bypassActors The actors that can bypass the rules in this ruleset
 * @param conditions 
 * @param rules An array of rules within the ruleset.
 */
@Serializable

data class ReposCreateOrgRulesetRequest (

    /* The name of the ruleset. */
    @SerialName(value = "name")
    val name: kotlin.String,

    @Contextual @SerialName(value = "enforcement")
    val enforcement: RepositoryRuleEnforcement,

    /* The target of the ruleset. */
    @SerialName(value = "target")
    val target: ReposCreateOrgRulesetRequest.Target? = null,

    /* The actors that can bypass the rules in this ruleset */
    @SerialName(value = "bypass_actors")
    val bypassActors: kotlin.collections.List<RepositoryRulesetBypassActor>? = null,

    @SerialName(value = "conditions")
    val conditions: OrgRulesetConditions? = null,

    /* An array of rules within the ruleset. */
    @SerialName(value = "rules")
    val rules: kotlin.collections.List<RepositoryRule>? = null

) {

    /**
     * The target of the ruleset.
     *
     * Values: branch,tag
     */
    @Serializable
    enum class Target(val value: kotlin.String) {
        @SerialName(value = "branch") branch("branch"),
        @SerialName(value = "tag") tag("tag");
    }
}

