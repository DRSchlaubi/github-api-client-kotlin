/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param visibility Which type of organization repositories have access to the organization secret. `selected` means only the repositories specified by `selected_repository_ids` can access the secret.
 * @param encryptedValue Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get an organization public key](https://docs.github.com/rest/dependabot/secrets#get-an-organization-public-key) endpoint.
 * @param keyId ID of the key you used to encrypt the secret.
 * @param selectedRepositoryIds An array of repository ids that can access the organization secret. You can only provide a list of repository ids when the `visibility` is set to `selected`. You can manage the list of selected repositories using the [List selected repositories for an organization secret](https://docs.github.com/rest/dependabot/secrets#list-selected-repositories-for-an-organization-secret), [Set selected repositories for an organization secret](https://docs.github.com/rest/dependabot/secrets#set-selected-repositories-for-an-organization-secret), and [Remove selected repository from an organization secret](https://docs.github.com/rest/dependabot/secrets#remove-selected-repository-from-an-organization-secret) endpoints.
 */
@Serializable

data class DependabotCreateOrUpdateOrgSecretRequest (

    /* Which type of organization repositories have access to the organization secret. `selected` means only the repositories specified by `selected_repository_ids` can access the secret. */
    @SerialName(value = "visibility")
    val visibility: DependabotCreateOrUpdateOrgSecretRequest.Visibility,

    /* Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get an organization public key](https://docs.github.com/rest/dependabot/secrets#get-an-organization-public-key) endpoint. */
    @SerialName(value = "encrypted_value")
    val encryptedValue: kotlin.String? = null,

    /* ID of the key you used to encrypt the secret. */
    @SerialName(value = "key_id")
    val keyId: kotlin.String? = null,

    /* An array of repository ids that can access the organization secret. You can only provide a list of repository ids when the `visibility` is set to `selected`. You can manage the list of selected repositories using the [List selected repositories for an organization secret](https://docs.github.com/rest/dependabot/secrets#list-selected-repositories-for-an-organization-secret), [Set selected repositories for an organization secret](https://docs.github.com/rest/dependabot/secrets#set-selected-repositories-for-an-organization-secret), and [Remove selected repository from an organization secret](https://docs.github.com/rest/dependabot/secrets#remove-selected-repository-from-an-organization-secret) endpoints. */
    @SerialName(value = "selected_repository_ids")
    val selectedRepositoryIds: kotlin.collections.List<kotlin.String>? = null

) {

    /**
     * Which type of organization repositories have access to the organization secret. `selected` means only the repositories specified by `selected_repository_ids` can access the secret.
     *
     * Values: all,`private`,selected
     */
    @Serializable
    enum class Visibility(val value: kotlin.String) {
        @SerialName(value = "all") all("all"),
        @SerialName(value = "private") `private`("private"),
        @SerialName(value = "selected") selected("selected");
    }
}

