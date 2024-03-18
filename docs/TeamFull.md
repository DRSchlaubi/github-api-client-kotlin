
# TeamFull

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | Unique identifier of the team | 
**nodeId** | **kotlin.String** |  | 
**url** | [**java.net.URI**](java.net.URI.md) | URL for the team | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**name** | **kotlin.String** | Name of the team | 
**slug** | **kotlin.String** |  | 
**description** | **kotlin.String** |  | 
**permission** | **kotlin.String** | Permission that the team will have for its repositories | 
**membersUrl** | **kotlin.String** |  | 
**repositoriesUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**membersCount** | **kotlin.Int** |  | 
**reposCount** | **kotlin.Int** |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**organization** | [**TeamOrganization**](TeamOrganization.md) |  | 
**privacy** | [**inline**](#Privacy) | The level of privacy this team should have |  [optional]
**notificationSetting** | [**inline**](#NotificationSetting) | The notification setting the team has set |  [optional]
**parent** | [**TeamParent**](TeamParent.md) |  |  [optional]
**ldapDn** | **kotlin.String** | Distinguished Name (DN) that team maps to within LDAP environment |  [optional]


<a id="Privacy"></a>
## Enum: privacy
Name | Value
---- | -----
privacy | closed, secret


<a id="NotificationSetting"></a>
## Enum: notification_setting
Name | Value
---- | -----
notificationSetting | notifications_enabled, notifications_disabled



