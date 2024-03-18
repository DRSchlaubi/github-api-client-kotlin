
# OrgCustomProperty

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyName** | **kotlin.String** | The name of the property | 
**valueType** | [**inline**](#ValueType) | The type of the value for the property | 
**required** | **kotlin.Boolean** | Whether the property is required. |  [optional]
**defaultValue** | **kotlin.String** | Default value of the property |  [optional]
**description** | **kotlin.String** | Short description of the property |  [optional]
**allowedValues** | **kotlin.collections.List&lt;kotlin.String&gt;** | An ordered list of the allowed values of the property. The property can have up to 200 allowed values. |  [optional]
**valuesEditableBy** | [**inline**](#ValuesEditableBy) | Who can edit the values of the property |  [optional]


<a id="ValueType"></a>
## Enum: value_type
Name | Value
---- | -----
valueType | string, single_select


<a id="ValuesEditableBy"></a>
## Enum: values_editable_by
Name | Value
---- | -----
valuesEditableBy | org_actors, org_and_repo_actors, 



