
# Activity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** |  | 
**nodeId** | **kotlin.String** |  | 
**before** | **kotlin.String** | The SHA of the commit before the activity. | 
**after** | **kotlin.String** | The SHA of the commit after the activity. | 
**ref** | **kotlin.String** | The full Git reference, formatted as &#x60;refs/heads/&lt;branch name&gt;&#x60;. | 
**timestamp** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time when the activity occurred. | 
**activityType** | [**inline**](#ActivityType) | The type of the activity that was performed. | 
**actor** | [**IntegrationOwner**](IntegrationOwner.md) |  | 


<a id="ActivityType"></a>
## Enum: activity_type
Name | Value
---- | -----
activityType | push, force_push, branch_deletion, branch_creation, pr_merge, merge_queue_merge



