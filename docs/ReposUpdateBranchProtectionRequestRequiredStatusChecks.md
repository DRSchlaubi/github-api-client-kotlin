
# ReposUpdateBranchProtectionRequestRequiredStatusChecks

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**strict** | **kotlin.Boolean** | Require branches to be up to date before merging. | 
**contexts** | **kotlin.collections.List&lt;kotlin.String&gt;** | **Deprecated**: The list of status checks to require in order to merge into this branch. If any of these checks have recently been set by a particular GitHub App, they will be required to come from that app in future for the branch to merge. Use &#x60;checks&#x60; instead of &#x60;contexts&#x60; for more fine-grained control.  | 
**checks** | [**kotlin.collections.List&lt;ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner&gt;**](ReposUpdateBranchProtectionRequestRequiredStatusChecksChecksInner.md) | The list of status checks to require in order to merge into this branch. |  [optional]



