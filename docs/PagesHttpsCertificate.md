
# PagesHttpsCertificate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**inline**](#State) |  | 
**description** | **kotlin.String** |  | 
**domains** | **kotlin.collections.List&lt;kotlin.String&gt;** | Array of the domain set and its alternate name (if it is configured) | 
**expiresAt** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional]


<a id="State"></a>
## Enum: state
Name | Value
---- | -----
state | new, authorization_created, authorization_pending, authorized, authorization_revoked, issued, uploaded, approved, errored, bad_authz, destroy_pending, dns_changed



