
# IssuesUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | [**IssuesCreateRequestTitle**](IssuesCreateRequestTitle.md) |  |  [optional]
**body** | **kotlin.String** | The contents of the issue. |  [optional]
**assignee** | **kotlin.String** | Username to assign to this issue. **This field is deprecated.** |  [optional]
**state** | [**inline**](#State) | The open or closed state of the issue. |  [optional]
**stateReason** | [**inline**](#StateReason) | The reason for the state change. Ignored unless &#x60;state&#x60; is changed. |  [optional]
**milestone** | [**IssuesUpdateRequestMilestone**](IssuesUpdateRequestMilestone.md) |  |  [optional]
**labels** | [**kotlin.collections.List&lt;IssuesCreateRequestLabelsInner&gt;**](IssuesCreateRequestLabelsInner.md) | Labels to associate with this issue. Pass one or more labels to _replace_ the set of labels on this issue. Send an empty array (&#x60;[]&#x60;) to clear all labels from the issue. Only users with push access can set labels for issues. Without push access to the repository, label changes are silently dropped. |  [optional]
**assignees** | **kotlin.collections.List&lt;kotlin.String&gt;** | Usernames to assign to this issue. Pass one or more user logins to _replace_ the set of assignees on this issue. Send an empty array (&#x60;[]&#x60;) to clear all assignees from the issue. Only users with push access can set assignees for new issues. Without push access to the repository, assignee changes are silently dropped. |  [optional]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | open, closed


<a id="StateReason"></a>
## Enum: state_reason
Name | Value
---- | -----
stateReason | completed, not_planned, reopened, 



