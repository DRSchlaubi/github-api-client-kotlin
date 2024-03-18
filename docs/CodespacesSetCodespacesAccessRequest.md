
# CodespacesSetCodespacesAccessRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**visibility** | [**inline**](#Visibility) | Which users can access codespaces in the organization. &#x60;disabled&#x60; means that no users can access codespaces in the organization. | 
**selectedUsernames** | **kotlin.collections.List&lt;kotlin.String&gt;** | The usernames of the organization members who should have access to codespaces in the organization. Required when &#x60;visibility&#x60; is &#x60;selected_members&#x60;. The provided list of usernames will replace any existing value. |  [optional]


<a id="Visibility"></a>
## Enum: visibility
Name | Value
---- | -----
visibility | disabled, selected_members, all_members, all_members_and_outside_collaborators



