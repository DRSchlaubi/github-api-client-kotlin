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

import org.openapitools.client.models.GlobalAdvisoryCvss
import org.openapitools.client.models.GlobalAdvisoryCwesInner
import org.openapitools.client.models.GlobalAdvisoryIdentifiersInner
import org.openapitools.client.models.RepositoryAdvisoryAuthor
import org.openapitools.client.models.RepositoryAdvisoryCredit
import org.openapitools.client.models.RepositoryAdvisoryCreditsInner
import org.openapitools.client.models.RepositoryAdvisoryPrivateFork
import org.openapitools.client.models.RepositoryAdvisoryPublisher
import org.openapitools.client.models.RepositoryAdvisorySubmission
import org.openapitools.client.models.RepositoryAdvisoryVulnerability
import org.openapitools.client.models.SimpleUser
import org.openapitools.client.models.Team

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A repository security advisory.
 *
 * @param ghsaId The GitHub Security Advisory ID.
 * @param cveId The Common Vulnerabilities and Exposures (CVE) ID.
 * @param url The API URL for the advisory.
 * @param htmlUrl The URL for the advisory.
 * @param summary A short summary of the advisory.
 * @param description A detailed description of what the advisory entails.
 * @param severity The severity of the advisory.
 * @param author 
 * @param publisher 
 * @param identifiers 
 * @param state The state of the advisory.
 * @param createdAt The date and time of when the advisory was created, in ISO 8601 format.
 * @param updatedAt The date and time of when the advisory was last updated, in ISO 8601 format.
 * @param publishedAt The date and time of when the advisory was published, in ISO 8601 format.
 * @param closedAt The date and time of when the advisory was closed, in ISO 8601 format.
 * @param withdrawnAt The date and time of when the advisory was withdrawn, in ISO 8601 format.
 * @param submission 
 * @param vulnerabilities 
 * @param cvss 
 * @param cwes 
 * @param cweIds A list of only the CWE IDs.
 * @param credits 
 * @param creditsDetailed 
 * @param collaboratingUsers A list of users that collaborate on the advisory.
 * @param collaboratingTeams A list of teams that collaborate on the advisory.
 * @param privateFork 
 */
@Serializable

data class RepositoryAdvisory (

    /* The GitHub Security Advisory ID. */
    @SerialName(value = "ghsa_id")
    val ghsaId: kotlin.String,

    /* The Common Vulnerabilities and Exposures (CVE) ID. */
    @SerialName(value = "cve_id")
    val cveId: kotlin.String?,

    /* The API URL for the advisory. */
    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    /* The URL for the advisory. */
    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    /* A short summary of the advisory. */
    @SerialName(value = "summary")
    val summary: kotlin.String,

    /* A detailed description of what the advisory entails. */
    @SerialName(value = "description")
    val description: kotlin.String?,

    /* The severity of the advisory. */
    @SerialName(value = "severity")
    val severity: RepositoryAdvisory.Severity?,

    @SerialName(value = "author")
    val author: RepositoryAdvisoryAuthor,

    @SerialName(value = "publisher")
    val publisher: RepositoryAdvisoryPublisher,

    @SerialName(value = "identifiers")
    val identifiers: kotlin.collections.List<GlobalAdvisoryIdentifiersInner>,

    /* The state of the advisory. */
    @SerialName(value = "state")
    val state: RepositoryAdvisory.State,

    /* The date and time of when the advisory was created, in ISO 8601 format. */
    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant?,

    /* The date and time of when the advisory was last updated, in ISO 8601 format. */
    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant?,

    /* The date and time of when the advisory was published, in ISO 8601 format. */
    @Contextual @SerialName(value = "published_at")
    val publishedAt: kotlinx.datetime.Instant?,

    /* The date and time of when the advisory was closed, in ISO 8601 format. */
    @Contextual @SerialName(value = "closed_at")
    val closedAt: kotlinx.datetime.Instant?,

    /* The date and time of when the advisory was withdrawn, in ISO 8601 format. */
    @Contextual @SerialName(value = "withdrawn_at")
    val withdrawnAt: kotlinx.datetime.Instant?,

    @SerialName(value = "submission")
    val submission: RepositoryAdvisorySubmission,

    @SerialName(value = "vulnerabilities")
    val vulnerabilities: kotlin.collections.List<RepositoryAdvisoryVulnerability>,

    @SerialName(value = "cvss")
    val cvss: GlobalAdvisoryCvss,

    @SerialName(value = "cwes")
    val cwes: kotlin.collections.List<GlobalAdvisoryCwesInner>,

    /* A list of only the CWE IDs. */
    @SerialName(value = "cwe_ids")
    val cweIds: kotlin.collections.List<kotlin.String>,

    @SerialName(value = "credits")
    val credits: kotlin.collections.List<RepositoryAdvisoryCreditsInner>,

    @SerialName(value = "credits_detailed")
    val creditsDetailed: kotlin.collections.List<RepositoryAdvisoryCredit>,

    /* A list of users that collaborate on the advisory. */
    @SerialName(value = "collaborating_users")
    val collaboratingUsers: kotlin.collections.List<SimpleUser>,

    /* A list of teams that collaborate on the advisory. */
    @SerialName(value = "collaborating_teams")
    val collaboratingTeams: kotlin.collections.List<Team>,

    @SerialName(value = "private_fork")
    val privateFork: RepositoryAdvisoryPrivateFork

) {

    /**
     * The severity of the advisory.
     *
     * Values: critical,high,medium,low,`null`
     */
    @Serializable
    enum class Severity(val value: kotlin.String) {
        @SerialName(value = "critical") critical("critical"),
        @SerialName(value = "high") high("high"),
        @SerialName(value = "medium") medium("medium"),
        @SerialName(value = "low") low("low"),
        @SerialName(value = "null") `null`("null");
    }
    /**
     * The state of the advisory.
     *
     * Values: published,closed,withdrawn,draft,triage
     */
    @Serializable
    enum class State(val value: kotlin.String) {
        @SerialName(value = "published") published("published"),
        @SerialName(value = "closed") closed("closed"),
        @SerialName(value = "withdrawn") withdrawn("withdrawn"),
        @SerialName(value = "draft") draft("draft"),
        @SerialName(value = "triage") triage("triage");
    }
}

