
# WebhookDeploymentProtectionRuleRequested

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**inline**](#Action) |  |  [optional]
**environment** | **kotlin.String** | The name of the environment that has the deployment protection rule. |  [optional]
**event** | **kotlin.String** | The event that triggered the deployment protection rule. |  [optional]
**deploymentCallbackUrl** | [**java.net.URI**](java.net.URI.md) | The URL to review the deployment protection rule. |  [optional]
**deployment** | [**Deployment**](Deployment.md) |  |  [optional]
**pullRequests** | [**kotlin.collections.List&lt;PullRequest&gt;**](PullRequest.md) |  |  [optional]
**repository** | [**RepositoryWebhooks**](RepositoryWebhooks.md) |  |  [optional]
**organization** | [**OrganizationSimpleWebhooks**](OrganizationSimpleWebhooks.md) |  |  [optional]
**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional]
**sender** | [**SimpleUserWebhooks**](SimpleUserWebhooks.md) |  |  [optional]


<a id="Action"></a>
## Enum: action
Name | Value
---- | -----
action | requested



