
# OrgsCreateInvitationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inviteeId** | **kotlin.Int** | **Required unless you provide &#x60;email&#x60;**. GitHub user ID for the person you are inviting. |  [optional]
**email** | **kotlin.String** | **Required unless you provide &#x60;invitee_id&#x60;**. Email address of the person you are inviting, which can be an existing GitHub user. |  [optional]
**role** | [**inline**](#Role) | The role for the new member.   * &#x60;admin&#x60; - Organization owners with full administrative rights to the organization and complete access to all repositories and teams.    * &#x60;direct_member&#x60; - Non-owner organization members with ability to see other members and join teams by invitation.    * &#x60;billing_manager&#x60; - Non-owner organization members with ability to manage the billing settings of your organization.   * &#x60;reinstate&#x60; - The previous role assigned to the invitee before they were removed from your organization. Can be one of the roles listed above. Only works if the invitee was previously part of your organization. |  [optional]
**teamIds** | **kotlin.collections.List&lt;kotlin.Int&gt;** | Specify IDs for the teams you want to invite new members to. |  [optional]


<a id="Role"></a>
## Enum: role
Name | Value
---- | -----
role | admin, direct_member, billing_manager, reinstate



