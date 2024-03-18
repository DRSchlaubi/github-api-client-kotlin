
# WebhookPullRequestMilestoned

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**inline**](#Action) |  | 
**number** | **kotlin.Int** | The pull request number. | 
**pullRequest** | [**PullRequest3**](PullRequest3.md) |  | 
**repository** | [**RepositoryWebhooks**](RepositoryWebhooks.md) |  | 
**enterprise** | [**EnterpriseWebhooks**](EnterpriseWebhooks.md) |  |  [optional]
**milestone** | [**Milestone**](Milestone.md) |  |  [optional]
**organization** | [**OrganizationSimpleWebhooks**](OrganizationSimpleWebhooks.md) |  |  [optional]
**sender** | [**SimpleUserWebhooks**](SimpleUserWebhooks.md) |  |  [optional]


<a id="Action"></a>
## Enum: action
Name | Value
---- | -----
action | milestoned



