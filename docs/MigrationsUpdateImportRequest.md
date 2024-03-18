
# MigrationsUpdateImportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vcsUsername** | **kotlin.String** | The username to provide to the originating repository. |  [optional]
**vcsPassword** | **kotlin.String** | The password to provide to the originating repository. |  [optional]
**vcs** | [**inline**](#Vcs) | The type of version control system you are migrating from. |  [optional]
**tfvcProject** | **kotlin.String** | For a tfvc import, the name of the project that is being imported. |  [optional]


<a id="Vcs"></a>
## Enum: vcs
Name | Value
---- | -----
vcs | subversion, tfvc, git, mercurial



