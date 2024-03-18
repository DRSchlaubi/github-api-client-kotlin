
# WebhookPullRequestReviewRequestRemovedOneOf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**inline**](#Action) |  | 
**number** | **kotlin.Int** | The pull request number. | 
**pullRequest** | [**PullRequest7**](PullRequest7.md) |  | 
**repository** | [**RepositoryWebhooks**](RepositoryWebhooks.md) |  | 
**requestedReviewer** | [**User**](User.md) |  | 
**sender** | [**SimpleUserWebhooks**](SimpleUserWebhooks.md) |  | 
**enterprise** | [**EnterpriseWebhooks**](EnterpriseWebhooks.md) |  |  [optional]
**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional]
**organization** | [**OrganizationSimpleWebhooks**](OrganizationSimpleWebhooks.md) |  |  [optional]


<a id="Action"></a>
## Enum: action
Name | Value
---- | -----
action | review_request_removed



