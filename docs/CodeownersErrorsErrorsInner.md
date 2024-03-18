
# CodeownersErrorsErrorsInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**line** | **kotlin.Int** | The line number where this errors occurs. | 
**column** | **kotlin.Int** | The column number where this errors occurs. | 
**kind** | **kotlin.String** | The type of error. | 
**message** | **kotlin.String** | A human-readable description of the error, combining information from multiple fields, laid out for display in a monospaced typeface (for example, a command-line setting). | 
**path** | **kotlin.String** | The path of the file where the error occured. | 
**source** | **kotlin.String** | The contents of the line where the error occurs. |  [optional]
**suggestion** | **kotlin.String** | Suggested action to fix the error. This will usually be &#x60;null&#x60;, but is provided for some common errors. |  [optional]



