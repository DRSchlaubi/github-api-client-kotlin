
# RuleSuite

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | The unique identifier of the rule insight. |  [optional]
**actorId** | **kotlin.Int** | The number that identifies the user. |  [optional]
**actorName** | **kotlin.String** | The handle for the GitHub user account. |  [optional]
**beforeSha** | **kotlin.String** | The first commit sha before the push evaluation. |  [optional]
**afterSha** | **kotlin.String** | The last commit sha in the push evaluation. |  [optional]
**ref** | **kotlin.String** | The ref name that the evaluation ran on. |  [optional]
**repositoryId** | **kotlin.Int** | The ID of the repository associated with the rule evaluation. |  [optional]
**repositoryName** | **kotlin.String** | The name of the repository without the &#x60;.git&#x60; extension. |  [optional]
**pushedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional]
**result** | [**inline**](#Result) | The result of the rule evaluations for rules with the &#x60;active&#x60; enforcement status. |  [optional]
**evaluationResult** | [**inline**](#EvaluationResult) | The result of the rule evaluations for rules with the &#x60;active&#x60; and &#x60;evaluate&#x60; enforcement statuses, demonstrating whether rules would pass or fail if all rules in the rule suite were &#x60;active&#x60;. |  [optional]
**ruleEvaluations** | [**kotlin.collections.List&lt;RuleSuiteRuleEvaluationsInner&gt;**](RuleSuiteRuleEvaluationsInner.md) | Details on the evaluated rules. |  [optional]


<a id="Result"></a>
## Enum: result
Name | Value
---- | -----
result | pass, fail, bypass


<a id="EvaluationResult"></a>
## Enum: evaluation_result
Name | Value
---- | -----
evaluationResult | pass, fail



