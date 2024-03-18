
# CodeScanningDefaultSetup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**inline**](#State) | Code scanning default setup has been configured or not. |  [optional]
**languages** | [**inline**](#kotlin.collections.List&lt;Languages&gt;) | Languages to be analyzed. |  [optional]
**querySuite** | [**inline**](#QuerySuite) | CodeQL query suite to be used. |  [optional]
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | Timestamp of latest configuration update. |  [optional]
**schedule** | [**inline**](#Schedule) | The frequency of the periodic analysis. |  [optional]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | configured, not-configured


<a id="kotlin.collections.List<Languages>"></a>
## Enum: languages
Name | Value
---- | -----
languages | c-cpp, csharp, go, java-kotlin, javascript-typescript, javascript, python, ruby, typescript, swift


<a id="QuerySuite"></a>
## Enum: query_suite
Name | Value
---- | -----
querySuite | default, extended


<a id="Schedule"></a>
## Enum: schedule
Name | Value
---- | -----
schedule | weekly, 



