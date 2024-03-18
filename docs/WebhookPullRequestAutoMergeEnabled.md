
# WebhookPullRequestAutoMergeEnabled

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**inline**](#Action) |  | 
**number** | **kotlin.Int** |  | 
**pullRequest** | [**PullRequest2**](PullRequest2.md) |  | 
**repository** | [**RepositoryWebhooks**](RepositoryWebhooks.md) |  | 
**sender** | [**SimpleUserWebhooks**](SimpleUserWebhooks.md) |  | 
**enterprise** | [**EnterpriseWebhooks**](EnterpriseWebhooks.md) |  |  [optional]
**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional]
**organization** | [**OrganizationSimpleWebhooks**](OrganizationSimpleWebhooks.md) |  |  [optional]
**reason** | **kotlin.String** |  |  [optional]


<a id="Action"></a>
## Enum: action
Name | Value
---- | -----
action | auto_merge_enabled



