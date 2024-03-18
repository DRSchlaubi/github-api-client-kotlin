
# MigrationsStartForAuthenticatedUserRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**repositories** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**lockRepositories** | **kotlin.Boolean** | Lock the repositories being migrated at the start of the migration |  [optional]
**excludeMetadata** | **kotlin.Boolean** | Indicates whether metadata should be excluded and only git source should be included for the migration. |  [optional]
**excludeGitData** | **kotlin.Boolean** | Indicates whether the repository git data should be excluded from the migration. |  [optional]
**excludeAttachments** | **kotlin.Boolean** | Do not include attachments in the migration |  [optional]
**excludeReleases** | **kotlin.Boolean** | Do not include releases in the migration |  [optional]
**excludeOwnerProjects** | **kotlin.Boolean** | Indicates whether projects owned by the organization or users should be excluded. |  [optional]
**orgMetadataOnly** | **kotlin.Boolean** | Indicates whether this should only include organization metadata (repositories array should be empty and will ignore other flags). |  [optional]
**exclude** | [**inline**](#kotlin.collections.List&lt;Exclude&gt;) | Exclude attributes from the API response to improve performance |  [optional]


<a id="kotlin.collections.List<Exclude>"></a>
## Enum: exclude
Name | Value
---- | -----
exclude | repositories



