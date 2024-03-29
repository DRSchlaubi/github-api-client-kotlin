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
 * Configuration for code scanning default setup.
 *
 * @param state The desired state of code scanning default setup.
 * @param querySuite CodeQL query suite to be used.
 * @param languages CodeQL languages to be analyzed.
 */
@Serializable

data class CodeScanningDefaultSetupUpdate (

    /* The desired state of code scanning default setup. */
    @SerialName(value = "state")
    val state: CodeScanningDefaultSetupUpdate.State? = null,

    /* CodeQL query suite to be used. */
    @SerialName(value = "query_suite")
    val querySuite: CodeScanningDefaultSetupUpdate.QuerySuite? = null,

    /* CodeQL languages to be analyzed. */
    @SerialName(value = "languages")
    val languages: kotlin.collections.List<CodeScanningDefaultSetupUpdate.Languages>? = null

) {

    /**
     * The desired state of code scanning default setup.
     *
     * Values: configured,notMinusConfigured
     */
    @Serializable
    enum class State(val value: kotlin.String) {
        @SerialName(value = "configured") configured("configured"),
        @SerialName(value = "not-configured") notMinusConfigured("not-configured");
    }
    /**
     * CodeQL query suite to be used.
     *
     * Values: default,extended
     */
    @Serializable
    enum class QuerySuite(val value: kotlin.String) {
        @SerialName(value = "default") default("default"),
        @SerialName(value = "extended") extended("extended");
    }
    /**
     * CodeQL languages to be analyzed.
     *
     * Values: cMinusCpp,csharp,go,javaMinusKotlin,javascriptMinusTypescript,python,ruby,swift
     */
    @Serializable
    enum class Languages(val value: kotlin.String) {
        @SerialName(value = "c-cpp") cMinusCpp("c-cpp"),
        @SerialName(value = "csharp") csharp("csharp"),
        @SerialName(value = "go") go("go"),
        @SerialName(value = "java-kotlin") javaMinusKotlin("java-kotlin"),
        @SerialName(value = "javascript-typescript") javascriptMinusTypescript("javascript-typescript"),
        @SerialName(value = "python") python("python"),
        @SerialName(value = "ruby") ruby("ruby"),
        @SerialName(value = "swift") swift("swift");
    }
}

