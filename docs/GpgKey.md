
# GpgKey

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** |  | 
**primaryKeyId** | **kotlin.Int** |  | 
**keyId** | **kotlin.String** |  | 
**publicKey** | **kotlin.String** |  | 
**emails** | [**kotlin.collections.List&lt;GpgKeyEmailsInner&gt;**](GpgKeyEmailsInner.md) |  | 
**subkeys** | [**kotlin.collections.List&lt;GpgKeySubkeysInner&gt;**](GpgKeySubkeysInner.md) |  | 
**canSign** | **kotlin.Boolean** |  | 
**canEncryptComms** | **kotlin.Boolean** |  | 
**canEncryptStorage** | **kotlin.Boolean** |  | 
**canCertify** | **kotlin.Boolean** |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**expiresAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**revoked** | **kotlin.Boolean** |  | 
**rawKey** | **kotlin.String** |  | 
**name** | **kotlin.String** |  |  [optional]



