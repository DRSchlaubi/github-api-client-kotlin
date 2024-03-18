
# ActionsCreateOrUpdateEnvironmentSecretRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encryptedValue** | **kotlin.String** | Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get an environment public key](https://docs.github.com/rest/actions/secrets#get-an-environment-public-key) endpoint. | 
**keyId** | **kotlin.String** | ID of the key you used to encrypt the secret. | 



