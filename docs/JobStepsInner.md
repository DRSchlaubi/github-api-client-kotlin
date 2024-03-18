
# JobStepsInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**inline**](#Status) | The phase of the lifecycle that the job is currently in. | 
**conclusion** | **kotlin.String** | The outcome of the job. | 
**name** | **kotlin.String** | The name of the job. | 
**number** | **kotlin.Int** |  | 
**startedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the step started, in ISO 8601 format. |  [optional]
**completedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the job finished, in ISO 8601 format. |  [optional]


<a id="Status"></a>
## Enum: status
Name | Value
---- | -----
status | queued, in_progress, completed



