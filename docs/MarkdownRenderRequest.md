
# MarkdownRenderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **kotlin.String** | The Markdown text to render in HTML. | 
**mode** | [**inline**](#Mode) | The rendering mode. |  [optional]
**context** | **kotlin.String** | The repository context to use when creating references in &#x60;gfm&#x60; mode.  For example, setting &#x60;context&#x60; to &#x60;octo-org/octo-repo&#x60; will change the text &#x60;#42&#x60; into an HTML link to issue 42 in the &#x60;octo-org/octo-repo&#x60; repository. |  [optional]


<a id="Mode"></a>
## Enum: mode
Name | Value
---- | -----
mode | markdown, gfm



