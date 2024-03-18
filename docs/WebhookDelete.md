
# WebhookDelete

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pusherType** | **kotlin.String** | The pusher type for the event. Can be either &#x60;user&#x60; or a deploy key. | 
**ref** | **kotlin.String** | The [&#x60;git ref&#x60;](https://docs.github.com/rest/git/refs#get-a-reference) resource. | 
**refType** | [**inline**](#RefType) | The type of Git ref object deleted in the repository. | 
**repository** | [**RepositoryWebhooks**](RepositoryWebhooks.md) |  | 
**sender** | [**SimpleUserWebhooks**](SimpleUserWebhooks.md) |  | 
**enterprise** | [**EnterpriseWebhooks**](EnterpriseWebhooks.md) |  |  [optional]
**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional]
**organization** | [**OrganizationSimpleWebhooks**](OrganizationSimpleWebhooks.md) |  |  [optional]


<a id="RefType"></a>
## Enum: ref_type
Name | Value
---- | -----
refType | tag, branch



