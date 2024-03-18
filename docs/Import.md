
# Import

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vcs** | **kotlin.String** |  | 
**vcsUrl** | **kotlin.String** | The URL of the originating repository. | 
**status** | [**inline**](#Status) |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**authorsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**repositoryUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**useLfs** | **kotlin.Boolean** |  |  [optional]
**svcRoot** | **kotlin.String** |  |  [optional]
**tfvcProject** | **kotlin.String** |  |  [optional]
**statusText** | **kotlin.String** |  |  [optional]
**failedStep** | **kotlin.String** |  |  [optional]
**errorMessage** | **kotlin.String** |  |  [optional]
**importPercent** | **kotlin.Int** |  |  [optional]
**commitCount** | **kotlin.Int** |  |  [optional]
**pushPercent** | **kotlin.Int** |  |  [optional]
**hasLargeFiles** | **kotlin.Boolean** |  |  [optional]
**largeFilesSize** | **kotlin.Int** |  |  [optional]
**largeFilesCount** | **kotlin.Int** |  |  [optional]
**projectChoices** | [**kotlin.collections.List&lt;ImportProjectChoicesInner&gt;**](ImportProjectChoicesInner.md) |  |  [optional]
**message** | **kotlin.String** |  |  [optional]
**authorsCount** | **kotlin.Int** |  |  [optional]
**svnRoot** | **kotlin.String** |  |  [optional]


<a id="Status"></a>
## Enum: status
Name | Value
---- | -----
status | auth, error, none, detecting, choose, auth_failed, importing, mapping, waiting_to_push, pushing, complete, setup, unknown, detection_found_multiple, detection_found_nothing, detection_needs_auth



