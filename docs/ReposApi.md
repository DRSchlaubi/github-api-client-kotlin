# ReposApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reposAcceptInvitationForAuthenticatedUser**](ReposApi.md#reposAcceptInvitationForAuthenticatedUser) | **PATCH** /user/repository_invitations/{invitation_id} | Accept a repository invitation
[**reposAddAppAccessRestrictions**](ReposApi.md#reposAddAppAccessRestrictions) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps | Add app access restrictions
[**reposAddCollaborator**](ReposApi.md#reposAddCollaborator) | **PUT** /repos/{owner}/{repo}/collaborators/{username} | Add a repository collaborator
[**reposAddStatusCheckContexts**](ReposApi.md#reposAddStatusCheckContexts) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts | Add status check contexts
[**reposAddTeamAccessRestrictions**](ReposApi.md#reposAddTeamAccessRestrictions) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams | Add team access restrictions
[**reposAddUserAccessRestrictions**](ReposApi.md#reposAddUserAccessRestrictions) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users | Add user access restrictions
[**reposCancelPagesDeployment**](ReposApi.md#reposCancelPagesDeployment) | **POST** /repos/{owner}/{repo}/pages/deployments/{pages_deployment_id}/cancel | Cancel a GitHub Pages deployment
[**reposCheckAutomatedSecurityFixes**](ReposApi.md#reposCheckAutomatedSecurityFixes) | **GET** /repos/{owner}/{repo}/automated-security-fixes | Check if automated security fixes are enabled for a repository
[**reposCheckCollaborator**](ReposApi.md#reposCheckCollaborator) | **GET** /repos/{owner}/{repo}/collaborators/{username} | Check if a user is a repository collaborator
[**reposCheckPrivateVulnerabilityReporting**](ReposApi.md#reposCheckPrivateVulnerabilityReporting) | **GET** /repos/{owner}/{repo}/private-vulnerability-reporting | Check if private vulnerability reporting is enabled for a repository
[**reposCheckVulnerabilityAlerts**](ReposApi.md#reposCheckVulnerabilityAlerts) | **GET** /repos/{owner}/{repo}/vulnerability-alerts | Check if vulnerability alerts are enabled for a repository
[**reposCodeownersErrors**](ReposApi.md#reposCodeownersErrors) | **GET** /repos/{owner}/{repo}/codeowners/errors | List CODEOWNERS errors
[**reposCompareCommits**](ReposApi.md#reposCompareCommits) | **GET** /repos/{owner}/{repo}/compare/{basehead} | Compare two commits
[**reposCreateAutolink**](ReposApi.md#reposCreateAutolink) | **POST** /repos/{owner}/{repo}/autolinks | Create an autolink reference for a repository
[**reposCreateCommitComment**](ReposApi.md#reposCreateCommitComment) | **POST** /repos/{owner}/{repo}/commits/{commit_sha}/comments | Create a commit comment
[**reposCreateCommitSignatureProtection**](ReposApi.md#reposCreateCommitSignatureProtection) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures | Create commit signature protection
[**reposCreateCommitStatus**](ReposApi.md#reposCreateCommitStatus) | **POST** /repos/{owner}/{repo}/statuses/{sha} | Create a commit status
[**reposCreateDeployKey**](ReposApi.md#reposCreateDeployKey) | **POST** /repos/{owner}/{repo}/keys | Create a deploy key
[**reposCreateDeployment**](ReposApi.md#reposCreateDeployment) | **POST** /repos/{owner}/{repo}/deployments | Create a deployment
[**reposCreateDeploymentBranchPolicy**](ReposApi.md#reposCreateDeploymentBranchPolicy) | **POST** /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies | Create a deployment branch policy
[**reposCreateDeploymentProtectionRule**](ReposApi.md#reposCreateDeploymentProtectionRule) | **POST** /repos/{owner}/{repo}/environments/{environment_name}/deployment_protection_rules | Create a custom deployment protection rule on an environment
[**reposCreateDeploymentStatus**](ReposApi.md#reposCreateDeploymentStatus) | **POST** /repos/{owner}/{repo}/deployments/{deployment_id}/statuses | Create a deployment status
[**reposCreateDispatchEvent**](ReposApi.md#reposCreateDispatchEvent) | **POST** /repos/{owner}/{repo}/dispatches | Create a repository dispatch event
[**reposCreateForAuthenticatedUser**](ReposApi.md#reposCreateForAuthenticatedUser) | **POST** /user/repos | Create a repository for the authenticated user
[**reposCreateFork**](ReposApi.md#reposCreateFork) | **POST** /repos/{owner}/{repo}/forks | Create a fork
[**reposCreateInOrg**](ReposApi.md#reposCreateInOrg) | **POST** /orgs/{org}/repos | Create an organization repository
[**reposCreateOrUpdateCustomPropertiesValues**](ReposApi.md#reposCreateOrUpdateCustomPropertiesValues) | **PATCH** /repos/{owner}/{repo}/properties/values | Create or update custom property values for a repository
[**reposCreateOrUpdateEnvironment**](ReposApi.md#reposCreateOrUpdateEnvironment) | **PUT** /repos/{owner}/{repo}/environments/{environment_name} | Create or update an environment
[**reposCreateOrUpdateFileContents**](ReposApi.md#reposCreateOrUpdateFileContents) | **PUT** /repos/{owner}/{repo}/contents/{path} | Create or update file contents
[**reposCreateOrgRuleset**](ReposApi.md#reposCreateOrgRuleset) | **POST** /orgs/{org}/rulesets | Create an organization repository ruleset
[**reposCreatePagesDeployment**](ReposApi.md#reposCreatePagesDeployment) | **POST** /repos/{owner}/{repo}/pages/deployments | Create a GitHub Pages deployment
[**reposCreatePagesSite**](ReposApi.md#reposCreatePagesSite) | **POST** /repos/{owner}/{repo}/pages | Create a GitHub Pages site
[**reposCreateRelease**](ReposApi.md#reposCreateRelease) | **POST** /repos/{owner}/{repo}/releases | Create a release
[**reposCreateRepoRuleset**](ReposApi.md#reposCreateRepoRuleset) | **POST** /repos/{owner}/{repo}/rulesets | Create a repository ruleset
[**reposCreateTagProtection**](ReposApi.md#reposCreateTagProtection) | **POST** /repos/{owner}/{repo}/tags/protection | Create a tag protection state for a repository
[**reposCreateUsingTemplate**](ReposApi.md#reposCreateUsingTemplate) | **POST** /repos/{template_owner}/{template_repo}/generate | Create a repository using a template
[**reposCreateWebhook**](ReposApi.md#reposCreateWebhook) | **POST** /repos/{owner}/{repo}/hooks | Create a repository webhook
[**reposDeclineInvitationForAuthenticatedUser**](ReposApi.md#reposDeclineInvitationForAuthenticatedUser) | **DELETE** /user/repository_invitations/{invitation_id} | Decline a repository invitation
[**reposDelete**](ReposApi.md#reposDelete) | **DELETE** /repos/{owner}/{repo} | Delete a repository
[**reposDeleteAccessRestrictions**](ReposApi.md#reposDeleteAccessRestrictions) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions | Delete access restrictions
[**reposDeleteAdminBranchProtection**](ReposApi.md#reposDeleteAdminBranchProtection) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins | Delete admin branch protection
[**reposDeleteAnEnvironment**](ReposApi.md#reposDeleteAnEnvironment) | **DELETE** /repos/{owner}/{repo}/environments/{environment_name} | Delete an environment
[**reposDeleteAutolink**](ReposApi.md#reposDeleteAutolink) | **DELETE** /repos/{owner}/{repo}/autolinks/{autolink_id} | Delete an autolink reference from a repository
[**reposDeleteBranchProtection**](ReposApi.md#reposDeleteBranchProtection) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection | Delete branch protection
[**reposDeleteCommitComment**](ReposApi.md#reposDeleteCommitComment) | **DELETE** /repos/{owner}/{repo}/comments/{comment_id} | Delete a commit comment
[**reposDeleteCommitSignatureProtection**](ReposApi.md#reposDeleteCommitSignatureProtection) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures | Delete commit signature protection
[**reposDeleteDeployKey**](ReposApi.md#reposDeleteDeployKey) | **DELETE** /repos/{owner}/{repo}/keys/{key_id} | Delete a deploy key
[**reposDeleteDeployment**](ReposApi.md#reposDeleteDeployment) | **DELETE** /repos/{owner}/{repo}/deployments/{deployment_id} | Delete a deployment
[**reposDeleteDeploymentBranchPolicy**](ReposApi.md#reposDeleteDeploymentBranchPolicy) | **DELETE** /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id} | Delete a deployment branch policy
[**reposDeleteFile**](ReposApi.md#reposDeleteFile) | **DELETE** /repos/{owner}/{repo}/contents/{path} | Delete a file
[**reposDeleteInvitation**](ReposApi.md#reposDeleteInvitation) | **DELETE** /repos/{owner}/{repo}/invitations/{invitation_id} | Delete a repository invitation
[**reposDeleteOrgRuleset**](ReposApi.md#reposDeleteOrgRuleset) | **DELETE** /orgs/{org}/rulesets/{ruleset_id} | Delete an organization repository ruleset
[**reposDeletePagesSite**](ReposApi.md#reposDeletePagesSite) | **DELETE** /repos/{owner}/{repo}/pages | Delete a GitHub Pages site
[**reposDeletePullRequestReviewProtection**](ReposApi.md#reposDeletePullRequestReviewProtection) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews | Delete pull request review protection
[**reposDeleteRelease**](ReposApi.md#reposDeleteRelease) | **DELETE** /repos/{owner}/{repo}/releases/{release_id} | Delete a release
[**reposDeleteReleaseAsset**](ReposApi.md#reposDeleteReleaseAsset) | **DELETE** /repos/{owner}/{repo}/releases/assets/{asset_id} | Delete a release asset
[**reposDeleteRepoRuleset**](ReposApi.md#reposDeleteRepoRuleset) | **DELETE** /repos/{owner}/{repo}/rulesets/{ruleset_id} | Delete a repository ruleset
[**reposDeleteTagProtection**](ReposApi.md#reposDeleteTagProtection) | **DELETE** /repos/{owner}/{repo}/tags/protection/{tag_protection_id} | Delete a tag protection state for a repository
[**reposDeleteWebhook**](ReposApi.md#reposDeleteWebhook) | **DELETE** /repos/{owner}/{repo}/hooks/{hook_id} | Delete a repository webhook
[**reposDisableAutomatedSecurityFixes**](ReposApi.md#reposDisableAutomatedSecurityFixes) | **DELETE** /repos/{owner}/{repo}/automated-security-fixes | Disable automated security fixes
[**reposDisableDeploymentProtectionRule**](ReposApi.md#reposDisableDeploymentProtectionRule) | **DELETE** /repos/{owner}/{repo}/environments/{environment_name}/deployment_protection_rules/{protection_rule_id} | Disable a custom protection rule for an environment
[**reposDisablePrivateVulnerabilityReporting**](ReposApi.md#reposDisablePrivateVulnerabilityReporting) | **DELETE** /repos/{owner}/{repo}/private-vulnerability-reporting | Disable private vulnerability reporting for a repository
[**reposDisableVulnerabilityAlerts**](ReposApi.md#reposDisableVulnerabilityAlerts) | **DELETE** /repos/{owner}/{repo}/vulnerability-alerts | Disable vulnerability alerts
[**reposDownloadTarballArchive**](ReposApi.md#reposDownloadTarballArchive) | **GET** /repos/{owner}/{repo}/tarball/{ref} | Download a repository archive (tar)
[**reposDownloadZipballArchive**](ReposApi.md#reposDownloadZipballArchive) | **GET** /repos/{owner}/{repo}/zipball/{ref} | Download a repository archive (zip)
[**reposEnableAutomatedSecurityFixes**](ReposApi.md#reposEnableAutomatedSecurityFixes) | **PUT** /repos/{owner}/{repo}/automated-security-fixes | Enable automated security fixes
[**reposEnablePrivateVulnerabilityReporting**](ReposApi.md#reposEnablePrivateVulnerabilityReporting) | **PUT** /repos/{owner}/{repo}/private-vulnerability-reporting | Enable private vulnerability reporting for a repository
[**reposEnableVulnerabilityAlerts**](ReposApi.md#reposEnableVulnerabilityAlerts) | **PUT** /repos/{owner}/{repo}/vulnerability-alerts | Enable vulnerability alerts
[**reposGenerateReleaseNotes**](ReposApi.md#reposGenerateReleaseNotes) | **POST** /repos/{owner}/{repo}/releases/generate-notes | Generate release notes content for a release
[**reposGet**](ReposApi.md#reposGet) | **GET** /repos/{owner}/{repo} | Get a repository
[**reposGetAccessRestrictions**](ReposApi.md#reposGetAccessRestrictions) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions | Get access restrictions
[**reposGetAdminBranchProtection**](ReposApi.md#reposGetAdminBranchProtection) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins | Get admin branch protection
[**reposGetAllDeploymentProtectionRules**](ReposApi.md#reposGetAllDeploymentProtectionRules) | **GET** /repos/{owner}/{repo}/environments/{environment_name}/deployment_protection_rules | Get all deployment protection rules for an environment
[**reposGetAllEnvironments**](ReposApi.md#reposGetAllEnvironments) | **GET** /repos/{owner}/{repo}/environments | List environments
[**reposGetAllStatusCheckContexts**](ReposApi.md#reposGetAllStatusCheckContexts) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts | Get all status check contexts
[**reposGetAllTopics**](ReposApi.md#reposGetAllTopics) | **GET** /repos/{owner}/{repo}/topics | Get all repository topics
[**reposGetAppsWithAccessToProtectedBranch**](ReposApi.md#reposGetAppsWithAccessToProtectedBranch) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps | Get apps with access to the protected branch
[**reposGetAutolink**](ReposApi.md#reposGetAutolink) | **GET** /repos/{owner}/{repo}/autolinks/{autolink_id} | Get an autolink reference of a repository
[**reposGetBranch**](ReposApi.md#reposGetBranch) | **GET** /repos/{owner}/{repo}/branches/{branch} | Get a branch
[**reposGetBranchProtection**](ReposApi.md#reposGetBranchProtection) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection | Get branch protection
[**reposGetBranchRules**](ReposApi.md#reposGetBranchRules) | **GET** /repos/{owner}/{repo}/rules/branches/{branch} | Get rules for a branch
[**reposGetClones**](ReposApi.md#reposGetClones) | **GET** /repos/{owner}/{repo}/traffic/clones | Get repository clones
[**reposGetCodeFrequencyStats**](ReposApi.md#reposGetCodeFrequencyStats) | **GET** /repos/{owner}/{repo}/stats/code_frequency | Get the weekly commit activity
[**reposGetCollaboratorPermissionLevel**](ReposApi.md#reposGetCollaboratorPermissionLevel) | **GET** /repos/{owner}/{repo}/collaborators/{username}/permission | Get repository permissions for a user
[**reposGetCombinedStatusForRef**](ReposApi.md#reposGetCombinedStatusForRef) | **GET** /repos/{owner}/{repo}/commits/{ref}/status | Get the combined status for a specific reference
[**reposGetCommit**](ReposApi.md#reposGetCommit) | **GET** /repos/{owner}/{repo}/commits/{ref} | Get a commit
[**reposGetCommitActivityStats**](ReposApi.md#reposGetCommitActivityStats) | **GET** /repos/{owner}/{repo}/stats/commit_activity | Get the last year of commit activity
[**reposGetCommitComment**](ReposApi.md#reposGetCommitComment) | **GET** /repos/{owner}/{repo}/comments/{comment_id} | Get a commit comment
[**reposGetCommitSignatureProtection**](ReposApi.md#reposGetCommitSignatureProtection) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/required_signatures | Get commit signature protection
[**reposGetCommunityProfileMetrics**](ReposApi.md#reposGetCommunityProfileMetrics) | **GET** /repos/{owner}/{repo}/community/profile | Get community profile metrics
[**reposGetContent**](ReposApi.md#reposGetContent) | **GET** /repos/{owner}/{repo}/contents/{path} | Get repository content
[**reposGetContributorsStats**](ReposApi.md#reposGetContributorsStats) | **GET** /repos/{owner}/{repo}/stats/contributors | Get all contributor commit activity
[**reposGetCustomDeploymentProtectionRule**](ReposApi.md#reposGetCustomDeploymentProtectionRule) | **GET** /repos/{owner}/{repo}/environments/{environment_name}/deployment_protection_rules/{protection_rule_id} | Get a custom deployment protection rule
[**reposGetCustomPropertiesValues**](ReposApi.md#reposGetCustomPropertiesValues) | **GET** /repos/{owner}/{repo}/properties/values | Get all custom property values for a repository
[**reposGetDeployKey**](ReposApi.md#reposGetDeployKey) | **GET** /repos/{owner}/{repo}/keys/{key_id} | Get a deploy key
[**reposGetDeployment**](ReposApi.md#reposGetDeployment) | **GET** /repos/{owner}/{repo}/deployments/{deployment_id} | Get a deployment
[**reposGetDeploymentBranchPolicy**](ReposApi.md#reposGetDeploymentBranchPolicy) | **GET** /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id} | Get a deployment branch policy
[**reposGetDeploymentStatus**](ReposApi.md#reposGetDeploymentStatus) | **GET** /repos/{owner}/{repo}/deployments/{deployment_id}/statuses/{status_id} | Get a deployment status
[**reposGetEnvironment**](ReposApi.md#reposGetEnvironment) | **GET** /repos/{owner}/{repo}/environments/{environment_name} | Get an environment
[**reposGetLatestPagesBuild**](ReposApi.md#reposGetLatestPagesBuild) | **GET** /repos/{owner}/{repo}/pages/builds/latest | Get latest Pages build
[**reposGetLatestRelease**](ReposApi.md#reposGetLatestRelease) | **GET** /repos/{owner}/{repo}/releases/latest | Get the latest release
[**reposGetOrgRuleSuite**](ReposApi.md#reposGetOrgRuleSuite) | **GET** /orgs/{org}/rulesets/rule-suites/{rule_suite_id} | Get an organization rule suite
[**reposGetOrgRuleSuites**](ReposApi.md#reposGetOrgRuleSuites) | **GET** /orgs/{org}/rulesets/rule-suites | List organization rule suites
[**reposGetOrgRuleset**](ReposApi.md#reposGetOrgRuleset) | **GET** /orgs/{org}/rulesets/{ruleset_id} | Get an organization repository ruleset
[**reposGetOrgRulesets**](ReposApi.md#reposGetOrgRulesets) | **GET** /orgs/{org}/rulesets | Get all organization repository rulesets
[**reposGetPages**](ReposApi.md#reposGetPages) | **GET** /repos/{owner}/{repo}/pages | Get a GitHub Pages site
[**reposGetPagesBuild**](ReposApi.md#reposGetPagesBuild) | **GET** /repos/{owner}/{repo}/pages/builds/{build_id} | Get GitHub Pages build
[**reposGetPagesDeployment**](ReposApi.md#reposGetPagesDeployment) | **GET** /repos/{owner}/{repo}/pages/deployments/{pages_deployment_id} | Get the status of a GitHub Pages deployment
[**reposGetPagesHealthCheck**](ReposApi.md#reposGetPagesHealthCheck) | **GET** /repos/{owner}/{repo}/pages/health | Get a DNS health check for GitHub Pages
[**reposGetParticipationStats**](ReposApi.md#reposGetParticipationStats) | **GET** /repos/{owner}/{repo}/stats/participation | Get the weekly commit count
[**reposGetPullRequestReviewProtection**](ReposApi.md#reposGetPullRequestReviewProtection) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews | Get pull request review protection
[**reposGetPunchCardStats**](ReposApi.md#reposGetPunchCardStats) | **GET** /repos/{owner}/{repo}/stats/punch_card | Get the hourly commit count for each day
[**reposGetReadme**](ReposApi.md#reposGetReadme) | **GET** /repos/{owner}/{repo}/readme | Get a repository README
[**reposGetReadmeInDirectory**](ReposApi.md#reposGetReadmeInDirectory) | **GET** /repos/{owner}/{repo}/readme/{dir} | Get a repository README for a directory
[**reposGetRelease**](ReposApi.md#reposGetRelease) | **GET** /repos/{owner}/{repo}/releases/{release_id} | Get a release
[**reposGetReleaseAsset**](ReposApi.md#reposGetReleaseAsset) | **GET** /repos/{owner}/{repo}/releases/assets/{asset_id} | Get a release asset
[**reposGetReleaseByTag**](ReposApi.md#reposGetReleaseByTag) | **GET** /repos/{owner}/{repo}/releases/tags/{tag} | Get a release by tag name
[**reposGetRepoRuleSuite**](ReposApi.md#reposGetRepoRuleSuite) | **GET** /repos/{owner}/{repo}/rulesets/rule-suites/{rule_suite_id} | Get a repository rule suite
[**reposGetRepoRuleSuites**](ReposApi.md#reposGetRepoRuleSuites) | **GET** /repos/{owner}/{repo}/rulesets/rule-suites | List repository rule suites
[**reposGetRepoRuleset**](ReposApi.md#reposGetRepoRuleset) | **GET** /repos/{owner}/{repo}/rulesets/{ruleset_id} | Get a repository ruleset
[**reposGetRepoRulesets**](ReposApi.md#reposGetRepoRulesets) | **GET** /repos/{owner}/{repo}/rulesets | Get all repository rulesets
[**reposGetStatusChecksProtection**](ReposApi.md#reposGetStatusChecksProtection) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks | Get status checks protection
[**reposGetTeamsWithAccessToProtectedBranch**](ReposApi.md#reposGetTeamsWithAccessToProtectedBranch) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams | Get teams with access to the protected branch
[**reposGetTopPaths**](ReposApi.md#reposGetTopPaths) | **GET** /repos/{owner}/{repo}/traffic/popular/paths | Get top referral paths
[**reposGetTopReferrers**](ReposApi.md#reposGetTopReferrers) | **GET** /repos/{owner}/{repo}/traffic/popular/referrers | Get top referral sources
[**reposGetUsersWithAccessToProtectedBranch**](ReposApi.md#reposGetUsersWithAccessToProtectedBranch) | **GET** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users | Get users with access to the protected branch
[**reposGetViews**](ReposApi.md#reposGetViews) | **GET** /repos/{owner}/{repo}/traffic/views | Get page views
[**reposGetWebhook**](ReposApi.md#reposGetWebhook) | **GET** /repos/{owner}/{repo}/hooks/{hook_id} | Get a repository webhook
[**reposGetWebhookConfigForRepo**](ReposApi.md#reposGetWebhookConfigForRepo) | **GET** /repos/{owner}/{repo}/hooks/{hook_id}/config | Get a webhook configuration for a repository
[**reposGetWebhookDelivery**](ReposApi.md#reposGetWebhookDelivery) | **GET** /repos/{owner}/{repo}/hooks/{hook_id}/deliveries/{delivery_id} | Get a delivery for a repository webhook
[**reposListActivities**](ReposApi.md#reposListActivities) | **GET** /repos/{owner}/{repo}/activity | List repository activities
[**reposListAutolinks**](ReposApi.md#reposListAutolinks) | **GET** /repos/{owner}/{repo}/autolinks | Get all autolinks of a repository
[**reposListBranches**](ReposApi.md#reposListBranches) | **GET** /repos/{owner}/{repo}/branches | List branches
[**reposListBranchesForHeadCommit**](ReposApi.md#reposListBranchesForHeadCommit) | **GET** /repos/{owner}/{repo}/commits/{commit_sha}/branches-where-head | List branches for HEAD commit
[**reposListCollaborators**](ReposApi.md#reposListCollaborators) | **GET** /repos/{owner}/{repo}/collaborators | List repository collaborators
[**reposListCommentsForCommit**](ReposApi.md#reposListCommentsForCommit) | **GET** /repos/{owner}/{repo}/commits/{commit_sha}/comments | List commit comments
[**reposListCommitCommentsForRepo**](ReposApi.md#reposListCommitCommentsForRepo) | **GET** /repos/{owner}/{repo}/comments | List commit comments for a repository
[**reposListCommitStatusesForRef**](ReposApi.md#reposListCommitStatusesForRef) | **GET** /repos/{owner}/{repo}/commits/{ref}/statuses | List commit statuses for a reference
[**reposListCommits**](ReposApi.md#reposListCommits) | **GET** /repos/{owner}/{repo}/commits | List commits
[**reposListContributors**](ReposApi.md#reposListContributors) | **GET** /repos/{owner}/{repo}/contributors | List repository contributors
[**reposListCustomDeploymentRuleIntegrations**](ReposApi.md#reposListCustomDeploymentRuleIntegrations) | **GET** /repos/{owner}/{repo}/environments/{environment_name}/deployment_protection_rules/apps | List custom deployment rule integrations available for an environment
[**reposListDeployKeys**](ReposApi.md#reposListDeployKeys) | **GET** /repos/{owner}/{repo}/keys | List deploy keys
[**reposListDeploymentBranchPolicies**](ReposApi.md#reposListDeploymentBranchPolicies) | **GET** /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies | List deployment branch policies
[**reposListDeploymentStatuses**](ReposApi.md#reposListDeploymentStatuses) | **GET** /repos/{owner}/{repo}/deployments/{deployment_id}/statuses | List deployment statuses
[**reposListDeployments**](ReposApi.md#reposListDeployments) | **GET** /repos/{owner}/{repo}/deployments | List deployments
[**reposListForAuthenticatedUser**](ReposApi.md#reposListForAuthenticatedUser) | **GET** /user/repos | List repositories for the authenticated user
[**reposListForOrg**](ReposApi.md#reposListForOrg) | **GET** /orgs/{org}/repos | List organization repositories
[**reposListForUser**](ReposApi.md#reposListForUser) | **GET** /users/{username}/repos | List repositories for a user
[**reposListForks**](ReposApi.md#reposListForks) | **GET** /repos/{owner}/{repo}/forks | List forks
[**reposListInvitations**](ReposApi.md#reposListInvitations) | **GET** /repos/{owner}/{repo}/invitations | List repository invitations
[**reposListInvitationsForAuthenticatedUser**](ReposApi.md#reposListInvitationsForAuthenticatedUser) | **GET** /user/repository_invitations | List repository invitations for the authenticated user
[**reposListLanguages**](ReposApi.md#reposListLanguages) | **GET** /repos/{owner}/{repo}/languages | List repository languages
[**reposListPagesBuilds**](ReposApi.md#reposListPagesBuilds) | **GET** /repos/{owner}/{repo}/pages/builds | List GitHub Pages builds
[**reposListPublic**](ReposApi.md#reposListPublic) | **GET** /repositories | List public repositories
[**reposListPullRequestsAssociatedWithCommit**](ReposApi.md#reposListPullRequestsAssociatedWithCommit) | **GET** /repos/{owner}/{repo}/commits/{commit_sha}/pulls | List pull requests associated with a commit
[**reposListReleaseAssets**](ReposApi.md#reposListReleaseAssets) | **GET** /repos/{owner}/{repo}/releases/{release_id}/assets | List release assets
[**reposListReleases**](ReposApi.md#reposListReleases) | **GET** /repos/{owner}/{repo}/releases | List releases
[**reposListTagProtection**](ReposApi.md#reposListTagProtection) | **GET** /repos/{owner}/{repo}/tags/protection | List tag protection states for a repository
[**reposListTags**](ReposApi.md#reposListTags) | **GET** /repos/{owner}/{repo}/tags | List repository tags
[**reposListTeams**](ReposApi.md#reposListTeams) | **GET** /repos/{owner}/{repo}/teams | List repository teams
[**reposListWebhookDeliveries**](ReposApi.md#reposListWebhookDeliveries) | **GET** /repos/{owner}/{repo}/hooks/{hook_id}/deliveries | List deliveries for a repository webhook
[**reposListWebhooks**](ReposApi.md#reposListWebhooks) | **GET** /repos/{owner}/{repo}/hooks | List repository webhooks
[**reposMerge**](ReposApi.md#reposMerge) | **POST** /repos/{owner}/{repo}/merges | Merge a branch
[**reposMergeUpstream**](ReposApi.md#reposMergeUpstream) | **POST** /repos/{owner}/{repo}/merge-upstream | Sync a fork branch with the upstream repository
[**reposPingWebhook**](ReposApi.md#reposPingWebhook) | **POST** /repos/{owner}/{repo}/hooks/{hook_id}/pings | Ping a repository webhook
[**reposRedeliverWebhookDelivery**](ReposApi.md#reposRedeliverWebhookDelivery) | **POST** /repos/{owner}/{repo}/hooks/{hook_id}/deliveries/{delivery_id}/attempts | Redeliver a delivery for a repository webhook
[**reposRemoveAppAccessRestrictions**](ReposApi.md#reposRemoveAppAccessRestrictions) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps | Remove app access restrictions
[**reposRemoveCollaborator**](ReposApi.md#reposRemoveCollaborator) | **DELETE** /repos/{owner}/{repo}/collaborators/{username} | Remove a repository collaborator
[**reposRemoveStatusCheckContexts**](ReposApi.md#reposRemoveStatusCheckContexts) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts | Remove status check contexts
[**reposRemoveStatusCheckProtection**](ReposApi.md#reposRemoveStatusCheckProtection) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks | Remove status check protection
[**reposRemoveTeamAccessRestrictions**](ReposApi.md#reposRemoveTeamAccessRestrictions) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams | Remove team access restrictions
[**reposRemoveUserAccessRestrictions**](ReposApi.md#reposRemoveUserAccessRestrictions) | **DELETE** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users | Remove user access restrictions
[**reposRenameBranch**](ReposApi.md#reposRenameBranch) | **POST** /repos/{owner}/{repo}/branches/{branch}/rename | Rename a branch
[**reposReplaceAllTopics**](ReposApi.md#reposReplaceAllTopics) | **PUT** /repos/{owner}/{repo}/topics | Replace all repository topics
[**reposRequestPagesBuild**](ReposApi.md#reposRequestPagesBuild) | **POST** /repos/{owner}/{repo}/pages/builds | Request a GitHub Pages build
[**reposSetAdminBranchProtection**](ReposApi.md#reposSetAdminBranchProtection) | **POST** /repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins | Set admin branch protection
[**reposSetAppAccessRestrictions**](ReposApi.md#reposSetAppAccessRestrictions) | **PUT** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps | Set app access restrictions
[**reposSetStatusCheckContexts**](ReposApi.md#reposSetStatusCheckContexts) | **PUT** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts | Set status check contexts
[**reposSetTeamAccessRestrictions**](ReposApi.md#reposSetTeamAccessRestrictions) | **PUT** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams | Set team access restrictions
[**reposSetUserAccessRestrictions**](ReposApi.md#reposSetUserAccessRestrictions) | **PUT** /repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users | Set user access restrictions
[**reposTestPushWebhook**](ReposApi.md#reposTestPushWebhook) | **POST** /repos/{owner}/{repo}/hooks/{hook_id}/tests | Test the push repository webhook
[**reposTransfer**](ReposApi.md#reposTransfer) | **POST** /repos/{owner}/{repo}/transfer | Transfer a repository
[**reposUpdate**](ReposApi.md#reposUpdate) | **PATCH** /repos/{owner}/{repo} | Update a repository
[**reposUpdateBranchProtection**](ReposApi.md#reposUpdateBranchProtection) | **PUT** /repos/{owner}/{repo}/branches/{branch}/protection | Update branch protection
[**reposUpdateCommitComment**](ReposApi.md#reposUpdateCommitComment) | **PATCH** /repos/{owner}/{repo}/comments/{comment_id} | Update a commit comment
[**reposUpdateDeploymentBranchPolicy**](ReposApi.md#reposUpdateDeploymentBranchPolicy) | **PUT** /repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies/{branch_policy_id} | Update a deployment branch policy
[**reposUpdateInformationAboutPagesSite**](ReposApi.md#reposUpdateInformationAboutPagesSite) | **PUT** /repos/{owner}/{repo}/pages | Update information about a GitHub Pages site
[**reposUpdateInvitation**](ReposApi.md#reposUpdateInvitation) | **PATCH** /repos/{owner}/{repo}/invitations/{invitation_id} | Update a repository invitation
[**reposUpdateOrgRuleset**](ReposApi.md#reposUpdateOrgRuleset) | **PUT** /orgs/{org}/rulesets/{ruleset_id} | Update an organization repository ruleset
[**reposUpdatePullRequestReviewProtection**](ReposApi.md#reposUpdatePullRequestReviewProtection) | **PATCH** /repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews | Update pull request review protection
[**reposUpdateRelease**](ReposApi.md#reposUpdateRelease) | **PATCH** /repos/{owner}/{repo}/releases/{release_id} | Update a release
[**reposUpdateReleaseAsset**](ReposApi.md#reposUpdateReleaseAsset) | **PATCH** /repos/{owner}/{repo}/releases/assets/{asset_id} | Update a release asset
[**reposUpdateRepoRuleset**](ReposApi.md#reposUpdateRepoRuleset) | **PUT** /repos/{owner}/{repo}/rulesets/{ruleset_id} | Update a repository ruleset
[**reposUpdateStatusCheckProtection**](ReposApi.md#reposUpdateStatusCheckProtection) | **PATCH** /repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks | Update status check protection
[**reposUpdateWebhook**](ReposApi.md#reposUpdateWebhook) | **PATCH** /repos/{owner}/{repo}/hooks/{hook_id} | Update a repository webhook
[**reposUpdateWebhookConfigForRepo**](ReposApi.md#reposUpdateWebhookConfigForRepo) | **PATCH** /repos/{owner}/{repo}/hooks/{hook_id}/config | Update a webhook configuration for a repository
[**reposUploadReleaseAsset**](ReposApi.md#reposUploadReleaseAsset) | **POST** /repos/{owner}/{repo}/releases/{release_id}/assets | Upload a release asset


<a id="reposAcceptInvitationForAuthenticatedUser"></a>
# **reposAcceptInvitationForAuthenticatedUser**
> reposAcceptInvitationForAuthenticatedUser(invitationId)

Accept a repository invitation



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val invitationId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the invitation.
try {
    apiInstance.reposAcceptInvitationForAuthenticatedUser(invitationId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposAcceptInvitationForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposAcceptInvitationForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invitationId** | **kotlin.Int**| The unique identifier of the invitation. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposAddAppAccessRestrictions"></a>
# **reposAddAppAccessRestrictions**
> kotlin.collections.List&lt;Integration&gt; reposAddAppAccessRestrictions(owner, repo, branch, reposSetAppAccessRestrictionsRequest)

Add app access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Grants the specified apps push access for this branch. Only GitHub Apps that are installed on the repository and that have been granted write access to the repository contents can be added as authorized actors on a protected branch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
val reposSetAppAccessRestrictionsRequest : ReposSetAppAccessRestrictionsRequest = {apps=[octoapp]} // ReposSetAppAccessRestrictionsRequest | 
try {
    val result : kotlin.collections.List<Integration> = apiInstance.reposAddAppAccessRestrictions(owner, repo, branch, reposSetAppAccessRestrictionsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposAddAppAccessRestrictions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposAddAppAccessRestrictions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |
 **reposSetAppAccessRestrictionsRequest** | [**ReposSetAppAccessRestrictionsRequest**](ReposSetAppAccessRestrictionsRequest.md)|  | [optional]

### Return type

[**kotlin.collections.List&lt;Integration&gt;**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposAddCollaborator"></a>
# **reposAddCollaborator**
> RepositoryInvitation reposAddCollaborator(owner, repo, username, reposAddCollaboratorRequest)

Add a repository collaborator

This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information, see \&quot;[Rate limits for the API](https://docs.github.com/rest/overview/rate-limits-for-the-rest-api#about-secondary-rate-limits)\&quot; and \&quot;[Best practices for using the REST API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api).\&quot;  Adding an outside collaborator may be restricted by enterprise administrators. For more information, see \&quot;[Enforcing repository management policies in your enterprise](https://docs.github.com/admin/policies/enforcing-policies-for-your-enterprise/enforcing-repository-management-policies-in-your-enterprise#enforcing-a-policy-for-inviting-outside-collaborators-to-repositories).\&quot;  For more information on permission levels, see \&quot;[Repository permission levels for an organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/repository-permission-levels-for-an-organization#permission-levels-for-repositories-owned-by-an-organization)\&quot;. There are restrictions on which permissions can be granted to organization members when an organization base role is in place. In this case, the permission being given must be equal to or higher than the org base permission. Otherwise, the request will fail with:  &#x60;&#x60;&#x60; Cannot assign {member} permission of {role name} &#x60;&#x60;&#x60;  Note that, if you choose not to pass any parameters, you&#39;ll need to set &#x60;Content-Length&#x60; to zero when calling out to this endpoint. For more information, see \&quot;[HTTP method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method).\&quot;  The invitee will receive a notification that they have been invited to the repository, which they must accept or decline. They may do this via the notifications page, the email they receive, or by using the [API](https://docs.github.com/rest/collaborators/invitations).  **Updating an existing collaborator&#39;s permission level**  The endpoint can also be used to change the permissions of an existing collaborator without first removing and re-adding the collaborator. To change the permissions, use the same endpoint and pass a different &#x60;permission&#x60; parameter. The response will be a &#x60;204&#x60;, with no other indication that the permission level changed.  **Rate limits**  You are limited to sending 50 invitations to a repository per 24 hour period. Note there is no limit if you are inviting organization members to an organization repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val reposAddCollaboratorRequest : ReposAddCollaboratorRequest = {"permission":"triage"} // ReposAddCollaboratorRequest | 
try {
    val result : RepositoryInvitation = apiInstance.reposAddCollaborator(owner, repo, username, reposAddCollaboratorRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposAddCollaborator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposAddCollaborator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **reposAddCollaboratorRequest** | [**ReposAddCollaboratorRequest**](ReposAddCollaboratorRequest.md)|  | [optional]

### Return type

[**RepositoryInvitation**](RepositoryInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposAddStatusCheckContexts"></a>
# **reposAddStatusCheckContexts**
> kotlin.collections.List&lt;kotlin.String&gt; reposAddStatusCheckContexts(owner, repo, branch, reposSetStatusCheckContextsRequest)

Add status check contexts

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
val reposSetStatusCheckContextsRequest : ReposSetStatusCheckContextsRequest = {"contexts":["continuous-integration/travis-ci","continuous-integration/jenkins"]} // ReposSetStatusCheckContextsRequest | 
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.reposAddStatusCheckContexts(owner, repo, branch, reposSetStatusCheckContextsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposAddStatusCheckContexts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposAddStatusCheckContexts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |
 **reposSetStatusCheckContextsRequest** | [**ReposSetStatusCheckContextsRequest**](ReposSetStatusCheckContextsRequest.md)|  | [optional]

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposAddTeamAccessRestrictions"></a>
# **reposAddTeamAccessRestrictions**
> kotlin.collections.List&lt;Team&gt; reposAddTeamAccessRestrictions(owner, repo, branch, reposAddTeamAccessRestrictionsRequest)

Add team access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Grants the specified teams push access for this branch. You can also give push access to child teams.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
val reposAddTeamAccessRestrictionsRequest : ReposAddTeamAccessRestrictionsRequest = {"teams":["justice-league"]} // ReposAddTeamAccessRestrictionsRequest | 
try {
    val result : kotlin.collections.List<Team> = apiInstance.reposAddTeamAccessRestrictions(owner, repo, branch, reposAddTeamAccessRestrictionsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposAddTeamAccessRestrictions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposAddTeamAccessRestrictions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |
 **reposAddTeamAccessRestrictionsRequest** | [**ReposAddTeamAccessRestrictionsRequest**](ReposAddTeamAccessRestrictionsRequest.md)|  | [optional]

### Return type

[**kotlin.collections.List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposAddUserAccessRestrictions"></a>
# **reposAddUserAccessRestrictions**
> kotlin.collections.List&lt;SimpleUser&gt; reposAddUserAccessRestrictions(owner, repo, branch, reposSetUserAccessRestrictionsRequest)

Add user access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Grants the specified people push access for this branch.  | Type    | Description                                                                                                                   | | ------- | ----------------------------------------------------------------------------------------------------------------------------- | | &#x60;array&#x60; | Usernames for people who can have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
val reposSetUserAccessRestrictionsRequest : ReposSetUserAccessRestrictionsRequest = {"users":["octocat"]} // ReposSetUserAccessRestrictionsRequest | 
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.reposAddUserAccessRestrictions(owner, repo, branch, reposSetUserAccessRestrictionsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposAddUserAccessRestrictions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposAddUserAccessRestrictions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |
 **reposSetUserAccessRestrictionsRequest** | [**ReposSetUserAccessRestrictionsRequest**](ReposSetUserAccessRestrictionsRequest.md)|  | [optional]

### Return type

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCancelPagesDeployment"></a>
# **reposCancelPagesDeployment**
> reposCancelPagesDeployment(owner, repo, pagesDeploymentId)

Cancel a GitHub Pages deployment

Cancels a GitHub Pages deployment.  The authenticated user must have write permissions for the GitHub Pages site.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pagesDeploymentId : String =  // String | The ID of the Pages deployment. You can also give the commit SHA of the deployment.
try {
    apiInstance.reposCancelPagesDeployment(owner, repo, pagesDeploymentId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCancelPagesDeployment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCancelPagesDeployment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pagesDeploymentId** | [**String**](.md)| The ID of the Pages deployment. You can also give the commit SHA of the deployment. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposCheckAutomatedSecurityFixes"></a>
# **reposCheckAutomatedSecurityFixes**
> CheckAutomatedSecurityFixes reposCheckAutomatedSecurityFixes(owner, repo)

Check if automated security fixes are enabled for a repository

Shows whether automated security fixes are enabled, disabled or paused for a repository. The authenticated user must have admin read access to the repository. For more information, see \&quot;[Configuring automated security fixes](https://docs.github.com/articles/configuring-automated-security-fixes)\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : CheckAutomatedSecurityFixes = apiInstance.reposCheckAutomatedSecurityFixes(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCheckAutomatedSecurityFixes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCheckAutomatedSecurityFixes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**CheckAutomatedSecurityFixes**](CheckAutomatedSecurityFixes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposCheckCollaborator"></a>
# **reposCheckCollaborator**
> reposCheckCollaborator(owner, repo, username)

Check if a user is a repository collaborator

For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners.  Team members will include the members of child teams.  The authenticated user must have push access to the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:org&#x60; and &#x60;repo&#x60; scopes to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.reposCheckCollaborator(owner, repo, username)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCheckCollaborator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCheckCollaborator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reposCheckPrivateVulnerabilityReporting"></a>
# **reposCheckPrivateVulnerabilityReporting**
> ReposCheckPrivateVulnerabilityReporting200Response reposCheckPrivateVulnerabilityReporting(owner, repo)

Check if private vulnerability reporting is enabled for a repository

Returns a boolean indicating whether or not private vulnerability reporting is enabled for the repository. For more information, see \&quot;[Evaluating the security settings of a repository](https://docs.github.com/code-security/security-advisories/working-with-repository-security-advisories/evaluating-the-security-settings-of-a-repository)\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : ReposCheckPrivateVulnerabilityReporting200Response = apiInstance.reposCheckPrivateVulnerabilityReporting(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCheckPrivateVulnerabilityReporting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCheckPrivateVulnerabilityReporting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**ReposCheckPrivateVulnerabilityReporting200Response**](ReposCheckPrivateVulnerabilityReporting200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="reposCheckVulnerabilityAlerts"></a>
# **reposCheckVulnerabilityAlerts**
> reposCheckVulnerabilityAlerts(owner, repo)

Check if vulnerability alerts are enabled for a repository

Shows whether dependency alerts are enabled or disabled for a repository. The authenticated user must have admin read access to the repository. For more information, see \&quot;[About security alerts for vulnerable dependencies](https://docs.github.com/articles/about-security-alerts-for-vulnerable-dependencies)\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    apiInstance.reposCheckVulnerabilityAlerts(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCheckVulnerabilityAlerts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCheckVulnerabilityAlerts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reposCodeownersErrors"></a>
# **reposCodeownersErrors**
> CodeownersErrors reposCodeownersErrors(owner, repo, ref)

List CODEOWNERS errors

List any syntax errors that are detected in the CODEOWNERS file.  For more information about the correct CODEOWNERS syntax, see \&quot;[About code owners](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/about-code-owners).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ref : kotlin.String = ref_example // kotlin.String | A branch, tag or commit name used to determine which version of the CODEOWNERS file to use. Default: the repository's default branch (e.g. `main`)
try {
    val result : CodeownersErrors = apiInstance.reposCodeownersErrors(owner, repo, ref)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCodeownersErrors")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCodeownersErrors")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ref** | **kotlin.String**| A branch, tag or commit name used to determine which version of the CODEOWNERS file to use. Default: the repository&#39;s default branch (e.g. &#x60;main&#x60;) | [optional] [default to &quot;push&quot;]

### Return type

[**CodeownersErrors**](CodeownersErrors.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposCompareCommits"></a>
# **reposCompareCommits**
> CommitComparison reposCompareCommits(owner, repo, basehead, page, perPage)

Compare two commits

Compares two commits against one another. You can compare refs (branches or tags) and commit SHAs in the same repository, or you can compare refs and commit SHAs that exist in different repositories within the same repository network, including fork branches. For more information about how to view a repository&#39;s network, see \&quot;[Understanding connections between repositories](https://docs.github.com/repositories/viewing-activity-and-data-for-your-repository/understanding-connections-between-repositories).\&quot;  This endpoint is equivalent to running the &#x60;git log BASE..HEAD&#x60; command, but it returns commits in a different order. The &#x60;git log BASE..HEAD&#x60; command returns commits in reverse chronological order, whereas the API returns commits in chronological order.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.diff&#x60;**: Returns the diff of the commit. - **&#x60;application/vnd.github.patch&#x60;**: Returns the patch of the commit. Diffs with binary data will have no &#x60;patch&#x60; property.  The API response includes details about the files that were changed between the two commits. This includes the status of the change (if a file was added, removed, modified, or renamed), and details of the change itself. For example, files with a &#x60;renamed&#x60; status have a &#x60;previous_filename&#x60; field showing the previous filename of the file, and files with a &#x60;modified&#x60; status have a &#x60;patch&#x60; field showing the changes made to the file.  When calling this endpoint without any paging parameter (&#x60;per_page&#x60; or &#x60;page&#x60;), the returned list is limited to 250 commits, and the last commit in the list is the most recent of the entire comparison.  **Working with large comparisons**  To process a response with a large number of commits, use a query parameter (&#x60;per_page&#x60; or &#x60;page&#x60;) to paginate the results. When using pagination:  - The list of changed files is only shown on the first page of results, but it includes all changed files for the entire comparison. - The results are returned in chronological order, but the last commit in the returned list may not be the most recent one in the entire set if there are more pages of results.  For more information on working with pagination, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).\&quot;  **Signature verification object**  The response will include a &#x60;verification&#x60; object that describes the result of verifying the commit&#39;s signature. The &#x60;verification&#x60; object includes the following fields:  | Name | Type | Description | | ---- | ---- | ----------- | | &#x60;verified&#x60; | &#x60;boolean&#x60; | Indicates whether GitHub considers the signature in this commit to be verified. | | &#x60;reason&#x60; | &#x60;string&#x60; | The reason for verified value. Possible values and their meanings are enumerated in table below. | | &#x60;signature&#x60; | &#x60;string&#x60; | The signature that was extracted from the commit. | | &#x60;payload&#x60; | &#x60;string&#x60; | The value that was signed. |  These are the possible values for &#x60;reason&#x60; in the &#x60;verification&#x60; object:  | Value | Description | | ----- | ----------- | | &#x60;expired_key&#x60; | The key that made the signature is expired. | | &#x60;not_signing_key&#x60; | The \&quot;signing\&quot; flag is not among the usage flags in the GPG key that made the signature. | | &#x60;gpgverify_error&#x60; | There was an error communicating with the signature verification service. | | &#x60;gpgverify_unavailable&#x60; | The signature verification service is currently unavailable. | | &#x60;unsigned&#x60; | The object does not include a signature. | | &#x60;unknown_signature_type&#x60; | A non-PGP signature was found in the commit. | | &#x60;no_user&#x60; | No user was associated with the &#x60;committer&#x60; email address in the commit. | | &#x60;unverified_email&#x60; | The &#x60;committer&#x60; email address in the commit was associated with a user, but the email address is not verified on their account. | | &#x60;bad_email&#x60; | The &#x60;committer&#x60; email address in the commit is not included in the identities of the PGP key that made the signature. | | &#x60;unknown_key&#x60; | The key that made the signature has not been registered with any user&#39;s account. | | &#x60;malformed_signature&#x60; | There was an error parsing the signature. | | &#x60;invalid&#x60; | The signature could not be cryptographically verified using the key whose key-id was found in the signature. | | &#x60;valid&#x60; | None of the above errors applied, so the signature is considered to be verified. |

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val basehead : kotlin.String = basehead_example // kotlin.String | The base branch and head branch to compare. This parameter expects the format `BASE...HEAD`. Both must be branch names in `repo`. To compare with a branch that exists in a different repository in the same network as `repo`, the `basehead` parameter expects the format `USERNAME:BASE...USERNAME:HEAD`.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : CommitComparison = apiInstance.reposCompareCommits(owner, repo, basehead, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCompareCommits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCompareCommits")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **basehead** | **kotlin.String**| The base branch and head branch to compare. This parameter expects the format &#x60;BASE...HEAD&#x60;. Both must be branch names in &#x60;repo&#x60;. To compare with a branch that exists in a different repository in the same network as &#x60;repo&#x60;, the &#x60;basehead&#x60; parameter expects the format &#x60;USERNAME:BASE...USERNAME:HEAD&#x60;. | [default to &quot;push&quot;]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**CommitComparison**](CommitComparison.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposCreateAutolink"></a>
# **reposCreateAutolink**
> Autolink reposCreateAutolink(owner, repo, reposCreateAutolinkRequest)

Create an autolink reference for a repository

Users with admin access to the repository can create an autolink.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposCreateAutolinkRequest : ReposCreateAutolinkRequest = {"key_prefix":"TICKET-","url_template":"https://example.com/TICKET?query=<num>","is_alphanumeric":true} // ReposCreateAutolinkRequest | 
try {
    val result : Autolink = apiInstance.reposCreateAutolink(owner, repo, reposCreateAutolinkRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateAutolink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateAutolink")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposCreateAutolinkRequest** | [**ReposCreateAutolinkRequest**](ReposCreateAutolinkRequest.md)|  |

### Return type

[**Autolink**](Autolink.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateCommitComment"></a>
# **reposCreateCommitComment**
> CommitComment reposCreateCommitComment(owner, repo, commitSha, reposCreateCommitCommentRequest)

Create a commit comment

Create a comment for a commit using its &#x60;:commit_sha&#x60;.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information, see \&quot;[Rate limits for the API](https://docs.github.com/rest/overview/rate-limits-for-the-rest-api#about-secondary-rate-limits)\&quot; and \&quot;[Best practices for using the REST API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api).\&quot;  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commitSha : kotlin.String = commitSha_example // kotlin.String | The SHA of the commit.
val reposCreateCommitCommentRequest : ReposCreateCommitCommentRequest = {"body":"Great stuff","path":"file1.txt","position":4,"line":1} // ReposCreateCommitCommentRequest | 
try {
    val result : CommitComment = apiInstance.reposCreateCommitComment(owner, repo, commitSha, reposCreateCommitCommentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateCommitComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateCommitComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commitSha** | **kotlin.String**| The SHA of the commit. |
 **reposCreateCommitCommentRequest** | [**ReposCreateCommitCommentRequest**](ReposCreateCommitCommentRequest.md)|  |

### Return type

[**CommitComment**](CommitComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateCommitSignatureProtection"></a>
# **reposCreateCommitSignatureProtection**
> ProtectedBranchAdminEnforced reposCreateCommitSignatureProtection(owner, repo, branch)

Create commit signature protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  When authenticated with admin or owner permissions to the repository, you can use this endpoint to require signed commits on a branch. You must enable branch protection to require signed commits.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    val result : ProtectedBranchAdminEnforced = apiInstance.reposCreateCommitSignatureProtection(owner, repo, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateCommitSignatureProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateCommitSignatureProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

[**ProtectedBranchAdminEnforced**](ProtectedBranchAdminEnforced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposCreateCommitStatus"></a>
# **reposCreateCommitStatus**
> Status reposCreateCommitStatus(owner, repo, sha, reposCreateCommitStatusRequest)

Create a commit status

Users with push access in a repository can create commit statuses for a given SHA.  Note: there is a limit of 1000 statuses per &#x60;sha&#x60; and &#x60;context&#x60; within a repository. Attempts to create more than 1000 statuses will result in a validation error.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val sha : kotlin.String = sha_example // kotlin.String | 
val reposCreateCommitStatusRequest : ReposCreateCommitStatusRequest = {"state":"success","target_url":"https://example.com/build/status","description":"The build succeeded!","context":"continuous-integration/jenkins"} // ReposCreateCommitStatusRequest | 
try {
    val result : Status = apiInstance.reposCreateCommitStatus(owner, repo, sha, reposCreateCommitStatusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateCommitStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateCommitStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **sha** | **kotlin.String**|  | [default to &quot;push&quot;]
 **reposCreateCommitStatusRequest** | [**ReposCreateCommitStatusRequest**](ReposCreateCommitStatusRequest.md)|  |

### Return type

[**Status**](Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateDeployKey"></a>
# **reposCreateDeployKey**
> DeployKey reposCreateDeployKey(owner, repo, reposCreateDeployKeyRequest)

Create a deploy key

You can create a read-only deploy key.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposCreateDeployKeyRequest : ReposCreateDeployKeyRequest = {"title":"octocat@octomac","key":"ssh-rsa AAA...","read_only":true} // ReposCreateDeployKeyRequest | 
try {
    val result : DeployKey = apiInstance.reposCreateDeployKey(owner, repo, reposCreateDeployKeyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateDeployKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateDeployKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposCreateDeployKeyRequest** | [**ReposCreateDeployKeyRequest**](ReposCreateDeployKeyRequest.md)|  |

### Return type

[**DeployKey**](DeployKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateDeployment"></a>
# **reposCreateDeployment**
> Deployment reposCreateDeployment(owner, repo, reposCreateDeploymentRequest)

Create a deployment

Deployments offer a few configurable parameters with certain defaults.  The &#x60;ref&#x60; parameter can be any named branch, tag, or SHA. At GitHub we often deploy branches and verify them before we merge a pull request.  The &#x60;environment&#x60; parameter allows deployments to be issued to different runtime environments. Teams often have multiple environments for verifying their applications, such as &#x60;production&#x60;, &#x60;staging&#x60;, and &#x60;qa&#x60;. This parameter makes it easier to track which environments have requested deployments. The default environment is &#x60;production&#x60;.  The &#x60;auto_merge&#x60; parameter is used to ensure that the requested ref is not behind the repository&#39;s default branch. If the ref _is_ behind the default branch for the repository, we will attempt to merge it for you. If the merge succeeds, the API will return a successful merge commit. If merge conflicts prevent the merge from succeeding, the API will return a failure response.  By default, [commit statuses](https://docs.github.com/rest/commits/statuses) for every submitted context must be in a &#x60;success&#x60; state. The &#x60;required_contexts&#x60; parameter allows you to specify a subset of contexts that must be &#x60;success&#x60;, or to specify contexts that have not yet been submitted. You are not required to use commit statuses to deploy. If you do not require any contexts or create any commit statuses, the deployment will always succeed.  The &#x60;payload&#x60; parameter is available for any extra information that a deployment system might need. It is a JSON text field that will be passed on when a deployment event is dispatched.  The &#x60;task&#x60; parameter is used by the deployment system to allow different execution paths. In the web world this might be &#x60;deploy:migrations&#x60; to run schema changes on the system. In the compiled world this could be a flag to compile an application with debugging enabled.  Merged branch response:  You will see this response when GitHub automatically merges the base branch into the topic branch instead of creating a deployment. This auto-merge happens when: *   Auto-merge option is enabled in the repository *   Topic branch does not include the latest changes on the base branch, which is &#x60;master&#x60; in the response example *   There are no merge conflicts  If there are no new commits in the base branch, a new request to create a deployment should give a successful response.  Merge conflict response:  This error happens when the &#x60;auto_merge&#x60; option is enabled and when the default branch (in this case &#x60;master&#x60;), can&#39;t be merged into the branch that&#39;s being deployed (in this case &#x60;topic-branch&#x60;), due to merge conflicts.  Failed commit status checks:  This error happens when the &#x60;required_contexts&#x60; parameter indicates that one or more contexts need to have a &#x60;success&#x60; status for the commit to be deployed, but one or more of the required contexts do not have a state of &#x60;success&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;repo_deployment&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposCreateDeploymentRequest : ReposCreateDeploymentRequest = {"ref":"topic-branch","payload":"{ \"deploy\": \"migrate\" }","description":"Deploy request from hubot"} // ReposCreateDeploymentRequest | 
try {
    val result : Deployment = apiInstance.reposCreateDeployment(owner, repo, reposCreateDeploymentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateDeployment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateDeployment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposCreateDeploymentRequest** | [**ReposCreateDeploymentRequest**](ReposCreateDeploymentRequest.md)|  |

### Return type

[**Deployment**](Deployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateDeploymentBranchPolicy"></a>
# **reposCreateDeploymentBranchPolicy**
> DeploymentBranchPolicy reposCreateDeploymentBranchPolicy(owner, repo, environmentName, deploymentBranchPolicyNamePatternWithType)

Create a deployment branch policy

Creates a deployment branch or tag policy for an environment.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val deploymentBranchPolicyNamePatternWithType : DeploymentBranchPolicyNamePatternWithType = {"name":"release/*"} // DeploymentBranchPolicyNamePatternWithType | 
try {
    val result : DeploymentBranchPolicy = apiInstance.reposCreateDeploymentBranchPolicy(owner, repo, environmentName, deploymentBranchPolicyNamePatternWithType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateDeploymentBranchPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateDeploymentBranchPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **deploymentBranchPolicyNamePatternWithType** | [**DeploymentBranchPolicyNamePatternWithType**](DeploymentBranchPolicyNamePatternWithType.md)|  |

### Return type

[**DeploymentBranchPolicy**](DeploymentBranchPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateDeploymentProtectionRule"></a>
# **reposCreateDeploymentProtectionRule**
> DeploymentProtectionRule reposCreateDeploymentProtectionRule(environmentName, repo, owner, reposCreateDeploymentProtectionRuleRequest)

Create a custom deployment protection rule on an environment

Enable a custom deployment protection rule for an environment.  The authenticated user must have admin or owner permissions to the repository to use this endpoint.  For more information about the app that is providing this custom deployment rule, see the [documentation for the &#x60;GET /apps/{app_slug}&#x60; endpoint](https://docs.github.com/rest/apps/apps#get-an-app).  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val reposCreateDeploymentProtectionRuleRequest : ReposCreateDeploymentProtectionRuleRequest = {"integration_id":5} // ReposCreateDeploymentProtectionRuleRequest | 
try {
    val result : DeploymentProtectionRule = apiInstance.reposCreateDeploymentProtectionRule(environmentName, repo, owner, reposCreateDeploymentProtectionRuleRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateDeploymentProtectionRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateDeploymentProtectionRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **reposCreateDeploymentProtectionRuleRequest** | [**ReposCreateDeploymentProtectionRuleRequest**](ReposCreateDeploymentProtectionRuleRequest.md)|  |

### Return type

[**DeploymentProtectionRule**](DeploymentProtectionRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateDeploymentStatus"></a>
# **reposCreateDeploymentStatus**
> DeploymentStatus reposCreateDeploymentStatus(owner, repo, deploymentId, reposCreateDeploymentStatusRequest)

Create a deployment status

Users with &#x60;push&#x60; access can create deployment statuses for a given deployment.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo_deployment&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val deploymentId : kotlin.Int = 56 // kotlin.Int | deployment_id parameter
val reposCreateDeploymentStatusRequest : ReposCreateDeploymentStatusRequest = {"environment":"production","state":"success","log_url":"https://example.com/deployment/42/output","description":"Deployment finished successfully."} // ReposCreateDeploymentStatusRequest | 
try {
    val result : DeploymentStatus = apiInstance.reposCreateDeploymentStatus(owner, repo, deploymentId, reposCreateDeploymentStatusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateDeploymentStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateDeploymentStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **deploymentId** | **kotlin.Int**| deployment_id parameter |
 **reposCreateDeploymentStatusRequest** | [**ReposCreateDeploymentStatusRequest**](ReposCreateDeploymentStatusRequest.md)|  |

### Return type

[**DeploymentStatus**](DeploymentStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateDispatchEvent"></a>
# **reposCreateDispatchEvent**
> reposCreateDispatchEvent(owner, repo, reposCreateDispatchEventRequest)

Create a repository dispatch event

You can use this endpoint to trigger a webhook event called &#x60;repository_dispatch&#x60; when you want activity that happens outside of GitHub to trigger a GitHub Actions workflow or GitHub App webhook. You must configure your GitHub Actions workflow or GitHub App to run when the &#x60;repository_dispatch&#x60; event occurs. For an example &#x60;repository_dispatch&#x60; webhook payload, see \&quot;[RepositoryDispatchEvent](https://docs.github.com/webhooks/event-payloads/#repository_dispatch).\&quot;  The &#x60;client_payload&#x60; parameter is available for any extra information that your workflow might need. This parameter is a JSON payload that will be passed on when the webhook event is dispatched. For example, the &#x60;client_payload&#x60; can include a message that a user would like to send using a GitHub Actions workflow. Or the &#x60;client_payload&#x60; can be used as a test to debug your workflow.  This input example shows how you can use the &#x60;client_payload&#x60; as a test to debug your workflow.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposCreateDispatchEventRequest : ReposCreateDispatchEventRequest = {"event_type":"on-demand-test","client_payload":{"unit":false,"integration":true}} // ReposCreateDispatchEventRequest | 
try {
    apiInstance.reposCreateDispatchEvent(owner, repo, reposCreateDispatchEventRequest)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateDispatchEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateDispatchEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposCreateDispatchEventRequest** | [**ReposCreateDispatchEventRequest**](ReposCreateDispatchEventRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateForAuthenticatedUser"></a>
# **reposCreateForAuthenticatedUser**
> FullRepository reposCreateForAuthenticatedUser(reposCreateForAuthenticatedUserRequest)

Create a repository for the authenticated user

Creates a new repository for the authenticated user.  OAuth app tokens and personal access tokens (classic) need the &#x60;public_repo&#x60; or &#x60;repo&#x60; scope to create a public repository, and &#x60;repo&#x60; scope to create a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val reposCreateForAuthenticatedUserRequest : ReposCreateForAuthenticatedUserRequest = {"name":"Hello-World","description":"This is your first repo!","homepage":"https://github.com","private":false,"is_template":true} // ReposCreateForAuthenticatedUserRequest | 
try {
    val result : FullRepository = apiInstance.reposCreateForAuthenticatedUser(reposCreateForAuthenticatedUserRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reposCreateForAuthenticatedUserRequest** | [**ReposCreateForAuthenticatedUserRequest**](ReposCreateForAuthenticatedUserRequest.md)|  |

### Return type

[**FullRepository**](FullRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/scim+json

<a id="reposCreateFork"></a>
# **reposCreateFork**
> FullRepository reposCreateFork(owner, repo, reposCreateForkRequest)

Create a fork

Create a fork for the authenticated user.  **Note**: Forking a Repository happens asynchronously. You may have to wait a short period of time before you can access the git objects. If this takes longer than 5 minutes, be sure to contact [GitHub Support](https://support.github.com/contact?tags&#x3D;dotcom-rest-api).  **Note**: Although this endpoint works with GitHub Apps, the GitHub App must be installed on the destination account with access to all repositories and on the source account with access to the source repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposCreateForkRequest : ReposCreateForkRequest = {"organization":"octocat","name":"Hello-World","default_branch_only":true} // ReposCreateForkRequest | 
try {
    val result : FullRepository = apiInstance.reposCreateFork(owner, repo, reposCreateForkRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateFork")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateFork")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposCreateForkRequest** | [**ReposCreateForkRequest**](ReposCreateForkRequest.md)|  | [optional]

### Return type

[**FullRepository**](FullRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/scim+json

<a id="reposCreateInOrg"></a>
# **reposCreateInOrg**
> FullRepository reposCreateInOrg(org, reposCreateInOrgRequest)

Create an organization repository

Creates a new repository in the specified organization. The authenticated user must be a member of the organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;public_repo&#x60; or &#x60;repo&#x60; scope to create a public repository, and &#x60;repo&#x60; scope to create a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val reposCreateInOrgRequest : ReposCreateInOrgRequest = {"name":"Hello-World","description":"This is your first repository","homepage":"https://github.com","private":false,"has_issues":true,"has_projects":true,"has_wiki":true} // ReposCreateInOrgRequest | 
try {
    val result : FullRepository = apiInstance.reposCreateInOrg(org, reposCreateInOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateInOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateInOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **reposCreateInOrgRequest** | [**ReposCreateInOrgRequest**](ReposCreateInOrgRequest.md)|  |

### Return type

[**FullRepository**](FullRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateOrUpdateCustomPropertiesValues"></a>
# **reposCreateOrUpdateCustomPropertiesValues**
> reposCreateOrUpdateCustomPropertiesValues(owner, repo, reposCreateOrUpdateCustomPropertiesValuesRequest)

Create or update custom property values for a repository

Create new or update existing custom property values for a repository. Using a value of &#x60;null&#x60; for a custom property will remove or &#39;unset&#39; the property value from the repository.  Repository admins and other users with the repository-level \&quot;edit custom property values\&quot; fine-grained permission can use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposCreateOrUpdateCustomPropertiesValuesRequest : ReposCreateOrUpdateCustomPropertiesValuesRequest =  // ReposCreateOrUpdateCustomPropertiesValuesRequest | 
try {
    apiInstance.reposCreateOrUpdateCustomPropertiesValues(owner, repo, reposCreateOrUpdateCustomPropertiesValuesRequest)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateOrUpdateCustomPropertiesValues")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateOrUpdateCustomPropertiesValues")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposCreateOrUpdateCustomPropertiesValuesRequest** | [**ReposCreateOrUpdateCustomPropertiesValuesRequest**](ReposCreateOrUpdateCustomPropertiesValuesRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateOrUpdateEnvironment"></a>
# **reposCreateOrUpdateEnvironment**
> Environment reposCreateOrUpdateEnvironment(owner, repo, environmentName, reposCreateOrUpdateEnvironmentRequest)

Create or update an environment

Create or update an environment with protection rules, such as required reviewers. For more information about environment protection rules, see \&quot;[Environments](/actions/reference/environments#environment-protection-rules).\&quot;  **Note:** To create or update name patterns that branches must match in order to deploy to this environment, see \&quot;[Deployment branch policies](/rest/deployments/branch-policies).\&quot;  **Note:** To create or update secrets for an environment, see \&quot;[GitHub Actions secrets](/rest/actions/secrets).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val reposCreateOrUpdateEnvironmentRequest : ReposCreateOrUpdateEnvironmentRequest = {"wait_timer":30,"prevent_self_review":false,"reviewers":[{"type":"User","id":1},{"type":"Team","id":1}],"deployment_branch_policy":{"protected_branches":false,"custom_branch_policies":true}} // ReposCreateOrUpdateEnvironmentRequest | 
try {
    val result : Environment = apiInstance.reposCreateOrUpdateEnvironment(owner, repo, environmentName, reposCreateOrUpdateEnvironmentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateOrUpdateEnvironment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateOrUpdateEnvironment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **reposCreateOrUpdateEnvironmentRequest** | [**ReposCreateOrUpdateEnvironmentRequest**](ReposCreateOrUpdateEnvironmentRequest.md)|  | [optional]

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateOrUpdateFileContents"></a>
# **reposCreateOrUpdateFileContents**
> FileCommit reposCreateOrUpdateFileContents(owner, repo, path, reposCreateOrUpdateFileContentsRequest)

Create or update file contents

Creates a new file or replaces an existing file in a repository.  **Note:** If you use this endpoint and the \&quot;[Delete a file](https://docs.github.com/rest/repos/contents/#delete-a-file)\&quot; endpoint in parallel, the concurrent requests will conflict and you will receive errors. You must use these endpoints serially instead.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint. The &#x60;workflow&#x60; scope is also required in order to modify files in the &#x60;.github/workflows&#x60; directory.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val path : kotlin.String = path_example // kotlin.String | path parameter
val reposCreateOrUpdateFileContentsRequest : ReposCreateOrUpdateFileContentsRequest = {"message":"my commit message","committer":{"name":"Monalisa Octocat","email":"octocat@github.com"},"content":"bXkgbmV3IGZpbGUgY29udGVudHM="} // ReposCreateOrUpdateFileContentsRequest | 
try {
    val result : FileCommit = apiInstance.reposCreateOrUpdateFileContents(owner, repo, path, reposCreateOrUpdateFileContentsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateOrUpdateFileContents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateOrUpdateFileContents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **path** | **kotlin.String**| path parameter |
 **reposCreateOrUpdateFileContentsRequest** | [**ReposCreateOrUpdateFileContentsRequest**](ReposCreateOrUpdateFileContentsRequest.md)|  |

### Return type

[**FileCommit**](FileCommit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateOrgRuleset"></a>
# **reposCreateOrgRuleset**
> RepositoryRuleset reposCreateOrgRuleset(org, reposCreateOrgRulesetRequest)

Create an organization repository ruleset

Create a repository ruleset for an organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val reposCreateOrgRulesetRequest : ReposCreateOrgRulesetRequest = {"name":"super cool ruleset","target":"branch","enforcement":"active","bypass_actors":[{"actor_id":234,"actor_type":"Team","bypass_mode":"always"}],"conditions":{"ref_name":{"include":["refs/heads/main","refs/heads/master"],"exclude":["refs/heads/dev*"]},"repository_name":{"include":["important_repository","another_important_repository"],"exclude":["unimportant_repository"],"protected":true}},"rules":[{"type":"commit_author_email_pattern","parameters":{"operator":"contains","pattern":"github"}}]} // ReposCreateOrgRulesetRequest | Request body
try {
    val result : RepositoryRuleset = apiInstance.reposCreateOrgRuleset(org, reposCreateOrgRulesetRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateOrgRuleset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateOrgRuleset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **reposCreateOrgRulesetRequest** | [**ReposCreateOrgRulesetRequest**](ReposCreateOrgRulesetRequest.md)| Request body |

### Return type

[**RepositoryRuleset**](RepositoryRuleset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreatePagesDeployment"></a>
# **reposCreatePagesDeployment**
> PageDeployment reposCreatePagesDeployment(owner, repo, reposCreatePagesDeploymentRequest)

Create a GitHub Pages deployment

Create a GitHub Pages deployment for a repository.  The authenticated user must have write permission to the repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposCreatePagesDeploymentRequest : ReposCreatePagesDeploymentRequest = {"artifact_url":"https://downloadcontent/","environment":"github-pages","pages_build_version":"4fd754f7e594640989b406850d0bc8f06a121251","oidc_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6IlV2R1h4SUhlY0JFc1JCdEttemUxUEhfUERiVSIsImtpZCI6IjUyRjE5N0M0ODFERTcwMTEyQzQ0MUI0QTlCMzdCNTNDN0ZDRjBEQjUifQ.eyJqdGkiOiJhMWIwNGNjNy0zNzZiLTQ1N2QtOTMzNS05NTY5YmVjZDExYTIiLCJzdWIiOiJyZXBvOnBhcGVyLXNwYS9taW55aTplbnZpcm9ubWVudDpQcm9kdWN0aW9uIiwiYXVkIjoiaHR0cHM6Ly9naXRodWIuY29tL3BhcGVyLXNwYSIsInJlZiI6InJlZnMvaGVhZHMvbWFpbiIsInNoYSI6ImEyODU1MWJmODdiZDk3NTFiMzdiMmM0YjM3M2MxZjU3NjFmYWM2MjYiLCJyZXBvc2l0b3J5IjoicGFwZXItc3BhL21pbnlpIiwicmVwb3NpdG9yeV9vd25lciI6InBhcGVyLXNwYSIsInJ1bl9pZCI6IjE1NDY0NTkzNjQiLCJydW5fbnVtYmVyIjoiMzQiLCJydW5fYXR0ZW1wdCI6IjYiLCJhY3RvciI6IllpTXlzdHkiLCJ3b3JrZmxvdyI6IkNJIiwiaGVhZF9yZWYiOiIiLCJiYXNlX3JlZiI6IiIsImV2ZW50X25hbWUiOiJwdXNoIiwicmVmX3R5cGUiOiJicmFuY2giLCJlbnZpcm9ubWVudCI6IlByb2R1Y3Rpb24iLCJqb2Jfd29ya2Zsb3dfcmVmIjoicGFwZXItc3BhL21pbnlpLy5naXRodWIvd29ya2Zsb3dzL2JsYW5rLnltbEByZWZzL2hlYWRzL21haW4iLCJpc3MiOiJodHRwczovL3Rva2VuLmFjdGlvbnMuZ2l0aHVidXNlcmNvbnRlbnQuY29tIiwibmJmIjoxNjM5MDAwODU2LCJleHAiOjE2MzkwMDE3NTYsImlhdCI6MTYzOTAwMTQ1Nn0.VP8WictbQECKozE2SgvKb2FqJ9hisWsoMkYRTqfBrQfZTCXi5IcFEdgDMB2X7a99C2DeUuTvHh9RMKXLL2a0zg3-Sd7YrO7a2ll2kNlnvyIypcN6AeIc7BxHsTTnZN9Ud_xmEsTrSRGOEKmzCFkULQ6N4zlVD0sidypmXlMemmWEcv_ZHqhioEI_VMp5vwXQurketWH7qX4oDgG4okyYtPrv5RQHbfQcVo9izaPJ_jnsDd0CBA0QOx9InjPidtIkMYQLyUgJy33HLJy86EFNUnAf8UhBQuQi5mAsEpEzBBuKpG3PDiPtYCHOk64JZkZGd5mR888a5sbHRiaF8hm8YA","preview":false} // ReposCreatePagesDeploymentRequest | 
try {
    val result : PageDeployment = apiInstance.reposCreatePagesDeployment(owner, repo, reposCreatePagesDeploymentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreatePagesDeployment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreatePagesDeployment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposCreatePagesDeploymentRequest** | [**ReposCreatePagesDeploymentRequest**](ReposCreatePagesDeploymentRequest.md)|  |

### Return type

[**PageDeployment**](PageDeployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/scim+json

<a id="reposCreatePagesSite"></a>
# **reposCreatePagesSite**
> Page reposCreatePagesSite(owner, repo, reposCreatePagesSiteRequest)

Create a GitHub Pages site

Configures a GitHub Pages site. For more information, see \&quot;[About GitHub Pages](/github/working-with-github-pages/about-github-pages).\&quot;  The authenticated user must be a repository administrator, maintainer, or have the &#39;manage GitHub Pages settings&#39; permission.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposCreatePagesSiteRequest : ReposCreatePagesSiteRequest = {"source":{"branch":"main","path":"/docs"}} // ReposCreatePagesSiteRequest | 
try {
    val result : Page = apiInstance.reposCreatePagesSite(owner, repo, reposCreatePagesSiteRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreatePagesSite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreatePagesSite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposCreatePagesSiteRequest** | [**ReposCreatePagesSiteRequest**](ReposCreatePagesSiteRequest.md)|  |

### Return type

[**Page**](Page.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateRelease"></a>
# **reposCreateRelease**
> Release reposCreateRelease(owner, repo, reposCreateReleaseRequest)

Create a release

Users with push access to the repository can create a release.  This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information, see \&quot;[Rate limits for the API](https://docs.github.com/rest/overview/rate-limits-for-the-rest-api#about-secondary-rate-limits)\&quot; and \&quot;[Best practices for using the REST API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposCreateReleaseRequest : ReposCreateReleaseRequest = {"tag_name":"v1.0.0","target_commitish":"master","name":"v1.0.0","body":"Description of the release","draft":false,"prerelease":false,"generate_release_notes":false} // ReposCreateReleaseRequest | 
try {
    val result : Release = apiInstance.reposCreateRelease(owner, repo, reposCreateReleaseRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateRelease")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateRelease")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposCreateReleaseRequest** | [**ReposCreateReleaseRequest**](ReposCreateReleaseRequest.md)|  |

### Return type

[**Release**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateRepoRuleset"></a>
# **reposCreateRepoRuleset**
> RepositoryRuleset reposCreateRepoRuleset(owner, repo, reposCreateRepoRulesetRequest)

Create a repository ruleset

Create a ruleset for a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposCreateRepoRulesetRequest : ReposCreateRepoRulesetRequest = {"name":"super cool ruleset","target":"branch","enforcement":"active","bypass_actors":[{"actor_id":234,"actor_type":"Team","bypass_mode":"always"}],"conditions":{"ref_name":{"include":["refs/heads/main","refs/heads/master"],"exclude":["refs/heads/dev*"]}},"rules":[{"type":"commit_author_email_pattern","parameters":{"operator":"contains","pattern":"github"}}]} // ReposCreateRepoRulesetRequest | Request body
try {
    val result : RepositoryRuleset = apiInstance.reposCreateRepoRuleset(owner, repo, reposCreateRepoRulesetRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateRepoRuleset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateRepoRuleset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposCreateRepoRulesetRequest** | [**ReposCreateRepoRulesetRequest**](ReposCreateRepoRulesetRequest.md)| Request body |

### Return type

[**RepositoryRuleset**](RepositoryRuleset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateTagProtection"></a>
# **reposCreateTagProtection**
> TagProtection reposCreateTagProtection(owner, repo, reposCreateTagProtectionRequest)

Create a tag protection state for a repository

This creates a tag protection state for a repository. This endpoint is only available to repository administrators.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposCreateTagProtectionRequest : ReposCreateTagProtectionRequest = {"pattern":"v1.*"} // ReposCreateTagProtectionRequest | 
try {
    val result : TagProtection = apiInstance.reposCreateTagProtection(owner, repo, reposCreateTagProtectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateTagProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateTagProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposCreateTagProtectionRequest** | [**ReposCreateTagProtectionRequest**](ReposCreateTagProtectionRequest.md)|  |

### Return type

[**TagProtection**](TagProtection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateUsingTemplate"></a>
# **reposCreateUsingTemplate**
> FullRepository reposCreateUsingTemplate(templateOwner, templateRepo, reposCreateUsingTemplateRequest)

Create a repository using a template

Creates a new repository using a repository template. Use the &#x60;template_owner&#x60; and &#x60;template_repo&#x60; route parameters to specify the repository to use as the template. If the repository is not public, the authenticated user must own or be a member of an organization that owns the repository. To check if a repository is available to use as a template, get the repository&#39;s information using the [Get a repository](https://docs.github.com/rest/repos/repos#get-a-repository) endpoint and check that the &#x60;is_template&#x60; key is &#x60;true&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;public_repo&#x60; or &#x60;repo&#x60; scope to create a public repository, and &#x60;repo&#x60; scope to create a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val templateOwner : kotlin.String = templateOwner_example // kotlin.String | The account owner of the template repository. The name is not case sensitive.
val templateRepo : kotlin.String = templateRepo_example // kotlin.String | The name of the template repository without the `.git` extension. The name is not case sensitive.
val reposCreateUsingTemplateRequest : ReposCreateUsingTemplateRequest = {"owner":"octocat","name":"Hello-World","description":"This is your first repository","include_all_branches":false,"private":false} // ReposCreateUsingTemplateRequest | 
try {
    val result : FullRepository = apiInstance.reposCreateUsingTemplate(templateOwner, templateRepo, reposCreateUsingTemplateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateUsingTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateUsingTemplate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateOwner** | **kotlin.String**| The account owner of the template repository. The name is not case sensitive. | [default to &quot;push&quot;]
 **templateRepo** | **kotlin.String**| The name of the template repository without the &#x60;.git&#x60; extension. The name is not case sensitive. | [default to &quot;push&quot;]
 **reposCreateUsingTemplateRequest** | [**ReposCreateUsingTemplateRequest**](ReposCreateUsingTemplateRequest.md)|  |

### Return type

[**FullRepository**](FullRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposCreateWebhook"></a>
# **reposCreateWebhook**
> Hook reposCreateWebhook(owner, repo, reposCreateWebhookRequest)

Create a repository webhook

Repositories can have multiple webhooks installed. Each webhook should have a unique &#x60;config&#x60;. Multiple webhooks can share the same &#x60;config&#x60; as long as those webhooks do not have any &#x60;events&#x60; that overlap.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposCreateWebhookRequest : ReposCreateWebhookRequest = {"name":"web","active":true,"events":["push","pull_request"],"config":{"url":"https://example.com/webhook","content_type":"json","insecure_ssl":"0"}} // ReposCreateWebhookRequest | 
try {
    val result : Hook = apiInstance.reposCreateWebhook(owner, repo, reposCreateWebhookRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposCreateWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposCreateWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposCreateWebhookRequest** | [**ReposCreateWebhookRequest**](ReposCreateWebhookRequest.md)|  | [optional]

### Return type

[**Hook**](Hook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposDeclineInvitationForAuthenticatedUser"></a>
# **reposDeclineInvitationForAuthenticatedUser**
> reposDeclineInvitationForAuthenticatedUser(invitationId)

Decline a repository invitation



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val invitationId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the invitation.
try {
    apiInstance.reposDeclineInvitationForAuthenticatedUser(invitationId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeclineInvitationForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeclineInvitationForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invitationId** | **kotlin.Int**| The unique identifier of the invitation. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposDelete"></a>
# **reposDelete**
> reposDelete(owner, repo)

Delete a repository

Deleting a repository requires admin access.  If an organization owner has configured the organization to prevent members from deleting organization-owned repositories, you will get a &#x60;403 Forbidden&#x60; response.  OAuth app tokens and personal access tokens (classic) need the &#x60;delete_repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    apiInstance.reposDelete(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposDeleteAccessRestrictions"></a>
# **reposDeleteAccessRestrictions**
> reposDeleteAccessRestrictions(owner, repo, branch)

Delete access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Disables the ability to restrict who can push to this branch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    apiInstance.reposDeleteAccessRestrictions(owner, repo, branch)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteAccessRestrictions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteAccessRestrictions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reposDeleteAdminBranchProtection"></a>
# **reposDeleteAdminBranchProtection**
> reposDeleteAdminBranchProtection(owner, repo, branch)

Delete admin branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Removing admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    apiInstance.reposDeleteAdminBranchProtection(owner, repo, branch)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteAdminBranchProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteAdminBranchProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposDeleteAnEnvironment"></a>
# **reposDeleteAnEnvironment**
> reposDeleteAnEnvironment(owner, repo, environmentName)

Delete an environment

OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
try {
    apiInstance.reposDeleteAnEnvironment(owner, repo, environmentName)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteAnEnvironment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteAnEnvironment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reposDeleteAutolink"></a>
# **reposDeleteAutolink**
> reposDeleteAutolink(owner, repo, autolinkId)

Delete an autolink reference from a repository

This deletes a single autolink reference by ID that was configured for the given repository.  Information about autolinks are only available to repository administrators.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val autolinkId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the autolink.
try {
    apiInstance.reposDeleteAutolink(owner, repo, autolinkId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteAutolink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteAutolink")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **autolinkId** | **kotlin.Int**| The unique identifier of the autolink. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposDeleteBranchProtection"></a>
# **reposDeleteBranchProtection**
> reposDeleteBranchProtection(owner, repo, branch)

Delete branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    apiInstance.reposDeleteBranchProtection(owner, repo, branch)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteBranchProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteBranchProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposDeleteCommitComment"></a>
# **reposDeleteCommitComment**
> reposDeleteCommitComment(owner, repo, commentId)

Delete a commit comment



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
try {
    apiInstance.reposDeleteCommitComment(owner, repo, commentId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteCommitComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteCommitComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposDeleteCommitSignatureProtection"></a>
# **reposDeleteCommitSignatureProtection**
> reposDeleteCommitSignatureProtection(owner, repo, branch)

Delete commit signature protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  When authenticated with admin or owner permissions to the repository, you can use this endpoint to disable required signed commits on a branch. You must enable branch protection to require signed commits.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    apiInstance.reposDeleteCommitSignatureProtection(owner, repo, branch)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteCommitSignatureProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteCommitSignatureProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposDeleteDeployKey"></a>
# **reposDeleteDeployKey**
> reposDeleteDeployKey(owner, repo, keyId)

Delete a deploy key

Deploy keys are immutable. If you need to update a key, remove the key and create a new one instead.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val keyId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the key.
try {
    apiInstance.reposDeleteDeployKey(owner, repo, keyId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteDeployKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteDeployKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **keyId** | **kotlin.Int**| The unique identifier of the key. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reposDeleteDeployment"></a>
# **reposDeleteDeployment**
> reposDeleteDeployment(owner, repo, deploymentId)

Delete a deployment

If the repository only has one deployment, you can delete the deployment regardless of its status. If the repository has more than one deployment, you can only delete inactive deployments. This ensures that repositories with multiple deployments will always have an active deployment.  To set a deployment as inactive, you must:  *   Create a new deployment that is active so that the system has a record of the current state, then delete the previously active deployment. *   Mark the active deployment as inactive by adding any non-successful deployment status.  For more information, see \&quot;[Create a deployment](https://docs.github.com/rest/deployments/deployments/#create-a-deployment)\&quot; and \&quot;[Create a deployment status](https://docs.github.com/rest/deployments/statuses#create-a-deployment-status).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; or &#x60;repo_deployment&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val deploymentId : kotlin.Int = 56 // kotlin.Int | deployment_id parameter
try {
    apiInstance.reposDeleteDeployment(owner, repo, deploymentId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteDeployment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteDeployment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **deploymentId** | **kotlin.Int**| deployment_id parameter |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposDeleteDeploymentBranchPolicy"></a>
# **reposDeleteDeploymentBranchPolicy**
> reposDeleteDeploymentBranchPolicy(owner, repo, environmentName, branchPolicyId)

Delete a deployment branch policy

Deletes a deployment branch or tag policy for an environment.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val branchPolicyId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the branch policy.
try {
    apiInstance.reposDeleteDeploymentBranchPolicy(owner, repo, environmentName, branchPolicyId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteDeploymentBranchPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteDeploymentBranchPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **branchPolicyId** | **kotlin.Int**| The unique identifier of the branch policy. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reposDeleteFile"></a>
# **reposDeleteFile**
> FileCommit reposDeleteFile(owner, repo, path, reposDeleteFileRequest)

Delete a file

Deletes a file in a repository.  You can provide an additional &#x60;committer&#x60; parameter, which is an object containing information about the committer. Or, you can provide an &#x60;author&#x60; parameter, which is an object containing information about the author.  The &#x60;author&#x60; section is optional and is filled in with the &#x60;committer&#x60; information if omitted. If the &#x60;committer&#x60; information is omitted, the authenticated user&#39;s information is used.  You must provide values for both &#x60;name&#x60; and &#x60;email&#x60;, whether you choose to use &#x60;author&#x60; or &#x60;committer&#x60;. Otherwise, you&#39;ll receive a &#x60;422&#x60; status code.  **Note:** If you use this endpoint and the \&quot;[Create or update file contents](https://docs.github.com/rest/repos/contents/#create-or-update-file-contents)\&quot; endpoint in parallel, the concurrent requests will conflict and you will receive errors. You must use these endpoints serially instead.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val path : kotlin.String = path_example // kotlin.String | path parameter
val reposDeleteFileRequest : ReposDeleteFileRequest = {"message":"my commit message","committer":{"name":"Monalisa Octocat","email":"octocat@github.com"},"sha":"329688480d39049927147c162b9d2deaf885005f"} // ReposDeleteFileRequest | 
try {
    val result : FileCommit = apiInstance.reposDeleteFile(owner, repo, path, reposDeleteFileRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **path** | **kotlin.String**| path parameter |
 **reposDeleteFileRequest** | [**ReposDeleteFileRequest**](ReposDeleteFileRequest.md)|  |

### Return type

[**FileCommit**](FileCommit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposDeleteInvitation"></a>
# **reposDeleteInvitation**
> reposDeleteInvitation(owner, repo, invitationId)

Delete a repository invitation



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val invitationId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the invitation.
try {
    apiInstance.reposDeleteInvitation(owner, repo, invitationId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteInvitation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **invitationId** | **kotlin.Int**| The unique identifier of the invitation. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reposDeleteOrgRuleset"></a>
# **reposDeleteOrgRuleset**
> reposDeleteOrgRuleset(org, rulesetId)

Delete an organization repository ruleset

Delete a ruleset for an organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val rulesetId : kotlin.Int = 56 // kotlin.Int | The ID of the ruleset.
try {
    apiInstance.reposDeleteOrgRuleset(org, rulesetId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteOrgRuleset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteOrgRuleset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **rulesetId** | **kotlin.Int**| The ID of the ruleset. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposDeletePagesSite"></a>
# **reposDeletePagesSite**
> reposDeletePagesSite(owner, repo)

Delete a GitHub Pages site

Deletes a GitHub Pages site. For more information, see \&quot;[About GitHub Pages](/github/working-with-github-pages/about-github-pages).  The authenticated user must be a repository administrator, maintainer, or have the &#39;manage GitHub Pages settings&#39; permission.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    apiInstance.reposDeletePagesSite(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeletePagesSite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeletePagesSite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposDeletePullRequestReviewProtection"></a>
# **reposDeletePullRequestReviewProtection**
> reposDeletePullRequestReviewProtection(owner, repo, branch)

Delete pull request review protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    apiInstance.reposDeletePullRequestReviewProtection(owner, repo, branch)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeletePullRequestReviewProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeletePullRequestReviewProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposDeleteRelease"></a>
# **reposDeleteRelease**
> reposDeleteRelease(owner, repo, releaseId)

Delete a release

Users with push access to the repository can delete a release.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val releaseId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the release.
try {
    apiInstance.reposDeleteRelease(owner, repo, releaseId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteRelease")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteRelease")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **releaseId** | **kotlin.Int**| The unique identifier of the release. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reposDeleteReleaseAsset"></a>
# **reposDeleteReleaseAsset**
> reposDeleteReleaseAsset(owner, repo, assetId)

Delete a release asset



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val assetId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the asset.
try {
    apiInstance.reposDeleteReleaseAsset(owner, repo, assetId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteReleaseAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteReleaseAsset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **assetId** | **kotlin.Int**| The unique identifier of the asset. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reposDeleteRepoRuleset"></a>
# **reposDeleteRepoRuleset**
> reposDeleteRepoRuleset(owner, repo, rulesetId)

Delete a repository ruleset

Delete a ruleset for a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val rulesetId : kotlin.Int = 56 // kotlin.Int | The ID of the ruleset.
try {
    apiInstance.reposDeleteRepoRuleset(owner, repo, rulesetId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteRepoRuleset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteRepoRuleset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **rulesetId** | **kotlin.Int**| The ID of the ruleset. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposDeleteTagProtection"></a>
# **reposDeleteTagProtection**
> reposDeleteTagProtection(owner, repo, tagProtectionId)

Delete a tag protection state for a repository

This deletes a tag protection state for a repository. This endpoint is only available to repository administrators.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val tagProtectionId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the tag protection.
try {
    apiInstance.reposDeleteTagProtection(owner, repo, tagProtectionId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteTagProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteTagProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **tagProtectionId** | **kotlin.Int**| The unique identifier of the tag protection. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposDeleteWebhook"></a>
# **reposDeleteWebhook**
> reposDeleteWebhook(owner, repo, hookId)

Delete a repository webhook



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
try {
    apiInstance.reposDeleteWebhook(owner, repo, hookId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDeleteWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDeleteWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposDisableAutomatedSecurityFixes"></a>
# **reposDisableAutomatedSecurityFixes**
> reposDisableAutomatedSecurityFixes(owner, repo)

Disable automated security fixes

Disables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see \&quot;[Configuring automated security fixes](https://docs.github.com/articles/configuring-automated-security-fixes)\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    apiInstance.reposDisableAutomatedSecurityFixes(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDisableAutomatedSecurityFixes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDisableAutomatedSecurityFixes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reposDisableDeploymentProtectionRule"></a>
# **reposDisableDeploymentProtectionRule**
> reposDisableDeploymentProtectionRule(environmentName, repo, owner, protectionRuleId)

Disable a custom protection rule for an environment

Disables a custom deployment protection rule for an environment.  The authenticated user must have admin or owner permissions to the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val protectionRuleId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the protection rule.
try {
    apiInstance.reposDisableDeploymentProtectionRule(environmentName, repo, owner, protectionRuleId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDisableDeploymentProtectionRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDisableDeploymentProtectionRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **protectionRuleId** | **kotlin.Int**| The unique identifier of the protection rule. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reposDisablePrivateVulnerabilityReporting"></a>
# **reposDisablePrivateVulnerabilityReporting**
> reposDisablePrivateVulnerabilityReporting(owner, repo)

Disable private vulnerability reporting for a repository

Disables private vulnerability reporting for a repository. The authenticated user must have admin access to the repository. For more information, see \&quot;[Privately reporting a security vulnerability](https://docs.github.com/code-security/security-advisories/guidance-on-reporting-and-writing/privately-reporting-a-security-vulnerability)\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    apiInstance.reposDisablePrivateVulnerabilityReporting(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDisablePrivateVulnerabilityReporting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDisablePrivateVulnerabilityReporting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="reposDisableVulnerabilityAlerts"></a>
# **reposDisableVulnerabilityAlerts**
> reposDisableVulnerabilityAlerts(owner, repo)

Disable vulnerability alerts

Disables dependency alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see \&quot;[About security alerts for vulnerable dependencies](https://docs.github.com/articles/about-security-alerts-for-vulnerable-dependencies)\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    apiInstance.reposDisableVulnerabilityAlerts(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDisableVulnerabilityAlerts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDisableVulnerabilityAlerts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reposDownloadTarballArchive"></a>
# **reposDownloadTarballArchive**
> reposDownloadTarballArchive(owner, repo, ref)

Download a repository archive (tar)

Gets a redirect URL to download a tar archive for a repository. If you omit &#x60;:ref&#x60;, the repository’s default branch (usually &#x60;main&#x60;) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use the &#x60;Location&#x60; header to make a second &#x60;GET&#x60; request. **Note**: For private repositories, these links are temporary and expire after five minutes.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ref : kotlin.String = ref_example // kotlin.String | 
try {
    apiInstance.reposDownloadTarballArchive(owner, repo, ref)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDownloadTarballArchive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDownloadTarballArchive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ref** | **kotlin.String**|  | [default to &quot;push&quot;]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reposDownloadZipballArchive"></a>
# **reposDownloadZipballArchive**
> reposDownloadZipballArchive(owner, repo, ref)

Download a repository archive (zip)

Gets a redirect URL to download a zip archive for a repository. If you omit &#x60;:ref&#x60;, the repository’s default branch (usually &#x60;main&#x60;) will be used. Please make sure your HTTP framework is configured to follow redirects or you will need to use the &#x60;Location&#x60; header to make a second &#x60;GET&#x60; request.  **Note**: For private repositories, these links are temporary and expire after five minutes. If the repository is empty, you will receive a 404 when you follow the redirect.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ref : kotlin.String = ref_example // kotlin.String | 
try {
    apiInstance.reposDownloadZipballArchive(owner, repo, ref)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposDownloadZipballArchive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposDownloadZipballArchive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ref** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reposEnableAutomatedSecurityFixes"></a>
# **reposEnableAutomatedSecurityFixes**
> reposEnableAutomatedSecurityFixes(owner, repo)

Enable automated security fixes

Enables automated security fixes for a repository. The authenticated user must have admin access to the repository. For more information, see \&quot;[Configuring automated security fixes](https://docs.github.com/articles/configuring-automated-security-fixes)\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    apiInstance.reposEnableAutomatedSecurityFixes(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposEnableAutomatedSecurityFixes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposEnableAutomatedSecurityFixes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reposEnablePrivateVulnerabilityReporting"></a>
# **reposEnablePrivateVulnerabilityReporting**
> reposEnablePrivateVulnerabilityReporting(owner, repo)

Enable private vulnerability reporting for a repository

Enables private vulnerability reporting for a repository. The authenticated user must have admin access to the repository. For more information, see \&quot;[Privately reporting a security vulnerability](https://docs.github.com/code-security/security-advisories/guidance-on-reporting-and-writing/privately-reporting-a-security-vulnerability).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    apiInstance.reposEnablePrivateVulnerabilityReporting(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposEnablePrivateVulnerabilityReporting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposEnablePrivateVulnerabilityReporting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="reposEnableVulnerabilityAlerts"></a>
# **reposEnableVulnerabilityAlerts**
> reposEnableVulnerabilityAlerts(owner, repo)

Enable vulnerability alerts

Enables dependency alerts and the dependency graph for a repository. The authenticated user must have admin access to the repository. For more information, see \&quot;[About security alerts for vulnerable dependencies](https://docs.github.com/articles/about-security-alerts-for-vulnerable-dependencies)\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    apiInstance.reposEnableVulnerabilityAlerts(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposEnableVulnerabilityAlerts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposEnableVulnerabilityAlerts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reposGenerateReleaseNotes"></a>
# **reposGenerateReleaseNotes**
> ReleaseNotesContent reposGenerateReleaseNotes(owner, repo, reposGenerateReleaseNotesRequest)

Generate release notes content for a release

Generate a name and body describing a [release](https://docs.github.com/rest/releases/releases#get-a-release). The body content will be markdown formatted and contain information like the changes since last release and users who contributed. The generated release notes are not saved anywhere. They are intended to be generated and used when creating a new release.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposGenerateReleaseNotesRequest : ReposGenerateReleaseNotesRequest = {"tag_name":"v1.0.0","target_commitish":"main","previous_tag_name":"v0.9.2","configuration_file_path":".github/custom_release_config.yml"} // ReposGenerateReleaseNotesRequest | 
try {
    val result : ReleaseNotesContent = apiInstance.reposGenerateReleaseNotes(owner, repo, reposGenerateReleaseNotesRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGenerateReleaseNotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGenerateReleaseNotes")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposGenerateReleaseNotesRequest** | [**ReposGenerateReleaseNotesRequest**](ReposGenerateReleaseNotesRequest.md)|  |

### Return type

[**ReleaseNotesContent**](ReleaseNotesContent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposGet"></a>
# **reposGet**
> FullRepository reposGet(owner, repo)

Get a repository

The &#x60;parent&#x60; and &#x60;source&#x60; objects are present when the repository is a fork. &#x60;parent&#x60; is the repository this repository was forked from, &#x60;source&#x60; is the ultimate source for the network.  **Note:** In order to see the &#x60;security_and_analysis&#x60; block for a repository you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : FullRepository = apiInstance.reposGet(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**FullRepository**](FullRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetAccessRestrictions"></a>
# **reposGetAccessRestrictions**
> BranchRestrictionPolicy reposGetAccessRestrictions(owner, repo, branch)

Get access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Lists who has access to this protected branch.  **Note**: Users, apps, and teams &#x60;restrictions&#x60; are only available for organization-owned repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    val result : BranchRestrictionPolicy = apiInstance.reposGetAccessRestrictions(owner, repo, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetAccessRestrictions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetAccessRestrictions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

[**BranchRestrictionPolicy**](BranchRestrictionPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetAdminBranchProtection"></a>
# **reposGetAdminBranchProtection**
> ProtectedBranchAdminEnforced reposGetAdminBranchProtection(owner, repo, branch)

Get admin branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    val result : ProtectedBranchAdminEnforced = apiInstance.reposGetAdminBranchProtection(owner, repo, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetAdminBranchProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetAdminBranchProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

[**ProtectedBranchAdminEnforced**](ProtectedBranchAdminEnforced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetAllDeploymentProtectionRules"></a>
# **reposGetAllDeploymentProtectionRules**
> ReposGetAllDeploymentProtectionRules200Response reposGetAllDeploymentProtectionRules(environmentName, repo, owner)

Get all deployment protection rules for an environment

Gets all custom deployment protection rules that are enabled for an environment. Anyone with read access to the repository can use this endpoint. For more information about environments, see \&quot;[Using environments for deployment](https://docs.github.com/actions/deployment/targeting-different-environments/using-environments-for-deployment).\&quot;  For more information about the app that is providing this custom deployment rule, see the [documentation for the &#x60;GET /apps/{app_slug}&#x60; endpoint](https://docs.github.com/rest/apps/apps#get-an-app).  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
try {
    val result : ReposGetAllDeploymentProtectionRules200Response = apiInstance.reposGetAllDeploymentProtectionRules(environmentName, repo, owner)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetAllDeploymentProtectionRules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetAllDeploymentProtectionRules")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |

### Return type

[**ReposGetAllDeploymentProtectionRules200Response**](ReposGetAllDeploymentProtectionRules200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetAllEnvironments"></a>
# **reposGetAllEnvironments**
> ReposGetAllEnvironments200Response reposGetAllEnvironments(owner, repo, perPage, page)

List environments

Lists the environments for a repository.  Anyone with read access to the repository can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ReposGetAllEnvironments200Response = apiInstance.reposGetAllEnvironments(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetAllEnvironments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetAllEnvironments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**ReposGetAllEnvironments200Response**](ReposGetAllEnvironments200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetAllStatusCheckContexts"></a>
# **reposGetAllStatusCheckContexts**
> kotlin.collections.List&lt;kotlin.String&gt; reposGetAllStatusCheckContexts(owner, repo, branch)

Get all status check contexts

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.reposGetAllStatusCheckContexts(owner, repo, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetAllStatusCheckContexts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetAllStatusCheckContexts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetAllTopics"></a>
# **reposGetAllTopics**
> Topic reposGetAllTopics(owner, repo, page, perPage)

Get all repository topics



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : Topic = apiInstance.reposGetAllTopics(owner, repo, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetAllTopics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetAllTopics")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**Topic**](Topic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetAppsWithAccessToProtectedBranch"></a>
# **reposGetAppsWithAccessToProtectedBranch**
> kotlin.collections.List&lt;Integration&gt; reposGetAppsWithAccessToProtectedBranch(owner, repo, branch)

Get apps with access to the protected branch

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Lists the GitHub Apps that have push access to this branch. Only GitHub Apps that are installed on the repository and that have been granted write access to the repository contents can be added as authorized actors on a protected branch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    val result : kotlin.collections.List<Integration> = apiInstance.reposGetAppsWithAccessToProtectedBranch(owner, repo, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetAppsWithAccessToProtectedBranch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetAppsWithAccessToProtectedBranch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

[**kotlin.collections.List&lt;Integration&gt;**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetAutolink"></a>
# **reposGetAutolink**
> Autolink reposGetAutolink(owner, repo, autolinkId)

Get an autolink reference of a repository

This returns a single autolink reference by ID that was configured for the given repository.  Information about autolinks are only available to repository administrators.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val autolinkId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the autolink.
try {
    val result : Autolink = apiInstance.reposGetAutolink(owner, repo, autolinkId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetAutolink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetAutolink")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **autolinkId** | **kotlin.Int**| The unique identifier of the autolink. |

### Return type

[**Autolink**](Autolink.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetBranch"></a>
# **reposGetBranch**
> BranchWithProtection reposGetBranch(owner, repo, branch)

Get a branch



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    val result : BranchWithProtection = apiInstance.reposGetBranch(owner, repo, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetBranch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetBranch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

[**BranchWithProtection**](BranchWithProtection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetBranchProtection"></a>
# **reposGetBranchProtection**
> BranchProtection reposGetBranchProtection(owner, repo, branch)

Get branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    val result : BranchProtection = apiInstance.reposGetBranchProtection(owner, repo, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetBranchProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetBranchProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

[**BranchProtection**](BranchProtection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetBranchRules"></a>
# **reposGetBranchRules**
> kotlin.collections.List&lt;RepositoryRuleDetailed&gt; reposGetBranchRules(owner, repo, branch, perPage, page)

Get rules for a branch

Returns all active rules that apply to the specified branch. The branch does not need to exist; rules that would apply to a branch with that name will be returned. All active rules that apply will be returned, regardless of the level at which they are configured (e.g. repository or organization). Rules in rulesets with \&quot;evaluate\&quot; or \&quot;disabled\&quot; enforcement statuses are not returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<RepositoryRuleDetailed> = apiInstance.reposGetBranchRules(owner, repo, branch, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetBranchRules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetBranchRules")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;RepositoryRuleDetailed&gt;**](RepositoryRuleDetailed.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetClones"></a>
# **reposGetClones**
> CloneTraffic reposGetClones(owner, repo, per)

Get repository clones

Get the total number of clones and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val per : kotlin.String = per_example // kotlin.String | The time frame to display results for.
try {
    val result : CloneTraffic = apiInstance.reposGetClones(owner, repo, per)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetClones")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetClones")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **per** | **kotlin.String**| The time frame to display results for. | [optional] [default to day] [enum: day, week]

### Return type

[**CloneTraffic**](CloneTraffic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetCodeFrequencyStats"></a>
# **reposGetCodeFrequencyStats**
> kotlin.collections.List&lt;kotlin.collections.List&lt;kotlin.Int&gt;&gt; reposGetCodeFrequencyStats(owner, repo)

Get the weekly commit activity

 Returns a weekly aggregate of the number of additions and deletions pushed to a repository.  **Note:** This endpoint can only be used for repositories with fewer than 10,000 commits. If the repository contains 10,000 or more commits, a 422 status code will be returned. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : kotlin.collections.List<kotlin.collections.List<kotlin.Int>> = apiInstance.reposGetCodeFrequencyStats(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetCodeFrequencyStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetCodeFrequencyStats")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

**kotlin.collections.List&lt;kotlin.collections.List&lt;kotlin.Int&gt;&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetCollaboratorPermissionLevel"></a>
# **reposGetCollaboratorPermissionLevel**
> RepositoryCollaboratorPermission reposGetCollaboratorPermissionLevel(owner, repo, username)

Get repository permissions for a user

Checks the repository permission of a collaborator. The possible repository permissions are &#x60;admin&#x60;, &#x60;write&#x60;, &#x60;read&#x60;, and &#x60;none&#x60;.  *Note*: The &#x60;permission&#x60; attribute provides the legacy base roles of &#x60;admin&#x60;, &#x60;write&#x60;, &#x60;read&#x60;, and &#x60;none&#x60;, where the &#x60;maintain&#x60; role is mapped to &#x60;write&#x60; and the &#x60;triage&#x60; role is mapped to &#x60;read&#x60;. To determine the role assigned to the collaborator, see the &#x60;role_name&#x60; attribute, which will provide the full role name, including custom roles. The &#x60;permissions&#x60; hash can also be used to determine which base level of access the collaborator has to the repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    val result : RepositoryCollaboratorPermission = apiInstance.reposGetCollaboratorPermissionLevel(owner, repo, username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetCollaboratorPermissionLevel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetCollaboratorPermissionLevel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

[**RepositoryCollaboratorPermission**](RepositoryCollaboratorPermission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetCombinedStatusForRef"></a>
# **reposGetCombinedStatusForRef**
> CombinedCommitStatus reposGetCombinedStatusForRef(owner, repo, ref, perPage, page)

Get the combined status for a specific reference

Users with pull access in a repository can access a combined view of commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name.   Additionally, a combined &#x60;state&#x60; is returned. The &#x60;state&#x60; is one of:  *   **failure** if any of the contexts report as &#x60;error&#x60; or &#x60;failure&#x60; *   **pending** if there are no statuses or a context is &#x60;pending&#x60; *   **success** if the latest status for all contexts is &#x60;success&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ref : kotlin.String = ref_example // kotlin.String | The commit reference. Can be a commit SHA, branch name (`heads/BRANCH_NAME`), or tag name (`tags/TAG_NAME`). For more information, see \"[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\" in the Git documentation.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : CombinedCommitStatus = apiInstance.reposGetCombinedStatusForRef(owner, repo, ref, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetCombinedStatusForRef")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetCombinedStatusForRef")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ref** | **kotlin.String**| The commit reference. Can be a commit SHA, branch name (&#x60;heads/BRANCH_NAME&#x60;), or tag name (&#x60;tags/TAG_NAME&#x60;). For more information, see \&quot;[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\&quot; in the Git documentation. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**CombinedCommitStatus**](CombinedCommitStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetCommit"></a>
# **reposGetCommit**
> Commit reposGetCommit(owner, repo, ref, page, perPage)

Get a commit

Returns the contents of a single commit reference. You must have &#x60;read&#x60; access for the repository to use this endpoint.  **Note:** If there are more than 300 files in the commit diff and the default JSON media type is requested, the response will include pagination link headers for the remaining files, up to a limit of 3000 files. Each page contains the static commit information, and the only changes are to the file listing.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot; Pagination query parameters are not supported for these media types.  - **&#x60;application/vnd.github.diff&#x60;**: Returns the diff of the commit. Larger diffs may time out and return a 5xx status code. - **&#x60;application/vnd.github.patch&#x60;**: Returns the patch of the commit. Diffs with binary data will have no &#x60;patch&#x60; property. Larger diffs may time out and return a 5xx status code. - **&#x60;application/vnd.github.sha&#x60;**: Returns the commit&#39;s SHA-1 hash. You can use this endpoint to check if a remote reference&#39;s SHA-1 hash is the same as your local reference&#39;s SHA-1 hash by providing the local SHA-1 reference as the ETag.  **Signature verification object**  The response will include a &#x60;verification&#x60; object that describes the result of verifying the commit&#39;s signature. The following fields are included in the &#x60;verification&#x60; object:  | Name | Type | Description | | ---- | ---- | ----------- | | &#x60;verified&#x60; | &#x60;boolean&#x60; | Indicates whether GitHub considers the signature in this commit to be verified. | | &#x60;reason&#x60; | &#x60;string&#x60; | The reason for verified value. Possible values and their meanings are enumerated in table below. | | &#x60;signature&#x60; | &#x60;string&#x60; | The signature that was extracted from the commit. | | &#x60;payload&#x60; | &#x60;string&#x60; | The value that was signed. |  These are the possible values for &#x60;reason&#x60; in the &#x60;verification&#x60; object:  | Value | Description | | ----- | ----------- | | &#x60;expired_key&#x60; | The key that made the signature is expired. | | &#x60;not_signing_key&#x60; | The \&quot;signing\&quot; flag is not among the usage flags in the GPG key that made the signature. | | &#x60;gpgverify_error&#x60; | There was an error communicating with the signature verification service. | | &#x60;gpgverify_unavailable&#x60; | The signature verification service is currently unavailable. | | &#x60;unsigned&#x60; | The object does not include a signature. | | &#x60;unknown_signature_type&#x60; | A non-PGP signature was found in the commit. | | &#x60;no_user&#x60; | No user was associated with the &#x60;committer&#x60; email address in the commit. | | &#x60;unverified_email&#x60; | The &#x60;committer&#x60; email address in the commit was associated with a user, but the email address is not verified on their account. | | &#x60;bad_email&#x60; | The &#x60;committer&#x60; email address in the commit is not included in the identities of the PGP key that made the signature. | | &#x60;unknown_key&#x60; | The key that made the signature has not been registered with any user&#39;s account. | | &#x60;malformed_signature&#x60; | There was an error parsing the signature. | | &#x60;invalid&#x60; | The signature could not be cryptographically verified using the key whose key-id was found in the signature. | | &#x60;valid&#x60; | None of the above errors applied, so the signature is considered to be verified. |

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ref : kotlin.String = ref_example // kotlin.String | The commit reference. Can be a commit SHA, branch name (`heads/BRANCH_NAME`), or tag name (`tags/TAG_NAME`). For more information, see \"[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\" in the Git documentation.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : Commit = apiInstance.reposGetCommit(owner, repo, ref, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetCommit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetCommit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ref** | **kotlin.String**| The commit reference. Can be a commit SHA, branch name (&#x60;heads/BRANCH_NAME&#x60;), or tag name (&#x60;tags/TAG_NAME&#x60;). For more information, see \&quot;[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\&quot; in the Git documentation. |
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**Commit**](Commit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetCommitActivityStats"></a>
# **reposGetCommitActivityStats**
> kotlin.collections.List&lt;CommitActivity&gt; reposGetCommitActivityStats(owner, repo)

Get the last year of commit activity

Returns the last year of commit activity grouped by week. The &#x60;days&#x60; array is a group of commits per day, starting on &#x60;Sunday&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : kotlin.collections.List<CommitActivity> = apiInstance.reposGetCommitActivityStats(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetCommitActivityStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetCommitActivityStats")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**kotlin.collections.List&lt;CommitActivity&gt;**](CommitActivity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetCommitComment"></a>
# **reposGetCommitComment**
> CommitComment reposGetCommitComment(owner, repo, commentId)

Get a commit comment

Gets a specified commit comment.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
try {
    val result : CommitComment = apiInstance.reposGetCommitComment(owner, repo, commentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetCommitComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetCommitComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |

### Return type

[**CommitComment**](CommitComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetCommitSignatureProtection"></a>
# **reposGetCommitSignatureProtection**
> ProtectedBranchAdminEnforced reposGetCommitSignatureProtection(owner, repo, branch)

Get commit signature protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  When authenticated with admin or owner permissions to the repository, you can use this endpoint to check whether a branch requires signed commits. An enabled status of &#x60;true&#x60; indicates you must sign commits on this branch. For more information, see [Signing commits with GPG](https://docs.github.com/articles/signing-commits-with-gpg) in GitHub Help.  **Note**: You must enable branch protection to require signed commits.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    val result : ProtectedBranchAdminEnforced = apiInstance.reposGetCommitSignatureProtection(owner, repo, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetCommitSignatureProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetCommitSignatureProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

[**ProtectedBranchAdminEnforced**](ProtectedBranchAdminEnforced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetCommunityProfileMetrics"></a>
# **reposGetCommunityProfileMetrics**
> CommunityProfile reposGetCommunityProfileMetrics(owner, repo)

Get community profile metrics

Returns all community profile metrics for a repository. The repository cannot be a fork.  The returned metrics include an overall health score, the repository description, the presence of documentation, the detected code of conduct, the detected license, and the presence of ISSUE\\_TEMPLATE, PULL\\_REQUEST\\_TEMPLATE, README, and CONTRIBUTING files.  The &#x60;health_percentage&#x60; score is defined as a percentage of how many of the recommended community health files are present. For more information, see \&quot;[About community profiles for public repositories](https://docs.github.com/communities/setting-up-your-project-for-healthy-contributions/about-community-profiles-for-public-repositories).\&quot;  &#x60;content_reports_enabled&#x60; is only returned for organization-owned repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : CommunityProfile = apiInstance.reposGetCommunityProfileMetrics(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetCommunityProfileMetrics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetCommunityProfileMetrics")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**CommunityProfile**](CommunityProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetContent"></a>
# **reposGetContent**
> ContentTree reposGetContent(owner, repo, path, ref)

Get repository content

Gets the contents of a file or directory in a repository. Specify the file path or directory with the &#x60;path&#x60; parameter. If you omit the &#x60;path&#x60; parameter, you will receive the contents of the repository&#39;s root directory.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw file contents for files and symlinks. - **&#x60;application/vnd.github.html+json&#x60;**: Returns the file contents in HTML. Markup languages are rendered to HTML using GitHub&#39;s open-source [Markup library](https://github.com/github/markup). - **&#x60;application/vnd.github.object+json&#x60;**: Returns the contents in a consistent object format regardless of the content type. For example, instead of an array of objects for a directory, the response will be an object with an &#x60;entries&#x60; attribute containing the array of objects.  If the content is a directory, the response will be an array of objects, one object for each item in the directory. When listing the contents of a directory, submodules have their \&quot;type\&quot; specified as \&quot;file\&quot;. Logically, the value _should_ be \&quot;submodule\&quot;. This behavior exists [for backwards compatibility purposes](https://git.io/v1YCW). In the next major version of the API, the type will be returned as \&quot;submodule\&quot;.  If the content is a symlink and the symlink&#39;s target is a normal file in the repository, then the API responds with the content of the file. Otherwise, the API responds with an object describing the symlink itself.  If the content is a submodule, the &#x60;submodule_git_url&#x60; field identifies the location of the submodule repository, and the &#x60;sha&#x60; identifies a specific commit within the submodule repository. Git uses the given URL when cloning the submodule repository, and checks out the submodule at that specific commit. If the submodule repository is not hosted on github.com, the Git URLs (&#x60;git_url&#x60; and &#x60;_links[\&quot;git\&quot;]&#x60;) and the github.com URLs (&#x60;html_url&#x60; and &#x60;_links[\&quot;html\&quot;]&#x60;) will have null values.  **Notes**:  - To get a repository&#39;s contents recursively, you can [recursively get the tree](https://docs.github.com/rest/git/trees#get-a-tree). - This API has an upper limit of 1,000 files for a directory. If you need to retrieve more files, use the [Git Trees API](https://docs.github.com/rest/git/trees#get-a-tree). - Download URLs expire and are meant to be used just once. To ensure the download URL does not expire, please use the contents API to obtain a fresh download URL for each download. - If the requested file&#39;s size is:   - 1 MB or smaller: All features of this endpoint are supported.   - Between 1-100 MB: Only the &#x60;raw&#x60; or &#x60;object&#x60; custom media types are supported. Both will work as normal, except that when using the &#x60;object&#x60; media type, the &#x60;content&#x60; field will be an empty string and the &#x60;encoding&#x60; field will be &#x60;\&quot;none\&quot;&#x60;. To get the contents of these larger files, use the &#x60;raw&#x60; media type.   - Greater than 100 MB: This endpoint is not supported.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val path : kotlin.String = path_example // kotlin.String | path parameter
val ref : kotlin.String = ref_example // kotlin.String | The name of the commit/branch/tag. Default: the repository’s default branch.
try {
    val result : ContentTree = apiInstance.reposGetContent(owner, repo, path, ref)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetContent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetContent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **path** | **kotlin.String**| path parameter | [default to &quot;push&quot;]
 **ref** | **kotlin.String**| The name of the commit/branch/tag. Default: the repository’s default branch. | [optional] [default to &quot;push&quot;]

### Return type

[**ContentTree**](ContentTree.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.github.object, application/json

<a id="reposGetContributorsStats"></a>
# **reposGetContributorsStats**
> kotlin.collections.List&lt;ContributorActivity&gt; reposGetContributorsStats(owner, repo)

Get all contributor commit activity

 Returns the &#x60;total&#x60; number of commits authored by the contributor. In addition, the response includes a Weekly Hash (&#x60;weeks&#x60; array) with the following information:  *   &#x60;w&#x60; - Start of the week, given as a [Unix timestamp](https://en.wikipedia.org/wiki/Unix_time). *   &#x60;a&#x60; - Number of additions *   &#x60;d&#x60; - Number of deletions *   &#x60;c&#x60; - Number of commits  **Note:** This endpoint will return &#x60;0&#x60; values for all addition and deletion counts in repositories with 10,000 or more commits.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : kotlin.collections.List<ContributorActivity> = apiInstance.reposGetContributorsStats(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetContributorsStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetContributorsStats")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**kotlin.collections.List&lt;ContributorActivity&gt;**](ContributorActivity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetCustomDeploymentProtectionRule"></a>
# **reposGetCustomDeploymentProtectionRule**
> DeploymentProtectionRule reposGetCustomDeploymentProtectionRule(owner, repo, environmentName, protectionRuleId)

Get a custom deployment protection rule

Gets an enabled custom deployment protection rule for an environment. Anyone with read access to the repository can use this endpoint. For more information about environments, see \&quot;[Using environments for deployment](https://docs.github.com/actions/deployment/targeting-different-environments/using-environments-for-deployment).\&quot;  For more information about the app that is providing this custom deployment rule, see [&#x60;GET /apps/{app_slug}&#x60;](https://docs.github.com/rest/apps/apps#get-an-app).  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val protectionRuleId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the protection rule.
try {
    val result : DeploymentProtectionRule = apiInstance.reposGetCustomDeploymentProtectionRule(owner, repo, environmentName, protectionRuleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetCustomDeploymentProtectionRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetCustomDeploymentProtectionRule")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **protectionRuleId** | **kotlin.Int**| The unique identifier of the protection rule. |

### Return type

[**DeploymentProtectionRule**](DeploymentProtectionRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetCustomPropertiesValues"></a>
# **reposGetCustomPropertiesValues**
> kotlin.collections.List&lt;CustomPropertyValue&gt; reposGetCustomPropertiesValues(owner, repo)

Get all custom property values for a repository

Gets all custom property values that are set for a repository. Users with read access to the repository can use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : kotlin.collections.List<CustomPropertyValue> = apiInstance.reposGetCustomPropertiesValues(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetCustomPropertiesValues")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetCustomPropertiesValues")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**kotlin.collections.List&lt;CustomPropertyValue&gt;**](CustomPropertyValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetDeployKey"></a>
# **reposGetDeployKey**
> DeployKey reposGetDeployKey(owner, repo, keyId)

Get a deploy key



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val keyId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the key.
try {
    val result : DeployKey = apiInstance.reposGetDeployKey(owner, repo, keyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetDeployKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetDeployKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **keyId** | **kotlin.Int**| The unique identifier of the key. |

### Return type

[**DeployKey**](DeployKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetDeployment"></a>
# **reposGetDeployment**
> Deployment reposGetDeployment(owner, repo, deploymentId)

Get a deployment



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val deploymentId : kotlin.Int = 56 // kotlin.Int | deployment_id parameter
try {
    val result : Deployment = apiInstance.reposGetDeployment(owner, repo, deploymentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetDeployment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetDeployment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **deploymentId** | **kotlin.Int**| deployment_id parameter |

### Return type

[**Deployment**](Deployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetDeploymentBranchPolicy"></a>
# **reposGetDeploymentBranchPolicy**
> DeploymentBranchPolicy reposGetDeploymentBranchPolicy(owner, repo, environmentName, branchPolicyId)

Get a deployment branch policy

Gets a deployment branch or tag policy for an environment.  Anyone with read access to the repository can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val branchPolicyId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the branch policy.
try {
    val result : DeploymentBranchPolicy = apiInstance.reposGetDeploymentBranchPolicy(owner, repo, environmentName, branchPolicyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetDeploymentBranchPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetDeploymentBranchPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **branchPolicyId** | **kotlin.Int**| The unique identifier of the branch policy. |

### Return type

[**DeploymentBranchPolicy**](DeploymentBranchPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetDeploymentStatus"></a>
# **reposGetDeploymentStatus**
> DeploymentStatus reposGetDeploymentStatus(owner, repo, deploymentId, statusId)

Get a deployment status

Users with pull access can view a deployment status for a deployment:

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val deploymentId : kotlin.Int = 56 // kotlin.Int | deployment_id parameter
val statusId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DeploymentStatus = apiInstance.reposGetDeploymentStatus(owner, repo, deploymentId, statusId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetDeploymentStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetDeploymentStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **deploymentId** | **kotlin.Int**| deployment_id parameter |
 **statusId** | **kotlin.Int**|  |

### Return type

[**DeploymentStatus**](DeploymentStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetEnvironment"></a>
# **reposGetEnvironment**
> Environment reposGetEnvironment(owner, repo, environmentName)

Get an environment

**Note:** To get information about name patterns that branches must match in order to deploy to this environment, see \&quot;[Get a deployment branch policy](/rest/deployments/branch-policies#get-a-deployment-branch-policy).\&quot;  Anyone with read access to the repository can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
try {
    val result : Environment = apiInstance.reposGetEnvironment(owner, repo, environmentName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetEnvironment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetEnvironment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |

### Return type

[**Environment**](Environment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetLatestPagesBuild"></a>
# **reposGetLatestPagesBuild**
> PageBuild reposGetLatestPagesBuild(owner, repo)

Get latest Pages build

Gets information about the single most recent build of a GitHub Pages site.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : PageBuild = apiInstance.reposGetLatestPagesBuild(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetLatestPagesBuild")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetLatestPagesBuild")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**PageBuild**](PageBuild.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetLatestRelease"></a>
# **reposGetLatestRelease**
> Release reposGetLatestRelease(owner, repo)

Get the latest release

View the latest published full release for the repository.  The latest release is the most recent non-prerelease, non-draft release, sorted by the &#x60;created_at&#x60; attribute. The &#x60;created_at&#x60; attribute is the date of the commit used for the release, and not the date when the release was drafted or published.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : Release = apiInstance.reposGetLatestRelease(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetLatestRelease")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetLatestRelease")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**Release**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetOrgRuleSuite"></a>
# **reposGetOrgRuleSuite**
> RuleSuite reposGetOrgRuleSuite(org, ruleSuiteId)

Get an organization rule suite

Gets information about a suite of rule evaluations from within an organization. For more information, see \&quot;[Managing rulesets for repositories in your organization](https://docs.github.com/organizations/managing-organization-settings/managing-rulesets-for-repositories-in-your-organization#viewing-insights-for-rulesets).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val ruleSuiteId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the rule suite result. To get this ID, you can use [GET /repos/{owner}/{repo}/rulesets/rule-suites](https://docs.github.com/rest/repos/rule-suites#list-repository-rule-suites) for repositories and [GET /orgs/{org}/rulesets/rule-suites](https://docs.github.com/rest/orgs/rule-suites#list-organization-rule-suites) for organizations.
try {
    val result : RuleSuite = apiInstance.reposGetOrgRuleSuite(org, ruleSuiteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetOrgRuleSuite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetOrgRuleSuite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **ruleSuiteId** | **kotlin.Int**| The unique identifier of the rule suite result. To get this ID, you can use [GET /repos/{owner}/{repo}/rulesets/rule-suites](https://docs.github.com/rest/repos/rule-suites#list-repository-rule-suites) for repositories and [GET /orgs/{org}/rulesets/rule-suites](https://docs.github.com/rest/orgs/rule-suites#list-organization-rule-suites) for organizations. |

### Return type

[**RuleSuite**](RuleSuite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetOrgRuleSuites"></a>
# **reposGetOrgRuleSuites**
> kotlin.collections.List&lt;RuleSuitesInner&gt; reposGetOrgRuleSuites(org, repositoryName, timePeriod, actorName, ruleSuiteResult, perPage, page)

List organization rule suites

Lists suites of rule evaluations at the organization level. For more information, see \&quot;[Managing rulesets for repositories in your organization](https://docs.github.com/organizations/managing-organization-settings/managing-rulesets-for-repositories-in-your-organization#viewing-insights-for-rulesets).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val repositoryName : kotlin.Int = 56 // kotlin.Int | The name of the repository to filter on. When specified, only rule evaluations from this repository will be returned.
val timePeriod : kotlin.String = timePeriod_example // kotlin.String | The time period to filter by.  For example, `day` will filter for rule suites that occurred in the past 24 hours, and `week` will filter for insights that occurred in the past 7 days (168 hours).
val actorName : kotlin.String = actorName_example // kotlin.String | The handle for the GitHub user account to filter on. When specified, only rule evaluations triggered by this actor will be returned.
val ruleSuiteResult : kotlin.String = ruleSuiteResult_example // kotlin.String | The rule results to filter on. When specified, only suites with this result will be returned.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<RuleSuitesInner> = apiInstance.reposGetOrgRuleSuites(org, repositoryName, timePeriod, actorName, ruleSuiteResult, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetOrgRuleSuites")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetOrgRuleSuites")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **repositoryName** | **kotlin.Int**| The name of the repository to filter on. When specified, only rule evaluations from this repository will be returned. | [optional]
 **timePeriod** | **kotlin.String**| The time period to filter by.  For example, &#x60;day&#x60; will filter for rule suites that occurred in the past 24 hours, and &#x60;week&#x60; will filter for insights that occurred in the past 7 days (168 hours). | [optional] [default to day] [enum: hour, day, week, month]
 **actorName** | **kotlin.String**| The handle for the GitHub user account to filter on. When specified, only rule evaluations triggered by this actor will be returned. | [optional]
 **ruleSuiteResult** | **kotlin.String**| The rule results to filter on. When specified, only suites with this result will be returned. | [optional] [default to all] [enum: pass, fail, bypass, all]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;RuleSuitesInner&gt;**](RuleSuitesInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetOrgRuleset"></a>
# **reposGetOrgRuleset**
> RepositoryRuleset reposGetOrgRuleset(org, rulesetId)

Get an organization repository ruleset

Get a repository ruleset for an organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val rulesetId : kotlin.Int = 56 // kotlin.Int | The ID of the ruleset.
try {
    val result : RepositoryRuleset = apiInstance.reposGetOrgRuleset(org, rulesetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetOrgRuleset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetOrgRuleset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **rulesetId** | **kotlin.Int**| The ID of the ruleset. |

### Return type

[**RepositoryRuleset**](RepositoryRuleset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetOrgRulesets"></a>
# **reposGetOrgRulesets**
> kotlin.collections.List&lt;RepositoryRuleset&gt; reposGetOrgRulesets(org, perPage, page)

Get all organization repository rulesets

Get all the repository rulesets for an organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<RepositoryRuleset> = apiInstance.reposGetOrgRulesets(org, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetOrgRulesets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetOrgRulesets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;RepositoryRuleset&gt;**](RepositoryRuleset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetPages"></a>
# **reposGetPages**
> Page reposGetPages(owner, repo)

Get a GitHub Pages site

Gets information about a GitHub Pages site.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : Page = apiInstance.reposGetPages(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetPages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetPages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**Page**](Page.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetPagesBuild"></a>
# **reposGetPagesBuild**
> PageBuild reposGetPagesBuild(owner, repo, buildId)

Get GitHub Pages build

Gets information about a GitHub Pages build.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val buildId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PageBuild = apiInstance.reposGetPagesBuild(owner, repo, buildId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetPagesBuild")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetPagesBuild")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **buildId** | **kotlin.Int**|  |

### Return type

[**PageBuild**](PageBuild.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetPagesDeployment"></a>
# **reposGetPagesDeployment**
> PagesDeploymentStatus reposGetPagesDeployment(owner, repo, pagesDeploymentId)

Get the status of a GitHub Pages deployment

Gets the current status of a GitHub Pages deployment.  The authenticated user must have read permission for the GitHub Pages site.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val pagesDeploymentId : String =  // String | The ID of the Pages deployment. You can also give the commit SHA of the deployment.
try {
    val result : PagesDeploymentStatus = apiInstance.reposGetPagesDeployment(owner, repo, pagesDeploymentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetPagesDeployment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetPagesDeployment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **pagesDeploymentId** | [**String**](.md)| The ID of the Pages deployment. You can also give the commit SHA of the deployment. |

### Return type

[**PagesDeploymentStatus**](PagesDeploymentStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetPagesHealthCheck"></a>
# **reposGetPagesHealthCheck**
> PagesHealthCheck reposGetPagesHealthCheck(owner, repo)

Get a DNS health check for GitHub Pages

Gets a health check of the DNS settings for the &#x60;CNAME&#x60; record configured for a repository&#39;s GitHub Pages.  The first request to this endpoint returns a &#x60;202 Accepted&#x60; status and starts an asynchronous background task to get the results for the domain. After the background task completes, subsequent requests to this endpoint return a &#x60;200 OK&#x60; status with the health check results in the response.  The authenticated user must be a repository administrator, maintainer, or have the &#39;manage GitHub Pages settings&#39; permission to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : PagesHealthCheck = apiInstance.reposGetPagesHealthCheck(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetPagesHealthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetPagesHealthCheck")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**PagesHealthCheck**](PagesHealthCheck.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetParticipationStats"></a>
# **reposGetParticipationStats**
> ParticipationStats reposGetParticipationStats(owner, repo)

Get the weekly commit count

Returns the total commit counts for the &#x60;owner&#x60; and total commit counts in &#x60;all&#x60;. &#x60;all&#x60; is everyone combined, including the &#x60;owner&#x60; in the last 52 weeks. If you&#39;d like to get the commit counts for non-owners, you can subtract &#x60;owner&#x60; from &#x60;all&#x60;.  The array order is oldest week (index 0) to most recent week.  The most recent week is seven days ago at UTC midnight to today at UTC midnight.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : ParticipationStats = apiInstance.reposGetParticipationStats(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetParticipationStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetParticipationStats")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**ParticipationStats**](ParticipationStats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetPullRequestReviewProtection"></a>
# **reposGetPullRequestReviewProtection**
> ProtectedBranchPullRequestReview reposGetPullRequestReviewProtection(owner, repo, branch)

Get pull request review protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    val result : ProtectedBranchPullRequestReview = apiInstance.reposGetPullRequestReviewProtection(owner, repo, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetPullRequestReviewProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetPullRequestReviewProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

[**ProtectedBranchPullRequestReview**](ProtectedBranchPullRequestReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetPunchCardStats"></a>
# **reposGetPunchCardStats**
> kotlin.collections.List&lt;kotlin.collections.List&lt;kotlin.Int&gt;&gt; reposGetPunchCardStats(owner, repo)

Get the hourly commit count for each day

Each array contains the day number, hour number, and number of commits:  *   &#x60;0-6&#x60;: Sunday - Saturday *   &#x60;0-23&#x60;: Hour of day *   Number of commits  For example, &#x60;[2, 14, 25]&#x60; indicates that there were 25 total commits, during the 2:00pm hour on Tuesdays. All times are based on the time zone of individual commits.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : kotlin.collections.List<kotlin.collections.List<kotlin.Int>> = apiInstance.reposGetPunchCardStats(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetPunchCardStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetPunchCardStats")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

**kotlin.collections.List&lt;kotlin.collections.List&lt;kotlin.Int&gt;&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetReadme"></a>
# **reposGetReadme**
> ContentFile reposGetReadme(owner, repo, ref)

Get a repository README

Gets the preferred README for a repository.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw file contents. This is the default if you do not specify a media type. - **&#x60;application/vnd.github.html+json&#x60;**: Returns the README in HTML. Markup languages are rendered to HTML using GitHub&#39;s open-source [Markup library](https://github.com/github/markup).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ref : kotlin.String = ref_example // kotlin.String | The name of the commit/branch/tag. Default: the repository’s default branch.
try {
    val result : ContentFile = apiInstance.reposGetReadme(owner, repo, ref)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetReadme")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetReadme")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ref** | **kotlin.String**| The name of the commit/branch/tag. Default: the repository’s default branch. | [optional]

### Return type

[**ContentFile**](ContentFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetReadmeInDirectory"></a>
# **reposGetReadmeInDirectory**
> ContentFile reposGetReadmeInDirectory(owner, repo, dir, ref)

Get a repository README for a directory

Gets the README from a repository directory.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github.raw+json&#x60;**: Returns the raw file contents. This is the default if you do not specify a media type. - **&#x60;application/vnd.github.html+json&#x60;**: Returns the README in HTML. Markup languages are rendered to HTML using GitHub&#39;s open-source [Markup library](https://github.com/github/markup).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val dir : kotlin.String = dir_example // kotlin.String | The alternate path to look for a README file
val ref : kotlin.String = ref_example // kotlin.String | The name of the commit/branch/tag. Default: the repository’s default branch.
try {
    val result : ContentFile = apiInstance.reposGetReadmeInDirectory(owner, repo, dir, ref)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetReadmeInDirectory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetReadmeInDirectory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **dir** | **kotlin.String**| The alternate path to look for a README file | [default to &quot;push&quot;]
 **ref** | **kotlin.String**| The name of the commit/branch/tag. Default: the repository’s default branch. | [optional]

### Return type

[**ContentFile**](ContentFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetRelease"></a>
# **reposGetRelease**
> Release reposGetRelease(owner, repo, releaseId)

Get a release

Gets a public release with the specified release ID.  **Note:** This returns an &#x60;upload_url&#x60; key corresponding to the endpoint for uploading release assets. This key is a hypermedia resource. For more information, see \&quot;[Getting started with the REST API](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#hypermedia).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val releaseId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the release.
try {
    val result : Release = apiInstance.reposGetRelease(owner, repo, releaseId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetRelease")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetRelease")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **releaseId** | **kotlin.Int**| The unique identifier of the release. |

### Return type

[**Release**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetReleaseAsset"></a>
# **reposGetReleaseAsset**
> ReleaseAsset reposGetReleaseAsset(owner, repo, assetId)

Get a release asset

To download the asset&#39;s binary content, set the &#x60;Accept&#x60; header of the request to [&#x60;application/octet-stream&#x60;](https://docs.github.com/rest/overview/media-types). The API will either redirect the client to the location, or stream it directly if possible. API clients should handle both a &#x60;200&#x60; or &#x60;302&#x60; response.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val assetId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the asset.
try {
    val result : ReleaseAsset = apiInstance.reposGetReleaseAsset(owner, repo, assetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetReleaseAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetReleaseAsset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **assetId** | **kotlin.Int**| The unique identifier of the asset. |

### Return type

[**ReleaseAsset**](ReleaseAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetReleaseByTag"></a>
# **reposGetReleaseByTag**
> Release reposGetReleaseByTag(owner, repo, tag)

Get a release by tag name

Get a published release with the specified tag.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val tag : kotlin.String = tag_example // kotlin.String | tag parameter
try {
    val result : Release = apiInstance.reposGetReleaseByTag(owner, repo, tag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetReleaseByTag")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetReleaseByTag")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **tag** | **kotlin.String**| tag parameter | [default to &quot;push&quot;]

### Return type

[**Release**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetRepoRuleSuite"></a>
# **reposGetRepoRuleSuite**
> RuleSuite reposGetRepoRuleSuite(owner, repo, ruleSuiteId)

Get a repository rule suite

Gets information about a suite of rule evaluations from within a repository. For more information, see \&quot;[Managing rulesets for a repository](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/managing-rulesets/managing-rulesets-for-a-repository#viewing-insights-for-rulesets).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ruleSuiteId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the rule suite result. To get this ID, you can use [GET /repos/{owner}/{repo}/rulesets/rule-suites](https://docs.github.com/rest/repos/rule-suites#list-repository-rule-suites) for repositories and [GET /orgs/{org}/rulesets/rule-suites](https://docs.github.com/rest/orgs/rule-suites#list-organization-rule-suites) for organizations.
try {
    val result : RuleSuite = apiInstance.reposGetRepoRuleSuite(owner, repo, ruleSuiteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetRepoRuleSuite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetRepoRuleSuite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ruleSuiteId** | **kotlin.Int**| The unique identifier of the rule suite result. To get this ID, you can use [GET /repos/{owner}/{repo}/rulesets/rule-suites](https://docs.github.com/rest/repos/rule-suites#list-repository-rule-suites) for repositories and [GET /orgs/{org}/rulesets/rule-suites](https://docs.github.com/rest/orgs/rule-suites#list-organization-rule-suites) for organizations. |

### Return type

[**RuleSuite**](RuleSuite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetRepoRuleSuites"></a>
# **reposGetRepoRuleSuites**
> kotlin.collections.List&lt;RuleSuitesInner&gt; reposGetRepoRuleSuites(owner, repo, ref, timePeriod, actorName, ruleSuiteResult, perPage, page)

List repository rule suites

Lists suites of rule evaluations at the repository level. For more information, see \&quot;[Managing rulesets for a repository](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/managing-rulesets/managing-rulesets-for-a-repository#viewing-insights-for-rulesets).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ref : kotlin.String = ref_example // kotlin.String | The name of the ref. Cannot contain wildcard characters. When specified, only rule evaluations triggered for this ref will be returned.
val timePeriod : kotlin.String = timePeriod_example // kotlin.String | The time period to filter by.  For example, `day` will filter for rule suites that occurred in the past 24 hours, and `week` will filter for insights that occurred in the past 7 days (168 hours).
val actorName : kotlin.String = actorName_example // kotlin.String | The handle for the GitHub user account to filter on. When specified, only rule evaluations triggered by this actor will be returned.
val ruleSuiteResult : kotlin.String = ruleSuiteResult_example // kotlin.String | The rule results to filter on. When specified, only suites with this result will be returned.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<RuleSuitesInner> = apiInstance.reposGetRepoRuleSuites(owner, repo, ref, timePeriod, actorName, ruleSuiteResult, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetRepoRuleSuites")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetRepoRuleSuites")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ref** | **kotlin.String**| The name of the ref. Cannot contain wildcard characters. When specified, only rule evaluations triggered for this ref will be returned. | [optional]
 **timePeriod** | **kotlin.String**| The time period to filter by.  For example, &#x60;day&#x60; will filter for rule suites that occurred in the past 24 hours, and &#x60;week&#x60; will filter for insights that occurred in the past 7 days (168 hours). | [optional] [default to day] [enum: hour, day, week, month]
 **actorName** | **kotlin.String**| The handle for the GitHub user account to filter on. When specified, only rule evaluations triggered by this actor will be returned. | [optional]
 **ruleSuiteResult** | **kotlin.String**| The rule results to filter on. When specified, only suites with this result will be returned. | [optional] [default to all] [enum: pass, fail, bypass, all]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;RuleSuitesInner&gt;**](RuleSuitesInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetRepoRuleset"></a>
# **reposGetRepoRuleset**
> RepositoryRuleset reposGetRepoRuleset(owner, repo, rulesetId, includesParents)

Get a repository ruleset

Get a ruleset for a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val rulesetId : kotlin.Int = 56 // kotlin.Int | The ID of the ruleset.
val includesParents : kotlin.Boolean = true // kotlin.Boolean | Include rulesets configured at higher levels that apply to this repository
try {
    val result : RepositoryRuleset = apiInstance.reposGetRepoRuleset(owner, repo, rulesetId, includesParents)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetRepoRuleset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetRepoRuleset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **rulesetId** | **kotlin.Int**| The ID of the ruleset. |
 **includesParents** | **kotlin.Boolean**| Include rulesets configured at higher levels that apply to this repository | [optional] [default to true]

### Return type

[**RepositoryRuleset**](RepositoryRuleset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetRepoRulesets"></a>
# **reposGetRepoRulesets**
> kotlin.collections.List&lt;RepositoryRuleset&gt; reposGetRepoRulesets(owner, repo, perPage, page, includesParents)

Get all repository rulesets

Get all the rulesets for a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val includesParents : kotlin.Boolean = true // kotlin.Boolean | Include rulesets configured at higher levels that apply to this repository
try {
    val result : kotlin.collections.List<RepositoryRuleset> = apiInstance.reposGetRepoRulesets(owner, repo, perPage, page, includesParents)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetRepoRulesets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetRepoRulesets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **includesParents** | **kotlin.Boolean**| Include rulesets configured at higher levels that apply to this repository | [optional] [default to true]

### Return type

[**kotlin.collections.List&lt;RepositoryRuleset&gt;**](RepositoryRuleset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetStatusChecksProtection"></a>
# **reposGetStatusChecksProtection**
> StatusCheckPolicy reposGetStatusChecksProtection(owner, repo, branch)

Get status checks protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    val result : StatusCheckPolicy = apiInstance.reposGetStatusChecksProtection(owner, repo, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetStatusChecksProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetStatusChecksProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

[**StatusCheckPolicy**](StatusCheckPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetTeamsWithAccessToProtectedBranch"></a>
# **reposGetTeamsWithAccessToProtectedBranch**
> kotlin.collections.List&lt;Team&gt; reposGetTeamsWithAccessToProtectedBranch(owner, repo, branch)

Get teams with access to the protected branch

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Lists the teams who have push access to this branch. The list includes child teams.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    val result : kotlin.collections.List<Team> = apiInstance.reposGetTeamsWithAccessToProtectedBranch(owner, repo, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetTeamsWithAccessToProtectedBranch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetTeamsWithAccessToProtectedBranch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

[**kotlin.collections.List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetTopPaths"></a>
# **reposGetTopPaths**
> kotlin.collections.List&lt;ContentTraffic&gt; reposGetTopPaths(owner, repo)

Get top referral paths

Get the top 10 popular contents over the last 14 days.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : kotlin.collections.List<ContentTraffic> = apiInstance.reposGetTopPaths(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetTopPaths")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetTopPaths")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**kotlin.collections.List&lt;ContentTraffic&gt;**](ContentTraffic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetTopReferrers"></a>
# **reposGetTopReferrers**
> kotlin.collections.List&lt;ReferrerTraffic&gt; reposGetTopReferrers(owner, repo)

Get top referral sources

Get the top 10 referrers over the last 14 days.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : kotlin.collections.List<ReferrerTraffic> = apiInstance.reposGetTopReferrers(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetTopReferrers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetTopReferrers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**kotlin.collections.List&lt;ReferrerTraffic&gt;**](ReferrerTraffic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetUsersWithAccessToProtectedBranch"></a>
# **reposGetUsersWithAccessToProtectedBranch**
> kotlin.collections.List&lt;SimpleUser&gt; reposGetUsersWithAccessToProtectedBranch(owner, repo, branch)

Get users with access to the protected branch

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Lists the people who have push access to this branch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.reposGetUsersWithAccessToProtectedBranch(owner, repo, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetUsersWithAccessToProtectedBranch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetUsersWithAccessToProtectedBranch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetViews"></a>
# **reposGetViews**
> ViewTraffic reposGetViews(owner, repo, per)

Get page views

Get the total number of views and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val per : kotlin.String = per_example // kotlin.String | The time frame to display results for.
try {
    val result : ViewTraffic = apiInstance.reposGetViews(owner, repo, per)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetViews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetViews")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **per** | **kotlin.String**| The time frame to display results for. | [optional] [default to day] [enum: day, week]

### Return type

[**ViewTraffic**](ViewTraffic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetWebhook"></a>
# **reposGetWebhook**
> Hook reposGetWebhook(owner, repo, hookId)

Get a repository webhook

Returns a webhook configured in a repository. To get only the webhook &#x60;config&#x60; properties, see \&quot;[Get a webhook configuration for a repository](/rest/webhooks/repo-config#get-a-webhook-configuration-for-a-repository).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
try {
    val result : Hook = apiInstance.reposGetWebhook(owner, repo, hookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |

### Return type

[**Hook**](Hook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetWebhookConfigForRepo"></a>
# **reposGetWebhookConfigForRepo**
> WebhookConfig reposGetWebhookConfigForRepo(owner, repo, hookId)

Get a webhook configuration for a repository

Returns the webhook configuration for a repository. To get more information about the webhook, including the &#x60;active&#x60; state and &#x60;events&#x60;, use \&quot;[Get a repository webhook](/rest/webhooks/repos#get-a-repository-webhook).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;read:repo_hook&#x60; or &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
try {
    val result : WebhookConfig = apiInstance.reposGetWebhookConfigForRepo(owner, repo, hookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetWebhookConfigForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetWebhookConfigForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |

### Return type

[**WebhookConfig**](WebhookConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposGetWebhookDelivery"></a>
# **reposGetWebhookDelivery**
> HookDelivery reposGetWebhookDelivery(owner, repo, hookId, deliveryId)

Get a delivery for a repository webhook

Returns a delivery for a webhook configured in a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
val deliveryId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : HookDelivery = apiInstance.reposGetWebhookDelivery(owner, repo, hookId, deliveryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposGetWebhookDelivery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposGetWebhookDelivery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |
 **deliveryId** | **kotlin.Int**|  |

### Return type

[**HookDelivery**](HookDelivery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="reposListActivities"></a>
# **reposListActivities**
> kotlin.collections.List&lt;Activity&gt; reposListActivities(owner, repo, direction, perPage, before, after, ref, actor, timePeriod, activityType)

List repository activities

Lists a detailed history of changes to a repository, such as pushes, merges, force pushes, and branch changes, and associates these changes with commits and users.  For more information about viewing repository activity, see \&quot;[Viewing activity and data for your repository](https://docs.github.com/repositories/viewing-activity-and-data-for-your-repository).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val before : kotlin.String = before_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val after : kotlin.String = after_example // kotlin.String | A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val ref : kotlin.String = ref_example // kotlin.String | The Git reference for the activities you want to list.  The `ref` for a branch can be formatted either as `refs/heads/BRANCH_NAME` or `BRANCH_NAME`, where `BRANCH_NAME` is the name of your branch.
val actor : kotlin.String = actor_example // kotlin.String | The GitHub username to use to filter by the actor who performed the activity.
val timePeriod : kotlin.String = timePeriod_example // kotlin.String | The time period to filter by.  For example, `day` will filter for activity that occurred in the past 24 hours, and `week` will filter for activity that occurred in the past 7 days (168 hours).
val activityType : kotlin.String = activityType_example // kotlin.String | The activity type to filter by.  For example, you can choose to filter by \"force_push\", to see all force pushes to the repository.
try {
    val result : kotlin.collections.List<Activity> = apiInstance.reposListActivities(owner, repo, direction, perPage, before, after, ref, actor, timePeriod, activityType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListActivities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListActivities")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **before** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results before this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **after** | **kotlin.String**| A cursor, as given in the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the query only searches for results after this cursor. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional]
 **ref** | **kotlin.String**| The Git reference for the activities you want to list.  The &#x60;ref&#x60; for a branch can be formatted either as &#x60;refs/heads/BRANCH_NAME&#x60; or &#x60;BRANCH_NAME&#x60;, where &#x60;BRANCH_NAME&#x60; is the name of your branch. | [optional] [default to &quot;push&quot;]
 **actor** | **kotlin.String**| The GitHub username to use to filter by the actor who performed the activity. | [optional] [default to &quot;push&quot;]
 **timePeriod** | **kotlin.String**| The time period to filter by.  For example, &#x60;day&#x60; will filter for activity that occurred in the past 24 hours, and &#x60;week&#x60; will filter for activity that occurred in the past 7 days (168 hours). | [optional] [enum: day, week, month, quarter, year]
 **activityType** | **kotlin.String**| The activity type to filter by.  For example, you can choose to filter by \&quot;force_push\&quot;, to see all force pushes to the repository. | [optional] [enum: push, force_push, branch_creation, branch_deletion, pr_merge, merge_queue_merge]

### Return type

[**kotlin.collections.List&lt;Activity&gt;**](Activity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListAutolinks"></a>
# **reposListAutolinks**
> kotlin.collections.List&lt;Autolink&gt; reposListAutolinks(owner, repo)

Get all autolinks of a repository

Gets all autolinks that are configured for a repository.  Information about autolinks are only available to repository administrators.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : kotlin.collections.List<Autolink> = apiInstance.reposListAutolinks(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListAutolinks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListAutolinks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**kotlin.collections.List&lt;Autolink&gt;**](Autolink.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListBranches"></a>
# **reposListBranches**
> kotlin.collections.List&lt;ShortBranch&gt; reposListBranches(owner, repo, `protected`, perPage, page)

List branches



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val `protected` : kotlin.Boolean = true // kotlin.Boolean | Setting to `true` returns only protected branches. When set to `false`, only unprotected branches are returned. Omitting this parameter returns all branches.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<ShortBranch> = apiInstance.reposListBranches(owner, repo, `protected`, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListBranches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListBranches")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **&#x60;protected&#x60;** | **kotlin.Boolean**| Setting to &#x60;true&#x60; returns only protected branches. When set to &#x60;false&#x60;, only unprotected branches are returned. Omitting this parameter returns all branches. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;ShortBranch&gt;**](ShortBranch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListBranchesForHeadCommit"></a>
# **reposListBranchesForHeadCommit**
> kotlin.collections.List&lt;BranchShort&gt; reposListBranchesForHeadCommit(owner, repo, commitSha)

List branches for HEAD commit

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Returns all branches where the given commit SHA is the HEAD, or latest commit for the branch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commitSha : kotlin.String = commitSha_example // kotlin.String | The SHA of the commit.
try {
    val result : kotlin.collections.List<BranchShort> = apiInstance.reposListBranchesForHeadCommit(owner, repo, commitSha)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListBranchesForHeadCommit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListBranchesForHeadCommit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commitSha** | **kotlin.String**| The SHA of the commit. |

### Return type

[**kotlin.collections.List&lt;BranchShort&gt;**](BranchShort.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListCollaborators"></a>
# **reposListCollaborators**
> kotlin.collections.List&lt;Collaborator&gt; reposListCollaborators(owner, repo, affiliation, permission, perPage, page)

List repository collaborators

For organization-owned repositories, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. Organization members with write, maintain, or admin privileges on the organization-owned repository can use this endpoint.  Team members will include the members of child teams.  The authenticated user must have push access to the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;read:org&#x60; and &#x60;repo&#x60; scopes to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val affiliation : kotlin.String = affiliation_example // kotlin.String | Filter collaborators returned by their affiliation. `outside` means all outside collaborators of an organization-owned repository. `direct` means all collaborators with permissions to an organization-owned repository, regardless of organization membership status. `all` means all collaborators the authenticated user can see.
val permission : kotlin.String = permission_example // kotlin.String | Filter collaborators by the permissions they have on the repository. If not specified, all collaborators will be returned.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Collaborator> = apiInstance.reposListCollaborators(owner, repo, affiliation, permission, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListCollaborators")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListCollaborators")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **affiliation** | **kotlin.String**| Filter collaborators returned by their affiliation. &#x60;outside&#x60; means all outside collaborators of an organization-owned repository. &#x60;direct&#x60; means all collaborators with permissions to an organization-owned repository, regardless of organization membership status. &#x60;all&#x60; means all collaborators the authenticated user can see. | [optional] [default to all] [enum: outside, direct, all]
 **permission** | **kotlin.String**| Filter collaborators by the permissions they have on the repository. If not specified, all collaborators will be returned. | [optional] [enum: pull, triage, push, maintain, admin]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Collaborator&gt;**](Collaborator.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListCommentsForCommit"></a>
# **reposListCommentsForCommit**
> kotlin.collections.List&lt;CommitComment&gt; reposListCommentsForCommit(owner, repo, commitSha, perPage, page)

List commit comments

Lists the comments for a specified commit.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commitSha : kotlin.String = commitSha_example // kotlin.String | The SHA of the commit.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<CommitComment> = apiInstance.reposListCommentsForCommit(owner, repo, commitSha, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListCommentsForCommit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListCommentsForCommit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commitSha** | **kotlin.String**| The SHA of the commit. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;CommitComment&gt;**](CommitComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListCommitCommentsForRepo"></a>
# **reposListCommitCommentsForRepo**
> kotlin.collections.List&lt;CommitComment&gt; reposListCommitCommentsForRepo(owner, repo, perPage, page)

List commit comments for a repository

Lists the commit comments for a specified repository. Comments are ordered by ascending ID.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<CommitComment> = apiInstance.reposListCommitCommentsForRepo(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListCommitCommentsForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListCommitCommentsForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;CommitComment&gt;**](CommitComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListCommitStatusesForRef"></a>
# **reposListCommitStatusesForRef**
> kotlin.collections.List&lt;Status&gt; reposListCommitStatusesForRef(owner, repo, ref, perPage, page)

List commit statuses for a reference

Users with pull access in a repository can view commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name. Statuses are returned in reverse chronological order. The first status in the list will be the latest one.  This resource is also available via a legacy route: &#x60;GET /repos/:owner/:repo/statuses/:ref&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val ref : kotlin.String = ref_example // kotlin.String | The commit reference. Can be a commit SHA, branch name (`heads/BRANCH_NAME`), or tag name (`tags/TAG_NAME`). For more information, see \"[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\" in the Git documentation.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Status> = apiInstance.reposListCommitStatusesForRef(owner, repo, ref, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListCommitStatusesForRef")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListCommitStatusesForRef")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **ref** | **kotlin.String**| The commit reference. Can be a commit SHA, branch name (&#x60;heads/BRANCH_NAME&#x60;), or tag name (&#x60;tags/TAG_NAME&#x60;). For more information, see \&quot;[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)\&quot; in the Git documentation. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Status&gt;**](Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListCommits"></a>
# **reposListCommits**
> kotlin.collections.List&lt;Commit&gt; reposListCommits(owner, repo, sha, path, author, committer, since, until, perPage, page)

List commits

**Signature verification object**  The response will include a &#x60;verification&#x60; object that describes the result of verifying the commit&#39;s signature. The following fields are included in the &#x60;verification&#x60; object:  | Name | Type | Description | | ---- | ---- | ----------- | | &#x60;verified&#x60; | &#x60;boolean&#x60; | Indicates whether GitHub considers the signature in this commit to be verified. | | &#x60;reason&#x60; | &#x60;string&#x60; | The reason for verified value. Possible values and their meanings are enumerated in table below. | | &#x60;signature&#x60; | &#x60;string&#x60; | The signature that was extracted from the commit. | | &#x60;payload&#x60; | &#x60;string&#x60; | The value that was signed. |  These are the possible values for &#x60;reason&#x60; in the &#x60;verification&#x60; object:  | Value | Description | | ----- | ----------- | | &#x60;expired_key&#x60; | The key that made the signature is expired. | | &#x60;not_signing_key&#x60; | The \&quot;signing\&quot; flag is not among the usage flags in the GPG key that made the signature. | | &#x60;gpgverify_error&#x60; | There was an error communicating with the signature verification service. | | &#x60;gpgverify_unavailable&#x60; | The signature verification service is currently unavailable. | | &#x60;unsigned&#x60; | The object does not include a signature. | | &#x60;unknown_signature_type&#x60; | A non-PGP signature was found in the commit. | | &#x60;no_user&#x60; | No user was associated with the &#x60;committer&#x60; email address in the commit. | | &#x60;unverified_email&#x60; | The &#x60;committer&#x60; email address in the commit was associated with a user, but the email address is not verified on their account. | | &#x60;bad_email&#x60; | The &#x60;committer&#x60; email address in the commit is not included in the identities of the PGP key that made the signature. | | &#x60;unknown_key&#x60; | The key that made the signature has not been registered with any user&#39;s account. | | &#x60;malformed_signature&#x60; | There was an error parsing the signature. | | &#x60;invalid&#x60; | The signature could not be cryptographically verified using the key whose key-id was found in the signature. | | &#x60;valid&#x60; | None of the above errors applied, so the signature is considered to be verified. |

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val sha : kotlin.String = sha_example // kotlin.String | SHA or branch to start listing commits from. Default: the repository’s default branch (usually `main`).
val path : kotlin.String = path_example // kotlin.String | Only commits containing this file path will be returned.
val author : kotlin.String = author_example // kotlin.String | GitHub username or email address to use to filter by commit author.
val committer : kotlin.String = committer_example // kotlin.String | GitHub username or email address to use to filter by commit committer.
val since : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val until : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only commits before this date will be returned. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Commit> = apiInstance.reposListCommits(owner, repo, sha, path, author, committer, since, until, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListCommits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListCommits")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **sha** | **kotlin.String**| SHA or branch to start listing commits from. Default: the repository’s default branch (usually &#x60;main&#x60;). | [optional] [default to &quot;push&quot;]
 **path** | **kotlin.String**| Only commits containing this file path will be returned. | [optional] [default to &quot;push&quot;]
 **author** | **kotlin.String**| GitHub username or email address to use to filter by commit author. | [optional] [default to &quot;push&quot;]
 **committer** | **kotlin.String**| GitHub username or email address to use to filter by commit committer. | [optional] [default to &quot;push&quot;]
 **since** | **kotlinx.datetime.Instant**| Only show results that were last updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **until** | **kotlinx.datetime.Instant**| Only commits before this date will be returned. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Commit&gt;**](Commit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="reposListContributors"></a>
# **reposListContributors**
> kotlin.collections.List&lt;Contributor&gt; reposListContributors(owner, repo, anon, perPage, page)

List repository contributors

Lists contributors to the specified repository and sorts them by the number of commits per contributor in descending order. This endpoint may return information that is a few hours old because the GitHub REST API caches contributor data to improve performance.  GitHub identifies contributors by author email address. This endpoint groups contribution counts by GitHub user, which includes all associated email addresses. To improve performance, only the first 500 author email addresses in the repository link to GitHub users. The rest will appear as anonymous contributors without associated GitHub user information.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val anon : kotlin.String = anon_example // kotlin.String | Set to `1` or `true` to include anonymous contributors in results.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Contributor> = apiInstance.reposListContributors(owner, repo, anon, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListContributors")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListContributors")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **anon** | **kotlin.String**| Set to &#x60;1&#x60; or &#x60;true&#x60; to include anonymous contributors in results. | [optional] [default to &quot;push&quot;]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Contributor&gt;**](Contributor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListCustomDeploymentRuleIntegrations"></a>
# **reposListCustomDeploymentRuleIntegrations**
> ReposListCustomDeploymentRuleIntegrations200Response reposListCustomDeploymentRuleIntegrations(environmentName, repo, owner, page, perPage)

List custom deployment rule integrations available for an environment

Gets all custom deployment protection rule integrations that are available for an environment. Anyone with read access to the repository can use this endpoint.  For more information about environments, see \&quot;[Using environments for deployment](https://docs.github.com/actions/deployment/targeting-different-environments/using-environments-for-deployment).\&quot;  For more information about the app that is providing this custom deployment rule, see \&quot;[GET an app](https://docs.github.com/rest/apps/apps#get-an-app)\&quot;.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ReposListCustomDeploymentRuleIntegrations200Response = apiInstance.reposListCustomDeploymentRuleIntegrations(environmentName, repo, owner, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListCustomDeploymentRuleIntegrations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListCustomDeploymentRuleIntegrations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**ReposListCustomDeploymentRuleIntegrations200Response**](ReposListCustomDeploymentRuleIntegrations200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListDeployKeys"></a>
# **reposListDeployKeys**
> kotlin.collections.List&lt;DeployKey&gt; reposListDeployKeys(owner, repo, perPage, page)

List deploy keys



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<DeployKey> = apiInstance.reposListDeployKeys(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListDeployKeys")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListDeployKeys")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;DeployKey&gt;**](DeployKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListDeploymentBranchPolicies"></a>
# **reposListDeploymentBranchPolicies**
> ReposListDeploymentBranchPolicies200Response reposListDeploymentBranchPolicies(owner, repo, environmentName, perPage, page)

List deployment branch policies

Lists the deployment branch policies for an environment.  Anyone with read access to the repository can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ReposListDeploymentBranchPolicies200Response = apiInstance.reposListDeploymentBranchPolicies(owner, repo, environmentName, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListDeploymentBranchPolicies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListDeploymentBranchPolicies")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**ReposListDeploymentBranchPolicies200Response**](ReposListDeploymentBranchPolicies200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListDeploymentStatuses"></a>
# **reposListDeploymentStatuses**
> kotlin.collections.List&lt;DeploymentStatus&gt; reposListDeploymentStatuses(owner, repo, deploymentId, perPage, page)

List deployment statuses

Users with pull access can view deployment statuses for a deployment:

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val deploymentId : kotlin.Int = 56 // kotlin.Int | deployment_id parameter
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<DeploymentStatus> = apiInstance.reposListDeploymentStatuses(owner, repo, deploymentId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListDeploymentStatuses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListDeploymentStatuses")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **deploymentId** | **kotlin.Int**| deployment_id parameter |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;DeploymentStatus&gt;**](DeploymentStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListDeployments"></a>
# **reposListDeployments**
> kotlin.collections.List&lt;Deployment&gt; reposListDeployments(owner, repo, sha, ref, task, environment, perPage, page)

List deployments

Simple filtering of deployments is available via query parameters:

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val sha : kotlin.String = sha_example // kotlin.String | The SHA recorded at creation time.
val ref : kotlin.String = ref_example // kotlin.String | The name of the ref. This can be a branch, tag, or SHA.
val task : kotlin.String = task_example // kotlin.String | The name of the task for the deployment (e.g., `deploy` or `deploy:migrations`).
val environment : kotlin.String = environment_example // kotlin.String | The name of the environment that was deployed to (e.g., `staging` or `production`).
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Deployment> = apiInstance.reposListDeployments(owner, repo, sha, ref, task, environment, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListDeployments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListDeployments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **sha** | **kotlin.String**| The SHA recorded at creation time. | [optional] [default to &quot;none&quot;]
 **ref** | **kotlin.String**| The name of the ref. This can be a branch, tag, or SHA. | [optional] [default to &quot;none&quot;]
 **task** | **kotlin.String**| The name of the task for the deployment (e.g., &#x60;deploy&#x60; or &#x60;deploy:migrations&#x60;). | [optional] [default to &quot;none&quot;]
 **environment** | **kotlin.String**| The name of the environment that was deployed to (e.g., &#x60;staging&#x60; or &#x60;production&#x60;). | [optional] [default to &quot;none&quot;]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Deployment&gt;**](Deployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListForAuthenticatedUser"></a>
# **reposListForAuthenticatedUser**
> kotlin.collections.List&lt;Repository&gt; reposListForAuthenticatedUser(visibility, affiliation, type, sort, direction, perPage, page, since, before)

List repositories for the authenticated user

Lists repositories that the authenticated user has explicit permission (&#x60;:read&#x60;, &#x60;:write&#x60;, or &#x60;:admin&#x60;) to access.  The authenticated user has explicit permission to access repositories they own, repositories where they are a collaborator, and repositories that they can access through an organization membership.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val visibility : kotlin.String = visibility_example // kotlin.String | Limit results to repositories with the specified visibility.
val affiliation : kotlin.String = affiliation_example // kotlin.String | Comma-separated list of values. Can include:    * `owner`: Repositories that are owned by the authenticated user.    * `collaborator`: Repositories that the user has been added to as a collaborator.    * `organization_member`: Repositories that the user has access to through being a member of an organization. This includes every repository on every team that the user is on.
val type : kotlin.String = type_example // kotlin.String | Limit results to repositories of the specified type. Will cause a `422` error if used in the same request as **visibility** or **affiliation**.
val sort : kotlin.String = sort_example // kotlin.String | The property to sort the results by.
val direction : kotlin.String = direction_example // kotlin.String | The order to sort by. Default: `asc` when using `full_name`, otherwise `desc`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val since : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show repositories updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
val before : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Only show repositories updated before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
try {
    val result : kotlin.collections.List<Repository> = apiInstance.reposListForAuthenticatedUser(visibility, affiliation, type, sort, direction, perPage, page, since, before)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **visibility** | **kotlin.String**| Limit results to repositories with the specified visibility. | [optional] [default to all] [enum: all, public, private]
 **affiliation** | **kotlin.String**| Comma-separated list of values. Can include:    * &#x60;owner&#x60;: Repositories that are owned by the authenticated user.    * &#x60;collaborator&#x60;: Repositories that the user has been added to as a collaborator.    * &#x60;organization_member&#x60;: Repositories that the user has access to through being a member of an organization. This includes every repository on every team that the user is on. | [optional] [default to &quot;owner,collaborator,organization_member&quot;]
 **type** | **kotlin.String**| Limit results to repositories of the specified type. Will cause a &#x60;422&#x60; error if used in the same request as **visibility** or **affiliation**. | [optional] [default to all] [enum: all, owner, public, private, member]
 **sort** | **kotlin.String**| The property to sort the results by. | [optional] [default to full_name] [enum: created, updated, pushed, full_name]
 **direction** | **kotlin.String**| The order to sort by. Default: &#x60;asc&#x60; when using &#x60;full_name&#x60;, otherwise &#x60;desc&#x60;. | [optional] [enum: asc, desc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **since** | **kotlinx.datetime.Instant**| Only show repositories updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]
 **before** | **kotlinx.datetime.Instant**| Only show repositories updated before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional]

### Return type

[**kotlin.collections.List&lt;Repository&gt;**](Repository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListForOrg"></a>
# **reposListForOrg**
> kotlin.collections.List&lt;MinimalRepository&gt; reposListForOrg(org, type, sort, direction, perPage, page)

List organization repositories

Lists repositories for the specified organization.  **Note:** In order to see the &#x60;security_and_analysis&#x60; block for a repository you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val type : kotlin.String = type_example // kotlin.String | Specifies the types of repositories you want returned.
val sort : kotlin.String = sort_example // kotlin.String | The property to sort the results by.
val direction : kotlin.String = direction_example // kotlin.String | The order to sort by. Default: `asc` when using `full_name`, otherwise `desc`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<MinimalRepository> = apiInstance.reposListForOrg(org, type, sort, direction, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **type** | **kotlin.String**| Specifies the types of repositories you want returned. | [optional] [default to all] [enum: all, public, private, forks, sources, member]
 **sort** | **kotlin.String**| The property to sort the results by. | [optional] [default to created] [enum: created, updated, pushed, full_name]
 **direction** | **kotlin.String**| The order to sort by. Default: &#x60;asc&#x60; when using &#x60;full_name&#x60;, otherwise &#x60;desc&#x60;. | [optional] [enum: asc, desc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListForUser"></a>
# **reposListForUser**
> kotlin.collections.List&lt;MinimalRepository&gt; reposListForUser(username, type, sort, direction, perPage, page)

List repositories for a user

Lists public repositories for the specified user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
val type : kotlin.String = type_example // kotlin.String | Limit results to repositories of the specified type.
val sort : kotlin.String = sort_example // kotlin.String | The property to sort the results by.
val direction : kotlin.String = direction_example // kotlin.String | The order to sort by. Default: `asc` when using `full_name`, otherwise `desc`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<MinimalRepository> = apiInstance.reposListForUser(username, type, sort, direction, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListForUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The handle for the GitHub user account. |
 **type** | **kotlin.String**| Limit results to repositories of the specified type. | [optional] [default to owner] [enum: all, owner, member]
 **sort** | **kotlin.String**| The property to sort the results by. | [optional] [default to full_name] [enum: created, updated, pushed, full_name]
 **direction** | **kotlin.String**| The order to sort by. Default: &#x60;asc&#x60; when using &#x60;full_name&#x60;, otherwise &#x60;desc&#x60;. | [optional] [enum: asc, desc]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListForks"></a>
# **reposListForks**
> kotlin.collections.List&lt;MinimalRepository&gt; reposListForks(owner, repo, sort, perPage, page)

List forks



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val sort : kotlin.String = sort_example // kotlin.String | The sort order. `stargazers` will sort by star count.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<MinimalRepository> = apiInstance.reposListForks(owner, repo, sort, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListForks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListForks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **sort** | **kotlin.String**| The sort order. &#x60;stargazers&#x60; will sort by star count. | [optional] [default to newest] [enum: newest, oldest, stargazers, watchers]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="reposListInvitations"></a>
# **reposListInvitations**
> kotlin.collections.List&lt;RepositoryInvitation&gt; reposListInvitations(owner, repo, perPage, page)

List repository invitations

When authenticating as a user with admin rights to a repository, this endpoint will list all currently open repository invitations.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<RepositoryInvitation> = apiInstance.reposListInvitations(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListInvitations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListInvitations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;RepositoryInvitation&gt;**](RepositoryInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListInvitationsForAuthenticatedUser"></a>
# **reposListInvitationsForAuthenticatedUser**
> kotlin.collections.List&lt;RepositoryInvitation&gt; reposListInvitationsForAuthenticatedUser(perPage, page)

List repository invitations for the authenticated user

When authenticating as a user, this endpoint will list all currently open repository invitations for that user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<RepositoryInvitation> = apiInstance.reposListInvitationsForAuthenticatedUser(perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListInvitationsForAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListInvitationsForAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;RepositoryInvitation&gt;**](RepositoryInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListLanguages"></a>
# **reposListLanguages**
> kotlin.collections.Map&lt;kotlin.String, kotlin.Int&gt; reposListLanguages(owner, repo)

List repository languages

Lists languages for the specified repository. The value shown for each language is the number of bytes of code written in that language.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : kotlin.collections.Map<kotlin.String, kotlin.Int> = apiInstance.reposListLanguages(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListLanguages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListLanguages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

**kotlin.collections.Map&lt;kotlin.String, kotlin.Int&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListPagesBuilds"></a>
# **reposListPagesBuilds**
> kotlin.collections.List&lt;PageBuild&gt; reposListPagesBuilds(owner, repo, perPage, page)

List GitHub Pages builds

Lists builts of a GitHub Pages site.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<PageBuild> = apiInstance.reposListPagesBuilds(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListPagesBuilds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListPagesBuilds")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;PageBuild&gt;**](PageBuild.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListPublic"></a>
# **reposListPublic**
> kotlin.collections.List&lt;MinimalRepository&gt; reposListPublic(since)

List public repositories

Lists all public repositories in the order that they were created.  Note: - For GitHub Enterprise Server, this endpoint will only list repositories available to all users on the enterprise. - Pagination is powered exclusively by the &#x60;since&#x60; parameter. Use the [Link header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers) to get the URL for the next page of repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val since : kotlin.Int = 56 // kotlin.Int | A repository ID. Only return repositories with an ID greater than this ID.
try {
    val result : kotlin.collections.List<MinimalRepository> = apiInstance.reposListPublic(since)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListPublic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListPublic")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **kotlin.Int**| A repository ID. Only return repositories with an ID greater than this ID. | [optional]

### Return type

[**kotlin.collections.List&lt;MinimalRepository&gt;**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListPullRequestsAssociatedWithCommit"></a>
# **reposListPullRequestsAssociatedWithCommit**
> kotlin.collections.List&lt;PullRequestSimple&gt; reposListPullRequestsAssociatedWithCommit(owner, repo, commitSha, perPage, page)

List pull requests associated with a commit

Lists the merged pull request that introduced the commit to the repository. If the commit is not present in the default branch, will only return open pull requests associated with the commit.  To list the open or merged pull requests associated with a branch, you can set the &#x60;commit_sha&#x60; parameter to the branch name.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commitSha : kotlin.String = commitSha_example // kotlin.String | The SHA of the commit.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<PullRequestSimple> = apiInstance.reposListPullRequestsAssociatedWithCommit(owner, repo, commitSha, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListPullRequestsAssociatedWithCommit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListPullRequestsAssociatedWithCommit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commitSha** | **kotlin.String**| The SHA of the commit. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;PullRequestSimple&gt;**](PullRequestSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListReleaseAssets"></a>
# **reposListReleaseAssets**
> kotlin.collections.List&lt;ReleaseAsset&gt; reposListReleaseAssets(owner, repo, releaseId, perPage, page)

List release assets



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val releaseId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the release.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<ReleaseAsset> = apiInstance.reposListReleaseAssets(owner, repo, releaseId, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListReleaseAssets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListReleaseAssets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **releaseId** | **kotlin.Int**| The unique identifier of the release. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;ReleaseAsset&gt;**](ReleaseAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListReleases"></a>
# **reposListReleases**
> kotlin.collections.List&lt;Release&gt; reposListReleases(owner, repo, perPage, page)

List releases

This returns a list of releases, which does not include regular Git tags that have not been associated with a release. To get a list of Git tags, use the [Repository Tags API](https://docs.github.com/rest/repos/repos#list-repository-tags).  Information about published releases are available to everyone. Only users with push access will receive listings for draft releases.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Release> = apiInstance.reposListReleases(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListReleases")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListReleases")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Release&gt;**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListTagProtection"></a>
# **reposListTagProtection**
> kotlin.collections.List&lt;TagProtection&gt; reposListTagProtection(owner, repo)

List tag protection states for a repository

This returns the tag protection states of a repository.  This information is only available to repository administrators.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : kotlin.collections.List<TagProtection> = apiInstance.reposListTagProtection(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListTagProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListTagProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**kotlin.collections.List&lt;TagProtection&gt;**](TagProtection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListTags"></a>
# **reposListTags**
> kotlin.collections.List&lt;Tag&gt; reposListTags(owner, repo, perPage, page)

List repository tags



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Tag> = apiInstance.reposListTags(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListTags")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Tag&gt;**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListTeams"></a>
# **reposListTeams**
> kotlin.collections.List&lt;Team&gt; reposListTeams(owner, repo, perPage, page)

List repository teams

Lists the teams that have access to the specified repository and that are also visible to the authenticated user.  For a public repository, a team is listed only if that team added the public repository explicitly.  OAuth app tokens and personal access tokens (classic) need the &#x60;public_repo&#x60; or &#x60;repo&#x60; scope to use this endpoint with a public repository, and &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Team> = apiInstance.reposListTeams(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListTeams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListTeams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposListWebhookDeliveries"></a>
# **reposListWebhookDeliveries**
> kotlin.collections.List&lt;HookDeliveryItem&gt; reposListWebhookDeliveries(owner, repo, hookId, perPage, cursor, redelivery)

List deliveries for a repository webhook

Returns a list of webhook deliveries for a webhook configured in a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val cursor : kotlin.String = cursor_example // kotlin.String | Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the `link` header for the next and previous page cursors.
val redelivery : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.collections.List<HookDeliveryItem> = apiInstance.reposListWebhookDeliveries(owner, repo, hookId, perPage, cursor, redelivery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListWebhookDeliveries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListWebhookDeliveries")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **cursor** | **kotlin.String**| Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the &#x60;link&#x60; header for the next and previous page cursors. | [optional]
 **redelivery** | **kotlin.Boolean**|  | [optional]

### Return type

[**kotlin.collections.List&lt;HookDeliveryItem&gt;**](HookDeliveryItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="reposListWebhooks"></a>
# **reposListWebhooks**
> kotlin.collections.List&lt;Hook&gt; reposListWebhooks(owner, repo, perPage, page)

List repository webhooks

Lists webhooks for a repository. &#x60;last response&#x60; may return null if there have not been any deliveries within 30 days.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<Hook> = apiInstance.reposListWebhooks(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposListWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposListWebhooks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**kotlin.collections.List&lt;Hook&gt;**](Hook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposMerge"></a>
# **reposMerge**
> Commit reposMerge(owner, repo, reposMergeRequest)

Merge a branch



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposMergeRequest : ReposMergeRequest = {"base":"master","head":"cool_feature","commit_message":"Shipped cool_feature!"} // ReposMergeRequest | 
try {
    val result : Commit = apiInstance.reposMerge(owner, repo, reposMergeRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposMerge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposMerge")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposMergeRequest** | [**ReposMergeRequest**](ReposMergeRequest.md)|  |

### Return type

[**Commit**](Commit.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposMergeUpstream"></a>
# **reposMergeUpstream**
> MergedUpstream reposMergeUpstream(owner, repo, reposMergeUpstreamRequest)

Sync a fork branch with the upstream repository

Sync a branch of a forked repository to keep it up-to-date with the upstream repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposMergeUpstreamRequest : ReposMergeUpstreamRequest = {"branch":"main"} // ReposMergeUpstreamRequest | 
try {
    val result : MergedUpstream = apiInstance.reposMergeUpstream(owner, repo, reposMergeUpstreamRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposMergeUpstream")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposMergeUpstream")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposMergeUpstreamRequest** | [**ReposMergeUpstreamRequest**](ReposMergeUpstreamRequest.md)|  |

### Return type

[**MergedUpstream**](MergedUpstream.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposPingWebhook"></a>
# **reposPingWebhook**
> reposPingWebhook(owner, repo, hookId)

Ping a repository webhook

This will trigger a [ping event](https://docs.github.com/webhooks/#ping-event) to be sent to the hook.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
try {
    apiInstance.reposPingWebhook(owner, repo, hookId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposPingWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposPingWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposRedeliverWebhookDelivery"></a>
# **reposRedeliverWebhookDelivery**
> kotlin.Any reposRedeliverWebhookDelivery(owner, repo, hookId, deliveryId)

Redeliver a delivery for a repository webhook

Redeliver a webhook delivery for a webhook configured in a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
val deliveryId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.reposRedeliverWebhookDelivery(owner, repo, hookId, deliveryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposRedeliverWebhookDelivery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposRedeliverWebhookDelivery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |
 **deliveryId** | **kotlin.Int**|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="reposRemoveAppAccessRestrictions"></a>
# **reposRemoveAppAccessRestrictions**
> kotlin.collections.List&lt;Integration&gt; reposRemoveAppAccessRestrictions(owner, repo, branch, reposSetAppAccessRestrictionsRequest)

Remove app access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Removes the ability of an app to push to this branch. Only GitHub Apps that are installed on the repository and that have been granted write access to the repository contents can be added as authorized actors on a protected branch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
val reposSetAppAccessRestrictionsRequest : ReposSetAppAccessRestrictionsRequest = {"apps":["my-app"]} // ReposSetAppAccessRestrictionsRequest | 
try {
    val result : kotlin.collections.List<Integration> = apiInstance.reposRemoveAppAccessRestrictions(owner, repo, branch, reposSetAppAccessRestrictionsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposRemoveAppAccessRestrictions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposRemoveAppAccessRestrictions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |
 **reposSetAppAccessRestrictionsRequest** | [**ReposSetAppAccessRestrictionsRequest**](ReposSetAppAccessRestrictionsRequest.md)|  | [optional]

### Return type

[**kotlin.collections.List&lt;Integration&gt;**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposRemoveCollaborator"></a>
# **reposRemoveCollaborator**
> reposRemoveCollaborator(owner, repo, username)

Remove a repository collaborator

Removes a collaborator from a repository.  To use this endpoint, the authenticated user must either be an administrator of the repository or target themselves for removal.  This endpoint also: - Cancels any outstanding invitations - Unasigns the user from any issues - Removes access to organization projects if the user is not an organization member and is not a collaborator on any other organization repositories. - Unstars the repository - Updates access permissions to packages  Removing a user as a collaborator has the following effects on forks:  - If the user had access to a fork through their membership to this repository, the user will also be removed from the fork.  - If the user had their own fork of the repository, the fork will be deleted.  - If the user still has read access to the repository, open pull requests by this user from a fork will be denied.  **Note**: A user can still have access to the repository through organization permissions like base repository permissions.  Although the API responds immediately, the additional permission updates might take some extra time to complete in the background.  For more information on fork permissions, see \&quot;[About permissions and visibility of forks](https://docs.github.com/pull-requests/collaborating-with-pull-requests/working-with-forks/about-permissions-and-visibility-of-forks)\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val username : kotlin.String = username_example // kotlin.String | The handle for the GitHub user account.
try {
    apiInstance.reposRemoveCollaborator(owner, repo, username)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposRemoveCollaborator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposRemoveCollaborator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **username** | **kotlin.String**| The handle for the GitHub user account. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposRemoveStatusCheckContexts"></a>
# **reposRemoveStatusCheckContexts**
> kotlin.collections.List&lt;kotlin.String&gt; reposRemoveStatusCheckContexts(owner, repo, branch, reposSetStatusCheckContextsRequest)

Remove status check contexts

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
val reposSetStatusCheckContextsRequest : ReposSetStatusCheckContextsRequest = {"contexts":["continuous-integration/jenkins"]} // ReposSetStatusCheckContextsRequest | 
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.reposRemoveStatusCheckContexts(owner, repo, branch, reposSetStatusCheckContextsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposRemoveStatusCheckContexts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposRemoveStatusCheckContexts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |
 **reposSetStatusCheckContextsRequest** | [**ReposSetStatusCheckContextsRequest**](ReposSetStatusCheckContextsRequest.md)|  | [optional]

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposRemoveStatusCheckProtection"></a>
# **reposRemoveStatusCheckProtection**
> reposRemoveStatusCheckProtection(owner, repo, branch)

Remove status check protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    apiInstance.reposRemoveStatusCheckProtection(owner, repo, branch)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposRemoveStatusCheckProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposRemoveStatusCheckProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="reposRemoveTeamAccessRestrictions"></a>
# **reposRemoveTeamAccessRestrictions**
> kotlin.collections.List&lt;Team&gt; reposRemoveTeamAccessRestrictions(owner, repo, branch, reposAddTeamAccessRestrictionsRequest)

Remove team access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Removes the ability of a team to push to this branch. You can also remove push access for child teams.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
val reposAddTeamAccessRestrictionsRequest : ReposAddTeamAccessRestrictionsRequest = {"teams":["octocats"]} // ReposAddTeamAccessRestrictionsRequest | 
try {
    val result : kotlin.collections.List<Team> = apiInstance.reposRemoveTeamAccessRestrictions(owner, repo, branch, reposAddTeamAccessRestrictionsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposRemoveTeamAccessRestrictions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposRemoveTeamAccessRestrictions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |
 **reposAddTeamAccessRestrictionsRequest** | [**ReposAddTeamAccessRestrictionsRequest**](ReposAddTeamAccessRestrictionsRequest.md)|  | [optional]

### Return type

[**kotlin.collections.List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposRemoveUserAccessRestrictions"></a>
# **reposRemoveUserAccessRestrictions**
> kotlin.collections.List&lt;SimpleUser&gt; reposRemoveUserAccessRestrictions(owner, repo, branch, reposSetUserAccessRestrictionsRequest)

Remove user access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Removes the ability of a user to push to this branch.  | Type    | Description                                                                                                                                   | | ------- | --------------------------------------------------------------------------------------------------------------------------------------------- | | &#x60;array&#x60; | Usernames of the people who should no longer have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
val reposSetUserAccessRestrictionsRequest : ReposSetUserAccessRestrictionsRequest = {"users":["octocat"]} // ReposSetUserAccessRestrictionsRequest | 
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.reposRemoveUserAccessRestrictions(owner, repo, branch, reposSetUserAccessRestrictionsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposRemoveUserAccessRestrictions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposRemoveUserAccessRestrictions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |
 **reposSetUserAccessRestrictionsRequest** | [**ReposSetUserAccessRestrictionsRequest**](ReposSetUserAccessRestrictionsRequest.md)|  | [optional]

### Return type

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposRenameBranch"></a>
# **reposRenameBranch**
> BranchWithProtection reposRenameBranch(owner, repo, branch, reposRenameBranchRequest)

Rename a branch

Renames a branch in a repository.  **Note:** Although the API responds immediately, the branch rename process might take some extra time to complete in the background. You won&#39;t be able to push to the old branch name while the rename process is in progress. For more information, see \&quot;[Renaming a branch](https://docs.github.com/github/administering-a-repository/renaming-a-branch)\&quot;.  The authenticated user must have push access to the branch. If the branch is the default branch, the authenticated user must also have admin or owner permissions.  In order to rename the default branch, fine-grained access tokens also need the &#x60;administration:write&#x60; repository permission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
val reposRenameBranchRequest : ReposRenameBranchRequest = {"new_name":"my_renamed_branch"} // ReposRenameBranchRequest | 
try {
    val result : BranchWithProtection = apiInstance.reposRenameBranch(owner, repo, branch, reposRenameBranchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposRenameBranch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposRenameBranch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |
 **reposRenameBranchRequest** | [**ReposRenameBranchRequest**](ReposRenameBranchRequest.md)|  |

### Return type

[**BranchWithProtection**](BranchWithProtection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposReplaceAllTopics"></a>
# **reposReplaceAllTopics**
> Topic reposReplaceAllTopics(owner, repo, reposReplaceAllTopicsRequest)

Replace all repository topics



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposReplaceAllTopicsRequest : ReposReplaceAllTopicsRequest = {names=[octocat, atom, electron, api]} // ReposReplaceAllTopicsRequest | 
try {
    val result : Topic = apiInstance.reposReplaceAllTopics(owner, repo, reposReplaceAllTopicsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposReplaceAllTopics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposReplaceAllTopics")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposReplaceAllTopicsRequest** | [**ReposReplaceAllTopicsRequest**](ReposReplaceAllTopicsRequest.md)|  |

### Return type

[**Topic**](Topic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposRequestPagesBuild"></a>
# **reposRequestPagesBuild**
> PageBuildStatus reposRequestPagesBuild(owner, repo)

Request a GitHub Pages build

You can request that your site be built from the latest revision on the default branch. This has the same effect as pushing a commit to your default branch, but does not require an additional commit. Manually triggering page builds can be helpful when diagnosing build warnings and failures.  Build requests are limited to one concurrent build per repository and one concurrent build per requester. If you request a build while another is still in progress, the second request will be queued until the first completes.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : PageBuildStatus = apiInstance.reposRequestPagesBuild(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposRequestPagesBuild")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposRequestPagesBuild")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**PageBuildStatus**](PageBuildStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposSetAdminBranchProtection"></a>
# **reposSetAdminBranchProtection**
> ProtectedBranchAdminEnforced reposSetAdminBranchProtection(owner, repo, branch)

Set admin branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Adding admin enforcement requires admin or owner permissions to the repository and branch protection to be enabled.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
try {
    val result : ProtectedBranchAdminEnforced = apiInstance.reposSetAdminBranchProtection(owner, repo, branch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposSetAdminBranchProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposSetAdminBranchProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |

### Return type

[**ProtectedBranchAdminEnforced**](ProtectedBranchAdminEnforced.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposSetAppAccessRestrictions"></a>
# **reposSetAppAccessRestrictions**
> kotlin.collections.List&lt;Integration&gt; reposSetAppAccessRestrictions(owner, repo, branch, reposSetAppAccessRestrictionsRequest)

Set app access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Replaces the list of apps that have push access to this branch. This removes all apps that previously had push access and grants push access to the new list of apps. Only GitHub Apps that are installed on the repository and that have been granted write access to the repository contents can be added as authorized actors on a protected branch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
val reposSetAppAccessRestrictionsRequest : ReposSetAppAccessRestrictionsRequest = {"apps":["octoapp"]} // ReposSetAppAccessRestrictionsRequest | 
try {
    val result : kotlin.collections.List<Integration> = apiInstance.reposSetAppAccessRestrictions(owner, repo, branch, reposSetAppAccessRestrictionsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposSetAppAccessRestrictions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposSetAppAccessRestrictions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |
 **reposSetAppAccessRestrictionsRequest** | [**ReposSetAppAccessRestrictionsRequest**](ReposSetAppAccessRestrictionsRequest.md)|  | [optional]

### Return type

[**kotlin.collections.List&lt;Integration&gt;**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposSetStatusCheckContexts"></a>
# **reposSetStatusCheckContexts**
> kotlin.collections.List&lt;kotlin.String&gt; reposSetStatusCheckContexts(owner, repo, branch, reposSetStatusCheckContextsRequest)

Set status check contexts

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
val reposSetStatusCheckContextsRequest : ReposSetStatusCheckContextsRequest = {"contexts":["continuous-integration/travis-ci"]} // ReposSetStatusCheckContextsRequest | 
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.reposSetStatusCheckContexts(owner, repo, branch, reposSetStatusCheckContextsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposSetStatusCheckContexts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposSetStatusCheckContexts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |
 **reposSetStatusCheckContextsRequest** | [**ReposSetStatusCheckContextsRequest**](ReposSetStatusCheckContextsRequest.md)|  | [optional]

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposSetTeamAccessRestrictions"></a>
# **reposSetTeamAccessRestrictions**
> kotlin.collections.List&lt;Team&gt; reposSetTeamAccessRestrictions(owner, repo, branch, reposSetTeamAccessRestrictionsRequest)

Set team access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Replaces the list of teams that have push access to this branch. This removes all teams that previously had push access and grants push access to the new list of teams. Team restrictions include child teams.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
val reposSetTeamAccessRestrictionsRequest : ReposSetTeamAccessRestrictionsRequest = {"teams":["justice-league"]} // ReposSetTeamAccessRestrictionsRequest | 
try {
    val result : kotlin.collections.List<Team> = apiInstance.reposSetTeamAccessRestrictions(owner, repo, branch, reposSetTeamAccessRestrictionsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposSetTeamAccessRestrictions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposSetTeamAccessRestrictions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |
 **reposSetTeamAccessRestrictionsRequest** | [**ReposSetTeamAccessRestrictionsRequest**](ReposSetTeamAccessRestrictionsRequest.md)|  | [optional]

### Return type

[**kotlin.collections.List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposSetUserAccessRestrictions"></a>
# **reposSetUserAccessRestrictions**
> kotlin.collections.List&lt;SimpleUser&gt; reposSetUserAccessRestrictions(owner, repo, branch, reposSetUserAccessRestrictionsRequest)

Set user access restrictions

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Replaces the list of people that have push access to this branch. This removes all people that previously had push access and grants push access to the new list of people.  | Type    | Description                                                                                                                   | | ------- | ----------------------------------------------------------------------------------------------------------------------------- | | &#x60;array&#x60; | Usernames for people who can have push access. **Note**: The list of users, apps, and teams in total is limited to 100 items. |

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
val reposSetUserAccessRestrictionsRequest : ReposSetUserAccessRestrictionsRequest = {"users":["octocat"]} // ReposSetUserAccessRestrictionsRequest | 
try {
    val result : kotlin.collections.List<SimpleUser> = apiInstance.reposSetUserAccessRestrictions(owner, repo, branch, reposSetUserAccessRestrictionsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposSetUserAccessRestrictions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposSetUserAccessRestrictions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |
 **reposSetUserAccessRestrictionsRequest** | [**ReposSetUserAccessRestrictionsRequest**](ReposSetUserAccessRestrictionsRequest.md)|  | [optional]

### Return type

[**kotlin.collections.List&lt;SimpleUser&gt;**](SimpleUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposTestPushWebhook"></a>
# **reposTestPushWebhook**
> reposTestPushWebhook(owner, repo, hookId)

Test the push repository webhook

This will trigger the hook with the latest push to the current repository if the hook is subscribed to &#x60;push&#x60; events. If the hook is not subscribed to &#x60;push&#x60; events, the server will respond with 204 but no test POST will be generated.  **Note**: Previously &#x60;/repos/:owner/:repo/hooks/:hook_id/test&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
try {
    apiInstance.reposTestPushWebhook(owner, repo, hookId)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposTestPushWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposTestPushWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="reposTransfer"></a>
# **reposTransfer**
> MinimalRepository reposTransfer(owner, repo, reposTransferRequest)

Transfer a repository

A transfer request will need to be accepted by the new owner when transferring a personal repository to another user. The response will contain the original &#x60;owner&#x60;, and the transfer will continue asynchronously. For more details on the requirements to transfer personal and organization-owned repositories, see [about repository transfers](https://docs.github.com/articles/about-repository-transfers/).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposTransferRequest : ReposTransferRequest = {"new_owner":"github","team_ids":[12,345],"new_name":"octorepo"} // ReposTransferRequest | 
try {
    val result : MinimalRepository = apiInstance.reposTransfer(owner, repo, reposTransferRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposTransfer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposTransfer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposTransferRequest** | [**ReposTransferRequest**](ReposTransferRequest.md)|  |

### Return type

[**MinimalRepository**](MinimalRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposUpdate"></a>
# **reposUpdate**
> FullRepository reposUpdate(owner, repo, reposUpdateRequest)

Update a repository

**Note**: To edit a repository&#39;s topics, use the [Replace all repository topics](https://docs.github.com/rest/repos/repos#replace-all-repository-topics) endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposUpdateRequest : ReposUpdateRequest = {"name":"Hello-World","description":"This is your first repository","homepage":"https://github.com","private":true,"has_issues":true,"has_projects":true,"has_wiki":true} // ReposUpdateRequest | 
try {
    val result : FullRepository = apiInstance.reposUpdate(owner, repo, reposUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposUpdateRequest** | [**ReposUpdateRequest**](ReposUpdateRequest.md)|  | [optional]

### Return type

[**FullRepository**](FullRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposUpdateBranchProtection"></a>
# **reposUpdateBranchProtection**
> ProtectedBranch reposUpdateBranchProtection(owner, repo, branch, reposUpdateBranchProtectionRequest)

Update branch protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Protecting a branch requires admin or owner permissions to the repository.  **Note**: Passing new arrays of &#x60;users&#x60; and &#x60;teams&#x60; replaces their previous values.  **Note**: The list of users, apps, and teams in total is limited to 100 items.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
val reposUpdateBranchProtectionRequest : ReposUpdateBranchProtectionRequest = {"required_status_checks":{"strict":true,"contexts":["continuous-integration/travis-ci"]},"enforce_admins":true,"required_pull_request_reviews":{"dismissal_restrictions":{"users":["octocat"],"teams":["justice-league"]},"dismiss_stale_reviews":true,"require_code_owner_reviews":true,"required_approving_review_count":2,"require_last_push_approval":true,"bypass_pull_request_allowances":{"users":["octocat"],"teams":["justice-league"]}},"restrictions":{"users":["octocat"],"teams":["justice-league"],"apps":["super-ci"]},"required_linear_history":true,"allow_force_pushes":true,"allow_deletions":true,"block_creations":true,"required_conversation_resolution":true,"lock_branch":true,"allow_fork_syncing":true} // ReposUpdateBranchProtectionRequest | 
try {
    val result : ProtectedBranch = apiInstance.reposUpdateBranchProtection(owner, repo, branch, reposUpdateBranchProtectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposUpdateBranchProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposUpdateBranchProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |
 **reposUpdateBranchProtectionRequest** | [**ReposUpdateBranchProtectionRequest**](ReposUpdateBranchProtectionRequest.md)|  |

### Return type

[**ProtectedBranch**](ProtectedBranch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposUpdateCommitComment"></a>
# **reposUpdateCommitComment**
> CommitComment reposUpdateCommitComment(owner, repo, commentId, reposUpdateCommitCommentRequest)

Update a commit comment

Updates the contents of a specified commit comment.  This endpoint supports the following custom media types. For more information, see \&quot;[Media types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types).\&quot;  - **&#x60;application/vnd.github-commitcomment.raw+json&#x60;**: Returns the raw markdown body. Response will include &#x60;body&#x60;. This is the default if you do not pass any specific media type. - **&#x60;application/vnd.github-commitcomment.text+json&#x60;**: Returns a text only representation of the markdown body. Response will include &#x60;body_text&#x60;. - **&#x60;application/vnd.github-commitcomment.html+json&#x60;**: Returns HTML rendered from the body&#39;s markdown. Response will include &#x60;body_html&#x60;. - **&#x60;application/vnd.github-commitcomment.full+json&#x60;**: Returns raw, text, and HTML representations. Response will include &#x60;body&#x60;, &#x60;body_text&#x60;, and &#x60;body_html&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val commentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the comment.
val reposUpdateCommitCommentRequest : ReposUpdateCommitCommentRequest = {"body":"Nice change"} // ReposUpdateCommitCommentRequest | 
try {
    val result : CommitComment = apiInstance.reposUpdateCommitComment(owner, repo, commentId, reposUpdateCommitCommentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposUpdateCommitComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposUpdateCommitComment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **commentId** | **kotlin.Int**| The unique identifier of the comment. |
 **reposUpdateCommitCommentRequest** | [**ReposUpdateCommitCommentRequest**](ReposUpdateCommitCommentRequest.md)|  |

### Return type

[**CommitComment**](CommitComment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposUpdateDeploymentBranchPolicy"></a>
# **reposUpdateDeploymentBranchPolicy**
> DeploymentBranchPolicy reposUpdateDeploymentBranchPolicy(owner, repo, environmentName, branchPolicyId, deploymentBranchPolicyNamePattern)

Update a deployment branch policy

Updates a deployment branch or tag policy for an environment.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val branchPolicyId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the branch policy.
val deploymentBranchPolicyNamePattern : DeploymentBranchPolicyNamePattern = {"name":"release/*"} // DeploymentBranchPolicyNamePattern | 
try {
    val result : DeploymentBranchPolicy = apiInstance.reposUpdateDeploymentBranchPolicy(owner, repo, environmentName, branchPolicyId, deploymentBranchPolicyNamePattern)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposUpdateDeploymentBranchPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposUpdateDeploymentBranchPolicy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **branchPolicyId** | **kotlin.Int**| The unique identifier of the branch policy. |
 **deploymentBranchPolicyNamePattern** | [**DeploymentBranchPolicyNamePattern**](DeploymentBranchPolicyNamePattern.md)|  |

### Return type

[**DeploymentBranchPolicy**](DeploymentBranchPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposUpdateInformationAboutPagesSite"></a>
# **reposUpdateInformationAboutPagesSite**
> reposUpdateInformationAboutPagesSite(owner, repo, reposUpdateInformationAboutPagesSiteRequest)

Update information about a GitHub Pages site

Updates information for a GitHub Pages site. For more information, see \&quot;[About GitHub Pages](/github/working-with-github-pages/about-github-pages).  The authenticated user must be a repository administrator, maintainer, or have the &#39;manage GitHub Pages settings&#39; permission.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val reposUpdateInformationAboutPagesSiteRequest : ReposUpdateInformationAboutPagesSiteRequest = {"cname":"octocatblog.com","source":{"branch":"main","path":"/"}} // ReposUpdateInformationAboutPagesSiteRequest | 
try {
    apiInstance.reposUpdateInformationAboutPagesSite(owner, repo, reposUpdateInformationAboutPagesSiteRequest)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposUpdateInformationAboutPagesSite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposUpdateInformationAboutPagesSite")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **reposUpdateInformationAboutPagesSiteRequest** | [**ReposUpdateInformationAboutPagesSiteRequest**](ReposUpdateInformationAboutPagesSiteRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/scim+json

<a id="reposUpdateInvitation"></a>
# **reposUpdateInvitation**
> RepositoryInvitation reposUpdateInvitation(owner, repo, invitationId, reposUpdateInvitationRequest)

Update a repository invitation



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val invitationId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the invitation.
val reposUpdateInvitationRequest : ReposUpdateInvitationRequest = {"permissions":"write"} // ReposUpdateInvitationRequest | 
try {
    val result : RepositoryInvitation = apiInstance.reposUpdateInvitation(owner, repo, invitationId, reposUpdateInvitationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposUpdateInvitation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposUpdateInvitation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **invitationId** | **kotlin.Int**| The unique identifier of the invitation. |
 **reposUpdateInvitationRequest** | [**ReposUpdateInvitationRequest**](ReposUpdateInvitationRequest.md)|  | [optional]

### Return type

[**RepositoryInvitation**](RepositoryInvitation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposUpdateOrgRuleset"></a>
# **reposUpdateOrgRuleset**
> RepositoryRuleset reposUpdateOrgRuleset(org, rulesetId, reposUpdateOrgRulesetRequest)

Update an organization repository ruleset

Update a ruleset for an organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val rulesetId : kotlin.Int = 56 // kotlin.Int | The ID of the ruleset.
val reposUpdateOrgRulesetRequest : ReposUpdateOrgRulesetRequest = {name=super cool ruleset, target=branch, enforcement=active, bypass_actors=[{actor_id=234, actor_type=Team, bypass_mode=always}], conditions={ref_name={include=[refs/heads/main, refs/heads/master], exclude=[refs/heads/dev*]}, repository_name={include=[important_repository, another_important_repository], exclude=[unimportant_repository], protected=true}}, rules=[{type=commit_author_email_pattern, parameters={operator=contains, pattern=github}}]} // ReposUpdateOrgRulesetRequest | Request body
try {
    val result : RepositoryRuleset = apiInstance.reposUpdateOrgRuleset(org, rulesetId, reposUpdateOrgRulesetRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposUpdateOrgRuleset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposUpdateOrgRuleset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **rulesetId** | **kotlin.Int**| The ID of the ruleset. |
 **reposUpdateOrgRulesetRequest** | [**ReposUpdateOrgRulesetRequest**](ReposUpdateOrgRulesetRequest.md)| Request body | [optional]

### Return type

[**RepositoryRuleset**](RepositoryRuleset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposUpdatePullRequestReviewProtection"></a>
# **reposUpdatePullRequestReviewProtection**
> ProtectedBranchPullRequestReview reposUpdatePullRequestReviewProtection(owner, repo, branch, reposUpdatePullRequestReviewProtectionRequest)

Update pull request review protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Updating pull request review enforcement requires admin or owner permissions to the repository and branch protection to be enabled.  **Note**: Passing new arrays of &#x60;users&#x60; and &#x60;teams&#x60; replaces their previous values.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
val reposUpdatePullRequestReviewProtectionRequest : ReposUpdatePullRequestReviewProtectionRequest = {"dismissal_restrictions":{"users":["octocat"],"teams":["justice-league"],"apps":["octoapp"]},"bypass_pull_request_allowances":{"users":["octocat"],"teams":["justice-league"],"apps":["octoapp"]},"dismiss_stale_reviews":true,"require_code_owner_reviews":true,"required_approving_review_count":2,"require_last_push_approval":true} // ReposUpdatePullRequestReviewProtectionRequest | 
try {
    val result : ProtectedBranchPullRequestReview = apiInstance.reposUpdatePullRequestReviewProtection(owner, repo, branch, reposUpdatePullRequestReviewProtectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposUpdatePullRequestReviewProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposUpdatePullRequestReviewProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |
 **reposUpdatePullRequestReviewProtectionRequest** | [**ReposUpdatePullRequestReviewProtectionRequest**](ReposUpdatePullRequestReviewProtectionRequest.md)|  | [optional]

### Return type

[**ProtectedBranchPullRequestReview**](ProtectedBranchPullRequestReview.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposUpdateRelease"></a>
# **reposUpdateRelease**
> Release reposUpdateRelease(owner, repo, releaseId, reposUpdateReleaseRequest)

Update a release

Users with push access to the repository can edit a release.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val releaseId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the release.
val reposUpdateReleaseRequest : ReposUpdateReleaseRequest = {"tag_name":"v1.0.0","target_commitish":"master","name":"v1.0.0","body":"Description of the release","draft":false,"prerelease":false} // ReposUpdateReleaseRequest | 
try {
    val result : Release = apiInstance.reposUpdateRelease(owner, repo, releaseId, reposUpdateReleaseRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposUpdateRelease")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposUpdateRelease")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **releaseId** | **kotlin.Int**| The unique identifier of the release. |
 **reposUpdateReleaseRequest** | [**ReposUpdateReleaseRequest**](ReposUpdateReleaseRequest.md)|  | [optional]

### Return type

[**Release**](Release.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposUpdateReleaseAsset"></a>
# **reposUpdateReleaseAsset**
> ReleaseAsset reposUpdateReleaseAsset(owner, repo, assetId, reposUpdateReleaseAssetRequest)

Update a release asset

Users with push access to the repository can edit a release asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val assetId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the asset.
val reposUpdateReleaseAssetRequest : ReposUpdateReleaseAssetRequest = {"name":"foo-1.0.0-osx.zip","label":"Mac binary"} // ReposUpdateReleaseAssetRequest | 
try {
    val result : ReleaseAsset = apiInstance.reposUpdateReleaseAsset(owner, repo, assetId, reposUpdateReleaseAssetRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposUpdateReleaseAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposUpdateReleaseAsset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **assetId** | **kotlin.Int**| The unique identifier of the asset. |
 **reposUpdateReleaseAssetRequest** | [**ReposUpdateReleaseAssetRequest**](ReposUpdateReleaseAssetRequest.md)|  | [optional]

### Return type

[**ReleaseAsset**](ReleaseAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposUpdateRepoRuleset"></a>
# **reposUpdateRepoRuleset**
> RepositoryRuleset reposUpdateRepoRuleset(owner, repo, rulesetId, reposUpdateRepoRulesetRequest)

Update a repository ruleset

Update a ruleset for a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val rulesetId : kotlin.Int = 56 // kotlin.Int | The ID of the ruleset.
val reposUpdateRepoRulesetRequest : ReposUpdateRepoRulesetRequest = {name=super cool ruleset, target=branch, enforcement=active, bypass_actors=[{actor_id=234, actor_type=Team, bypass_mode=always}], conditions={ref_name={include=[refs/heads/main, refs/heads/master], exclude=[refs/heads/dev*]}}, rules=[{type=commit_author_email_pattern, parameters={operator=contains, pattern=github}}]} // ReposUpdateRepoRulesetRequest | Request body
try {
    val result : RepositoryRuleset = apiInstance.reposUpdateRepoRuleset(owner, repo, rulesetId, reposUpdateRepoRulesetRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposUpdateRepoRuleset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposUpdateRepoRuleset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **rulesetId** | **kotlin.Int**| The ID of the ruleset. |
 **reposUpdateRepoRulesetRequest** | [**ReposUpdateRepoRulesetRequest**](ReposUpdateRepoRulesetRequest.md)| Request body | [optional]

### Return type

[**RepositoryRuleset**](RepositoryRuleset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposUpdateStatusCheckProtection"></a>
# **reposUpdateStatusCheckProtection**
> StatusCheckPolicy reposUpdateStatusCheckProtection(owner, repo, branch, reposUpdateStatusCheckProtectionRequest)

Update status check protection

Protected branches are available in public repositories with GitHub Free and GitHub Free for organizations, and in public and private repositories with GitHub Pro, GitHub Team, GitHub Enterprise Cloud, and GitHub Enterprise Server. For more information, see [GitHub&#39;s products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.  Updating required status checks requires admin or owner permissions to the repository and branch protection to be enabled.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val branch : kotlin.String = branch_example // kotlin.String | The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql).
val reposUpdateStatusCheckProtectionRequest : ReposUpdateStatusCheckProtectionRequest = {"strict":true,"contexts":["continuous-integration/travis-ci"]} // ReposUpdateStatusCheckProtectionRequest | 
try {
    val result : StatusCheckPolicy = apiInstance.reposUpdateStatusCheckProtection(owner, repo, branch, reposUpdateStatusCheckProtectionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposUpdateStatusCheckProtection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposUpdateStatusCheckProtection")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **branch** | **kotlin.String**| The name of the branch. Cannot contain wildcard characters. To use wildcard characters in branch names, use [the GraphQL API](https://docs.github.com/graphql). |
 **reposUpdateStatusCheckProtectionRequest** | [**ReposUpdateStatusCheckProtectionRequest**](ReposUpdateStatusCheckProtectionRequest.md)|  | [optional]

### Return type

[**StatusCheckPolicy**](StatusCheckPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposUpdateWebhook"></a>
# **reposUpdateWebhook**
> Hook reposUpdateWebhook(owner, repo, hookId, reposUpdateWebhookRequest)

Update a repository webhook

Updates a webhook configured in a repository. If you previously had a &#x60;secret&#x60; set, you must provide the same &#x60;secret&#x60; or set a new &#x60;secret&#x60; or the secret will be removed. If you are only updating individual webhook &#x60;config&#x60; properties, use \&quot;[Update a webhook configuration for a repository](/rest/webhooks/repo-config#update-a-webhook-configuration-for-a-repository).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
val reposUpdateWebhookRequest : ReposUpdateWebhookRequest = {"active":true,"add_events":["pull_request"]} // ReposUpdateWebhookRequest | 
try {
    val result : Hook = apiInstance.reposUpdateWebhook(owner, repo, hookId, reposUpdateWebhookRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposUpdateWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposUpdateWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |
 **reposUpdateWebhookRequest** | [**ReposUpdateWebhookRequest**](ReposUpdateWebhookRequest.md)|  |

### Return type

[**Hook**](Hook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposUpdateWebhookConfigForRepo"></a>
# **reposUpdateWebhookConfigForRepo**
> WebhookConfig reposUpdateWebhookConfigForRepo(owner, repo, hookId, reposUpdateWebhookConfigForRepoRequest)

Update a webhook configuration for a repository

Updates the webhook configuration for a repository. To update more information about the webhook, including the &#x60;active&#x60; state and &#x60;events&#x60;, use \&quot;[Update a repository webhook](/rest/webhooks/repos#update-a-repository-webhook).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;write:repo_hook&#x60; or &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val hookId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the hook. You can find this value in the `X-GitHub-Hook-ID` header of a webhook delivery.
val reposUpdateWebhookConfigForRepoRequest : ReposUpdateWebhookConfigForRepoRequest = {"content_type":"json","url":"https://example.com/webhook"} // ReposUpdateWebhookConfigForRepoRequest | 
try {
    val result : WebhookConfig = apiInstance.reposUpdateWebhookConfigForRepo(owner, repo, hookId, reposUpdateWebhookConfigForRepoRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposUpdateWebhookConfigForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposUpdateWebhookConfigForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **hookId** | **kotlin.Int**| The unique identifier of the hook. You can find this value in the &#x60;X-GitHub-Hook-ID&#x60; header of a webhook delivery. |
 **reposUpdateWebhookConfigForRepoRequest** | [**ReposUpdateWebhookConfigForRepoRequest**](ReposUpdateWebhookConfigForRepoRequest.md)|  | [optional]

### Return type

[**WebhookConfig**](WebhookConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="reposUploadReleaseAsset"></a>
# **reposUploadReleaseAsset**
> ReleaseAsset reposUploadReleaseAsset(owner, repo, releaseId, name, label, body)

Upload a release asset

This endpoint makes use of a [Hypermedia relation](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#hypermedia) to determine which URL to access. The endpoint you call to upload release assets is specific to your release. Use the &#x60;upload_url&#x60; returned in the response of the [Create a release endpoint](https://docs.github.com/rest/releases/releases#create-a-release) to upload a release asset.  You need to use an HTTP client which supports [SNI](http://en.wikipedia.org/wiki/Server_Name_Indication) to make calls to this endpoint.  Most libraries will set the required &#x60;Content-Length&#x60; header automatically. Use the required &#x60;Content-Type&#x60; header to provide the media type of the asset. For a list of media types, see [Media Types](https://www.iana.org/assignments/media-types/media-types.xhtml). For example:   &#x60;application/zip&#x60;  GitHub expects the asset data in its raw binary form, rather than JSON. You will send the raw binary content of the asset as the request body. Everything else about the endpoint is the same as the rest of the API. For example, you&#39;ll still need to pass your authentication to be able to upload an asset.  When an upstream failure occurs, you will receive a &#x60;502 Bad Gateway&#x60; status. This may leave an empty asset with a state of &#x60;starter&#x60;. It can be safely deleted.  **Notes:** *   GitHub renames asset filenames that have special characters, non-alphanumeric characters, and leading or trailing periods. The \&quot;[List release assets](https://docs.github.com/rest/releases/assets#list-release-assets)\&quot; endpoint lists the renamed filenames. For more information and help, contact [GitHub Support](https://support.github.com/contact?tags&#x3D;dotcom-rest-api). *   To find the &#x60;release_id&#x60; query the [&#x60;GET /repos/{owner}/{repo}/releases/latest&#x60; endpoint](https://docs.github.com/rest/releases/releases#get-the-latest-release).  *   If you upload an asset with the same filename as another uploaded asset, you&#39;ll receive an error and must delete the old file before you can re-upload the new asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReposApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val releaseId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the release.
val name : kotlin.String = name_example // kotlin.String | 
val label : kotlin.String = label_example // kotlin.String | 
val body : java.io.File = @example.zip // java.io.File | 
try {
    val result : ReleaseAsset = apiInstance.reposUploadReleaseAsset(owner, repo, releaseId, name, label, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReposApi#reposUploadReleaseAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReposApi#reposUploadReleaseAsset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **releaseId** | **kotlin.Int**| The unique identifier of the release. |
 **name** | **kotlin.String**|  | [default to &quot;push&quot;]
 **label** | **kotlin.String**|  | [optional] [default to &quot;push&quot;]
 **body** | **java.io.File**|  | [optional]

### Return type

[**ReleaseAsset**](ReleaseAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

