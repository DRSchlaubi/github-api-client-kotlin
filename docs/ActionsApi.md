# ActionsApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionsAddCustomLabelsToSelfHostedRunnerForOrg**](ActionsApi.md#actionsAddCustomLabelsToSelfHostedRunnerForOrg) | **POST** /orgs/{org}/actions/runners/{runner_id}/labels | Add custom labels to a self-hosted runner for an organization
[**actionsAddCustomLabelsToSelfHostedRunnerForRepo**](ActionsApi.md#actionsAddCustomLabelsToSelfHostedRunnerForRepo) | **POST** /repos/{owner}/{repo}/actions/runners/{runner_id}/labels | Add custom labels to a self-hosted runner for a repository
[**actionsAddSelectedRepoToOrgSecret**](ActionsApi.md#actionsAddSelectedRepoToOrgSecret) | **PUT** /orgs/{org}/actions/secrets/{secret_name}/repositories/{repository_id} | Add selected repository to an organization secret
[**actionsAddSelectedRepoToOrgVariable**](ActionsApi.md#actionsAddSelectedRepoToOrgVariable) | **PUT** /orgs/{org}/actions/variables/{name}/repositories/{repository_id} | Add selected repository to an organization variable
[**actionsApproveWorkflowRun**](ActionsApi.md#actionsApproveWorkflowRun) | **POST** /repos/{owner}/{repo}/actions/runs/{run_id}/approve | Approve a workflow run for a fork pull request
[**actionsCancelWorkflowRun**](ActionsApi.md#actionsCancelWorkflowRun) | **POST** /repos/{owner}/{repo}/actions/runs/{run_id}/cancel | Cancel a workflow run
[**actionsCreateEnvironmentVariable**](ActionsApi.md#actionsCreateEnvironmentVariable) | **POST** /repos/{owner}/{repo}/environments/{environment_name}/variables | Create an environment variable
[**actionsCreateOrUpdateEnvironmentSecret**](ActionsApi.md#actionsCreateOrUpdateEnvironmentSecret) | **PUT** /repos/{owner}/{repo}/environments/{environment_name}/secrets/{secret_name} | Create or update an environment secret
[**actionsCreateOrUpdateOrgSecret**](ActionsApi.md#actionsCreateOrUpdateOrgSecret) | **PUT** /orgs/{org}/actions/secrets/{secret_name} | Create or update an organization secret
[**actionsCreateOrUpdateRepoSecret**](ActionsApi.md#actionsCreateOrUpdateRepoSecret) | **PUT** /repos/{owner}/{repo}/actions/secrets/{secret_name} | Create or update a repository secret
[**actionsCreateOrgVariable**](ActionsApi.md#actionsCreateOrgVariable) | **POST** /orgs/{org}/actions/variables | Create an organization variable
[**actionsCreateRegistrationTokenForOrg**](ActionsApi.md#actionsCreateRegistrationTokenForOrg) | **POST** /orgs/{org}/actions/runners/registration-token | Create a registration token for an organization
[**actionsCreateRegistrationTokenForRepo**](ActionsApi.md#actionsCreateRegistrationTokenForRepo) | **POST** /repos/{owner}/{repo}/actions/runners/registration-token | Create a registration token for a repository
[**actionsCreateRemoveTokenForOrg**](ActionsApi.md#actionsCreateRemoveTokenForOrg) | **POST** /orgs/{org}/actions/runners/remove-token | Create a remove token for an organization
[**actionsCreateRemoveTokenForRepo**](ActionsApi.md#actionsCreateRemoveTokenForRepo) | **POST** /repos/{owner}/{repo}/actions/runners/remove-token | Create a remove token for a repository
[**actionsCreateRepoVariable**](ActionsApi.md#actionsCreateRepoVariable) | **POST** /repos/{owner}/{repo}/actions/variables | Create a repository variable
[**actionsCreateWorkflowDispatch**](ActionsApi.md#actionsCreateWorkflowDispatch) | **POST** /repos/{owner}/{repo}/actions/workflows/{workflow_id}/dispatches | Create a workflow dispatch event
[**actionsDeleteActionsCacheById**](ActionsApi.md#actionsDeleteActionsCacheById) | **DELETE** /repos/{owner}/{repo}/actions/caches/{cache_id} | Delete a GitHub Actions cache for a repository (using a cache ID)
[**actionsDeleteActionsCacheByKey**](ActionsApi.md#actionsDeleteActionsCacheByKey) | **DELETE** /repos/{owner}/{repo}/actions/caches | Delete GitHub Actions caches for a repository (using a cache key)
[**actionsDeleteArtifact**](ActionsApi.md#actionsDeleteArtifact) | **DELETE** /repos/{owner}/{repo}/actions/artifacts/{artifact_id} | Delete an artifact
[**actionsDeleteEnvironmentSecret**](ActionsApi.md#actionsDeleteEnvironmentSecret) | **DELETE** /repos/{owner}/{repo}/environments/{environment_name}/secrets/{secret_name} | Delete an environment secret
[**actionsDeleteEnvironmentVariable**](ActionsApi.md#actionsDeleteEnvironmentVariable) | **DELETE** /repos/{owner}/{repo}/environments/{environment_name}/variables/{name} | Delete an environment variable
[**actionsDeleteOrgSecret**](ActionsApi.md#actionsDeleteOrgSecret) | **DELETE** /orgs/{org}/actions/secrets/{secret_name} | Delete an organization secret
[**actionsDeleteOrgVariable**](ActionsApi.md#actionsDeleteOrgVariable) | **DELETE** /orgs/{org}/actions/variables/{name} | Delete an organization variable
[**actionsDeleteRepoSecret**](ActionsApi.md#actionsDeleteRepoSecret) | **DELETE** /repos/{owner}/{repo}/actions/secrets/{secret_name} | Delete a repository secret
[**actionsDeleteRepoVariable**](ActionsApi.md#actionsDeleteRepoVariable) | **DELETE** /repos/{owner}/{repo}/actions/variables/{name} | Delete a repository variable
[**actionsDeleteSelfHostedRunnerFromOrg**](ActionsApi.md#actionsDeleteSelfHostedRunnerFromOrg) | **DELETE** /orgs/{org}/actions/runners/{runner_id} | Delete a self-hosted runner from an organization
[**actionsDeleteSelfHostedRunnerFromRepo**](ActionsApi.md#actionsDeleteSelfHostedRunnerFromRepo) | **DELETE** /repos/{owner}/{repo}/actions/runners/{runner_id} | Delete a self-hosted runner from a repository
[**actionsDeleteWorkflowRun**](ActionsApi.md#actionsDeleteWorkflowRun) | **DELETE** /repos/{owner}/{repo}/actions/runs/{run_id} | Delete a workflow run
[**actionsDeleteWorkflowRunLogs**](ActionsApi.md#actionsDeleteWorkflowRunLogs) | **DELETE** /repos/{owner}/{repo}/actions/runs/{run_id}/logs | Delete workflow run logs
[**actionsDisableSelectedRepositoryGithubActionsOrganization**](ActionsApi.md#actionsDisableSelectedRepositoryGithubActionsOrganization) | **DELETE** /orgs/{org}/actions/permissions/repositories/{repository_id} | Disable a selected repository for GitHub Actions in an organization
[**actionsDisableWorkflow**](ActionsApi.md#actionsDisableWorkflow) | **PUT** /repos/{owner}/{repo}/actions/workflows/{workflow_id}/disable | Disable a workflow
[**actionsDownloadArtifact**](ActionsApi.md#actionsDownloadArtifact) | **GET** /repos/{owner}/{repo}/actions/artifacts/{artifact_id}/{archive_format} | Download an artifact
[**actionsDownloadJobLogsForWorkflowRun**](ActionsApi.md#actionsDownloadJobLogsForWorkflowRun) | **GET** /repos/{owner}/{repo}/actions/jobs/{job_id}/logs | Download job logs for a workflow run
[**actionsDownloadWorkflowRunAttemptLogs**](ActionsApi.md#actionsDownloadWorkflowRunAttemptLogs) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}/logs | Download workflow run attempt logs
[**actionsDownloadWorkflowRunLogs**](ActionsApi.md#actionsDownloadWorkflowRunLogs) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/logs | Download workflow run logs
[**actionsEnableSelectedRepositoryGithubActionsOrganization**](ActionsApi.md#actionsEnableSelectedRepositoryGithubActionsOrganization) | **PUT** /orgs/{org}/actions/permissions/repositories/{repository_id} | Enable a selected repository for GitHub Actions in an organization
[**actionsEnableWorkflow**](ActionsApi.md#actionsEnableWorkflow) | **PUT** /repos/{owner}/{repo}/actions/workflows/{workflow_id}/enable | Enable a workflow
[**actionsForceCancelWorkflowRun**](ActionsApi.md#actionsForceCancelWorkflowRun) | **POST** /repos/{owner}/{repo}/actions/runs/{run_id}/force-cancel | Force cancel a workflow run
[**actionsGenerateRunnerJitconfigForOrg**](ActionsApi.md#actionsGenerateRunnerJitconfigForOrg) | **POST** /orgs/{org}/actions/runners/generate-jitconfig | Create configuration for a just-in-time runner for an organization
[**actionsGenerateRunnerJitconfigForRepo**](ActionsApi.md#actionsGenerateRunnerJitconfigForRepo) | **POST** /repos/{owner}/{repo}/actions/runners/generate-jitconfig | Create configuration for a just-in-time runner for a repository
[**actionsGetActionsCacheList**](ActionsApi.md#actionsGetActionsCacheList) | **GET** /repos/{owner}/{repo}/actions/caches | List GitHub Actions caches for a repository
[**actionsGetActionsCacheUsage**](ActionsApi.md#actionsGetActionsCacheUsage) | **GET** /repos/{owner}/{repo}/actions/cache/usage | Get GitHub Actions cache usage for a repository
[**actionsGetActionsCacheUsageByRepoForOrg**](ActionsApi.md#actionsGetActionsCacheUsageByRepoForOrg) | **GET** /orgs/{org}/actions/cache/usage-by-repository | List repositories with GitHub Actions cache usage for an organization
[**actionsGetActionsCacheUsageForOrg**](ActionsApi.md#actionsGetActionsCacheUsageForOrg) | **GET** /orgs/{org}/actions/cache/usage | Get GitHub Actions cache usage for an organization
[**actionsGetAllowedActionsOrganization**](ActionsApi.md#actionsGetAllowedActionsOrganization) | **GET** /orgs/{org}/actions/permissions/selected-actions | Get allowed actions and reusable workflows for an organization
[**actionsGetAllowedActionsRepository**](ActionsApi.md#actionsGetAllowedActionsRepository) | **GET** /repos/{owner}/{repo}/actions/permissions/selected-actions | Get allowed actions and reusable workflows for a repository
[**actionsGetArtifact**](ActionsApi.md#actionsGetArtifact) | **GET** /repos/{owner}/{repo}/actions/artifacts/{artifact_id} | Get an artifact
[**actionsGetCustomOidcSubClaimForRepo**](ActionsApi.md#actionsGetCustomOidcSubClaimForRepo) | **GET** /repos/{owner}/{repo}/actions/oidc/customization/sub | Get the customization template for an OIDC subject claim for a repository
[**actionsGetEnvironmentPublicKey**](ActionsApi.md#actionsGetEnvironmentPublicKey) | **GET** /repos/{owner}/{repo}/environments/{environment_name}/secrets/public-key | Get an environment public key
[**actionsGetEnvironmentSecret**](ActionsApi.md#actionsGetEnvironmentSecret) | **GET** /repos/{owner}/{repo}/environments/{environment_name}/secrets/{secret_name} | Get an environment secret
[**actionsGetEnvironmentVariable**](ActionsApi.md#actionsGetEnvironmentVariable) | **GET** /repos/{owner}/{repo}/environments/{environment_name}/variables/{name} | Get an environment variable
[**actionsGetGithubActionsDefaultWorkflowPermissionsOrganization**](ActionsApi.md#actionsGetGithubActionsDefaultWorkflowPermissionsOrganization) | **GET** /orgs/{org}/actions/permissions/workflow | Get default workflow permissions for an organization
[**actionsGetGithubActionsDefaultWorkflowPermissionsRepository**](ActionsApi.md#actionsGetGithubActionsDefaultWorkflowPermissionsRepository) | **GET** /repos/{owner}/{repo}/actions/permissions/workflow | Get default workflow permissions for a repository
[**actionsGetGithubActionsPermissionsOrganization**](ActionsApi.md#actionsGetGithubActionsPermissionsOrganization) | **GET** /orgs/{org}/actions/permissions | Get GitHub Actions permissions for an organization
[**actionsGetGithubActionsPermissionsRepository**](ActionsApi.md#actionsGetGithubActionsPermissionsRepository) | **GET** /repos/{owner}/{repo}/actions/permissions | Get GitHub Actions permissions for a repository
[**actionsGetJobForWorkflowRun**](ActionsApi.md#actionsGetJobForWorkflowRun) | **GET** /repos/{owner}/{repo}/actions/jobs/{job_id} | Get a job for a workflow run
[**actionsGetOrgPublicKey**](ActionsApi.md#actionsGetOrgPublicKey) | **GET** /orgs/{org}/actions/secrets/public-key | Get an organization public key
[**actionsGetOrgSecret**](ActionsApi.md#actionsGetOrgSecret) | **GET** /orgs/{org}/actions/secrets/{secret_name} | Get an organization secret
[**actionsGetOrgVariable**](ActionsApi.md#actionsGetOrgVariable) | **GET** /orgs/{org}/actions/variables/{name} | Get an organization variable
[**actionsGetPendingDeploymentsForRun**](ActionsApi.md#actionsGetPendingDeploymentsForRun) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/pending_deployments | Get pending deployments for a workflow run
[**actionsGetRepoPublicKey**](ActionsApi.md#actionsGetRepoPublicKey) | **GET** /repos/{owner}/{repo}/actions/secrets/public-key | Get a repository public key
[**actionsGetRepoSecret**](ActionsApi.md#actionsGetRepoSecret) | **GET** /repos/{owner}/{repo}/actions/secrets/{secret_name} | Get a repository secret
[**actionsGetRepoVariable**](ActionsApi.md#actionsGetRepoVariable) | **GET** /repos/{owner}/{repo}/actions/variables/{name} | Get a repository variable
[**actionsGetReviewsForRun**](ActionsApi.md#actionsGetReviewsForRun) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/approvals | Get the review history for a workflow run
[**actionsGetSelfHostedRunnerForOrg**](ActionsApi.md#actionsGetSelfHostedRunnerForOrg) | **GET** /orgs/{org}/actions/runners/{runner_id} | Get a self-hosted runner for an organization
[**actionsGetSelfHostedRunnerForRepo**](ActionsApi.md#actionsGetSelfHostedRunnerForRepo) | **GET** /repos/{owner}/{repo}/actions/runners/{runner_id} | Get a self-hosted runner for a repository
[**actionsGetWorkflow**](ActionsApi.md#actionsGetWorkflow) | **GET** /repos/{owner}/{repo}/actions/workflows/{workflow_id} | Get a workflow
[**actionsGetWorkflowAccessToRepository**](ActionsApi.md#actionsGetWorkflowAccessToRepository) | **GET** /repos/{owner}/{repo}/actions/permissions/access | Get the level of access for workflows outside of the repository
[**actionsGetWorkflowRun**](ActionsApi.md#actionsGetWorkflowRun) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id} | Get a workflow run
[**actionsGetWorkflowRunAttempt**](ActionsApi.md#actionsGetWorkflowRunAttempt) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number} | Get a workflow run attempt
[**actionsGetWorkflowRunUsage**](ActionsApi.md#actionsGetWorkflowRunUsage) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/timing | Get workflow run usage
[**actionsGetWorkflowUsage**](ActionsApi.md#actionsGetWorkflowUsage) | **GET** /repos/{owner}/{repo}/actions/workflows/{workflow_id}/timing | Get workflow usage
[**actionsListArtifactsForRepo**](ActionsApi.md#actionsListArtifactsForRepo) | **GET** /repos/{owner}/{repo}/actions/artifacts | List artifacts for a repository
[**actionsListEnvironmentSecrets**](ActionsApi.md#actionsListEnvironmentSecrets) | **GET** /repos/{owner}/{repo}/environments/{environment_name}/secrets | List environment secrets
[**actionsListEnvironmentVariables**](ActionsApi.md#actionsListEnvironmentVariables) | **GET** /repos/{owner}/{repo}/environments/{environment_name}/variables | List environment variables
[**actionsListJobsForWorkflowRun**](ActionsApi.md#actionsListJobsForWorkflowRun) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/jobs | List jobs for a workflow run
[**actionsListJobsForWorkflowRunAttempt**](ActionsApi.md#actionsListJobsForWorkflowRunAttempt) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}/jobs | List jobs for a workflow run attempt
[**actionsListLabelsForSelfHostedRunnerForOrg**](ActionsApi.md#actionsListLabelsForSelfHostedRunnerForOrg) | **GET** /orgs/{org}/actions/runners/{runner_id}/labels | List labels for a self-hosted runner for an organization
[**actionsListLabelsForSelfHostedRunnerForRepo**](ActionsApi.md#actionsListLabelsForSelfHostedRunnerForRepo) | **GET** /repos/{owner}/{repo}/actions/runners/{runner_id}/labels | List labels for a self-hosted runner for a repository
[**actionsListOrgSecrets**](ActionsApi.md#actionsListOrgSecrets) | **GET** /orgs/{org}/actions/secrets | List organization secrets
[**actionsListOrgVariables**](ActionsApi.md#actionsListOrgVariables) | **GET** /orgs/{org}/actions/variables | List organization variables
[**actionsListRepoOrganizationSecrets**](ActionsApi.md#actionsListRepoOrganizationSecrets) | **GET** /repos/{owner}/{repo}/actions/organization-secrets | List repository organization secrets
[**actionsListRepoOrganizationVariables**](ActionsApi.md#actionsListRepoOrganizationVariables) | **GET** /repos/{owner}/{repo}/actions/organization-variables | List repository organization variables
[**actionsListRepoSecrets**](ActionsApi.md#actionsListRepoSecrets) | **GET** /repos/{owner}/{repo}/actions/secrets | List repository secrets
[**actionsListRepoVariables**](ActionsApi.md#actionsListRepoVariables) | **GET** /repos/{owner}/{repo}/actions/variables | List repository variables
[**actionsListRepoWorkflows**](ActionsApi.md#actionsListRepoWorkflows) | **GET** /repos/{owner}/{repo}/actions/workflows | List repository workflows
[**actionsListRunnerApplicationsForOrg**](ActionsApi.md#actionsListRunnerApplicationsForOrg) | **GET** /orgs/{org}/actions/runners/downloads | List runner applications for an organization
[**actionsListRunnerApplicationsForRepo**](ActionsApi.md#actionsListRunnerApplicationsForRepo) | **GET** /repos/{owner}/{repo}/actions/runners/downloads | List runner applications for a repository
[**actionsListSelectedReposForOrgSecret**](ActionsApi.md#actionsListSelectedReposForOrgSecret) | **GET** /orgs/{org}/actions/secrets/{secret_name}/repositories | List selected repositories for an organization secret
[**actionsListSelectedReposForOrgVariable**](ActionsApi.md#actionsListSelectedReposForOrgVariable) | **GET** /orgs/{org}/actions/variables/{name}/repositories | List selected repositories for an organization variable
[**actionsListSelectedRepositoriesEnabledGithubActionsOrganization**](ActionsApi.md#actionsListSelectedRepositoriesEnabledGithubActionsOrganization) | **GET** /orgs/{org}/actions/permissions/repositories | List selected repositories enabled for GitHub Actions in an organization
[**actionsListSelfHostedRunnersForOrg**](ActionsApi.md#actionsListSelfHostedRunnersForOrg) | **GET** /orgs/{org}/actions/runners | List self-hosted runners for an organization
[**actionsListSelfHostedRunnersForRepo**](ActionsApi.md#actionsListSelfHostedRunnersForRepo) | **GET** /repos/{owner}/{repo}/actions/runners | List self-hosted runners for a repository
[**actionsListWorkflowRunArtifacts**](ActionsApi.md#actionsListWorkflowRunArtifacts) | **GET** /repos/{owner}/{repo}/actions/runs/{run_id}/artifacts | List workflow run artifacts
[**actionsListWorkflowRuns**](ActionsApi.md#actionsListWorkflowRuns) | **GET** /repos/{owner}/{repo}/actions/workflows/{workflow_id}/runs | List workflow runs for a workflow
[**actionsListWorkflowRunsForRepo**](ActionsApi.md#actionsListWorkflowRunsForRepo) | **GET** /repos/{owner}/{repo}/actions/runs | List workflow runs for a repository
[**actionsReRunJobForWorkflowRun**](ActionsApi.md#actionsReRunJobForWorkflowRun) | **POST** /repos/{owner}/{repo}/actions/jobs/{job_id}/rerun | Re-run a job from a workflow run
[**actionsReRunWorkflow**](ActionsApi.md#actionsReRunWorkflow) | **POST** /repos/{owner}/{repo}/actions/runs/{run_id}/rerun | Re-run a workflow
[**actionsReRunWorkflowFailedJobs**](ActionsApi.md#actionsReRunWorkflowFailedJobs) | **POST** /repos/{owner}/{repo}/actions/runs/{run_id}/rerun-failed-jobs | Re-run failed jobs from a workflow run
[**actionsRemoveAllCustomLabelsFromSelfHostedRunnerForOrg**](ActionsApi.md#actionsRemoveAllCustomLabelsFromSelfHostedRunnerForOrg) | **DELETE** /orgs/{org}/actions/runners/{runner_id}/labels | Remove all custom labels from a self-hosted runner for an organization
[**actionsRemoveAllCustomLabelsFromSelfHostedRunnerForRepo**](ActionsApi.md#actionsRemoveAllCustomLabelsFromSelfHostedRunnerForRepo) | **DELETE** /repos/{owner}/{repo}/actions/runners/{runner_id}/labels | Remove all custom labels from a self-hosted runner for a repository
[**actionsRemoveCustomLabelFromSelfHostedRunnerForOrg**](ActionsApi.md#actionsRemoveCustomLabelFromSelfHostedRunnerForOrg) | **DELETE** /orgs/{org}/actions/runners/{runner_id}/labels/{name} | Remove a custom label from a self-hosted runner for an organization
[**actionsRemoveCustomLabelFromSelfHostedRunnerForRepo**](ActionsApi.md#actionsRemoveCustomLabelFromSelfHostedRunnerForRepo) | **DELETE** /repos/{owner}/{repo}/actions/runners/{runner_id}/labels/{name} | Remove a custom label from a self-hosted runner for a repository
[**actionsRemoveSelectedRepoFromOrgSecret**](ActionsApi.md#actionsRemoveSelectedRepoFromOrgSecret) | **DELETE** /orgs/{org}/actions/secrets/{secret_name}/repositories/{repository_id} | Remove selected repository from an organization secret
[**actionsRemoveSelectedRepoFromOrgVariable**](ActionsApi.md#actionsRemoveSelectedRepoFromOrgVariable) | **DELETE** /orgs/{org}/actions/variables/{name}/repositories/{repository_id} | Remove selected repository from an organization variable
[**actionsReviewCustomGatesForRun**](ActionsApi.md#actionsReviewCustomGatesForRun) | **POST** /repos/{owner}/{repo}/actions/runs/{run_id}/deployment_protection_rule | Review custom deployment protection rules for a workflow run
[**actionsReviewPendingDeploymentsForRun**](ActionsApi.md#actionsReviewPendingDeploymentsForRun) | **POST** /repos/{owner}/{repo}/actions/runs/{run_id}/pending_deployments | Review pending deployments for a workflow run
[**actionsSetAllowedActionsOrganization**](ActionsApi.md#actionsSetAllowedActionsOrganization) | **PUT** /orgs/{org}/actions/permissions/selected-actions | Set allowed actions and reusable workflows for an organization
[**actionsSetAllowedActionsRepository**](ActionsApi.md#actionsSetAllowedActionsRepository) | **PUT** /repos/{owner}/{repo}/actions/permissions/selected-actions | Set allowed actions and reusable workflows for a repository
[**actionsSetCustomLabelsForSelfHostedRunnerForOrg**](ActionsApi.md#actionsSetCustomLabelsForSelfHostedRunnerForOrg) | **PUT** /orgs/{org}/actions/runners/{runner_id}/labels | Set custom labels for a self-hosted runner for an organization
[**actionsSetCustomLabelsForSelfHostedRunnerForRepo**](ActionsApi.md#actionsSetCustomLabelsForSelfHostedRunnerForRepo) | **PUT** /repos/{owner}/{repo}/actions/runners/{runner_id}/labels | Set custom labels for a self-hosted runner for a repository
[**actionsSetCustomOidcSubClaimForRepo**](ActionsApi.md#actionsSetCustomOidcSubClaimForRepo) | **PUT** /repos/{owner}/{repo}/actions/oidc/customization/sub | Set the customization template for an OIDC subject claim for a repository
[**actionsSetGithubActionsDefaultWorkflowPermissionsOrganization**](ActionsApi.md#actionsSetGithubActionsDefaultWorkflowPermissionsOrganization) | **PUT** /orgs/{org}/actions/permissions/workflow | Set default workflow permissions for an organization
[**actionsSetGithubActionsDefaultWorkflowPermissionsRepository**](ActionsApi.md#actionsSetGithubActionsDefaultWorkflowPermissionsRepository) | **PUT** /repos/{owner}/{repo}/actions/permissions/workflow | Set default workflow permissions for a repository
[**actionsSetGithubActionsPermissionsOrganization**](ActionsApi.md#actionsSetGithubActionsPermissionsOrganization) | **PUT** /orgs/{org}/actions/permissions | Set GitHub Actions permissions for an organization
[**actionsSetGithubActionsPermissionsRepository**](ActionsApi.md#actionsSetGithubActionsPermissionsRepository) | **PUT** /repos/{owner}/{repo}/actions/permissions | Set GitHub Actions permissions for a repository
[**actionsSetSelectedReposForOrgSecret**](ActionsApi.md#actionsSetSelectedReposForOrgSecret) | **PUT** /orgs/{org}/actions/secrets/{secret_name}/repositories | Set selected repositories for an organization secret
[**actionsSetSelectedReposForOrgVariable**](ActionsApi.md#actionsSetSelectedReposForOrgVariable) | **PUT** /orgs/{org}/actions/variables/{name}/repositories | Set selected repositories for an organization variable
[**actionsSetSelectedRepositoriesEnabledGithubActionsOrganization**](ActionsApi.md#actionsSetSelectedRepositoriesEnabledGithubActionsOrganization) | **PUT** /orgs/{org}/actions/permissions/repositories | Set selected repositories enabled for GitHub Actions in an organization
[**actionsSetWorkflowAccessToRepository**](ActionsApi.md#actionsSetWorkflowAccessToRepository) | **PUT** /repos/{owner}/{repo}/actions/permissions/access | Set the level of access for workflows outside of the repository
[**actionsUpdateEnvironmentVariable**](ActionsApi.md#actionsUpdateEnvironmentVariable) | **PATCH** /repos/{owner}/{repo}/environments/{environment_name}/variables/{name} | Update an environment variable
[**actionsUpdateOrgVariable**](ActionsApi.md#actionsUpdateOrgVariable) | **PATCH** /orgs/{org}/actions/variables/{name} | Update an organization variable
[**actionsUpdateRepoVariable**](ActionsApi.md#actionsUpdateRepoVariable) | **PATCH** /repos/{owner}/{repo}/actions/variables/{name} | Update a repository variable


<a id="actionsAddCustomLabelsToSelfHostedRunnerForOrg"></a>
# **actionsAddCustomLabelsToSelfHostedRunnerForOrg**
> kotlin.Any actionsAddCustomLabelsToSelfHostedRunnerForOrg(org, runnerId, actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest)

Add custom labels to a self-hosted runner for an organization

Adds custom labels to a self-hosted runner configured in an organization.  Authenticated users must have admin access to the organization to use this endpoint.  OAuth tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val runnerId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the self-hosted runner.
val actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest : ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest = {labels=[gpu, accelerated]} // ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest | 
try {
    val result : kotlin.Any = apiInstance.actionsAddCustomLabelsToSelfHostedRunnerForOrg(org, runnerId, actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsAddCustomLabelsToSelfHostedRunnerForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsAddCustomLabelsToSelfHostedRunnerForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **runnerId** | **kotlin.Int**| Unique identifier of the self-hosted runner. |
 **actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest** | [**ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest**](ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="actionsAddCustomLabelsToSelfHostedRunnerForRepo"></a>
# **actionsAddCustomLabelsToSelfHostedRunnerForRepo**
> kotlin.Any actionsAddCustomLabelsToSelfHostedRunnerForRepo(owner, repo, runnerId, actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest)

Add custom labels to a self-hosted runner for a repository

Adds custom labels to a self-hosted runner configured in a repository.  Authenticated users must have admin access to the organization to use this endpoint.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runnerId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the self-hosted runner.
val actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest : ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest = {labels=[gpu, accelerated]} // ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest | 
try {
    val result : kotlin.Any = apiInstance.actionsAddCustomLabelsToSelfHostedRunnerForRepo(owner, repo, runnerId, actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsAddCustomLabelsToSelfHostedRunnerForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsAddCustomLabelsToSelfHostedRunnerForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runnerId** | **kotlin.Int**| Unique identifier of the self-hosted runner. |
 **actionsAddCustomLabelsToSelfHostedRunnerForOrgRequest** | [**ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest**](ActionsAddCustomLabelsToSelfHostedRunnerForOrgRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="actionsAddSelectedRepoToOrgSecret"></a>
# **actionsAddSelectedRepoToOrgSecret**
> actionsAddSelectedRepoToOrgSecret(org, secretName, repositoryId)

Add selected repository to an organization secret

Adds a repository to an organization secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. For more information about setting the visibility, see [Create or update an organization secret](https://docs.github.com/rest/actions/secrets#create-or-update-an-organization-secret).  Authenticated users must have collaborator access to a repository to create, update, or read secrets.  OAuth tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val repositoryId : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.actionsAddSelectedRepoToOrgSecret(org, secretName, repositoryId)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsAddSelectedRepoToOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsAddSelectedRepoToOrgSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |
 **repositoryId** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsAddSelectedRepoToOrgVariable"></a>
# **actionsAddSelectedRepoToOrgVariable**
> actionsAddSelectedRepoToOrgVariable(org, name, repositoryId)

Add selected repository to an organization variable

Adds a repository to an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their &#x60;visibility&#x60; field set to &#x60;selected&#x60;.  Authenticated users must have collaborator access to a repository to create, update, or read secrets.  OAuth tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val name : kotlin.String = name_example // kotlin.String | The name of the variable.
val repositoryId : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.actionsAddSelectedRepoToOrgVariable(org, name, repositoryId)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsAddSelectedRepoToOrgVariable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsAddSelectedRepoToOrgVariable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **name** | **kotlin.String**| The name of the variable. |
 **repositoryId** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsApproveWorkflowRun"></a>
# **actionsApproveWorkflowRun**
> kotlin.Any actionsApproveWorkflowRun(owner, repo, runId)

Approve a workflow run for a fork pull request

Approves a workflow run for a pull request from a public fork of a first time contributor. For more information, see [\&quot;Approving workflow runs from public forks](https://docs.github.com/actions/managing-workflow-runs/approving-workflow-runs-from-public-forks).\&quot;  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
try {
    val result : kotlin.Any = apiInstance.actionsApproveWorkflowRun(owner, repo, runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsApproveWorkflowRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsApproveWorkflowRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsCancelWorkflowRun"></a>
# **actionsCancelWorkflowRun**
> kotlin.Any actionsCancelWorkflowRun(owner, repo, runId)

Cancel a workflow run

Cancels a workflow run using its &#x60;id&#x60;.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
try {
    val result : kotlin.Any = apiInstance.actionsCancelWorkflowRun(owner, repo, runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsCancelWorkflowRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsCancelWorkflowRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsCreateEnvironmentVariable"></a>
# **actionsCreateEnvironmentVariable**
> kotlin.Any actionsCreateEnvironmentVariable(owner, repo, environmentName, actionsCreateRepoVariableRequest)

Create an environment variable

Create an environment variable that you can reference in a GitHub Actions workflow.  Authenticated users must have collaborator access to a repository to create, update, or read variables.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val actionsCreateRepoVariableRequest : ActionsCreateRepoVariableRequest = {name=USERNAME, value=octocat} // ActionsCreateRepoVariableRequest | 
try {
    val result : kotlin.Any = apiInstance.actionsCreateEnvironmentVariable(owner, repo, environmentName, actionsCreateRepoVariableRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsCreateEnvironmentVariable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsCreateEnvironmentVariable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **actionsCreateRepoVariableRequest** | [**ActionsCreateRepoVariableRequest**](ActionsCreateRepoVariableRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="actionsCreateOrUpdateEnvironmentSecret"></a>
# **actionsCreateOrUpdateEnvironmentSecret**
> kotlin.Any actionsCreateOrUpdateEnvironmentSecret(owner, repo, environmentName, secretName, actionsCreateOrUpdateEnvironmentSecretRequest)

Create or update an environment secret

Creates or updates an environment secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see \&quot;[Encrypting secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api).\&quot;  Authenticated users must have collaborator access to a repository to create, update, or read secrets.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val actionsCreateOrUpdateEnvironmentSecretRequest : ActionsCreateOrUpdateEnvironmentSecretRequest = {encrypted_value=c2VjcmV0, key_id=012345678912345678} // ActionsCreateOrUpdateEnvironmentSecretRequest | 
try {
    val result : kotlin.Any = apiInstance.actionsCreateOrUpdateEnvironmentSecret(owner, repo, environmentName, secretName, actionsCreateOrUpdateEnvironmentSecretRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsCreateOrUpdateEnvironmentSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsCreateOrUpdateEnvironmentSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **secretName** | **kotlin.String**| The name of the secret. |
 **actionsCreateOrUpdateEnvironmentSecretRequest** | [**ActionsCreateOrUpdateEnvironmentSecretRequest**](ActionsCreateOrUpdateEnvironmentSecretRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="actionsCreateOrUpdateOrgSecret"></a>
# **actionsCreateOrUpdateOrgSecret**
> kotlin.Any actionsCreateOrUpdateOrgSecret(org, secretName, actionsCreateOrUpdateOrgSecretRequest)

Create or update an organization secret

Creates or updates an organization secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see \&quot;[Encrypting secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api).\&quot;  Authenticated users must have collaborator access to a repository to create, update, or read secrets.  OAuth tokens and personal access tokens (classic) need the&#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val actionsCreateOrUpdateOrgSecretRequest : ActionsCreateOrUpdateOrgSecretRequest = {"encrypted_value":"c2VjcmV0","key_id":"012345678912345678","visibility":"selected","selected_repository_ids":[1296269,1296280]} // ActionsCreateOrUpdateOrgSecretRequest | 
try {
    val result : kotlin.Any = apiInstance.actionsCreateOrUpdateOrgSecret(org, secretName, actionsCreateOrUpdateOrgSecretRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsCreateOrUpdateOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsCreateOrUpdateOrgSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |
 **actionsCreateOrUpdateOrgSecretRequest** | [**ActionsCreateOrUpdateOrgSecretRequest**](ActionsCreateOrUpdateOrgSecretRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="actionsCreateOrUpdateRepoSecret"></a>
# **actionsCreateOrUpdateRepoSecret**
> kotlin.Any actionsCreateOrUpdateRepoSecret(owner, repo, secretName, actionsCreateOrUpdateRepoSecretRequest)

Create or update a repository secret

Creates or updates a repository secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see \&quot;[Encrypting secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api).\&quot;  Authenticated users must have collaborator access to a repository to create, update, or read secrets.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val actionsCreateOrUpdateRepoSecretRequest : ActionsCreateOrUpdateRepoSecretRequest = {"encrypted_value":"c2VjcmV0","key_id":"012345678912345678"} // ActionsCreateOrUpdateRepoSecretRequest | 
try {
    val result : kotlin.Any = apiInstance.actionsCreateOrUpdateRepoSecret(owner, repo, secretName, actionsCreateOrUpdateRepoSecretRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsCreateOrUpdateRepoSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsCreateOrUpdateRepoSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |
 **actionsCreateOrUpdateRepoSecretRequest** | [**ActionsCreateOrUpdateRepoSecretRequest**](ActionsCreateOrUpdateRepoSecretRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="actionsCreateOrgVariable"></a>
# **actionsCreateOrgVariable**
> kotlin.Any actionsCreateOrgVariable(org, actionsCreateOrgVariableRequest)

Create an organization variable

Creates an organization variable that you can reference in a GitHub Actions workflow.  Authenticated users must have collaborator access to a repository to create, update, or read variables.  OAuth tokens and personal access tokens (classic) need the&#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val actionsCreateOrgVariableRequest : ActionsCreateOrgVariableRequest = {"name":"USERNAME","value":"octocat","visibility":"selected","selected_repository_ids":[1296269,1296280]} // ActionsCreateOrgVariableRequest | 
try {
    val result : kotlin.Any = apiInstance.actionsCreateOrgVariable(org, actionsCreateOrgVariableRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsCreateOrgVariable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsCreateOrgVariable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **actionsCreateOrgVariableRequest** | [**ActionsCreateOrgVariableRequest**](ActionsCreateOrgVariableRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="actionsCreateRegistrationTokenForOrg"></a>
# **actionsCreateRegistrationTokenForOrg**
> AuthenticationToken actionsCreateRegistrationTokenForOrg(org)

Create a registration token for an organization

Returns a token that you can pass to the &#x60;config&#x60; script. The token expires after one hour.  For example, you can replace &#x60;TOKEN&#x60; in the following example with the registration token provided by this endpoint to configure your self-hosted runner:  &#x60;&#x60;&#x60; ./config.sh --url https://github.com/octo-org --token TOKEN &#x60;&#x60;&#x60;  Authenticated users must have admin access to the organization to use this endpoint.  OAuth tokens and personal access tokens (classic) need the&#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : AuthenticationToken = apiInstance.actionsCreateRegistrationTokenForOrg(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsCreateRegistrationTokenForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsCreateRegistrationTokenForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**AuthenticationToken**](AuthenticationToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsCreateRegistrationTokenForRepo"></a>
# **actionsCreateRegistrationTokenForRepo**
> AuthenticationToken actionsCreateRegistrationTokenForRepo(owner, repo)

Create a registration token for a repository

Returns a token that you can pass to the &#x60;config&#x60; script. The token expires after one hour.  For example, you can replace &#x60;TOKEN&#x60; in the following example with the registration token provided by this endpoint to configure your self-hosted runner:  &#x60;&#x60;&#x60; ./config.sh --url https://github.com/octo-org --token TOKEN &#x60;&#x60;&#x60;  Authenticated users must have admin access to the repository to use this endpoint.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : AuthenticationToken = apiInstance.actionsCreateRegistrationTokenForRepo(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsCreateRegistrationTokenForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsCreateRegistrationTokenForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**AuthenticationToken**](AuthenticationToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsCreateRemoveTokenForOrg"></a>
# **actionsCreateRemoveTokenForOrg**
> AuthenticationToken actionsCreateRemoveTokenForOrg(org)

Create a remove token for an organization

Returns a token that you can pass to the &#x60;config&#x60; script to remove a self-hosted runner from an organization. The token expires after one hour.  For example, you can replace &#x60;TOKEN&#x60; in the following example with the registration token provided by this endpoint to remove your self-hosted runner from an organization:  &#x60;&#x60;&#x60; ./config.sh remove --token TOKEN &#x60;&#x60;&#x60;  Authenticated users must have admin access to the organization to use this endpoint.  OAuth tokens and personal access tokens (classic) need the&#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : AuthenticationToken = apiInstance.actionsCreateRemoveTokenForOrg(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsCreateRemoveTokenForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsCreateRemoveTokenForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**AuthenticationToken**](AuthenticationToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsCreateRemoveTokenForRepo"></a>
# **actionsCreateRemoveTokenForRepo**
> AuthenticationToken actionsCreateRemoveTokenForRepo(owner, repo)

Create a remove token for a repository

Returns a token that you can pass to the &#x60;config&#x60; script to remove a self-hosted runner from an repository. The token expires after one hour.  For example, you can replace &#x60;TOKEN&#x60; in the following example with the registration token provided by this endpoint to remove your self-hosted runner from an organization:  &#x60;&#x60;&#x60; ./config.sh remove --token TOKEN &#x60;&#x60;&#x60;  Authenticated users must have admin access to the repository to use this endpoint.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : AuthenticationToken = apiInstance.actionsCreateRemoveTokenForRepo(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsCreateRemoveTokenForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsCreateRemoveTokenForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**AuthenticationToken**](AuthenticationToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsCreateRepoVariable"></a>
# **actionsCreateRepoVariable**
> kotlin.Any actionsCreateRepoVariable(owner, repo, actionsCreateRepoVariableRequest)

Create a repository variable

Creates a repository variable that you can reference in a GitHub Actions workflow.  Authenticated users must have collaborator access to a repository to create, update, or read variables.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val actionsCreateRepoVariableRequest : ActionsCreateRepoVariableRequest = {"name":"USERNAME","value":"octocat"} // ActionsCreateRepoVariableRequest | 
try {
    val result : kotlin.Any = apiInstance.actionsCreateRepoVariable(owner, repo, actionsCreateRepoVariableRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsCreateRepoVariable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsCreateRepoVariable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **actionsCreateRepoVariableRequest** | [**ActionsCreateRepoVariableRequest**](ActionsCreateRepoVariableRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="actionsCreateWorkflowDispatch"></a>
# **actionsCreateWorkflowDispatch**
> actionsCreateWorkflowDispatch(owner, repo, workflowId, actionsCreateWorkflowDispatchRequest)

Create a workflow dispatch event

You can use this endpoint to manually trigger a GitHub Actions workflow run. You can replace &#x60;workflow_id&#x60; with the workflow file name. For example, you could use &#x60;main.yaml&#x60;.  You must configure your GitHub Actions workflow to run when the [&#x60;workflow_dispatch&#x60; webhook](/developers/webhooks-and-events/webhook-events-and-payloads#workflow_dispatch) event occurs. The &#x60;inputs&#x60; are configured in the workflow file. For more information about how to configure the &#x60;workflow_dispatch&#x60; event in the workflow file, see \&quot;[Events that trigger workflows](/actions/reference/events-that-trigger-workflows#workflow_dispatch).\&quot;  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val workflowId : String =  // String | The ID of the workflow. You can also pass the workflow file name as a string.
val actionsCreateWorkflowDispatchRequest : ActionsCreateWorkflowDispatchRequest = {"ref":"topic-branch","inputs":{"name":"Mona the Octocat","home":"San Francisco, CA"}} // ActionsCreateWorkflowDispatchRequest | 
try {
    apiInstance.actionsCreateWorkflowDispatch(owner, repo, workflowId, actionsCreateWorkflowDispatchRequest)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsCreateWorkflowDispatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsCreateWorkflowDispatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **workflowId** | [**String**](.md)| The ID of the workflow. You can also pass the workflow file name as a string. |
 **actionsCreateWorkflowDispatchRequest** | [**ActionsCreateWorkflowDispatchRequest**](ActionsCreateWorkflowDispatchRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="actionsDeleteActionsCacheById"></a>
# **actionsDeleteActionsCacheById**
> actionsDeleteActionsCacheById(owner, repo, cacheId)

Delete a GitHub Actions cache for a repository (using a cache ID)

Deletes a GitHub Actions cache for a repository, using a cache ID.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val cacheId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the GitHub Actions cache.
try {
    apiInstance.actionsDeleteActionsCacheById(owner, repo, cacheId)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDeleteActionsCacheById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDeleteActionsCacheById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **cacheId** | **kotlin.Int**| The unique identifier of the GitHub Actions cache. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsDeleteActionsCacheByKey"></a>
# **actionsDeleteActionsCacheByKey**
> ActionsCacheList actionsDeleteActionsCacheByKey(owner, repo, key, ref)

Delete GitHub Actions caches for a repository (using a cache key)

Deletes one or more GitHub Actions caches for a repository, using a complete cache key. By default, all caches that match the provided key are deleted, but you can optionally provide a Git ref to restrict deletions to caches that match both the provided key and the Git ref.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val key : kotlin.String = key_example // kotlin.String | A key for identifying the cache.
val ref : kotlin.String = ref_example // kotlin.String | The full Git reference for narrowing down the cache. The `ref` for a branch should be formatted as `refs/heads/<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
try {
    val result : ActionsCacheList = apiInstance.actionsDeleteActionsCacheByKey(owner, repo, key, ref)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDeleteActionsCacheByKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDeleteActionsCacheByKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **key** | **kotlin.String**| A key for identifying the cache. |
 **ref** | **kotlin.String**| The full Git reference for narrowing down the cache. The &#x60;ref&#x60; for a branch should be formatted as &#x60;refs/heads/&lt;branch name&gt;&#x60;. To reference a pull request use &#x60;refs/pull/&lt;number&gt;/merge&#x60;. | [optional]

### Return type

[**ActionsCacheList**](ActionsCacheList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsDeleteArtifact"></a>
# **actionsDeleteArtifact**
> actionsDeleteArtifact(owner, repo, artifactId)

Delete an artifact

Deletes an artifact for a workflow run. OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val artifactId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the artifact.
try {
    apiInstance.actionsDeleteArtifact(owner, repo, artifactId)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDeleteArtifact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDeleteArtifact")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **artifactId** | **kotlin.Int**| The unique identifier of the artifact. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsDeleteEnvironmentSecret"></a>
# **actionsDeleteEnvironmentSecret**
> actionsDeleteEnvironmentSecret(owner, repo, environmentName, secretName)

Delete an environment secret

Deletes a secret in an environment using the secret name.  Authenticated users must have collaborator access to a repository to create, update, or read secrets.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
try {
    apiInstance.actionsDeleteEnvironmentSecret(owner, repo, environmentName, secretName)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDeleteEnvironmentSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDeleteEnvironmentSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **secretName** | **kotlin.String**| The name of the secret. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsDeleteEnvironmentVariable"></a>
# **actionsDeleteEnvironmentVariable**
> actionsDeleteEnvironmentVariable(owner, repo, name, environmentName)

Delete an environment variable

Deletes an environment variable using the variable name.  Authenticated users must have collaborator access to a repository to create, update, or read variables.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val name : kotlin.String = name_example // kotlin.String | The name of the variable.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
try {
    apiInstance.actionsDeleteEnvironmentVariable(owner, repo, name, environmentName)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDeleteEnvironmentVariable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDeleteEnvironmentVariable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **name** | **kotlin.String**| The name of the variable. |
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsDeleteOrgSecret"></a>
# **actionsDeleteOrgSecret**
> actionsDeleteOrgSecret(org, secretName)

Delete an organization secret

Deletes a secret in an organization using the secret name.  Authenticated users must have collaborator access to a repository to create, update, or read secrets.  OAuth tokens and personal access tokens (classic) need the&#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
try {
    apiInstance.actionsDeleteOrgSecret(org, secretName)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDeleteOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDeleteOrgSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsDeleteOrgVariable"></a>
# **actionsDeleteOrgVariable**
> actionsDeleteOrgVariable(org, name)

Delete an organization variable

Deletes an organization variable using the variable name.  Authenticated users must have collaborator access to a repository to create, update, or read variables.  OAuth tokens and personal access tokens (classic) need the&#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val name : kotlin.String = name_example // kotlin.String | The name of the variable.
try {
    apiInstance.actionsDeleteOrgVariable(org, name)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDeleteOrgVariable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDeleteOrgVariable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **name** | **kotlin.String**| The name of the variable. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsDeleteRepoSecret"></a>
# **actionsDeleteRepoSecret**
> actionsDeleteRepoSecret(owner, repo, secretName)

Delete a repository secret

Deletes a secret in a repository using the secret name.  Authenticated users must have collaborator access to a repository to create, update, or read secrets.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
try {
    apiInstance.actionsDeleteRepoSecret(owner, repo, secretName)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDeleteRepoSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDeleteRepoSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsDeleteRepoVariable"></a>
# **actionsDeleteRepoVariable**
> actionsDeleteRepoVariable(owner, repo, name)

Delete a repository variable

Deletes a repository variable using the variable name.  Authenticated users must have collaborator access to a repository to create, update, or read variables.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val name : kotlin.String = name_example // kotlin.String | The name of the variable.
try {
    apiInstance.actionsDeleteRepoVariable(owner, repo, name)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDeleteRepoVariable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDeleteRepoVariable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **name** | **kotlin.String**| The name of the variable. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsDeleteSelfHostedRunnerFromOrg"></a>
# **actionsDeleteSelfHostedRunnerFromOrg**
> actionsDeleteSelfHostedRunnerFromOrg(org, runnerId)

Delete a self-hosted runner from an organization

Forces the removal of a self-hosted runner from an organization. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.  Authenticated users must have admin access to the organization to use this endpoint.  OAuth tokens and personal access tokens (classic) need the&#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val runnerId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the self-hosted runner.
try {
    apiInstance.actionsDeleteSelfHostedRunnerFromOrg(org, runnerId)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDeleteSelfHostedRunnerFromOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDeleteSelfHostedRunnerFromOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **runnerId** | **kotlin.Int**| Unique identifier of the self-hosted runner. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsDeleteSelfHostedRunnerFromRepo"></a>
# **actionsDeleteSelfHostedRunnerFromRepo**
> actionsDeleteSelfHostedRunnerFromRepo(owner, repo, runnerId)

Delete a self-hosted runner from a repository

Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.  Authenticated users must have admin access to the repository to use this endpoint.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runnerId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the self-hosted runner.
try {
    apiInstance.actionsDeleteSelfHostedRunnerFromRepo(owner, repo, runnerId)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDeleteSelfHostedRunnerFromRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDeleteSelfHostedRunnerFromRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runnerId** | **kotlin.Int**| Unique identifier of the self-hosted runner. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsDeleteWorkflowRun"></a>
# **actionsDeleteWorkflowRun**
> actionsDeleteWorkflowRun(owner, repo, runId)

Delete a workflow run

Deletes a specific workflow run.  Anyone with write access to the repository can use this endpoint.  If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
try {
    apiInstance.actionsDeleteWorkflowRun(owner, repo, runId)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDeleteWorkflowRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDeleteWorkflowRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsDeleteWorkflowRunLogs"></a>
# **actionsDeleteWorkflowRunLogs**
> actionsDeleteWorkflowRunLogs(owner, repo, runId)

Delete workflow run logs

Deletes all logs for a workflow run.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
try {
    apiInstance.actionsDeleteWorkflowRunLogs(owner, repo, runId)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDeleteWorkflowRunLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDeleteWorkflowRunLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsDisableSelectedRepositoryGithubActionsOrganization"></a>
# **actionsDisableSelectedRepositoryGithubActionsOrganization**
> actionsDisableSelectedRepositoryGithubActionsOrganization(org, repositoryId)

Disable a selected repository for GitHub Actions in an organization

Removes a repository from the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for &#x60;enabled_repositories&#x60; must be configured to &#x60;selected&#x60;. For more information, see \&quot;[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\&quot;  OAuth tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val repositoryId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the repository.
try {
    apiInstance.actionsDisableSelectedRepositoryGithubActionsOrganization(org, repositoryId)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDisableSelectedRepositoryGithubActionsOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDisableSelectedRepositoryGithubActionsOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **repositoryId** | **kotlin.Int**| The unique identifier of the repository. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsDisableWorkflow"></a>
# **actionsDisableWorkflow**
> actionsDisableWorkflow(owner, repo, workflowId)

Disable a workflow

Disables a workflow and sets the &#x60;state&#x60; of the workflow to &#x60;disabled_manually&#x60;. You can replace &#x60;workflow_id&#x60; with the workflow file name. For example, you could use &#x60;main.yaml&#x60;.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val workflowId : String =  // String | The ID of the workflow. You can also pass the workflow file name as a string.
try {
    apiInstance.actionsDisableWorkflow(owner, repo, workflowId)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDisableWorkflow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDisableWorkflow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **workflowId** | [**String**](.md)| The ID of the workflow. You can also pass the workflow file name as a string. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsDownloadArtifact"></a>
# **actionsDownloadArtifact**
> actionsDownloadArtifact(owner, repo, artifactId, archiveFormat)

Download an artifact

Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for &#x60;Location:&#x60; in the response header to find the URL for the download. The &#x60;:archive_format&#x60; must be &#x60;zip&#x60;.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val artifactId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the artifact.
val archiveFormat : kotlin.String = archiveFormat_example // kotlin.String | 
try {
    apiInstance.actionsDownloadArtifact(owner, repo, artifactId, archiveFormat)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDownloadArtifact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDownloadArtifact")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **artifactId** | **kotlin.Int**| The unique identifier of the artifact. |
 **archiveFormat** | **kotlin.String**|  | [default to &quot;push&quot;]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsDownloadJobLogsForWorkflowRun"></a>
# **actionsDownloadJobLogsForWorkflowRun**
> actionsDownloadJobLogsForWorkflowRun(owner, repo, jobId)

Download job logs for a workflow run

Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look for &#x60;Location:&#x60; in the response header to find the URL for the download.  Anyone with read access to the repository can use this endpoint.  If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val jobId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the job.
try {
    apiInstance.actionsDownloadJobLogsForWorkflowRun(owner, repo, jobId)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDownloadJobLogsForWorkflowRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDownloadJobLogsForWorkflowRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **jobId** | **kotlin.Int**| The unique identifier of the job. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsDownloadWorkflowRunAttemptLogs"></a>
# **actionsDownloadWorkflowRunAttemptLogs**
> actionsDownloadWorkflowRunAttemptLogs(owner, repo, runId, attemptNumber)

Download workflow run attempt logs

Gets a redirect URL to download an archive of log files for a specific workflow run attempt. This link expires after 1 minute. Look for &#x60;Location:&#x60; in the response header to find the URL for the download.  Anyone with read access to the repository can use this endpoint.  If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
val attemptNumber : kotlin.Int = 56 // kotlin.Int | The attempt number of the workflow run.
try {
    apiInstance.actionsDownloadWorkflowRunAttemptLogs(owner, repo, runId, attemptNumber)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDownloadWorkflowRunAttemptLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDownloadWorkflowRunAttemptLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |
 **attemptNumber** | **kotlin.Int**| The attempt number of the workflow run. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsDownloadWorkflowRunLogs"></a>
# **actionsDownloadWorkflowRunLogs**
> actionsDownloadWorkflowRunLogs(owner, repo, runId)

Download workflow run logs

Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for &#x60;Location:&#x60; in the response header to find the URL for the download.  Anyone with read access to the repository can use this endpoint.  If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
try {
    apiInstance.actionsDownloadWorkflowRunLogs(owner, repo, runId)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsDownloadWorkflowRunLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsDownloadWorkflowRunLogs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsEnableSelectedRepositoryGithubActionsOrganization"></a>
# **actionsEnableSelectedRepositoryGithubActionsOrganization**
> actionsEnableSelectedRepositoryGithubActionsOrganization(org, repositoryId)

Enable a selected repository for GitHub Actions in an organization

Adds a repository to the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for &#x60;enabled_repositories&#x60; must be must be configured to &#x60;selected&#x60;. For more information, see \&quot;[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\&quot;  OAuth tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val repositoryId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the repository.
try {
    apiInstance.actionsEnableSelectedRepositoryGithubActionsOrganization(org, repositoryId)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsEnableSelectedRepositoryGithubActionsOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsEnableSelectedRepositoryGithubActionsOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **repositoryId** | **kotlin.Int**| The unique identifier of the repository. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsEnableWorkflow"></a>
# **actionsEnableWorkflow**
> actionsEnableWorkflow(owner, repo, workflowId)

Enable a workflow

Enables a workflow and sets the &#x60;state&#x60; of the workflow to &#x60;active&#x60;. You can replace &#x60;workflow_id&#x60; with the workflow file name. For example, you could use &#x60;main.yaml&#x60;.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val workflowId : String =  // String | The ID of the workflow. You can also pass the workflow file name as a string.
try {
    apiInstance.actionsEnableWorkflow(owner, repo, workflowId)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsEnableWorkflow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsEnableWorkflow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **workflowId** | [**String**](.md)| The ID of the workflow. You can also pass the workflow file name as a string. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsForceCancelWorkflowRun"></a>
# **actionsForceCancelWorkflowRun**
> kotlin.Any actionsForceCancelWorkflowRun(owner, repo, runId)

Force cancel a workflow run

Cancels a workflow run and bypasses conditions that would otherwise cause a workflow execution to continue, such as an &#x60;always()&#x60; condition on a job. You should only use this endpoint to cancel a workflow run when the workflow run is not responding to [&#x60;POST /repos/{owner}/{repo}/actions/runs/{run_id}/cancel&#x60;](/rest/actions/workflow-runs#cancel-a-workflow-run).  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
try {
    val result : kotlin.Any = apiInstance.actionsForceCancelWorkflowRun(owner, repo, runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsForceCancelWorkflowRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsForceCancelWorkflowRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGenerateRunnerJitconfigForOrg"></a>
# **actionsGenerateRunnerJitconfigForOrg**
> kotlin.Any actionsGenerateRunnerJitconfigForOrg(org, actionsGenerateRunnerJitconfigForOrgRequest)

Create configuration for a just-in-time runner for an organization

Generates a configuration that can be passed to the runner application at startup.  The authenticated user must have admin access to the organization.  OAuth tokens and personal access tokens (classic) need the&#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val actionsGenerateRunnerJitconfigForOrgRequest : ActionsGenerateRunnerJitconfigForOrgRequest = {"name":"New runner","runner_group_id":1,"labels":["self-hosted","X64","macOS","no-gpu"],"work_folder":"_work"} // ActionsGenerateRunnerJitconfigForOrgRequest | 
try {
    val result : kotlin.Any = apiInstance.actionsGenerateRunnerJitconfigForOrg(org, actionsGenerateRunnerJitconfigForOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGenerateRunnerJitconfigForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGenerateRunnerJitconfigForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **actionsGenerateRunnerJitconfigForOrgRequest** | [**ActionsGenerateRunnerJitconfigForOrgRequest**](ActionsGenerateRunnerJitconfigForOrgRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="actionsGenerateRunnerJitconfigForRepo"></a>
# **actionsGenerateRunnerJitconfigForRepo**
> kotlin.Any actionsGenerateRunnerJitconfigForRepo(owner, repo, actionsGenerateRunnerJitconfigForOrgRequest)

Create configuration for a just-in-time runner for a repository

Generates a configuration that can be passed to the runner application at startup.  The authenticated user must have admin access to the repository.  OAuth tokens and personal access tokens (classic) need the&#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val actionsGenerateRunnerJitconfigForOrgRequest : ActionsGenerateRunnerJitconfigForOrgRequest = {name=New runner, runner_group_id=1, labels=[self-hosted, X64, macOS, no-gpu], work_folder=_work} // ActionsGenerateRunnerJitconfigForOrgRequest | 
try {
    val result : kotlin.Any = apiInstance.actionsGenerateRunnerJitconfigForRepo(owner, repo, actionsGenerateRunnerJitconfigForOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGenerateRunnerJitconfigForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGenerateRunnerJitconfigForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **actionsGenerateRunnerJitconfigForOrgRequest** | [**ActionsGenerateRunnerJitconfigForOrgRequest**](ActionsGenerateRunnerJitconfigForOrgRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="actionsGetActionsCacheList"></a>
# **actionsGetActionsCacheList**
> ActionsCacheList actionsGetActionsCacheList(owner, repo, perPage, page, ref, key, sort, direction)

List GitHub Actions caches for a repository

Lists the GitHub Actions caches for a repository.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val ref : kotlin.String = ref_example // kotlin.String | The full Git reference for narrowing down the cache. The `ref` for a branch should be formatted as `refs/heads/<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
val key : kotlin.String = key_example // kotlin.String | An explicit key or prefix for identifying the cache
val sort : kotlin.String = sort_example // kotlin.String | The property to sort the results by. `created_at` means when the cache was created. `last_accessed_at` means when the cache was last accessed. `size_in_bytes` is the size of the cache in bytes.
val direction : kotlin.String = direction_example // kotlin.String | The direction to sort the results by.
try {
    val result : ActionsCacheList = apiInstance.actionsGetActionsCacheList(owner, repo, perPage, page, ref, key, sort, direction)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetActionsCacheList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetActionsCacheList")
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
 **ref** | **kotlin.String**| The full Git reference for narrowing down the cache. The &#x60;ref&#x60; for a branch should be formatted as &#x60;refs/heads/&lt;branch name&gt;&#x60;. To reference a pull request use &#x60;refs/pull/&lt;number&gt;/merge&#x60;. | [optional]
 **key** | **kotlin.String**| An explicit key or prefix for identifying the cache | [optional]
 **sort** | **kotlin.String**| The property to sort the results by. &#x60;created_at&#x60; means when the cache was created. &#x60;last_accessed_at&#x60; means when the cache was last accessed. &#x60;size_in_bytes&#x60; is the size of the cache in bytes. | [optional] [default to last_accessed_at] [enum: created_at, last_accessed_at, size_in_bytes]
 **direction** | **kotlin.String**| The direction to sort the results by. | [optional] [default to desc] [enum: asc, desc]

### Return type

[**ActionsCacheList**](ActionsCacheList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetActionsCacheUsage"></a>
# **actionsGetActionsCacheUsage**
> ActionsCacheUsageByRepository actionsGetActionsCacheUsage(owner, repo)

Get GitHub Actions cache usage for a repository

Gets GitHub Actions cache usage for a repository. The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.  Anyone with read access to the repository can use this endpoint.  If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : ActionsCacheUsageByRepository = apiInstance.actionsGetActionsCacheUsage(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetActionsCacheUsage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetActionsCacheUsage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**ActionsCacheUsageByRepository**](ActionsCacheUsageByRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetActionsCacheUsageByRepoForOrg"></a>
# **actionsGetActionsCacheUsageByRepoForOrg**
> ActionsGetActionsCacheUsageByRepoForOrg200Response actionsGetActionsCacheUsageByRepoForOrg(org, perPage, page)

List repositories with GitHub Actions cache usage for an organization

Lists repositories and their GitHub Actions cache usage for an organization. The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.  OAuth tokens and personal access tokens (classic) need the &#x60;read:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsGetActionsCacheUsageByRepoForOrg200Response = apiInstance.actionsGetActionsCacheUsageByRepoForOrg(org, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetActionsCacheUsageByRepoForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetActionsCacheUsageByRepoForOrg")
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

[**ActionsGetActionsCacheUsageByRepoForOrg200Response**](ActionsGetActionsCacheUsageByRepoForOrg200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetActionsCacheUsageForOrg"></a>
# **actionsGetActionsCacheUsageForOrg**
> ActionsCacheUsageOrgEnterprise actionsGetActionsCacheUsageForOrg(org)

Get GitHub Actions cache usage for an organization

Gets the total GitHub Actions cache usage for an organization. The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.  OAuth tokens and personal access tokens (classic) need the &#x60;read:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : ActionsCacheUsageOrgEnterprise = apiInstance.actionsGetActionsCacheUsageForOrg(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetActionsCacheUsageForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetActionsCacheUsageForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**ActionsCacheUsageOrgEnterprise**](ActionsCacheUsageOrgEnterprise.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetAllowedActionsOrganization"></a>
# **actionsGetAllowedActionsOrganization**
> SelectedActions actionsGetAllowedActionsOrganization(org)

Get allowed actions and reusable workflows for an organization

Gets the selected actions and reusable workflows that are allowed in an organization. To use this endpoint, the organization permission policy for &#x60;allowed_actions&#x60; must be configured to &#x60;selected&#x60;. For more information, see \&quot;[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\&quot;  OAuth tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : SelectedActions = apiInstance.actionsGetAllowedActionsOrganization(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetAllowedActionsOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetAllowedActionsOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**SelectedActions**](SelectedActions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetAllowedActionsRepository"></a>
# **actionsGetAllowedActionsRepository**
> SelectedActions actionsGetAllowedActionsRepository(owner, repo)

Get allowed actions and reusable workflows for a repository

Gets the settings for selected actions and reusable workflows that are allowed in a repository. To use this endpoint, the repository policy for &#x60;allowed_actions&#x60; must be configured to &#x60;selected&#x60;. For more information, see \&quot;[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository).\&quot;  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : SelectedActions = apiInstance.actionsGetAllowedActionsRepository(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetAllowedActionsRepository")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetAllowedActionsRepository")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**SelectedActions**](SelectedActions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetArtifact"></a>
# **actionsGetArtifact**
> Artifact actionsGetArtifact(owner, repo, artifactId)

Get an artifact

Gets a specific artifact for a workflow run.  Anyone with read access to the repository can use this endpoint.  If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val artifactId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the artifact.
try {
    val result : Artifact = apiInstance.actionsGetArtifact(owner, repo, artifactId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetArtifact")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetArtifact")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **artifactId** | **kotlin.Int**| The unique identifier of the artifact. |

### Return type

[**Artifact**](Artifact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetCustomOidcSubClaimForRepo"></a>
# **actionsGetCustomOidcSubClaimForRepo**
> OidcCustomSubRepo actionsGetCustomOidcSubClaimForRepo(owner, repo)

Get the customization template for an OIDC subject claim for a repository

Gets the customization template for an OpenID Connect (OIDC) subject claim.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : OidcCustomSubRepo = apiInstance.actionsGetCustomOidcSubClaimForRepo(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetCustomOidcSubClaimForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetCustomOidcSubClaimForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**OidcCustomSubRepo**](OidcCustomSubRepo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/scim+json

<a id="actionsGetEnvironmentPublicKey"></a>
# **actionsGetEnvironmentPublicKey**
> ActionsPublicKey actionsGetEnvironmentPublicKey(owner, repo, environmentName)

Get an environment public key

Get the public key for an environment, which you need to encrypt environment secrets. You need to encrypt a secret before you can create or update secrets.  Anyone with read access to the repository can use this endpoint.  If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
try {
    val result : ActionsPublicKey = apiInstance.actionsGetEnvironmentPublicKey(owner, repo, environmentName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetEnvironmentPublicKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetEnvironmentPublicKey")
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

[**ActionsPublicKey**](ActionsPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetEnvironmentSecret"></a>
# **actionsGetEnvironmentSecret**
> ActionsSecret actionsGetEnvironmentSecret(owner, repo, environmentName, secretName)

Get an environment secret

Gets a single environment secret without revealing its encrypted value.  Authenticated users must have collaborator access to a repository to create, update, or read secrets.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
try {
    val result : ActionsSecret = apiInstance.actionsGetEnvironmentSecret(owner, repo, environmentName, secretName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetEnvironmentSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetEnvironmentSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **secretName** | **kotlin.String**| The name of the secret. |

### Return type

[**ActionsSecret**](ActionsSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetEnvironmentVariable"></a>
# **actionsGetEnvironmentVariable**
> ActionsVariable actionsGetEnvironmentVariable(owner, repo, environmentName, name)

Get an environment variable

Gets a specific variable in an environment.  Authenticated users must have collaborator access to a repository to create, update, or read variables.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val name : kotlin.String = name_example // kotlin.String | The name of the variable.
try {
    val result : ActionsVariable = apiInstance.actionsGetEnvironmentVariable(owner, repo, environmentName, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetEnvironmentVariable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetEnvironmentVariable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **name** | **kotlin.String**| The name of the variable. |

### Return type

[**ActionsVariable**](ActionsVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetGithubActionsDefaultWorkflowPermissionsOrganization"></a>
# **actionsGetGithubActionsDefaultWorkflowPermissionsOrganization**
> ActionsGetDefaultWorkflowPermissions actionsGetGithubActionsDefaultWorkflowPermissionsOrganization(org)

Get default workflow permissions for an organization

Gets the default workflow permissions granted to the &#x60;GITHUB_TOKEN&#x60; when running workflows in an organization, as well as whether GitHub Actions can submit approving pull request reviews. For more information, see \&quot;[Setting the permissions of the GITHUB_TOKEN for your organization](https://docs.github.com/organizations/managing-organization-settings/disabling-or-limiting-github-actions-for-your-organization#setting-the-permissions-of-the-github_token-for-your-organization).\&quot;  OAuth tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : ActionsGetDefaultWorkflowPermissions = apiInstance.actionsGetGithubActionsDefaultWorkflowPermissionsOrganization(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetGithubActionsDefaultWorkflowPermissionsOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetGithubActionsDefaultWorkflowPermissionsOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**ActionsGetDefaultWorkflowPermissions**](ActionsGetDefaultWorkflowPermissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetGithubActionsDefaultWorkflowPermissionsRepository"></a>
# **actionsGetGithubActionsDefaultWorkflowPermissionsRepository**
> ActionsGetDefaultWorkflowPermissions actionsGetGithubActionsDefaultWorkflowPermissionsRepository(owner, repo)

Get default workflow permissions for a repository

Gets the default workflow permissions granted to the &#x60;GITHUB_TOKEN&#x60; when running workflows in a repository, as well as if GitHub Actions can submit approving pull request reviews. For more information, see \&quot;[Setting the permissions of the GITHUB_TOKEN for your repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#setting-the-permissions-of-the-github_token-for-your-repository).\&quot;  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : ActionsGetDefaultWorkflowPermissions = apiInstance.actionsGetGithubActionsDefaultWorkflowPermissionsRepository(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetGithubActionsDefaultWorkflowPermissionsRepository")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetGithubActionsDefaultWorkflowPermissionsRepository")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**ActionsGetDefaultWorkflowPermissions**](ActionsGetDefaultWorkflowPermissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetGithubActionsPermissionsOrganization"></a>
# **actionsGetGithubActionsPermissionsOrganization**
> ActionsOrganizationPermissions actionsGetGithubActionsPermissionsOrganization(org)

Get GitHub Actions permissions for an organization

Gets the GitHub Actions permissions policy for repositories and allowed actions and reusable workflows in an organization.  OAuth tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : ActionsOrganizationPermissions = apiInstance.actionsGetGithubActionsPermissionsOrganization(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetGithubActionsPermissionsOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetGithubActionsPermissionsOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**ActionsOrganizationPermissions**](ActionsOrganizationPermissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetGithubActionsPermissionsRepository"></a>
# **actionsGetGithubActionsPermissionsRepository**
> ActionsRepositoryPermissions actionsGetGithubActionsPermissionsRepository(owner, repo)

Get GitHub Actions permissions for a repository

Gets the GitHub Actions permissions policy for a repository, including whether GitHub Actions is enabled and the actions and reusable workflows allowed to run in the repository.  OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : ActionsRepositoryPermissions = apiInstance.actionsGetGithubActionsPermissionsRepository(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetGithubActionsPermissionsRepository")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetGithubActionsPermissionsRepository")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**ActionsRepositoryPermissions**](ActionsRepositoryPermissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetJobForWorkflowRun"></a>
# **actionsGetJobForWorkflowRun**
> Job actionsGetJobForWorkflowRun(owner, repo, jobId)

Get a job for a workflow run

Gets a specific job in a workflow run.  Anyone with read access to the repository can use this endpoint.  If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val jobId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the job.
try {
    val result : Job = apiInstance.actionsGetJobForWorkflowRun(owner, repo, jobId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetJobForWorkflowRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetJobForWorkflowRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **jobId** | **kotlin.Int**| The unique identifier of the job. |

### Return type

[**Job**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetOrgPublicKey"></a>
# **actionsGetOrgPublicKey**
> ActionsPublicKey actionsGetOrgPublicKey(org)

Get an organization public key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets.  The authenticated user must have collaborator access to a repository to create, update, or read secrets.  OAuth tokens and personal access tokens (classic) need the&#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : ActionsPublicKey = apiInstance.actionsGetOrgPublicKey(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetOrgPublicKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetOrgPublicKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**ActionsPublicKey**](ActionsPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetOrgSecret"></a>
# **actionsGetOrgSecret**
> OrganizationActionsSecret actionsGetOrgSecret(org, secretName)

Get an organization secret

Gets a single organization secret without revealing its encrypted value.  The authenticated user must have collaborator access to a repository to create, update, or read secrets  OAuth tokens and personal access tokens (classic) need the&#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
try {
    val result : OrganizationActionsSecret = apiInstance.actionsGetOrgSecret(org, secretName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetOrgSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |

### Return type

[**OrganizationActionsSecret**](OrganizationActionsSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetOrgVariable"></a>
# **actionsGetOrgVariable**
> OrganizationActionsVariable actionsGetOrgVariable(org, name)

Get an organization variable

Gets a specific variable in an organization.  The authenticated user must have collaborator access to a repository to create, update, or read variables.  OAuth tokens and personal access tokens (classic) need the&#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val name : kotlin.String = name_example // kotlin.String | The name of the variable.
try {
    val result : OrganizationActionsVariable = apiInstance.actionsGetOrgVariable(org, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetOrgVariable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetOrgVariable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **name** | **kotlin.String**| The name of the variable. |

### Return type

[**OrganizationActionsVariable**](OrganizationActionsVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetPendingDeploymentsForRun"></a>
# **actionsGetPendingDeploymentsForRun**
> kotlin.collections.List&lt;PendingDeployment&gt; actionsGetPendingDeploymentsForRun(owner, repo, runId)

Get pending deployments for a workflow run

Get all deployment environments for a workflow run that are waiting for protection rules to pass.  Anyone with read access to the repository can use this endpoint.  If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
try {
    val result : kotlin.collections.List<PendingDeployment> = apiInstance.actionsGetPendingDeploymentsForRun(owner, repo, runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetPendingDeploymentsForRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetPendingDeploymentsForRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |

### Return type

[**kotlin.collections.List&lt;PendingDeployment&gt;**](PendingDeployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetRepoPublicKey"></a>
# **actionsGetRepoPublicKey**
> ActionsPublicKey actionsGetRepoPublicKey(owner, repo)

Get a repository public key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets.  Anyone with read access to the repository can use this endpoint.  If the repository is private, OAuth tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : ActionsPublicKey = apiInstance.actionsGetRepoPublicKey(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetRepoPublicKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetRepoPublicKey")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**ActionsPublicKey**](ActionsPublicKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetRepoSecret"></a>
# **actionsGetRepoSecret**
> ActionsSecret actionsGetRepoSecret(owner, repo, secretName)

Get a repository secret

Gets a single repository secret without revealing its encrypted value.  The authenticated user must have collaborator access to the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
try {
    val result : ActionsSecret = apiInstance.actionsGetRepoSecret(owner, repo, secretName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetRepoSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetRepoSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |

### Return type

[**ActionsSecret**](ActionsSecret.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetRepoVariable"></a>
# **actionsGetRepoVariable**
> ActionsVariable actionsGetRepoVariable(owner, repo, name)

Get a repository variable

Gets a specific variable in a repository.  The authenticated user must have collaborator access to the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val name : kotlin.String = name_example // kotlin.String | The name of the variable.
try {
    val result : ActionsVariable = apiInstance.actionsGetRepoVariable(owner, repo, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetRepoVariable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetRepoVariable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **name** | **kotlin.String**| The name of the variable. |

### Return type

[**ActionsVariable**](ActionsVariable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetReviewsForRun"></a>
# **actionsGetReviewsForRun**
> kotlin.collections.List&lt;EnvironmentApprovals&gt; actionsGetReviewsForRun(owner, repo, runId)

Get the review history for a workflow run

Anyone with read access to the repository can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
try {
    val result : kotlin.collections.List<EnvironmentApprovals> = apiInstance.actionsGetReviewsForRun(owner, repo, runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetReviewsForRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetReviewsForRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |

### Return type

[**kotlin.collections.List&lt;EnvironmentApprovals&gt;**](EnvironmentApprovals.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetSelfHostedRunnerForOrg"></a>
# **actionsGetSelfHostedRunnerForOrg**
> Runner actionsGetSelfHostedRunnerForOrg(org, runnerId)

Get a self-hosted runner for an organization

Gets a specific self-hosted runner configured in an organization.  Authenticated users must have admin access to the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, the &#x60;repo&#x60; scope is also required.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val runnerId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the self-hosted runner.
try {
    val result : Runner = apiInstance.actionsGetSelfHostedRunnerForOrg(org, runnerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetSelfHostedRunnerForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetSelfHostedRunnerForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **runnerId** | **kotlin.Int**| Unique identifier of the self-hosted runner. |

### Return type

[**Runner**](Runner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetSelfHostedRunnerForRepo"></a>
# **actionsGetSelfHostedRunnerForRepo**
> Runner actionsGetSelfHostedRunnerForRepo(owner, repo, runnerId)

Get a self-hosted runner for a repository

Gets a specific self-hosted runner configured in a repository.  Authenticated users must have admin access to the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runnerId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the self-hosted runner.
try {
    val result : Runner = apiInstance.actionsGetSelfHostedRunnerForRepo(owner, repo, runnerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetSelfHostedRunnerForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetSelfHostedRunnerForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runnerId** | **kotlin.Int**| Unique identifier of the self-hosted runner. |

### Return type

[**Runner**](Runner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetWorkflow"></a>
# **actionsGetWorkflow**
> Workflow actionsGetWorkflow(owner, repo, workflowId)

Get a workflow

Gets a specific workflow. You can replace &#x60;workflow_id&#x60; with the workflow file name. For example, you could use &#x60;main.yaml&#x60;.  Anyone with read access to the repository can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val workflowId : String =  // String | The ID of the workflow. You can also pass the workflow file name as a string.
try {
    val result : Workflow = apiInstance.actionsGetWorkflow(owner, repo, workflowId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetWorkflow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetWorkflow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **workflowId** | [**String**](.md)| The ID of the workflow. You can also pass the workflow file name as a string. |

### Return type

[**Workflow**](Workflow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetWorkflowAccessToRepository"></a>
# **actionsGetWorkflowAccessToRepository**
> ActionsWorkflowAccessToRepository actionsGetWorkflowAccessToRepository(owner, repo)

Get the level of access for workflows outside of the repository

Gets the level of access that workflows outside of the repository have to actions and reusable workflows in the repository. This endpoint only applies to private repositories. For more information, see \&quot;[Allowing access to components in a private repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#allowing-access-to-components-in-a-private-repository).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : ActionsWorkflowAccessToRepository = apiInstance.actionsGetWorkflowAccessToRepository(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetWorkflowAccessToRepository")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetWorkflowAccessToRepository")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**ActionsWorkflowAccessToRepository**](ActionsWorkflowAccessToRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetWorkflowRun"></a>
# **actionsGetWorkflowRun**
> WorkflowRun actionsGetWorkflowRun(owner, repo, runId, excludePullRequests)

Get a workflow run

Gets a specific workflow run.  Anyone with read access to the repository can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
val excludePullRequests : kotlin.Boolean = true // kotlin.Boolean | If `true` pull requests are omitted from the response (empty array).
try {
    val result : WorkflowRun = apiInstance.actionsGetWorkflowRun(owner, repo, runId, excludePullRequests)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetWorkflowRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetWorkflowRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |
 **excludePullRequests** | **kotlin.Boolean**| If &#x60;true&#x60; pull requests are omitted from the response (empty array). | [optional] [default to false]

### Return type

[**WorkflowRun**](WorkflowRun.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetWorkflowRunAttempt"></a>
# **actionsGetWorkflowRunAttempt**
> WorkflowRun actionsGetWorkflowRunAttempt(owner, repo, runId, attemptNumber, excludePullRequests)

Get a workflow run attempt

Gets a specific workflow run attempt.  Anyone with read access to the repository can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
val attemptNumber : kotlin.Int = 56 // kotlin.Int | The attempt number of the workflow run.
val excludePullRequests : kotlin.Boolean = true // kotlin.Boolean | If `true` pull requests are omitted from the response (empty array).
try {
    val result : WorkflowRun = apiInstance.actionsGetWorkflowRunAttempt(owner, repo, runId, attemptNumber, excludePullRequests)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetWorkflowRunAttempt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetWorkflowRunAttempt")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |
 **attemptNumber** | **kotlin.Int**| The attempt number of the workflow run. |
 **excludePullRequests** | **kotlin.Boolean**| If &#x60;true&#x60; pull requests are omitted from the response (empty array). | [optional] [default to false]

### Return type

[**WorkflowRun**](WorkflowRun.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetWorkflowRunUsage"></a>
# **actionsGetWorkflowRunUsage**
> WorkflowRunUsage actionsGetWorkflowRunUsage(owner, repo, runId)

Get workflow run usage

Gets the number of billable minutes and total run time for a specific workflow run. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see \&quot;[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)\&quot;.  Anyone with read access to the repository can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
try {
    val result : WorkflowRunUsage = apiInstance.actionsGetWorkflowRunUsage(owner, repo, runId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetWorkflowRunUsage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetWorkflowRunUsage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |

### Return type

[**WorkflowRunUsage**](WorkflowRunUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsGetWorkflowUsage"></a>
# **actionsGetWorkflowUsage**
> WorkflowUsage actionsGetWorkflowUsage(owner, repo, workflowId)

Get workflow usage

Gets the number of billable minutes used by a specific workflow during the current billing cycle. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see \&quot;[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)\&quot;.  You can replace &#x60;workflow_id&#x60; with the workflow file name. For example, you could use &#x60;main.yaml&#x60;.  Anyone with read access to the repository can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val workflowId : String =  // String | The ID of the workflow. You can also pass the workflow file name as a string.
try {
    val result : WorkflowUsage = apiInstance.actionsGetWorkflowUsage(owner, repo, workflowId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsGetWorkflowUsage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsGetWorkflowUsage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **workflowId** | [**String**](.md)| The ID of the workflow. You can also pass the workflow file name as a string. |

### Return type

[**WorkflowUsage**](WorkflowUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListArtifactsForRepo"></a>
# **actionsListArtifactsForRepo**
> ActionsListArtifactsForRepo200Response actionsListArtifactsForRepo(owner, repo, perPage, page, name)

List artifacts for a repository

Lists all artifacts for a repository.  Anyone with read access to the repository can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val name : kotlin.String = name_example // kotlin.String | The name field of an artifact. When specified, only artifacts with this name will be returned.
try {
    val result : ActionsListArtifactsForRepo200Response = apiInstance.actionsListArtifactsForRepo(owner, repo, perPage, page, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListArtifactsForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListArtifactsForRepo")
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
 **name** | **kotlin.String**| The name field of an artifact. When specified, only artifacts with this name will be returned. | [optional]

### Return type

[**ActionsListArtifactsForRepo200Response**](ActionsListArtifactsForRepo200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListEnvironmentSecrets"></a>
# **actionsListEnvironmentSecrets**
> ActionsListRepoOrganizationSecrets200Response actionsListEnvironmentSecrets(owner, repo, environmentName, perPage, page)

List environment secrets

Lists all secrets available in an environment without revealing their encrypted values.  Authenticated users must have collaborator access to a repository to create, update, or read secrets.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListRepoOrganizationSecrets200Response = apiInstance.actionsListEnvironmentSecrets(owner, repo, environmentName, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListEnvironmentSecrets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListEnvironmentSecrets")
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

[**ActionsListRepoOrganizationSecrets200Response**](ActionsListRepoOrganizationSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListEnvironmentVariables"></a>
# **actionsListEnvironmentVariables**
> ActionsListRepoOrganizationVariables200Response actionsListEnvironmentVariables(owner, repo, environmentName, perPage, page)

List environment variables

Lists all environment variables.  Authenticated users must have collaborator access to a repository to create, update, or read variables.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 30). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListRepoOrganizationVariables200Response = apiInstance.actionsListEnvironmentVariables(owner, repo, environmentName, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListEnvironmentVariables")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListEnvironmentVariables")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **perPage** | **kotlin.Int**| The number of results per page (max 30). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 10]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**ActionsListRepoOrganizationVariables200Response**](ActionsListRepoOrganizationVariables200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListJobsForWorkflowRun"></a>
# **actionsListJobsForWorkflowRun**
> ActionsListJobsForWorkflowRunAttempt200Response actionsListJobsForWorkflowRun(owner, repo, runId, filter, perPage, page)

List jobs for a workflow run

Lists jobs for a workflow run. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#parameters).  Anyone with read access to the repository can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
val filter : kotlin.String = filter_example // kotlin.String | Filters jobs by their `completed_at` timestamp. `latest` returns jobs from the most recent execution of the workflow run. `all` returns all jobs for a workflow run, including from old executions of the workflow run.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListJobsForWorkflowRunAttempt200Response = apiInstance.actionsListJobsForWorkflowRun(owner, repo, runId, filter, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListJobsForWorkflowRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListJobsForWorkflowRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |
 **filter** | **kotlin.String**| Filters jobs by their &#x60;completed_at&#x60; timestamp. &#x60;latest&#x60; returns jobs from the most recent execution of the workflow run. &#x60;all&#x60; returns all jobs for a workflow run, including from old executions of the workflow run. | [optional] [default to latest] [enum: latest, all]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**ActionsListJobsForWorkflowRunAttempt200Response**](ActionsListJobsForWorkflowRunAttempt200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListJobsForWorkflowRunAttempt"></a>
# **actionsListJobsForWorkflowRunAttempt**
> ActionsListJobsForWorkflowRunAttempt200Response actionsListJobsForWorkflowRunAttempt(owner, repo, runId, attemptNumber, perPage, page)

List jobs for a workflow run attempt

Lists jobs for a specific workflow run attempt. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#parameters).  Anyone with read access to the repository can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint  with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
val attemptNumber : kotlin.Int = 56 // kotlin.Int | The attempt number of the workflow run.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListJobsForWorkflowRunAttempt200Response = apiInstance.actionsListJobsForWorkflowRunAttempt(owner, repo, runId, attemptNumber, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListJobsForWorkflowRunAttempt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListJobsForWorkflowRunAttempt")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |
 **attemptNumber** | **kotlin.Int**| The attempt number of the workflow run. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**ActionsListJobsForWorkflowRunAttempt200Response**](ActionsListJobsForWorkflowRunAttempt200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListLabelsForSelfHostedRunnerForOrg"></a>
# **actionsListLabelsForSelfHostedRunnerForOrg**
> kotlin.Any actionsListLabelsForSelfHostedRunnerForOrg(org, runnerId)

List labels for a self-hosted runner for an organization

Lists all labels for a self-hosted runner configured in an organization.  Authenticated users must have admin access to the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, the &#x60;repo&#x60; scope is also required.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val runnerId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the self-hosted runner.
try {
    val result : kotlin.Any = apiInstance.actionsListLabelsForSelfHostedRunnerForOrg(org, runnerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListLabelsForSelfHostedRunnerForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListLabelsForSelfHostedRunnerForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **runnerId** | **kotlin.Int**| Unique identifier of the self-hosted runner. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListLabelsForSelfHostedRunnerForRepo"></a>
# **actionsListLabelsForSelfHostedRunnerForRepo**
> kotlin.Any actionsListLabelsForSelfHostedRunnerForRepo(owner, repo, runnerId)

List labels for a self-hosted runner for a repository

Lists all labels for a self-hosted runner configured in a repository.  Authenticated users must have admin access to the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runnerId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the self-hosted runner.
try {
    val result : kotlin.Any = apiInstance.actionsListLabelsForSelfHostedRunnerForRepo(owner, repo, runnerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListLabelsForSelfHostedRunnerForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListLabelsForSelfHostedRunnerForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runnerId** | **kotlin.Int**| Unique identifier of the self-hosted runner. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListOrgSecrets"></a>
# **actionsListOrgSecrets**
> ActionsListOrgSecrets200Response actionsListOrgSecrets(org, perPage, page)

List organization secrets

Lists all secrets available in an organization without revealing their encrypted values.  Authenticated users must have collaborator access to a repository to create, update, or read secrets.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, the &#x60;repo&#x60; scope is also required.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListOrgSecrets200Response = apiInstance.actionsListOrgSecrets(org, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListOrgSecrets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListOrgSecrets")
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

[**ActionsListOrgSecrets200Response**](ActionsListOrgSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListOrgVariables"></a>
# **actionsListOrgVariables**
> ActionsListOrgVariables200Response actionsListOrgVariables(org, perPage, page)

List organization variables

Lists all organization variables.  Authenticated users must have collaborator access to a repository to create, update, or read variables.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, the &#x60;repo&#x60; scope is also required.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 30). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListOrgVariables200Response = apiInstance.actionsListOrgVariables(org, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListOrgVariables")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListOrgVariables")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 30). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 10]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**ActionsListOrgVariables200Response**](ActionsListOrgVariables200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListRepoOrganizationSecrets"></a>
# **actionsListRepoOrganizationSecrets**
> ActionsListRepoOrganizationSecrets200Response actionsListRepoOrganizationSecrets(owner, repo, perPage, page)

List repository organization secrets

Lists all organization secrets shared with a repository without revealing their encrypted values.  Authenticated users must have collaborator access to a repository to create, update, or read secrets.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListRepoOrganizationSecrets200Response = apiInstance.actionsListRepoOrganizationSecrets(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListRepoOrganizationSecrets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListRepoOrganizationSecrets")
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

[**ActionsListRepoOrganizationSecrets200Response**](ActionsListRepoOrganizationSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListRepoOrganizationVariables"></a>
# **actionsListRepoOrganizationVariables**
> ActionsListRepoOrganizationVariables200Response actionsListRepoOrganizationVariables(owner, repo, perPage, page)

List repository organization variables

Lists all organization variables shared with a repository.  Authenticated users must have collaborator access to a repository to create, update, or read variables.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 30). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListRepoOrganizationVariables200Response = apiInstance.actionsListRepoOrganizationVariables(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListRepoOrganizationVariables")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListRepoOrganizationVariables")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 30). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 10]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**ActionsListRepoOrganizationVariables200Response**](ActionsListRepoOrganizationVariables200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListRepoSecrets"></a>
# **actionsListRepoSecrets**
> ActionsListRepoOrganizationSecrets200Response actionsListRepoSecrets(owner, repo, perPage, page)

List repository secrets

Lists all secrets available in a repository without revealing their encrypted values.  Authenticated users must have collaborator access to a repository to create, update, or read secrets.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListRepoOrganizationSecrets200Response = apiInstance.actionsListRepoSecrets(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListRepoSecrets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListRepoSecrets")
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

[**ActionsListRepoOrganizationSecrets200Response**](ActionsListRepoOrganizationSecrets200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListRepoVariables"></a>
# **actionsListRepoVariables**
> ActionsListRepoOrganizationVariables200Response actionsListRepoVariables(owner, repo, perPage, page)

List repository variables

Lists all repository variables.  Authenticated users must have collaborator access to a repository to create, update, or read variables.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 30). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListRepoOrganizationVariables200Response = apiInstance.actionsListRepoVariables(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListRepoVariables")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListRepoVariables")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **perPage** | **kotlin.Int**| The number of results per page (max 30). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 10]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**ActionsListRepoOrganizationVariables200Response**](ActionsListRepoOrganizationVariables200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListRepoWorkflows"></a>
# **actionsListRepoWorkflows**
> ActionsListRepoWorkflows200Response actionsListRepoWorkflows(owner, repo, perPage, page)

List repository workflows

Lists the workflows in a repository.  Anyone with read access to the repository can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListRepoWorkflows200Response = apiInstance.actionsListRepoWorkflows(owner, repo, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListRepoWorkflows")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListRepoWorkflows")
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

[**ActionsListRepoWorkflows200Response**](ActionsListRepoWorkflows200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListRunnerApplicationsForOrg"></a>
# **actionsListRunnerApplicationsForOrg**
> kotlin.collections.List&lt;RunnerApplication&gt; actionsListRunnerApplicationsForOrg(org)

List runner applications for an organization

Lists binaries for the runner application that you can download and run.  Authenticated users must have admin access to the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.  If the repository is private, the &#x60;repo&#x60; scope is also required.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
try {
    val result : kotlin.collections.List<RunnerApplication> = apiInstance.actionsListRunnerApplicationsForOrg(org)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListRunnerApplicationsForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListRunnerApplicationsForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |

### Return type

[**kotlin.collections.List&lt;RunnerApplication&gt;**](RunnerApplication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListRunnerApplicationsForRepo"></a>
# **actionsListRunnerApplicationsForRepo**
> kotlin.collections.List&lt;RunnerApplication&gt; actionsListRunnerApplicationsForRepo(owner, repo)

List runner applications for a repository

Lists binaries for the runner application that you can download and run.  Authenticated users must have admin access to the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
try {
    val result : kotlin.collections.List<RunnerApplication> = apiInstance.actionsListRunnerApplicationsForRepo(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListRunnerApplicationsForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListRunnerApplicationsForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |

### Return type

[**kotlin.collections.List&lt;RunnerApplication&gt;**](RunnerApplication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListSelectedReposForOrgSecret"></a>
# **actionsListSelectedReposForOrgSecret**
> ActionsListSelectedReposForOrgSecret200Response actionsListSelectedReposForOrgSecret(org, secretName, page, perPage)

List selected repositories for an organization secret

Lists all repositories that have been selected when the &#x60;visibility&#x60; for repository access to a secret is set to &#x60;selected&#x60;.  Authenticated users must have collaborator access to a repository to create, update, or read secrets.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, the &#x60;repo&#x60; scope is also required.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListSelectedReposForOrgSecret200Response = apiInstance.actionsListSelectedReposForOrgSecret(org, secretName, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListSelectedReposForOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListSelectedReposForOrgSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**ActionsListSelectedReposForOrgSecret200Response**](ActionsListSelectedReposForOrgSecret200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListSelectedReposForOrgVariable"></a>
# **actionsListSelectedReposForOrgVariable**
> ActionsListSelectedReposForOrgSecret200Response actionsListSelectedReposForOrgVariable(org, name, page, perPage)

List selected repositories for an organization variable

Lists all repositories that can access an organization variable that is available to selected repositories.  Authenticated users must have collaborator access to a repository to create, update, or read variables.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, the &#x60;repo&#x60; scope is also required.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val name : kotlin.String = name_example // kotlin.String | The name of the variable.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListSelectedReposForOrgSecret200Response = apiInstance.actionsListSelectedReposForOrgVariable(org, name, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListSelectedReposForOrgVariable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListSelectedReposForOrgVariable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **name** | **kotlin.String**| The name of the variable. |
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**ActionsListSelectedReposForOrgSecret200Response**](ActionsListSelectedReposForOrgSecret200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListSelectedRepositoriesEnabledGithubActionsOrganization"></a>
# **actionsListSelectedRepositoriesEnabledGithubActionsOrganization**
> ActionsListSelectedRepositoriesEnabledGithubActionsOrganization200Response actionsListSelectedRepositoriesEnabledGithubActionsOrganization(org, perPage, page)

List selected repositories enabled for GitHub Actions in an organization

Lists the selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for &#x60;enabled_repositories&#x60; must be configured to &#x60;selected&#x60;. For more information, see \&quot;[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListSelectedRepositoriesEnabledGithubActionsOrganization200Response = apiInstance.actionsListSelectedRepositoriesEnabledGithubActionsOrganization(org, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListSelectedRepositoriesEnabledGithubActionsOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListSelectedRepositoriesEnabledGithubActionsOrganization")
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

[**ActionsListSelectedRepositoriesEnabledGithubActionsOrganization200Response**](ActionsListSelectedRepositoriesEnabledGithubActionsOrganization200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListSelfHostedRunnersForOrg"></a>
# **actionsListSelfHostedRunnersForOrg**
> ActionsListSelfHostedRunnersForOrg200Response actionsListSelfHostedRunnersForOrg(org, name, perPage, page)

List self-hosted runners for an organization

Lists all self-hosted runners configured in an organization.  Authenticated users must have admin access to the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, the &#x60;repo&#x60; scope is also required.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val name : kotlin.String = name_example // kotlin.String | The name of a self-hosted runner.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListSelfHostedRunnersForOrg200Response = apiInstance.actionsListSelfHostedRunnersForOrg(org, name, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListSelfHostedRunnersForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListSelfHostedRunnersForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **name** | **kotlin.String**| The name of a self-hosted runner. | [optional] [default to &quot;push&quot;]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**ActionsListSelfHostedRunnersForOrg200Response**](ActionsListSelfHostedRunnersForOrg200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListSelfHostedRunnersForRepo"></a>
# **actionsListSelfHostedRunnersForRepo**
> ActionsListSelfHostedRunnersForOrg200Response actionsListSelfHostedRunnersForRepo(owner, repo, name, perPage, page)

List self-hosted runners for a repository

Lists all self-hosted runners configured in a repository.  Authenticated users must have admin access to the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val name : kotlin.String = name_example // kotlin.String | The name of a self-hosted runner.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : ActionsListSelfHostedRunnersForOrg200Response = apiInstance.actionsListSelfHostedRunnersForRepo(owner, repo, name, perPage, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListSelfHostedRunnersForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListSelfHostedRunnersForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **name** | **kotlin.String**| The name of a self-hosted runner. | [optional]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]

### Return type

[**ActionsListSelfHostedRunnersForOrg200Response**](ActionsListSelfHostedRunnersForOrg200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListWorkflowRunArtifacts"></a>
# **actionsListWorkflowRunArtifacts**
> ActionsListArtifactsForRepo200Response actionsListWorkflowRunArtifacts(owner, repo, runId, perPage, page, name)

List workflow run artifacts

Lists artifacts for a workflow run.  Anyone with read access to the repository can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val name : kotlin.String = name_example // kotlin.String | The name field of an artifact. When specified, only artifacts with this name will be returned.
try {
    val result : ActionsListArtifactsForRepo200Response = apiInstance.actionsListWorkflowRunArtifacts(owner, repo, runId, perPage, page, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListWorkflowRunArtifacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListWorkflowRunArtifacts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **name** | **kotlin.String**| The name field of an artifact. When specified, only artifacts with this name will be returned. | [optional]

### Return type

[**ActionsListArtifactsForRepo200Response**](ActionsListArtifactsForRepo200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListWorkflowRuns"></a>
# **actionsListWorkflowRuns**
> ActionsListWorkflowRunsForRepo200Response actionsListWorkflowRuns(owner, repo, workflowId, actor, branch, event, status, perPage, page, created, excludePullRequests, checkSuiteId, headSha)

List workflow runs for a workflow

List all workflow runs for a workflow. You can replace &#x60;workflow_id&#x60; with the workflow file name. For example, you could use &#x60;main.yaml&#x60;. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#parameters).  Anyone with read access to the repository can use this endpoint  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val workflowId : String =  // String | The ID of the workflow. You can also pass the workflow file name as a string.
val actor : kotlin.String = actor_example // kotlin.String | Returns someone's workflow runs. Use the login for the user who created the `push` associated with the check suite or workflow run.
val branch : kotlin.String = branch_example // kotlin.String | Returns workflow runs associated with a branch. Use the name of the branch of the `push`.
val event : kotlin.String = event_example // kotlin.String | Returns workflow run triggered by the event you specify. For example, `push`, `pull_request` or `issue`. For more information, see \"[Events that trigger workflows](https://docs.github.com/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows).\"
val status : kotlin.String = status_example // kotlin.String | Returns workflow runs with the check run `status` or `conclusion` that you specify. For example, a conclusion can be `success` or a status can be `in_progress`. Only GitHub Actions can set a status of `waiting`, `pending`, or `requested`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val created : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Returns workflow runs created within the given date-time range. For more information on the syntax, see \"[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\"
val excludePullRequests : kotlin.Boolean = true // kotlin.Boolean | If `true` pull requests are omitted from the response (empty array).
val checkSuiteId : kotlin.Int = 56 // kotlin.Int | Returns workflow runs with the `check_suite_id` that you specify.
val headSha : kotlin.String = headSha_example // kotlin.String | Only returns workflow runs that are associated with the specified `head_sha`.
try {
    val result : ActionsListWorkflowRunsForRepo200Response = apiInstance.actionsListWorkflowRuns(owner, repo, workflowId, actor, branch, event, status, perPage, page, created, excludePullRequests, checkSuiteId, headSha)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListWorkflowRuns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListWorkflowRuns")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **workflowId** | [**String**](.md)| The ID of the workflow. You can also pass the workflow file name as a string. |
 **actor** | **kotlin.String**| Returns someone&#39;s workflow runs. Use the login for the user who created the &#x60;push&#x60; associated with the check suite or workflow run. | [optional]
 **branch** | **kotlin.String**| Returns workflow runs associated with a branch. Use the name of the branch of the &#x60;push&#x60;. | [optional]
 **event** | **kotlin.String**| Returns workflow run triggered by the event you specify. For example, &#x60;push&#x60;, &#x60;pull_request&#x60; or &#x60;issue&#x60;. For more information, see \&quot;[Events that trigger workflows](https://docs.github.com/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows).\&quot; | [optional]
 **status** | **kotlin.String**| Returns workflow runs with the check run &#x60;status&#x60; or &#x60;conclusion&#x60; that you specify. For example, a conclusion can be &#x60;success&#x60; or a status can be &#x60;in_progress&#x60;. Only GitHub Actions can set a status of &#x60;waiting&#x60;, &#x60;pending&#x60;, or &#x60;requested&#x60;. | [optional] [enum: completed, action_required, cancelled, failure, neutral, skipped, stale, success, timed_out, in_progress, queued, requested, waiting, pending]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **created** | **kotlinx.datetime.Instant**| Returns workflow runs created within the given date-time range. For more information on the syntax, see \&quot;[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\&quot; | [optional]
 **excludePullRequests** | **kotlin.Boolean**| If &#x60;true&#x60; pull requests are omitted from the response (empty array). | [optional] [default to false]
 **checkSuiteId** | **kotlin.Int**| Returns workflow runs with the &#x60;check_suite_id&#x60; that you specify. | [optional]
 **headSha** | **kotlin.String**| Only returns workflow runs that are associated with the specified &#x60;head_sha&#x60;. | [optional]

### Return type

[**ActionsListWorkflowRunsForRepo200Response**](ActionsListWorkflowRunsForRepo200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsListWorkflowRunsForRepo"></a>
# **actionsListWorkflowRunsForRepo**
> ActionsListWorkflowRunsForRepo200Response actionsListWorkflowRunsForRepo(owner, repo, actor, branch, event, status, perPage, page, created, excludePullRequests, checkSuiteId, headSha)

List workflow runs for a repository

Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#parameters).  Anyone with read access to the repository can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val actor : kotlin.String = actor_example // kotlin.String | Returns someone's workflow runs. Use the login for the user who created the `push` associated with the check suite or workflow run.
val branch : kotlin.String = branch_example // kotlin.String | Returns workflow runs associated with a branch. Use the name of the branch of the `push`.
val event : kotlin.String = event_example // kotlin.String | Returns workflow run triggered by the event you specify. For example, `push`, `pull_request` or `issue`. For more information, see \"[Events that trigger workflows](https://docs.github.com/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows).\"
val status : kotlin.String = status_example // kotlin.String | Returns workflow runs with the check run `status` or `conclusion` that you specify. For example, a conclusion can be `success` or a status can be `in_progress`. Only GitHub Actions can set a status of `waiting`, `pending`, or `requested`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val created : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Returns workflow runs created within the given date-time range. For more information on the syntax, see \"[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\"
val excludePullRequests : kotlin.Boolean = true // kotlin.Boolean | If `true` pull requests are omitted from the response (empty array).
val checkSuiteId : kotlin.Int = 56 // kotlin.Int | Returns workflow runs with the `check_suite_id` that you specify.
val headSha : kotlin.String = headSha_example // kotlin.String | Only returns workflow runs that are associated with the specified `head_sha`.
try {
    val result : ActionsListWorkflowRunsForRepo200Response = apiInstance.actionsListWorkflowRunsForRepo(owner, repo, actor, branch, event, status, perPage, page, created, excludePullRequests, checkSuiteId, headSha)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsListWorkflowRunsForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsListWorkflowRunsForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **actor** | **kotlin.String**| Returns someone&#39;s workflow runs. Use the login for the user who created the &#x60;push&#x60; associated with the check suite or workflow run. | [optional]
 **branch** | **kotlin.String**| Returns workflow runs associated with a branch. Use the name of the branch of the &#x60;push&#x60;. | [optional]
 **event** | **kotlin.String**| Returns workflow run triggered by the event you specify. For example, &#x60;push&#x60;, &#x60;pull_request&#x60; or &#x60;issue&#x60;. For more information, see \&quot;[Events that trigger workflows](https://docs.github.com/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows).\&quot; | [optional]
 **status** | **kotlin.String**| Returns workflow runs with the check run &#x60;status&#x60; or &#x60;conclusion&#x60; that you specify. For example, a conclusion can be &#x60;success&#x60; or a status can be &#x60;in_progress&#x60;. Only GitHub Actions can set a status of &#x60;waiting&#x60;, &#x60;pending&#x60;, or &#x60;requested&#x60;. | [optional] [enum: completed, action_required, cancelled, failure, neutral, skipped, stale, success, timed_out, in_progress, queued, requested, waiting, pending]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **created** | **kotlinx.datetime.Instant**| Returns workflow runs created within the given date-time range. For more information on the syntax, see \&quot;[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates).\&quot; | [optional]
 **excludePullRequests** | **kotlin.Boolean**| If &#x60;true&#x60; pull requests are omitted from the response (empty array). | [optional] [default to false]
 **checkSuiteId** | **kotlin.Int**| Returns workflow runs with the &#x60;check_suite_id&#x60; that you specify. | [optional]
 **headSha** | **kotlin.String**| Only returns workflow runs that are associated with the specified &#x60;head_sha&#x60;. | [optional]

### Return type

[**ActionsListWorkflowRunsForRepo200Response**](ActionsListWorkflowRunsForRepo200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsReRunJobForWorkflowRun"></a>
# **actionsReRunJobForWorkflowRun**
> kotlin.Any actionsReRunJobForWorkflowRun(owner, repo, jobId, actionsReRunJobForWorkflowRunRequest)

Re-run a job from a workflow run

Re-run a job and its dependent jobs in a workflow run.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val jobId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the job.
val actionsReRunJobForWorkflowRunRequest : ActionsReRunJobForWorkflowRunRequest =  // ActionsReRunJobForWorkflowRunRequest | 
try {
    val result : kotlin.Any = apiInstance.actionsReRunJobForWorkflowRun(owner, repo, jobId, actionsReRunJobForWorkflowRunRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsReRunJobForWorkflowRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsReRunJobForWorkflowRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **jobId** | **kotlin.Int**| The unique identifier of the job. |
 **actionsReRunJobForWorkflowRunRequest** | [**ActionsReRunJobForWorkflowRunRequest**](ActionsReRunJobForWorkflowRunRequest.md)|  | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="actionsReRunWorkflow"></a>
# **actionsReRunWorkflow**
> kotlin.Any actionsReRunWorkflow(owner, repo, runId, actionsReRunJobForWorkflowRunRequest)

Re-run a workflow

Re-runs your workflow run using its &#x60;id&#x60;.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
val actionsReRunJobForWorkflowRunRequest : ActionsReRunJobForWorkflowRunRequest =  // ActionsReRunJobForWorkflowRunRequest | 
try {
    val result : kotlin.Any = apiInstance.actionsReRunWorkflow(owner, repo, runId, actionsReRunJobForWorkflowRunRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsReRunWorkflow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsReRunWorkflow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |
 **actionsReRunJobForWorkflowRunRequest** | [**ActionsReRunJobForWorkflowRunRequest**](ActionsReRunJobForWorkflowRunRequest.md)|  | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="actionsReRunWorkflowFailedJobs"></a>
# **actionsReRunWorkflowFailedJobs**
> kotlin.Any actionsReRunWorkflowFailedJobs(owner, repo, runId, actionsReRunJobForWorkflowRunRequest)

Re-run failed jobs from a workflow run

Re-run all of the failed jobs and their dependent jobs in a workflow run using the &#x60;id&#x60; of the workflow run.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
val actionsReRunJobForWorkflowRunRequest : ActionsReRunJobForWorkflowRunRequest =  // ActionsReRunJobForWorkflowRunRequest | 
try {
    val result : kotlin.Any = apiInstance.actionsReRunWorkflowFailedJobs(owner, repo, runId, actionsReRunJobForWorkflowRunRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsReRunWorkflowFailedJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsReRunWorkflowFailedJobs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |
 **actionsReRunJobForWorkflowRunRequest** | [**ActionsReRunJobForWorkflowRunRequest**](ActionsReRunJobForWorkflowRunRequest.md)|  | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="actionsRemoveAllCustomLabelsFromSelfHostedRunnerForOrg"></a>
# **actionsRemoveAllCustomLabelsFromSelfHostedRunnerForOrg**
> kotlin.Any actionsRemoveAllCustomLabelsFromSelfHostedRunnerForOrg(org, runnerId)

Remove all custom labels from a self-hosted runner for an organization

Remove all custom labels from a self-hosted runner configured in an organization. Returns the remaining read-only labels from the runner.  Authenticated users must have admin access to the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, the &#x60;repo&#x60; scope is also required.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val runnerId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the self-hosted runner.
try {
    val result : kotlin.Any = apiInstance.actionsRemoveAllCustomLabelsFromSelfHostedRunnerForOrg(org, runnerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsRemoveAllCustomLabelsFromSelfHostedRunnerForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsRemoveAllCustomLabelsFromSelfHostedRunnerForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **runnerId** | **kotlin.Int**| Unique identifier of the self-hosted runner. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsRemoveAllCustomLabelsFromSelfHostedRunnerForRepo"></a>
# **actionsRemoveAllCustomLabelsFromSelfHostedRunnerForRepo**
> kotlin.Any actionsRemoveAllCustomLabelsFromSelfHostedRunnerForRepo(owner, repo, runnerId)

Remove all custom labels from a self-hosted runner for a repository

Remove all custom labels from a self-hosted runner configured in a repository. Returns the remaining read-only labels from the runner.  Authenticated users must have admin access to the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runnerId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the self-hosted runner.
try {
    val result : kotlin.Any = apiInstance.actionsRemoveAllCustomLabelsFromSelfHostedRunnerForRepo(owner, repo, runnerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsRemoveAllCustomLabelsFromSelfHostedRunnerForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsRemoveAllCustomLabelsFromSelfHostedRunnerForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runnerId** | **kotlin.Int**| Unique identifier of the self-hosted runner. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsRemoveCustomLabelFromSelfHostedRunnerForOrg"></a>
# **actionsRemoveCustomLabelFromSelfHostedRunnerForOrg**
> kotlin.Any actionsRemoveCustomLabelFromSelfHostedRunnerForOrg(org, runnerId, name)

Remove a custom label from a self-hosted runner for an organization

Remove a custom label from a self-hosted runner configured in an organization. Returns the remaining labels from the runner.  This endpoint returns a &#x60;404 Not Found&#x60; status if the custom label is not present on the runner.  Authenticated users must have admin access to the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, the &#x60;repo&#x60; scope is also required.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val runnerId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the self-hosted runner.
val name : kotlin.String = name_example // kotlin.String | The name of a self-hosted runner's custom label.
try {
    val result : kotlin.Any = apiInstance.actionsRemoveCustomLabelFromSelfHostedRunnerForOrg(org, runnerId, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsRemoveCustomLabelFromSelfHostedRunnerForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsRemoveCustomLabelFromSelfHostedRunnerForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **runnerId** | **kotlin.Int**| Unique identifier of the self-hosted runner. |
 **name** | **kotlin.String**| The name of a self-hosted runner&#39;s custom label. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsRemoveCustomLabelFromSelfHostedRunnerForRepo"></a>
# **actionsRemoveCustomLabelFromSelfHostedRunnerForRepo**
> kotlin.Any actionsRemoveCustomLabelFromSelfHostedRunnerForRepo(owner, repo, runnerId, name)

Remove a custom label from a self-hosted runner for a repository

Remove a custom label from a self-hosted runner configured in a repository. Returns the remaining labels from the runner.  This endpoint returns a &#x60;404 Not Found&#x60; status if the custom label is not present on the runner.  Authenticated users must have admin access to the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runnerId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the self-hosted runner.
val name : kotlin.String = name_example // kotlin.String | The name of a self-hosted runner's custom label.
try {
    val result : kotlin.Any = apiInstance.actionsRemoveCustomLabelFromSelfHostedRunnerForRepo(owner, repo, runnerId, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsRemoveCustomLabelFromSelfHostedRunnerForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsRemoveCustomLabelFromSelfHostedRunnerForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runnerId** | **kotlin.Int**| Unique identifier of the self-hosted runner. |
 **name** | **kotlin.String**| The name of a self-hosted runner&#39;s custom label. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="actionsRemoveSelectedRepoFromOrgSecret"></a>
# **actionsRemoveSelectedRepoFromOrgSecret**
> actionsRemoveSelectedRepoFromOrgSecret(org, secretName, repositoryId)

Remove selected repository from an organization secret

Removes a repository from an organization secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/actions/secrets#create-or-update-an-organization-secret).  Authenticated users must have collaborator access to a repository to create, update, or read secrets.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, the &#x60;repo&#x60; scope is also required.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val repositoryId : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.actionsRemoveSelectedRepoFromOrgSecret(org, secretName, repositoryId)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsRemoveSelectedRepoFromOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsRemoveSelectedRepoFromOrgSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |
 **repositoryId** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsRemoveSelectedRepoFromOrgVariable"></a>
# **actionsRemoveSelectedRepoFromOrgVariable**
> actionsRemoveSelectedRepoFromOrgVariable(org, name, repositoryId)

Remove selected repository from an organization variable

Removes a repository from an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their &#x60;visibility&#x60; field set to &#x60;selected&#x60;.  Authenticated users must have collaborator access to a repository to create, update, or read variables.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, the &#x60;repo&#x60; scope is also required.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val name : kotlin.String = name_example // kotlin.String | The name of the variable.
val repositoryId : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.actionsRemoveSelectedRepoFromOrgVariable(org, name, repositoryId)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsRemoveSelectedRepoFromOrgVariable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsRemoveSelectedRepoFromOrgVariable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **name** | **kotlin.String**| The name of the variable. |
 **repositoryId** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="actionsReviewCustomGatesForRun"></a>
# **actionsReviewCustomGatesForRun**
> actionsReviewCustomGatesForRun(owner, repo, runId, actionsReviewCustomGatesForRunRequest)

Review custom deployment protection rules for a workflow run

Approve or reject custom deployment protection rules provided by a GitHub App for a workflow run. For more information, see \&quot;[Using environments for deployment](https://docs.github.com/actions/deployment/targeting-different-environments/using-environments-for-deployment).\&quot;  **Note:** GitHub Apps can only review their own custom deployment protection rules. To approve or reject pending deployments that are waiting for review from a specific person or team, see [&#x60;POST /repos/{owner}/{repo}/actions/runs/{run_id}/pending_deployments&#x60;](/rest/actions/workflow-runs#review-pending-deployments-for-a-workflow-run).  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint with a private repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
val actionsReviewCustomGatesForRunRequest : ActionsReviewCustomGatesForRunRequest = {"environment_name":"prod-eus","state":"approved","comment":"All health checks passed."} // ActionsReviewCustomGatesForRunRequest | 
try {
    apiInstance.actionsReviewCustomGatesForRun(owner, repo, runId, actionsReviewCustomGatesForRunRequest)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsReviewCustomGatesForRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsReviewCustomGatesForRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |
 **actionsReviewCustomGatesForRunRequest** | [**ActionsReviewCustomGatesForRunRequest**](ActionsReviewCustomGatesForRunRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="actionsReviewPendingDeploymentsForRun"></a>
# **actionsReviewPendingDeploymentsForRun**
> kotlin.collections.List&lt;Deployment&gt; actionsReviewPendingDeploymentsForRun(owner, repo, runId, actionsReviewPendingDeploymentsForRunRequest)

Review pending deployments for a workflow run

Approve or reject pending deployments that are waiting on approval by a required reviewer.  Required reviewers with read access to the repository contents and deployments can use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the workflow run.
val actionsReviewPendingDeploymentsForRunRequest : ActionsReviewPendingDeploymentsForRunRequest = {"environment_ids":[161171787],"state":"approved","comment":"Ship it!"} // ActionsReviewPendingDeploymentsForRunRequest | 
try {
    val result : kotlin.collections.List<Deployment> = apiInstance.actionsReviewPendingDeploymentsForRun(owner, repo, runId, actionsReviewPendingDeploymentsForRunRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsReviewPendingDeploymentsForRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsReviewPendingDeploymentsForRun")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runId** | **kotlin.Int**| The unique identifier of the workflow run. |
 **actionsReviewPendingDeploymentsForRunRequest** | [**ActionsReviewPendingDeploymentsForRunRequest**](ActionsReviewPendingDeploymentsForRunRequest.md)|  |

### Return type

[**kotlin.collections.List&lt;Deployment&gt;**](Deployment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="actionsSetAllowedActionsOrganization"></a>
# **actionsSetAllowedActionsOrganization**
> actionsSetAllowedActionsOrganization(org, selectedActions)

Set allowed actions and reusable workflows for an organization

Sets the actions and reusable workflows that are allowed in an organization. To use this endpoint, the organization permission policy for &#x60;allowed_actions&#x60; must be configured to &#x60;selected&#x60;. For more information, see \&quot;[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val selectedActions : SelectedActions =  // SelectedActions | 
try {
    apiInstance.actionsSetAllowedActionsOrganization(org, selectedActions)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsSetAllowedActionsOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsSetAllowedActionsOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **selectedActions** | [**SelectedActions**](SelectedActions.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="actionsSetAllowedActionsRepository"></a>
# **actionsSetAllowedActionsRepository**
> actionsSetAllowedActionsRepository(owner, repo, selectedActions)

Set allowed actions and reusable workflows for a repository

Sets the actions and reusable workflows that are allowed in a repository. To use this endpoint, the repository permission policy for &#x60;allowed_actions&#x60; must be configured to &#x60;selected&#x60;. For more information, see \&quot;[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val selectedActions : SelectedActions =  // SelectedActions | 
try {
    apiInstance.actionsSetAllowedActionsRepository(owner, repo, selectedActions)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsSetAllowedActionsRepository")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsSetAllowedActionsRepository")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **selectedActions** | [**SelectedActions**](SelectedActions.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="actionsSetCustomLabelsForSelfHostedRunnerForOrg"></a>
# **actionsSetCustomLabelsForSelfHostedRunnerForOrg**
> kotlin.Any actionsSetCustomLabelsForSelfHostedRunnerForOrg(org, runnerId, actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest)

Set custom labels for a self-hosted runner for an organization

Remove all previous custom labels and set the new custom labels for a specific self-hosted runner configured in an organization.  Authenticated users must have admin access to the organization to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, the &#x60;repo&#x60; scope is also required.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val runnerId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the self-hosted runner.
val actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest : ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest = {"labels":["gpu","accelerated"]} // ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest | 
try {
    val result : kotlin.Any = apiInstance.actionsSetCustomLabelsForSelfHostedRunnerForOrg(org, runnerId, actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsSetCustomLabelsForSelfHostedRunnerForOrg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsSetCustomLabelsForSelfHostedRunnerForOrg")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **runnerId** | **kotlin.Int**| Unique identifier of the self-hosted runner. |
 **actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest** | [**ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest**](ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="actionsSetCustomLabelsForSelfHostedRunnerForRepo"></a>
# **actionsSetCustomLabelsForSelfHostedRunnerForRepo**
> kotlin.Any actionsSetCustomLabelsForSelfHostedRunnerForRepo(owner, repo, runnerId, actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest)

Set custom labels for a self-hosted runner for a repository

Remove all previous custom labels and set the new custom labels for a specific self-hosted runner configured in a repository.  Authenticated users must have admin access to the repository to use this endpoint.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val runnerId : kotlin.Int = 56 // kotlin.Int | Unique identifier of the self-hosted runner.
val actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest : ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest = {labels=[gpu, accelerated]} // ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest | 
try {
    val result : kotlin.Any = apiInstance.actionsSetCustomLabelsForSelfHostedRunnerForRepo(owner, repo, runnerId, actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsSetCustomLabelsForSelfHostedRunnerForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsSetCustomLabelsForSelfHostedRunnerForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **runnerId** | **kotlin.Int**| Unique identifier of the self-hosted runner. |
 **actionsSetCustomLabelsForSelfHostedRunnerForOrgRequest** | [**ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest**](ActionsSetCustomLabelsForSelfHostedRunnerForOrgRequest.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="actionsSetCustomOidcSubClaimForRepo"></a>
# **actionsSetCustomOidcSubClaimForRepo**
> kotlin.Any actionsSetCustomOidcSubClaimForRepo(owner, repo, actionsOIDCSubjectCustomizationForARepository)

Set the customization template for an OIDC subject claim for a repository

Sets the customization template and &#x60;opt-in&#x60; or &#x60;opt-out&#x60; flag for an OpenID Connect (OIDC) subject claim for a repository.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val actionsOIDCSubjectCustomizationForARepository : ActionsOIDCSubjectCustomizationForARepository = {use_default=false, include_claim_keys=[repo, context]} // ActionsOIDCSubjectCustomizationForARepository | 
try {
    val result : kotlin.Any = apiInstance.actionsSetCustomOidcSubClaimForRepo(owner, repo, actionsOIDCSubjectCustomizationForARepository)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsSetCustomOidcSubClaimForRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsSetCustomOidcSubClaimForRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **actionsOIDCSubjectCustomizationForARepository** | [**ActionsOIDCSubjectCustomizationForARepository**](ActionsOIDCSubjectCustomizationForARepository.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/scim+json

<a id="actionsSetGithubActionsDefaultWorkflowPermissionsOrganization"></a>
# **actionsSetGithubActionsDefaultWorkflowPermissionsOrganization**
> actionsSetGithubActionsDefaultWorkflowPermissionsOrganization(org, actionsSetDefaultWorkflowPermissions)

Set default workflow permissions for an organization

Sets the default workflow permissions granted to the &#x60;GITHUB_TOKEN&#x60; when running workflows in an organization, and sets if GitHub Actions can submit approving pull request reviews. For more information, see \&quot;[Setting the permissions of the GITHUB_TOKEN for your organization](https://docs.github.com/organizations/managing-organization-settings/disabling-or-limiting-github-actions-for-your-organization#setting-the-permissions-of-the-github_token-for-your-organization).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val actionsSetDefaultWorkflowPermissions : ActionsSetDefaultWorkflowPermissions =  // ActionsSetDefaultWorkflowPermissions | 
try {
    apiInstance.actionsSetGithubActionsDefaultWorkflowPermissionsOrganization(org, actionsSetDefaultWorkflowPermissions)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsSetGithubActionsDefaultWorkflowPermissionsOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsSetGithubActionsDefaultWorkflowPermissionsOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **actionsSetDefaultWorkflowPermissions** | [**ActionsSetDefaultWorkflowPermissions**](ActionsSetDefaultWorkflowPermissions.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="actionsSetGithubActionsDefaultWorkflowPermissionsRepository"></a>
# **actionsSetGithubActionsDefaultWorkflowPermissionsRepository**
> actionsSetGithubActionsDefaultWorkflowPermissionsRepository(owner, repo, actionsSetDefaultWorkflowPermissions)

Set default workflow permissions for a repository

Sets the default workflow permissions granted to the &#x60;GITHUB_TOKEN&#x60; when running workflows in a repository, and sets if GitHub Actions can submit approving pull request reviews. For more information, see \&quot;[Setting the permissions of the GITHUB_TOKEN for your repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#setting-the-permissions-of-the-github_token-for-your-repository).\&quot;  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val actionsSetDefaultWorkflowPermissions : ActionsSetDefaultWorkflowPermissions =  // ActionsSetDefaultWorkflowPermissions | 
try {
    apiInstance.actionsSetGithubActionsDefaultWorkflowPermissionsRepository(owner, repo, actionsSetDefaultWorkflowPermissions)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsSetGithubActionsDefaultWorkflowPermissionsRepository")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsSetGithubActionsDefaultWorkflowPermissionsRepository")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **actionsSetDefaultWorkflowPermissions** | [**ActionsSetDefaultWorkflowPermissions**](ActionsSetDefaultWorkflowPermissions.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="actionsSetGithubActionsPermissionsOrganization"></a>
# **actionsSetGithubActionsPermissionsOrganization**
> actionsSetGithubActionsPermissionsOrganization(org, actionsSetGithubActionsPermissionsOrganizationRequest)

Set GitHub Actions permissions for an organization

Sets the GitHub Actions permissions policy for repositories and allowed actions and reusable workflows in an organization.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val actionsSetGithubActionsPermissionsOrganizationRequest : ActionsSetGithubActionsPermissionsOrganizationRequest = {"enabled_repositories":"all","allowed_actions":"selected"} // ActionsSetGithubActionsPermissionsOrganizationRequest | 
try {
    apiInstance.actionsSetGithubActionsPermissionsOrganization(org, actionsSetGithubActionsPermissionsOrganizationRequest)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsSetGithubActionsPermissionsOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsSetGithubActionsPermissionsOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **actionsSetGithubActionsPermissionsOrganizationRequest** | [**ActionsSetGithubActionsPermissionsOrganizationRequest**](ActionsSetGithubActionsPermissionsOrganizationRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="actionsSetGithubActionsPermissionsRepository"></a>
# **actionsSetGithubActionsPermissionsRepository**
> actionsSetGithubActionsPermissionsRepository(owner, repo, actionsSetGithubActionsPermissionsRepositoryRequest)

Set GitHub Actions permissions for a repository

Sets the GitHub Actions permissions policy for enabling GitHub Actions and allowed actions and reusable workflows in the repository.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val actionsSetGithubActionsPermissionsRepositoryRequest : ActionsSetGithubActionsPermissionsRepositoryRequest = {"enabled":true,"allowed_actions":"selected"} // ActionsSetGithubActionsPermissionsRepositoryRequest | 
try {
    apiInstance.actionsSetGithubActionsPermissionsRepository(owner, repo, actionsSetGithubActionsPermissionsRepositoryRequest)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsSetGithubActionsPermissionsRepository")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsSetGithubActionsPermissionsRepository")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **actionsSetGithubActionsPermissionsRepositoryRequest** | [**ActionsSetGithubActionsPermissionsRepositoryRequest**](ActionsSetGithubActionsPermissionsRepositoryRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="actionsSetSelectedReposForOrgSecret"></a>
# **actionsSetSelectedReposForOrgSecret**
> actionsSetSelectedReposForOrgSecret(org, secretName, actionsSetSelectedReposForOrgSecretRequest)

Set selected repositories for an organization secret

Replaces all repositories for an organization secret when the &#x60;visibility&#x60; for repository access is set to &#x60;selected&#x60;. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/actions/secrets#create-or-update-an-organization-secret).  Authenticated users must have collaborator access to a repository to create, update, or read secrets.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, the &#x60;repo&#x60; scope is also required.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val secretName : kotlin.String = secretName_example // kotlin.String | The name of the secret.
val actionsSetSelectedReposForOrgSecretRequest : ActionsSetSelectedReposForOrgSecretRequest = {"selected_repository_ids":[64780797]} // ActionsSetSelectedReposForOrgSecretRequest | 
try {
    apiInstance.actionsSetSelectedReposForOrgSecret(org, secretName, actionsSetSelectedReposForOrgSecretRequest)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsSetSelectedReposForOrgSecret")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsSetSelectedReposForOrgSecret")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **secretName** | **kotlin.String**| The name of the secret. |
 **actionsSetSelectedReposForOrgSecretRequest** | [**ActionsSetSelectedReposForOrgSecretRequest**](ActionsSetSelectedReposForOrgSecretRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="actionsSetSelectedReposForOrgVariable"></a>
# **actionsSetSelectedReposForOrgVariable**
> actionsSetSelectedReposForOrgVariable(org, name, actionsSetSelectedReposForOrgVariableRequest)

Set selected repositories for an organization variable

Replaces all repositories for an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their &#x60;visibility&#x60; field set to &#x60;selected&#x60;.  Authenticated users must have collaborator access to a repository to create, update, or read variables.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, the &#x60;repo&#x60; scope is also required.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val name : kotlin.String = name_example // kotlin.String | The name of the variable.
val actionsSetSelectedReposForOrgVariableRequest : ActionsSetSelectedReposForOrgVariableRequest = {selected_repository_ids=[64780797]} // ActionsSetSelectedReposForOrgVariableRequest | 
try {
    apiInstance.actionsSetSelectedReposForOrgVariable(org, name, actionsSetSelectedReposForOrgVariableRequest)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsSetSelectedReposForOrgVariable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsSetSelectedReposForOrgVariable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **name** | **kotlin.String**| The name of the variable. |
 **actionsSetSelectedReposForOrgVariableRequest** | [**ActionsSetSelectedReposForOrgVariableRequest**](ActionsSetSelectedReposForOrgVariableRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="actionsSetSelectedRepositoriesEnabledGithubActionsOrganization"></a>
# **actionsSetSelectedRepositoriesEnabledGithubActionsOrganization**
> actionsSetSelectedRepositoriesEnabledGithubActionsOrganization(org, actionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest)

Set selected repositories enabled for GitHub Actions in an organization

Replaces the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for &#x60;enabled_repositories&#x60; must be configured to &#x60;selected&#x60;. For more information, see \&quot;[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).\&quot;   OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val actionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest : ActionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest = {"selected_repository_ids":[32,42]} // ActionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest | 
try {
    apiInstance.actionsSetSelectedRepositoriesEnabledGithubActionsOrganization(org, actionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsSetSelectedRepositoriesEnabledGithubActionsOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsSetSelectedRepositoriesEnabledGithubActionsOrganization")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **actionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest** | [**ActionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest**](ActionsSetSelectedRepositoriesEnabledGithubActionsOrganizationRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="actionsSetWorkflowAccessToRepository"></a>
# **actionsSetWorkflowAccessToRepository**
> actionsSetWorkflowAccessToRepository(owner, repo, actionsWorkflowAccessToRepository)

Set the level of access for workflows outside of the repository

Sets the level of access that workflows outside of the repository have to actions and reusable workflows in the repository. This endpoint only applies to private repositories. For more information, see \&quot;[Allowing access to components in a private repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#allowing-access-to-components-in-a-private-repository)\&quot;.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val actionsWorkflowAccessToRepository : ActionsWorkflowAccessToRepository =  // ActionsWorkflowAccessToRepository | 
try {
    apiInstance.actionsSetWorkflowAccessToRepository(owner, repo, actionsWorkflowAccessToRepository)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsSetWorkflowAccessToRepository")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsSetWorkflowAccessToRepository")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **actionsWorkflowAccessToRepository** | [**ActionsWorkflowAccessToRepository**](ActionsWorkflowAccessToRepository.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="actionsUpdateEnvironmentVariable"></a>
# **actionsUpdateEnvironmentVariable**
> actionsUpdateEnvironmentVariable(owner, repo, name, environmentName, actionsUpdateRepoVariableRequest)

Update an environment variable

Updates an environment variable that you can reference in a GitHub Actions workflow.  Authenticated users must have collaborator access to a repository to create, update, or read variables.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val name : kotlin.String = name_example // kotlin.String | The name of the variable.
val environmentName : kotlin.String = environmentName_example // kotlin.String | The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with `%2F`.
val actionsUpdateRepoVariableRequest : ActionsUpdateRepoVariableRequest = {name=USERNAME, value=octocat} // ActionsUpdateRepoVariableRequest | 
try {
    apiInstance.actionsUpdateEnvironmentVariable(owner, repo, name, environmentName, actionsUpdateRepoVariableRequest)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsUpdateEnvironmentVariable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsUpdateEnvironmentVariable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **name** | **kotlin.String**| The name of the variable. |
 **environmentName** | **kotlin.String**| The name of the environment. The name must be URL encoded. For example, any slashes in the name must be replaced with &#x60;%2F&#x60;. |
 **actionsUpdateRepoVariableRequest** | [**ActionsUpdateRepoVariableRequest**](ActionsUpdateRepoVariableRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="actionsUpdateOrgVariable"></a>
# **actionsUpdateOrgVariable**
> actionsUpdateOrgVariable(org, name, actionsUpdateOrgVariableRequest)

Update an organization variable

Updates an organization variable that you can reference in a GitHub Actions workflow.  Authenticated users must have collaborator access to a repository to create, update, or read variables.  OAuth app tokens and personal access tokens (classic) need the &#x60;admin:org&#x60; scope to use this endpoint. If the repository is private, the &#x60;repo&#x60; scope is also required.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val org : kotlin.String = org_example // kotlin.String | The organization name. The name is not case sensitive.
val name : kotlin.String = name_example // kotlin.String | The name of the variable.
val actionsUpdateOrgVariableRequest : ActionsUpdateOrgVariableRequest = {name=USERNAME, value=octocat, visibility=selected, selected_repository_ids=[1296269, 1296280]} // ActionsUpdateOrgVariableRequest | 
try {
    apiInstance.actionsUpdateOrgVariable(org, name, actionsUpdateOrgVariableRequest)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsUpdateOrgVariable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsUpdateOrgVariable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org** | **kotlin.String**| The organization name. The name is not case sensitive. |
 **name** | **kotlin.String**| The name of the variable. |
 **actionsUpdateOrgVariableRequest** | [**ActionsUpdateOrgVariableRequest**](ActionsUpdateOrgVariableRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="actionsUpdateRepoVariable"></a>
# **actionsUpdateRepoVariable**
> actionsUpdateRepoVariable(owner, repo, name, actionsUpdateRepoVariableRequest)

Update a repository variable

Updates a repository variable that you can reference in a GitHub Actions workflow.  Authenticated users must have collaborator access to a repository to create, update, or read variables.  OAuth app tokens and personal access tokens (classic) need the &#x60;repo&#x60; scope to use this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActionsApi()
val owner : kotlin.String = owner_example // kotlin.String | The account owner of the repository. The name is not case sensitive.
val repo : kotlin.String = repo_example // kotlin.String | The name of the repository without the `.git` extension. The name is not case sensitive.
val name : kotlin.String = name_example // kotlin.String | The name of the variable.
val actionsUpdateRepoVariableRequest : ActionsUpdateRepoVariableRequest = {name=USERNAME, value=octocat} // ActionsUpdateRepoVariableRequest | 
try {
    apiInstance.actionsUpdateRepoVariable(owner, repo, name, actionsUpdateRepoVariableRequest)
} catch (e: ClientException) {
    println("4xx response calling ActionsApi#actionsUpdateRepoVariable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActionsApi#actionsUpdateRepoVariable")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| The account owner of the repository. The name is not case sensitive. |
 **repo** | **kotlin.String**| The name of the repository without the &#x60;.git&#x60; extension. The name is not case sensitive. |
 **name** | **kotlin.String**| The name of the variable. |
 **actionsUpdateRepoVariableRequest** | [**ActionsUpdateRepoVariableRequest**](ActionsUpdateRepoVariableRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

