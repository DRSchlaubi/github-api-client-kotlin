
# WebhookMergeGroupDestroyed

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**inline**](#Action) |  | 
**mergeGroup** | [**MergeGroup**](MergeGroup.md) |  | 
**reason** | [**inline**](#Reason) | Explains why the merge group is being destroyed. The group could have been merged, removed from the queue (dequeued), or invalidated by an earlier queue entry being dequeued (invalidated). |  [optional]
**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional]
**organization** | [**OrganizationSimpleWebhooks**](OrganizationSimpleWebhooks.md) |  |  [optional]
**repository** | [**RepositoryWebhooks**](RepositoryWebhooks.md) |  |  [optional]
**sender** | [**SimpleUserWebhooks**](SimpleUserWebhooks.md) |  |  [optional]


<a id="Action"></a>
## Enum: action
Name | Value
---- | -----
action | destroyed


<a id="Reason"></a>
## Enum: reason
Name | Value
---- | -----
reason | merged, invalidated, dequeued



