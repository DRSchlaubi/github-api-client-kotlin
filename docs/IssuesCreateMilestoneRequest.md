
# IssuesCreateMilestoneRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **kotlin.String** | The title of the milestone. | 
**state** | [**inline**](#State) | The state of the milestone. Either &#x60;open&#x60; or &#x60;closed&#x60;. |  [optional]
**description** | **kotlin.String** | A description of the milestone. |  [optional]
**dueOn** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [optional]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | open, closed



