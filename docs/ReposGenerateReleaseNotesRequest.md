
# ReposGenerateReleaseNotesRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tagName** | **kotlin.String** | The tag name for the release. This can be an existing tag or a new one. | 
**targetCommitish** | **kotlin.String** | Specifies the commitish value that will be the target for the release&#39;s tag. Required if the supplied tag_name does not reference an existing tag. Ignored if the tag_name already exists. |  [optional]
**previousTagName** | **kotlin.String** | The name of the previous tag to use as the starting point for the release notes. Use to manually specify the range for the set of changes considered as part this release. |  [optional]
**configurationFilePath** | **kotlin.String** | Specifies a path to a file in the repository containing configuration settings used for generating the release notes. If unspecified, the configuration file located in the repository at &#39;.github/release.yml&#39; or &#39;.github/release.yaml&#39; will be used. If that is not present, the default configuration will be used. |  [optional]



