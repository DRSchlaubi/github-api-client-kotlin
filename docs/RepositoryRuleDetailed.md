
# RepositoryRuleDetailed

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) |  | 
**rulesetSourceType** | [**inline**](#RulesetSourceType) | The type of source for the ruleset that includes this rule. |  [optional]
**rulesetSource** | [**kotlin.Any**](.md) | The name of the source of the ruleset that includes this rule. |  [optional]
**rulesetId** | [**kotlin.Any**](.md) | The ID of the ruleset that includes this rule. |  [optional]
**parameters** | [**RepositoryRuleWorkflowsParameters**](RepositoryRuleWorkflowsParameters.md) |  |  [optional]


<a id="Type"></a>
## Enum: type
Name | Value
---- | -----
type | creation, update, deletion, required_linear_history, required_deployments, required_signatures, pull_request, required_status_checks, non_fast_forward, commit_message_pattern, commit_author_email_pattern, committer_email_pattern, branch_name_pattern, tag_name_pattern, workflows


<a id="RulesetSourceType"></a>
## Enum: ruleset_source_type
Name | Value
---- | -----
rulesetSourceType | Repository, Organization



