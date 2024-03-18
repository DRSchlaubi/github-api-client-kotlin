
# SimpleClassroomAssignment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | Unique identifier of the repository. | 
**publicRepo** | **kotlin.Boolean** | Whether an accepted assignment creates a public repository. | 
**title** | **kotlin.String** | Assignment title. | 
**type** | [**inline**](#Type) | Whether it&#39;s a Group Assignment or Individual Assignment. | 
**inviteLink** | **kotlin.String** | The link that a student can use to accept the assignment. | 
**invitationsEnabled** | **kotlin.Boolean** | Whether the invitation link is enabled. Visiting an enabled invitation link will accept the assignment. | 
**slug** | **kotlin.String** | Sluggified name of the assignment. | 
**studentsAreRepoAdmins** | **kotlin.Boolean** | Whether students are admins on created repository on accepted assignment. | 
**feedbackPullRequestsEnabled** | **kotlin.Boolean** | Whether feedback pull request will be created on assignment acceptance. | 
**editor** | **kotlin.String** | The selected editor for the assignment. | 
**accepted** | **kotlin.Int** | The number of students that have accepted the assignment. | 
**submitted** | **kotlin.Int** | The number of students that have submitted the assignment. | 
**passing** | **kotlin.Int** | The number of students that have passed the assignment. | 
**language** | **kotlin.String** | The programming language used in the assignment. | 
**deadline** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time at which the assignment is due. | 
**classroom** | [**SimpleClassroom**](SimpleClassroom.md) |  | 
**maxTeams** | **kotlin.Int** | The maximum allowable teams for the assignment. |  [optional]
**maxMembers** | **kotlin.Int** | The maximum allowable members per team. |  [optional]


<a id="Type"></a>
## Enum: type
Name | Value
---- | -----
type | individual, group



