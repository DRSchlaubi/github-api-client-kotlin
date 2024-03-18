
# ActionsSetSelectedReposForOrgSecretRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selectedRepositoryIds** | **kotlin.collections.List&lt;kotlin.Int&gt;** | An array of repository ids that can access the organization secret. You can only provide a list of repository ids when the &#x60;visibility&#x60; is set to &#x60;selected&#x60;. You can add and remove individual repositories using the [Add selected repository to an organization secret](https://docs.github.com/rest/actions/secrets#add-selected-repository-to-an-organization-secret) and [Remove selected repository from an organization secret](https://docs.github.com/rest/actions/secrets#remove-selected-repository-from-an-organization-secret) endpoints. | 



