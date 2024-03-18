
# CodespaceMachine

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**kotlin.Any**](.md) | The name of the machine. | 
**displayName** | [**kotlin.Any**](.md) | The display name of the machine includes cores, memory, and storage. | 
**operatingSystem** | [**kotlin.Any**](.md) | The operating system of the machine. | 
**storageInBytes** | [**kotlin.Any**](.md) | How much storage is available to the codespace. | 
**memoryInBytes** | [**kotlin.Any**](.md) | How much memory is available to the codespace. | 
**cpus** | [**kotlin.Any**](.md) | How many cores are available to the codespace. | 
**prebuildAvailability** | [**inline**](#PrebuildAvailability) | Whether a prebuild is currently available when creating a codespace for this machine and repository. If a branch was not specified as a ref, the default branch will be assumed. Value will be \&quot;null\&quot; if prebuilds are not supported or prebuild availability could not be determined. Value will be \&quot;none\&quot; if no prebuild is available. Latest values \&quot;ready\&quot; and \&quot;in_progress\&quot; indicate the prebuild availability status. | 


<a id="PrebuildAvailability"></a>
## Enum: prebuild_availability
Name | Value
---- | -----
prebuildAvailability | none, ready, in_progress, 



