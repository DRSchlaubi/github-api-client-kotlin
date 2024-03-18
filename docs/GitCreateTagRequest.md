
# GitCreateTagRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tag** | **kotlin.String** | The tag&#39;s name. This is typically a version (e.g., \&quot;v0.0.1\&quot;). | 
**message** | **kotlin.String** | The tag message. | 
**&#x60;object&#x60;** | **kotlin.String** | The SHA of the git object this is tagging. | 
**type** | [**inline**](#Type) | The type of the object we&#39;re tagging. Normally this is a &#x60;commit&#x60; but it can also be a &#x60;tree&#x60; or a &#x60;blob&#x60;. | 
**tagger** | [**GitCreateTagRequestTagger**](GitCreateTagRequestTagger.md) |  |  [optional]


<a id="Type"></a>
## Enum: type
Name | Value
---- | -----
type | commit, tree, blob



