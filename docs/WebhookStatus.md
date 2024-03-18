
# WebhookStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branches** | [**kotlin.collections.List&lt;WebhookStatusBranchesInner&gt;**](WebhookStatusBranchesInner.md) | An array of branch objects containing the status&#39; SHA. Each branch contains the given SHA, but the SHA may or may not be the head of the branch. The array includes a maximum of 10 branches. | 
**commit** | [**WebhookStatusCommit**](WebhookStatusCommit.md) |  | 
**context** | **kotlin.String** |  | 
**createdAt** | **kotlin.String** |  | 
**description** | **kotlin.String** | The optional human-readable description added to the status. | 
**id** | **kotlin.Int** | The unique identifier of the status. | 
**name** | **kotlin.String** |  | 
**repository** | [**RepositoryWebhooks**](RepositoryWebhooks.md) |  | 
**sender** | [**SimpleUserWebhooks**](SimpleUserWebhooks.md) |  | 
**sha** | **kotlin.String** | The Commit SHA. | 
**state** | [**inline**](#State) | The new state. Can be &#x60;pending&#x60;, &#x60;success&#x60;, &#x60;failure&#x60;, or &#x60;error&#x60;. | 
**targetUrl** | **kotlin.String** | The optional link added to the status. | 
**updatedAt** | **kotlin.String** |  | 
**avatarUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**enterprise** | [**EnterpriseWebhooks**](EnterpriseWebhooks.md) |  |  [optional]
**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional]
**organization** | [**OrganizationSimpleWebhooks**](OrganizationSimpleWebhooks.md) |  |  [optional]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | pending, success, failure, error



