
# OrgMembership

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**state** | [**inline**](#State) | The state of the member in the organization. The &#x60;pending&#x60; state indicates the user has not yet accepted an invitation. | 
**role** | [**inline**](#Role) | The user&#39;s membership type in the organization. | 
**organizationUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**organization** | [**OrganizationSimple**](OrganizationSimple.md) |  | 
**user** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**permissions** | [**OrgMembershipPermissions**](OrgMembershipPermissions.md) |  |  [optional]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | active, pending


<a id="Role"></a>
## Enum: role
Name | Value
---- | -----
role | admin, member, billing_manager



