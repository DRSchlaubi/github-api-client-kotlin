
# GistsUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **kotlin.String** | The description of the gist. |  [optional]
**files** | [**kotlin.Any**](.md) | The gist files to be updated, renamed, or deleted. Each &#x60;key&#x60; must match the current filename (including extension) of the targeted gist file. For example: &#x60;hello.py&#x60;.  To delete a file, set the whole file to null. For example: &#x60;hello.py : null&#x60;. The file will also be deleted if the specified object does not contain at least one of &#x60;content&#x60; or &#x60;filename&#x60;. |  [optional]



