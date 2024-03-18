
# ReposCreateOrgRulesetRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the ruleset. | 
**enforcement** | [**RepositoryRuleEnforcement**](RepositoryRuleEnforcement.md) |  | 
**target** | [**inline**](#Target) | The target of the ruleset. |  [optional]
**bypassActors** | [**kotlin.collections.List&lt;RepositoryRulesetBypassActor&gt;**](RepositoryRulesetBypassActor.md) | The actors that can bypass the rules in this ruleset |  [optional]
**conditions** | [**OrgRulesetConditions**](OrgRulesetConditions.md) |  |  [optional]
**rules** | [**kotlin.collections.List&lt;RepositoryRule&gt;**](RepositoryRule.md) | An array of rules within the ruleset. |  [optional]


<a id="Target"></a>
## Enum: target
Name | Value
---- | -----
target | branch, tag



