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

import org.openapitools.client.models.CodeOfConductSimple
import org.openapitools.client.models.FullRepositoryTemplateRepository
import org.openapitools.client.models.IntegrationOwner
import org.openapitools.client.models.Repository
import org.openapitools.client.models.RepositoryLicense
import org.openapitools.client.models.RepositoryPermissions
import org.openapitools.client.models.SecurityAndAnalysis
import org.openapitools.client.models.SimpleUser

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Full Repository
 *
 * @param id 
 * @param nodeId 
 * @param name 
 * @param fullName 
 * @param owner 
 * @param `private` 
 * @param htmlUrl 
 * @param description 
 * @param fork 
 * @param url 
 * @param archiveUrl 
 * @param assigneesUrl 
 * @param blobsUrl 
 * @param branchesUrl 
 * @param collaboratorsUrl 
 * @param commentsUrl 
 * @param commitsUrl 
 * @param compareUrl 
 * @param contentsUrl 
 * @param contributorsUrl 
 * @param deploymentsUrl 
 * @param downloadsUrl 
 * @param eventsUrl 
 * @param forksUrl 
 * @param gitCommitsUrl 
 * @param gitRefsUrl 
 * @param gitTagsUrl 
 * @param gitUrl 
 * @param issueCommentUrl 
 * @param issueEventsUrl 
 * @param issuesUrl 
 * @param keysUrl 
 * @param labelsUrl 
 * @param languagesUrl 
 * @param mergesUrl 
 * @param milestonesUrl 
 * @param notificationsUrl 
 * @param pullsUrl 
 * @param releasesUrl 
 * @param sshUrl 
 * @param stargazersUrl 
 * @param statusesUrl 
 * @param subscribersUrl 
 * @param subscriptionUrl 
 * @param tagsUrl 
 * @param teamsUrl 
 * @param treesUrl 
 * @param cloneUrl 
 * @param mirrorUrl 
 * @param hooksUrl 
 * @param svnUrl 
 * @param homepage 
 * @param language 
 * @param forksCount 
 * @param stargazersCount 
 * @param watchersCount 
 * @param propertySize The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the size is 0.
 * @param defaultBranch 
 * @param openIssuesCount 
 * @param hasIssues 
 * @param hasProjects 
 * @param hasWiki 
 * @param hasPages 
 * @param hasDiscussions 
 * @param archived 
 * @param disabled Returns whether or not this repository disabled.
 * @param pushedAt 
 * @param createdAt 
 * @param updatedAt 
 * @param subscribersCount 
 * @param networkCount 
 * @param license 
 * @param forks 
 * @param openIssues 
 * @param watchers 
 * @param isTemplate 
 * @param topics 
 * @param hasDownloads 
 * @param visibility The repository visibility: public, private, or internal.
 * @param permissions 
 * @param allowRebaseMerge 
 * @param templateRepository 
 * @param tempCloneToken 
 * @param allowSquashMerge 
 * @param allowAutoMerge 
 * @param deleteBranchOnMerge 
 * @param allowMergeCommit 
 * @param allowUpdateBranch 
 * @param useSquashPrTitleAsDefault 
 * @param squashMergeCommitTitle The default value for a squash merge commit title:  - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
 * @param squashMergeCommitMessage The default value for a squash merge commit message:  - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.
 * @param mergeCommitTitle The default value for a merge commit title.    - `PR_TITLE` - default to the pull request's title.   - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
 * @param mergeCommitMessage The default value for a merge commit message.  - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message.
 * @param allowForking 
 * @param webCommitSignoffRequired 
 * @param organization 
 * @param parent 
 * @param source 
 * @param masterBranch 
 * @param anonymousAccessEnabled Whether anonymous git access is allowed.
 * @param codeOfConduct 
 * @param securityAndAnalysis 
 * @param customProperties The custom properties that were defined for the repository. The keys are the custom property names, and the values are the corresponding custom property values.
 */
@Serializable

data class FullRepository (

    @SerialName(value = "id")
    val id: kotlin.Int,

    @SerialName(value = "node_id")
    val nodeId: kotlin.String,

    @SerialName(value = "name")
    val name: kotlin.String,

    @SerialName(value = "full_name")
    val fullName: kotlin.String,

    @SerialName(value = "owner")
    val owner: SimpleUser,

    @SerialName(value = "private")
    val `private`: kotlin.Boolean,

    @Contextual @SerialName(value = "html_url")
    val htmlUrl: java.net.URI,

    @SerialName(value = "description")
    val description: kotlin.String?,

    @SerialName(value = "fork")
    val fork: kotlin.Boolean,

    @Contextual @SerialName(value = "url")
    val url: java.net.URI,

    @SerialName(value = "archive_url")
    val archiveUrl: kotlin.String,

    @SerialName(value = "assignees_url")
    val assigneesUrl: kotlin.String,

    @SerialName(value = "blobs_url")
    val blobsUrl: kotlin.String,

    @SerialName(value = "branches_url")
    val branchesUrl: kotlin.String,

    @SerialName(value = "collaborators_url")
    val collaboratorsUrl: kotlin.String,

    @SerialName(value = "comments_url")
    val commentsUrl: kotlin.String,

    @SerialName(value = "commits_url")
    val commitsUrl: kotlin.String,

    @SerialName(value = "compare_url")
    val compareUrl: kotlin.String,

    @SerialName(value = "contents_url")
    val contentsUrl: kotlin.String,

    @Contextual @SerialName(value = "contributors_url")
    val contributorsUrl: java.net.URI,

    @Contextual @SerialName(value = "deployments_url")
    val deploymentsUrl: java.net.URI,

    @Contextual @SerialName(value = "downloads_url")
    val downloadsUrl: java.net.URI,

    @Contextual @SerialName(value = "events_url")
    val eventsUrl: java.net.URI,

    @Contextual @SerialName(value = "forks_url")
    val forksUrl: java.net.URI,

    @SerialName(value = "git_commits_url")
    val gitCommitsUrl: kotlin.String,

    @SerialName(value = "git_refs_url")
    val gitRefsUrl: kotlin.String,

    @SerialName(value = "git_tags_url")
    val gitTagsUrl: kotlin.String,

    @SerialName(value = "git_url")
    val gitUrl: kotlin.String,

    @SerialName(value = "issue_comment_url")
    val issueCommentUrl: kotlin.String,

    @SerialName(value = "issue_events_url")
    val issueEventsUrl: kotlin.String,

    @SerialName(value = "issues_url")
    val issuesUrl: kotlin.String,

    @SerialName(value = "keys_url")
    val keysUrl: kotlin.String,

    @SerialName(value = "labels_url")
    val labelsUrl: kotlin.String,

    @Contextual @SerialName(value = "languages_url")
    val languagesUrl: java.net.URI,

    @Contextual @SerialName(value = "merges_url")
    val mergesUrl: java.net.URI,

    @SerialName(value = "milestones_url")
    val milestonesUrl: kotlin.String,

    @SerialName(value = "notifications_url")
    val notificationsUrl: kotlin.String,

    @SerialName(value = "pulls_url")
    val pullsUrl: kotlin.String,

    @SerialName(value = "releases_url")
    val releasesUrl: kotlin.String,

    @SerialName(value = "ssh_url")
    val sshUrl: kotlin.String,

    @Contextual @SerialName(value = "stargazers_url")
    val stargazersUrl: java.net.URI,

    @SerialName(value = "statuses_url")
    val statusesUrl: kotlin.String,

    @Contextual @SerialName(value = "subscribers_url")
    val subscribersUrl: java.net.URI,

    @Contextual @SerialName(value = "subscription_url")
    val subscriptionUrl: java.net.URI,

    @Contextual @SerialName(value = "tags_url")
    val tagsUrl: java.net.URI,

    @Contextual @SerialName(value = "teams_url")
    val teamsUrl: java.net.URI,

    @SerialName(value = "trees_url")
    val treesUrl: kotlin.String,

    @SerialName(value = "clone_url")
    val cloneUrl: kotlin.String,

    @Contextual @SerialName(value = "mirror_url")
    val mirrorUrl: java.net.URI?,

    @Contextual @SerialName(value = "hooks_url")
    val hooksUrl: java.net.URI,

    @Contextual @SerialName(value = "svn_url")
    val svnUrl: java.net.URI,

    @Contextual @SerialName(value = "homepage")
    val homepage: java.net.URI?,

    @SerialName(value = "language")
    val language: kotlin.String?,

    @SerialName(value = "forks_count")
    val forksCount: kotlin.Int,

    @SerialName(value = "stargazers_count")
    val stargazersCount: kotlin.Int,

    @SerialName(value = "watchers_count")
    val watchersCount: kotlin.Int,

    /* The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the size is 0. */
    @SerialName(value = "size")
    val propertySize: kotlin.Int,

    @SerialName(value = "default_branch")
    val defaultBranch: kotlin.String,

    @SerialName(value = "open_issues_count")
    val openIssuesCount: kotlin.Int,

    @SerialName(value = "has_issues")
    val hasIssues: kotlin.Boolean,

    @SerialName(value = "has_projects")
    val hasProjects: kotlin.Boolean,

    @SerialName(value = "has_wiki")
    val hasWiki: kotlin.Boolean,

    @SerialName(value = "has_pages")
    val hasPages: kotlin.Boolean,

    @SerialName(value = "has_discussions")
    val hasDiscussions: kotlin.Boolean,

    @SerialName(value = "archived")
    val archived: kotlin.Boolean,

    /* Returns whether or not this repository disabled. */
    @SerialName(value = "disabled")
    val disabled: kotlin.Boolean,

    @Contextual @SerialName(value = "pushed_at")
    val pushedAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "created_at")
    val createdAt: kotlinx.datetime.Instant,

    @Contextual @SerialName(value = "updated_at")
    val updatedAt: kotlinx.datetime.Instant,

    @SerialName(value = "subscribers_count")
    val subscribersCount: kotlin.Int,

    @SerialName(value = "network_count")
    val networkCount: kotlin.Int,

    @SerialName(value = "license")
    val license: RepositoryLicense,

    @SerialName(value = "forks")
    val forks: kotlin.Int,

    @SerialName(value = "open_issues")
    val openIssues: kotlin.Int,

    @SerialName(value = "watchers")
    val watchers: kotlin.Int,

    @SerialName(value = "is_template")
    val isTemplate: kotlin.Boolean? = null,

    @SerialName(value = "topics")
    val topics: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "has_downloads")
    val hasDownloads: kotlin.Boolean? = null,

    /* The repository visibility: public, private, or internal. */
    @SerialName(value = "visibility")
    val visibility: kotlin.String? = null,

    @SerialName(value = "permissions")
    val permissions: RepositoryPermissions? = null,

    @SerialName(value = "allow_rebase_merge")
    val allowRebaseMerge: kotlin.Boolean? = null,

    @SerialName(value = "template_repository")
    val templateRepository: FullRepositoryTemplateRepository? = null,

    @SerialName(value = "temp_clone_token")
    val tempCloneToken: kotlin.String? = null,

    @SerialName(value = "allow_squash_merge")
    val allowSquashMerge: kotlin.Boolean? = null,

    @SerialName(value = "allow_auto_merge")
    val allowAutoMerge: kotlin.Boolean? = null,

    @SerialName(value = "delete_branch_on_merge")
    val deleteBranchOnMerge: kotlin.Boolean? = null,

    @SerialName(value = "allow_merge_commit")
    val allowMergeCommit: kotlin.Boolean? = null,

    @SerialName(value = "allow_update_branch")
    val allowUpdateBranch: kotlin.Boolean? = null,

    @SerialName(value = "use_squash_pr_title_as_default")
    val useSquashPrTitleAsDefault: kotlin.Boolean? = null,

    /* The default value for a squash merge commit title:  - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit). */
    @SerialName(value = "squash_merge_commit_title")
    val squashMergeCommitTitle: FullRepository.SquashMergeCommitTitle? = null,

    /* The default value for a squash merge commit message:  - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message. */
    @SerialName(value = "squash_merge_commit_message")
    val squashMergeCommitMessage: FullRepository.SquashMergeCommitMessage? = null,

    /* The default value for a merge commit title.    - `PR_TITLE` - default to the pull request's title.   - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name). */
    @SerialName(value = "merge_commit_title")
    val mergeCommitTitle: FullRepository.MergeCommitTitle? = null,

    /* The default value for a merge commit message.  - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message. */
    @SerialName(value = "merge_commit_message")
    val mergeCommitMessage: FullRepository.MergeCommitMessage? = null,

    @SerialName(value = "allow_forking")
    val allowForking: kotlin.Boolean? = null,

    @SerialName(value = "web_commit_signoff_required")
    val webCommitSignoffRequired: kotlin.Boolean? = null,

    @SerialName(value = "organization")
    val organization: IntegrationOwner? = null,

    @SerialName(value = "parent")
    val parent: Repository? = null,

    @SerialName(value = "source")
    val source: Repository? = null,

    @SerialName(value = "master_branch")
    val masterBranch: kotlin.String? = null,

    /* Whether anonymous git access is allowed. */
    @SerialName(value = "anonymous_access_enabled")
    val anonymousAccessEnabled: kotlin.Boolean? = true,

    @SerialName(value = "code_of_conduct")
    val codeOfConduct: CodeOfConductSimple? = null,

    @SerialName(value = "security_and_analysis")
    val securityAndAnalysis: SecurityAndAnalysis? = null,

    /* The custom properties that were defined for the repository. The keys are the custom property names, and the values are the corresponding custom property values. */
    @Contextual @SerialName(value = "custom_properties")
    val customProperties: kotlin.Any? = null

) {

    /**
     * The default value for a squash merge commit title:  - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
     *
     * Values: PR_TITLE,COMMIT_OR_PR_TITLE
     */
    @Serializable
    enum class SquashMergeCommitTitle(val value: kotlin.String) {
        @SerialName(value = "PR_TITLE") PR_TITLE("PR_TITLE"),
        @SerialName(value = "COMMIT_OR_PR_TITLE") COMMIT_OR_PR_TITLE("COMMIT_OR_PR_TITLE");
    }
    /**
     * The default value for a squash merge commit message:  - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.
     *
     * Values: PR_BODY,COMMIT_MESSAGES,BLANK
     */
    @Serializable
    enum class SquashMergeCommitMessage(val value: kotlin.String) {
        @SerialName(value = "PR_BODY") PR_BODY("PR_BODY"),
        @SerialName(value = "COMMIT_MESSAGES") COMMIT_MESSAGES("COMMIT_MESSAGES"),
        @SerialName(value = "BLANK") BLANK("BLANK");
    }
    /**
     * The default value for a merge commit title.    - `PR_TITLE` - default to the pull request's title.   - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
     *
     * Values: PR_TITLE,MERGE_MESSAGE
     */
    @Serializable
    enum class MergeCommitTitle(val value: kotlin.String) {
        @SerialName(value = "PR_TITLE") PR_TITLE("PR_TITLE"),
        @SerialName(value = "MERGE_MESSAGE") MERGE_MESSAGE("MERGE_MESSAGE");
    }
    /**
     * The default value for a merge commit message.  - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message.
     *
     * Values: PR_BODY,PR_TITLE,BLANK
     */
    @Serializable
    enum class MergeCommitMessage(val value: kotlin.String) {
        @SerialName(value = "PR_BODY") PR_BODY("PR_BODY"),
        @SerialName(value = "PR_TITLE") PR_TITLE("PR_TITLE"),
        @SerialName(value = "BLANK") BLANK("BLANK");
    }
}
