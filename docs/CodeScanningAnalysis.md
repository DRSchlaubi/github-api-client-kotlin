
# CodeScanningAnalysis

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ref** | **kotlin.String** | The Git reference, formatted as &#x60;refs/pull/&lt;number&gt;/merge&#x60;, &#x60;refs/pull/&lt;number&gt;/head&#x60;, &#x60;refs/heads/&lt;branch name&gt;&#x60; or simply &#x60;&lt;branch name&gt;&#x60;. | 
**commitSha** | **kotlin.String** | The SHA of the commit to which the analysis you are uploading relates. | 
**analysisKey** | **kotlin.String** | Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name. | 
**environment** | **kotlin.String** | Identifies the variable values associated with the environment in which this analysis was performed. | 
**error** | **kotlin.String** |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time that the analysis was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. |  [readonly]
**resultsCount** | **kotlin.Int** | The total number of results in the analysis. | 
**rulesCount** | **kotlin.Int** | The total number of rules used in the analysis. | 
**id** | **kotlin.Int** | Unique identifier for this analysis. | 
**url** | [**java.net.URI**](java.net.URI.md) | The REST API URL of the analysis resource. |  [readonly]
**sarifId** | **kotlin.String** | An identifier for the upload. | 
**tool** | [**CodeScanningAnalysisTool**](CodeScanningAnalysisTool.md) |  | 
**deletable** | **kotlin.Boolean** |  | 
**warning** | **kotlin.String** | Warning generated when processing the analysis | 
**category** | **kotlin.String** | Identifies the configuration under which the analysis was executed. Used to distinguish between multiple analyses for the same tool and commit, but performed on different languages or different parts of the code. |  [optional]



