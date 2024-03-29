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

package org.openapitools.client.apis

import org.openapitools.client.models.BasicError
import org.openapitools.client.models.OrganizationSecretScanningAlert
import org.openapitools.client.models.SecretScanningAlert
import org.openapitools.client.models.SecretScanningLocation
import org.openapitools.client.models.SecretScanningUpdateAlertRequest

import org.openapitools.client.infrastructure.*
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder

    open class SecretScanningApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    ) : ApiClient(
        baseUrl,
        httpClientEngine,
        httpClientConfig,
    ) {

        /**
        * Get a secret scanning alert
        * Gets a single secret scanning alert detected in an eligible repository.  The authenticated user must be an administrator for the repository or for the organization that owns the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;security_events&#x60; scope to use this endpoint. If this endpoint is only used with public repositories, the token can use the &#x60;public_repo&#x60; scope instead.
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the &#x60;number&#x60; field in the response from the &#x60;GET /repos/{owner}/{repo}/code-scanning/alerts&#x60; operation. 
         * @return SecretScanningAlert
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun secretScanningGetAlert(owner: kotlin.String, repo: kotlin.String, alertNumber: kotlin.Int): HttpResponse<SecretScanningAlert> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "alert_number" + "}", "$alertNumber"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * List secret scanning alerts for an enterprise
        * Lists secret scanning alerts for eligible repositories in an enterprise, from newest to oldest.  Alerts are only returned for organizations in the enterprise for which the authenticated user is an organization owner or a [security manager](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).  The authenticated user must be a member of the enterprise in order to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope or &#x60;security_events&#x60; scope to use this endpoint.
         * @param enterprise The slug version of the enterprise name. You can also substitute this value with the enterprise id. 
         * @param state Set to &#x60;open&#x60; or &#x60;resolved&#x60; to only list secret scanning alerts in a specific state. (optional)
         * @param secretType A comma-separated list of secret types to return. By default all secret types are returned. See \&quot;[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)\&quot; for a complete list of secret types. (optional)
         * @param resolution A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are &#x60;false_positive&#x60;, &#x60;wont_fix&#x60;, &#x60;revoked&#x60;, &#x60;pattern_edited&#x60;, &#x60;pattern_deleted&#x60; or &#x60;used_in_tests&#x60;. (optional)
         * @param sort The property to sort the results by. &#x60;created&#x60; means when the alert was created. &#x60;updated&#x60; means when the alert was updated or resolved. (optional, default to created)
         * @param direction The direction to sort the results by. (optional, default to desc)
         * @param perPage The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; (optional, default to 30)
         * @param before A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; (optional)
         * @param after A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; (optional)
         * @param validity A comma-separated list of validities that, when present, will return alerts that match the validities in this list. Valid options are &#x60;active&#x60;, &#x60;inactive&#x60;, and &#x60;unknown&#x60;. (optional)
         * @return kotlin.collections.List<OrganizationSecretScanningAlert>
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun secretScanningListAlertsForEnterprise(enterprise: kotlin.String, state: kotlin.String?, secretType: kotlin.String?, resolution: kotlin.String?, sort: kotlin.String?, direction: kotlin.String?, perPage: kotlin.Int?, before: kotlin.String?, after: kotlin.String?, validity: kotlin.String?): HttpResponse<kotlin.collections.List<OrganizationSecretScanningAlert>> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()
            state?.apply { localVariableQuery["state"] = listOf("$state") }
            secretType?.apply { localVariableQuery["secret_type"] = listOf("$secretType") }
            resolution?.apply { localVariableQuery["resolution"] = listOf("$resolution") }
            sort?.apply { localVariableQuery["sort"] = listOf("$sort") }
            direction?.apply { localVariableQuery["direction"] = listOf("$direction") }
            perPage?.apply { localVariableQuery["per_page"] = listOf("$perPage") }
            before?.apply { localVariableQuery["before"] = listOf("$before") }
            after?.apply { localVariableQuery["after"] = listOf("$after") }
            validity?.apply { localVariableQuery["validity"] = listOf("$validity") }

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/enterprises/{enterprise}/secret-scanning/alerts".replace("{" + "enterprise" + "}", "$enterprise"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * List secret scanning alerts for an organization
        * Lists secret scanning alerts for eligible repositories in an organization, from newest to oldest.  The authenticated user must be an administrator or security manager for the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;security_events&#x60; scope to use this endpoint. If this endpoint is only used with public repositories, the token can use the &#x60;public_repo&#x60; scope instead.
         * @param org The organization name. The name is not case sensitive. 
         * @param state Set to &#x60;open&#x60; or &#x60;resolved&#x60; to only list secret scanning alerts in a specific state. (optional)
         * @param secretType A comma-separated list of secret types to return. By default all secret types are returned. See \&quot;[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)\&quot; for a complete list of secret types. (optional)
         * @param resolution A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are &#x60;false_positive&#x60;, &#x60;wont_fix&#x60;, &#x60;revoked&#x60;, &#x60;pattern_edited&#x60;, &#x60;pattern_deleted&#x60; or &#x60;used_in_tests&#x60;. (optional)
         * @param sort The property to sort the results by. &#x60;created&#x60; means when the alert was created. &#x60;updated&#x60; means when the alert was updated or resolved. (optional, default to created)
         * @param direction The direction to sort the results by. (optional, default to desc)
         * @param page The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; (optional, default to 1)
         * @param perPage The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; (optional, default to 30)
         * @param before A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for events before this cursor. To receive an initial cursor on your first request, include an empty \&quot;before\&quot; query string. (optional)
         * @param after A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for events after this cursor.  To receive an initial cursor on your first request, include an empty \&quot;after\&quot; query string. (optional)
         * @param validity A comma-separated list of validities that, when present, will return alerts that match the validities in this list. Valid options are &#x60;active&#x60;, &#x60;inactive&#x60;, and &#x60;unknown&#x60;. (optional)
         * @return kotlin.collections.List<OrganizationSecretScanningAlert>
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun secretScanningListAlertsForOrg(org: kotlin.String, state: kotlin.String?, secretType: kotlin.String?, resolution: kotlin.String?, sort: kotlin.String?, direction: kotlin.String?, page: kotlin.Int?, perPage: kotlin.Int?, before: kotlin.String?, after: kotlin.String?, validity: kotlin.String?): HttpResponse<kotlin.collections.List<OrganizationSecretScanningAlert>> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()
            state?.apply { localVariableQuery["state"] = listOf("$state") }
            secretType?.apply { localVariableQuery["secret_type"] = listOf("$secretType") }
            resolution?.apply { localVariableQuery["resolution"] = listOf("$resolution") }
            sort?.apply { localVariableQuery["sort"] = listOf("$sort") }
            direction?.apply { localVariableQuery["direction"] = listOf("$direction") }
            page?.apply { localVariableQuery["page"] = listOf("$page") }
            perPage?.apply { localVariableQuery["per_page"] = listOf("$perPage") }
            before?.apply { localVariableQuery["before"] = listOf("$before") }
            after?.apply { localVariableQuery["after"] = listOf("$after") }
            validity?.apply { localVariableQuery["validity"] = listOf("$validity") }

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/orgs/{org}/secret-scanning/alerts".replace("{" + "org" + "}", "$org"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * List secret scanning alerts for a repository
        * Lists secret scanning alerts for an eligible repository, from newest to oldest.  The authenticated user must be an administrator for the repository or for the organization that owns the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;security_events&#x60; scope to use this endpoint. If this endpoint is only used with public repositories, the token can use the &#x60;public_repo&#x60; scope instead.
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param state Set to &#x60;open&#x60; or &#x60;resolved&#x60; to only list secret scanning alerts in a specific state. (optional)
         * @param secretType A comma-separated list of secret types to return. By default all secret types are returned. See \&quot;[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)\&quot; for a complete list of secret types. (optional)
         * @param resolution A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are &#x60;false_positive&#x60;, &#x60;wont_fix&#x60;, &#x60;revoked&#x60;, &#x60;pattern_edited&#x60;, &#x60;pattern_deleted&#x60; or &#x60;used_in_tests&#x60;. (optional)
         * @param sort The property to sort the results by. &#x60;created&#x60; means when the alert was created. &#x60;updated&#x60; means when the alert was updated or resolved. (optional, default to created)
         * @param direction The direction to sort the results by. (optional, default to desc)
         * @param page The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; (optional, default to 1)
         * @param perPage The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; (optional, default to 30)
         * @param before A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for events before this cursor. To receive an initial cursor on your first request, include an empty \&quot;before\&quot; query string. (optional)
         * @param after A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for events after this cursor.  To receive an initial cursor on your first request, include an empty \&quot;after\&quot; query string. (optional)
         * @param validity A comma-separated list of validities that, when present, will return alerts that match the validities in this list. Valid options are &#x60;active&#x60;, &#x60;inactive&#x60;, and &#x60;unknown&#x60;. (optional)
         * @return kotlin.collections.List<SecretScanningAlert>
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun secretScanningListAlertsForRepo(owner: kotlin.String, repo: kotlin.String, state: kotlin.String?, secretType: kotlin.String?, resolution: kotlin.String?, sort: kotlin.String?, direction: kotlin.String?, page: kotlin.Int?, perPage: kotlin.Int?, before: kotlin.String?, after: kotlin.String?, validity: kotlin.String?): HttpResponse<kotlin.collections.List<SecretScanningAlert>> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()
            state?.apply { localVariableQuery["state"] = listOf("$state") }
            secretType?.apply { localVariableQuery["secret_type"] = listOf("$secretType") }
            resolution?.apply { localVariableQuery["resolution"] = listOf("$resolution") }
            sort?.apply { localVariableQuery["sort"] = listOf("$sort") }
            direction?.apply { localVariableQuery["direction"] = listOf("$direction") }
            page?.apply { localVariableQuery["page"] = listOf("$page") }
            perPage?.apply { localVariableQuery["per_page"] = listOf("$perPage") }
            before?.apply { localVariableQuery["before"] = listOf("$before") }
            after?.apply { localVariableQuery["after"] = listOf("$after") }
            validity?.apply { localVariableQuery["validity"] = listOf("$validity") }

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/repos/{owner}/{repo}/secret-scanning/alerts".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * List locations for a secret scanning alert
        * Lists all locations for a given secret scanning alert for an eligible repository.  The authenticated user must be an administrator for the repository or for the organization that owns the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;security_events&#x60; scope to use this endpoint. If this endpoint is only used with public repositories, the token can use the &#x60;public_repo&#x60; scope instead.
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the &#x60;number&#x60; field in the response from the &#x60;GET /repos/{owner}/{repo}/code-scanning/alerts&#x60; operation. 
         * @param page The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; (optional, default to 1)
         * @param perPage The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; (optional, default to 30)
         * @return kotlin.collections.List<SecretScanningLocation>
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun secretScanningListLocationsForAlert(owner: kotlin.String, repo: kotlin.String, alertNumber: kotlin.Int, page: kotlin.Int?, perPage: kotlin.Int?): HttpResponse<kotlin.collections.List<SecretScanningLocation>> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()
            page?.apply { localVariableQuery["page"] = listOf("$page") }
            perPage?.apply { localVariableQuery["per_page"] = listOf("$perPage") }

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}/locations".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "alert_number" + "}", "$alertNumber"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        /**
        * Update a secret scanning alert
        * Updates the status of a secret scanning alert in an eligible repository.  The authenticated user must be an administrator for the repository or for the organization that owns the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;security_events&#x60; scope to use this endpoint. If this endpoint is only used with public repositories, the token can use the &#x60;public_repo&#x60; scope instead.
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the &#x60;number&#x60; field in the response from the &#x60;GET /repos/{owner}/{repo}/code-scanning/alerts&#x60; operation. 
         * @param secretScanningUpdateAlertRequest  
         * @return SecretScanningAlert
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun secretScanningUpdateAlert(owner: kotlin.String, repo: kotlin.String, alertNumber: kotlin.Int, secretScanningUpdateAlertRequest: SecretScanningUpdateAlertRequest): HttpResponse<SecretScanningAlert> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = secretScanningUpdateAlertRequest

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PATCH,
            "/repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "alert_number" + "}", "$alertNumber"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        }
