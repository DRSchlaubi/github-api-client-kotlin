
# PullsCreateReviewCommentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **kotlin.String** | The text of the review comment. | 
**commitId** | **kotlin.String** | The SHA of the commit needing a comment. Not using the latest commit SHA may render your comment outdated if a subsequent commit modifies the line you specify as the &#x60;position&#x60;. | 
**path** | **kotlin.String** | The relative path to the file that necessitates a comment. | 
**position** | **kotlin.Int** | **This parameter is deprecated. Use &#x60;line&#x60; instead**. The position in the diff where you want to add a review comment. Note this value is not the same as the line number in the file. The position value equals the number of lines down from the first \&quot;@@\&quot; hunk header in the file you want to add a comment. The line just below the \&quot;@@\&quot; line is position 1, the next line is position 2, and so on. The position in the diff continues to increase through lines of whitespace and additional hunks until the beginning of a new file. |  [optional]
**side** | [**inline**](#Side) | In a split diff view, the side of the diff that the pull request&#39;s changes appear on. Can be &#x60;LEFT&#x60; or &#x60;RIGHT&#x60;. Use &#x60;LEFT&#x60; for deletions that appear in red. Use &#x60;RIGHT&#x60; for additions that appear in green or unchanged lines that appear in white and are shown for context. For a multi-line comment, side represents whether the last line of the comment range is a deletion or addition. For more information, see \&quot;[Diff view options](https://docs.github.com/articles/about-comparing-branches-in-pull-requests#diff-view-options)\&quot; in the GitHub Help documentation. |  [optional]
**line** | **kotlin.Int** | **Required unless using &#x60;subject_type:file&#x60;**. The line of the blob in the pull request diff that the comment applies to. For a multi-line comment, the last line of the range that your comment applies to. |  [optional]
**startLine** | **kotlin.Int** | **Required when using multi-line comments unless using &#x60;in_reply_to&#x60;**. The &#x60;start_line&#x60; is the first line in the pull request diff that your multi-line comment applies to. To learn more about multi-line comments, see \&quot;[Commenting on a pull request](https://docs.github.com/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)\&quot; in the GitHub Help documentation. |  [optional]
**startSide** | [**inline**](#StartSide) | **Required when using multi-line comments unless using &#x60;in_reply_to&#x60;**. The &#x60;start_side&#x60; is the starting side of the diff that the comment applies to. Can be &#x60;LEFT&#x60; or &#x60;RIGHT&#x60;. To learn more about multi-line comments, see \&quot;[Commenting on a pull request](https://docs.github.com/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)\&quot; in the GitHub Help documentation. See &#x60;side&#x60; in this table for additional context. |  [optional]
**inReplyTo** | **kotlin.Int** | The ID of the review comment to reply to. To find the ID of a review comment with [\&quot;List review comments on a pull request\&quot;](#list-review-comments-on-a-pull-request). When specified, all parameters other than &#x60;body&#x60; in the request body are ignored. |  [optional]
**subjectType** | [**inline**](#SubjectType) | The level at which the comment is targeted. |  [optional]


<a id="Side"></a>
## Enum: side
Name | Value
---- | -----
side | LEFT, RIGHT


<a id="StartSide"></a>
## Enum: start_side
Name | Value
---- | -----
startSide | LEFT, RIGHT, side


<a id="SubjectType"></a>
## Enum: subject_type
Name | Value
---- | -----
subjectType | line, file



