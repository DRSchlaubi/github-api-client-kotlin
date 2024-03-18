
# MigrationsStartForOrgRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**repositories** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of arrays indicating which repositories should be migrated. | 
**lockRepositories** | **kotlin.Boolean** | Indicates whether repositories should be locked (to prevent manipulation) while migrating data. |  [optional]
**excludeMetadata** | **kotlin.Boolean** | Indicates whether metadata should be excluded and only git source should be included for the migration. |  [optional]
**excludeGitData** | **kotlin.Boolean** | Indicates whether the repository git data should be excluded from the migration. |  [optional]
**excludeAttachments** | **kotlin.Boolean** | Indicates whether attachments should be excluded from the migration (to reduce migration archive file size). |  [optional]
**excludeReleases** | **kotlin.Boolean** | Indicates whether releases should be excluded from the migration (to reduce migration archive file size). |  [optional]
**excludeOwnerProjects** | **kotlin.Boolean** | Indicates whether projects owned by the organization or users should be excluded. from the migration. |  [optional]
**orgMetadataOnly** | **kotlin.Boolean** | Indicates whether this should only include organization metadata (repositories array should be empty and will ignore other flags). |  [optional]
**exclude** | [**inline**](#kotlin.collections.List&lt;Exclude&gt;) | Exclude related items from being returned in the response in order to improve performance of the request. |  [optional]


<a id="kotlin.collections.List<Exclude>"></a>
## Enum: exclude
Name | Value
---- | -----
exclude | repositories



