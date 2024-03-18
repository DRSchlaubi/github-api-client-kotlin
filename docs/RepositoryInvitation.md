
# RepositoryInvitation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | Unique identifier of the repository invitation. | 
**repository** | [**MinimalRepository**](MinimalRepository.md) |  | 
**invitee** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**inviter** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**permissions** | [**inline**](#Permissions) | The permission associated with the invitation. | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**url** | **kotlin.String** | URL for the repository invitation | 
**htmlUrl** | **kotlin.String** |  | 
**nodeId** | **kotlin.String** |  | 
**expired** | **kotlin.Boolean** | Whether or not the invitation has expired |  [optional]


<a id="Permissions"></a>
## Enum: permissions
Name | Value
---- | -----
permissions | read, write, admin, triage, maintain



