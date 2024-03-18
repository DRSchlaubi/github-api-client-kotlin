
# ReposUpdateInformationAboutPagesSiteRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cname** | [**kotlin.Any**](.md) | Specify a custom domain for the repository. Sending a &#x60;null&#x60; value will remove the custom domain. For more about custom domains, see \&quot;[Using a custom domain with GitHub Pages](https://docs.github.com/articles/using-a-custom-domain-with-github-pages/).\&quot; |  [optional]
**httpsEnforced** | [**kotlin.Any**](.md) | Specify whether HTTPS should be enforced for the repository. |  [optional]
**buildType** | [**inline**](#BuildType) | The process by which the GitHub Pages site will be built. &#x60;workflow&#x60; means that the site is built by a custom GitHub Actions workflow. &#x60;legacy&#x60; means that the site is built by GitHub when changes are pushed to a specific branch. |  [optional]
**source** | [**ReposUpdateInformationAboutPagesSiteRequestSource**](ReposUpdateInformationAboutPagesSiteRequestSource.md) |  |  [optional]


<a id="BuildType"></a>
## Enum: build_type
Name | Value
---- | -----
buildType | legacy, workflow



