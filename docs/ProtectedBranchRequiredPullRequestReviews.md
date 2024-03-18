
# ProtectedBranchRequiredPullRequestReviews

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**dismissStaleReviews** | **kotlin.Boolean** |  |  [optional]
**requireCodeOwnerReviews** | **kotlin.Boolean** |  |  [optional]
**requiredApprovingReviewCount** | **kotlin.Int** |  |  [optional]
**requireLastPushApproval** | **kotlin.Boolean** | Whether the most recent push must be approved by someone other than the person who pushed it. |  [optional]
**dismissalRestrictions** | [**ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions**](ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions.md) |  |  [optional]
**bypassPullRequestAllowances** | [**ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances**](ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances.md) |  |  [optional]



