
# CodespacesCreateOrUpdateOrgSecretRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**visibility** | [**inline**](#Visibility) | Which type of organization repositories have access to the organization secret. &#x60;selected&#x60; means only the repositories specified by &#x60;selected_repository_ids&#x60; can access the secret. | 
**encryptedValue** | **kotlin.String** | The value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get an organization public key](https://docs.github.com/rest/codespaces/organization-secrets#get-an-organization-public-key) endpoint. |  [optional]
**keyId** | **kotlin.String** | The ID of the key you used to encrypt the secret. |  [optional]
**selectedRepositoryIds** | **kotlin.collections.List&lt;kotlin.Int&gt;** | An array of repository IDs that can access the organization secret. You can only provide a list of repository IDs when the &#x60;visibility&#x60; is set to &#x60;selected&#x60;. You can manage the list of selected repositories using the [List selected repositories for an organization secret](https://docs.github.com/rest/codespaces/organization-secrets#list-selected-repositories-for-an-organization-secret), [Set selected repositories for an organization secret](https://docs.github.com/rest/codespaces/organization-secrets#set-selected-repositories-for-an-organization-secret), and [Remove selected repository from an organization secret](https://docs.github.com/rest/codespaces/organization-secrets#remove-selected-repository-from-an-organization-secret) endpoints. |  [optional]


<a id="Visibility"></a>
## Enum: visibility
Name | Value
---- | -----
visibility | all, private, selected



