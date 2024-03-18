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

import org.openapitools.client.models.ReposUpdateRequestSecurityAndAnalysis

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param name The name of the repository.
 * @param description A short description of the repository.
 * @param homepage A URL with more information about the repository.
 * @param `private` Either `true` to make the repository private or `false` to make it public. Default: `false`.   **Note**: You will get a `422` error if the organization restricts [changing repository visibility](https://docs.github.com/articles/repository-permission-levels-for-an-organization#changing-the-visibility-of-repositories) to organization owners and a non-owner tries to change the value of private.
 * @param visibility The visibility of the repository.
 * @param securityAndAnalysis 
 * @param hasIssues Either `true` to enable issues for this repository or `false` to disable them.
 * @param hasProjects Either `true` to enable projects for this repository or `false` to disable them. **Note:** If you're creating a repository in an organization that has disabled repository projects, the default is `false`, and if you pass `true`, the API returns an error.
 * @param hasWiki Either `true` to enable the wiki for this repository or `false` to disable it.
 * @param isTemplate Either `true` to make this repo available as a template repository or `false` to prevent it.
 * @param defaultBranch Updates the default branch for this repository.
 * @param allowSquashMerge Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging.
 * @param allowMergeCommit Either `true` to allow merging pull requests with a merge commit, or `false` to prevent merging pull requests with merge commits.
 * @param allowRebaseMerge Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging.
 * @param allowAutoMerge Either `true` to allow auto-merge on pull requests, or `false` to disallow auto-merge.
 * @param deleteBranchOnMerge Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent automatic deletion.
 * @param allowUpdateBranch Either `true` to always allow a pull request head branch that is behind its base branch to be updated even if it is not required to be up to date before merging, or false otherwise.
 * @param useSquashPrTitleAsDefault Either `true` to allow squash-merge commits to use pull request title, or `false` to use commit message. **This property has been deprecated. Please use `squash_merge_commit_title` instead.
 * @param squashMergeCommitTitle The default value for a squash merge commit title:  - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
 * @param squashMergeCommitMessage The default value for a squash merge commit message:  - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message.
 * @param mergeCommitTitle The default value for a merge commit title.  - `PR_TITLE` - default to the pull request's title. - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
 * @param mergeCommitMessage The default value for a merge commit message.  - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message.
 * @param archived Whether to archive this repository. `false` will unarchive a previously archived repository.
 * @param allowForking Either `true` to allow private forks, or `false` to prevent private forks.
 * @param webCommitSignoffRequired Either `true` to require contributors to sign off on web-based commits, or `false` to not require contributors to sign off on web-based commits.
 */
@Serializable

data class ReposUpdateRequest (

    /* The name of the repository. */
    @SerialName(value = "name")
    val name: kotlin.String? = null,

    /* A short description of the repository. */
    @SerialName(value = "description")
    val description: kotlin.String? = null,

    /* A URL with more information about the repository. */
    @SerialName(value = "homepage")
    val homepage: kotlin.String? = null,

    /* Either `true` to make the repository private or `false` to make it public. Default: `false`.   **Note**: You will get a `422` error if the organization restricts [changing repository visibility](https://docs.github.com/articles/repository-permission-levels-for-an-organization#changing-the-visibility-of-repositories) to organization owners and a non-owner tries to change the value of private. */
    @SerialName(value = "private")
    val `private`: kotlin.Boolean? = false,

    /* The visibility of the repository. */
    @SerialName(value = "visibility")
    val visibility: ReposUpdateRequest.Visibility? = null,

    @SerialName(value = "security_and_analysis")
    val securityAndAnalysis: ReposUpdateRequestSecurityAndAnalysis? = null,

    /* Either `true` to enable issues for this repository or `false` to disable them. */
    @SerialName(value = "has_issues")
    val hasIssues: kotlin.Boolean? = true,

    /* Either `true` to enable projects for this repository or `false` to disable them. **Note:** If you're creating a repository in an organization that has disabled repository projects, the default is `false`, and if you pass `true`, the API returns an error. */
    @SerialName(value = "has_projects")
    val hasProjects: kotlin.Boolean? = true,

    /* Either `true` to enable the wiki for this repository or `false` to disable it. */
    @SerialName(value = "has_wiki")
    val hasWiki: kotlin.Boolean? = true,

    /* Either `true` to make this repo available as a template repository or `false` to prevent it. */
    @SerialName(value = "is_template")
    val isTemplate: kotlin.Boolean? = false,

    /* Updates the default branch for this repository. */
    @SerialName(value = "default_branch")
    val defaultBranch: kotlin.String? = null,

    /* Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging. */
    @SerialName(value = "allow_squash_merge")
    val allowSquashMerge: kotlin.Boolean? = true,

    /* Either `true` to allow merging pull requests with a merge commit, or `false` to prevent merging pull requests with merge commits. */
    @SerialName(value = "allow_merge_commit")
    val allowMergeCommit: kotlin.Boolean? = true,

    /* Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging. */
    @SerialName(value = "allow_rebase_merge")
    val allowRebaseMerge: kotlin.Boolean? = true,

    /* Either `true` to allow auto-merge on pull requests, or `false` to disallow auto-merge. */
    @SerialName(value = "allow_auto_merge")
    val allowAutoMerge: kotlin.Boolean? = false,

    /* Either `true` to allow automatically deleting head branches when pull requests are merged, or `false` to prevent automatic deletion. */
    @SerialName(value = "delete_branch_on_merge")
    val deleteBranchOnMerge: kotlin.Boolean? = false,

    /* Either `true` to always allow a pull request head branch that is behind its base branch to be updated even if it is not required to be up to date before merging, or false otherwise. */
    @SerialName(value = "allow_update_branch")
    val allowUpdateBranch: kotlin.Boolean? = false,

    /* Either `true` to allow squash-merge commits to use pull request title, or `false` to use commit message. **This property has been deprecated. Please use `squash_merge_commit_title` instead. */
    @SerialName(value = "use_squash_pr_title_as_default")
    @Deprecated(message = "This property is deprecated.")
    val useSquashPrTitleAsDefault: kotlin.Boolean? = false,

    /* The default value for a squash merge commit title:  - `PR_TITLE` - default to the pull request's title. - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit). */
    @SerialName(value = "squash_merge_commit_title")
    val squashMergeCommitTitle: ReposUpdateRequest.SquashMergeCommitTitle? = null,

    /* The default value for a squash merge commit message:  - `PR_BODY` - default to the pull request's body. - `COMMIT_MESSAGES` - default to the branch's commit messages. - `BLANK` - default to a blank commit message. */
    @SerialName(value = "squash_merge_commit_message")
    val squashMergeCommitMessage: ReposUpdateRequest.SquashMergeCommitMessage? = null,

    /* The default value for a merge commit title.  - `PR_TITLE` - default to the pull request's title. - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name). */
    @SerialName(value = "merge_commit_title")
    val mergeCommitTitle: ReposUpdateRequest.MergeCommitTitle? = null,

    /* The default value for a merge commit message.  - `PR_TITLE` - default to the pull request's title. - `PR_BODY` - default to the pull request's body. - `BLANK` - default to a blank commit message. */
    @SerialName(value = "merge_commit_message")
    val mergeCommitMessage: ReposUpdateRequest.MergeCommitMessage? = null,

    /* Whether to archive this repository. `false` will unarchive a previously archived repository. */
    @SerialName(value = "archived")
    val archived: kotlin.Boolean? = false,

    /* Either `true` to allow private forks, or `false` to prevent private forks. */
    @SerialName(value = "allow_forking")
    val allowForking: kotlin.Boolean? = false,

    /* Either `true` to require contributors to sign off on web-based commits, or `false` to not require contributors to sign off on web-based commits. */
    @SerialName(value = "web_commit_signoff_required")
    val webCommitSignoffRequired: kotlin.Boolean? = false

) {

    /**
     * The visibility of the repository.
     *
     * Values: `public`,`private`
     */
    @Serializable
    enum class Visibility(val value: kotlin.String) {
        @SerialName(value = "public") `public`("public"),
        @SerialName(value = "private") `private`("private");
    }
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
     * The default value for a merge commit title.  - `PR_TITLE` - default to the pull request's title. - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
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
