
# OrgsEnableOrDisableSecurityProductOnAllOrgReposRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**querySuite** | [**inline**](#QuerySuite) | CodeQL query suite to be used. If you specify the &#x60;query_suite&#x60; parameter, the default setup will be configured with this query suite only on all repositories that didn&#39;t have default setup already configured. It will not change the query suite on repositories that already have default setup configured. If you don&#39;t specify any &#x60;query_suite&#x60; in your request, the preferred query suite of the organization will be applied. |  [optional]


<a id="QuerySuite"></a>
## Enum: query_suite
Name | Value
---- | -----
querySuite | default, extended



