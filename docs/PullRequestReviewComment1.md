
# PullRequestReviewComment1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**PullRequestReviewCommentLinks**](PullRequestReviewCommentLinks.md) |  | 
**authorAssociation** | [**inline**](#AuthorAssociation) | How the author is associated with the repository. | 
**body** | **kotlin.String** | The text of the comment. | 
**commitId** | **kotlin.String** | The SHA of the commit to which the comment applies. | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**diffHunk** | **kotlin.String** | The diff of the line that the comment refers to. | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) | HTML URL for the pull request review comment. | 
**id** | **kotlin.Int** | The ID of the pull request review comment. | 
**line** | **kotlin.Int** | The line of the blob to which the comment applies. The last line of the range for a multi-line comment | 
**nodeId** | **kotlin.String** | The node ID of the pull request review comment. | 
**originalCommitId** | **kotlin.String** | The SHA of the original commit to which the comment applies. | 
**originalLine** | **kotlin.Int** | The line of the blob to which the comment applies. The last line of the range for a multi-line comment | 
**originalPosition** | **kotlin.Int** | The index of the original line in the diff to which the comment applies. | 
**originalStartLine** | **kotlin.Int** | The first line of the range for a multi-line comment. | 
**path** | **kotlin.String** | The relative path of the file to which the comment applies. | 
**position** | **kotlin.Int** | The line index in the diff to which the comment applies. | 
**pullRequestReviewId** | **kotlin.Int** | The ID of the pull request review to which the comment belongs. | 
**pullRequestUrl** | [**java.net.URI**](java.net.URI.md) | URL for the pull request that the review comment belongs to. | 
**reactions** | [**Reactions**](Reactions.md) |  | 
**side** | [**inline**](#Side) | The side of the first line of the range for a multi-line comment. | 
**startLine** | **kotlin.Int** | The first line of the range for a multi-line comment. | 
**startSide** | [**inline**](#StartSide) | The side of the first line of the range for a multi-line comment. | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**url** | [**java.net.URI**](java.net.URI.md) | URL for the pull request review comment | 
**user** | [**User**](User.md) |  | 
**inReplyToId** | **kotlin.Int** | The comment ID to reply to. |  [optional]
**subjectType** | [**inline**](#SubjectType) | The level at which the comment is targeted, can be a diff line or a file. |  [optional]


<a id="AuthorAssociation"></a>
## Enum: author_association
Name | Value
---- | -----
authorAssociation | COLLABORATOR, CONTRIBUTOR, FIRST_TIMER, FIRST_TIME_CONTRIBUTOR, MANNEQUIN, MEMBER, NONE, OWNER


<a id="Side"></a>
## Enum: side
Name | Value
---- | -----
side | LEFT, RIGHT


<a id="StartSide"></a>
## Enum: start_side
Name | Value
---- | -----
startSide | LEFT, RIGHT, 


<a id="SubjectType"></a>
## Enum: subject_type
Name | Value
---- | -----
subjectType | line, file



