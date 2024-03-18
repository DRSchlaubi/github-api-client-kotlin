
# CodeScanningDefaultSetupUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**inline**](#State) | The desired state of code scanning default setup. |  [optional]
**querySuite** | [**inline**](#QuerySuite) | CodeQL query suite to be used. |  [optional]
**languages** | [**inline**](#kotlin.collections.List&lt;Languages&gt;) | CodeQL languages to be analyzed. |  [optional]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | configured, not-configured


<a id="QuerySuite"></a>
## Enum: query_suite
Name | Value
---- | -----
querySuite | default, extended


<a id="kotlin.collections.List<Languages>"></a>
## Enum: languages
Name | Value
---- | -----
languages | c-cpp, csharp, go, java-kotlin, javascript-typescript, python, ruby, swift



