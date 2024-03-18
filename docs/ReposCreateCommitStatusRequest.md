
# ReposCreateCommitStatusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**inline**](#State) | The state of the status. | 
**targetUrl** | **kotlin.String** | The target URL to associate with this status. This URL will be linked from the GitHub UI to allow users to easily see the source of the status.   For example, if your continuous integration system is posting build status, you would want to provide the deep link for the build output for this specific SHA:   &#x60;http://ci.example.com/user/repo/build/sha&#x60; |  [optional]
**description** | **kotlin.String** | A short description of the status. |  [optional]
**context** | **kotlin.String** | A string label to differentiate this status from the status of other systems. This field is case-insensitive. |  [optional]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | error, failure, pending, success



