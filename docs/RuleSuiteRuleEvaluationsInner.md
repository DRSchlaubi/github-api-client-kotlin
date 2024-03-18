
# RuleSuiteRuleEvaluationsInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleSource** | [**RuleSuiteRuleEvaluationsInnerRuleSource**](RuleSuiteRuleEvaluationsInnerRuleSource.md) |  |  [optional]
**enforcement** | [**inline**](#Enforcement) | The enforcement level of this rule source. |  [optional]
**result** | [**inline**](#Result) | The result of the evaluation of the individual rule. |  [optional]
**ruleType** | **kotlin.String** | The type of rule. |  [optional]
**details** | **kotlin.String** | Any associated details with the rule evaluation. |  [optional]


<a id="Enforcement"></a>
## Enum: enforcement
Name | Value
---- | -----
enforcement | active, evaluate, deleted ruleset


<a id="Result"></a>
## Enum: result
Name | Value
---- | -----
result | pass, fail



