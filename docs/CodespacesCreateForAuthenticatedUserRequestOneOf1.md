
# CodespacesCreateForAuthenticatedUserRequestOneOf1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pullRequest** | [**CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest**](CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest.md) |  | 
**location** | **kotlin.String** | The requested location for a new codespace. Best efforts are made to respect this upon creation. Assigned by IP if not provided. |  [optional]
**geo** | [**inline**](#Geo) | The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces &#x60;location&#x60;, which is being deprecated. |  [optional]
**machine** | **kotlin.String** | Machine type to use for this codespace |  [optional]
**devcontainerPath** | **kotlin.String** | Path to devcontainer.json config to use for this codespace |  [optional]
**workingDirectory** | **kotlin.String** | Working directory for this codespace |  [optional]
**idleTimeoutMinutes** | **kotlin.Int** | Time in minutes before codespace stops from inactivity |  [optional]


<a id="Geo"></a>
## Enum: geo
Name | Value
---- | -----
geo | EuropeWest, SoutheastAsia, UsEast, UsWest



