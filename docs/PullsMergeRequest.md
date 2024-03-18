
# PullsMergeRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commitTitle** | **kotlin.String** | Title for the automatic commit message. |  [optional]
**commitMessage** | **kotlin.String** | Extra detail to append to automatic commit message. |  [optional]
**sha** | **kotlin.String** | SHA that pull request head must match to allow merge. |  [optional]
**mergeMethod** | [**inline**](#MergeMethod) | The merge method to use. |  [optional]


<a id="MergeMethod"></a>
## Enum: merge_method
Name | Value
---- | -----
mergeMethod | merge, squash, rebase



