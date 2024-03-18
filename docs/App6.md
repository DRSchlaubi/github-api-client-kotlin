
# App6

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**description** | **kotlin.String** |  | 
**externalUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**id** | **kotlin.Int** | Unique identifier of the GitHub app | 
**name** | **kotlin.String** | The name of the GitHub app | 
**nodeId** | **kotlin.String** |  | 
**owner** | [**User**](User.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**events** | [**inline**](#kotlin.collections.List&lt;Events&gt;) | The list of events for the GitHub app |  [optional]
**permissions** | [**AppPermissions**](AppPermissions.md) |  |  [optional]
**slug** | **kotlin.String** | The slug name of the GitHub app |  [optional]


<a id="kotlin.collections.List<Events>"></a>
## Enum: events
Name | Value
---- | -----
events | branch_protection_rule, check_run, check_suite, code_scanning_alert, commit_comment, content_reference, create, delete, deployment, deployment_review, deployment_status, deploy_key, discussion, discussion_comment, fork, gollum, issues, issue_comment, label, member, membership, milestone, organization, org_block, page_build, project, project_card, project_column, public, pull_request, pull_request_review, pull_request_review_comment, push, registry_package, release, repository, repository_dispatch, secret_scanning_alert, star, status, team, team_add, watch, workflow_dispatch, workflow_run, reminder, pull_request_review_thread



