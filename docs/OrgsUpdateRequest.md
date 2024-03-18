
# OrgsUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billingEmail** | **kotlin.String** | Billing email address. This address is not publicized. |  [optional]
**company** | **kotlin.String** | The company name. |  [optional]
**email** | **kotlin.String** | The publicly visible email address. |  [optional]
**twitterUsername** | **kotlin.String** | The Twitter username of the company. |  [optional]
**location** | **kotlin.String** | The location. |  [optional]
**name** | **kotlin.String** | The shorthand name of the company. |  [optional]
**description** | **kotlin.String** | The description of the company. |  [optional]
**hasOrganizationProjects** | **kotlin.Boolean** | Whether an organization can use organization projects. |  [optional]
**hasRepositoryProjects** | **kotlin.Boolean** | Whether repositories that belong to the organization can use repository projects. |  [optional]
**defaultRepositoryPermission** | [**inline**](#DefaultRepositoryPermission) | Default permission level members have for organization repositories. |  [optional]
**membersCanCreateRepositories** | **kotlin.Boolean** | Whether of non-admin organization members can create repositories. **Note:** A parameter can override this parameter. See &#x60;members_allowed_repository_creation_type&#x60; in this table for details. |  [optional]
**membersCanCreateInternalRepositories** | **kotlin.Boolean** | Whether organization members can create internal repositories, which are visible to all enterprise members. You can only allow members to create internal repositories if your organization is associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see \&quot;[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\&quot; in the GitHub Help documentation. |  [optional]
**membersCanCreatePrivateRepositories** | **kotlin.Boolean** | Whether organization members can create private repositories, which are visible to organization members with permission. For more information, see \&quot;[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\&quot; in the GitHub Help documentation. |  [optional]
**membersCanCreatePublicRepositories** | **kotlin.Boolean** | Whether organization members can create public repositories, which are visible to anyone. For more information, see \&quot;[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)\&quot; in the GitHub Help documentation. |  [optional]
**membersAllowedRepositoryCreationType** | [**inline**](#MembersAllowedRepositoryCreationType) | Specifies which types of repositories non-admin organization members can create. &#x60;private&#x60; is only available to repositories that are part of an organization on GitHub Enterprise Cloud.  **Note:** This parameter is deprecated and will be removed in the future. Its return value ignores internal repositories. Using this parameter overrides values set in &#x60;members_can_create_repositories&#x60;. See the parameter deprecation notice in the operation description for details. |  [optional]
**membersCanCreatePages** | **kotlin.Boolean** | Whether organization members can create GitHub Pages sites. Existing published sites will not be impacted. |  [optional]
**membersCanCreatePublicPages** | **kotlin.Boolean** | Whether organization members can create public GitHub Pages sites. Existing published sites will not be impacted. |  [optional]
**membersCanCreatePrivatePages** | **kotlin.Boolean** | Whether organization members can create private GitHub Pages sites. Existing published sites will not be impacted. |  [optional]
**membersCanForkPrivateRepositories** | **kotlin.Boolean** | Whether organization members can fork private organization repositories. |  [optional]
**webCommitSignoffRequired** | **kotlin.Boolean** | Whether contributors to organization repositories are required to sign off on commits they make through GitHub&#39;s web interface. |  [optional]
**blog** | **kotlin.String** |  |  [optional]
**advancedSecurityEnabledForNewRepositories** | **kotlin.Boolean** | Whether GitHub Advanced Security is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  You can check which security and analysis features are currently enabled by using a &#x60;GET /orgs/{org}&#x60; request. |  [optional]
**dependabotAlertsEnabledForNewRepositories** | **kotlin.Boolean** | Whether Dependabot alerts is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  You can check which security and analysis features are currently enabled by using a &#x60;GET /orgs/{org}&#x60; request. |  [optional]
**dependabotSecurityUpdatesEnabledForNewRepositories** | **kotlin.Boolean** | Whether Dependabot security updates is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  You can check which security and analysis features are currently enabled by using a &#x60;GET /orgs/{org}&#x60; request. |  [optional]
**dependencyGraphEnabledForNewRepositories** | **kotlin.Boolean** | Whether dependency graph is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  You can check which security and analysis features are currently enabled by using a &#x60;GET /orgs/{org}&#x60; request. |  [optional]
**secretScanningEnabledForNewRepositories** | **kotlin.Boolean** | Whether secret scanning is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  You can check which security and analysis features are currently enabled by using a &#x60;GET /orgs/{org}&#x60; request. |  [optional]
**secretScanningPushProtectionEnabledForNewRepositories** | **kotlin.Boolean** | Whether secret scanning push protection is automatically enabled for new repositories.  To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see \&quot;[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).\&quot;  You can check which security and analysis features are currently enabled by using a &#x60;GET /orgs/{org}&#x60; request. |  [optional]
**secretScanningPushProtectionCustomLinkEnabled** | **kotlin.Boolean** | Whether a custom link is shown to contributors who are blocked from pushing a secret by push protection. |  [optional]
**secretScanningPushProtectionCustomLink** | **kotlin.String** | If &#x60;secret_scanning_push_protection_custom_link_enabled&#x60; is true, the URL that will be displayed to contributors who are blocked from pushing a secret. |  [optional]


<a id="DefaultRepositoryPermission"></a>
## Enum: default_repository_permission
Name | Value
---- | -----
defaultRepositoryPermission | read, write, admin, none


<a id="MembersAllowedRepositoryCreationType"></a>
## Enum: members_allowed_repository_creation_type
Name | Value
---- | -----
membersAllowedRepositoryCreationType | all, private, none



