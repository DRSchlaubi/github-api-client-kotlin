
# CodeScanningSarifsStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**processingStatus** | [**inline**](#ProcessingStatus) | &#x60;pending&#x60; files have not yet been processed, while &#x60;complete&#x60; means results from the SARIF have been stored. &#x60;failed&#x60; files have either not been processed at all, or could only be partially processed. |  [optional]
**analysesUrl** | [**java.net.URI**](java.net.URI.md) | The REST API URL for getting the analyses associated with the upload. |  [optional] [readonly]
**errors** | **kotlin.collections.List&lt;kotlin.String&gt;** | Any errors that ocurred during processing of the delivery. |  [optional]


<a id="ProcessingStatus"></a>
## Enum: processing_status
Name | Value
---- | -----
processingStatus | pending, complete, failed



