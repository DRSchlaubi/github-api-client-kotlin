
# CodespacesCreateWithPrForAuthenticatedUserRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location** | **kotlin.String** | The requested location for a new codespace. Best efforts are made to respect this upon creation. Assigned by IP if not provided. |  [optional]
**geo** | [**inline**](#Geo) | The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces &#x60;location&#x60;, which is being deprecated. |  [optional]
**clientIp** | **kotlin.String** | IP for location auto-detection when proxying a request |  [optional]
**machine** | **kotlin.String** | Machine type to use for this codespace |  [optional]
**devcontainerPath** | **kotlin.String** | Path to devcontainer.json config to use for this codespace |  [optional]
**multiRepoPermissionsOptOut** | **kotlin.Boolean** | Whether to authorize requested permissions from devcontainer.json |  [optional]
**workingDirectory** | **kotlin.String** | Working directory for this codespace |  [optional]
**idleTimeoutMinutes** | **kotlin.Int** | Time in minutes before codespace stops from inactivity |  [optional]
**displayName** | **kotlin.String** | Display name for this codespace |  [optional]
**retentionPeriodMinutes** | **kotlin.Int** | Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0 and 43200 (30 days). |  [optional]


<a id="Geo"></a>
## Enum: geo
Name | Value
---- | -----
geo | EuropeWest, SoutheastAsia, UsEast, UsWest



