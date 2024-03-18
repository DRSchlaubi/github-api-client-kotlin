
# OrganizationRole

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | The unique identifier of the role. | 
**name** | **kotlin.String** | The name of the role. | 
**permissions** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of permissions included in this role. | 
**organization** | [**IntegrationOwner**](IntegrationOwner.md) |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time the role was created. | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time the role was last updated. | 
**description** | **kotlin.String** | A short description about who this role is for or what permissions it grants. |  [optional]



