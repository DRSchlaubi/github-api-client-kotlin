
# ReposCreateAutolinkRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keyPrefix** | **kotlin.String** | This prefix appended by certain characters will generate a link any time it is found in an issue, pull request, or commit. | 
**urlTemplate** | **kotlin.String** | The URL must contain &#x60;&lt;num&gt;&#x60; for the reference number. &#x60;&lt;num&gt;&#x60; matches different characters depending on the value of &#x60;is_alphanumeric&#x60;. | 
**isAlphanumeric** | **kotlin.Boolean** | Whether this autolink reference matches alphanumeric characters. If true, the &#x60;&lt;num&gt;&#x60; parameter of the &#x60;url_template&#x60; matches alphanumeric characters &#x60;A-Z&#x60; (case insensitive), &#x60;0-9&#x60;, and &#x60;-&#x60;. If false, this autolink reference only matches numeric characters. |  [optional]



