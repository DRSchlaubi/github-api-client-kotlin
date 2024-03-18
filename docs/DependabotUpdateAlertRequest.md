
# DependabotUpdateAlertRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**inline**](#State) | The state of the Dependabot alert. A &#x60;dismissed_reason&#x60; must be provided when setting the state to &#x60;dismissed&#x60;. | 
**dismissedReason** | [**inline**](#DismissedReason) | **Required when &#x60;state&#x60; is &#x60;dismissed&#x60;.** A reason for dismissing the alert. |  [optional]
**dismissedComment** | [**kotlin.Any**](.md) | An optional comment associated with dismissing the alert. |  [optional]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | dismissed, open


<a id="DismissedReason"></a>
## Enum: dismissed_reason
Name | Value
---- | -----
dismissedReason | fix_started, inaccurate, no_bandwidth, not_used, tolerable_risk



