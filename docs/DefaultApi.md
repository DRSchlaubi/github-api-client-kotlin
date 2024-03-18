# DefaultApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**branchProtectionConfigurationDisabled**](DefaultApi.md#branchProtectionConfigurationDisabled) | **POST** /branch-protection-configuration-disabled | This event occurs when there is a change to branch protection configurations for a repository. For more information, see \&quot;[About protected branches](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/defining-the-mergeability-of-pull-requests/about-protected-branches).\&quot; For information about using the APIs to manage branch protection rules, see \&quot;[Branch protection rule](https://docs.github.com/graphql/reference/objects#branchprotectionrule)\&quot; in the GraphQL documentation or \&quot;[Branch protection](https://docs.github.com/rest/branches/branch-protection)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository permission.
[**branchProtectionConfigurationEnabled**](DefaultApi.md#branchProtectionConfigurationEnabled) | **POST** /branch-protection-configuration-enabled | This event occurs when there is a change to branch protection configurations for a repository. For more information, see \&quot;[About protected branches](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/defining-the-mergeability-of-pull-requests/about-protected-branches).\&quot; For information about using the APIs to manage branch protection rules, see \&quot;[Branch protection rule](https://docs.github.com/graphql/reference/objects#branchprotectionrule)\&quot; in the GraphQL documentation or \&quot;[Branch protection](https://docs.github.com/rest/branches/branch-protection)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository permission.
[**branchProtectionRuleCreated**](DefaultApi.md#branchProtectionRuleCreated) | **POST** /branch-protection-rule-created | This event occurs when there is activity relating to branch protection rules. For more information, see \&quot;[About protected branches](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/defining-the-mergeability-of-pull-requests/about-protected-branches).\&quot; For information about the APIs to manage branch protection rules, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#branchprotectionrule) or \&quot;[Branch protection](https://docs.github.com/rest/branches/branch-protection)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository permission.
[**branchProtectionRuleDeleted**](DefaultApi.md#branchProtectionRuleDeleted) | **POST** /branch-protection-rule-deleted | This event occurs when there is activity relating to branch protection rules. For more information, see \&quot;[About protected branches](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/defining-the-mergeability-of-pull-requests/about-protected-branches).\&quot; For information about the APIs to manage branch protection rules, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#branchprotectionrule) or \&quot;[Branch protection](https://docs.github.com/rest/branches/branch-protection)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository permission.
[**branchProtectionRuleEdited**](DefaultApi.md#branchProtectionRuleEdited) | **POST** /branch-protection-rule-edited | This event occurs when there is activity relating to branch protection rules. For more information, see \&quot;[About protected branches](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/defining-the-mergeability-of-pull-requests/about-protected-branches).\&quot; For information about the APIs to manage branch protection rules, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#branchprotectionrule) or \&quot;[Branch protection](https://docs.github.com/rest/branches/branch-protection)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository permission.
[**callPublic**](DefaultApi.md#callPublic) | **POST** /public | This event occurs when repository visibility changes from private to public. For more information, see \&quot;[Setting repository visibility](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/managing-repository-settings/setting-repository-visibility).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.
[**checkRunCompleted**](DefaultApi.md#checkRunCompleted) | **POST** /check-run-completed | This event occurs when there is activity relating to a check run. For information about check runs, see \&quot;[Getting started with the Checks API](https://docs.github.com/rest/guides/getting-started-with-the-checks-api).\&quot; For information about the APIs to manage check runs, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#checkrun) or \&quot;[Check Runs](https://docs.github.com/rest/checks/runs)\&quot; in the REST API documentation.  For activity relating to check suites, use the &#x60;check-suite&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Checks\&quot; repository permission. To receive the &#x60;rerequested&#x60; and &#x60;requested_action&#x60; event types, the app must have at least write-level access for the \&quot;Checks\&quot; permission. GitHub Apps with write-level access for the \&quot;Checks\&quot; permission are automatically subscribed to this webhook event.  Repository and organization webhooks only receive payloads for the &#x60;created&#x60; and &#x60;completed&#x60; event types in repositories.  **Note**: The API only looks for pushes in the repository where the check run was created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array and a &#x60;null&#x60; value for &#x60;head_branch&#x60;.
[**checkRunCreated**](DefaultApi.md#checkRunCreated) | **POST** /check-run-created | This event occurs when there is activity relating to a check run. For information about check runs, see \&quot;[Getting started with the Checks API](https://docs.github.com/rest/guides/getting-started-with-the-checks-api).\&quot; For information about the APIs to manage check runs, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#checkrun) or \&quot;[Check Runs](https://docs.github.com/rest/checks/runs)\&quot; in the REST API documentation.  For activity relating to check suites, use the &#x60;check-suite&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Checks\&quot; repository permission. To receive the &#x60;rerequested&#x60; and &#x60;requested_action&#x60; event types, the app must have at least write-level access for the \&quot;Checks\&quot; permission. GitHub Apps with write-level access for the \&quot;Checks\&quot; permission are automatically subscribed to this webhook event.  Repository and organization webhooks only receive payloads for the &#x60;created&#x60; and &#x60;completed&#x60; event types in repositories.  **Note**: The API only looks for pushes in the repository where the check run was created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array and a &#x60;null&#x60; value for &#x60;head_branch&#x60;.
[**checkRunRequestedAction**](DefaultApi.md#checkRunRequestedAction) | **POST** /check-run-requested-action | This event occurs when there is activity relating to a check run. For information about check runs, see \&quot;[Getting started with the Checks API](https://docs.github.com/rest/guides/getting-started-with-the-checks-api).\&quot; For information about the APIs to manage check runs, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#checkrun) or \&quot;[Check Runs](https://docs.github.com/rest/checks/runs)\&quot; in the REST API documentation.  For activity relating to check suites, use the &#x60;check-suite&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Checks\&quot; repository permission. To receive the &#x60;rerequested&#x60; and &#x60;requested_action&#x60; event types, the app must have at least write-level access for the \&quot;Checks\&quot; permission. GitHub Apps with write-level access for the \&quot;Checks\&quot; permission are automatically subscribed to this webhook event.  Repository and organization webhooks only receive payloads for the &#x60;created&#x60; and &#x60;completed&#x60; event types in repositories.  **Note**: The API only looks for pushes in the repository where the check run was created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array and a &#x60;null&#x60; value for &#x60;head_branch&#x60;.
[**checkRunRerequested**](DefaultApi.md#checkRunRerequested) | **POST** /check-run-rerequested | This event occurs when there is activity relating to a check run. For information about check runs, see \&quot;[Getting started with the Checks API](https://docs.github.com/rest/guides/getting-started-with-the-checks-api).\&quot; For information about the APIs to manage check runs, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#checkrun) or \&quot;[Check Runs](https://docs.github.com/rest/checks/runs)\&quot; in the REST API documentation.  For activity relating to check suites, use the &#x60;check-suite&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Checks\&quot; repository permission. To receive the &#x60;rerequested&#x60; and &#x60;requested_action&#x60; event types, the app must have at least write-level access for the \&quot;Checks\&quot; permission. GitHub Apps with write-level access for the \&quot;Checks\&quot; permission are automatically subscribed to this webhook event.  Repository and organization webhooks only receive payloads for the &#x60;created&#x60; and &#x60;completed&#x60; event types in repositories.  **Note**: The API only looks for pushes in the repository where the check run was created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array and a &#x60;null&#x60; value for &#x60;head_branch&#x60;.
[**checkSuiteCompleted**](DefaultApi.md#checkSuiteCompleted) | **POST** /check-suite-completed | This event occurs when there is activity relating to a check suite. For information about check suites, see \&quot;[Getting started with the Checks API](https://docs.github.com/rest/guides/getting-started-with-the-checks-api).\&quot; For information about the APIs to manage check suites, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#checksuite) or \&quot;[Check Suites](https://docs.github.com/rest/checks/suites)\&quot; in the REST API documentation.  For activity relating to check runs, use the &#x60;check_run&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Checks\&quot; permission. To receive the &#x60;requested&#x60; and &#x60;rerequested&#x60; event types, the app must have at least write-level access for the \&quot;Checks\&quot; permission. GitHub Apps with write-level access for the \&quot;Checks\&quot; permission are automatically subscribed to this webhook event.  Repository and organization webhooks only receive payloads for the &#x60;completed&#x60; event types in repositories.  **Note**: The API only looks for pushes in the repository where the check suite was created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array and a &#x60;null&#x60; value for &#x60;head_branch&#x60;.
[**checkSuiteRequested**](DefaultApi.md#checkSuiteRequested) | **POST** /check-suite-requested | This event occurs when there is activity relating to a check suite. For information about check suites, see \&quot;[Getting started with the Checks API](https://docs.github.com/rest/guides/getting-started-with-the-checks-api).\&quot; For information about the APIs to manage check suites, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#checksuite) or \&quot;[Check Suites](https://docs.github.com/rest/checks/suites)\&quot; in the REST API documentation.  For activity relating to check runs, use the &#x60;check_run&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Checks\&quot; permission. To receive the &#x60;requested&#x60; and &#x60;rerequested&#x60; event types, the app must have at least write-level access for the \&quot;Checks\&quot; permission. GitHub Apps with write-level access for the \&quot;Checks\&quot; permission are automatically subscribed to this webhook event.  Repository and organization webhooks only receive payloads for the &#x60;completed&#x60; event types in repositories.  **Note**: The API only looks for pushes in the repository where the check suite was created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array and a &#x60;null&#x60; value for &#x60;head_branch&#x60;.
[**checkSuiteRerequested**](DefaultApi.md#checkSuiteRerequested) | **POST** /check-suite-rerequested | This event occurs when there is activity relating to a check suite. For information about check suites, see \&quot;[Getting started with the Checks API](https://docs.github.com/rest/guides/getting-started-with-the-checks-api).\&quot; For information about the APIs to manage check suites, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#checksuite) or \&quot;[Check Suites](https://docs.github.com/rest/checks/suites)\&quot; in the REST API documentation.  For activity relating to check runs, use the &#x60;check_run&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Checks\&quot; permission. To receive the &#x60;requested&#x60; and &#x60;rerequested&#x60; event types, the app must have at least write-level access for the \&quot;Checks\&quot; permission. GitHub Apps with write-level access for the \&quot;Checks\&quot; permission are automatically subscribed to this webhook event.  Repository and organization webhooks only receive payloads for the &#x60;completed&#x60; event types in repositories.  **Note**: The API only looks for pushes in the repository where the check suite was created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array and a &#x60;null&#x60; value for &#x60;head_branch&#x60;.
[**codeScanningAlertAppearedInBranch**](DefaultApi.md#codeScanningAlertAppearedInBranch) | **POST** /code-scanning-alert-appeared-in-branch | This event occurs when there is activity relating to code scanning alerts in a repository. For more information, see \&quot;[About code scanning](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning)\&quot; and \&quot;[About code scanning alerts](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning-alerts).\&quot; For information about the API to manage code scanning, see \&quot;[Code scanning](https://docs.github.com/rest/code-scanning)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Code scanning alerts\&quot; repository permission.
[**codeScanningAlertClosedByUser**](DefaultApi.md#codeScanningAlertClosedByUser) | **POST** /code-scanning-alert-closed-by-user | This event occurs when there is activity relating to code scanning alerts in a repository. For more information, see \&quot;[About code scanning](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning)\&quot; and \&quot;[About code scanning alerts](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning-alerts).\&quot; For information about the API to manage code scanning, see \&quot;[Code scanning](https://docs.github.com/rest/code-scanning)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Code scanning alerts\&quot; repository permission.
[**codeScanningAlertCreated**](DefaultApi.md#codeScanningAlertCreated) | **POST** /code-scanning-alert-created | This event occurs when there is activity relating to code scanning alerts in a repository. For more information, see \&quot;[About code scanning](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning)\&quot; and \&quot;[About code scanning alerts](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning-alerts).\&quot; For information about the API to manage code scanning, see \&quot;[Code scanning](https://docs.github.com/rest/code-scanning)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Code scanning alerts\&quot; repository permission.
[**codeScanningAlertFixed**](DefaultApi.md#codeScanningAlertFixed) | **POST** /code-scanning-alert-fixed | This event occurs when there is activity relating to code scanning alerts in a repository. For more information, see \&quot;[About code scanning](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning)\&quot; and \&quot;[About code scanning alerts](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning-alerts).\&quot; For information about the API to manage code scanning, see \&quot;[Code scanning](https://docs.github.com/rest/code-scanning)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Code scanning alerts\&quot; repository permission.
[**codeScanningAlertReopened**](DefaultApi.md#codeScanningAlertReopened) | **POST** /code-scanning-alert-reopened | This event occurs when there is activity relating to code scanning alerts in a repository. For more information, see \&quot;[About code scanning](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning)\&quot; and \&quot;[About code scanning alerts](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning-alerts).\&quot; For information about the API to manage code scanning, see \&quot;[Code scanning](https://docs.github.com/rest/code-scanning)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Code scanning alerts\&quot; repository permission.
[**codeScanningAlertReopenedByUser**](DefaultApi.md#codeScanningAlertReopenedByUser) | **POST** /code-scanning-alert-reopened-by-user | This event occurs when there is activity relating to code scanning alerts in a repository. For more information, see \&quot;[About code scanning](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning)\&quot; and \&quot;[About code scanning alerts](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning-alerts).\&quot; For information about the API to manage code scanning, see \&quot;[Code scanning](https://docs.github.com/rest/code-scanning)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Code scanning alerts\&quot; repository permission.
[**commitCommentCreated**](DefaultApi.md#commitCommentCreated) | **POST** /commit-comment-created | This event occurs when there is activity relating to commit comments. For more information about commit comments, see \&quot;[Commenting on a pull request](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/commenting-on-a-pull-request).\&quot; For information about the APIs to manage commit comments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#commitcomment) or \&quot;[Commit comments](https://docs.github.com/rest/commits/comments)\&quot; in the REST API documentation.  For activity relating to comments on pull request reviews, use the &#x60;pull_request_review_comment&#x60; event. For activity relating to issue comments, use the &#x60;issue_comment&#x60; event. For activity relating to discussion comments, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.
[**create**](DefaultApi.md#create) | **POST** /create | This event occurs when a Git branch or tag is created.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.  **Notes**: - This event will not occur when more than three tags are created at once. - Payloads are capped at 25 MB. If an event generates a larger payload, GitHub will not deliver a payload for that webhook event. This may happen, for example, if many branches or tags are pushed at once. We suggest monitoring your payload size to ensure delivery.
[**customPropertyCreated**](DefaultApi.md#customPropertyCreated) | **POST** /custom-property-created | This event occurs when there is activity relating to a custom property.  For more information, see \&quot;[Managing custom properties for repositories in your organization](https://docs.github.com/organizations/managing-organization-settings/managing-custom-properties-for-repositories-in-your-organization)\&quot;. For information about the APIs to manage custom properties, see \&quot;[Custom properties](https://docs.github.com/rest/orgs/custom-properties)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Custom properties\&quot; organization permission.
[**customPropertyDeleted**](DefaultApi.md#customPropertyDeleted) | **POST** /custom-property-deleted | This event occurs when there is activity relating to a custom property.  For more information, see \&quot;[Managing custom properties for repositories in your organization](https://docs.github.com/organizations/managing-organization-settings/managing-custom-properties-for-repositories-in-your-organization)\&quot;. For information about the APIs to manage custom properties, see \&quot;[Custom properties](https://docs.github.com/rest/orgs/custom-properties)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Custom properties\&quot; organization permission.
[**customPropertyUpdated**](DefaultApi.md#customPropertyUpdated) | **POST** /custom-property-updated | This event occurs when there is activity relating to a custom property.  For more information, see \&quot;[Managing custom properties for repositories in your organization](https://docs.github.com/organizations/managing-organization-settings/managing-custom-properties-for-repositories-in-your-organization)\&quot;. For information about the APIs to manage custom properties, see \&quot;[Custom properties](https://docs.github.com/rest/orgs/custom-properties)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Custom properties\&quot; organization permission.
[**customPropertyValuesUpdated**](DefaultApi.md#customPropertyValuesUpdated) | **POST** /custom-property-values-updated | This event occurs when there is activity relating to custom property values for a repository.  For more information, see \&quot;[Managing custom properties for repositories in your organization](https://docs.github.com/organizations/managing-organization-settings/managing-custom-properties-for-repositories-in-your-organization)\&quot;. For information about the APIs to manage custom properties for a repository, see \&quot;[Custom properties](https://docs.github.com/rest/repos/custom-properties)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Custom properties\&quot; organization permission.
[**delete**](DefaultApi.md#delete) | **POST** /delete | This event occurs when a Git branch or tag is deleted. To subscribe to all pushes to a repository, including branch and tag deletions, use the [&#x60;push&#x60;](#push) webhook event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.  **Note**: This event will not occur when more than three tags are deleted at once.
[**dependabotAlertAutoDismissed**](DefaultApi.md#dependabotAlertAutoDismissed) | **POST** /dependabot-alert-auto-dismissed | This event occurs when there is activity relating to Dependabot alerts.  For more information about Dependabot alerts, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot; For information about the API to manage Dependabot alerts, see \&quot;[Dependabot alerts](https://docs.github.com/rest/dependabot/alerts)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Dependabot alerts\&quot; repository permission.  **Note**: Webhook events for Dependabot alerts are currently in beta and subject to change.
[**dependabotAlertAutoReopened**](DefaultApi.md#dependabotAlertAutoReopened) | **POST** /dependabot-alert-auto-reopened | This event occurs when there is activity relating to Dependabot alerts.  For more information about Dependabot alerts, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot; For information about the API to manage Dependabot alerts, see \&quot;[Dependabot alerts](https://docs.github.com/rest/dependabot/alerts)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Dependabot alerts\&quot; repository permission.  **Note**: Webhook events for Dependabot alerts are currently in beta and subject to change.
[**dependabotAlertCreated**](DefaultApi.md#dependabotAlertCreated) | **POST** /dependabot-alert-created | This event occurs when there is activity relating to Dependabot alerts.  For more information about Dependabot alerts, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot; For information about the API to manage Dependabot alerts, see \&quot;[Dependabot alerts](https://docs.github.com/rest/dependabot/alerts)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Dependabot alerts\&quot; repository permission.  **Note**: Webhook events for Dependabot alerts are currently in beta and subject to change.
[**dependabotAlertDismissed**](DefaultApi.md#dependabotAlertDismissed) | **POST** /dependabot-alert-dismissed | This event occurs when there is activity relating to Dependabot alerts.  For more information about Dependabot alerts, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot; For information about the API to manage Dependabot alerts, see \&quot;[Dependabot alerts](https://docs.github.com/rest/dependabot/alerts)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Dependabot alerts\&quot; repository permission.  **Note**: Webhook events for Dependabot alerts are currently in beta and subject to change.
[**dependabotAlertFixed**](DefaultApi.md#dependabotAlertFixed) | **POST** /dependabot-alert-fixed | This event occurs when there is activity relating to Dependabot alerts.  For more information about Dependabot alerts, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot; For information about the API to manage Dependabot alerts, see \&quot;[Dependabot alerts](https://docs.github.com/rest/dependabot/alerts)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Dependabot alerts\&quot; repository permission.  **Note**: Webhook events for Dependabot alerts are currently in beta and subject to change.
[**dependabotAlertReintroduced**](DefaultApi.md#dependabotAlertReintroduced) | **POST** /dependabot-alert-reintroduced | This event occurs when there is activity relating to Dependabot alerts.  For more information about Dependabot alerts, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot; For information about the API to manage Dependabot alerts, see \&quot;[Dependabot alerts](https://docs.github.com/rest/dependabot/alerts)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Dependabot alerts\&quot; repository permission.  **Note**: Webhook events for Dependabot alerts are currently in beta and subject to change.
[**dependabotAlertReopened**](DefaultApi.md#dependabotAlertReopened) | **POST** /dependabot-alert-reopened | This event occurs when there is activity relating to Dependabot alerts.  For more information about Dependabot alerts, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot; For information about the API to manage Dependabot alerts, see \&quot;[Dependabot alerts](https://docs.github.com/rest/dependabot/alerts)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Dependabot alerts\&quot; repository permission.  **Note**: Webhook events for Dependabot alerts are currently in beta and subject to change.
[**deployKeyCreated**](DefaultApi.md#deployKeyCreated) | **POST** /deploy-key-created | This event occurs when there is activity relating to deploy keys. For more information, see \&quot;[Managing deploy keys](https://docs.github.com/developers/overview/managing-deploy-keys).\&quot; For information about the APIs to manage deploy keys, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#deploykey) or \&quot;[Deploy keys](https://docs.github.com/rest/deploy-keys)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Deployments\&quot; repository permission.
[**deployKeyDeleted**](DefaultApi.md#deployKeyDeleted) | **POST** /deploy-key-deleted | This event occurs when there is activity relating to deploy keys. For more information, see \&quot;[Managing deploy keys](https://docs.github.com/developers/overview/managing-deploy-keys).\&quot; For information about the APIs to manage deploy keys, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#deploykey) or \&quot;[Deploy keys](https://docs.github.com/rest/deploy-keys)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Deployments\&quot; repository permission.
[**deploymentCreated**](DefaultApi.md#deploymentCreated) | **POST** /deployment-created | This event occurs when there is activity relating to deployments. For more information, see \&quot;[About deployments](https://docs.github.com/actions/deployment/about-deployments).\&quot; For information about the APIs to manage deployments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#deployment) or \&quot;[Deployments](https://docs.github.com/rest/deployments/deployments)\&quot; in the REST API documentation.  For activity relating to deployment status, use the &#x60;deployment_status&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Deployments\&quot; repository permission.
[**deploymentProtectionRuleRequested**](DefaultApi.md#deploymentProtectionRuleRequested) | **POST** /deployment-protection-rule-requested | This event occurs when there is activity relating to deployment protection rules. For more information, see \&quot;[Using environments for deployment](https://docs.github.com/actions/deployment/targeting-different-environments/using-environments-for-deployment#environment-protection-rules).\&quot; For information about the API to manage deployment protection rules, see [the REST API documentation](https://docs.github.com/rest/deployments/environments).  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Deployments\&quot; repository permission.
[**deploymentReviewApproved**](DefaultApi.md#deploymentReviewApproved) | **POST** /deployment-review-approved | This event occurs when there is activity relating to deployment reviews. For more information, see \&quot;[About deployments](https://docs.github.com/actions/deployment/about-deployments).\&quot; For information about the APIs to manage deployments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#deployment) or \&quot;[Deployments](https://docs.github.com/rest/deployments/deployments)\&quot; in the REST API documentation.  For activity relating to deployment creation or deployment status, use the &#x60;deployment&#x60; or &#x60;deployment_status&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Deployments\&quot; repository permission.
[**deploymentReviewRejected**](DefaultApi.md#deploymentReviewRejected) | **POST** /deployment-review-rejected | This event occurs when there is activity relating to deployment reviews. For more information, see \&quot;[About deployments](https://docs.github.com/actions/deployment/about-deployments).\&quot; For information about the APIs to manage deployments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#deployment) or \&quot;[Deployments](https://docs.github.com/rest/deployments/deployments)\&quot; in the REST API documentation.  For activity relating to deployment creation or deployment status, use the &#x60;deployment&#x60; or &#x60;deployment_status&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Deployments\&quot; repository permission.
[**deploymentReviewRequested**](DefaultApi.md#deploymentReviewRequested) | **POST** /deployment-review-requested | This event occurs when there is activity relating to deployment reviews. For more information, see \&quot;[About deployments](https://docs.github.com/actions/deployment/about-deployments).\&quot; For information about the APIs to manage deployments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#deployment) or \&quot;[Deployments](https://docs.github.com/rest/deployments/deployments)\&quot; in the REST API documentation.  For activity relating to deployment creation or deployment status, use the &#x60;deployment&#x60; or &#x60;deployment_status&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Deployments\&quot; repository permission.
[**deploymentStatusCreated**](DefaultApi.md#deploymentStatusCreated) | **POST** /deployment-status-created | This event occurs when there is activity relating to deployment statuses. For more information, see \&quot;[About deployments](https://docs.github.com/actions/deployment/about-deployments).\&quot; For information about the APIs to manage deployments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#deployment) or \&quot;[Deployments](https://docs.github.com/rest/deployments/deployments)\&quot; in the REST API documentation.  For activity relating to deployment creation, use the &#x60;deployment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Deployments\&quot; repository permission.
[**discussionAnswered**](DefaultApi.md#discussionAnswered) | **POST** /discussion-answered | This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**discussionCategoryChanged**](DefaultApi.md#discussionCategoryChanged) | **POST** /discussion-category-changed | This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**discussionClosed**](DefaultApi.md#discussionClosed) | **POST** /discussion-closed | This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**discussionCommentCreated**](DefaultApi.md#discussionCommentCreated) | **POST** /discussion-comment-created | This event occurs when there is activity relating to a comment on a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a discussion as opposed to comments on a discussion, use the &#x60;discussion&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**discussionCommentDeleted**](DefaultApi.md#discussionCommentDeleted) | **POST** /discussion-comment-deleted | This event occurs when there is activity relating to a comment on a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a discussion as opposed to comments on a discussion, use the &#x60;discussion&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**discussionCommentEdited**](DefaultApi.md#discussionCommentEdited) | **POST** /discussion-comment-edited | This event occurs when there is activity relating to a comment on a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a discussion as opposed to comments on a discussion, use the &#x60;discussion&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**discussionCreated**](DefaultApi.md#discussionCreated) | **POST** /discussion-created | This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**discussionDeleted**](DefaultApi.md#discussionDeleted) | **POST** /discussion-deleted | This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**discussionEdited**](DefaultApi.md#discussionEdited) | **POST** /discussion-edited | This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**discussionLabeled**](DefaultApi.md#discussionLabeled) | **POST** /discussion-labeled | This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**discussionLocked**](DefaultApi.md#discussionLocked) | **POST** /discussion-locked | This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**discussionPinned**](DefaultApi.md#discussionPinned) | **POST** /discussion-pinned | This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**discussionReopened**](DefaultApi.md#discussionReopened) | **POST** /discussion-reopened | This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**discussionTransferred**](DefaultApi.md#discussionTransferred) | **POST** /discussion-transferred | This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**discussionUnanswered**](DefaultApi.md#discussionUnanswered) | **POST** /discussion-unanswered | This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**discussionUnlabeled**](DefaultApi.md#discussionUnlabeled) | **POST** /discussion-unlabeled | This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**discussionUnlocked**](DefaultApi.md#discussionUnlocked) | **POST** /discussion-unlocked | This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**discussionUnpinned**](DefaultApi.md#discussionUnpinned) | **POST** /discussion-unpinned | This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.
[**fork**](DefaultApi.md#fork) | **POST** /fork | This event occurs when someone forks a repository. For more information, see \&quot;[Fork a repo](https://docs.github.com/get-started/quickstart/fork-a-repo).\&quot; For information about the API to manage forks, see \&quot;[Forks](https://docs.github.com/rest/repos/forks)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.
[**githubAppAuthorizationRevoked**](DefaultApi.md#githubAppAuthorizationRevoked) | **POST** /github-app-authorization-revoked | This event occurs when a user revokes their authorization of a GitHub App. For more information, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the API to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.  A GitHub App receives this webhook by default and cannot unsubscribe from this event.  Anyone can revoke their authorization of a GitHub App from their [GitHub account settings page](https://github.com/settings/apps/authorizations). Revoking the authorization of a GitHub App does not uninstall the GitHub App. You should program your GitHub App so that when it receives this webhook, it stops calling the API on behalf of the person who revoked the token. If your GitHub App continues to use a revoked access token, it will receive the &#x60;401 Bad Credentials&#x60; error. For details about requests with a user access token, which require GitHub App authorization, see \&quot;[Authenticating with a GitHub App on behalf of a user](https://docs.github.com/apps/creating-github-apps/authenticating-with-a-github-app/authenticating-with-a-github-app-on-behalf-of-a-user).\&quot;
[**gollum**](DefaultApi.md#gollum) | **POST** /gollum | This event occurs when someone creates or updates a wiki page. For more information, see \&quot;[About wikis](https://docs.github.com/communities/documenting-your-project-with-wikis/about-wikis).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.
[**installationCreated**](DefaultApi.md#installationCreated) | **POST** /installation-created | This event occurs when there is activity relating to a GitHub App installation. All GitHub Apps receive this event by default. You cannot manually subscribe to this event.  For more information about GitHub Apps, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the APIs to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.
[**installationDeleted**](DefaultApi.md#installationDeleted) | **POST** /installation-deleted | This event occurs when there is activity relating to a GitHub App installation. All GitHub Apps receive this event by default. You cannot manually subscribe to this event.  For more information about GitHub Apps, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the APIs to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.
[**installationNewPermissionsAccepted**](DefaultApi.md#installationNewPermissionsAccepted) | **POST** /installation-new-permissions-accepted | This event occurs when there is activity relating to a GitHub App installation. All GitHub Apps receive this event by default. You cannot manually subscribe to this event.  For more information about GitHub Apps, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the APIs to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.
[**installationRepositoriesAdded**](DefaultApi.md#installationRepositoriesAdded) | **POST** /installation-repositories-added | This event occurs when there is activity relating to which repositories a GitHub App installation can access. All GitHub Apps receive this event by default. You cannot manually subscribe to this event.  For more information about GitHub Apps, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the APIs to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.
[**installationRepositoriesRemoved**](DefaultApi.md#installationRepositoriesRemoved) | **POST** /installation-repositories-removed | This event occurs when there is activity relating to which repositories a GitHub App installation can access. All GitHub Apps receive this event by default. You cannot manually subscribe to this event.  For more information about GitHub Apps, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the APIs to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.
[**installationSuspend**](DefaultApi.md#installationSuspend) | **POST** /installation-suspend | This event occurs when there is activity relating to a GitHub App installation. All GitHub Apps receive this event by default. You cannot manually subscribe to this event.  For more information about GitHub Apps, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the APIs to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.
[**installationTargetRenamed**](DefaultApi.md#installationTargetRenamed) | **POST** /installation-target-renamed | This event occurs when there is activity relating to the user or organization account that a GitHub App is installed on. For more information, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the APIs to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.
[**installationUnsuspend**](DefaultApi.md#installationUnsuspend) | **POST** /installation-unsuspend | This event occurs when there is activity relating to a GitHub App installation. All GitHub Apps receive this event by default. You cannot manually subscribe to this event.  For more information about GitHub Apps, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the APIs to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.
[**issueCommentCreated**](DefaultApi.md#issueCommentCreated) | **POST** /issue-comment-created | This event occurs when there is activity relating to a comment on an issue or pull request. For more information about issues and pull requests, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues)\&quot; and \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage issue comments, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issuecomment) or \&quot;[Issue comments](https://docs.github.com/rest/issues/comments)\&quot; in the REST API documentation.  For activity relating to an issue as opposed to comments on an issue, use the &#x60;issue&#x60; event. For activity related to pull request reviews or pull request review comments, use the &#x60;pull_request_review&#x60; or &#x60;pull_request_review_comment&#x60; events. For more information about the different types of pull request comments, see \&quot;[Working with comments](https://docs.github.com/rest/guides/working-with-comments).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issueCommentDeleted**](DefaultApi.md#issueCommentDeleted) | **POST** /issue-comment-deleted | This event occurs when there is activity relating to a comment on an issue or pull request. For more information about issues and pull requests, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues)\&quot; and \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage issue comments, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issuecomment) or \&quot;[Issue comments](https://docs.github.com/rest/issues/comments)\&quot; in the REST API documentation.  For activity relating to an issue as opposed to comments on an issue, use the &#x60;issue&#x60; event. For activity related to pull request reviews or pull request review comments, use the &#x60;pull_request_review&#x60; or &#x60;pull_request_review_comment&#x60; events. For more information about the different types of pull request comments, see \&quot;[Working with comments](https://docs.github.com/rest/guides/working-with-comments).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issueCommentEdited**](DefaultApi.md#issueCommentEdited) | **POST** /issue-comment-edited | This event occurs when there is activity relating to a comment on an issue or pull request. For more information about issues and pull requests, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues)\&quot; and \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage issue comments, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issuecomment) or \&quot;[Issue comments](https://docs.github.com/rest/issues/comments)\&quot; in the REST API documentation.  For activity relating to an issue as opposed to comments on an issue, use the &#x60;issue&#x60; event. For activity related to pull request reviews or pull request review comments, use the &#x60;pull_request_review&#x60; or &#x60;pull_request_review_comment&#x60; events. For more information about the different types of pull request comments, see \&quot;[Working with comments](https://docs.github.com/rest/guides/working-with-comments).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issuesAssigned**](DefaultApi.md#issuesAssigned) | **POST** /issues-assigned | This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issuesClosed**](DefaultApi.md#issuesClosed) | **POST** /issues-closed | This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issuesDeleted**](DefaultApi.md#issuesDeleted) | **POST** /issues-deleted | This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issuesDemilestoned**](DefaultApi.md#issuesDemilestoned) | **POST** /issues-demilestoned | This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issuesEdited**](DefaultApi.md#issuesEdited) | **POST** /issues-edited | This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issuesLabeled**](DefaultApi.md#issuesLabeled) | **POST** /issues-labeled | This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issuesLocked**](DefaultApi.md#issuesLocked) | **POST** /issues-locked | This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issuesMilestoned**](DefaultApi.md#issuesMilestoned) | **POST** /issues-milestoned | This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issuesOpened**](DefaultApi.md#issuesOpened) | **POST** /issues-opened | This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issuesPinned**](DefaultApi.md#issuesPinned) | **POST** /issues-pinned | This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issuesReopened**](DefaultApi.md#issuesReopened) | **POST** /issues-reopened | This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issuesTransferred**](DefaultApi.md#issuesTransferred) | **POST** /issues-transferred | This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issuesUnassigned**](DefaultApi.md#issuesUnassigned) | **POST** /issues-unassigned | This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issuesUnlabeled**](DefaultApi.md#issuesUnlabeled) | **POST** /issues-unlabeled | This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issuesUnlocked**](DefaultApi.md#issuesUnlocked) | **POST** /issues-unlocked | This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**issuesUnpinned**](DefaultApi.md#issuesUnpinned) | **POST** /issues-unpinned | This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.
[**labelCreated**](DefaultApi.md#labelCreated) | **POST** /label-created | This event occurs when there is activity relating to labels. For more information, see \&quot;[Managing labels](https://docs.github.com/issues/using-labels-and-milestones-to-track-work/managing-labels).\&quot; For information about the APIs to manage labels, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#label) or \&quot;[Labels](https://docs.github.com/rest/issues/labels)\&quot; in the REST API documentation.  If you want to receive an event when a label is added to or removed from an issue, pull request, or discussion, use the &#x60;labeled&#x60; or &#x60;unlabeled&#x60; action type for the &#x60;issues&#x60;, &#x60;pull_request&#x60;, or &#x60;discussion&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.
[**labelDeleted**](DefaultApi.md#labelDeleted) | **POST** /label-deleted | This event occurs when there is activity relating to labels. For more information, see \&quot;[Managing labels](https://docs.github.com/issues/using-labels-and-milestones-to-track-work/managing-labels).\&quot; For information about the APIs to manage labels, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#label) or \&quot;[Labels](https://docs.github.com/rest/issues/labels)\&quot; in the REST API documentation.  If you want to receive an event when a label is added to or removed from an issue, pull request, or discussion, use the &#x60;labeled&#x60; or &#x60;unlabeled&#x60; action type for the &#x60;issues&#x60;, &#x60;pull_request&#x60;, or &#x60;discussion&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.
[**labelEdited**](DefaultApi.md#labelEdited) | **POST** /label-edited | This event occurs when there is activity relating to labels. For more information, see \&quot;[Managing labels](https://docs.github.com/issues/using-labels-and-milestones-to-track-work/managing-labels).\&quot; For information about the APIs to manage labels, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#label) or \&quot;[Labels](https://docs.github.com/rest/issues/labels)\&quot; in the REST API documentation.  If you want to receive an event when a label is added to or removed from an issue, pull request, or discussion, use the &#x60;labeled&#x60; or &#x60;unlabeled&#x60; action type for the &#x60;issues&#x60;, &#x60;pull_request&#x60;, or &#x60;discussion&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.
[**marketplacePurchaseCancelled**](DefaultApi.md#marketplacePurchaseCancelled) | **POST** /marketplace-purchase-cancelled | This event occurs when there is activity relating to a GitHub Marketplace purchase. For more information, see \&quot;[GitHub Marketplace](https://docs.github.com/marketplace).\&quot; For information about the APIs to manage GitHub Marketplace listings, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#marketplacelisting) or \&quot;[GitHub Marketplace](https://docs.github.com/rest/apps/marketplace)\&quot; in the REST API documentation.
[**marketplacePurchaseChanged**](DefaultApi.md#marketplacePurchaseChanged) | **POST** /marketplace-purchase-changed | This event occurs when there is activity relating to a GitHub Marketplace purchase. For more information, see \&quot;[GitHub Marketplace](https://docs.github.com/marketplace).\&quot; For information about the APIs to manage GitHub Marketplace listings, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#marketplacelisting) or \&quot;[GitHub Marketplace](https://docs.github.com/rest/apps/marketplace)\&quot; in the REST API documentation.
[**marketplacePurchasePendingChange**](DefaultApi.md#marketplacePurchasePendingChange) | **POST** /marketplace-purchase-pending-change | This event occurs when there is activity relating to a GitHub Marketplace purchase. For more information, see \&quot;[GitHub Marketplace](https://docs.github.com/marketplace).\&quot; For information about the APIs to manage GitHub Marketplace listings, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#marketplacelisting) or \&quot;[GitHub Marketplace](https://docs.github.com/rest/apps/marketplace)\&quot; in the REST API documentation.
[**marketplacePurchasePendingChangeCancelled**](DefaultApi.md#marketplacePurchasePendingChangeCancelled) | **POST** /marketplace-purchase-pending-change-cancelled | This event occurs when there is activity relating to a GitHub Marketplace purchase. For more information, see \&quot;[GitHub Marketplace](https://docs.github.com/marketplace).\&quot; For information about the APIs to manage GitHub Marketplace listings, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#marketplacelisting) or \&quot;[GitHub Marketplace](https://docs.github.com/rest/apps/marketplace)\&quot; in the REST API documentation.
[**marketplacePurchasePurchased**](DefaultApi.md#marketplacePurchasePurchased) | **POST** /marketplace-purchase-purchased | This event occurs when there is activity relating to a GitHub Marketplace purchase. For more information, see \&quot;[GitHub Marketplace](https://docs.github.com/marketplace).\&quot; For information about the APIs to manage GitHub Marketplace listings, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#marketplacelisting) or \&quot;[GitHub Marketplace](https://docs.github.com/rest/apps/marketplace)\&quot; in the REST API documentation.
[**memberAdded**](DefaultApi.md#memberAdded) | **POST** /member-added | This event occurs when there is activity relating to collaborators in a repository. For more information, see \&quot;[Adding outside collaborators to repositories in your organization](https://docs.github.com/organizations/managing-user-access-to-your-organizations-repositories/adding-outside-collaborators-to-repositories-in-your-organization).\&quot; For more information about the API to manage repository collaborators, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#repositorycollaboratorconnection) or \&quot;[Collaborators](https://docs.github.com/rest/collaborators/collaborators)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.
[**memberEdited**](DefaultApi.md#memberEdited) | **POST** /member-edited | This event occurs when there is activity relating to collaborators in a repository. For more information, see \&quot;[Adding outside collaborators to repositories in your organization](https://docs.github.com/organizations/managing-user-access-to-your-organizations-repositories/adding-outside-collaborators-to-repositories-in-your-organization).\&quot; For more information about the API to manage repository collaborators, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#repositorycollaboratorconnection) or \&quot;[Collaborators](https://docs.github.com/rest/collaborators/collaborators)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.
[**memberRemoved**](DefaultApi.md#memberRemoved) | **POST** /member-removed | This event occurs when there is activity relating to collaborators in a repository. For more information, see \&quot;[Adding outside collaborators to repositories in your organization](https://docs.github.com/organizations/managing-user-access-to-your-organizations-repositories/adding-outside-collaborators-to-repositories-in-your-organization).\&quot; For more information about the API to manage repository collaborators, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#repositorycollaboratorconnection) or \&quot;[Collaborators](https://docs.github.com/rest/collaborators/collaborators)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.
[**membershipAdded**](DefaultApi.md#membershipAdded) | **POST** /membership-added | This event occurs when there is activity relating to team membership. For more information, see \&quot;[About teams](https://docs.github.com/organizations/organizing-members-into-teams/about-teams).\&quot; For more information about the APIs to manage team memberships, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#team) or \&quot;[Team members](https://docs.github.com/rest/teams/members)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.
[**membershipRemoved**](DefaultApi.md#membershipRemoved) | **POST** /membership-removed | This event occurs when there is activity relating to team membership. For more information, see \&quot;[About teams](https://docs.github.com/organizations/organizing-members-into-teams/about-teams).\&quot; For more information about the APIs to manage team memberships, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#team) or \&quot;[Team members](https://docs.github.com/rest/teams/members)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.
[**metaDeleted**](DefaultApi.md#metaDeleted) | **POST** /meta-deleted | This event occurs when there is activity relating to a webhook itself.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Meta\&quot; app permission.
[**milestoneClosed**](DefaultApi.md#milestoneClosed) | **POST** /milestone-closed | This event occurs when there is activity relating to milestones. For more information, see \&quot;[About milestones](https://docs.github.com/issues/using-labels-and-milestones-to-track-work/about-milestones).\&quot; For information about the APIs to manage milestones, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#milestone) or \&quot;[Milestones](https://docs.github.com/rest/issues/milestones)\&quot; in the REST API documentation.  If you want to receive an event when an issue or pull request is added to or removed from a milestone, use the &#x60;milestoned&#x60; or &#x60;demilestoned&#x60; action type for the &#x60;issues&#x60; or &#x60;pull_request&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; or \&quot;Pull requests\&quot; repository permissions.
[**milestoneCreated**](DefaultApi.md#milestoneCreated) | **POST** /milestone-created | This event occurs when there is activity relating to milestones. For more information, see \&quot;[About milestones](https://docs.github.com/issues/using-labels-and-milestones-to-track-work/about-milestones).\&quot; For information about the APIs to manage milestones, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#milestone) or \&quot;[Milestones](https://docs.github.com/rest/issues/milestones)\&quot; in the REST API documentation.  If you want to receive an event when an issue or pull request is added to or removed from a milestone, use the &#x60;milestoned&#x60; or &#x60;demilestoned&#x60; action type for the &#x60;issues&#x60; or &#x60;pull_request&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; or \&quot;Pull requests\&quot; repository permissions.
[**milestoneDeleted**](DefaultApi.md#milestoneDeleted) | **POST** /milestone-deleted | This event occurs when there is activity relating to milestones. For more information, see \&quot;[About milestones](https://docs.github.com/issues/using-labels-and-milestones-to-track-work/about-milestones).\&quot; For information about the APIs to manage milestones, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#milestone) or \&quot;[Milestones](https://docs.github.com/rest/issues/milestones)\&quot; in the REST API documentation.  If you want to receive an event when an issue or pull request is added to or removed from a milestone, use the &#x60;milestoned&#x60; or &#x60;demilestoned&#x60; action type for the &#x60;issues&#x60; or &#x60;pull_request&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; or \&quot;Pull requests\&quot; repository permissions.
[**milestoneEdited**](DefaultApi.md#milestoneEdited) | **POST** /milestone-edited | This event occurs when there is activity relating to milestones. For more information, see \&quot;[About milestones](https://docs.github.com/issues/using-labels-and-milestones-to-track-work/about-milestones).\&quot; For information about the APIs to manage milestones, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#milestone) or \&quot;[Milestones](https://docs.github.com/rest/issues/milestones)\&quot; in the REST API documentation.  If you want to receive an event when an issue or pull request is added to or removed from a milestone, use the &#x60;milestoned&#x60; or &#x60;demilestoned&#x60; action type for the &#x60;issues&#x60; or &#x60;pull_request&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; or \&quot;Pull requests\&quot; repository permissions.
[**milestoneOpened**](DefaultApi.md#milestoneOpened) | **POST** /milestone-opened | This event occurs when there is activity relating to milestones. For more information, see \&quot;[About milestones](https://docs.github.com/issues/using-labels-and-milestones-to-track-work/about-milestones).\&quot; For information about the APIs to manage milestones, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#milestone) or \&quot;[Milestones](https://docs.github.com/rest/issues/milestones)\&quot; in the REST API documentation.  If you want to receive an event when an issue or pull request is added to or removed from a milestone, use the &#x60;milestoned&#x60; or &#x60;demilestoned&#x60; action type for the &#x60;issues&#x60; or &#x60;pull_request&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; or \&quot;Pull requests\&quot; repository permissions.
[**orgBlockBlocked**](DefaultApi.md#orgBlockBlocked) | **POST** /org-block-blocked | This event occurs when organization owners or moderators block or unblock a non-member from collaborating on the organization&#39;s repositories. For more information, see \&quot;[Blocking a user from your organization](https://docs.github.com/communities/maintaining-your-safety-on-github/blocking-a-user-from-your-organization).\&quot; For information about the APIs to manage blocked users, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#userblockedevent) or \&quot;[Blocking users](https://docs.github.com/rest/orgs/blocking)\&quot; in the REST API documentation.  If you want to receive an event when members are added or removed from an organization, use the &#x60;organization&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; organization permission.
[**orgBlockUnblocked**](DefaultApi.md#orgBlockUnblocked) | **POST** /org-block-unblocked | This event occurs when organization owners or moderators block or unblock a non-member from collaborating on the organization&#39;s repositories. For more information, see \&quot;[Blocking a user from your organization](https://docs.github.com/communities/maintaining-your-safety-on-github/blocking-a-user-from-your-organization).\&quot; For information about the APIs to manage blocked users, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#userblockedevent) or \&quot;[Blocking users](https://docs.github.com/rest/orgs/blocking)\&quot; in the REST API documentation.  If you want to receive an event when members are added or removed from an organization, use the &#x60;organization&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; organization permission.
[**organizationDeleted**](DefaultApi.md#organizationDeleted) | **POST** /organization-deleted | This event occurs when there is activity relating to an organization and its members. For more information, see \&quot;[About organizations](https://docs.github.com/organizations/collaborating-with-groups-in-organizations/about-organizations).\&quot; For information about the APIs to manage organizations, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#organization) or \&quot;[Organizations](https://docs.github.com/rest/orgs)\&quot; in the REST API documentation.  If you want to receive an event when a non-member is blocked or unblocked from an organization, use the &#x60;org_block&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.
[**organizationMemberAdded**](DefaultApi.md#organizationMemberAdded) | **POST** /organization-member-added | This event occurs when there is activity relating to an organization and its members. For more information, see \&quot;[About organizations](https://docs.github.com/organizations/collaborating-with-groups-in-organizations/about-organizations).\&quot; For information about the APIs to manage organizations, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#organization) or \&quot;[Organizations](https://docs.github.com/rest/orgs)\&quot; in the REST API documentation.  If you want to receive an event when a non-member is blocked or unblocked from an organization, use the &#x60;org_block&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.
[**organizationMemberInvited**](DefaultApi.md#organizationMemberInvited) | **POST** /organization-member-invited | This event occurs when there is activity relating to an organization and its members. For more information, see \&quot;[About organizations](https://docs.github.com/organizations/collaborating-with-groups-in-organizations/about-organizations).\&quot; For information about the APIs to manage organizations, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#organization) or \&quot;[Organizations](https://docs.github.com/rest/orgs)\&quot; in the REST API documentation.  If you want to receive an event when a non-member is blocked or unblocked from an organization, use the &#x60;org_block&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.
[**organizationMemberRemoved**](DefaultApi.md#organizationMemberRemoved) | **POST** /organization-member-removed | This event occurs when there is activity relating to an organization and its members. For more information, see \&quot;[About organizations](https://docs.github.com/organizations/collaborating-with-groups-in-organizations/about-organizations).\&quot; For information about the APIs to manage organizations, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#organization) or \&quot;[Organizations](https://docs.github.com/rest/orgs)\&quot; in the REST API documentation.  If you want to receive an event when a non-member is blocked or unblocked from an organization, use the &#x60;org_block&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.
[**organizationRenamed**](DefaultApi.md#organizationRenamed) | **POST** /organization-renamed | This event occurs when there is activity relating to an organization and its members. For more information, see \&quot;[About organizations](https://docs.github.com/organizations/collaborating-with-groups-in-organizations/about-organizations).\&quot; For information about the APIs to manage organizations, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#organization) or \&quot;[Organizations](https://docs.github.com/rest/orgs)\&quot; in the REST API documentation.  If you want to receive an event when a non-member is blocked or unblocked from an organization, use the &#x60;org_block&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.
[**packagePublished**](DefaultApi.md#packagePublished) | **POST** /package-published | This event occurs when there is activity relating to GitHub Packages. For more information, see \&quot;[Introduction to GitHub Packages](https://docs.github.com/packages/learn-github-packages/introduction-to-github-packages).\&quot; For information about the APIs to manage GitHub Packages, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#package) or \&quot;[Packages](https://docs.github.com/rest/packages)\&quot; in the REST API documentation.  To install this event on a GitHub App, the app must have at least read-level access for the \&quot;Packages\&quot; repository permission.
[**packageUpdated**](DefaultApi.md#packageUpdated) | **POST** /package-updated | This event occurs when there is activity relating to GitHub Packages. For more information, see \&quot;[Introduction to GitHub Packages](https://docs.github.com/packages/learn-github-packages/introduction-to-github-packages).\&quot; For information about the APIs to manage GitHub Packages, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#package) or \&quot;[Packages](https://docs.github.com/rest/packages)\&quot; in the REST API documentation.  To install this event on a GitHub App, the app must have at least read-level access for the \&quot;Packages\&quot; repository permission.
[**pageBuild**](DefaultApi.md#pageBuild) | **POST** /page-build | This event occurs when there is an attempted build of a GitHub Pages site. This event occurs regardless of whether the build is successful. For more information, see \&quot;[Configuring a publishing source for your GitHub Pages site](https://docs.github.com/pages/getting-started-with-github-pages/configuring-a-publishing-source-for-your-github-pages-site).\&quot; For information about the API to manage GitHub Pages, see \&quot;[Pages](https://docs.github.com/rest/pages)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pages\&quot; repository permission.
[**personalAccessTokenRequestApproved**](DefaultApi.md#personalAccessTokenRequestApproved) | **POST** /personal-access-token-request-approved | This event occurs when there is activity relating to a request for a fine-grained personal access token to access resources that belong to a resource owner that requires approval for token access. For more information, see \&quot;[Creating a personal access token](https://docs.github.com/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Personal access token requests\&quot; organization permission.  **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.
[**personalAccessTokenRequestCancelled**](DefaultApi.md#personalAccessTokenRequestCancelled) | **POST** /personal-access-token-request-cancelled | This event occurs when there is activity relating to a request for a fine-grained personal access token to access resources that belong to a resource owner that requires approval for token access. For more information, see \&quot;[Creating a personal access token](https://docs.github.com/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Personal access token requests\&quot; organization permission.  **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.
[**personalAccessTokenRequestCreated**](DefaultApi.md#personalAccessTokenRequestCreated) | **POST** /personal-access-token-request-created | This event occurs when there is activity relating to a request for a fine-grained personal access token to access resources that belong to a resource owner that requires approval for token access. For more information, see \&quot;[Creating a personal access token](https://docs.github.com/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Personal access token requests\&quot; organization permission.  **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.
[**personalAccessTokenRequestDenied**](DefaultApi.md#personalAccessTokenRequestDenied) | **POST** /personal-access-token-request-denied | This event occurs when there is activity relating to a request for a fine-grained personal access token to access resources that belong to a resource owner that requires approval for token access. For more information, see \&quot;[Creating a personal access token](https://docs.github.com/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Personal access token requests\&quot; organization permission.  **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.
[**ping**](DefaultApi.md#ping) | **POST** /ping | This event occurs when you create a new webhook. The ping event is a confirmation from GitHub that you configured the webhook correctly.
[**projectCardConverted**](DefaultApi.md#projectCardConverted) | **POST** /project-card-converted | This event occurs when there is activity relating to a card on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a column on a project (classic), use the &#x60;project&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.
[**projectCardCreated**](DefaultApi.md#projectCardCreated) | **POST** /project-card-created | This event occurs when there is activity relating to a card on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a column on a project (classic), use the &#x60;project&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.
[**projectCardDeleted**](DefaultApi.md#projectCardDeleted) | **POST** /project-card-deleted | This event occurs when there is activity relating to a card on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a column on a project (classic), use the &#x60;project&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.
[**projectCardEdited**](DefaultApi.md#projectCardEdited) | **POST** /project-card-edited | This event occurs when there is activity relating to a card on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a column on a project (classic), use the &#x60;project&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.
[**projectCardMoved**](DefaultApi.md#projectCardMoved) | **POST** /project-card-moved | This event occurs when there is activity relating to a card on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a column on a project (classic), use the &#x60;project&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.
[**projectClosed**](DefaultApi.md#projectClosed) | **POST** /project-closed | This event occurs when there is activity relating to a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a card or column on a project (classic), use the &#x60;project_card&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.
[**projectColumnCreated**](DefaultApi.md#projectColumnCreated) | **POST** /project-column-created | This event occurs when there is activity relating to a column on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a card on a project (classic), use the &#x60;project&#x60; and &#x60;project_card&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.
[**projectColumnDeleted**](DefaultApi.md#projectColumnDeleted) | **POST** /project-column-deleted | This event occurs when there is activity relating to a column on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a card on a project (classic), use the &#x60;project&#x60; and &#x60;project_card&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.
[**projectColumnEdited**](DefaultApi.md#projectColumnEdited) | **POST** /project-column-edited | This event occurs when there is activity relating to a column on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a card on a project (classic), use the &#x60;project&#x60; and &#x60;project_card&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.
[**projectColumnMoved**](DefaultApi.md#projectColumnMoved) | **POST** /project-column-moved | This event occurs when there is activity relating to a column on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a card on a project (classic), use the &#x60;project&#x60; and &#x60;project_card&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.
[**projectCreated**](DefaultApi.md#projectCreated) | **POST** /project-created | This event occurs when there is activity relating to a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a card or column on a project (classic), use the &#x60;project_card&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.
[**projectDeleted**](DefaultApi.md#projectDeleted) | **POST** /project-deleted | This event occurs when there is activity relating to a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a card or column on a project (classic), use the &#x60;project_card&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.
[**projectEdited**](DefaultApi.md#projectEdited) | **POST** /project-edited | This event occurs when there is activity relating to a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a card or column on a project (classic), use the &#x60;project_card&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.
[**projectReopened**](DefaultApi.md#projectReopened) | **POST** /project-reopened | This event occurs when there is activity relating to a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a card or column on a project (classic), use the &#x60;project_card&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.
[**projectsV2Closed**](DefaultApi.md#projectsV2Closed) | **POST** /projects-v2-closed | This event occurs when there is activity relating to an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2).  For activity relating to a item on a project, use the &#x60;projects_v2_item&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).
[**projectsV2Created**](DefaultApi.md#projectsV2Created) | **POST** /projects-v2-created | This event occurs when there is activity relating to an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2).  For activity relating to a item on a project, use the &#x60;projects_v2_item&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).
[**projectsV2Deleted**](DefaultApi.md#projectsV2Deleted) | **POST** /projects-v2-deleted | This event occurs when there is activity relating to an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2).  For activity relating to a item on a project, use the &#x60;projects_v2_item&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).
[**projectsV2Edited**](DefaultApi.md#projectsV2Edited) | **POST** /projects-v2-edited | This event occurs when there is activity relating to an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2).  For activity relating to a item on a project, use the &#x60;projects_v2_item&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).
[**projectsV2ItemArchived**](DefaultApi.md#projectsV2ItemArchived) | **POST** /projects-v2-item-archived | This event occurs when there is activity relating to an item on an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2item).  For activity relating to a project (instead of an item on a project), use the &#x60;projects_v2&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).
[**projectsV2ItemConverted**](DefaultApi.md#projectsV2ItemConverted) | **POST** /projects-v2-item-converted | This event occurs when there is activity relating to an item on an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2item).  For activity relating to a project (instead of an item on a project), use the &#x60;projects_v2&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).
[**projectsV2ItemCreated**](DefaultApi.md#projectsV2ItemCreated) | **POST** /projects-v2-item-created | This event occurs when there is activity relating to an item on an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2item).  For activity relating to a project (instead of an item on a project), use the &#x60;projects_v2&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).
[**projectsV2ItemDeleted**](DefaultApi.md#projectsV2ItemDeleted) | **POST** /projects-v2-item-deleted | This event occurs when there is activity relating to an item on an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2item).  For activity relating to a project (instead of an item on a project), use the &#x60;projects_v2&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).
[**projectsV2ItemEdited**](DefaultApi.md#projectsV2ItemEdited) | **POST** /projects-v2-item-edited | This event occurs when there is activity relating to an item on an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2item).  For activity relating to a project (instead of an item on a project), use the &#x60;projects_v2&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).
[**projectsV2ItemReordered**](DefaultApi.md#projectsV2ItemReordered) | **POST** /projects-v2-item-reordered | This event occurs when there is activity relating to an item on an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2item).  For activity relating to a project (instead of an item on a project), use the &#x60;projects_v2&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).
[**projectsV2ItemRestored**](DefaultApi.md#projectsV2ItemRestored) | **POST** /projects-v2-item-restored | This event occurs when there is activity relating to an item on an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2item).  For activity relating to a project (instead of an item on a project), use the &#x60;projects_v2&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).
[**projectsV2Reopened**](DefaultApi.md#projectsV2Reopened) | **POST** /projects-v2-reopened | This event occurs when there is activity relating to an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2).  For activity relating to a item on a project, use the &#x60;projects_v2_item&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).
[**pullRequestAssigned**](DefaultApi.md#pullRequestAssigned) | **POST** /pull-request-assigned | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestAutoMergeDisabled**](DefaultApi.md#pullRequestAutoMergeDisabled) | **POST** /pull-request-auto-merge-disabled | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestAutoMergeEnabled**](DefaultApi.md#pullRequestAutoMergeEnabled) | **POST** /pull-request-auto-merge-enabled | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestClosed**](DefaultApi.md#pullRequestClosed) | **POST** /pull-request-closed | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestConvertedToDraft**](DefaultApi.md#pullRequestConvertedToDraft) | **POST** /pull-request-converted-to-draft | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestDemilestoned**](DefaultApi.md#pullRequestDemilestoned) | **POST** /pull-request-demilestoned | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestDequeued**](DefaultApi.md#pullRequestDequeued) | **POST** /pull-request-dequeued | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestEdited**](DefaultApi.md#pullRequestEdited) | **POST** /pull-request-edited | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestEnqueued**](DefaultApi.md#pullRequestEnqueued) | **POST** /pull-request-enqueued | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestLabeled**](DefaultApi.md#pullRequestLabeled) | **POST** /pull-request-labeled | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestLocked**](DefaultApi.md#pullRequestLocked) | **POST** /pull-request-locked | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestMilestoned**](DefaultApi.md#pullRequestMilestoned) | **POST** /pull-request-milestoned | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestOpened**](DefaultApi.md#pullRequestOpened) | **POST** /pull-request-opened | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestReadyForReview**](DefaultApi.md#pullRequestReadyForReview) | **POST** /pull-request-ready-for-review | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestReopened**](DefaultApi.md#pullRequestReopened) | **POST** /pull-request-reopened | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestReviewCommentCreated**](DefaultApi.md#pullRequestReviewCommentCreated) | **POST** /pull-request-review-comment-created | This event occurs when there is activity relating to a pull request review comment. A pull request review comment is a comment on a pull request&#39;s diff. For more information, see \&quot;[Commenting on a pull request](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request).\&quot; For information about the APIs to manage pull request review comments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequestreviewcomment) or \&quot;[Pull request review comments](https://docs.github.com/rest/pulls/comments)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestReviewCommentDeleted**](DefaultApi.md#pullRequestReviewCommentDeleted) | **POST** /pull-request-review-comment-deleted | This event occurs when there is activity relating to a pull request review comment. A pull request review comment is a comment on a pull request&#39;s diff. For more information, see \&quot;[Commenting on a pull request](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request).\&quot; For information about the APIs to manage pull request review comments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequestreviewcomment) or \&quot;[Pull request review comments](https://docs.github.com/rest/pulls/comments)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestReviewCommentEdited**](DefaultApi.md#pullRequestReviewCommentEdited) | **POST** /pull-request-review-comment-edited | This event occurs when there is activity relating to a pull request review comment. A pull request review comment is a comment on a pull request&#39;s diff. For more information, see \&quot;[Commenting on a pull request](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request).\&quot; For information about the APIs to manage pull request review comments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequestreviewcomment) or \&quot;[Pull request review comments](https://docs.github.com/rest/pulls/comments)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestReviewDismissed**](DefaultApi.md#pullRequestReviewDismissed) | **POST** /pull-request-review-dismissed | This event occurs when there is activity relating to a pull request review. A pull request review is a group of pull request review comments in addition to a body comment and a state. For more information, see \&quot;[About pull request reviews](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/about-pull-request-reviews).\&quot; For information about the APIs to manage pull request reviews, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequestreview) or \&quot;[Pull request reviews](https://docs.github.com/rest/pulls/reviews)\&quot; in the REST API documentation.  For activity related to pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestReviewEdited**](DefaultApi.md#pullRequestReviewEdited) | **POST** /pull-request-review-edited | This event occurs when there is activity relating to a pull request review. A pull request review is a group of pull request review comments in addition to a body comment and a state. For more information, see \&quot;[About pull request reviews](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/about-pull-request-reviews).\&quot; For information about the APIs to manage pull request reviews, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequestreview) or \&quot;[Pull request reviews](https://docs.github.com/rest/pulls/reviews)\&quot; in the REST API documentation.  For activity related to pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestReviewRequestRemoved**](DefaultApi.md#pullRequestReviewRequestRemoved) | **POST** /pull-request-review-request-removed | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestReviewRequested**](DefaultApi.md#pullRequestReviewRequested) | **POST** /pull-request-review-requested | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestReviewSubmitted**](DefaultApi.md#pullRequestReviewSubmitted) | **POST** /pull-request-review-submitted | This event occurs when there is activity relating to a pull request review. A pull request review is a group of pull request review comments in addition to a body comment and a state. For more information, see \&quot;[About pull request reviews](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/about-pull-request-reviews).\&quot; For information about the APIs to manage pull request reviews, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequestreview) or \&quot;[Pull request reviews](https://docs.github.com/rest/pulls/reviews)\&quot; in the REST API documentation.  For activity related to pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestReviewThreadResolved**](DefaultApi.md#pullRequestReviewThreadResolved) | **POST** /pull-request-review-thread-resolved | This event occurs when there is activity relating to a comment thread on a pull request. For more information, see \&quot;[About pull request reviews](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/about-pull-request-reviews).\&quot; For information about the APIs to manage pull request reviews, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequestreviewthread) or \&quot;[Pull request review comments](https://docs.github.com/rest/pulls/comments)\&quot; in the REST API documentation.  For activity related to pull request review comments, pull request comments, or pull request reviews, use the &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestReviewThreadUnresolved**](DefaultApi.md#pullRequestReviewThreadUnresolved) | **POST** /pull-request-review-thread-unresolved | This event occurs when there is activity relating to a comment thread on a pull request. For more information, see \&quot;[About pull request reviews](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/about-pull-request-reviews).\&quot; For information about the APIs to manage pull request reviews, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequestreviewthread) or \&quot;[Pull request review comments](https://docs.github.com/rest/pulls/comments)\&quot; in the REST API documentation.  For activity related to pull request review comments, pull request comments, or pull request reviews, use the &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestSynchronize**](DefaultApi.md#pullRequestSynchronize) | **POST** /pull-request-synchronize | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestUnassigned**](DefaultApi.md#pullRequestUnassigned) | **POST** /pull-request-unassigned | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestUnlabeled**](DefaultApi.md#pullRequestUnlabeled) | **POST** /pull-request-unlabeled | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**pullRequestUnlocked**](DefaultApi.md#pullRequestUnlocked) | **POST** /pull-request-unlocked | This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.
[**push**](DefaultApi.md#push) | **POST** /push | This event occurs when there is a push to a repository branch. This includes when a commit is pushed, when a commit tag is pushed, when a branch is deleted, when a tag is deleted, or when a repository is created from a template. To subscribe to only branch and tag deletions, use the [&#x60;delete&#x60;](#delete) webhook event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.  **Note**: An event will not be created when more than three tags are pushed at once.
[**registryPackagePublished**](DefaultApi.md#registryPackagePublished) | **POST** /registry-package-published | This event occurs when there is activity relating to GitHub Packages. For more information, see \&quot;[Introduction to GitHub Packages](https://docs.github.com/packages/learn-github-packages/introduction-to-github-packages).\&quot; For information about the APIs to manage GitHub Packages, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#package) or \&quot;[Packages](https://docs.github.com/rest/packages)\&quot; in the REST API documentation.  To install this event on a GitHub App, the app must have at least read-level access for the \&quot;Packages\&quot; repository permission.  **Note**: GitHub recommends that you use the newer &#x60;package&#x60; event instead.
[**registryPackageUpdated**](DefaultApi.md#registryPackageUpdated) | **POST** /registry-package-updated | This event occurs when there is activity relating to GitHub Packages. For more information, see \&quot;[Introduction to GitHub Packages](https://docs.github.com/packages/learn-github-packages/introduction-to-github-packages).\&quot; For information about the APIs to manage GitHub Packages, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#package) or \&quot;[Packages](https://docs.github.com/rest/packages)\&quot; in the REST API documentation.  To install this event on a GitHub App, the app must have at least read-level access for the \&quot;Packages\&quot; repository permission.  **Note**: GitHub recommends that you use the newer &#x60;package&#x60; event instead.
[**releaseCreated**](DefaultApi.md#releaseCreated) | **POST** /release-created | This event occurs when there is activity relating to releases. For more information, see \&quot;[About releases](https://docs.github.com/repositories/releasing-projects-on-github/about-releases).\&quot; For information about the APIs to manage releases, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#release) or \&quot;[Releases](https://docs.github.com/rest/releases)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.
[**releaseDeleted**](DefaultApi.md#releaseDeleted) | **POST** /release-deleted | This event occurs when there is activity relating to releases. For more information, see \&quot;[About releases](https://docs.github.com/repositories/releasing-projects-on-github/about-releases).\&quot; For information about the APIs to manage releases, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#release) or \&quot;[Releases](https://docs.github.com/rest/releases)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.
[**releaseEdited**](DefaultApi.md#releaseEdited) | **POST** /release-edited | This event occurs when there is activity relating to releases. For more information, see \&quot;[About releases](https://docs.github.com/repositories/releasing-projects-on-github/about-releases).\&quot; For information about the APIs to manage releases, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#release) or \&quot;[Releases](https://docs.github.com/rest/releases)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.
[**releasePrereleased**](DefaultApi.md#releasePrereleased) | **POST** /release-prereleased | This event occurs when there is activity relating to releases. For more information, see \&quot;[About releases](https://docs.github.com/repositories/releasing-projects-on-github/about-releases).\&quot; For information about the APIs to manage releases, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#release) or \&quot;[Releases](https://docs.github.com/rest/releases)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.
[**releasePublished**](DefaultApi.md#releasePublished) | **POST** /release-published | This event occurs when there is activity relating to releases. For more information, see \&quot;[About releases](https://docs.github.com/repositories/releasing-projects-on-github/about-releases).\&quot; For information about the APIs to manage releases, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#release) or \&quot;[Releases](https://docs.github.com/rest/releases)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.
[**releaseReleased**](DefaultApi.md#releaseReleased) | **POST** /release-released | This event occurs when there is activity relating to releases. For more information, see \&quot;[About releases](https://docs.github.com/repositories/releasing-projects-on-github/about-releases).\&quot; For information about the APIs to manage releases, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#release) or \&quot;[Releases](https://docs.github.com/rest/releases)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.
[**releaseUnpublished**](DefaultApi.md#releaseUnpublished) | **POST** /release-unpublished | This event occurs when there is activity relating to releases. For more information, see \&quot;[About releases](https://docs.github.com/repositories/releasing-projects-on-github/about-releases).\&quot; For information about the APIs to manage releases, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#release) or \&quot;[Releases](https://docs.github.com/rest/releases)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.
[**repositoryAdvisoryPublished**](DefaultApi.md#repositoryAdvisoryPublished) | **POST** /repository-advisory-published | This event occurs when there is activity relating to a repository security advisory. For more information about repository security advisories, see \&quot;[About GitHub Security Advisories for repositories](https://docs.github.com/code-security/repository-security-advisories/about-github-security-advisories-for-repositories).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Repository security advisories\&quot; permission.
[**repositoryAdvisoryReported**](DefaultApi.md#repositoryAdvisoryReported) | **POST** /repository-advisory-reported | This event occurs when there is activity relating to a repository security advisory. For more information about repository security advisories, see \&quot;[About GitHub Security Advisories for repositories](https://docs.github.com/code-security/repository-security-advisories/about-github-security-advisories-for-repositories).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Repository security advisories\&quot; permission.
[**repositoryArchived**](DefaultApi.md#repositoryArchived) | **POST** /repository-archived | This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.
[**repositoryCreated**](DefaultApi.md#repositoryCreated) | **POST** /repository-created | This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.
[**repositoryDeleted**](DefaultApi.md#repositoryDeleted) | **POST** /repository-deleted | This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.
[**repositoryDispatchSampleCollected**](DefaultApi.md#repositoryDispatchSampleCollected) | **POST** /repository-dispatch-sample.collected | This event occurs when a GitHub App sends a &#x60;POST&#x60; request to &#x60;/repos/{owner}/{repo}/dispatches&#x60;. For more information, see [the REST API documentation for creating a repository dispatch event](https://docs.github.com/rest/repos/repos#create-a-repository-dispatch-event).  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.
[**repositoryEdited**](DefaultApi.md#repositoryEdited) | **POST** /repository-edited | This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.
[**repositoryImport**](DefaultApi.md#repositoryImport) | **POST** /repository-import | This event occurs when a repository is imported to GitHub. For more information, see \&quot;[Importing a repository with GitHub Importer](https://docs.github.com/get-started/importing-your-projects-to-github/importing-source-code-to-github/importing-a-repository-with-github-importer).\&quot; For more information about the API to manage imports, see [the REST API documentation](https://docs.github.com/rest/migrations/source-imports).
[**repositoryPrivatized**](DefaultApi.md#repositoryPrivatized) | **POST** /repository-privatized | This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.
[**repositoryPublicized**](DefaultApi.md#repositoryPublicized) | **POST** /repository-publicized | This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.
[**repositoryRenamed**](DefaultApi.md#repositoryRenamed) | **POST** /repository-renamed | This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.
[**repositoryRulesetCreated**](DefaultApi.md#repositoryRulesetCreated) | **POST** /repository-ruleset-created | This event occurs when there is activity relating to repository rulesets. For more information about repository rulesets, see \&quot;[Managing rulesets](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/managing-rulesets).\&quot; For more information on managing rulesets via the APIs, see [Repository ruleset](https://docs.github.com/graphql/reference/objects#repositoryruleset) in the GraphQL documentation or \&quot;[Repository rules](https://docs.github.com/rest/repos/rules)\&quot; and \&quot;[Organization rules](https://docs.github.com/rest/orgs/rules) in the REST API documentation.\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository or organization permission.
[**repositoryRulesetDeleted**](DefaultApi.md#repositoryRulesetDeleted) | **POST** /repository-ruleset-deleted | This event occurs when there is activity relating to repository rulesets. For more information about repository rulesets, see \&quot;[Managing rulesets](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/managing-rulesets).\&quot; For more information on managing rulesets via the APIs, see [Repository ruleset](https://docs.github.com/graphql/reference/objects#repositoryruleset) in the GraphQL documentation or \&quot;[Repository rules](https://docs.github.com/rest/repos/rules)\&quot; and \&quot;[Organization rules](https://docs.github.com/rest/orgs/rules) in the REST API documentation.\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository or organization permission.
[**repositoryRulesetEdited**](DefaultApi.md#repositoryRulesetEdited) | **POST** /repository-ruleset-edited | This event occurs when there is activity relating to repository rulesets. For more information about repository rulesets, see \&quot;[Managing rulesets](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/managing-rulesets).\&quot; For more information on managing rulesets via the APIs, see [Repository ruleset](https://docs.github.com/graphql/reference/objects#repositoryruleset) in the GraphQL documentation or \&quot;[Repository rules](https://docs.github.com/rest/repos/rules)\&quot; and \&quot;[Organization rules](https://docs.github.com/rest/orgs/rules) in the REST API documentation.\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository or organization permission.
[**repositoryTransferred**](DefaultApi.md#repositoryTransferred) | **POST** /repository-transferred | This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.
[**repositoryUnarchived**](DefaultApi.md#repositoryUnarchived) | **POST** /repository-unarchived | This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.
[**repositoryVulnerabilityAlertCreate**](DefaultApi.md#repositoryVulnerabilityAlertCreate) | **POST** /repository-vulnerability-alert-create | This event occurs when there is activity relating to a security vulnerability alert in a repository.  **Note**: This event is deprecated. Use the &#x60;dependabot_alert&#x60; event instead.
[**repositoryVulnerabilityAlertDismiss**](DefaultApi.md#repositoryVulnerabilityAlertDismiss) | **POST** /repository-vulnerability-alert-dismiss | This event occurs when there is activity relating to a security vulnerability alert in a repository.  **Note**: This event is deprecated. Use the &#x60;dependabot_alert&#x60; event instead.
[**repositoryVulnerabilityAlertReopen**](DefaultApi.md#repositoryVulnerabilityAlertReopen) | **POST** /repository-vulnerability-alert-reopen | This event occurs when there is activity relating to a security vulnerability alert in a repository.  **Note**: This event is deprecated. Use the &#x60;dependabot_alert&#x60; event instead.
[**repositoryVulnerabilityAlertResolve**](DefaultApi.md#repositoryVulnerabilityAlertResolve) | **POST** /repository-vulnerability-alert-resolve | This event occurs when there is activity relating to a security vulnerability alert in a repository.  **Note**: This event is deprecated. Use the &#x60;dependabot_alert&#x60; event instead.
[**secretScanningAlertCreated**](DefaultApi.md#secretScanningAlertCreated) | **POST** /secret-scanning-alert-created | This event occurs when there is activity relating to a secret scanning alert. For more information about secret scanning, see \&quot;[About secret scanning](https://docs.github.com/code-security/secret-scanning/about-secret-scanning).\&quot; For information about the API to manage secret scanning alerts, see \&quot;[Secret scanning](https://docs.github.com/rest/secret-scanning)\&quot; in the REST API documentation.  For activity relating to secret scanning alert locations, use the &#x60;secret_scanning_alert_location&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Secret scanning alerts\&quot; repository permission.
[**secretScanningAlertLocationCreated**](DefaultApi.md#secretScanningAlertLocationCreated) | **POST** /secret-scanning-alert-location-created | This event occurs when there is activity relating to the locations of a secret in a secret scanning alert.  For more information about secret scanning, see \&quot;[About secret scanning](https://docs.github.com/code-security/secret-scanning/about-secret-scanning).\&quot; For information about the API to manage secret scanning alerts, see \&quot;[Secret scanning](https://docs.github.com/rest/secret-scanning)\&quot; in the REST API documentation.  For activity relating to secret scanning alerts, use the &#x60;secret_scanning_alert&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Secret scanning alerts\&quot; repository permission.
[**secretScanningAlertReopened**](DefaultApi.md#secretScanningAlertReopened) | **POST** /secret-scanning-alert-reopened | This event occurs when there is activity relating to a secret scanning alert. For more information about secret scanning, see \&quot;[About secret scanning](https://docs.github.com/code-security/secret-scanning/about-secret-scanning).\&quot; For information about the API to manage secret scanning alerts, see \&quot;[Secret scanning](https://docs.github.com/rest/secret-scanning)\&quot; in the REST API documentation.  For activity relating to secret scanning alert locations, use the &#x60;secret_scanning_alert_location&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Secret scanning alerts\&quot; repository permission.
[**secretScanningAlertResolved**](DefaultApi.md#secretScanningAlertResolved) | **POST** /secret-scanning-alert-resolved | This event occurs when there is activity relating to a secret scanning alert. For more information about secret scanning, see \&quot;[About secret scanning](https://docs.github.com/code-security/secret-scanning/about-secret-scanning).\&quot; For information about the API to manage secret scanning alerts, see \&quot;[Secret scanning](https://docs.github.com/rest/secret-scanning)\&quot; in the REST API documentation.  For activity relating to secret scanning alert locations, use the &#x60;secret_scanning_alert_location&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Secret scanning alerts\&quot; repository permission.
[**secretScanningAlertRevoked**](DefaultApi.md#secretScanningAlertRevoked) | **POST** /secret-scanning-alert-revoked | This event occurs when there is activity relating to a secret scanning alert. For more information about secret scanning, see \&quot;[About secret scanning](https://docs.github.com/code-security/secret-scanning/about-secret-scanning).\&quot; For information about the API to manage secret scanning alerts, see \&quot;[Secret scanning](https://docs.github.com/rest/secret-scanning)\&quot; in the REST API documentation.  For activity relating to secret scanning alert locations, use the &#x60;secret_scanning_alert_location&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Secret scanning alerts\&quot; repository permission.
[**secretScanningAlertValidated**](DefaultApi.md#secretScanningAlertValidated) | **POST** /secret-scanning-alert-validated | This event occurs when there is activity relating to a secret scanning alert. For more information about secret scanning, see \&quot;[About secret scanning](https://docs.github.com/code-security/secret-scanning/about-secret-scanning).\&quot; For information about the API to manage secret scanning alerts, see \&quot;[Secret scanning](https://docs.github.com/rest/secret-scanning)\&quot; in the REST API documentation.  For activity relating to secret scanning alert locations, use the &#x60;secret_scanning_alert_location&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Secret scanning alerts\&quot; repository permission.
[**securityAdvisoryPublished**](DefaultApi.md#securityAdvisoryPublished) | **POST** /security-advisory-published | This event occurs when there is activity relating to a global security advisory that was reviewed by GitHub. A GitHub-reviewed global security advisory provides information about security vulnerabilities or malware that have been mapped to packages in ecosystems we support. For more information about global security advisories, see \&quot;[About global security advisories](https://docs.github.com/code-security/security-advisories/working-with-global-security-advisories-from-the-github-advisory-database/about-global-security-advisories).\&quot; For information about the API to manage security advisories, see [the REST API documentation](https://docs.github.com/rest/security-advisories/global-advisories) or [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#securityadvisory).  GitHub Dependabot alerts are also powered by the security advisory dataset. For more information, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot;
[**securityAdvisoryUpdated**](DefaultApi.md#securityAdvisoryUpdated) | **POST** /security-advisory-updated | This event occurs when there is activity relating to a global security advisory that was reviewed by GitHub. A GitHub-reviewed global security advisory provides information about security vulnerabilities or malware that have been mapped to packages in ecosystems we support. For more information about global security advisories, see \&quot;[About global security advisories](https://docs.github.com/code-security/security-advisories/working-with-global-security-advisories-from-the-github-advisory-database/about-global-security-advisories).\&quot; For information about the API to manage security advisories, see [the REST API documentation](https://docs.github.com/rest/security-advisories/global-advisories) or [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#securityadvisory).  GitHub Dependabot alerts are also powered by the security advisory dataset. For more information, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot;
[**securityAdvisoryWithdrawn**](DefaultApi.md#securityAdvisoryWithdrawn) | **POST** /security-advisory-withdrawn | This event occurs when there is activity relating to a global security advisory that was reviewed by GitHub. A GitHub-reviewed global security advisory provides information about security vulnerabilities or malware that have been mapped to packages in ecosystems we support. For more information about global security advisories, see \&quot;[About global security advisories](https://docs.github.com/code-security/security-advisories/working-with-global-security-advisories-from-the-github-advisory-database/about-global-security-advisories).\&quot; For information about the API to manage security advisories, see [the REST API documentation](https://docs.github.com/rest/security-advisories/global-advisories) or [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#securityadvisory).  GitHub Dependabot alerts are also powered by the security advisory dataset. For more information, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot;
[**securityAndAnalysis**](DefaultApi.md#securityAndAnalysis) | **POST** /security-and-analysis | This event occurs when code security and analysis features are enabled or disabled for a repository. For more information, see \&quot;[GitHub security features](https://docs.github.com/code-security/getting-started/github-security-features).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository permission.
[**sponsorshipCancelled**](DefaultApi.md#sponsorshipCancelled) | **POST** /sponsorship-cancelled | This event occurs when there is activity relating to a sponsorship listing. For more information, see \&quot;[About GitHub Sponsors](https://docs.github.com/sponsors/getting-started-with-github-sponsors/about-github-sponsors).\&quot; For information about the API to manage sponsors, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#sponsorship).  You can only create a sponsorship webhook on GitHub.com. For more information, see \&quot;[Configuring webhooks for events in your sponsored account](https://docs.github.com/sponsors/integrating-with-github-sponsors/configuring-webhooks-for-events-in-your-sponsored-account).\&quot;
[**sponsorshipCreated**](DefaultApi.md#sponsorshipCreated) | **POST** /sponsorship-created | This event occurs when there is activity relating to a sponsorship listing. For more information, see \&quot;[About GitHub Sponsors](https://docs.github.com/sponsors/getting-started-with-github-sponsors/about-github-sponsors).\&quot; For information about the API to manage sponsors, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#sponsorship).  You can only create a sponsorship webhook on GitHub.com. For more information, see \&quot;[Configuring webhooks for events in your sponsored account](https://docs.github.com/sponsors/integrating-with-github-sponsors/configuring-webhooks-for-events-in-your-sponsored-account).\&quot;
[**sponsorshipEdited**](DefaultApi.md#sponsorshipEdited) | **POST** /sponsorship-edited | This event occurs when there is activity relating to a sponsorship listing. For more information, see \&quot;[About GitHub Sponsors](https://docs.github.com/sponsors/getting-started-with-github-sponsors/about-github-sponsors).\&quot; For information about the API to manage sponsors, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#sponsorship).  You can only create a sponsorship webhook on GitHub.com. For more information, see \&quot;[Configuring webhooks for events in your sponsored account](https://docs.github.com/sponsors/integrating-with-github-sponsors/configuring-webhooks-for-events-in-your-sponsored-account).\&quot;
[**sponsorshipPendingCancellation**](DefaultApi.md#sponsorshipPendingCancellation) | **POST** /sponsorship-pending-cancellation | This event occurs when there is activity relating to a sponsorship listing. For more information, see \&quot;[About GitHub Sponsors](https://docs.github.com/sponsors/getting-started-with-github-sponsors/about-github-sponsors).\&quot; For information about the API to manage sponsors, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#sponsorship).  You can only create a sponsorship webhook on GitHub.com. For more information, see \&quot;[Configuring webhooks for events in your sponsored account](https://docs.github.com/sponsors/integrating-with-github-sponsors/configuring-webhooks-for-events-in-your-sponsored-account).\&quot;
[**sponsorshipPendingTierChange**](DefaultApi.md#sponsorshipPendingTierChange) | **POST** /sponsorship-pending-tier-change | This event occurs when there is activity relating to a sponsorship listing. For more information, see \&quot;[About GitHub Sponsors](https://docs.github.com/sponsors/getting-started-with-github-sponsors/about-github-sponsors).\&quot; For information about the API to manage sponsors, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#sponsorship).  You can only create a sponsorship webhook on GitHub.com. For more information, see \&quot;[Configuring webhooks for events in your sponsored account](https://docs.github.com/sponsors/integrating-with-github-sponsors/configuring-webhooks-for-events-in-your-sponsored-account).\&quot;
[**sponsorshipTierChanged**](DefaultApi.md#sponsorshipTierChanged) | **POST** /sponsorship-tier-changed | This event occurs when there is activity relating to a sponsorship listing. For more information, see \&quot;[About GitHub Sponsors](https://docs.github.com/sponsors/getting-started-with-github-sponsors/about-github-sponsors).\&quot; For information about the API to manage sponsors, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#sponsorship).  You can only create a sponsorship webhook on GitHub.com. For more information, see \&quot;[Configuring webhooks for events in your sponsored account](https://docs.github.com/sponsors/integrating-with-github-sponsors/configuring-webhooks-for-events-in-your-sponsored-account).\&quot;
[**starCreated**](DefaultApi.md#starCreated) | **POST** /star-created | This event occurs when there is activity relating to repository stars. For more information about stars, see \&quot;[Saving repositories with stars](https://docs.github.com/get-started/exploring-projects-on-github/saving-repositories-with-stars).\&quot; For information about the APIs to manage stars, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#starredrepositoryconnection) or \&quot;[Starring](https://docs.github.com/rest/activity/starring)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.
[**starDeleted**](DefaultApi.md#starDeleted) | **POST** /star-deleted | This event occurs when there is activity relating to repository stars. For more information about stars, see \&quot;[Saving repositories with stars](https://docs.github.com/get-started/exploring-projects-on-github/saving-repositories-with-stars).\&quot; For information about the APIs to manage stars, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#starredrepositoryconnection) or \&quot;[Starring](https://docs.github.com/rest/activity/starring)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.
[**status**](DefaultApi.md#status) | **POST** /status | This event occurs when the status of a Git commit changes. For example, commits can be marked as &#x60;error&#x60;, &#x60;failure&#x60;, &#x60;pending&#x60;, or &#x60;success&#x60;. For more information, see \&quot;[About status checks](https://docs.github.com/pull-requests/collaborating-with-pull-requests/collaborating-on-repositories-with-code-quality-features/about-status-checks).\&quot; For information about the APIs to manage commit statuses, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#status) or \&quot;[Commit statuses](https://docs.github.com/rest/commits/statuses)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Commit statuses\&quot; repository permission.
[**teamAdd**](DefaultApi.md#teamAdd) | **POST** /team-add | This event occurs when a team is added to a repository. For more information, see \&quot;[Managing teams and people with access to your repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/managing-repository-settings/managing-teams-and-people-with-access-to-your-repository).\&quot;  For activity relating to teams, see the &#x60;teams&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.
[**teamAddedToRepository**](DefaultApi.md#teamAddedToRepository) | **POST** /team-added-to-repository | This event occurs when there is activity relating to teams in an organization. For more information, see \&quot;[About teams](https://docs.github.com/organizations/organizing-members-into-teams/about-teams).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.
[**teamCreated**](DefaultApi.md#teamCreated) | **POST** /team-created | This event occurs when there is activity relating to teams in an organization. For more information, see \&quot;[About teams](https://docs.github.com/organizations/organizing-members-into-teams/about-teams).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.
[**teamDeleted**](DefaultApi.md#teamDeleted) | **POST** /team-deleted | This event occurs when there is activity relating to teams in an organization. For more information, see \&quot;[About teams](https://docs.github.com/organizations/organizing-members-into-teams/about-teams).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.
[**teamEdited**](DefaultApi.md#teamEdited) | **POST** /team-edited | This event occurs when there is activity relating to teams in an organization. For more information, see \&quot;[About teams](https://docs.github.com/organizations/organizing-members-into-teams/about-teams).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.
[**teamRemovedFromRepository**](DefaultApi.md#teamRemovedFromRepository) | **POST** /team-removed-from-repository | This event occurs when there is activity relating to teams in an organization. For more information, see \&quot;[About teams](https://docs.github.com/organizations/organizing-members-into-teams/about-teams).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.
[**watchStarted**](DefaultApi.md#watchStarted) | **POST** /watch-started | This event occurs when there is activity relating to watching, or subscribing to, a repository. For more information about watching, see \&quot;[Managing your subscriptions](https://docs.github.com/account-and-profile/managing-subscriptions-and-notifications-on-github/managing-subscriptions-for-activity-on-github/managing-your-subscriptions).\&quot; For information about the APIs to manage watching, see \&quot;[Watching](https://docs.github.com/rest/activity/watching)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.
[**workflowDispatch**](DefaultApi.md#workflowDispatch) | **POST** /workflow-dispatch | This event occurs when a GitHub Actions workflow is manually triggered. For more information, see \&quot;[Manually running a workflow](https://docs.github.com/actions/managing-workflow-runs/manually-running-a-workflow).\&quot;  For activity relating to workflow runs, use the &#x60;workflow_run&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.
[**workflowJobCompleted**](DefaultApi.md#workflowJobCompleted) | **POST** /workflow-job-completed | This event occurs when there is activity relating to a job in a GitHub Actions workflow. For more information, see \&quot;[Using jobs in a workflow](https://docs.github.com/actions/using-jobs/using-jobs-in-a-workflow).\&quot; For information about the API to manage workflow jobs, see \&quot;[Workflow jobs](https://docs.github.com/rest/actions/workflow-jobs)\&quot; in the REST API documentation.  For activity relating to a workflow run instead of a job in a workflow run, use the &#x60;workflow_run&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Actions\&quot; repository permission.
[**workflowJobInProgress**](DefaultApi.md#workflowJobInProgress) | **POST** /workflow-job-in-progress | This event occurs when there is activity relating to a job in a GitHub Actions workflow. For more information, see \&quot;[Using jobs in a workflow](https://docs.github.com/actions/using-jobs/using-jobs-in-a-workflow).\&quot; For information about the API to manage workflow jobs, see \&quot;[Workflow jobs](https://docs.github.com/rest/actions/workflow-jobs)\&quot; in the REST API documentation.  For activity relating to a workflow run instead of a job in a workflow run, use the &#x60;workflow_run&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Actions\&quot; repository permission.
[**workflowJobQueued**](DefaultApi.md#workflowJobQueued) | **POST** /workflow-job-queued | This event occurs when there is activity relating to a job in a GitHub Actions workflow. For more information, see \&quot;[Using jobs in a workflow](https://docs.github.com/actions/using-jobs/using-jobs-in-a-workflow).\&quot; For information about the API to manage workflow jobs, see \&quot;[Workflow jobs](https://docs.github.com/rest/actions/workflow-jobs)\&quot; in the REST API documentation.  For activity relating to a workflow run instead of a job in a workflow run, use the &#x60;workflow_run&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Actions\&quot; repository permission.
[**workflowJobWaiting**](DefaultApi.md#workflowJobWaiting) | **POST** /workflow-job-waiting | This event occurs when there is activity relating to a job in a GitHub Actions workflow. For more information, see \&quot;[Using jobs in a workflow](https://docs.github.com/actions/using-jobs/using-jobs-in-a-workflow).\&quot; For information about the API to manage workflow jobs, see \&quot;[Workflow jobs](https://docs.github.com/rest/actions/workflow-jobs)\&quot; in the REST API documentation.  For activity relating to a workflow run instead of a job in a workflow run, use the &#x60;workflow_run&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Actions\&quot; repository permission.
[**workflowRunCompleted**](DefaultApi.md#workflowRunCompleted) | **POST** /workflow-run-completed | This event occurs when there is activity relating to a run of a GitHub Actions workflow. For more information, see \&quot;[About workflows](https://docs.github.com/actions/using-workflows/about-workflows).\&quot; For information about the APIs to manage workflow runs, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#workflowrun) or \&quot;[Workflow runs](https://docs.github.com/rest/actions/workflow-runs)\&quot; in the REST API documentation.  For activity relating to a job in a workflow run, use the &#x60;workflow_job&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Actions\&quot; repository permission.
[**workflowRunInProgress**](DefaultApi.md#workflowRunInProgress) | **POST** /workflow-run-in-progress | This event occurs when there is activity relating to a run of a GitHub Actions workflow. For more information, see \&quot;[About workflows](https://docs.github.com/actions/using-workflows/about-workflows).\&quot; For information about the APIs to manage workflow runs, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#workflowrun) or \&quot;[Workflow runs](https://docs.github.com/rest/actions/workflow-runs)\&quot; in the REST API documentation.  For activity relating to a job in a workflow run, use the &#x60;workflow_job&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Actions\&quot; repository permission.
[**workflowRunRequested**](DefaultApi.md#workflowRunRequested) | **POST** /workflow-run-requested | This event occurs when there is activity relating to a run of a GitHub Actions workflow. For more information, see \&quot;[About workflows](https://docs.github.com/actions/using-workflows/about-workflows).\&quot; For information about the APIs to manage workflow runs, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#workflowrun) or \&quot;[Workflow runs](https://docs.github.com/rest/actions/workflow-runs)\&quot; in the REST API documentation.  For activity relating to a job in a workflow run, use the &#x60;workflow_job&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Actions\&quot; repository permission.


<a id="branchProtectionConfigurationDisabled"></a>
# **branchProtectionConfigurationDisabled**
> branchProtectionConfigurationDisabled(webhookBranchProtectionConfigurationDisabled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is a change to branch protection configurations for a repository. For more information, see \&quot;[About protected branches](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/defining-the-mergeability-of-pull-requests/about-protected-branches).\&quot; For information about using the APIs to manage branch protection rules, see \&quot;[Branch protection rule](https://docs.github.com/graphql/reference/objects#branchprotectionrule)\&quot; in the GraphQL documentation or \&quot;[Branch protection](https://docs.github.com/rest/branches/branch-protection)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository permission.

All branch protections were disabled for a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookBranchProtectionConfigurationDisabled : WebhookBranchProtectionConfigurationDisabled =  // WebhookBranchProtectionConfigurationDisabled | 
val userAgent : kotlin.String = GitHub-Hookshot/123abc // kotlin.String | 
val xGithubHookId : kotlin.String = 12312312 // kotlin.String | 
val xGithubEvent : kotlin.String = issues // kotlin.String | 
val xGithubHookInstallationTargetId : kotlin.String = 123123 // kotlin.String | 
val xGithubHookInstallationTargetType : kotlin.String = repository // kotlin.String | 
val xGitHubDelivery : kotlin.String = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.String | 
val xHubSignature256 : kotlin.String = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.String | 
try {
    apiInstance.branchProtectionConfigurationDisabled(webhookBranchProtectionConfigurationDisabled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#branchProtectionConfigurationDisabled")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#branchProtectionConfigurationDisabled")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookBranchProtectionConfigurationDisabled** | [**WebhookBranchProtectionConfigurationDisabled**](WebhookBranchProtectionConfigurationDisabled.md)|  |
 **userAgent** | **kotlin.String**|  | [optional] [default to &quot;push&quot;]
 **xGithubHookId** | **kotlin.String**|  | [optional] [default to &quot;push&quot;]
 **xGithubEvent** | **kotlin.String**|  | [optional] [default to &quot;push&quot;]
 **xGithubHookInstallationTargetId** | **kotlin.String**|  | [optional] [default to &quot;push&quot;]
 **xGithubHookInstallationTargetType** | **kotlin.String**|  | [optional] [default to &quot;push&quot;]
 **xGitHubDelivery** | **kotlin.String**|  | [optional] [default to &quot;push&quot;]
 **xHubSignature256** | **kotlin.String**|  | [optional] [default to &quot;push&quot;]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="branchProtectionConfigurationEnabled"></a>
# **branchProtectionConfigurationEnabled**
> branchProtectionConfigurationEnabled(webhookBranchProtectionConfigurationEnabled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is a change to branch protection configurations for a repository. For more information, see \&quot;[About protected branches](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/defining-the-mergeability-of-pull-requests/about-protected-branches).\&quot; For information about using the APIs to manage branch protection rules, see \&quot;[Branch protection rule](https://docs.github.com/graphql/reference/objects#branchprotectionrule)\&quot; in the GraphQL documentation or \&quot;[Branch protection](https://docs.github.com/rest/branches/branch-protection)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository permission.

All branch protections were enabled for a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookBranchProtectionConfigurationEnabled : WebhookBranchProtectionConfigurationEnabled =  // WebhookBranchProtectionConfigurationEnabled | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.branchProtectionConfigurationEnabled(webhookBranchProtectionConfigurationEnabled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#branchProtectionConfigurationEnabled")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#branchProtectionConfigurationEnabled")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookBranchProtectionConfigurationEnabled** | [**WebhookBranchProtectionConfigurationEnabled**](WebhookBranchProtectionConfigurationEnabled.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="branchProtectionRuleCreated"></a>
# **branchProtectionRuleCreated**
> branchProtectionRuleCreated(webhookBranchProtectionRuleCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to branch protection rules. For more information, see \&quot;[About protected branches](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/defining-the-mergeability-of-pull-requests/about-protected-branches).\&quot; For information about the APIs to manage branch protection rules, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#branchprotectionrule) or \&quot;[Branch protection](https://docs.github.com/rest/branches/branch-protection)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository permission.

A branch protection rule was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookBranchProtectionRuleCreated : WebhookBranchProtectionRuleCreated =  // WebhookBranchProtectionRuleCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.branchProtectionRuleCreated(webhookBranchProtectionRuleCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#branchProtectionRuleCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#branchProtectionRuleCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookBranchProtectionRuleCreated** | [**WebhookBranchProtectionRuleCreated**](WebhookBranchProtectionRuleCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="branchProtectionRuleDeleted"></a>
# **branchProtectionRuleDeleted**
> branchProtectionRuleDeleted(webhookBranchProtectionRuleDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to branch protection rules. For more information, see \&quot;[About protected branches](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/defining-the-mergeability-of-pull-requests/about-protected-branches).\&quot; For information about the APIs to manage branch protection rules, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#branchprotectionrule) or \&quot;[Branch protection](https://docs.github.com/rest/branches/branch-protection)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository permission.

A branch protection rule was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookBranchProtectionRuleDeleted : WebhookBranchProtectionRuleDeleted =  // WebhookBranchProtectionRuleDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.branchProtectionRuleDeleted(webhookBranchProtectionRuleDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#branchProtectionRuleDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#branchProtectionRuleDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookBranchProtectionRuleDeleted** | [**WebhookBranchProtectionRuleDeleted**](WebhookBranchProtectionRuleDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="branchProtectionRuleEdited"></a>
# **branchProtectionRuleEdited**
> branchProtectionRuleEdited(webhookBranchProtectionRuleEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to branch protection rules. For more information, see \&quot;[About protected branches](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/defining-the-mergeability-of-pull-requests/about-protected-branches).\&quot; For information about the APIs to manage branch protection rules, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#branchprotectionrule) or \&quot;[Branch protection](https://docs.github.com/rest/branches/branch-protection)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository permission.

A branch protection rule was edited.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookBranchProtectionRuleEdited : WebhookBranchProtectionRuleEdited =  // WebhookBranchProtectionRuleEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.branchProtectionRuleEdited(webhookBranchProtectionRuleEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#branchProtectionRuleEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#branchProtectionRuleEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookBranchProtectionRuleEdited** | [**WebhookBranchProtectionRuleEdited**](WebhookBranchProtectionRuleEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="callPublic"></a>
# **callPublic**
> callPublic(webhookPublic, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when repository visibility changes from private to public. For more information, see \&quot;[Setting repository visibility](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/managing-repository-settings/setting-repository-visibility).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPublic : WebhookPublic =  // WebhookPublic | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.callPublic(webhookPublic, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#callPublic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#callPublic")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPublic** | [**WebhookPublic**](WebhookPublic.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="checkRunCompleted"></a>
# **checkRunCompleted**
> checkRunCompleted(webhookCheckRunCompleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a check run. For information about check runs, see \&quot;[Getting started with the Checks API](https://docs.github.com/rest/guides/getting-started-with-the-checks-api).\&quot; For information about the APIs to manage check runs, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#checkrun) or \&quot;[Check Runs](https://docs.github.com/rest/checks/runs)\&quot; in the REST API documentation.  For activity relating to check suites, use the &#x60;check-suite&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Checks\&quot; repository permission. To receive the &#x60;rerequested&#x60; and &#x60;requested_action&#x60; event types, the app must have at least write-level access for the \&quot;Checks\&quot; permission. GitHub Apps with write-level access for the \&quot;Checks\&quot; permission are automatically subscribed to this webhook event.  Repository and organization webhooks only receive payloads for the &#x60;created&#x60; and &#x60;completed&#x60; event types in repositories.  **Note**: The API only looks for pushes in the repository where the check run was created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array and a &#x60;null&#x60; value for &#x60;head_branch&#x60;.

A check run was completed, and a conclusion is available.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCheckRunCompleted : WebhookCheckRunCompleted =  // WebhookCheckRunCompleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.checkRunCompleted(webhookCheckRunCompleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#checkRunCompleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#checkRunCompleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCheckRunCompleted** | [**WebhookCheckRunCompleted**](WebhookCheckRunCompleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: Not defined

<a id="checkRunCreated"></a>
# **checkRunCreated**
> checkRunCreated(webhookCheckRunCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a check run. For information about check runs, see \&quot;[Getting started with the Checks API](https://docs.github.com/rest/guides/getting-started-with-the-checks-api).\&quot; For information about the APIs to manage check runs, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#checkrun) or \&quot;[Check Runs](https://docs.github.com/rest/checks/runs)\&quot; in the REST API documentation.  For activity relating to check suites, use the &#x60;check-suite&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Checks\&quot; repository permission. To receive the &#x60;rerequested&#x60; and &#x60;requested_action&#x60; event types, the app must have at least write-level access for the \&quot;Checks\&quot; permission. GitHub Apps with write-level access for the \&quot;Checks\&quot; permission are automatically subscribed to this webhook event.  Repository and organization webhooks only receive payloads for the &#x60;created&#x60; and &#x60;completed&#x60; event types in repositories.  **Note**: The API only looks for pushes in the repository where the check run was created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array and a &#x60;null&#x60; value for &#x60;head_branch&#x60;.

A new check run was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCheckRunCreated : WebhookCheckRunCreated =  // WebhookCheckRunCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.checkRunCreated(webhookCheckRunCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#checkRunCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#checkRunCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCheckRunCreated** | [**WebhookCheckRunCreated**](WebhookCheckRunCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: Not defined

<a id="checkRunRequestedAction"></a>
# **checkRunRequestedAction**
> checkRunRequestedAction(webhookCheckRunRequestedAction, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a check run. For information about check runs, see \&quot;[Getting started with the Checks API](https://docs.github.com/rest/guides/getting-started-with-the-checks-api).\&quot; For information about the APIs to manage check runs, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#checkrun) or \&quot;[Check Runs](https://docs.github.com/rest/checks/runs)\&quot; in the REST API documentation.  For activity relating to check suites, use the &#x60;check-suite&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Checks\&quot; repository permission. To receive the &#x60;rerequested&#x60; and &#x60;requested_action&#x60; event types, the app must have at least write-level access for the \&quot;Checks\&quot; permission. GitHub Apps with write-level access for the \&quot;Checks\&quot; permission are automatically subscribed to this webhook event.  Repository and organization webhooks only receive payloads for the &#x60;created&#x60; and &#x60;completed&#x60; event types in repositories.  **Note**: The API only looks for pushes in the repository where the check run was created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array and a &#x60;null&#x60; value for &#x60;head_branch&#x60;.

A check run completed, and someone requested a followup action that your app provides. Only the GitHub App someone requests to perform an action will receive the &#x60;requested_action&#x60; payload. For more information, see \&quot;[Creating CI tests with the Checks API](https://docs.github.com/developers/apps/guides/creating-ci-tests-with-the-checks-api).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCheckRunRequestedAction : WebhookCheckRunRequestedAction =  // WebhookCheckRunRequestedAction | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.checkRunRequestedAction(webhookCheckRunRequestedAction, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#checkRunRequestedAction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#checkRunRequestedAction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCheckRunRequestedAction** | [**WebhookCheckRunRequestedAction**](WebhookCheckRunRequestedAction.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: Not defined

<a id="checkRunRerequested"></a>
# **checkRunRerequested**
> checkRunRerequested(webhookCheckRunRerequested, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a check run. For information about check runs, see \&quot;[Getting started with the Checks API](https://docs.github.com/rest/guides/getting-started-with-the-checks-api).\&quot; For information about the APIs to manage check runs, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#checkrun) or \&quot;[Check Runs](https://docs.github.com/rest/checks/runs)\&quot; in the REST API documentation.  For activity relating to check suites, use the &#x60;check-suite&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Checks\&quot; repository permission. To receive the &#x60;rerequested&#x60; and &#x60;requested_action&#x60; event types, the app must have at least write-level access for the \&quot;Checks\&quot; permission. GitHub Apps with write-level access for the \&quot;Checks\&quot; permission are automatically subscribed to this webhook event.  Repository and organization webhooks only receive payloads for the &#x60;created&#x60; and &#x60;completed&#x60; event types in repositories.  **Note**: The API only looks for pushes in the repository where the check run was created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array and a &#x60;null&#x60; value for &#x60;head_branch&#x60;.

Someone requested to re-run a check run. Only the GitHub App that someone requests to re-run the check will receive the &#x60;rerequested&#x60; payload.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCheckRunRerequested : WebhookCheckRunRerequested =  // WebhookCheckRunRerequested | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.checkRunRerequested(webhookCheckRunRerequested, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#checkRunRerequested")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#checkRunRerequested")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCheckRunRerequested** | [**WebhookCheckRunRerequested**](WebhookCheckRunRerequested.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: Not defined

<a id="checkSuiteCompleted"></a>
# **checkSuiteCompleted**
> checkSuiteCompleted(webhookCheckSuiteCompleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a check suite. For information about check suites, see \&quot;[Getting started with the Checks API](https://docs.github.com/rest/guides/getting-started-with-the-checks-api).\&quot; For information about the APIs to manage check suites, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#checksuite) or \&quot;[Check Suites](https://docs.github.com/rest/checks/suites)\&quot; in the REST API documentation.  For activity relating to check runs, use the &#x60;check_run&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Checks\&quot; permission. To receive the &#x60;requested&#x60; and &#x60;rerequested&#x60; event types, the app must have at least write-level access for the \&quot;Checks\&quot; permission. GitHub Apps with write-level access for the \&quot;Checks\&quot; permission are automatically subscribed to this webhook event.  Repository and organization webhooks only receive payloads for the &#x60;completed&#x60; event types in repositories.  **Note**: The API only looks for pushes in the repository where the check suite was created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array and a &#x60;null&#x60; value for &#x60;head_branch&#x60;.

All check runs in a check suite have completed, and a conclusion is available.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCheckSuiteCompleted : WebhookCheckSuiteCompleted =  // WebhookCheckSuiteCompleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.checkSuiteCompleted(webhookCheckSuiteCompleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#checkSuiteCompleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#checkSuiteCompleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCheckSuiteCompleted** | [**WebhookCheckSuiteCompleted**](WebhookCheckSuiteCompleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="checkSuiteRequested"></a>
# **checkSuiteRequested**
> checkSuiteRequested(webhookCheckSuiteRequested, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a check suite. For information about check suites, see \&quot;[Getting started with the Checks API](https://docs.github.com/rest/guides/getting-started-with-the-checks-api).\&quot; For information about the APIs to manage check suites, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#checksuite) or \&quot;[Check Suites](https://docs.github.com/rest/checks/suites)\&quot; in the REST API documentation.  For activity relating to check runs, use the &#x60;check_run&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Checks\&quot; permission. To receive the &#x60;requested&#x60; and &#x60;rerequested&#x60; event types, the app must have at least write-level access for the \&quot;Checks\&quot; permission. GitHub Apps with write-level access for the \&quot;Checks\&quot; permission are automatically subscribed to this webhook event.  Repository and organization webhooks only receive payloads for the &#x60;completed&#x60; event types in repositories.  **Note**: The API only looks for pushes in the repository where the check suite was created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array and a &#x60;null&#x60; value for &#x60;head_branch&#x60;.

Someone requested to run a check suite. By default, check suites are automatically created when you create a check run. For more information, see [the GraphQL API documentation for creating a check run](https://docs.github.com/graphql/reference/mutations#createcheckrun) or \&quot;[Create a check run](https://docs.github.com/rest/checks/runs#create-a-check-run)\&quot; in the REST API documentation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCheckSuiteRequested : WebhookCheckSuiteRequested =  // WebhookCheckSuiteRequested | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.checkSuiteRequested(webhookCheckSuiteRequested, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#checkSuiteRequested")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#checkSuiteRequested")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCheckSuiteRequested** | [**WebhookCheckSuiteRequested**](WebhookCheckSuiteRequested.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="checkSuiteRerequested"></a>
# **checkSuiteRerequested**
> checkSuiteRerequested(webhookCheckSuiteRerequested, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a check suite. For information about check suites, see \&quot;[Getting started with the Checks API](https://docs.github.com/rest/guides/getting-started-with-the-checks-api).\&quot; For information about the APIs to manage check suites, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#checksuite) or \&quot;[Check Suites](https://docs.github.com/rest/checks/suites)\&quot; in the REST API documentation.  For activity relating to check runs, use the &#x60;check_run&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Checks\&quot; permission. To receive the &#x60;requested&#x60; and &#x60;rerequested&#x60; event types, the app must have at least write-level access for the \&quot;Checks\&quot; permission. GitHub Apps with write-level access for the \&quot;Checks\&quot; permission are automatically subscribed to this webhook event.  Repository and organization webhooks only receive payloads for the &#x60;completed&#x60; event types in repositories.  **Note**: The API only looks for pushes in the repository where the check suite was created. Pushes to a branch in a forked repository are not detected and return an empty &#x60;pull_requests&#x60; array and a &#x60;null&#x60; value for &#x60;head_branch&#x60;.

Someone requested to re-run the check runs in a check suite. For more information, see [the GraphQL API documentation for creating a check suite](https://docs.github.com/graphql/reference/mutations#createchecksuite) or \&quot;[Create a check suite](https://docs.github.com/rest/checks/suites#create-a-check-suite)\&quot; in the REST API documentation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCheckSuiteRerequested : WebhookCheckSuiteRerequested =  // WebhookCheckSuiteRerequested | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.checkSuiteRerequested(webhookCheckSuiteRerequested, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#checkSuiteRerequested")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#checkSuiteRerequested")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCheckSuiteRerequested** | [**WebhookCheckSuiteRerequested**](WebhookCheckSuiteRerequested.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="codeScanningAlertAppearedInBranch"></a>
# **codeScanningAlertAppearedInBranch**
> codeScanningAlertAppearedInBranch(webhookCodeScanningAlertAppearedInBranch, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to code scanning alerts in a repository. For more information, see \&quot;[About code scanning](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning)\&quot; and \&quot;[About code scanning alerts](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning-alerts).\&quot; For information about the API to manage code scanning, see \&quot;[Code scanning](https://docs.github.com/rest/code-scanning)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Code scanning alerts\&quot; repository permission.

A previously created code scanning alert appeared in another branch. This can happen when a branch is merged into or created from a branch with a pre-existing code scanning alert.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCodeScanningAlertAppearedInBranch : WebhookCodeScanningAlertAppearedInBranch =  // WebhookCodeScanningAlertAppearedInBranch | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.codeScanningAlertAppearedInBranch(webhookCodeScanningAlertAppearedInBranch, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#codeScanningAlertAppearedInBranch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#codeScanningAlertAppearedInBranch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCodeScanningAlertAppearedInBranch** | [**WebhookCodeScanningAlertAppearedInBranch**](WebhookCodeScanningAlertAppearedInBranch.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="codeScanningAlertClosedByUser"></a>
# **codeScanningAlertClosedByUser**
> codeScanningAlertClosedByUser(webhookCodeScanningAlertClosedByUser, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to code scanning alerts in a repository. For more information, see \&quot;[About code scanning](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning)\&quot; and \&quot;[About code scanning alerts](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning-alerts).\&quot; For information about the API to manage code scanning, see \&quot;[Code scanning](https://docs.github.com/rest/code-scanning)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Code scanning alerts\&quot; repository permission.

Someone closed a code scanning alert.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCodeScanningAlertClosedByUser : WebhookCodeScanningAlertClosedByUser =  // WebhookCodeScanningAlertClosedByUser | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.codeScanningAlertClosedByUser(webhookCodeScanningAlertClosedByUser, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#codeScanningAlertClosedByUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#codeScanningAlertClosedByUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCodeScanningAlertClosedByUser** | [**WebhookCodeScanningAlertClosedByUser**](WebhookCodeScanningAlertClosedByUser.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="codeScanningAlertCreated"></a>
# **codeScanningAlertCreated**
> codeScanningAlertCreated(webhookCodeScanningAlertCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to code scanning alerts in a repository. For more information, see \&quot;[About code scanning](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning)\&quot; and \&quot;[About code scanning alerts](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning-alerts).\&quot; For information about the API to manage code scanning, see \&quot;[Code scanning](https://docs.github.com/rest/code-scanning)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Code scanning alerts\&quot; repository permission.

A code scanning alert was created in a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCodeScanningAlertCreated : WebhookCodeScanningAlertCreated =  // WebhookCodeScanningAlertCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.codeScanningAlertCreated(webhookCodeScanningAlertCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#codeScanningAlertCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#codeScanningAlertCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCodeScanningAlertCreated** | [**WebhookCodeScanningAlertCreated**](WebhookCodeScanningAlertCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="codeScanningAlertFixed"></a>
# **codeScanningAlertFixed**
> codeScanningAlertFixed(webhookCodeScanningAlertFixed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to code scanning alerts in a repository. For more information, see \&quot;[About code scanning](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning)\&quot; and \&quot;[About code scanning alerts](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning-alerts).\&quot; For information about the API to manage code scanning, see \&quot;[Code scanning](https://docs.github.com/rest/code-scanning)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Code scanning alerts\&quot; repository permission.

A code scanning alert was fixed in a branch by a commit.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCodeScanningAlertFixed : WebhookCodeScanningAlertFixed =  // WebhookCodeScanningAlertFixed | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.codeScanningAlertFixed(webhookCodeScanningAlertFixed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#codeScanningAlertFixed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#codeScanningAlertFixed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCodeScanningAlertFixed** | [**WebhookCodeScanningAlertFixed**](WebhookCodeScanningAlertFixed.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="codeScanningAlertReopened"></a>
# **codeScanningAlertReopened**
> codeScanningAlertReopened(webhookCodeScanningAlertReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to code scanning alerts in a repository. For more information, see \&quot;[About code scanning](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning)\&quot; and \&quot;[About code scanning alerts](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning-alerts).\&quot; For information about the API to manage code scanning, see \&quot;[Code scanning](https://docs.github.com/rest/code-scanning)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Code scanning alerts\&quot; repository permission.

A previously fixed code scanning alert reappeared in a branch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCodeScanningAlertReopened : WebhookCodeScanningAlertReopened =  // WebhookCodeScanningAlertReopened | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.codeScanningAlertReopened(webhookCodeScanningAlertReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#codeScanningAlertReopened")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#codeScanningAlertReopened")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCodeScanningAlertReopened** | [**WebhookCodeScanningAlertReopened**](WebhookCodeScanningAlertReopened.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="codeScanningAlertReopenedByUser"></a>
# **codeScanningAlertReopenedByUser**
> codeScanningAlertReopenedByUser(webhookCodeScanningAlertReopenedByUser, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to code scanning alerts in a repository. For more information, see \&quot;[About code scanning](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning)\&quot; and \&quot;[About code scanning alerts](https://docs.github.com/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning-alerts).\&quot; For information about the API to manage code scanning, see \&quot;[Code scanning](https://docs.github.com/rest/code-scanning)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Code scanning alerts\&quot; repository permission.

Someone reopened a code scanning alert.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCodeScanningAlertReopenedByUser : WebhookCodeScanningAlertReopenedByUser =  // WebhookCodeScanningAlertReopenedByUser | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.codeScanningAlertReopenedByUser(webhookCodeScanningAlertReopenedByUser, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#codeScanningAlertReopenedByUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#codeScanningAlertReopenedByUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCodeScanningAlertReopenedByUser** | [**WebhookCodeScanningAlertReopenedByUser**](WebhookCodeScanningAlertReopenedByUser.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="commitCommentCreated"></a>
# **commitCommentCreated**
> commitCommentCreated(webhookCommitCommentCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to commit comments. For more information about commit comments, see \&quot;[Commenting on a pull request](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/commenting-on-a-pull-request).\&quot; For information about the APIs to manage commit comments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#commitcomment) or \&quot;[Commit comments](https://docs.github.com/rest/commits/comments)\&quot; in the REST API documentation.  For activity relating to comments on pull request reviews, use the &#x60;pull_request_review_comment&#x60; event. For activity relating to issue comments, use the &#x60;issue_comment&#x60; event. For activity relating to discussion comments, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.

Someone commented on a commit.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCommitCommentCreated : WebhookCommitCommentCreated =  // WebhookCommitCommentCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.commitCommentCreated(webhookCommitCommentCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#commitCommentCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#commitCommentCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCommitCommentCreated** | [**WebhookCommitCommentCreated**](WebhookCommitCommentCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="create"></a>
# **create**
> create(webhookCreate, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when a Git branch or tag is created.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.  **Notes**: - This event will not occur when more than three tags are created at once. - Payloads are capped at 25 MB. If an event generates a larger payload, GitHub will not deliver a payload for that webhook event. This may happen, for example, if many branches or tags are pushed at once. We suggest monitoring your payload size to ensure delivery.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCreate : WebhookCreate =  // WebhookCreate | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.create(webhookCreate, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#create")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#create")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCreate** | [**WebhookCreate**](WebhookCreate.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="customPropertyCreated"></a>
# **customPropertyCreated**
> customPropertyCreated(webhookCustomPropertyCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a custom property.  For more information, see \&quot;[Managing custom properties for repositories in your organization](https://docs.github.com/organizations/managing-organization-settings/managing-custom-properties-for-repositories-in-your-organization)\&quot;. For information about the APIs to manage custom properties, see \&quot;[Custom properties](https://docs.github.com/rest/orgs/custom-properties)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Custom properties\&quot; organization permission.

A new custom property was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCustomPropertyCreated : WebhookCustomPropertyCreated =  // WebhookCustomPropertyCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.customPropertyCreated(webhookCustomPropertyCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#customPropertyCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#customPropertyCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCustomPropertyCreated** | [**WebhookCustomPropertyCreated**](WebhookCustomPropertyCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="customPropertyDeleted"></a>
# **customPropertyDeleted**
> customPropertyDeleted(webhookCustomPropertyDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a custom property.  For more information, see \&quot;[Managing custom properties for repositories in your organization](https://docs.github.com/organizations/managing-organization-settings/managing-custom-properties-for-repositories-in-your-organization)\&quot;. For information about the APIs to manage custom properties, see \&quot;[Custom properties](https://docs.github.com/rest/orgs/custom-properties)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Custom properties\&quot; organization permission.

A custom property was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCustomPropertyDeleted : WebhookCustomPropertyDeleted =  // WebhookCustomPropertyDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.customPropertyDeleted(webhookCustomPropertyDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#customPropertyDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#customPropertyDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCustomPropertyDeleted** | [**WebhookCustomPropertyDeleted**](WebhookCustomPropertyDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="customPropertyUpdated"></a>
# **customPropertyUpdated**
> customPropertyUpdated(webhookCustomPropertyUpdated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a custom property.  For more information, see \&quot;[Managing custom properties for repositories in your organization](https://docs.github.com/organizations/managing-organization-settings/managing-custom-properties-for-repositories-in-your-organization)\&quot;. For information about the APIs to manage custom properties, see \&quot;[Custom properties](https://docs.github.com/rest/orgs/custom-properties)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Custom properties\&quot; organization permission.

A custom property was updated.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCustomPropertyUpdated : WebhookCustomPropertyUpdated =  // WebhookCustomPropertyUpdated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.customPropertyUpdated(webhookCustomPropertyUpdated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#customPropertyUpdated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#customPropertyUpdated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCustomPropertyUpdated** | [**WebhookCustomPropertyUpdated**](WebhookCustomPropertyUpdated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="customPropertyValuesUpdated"></a>
# **customPropertyValuesUpdated**
> customPropertyValuesUpdated(webhookCustomPropertyValuesUpdated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to custom property values for a repository.  For more information, see \&quot;[Managing custom properties for repositories in your organization](https://docs.github.com/organizations/managing-organization-settings/managing-custom-properties-for-repositories-in-your-organization)\&quot;. For information about the APIs to manage custom properties for a repository, see \&quot;[Custom properties](https://docs.github.com/rest/repos/custom-properties)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Custom properties\&quot; organization permission.

The custom property values of a repository were updated.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookCustomPropertyValuesUpdated : WebhookCustomPropertyValuesUpdated =  // WebhookCustomPropertyValuesUpdated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.customPropertyValuesUpdated(webhookCustomPropertyValuesUpdated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#customPropertyValuesUpdated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#customPropertyValuesUpdated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookCustomPropertyValuesUpdated** | [**WebhookCustomPropertyValuesUpdated**](WebhookCustomPropertyValuesUpdated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="delete"></a>
# **delete**
> delete(webhookDelete, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when a Git branch or tag is deleted. To subscribe to all pushes to a repository, including branch and tag deletions, use the [&#x60;push&#x60;](#push) webhook event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.  **Note**: This event will not occur when more than three tags are deleted at once.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDelete : WebhookDelete =  // WebhookDelete | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.delete(webhookDelete, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#delete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#delete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDelete** | [**WebhookDelete**](WebhookDelete.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="dependabotAlertAutoDismissed"></a>
# **dependabotAlertAutoDismissed**
> dependabotAlertAutoDismissed(webhookDependabotAlertAutoDismissed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to Dependabot alerts.  For more information about Dependabot alerts, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot; For information about the API to manage Dependabot alerts, see \&quot;[Dependabot alerts](https://docs.github.com/rest/dependabot/alerts)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Dependabot alerts\&quot; repository permission.  **Note**: Webhook events for Dependabot alerts are currently in beta and subject to change.

A Dependabot alert was automatically closed by a Dependabot auto-triage rule.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDependabotAlertAutoDismissed : WebhookDependabotAlertAutoDismissed =  // WebhookDependabotAlertAutoDismissed | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.dependabotAlertAutoDismissed(webhookDependabotAlertAutoDismissed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#dependabotAlertAutoDismissed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#dependabotAlertAutoDismissed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDependabotAlertAutoDismissed** | [**WebhookDependabotAlertAutoDismissed**](WebhookDependabotAlertAutoDismissed.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="dependabotAlertAutoReopened"></a>
# **dependabotAlertAutoReopened**
> dependabotAlertAutoReopened(webhookDependabotAlertAutoReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to Dependabot alerts.  For more information about Dependabot alerts, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot; For information about the API to manage Dependabot alerts, see \&quot;[Dependabot alerts](https://docs.github.com/rest/dependabot/alerts)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Dependabot alerts\&quot; repository permission.  **Note**: Webhook events for Dependabot alerts are currently in beta and subject to change.

A Dependabot alert, that had been automatically closed by a Dependabot auto-triage rule, was automatically reopened because the alert metadata or rule changed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDependabotAlertAutoReopened : WebhookDependabotAlertAutoReopened =  // WebhookDependabotAlertAutoReopened | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.dependabotAlertAutoReopened(webhookDependabotAlertAutoReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#dependabotAlertAutoReopened")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#dependabotAlertAutoReopened")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDependabotAlertAutoReopened** | [**WebhookDependabotAlertAutoReopened**](WebhookDependabotAlertAutoReopened.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="dependabotAlertCreated"></a>
# **dependabotAlertCreated**
> dependabotAlertCreated(webhookDependabotAlertCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to Dependabot alerts.  For more information about Dependabot alerts, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot; For information about the API to manage Dependabot alerts, see \&quot;[Dependabot alerts](https://docs.github.com/rest/dependabot/alerts)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Dependabot alerts\&quot; repository permission.  **Note**: Webhook events for Dependabot alerts are currently in beta and subject to change.

A manifest file change introduced a vulnerable dependency, or a GitHub Security Advisory was published and an existing dependency was found to be vulnerable.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDependabotAlertCreated : WebhookDependabotAlertCreated =  // WebhookDependabotAlertCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.dependabotAlertCreated(webhookDependabotAlertCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#dependabotAlertCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#dependabotAlertCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDependabotAlertCreated** | [**WebhookDependabotAlertCreated**](WebhookDependabotAlertCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="dependabotAlertDismissed"></a>
# **dependabotAlertDismissed**
> dependabotAlertDismissed(webhookDependabotAlertDismissed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to Dependabot alerts.  For more information about Dependabot alerts, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot; For information about the API to manage Dependabot alerts, see \&quot;[Dependabot alerts](https://docs.github.com/rest/dependabot/alerts)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Dependabot alerts\&quot; repository permission.  **Note**: Webhook events for Dependabot alerts are currently in beta and subject to change.

A Dependabot alert was manually closed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDependabotAlertDismissed : WebhookDependabotAlertDismissed =  // WebhookDependabotAlertDismissed | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.dependabotAlertDismissed(webhookDependabotAlertDismissed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#dependabotAlertDismissed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#dependabotAlertDismissed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDependabotAlertDismissed** | [**WebhookDependabotAlertDismissed**](WebhookDependabotAlertDismissed.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="dependabotAlertFixed"></a>
# **dependabotAlertFixed**
> dependabotAlertFixed(webhookDependabotAlertFixed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to Dependabot alerts.  For more information about Dependabot alerts, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot; For information about the API to manage Dependabot alerts, see \&quot;[Dependabot alerts](https://docs.github.com/rest/dependabot/alerts)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Dependabot alerts\&quot; repository permission.  **Note**: Webhook events for Dependabot alerts are currently in beta and subject to change.

A manifest file change removed a vulnerability.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDependabotAlertFixed : WebhookDependabotAlertFixed =  // WebhookDependabotAlertFixed | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.dependabotAlertFixed(webhookDependabotAlertFixed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#dependabotAlertFixed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#dependabotAlertFixed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDependabotAlertFixed** | [**WebhookDependabotAlertFixed**](WebhookDependabotAlertFixed.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="dependabotAlertReintroduced"></a>
# **dependabotAlertReintroduced**
> dependabotAlertReintroduced(webhookDependabotAlertReintroduced, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to Dependabot alerts.  For more information about Dependabot alerts, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot; For information about the API to manage Dependabot alerts, see \&quot;[Dependabot alerts](https://docs.github.com/rest/dependabot/alerts)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Dependabot alerts\&quot; repository permission.  **Note**: Webhook events for Dependabot alerts are currently in beta and subject to change.

A manifest file change introduced a vulnerable dependency that had previously been fixed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDependabotAlertReintroduced : WebhookDependabotAlertReintroduced =  // WebhookDependabotAlertReintroduced | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.dependabotAlertReintroduced(webhookDependabotAlertReintroduced, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#dependabotAlertReintroduced")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#dependabotAlertReintroduced")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDependabotAlertReintroduced** | [**WebhookDependabotAlertReintroduced**](WebhookDependabotAlertReintroduced.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="dependabotAlertReopened"></a>
# **dependabotAlertReopened**
> dependabotAlertReopened(webhookDependabotAlertReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to Dependabot alerts.  For more information about Dependabot alerts, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot; For information about the API to manage Dependabot alerts, see \&quot;[Dependabot alerts](https://docs.github.com/rest/dependabot/alerts)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Dependabot alerts\&quot; repository permission.  **Note**: Webhook events for Dependabot alerts are currently in beta and subject to change.

A Dependabot alert was manually reopened.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDependabotAlertReopened : WebhookDependabotAlertReopened =  // WebhookDependabotAlertReopened | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.dependabotAlertReopened(webhookDependabotAlertReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#dependabotAlertReopened")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#dependabotAlertReopened")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDependabotAlertReopened** | [**WebhookDependabotAlertReopened**](WebhookDependabotAlertReopened.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="deployKeyCreated"></a>
# **deployKeyCreated**
> deployKeyCreated(webhookDeployKeyCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to deploy keys. For more information, see \&quot;[Managing deploy keys](https://docs.github.com/developers/overview/managing-deploy-keys).\&quot; For information about the APIs to manage deploy keys, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#deploykey) or \&quot;[Deploy keys](https://docs.github.com/rest/deploy-keys)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Deployments\&quot; repository permission.

A deploy key was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDeployKeyCreated : WebhookDeployKeyCreated =  // WebhookDeployKeyCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.deployKeyCreated(webhookDeployKeyCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deployKeyCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deployKeyCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDeployKeyCreated** | [**WebhookDeployKeyCreated**](WebhookDeployKeyCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="deployKeyDeleted"></a>
# **deployKeyDeleted**
> deployKeyDeleted(webhookDeployKeyDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to deploy keys. For more information, see \&quot;[Managing deploy keys](https://docs.github.com/developers/overview/managing-deploy-keys).\&quot; For information about the APIs to manage deploy keys, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#deploykey) or \&quot;[Deploy keys](https://docs.github.com/rest/deploy-keys)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Deployments\&quot; repository permission.

A deploy key was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDeployKeyDeleted : WebhookDeployKeyDeleted =  // WebhookDeployKeyDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.deployKeyDeleted(webhookDeployKeyDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deployKeyDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deployKeyDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDeployKeyDeleted** | [**WebhookDeployKeyDeleted**](WebhookDeployKeyDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="deploymentCreated"></a>
# **deploymentCreated**
> deploymentCreated(webhookDeploymentCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to deployments. For more information, see \&quot;[About deployments](https://docs.github.com/actions/deployment/about-deployments).\&quot; For information about the APIs to manage deployments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#deployment) or \&quot;[Deployments](https://docs.github.com/rest/deployments/deployments)\&quot; in the REST API documentation.  For activity relating to deployment status, use the &#x60;deployment_status&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Deployments\&quot; repository permission.

A deployment was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDeploymentCreated : WebhookDeploymentCreated =  // WebhookDeploymentCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.deploymentCreated(webhookDeploymentCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deploymentCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deploymentCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDeploymentCreated** | [**WebhookDeploymentCreated**](WebhookDeploymentCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="deploymentProtectionRuleRequested"></a>
# **deploymentProtectionRuleRequested**
> deploymentProtectionRuleRequested(webhookDeploymentProtectionRuleRequested, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to deployment protection rules. For more information, see \&quot;[Using environments for deployment](https://docs.github.com/actions/deployment/targeting-different-environments/using-environments-for-deployment#environment-protection-rules).\&quot; For information about the API to manage deployment protection rules, see [the REST API documentation](https://docs.github.com/rest/deployments/environments).  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Deployments\&quot; repository permission.

A deployment protection rule was requested for an environment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDeploymentProtectionRuleRequested : WebhookDeploymentProtectionRuleRequested =  // WebhookDeploymentProtectionRuleRequested | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.deploymentProtectionRuleRequested(webhookDeploymentProtectionRuleRequested, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deploymentProtectionRuleRequested")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deploymentProtectionRuleRequested")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDeploymentProtectionRuleRequested** | [**WebhookDeploymentProtectionRuleRequested**](WebhookDeploymentProtectionRuleRequested.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="deploymentReviewApproved"></a>
# **deploymentReviewApproved**
> deploymentReviewApproved(webhookDeploymentReviewApproved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to deployment reviews. For more information, see \&quot;[About deployments](https://docs.github.com/actions/deployment/about-deployments).\&quot; For information about the APIs to manage deployments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#deployment) or \&quot;[Deployments](https://docs.github.com/rest/deployments/deployments)\&quot; in the REST API documentation.  For activity relating to deployment creation or deployment status, use the &#x60;deployment&#x60; or &#x60;deployment_status&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Deployments\&quot; repository permission.

A deployment review was approved.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDeploymentReviewApproved : WebhookDeploymentReviewApproved =  // WebhookDeploymentReviewApproved | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.deploymentReviewApproved(webhookDeploymentReviewApproved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deploymentReviewApproved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deploymentReviewApproved")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDeploymentReviewApproved** | [**WebhookDeploymentReviewApproved**](WebhookDeploymentReviewApproved.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="deploymentReviewRejected"></a>
# **deploymentReviewRejected**
> deploymentReviewRejected(webhookDeploymentReviewRejected, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to deployment reviews. For more information, see \&quot;[About deployments](https://docs.github.com/actions/deployment/about-deployments).\&quot; For information about the APIs to manage deployments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#deployment) or \&quot;[Deployments](https://docs.github.com/rest/deployments/deployments)\&quot; in the REST API documentation.  For activity relating to deployment creation or deployment status, use the &#x60;deployment&#x60; or &#x60;deployment_status&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Deployments\&quot; repository permission.

A deployment review was rejected.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDeploymentReviewRejected : WebhookDeploymentReviewRejected =  // WebhookDeploymentReviewRejected | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.deploymentReviewRejected(webhookDeploymentReviewRejected, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deploymentReviewRejected")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deploymentReviewRejected")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDeploymentReviewRejected** | [**WebhookDeploymentReviewRejected**](WebhookDeploymentReviewRejected.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="deploymentReviewRequested"></a>
# **deploymentReviewRequested**
> deploymentReviewRequested(webhookDeploymentReviewRequested, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to deployment reviews. For more information, see \&quot;[About deployments](https://docs.github.com/actions/deployment/about-deployments).\&quot; For information about the APIs to manage deployments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#deployment) or \&quot;[Deployments](https://docs.github.com/rest/deployments/deployments)\&quot; in the REST API documentation.  For activity relating to deployment creation or deployment status, use the &#x60;deployment&#x60; or &#x60;deployment_status&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Deployments\&quot; repository permission.

A deployment review was requested.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDeploymentReviewRequested : WebhookDeploymentReviewRequested =  // WebhookDeploymentReviewRequested | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.deploymentReviewRequested(webhookDeploymentReviewRequested, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deploymentReviewRequested")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deploymentReviewRequested")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDeploymentReviewRequested** | [**WebhookDeploymentReviewRequested**](WebhookDeploymentReviewRequested.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="deploymentStatusCreated"></a>
# **deploymentStatusCreated**
> deploymentStatusCreated(webhookDeploymentStatusCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to deployment statuses. For more information, see \&quot;[About deployments](https://docs.github.com/actions/deployment/about-deployments).\&quot; For information about the APIs to manage deployments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#deployment) or \&quot;[Deployments](https://docs.github.com/rest/deployments/deployments)\&quot; in the REST API documentation.  For activity relating to deployment creation, use the &#x60;deployment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Deployments\&quot; repository permission.

A new deployment status was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDeploymentStatusCreated : WebhookDeploymentStatusCreated =  // WebhookDeploymentStatusCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.deploymentStatusCreated(webhookDeploymentStatusCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deploymentStatusCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deploymentStatusCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDeploymentStatusCreated** | [**WebhookDeploymentStatusCreated**](WebhookDeploymentStatusCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionAnswered"></a>
# **discussionAnswered**
> discussionAnswered(webhookDiscussionAnswered, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

A comment on the discussion was marked as the answer.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionAnswered : WebhookDiscussionAnswered =  // WebhookDiscussionAnswered | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionAnswered(webhookDiscussionAnswered, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionAnswered")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionAnswered")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionAnswered** | [**WebhookDiscussionAnswered**](WebhookDiscussionAnswered.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionCategoryChanged"></a>
# **discussionCategoryChanged**
> discussionCategoryChanged(webhookDiscussionCategoryChanged, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

The category of a discussion was changed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionCategoryChanged : WebhookDiscussionCategoryChanged =  // WebhookDiscussionCategoryChanged | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionCategoryChanged(webhookDiscussionCategoryChanged, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionCategoryChanged")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionCategoryChanged")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionCategoryChanged** | [**WebhookDiscussionCategoryChanged**](WebhookDiscussionCategoryChanged.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionClosed"></a>
# **discussionClosed**
> discussionClosed(webhookDiscussionClosed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

A discussion was closed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionClosed : WebhookDiscussionClosed =  // WebhookDiscussionClosed | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.String = discussions // kotlin.String | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionClosed(webhookDiscussionClosed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionClosed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionClosed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionClosed** | [**WebhookDiscussionClosed**](WebhookDiscussionClosed.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | **kotlin.String**|  | [optional] [default to &quot;push&quot;]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionCommentCreated"></a>
# **discussionCommentCreated**
> discussionCommentCreated(webhookDiscussionCommentCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a comment on a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a discussion as opposed to comments on a discussion, use the &#x60;discussion&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

A comment on a discussion was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionCommentCreated : WebhookDiscussionCommentCreated =  // WebhookDiscussionCommentCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionCommentCreated(webhookDiscussionCommentCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionCommentCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionCommentCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionCommentCreated** | [**WebhookDiscussionCommentCreated**](WebhookDiscussionCommentCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionCommentDeleted"></a>
# **discussionCommentDeleted**
> discussionCommentDeleted(webhookDiscussionCommentDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a comment on a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a discussion as opposed to comments on a discussion, use the &#x60;discussion&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

A comment on a discussion was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionCommentDeleted : WebhookDiscussionCommentDeleted =  // WebhookDiscussionCommentDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionCommentDeleted(webhookDiscussionCommentDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionCommentDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionCommentDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionCommentDeleted** | [**WebhookDiscussionCommentDeleted**](WebhookDiscussionCommentDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionCommentEdited"></a>
# **discussionCommentEdited**
> discussionCommentEdited(webhookDiscussionCommentEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a comment on a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a discussion as opposed to comments on a discussion, use the &#x60;discussion&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

A comment on a discussion was edited.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionCommentEdited : WebhookDiscussionCommentEdited =  // WebhookDiscussionCommentEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionCommentEdited(webhookDiscussionCommentEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionCommentEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionCommentEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionCommentEdited** | [**WebhookDiscussionCommentEdited**](WebhookDiscussionCommentEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionCreated"></a>
# **discussionCreated**
> discussionCreated(webhookDiscussionCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

A discussion was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionCreated : WebhookDiscussionCreated =  // WebhookDiscussionCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionCreated(webhookDiscussionCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionCreated** | [**WebhookDiscussionCreated**](WebhookDiscussionCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionDeleted"></a>
# **discussionDeleted**
> discussionDeleted(webhookDiscussionDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

A discussion was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionDeleted : WebhookDiscussionDeleted =  // WebhookDiscussionDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionDeleted(webhookDiscussionDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionDeleted** | [**WebhookDiscussionDeleted**](WebhookDiscussionDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionEdited"></a>
# **discussionEdited**
> discussionEdited(webhookDiscussionEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

The title or body on a discussion was edited, or the category of the discussion was changed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionEdited : WebhookDiscussionEdited =  // WebhookDiscussionEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionEdited(webhookDiscussionEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionEdited** | [**WebhookDiscussionEdited**](WebhookDiscussionEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionLabeled"></a>
# **discussionLabeled**
> discussionLabeled(webhookDiscussionLabeled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

A label was added to a discussion.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionLabeled : WebhookDiscussionLabeled =  // WebhookDiscussionLabeled | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionLabeled(webhookDiscussionLabeled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionLabeled")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionLabeled")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionLabeled** | [**WebhookDiscussionLabeled**](WebhookDiscussionLabeled.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionLocked"></a>
# **discussionLocked**
> discussionLocked(webhookDiscussionLocked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

A discussion was locked.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionLocked : WebhookDiscussionLocked =  // WebhookDiscussionLocked | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionLocked(webhookDiscussionLocked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionLocked")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionLocked")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionLocked** | [**WebhookDiscussionLocked**](WebhookDiscussionLocked.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionPinned"></a>
# **discussionPinned**
> discussionPinned(webhookDiscussionPinned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

A discussion was pinned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionPinned : WebhookDiscussionPinned =  // WebhookDiscussionPinned | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionPinned(webhookDiscussionPinned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionPinned")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionPinned")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionPinned** | [**WebhookDiscussionPinned**](WebhookDiscussionPinned.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionReopened"></a>
# **discussionReopened**
> discussionReopened(webhookDiscussionReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

A discussion was reopened.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionReopened : WebhookDiscussionReopened =  // WebhookDiscussionReopened | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = discussions // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionReopened(webhookDiscussionReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionReopened")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionReopened")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionReopened** | [**WebhookDiscussionReopened**](WebhookDiscussionReopened.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionTransferred"></a>
# **discussionTransferred**
> discussionTransferred(webhookDiscussionTransferred, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

A discussion was transferred to another repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionTransferred : WebhookDiscussionTransferred =  // WebhookDiscussionTransferred | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionTransferred(webhookDiscussionTransferred, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionTransferred")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionTransferred")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionTransferred** | [**WebhookDiscussionTransferred**](WebhookDiscussionTransferred.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionUnanswered"></a>
# **discussionUnanswered**
> discussionUnanswered(webhookDiscussionUnanswered, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

A comment on the discussion was unmarked as the answer.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionUnanswered : WebhookDiscussionUnanswered =  // WebhookDiscussionUnanswered | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionUnanswered(webhookDiscussionUnanswered, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionUnanswered")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionUnanswered")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionUnanswered** | [**WebhookDiscussionUnanswered**](WebhookDiscussionUnanswered.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionUnlabeled"></a>
# **discussionUnlabeled**
> discussionUnlabeled(webhookDiscussionUnlabeled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

A label was removed from a discussion.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionUnlabeled : WebhookDiscussionUnlabeled =  // WebhookDiscussionUnlabeled | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionUnlabeled(webhookDiscussionUnlabeled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionUnlabeled")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionUnlabeled")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionUnlabeled** | [**WebhookDiscussionUnlabeled**](WebhookDiscussionUnlabeled.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionUnlocked"></a>
# **discussionUnlocked**
> discussionUnlocked(webhookDiscussionUnlocked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

A discussion was unlocked.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionUnlocked : WebhookDiscussionUnlocked =  // WebhookDiscussionUnlocked | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionUnlocked(webhookDiscussionUnlocked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionUnlocked")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionUnlocked")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionUnlocked** | [**WebhookDiscussionUnlocked**](WebhookDiscussionUnlocked.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="discussionUnpinned"></a>
# **discussionUnpinned**
> discussionUnpinned(webhookDiscussionUnpinned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a discussion. For more information about discussions, see \&quot;[GitHub Discussions](https://docs.github.com/discussions).\&quot; For information about the API to manage discussions, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#discussion).  For activity relating to a comment on a discussion, use the &#x60;discussion_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Discussions\&quot; repository permission.  **Note**: Webhook events for GitHub Discussions are currently in beta and subject to change.

A discussion was unpinned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookDiscussionUnpinned : WebhookDiscussionUnpinned =  // WebhookDiscussionUnpinned | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.discussionUnpinned(webhookDiscussionUnpinned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#discussionUnpinned")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#discussionUnpinned")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDiscussionUnpinned** | [**WebhookDiscussionUnpinned**](WebhookDiscussionUnpinned.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="fork"></a>
# **fork**
> fork(webhookFork, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when someone forks a repository. For more information, see \&quot;[Fork a repo](https://docs.github.com/get-started/quickstart/fork-a-repo).\&quot; For information about the API to manage forks, see \&quot;[Forks](https://docs.github.com/rest/repos/forks)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookFork : WebhookFork =  // WebhookFork | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.fork(webhookFork, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#fork")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#fork")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookFork** | [**WebhookFork**](WebhookFork.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="githubAppAuthorizationRevoked"></a>
# **githubAppAuthorizationRevoked**
> githubAppAuthorizationRevoked(webhookGithubAppAuthorizationRevoked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when a user revokes their authorization of a GitHub App. For more information, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the API to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.  A GitHub App receives this webhook by default and cannot unsubscribe from this event.  Anyone can revoke their authorization of a GitHub App from their [GitHub account settings page](https://github.com/settings/apps/authorizations). Revoking the authorization of a GitHub App does not uninstall the GitHub App. You should program your GitHub App so that when it receives this webhook, it stops calling the API on behalf of the person who revoked the token. If your GitHub App continues to use a revoked access token, it will receive the &#x60;401 Bad Credentials&#x60; error. For details about requests with a user access token, which require GitHub App authorization, see \&quot;[Authenticating with a GitHub App on behalf of a user](https://docs.github.com/apps/creating-github-apps/authenticating-with-a-github-app/authenticating-with-a-github-app-on-behalf-of-a-user).\&quot;

Someone revoked their authorization of a GitHub App.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookGithubAppAuthorizationRevoked : WebhookGithubAppAuthorizationRevoked =  // WebhookGithubAppAuthorizationRevoked | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.githubAppAuthorizationRevoked(webhookGithubAppAuthorizationRevoked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#githubAppAuthorizationRevoked")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#githubAppAuthorizationRevoked")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookGithubAppAuthorizationRevoked** | [**WebhookGithubAppAuthorizationRevoked**](WebhookGithubAppAuthorizationRevoked.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="gollum"></a>
# **gollum**
> gollum(webhookGollum, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when someone creates or updates a wiki page. For more information, see \&quot;[About wikis](https://docs.github.com/communities/documenting-your-project-with-wikis/about-wikis).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookGollum : WebhookGollum =  // WebhookGollum | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.gollum(webhookGollum, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#gollum")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#gollum")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookGollum** | [**WebhookGollum**](WebhookGollum.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="installationCreated"></a>
# **installationCreated**
> installationCreated(webhookInstallationCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a GitHub App installation. All GitHub Apps receive this event by default. You cannot manually subscribe to this event.  For more information about GitHub Apps, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the APIs to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.

Someone installed a GitHub App on a user or organization account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookInstallationCreated : WebhookInstallationCreated =  // WebhookInstallationCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.installationCreated(webhookInstallationCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#installationCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#installationCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookInstallationCreated** | [**WebhookInstallationCreated**](WebhookInstallationCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="installationDeleted"></a>
# **installationDeleted**
> installationDeleted(webhookInstallationDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a GitHub App installation. All GitHub Apps receive this event by default. You cannot manually subscribe to this event.  For more information about GitHub Apps, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the APIs to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.

Someone uninstalled a GitHub App from their user or organization account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookInstallationDeleted : WebhookInstallationDeleted =  // WebhookInstallationDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.installationDeleted(webhookInstallationDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#installationDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#installationDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookInstallationDeleted** | [**WebhookInstallationDeleted**](WebhookInstallationDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="installationNewPermissionsAccepted"></a>
# **installationNewPermissionsAccepted**
> installationNewPermissionsAccepted(webhookInstallationNewPermissionsAccepted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a GitHub App installation. All GitHub Apps receive this event by default. You cannot manually subscribe to this event.  For more information about GitHub Apps, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the APIs to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.

Someone granted new permissions to a GitHub App.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookInstallationNewPermissionsAccepted : WebhookInstallationNewPermissionsAccepted =  // WebhookInstallationNewPermissionsAccepted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.installationNewPermissionsAccepted(webhookInstallationNewPermissionsAccepted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#installationNewPermissionsAccepted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#installationNewPermissionsAccepted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookInstallationNewPermissionsAccepted** | [**WebhookInstallationNewPermissionsAccepted**](WebhookInstallationNewPermissionsAccepted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="installationRepositoriesAdded"></a>
# **installationRepositoriesAdded**
> installationRepositoriesAdded(webhookInstallationRepositoriesAdded, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to which repositories a GitHub App installation can access. All GitHub Apps receive this event by default. You cannot manually subscribe to this event.  For more information about GitHub Apps, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the APIs to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.

A GitHub App installation was granted access to one or more repositories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookInstallationRepositoriesAdded : WebhookInstallationRepositoriesAdded =  // WebhookInstallationRepositoriesAdded | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.installationRepositoriesAdded(webhookInstallationRepositoriesAdded, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#installationRepositoriesAdded")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#installationRepositoriesAdded")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookInstallationRepositoriesAdded** | [**WebhookInstallationRepositoriesAdded**](WebhookInstallationRepositoriesAdded.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="installationRepositoriesRemoved"></a>
# **installationRepositoriesRemoved**
> installationRepositoriesRemoved(webhookInstallationRepositoriesRemoved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to which repositories a GitHub App installation can access. All GitHub Apps receive this event by default. You cannot manually subscribe to this event.  For more information about GitHub Apps, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the APIs to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.

Access to one or more repositories was revoked for a GitHub App installation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookInstallationRepositoriesRemoved : WebhookInstallationRepositoriesRemoved =  // WebhookInstallationRepositoriesRemoved | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.installationRepositoriesRemoved(webhookInstallationRepositoriesRemoved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#installationRepositoriesRemoved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#installationRepositoriesRemoved")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookInstallationRepositoriesRemoved** | [**WebhookInstallationRepositoriesRemoved**](WebhookInstallationRepositoriesRemoved.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="installationSuspend"></a>
# **installationSuspend**
> installationSuspend(webhookInstallationSuspend, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a GitHub App installation. All GitHub Apps receive this event by default. You cannot manually subscribe to this event.  For more information about GitHub Apps, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the APIs to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.

Someone blocked access by a GitHub App to their user or organization account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookInstallationSuspend : WebhookInstallationSuspend =  // WebhookInstallationSuspend | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.installationSuspend(webhookInstallationSuspend, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#installationSuspend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#installationSuspend")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookInstallationSuspend** | [**WebhookInstallationSuspend**](WebhookInstallationSuspend.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="installationTargetRenamed"></a>
# **installationTargetRenamed**
> installationTargetRenamed(webhookInstallationTargetRenamed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to the user or organization account that a GitHub App is installed on. For more information, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the APIs to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.

Somebody renamed the user or organization account that a GitHub App is installed on.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookInstallationTargetRenamed : WebhookInstallationTargetRenamed =  // WebhookInstallationTargetRenamed | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.installationTargetRenamed(webhookInstallationTargetRenamed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#installationTargetRenamed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#installationTargetRenamed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookInstallationTargetRenamed** | [**WebhookInstallationTargetRenamed**](WebhookInstallationTargetRenamed.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="installationUnsuspend"></a>
# **installationUnsuspend**
> installationUnsuspend(webhookInstallationUnsuspend, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a GitHub App installation. All GitHub Apps receive this event by default. You cannot manually subscribe to this event.  For more information about GitHub Apps, see \&quot;[About apps](https://docs.github.com/developers/apps/getting-started-with-apps/about-apps#about-github-apps).\&quot; For information about the APIs to manage GitHub Apps, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#app) or \&quot;[Apps](https://docs.github.com/rest/apps)\&quot; in the REST API documentation.

A GitHub App that was blocked from accessing a user or organization account was given access the account again.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookInstallationUnsuspend : WebhookInstallationUnsuspend =  // WebhookInstallationUnsuspend | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.installationUnsuspend(webhookInstallationUnsuspend, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#installationUnsuspend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#installationUnsuspend")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookInstallationUnsuspend** | [**WebhookInstallationUnsuspend**](WebhookInstallationUnsuspend.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issueCommentCreated"></a>
# **issueCommentCreated**
> issueCommentCreated(webhookIssueCommentCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a comment on an issue or pull request. For more information about issues and pull requests, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues)\&quot; and \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage issue comments, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issuecomment) or \&quot;[Issue comments](https://docs.github.com/rest/issues/comments)\&quot; in the REST API documentation.  For activity relating to an issue as opposed to comments on an issue, use the &#x60;issue&#x60; event. For activity related to pull request reviews or pull request review comments, use the &#x60;pull_request_review&#x60; or &#x60;pull_request_review_comment&#x60; events. For more information about the different types of pull request comments, see \&quot;[Working with comments](https://docs.github.com/rest/guides/working-with-comments).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

A comment on an issue or pull request was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssueCommentCreated : WebhookIssueCommentCreated =  // WebhookIssueCommentCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issueCommentCreated(webhookIssueCommentCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issueCommentCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issueCommentCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssueCommentCreated** | [**WebhookIssueCommentCreated**](WebhookIssueCommentCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issueCommentDeleted"></a>
# **issueCommentDeleted**
> issueCommentDeleted(webhookIssueCommentDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a comment on an issue or pull request. For more information about issues and pull requests, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues)\&quot; and \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage issue comments, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issuecomment) or \&quot;[Issue comments](https://docs.github.com/rest/issues/comments)\&quot; in the REST API documentation.  For activity relating to an issue as opposed to comments on an issue, use the &#x60;issue&#x60; event. For activity related to pull request reviews or pull request review comments, use the &#x60;pull_request_review&#x60; or &#x60;pull_request_review_comment&#x60; events. For more information about the different types of pull request comments, see \&quot;[Working with comments](https://docs.github.com/rest/guides/working-with-comments).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

A comment on an issue or pull request was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssueCommentDeleted : WebhookIssueCommentDeleted =  // WebhookIssueCommentDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issueCommentDeleted(webhookIssueCommentDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issueCommentDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issueCommentDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssueCommentDeleted** | [**WebhookIssueCommentDeleted**](WebhookIssueCommentDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issueCommentEdited"></a>
# **issueCommentEdited**
> issueCommentEdited(webhookIssueCommentEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a comment on an issue or pull request. For more information about issues and pull requests, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues)\&quot; and \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage issue comments, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issuecomment) or \&quot;[Issue comments](https://docs.github.com/rest/issues/comments)\&quot; in the REST API documentation.  For activity relating to an issue as opposed to comments on an issue, use the &#x60;issue&#x60; event. For activity related to pull request reviews or pull request review comments, use the &#x60;pull_request_review&#x60; or &#x60;pull_request_review_comment&#x60; events. For more information about the different types of pull request comments, see \&quot;[Working with comments](https://docs.github.com/rest/guides/working-with-comments).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

A comment on an issue or pull request was edited.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssueCommentEdited : WebhookIssueCommentEdited =  // WebhookIssueCommentEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issueCommentEdited(webhookIssueCommentEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issueCommentEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issueCommentEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssueCommentEdited** | [**WebhookIssueCommentEdited**](WebhookIssueCommentEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issuesAssigned"></a>
# **issuesAssigned**
> issuesAssigned(webhookIssuesAssigned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

An issue was assigned to a user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssuesAssigned : WebhookIssuesAssigned =  // WebhookIssuesAssigned | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issuesAssigned(webhookIssuesAssigned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issuesAssigned")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issuesAssigned")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssuesAssigned** | [**WebhookIssuesAssigned**](WebhookIssuesAssigned.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issuesClosed"></a>
# **issuesClosed**
> issuesClosed(webhookIssuesClosed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

An issue was closed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssuesClosed : WebhookIssuesClosed =  // WebhookIssuesClosed | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issuesClosed(webhookIssuesClosed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issuesClosed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issuesClosed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssuesClosed** | [**WebhookIssuesClosed**](WebhookIssuesClosed.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issuesDeleted"></a>
# **issuesDeleted**
> issuesDeleted(webhookIssuesDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

An issue was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssuesDeleted : WebhookIssuesDeleted =  // WebhookIssuesDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issuesDeleted(webhookIssuesDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issuesDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issuesDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssuesDeleted** | [**WebhookIssuesDeleted**](WebhookIssuesDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issuesDemilestoned"></a>
# **issuesDemilestoned**
> issuesDemilestoned(webhookIssuesDemilestoned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

An issue was removed from a milestone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssuesDemilestoned : WebhookIssuesDemilestoned =  // WebhookIssuesDemilestoned | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issuesDemilestoned(webhookIssuesDemilestoned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issuesDemilestoned")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issuesDemilestoned")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssuesDemilestoned** | [**WebhookIssuesDemilestoned**](WebhookIssuesDemilestoned.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issuesEdited"></a>
# **issuesEdited**
> issuesEdited(webhookIssuesEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

The title or body on an issue was edited.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssuesEdited : WebhookIssuesEdited =  // WebhookIssuesEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issuesEdited(webhookIssuesEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issuesEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issuesEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssuesEdited** | [**WebhookIssuesEdited**](WebhookIssuesEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issuesLabeled"></a>
# **issuesLabeled**
> issuesLabeled(webhookIssuesLabeled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

A label was added to an issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssuesLabeled : WebhookIssuesLabeled =  // WebhookIssuesLabeled | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issuesLabeled(webhookIssuesLabeled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issuesLabeled")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issuesLabeled")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssuesLabeled** | [**WebhookIssuesLabeled**](WebhookIssuesLabeled.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issuesLocked"></a>
# **issuesLocked**
> issuesLocked(webhookIssuesLocked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

Conversation on an issue was locked. For more information, see \&quot;[Locking conversations](https://docs.github.com/communities/moderating-comments-and-conversations/locking-conversations).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssuesLocked : WebhookIssuesLocked =  // WebhookIssuesLocked | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issuesLocked(webhookIssuesLocked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issuesLocked")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issuesLocked")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssuesLocked** | [**WebhookIssuesLocked**](WebhookIssuesLocked.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issuesMilestoned"></a>
# **issuesMilestoned**
> issuesMilestoned(webhookIssuesMilestoned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

An issue was added to a milestone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssuesMilestoned : WebhookIssuesMilestoned =  // WebhookIssuesMilestoned | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issuesMilestoned(webhookIssuesMilestoned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issuesMilestoned")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issuesMilestoned")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssuesMilestoned** | [**WebhookIssuesMilestoned**](WebhookIssuesMilestoned.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issuesOpened"></a>
# **issuesOpened**
> issuesOpened(webhookIssuesOpened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

An issue was created. When a closed issue is reopened, the action will be &#x60;reopened&#x60; instead.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssuesOpened : WebhookIssuesOpened =  // WebhookIssuesOpened | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issuesOpened(webhookIssuesOpened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issuesOpened")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issuesOpened")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssuesOpened** | [**WebhookIssuesOpened**](WebhookIssuesOpened.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issuesPinned"></a>
# **issuesPinned**
> issuesPinned(webhookIssuesPinned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

An issue was pinned to a repository. For more information, see \&quot;[Pinning an issue to your repository](https://docs.github.com/issues/tracking-your-work-with-issues/pinning-an-issue-to-your-repository).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssuesPinned : WebhookIssuesPinned =  // WebhookIssuesPinned | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issuesPinned(webhookIssuesPinned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issuesPinned")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issuesPinned")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssuesPinned** | [**WebhookIssuesPinned**](WebhookIssuesPinned.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issuesReopened"></a>
# **issuesReopened**
> issuesReopened(webhookIssuesReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

A closed issue was reopened.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssuesReopened : WebhookIssuesReopened =  // WebhookIssuesReopened | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issuesReopened(webhookIssuesReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issuesReopened")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issuesReopened")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssuesReopened** | [**WebhookIssuesReopened**](WebhookIssuesReopened.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issuesTransferred"></a>
# **issuesTransferred**
> issuesTransferred(webhookIssuesTransferred, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

An issue was transferred to another repository. For more information, see \&quot;[Transferring an issue to another repository](https://docs.github.com/issues/tracking-your-work-with-issues/transferring-an-issue-to-another-repository).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssuesTransferred : WebhookIssuesTransferred =  // WebhookIssuesTransferred | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issuesTransferred(webhookIssuesTransferred, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issuesTransferred")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issuesTransferred")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssuesTransferred** | [**WebhookIssuesTransferred**](WebhookIssuesTransferred.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issuesUnassigned"></a>
# **issuesUnassigned**
> issuesUnassigned(webhookIssuesUnassigned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

A user was unassigned from an issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssuesUnassigned : WebhookIssuesUnassigned =  // WebhookIssuesUnassigned | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issuesUnassigned(webhookIssuesUnassigned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issuesUnassigned")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issuesUnassigned")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssuesUnassigned** | [**WebhookIssuesUnassigned**](WebhookIssuesUnassigned.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issuesUnlabeled"></a>
# **issuesUnlabeled**
> issuesUnlabeled(webhookIssuesUnlabeled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

A label was removed from an issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssuesUnlabeled : WebhookIssuesUnlabeled =  // WebhookIssuesUnlabeled | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issuesUnlabeled(webhookIssuesUnlabeled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issuesUnlabeled")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issuesUnlabeled")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssuesUnlabeled** | [**WebhookIssuesUnlabeled**](WebhookIssuesUnlabeled.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issuesUnlocked"></a>
# **issuesUnlocked**
> issuesUnlocked(webhookIssuesUnlocked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

Conversation on an issue was locked. For more information, see \&quot;[Locking conversations](https://docs.github.com/communities/moderating-comments-and-conversations/locking-conversations).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssuesUnlocked : WebhookIssuesUnlocked =  // WebhookIssuesUnlocked | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issuesUnlocked(webhookIssuesUnlocked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issuesUnlocked")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issuesUnlocked")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssuesUnlocked** | [**WebhookIssuesUnlocked**](WebhookIssuesUnlocked.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="issuesUnpinned"></a>
# **issuesUnpinned**
> issuesUnpinned(webhookIssuesUnpinned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an issue. For more information about issues, see \&quot;[About issues](https://docs.github.com/issues/tracking-your-work-with-issues/about-issues).\&quot; For information about the APIs to manage issues, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#issue) or \&quot;[Issues](https://docs.github.com/rest/issues)\&quot; in the REST API documentation.  For activity relating to a comment on an issue, use the &#x60;issue_comment&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; repository permission.

An issue was unpinned from a repository. For more information, see \&quot;[Pinning an issue to your repository](https://docs.github.com/issues/tracking-your-work-with-issues/pinning-an-issue-to-your-repository).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookIssuesUnpinned : WebhookIssuesUnpinned =  // WebhookIssuesUnpinned | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.issuesUnpinned(webhookIssuesUnpinned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#issuesUnpinned")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#issuesUnpinned")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookIssuesUnpinned** | [**WebhookIssuesUnpinned**](WebhookIssuesUnpinned.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="labelCreated"></a>
# **labelCreated**
> labelCreated(webhookLabelCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to labels. For more information, see \&quot;[Managing labels](https://docs.github.com/issues/using-labels-and-milestones-to-track-work/managing-labels).\&quot; For information about the APIs to manage labels, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#label) or \&quot;[Labels](https://docs.github.com/rest/issues/labels)\&quot; in the REST API documentation.  If you want to receive an event when a label is added to or removed from an issue, pull request, or discussion, use the &#x60;labeled&#x60; or &#x60;unlabeled&#x60; action type for the &#x60;issues&#x60;, &#x60;pull_request&#x60;, or &#x60;discussion&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.

A label was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookLabelCreated : WebhookLabelCreated =  // WebhookLabelCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.labelCreated(webhookLabelCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#labelCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#labelCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookLabelCreated** | [**WebhookLabelCreated**](WebhookLabelCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="labelDeleted"></a>
# **labelDeleted**
> labelDeleted(webhookLabelDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to labels. For more information, see \&quot;[Managing labels](https://docs.github.com/issues/using-labels-and-milestones-to-track-work/managing-labels).\&quot; For information about the APIs to manage labels, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#label) or \&quot;[Labels](https://docs.github.com/rest/issues/labels)\&quot; in the REST API documentation.  If you want to receive an event when a label is added to or removed from an issue, pull request, or discussion, use the &#x60;labeled&#x60; or &#x60;unlabeled&#x60; action type for the &#x60;issues&#x60;, &#x60;pull_request&#x60;, or &#x60;discussion&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.

A label was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookLabelDeleted : WebhookLabelDeleted =  // WebhookLabelDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.labelDeleted(webhookLabelDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#labelDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#labelDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookLabelDeleted** | [**WebhookLabelDeleted**](WebhookLabelDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="labelEdited"></a>
# **labelEdited**
> labelEdited(webhookLabelEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to labels. For more information, see \&quot;[Managing labels](https://docs.github.com/issues/using-labels-and-milestones-to-track-work/managing-labels).\&quot; For information about the APIs to manage labels, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#label) or \&quot;[Labels](https://docs.github.com/rest/issues/labels)\&quot; in the REST API documentation.  If you want to receive an event when a label is added to or removed from an issue, pull request, or discussion, use the &#x60;labeled&#x60; or &#x60;unlabeled&#x60; action type for the &#x60;issues&#x60;, &#x60;pull_request&#x60;, or &#x60;discussion&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.

A label&#39;s name, description, or color was changed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookLabelEdited : WebhookLabelEdited =  // WebhookLabelEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.labelEdited(webhookLabelEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#labelEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#labelEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookLabelEdited** | [**WebhookLabelEdited**](WebhookLabelEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="marketplacePurchaseCancelled"></a>
# **marketplacePurchaseCancelled**
> marketplacePurchaseCancelled(webhookMarketplacePurchaseCancelled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a GitHub Marketplace purchase. For more information, see \&quot;[GitHub Marketplace](https://docs.github.com/marketplace).\&quot; For information about the APIs to manage GitHub Marketplace listings, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#marketplacelisting) or \&quot;[GitHub Marketplace](https://docs.github.com/rest/apps/marketplace)\&quot; in the REST API documentation.

Someone cancelled a GitHub Marketplace plan, and the last billing cycle has ended. The change will take effect on the account immediately.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookMarketplacePurchaseCancelled : WebhookMarketplacePurchaseCancelled =  // WebhookMarketplacePurchaseCancelled | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.marketplacePurchaseCancelled(webhookMarketplacePurchaseCancelled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#marketplacePurchaseCancelled")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#marketplacePurchaseCancelled")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMarketplacePurchaseCancelled** | [**WebhookMarketplacePurchaseCancelled**](WebhookMarketplacePurchaseCancelled.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="marketplacePurchaseChanged"></a>
# **marketplacePurchaseChanged**
> marketplacePurchaseChanged(webhookMarketplacePurchaseChanged, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a GitHub Marketplace purchase. For more information, see \&quot;[GitHub Marketplace](https://docs.github.com/marketplace).\&quot; For information about the APIs to manage GitHub Marketplace listings, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#marketplacelisting) or \&quot;[GitHub Marketplace](https://docs.github.com/rest/apps/marketplace)\&quot; in the REST API documentation.

Someone upgraded or downgraded a GitHub Marketplace plan, and the last billing cycle has ended. The change will take effect on the account immediately.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookMarketplacePurchaseChanged : WebhookMarketplacePurchaseChanged =  // WebhookMarketplacePurchaseChanged | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.marketplacePurchaseChanged(webhookMarketplacePurchaseChanged, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#marketplacePurchaseChanged")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#marketplacePurchaseChanged")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMarketplacePurchaseChanged** | [**WebhookMarketplacePurchaseChanged**](WebhookMarketplacePurchaseChanged.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="marketplacePurchasePendingChange"></a>
# **marketplacePurchasePendingChange**
> marketplacePurchasePendingChange(webhookMarketplacePurchasePendingChange, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a GitHub Marketplace purchase. For more information, see \&quot;[GitHub Marketplace](https://docs.github.com/marketplace).\&quot; For information about the APIs to manage GitHub Marketplace listings, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#marketplacelisting) or \&quot;[GitHub Marketplace](https://docs.github.com/rest/apps/marketplace)\&quot; in the REST API documentation.

Someone downgraded or cancelled a GitHub Marketplace plan. The new plan or cancellation will take effect at the end of the current billing cycle. When the change takes effect, the &#x60;changed&#x60; or &#x60;cancelled&#x60; event will be sent.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookMarketplacePurchasePendingChange : WebhookMarketplacePurchasePendingChange =  // WebhookMarketplacePurchasePendingChange | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.marketplacePurchasePendingChange(webhookMarketplacePurchasePendingChange, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#marketplacePurchasePendingChange")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#marketplacePurchasePendingChange")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMarketplacePurchasePendingChange** | [**WebhookMarketplacePurchasePendingChange**](WebhookMarketplacePurchasePendingChange.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="marketplacePurchasePendingChangeCancelled"></a>
# **marketplacePurchasePendingChangeCancelled**
> marketplacePurchasePendingChangeCancelled(webhookMarketplacePurchasePendingChangeCancelled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a GitHub Marketplace purchase. For more information, see \&quot;[GitHub Marketplace](https://docs.github.com/marketplace).\&quot; For information about the APIs to manage GitHub Marketplace listings, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#marketplacelisting) or \&quot;[GitHub Marketplace](https://docs.github.com/rest/apps/marketplace)\&quot; in the REST API documentation.

Someone cancelled a pending change to a GitHub Marketplace plan. Pending changes include plan cancellations and downgrades that will take effect at the end of a billing cycle.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookMarketplacePurchasePendingChangeCancelled : WebhookMarketplacePurchasePendingChangeCancelled =  // WebhookMarketplacePurchasePendingChangeCancelled | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.marketplacePurchasePendingChangeCancelled(webhookMarketplacePurchasePendingChangeCancelled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#marketplacePurchasePendingChangeCancelled")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#marketplacePurchasePendingChangeCancelled")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMarketplacePurchasePendingChangeCancelled** | [**WebhookMarketplacePurchasePendingChangeCancelled**](WebhookMarketplacePurchasePendingChangeCancelled.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="marketplacePurchasePurchased"></a>
# **marketplacePurchasePurchased**
> marketplacePurchasePurchased(webhookMarketplacePurchasePurchased, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a GitHub Marketplace purchase. For more information, see \&quot;[GitHub Marketplace](https://docs.github.com/marketplace).\&quot; For information about the APIs to manage GitHub Marketplace listings, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#marketplacelisting) or \&quot;[GitHub Marketplace](https://docs.github.com/rest/apps/marketplace)\&quot; in the REST API documentation.

Someone purchased a GitHub Marketplace plan. The change will take effect on the account immediately.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookMarketplacePurchasePurchased : WebhookMarketplacePurchasePurchased =  // WebhookMarketplacePurchasePurchased | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.marketplacePurchasePurchased(webhookMarketplacePurchasePurchased, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#marketplacePurchasePurchased")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#marketplacePurchasePurchased")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMarketplacePurchasePurchased** | [**WebhookMarketplacePurchasePurchased**](WebhookMarketplacePurchasePurchased.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="memberAdded"></a>
# **memberAdded**
> memberAdded(webhookMemberAdded, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to collaborators in a repository. For more information, see \&quot;[Adding outside collaborators to repositories in your organization](https://docs.github.com/organizations/managing-user-access-to-your-organizations-repositories/adding-outside-collaborators-to-repositories-in-your-organization).\&quot; For more information about the API to manage repository collaborators, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#repositorycollaboratorconnection) or \&quot;[Collaborators](https://docs.github.com/rest/collaborators/collaborators)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.

A GitHub user accepted an invitation to a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookMemberAdded : WebhookMemberAdded =  // WebhookMemberAdded | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.memberAdded(webhookMemberAdded, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#memberAdded")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#memberAdded")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMemberAdded** | [**WebhookMemberAdded**](WebhookMemberAdded.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="memberEdited"></a>
# **memberEdited**
> memberEdited(webhookMemberEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to collaborators in a repository. For more information, see \&quot;[Adding outside collaborators to repositories in your organization](https://docs.github.com/organizations/managing-user-access-to-your-organizations-repositories/adding-outside-collaborators-to-repositories-in-your-organization).\&quot; For more information about the API to manage repository collaborators, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#repositorycollaboratorconnection) or \&quot;[Collaborators](https://docs.github.com/rest/collaborators/collaborators)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.

Permissions were changed for a collaborator on a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookMemberEdited : WebhookMemberEdited =  // WebhookMemberEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.memberEdited(webhookMemberEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#memberEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#memberEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMemberEdited** | [**WebhookMemberEdited**](WebhookMemberEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="memberRemoved"></a>
# **memberRemoved**
> memberRemoved(webhookMemberRemoved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to collaborators in a repository. For more information, see \&quot;[Adding outside collaborators to repositories in your organization](https://docs.github.com/organizations/managing-user-access-to-your-organizations-repositories/adding-outside-collaborators-to-repositories-in-your-organization).\&quot; For more information about the API to manage repository collaborators, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#repositorycollaboratorconnection) or \&quot;[Collaborators](https://docs.github.com/rest/collaborators/collaborators)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.

A collaborator was removed from a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookMemberRemoved : WebhookMemberRemoved =  // WebhookMemberRemoved | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.memberRemoved(webhookMemberRemoved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#memberRemoved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#memberRemoved")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMemberRemoved** | [**WebhookMemberRemoved**](WebhookMemberRemoved.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="membershipAdded"></a>
# **membershipAdded**
> membershipAdded(webhookMembershipAdded, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to team membership. For more information, see \&quot;[About teams](https://docs.github.com/organizations/organizing-members-into-teams/about-teams).\&quot; For more information about the APIs to manage team memberships, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#team) or \&quot;[Team members](https://docs.github.com/rest/teams/members)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.

An organization member was added to a team.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookMembershipAdded : WebhookMembershipAdded =  // WebhookMembershipAdded | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.membershipAdded(webhookMembershipAdded, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#membershipAdded")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#membershipAdded")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMembershipAdded** | [**WebhookMembershipAdded**](WebhookMembershipAdded.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="membershipRemoved"></a>
# **membershipRemoved**
> membershipRemoved(webhookMembershipRemoved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to team membership. For more information, see \&quot;[About teams](https://docs.github.com/organizations/organizing-members-into-teams/about-teams).\&quot; For more information about the APIs to manage team memberships, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#team) or \&quot;[Team members](https://docs.github.com/rest/teams/members)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.

An organization member was removed from a team.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookMembershipRemoved : WebhookMembershipRemoved =  // WebhookMembershipRemoved | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.membershipRemoved(webhookMembershipRemoved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#membershipRemoved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#membershipRemoved")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMembershipRemoved** | [**WebhookMembershipRemoved**](WebhookMembershipRemoved.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="metaDeleted"></a>
# **metaDeleted**
> metaDeleted(webhookMetaDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a webhook itself.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Meta\&quot; app permission.

The webhook was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookMetaDeleted : WebhookMetaDeleted =  // WebhookMetaDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.metaDeleted(webhookMetaDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#metaDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#metaDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMetaDeleted** | [**WebhookMetaDeleted**](WebhookMetaDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="milestoneClosed"></a>
# **milestoneClosed**
> milestoneClosed(webhookMilestoneClosed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to milestones. For more information, see \&quot;[About milestones](https://docs.github.com/issues/using-labels-and-milestones-to-track-work/about-milestones).\&quot; For information about the APIs to manage milestones, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#milestone) or \&quot;[Milestones](https://docs.github.com/rest/issues/milestones)\&quot; in the REST API documentation.  If you want to receive an event when an issue or pull request is added to or removed from a milestone, use the &#x60;milestoned&#x60; or &#x60;demilestoned&#x60; action type for the &#x60;issues&#x60; or &#x60;pull_request&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; or \&quot;Pull requests\&quot; repository permissions.

A milestone was closed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookMilestoneClosed : WebhookMilestoneClosed =  // WebhookMilestoneClosed | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.milestoneClosed(webhookMilestoneClosed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#milestoneClosed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#milestoneClosed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMilestoneClosed** | [**WebhookMilestoneClosed**](WebhookMilestoneClosed.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="milestoneCreated"></a>
# **milestoneCreated**
> milestoneCreated(webhookMilestoneCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to milestones. For more information, see \&quot;[About milestones](https://docs.github.com/issues/using-labels-and-milestones-to-track-work/about-milestones).\&quot; For information about the APIs to manage milestones, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#milestone) or \&quot;[Milestones](https://docs.github.com/rest/issues/milestones)\&quot; in the REST API documentation.  If you want to receive an event when an issue or pull request is added to or removed from a milestone, use the &#x60;milestoned&#x60; or &#x60;demilestoned&#x60; action type for the &#x60;issues&#x60; or &#x60;pull_request&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; or \&quot;Pull requests\&quot; repository permissions.

A milestone was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookMilestoneCreated : WebhookMilestoneCreated =  // WebhookMilestoneCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.milestoneCreated(webhookMilestoneCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#milestoneCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#milestoneCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMilestoneCreated** | [**WebhookMilestoneCreated**](WebhookMilestoneCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="milestoneDeleted"></a>
# **milestoneDeleted**
> milestoneDeleted(webhookMilestoneDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to milestones. For more information, see \&quot;[About milestones](https://docs.github.com/issues/using-labels-and-milestones-to-track-work/about-milestones).\&quot; For information about the APIs to manage milestones, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#milestone) or \&quot;[Milestones](https://docs.github.com/rest/issues/milestones)\&quot; in the REST API documentation.  If you want to receive an event when an issue or pull request is added to or removed from a milestone, use the &#x60;milestoned&#x60; or &#x60;demilestoned&#x60; action type for the &#x60;issues&#x60; or &#x60;pull_request&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; or \&quot;Pull requests\&quot; repository permissions.

A milestone was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookMilestoneDeleted : WebhookMilestoneDeleted =  // WebhookMilestoneDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.milestoneDeleted(webhookMilestoneDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#milestoneDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#milestoneDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMilestoneDeleted** | [**WebhookMilestoneDeleted**](WebhookMilestoneDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="milestoneEdited"></a>
# **milestoneEdited**
> milestoneEdited(webhookMilestoneEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to milestones. For more information, see \&quot;[About milestones](https://docs.github.com/issues/using-labels-and-milestones-to-track-work/about-milestones).\&quot; For information about the APIs to manage milestones, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#milestone) or \&quot;[Milestones](https://docs.github.com/rest/issues/milestones)\&quot; in the REST API documentation.  If you want to receive an event when an issue or pull request is added to or removed from a milestone, use the &#x60;milestoned&#x60; or &#x60;demilestoned&#x60; action type for the &#x60;issues&#x60; or &#x60;pull_request&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; or \&quot;Pull requests\&quot; repository permissions.

A milestone was edited.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookMilestoneEdited : WebhookMilestoneEdited =  // WebhookMilestoneEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.milestoneEdited(webhookMilestoneEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#milestoneEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#milestoneEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMilestoneEdited** | [**WebhookMilestoneEdited**](WebhookMilestoneEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="milestoneOpened"></a>
# **milestoneOpened**
> milestoneOpened(webhookMilestoneOpened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to milestones. For more information, see \&quot;[About milestones](https://docs.github.com/issues/using-labels-and-milestones-to-track-work/about-milestones).\&quot; For information about the APIs to manage milestones, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#milestone) or \&quot;[Milestones](https://docs.github.com/rest/issues/milestones)\&quot; in the REST API documentation.  If you want to receive an event when an issue or pull request is added to or removed from a milestone, use the &#x60;milestoned&#x60; or &#x60;demilestoned&#x60; action type for the &#x60;issues&#x60; or &#x60;pull_request&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Issues\&quot; or \&quot;Pull requests\&quot; repository permissions.

A milestone was opened.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookMilestoneOpened : WebhookMilestoneOpened =  // WebhookMilestoneOpened | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.milestoneOpened(webhookMilestoneOpened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#milestoneOpened")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#milestoneOpened")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookMilestoneOpened** | [**WebhookMilestoneOpened**](WebhookMilestoneOpened.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="orgBlockBlocked"></a>
# **orgBlockBlocked**
> orgBlockBlocked(webhookOrgBlockBlocked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when organization owners or moderators block or unblock a non-member from collaborating on the organization&#39;s repositories. For more information, see \&quot;[Blocking a user from your organization](https://docs.github.com/communities/maintaining-your-safety-on-github/blocking-a-user-from-your-organization).\&quot; For information about the APIs to manage blocked users, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#userblockedevent) or \&quot;[Blocking users](https://docs.github.com/rest/orgs/blocking)\&quot; in the REST API documentation.  If you want to receive an event when members are added or removed from an organization, use the &#x60;organization&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; organization permission.

A user was blocked from the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookOrgBlockBlocked : WebhookOrgBlockBlocked =  // WebhookOrgBlockBlocked | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.orgBlockBlocked(webhookOrgBlockBlocked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#orgBlockBlocked")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#orgBlockBlocked")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookOrgBlockBlocked** | [**WebhookOrgBlockBlocked**](WebhookOrgBlockBlocked.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="orgBlockUnblocked"></a>
# **orgBlockUnblocked**
> orgBlockUnblocked(webhookOrgBlockUnblocked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when organization owners or moderators block or unblock a non-member from collaborating on the organization&#39;s repositories. For more information, see \&quot;[Blocking a user from your organization](https://docs.github.com/communities/maintaining-your-safety-on-github/blocking-a-user-from-your-organization).\&quot; For information about the APIs to manage blocked users, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#userblockedevent) or \&quot;[Blocking users](https://docs.github.com/rest/orgs/blocking)\&quot; in the REST API documentation.  If you want to receive an event when members are added or removed from an organization, use the &#x60;organization&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; organization permission.

A previously blocked user was unblocked from the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookOrgBlockUnblocked : WebhookOrgBlockUnblocked =  // WebhookOrgBlockUnblocked | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.orgBlockUnblocked(webhookOrgBlockUnblocked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#orgBlockUnblocked")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#orgBlockUnblocked")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookOrgBlockUnblocked** | [**WebhookOrgBlockUnblocked**](WebhookOrgBlockUnblocked.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="organizationDeleted"></a>
# **organizationDeleted**
> organizationDeleted(webhookOrganizationDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an organization and its members. For more information, see \&quot;[About organizations](https://docs.github.com/organizations/collaborating-with-groups-in-organizations/about-organizations).\&quot; For information about the APIs to manage organizations, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#organization) or \&quot;[Organizations](https://docs.github.com/rest/orgs)\&quot; in the REST API documentation.  If you want to receive an event when a non-member is blocked or unblocked from an organization, use the &#x60;org_block&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.

An organization was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookOrganizationDeleted : WebhookOrganizationDeleted =  // WebhookOrganizationDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.organizationDeleted(webhookOrganizationDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#organizationDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#organizationDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookOrganizationDeleted** | [**WebhookOrganizationDeleted**](WebhookOrganizationDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="organizationMemberAdded"></a>
# **organizationMemberAdded**
> organizationMemberAdded(webhookOrganizationMemberAdded, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an organization and its members. For more information, see \&quot;[About organizations](https://docs.github.com/organizations/collaborating-with-groups-in-organizations/about-organizations).\&quot; For information about the APIs to manage organizations, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#organization) or \&quot;[Organizations](https://docs.github.com/rest/orgs)\&quot; in the REST API documentation.  If you want to receive an event when a non-member is blocked or unblocked from an organization, use the &#x60;org_block&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.

A member accepted an invitation to join an organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookOrganizationMemberAdded : WebhookOrganizationMemberAdded =  // WebhookOrganizationMemberAdded | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.organizationMemberAdded(webhookOrganizationMemberAdded, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#organizationMemberAdded")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#organizationMemberAdded")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookOrganizationMemberAdded** | [**WebhookOrganizationMemberAdded**](WebhookOrganizationMemberAdded.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="organizationMemberInvited"></a>
# **organizationMemberInvited**
> organizationMemberInvited(webhookOrganizationMemberInvited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an organization and its members. For more information, see \&quot;[About organizations](https://docs.github.com/organizations/collaborating-with-groups-in-organizations/about-organizations).\&quot; For information about the APIs to manage organizations, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#organization) or \&quot;[Organizations](https://docs.github.com/rest/orgs)\&quot; in the REST API documentation.  If you want to receive an event when a non-member is blocked or unblocked from an organization, use the &#x60;org_block&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.

A member was invited to join the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookOrganizationMemberInvited : WebhookOrganizationMemberInvited =  // WebhookOrganizationMemberInvited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.organizationMemberInvited(webhookOrganizationMemberInvited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#organizationMemberInvited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#organizationMemberInvited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookOrganizationMemberInvited** | [**WebhookOrganizationMemberInvited**](WebhookOrganizationMemberInvited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="organizationMemberRemoved"></a>
# **organizationMemberRemoved**
> organizationMemberRemoved(webhookOrganizationMemberRemoved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an organization and its members. For more information, see \&quot;[About organizations](https://docs.github.com/organizations/collaborating-with-groups-in-organizations/about-organizations).\&quot; For information about the APIs to manage organizations, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#organization) or \&quot;[Organizations](https://docs.github.com/rest/orgs)\&quot; in the REST API documentation.  If you want to receive an event when a non-member is blocked or unblocked from an organization, use the &#x60;org_block&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.

A member was removed from the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookOrganizationMemberRemoved : WebhookOrganizationMemberRemoved =  // WebhookOrganizationMemberRemoved | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.organizationMemberRemoved(webhookOrganizationMemberRemoved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#organizationMemberRemoved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#organizationMemberRemoved")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookOrganizationMemberRemoved** | [**WebhookOrganizationMemberRemoved**](WebhookOrganizationMemberRemoved.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="organizationRenamed"></a>
# **organizationRenamed**
> organizationRenamed(webhookOrganizationRenamed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an organization and its members. For more information, see \&quot;[About organizations](https://docs.github.com/organizations/collaborating-with-groups-in-organizations/about-organizations).\&quot; For information about the APIs to manage organizations, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#organization) or \&quot;[Organizations](https://docs.github.com/rest/orgs)\&quot; in the REST API documentation.  If you want to receive an event when a non-member is blocked or unblocked from an organization, use the &#x60;org_block&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.

The name of an organization was changed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookOrganizationRenamed : WebhookOrganizationRenamed =  // WebhookOrganizationRenamed | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.organizationRenamed(webhookOrganizationRenamed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#organizationRenamed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#organizationRenamed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookOrganizationRenamed** | [**WebhookOrganizationRenamed**](WebhookOrganizationRenamed.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="packagePublished"></a>
# **packagePublished**
> packagePublished(webhookPackagePublished, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to GitHub Packages. For more information, see \&quot;[Introduction to GitHub Packages](https://docs.github.com/packages/learn-github-packages/introduction-to-github-packages).\&quot; For information about the APIs to manage GitHub Packages, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#package) or \&quot;[Packages](https://docs.github.com/rest/packages)\&quot; in the REST API documentation.  To install this event on a GitHub App, the app must have at least read-level access for the \&quot;Packages\&quot; repository permission.

A package was published to a registry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPackagePublished : WebhookPackagePublished =  // WebhookPackagePublished | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.packagePublished(webhookPackagePublished, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#packagePublished")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#packagePublished")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPackagePublished** | [**WebhookPackagePublished**](WebhookPackagePublished.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="packageUpdated"></a>
# **packageUpdated**
> packageUpdated(webhookPackageUpdated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to GitHub Packages. For more information, see \&quot;[Introduction to GitHub Packages](https://docs.github.com/packages/learn-github-packages/introduction-to-github-packages).\&quot; For information about the APIs to manage GitHub Packages, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#package) or \&quot;[Packages](https://docs.github.com/rest/packages)\&quot; in the REST API documentation.  To install this event on a GitHub App, the app must have at least read-level access for the \&quot;Packages\&quot; repository permission.

A previously published package was updated.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPackageUpdated : WebhookPackageUpdated =  // WebhookPackageUpdated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.packageUpdated(webhookPackageUpdated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#packageUpdated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#packageUpdated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPackageUpdated** | [**WebhookPackageUpdated**](WebhookPackageUpdated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pageBuild"></a>
# **pageBuild**
> pageBuild(webhookPageBuild, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is an attempted build of a GitHub Pages site. This event occurs regardless of whether the build is successful. For more information, see \&quot;[Configuring a publishing source for your GitHub Pages site](https://docs.github.com/pages/getting-started-with-github-pages/configuring-a-publishing-source-for-your-github-pages-site).\&quot; For information about the API to manage GitHub Pages, see \&quot;[Pages](https://docs.github.com/rest/pages)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pages\&quot; repository permission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPageBuild : WebhookPageBuild =  // WebhookPageBuild | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pageBuild(webhookPageBuild, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pageBuild")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pageBuild")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPageBuild** | [**WebhookPageBuild**](WebhookPageBuild.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="personalAccessTokenRequestApproved"></a>
# **personalAccessTokenRequestApproved**
> personalAccessTokenRequestApproved(webhookPersonalAccessTokenRequestApproved, userAgent, xGitHubDelivery, xGithubEvent, xGithubHookId, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xHubSignature256)

This event occurs when there is activity relating to a request for a fine-grained personal access token to access resources that belong to a resource owner that requires approval for token access. For more information, see \&quot;[Creating a personal access token](https://docs.github.com/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Personal access token requests\&quot; organization permission.  **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.

A fine-grained personal access token request was approved.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPersonalAccessTokenRequestApproved : WebhookPersonalAccessTokenRequestApproved =  // WebhookPersonalAccessTokenRequestApproved | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xGithubEvent : kotlin.String = personal_access_token_request // kotlin.String | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.String = integration // kotlin.String | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.personalAccessTokenRequestApproved(webhookPersonalAccessTokenRequestApproved, userAgent, xGitHubDelivery, xGithubEvent, xGithubHookId, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#personalAccessTokenRequestApproved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#personalAccessTokenRequestApproved")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPersonalAccessTokenRequestApproved** | [**WebhookPersonalAccessTokenRequestApproved**](WebhookPersonalAccessTokenRequestApproved.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | **kotlin.String**|  | [optional] [default to &quot;push&quot;]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | **kotlin.String**|  | [optional] [default to &quot;push&quot;]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="personalAccessTokenRequestCancelled"></a>
# **personalAccessTokenRequestCancelled**
> personalAccessTokenRequestCancelled(webhookPersonalAccessTokenRequestCancelled, userAgent, xGitHubDelivery, xGithubEvent, xGithubHookId, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xHubSignature256)

This event occurs when there is activity relating to a request for a fine-grained personal access token to access resources that belong to a resource owner that requires approval for token access. For more information, see \&quot;[Creating a personal access token](https://docs.github.com/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Personal access token requests\&quot; organization permission.  **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.

A fine-grained personal access token request was cancelled by the requester.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPersonalAccessTokenRequestCancelled : WebhookPersonalAccessTokenRequestCancelled =  // WebhookPersonalAccessTokenRequestCancelled | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xGithubEvent : kotlin.Any = personal_access_token_request // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = integration // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.personalAccessTokenRequestCancelled(webhookPersonalAccessTokenRequestCancelled, userAgent, xGitHubDelivery, xGithubEvent, xGithubHookId, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#personalAccessTokenRequestCancelled")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#personalAccessTokenRequestCancelled")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPersonalAccessTokenRequestCancelled** | [**WebhookPersonalAccessTokenRequestCancelled**](WebhookPersonalAccessTokenRequestCancelled.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="personalAccessTokenRequestCreated"></a>
# **personalAccessTokenRequestCreated**
> personalAccessTokenRequestCreated(webhookPersonalAccessTokenRequestCreated, userAgent, xGitHubDelivery, xGithubEvent, xGithubHookId, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xHubSignature256)

This event occurs when there is activity relating to a request for a fine-grained personal access token to access resources that belong to a resource owner that requires approval for token access. For more information, see \&quot;[Creating a personal access token](https://docs.github.com/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Personal access token requests\&quot; organization permission.  **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.

A fine-grained personal access token request was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPersonalAccessTokenRequestCreated : WebhookPersonalAccessTokenRequestCreated =  // WebhookPersonalAccessTokenRequestCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xGithubEvent : kotlin.Any = personal_access_token_request // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = integration // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.personalAccessTokenRequestCreated(webhookPersonalAccessTokenRequestCreated, userAgent, xGitHubDelivery, xGithubEvent, xGithubHookId, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#personalAccessTokenRequestCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#personalAccessTokenRequestCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPersonalAccessTokenRequestCreated** | [**WebhookPersonalAccessTokenRequestCreated**](WebhookPersonalAccessTokenRequestCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="personalAccessTokenRequestDenied"></a>
# **personalAccessTokenRequestDenied**
> personalAccessTokenRequestDenied(webhookPersonalAccessTokenRequestDenied, userAgent, xGitHubDelivery, xGithubEvent, xGithubHookId, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xHubSignature256)

This event occurs when there is activity relating to a request for a fine-grained personal access token to access resources that belong to a resource owner that requires approval for token access. For more information, see \&quot;[Creating a personal access token](https://docs.github.com/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Personal access token requests\&quot; organization permission.  **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.

A fine-grained personal access token request was denied.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPersonalAccessTokenRequestDenied : WebhookPersonalAccessTokenRequestDenied =  // WebhookPersonalAccessTokenRequestDenied | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xGithubEvent : kotlin.Any = personal_access_token_request // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = integration // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.personalAccessTokenRequestDenied(webhookPersonalAccessTokenRequestDenied, userAgent, xGitHubDelivery, xGithubEvent, xGithubHookId, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#personalAccessTokenRequestDenied")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#personalAccessTokenRequestDenied")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPersonalAccessTokenRequestDenied** | [**WebhookPersonalAccessTokenRequestDenied**](WebhookPersonalAccessTokenRequestDenied.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="ping"></a>
# **ping**
> ping(webhookPing, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when you create a new webhook. The ping event is a confirmation from GitHub that you configured the webhook correctly.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPing : WebhookPing =  // WebhookPing | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.ping(webhookPing, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#ping")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#ping")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPing** | [**WebhookPing**](WebhookPing.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: Not defined

<a id="projectCardConverted"></a>
# **projectCardConverted**
> projectCardConverted(webhookProjectCardConverted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a card on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a column on a project (classic), use the &#x60;project&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.

A note in a project (classic) was converted to an issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectCardConverted : WebhookProjectCardConverted =  // WebhookProjectCardConverted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectCardConverted(webhookProjectCardConverted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectCardConverted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectCardConverted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectCardConverted** | [**WebhookProjectCardConverted**](WebhookProjectCardConverted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectCardCreated"></a>
# **projectCardCreated**
> projectCardCreated(webhookProjectCardCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a card on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a column on a project (classic), use the &#x60;project&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.

A card was added to a project (classic).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectCardCreated : WebhookProjectCardCreated =  // WebhookProjectCardCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectCardCreated(webhookProjectCardCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectCardCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectCardCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectCardCreated** | [**WebhookProjectCardCreated**](WebhookProjectCardCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectCardDeleted"></a>
# **projectCardDeleted**
> projectCardDeleted(webhookProjectCardDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a card on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a column on a project (classic), use the &#x60;project&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.

A card on a project (classic) was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectCardDeleted : WebhookProjectCardDeleted =  // WebhookProjectCardDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectCardDeleted(webhookProjectCardDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectCardDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectCardDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectCardDeleted** | [**WebhookProjectCardDeleted**](WebhookProjectCardDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectCardEdited"></a>
# **projectCardEdited**
> projectCardEdited(webhookProjectCardEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a card on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a column on a project (classic), use the &#x60;project&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.

A note on a project (classic) was edited.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectCardEdited : WebhookProjectCardEdited =  // WebhookProjectCardEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectCardEdited(webhookProjectCardEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectCardEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectCardEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectCardEdited** | [**WebhookProjectCardEdited**](WebhookProjectCardEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectCardMoved"></a>
# **projectCardMoved**
> projectCardMoved(webhookProjectCardMoved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a card on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a column on a project (classic), use the &#x60;project&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.

A card on a project (classic) was moved to another column or to another position in its column.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectCardMoved : WebhookProjectCardMoved =  // WebhookProjectCardMoved | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectCardMoved(webhookProjectCardMoved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectCardMoved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectCardMoved")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectCardMoved** | [**WebhookProjectCardMoved**](WebhookProjectCardMoved.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectClosed"></a>
# **projectClosed**
> projectClosed(webhookProjectClosed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a card or column on a project (classic), use the &#x60;project_card&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.

A project (classic) was closed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectClosed : WebhookProjectClosed =  // WebhookProjectClosed | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectClosed(webhookProjectClosed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectClosed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectClosed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectClosed** | [**WebhookProjectClosed**](WebhookProjectClosed.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectColumnCreated"></a>
# **projectColumnCreated**
> projectColumnCreated(webhookProjectColumnCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a column on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a card on a project (classic), use the &#x60;project&#x60; and &#x60;project_card&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.

A column was added to a project (classic).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectColumnCreated : WebhookProjectColumnCreated =  // WebhookProjectColumnCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectColumnCreated(webhookProjectColumnCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectColumnCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectColumnCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectColumnCreated** | [**WebhookProjectColumnCreated**](WebhookProjectColumnCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectColumnDeleted"></a>
# **projectColumnDeleted**
> projectColumnDeleted(webhookProjectColumnDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a column on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a card on a project (classic), use the &#x60;project&#x60; and &#x60;project_card&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.

A column was deleted from a project (classic).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectColumnDeleted : WebhookProjectColumnDeleted =  // WebhookProjectColumnDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectColumnDeleted(webhookProjectColumnDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectColumnDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectColumnDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectColumnDeleted** | [**WebhookProjectColumnDeleted**](WebhookProjectColumnDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectColumnEdited"></a>
# **projectColumnEdited**
> projectColumnEdited(webhookProjectColumnEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a column on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a card on a project (classic), use the &#x60;project&#x60; and &#x60;project_card&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.

The name of a column on a project (classic) was changed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectColumnEdited : WebhookProjectColumnEdited =  // WebhookProjectColumnEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectColumnEdited(webhookProjectColumnEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectColumnEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectColumnEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectColumnEdited** | [**WebhookProjectColumnEdited**](WebhookProjectColumnEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectColumnMoved"></a>
# **projectColumnMoved**
> projectColumnMoved(webhookProjectColumnMoved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a column on a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a project (classic) or a card on a project (classic), use the &#x60;project&#x60; and &#x60;project_card&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.

A column was moved to a new position on a project (classic).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectColumnMoved : WebhookProjectColumnMoved =  // WebhookProjectColumnMoved | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectColumnMoved(webhookProjectColumnMoved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectColumnMoved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectColumnMoved")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectColumnMoved** | [**WebhookProjectColumnMoved**](WebhookProjectColumnMoved.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectCreated"></a>
# **projectCreated**
> projectCreated(webhookProjectCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a card or column on a project (classic), use the &#x60;project_card&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.

A project (classic) was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectCreated : WebhookProjectCreated =  // WebhookProjectCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectCreated(webhookProjectCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectCreated** | [**WebhookProjectCreated**](WebhookProjectCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectDeleted"></a>
# **projectDeleted**
> projectDeleted(webhookProjectDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a card or column on a project (classic), use the &#x60;project_card&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.

A project (classic) was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectDeleted : WebhookProjectDeleted =  // WebhookProjectDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectDeleted(webhookProjectDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectDeleted** | [**WebhookProjectDeleted**](WebhookProjectDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectEdited"></a>
# **projectEdited**
> projectEdited(webhookProjectEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a card or column on a project (classic), use the &#x60;project_card&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.

The name or description of a project (classic) was changed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectEdited : WebhookProjectEdited =  // WebhookProjectEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectEdited(webhookProjectEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectEdited** | [**WebhookProjectEdited**](WebhookProjectEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectReopened"></a>
# **projectReopened**
> projectReopened(webhookProjectReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a project (classic). For more information, see \&quot;[About projects (classic)](https://docs.github.com/issues/organizing-your-work-with-project-boards/managing-project-boards/about-project-boards).\&quot; For information about the API to manage classic projects, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#project) or \&quot;[Projects (classic)](https://docs.github.com/rest/projects)\&quot; in the REST API documentation.  For activity relating to a card or column on a project (classic), use the &#x60;project_card&#x60; and &#x60;project_column&#x60; event.  This event relates to projects (classic) only. For activity relating to the new Projects experience, use the &#x60;projects_v2&#x60; event instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; repository or organization permission.

A project (classic) was closed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectReopened : WebhookProjectReopened =  // WebhookProjectReopened | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectReopened(webhookProjectReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectReopened")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectReopened")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectReopened** | [**WebhookProjectReopened**](WebhookProjectReopened.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectsV2Closed"></a>
# **projectsV2Closed**
> projectsV2Closed(webhookProjectsV2ProjectClosed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2).  For activity relating to a item on a project, use the &#x60;projects_v2_item&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).

A project in the organization was closed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectsV2ProjectClosed : WebhookProjectsV2ProjectClosed =  // WebhookProjectsV2ProjectClosed | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.String = project-v2 // kotlin.String | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectsV2Closed(webhookProjectsV2ProjectClosed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectsV2Closed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectsV2Closed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectsV2ProjectClosed** | [**WebhookProjectsV2ProjectClosed**](WebhookProjectsV2ProjectClosed.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | **kotlin.String**|  | [optional] [default to &quot;push&quot;]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectsV2Created"></a>
# **projectsV2Created**
> projectsV2Created(webhookProjectsV2ProjectCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2).  For activity relating to a item on a project, use the &#x60;projects_v2_item&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).

A project in the organization was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectsV2ProjectCreated : WebhookProjectsV2ProjectCreated =  // WebhookProjectsV2ProjectCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = project-v2 // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectsV2Created(webhookProjectsV2ProjectCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectsV2Created")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectsV2Created")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectsV2ProjectCreated** | [**WebhookProjectsV2ProjectCreated**](WebhookProjectsV2ProjectCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectsV2Deleted"></a>
# **projectsV2Deleted**
> projectsV2Deleted(webhookProjectsV2ProjectDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2).  For activity relating to a item on a project, use the &#x60;projects_v2_item&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).

A project in the organization was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectsV2ProjectDeleted : WebhookProjectsV2ProjectDeleted =  // WebhookProjectsV2ProjectDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = project-v2 // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectsV2Deleted(webhookProjectsV2ProjectDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectsV2Deleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectsV2Deleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectsV2ProjectDeleted** | [**WebhookProjectsV2ProjectDeleted**](WebhookProjectsV2ProjectDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectsV2Edited"></a>
# **projectsV2Edited**
> projectsV2Edited(webhookProjectsV2ProjectEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2).  For activity relating to a item on a project, use the &#x60;projects_v2_item&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).

The title, description, or README of a project in the organization was changed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectsV2ProjectEdited : WebhookProjectsV2ProjectEdited =  // WebhookProjectsV2ProjectEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = project-v2 // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectsV2Edited(webhookProjectsV2ProjectEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectsV2Edited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectsV2Edited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectsV2ProjectEdited** | [**WebhookProjectsV2ProjectEdited**](WebhookProjectsV2ProjectEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectsV2ItemArchived"></a>
# **projectsV2ItemArchived**
> projectsV2ItemArchived(webhookProjectsV2ItemArchived, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an item on an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2item).  For activity relating to a project (instead of an item on a project), use the &#x60;projects_v2&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).

An item on an organization project was archived. For more information, see \&quot;[Archiving items from your project](https://docs.github.com/issues/planning-and-tracking-with-projects/managing-items-in-your-project/archiving-items-from-your-project).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectsV2ItemArchived : WebhookProjectsV2ItemArchived =  // WebhookProjectsV2ItemArchived | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.String = project-v2-item // kotlin.String | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectsV2ItemArchived(webhookProjectsV2ItemArchived, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectsV2ItemArchived")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectsV2ItemArchived")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectsV2ItemArchived** | [**WebhookProjectsV2ItemArchived**](WebhookProjectsV2ItemArchived.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | **kotlin.String**|  | [optional] [default to &quot;push&quot;]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectsV2ItemConverted"></a>
# **projectsV2ItemConverted**
> projectsV2ItemConverted(webhookProjectsV2ItemConverted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an item on an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2item).  For activity relating to a project (instead of an item on a project), use the &#x60;projects_v2&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).

A draft issue in an organization project was converted to an issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectsV2ItemConverted : WebhookProjectsV2ItemConverted =  // WebhookProjectsV2ItemConverted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = project-v2-item // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectsV2ItemConverted(webhookProjectsV2ItemConverted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectsV2ItemConverted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectsV2ItemConverted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectsV2ItemConverted** | [**WebhookProjectsV2ItemConverted**](WebhookProjectsV2ItemConverted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectsV2ItemCreated"></a>
# **projectsV2ItemCreated**
> projectsV2ItemCreated(webhookProjectsV2ItemCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an item on an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2item).  For activity relating to a project (instead of an item on a project), use the &#x60;projects_v2&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).

An item was added to a project in the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectsV2ItemCreated : WebhookProjectsV2ItemCreated =  // WebhookProjectsV2ItemCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = project-v2-item // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectsV2ItemCreated(webhookProjectsV2ItemCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectsV2ItemCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectsV2ItemCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectsV2ItemCreated** | [**WebhookProjectsV2ItemCreated**](WebhookProjectsV2ItemCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectsV2ItemDeleted"></a>
# **projectsV2ItemDeleted**
> projectsV2ItemDeleted(webhookProjectsV2ItemDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an item on an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2item).  For activity relating to a project (instead of an item on a project), use the &#x60;projects_v2&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).

An item was deleted from a project in the organization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectsV2ItemDeleted : WebhookProjectsV2ItemDeleted =  // WebhookProjectsV2ItemDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = project-v2-item // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectsV2ItemDeleted(webhookProjectsV2ItemDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectsV2ItemDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectsV2ItemDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectsV2ItemDeleted** | [**WebhookProjectsV2ItemDeleted**](WebhookProjectsV2ItemDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectsV2ItemEdited"></a>
# **projectsV2ItemEdited**
> projectsV2ItemEdited(webhookProjectsV2ItemEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an item on an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2item).  For activity relating to a project (instead of an item on a project), use the &#x60;projects_v2&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).

The values or state of an item in an organization project were changed. For example, the value of a field was updated, the body of a draft issue was changed, or a draft issue was converted to an issue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectsV2ItemEdited : WebhookProjectsV2ItemEdited =  // WebhookProjectsV2ItemEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = project-v2-item // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectsV2ItemEdited(webhookProjectsV2ItemEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectsV2ItemEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectsV2ItemEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectsV2ItemEdited** | [**WebhookProjectsV2ItemEdited**](WebhookProjectsV2ItemEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectsV2ItemReordered"></a>
# **projectsV2ItemReordered**
> projectsV2ItemReordered(webhookProjectsV2ItemReordered, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an item on an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2item).  For activity relating to a project (instead of an item on a project), use the &#x60;projects_v2&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).

The position of an item in an organization project was changed. For example, an item was moved above or below another item in the table or board layout.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectsV2ItemReordered : WebhookProjectsV2ItemReordered =  // WebhookProjectsV2ItemReordered | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = project-v2-item // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectsV2ItemReordered(webhookProjectsV2ItemReordered, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectsV2ItemReordered")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectsV2ItemReordered")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectsV2ItemReordered** | [**WebhookProjectsV2ItemReordered**](WebhookProjectsV2ItemReordered.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectsV2ItemRestored"></a>
# **projectsV2ItemRestored**
> projectsV2ItemRestored(webhookProjectsV2ItemRestored, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an item on an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2item).  For activity relating to a project (instead of an item on a project), use the &#x60;projects_v2&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).

An archived item on an organization project was restored from the archive. For more information, see \&quot;[Archiving items from your project](https://docs.github.com/issues/planning-and-tracking-with-projects/managing-items-in-your-project/archiving-items-from-your-project).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectsV2ItemRestored : WebhookProjectsV2ItemRestored =  // WebhookProjectsV2ItemRestored | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = project-v2-item // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectsV2ItemRestored(webhookProjectsV2ItemRestored, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectsV2ItemRestored")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectsV2ItemRestored")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectsV2ItemRestored** | [**WebhookProjectsV2ItemRestored**](WebhookProjectsV2ItemRestored.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="projectsV2Reopened"></a>
# **projectsV2Reopened**
> projectsV2Reopened(webhookProjectsV2ProjectReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to an organization-level project. For more information, see \&quot;[About Projects](https://docs.github.com/issues/planning-and-tracking-with-projects/learning-about-projects/about-projects).\&quot; For information about the Projects API, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#projectv2).  For activity relating to a item on a project, use the &#x60;projects_v2_item&#x60; event. For activity relating to Projects (classic), use the &#x60;project&#x60;, &#x60;project_card&#x60;, and &#x60;project_column&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Projects\&quot; organization permission.  **Note**: Webhook events for projects are currently in beta and subject to change. To share feedback about projects webhooks with GitHub, see the [Projects webhook feedback discussion](https://github.com/orgs/community/discussions/17405).

A project in the organization was reopened.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookProjectsV2ProjectReopened : WebhookProjectsV2ProjectReopened =  // WebhookProjectsV2ProjectReopened | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = project-v2 // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.projectsV2Reopened(webhookProjectsV2ProjectReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#projectsV2Reopened")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#projectsV2Reopened")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookProjectsV2ProjectReopened** | [**WebhookProjectsV2ProjectReopened**](WebhookProjectsV2ProjectReopened.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestAssigned"></a>
# **pullRequestAssigned**
> pullRequestAssigned(webhookPullRequestAssigned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A pull request was assigned to a user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestAssigned : WebhookPullRequestAssigned =  // WebhookPullRequestAssigned | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestAssigned(webhookPullRequestAssigned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestAssigned")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestAssigned")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestAssigned** | [**WebhookPullRequestAssigned**](WebhookPullRequestAssigned.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestAutoMergeDisabled"></a>
# **pullRequestAutoMergeDisabled**
> pullRequestAutoMergeDisabled(webhookPullRequestAutoMergeDisabled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

Auto merge was disabled for a pull request. For more information, see \&quot;[Automatically merging a pull request](https://docs.github.com/pull-requests/collaborating-with-pull-requests/incorporating-changes-from-a-pull-request/automatically-merging-a-pull-request).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestAutoMergeDisabled : WebhookPullRequestAutoMergeDisabled =  // WebhookPullRequestAutoMergeDisabled | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestAutoMergeDisabled(webhookPullRequestAutoMergeDisabled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestAutoMergeDisabled")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestAutoMergeDisabled")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestAutoMergeDisabled** | [**WebhookPullRequestAutoMergeDisabled**](WebhookPullRequestAutoMergeDisabled.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestAutoMergeEnabled"></a>
# **pullRequestAutoMergeEnabled**
> pullRequestAutoMergeEnabled(webhookPullRequestAutoMergeEnabled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

Auto merge was enabled for a pull request. For more information, see \&quot;[Automatically merging a pull request](https://docs.github.com/pull-requests/collaborating-with-pull-requests/incorporating-changes-from-a-pull-request/automatically-merging-a-pull-request).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestAutoMergeEnabled : WebhookPullRequestAutoMergeEnabled =  // WebhookPullRequestAutoMergeEnabled | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestAutoMergeEnabled(webhookPullRequestAutoMergeEnabled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestAutoMergeEnabled")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestAutoMergeEnabled")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestAutoMergeEnabled** | [**WebhookPullRequestAutoMergeEnabled**](WebhookPullRequestAutoMergeEnabled.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestClosed"></a>
# **pullRequestClosed**
> pullRequestClosed(webhookPullRequestClosed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A pull request was closed. If &#x60;merged&#x60; is false in the webhook payload, the pull request was closed with unmerged commits. If &#x60;merged&#x60; is true in the webhook payload, the pull request was merged.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestClosed : WebhookPullRequestClosed =  // WebhookPullRequestClosed | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestClosed(webhookPullRequestClosed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestClosed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestClosed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestClosed** | [**WebhookPullRequestClosed**](WebhookPullRequestClosed.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestConvertedToDraft"></a>
# **pullRequestConvertedToDraft**
> pullRequestConvertedToDraft(webhookPullRequestConvertedToDraft, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A pull request was converted to a draft. For more information, see \&quot;[Changing the stage of a pull request](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/changing-the-stage-of-a-pull-request).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestConvertedToDraft : WebhookPullRequestConvertedToDraft =  // WebhookPullRequestConvertedToDraft | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestConvertedToDraft(webhookPullRequestConvertedToDraft, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestConvertedToDraft")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestConvertedToDraft")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestConvertedToDraft** | [**WebhookPullRequestConvertedToDraft**](WebhookPullRequestConvertedToDraft.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestDemilestoned"></a>
# **pullRequestDemilestoned**
> pullRequestDemilestoned(webhookPullRequestDemilestoned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A pull request was removed from a milestone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestDemilestoned : WebhookPullRequestDemilestoned =  // WebhookPullRequestDemilestoned | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestDemilestoned(webhookPullRequestDemilestoned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestDemilestoned")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestDemilestoned")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestDemilestoned** | [**WebhookPullRequestDemilestoned**](WebhookPullRequestDemilestoned.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestDequeued"></a>
# **pullRequestDequeued**
> pullRequestDequeued(webhookPullRequestDequeued, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A pull request was removed from the merge queue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestDequeued : WebhookPullRequestDequeued =  // WebhookPullRequestDequeued | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestDequeued(webhookPullRequestDequeued, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestDequeued")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestDequeued")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestDequeued** | [**WebhookPullRequestDequeued**](WebhookPullRequestDequeued.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestEdited"></a>
# **pullRequestEdited**
> pullRequestEdited(webhookPullRequestEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

The title or body of a pull request was edited, or the base branch of a pull request was changed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestEdited : WebhookPullRequestEdited =  // WebhookPullRequestEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestEdited(webhookPullRequestEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestEdited** | [**WebhookPullRequestEdited**](WebhookPullRequestEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestEnqueued"></a>
# **pullRequestEnqueued**
> pullRequestEnqueued(webhookPullRequestEnqueued, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A pull request was added to the merge queue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestEnqueued : WebhookPullRequestEnqueued =  // WebhookPullRequestEnqueued | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestEnqueued(webhookPullRequestEnqueued, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestEnqueued")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestEnqueued")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestEnqueued** | [**WebhookPullRequestEnqueued**](WebhookPullRequestEnqueued.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestLabeled"></a>
# **pullRequestLabeled**
> pullRequestLabeled(webhookPullRequestLabeled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A label was added to a pull request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestLabeled : WebhookPullRequestLabeled =  // WebhookPullRequestLabeled | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestLabeled(webhookPullRequestLabeled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestLabeled")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestLabeled")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestLabeled** | [**WebhookPullRequestLabeled**](WebhookPullRequestLabeled.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestLocked"></a>
# **pullRequestLocked**
> pullRequestLocked(webhookPullRequestLocked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

Conversation on a pull request was locked. For more information, see \&quot;[Locking conversations](https://docs.github.com/communities/moderating-comments-and-conversations/locking-conversations).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestLocked : WebhookPullRequestLocked =  // WebhookPullRequestLocked | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestLocked(webhookPullRequestLocked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestLocked")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestLocked")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestLocked** | [**WebhookPullRequestLocked**](WebhookPullRequestLocked.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestMilestoned"></a>
# **pullRequestMilestoned**
> pullRequestMilestoned(webhookPullRequestMilestoned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A pull request was added to a milestone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestMilestoned : WebhookPullRequestMilestoned =  // WebhookPullRequestMilestoned | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestMilestoned(webhookPullRequestMilestoned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestMilestoned")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestMilestoned")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestMilestoned** | [**WebhookPullRequestMilestoned**](WebhookPullRequestMilestoned.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestOpened"></a>
# **pullRequestOpened**
> pullRequestOpened(webhookPullRequestOpened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A pull request was created

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestOpened : WebhookPullRequestOpened =  // WebhookPullRequestOpened | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestOpened(webhookPullRequestOpened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestOpened")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestOpened")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestOpened** | [**WebhookPullRequestOpened**](WebhookPullRequestOpened.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestReadyForReview"></a>
# **pullRequestReadyForReview**
> pullRequestReadyForReview(webhookPullRequestReadyForReview, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A draft pull request was marked as ready for review. For more information, see \&quot;[Changing the stage of a pull request](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/changing-the-stage-of-a-pull-request).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestReadyForReview : WebhookPullRequestReadyForReview =  // WebhookPullRequestReadyForReview | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestReadyForReview(webhookPullRequestReadyForReview, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestReadyForReview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestReadyForReview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestReadyForReview** | [**WebhookPullRequestReadyForReview**](WebhookPullRequestReadyForReview.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestReopened"></a>
# **pullRequestReopened**
> pullRequestReopened(webhookPullRequestReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A previously closed pull request was reopened.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestReopened : WebhookPullRequestReopened =  // WebhookPullRequestReopened | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestReopened(webhookPullRequestReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestReopened")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestReopened")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestReopened** | [**WebhookPullRequestReopened**](WebhookPullRequestReopened.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestReviewCommentCreated"></a>
# **pullRequestReviewCommentCreated**
> pullRequestReviewCommentCreated(webhookPullRequestReviewCommentCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a pull request review comment. A pull request review comment is a comment on a pull request&#39;s diff. For more information, see \&quot;[Commenting on a pull request](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request).\&quot; For information about the APIs to manage pull request review comments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequestreviewcomment) or \&quot;[Pull request review comments](https://docs.github.com/rest/pulls/comments)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A comment on a pull request diff was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestReviewCommentCreated : WebhookPullRequestReviewCommentCreated =  // WebhookPullRequestReviewCommentCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestReviewCommentCreated(webhookPullRequestReviewCommentCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestReviewCommentCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestReviewCommentCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestReviewCommentCreated** | [**WebhookPullRequestReviewCommentCreated**](WebhookPullRequestReviewCommentCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestReviewCommentDeleted"></a>
# **pullRequestReviewCommentDeleted**
> pullRequestReviewCommentDeleted(webhookPullRequestReviewCommentDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a pull request review comment. A pull request review comment is a comment on a pull request&#39;s diff. For more information, see \&quot;[Commenting on a pull request](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request).\&quot; For information about the APIs to manage pull request review comments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequestreviewcomment) or \&quot;[Pull request review comments](https://docs.github.com/rest/pulls/comments)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A comment on a pull request diff was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestReviewCommentDeleted : WebhookPullRequestReviewCommentDeleted =  // WebhookPullRequestReviewCommentDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestReviewCommentDeleted(webhookPullRequestReviewCommentDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestReviewCommentDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestReviewCommentDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestReviewCommentDeleted** | [**WebhookPullRequestReviewCommentDeleted**](WebhookPullRequestReviewCommentDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestReviewCommentEdited"></a>
# **pullRequestReviewCommentEdited**
> pullRequestReviewCommentEdited(webhookPullRequestReviewCommentEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a pull request review comment. A pull request review comment is a comment on a pull request&#39;s diff. For more information, see \&quot;[Commenting on a pull request](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request).\&quot; For information about the APIs to manage pull request review comments, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequestreviewcomment) or \&quot;[Pull request review comments](https://docs.github.com/rest/pulls/comments)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

The content of a comment on a pull request diff was changed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestReviewCommentEdited : WebhookPullRequestReviewCommentEdited =  // WebhookPullRequestReviewCommentEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestReviewCommentEdited(webhookPullRequestReviewCommentEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestReviewCommentEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestReviewCommentEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestReviewCommentEdited** | [**WebhookPullRequestReviewCommentEdited**](WebhookPullRequestReviewCommentEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestReviewDismissed"></a>
# **pullRequestReviewDismissed**
> pullRequestReviewDismissed(webhookPullRequestReviewDismissed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a pull request review. A pull request review is a group of pull request review comments in addition to a body comment and a state. For more information, see \&quot;[About pull request reviews](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/about-pull-request-reviews).\&quot; For information about the APIs to manage pull request reviews, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequestreview) or \&quot;[Pull request reviews](https://docs.github.com/rest/pulls/reviews)\&quot; in the REST API documentation.  For activity related to pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A review on a pull request was dismissed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestReviewDismissed : WebhookPullRequestReviewDismissed =  // WebhookPullRequestReviewDismissed | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestReviewDismissed(webhookPullRequestReviewDismissed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestReviewDismissed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestReviewDismissed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestReviewDismissed** | [**WebhookPullRequestReviewDismissed**](WebhookPullRequestReviewDismissed.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestReviewEdited"></a>
# **pullRequestReviewEdited**
> pullRequestReviewEdited(webhookPullRequestReviewEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a pull request review. A pull request review is a group of pull request review comments in addition to a body comment and a state. For more information, see \&quot;[About pull request reviews](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/about-pull-request-reviews).\&quot; For information about the APIs to manage pull request reviews, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequestreview) or \&quot;[Pull request reviews](https://docs.github.com/rest/pulls/reviews)\&quot; in the REST API documentation.  For activity related to pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

The body comment on a pull request review was edited.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestReviewEdited : WebhookPullRequestReviewEdited =  // WebhookPullRequestReviewEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestReviewEdited(webhookPullRequestReviewEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestReviewEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestReviewEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestReviewEdited** | [**WebhookPullRequestReviewEdited**](WebhookPullRequestReviewEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestReviewRequestRemoved"></a>
# **pullRequestReviewRequestRemoved**
> pullRequestReviewRequestRemoved(webhookPullRequestReviewRequestRemoved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A request for review by a person or team was removed from a pull request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestReviewRequestRemoved : WebhookPullRequestReviewRequestRemoved =  // WebhookPullRequestReviewRequestRemoved | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestReviewRequestRemoved(webhookPullRequestReviewRequestRemoved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestReviewRequestRemoved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestReviewRequestRemoved")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestReviewRequestRemoved** | [**WebhookPullRequestReviewRequestRemoved**](WebhookPullRequestReviewRequestRemoved.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestReviewRequested"></a>
# **pullRequestReviewRequested**
> pullRequestReviewRequested(webhookPullRequestReviewRequested, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

Review by a person or team was requested for a pull request. For more information, see \&quot;[Requesting a pull request review](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/requesting-a-pull-request-review).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestReviewRequested : WebhookPullRequestReviewRequested =  // WebhookPullRequestReviewRequested | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestReviewRequested(webhookPullRequestReviewRequested, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestReviewRequested")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestReviewRequested")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestReviewRequested** | [**WebhookPullRequestReviewRequested**](WebhookPullRequestReviewRequested.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestReviewSubmitted"></a>
# **pullRequestReviewSubmitted**
> pullRequestReviewSubmitted(webhookPullRequestReviewSubmitted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a pull request review. A pull request review is a group of pull request review comments in addition to a body comment and a state. For more information, see \&quot;[About pull request reviews](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/about-pull-request-reviews).\&quot; For information about the APIs to manage pull request reviews, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequestreview) or \&quot;[Pull request reviews](https://docs.github.com/rest/pulls/reviews)\&quot; in the REST API documentation.  For activity related to pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A review on a pull request was submitted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestReviewSubmitted : WebhookPullRequestReviewSubmitted =  // WebhookPullRequestReviewSubmitted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestReviewSubmitted(webhookPullRequestReviewSubmitted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestReviewSubmitted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestReviewSubmitted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestReviewSubmitted** | [**WebhookPullRequestReviewSubmitted**](WebhookPullRequestReviewSubmitted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestReviewThreadResolved"></a>
# **pullRequestReviewThreadResolved**
> pullRequestReviewThreadResolved(webhookPullRequestReviewThreadResolved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a comment thread on a pull request. For more information, see \&quot;[About pull request reviews](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/about-pull-request-reviews).\&quot; For information about the APIs to manage pull request reviews, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequestreviewthread) or \&quot;[Pull request review comments](https://docs.github.com/rest/pulls/comments)\&quot; in the REST API documentation.  For activity related to pull request review comments, pull request comments, or pull request reviews, use the &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A comment thread on a pull request was marked as resolved.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestReviewThreadResolved : WebhookPullRequestReviewThreadResolved =  // WebhookPullRequestReviewThreadResolved | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestReviewThreadResolved(webhookPullRequestReviewThreadResolved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestReviewThreadResolved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestReviewThreadResolved")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestReviewThreadResolved** | [**WebhookPullRequestReviewThreadResolved**](WebhookPullRequestReviewThreadResolved.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestReviewThreadUnresolved"></a>
# **pullRequestReviewThreadUnresolved**
> pullRequestReviewThreadUnresolved(webhookPullRequestReviewThreadUnresolved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a comment thread on a pull request. For more information, see \&quot;[About pull request reviews](https://docs.github.com/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/about-pull-request-reviews).\&quot; For information about the APIs to manage pull request reviews, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequestreviewthread) or \&quot;[Pull request review comments](https://docs.github.com/rest/pulls/comments)\&quot; in the REST API documentation.  For activity related to pull request review comments, pull request comments, or pull request reviews, use the &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A previously resolved comment thread on a pull request was marked as unresolved.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestReviewThreadUnresolved : WebhookPullRequestReviewThreadUnresolved =  // WebhookPullRequestReviewThreadUnresolved | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestReviewThreadUnresolved(webhookPullRequestReviewThreadUnresolved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestReviewThreadUnresolved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestReviewThreadUnresolved")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestReviewThreadUnresolved** | [**WebhookPullRequestReviewThreadUnresolved**](WebhookPullRequestReviewThreadUnresolved.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestSynchronize"></a>
# **pullRequestSynchronize**
> pullRequestSynchronize(webhookPullRequestSynchronize, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A pull request&#39;s head branch was updated. For example, the head branch was updated from the base branch or new commits were pushed to the head branch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestSynchronize : WebhookPullRequestSynchronize =  // WebhookPullRequestSynchronize | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestSynchronize(webhookPullRequestSynchronize, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestSynchronize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestSynchronize")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestSynchronize** | [**WebhookPullRequestSynchronize**](WebhookPullRequestSynchronize.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestUnassigned"></a>
# **pullRequestUnassigned**
> pullRequestUnassigned(webhookPullRequestUnassigned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A user was unassigned from a pull request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestUnassigned : WebhookPullRequestUnassigned =  // WebhookPullRequestUnassigned | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestUnassigned(webhookPullRequestUnassigned, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestUnassigned")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestUnassigned")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestUnassigned** | [**WebhookPullRequestUnassigned**](WebhookPullRequestUnassigned.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestUnlabeled"></a>
# **pullRequestUnlabeled**
> pullRequestUnlabeled(webhookPullRequestUnlabeled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

A label was removed from a pull request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestUnlabeled : WebhookPullRequestUnlabeled =  // WebhookPullRequestUnlabeled | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestUnlabeled(webhookPullRequestUnlabeled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestUnlabeled")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestUnlabeled")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestUnlabeled** | [**WebhookPullRequestUnlabeled**](WebhookPullRequestUnlabeled.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="pullRequestUnlocked"></a>
# **pullRequestUnlocked**
> pullRequestUnlocked(webhookPullRequestUnlocked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity on a pull request. For more information, see \&quot;[About pull requests](https://docs.github.com/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).\&quot; For information about the APIs to manage pull requests, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#pullrequest) or \&quot;[Pulls](https://docs.github.com/rest/pulls/pulls)\&quot; in the REST API documentation.  For activity related to pull request reviews, pull request review comments, pull request comments, or pull request review threads, use the &#x60;pull_request_review&#x60;, &#x60;pull_request_review_comment&#x60;, &#x60;issue_comment&#x60;, or &#x60;pull_request_review_thread&#x60; events instead.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Pull requests\&quot; repository permission.

Conversation on a pull request was unlocked. For more information, see \&quot;[Locking conversations](https://docs.github.com/communities/moderating-comments-and-conversations/locking-conversations).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPullRequestUnlocked : WebhookPullRequestUnlocked =  // WebhookPullRequestUnlocked | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.pullRequestUnlocked(webhookPullRequestUnlocked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#pullRequestUnlocked")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#pullRequestUnlocked")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPullRequestUnlocked** | [**WebhookPullRequestUnlocked**](WebhookPullRequestUnlocked.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="push"></a>
# **push**
> push(webhookPush, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is a push to a repository branch. This includes when a commit is pushed, when a commit tag is pushed, when a branch is deleted, when a tag is deleted, or when a repository is created from a template. To subscribe to only branch and tag deletions, use the [&#x60;delete&#x60;](#delete) webhook event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.  **Note**: An event will not be created when more than three tags are pushed at once.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookPush : WebhookPush =  // WebhookPush | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.push(webhookPush, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#push")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#push")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookPush** | [**WebhookPush**](WebhookPush.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="registryPackagePublished"></a>
# **registryPackagePublished**
> registryPackagePublished(webhookRegistryPackagePublished, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to GitHub Packages. For more information, see \&quot;[Introduction to GitHub Packages](https://docs.github.com/packages/learn-github-packages/introduction-to-github-packages).\&quot; For information about the APIs to manage GitHub Packages, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#package) or \&quot;[Packages](https://docs.github.com/rest/packages)\&quot; in the REST API documentation.  To install this event on a GitHub App, the app must have at least read-level access for the \&quot;Packages\&quot; repository permission.  **Note**: GitHub recommends that you use the newer &#x60;package&#x60; event instead.

A package was published to a registry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRegistryPackagePublished : WebhookRegistryPackagePublished =  // WebhookRegistryPackagePublished | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.registryPackagePublished(webhookRegistryPackagePublished, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#registryPackagePublished")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#registryPackagePublished")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRegistryPackagePublished** | [**WebhookRegistryPackagePublished**](WebhookRegistryPackagePublished.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="registryPackageUpdated"></a>
# **registryPackageUpdated**
> registryPackageUpdated(webhookRegistryPackageUpdated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to GitHub Packages. For more information, see \&quot;[Introduction to GitHub Packages](https://docs.github.com/packages/learn-github-packages/introduction-to-github-packages).\&quot; For information about the APIs to manage GitHub Packages, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#package) or \&quot;[Packages](https://docs.github.com/rest/packages)\&quot; in the REST API documentation.  To install this event on a GitHub App, the app must have at least read-level access for the \&quot;Packages\&quot; repository permission.  **Note**: GitHub recommends that you use the newer &#x60;package&#x60; event instead.

A package that was previously published to a registry was updated.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRegistryPackageUpdated : WebhookRegistryPackageUpdated =  // WebhookRegistryPackageUpdated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.registryPackageUpdated(webhookRegistryPackageUpdated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#registryPackageUpdated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#registryPackageUpdated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRegistryPackageUpdated** | [**WebhookRegistryPackageUpdated**](WebhookRegistryPackageUpdated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="releaseCreated"></a>
# **releaseCreated**
> releaseCreated(webhookReleaseCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to releases. For more information, see \&quot;[About releases](https://docs.github.com/repositories/releasing-projects-on-github/about-releases).\&quot; For information about the APIs to manage releases, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#release) or \&quot;[Releases](https://docs.github.com/rest/releases)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.

A draft was saved, or a release or pre-release was published without previously being saved as a draft.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookReleaseCreated : WebhookReleaseCreated =  // WebhookReleaseCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.releaseCreated(webhookReleaseCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#releaseCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#releaseCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookReleaseCreated** | [**WebhookReleaseCreated**](WebhookReleaseCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="releaseDeleted"></a>
# **releaseDeleted**
> releaseDeleted(webhookReleaseDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to releases. For more information, see \&quot;[About releases](https://docs.github.com/repositories/releasing-projects-on-github/about-releases).\&quot; For information about the APIs to manage releases, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#release) or \&quot;[Releases](https://docs.github.com/rest/releases)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.

A release, pre-release, or draft release was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookReleaseDeleted : WebhookReleaseDeleted =  // WebhookReleaseDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.releaseDeleted(webhookReleaseDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#releaseDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#releaseDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookReleaseDeleted** | [**WebhookReleaseDeleted**](WebhookReleaseDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="releaseEdited"></a>
# **releaseEdited**
> releaseEdited(webhookReleaseEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to releases. For more information, see \&quot;[About releases](https://docs.github.com/repositories/releasing-projects-on-github/about-releases).\&quot; For information about the APIs to manage releases, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#release) or \&quot;[Releases](https://docs.github.com/rest/releases)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.

The details of a release, pre-release, or draft release were edited. For more information, see \&quot;[Managing releases in a repository](https://docs.github.com/repositories/releasing-projects-on-github/managing-releases-in-a-repository#editing-a-release).\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookReleaseEdited : WebhookReleaseEdited =  // WebhookReleaseEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.releaseEdited(webhookReleaseEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#releaseEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#releaseEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookReleaseEdited** | [**WebhookReleaseEdited**](WebhookReleaseEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="releasePrereleased"></a>
# **releasePrereleased**
> releasePrereleased(webhookReleasePrereleased, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to releases. For more information, see \&quot;[About releases](https://docs.github.com/repositories/releasing-projects-on-github/about-releases).\&quot; For information about the APIs to manage releases, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#release) or \&quot;[Releases](https://docs.github.com/rest/releases)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.

A release was created and identified as a pre-release. A pre-release is a release that is not ready for production and may be unstable.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookReleasePrereleased : WebhookReleasePrereleased =  // WebhookReleasePrereleased | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.releasePrereleased(webhookReleasePrereleased, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#releasePrereleased")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#releasePrereleased")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookReleasePrereleased** | [**WebhookReleasePrereleased**](WebhookReleasePrereleased.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="releasePublished"></a>
# **releasePublished**
> releasePublished(webhookReleasePublished, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to releases. For more information, see \&quot;[About releases](https://docs.github.com/repositories/releasing-projects-on-github/about-releases).\&quot; For information about the APIs to manage releases, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#release) or \&quot;[Releases](https://docs.github.com/rest/releases)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.

A release, pre-release, or draft of a release was published.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookReleasePublished : WebhookReleasePublished =  // WebhookReleasePublished | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.releasePublished(webhookReleasePublished, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#releasePublished")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#releasePublished")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookReleasePublished** | [**WebhookReleasePublished**](WebhookReleasePublished.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="releaseReleased"></a>
# **releaseReleased**
> releaseReleased(webhookReleaseReleased, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to releases. For more information, see \&quot;[About releases](https://docs.github.com/repositories/releasing-projects-on-github/about-releases).\&quot; For information about the APIs to manage releases, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#release) or \&quot;[Releases](https://docs.github.com/rest/releases)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.

A release was published, or a pre-release was changed to a release.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookReleaseReleased : WebhookReleaseReleased =  // WebhookReleaseReleased | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.releaseReleased(webhookReleaseReleased, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#releaseReleased")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#releaseReleased")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookReleaseReleased** | [**WebhookReleaseReleased**](WebhookReleaseReleased.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="releaseUnpublished"></a>
# **releaseUnpublished**
> releaseUnpublished(webhookReleaseUnpublished, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to releases. For more information, see \&quot;[About releases](https://docs.github.com/repositories/releasing-projects-on-github/about-releases).\&quot; For information about the APIs to manage releases, see [the GraphQL API documentation](https://docs.github.com/graphql/reference/objects#release) or \&quot;[Releases](https://docs.github.com/rest/releases)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.

A release or pre-release was unpublished.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookReleaseUnpublished : WebhookReleaseUnpublished =  // WebhookReleaseUnpublished | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.releaseUnpublished(webhookReleaseUnpublished, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#releaseUnpublished")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#releaseUnpublished")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookReleaseUnpublished** | [**WebhookReleaseUnpublished**](WebhookReleaseUnpublished.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryAdvisoryPublished"></a>
# **repositoryAdvisoryPublished**
> repositoryAdvisoryPublished(webhookRepositoryAdvisoryPublished, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a repository security advisory. For more information about repository security advisories, see \&quot;[About GitHub Security Advisories for repositories](https://docs.github.com/code-security/repository-security-advisories/about-github-security-advisories-for-repositories).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Repository security advisories\&quot; permission.

A repository security advisory was published.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryAdvisoryPublished : WebhookRepositoryAdvisoryPublished =  // WebhookRepositoryAdvisoryPublished | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryAdvisoryPublished(webhookRepositoryAdvisoryPublished, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryAdvisoryPublished")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryAdvisoryPublished")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryAdvisoryPublished** | [**WebhookRepositoryAdvisoryPublished**](WebhookRepositoryAdvisoryPublished.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryAdvisoryReported"></a>
# **repositoryAdvisoryReported**
> repositoryAdvisoryReported(webhookRepositoryAdvisoryReported, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a repository security advisory. For more information about repository security advisories, see \&quot;[About GitHub Security Advisories for repositories](https://docs.github.com/code-security/repository-security-advisories/about-github-security-advisories-for-repositories).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Repository security advisories\&quot; permission.

A private vulnerability report was submitted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryAdvisoryReported : WebhookRepositoryAdvisoryReported =  // WebhookRepositoryAdvisoryReported | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryAdvisoryReported(webhookRepositoryAdvisoryReported, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryAdvisoryReported")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryAdvisoryReported")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryAdvisoryReported** | [**WebhookRepositoryAdvisoryReported**](WebhookRepositoryAdvisoryReported.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryArchived"></a>
# **repositoryArchived**
> repositoryArchived(webhookRepositoryArchived, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.

A repository was archived.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryArchived : WebhookRepositoryArchived =  // WebhookRepositoryArchived | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryArchived(webhookRepositoryArchived, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryArchived")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryArchived")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryArchived** | [**WebhookRepositoryArchived**](WebhookRepositoryArchived.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryCreated"></a>
# **repositoryCreated**
> repositoryCreated(webhookRepositoryCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.

A repository was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryCreated : WebhookRepositoryCreated =  // WebhookRepositoryCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryCreated(webhookRepositoryCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryCreated** | [**WebhookRepositoryCreated**](WebhookRepositoryCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryDeleted"></a>
# **repositoryDeleted**
> repositoryDeleted(webhookRepositoryDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.

A repository was deleted. GitHub Apps and repository webhooks will not receive this event.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryDeleted : WebhookRepositoryDeleted =  // WebhookRepositoryDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryDeleted(webhookRepositoryDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryDeleted** | [**WebhookRepositoryDeleted**](WebhookRepositoryDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryDispatchSampleCollected"></a>
# **repositoryDispatchSampleCollected**
> repositoryDispatchSampleCollected(webhookRepositoryDispatchSample, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when a GitHub App sends a &#x60;POST&#x60; request to &#x60;/repos/{owner}/{repo}/dispatches&#x60;. For more information, see [the REST API documentation for creating a repository dispatch event](https://docs.github.com/rest/repos/repos#create-a-repository-dispatch-event).  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.

The &#x60;event_type&#x60; that was specified in the &#x60;POST /repos/{owner}/{repo}/dispatches&#x60; request body.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryDispatchSample : WebhookRepositoryDispatchSample =  // WebhookRepositoryDispatchSample | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryDispatchSampleCollected(webhookRepositoryDispatchSample, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryDispatchSampleCollected")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryDispatchSampleCollected")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryDispatchSample** | [**WebhookRepositoryDispatchSample**](WebhookRepositoryDispatchSample.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryEdited"></a>
# **repositoryEdited**
> repositoryEdited(webhookRepositoryEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.

The topics, default branch, description, or homepage of a repository was changed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryEdited : WebhookRepositoryEdited =  // WebhookRepositoryEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryEdited(webhookRepositoryEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryEdited** | [**WebhookRepositoryEdited**](WebhookRepositoryEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryImport"></a>
# **repositoryImport**
> repositoryImport(webhookRepositoryImport, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when a repository is imported to GitHub. For more information, see \&quot;[Importing a repository with GitHub Importer](https://docs.github.com/get-started/importing-your-projects-to-github/importing-source-code-to-github/importing-a-repository-with-github-importer).\&quot; For more information about the API to manage imports, see [the REST API documentation](https://docs.github.com/rest/migrations/source-imports).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryImport : WebhookRepositoryImport =  // WebhookRepositoryImport | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryImport(webhookRepositoryImport, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryImport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryImport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryImport** | [**WebhookRepositoryImport**](WebhookRepositoryImport.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryPrivatized"></a>
# **repositoryPrivatized**
> repositoryPrivatized(webhookRepositoryPrivatized, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.

The visibility of a repository was changed to &#x60;private&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryPrivatized : WebhookRepositoryPrivatized =  // WebhookRepositoryPrivatized | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryPrivatized(webhookRepositoryPrivatized, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryPrivatized")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryPrivatized")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryPrivatized** | [**WebhookRepositoryPrivatized**](WebhookRepositoryPrivatized.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryPublicized"></a>
# **repositoryPublicized**
> repositoryPublicized(webhookRepositoryPublicized, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.

The visibility of a repository was changed to &#x60;public&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryPublicized : WebhookRepositoryPublicized =  // WebhookRepositoryPublicized | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryPublicized(webhookRepositoryPublicized, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryPublicized")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryPublicized")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryPublicized** | [**WebhookRepositoryPublicized**](WebhookRepositoryPublicized.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryRenamed"></a>
# **repositoryRenamed**
> repositoryRenamed(webhookRepositoryRenamed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.

The name of a repository was changed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryRenamed : WebhookRepositoryRenamed =  // WebhookRepositoryRenamed | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryRenamed(webhookRepositoryRenamed, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryRenamed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryRenamed")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryRenamed** | [**WebhookRepositoryRenamed**](WebhookRepositoryRenamed.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryRulesetCreated"></a>
# **repositoryRulesetCreated**
> repositoryRulesetCreated(webhookRepositoryRulesetCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to repository rulesets. For more information about repository rulesets, see \&quot;[Managing rulesets](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/managing-rulesets).\&quot; For more information on managing rulesets via the APIs, see [Repository ruleset](https://docs.github.com/graphql/reference/objects#repositoryruleset) in the GraphQL documentation or \&quot;[Repository rules](https://docs.github.com/rest/repos/rules)\&quot; and \&quot;[Organization rules](https://docs.github.com/rest/orgs/rules) in the REST API documentation.\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository or organization permission.

A repository ruleset was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryRulesetCreated : WebhookRepositoryRulesetCreated =  // WebhookRepositoryRulesetCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryRulesetCreated(webhookRepositoryRulesetCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryRulesetCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryRulesetCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryRulesetCreated** | [**WebhookRepositoryRulesetCreated**](WebhookRepositoryRulesetCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryRulesetDeleted"></a>
# **repositoryRulesetDeleted**
> repositoryRulesetDeleted(webhookRepositoryRulesetDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to repository rulesets. For more information about repository rulesets, see \&quot;[Managing rulesets](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/managing-rulesets).\&quot; For more information on managing rulesets via the APIs, see [Repository ruleset](https://docs.github.com/graphql/reference/objects#repositoryruleset) in the GraphQL documentation or \&quot;[Repository rules](https://docs.github.com/rest/repos/rules)\&quot; and \&quot;[Organization rules](https://docs.github.com/rest/orgs/rules) in the REST API documentation.\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository or organization permission.

A repository ruleset was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryRulesetDeleted : WebhookRepositoryRulesetDeleted =  // WebhookRepositoryRulesetDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryRulesetDeleted(webhookRepositoryRulesetDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryRulesetDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryRulesetDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryRulesetDeleted** | [**WebhookRepositoryRulesetDeleted**](WebhookRepositoryRulesetDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryRulesetEdited"></a>
# **repositoryRulesetEdited**
> repositoryRulesetEdited(webhookRepositoryRulesetEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to repository rulesets. For more information about repository rulesets, see \&quot;[Managing rulesets](https://docs.github.com/repositories/configuring-branches-and-merges-in-your-repository/managing-rulesets).\&quot; For more information on managing rulesets via the APIs, see [Repository ruleset](https://docs.github.com/graphql/reference/objects#repositoryruleset) in the GraphQL documentation or \&quot;[Repository rules](https://docs.github.com/rest/repos/rules)\&quot; and \&quot;[Organization rules](https://docs.github.com/rest/orgs/rules) in the REST API documentation.\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository or organization permission.

A repository ruleset was edited.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryRulesetEdited : WebhookRepositoryRulesetEdited =  // WebhookRepositoryRulesetEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryRulesetEdited(webhookRepositoryRulesetEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryRulesetEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryRulesetEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryRulesetEdited** | [**WebhookRepositoryRulesetEdited**](WebhookRepositoryRulesetEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryTransferred"></a>
# **repositoryTransferred**
> repositoryTransferred(webhookRepositoryTransferred, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.

Ownership of the repository was transferred to a user or organization account. This event is only sent to the account where the ownership is transferred. To receive the &#x60;repository.transferred&#x60; event, the new owner account must have the GitHub App installed, and the App must be subscribed to \&quot;Repository\&quot; events.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryTransferred : WebhookRepositoryTransferred =  // WebhookRepositoryTransferred | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryTransferred(webhookRepositoryTransferred, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryTransferred")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryTransferred")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryTransferred** | [**WebhookRepositoryTransferred**](WebhookRepositoryTransferred.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryUnarchived"></a>
# **repositoryUnarchived**
> repositoryUnarchived(webhookRepositoryUnarchived, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to repositories. For more information, see \&quot;[About repositories](https://docs.github.com/repositories/creating-and-managing-repositories/about-repositories).\&quot; For information about the APIs to manage repositories, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#repository) or \&quot;[Repositories](https://docs.github.com/rest/repos)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.

A previously archived repository was unarchived.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryUnarchived : WebhookRepositoryUnarchived =  // WebhookRepositoryUnarchived | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryUnarchived(webhookRepositoryUnarchived, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryUnarchived")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryUnarchived")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryUnarchived** | [**WebhookRepositoryUnarchived**](WebhookRepositoryUnarchived.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryVulnerabilityAlertCreate"></a>
# **repositoryVulnerabilityAlertCreate**
> repositoryVulnerabilityAlertCreate(webhookRepositoryVulnerabilityAlertCreate, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a security vulnerability alert in a repository.  **Note**: This event is deprecated. Use the &#x60;dependabot_alert&#x60; event instead.

A repository vulnerability alert was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryVulnerabilityAlertCreate : WebhookRepositoryVulnerabilityAlertCreate =  // WebhookRepositoryVulnerabilityAlertCreate | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryVulnerabilityAlertCreate(webhookRepositoryVulnerabilityAlertCreate, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryVulnerabilityAlertCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryVulnerabilityAlertCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryVulnerabilityAlertCreate** | [**WebhookRepositoryVulnerabilityAlertCreate**](WebhookRepositoryVulnerabilityAlertCreate.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryVulnerabilityAlertDismiss"></a>
# **repositoryVulnerabilityAlertDismiss**
> repositoryVulnerabilityAlertDismiss(webhookRepositoryVulnerabilityAlertDismiss, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a security vulnerability alert in a repository.  **Note**: This event is deprecated. Use the &#x60;dependabot_alert&#x60; event instead.

A repository vulnerability alert was dismissed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryVulnerabilityAlertDismiss : WebhookRepositoryVulnerabilityAlertDismiss =  // WebhookRepositoryVulnerabilityAlertDismiss | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryVulnerabilityAlertDismiss(webhookRepositoryVulnerabilityAlertDismiss, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryVulnerabilityAlertDismiss")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryVulnerabilityAlertDismiss")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryVulnerabilityAlertDismiss** | [**WebhookRepositoryVulnerabilityAlertDismiss**](WebhookRepositoryVulnerabilityAlertDismiss.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryVulnerabilityAlertReopen"></a>
# **repositoryVulnerabilityAlertReopen**
> repositoryVulnerabilityAlertReopen(webhookRepositoryVulnerabilityAlertReopen, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a security vulnerability alert in a repository.  **Note**: This event is deprecated. Use the &#x60;dependabot_alert&#x60; event instead.

A previously dismissed or resolved repository vulnerability alert was reopened.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryVulnerabilityAlertReopen : WebhookRepositoryVulnerabilityAlertReopen =  // WebhookRepositoryVulnerabilityAlertReopen | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryVulnerabilityAlertReopen(webhookRepositoryVulnerabilityAlertReopen, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryVulnerabilityAlertReopen")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryVulnerabilityAlertReopen")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryVulnerabilityAlertReopen** | [**WebhookRepositoryVulnerabilityAlertReopen**](WebhookRepositoryVulnerabilityAlertReopen.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="repositoryVulnerabilityAlertResolve"></a>
# **repositoryVulnerabilityAlertResolve**
> repositoryVulnerabilityAlertResolve(webhookRepositoryVulnerabilityAlertResolve, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a security vulnerability alert in a repository.  **Note**: This event is deprecated. Use the &#x60;dependabot_alert&#x60; event instead.

A repository vulnerability alert was marked as resolved.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookRepositoryVulnerabilityAlertResolve : WebhookRepositoryVulnerabilityAlertResolve =  // WebhookRepositoryVulnerabilityAlertResolve | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.repositoryVulnerabilityAlertResolve(webhookRepositoryVulnerabilityAlertResolve, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#repositoryVulnerabilityAlertResolve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#repositoryVulnerabilityAlertResolve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookRepositoryVulnerabilityAlertResolve** | [**WebhookRepositoryVulnerabilityAlertResolve**](WebhookRepositoryVulnerabilityAlertResolve.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="secretScanningAlertCreated"></a>
# **secretScanningAlertCreated**
> secretScanningAlertCreated(webhookSecretScanningAlertCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a secret scanning alert. For more information about secret scanning, see \&quot;[About secret scanning](https://docs.github.com/code-security/secret-scanning/about-secret-scanning).\&quot; For information about the API to manage secret scanning alerts, see \&quot;[Secret scanning](https://docs.github.com/rest/secret-scanning)\&quot; in the REST API documentation.  For activity relating to secret scanning alert locations, use the &#x60;secret_scanning_alert_location&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Secret scanning alerts\&quot; repository permission.

A secret scanning alert was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookSecretScanningAlertCreated : WebhookSecretScanningAlertCreated =  // WebhookSecretScanningAlertCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.secretScanningAlertCreated(webhookSecretScanningAlertCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#secretScanningAlertCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#secretScanningAlertCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookSecretScanningAlertCreated** | [**WebhookSecretScanningAlertCreated**](WebhookSecretScanningAlertCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="secretScanningAlertLocationCreated"></a>
# **secretScanningAlertLocationCreated**
> secretScanningAlertLocationCreated(webhookSecretScanningAlertLocationCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to the locations of a secret in a secret scanning alert.  For more information about secret scanning, see \&quot;[About secret scanning](https://docs.github.com/code-security/secret-scanning/about-secret-scanning).\&quot; For information about the API to manage secret scanning alerts, see \&quot;[Secret scanning](https://docs.github.com/rest/secret-scanning)\&quot; in the REST API documentation.  For activity relating to secret scanning alerts, use the &#x60;secret_scanning_alert&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Secret scanning alerts\&quot; repository permission.

A new instance of a previously detected secret was detected in a repository, and the location of the secret was added to the existing alert.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookSecretScanningAlertLocationCreated : WebhookSecretScanningAlertLocationCreated =  // WebhookSecretScanningAlertLocationCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.secretScanningAlertLocationCreated(webhookSecretScanningAlertLocationCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#secretScanningAlertLocationCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#secretScanningAlertLocationCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookSecretScanningAlertLocationCreated** | [**WebhookSecretScanningAlertLocationCreated**](WebhookSecretScanningAlertLocationCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: Not defined

<a id="secretScanningAlertReopened"></a>
# **secretScanningAlertReopened**
> secretScanningAlertReopened(webhookSecretScanningAlertReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a secret scanning alert. For more information about secret scanning, see \&quot;[About secret scanning](https://docs.github.com/code-security/secret-scanning/about-secret-scanning).\&quot; For information about the API to manage secret scanning alerts, see \&quot;[Secret scanning](https://docs.github.com/rest/secret-scanning)\&quot; in the REST API documentation.  For activity relating to secret scanning alert locations, use the &#x60;secret_scanning_alert_location&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Secret scanning alerts\&quot; repository permission.

A previously closed secret scanning alert was reopened.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookSecretScanningAlertReopened : WebhookSecretScanningAlertReopened =  // WebhookSecretScanningAlertReopened | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.secretScanningAlertReopened(webhookSecretScanningAlertReopened, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#secretScanningAlertReopened")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#secretScanningAlertReopened")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookSecretScanningAlertReopened** | [**WebhookSecretScanningAlertReopened**](WebhookSecretScanningAlertReopened.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="secretScanningAlertResolved"></a>
# **secretScanningAlertResolved**
> secretScanningAlertResolved(webhookSecretScanningAlertResolved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a secret scanning alert. For more information about secret scanning, see \&quot;[About secret scanning](https://docs.github.com/code-security/secret-scanning/about-secret-scanning).\&quot; For information about the API to manage secret scanning alerts, see \&quot;[Secret scanning](https://docs.github.com/rest/secret-scanning)\&quot; in the REST API documentation.  For activity relating to secret scanning alert locations, use the &#x60;secret_scanning_alert_location&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Secret scanning alerts\&quot; repository permission.

A secret scanning alert was closed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookSecretScanningAlertResolved : WebhookSecretScanningAlertResolved =  // WebhookSecretScanningAlertResolved | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.secretScanningAlertResolved(webhookSecretScanningAlertResolved, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#secretScanningAlertResolved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#secretScanningAlertResolved")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookSecretScanningAlertResolved** | [**WebhookSecretScanningAlertResolved**](WebhookSecretScanningAlertResolved.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="secretScanningAlertRevoked"></a>
# **secretScanningAlertRevoked**
> secretScanningAlertRevoked(webhookSecretScanningAlertRevoked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a secret scanning alert. For more information about secret scanning, see \&quot;[About secret scanning](https://docs.github.com/code-security/secret-scanning/about-secret-scanning).\&quot; For information about the API to manage secret scanning alerts, see \&quot;[Secret scanning](https://docs.github.com/rest/secret-scanning)\&quot; in the REST API documentation.  For activity relating to secret scanning alert locations, use the &#x60;secret_scanning_alert_location&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Secret scanning alerts\&quot; repository permission.

A secret scanning alert was marked as revoked.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookSecretScanningAlertRevoked : WebhookSecretScanningAlertRevoked =  // WebhookSecretScanningAlertRevoked | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.secretScanningAlertRevoked(webhookSecretScanningAlertRevoked, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#secretScanningAlertRevoked")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#secretScanningAlertRevoked")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookSecretScanningAlertRevoked** | [**WebhookSecretScanningAlertRevoked**](WebhookSecretScanningAlertRevoked.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="secretScanningAlertValidated"></a>
# **secretScanningAlertValidated**
> secretScanningAlertValidated(webhookSecretScanningAlertValidated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a secret scanning alert. For more information about secret scanning, see \&quot;[About secret scanning](https://docs.github.com/code-security/secret-scanning/about-secret-scanning).\&quot; For information about the API to manage secret scanning alerts, see \&quot;[Secret scanning](https://docs.github.com/rest/secret-scanning)\&quot; in the REST API documentation.  For activity relating to secret scanning alert locations, use the &#x60;secret_scanning_alert_location&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Secret scanning alerts\&quot; repository permission.

A secret scanning alert was validated.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookSecretScanningAlertValidated : WebhookSecretScanningAlertValidated =  // WebhookSecretScanningAlertValidated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.secretScanningAlertValidated(webhookSecretScanningAlertValidated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#secretScanningAlertValidated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#secretScanningAlertValidated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookSecretScanningAlertValidated** | [**WebhookSecretScanningAlertValidated**](WebhookSecretScanningAlertValidated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="securityAdvisoryPublished"></a>
# **securityAdvisoryPublished**
> securityAdvisoryPublished(webhookSecurityAdvisoryPublished, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a global security advisory that was reviewed by GitHub. A GitHub-reviewed global security advisory provides information about security vulnerabilities or malware that have been mapped to packages in ecosystems we support. For more information about global security advisories, see \&quot;[About global security advisories](https://docs.github.com/code-security/security-advisories/working-with-global-security-advisories-from-the-github-advisory-database/about-global-security-advisories).\&quot; For information about the API to manage security advisories, see [the REST API documentation](https://docs.github.com/rest/security-advisories/global-advisories) or [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#securityadvisory).  GitHub Dependabot alerts are also powered by the security advisory dataset. For more information, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot;

A security advisory was published to the GitHub community.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookSecurityAdvisoryPublished : WebhookSecurityAdvisoryPublished =  // WebhookSecurityAdvisoryPublished | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.securityAdvisoryPublished(webhookSecurityAdvisoryPublished, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#securityAdvisoryPublished")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#securityAdvisoryPublished")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookSecurityAdvisoryPublished** | [**WebhookSecurityAdvisoryPublished**](WebhookSecurityAdvisoryPublished.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="securityAdvisoryUpdated"></a>
# **securityAdvisoryUpdated**
> securityAdvisoryUpdated(webhookSecurityAdvisoryUpdated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a global security advisory that was reviewed by GitHub. A GitHub-reviewed global security advisory provides information about security vulnerabilities or malware that have been mapped to packages in ecosystems we support. For more information about global security advisories, see \&quot;[About global security advisories](https://docs.github.com/code-security/security-advisories/working-with-global-security-advisories-from-the-github-advisory-database/about-global-security-advisories).\&quot; For information about the API to manage security advisories, see [the REST API documentation](https://docs.github.com/rest/security-advisories/global-advisories) or [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#securityadvisory).  GitHub Dependabot alerts are also powered by the security advisory dataset. For more information, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot;

The metadata or description of a security advisory was changed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookSecurityAdvisoryUpdated : WebhookSecurityAdvisoryUpdated =  // WebhookSecurityAdvisoryUpdated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.securityAdvisoryUpdated(webhookSecurityAdvisoryUpdated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#securityAdvisoryUpdated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#securityAdvisoryUpdated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookSecurityAdvisoryUpdated** | [**WebhookSecurityAdvisoryUpdated**](WebhookSecurityAdvisoryUpdated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="securityAdvisoryWithdrawn"></a>
# **securityAdvisoryWithdrawn**
> securityAdvisoryWithdrawn(webhookSecurityAdvisoryWithdrawn, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a global security advisory that was reviewed by GitHub. A GitHub-reviewed global security advisory provides information about security vulnerabilities or malware that have been mapped to packages in ecosystems we support. For more information about global security advisories, see \&quot;[About global security advisories](https://docs.github.com/code-security/security-advisories/working-with-global-security-advisories-from-the-github-advisory-database/about-global-security-advisories).\&quot; For information about the API to manage security advisories, see [the REST API documentation](https://docs.github.com/rest/security-advisories/global-advisories) or [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#securityadvisory).  GitHub Dependabot alerts are also powered by the security advisory dataset. For more information, see \&quot;[About Dependabot alerts](https://docs.github.com/code-security/dependabot/dependabot-alerts/about-dependabot-alerts).\&quot;

A previously published security advisory was withdrawn.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookSecurityAdvisoryWithdrawn : WebhookSecurityAdvisoryWithdrawn =  // WebhookSecurityAdvisoryWithdrawn | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.securityAdvisoryWithdrawn(webhookSecurityAdvisoryWithdrawn, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#securityAdvisoryWithdrawn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#securityAdvisoryWithdrawn")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookSecurityAdvisoryWithdrawn** | [**WebhookSecurityAdvisoryWithdrawn**](WebhookSecurityAdvisoryWithdrawn.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="securityAndAnalysis"></a>
# **securityAndAnalysis**
> securityAndAnalysis(webhookSecurityAndAnalysis, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when code security and analysis features are enabled or disabled for a repository. For more information, see \&quot;[GitHub security features](https://docs.github.com/code-security/getting-started/github-security-features).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Administration\&quot; repository permission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookSecurityAndAnalysis : WebhookSecurityAndAnalysis =  // WebhookSecurityAndAnalysis | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.securityAndAnalysis(webhookSecurityAndAnalysis, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#securityAndAnalysis")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#securityAndAnalysis")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookSecurityAndAnalysis** | [**WebhookSecurityAndAnalysis**](WebhookSecurityAndAnalysis.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="sponsorshipCancelled"></a>
# **sponsorshipCancelled**
> sponsorshipCancelled(webhookSponsorshipCancelled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a sponsorship listing. For more information, see \&quot;[About GitHub Sponsors](https://docs.github.com/sponsors/getting-started-with-github-sponsors/about-github-sponsors).\&quot; For information about the API to manage sponsors, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#sponsorship).  You can only create a sponsorship webhook on GitHub.com. For more information, see \&quot;[Configuring webhooks for events in your sponsored account](https://docs.github.com/sponsors/integrating-with-github-sponsors/configuring-webhooks-for-events-in-your-sponsored-account).\&quot;

A sponsorship was cancelled and the last billing cycle has ended.  This event is only sent when a recurring (monthly) sponsorship is cancelled; it is not sent for one-time sponsorships.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookSponsorshipCancelled : WebhookSponsorshipCancelled =  // WebhookSponsorshipCancelled | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.sponsorshipCancelled(webhookSponsorshipCancelled, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#sponsorshipCancelled")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#sponsorshipCancelled")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookSponsorshipCancelled** | [**WebhookSponsorshipCancelled**](WebhookSponsorshipCancelled.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="sponsorshipCreated"></a>
# **sponsorshipCreated**
> sponsorshipCreated(webhookSponsorshipCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a sponsorship listing. For more information, see \&quot;[About GitHub Sponsors](https://docs.github.com/sponsors/getting-started-with-github-sponsors/about-github-sponsors).\&quot; For information about the API to manage sponsors, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#sponsorship).  You can only create a sponsorship webhook on GitHub.com. For more information, see \&quot;[Configuring webhooks for events in your sponsored account](https://docs.github.com/sponsors/integrating-with-github-sponsors/configuring-webhooks-for-events-in-your-sponsored-account).\&quot;

A sponsor created a sponsorship for a sponsored account. This event occurs once the payment is successfully processed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookSponsorshipCreated : WebhookSponsorshipCreated =  // WebhookSponsorshipCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.sponsorshipCreated(webhookSponsorshipCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#sponsorshipCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#sponsorshipCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookSponsorshipCreated** | [**WebhookSponsorshipCreated**](WebhookSponsorshipCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="sponsorshipEdited"></a>
# **sponsorshipEdited**
> sponsorshipEdited(webhookSponsorshipEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a sponsorship listing. For more information, see \&quot;[About GitHub Sponsors](https://docs.github.com/sponsors/getting-started-with-github-sponsors/about-github-sponsors).\&quot; For information about the API to manage sponsors, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#sponsorship).  You can only create a sponsorship webhook on GitHub.com. For more information, see \&quot;[Configuring webhooks for events in your sponsored account](https://docs.github.com/sponsors/integrating-with-github-sponsors/configuring-webhooks-for-events-in-your-sponsored-account).\&quot;

A monthly sponsor changed who can see their sponsorship. If you recognize your sponsors publicly, you may want to update your sponsor recognition to reflect the change when this event occurs.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookSponsorshipEdited : WebhookSponsorshipEdited =  // WebhookSponsorshipEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.sponsorshipEdited(webhookSponsorshipEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#sponsorshipEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#sponsorshipEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookSponsorshipEdited** | [**WebhookSponsorshipEdited**](WebhookSponsorshipEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="sponsorshipPendingCancellation"></a>
# **sponsorshipPendingCancellation**
> sponsorshipPendingCancellation(webhookSponsorshipPendingCancellation, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a sponsorship listing. For more information, see \&quot;[About GitHub Sponsors](https://docs.github.com/sponsors/getting-started-with-github-sponsors/about-github-sponsors).\&quot; For information about the API to manage sponsors, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#sponsorship).  You can only create a sponsorship webhook on GitHub.com. For more information, see \&quot;[Configuring webhooks for events in your sponsored account](https://docs.github.com/sponsors/integrating-with-github-sponsors/configuring-webhooks-for-events-in-your-sponsored-account).\&quot;

A sponsor scheduled a cancellation for their sponsorship. The cancellation will become effective on their next billing date.  This event is only sent when a recurring (monthly) sponsorship is cancelled; it is not sent for one-time sponsorships.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookSponsorshipPendingCancellation : WebhookSponsorshipPendingCancellation =  // WebhookSponsorshipPendingCancellation | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.sponsorshipPendingCancellation(webhookSponsorshipPendingCancellation, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#sponsorshipPendingCancellation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#sponsorshipPendingCancellation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookSponsorshipPendingCancellation** | [**WebhookSponsorshipPendingCancellation**](WebhookSponsorshipPendingCancellation.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="sponsorshipPendingTierChange"></a>
# **sponsorshipPendingTierChange**
> sponsorshipPendingTierChange(webhookSponsorshipPendingTierChange, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a sponsorship listing. For more information, see \&quot;[About GitHub Sponsors](https://docs.github.com/sponsors/getting-started-with-github-sponsors/about-github-sponsors).\&quot; For information about the API to manage sponsors, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#sponsorship).  You can only create a sponsorship webhook on GitHub.com. For more information, see \&quot;[Configuring webhooks for events in your sponsored account](https://docs.github.com/sponsors/integrating-with-github-sponsors/configuring-webhooks-for-events-in-your-sponsored-account).\&quot;

A sponsor scheduled a downgrade to a lower sponsorship tier. The new tier will become effective on their next billing date.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookSponsorshipPendingTierChange : WebhookSponsorshipPendingTierChange =  // WebhookSponsorshipPendingTierChange | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.sponsorshipPendingTierChange(webhookSponsorshipPendingTierChange, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#sponsorshipPendingTierChange")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#sponsorshipPendingTierChange")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookSponsorshipPendingTierChange** | [**WebhookSponsorshipPendingTierChange**](WebhookSponsorshipPendingTierChange.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="sponsorshipTierChanged"></a>
# **sponsorshipTierChanged**
> sponsorshipTierChanged(webhookSponsorshipTierChanged, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a sponsorship listing. For more information, see \&quot;[About GitHub Sponsors](https://docs.github.com/sponsors/getting-started-with-github-sponsors/about-github-sponsors).\&quot; For information about the API to manage sponsors, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#sponsorship).  You can only create a sponsorship webhook on GitHub.com. For more information, see \&quot;[Configuring webhooks for events in your sponsored account](https://docs.github.com/sponsors/integrating-with-github-sponsors/configuring-webhooks-for-events-in-your-sponsored-account).\&quot;

A sponsor changed the tier of their sponsorship and the change has taken effect. If a sponsor upgraded their tier, the change took effect immediately. If a sponsor downgraded their tier, the change took effect at the beginning of the sponsor&#39;s next billing cycle.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookSponsorshipTierChanged : WebhookSponsorshipTierChanged =  // WebhookSponsorshipTierChanged | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.sponsorshipTierChanged(webhookSponsorshipTierChanged, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#sponsorshipTierChanged")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#sponsorshipTierChanged")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookSponsorshipTierChanged** | [**WebhookSponsorshipTierChanged**](WebhookSponsorshipTierChanged.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="starCreated"></a>
# **starCreated**
> starCreated(webhookStarCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to repository stars. For more information about stars, see \&quot;[Saving repositories with stars](https://docs.github.com/get-started/exploring-projects-on-github/saving-repositories-with-stars).\&quot; For information about the APIs to manage stars, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#starredrepositoryconnection) or \&quot;[Starring](https://docs.github.com/rest/activity/starring)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.

Someone starred a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookStarCreated : WebhookStarCreated =  // WebhookStarCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.starCreated(webhookStarCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#starCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#starCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookStarCreated** | [**WebhookStarCreated**](WebhookStarCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="starDeleted"></a>
# **starDeleted**
> starDeleted(webhookStarDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to repository stars. For more information about stars, see \&quot;[Saving repositories with stars](https://docs.github.com/get-started/exploring-projects-on-github/saving-repositories-with-stars).\&quot; For information about the APIs to manage stars, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#starredrepositoryconnection) or \&quot;[Starring](https://docs.github.com/rest/activity/starring)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.

Someone unstarred the repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookStarDeleted : WebhookStarDeleted =  // WebhookStarDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.starDeleted(webhookStarDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#starDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#starDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookStarDeleted** | [**WebhookStarDeleted**](WebhookStarDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="status"></a>
# **status**
> status(webhookStatus, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when the status of a Git commit changes. For example, commits can be marked as &#x60;error&#x60;, &#x60;failure&#x60;, &#x60;pending&#x60;, or &#x60;success&#x60;. For more information, see \&quot;[About status checks](https://docs.github.com/pull-requests/collaborating-with-pull-requests/collaborating-on-repositories-with-code-quality-features/about-status-checks).\&quot; For information about the APIs to manage commit statuses, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#status) or \&quot;[Commit statuses](https://docs.github.com/rest/commits/statuses)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Commit statuses\&quot; repository permission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookStatus : WebhookStatus =  // WebhookStatus | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.status(webhookStatus, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#status")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#status")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookStatus** | [**WebhookStatus**](WebhookStatus.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="teamAdd"></a>
# **teamAdd**
> teamAdd(webhookTeamAdd, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when a team is added to a repository. For more information, see \&quot;[Managing teams and people with access to your repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/managing-repository-settings/managing-teams-and-people-with-access-to-your-repository).\&quot;  For activity relating to teams, see the &#x60;teams&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookTeamAdd : WebhookTeamAdd =  // WebhookTeamAdd | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.teamAdd(webhookTeamAdd, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#teamAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#teamAdd")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookTeamAdd** | [**WebhookTeamAdd**](WebhookTeamAdd.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="teamAddedToRepository"></a>
# **teamAddedToRepository**
> teamAddedToRepository(webhookTeamAddedToRepository, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to teams in an organization. For more information, see \&quot;[About teams](https://docs.github.com/organizations/organizing-members-into-teams/about-teams).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.

A team was granted access to a repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookTeamAddedToRepository : WebhookTeamAddedToRepository =  // WebhookTeamAddedToRepository | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.teamAddedToRepository(webhookTeamAddedToRepository, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#teamAddedToRepository")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#teamAddedToRepository")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookTeamAddedToRepository** | [**WebhookTeamAddedToRepository**](WebhookTeamAddedToRepository.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="teamCreated"></a>
# **teamCreated**
> teamCreated(webhookTeamCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to teams in an organization. For more information, see \&quot;[About teams](https://docs.github.com/organizations/organizing-members-into-teams/about-teams).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.

A team was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookTeamCreated : WebhookTeamCreated =  // WebhookTeamCreated | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.teamCreated(webhookTeamCreated, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#teamCreated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#teamCreated")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookTeamCreated** | [**WebhookTeamCreated**](WebhookTeamCreated.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="teamDeleted"></a>
# **teamDeleted**
> teamDeleted(webhookTeamDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to teams in an organization. For more information, see \&quot;[About teams](https://docs.github.com/organizations/organizing-members-into-teams/about-teams).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.

A team was deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookTeamDeleted : WebhookTeamDeleted =  // WebhookTeamDeleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.teamDeleted(webhookTeamDeleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#teamDeleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#teamDeleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookTeamDeleted** | [**WebhookTeamDeleted**](WebhookTeamDeleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="teamEdited"></a>
# **teamEdited**
> teamEdited(webhookTeamEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to teams in an organization. For more information, see \&quot;[About teams](https://docs.github.com/organizations/organizing-members-into-teams/about-teams).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.

The name, description, or visibility of a team was changed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookTeamEdited : WebhookTeamEdited =  // WebhookTeamEdited | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.teamEdited(webhookTeamEdited, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#teamEdited")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#teamEdited")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookTeamEdited** | [**WebhookTeamEdited**](WebhookTeamEdited.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="teamRemovedFromRepository"></a>
# **teamRemovedFromRepository**
> teamRemovedFromRepository(webhookTeamRemovedFromRepository, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to teams in an organization. For more information, see \&quot;[About teams](https://docs.github.com/organizations/organizing-members-into-teams/about-teams).\&quot;  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Members\&quot; organization permission.

A team&#39;s access to a repository was removed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookTeamRemovedFromRepository : WebhookTeamRemovedFromRepository =  // WebhookTeamRemovedFromRepository | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.teamRemovedFromRepository(webhookTeamRemovedFromRepository, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#teamRemovedFromRepository")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#teamRemovedFromRepository")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookTeamRemovedFromRepository** | [**WebhookTeamRemovedFromRepository**](WebhookTeamRemovedFromRepository.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="watchStarted"></a>
# **watchStarted**
> watchStarted(webhookWatchStarted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to watching, or subscribing to, a repository. For more information about watching, see \&quot;[Managing your subscriptions](https://docs.github.com/account-and-profile/managing-subscriptions-and-notifications-on-github/managing-subscriptions-for-activity-on-github/managing-your-subscriptions).\&quot; For information about the APIs to manage watching, see \&quot;[Watching](https://docs.github.com/rest/activity/watching)\&quot; in the REST API documentation.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Metadata\&quot; repository permission.

Someone started watching the repository.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookWatchStarted : WebhookWatchStarted =  // WebhookWatchStarted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.watchStarted(webhookWatchStarted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#watchStarted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#watchStarted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookWatchStarted** | [**WebhookWatchStarted**](WebhookWatchStarted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="workflowDispatch"></a>
# **workflowDispatch**
> workflowDispatch(webhookWorkflowDispatch, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when a GitHub Actions workflow is manually triggered. For more information, see \&quot;[Manually running a workflow](https://docs.github.com/actions/managing-workflow-runs/manually-running-a-workflow).\&quot;  For activity relating to workflow runs, use the &#x60;workflow_run&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Contents\&quot; repository permission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookWorkflowDispatch : WebhookWorkflowDispatch =  // WebhookWorkflowDispatch | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.workflowDispatch(webhookWorkflowDispatch, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#workflowDispatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#workflowDispatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookWorkflowDispatch** | [**WebhookWorkflowDispatch**](WebhookWorkflowDispatch.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="workflowJobCompleted"></a>
# **workflowJobCompleted**
> workflowJobCompleted(webhookWorkflowJobCompleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a job in a GitHub Actions workflow. For more information, see \&quot;[Using jobs in a workflow](https://docs.github.com/actions/using-jobs/using-jobs-in-a-workflow).\&quot; For information about the API to manage workflow jobs, see \&quot;[Workflow jobs](https://docs.github.com/rest/actions/workflow-jobs)\&quot; in the REST API documentation.  For activity relating to a workflow run instead of a job in a workflow run, use the &#x60;workflow_run&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Actions\&quot; repository permission.

A job in a workflow run finished. This event occurs when a job in a workflow is completed, regardless of whether the job was successful or unsuccessful.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookWorkflowJobCompleted : WebhookWorkflowJobCompleted =  // WebhookWorkflowJobCompleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.workflowJobCompleted(webhookWorkflowJobCompleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#workflowJobCompleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#workflowJobCompleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookWorkflowJobCompleted** | [**WebhookWorkflowJobCompleted**](WebhookWorkflowJobCompleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="workflowJobInProgress"></a>
# **workflowJobInProgress**
> workflowJobInProgress(webhookWorkflowJobInProgress, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a job in a GitHub Actions workflow. For more information, see \&quot;[Using jobs in a workflow](https://docs.github.com/actions/using-jobs/using-jobs-in-a-workflow).\&quot; For information about the API to manage workflow jobs, see \&quot;[Workflow jobs](https://docs.github.com/rest/actions/workflow-jobs)\&quot; in the REST API documentation.  For activity relating to a workflow run instead of a job in a workflow run, use the &#x60;workflow_run&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Actions\&quot; repository permission.

A job in a workflow run started processing on a runner.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookWorkflowJobInProgress : WebhookWorkflowJobInProgress =  // WebhookWorkflowJobInProgress | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.workflowJobInProgress(webhookWorkflowJobInProgress, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#workflowJobInProgress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#workflowJobInProgress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookWorkflowJobInProgress** | [**WebhookWorkflowJobInProgress**](WebhookWorkflowJobInProgress.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="workflowJobQueued"></a>
# **workflowJobQueued**
> workflowJobQueued(webhookWorkflowJobQueued, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a job in a GitHub Actions workflow. For more information, see \&quot;[Using jobs in a workflow](https://docs.github.com/actions/using-jobs/using-jobs-in-a-workflow).\&quot; For information about the API to manage workflow jobs, see \&quot;[Workflow jobs](https://docs.github.com/rest/actions/workflow-jobs)\&quot; in the REST API documentation.  For activity relating to a workflow run instead of a job in a workflow run, use the &#x60;workflow_run&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Actions\&quot; repository permission.

A job in a workflow run was created.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookWorkflowJobQueued : WebhookWorkflowJobQueued =  // WebhookWorkflowJobQueued | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.workflowJobQueued(webhookWorkflowJobQueued, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#workflowJobQueued")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#workflowJobQueued")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookWorkflowJobQueued** | [**WebhookWorkflowJobQueued**](WebhookWorkflowJobQueued.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="workflowJobWaiting"></a>
# **workflowJobWaiting**
> workflowJobWaiting(webhookWorkflowJobWaiting, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a job in a GitHub Actions workflow. For more information, see \&quot;[Using jobs in a workflow](https://docs.github.com/actions/using-jobs/using-jobs-in-a-workflow).\&quot; For information about the API to manage workflow jobs, see \&quot;[Workflow jobs](https://docs.github.com/rest/actions/workflow-jobs)\&quot; in the REST API documentation.  For activity relating to a workflow run instead of a job in a workflow run, use the &#x60;workflow_run&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Actions\&quot; repository permission.

A job in a workflow run was created and is waiting for approvals.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookWorkflowJobWaiting : WebhookWorkflowJobWaiting =  // WebhookWorkflowJobWaiting | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.workflowJobWaiting(webhookWorkflowJobWaiting, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#workflowJobWaiting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#workflowJobWaiting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookWorkflowJobWaiting** | [**WebhookWorkflowJobWaiting**](WebhookWorkflowJobWaiting.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="workflowRunCompleted"></a>
# **workflowRunCompleted**
> workflowRunCompleted(webhookWorkflowRunCompleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a run of a GitHub Actions workflow. For more information, see \&quot;[About workflows](https://docs.github.com/actions/using-workflows/about-workflows).\&quot; For information about the APIs to manage workflow runs, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#workflowrun) or \&quot;[Workflow runs](https://docs.github.com/rest/actions/workflow-runs)\&quot; in the REST API documentation.  For activity relating to a job in a workflow run, use the &#x60;workflow_job&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Actions\&quot; repository permission.

A workflow run finished. This event occurs when a workflow run is completed, regardless of whether the workflow was successful or unsuccessful.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookWorkflowRunCompleted : WebhookWorkflowRunCompleted =  // WebhookWorkflowRunCompleted | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.workflowRunCompleted(webhookWorkflowRunCompleted, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#workflowRunCompleted")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#workflowRunCompleted")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookWorkflowRunCompleted** | [**WebhookWorkflowRunCompleted**](WebhookWorkflowRunCompleted.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="workflowRunInProgress"></a>
# **workflowRunInProgress**
> workflowRunInProgress(webhookWorkflowRunInProgress, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a run of a GitHub Actions workflow. For more information, see \&quot;[About workflows](https://docs.github.com/actions/using-workflows/about-workflows).\&quot; For information about the APIs to manage workflow runs, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#workflowrun) or \&quot;[Workflow runs](https://docs.github.com/rest/actions/workflow-runs)\&quot; in the REST API documentation.  For activity relating to a job in a workflow run, use the &#x60;workflow_job&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Actions\&quot; repository permission.

A workflow run started processing on a runner.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookWorkflowRunInProgress : WebhookWorkflowRunInProgress =  // WebhookWorkflowRunInProgress | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.workflowRunInProgress(webhookWorkflowRunInProgress, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#workflowRunInProgress")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#workflowRunInProgress")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookWorkflowRunInProgress** | [**WebhookWorkflowRunInProgress**](WebhookWorkflowRunInProgress.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="workflowRunRequested"></a>
# **workflowRunRequested**
> workflowRunRequested(webhookWorkflowRunRequested, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)

This event occurs when there is activity relating to a run of a GitHub Actions workflow. For more information, see \&quot;[About workflows](https://docs.github.com/actions/using-workflows/about-workflows).\&quot; For information about the APIs to manage workflow runs, see [the GraphQL documentation](https://docs.github.com/graphql/reference/objects#workflowrun) or \&quot;[Workflow runs](https://docs.github.com/rest/actions/workflow-runs)\&quot; in the REST API documentation.  For activity relating to a job in a workflow run, use the &#x60;workflow_job&#x60; event.  To subscribe to this event, a GitHub App must have at least read-level access for the \&quot;Actions\&quot; repository permission.

A workflow run was triggered.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookWorkflowRunRequested : WebhookWorkflowRunRequested =  // WebhookWorkflowRunRequested | 
val userAgent : kotlin.Any = GitHub-Hookshot/123abc // kotlin.Any | 
val xGithubHookId : kotlin.Any = 12312312 // kotlin.Any | 
val xGithubEvent : kotlin.Any = issues // kotlin.Any | 
val xGithubHookInstallationTargetId : kotlin.Any = 123123 // kotlin.Any | 
val xGithubHookInstallationTargetType : kotlin.Any = repository // kotlin.Any | 
val xGitHubDelivery : kotlin.Any = 0b989ba4-242f-11e5-81e1-c7b6966d2516 // kotlin.Any | 
val xHubSignature256 : kotlin.Any = sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e // kotlin.Any | 
try {
    apiInstance.workflowRunRequested(webhookWorkflowRunRequested, userAgent, xGithubHookId, xGithubEvent, xGithubHookInstallationTargetId, xGithubHookInstallationTargetType, xGitHubDelivery, xHubSignature256)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#workflowRunRequested")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#workflowRunRequested")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookWorkflowRunRequested** | [**WebhookWorkflowRunRequested**](WebhookWorkflowRunRequested.md)|  |
 **userAgent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubEvent** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetId** | [**kotlin.Any**](.md)|  | [optional]
 **xGithubHookInstallationTargetType** | [**kotlin.Any**](.md)|  | [optional]
 **xGitHubDelivery** | [**kotlin.Any**](.md)|  | [optional]
 **xHubSignature256** | [**kotlin.Any**](.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

