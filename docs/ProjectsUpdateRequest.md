
# ProjectsUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | Name of the project |  [optional]
**body** | **kotlin.String** | Body of the project |  [optional]
**state** | **kotlin.String** | State of the project; either &#39;open&#39; or &#39;closed&#39; |  [optional]
**organizationPermission** | [**inline**](#OrganizationPermission) | The baseline permission that all organization members have on this project |  [optional]
**&#x60;private&#x60;** | **kotlin.Boolean** | Whether or not this project can be seen by everyone. |  [optional]


<a id="OrganizationPermission"></a>
## Enum: organization_permission
Name | Value
---- | -----
organizationPermission | read, write, admin, none



