
# PullsUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **kotlin.String** | The title of the pull request. |  [optional]
**body** | **kotlin.String** | The contents of the pull request. |  [optional]
**state** | [**inline**](#State) | State of this Pull Request. Either &#x60;open&#x60; or &#x60;closed&#x60;. |  [optional]
**base** | **kotlin.String** | The name of the branch you want your changes pulled into. This should be an existing branch on the current repository. You cannot update the base branch on a pull request to point to another repository. |  [optional]
**maintainerCanModify** | **kotlin.Boolean** | Indicates whether [maintainers can modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull request. |  [optional]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | open, closed



