
# SimpleCheckSuite

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**after** | **kotlin.String** |  |  [optional]
**app** | [**Integration**](Integration.md) |  |  [optional]
**before** | **kotlin.String** |  |  [optional]
**conclusion** | [**inline**](#Conclusion) |  |  [optional]
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional]
**headBranch** | **kotlin.String** |  |  [optional]
**headSha** | **kotlin.String** | The SHA of the head commit that is being checked. |  [optional]
**id** | **kotlin.Int** |  |  [optional]
**nodeId** | **kotlin.String** |  |  [optional]
**pullRequests** | [**kotlin.collections.List&lt;PullRequestMinimal&gt;**](PullRequestMinimal.md) |  |  [optional]
**repository** | [**MinimalRepository**](MinimalRepository.md) |  |  [optional]
**status** | [**inline**](#Status) |  |  [optional]
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional]
**url** | **kotlin.String** |  |  [optional]


<a id="Conclusion"></a>
## Enum: conclusion
Name | Value
---- | -----
conclusion | success, failure, neutral, cancelled, skipped, timed_out, action_required, stale, startup_failure, 


<a id="Status"></a>
## Enum: status
Name | Value
---- | -----
status | queued, in_progress, completed, pending, waiting



