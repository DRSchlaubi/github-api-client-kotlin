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
import org.openapitools.client.models.License
import org.openapitools.client.models.LicenseContent
import org.openapitools.client.models.LicenseSimple

import org.openapitools.client.infrastructure.*
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder

    open class LicensesApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    ) : ApiClient(
        baseUrl,
        httpClientEngine,
        httpClientConfig,
    ) {

        /**
        * Get a license
        * Gets information about a specific license. For more information, see \&quot;[Licensing a repository ](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/licensing-a-repository).\&quot;
         * @param license  
         * @return License
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun licensesGet(license: kotlin.String): HttpResponse<License> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/licenses/{license}".replace("{" + "license" + "}", "$license"),
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
        * Get all commonly used licenses
        * Lists the most commonly used licenses on GitHub. For more information, see \&quot;[Licensing a repository ](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/licensing-a-repository).\&quot;
         * @param featured  (optional)
         * @param perPage The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; (optional, default to 30)
         * @param page The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; (optional, default to 1)
         * @return kotlin.collections.List<LicenseSimple>
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun licensesGetAllCommonlyUsed(featured: kotlin.Boolean?, perPage: kotlin.Int?, page: kotlin.Int?): HttpResponse<kotlin.collections.List<LicenseSimple>> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()
            featured?.apply { localVariableQuery["featured"] = listOf("$featured") }
            perPage?.apply { localVariableQuery["per_page"] = listOf("$perPage") }
            page?.apply { localVariableQuery["page"] = listOf("$page") }

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/licenses",
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
        * Get the license for a repository
        * This method returns the contents of the repository&#39;s license file, if one is detected.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw contents of the license. - **&#x60;application/vnd.github.html+json&#x60;**: Returns the license contents in HTML. Markup languages are rendered to HTML using GitHub&#39;s open-source [Markup library](https://github.com/github/markup).
         * @param owner The account owner of the repository. The name is not case sensitive. 
         * @param repo The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. 
         * @param ref The Git reference for the results you want to list. The &#x60;ref&#x60; for a branch can be formatted either as &#x60;refs/heads/&lt;branch name&gt;&#x60; or simply &#x60;&lt;branch name&gt;&#x60;. To reference a pull request use &#x60;refs/pull/&lt;number&gt;/merge&#x60;. (optional)
         * @return LicenseContent
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun licensesGetForRepo(owner: kotlin.String, repo: kotlin.String, ref: kotlin.String?): HttpResponse<LicenseContent> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = 
                    io.ktor.client.utils.EmptyContent

            val localVariableQuery = mutableMapOf<String, List<String>>()
            ref?.apply { localVariableQuery["ref"] = listOf("$ref") }

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/repos/{owner}/{repo}/license".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo"),
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

        }