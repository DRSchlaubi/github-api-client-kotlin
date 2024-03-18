
# ReposCreateOrUpdateFileContentsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **kotlin.String** | The commit message. | 
**content** | **kotlin.String** | The new file content, using Base64 encoding. | 
**sha** | **kotlin.String** | **Required if you are updating a file**. The blob SHA of the file being replaced. |  [optional]
**branch** | **kotlin.String** | The branch name. Default: the repository’s default branch. |  [optional]
**committer** | [**ReposCreateOrUpdateFileContentsRequestCommitter**](ReposCreateOrUpdateFileContentsRequestCommitter.md) |  |  [optional]
**author** | [**ReposCreateOrUpdateFileContentsRequestAuthor**](ReposCreateOrUpdateFileContentsRequestAuthor.md) |  |  [optional]



