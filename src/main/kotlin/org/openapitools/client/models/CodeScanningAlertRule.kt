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
 * @param id A unique identifier for the rule used to detect the alert.
 * @param name The name of the rule used to detect the alert.
 * @param severity The severity of the alert.
 * @param securitySeverityLevel The security severity of the alert.
 * @param description A short description of the rule used to detect the alert.
 * @param fullDescription description of the rule used to detect the alert.
 * @param tags A set of tags applicable for the rule.
 * @param help Detailed documentation for the rule as GitHub Flavored Markdown.
 * @param helpUri A link to the documentation for the rule used to detect the alert.
 */
@Serializable

data class CodeScanningAlertRule (

    /* A unique identifier for the rule used to detect the alert. */
    @SerialName(value = "id")
    val id: kotlin.String? = null,

    /* The name of the rule used to detect the alert. */
    @SerialName(value = "name")
    val name: kotlin.String? = null,

    /* The severity of the alert. */
    @SerialName(value = "severity")
    val severity: CodeScanningAlertRule.Severity? = null,

    /* The security severity of the alert. */
    @SerialName(value = "security_severity_level")
    val securitySeverityLevel: CodeScanningAlertRule.SecuritySeverityLevel? = null,

    /* A short description of the rule used to detect the alert. */
    @SerialName(value = "description")
    val description: kotlin.String? = null,

    /* description of the rule used to detect the alert. */
    @SerialName(value = "full_description")
    val fullDescription: kotlin.String? = null,

    /* A set of tags applicable for the rule. */
    @SerialName(value = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    /* Detailed documentation for the rule as GitHub Flavored Markdown. */
    @SerialName(value = "help")
    val help: kotlin.String? = null,

    /* A link to the documentation for the rule used to detect the alert. */
    @SerialName(value = "help_uri")
    val helpUri: kotlin.String? = null

) {

    /**
     * The severity of the alert.
     *
     * Values: none,note,warning,error,`null`
     */
    @Serializable
    enum class Severity(val value: kotlin.String) {
        @SerialName(value = "none") none("none"),
        @SerialName(value = "note") note("note"),
        @SerialName(value = "warning") warning("warning"),
        @SerialName(value = "error") error("error"),
        @SerialName(value = "null") `null`("null");
    }
    /**
     * The security severity of the alert.
     *
     * Values: low,medium,high,critical,`null`
     */
    @Serializable
    enum class SecuritySeverityLevel(val value: kotlin.String) {
        @SerialName(value = "low") low("low"),
        @SerialName(value = "medium") medium("medium"),
        @SerialName(value = "high") high("high"),
        @SerialName(value = "critical") critical("critical"),
        @SerialName(value = "null") `null`("null");
    }
}

