
# WebhookGollumPagesInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**inline**](#Action) | The action that was performed on the page. Can be &#x60;created&#x60; or &#x60;edited&#x60;. | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) | Points to the HTML wiki page. | 
**pageName** | **kotlin.String** | The name of the page. | 
**sha** | **kotlin.String** | The latest commit SHA of the page. | 
**summary** | **kotlin.String** |  | 
**title** | **kotlin.String** | The current page title. | 


<a id="Action"></a>
## Enum: action
Name | Value
---- | -----
action | created, edited



