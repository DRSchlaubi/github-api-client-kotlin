
# SecretScanningLocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The location type. Because secrets may be found in different types of resources (ie. code, comments, issues, pull requests, discussions), this field identifies the type of resource where the secret was found. | 
**details** | [**SecretScanningLocationDetails**](SecretScanningLocationDetails.md) |  | 


<a id="Type"></a>
## Enum: type
Name | Value
---- | -----
type | commit, issue_title, issue_body, issue_comment, discussion_title, discussion_body, discussion_comment, pull_request_title, pull_request_body, pull_request_comment, pull_request_review, pull_request_review_comment



