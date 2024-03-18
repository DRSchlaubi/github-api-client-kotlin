
# AlertInstance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analysisKey** | **kotlin.String** | Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name. | 
**environment** | **kotlin.String** | Identifies the variable values associated with the environment in which the analysis that generated this alert instance was performed, such as the language that was analyzed. | 
**ref** | **kotlin.String** | The full Git reference, formatted as &#x60;refs/heads/&lt;branch name&gt;&#x60;. | 
**state** | [**inline**](#State) | State of a code scanning alert. | 
**category** | **kotlin.String** | Identifies the configuration under which the analysis was executed. |  [optional]
**classifications** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**commitSha** | **kotlin.String** |  |  [optional]
**location** | [**AlertInstanceLocation**](AlertInstanceLocation.md) |  |  [optional]
**message** | [**CodeScanningAlertInstanceMessage**](CodeScanningAlertInstanceMessage.md) |  |  [optional]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | open, dismissed, fixed



