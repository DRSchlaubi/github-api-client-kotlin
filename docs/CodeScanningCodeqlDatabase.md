
# CodeScanningCodeqlDatabase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | The ID of the CodeQL database. | 
**name** | **kotlin.String** | The name of the CodeQL database. | 
**language** | **kotlin.String** | The language of the CodeQL database. | 
**uploader** | [**SimpleUser**](SimpleUser.md) |  | 
**contentType** | **kotlin.String** | The MIME type of the CodeQL database file. | 
**propertySize** | **kotlin.Int** | The size of the CodeQL database file in bytes. | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time at which the CodeQL database was created, in ISO 8601 format&#39;:&#39; YYYY-MM-DDTHH:MM:SSZ. | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time at which the CodeQL database was last updated, in ISO 8601 format&#39;:&#39; YYYY-MM-DDTHH:MM:SSZ. | 
**url** | [**java.net.URI**](java.net.URI.md) | The URL at which to download the CodeQL database. The &#x60;Accept&#x60; header must be set to the value of the &#x60;content_type&#x60; property. | 
**commitOid** | **kotlin.String** | The commit SHA of the repository at the time the CodeQL database was created. |  [optional]



