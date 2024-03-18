
# ActivityMarkRepoNotificationsAsReadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastReadAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | Describes the last point that notifications were checked. Anything updated since this time will not be marked as read. If you omit this parameter, all notifications are marked as read. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. Default: The current timestamp. |  [optional]



