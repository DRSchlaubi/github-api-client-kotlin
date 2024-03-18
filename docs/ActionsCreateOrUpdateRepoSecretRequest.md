
# ActionsCreateOrUpdateRepoSecretRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encryptedValue** | **kotlin.String** | Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get a repository public key](https://docs.github.com/rest/actions/secrets#get-a-repository-public-key) endpoint. |  [optional]
**keyId** | **kotlin.String** | ID of the key you used to encrypt the secret. |  [optional]



