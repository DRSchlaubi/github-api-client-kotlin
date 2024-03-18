
# CodespacesCreateForAuthenticatedUserRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**repositoryId** | [**kotlin.Any**](.md) | Repository id for this codespace | 
**pullRequest** | [**CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest**](CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest.md) |  | 
**ref** | [**kotlin.Any**](.md) | Git ref (typically a branch name) for this codespace |  [optional]
**location** | [**kotlin.Any**](.md) | The requested location for a new codespace. Best efforts are made to respect this upon creation. Assigned by IP if not provided. |  [optional]
**geo** | [**inline**](#Geo) | The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces &#x60;location&#x60;, which is being deprecated. |  [optional]
**clientIp** | [**kotlin.Any**](.md) | IP for location auto-detection when proxying a request |  [optional]
**machine** | [**kotlin.Any**](.md) | Machine type to use for this codespace |  [optional]
**devcontainerPath** | [**kotlin.Any**](.md) | Path to devcontainer.json config to use for this codespace |  [optional]
**multiRepoPermissionsOptOut** | [**kotlin.Any**](.md) | Whether to authorize requested permissions from devcontainer.json |  [optional]
**workingDirectory** | [**kotlin.Any**](.md) | Working directory for this codespace |  [optional]
**idleTimeoutMinutes** | [**kotlin.Any**](.md) | Time in minutes before codespace stops from inactivity |  [optional]
**displayName** | [**kotlin.Any**](.md) | Display name for this codespace |  [optional]
**retentionPeriodMinutes** | [**kotlin.Any**](.md) | Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0 and 43200 (30 days). |  [optional]


<a id="Geo"></a>
## Enum: geo
Name | Value
---- | -----
geo | EuropeWest, SoutheastAsia, UsEast, UsWest



