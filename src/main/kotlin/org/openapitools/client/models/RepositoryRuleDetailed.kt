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

import org.openapitools.client.models.RepositoryRuleDetailedOneOf
import org.openapitools.client.models.RepositoryRuleDetailedOneOf1
import org.openapitools.client.models.RepositoryRuleDetailedOneOf10
import org.openapitools.client.models.RepositoryRuleDetailedOneOf11
import org.openapitools.client.models.RepositoryRuleDetailedOneOf12
import org.openapitools.client.models.RepositoryRuleDetailedOneOf13
import org.openapitools.client.models.RepositoryRuleDetailedOneOf14
import org.openapitools.client.models.RepositoryRuleDetailedOneOf2
import org.openapitools.client.models.RepositoryRuleDetailedOneOf3
import org.openapitools.client.models.RepositoryRuleDetailedOneOf4
import org.openapitools.client.models.RepositoryRuleDetailedOneOf5
import org.openapitools.client.models.RepositoryRuleDetailedOneOf6
import org.openapitools.client.models.RepositoryRuleDetailedOneOf7
import org.openapitools.client.models.RepositoryRuleDetailedOneOf8
import org.openapitools.client.models.RepositoryRuleDetailedOneOf9
import org.openapitools.client.models.RepositoryRuleWorkflowsParameters

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A repository rule with ruleset details.
 *
 * @param type 
 * @param rulesetSourceType The type of source for the ruleset that includes this rule.
 * @param rulesetSource The name of the source of the ruleset that includes this rule.
 * @param rulesetId The ID of the ruleset that includes this rule.
 * @param parameters 
 */
@Serializable

data class RepositoryRuleDetailed (

    @SerialName(value = "type")
    val type: RepositoryRuleDetailed.Type?,

    /* The type of source for the ruleset that includes this rule. */
    @SerialName(value = "ruleset_source_type")
    val rulesetSourceType: RepositoryRuleDetailed.RulesetSourceType? = null,

    /* The name of the source of the ruleset that includes this rule. */
    @Contextual @SerialName(value = "ruleset_source")
    val rulesetSource: kotlin.Any? = null,

    /* The ID of the ruleset that includes this rule. */
    @Contextual @SerialName(value = "ruleset_id")
    val rulesetId: kotlin.Any? = null,

    @SerialName(value = "parameters")
    val parameters: RepositoryRuleWorkflowsParameters? = null

) {

    /**
     * 
     *
     * Values: creation,update,deletion,required_linear_history,required_deployments,required_signatures,pull_request,required_status_checks,non_fast_forward,commit_message_pattern,commit_author_email_pattern,committer_email_pattern,branch_name_pattern,tag_name_pattern,workflows
     */
    @Serializable
    enum class Type(val value: kotlin.Any) {
        @SerialName(value = "creation") creation("creation"),
        @SerialName(value = "update") update("update"),
        @SerialName(value = "deletion") deletion("deletion"),
        @SerialName(value = "required_linear_history") required_linear_history("required_linear_history"),
        @SerialName(value = "required_deployments") required_deployments("required_deployments"),
        @SerialName(value = "required_signatures") required_signatures("required_signatures"),
        @SerialName(value = "pull_request") pull_request("pull_request"),
        @SerialName(value = "required_status_checks") required_status_checks("required_status_checks"),
        @SerialName(value = "non_fast_forward") non_fast_forward("non_fast_forward"),
        @SerialName(value = "commit_message_pattern") commit_message_pattern("commit_message_pattern"),
        @SerialName(value = "commit_author_email_pattern") commit_author_email_pattern("commit_author_email_pattern"),
        @SerialName(value = "committer_email_pattern") committer_email_pattern("committer_email_pattern"),
        @SerialName(value = "branch_name_pattern") branch_name_pattern("branch_name_pattern"),
        @SerialName(value = "tag_name_pattern") tag_name_pattern("tag_name_pattern"),
        @SerialName(value = "workflows") workflows("workflows");
    }
    /**
     * The type of source for the ruleset that includes this rule.
     *
     * Values: Repository,Organization
     */
    @Serializable
    enum class RulesetSourceType(val value: kotlin.Any) {
        @SerialName(value = "Repository") Repository("Repository"),
        @SerialName(value = "Organization") Organization("Organization");
    }
}
