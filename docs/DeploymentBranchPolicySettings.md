
# DeploymentBranchPolicySettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**protectedBranches** | **kotlin.Boolean** | Whether only branches with branch protection rules can deploy to this environment. If &#x60;protected_branches&#x60; is &#x60;true&#x60;, &#x60;custom_branch_policies&#x60; must be &#x60;false&#x60;; if &#x60;protected_branches&#x60; is &#x60;false&#x60;, &#x60;custom_branch_policies&#x60; must be &#x60;true&#x60;. | 
**customBranchPolicies** | **kotlin.Boolean** | Whether only branches that match the specified name patterns can deploy to this environment.  If &#x60;custom_branch_policies&#x60; is &#x60;true&#x60;, &#x60;protected_branches&#x60; must be &#x60;false&#x60;; if &#x60;custom_branch_policies&#x60; is &#x60;false&#x60;, &#x60;protected_branches&#x60; must be &#x60;true&#x60;. | 



