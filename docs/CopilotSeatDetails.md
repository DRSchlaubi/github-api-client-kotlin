
# CopilotSeatDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignee** | [**CopilotSeatDetailsAssignee**](CopilotSeatDetailsAssignee.md) |  | 
**createdAt** | [**kotlin.Any**](.md) | Timestamp of when the assignee was last granted access to GitHub Copilot, in ISO 8601 format. | 
**assigningTeam** | [**CopilotSeatDetailsAssigningTeam**](CopilotSeatDetailsAssigningTeam.md) |  |  [optional]
**pendingCancellationDate** | [**kotlin.Any**](.md) | The pending cancellation date for the seat, in &#x60;YYYY-MM-DD&#x60; format. This will be null unless the assignee&#39;s Copilot access has been canceled during the current billing cycle. If the seat has been cancelled, this corresponds to the start of the organization&#39;s next billing cycle. |  [optional]
**lastActivityAt** | [**kotlin.Any**](.md) | Timestamp of user&#39;s last GitHub Copilot activity, in ISO 8601 format. |  [optional]
**lastActivityEditor** | [**kotlin.Any**](.md) | Last editor that was used by the user for a GitHub Copilot completion. |  [optional]
**updatedAt** | [**kotlin.Any**](.md) | Timestamp of when the assignee&#39;s GitHub Copilot access was last updated, in ISO 8601 format. |  [optional]



