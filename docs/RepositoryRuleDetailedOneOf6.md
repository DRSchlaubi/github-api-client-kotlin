
# RepositoryRuleDetailedOneOf6

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) |  | 
**parameters** | [**RepositoryRulePullRequestParameters**](RepositoryRulePullRequestParameters.md) |  |  [optional]
**rulesetSourceType** | [**inline**](#RulesetSourceType) | The type of source for the ruleset that includes this rule. |  [optional]
**rulesetSource** | [**kotlin.Any**](.md) | The name of the source of the ruleset that includes this rule. |  [optional]
**rulesetId** | [**kotlin.Any**](.md) | The ID of the ruleset that includes this rule. |  [optional]


<a id="Type"></a>
## Enum: type
Name | Value
---- | -----
type | pull_request


<a id="RulesetSourceType"></a>
## Enum: ruleset_source_type
Name | Value
---- | -----
rulesetSourceType | Repository, Organization



