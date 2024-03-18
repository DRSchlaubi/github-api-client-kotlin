
# Team3

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | Unique identifier of the team | 
**name** | **kotlin.String** | Name of the team | 
**deleted** | **kotlin.Boolean** |  |  [optional]
**description** | **kotlin.String** | Description of the team |  [optional]
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**membersUrl** | **kotlin.String** |  |  [optional]
**nodeId** | **kotlin.String** |  |  [optional]
**parent** | [**TeamParent**](TeamParent.md) |  |  [optional]
**permission** | **kotlin.String** | Permission that the team will have for its repositories |  [optional]
**privacy** | [**inline**](#Privacy) |  |  [optional]
**notificationSetting** | [**inline**](#NotificationSetting) | Whether team members will receive notifications when their team is @mentioned |  [optional]
**repositoriesUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**slug** | **kotlin.String** |  |  [optional]
**url** | [**java.net.URI**](java.net.URI.md) | URL for the team |  [optional]


<a id="Privacy"></a>
## Enum: privacy
Name | Value
---- | -----
privacy | open, closed, secret


<a id="NotificationSetting"></a>
## Enum: notification_setting
Name | Value
---- | -----
notificationSetting | notifications_enabled, notifications_disabled



