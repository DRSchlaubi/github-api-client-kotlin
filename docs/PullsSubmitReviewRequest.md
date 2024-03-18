
# PullsSubmitReviewRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | [**inline**](#Event) | The review action you want to perform. The review actions include: &#x60;APPROVE&#x60;, &#x60;REQUEST_CHANGES&#x60;, or &#x60;COMMENT&#x60;. When you leave this blank, the API returns _HTTP 422 (Unrecognizable entity)_ and sets the review action state to &#x60;PENDING&#x60;, which means you will need to re-submit the pull request review using a review action. | 
**body** | **kotlin.String** | The body text of the pull request review |  [optional]


<a id="Event"></a>
## Enum: event
Name | Value
---- | -----
event | APPROVE, REQUEST_CHANGES, COMMENT



