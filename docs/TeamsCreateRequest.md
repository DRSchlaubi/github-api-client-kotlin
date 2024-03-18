
# TeamsCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The name of the team. | 
**description** | **kotlin.String** | The description of the team. |  [optional]
**maintainers** | **kotlin.collections.List&lt;kotlin.String&gt;** | List GitHub IDs for organization members who will become team maintainers. |  [optional]
**repoNames** | **kotlin.collections.List&lt;kotlin.String&gt;** | The full name (e.g., \&quot;organization-name/repository-name\&quot;) of repositories to add the team to. |  [optional]
**privacy** | [**inline**](#Privacy) | The level of privacy this team should have. The options are:   **For a non-nested team:**    * &#x60;secret&#x60; - only visible to organization owners and members of this team.    * &#x60;closed&#x60; - visible to all members of this organization.   Default: &#x60;secret&#x60;   **For a parent or child team:**    * &#x60;closed&#x60; - visible to all members of this organization.   Default for child team: &#x60;closed&#x60; |  [optional]
**notificationSetting** | [**inline**](#NotificationSetting) | The notification setting the team has chosen. The options are:    * &#x60;notifications_enabled&#x60; - team members receive notifications when the team is @mentioned.    * &#x60;notifications_disabled&#x60; - no one receives notifications.   Default: &#x60;notifications_enabled&#x60; |  [optional]
**permission** | [**inline**](#Permission) | **Deprecated**. The permission that new repositories will be added to the team with when none is specified. |  [optional]
**parentTeamId** | **kotlin.Int** | The ID of a team to set as the parent team. |  [optional]


<a id="Privacy"></a>
## Enum: privacy
Name | Value
---- | -----
privacy | secret, closed


<a id="NotificationSetting"></a>
## Enum: notification_setting
Name | Value
---- | -----
notificationSetting | notifications_enabled, notifications_disabled


<a id="Permission"></a>
## Enum: permission
Name | Value
---- | -----
permission | pull, push



