
# ReposCreateDeploymentStatusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**inline**](#State) | The state of the status. When you set a transient deployment to &#x60;inactive&#x60;, the deployment will be shown as &#x60;destroyed&#x60; in GitHub. | 
**targetUrl** | **kotlin.String** | The target URL to associate with this status. This URL should contain output to keep the user updated while the task is running or serve as historical information for what happened in the deployment. **Note:** It&#39;s recommended to use the &#x60;log_url&#x60; parameter, which replaces &#x60;target_url&#x60;. |  [optional]
**logUrl** | **kotlin.String** | The full URL of the deployment&#39;s output. This parameter replaces &#x60;target_url&#x60;. We will continue to accept &#x60;target_url&#x60; to support legacy uses, but we recommend replacing &#x60;target_url&#x60; with &#x60;log_url&#x60;. Setting &#x60;log_url&#x60; will automatically set &#x60;target_url&#x60; to the same value. Default: &#x60;\&quot;\&quot;&#x60; |  [optional]
**description** | **kotlin.String** | A short description of the status. The maximum description length is 140 characters. |  [optional]
**environment** | **kotlin.String** | Name for the target deployment environment, which can be changed when setting a deploy status. For example, &#x60;production&#x60;, &#x60;staging&#x60;, or &#x60;qa&#x60;. If not defined, the environment of the previous status on the deployment will be used, if it exists. Otherwise, the environment of the deployment will be used. |  [optional]
**environmentUrl** | **kotlin.String** | Sets the URL for accessing your environment. Default: &#x60;\&quot;\&quot;&#x60; |  [optional]
**autoInactive** | **kotlin.Boolean** | Adds a new &#x60;inactive&#x60; status to all prior non-transient, non-production environment deployments with the same repository and &#x60;environment&#x60; name as the created status&#39;s deployment. An &#x60;inactive&#x60; status is only added to deployments that had a &#x60;success&#x60; state. Default: &#x60;true&#x60; |  [optional]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | error, failure, inactive, in_progress, queued, pending, success



