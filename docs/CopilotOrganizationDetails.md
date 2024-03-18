
# CopilotOrganizationDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seatBreakdown** | [**CopilotSeatBreakdown**](CopilotSeatBreakdown.md) |  | 
**publicCodeSuggestions** | [**inline**](#PublicCodeSuggestions) | The organization policy for allowing or disallowing Copilot to make suggestions that match public code. | 
**seatManagementSetting** | [**inline**](#SeatManagementSetting) | The mode of assigning new seats. | 
**ideChat** | [**inline**](#IdeChat) | The organization policy for allowing or disallowing organization members to use Copilot Chat within their editor. |  [optional]
**platformChat** | [**inline**](#PlatformChat) | The organization policy for allowing or disallowing organization members to use Copilot features within github.com. |  [optional]
**cli** | [**inline**](#Cli) | The organization policy for allowing or disallowing organization members to use Copilot within their CLI. |  [optional]


<a id="PublicCodeSuggestions"></a>
## Enum: public_code_suggestions
Name | Value
---- | -----
publicCodeSuggestions | allow, block, unconfigured, unknown


<a id="SeatManagementSetting"></a>
## Enum: seat_management_setting
Name | Value
---- | -----
seatManagementSetting | assign_all, assign_selected, disabled, unconfigured


<a id="IdeChat"></a>
## Enum: ide_chat
Name | Value
---- | -----
ideChat | enabled, disabled, unconfigured


<a id="PlatformChat"></a>
## Enum: platform_chat
Name | Value
---- | -----
platformChat | enabled, disabled, unconfigured


<a id="Cli"></a>
## Enum: cli
Name | Value
---- | -----
cli | enabled, disabled, unconfigured



