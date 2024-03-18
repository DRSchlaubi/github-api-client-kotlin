
# BranchProtectionRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adminEnforced** | **kotlin.Boolean** |  | 
**allowDeletionsEnforcementLevel** | [**inline**](#AllowDeletionsEnforcementLevel) |  | 
**allowForcePushesEnforcementLevel** | [**inline**](#AllowForcePushesEnforcementLevel) |  | 
**authorizedActorNames** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**authorizedActorsOnly** | **kotlin.Boolean** |  | 
**authorizedDismissalActorsOnly** | **kotlin.Boolean** |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**dismissStaleReviewsOnPush** | **kotlin.Boolean** |  | 
**id** | **kotlin.Int** |  | 
**ignoreApprovalsFromContributors** | **kotlin.Boolean** |  | 
**linearHistoryRequirementEnforcementLevel** | [**inline**](#LinearHistoryRequirementEnforcementLevel) |  | 
**mergeQueueEnforcementLevel** | [**inline**](#MergeQueueEnforcementLevel) |  | 
**name** | **kotlin.String** |  | 
**pullRequestReviewsEnforcementLevel** | [**inline**](#PullRequestReviewsEnforcementLevel) |  | 
**repositoryId** | **kotlin.Int** |  | 
**requireCodeOwnerReview** | **kotlin.Boolean** |  | 
**requiredApprovingReviewCount** | **kotlin.Int** |  | 
**requiredConversationResolutionLevel** | [**inline**](#RequiredConversationResolutionLevel) |  | 
**requiredDeploymentsEnforcementLevel** | [**inline**](#RequiredDeploymentsEnforcementLevel) |  | 
**requiredStatusChecks** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**requiredStatusChecksEnforcementLevel** | [**inline**](#RequiredStatusChecksEnforcementLevel) |  | 
**signatureRequirementEnforcementLevel** | [**inline**](#SignatureRequirementEnforcementLevel) |  | 
**strictRequiredStatusChecksPolicy** | **kotlin.Boolean** |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**createProtected** | **kotlin.Boolean** |  |  [optional]
**requireLastPushApproval** | **kotlin.Boolean** | Whether the most recent push must be approved by someone other than the person who pushed it |  [optional]


<a id="AllowDeletionsEnforcementLevel"></a>
## Enum: allow_deletions_enforcement_level
Name | Value
---- | -----
allowDeletionsEnforcementLevel | off, non_admins, everyone


<a id="AllowForcePushesEnforcementLevel"></a>
## Enum: allow_force_pushes_enforcement_level
Name | Value
---- | -----
allowForcePushesEnforcementLevel | off, non_admins, everyone


<a id="LinearHistoryRequirementEnforcementLevel"></a>
## Enum: linear_history_requirement_enforcement_level
Name | Value
---- | -----
linearHistoryRequirementEnforcementLevel | off, non_admins, everyone


<a id="MergeQueueEnforcementLevel"></a>
## Enum: merge_queue_enforcement_level
Name | Value
---- | -----
mergeQueueEnforcementLevel | off, non_admins, everyone


<a id="PullRequestReviewsEnforcementLevel"></a>
## Enum: pull_request_reviews_enforcement_level
Name | Value
---- | -----
pullRequestReviewsEnforcementLevel | off, non_admins, everyone


<a id="RequiredConversationResolutionLevel"></a>
## Enum: required_conversation_resolution_level
Name | Value
---- | -----
requiredConversationResolutionLevel | off, non_admins, everyone


<a id="RequiredDeploymentsEnforcementLevel"></a>
## Enum: required_deployments_enforcement_level
Name | Value
---- | -----
requiredDeploymentsEnforcementLevel | off, non_admins, everyone


<a id="RequiredStatusChecksEnforcementLevel"></a>
## Enum: required_status_checks_enforcement_level
Name | Value
---- | -----
requiredStatusChecksEnforcementLevel | off, non_admins, everyone


<a id="SignatureRequirementEnforcementLevel"></a>
## Enum: signature_requirement_enforcement_level
Name | Value
---- | -----
signatureRequirementEnforcementLevel | off, non_admins, everyone



