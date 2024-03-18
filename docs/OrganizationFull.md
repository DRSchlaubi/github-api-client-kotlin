
# OrganizationFull

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**login** | **kotlin.String** |  | 
**id** | **kotlin.Int** |  | 
**nodeId** | **kotlin.String** |  | 
**url** | [**java.net.URI**](java.net.URI.md) |  | 
**reposUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**eventsUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**hooksUrl** | **kotlin.String** |  | 
**issuesUrl** | **kotlin.String** |  | 
**membersUrl** | **kotlin.String** |  | 
**publicMembersUrl** | **kotlin.String** |  | 
**avatarUrl** | **kotlin.String** |  | 
**description** | **kotlin.String** |  | 
**hasOrganizationProjects** | **kotlin.Boolean** |  | 
**hasRepositoryProjects** | **kotlin.Boolean** |  | 
**publicRepos** | **kotlin.Int** |  | 
**publicGists** | **kotlin.Int** |  | 
**followers** | **kotlin.Int** |  | 
**following** | **kotlin.Int** |  | 
**htmlUrl** | [**java.net.URI**](java.net.URI.md) |  | 
**type** | **kotlin.String** |  | 
**createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**archivedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  | 
**name** | **kotlin.String** |  |  [optional]
**company** | **kotlin.String** |  |  [optional]
**blog** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**location** | **kotlin.String** |  |  [optional]
**email** | **kotlin.String** |  |  [optional]
**twitterUsername** | **kotlin.String** |  |  [optional]
**isVerified** | **kotlin.Boolean** |  |  [optional]
**totalPrivateRepos** | **kotlin.Int** |  |  [optional]
**ownedPrivateRepos** | **kotlin.Int** |  |  [optional]
**privateGists** | **kotlin.Int** |  |  [optional]
**diskUsage** | **kotlin.Int** |  |  [optional]
**collaborators** | **kotlin.Int** |  |  [optional]
**billingEmail** | **kotlin.String** |  |  [optional]
**plan** | [**OrganizationFullPlan**](OrganizationFullPlan.md) |  |  [optional]
**defaultRepositoryPermission** | **kotlin.String** |  |  [optional]
**membersCanCreateRepositories** | **kotlin.Boolean** |  |  [optional]
**twoFactorRequirementEnabled** | **kotlin.Boolean** |  |  [optional]
**membersAllowedRepositoryCreationType** | **kotlin.String** |  |  [optional]
**membersCanCreatePublicRepositories** | **kotlin.Boolean** |  |  [optional]
**membersCanCreatePrivateRepositories** | **kotlin.Boolean** |  |  [optional]
**membersCanCreateInternalRepositories** | **kotlin.Boolean** |  |  [optional]
**membersCanCreatePages** | **kotlin.Boolean** |  |  [optional]
**membersCanCreatePublicPages** | **kotlin.Boolean** |  |  [optional]
**membersCanCreatePrivatePages** | **kotlin.Boolean** |  |  [optional]
**membersCanForkPrivateRepositories** | **kotlin.Boolean** |  |  [optional]
**webCommitSignoffRequired** | **kotlin.Boolean** |  |  [optional]
**advancedSecurityEnabledForNewRepositories** | **kotlin.Boolean** | Whether GitHub Advanced Security is enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role. |  [optional]
**dependabotAlertsEnabledForNewRepositories** | **kotlin.Boolean** | Whether GitHub Advanced Security is automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role. |  [optional]
**dependabotSecurityUpdatesEnabledForNewRepositories** | **kotlin.Boolean** | Whether dependabot security updates are automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role. |  [optional]
**dependencyGraphEnabledForNewRepositories** | **kotlin.Boolean** | Whether dependency graph is automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role. |  [optional]
**secretScanningEnabledForNewRepositories** | **kotlin.Boolean** | Whether secret scanning is automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role. |  [optional]
**secretScanningPushProtectionEnabledForNewRepositories** | **kotlin.Boolean** | Whether secret scanning push protection is automatically enabled for new repositories and repositories transferred to this organization.  This field is only visible to organization owners or members of a team with the security manager role. |  [optional]
**secretScanningPushProtectionCustomLinkEnabled** | **kotlin.Boolean** | Whether a custom link is shown to contributors who are blocked from pushing a secret by push protection. |  [optional]
**secretScanningPushProtectionCustomLink** | **kotlin.String** | An optional URL string to display to contributors who are blocked from pushing a secret. |  [optional]



