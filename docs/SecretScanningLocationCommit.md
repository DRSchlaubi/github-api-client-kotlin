
# SecretScanningLocationCommit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | **kotlin.String** | The file path in the repository | 
**startLine** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Line number at which the secret starts in the file | 
**endLine** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Line number at which the secret ends in the file | 
**startColumn** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The column at which the secret starts within the start line when the file is interpreted as 8BIT ASCII | 
**endColumn** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The column at which the secret ends within the end line when the file is interpreted as 8BIT ASCII | 
**blobSha** | **kotlin.String** | SHA-1 hash ID of the associated blob | 
**blobUrl** | **kotlin.String** | The API URL to get the associated blob resource | 
**commitSha** | **kotlin.String** | SHA-1 hash ID of the associated commit | 
**commitUrl** | **kotlin.String** | The API URL to get the associated commit resource | 



