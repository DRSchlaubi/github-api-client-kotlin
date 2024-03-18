
# CodespaceWithFullRepository

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** |  | 
**name** | **kotlin.String** | Automatically generated name of this codespace. | 
**environmentId** | **kotlin.String** | UUID identifying this codespace&#39;s environment. | 
**owner** | [**SimpleUser**](SimpleUser.md) |  | 
**billableOwner** | [**SimpleUser**](SimpleUser.md) |  | 
**repository** | [**FullRepository**](FullRepository.md) |  | 
**machine** | [**CodespaceMachine**](CodespaceMachine.md) |  | 
**prebuild** | **kotlin.Boolean** | Whether the codespace was created from a prebuild. | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**lastUsedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | Last known time this codespace was started. | 
**state** | [**inline**](#State) | State of this codespace. | 
**url** | [**java.net.URI**](java.net.URI.md) | API URL for this codespace. | 
**gitStatus** | [**CodespaceGitStatus**](CodespaceGitStatus.md) |  | 
**location** | [**inline**](#Location) | The initally assigned location of a new codespace. | 
**idleTimeoutMinutes** | **kotlin.Int** | The number of minutes of inactivity after which this codespace will be automatically stopped. | 
**webUrl** | [**java.net.URI**](java.net.URI.md) | URL to access this codespace on the web. | 
**machinesUrl** | [**java.net.URI**](java.net.URI.md) | API URL to access available alternate machine types for this codespace. | 
**startUrl** | [**java.net.URI**](java.net.URI.md) | API URL to start this codespace. | 
**stopUrl** | [**java.net.URI**](java.net.URI.md) | API URL to stop this codespace. | 
**pullsUrl** | [**java.net.URI**](java.net.URI.md) | API URL for the Pull Request associated with this codespace, if any. | 
**recentFolders** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**displayName** | **kotlin.String** | Display name for this codespace. |  [optional]
**devcontainerPath** | **kotlin.String** | Path to devcontainer.json from repo root used to create Codespace. |  [optional]
**publishUrl** | [**java.net.URI**](java.net.URI.md) | API URL to publish this codespace to a new repository. |  [optional]
**runtimeConstraints** | [**CodespaceRuntimeConstraints**](CodespaceRuntimeConstraints.md) |  |  [optional]
**pendingOperation** | **kotlin.Boolean** | Whether or not a codespace has a pending async operation. This would mean that the codespace is temporarily unavailable. The only thing that you can do with a codespace in this state is delete it. |  [optional]
**pendingOperationDisabledReason** | **kotlin.String** | Text to show user when codespace is disabled by a pending operation |  [optional]
**idleTimeoutNotice** | **kotlin.String** | Text to show user when codespace idle timeout minutes has been overriden by an organization policy |  [optional]
**retentionPeriodMinutes** | **kotlin.Int** | Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0 and 43200 (30 days). |  [optional]
**retentionExpiresAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | When a codespace will be auto-deleted based on the \&quot;retention_period_minutes\&quot; and \&quot;last_used_at\&quot; |  [optional]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | Unknown, Created, Queued, Provisioning, Available, Awaiting, Unavailable, Deleted, Moved, Shutdown, Archived, Starting, ShuttingDown, Failed, Exporting, Updating, Rebuilding


<a id="Location"></a>
## Enum: location
Name | Value
---- | -----
location | EastUs, SouthEastAsia, WestEurope, WestUs2



