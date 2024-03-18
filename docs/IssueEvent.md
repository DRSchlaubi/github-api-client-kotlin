
# IssueEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Long** |  | 
**nodeId** | **kotlin.String** |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**actor** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**event** | **kotlin.String** |  | 
**commitId** | **kotlin.String** |  | 
**commitUrl** | **kotlin.String** |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**issue** | [**IssueEventIssue**](IssueEventIssue.md) |  |  [optional]
**label** | [**IssueEventLabel**](IssueEventLabel.md) |  |  [optional]
**assignee** | [**IntegrationOwner**](IntegrationOwner.md) |  |  [optional]
**assigner** | [**IntegrationOwner**](IntegrationOwner.md) |  |  [optional]
**reviewRequester** | [**IntegrationOwner**](IntegrationOwner.md) |  |  [optional]
**requestedReviewer** | [**IntegrationOwner**](IntegrationOwner.md) |  |  [optional]
**requestedTeam** | [**Team**](Team.md) |  |  [optional]
**dismissedReview** | [**IssueEventDismissedReview**](IssueEventDismissedReview.md) |  |  [optional]
**milestone** | [**IssueEventMilestone**](IssueEventMilestone.md) |  |  [optional]
**projectCard** | [**IssueEventProjectCard**](IssueEventProjectCard.md) |  |  [optional]
**rename** | [**IssueEventRename**](IssueEventRename.md) |  |  [optional]
**authorAssociation** | [**AuthorAssociation**](AuthorAssociation.md) |  |  [optional]
**lockReason** | **kotlin.String** |  |  [optional]
**performedViaGithubApp** | [**IssuePerformedViaGithubApp**](IssuePerformedViaGithubApp.md) |  |  [optional]



