
# RepositoryRulesetBypassActor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actorId** | **kotlin.Int** | The ID of the actor that can bypass a ruleset. If &#x60;actor_type&#x60; is &#x60;OrganizationAdmin&#x60;, this should be &#x60;1&#x60;. | 
**actorType** | [**inline**](#ActorType) | The type of actor that can bypass a ruleset | 
**bypassMode** | [**inline**](#BypassMode) | When the specified actor can bypass the ruleset. &#x60;pull_request&#x60; means that an actor can only bypass rules on pull requests. | 


<a id="ActorType"></a>
## Enum: actor_type
Name | Value
---- | -----
actorType | RepositoryRole, Team, Integration, OrganizationAdmin


<a id="BypassMode"></a>
## Enum: bypass_mode
Name | Value
---- | -----
bypassMode | always, pull_request



