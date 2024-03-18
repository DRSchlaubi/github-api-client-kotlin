
# SecretScanningLocationDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | [**kotlin.Any**](.md) | The file path in the repository | 
**startLine** | [**kotlin.Any**](.md) | Line number at which the secret starts in the file | 
**endLine** | [**kotlin.Any**](.md) | Line number at which the secret ends in the file | 
**startColumn** | [**kotlin.Any**](.md) | The column at which the secret starts within the start line when the file is interpreted as 8BIT ASCII | 
**endColumn** | [**kotlin.Any**](.md) | The column at which the secret ends within the end line when the file is interpreted as 8BIT ASCII | 
**blobSha** | [**kotlin.Any**](.md) | SHA-1 hash ID of the associated blob | 
**blobUrl** | [**kotlin.Any**](.md) | The API URL to get the associated blob resource | 
**commitSha** | [**kotlin.Any**](.md) | SHA-1 hash ID of the associated commit | 
**commitUrl** | [**kotlin.Any**](.md) | The API URL to get the associated commit resource | 
**issueTitleUrl** | [**kotlin.Any**](.md) | The API URL to get the issue where the secret was detected. | 
**issueBodyUrl** | [**kotlin.Any**](.md) | The API URL to get the issue where the secret was detected. | 
**issueCommentUrl** | [**kotlin.Any**](.md) | The API URL to get the issue comment where the secret was detected. | 
**discussionTitleUrl** | [**kotlin.Any**](.md) | The URL to the discussion where the secret was detected. | 
**discussionBodyUrl** | [**kotlin.Any**](.md) | The URL to the discussion where the secret was detected. | 
**discussionCommentUrl** | [**kotlin.Any**](.md) | The API URL to get the discussion comment where the secret was detected. | 
**pullRequestTitleUrl** | [**kotlin.Any**](.md) | The API URL to get the pull request where the secret was detected. | 
**pullRequestBodyUrl** | [**kotlin.Any**](.md) | The API URL to get the pull request where the secret was detected. | 
**pullRequestCommentUrl** | [**kotlin.Any**](.md) | The API URL to get the pull request comment where the secret was detected. | 
**pullRequestReviewUrl** | [**kotlin.Any**](.md) | The API URL to get the pull request review where the secret was detected. | 
**pullRequestReviewCommentUrl** | [**kotlin.Any**](.md) | The API URL to get the pull request review comment where the secret was detected. | 



