
# RepositoryRuleset

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | The ID of the ruleset | 
**name** | **kotlin.String** | The name of the ruleset | 
**source** | **kotlin.String** | The name of the source | 
**enforcement** | [**RepositoryRuleEnforcement**](RepositoryRuleEnforcement.md) |  | 
**target** | [**inline**](#Target) | The target of the ruleset |  [optional]
**sourceType** | [**inline**](#SourceType) | The type of the source of the ruleset |  [optional]
**bypassActors** | [**kotlin.collections.List&lt;RepositoryRulesetBypassActor&gt;**](RepositoryRulesetBypassActor.md) | The actors that can bypass the rules in this ruleset |  [optional]
**currentUserCanBypass** | [**inline**](#CurrentUserCanBypass) | The bypass type of the user making the API request for this ruleset. This field is only returned when querying the repository-level endpoint. |  [optional]
**nodeId** | **kotlin.String** |  |  [optional]
**links** | [**RepositoryRulesetLinks**](RepositoryRulesetLinks.md) |  |  [optional]
**conditions** | [**RepositoryRulesetConditions**](RepositoryRulesetConditions.md) |  |  [optional]
**rules** | [**kotlin.collections.List&lt;RepositoryRule&gt;**](RepositoryRule.md) |  |  [optional]
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional]
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional]


<a id="Target"></a>
## Enum: target
Name | Value
---- | -----
target | branch, tag


<a id="SourceType"></a>
## Enum: source_type
Name | Value
---- | -----
sourceType | Repository, Organization


<a id="CurrentUserCanBypass"></a>
## Enum: current_user_can_bypass
Name | Value
---- | -----
currentUserCanBypass | always, pull_requests_only, never



