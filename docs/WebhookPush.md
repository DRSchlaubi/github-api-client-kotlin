
# WebhookPush

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**after** | **kotlin.String** | The SHA of the most recent commit on &#x60;ref&#x60; after the push. | 
**baseRef** | **kotlin.String** |  | 
**before** | **kotlin.String** | The SHA of the most recent commit on &#x60;ref&#x60; before the push. | 
**commits** | [**kotlin.collections.List&lt;Commit&gt;**](Commit.md) | An array of commit objects describing the pushed commits. (Pushed commits are all commits that are included in the &#x60;compare&#x60; between the &#x60;before&#x60; commit and the &#x60;after&#x60; commit.) The array includes a maximum of 2048 commits. If necessary, you can use the [Commits API](https://docs.github.com/rest/commits) to fetch additional commits. | 
**compare** | **kotlin.String** | URL that shows the changes in this &#x60;ref&#x60; update, from the &#x60;before&#x60; commit to the &#x60;after&#x60; commit. For a newly created &#x60;ref&#x60; that is directly based on the default branch, this is the comparison between the head of the default branch and the &#x60;after&#x60; commit. Otherwise, this shows all commits until the &#x60;after&#x60; commit. | 
**created** | **kotlin.Boolean** | Whether this push created the &#x60;ref&#x60;. | 
**deleted** | **kotlin.Boolean** | Whether this push deleted the &#x60;ref&#x60;. | 
**forced** | **kotlin.Boolean** | Whether this push was a force push of the &#x60;ref&#x60;. | 
**headCommit** | [**Commit1**](Commit1.md) |  | 
**pusher** | [**Committer1**](Committer1.md) |  | 
**ref** | **kotlin.String** | The full git ref that was pushed. Example: &#x60;refs/heads/main&#x60; or &#x60;refs/tags/v3.14.1&#x60;. | 
**repository** | [**Repository1**](Repository1.md) |  | 
**enterprise** | [**EnterpriseWebhooks**](EnterpriseWebhooks.md) |  |  [optional]
**installation** | [**SimpleInstallation**](SimpleInstallation.md) |  |  [optional]
**organization** | [**OrganizationSimpleWebhooks**](OrganizationSimpleWebhooks.md) |  |  [optional]
**sender** | [**SimpleUserWebhooks**](SimpleUserWebhooks.md) |  |  [optional]



