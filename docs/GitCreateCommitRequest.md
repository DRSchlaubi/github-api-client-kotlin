
# GitCreateCommitRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **kotlin.String** | The commit message | 
**tree** | **kotlin.String** | The SHA of the tree object this commit points to | 
**parents** | **kotlin.collections.List&lt;kotlin.String&gt;** | The SHAs of the commits that were the parents of this commit. If omitted or empty, the commit will be written as a root commit. For a single parent, an array of one SHA should be provided; for a merge commit, an array of more than one should be provided. |  [optional]
**author** | [**GitCreateCommitRequestAuthor**](GitCreateCommitRequestAuthor.md) |  |  [optional]
**committer** | [**GitCreateCommitRequestCommitter**](GitCreateCommitRequestCommitter.md) |  |  [optional]
**signature** | **kotlin.String** | The [PGP signature](https://en.wikipedia.org/wiki/Pretty_Good_Privacy) of the commit. GitHub adds the signature to the &#x60;gpgsig&#x60; header of the created commit. For a commit signature to be verifiable by Git or GitHub, it must be an ASCII-armored detached PGP signature over the string commit as it would be written to the object database. To pass a &#x60;signature&#x60; parameter, you need to first manually create a valid PGP signature, which can be complicated. You may find it easier to [use the command line](https://git-scm.com/book/id/v2/Git-Tools-Signing-Your-Work) to create signed commits. |  [optional]



