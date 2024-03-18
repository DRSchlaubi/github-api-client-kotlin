
# RepositoryRulesetConditionsRepositoryNameTargetRepositoryName

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**include** | **kotlin.collections.List&lt;kotlin.String&gt;** | Array of repository names or patterns to include. One of these patterns must match for the condition to pass. Also accepts &#x60;~ALL&#x60; to include all repositories. |  [optional]
**exclude** | **kotlin.collections.List&lt;kotlin.String&gt;** | Array of repository names or patterns to exclude. The condition will not pass if any of these patterns match. |  [optional]
**&#x60;protected&#x60;** | **kotlin.Boolean** | Whether renaming of target repositories is prevented. |  [optional]



