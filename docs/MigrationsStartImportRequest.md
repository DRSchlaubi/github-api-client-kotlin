
# MigrationsStartImportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vcsUrl** | **kotlin.String** | The URL of the originating repository. | 
**vcs** | [**inline**](#Vcs) | The originating VCS type. Without this parameter, the import job will take additional time to detect the VCS type before beginning the import. This detection step will be reflected in the response. |  [optional]
**vcsUsername** | **kotlin.String** | If authentication is required, the username to provide to &#x60;vcs_url&#x60;. |  [optional]
**vcsPassword** | **kotlin.String** | If authentication is required, the password to provide to &#x60;vcs_url&#x60;. |  [optional]
**tfvcProject** | **kotlin.String** | For a tfvc import, the name of the project that is being imported. |  [optional]


<a id="Vcs"></a>
## Enum: vcs
Name | Value
---- | -----
vcs | subversion, git, mercurial, tfvc



