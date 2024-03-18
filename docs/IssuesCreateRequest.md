
# IssuesCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | [**IssuesCreateRequestTitle**](IssuesCreateRequestTitle.md) |  | 
**body** | **kotlin.String** | The contents of the issue. |  [optional]
**assignee** | **kotlin.String** | Login for the user that this issue should be assigned to. _NOTE: Only users with push access can set the assignee for new issues. The assignee is silently dropped otherwise. **This field is deprecated.**_ |  [optional]
**milestone** | [**IssuesCreateRequestMilestone**](IssuesCreateRequestMilestone.md) |  |  [optional]
**labels** | [**kotlin.collections.List&lt;IssuesCreateRequestLabelsInner&gt;**](IssuesCreateRequestLabelsInner.md) | Labels to associate with this issue. _NOTE: Only users with push access can set labels for new issues. Labels are silently dropped otherwise._ |  [optional]
**assignees** | **kotlin.collections.List&lt;kotlin.String&gt;** | Logins for Users to assign to this issue. _NOTE: Only users with push access can set assignees for new issues. Assignees are silently dropped otherwise._ |  [optional]



