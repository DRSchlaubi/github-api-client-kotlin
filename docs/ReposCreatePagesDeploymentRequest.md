
# ReposCreatePagesDeploymentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pagesBuildVersion** | **kotlin.String** | A unique string that represents the version of the build for this deployment. | 
**oidcToken** | **kotlin.String** | The OIDC token issued by GitHub Actions certifying the origin of the deployment. | 
**artifactId** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The ID of an artifact that contains the .zip or .tar of static assets to deploy. The artifact belongs to the repository. Either &#x60;artifact_id&#x60; or &#x60;artifact_url&#x60; are required. |  [optional]
**artifactUrl** | **kotlin.String** | The URL of an artifact that contains the .zip or .tar of static assets to deploy. The artifact belongs to the repository. Either &#x60;artifact_id&#x60; or &#x60;artifact_url&#x60; are required. |  [optional]
**environment** | **kotlin.String** | The target environment for this GitHub Pages deployment. |  [optional]



