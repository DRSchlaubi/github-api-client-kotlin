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

import org.openapitools.client.models.GlobalAdvisoryCreditsInner
import org.openapitools.client.models.GlobalAdvisoryCvss
import org.openapitools.client.models.GlobalAdvisoryCwesInner
import org.openapitools.client.models.GlobalAdvisoryIdentifiersInner
import org.openapitools.client.models.GlobalAdvisoryVulnerabilitiesInner

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A GitHub Security Advisory.
 *
 * @param ghsaId The GitHub Security Advisory ID.
 * @param cveId The Common Vulnerabilities and Exposures (CVE) ID.
 * @param url The API URL for the advisory.
 * @param htmlUrl The URL for the advisory.
 * @param repositoryAdvisoryUrl The API URL for the repository advisory.
 * @param summary A short summary of the advisory.
 * @param description A detailed description of what the advisory entails.
 * @param type The type of advisory.
 * @param severity The severity of the advisory.
 * @param sourceCodeLocation The URL of the advisory's source code.
 * @param identifiers 
 * @param references 
 * @param publishedAt The date and time of when the advisory was published, in ISO 8601 format.
 * @param updatedAt The date and time of when the advisory was last updated, in ISO 8601 format.
 * @param githubReviewedAt The date and time of when the advisory was reviewed by GitHub, in ISO 8601 format.
 * @param nvdPublishedAt The date and time when the advisory was published in the National Vulnerability Database, in ISO 8601 format. This field is only populated when the advisory is imported from the National Vulnerability Database.
 * @param withdrawnAt The date and time of when the advisory was withdrawn, in ISO 8601 format.
 * @param vulnerabilities The products and respective version ranges affected by the advisory.
 * @param cvss 
 * @param cwes 
 * @param credits The users who contributed to the advisory.
 */
@Serializable

data class GlobalAdvisory (

    /* The GitHub Security Advisory ID. */
    @SerialName(value = "ghsa_id")
    val ghsaId: kotlin.String,

    /* The Common Vulnerabilities and Exposures (CVE) ID. */
    @SerialName(value = "cve_id")
    val cveId: kotlin.String?,

    /* The API URL for the advisory. */
    @SerialName(value = "url")
    val url: kotlin.String,

    /* The URL for the advisory. */
    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    /* The API URL for the repository advisory. */
    @Contextual @SerialName(value = "repository_advisory_url")
    val repositoryAdvisoryUrl: java.net.URI?,

    /* A short summary of the advisory. */
    @SerialName(value = "summary")
    val summary: kotlin.String,

    /* A detailed description of what the advisory entails. */
    @SerialName(value = "description")
    val description: kotlin.String?,

    /* The type of advisory. */
    @SerialName(value = "type")
    val type: GlobalAdvisory.Type,

    /* The severity of the advisory. */
    @SerialName(value = "severity")
    val severity: GlobalAdvisory.Severity,

    /* The URL of the advisory's source code. */
    @Contextual @SerialName(value = "source_code_location")
    val sourceCodeLocation: java.net.URI?,

    @SerialName(value = "identifiers")
    val identifiers: kotlin.collections.List<GlobalAdvisoryIdentifiersInner>,

    @SerialName(value = "references")
    val references: kotlin.collections.List<kotlin.String>,

    /* The date and time of when the advisory was published, in ISO 8601 format. */
    @Contextual @SerialName(value = "published_at")
    val publishedAt: kotlinx.datetime.Instant,

    /* The date and time of when the advisory was last updated, in ISO 8601 format. */
    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    /* The date and time of when the advisory was reviewed by GitHub, in ISO 8601 format. */
    @Contextual @SerialName(value = "github_reviewed_at")
    val githubReviewedAt: kotlinx.datetime.Instant?,

    /* The date and time when the advisory was published in the National Vulnerability Database, in ISO 8601 format. This field is only populated when the advisory is imported from the National Vulnerability Database. */
    @Contextual @SerialName(value = "nvd_published_at")
    val nvdPublishedAt: kotlinx.datetime.Instant?,

    /* The date and time of when the advisory was withdrawn, in ISO 8601 format. */
    @Contextual @SerialName(value = "withdrawn_at")
    val withdrawnAt: kotlinx.datetime.Instant?,

    /* The products and respective version ranges affected by the advisory. */
    @SerialName(value = "vulnerabilities")
    val vulnerabilities: kotlin.collections.List<GlobalAdvisoryVulnerabilitiesInner>,

    @SerialName(value = "cvss")
    val cvss: GlobalAdvisoryCvss,

    @SerialName(value = "cwes")
    val cwes: kotlin.collections.List<GlobalAdvisoryCwesInner>,

    /* The users who contributed to the advisory. */
    @SerialName(value = "credits")
    val credits: kotlin.collections.List<GlobalAdvisoryCreditsInner>

) {

    /**
     * The type of advisory.
     *
     * Values: reviewed,unreviewed,malware
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "reviewed") reviewed("reviewed"),
        @SerialName(value = "unreviewed") unreviewed("unreviewed"),
        @SerialName(value = "malware") malware("malware");
    }
    /**
     * The severity of the advisory.
     *
     * Values: critical,high,medium,low,unknown
     */
    @Serializable
    enum class Severity(val value: kotlin.String) {
        @SerialName(value = "critical") critical("critical"),
        @SerialName(value = "high") high("high"),
        @SerialName(value = "medium") medium("medium"),
        @SerialName(value = "low") low("low"),
        @SerialName(value = "unknown") unknown("unknown");
    }
}

