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
 * The set of permissions for the GitHub app
 *
 * @param actions 
 * @param administration 
 * @param checks 
 * @param contentReferences 
 * @param contents 
 * @param deployments 
 * @param discussions 
 * @param emails 
 * @param environments 
 * @param issues 
 * @param propertyKeys 
 * @param members 
 * @param metadata 
 * @param organizationAdministration 
 * @param organizationHooks 
 * @param organizationPackages 
 * @param organizationPlan 
 * @param organizationProjects 
 * @param organizationSecrets 
 * @param organizationSelfHostedRunners 
 * @param organizationUserBlocking 
 * @param packages 
 * @param pages 
 * @param pullRequests 
 * @param repositoryHooks 
 * @param repositoryProjects 
 * @param secretScanningAlerts 
 * @param secrets 
 * @param securityEvents 
 * @param securityScanningAlert 
 * @param singleFile 
 * @param statuses 
 * @param teamDiscussions 
 * @param vulnerabilityAlerts 
 * @param workflows 
 */
@Serializable

data class App8Permissions (

    @SerialName(value = "actions")
    val actions: App8Permissions.Actions? = null,

    @SerialName(value = "administration")
    val administration: App8Permissions.Administration? = null,

    @SerialName(value = "checks")
    val checks: App8Permissions.Checks? = null,

    @SerialName(value = "content_references")
    val contentReferences: App8Permissions.ContentReferences? = null,

    @SerialName(value = "contents")
    val contents: App8Permissions.Contents? = null,

    @SerialName(value = "deployments")
    val deployments: App8Permissions.Deployments? = null,

    @SerialName(value = "discussions")
    val discussions: App8Permissions.Discussions? = null,

    @SerialName(value = "emails")
    val emails: App8Permissions.Emails? = null,

    @SerialName(value = "environments")
    val environments: App8Permissions.Environments? = null,

    @SerialName(value = "issues")
    val issues: App8Permissions.Issues? = null,

    @SerialName(value = "keys")
    val propertyKeys: App8Permissions.PropertyKeys? = null,

    @SerialName(value = "members")
    val members: App8Permissions.Members? = null,

    @SerialName(value = "metadata")
    val metadata: App8Permissions.Metadata? = null,

    @SerialName(value = "organization_administration")
    val organizationAdministration: App8Permissions.OrganizationAdministration? = null,

    @SerialName(value = "organization_hooks")
    val organizationHooks: App8Permissions.OrganizationHooks? = null,

    @SerialName(value = "organization_packages")
    val organizationPackages: App8Permissions.OrganizationPackages? = null,

    @SerialName(value = "organization_plan")
    val organizationPlan: App8Permissions.OrganizationPlan? = null,

    @SerialName(value = "organization_projects")
    val organizationProjects: App8Permissions.OrganizationProjects? = null,

    @SerialName(value = "organization_secrets")
    val organizationSecrets: App8Permissions.OrganizationSecrets? = null,

    @SerialName(value = "organization_self_hosted_runners")
    val organizationSelfHostedRunners: App8Permissions.OrganizationSelfHostedRunners? = null,

    @SerialName(value = "organization_user_blocking")
    val organizationUserBlocking: App8Permissions.OrganizationUserBlocking? = null,

    @SerialName(value = "packages")
    val packages: App8Permissions.Packages? = null,

    @SerialName(value = "pages")
    val pages: App8Permissions.Pages? = null,

    @SerialName(value = "pull_requests")
    val pullRequests: App8Permissions.PullRequests? = null,

    @SerialName(value = "repository_hooks")
    val repositoryHooks: App8Permissions.RepositoryHooks? = null,

    @SerialName(value = "repository_projects")
    val repositoryProjects: App8Permissions.RepositoryProjects? = null,

    @SerialName(value = "secret_scanning_alerts")
    val secretScanningAlerts: App8Permissions.SecretScanningAlerts? = null,

    @SerialName(value = "secrets")
    val secrets: App8Permissions.Secrets? = null,

    @SerialName(value = "security_events")
    val securityEvents: App8Permissions.SecurityEvents? = null,

    @SerialName(value = "security_scanning_alert")
    val securityScanningAlert: App8Permissions.SecurityScanningAlert? = null,

    @SerialName(value = "single_file")
    val singleFile: App8Permissions.SingleFile? = null,

    @SerialName(value = "statuses")
    val statuses: App8Permissions.Statuses? = null,

    @SerialName(value = "team_discussions")
    val teamDiscussions: App8Permissions.TeamDiscussions? = null,

    @SerialName(value = "vulnerability_alerts")
    val vulnerabilityAlerts: App8Permissions.VulnerabilityAlerts? = null,

    @SerialName(value = "workflows")
    val workflows: App8Permissions.Workflows? = null

) {

    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Actions(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Administration(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Checks(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class ContentReferences(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Contents(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Deployments(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Discussions(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Emails(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Environments(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Issues(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class PropertyKeys(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Members(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Metadata(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class OrganizationAdministration(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class OrganizationHooks(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class OrganizationPackages(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class OrganizationPlan(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write,admin
     */
    @Serializable
    enum class OrganizationProjects(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write"),
        @SerialName(value = "admin") admin("admin");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class OrganizationSecrets(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class OrganizationSelfHostedRunners(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class OrganizationUserBlocking(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Packages(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Pages(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class PullRequests(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class RepositoryHooks(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class RepositoryProjects(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class SecretScanningAlerts(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Secrets(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class SecurityEvents(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class SecurityScanningAlert(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class SingleFile(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Statuses(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class TeamDiscussions(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class VulnerabilityAlerts(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
    /**
     * 
     *
     * Values: read,write
     */
    @Serializable
    enum class Workflows(val value: kotlin.String) {
        @SerialName(value = "read") read("read"),
        @SerialName(value = "write") write("write");
    }
}
