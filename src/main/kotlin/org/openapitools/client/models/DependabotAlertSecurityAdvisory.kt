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

import org.openapitools.client.models.DependabotAlertSecurityAdvisoryCvss

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Details for the GitHub Security Advisory.
 *
 * @param ghsaId The unique GitHub Security Advisory ID assigned to the advisory.
 * @param cveId The unique CVE ID assigned to the advisory.
 * @param summary A short, plain text summary of the advisory.
 * @param description A long-form Markdown-supported description of the advisory.
 * @param vulnerabilities Vulnerable version range information for the advisory.
 * @param severity The severity of the advisory.
 * @param cvss 
 * @param cwes Details for the advisory pertaining to Common Weakness Enumeration.
 * @param identifiers Values that identify this advisory among security information sources.
 * @param references Links to additional advisory information.
 * @param publishedAt The time that the advisory was published in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
 * @param updatedAt The time that the advisory was last modified in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
 * @param withdrawnAt The time that the advisory was withdrawn in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
 */
@Serializable

data class DependabotAlertSecurityAdvisory (

    /* The unique GitHub Security Advisory ID assigned to the advisory. */
    @Contextual @SerialName(value = "ghsa_id")
    val ghsaId: kotlin.Any?,

    /* The unique CVE ID assigned to the advisory. */
    @Contextual @SerialName(value = "cve_id")
    val cveId: kotlin.Any?,

    /* A short, plain text summary of the advisory. */
    @Contextual @SerialName(value = "summary")
    val summary: kotlin.Any?,

    /* A long-form Markdown-supported description of the advisory. */
    @Contextual @SerialName(value = "description")
    val description: kotlin.Any?,

    /* Vulnerable version range information for the advisory. */
    @Contextual @SerialName(value = "vulnerabilities")
    val vulnerabilities: kotlin.Any?,

    /* The severity of the advisory. */
    @SerialName(value = "severity")
    val severity: DependabotAlertSecurityAdvisory.Severity?,

    @SerialName(value = "cvss")
    val cvss: DependabotAlertSecurityAdvisoryCvss,

    /* Details for the advisory pertaining to Common Weakness Enumeration. */
    @Contextual @SerialName(value = "cwes")
    val cwes: kotlin.Any?,

    /* Values that identify this advisory among security information sources. */
    @Contextual @SerialName(value = "identifiers")
    val identifiers: kotlin.Any?,

    /* Links to additional advisory information. */
    @Contextual @SerialName(value = "references")
    val references: kotlin.Any?,

    /* The time that the advisory was published in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. */
    @Contextual @SerialName(value = "published_at")
    val publishedAt: kotlin.Any?,

    /* The time that the advisory was last modified in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. */
    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlin.Any?,

    /* The time that the advisory was withdrawn in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. */
    @Contextual @SerialName(value = "withdrawn_at")
    val withdrawnAt: kotlin.Any?

) {

    /**
     * The severity of the advisory.
     *
     * Values: low,medium,high,critical
     */
    @Serializable
    enum class Severity(val value: kotlin.Any) {
        @SerialName(value = "low") low("low"),
        @SerialName(value = "medium") medium("medium"),
        @SerialName(value = "high") high("high"),
        @SerialName(value = "critical") critical("critical");
    }
}

