# ClassroomApi

All URIs are relative to *https://api.github.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**classroomGetAClassroom**](ClassroomApi.md#classroomGetAClassroom) | **GET** /classrooms/{classroom_id} | Get a classroom
[**classroomGetAnAssignment**](ClassroomApi.md#classroomGetAnAssignment) | **GET** /assignments/{assignment_id} | Get an assignment
[**classroomGetAssignmentGrades**](ClassroomApi.md#classroomGetAssignmentGrades) | **GET** /assignments/{assignment_id}/grades | Get assignment grades
[**classroomListAcceptedAssigmentsForAnAssignment**](ClassroomApi.md#classroomListAcceptedAssigmentsForAnAssignment) | **GET** /assignments/{assignment_id}/accepted_assignments | List accepted assignments for an assignment
[**classroomListAssignmentsForAClassroom**](ClassroomApi.md#classroomListAssignmentsForAClassroom) | **GET** /classrooms/{classroom_id}/assignments | List assignments for a classroom
[**classroomListClassrooms**](ClassroomApi.md#classroomListClassrooms) | **GET** /classrooms | List classrooms


<a id="classroomGetAClassroom"></a>
# **classroomGetAClassroom**
> Classroom classroomGetAClassroom(classroomId)

Get a classroom

Gets a GitHub Classroom classroom for the current user. Classroom will only be returned if the current user is an administrator of the GitHub Classroom.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ClassroomApi()
val classroomId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the classroom.
try {
    val result : Classroom = apiInstance.classroomGetAClassroom(classroomId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClassroomApi#classroomGetAClassroom")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClassroomApi#classroomGetAClassroom")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **classroomId** | **kotlin.Int**| The unique identifier of the classroom. |

### Return type

[**Classroom**](Classroom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="classroomGetAnAssignment"></a>
# **classroomGetAnAssignment**
> ClassroomAssignment classroomGetAnAssignment(assignmentId)

Get an assignment

Gets a GitHub Classroom assignment. Assignment will only be returned if the current user is an administrator of the GitHub Classroom for the assignment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ClassroomApi()
val assignmentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the classroom assignment.
try {
    val result : ClassroomAssignment = apiInstance.classroomGetAnAssignment(assignmentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClassroomApi#classroomGetAnAssignment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClassroomApi#classroomGetAnAssignment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignmentId** | **kotlin.Int**| The unique identifier of the classroom assignment. |

### Return type

[**ClassroomAssignment**](ClassroomAssignment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="classroomGetAssignmentGrades"></a>
# **classroomGetAssignmentGrades**
> kotlin.collections.List&lt;ClassroomAssignmentGrade&gt; classroomGetAssignmentGrades(assignmentId)

Get assignment grades

Gets grades for a GitHub Classroom assignment. Grades will only be returned if the current user is an administrator of the GitHub Classroom for the assignment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ClassroomApi()
val assignmentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the classroom assignment.
try {
    val result : kotlin.collections.List<ClassroomAssignmentGrade> = apiInstance.classroomGetAssignmentGrades(assignmentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClassroomApi#classroomGetAssignmentGrades")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClassroomApi#classroomGetAssignmentGrades")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignmentId** | **kotlin.Int**| The unique identifier of the classroom assignment. |

### Return type

[**kotlin.collections.List&lt;ClassroomAssignmentGrade&gt;**](ClassroomAssignmentGrade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="classroomListAcceptedAssigmentsForAnAssignment"></a>
# **classroomListAcceptedAssigmentsForAnAssignment**
> kotlin.collections.List&lt;ClassroomAcceptedAssignment&gt; classroomListAcceptedAssigmentsForAnAssignment(assignmentId, page, perPage)

List accepted assignments for an assignment

Lists any assignment repositories that have been created by students accepting a GitHub Classroom assignment. Accepted assignments will only be returned if the current user is an administrator of the GitHub Classroom for the assignment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ClassroomApi()
val assignmentId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the classroom assignment.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<ClassroomAcceptedAssignment> = apiInstance.classroomListAcceptedAssigmentsForAnAssignment(assignmentId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClassroomApi#classroomListAcceptedAssigmentsForAnAssignment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClassroomApi#classroomListAcceptedAssigmentsForAnAssignment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignmentId** | **kotlin.Int**| The unique identifier of the classroom assignment. |
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;ClassroomAcceptedAssignment&gt;**](ClassroomAcceptedAssignment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="classroomListAssignmentsForAClassroom"></a>
# **classroomListAssignmentsForAClassroom**
> kotlin.collections.List&lt;SimpleClassroomAssignment&gt; classroomListAssignmentsForAClassroom(classroomId, page, perPage)

List assignments for a classroom

Lists GitHub Classroom assignments for a classroom. Assignments will only be returned if the current user is an administrator of the GitHub Classroom.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ClassroomApi()
val classroomId : kotlin.Int = 56 // kotlin.Int | The unique identifier of the classroom.
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleClassroomAssignment> = apiInstance.classroomListAssignmentsForAClassroom(classroomId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClassroomApi#classroomListAssignmentsForAClassroom")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClassroomApi#classroomListAssignmentsForAClassroom")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **classroomId** | **kotlin.Int**| The unique identifier of the classroom. |
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;SimpleClassroomAssignment&gt;**](SimpleClassroomAssignment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="classroomListClassrooms"></a>
# **classroomListClassrooms**
> kotlin.collections.List&lt;SimpleClassroom&gt; classroomListClassrooms(page, perPage)

List classrooms

Lists GitHub Classroom classrooms for the current user. Classrooms will only be returned if the current user is an administrator of one or more GitHub Classrooms.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ClassroomApi()
val page : kotlin.Int = 56 // kotlin.Int | The page number of the results to fetch. For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
val perPage : kotlin.Int = 56 // kotlin.Int | The number of results per page (max 100). For more information, see \"[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\"
try {
    val result : kotlin.collections.List<SimpleClassroom> = apiInstance.classroomListClassrooms(page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ClassroomApi#classroomListClassrooms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClassroomApi#classroomListClassrooms")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page number of the results to fetch. For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of results per page (max 100). For more information, see \&quot;[Using pagination in the REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api).\&quot; | [optional] [default to 30]

### Return type

[**kotlin.collections.List&lt;SimpleClassroom&gt;**](SimpleClassroom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

