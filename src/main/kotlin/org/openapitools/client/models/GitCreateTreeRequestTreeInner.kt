/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param path The file referenced in the tree.
 * @param mode The file mode; one of `100644` for file (blob), `100755` for executable (blob), `040000` for subdirectory (tree), `160000` for submodule (commit), or `120000` for a blob that specifies the path of a symlink.
 * @param type Either `blob`, `tree`, or `commit`.
 * @param sha The SHA1 checksum ID of the object in the tree. Also called `tree.sha`. If the value is `null` then the file will be deleted.      **Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and `content` will return an error.
 * @param content The content you want this file to have. GitHub will write this blob out and use that SHA for this entry. Use either this, or `tree.sha`.      **Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and `content` will return an error.
 */
@Serializable

data class GitCreateTreeRequestTreeInner (

    /* The file referenced in the tree. */
    @SerialName(value = "path")
    val path: kotlin.String? = null,

    /* The file mode; one of `100644` for file (blob), `100755` for executable (blob), `040000` for subdirectory (tree), `160000` for submodule (commit), or `120000` for a blob that specifies the path of a symlink. */
    @SerialName(value = "mode")
    val mode: GitCreateTreeRequestTreeInner.Mode? = null,

    /* Either `blob`, `tree`, or `commit`. */
    @SerialName(value = "type")
    val type: GitCreateTreeRequestTreeInner.Type? = null,

    /* The SHA1 checksum ID of the object in the tree. Also called `tree.sha`. If the value is `null` then the file will be deleted.      **Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and `content` will return an error. */
    @SerialName(value = "sha")
    val sha: kotlin.String? = null,

    /* The content you want this file to have. GitHub will write this blob out and use that SHA for this entry. Use either this, or `tree.sha`.      **Note:** Use either `tree.sha` or `content` to specify the contents of the entry. Using both `tree.sha` and `content` will return an error. */
    @SerialName(value = "content")
    val content: kotlin.String? = null

) {

    /**
     * The file mode; one of `100644` for file (blob), `100755` for executable (blob), `040000` for subdirectory (tree), `160000` for submodule (commit), or `120000` for a blob that specifies the path of a symlink.
     *
     * Values: _100644,_100755,_040000,_160000,_120000
     */
    @Serializable
    enum class Mode(val value: kotlin.String) {
        @SerialName(value = "100644") _100644("100644"),
        @SerialName(value = "100755") _100755("100755"),
        @SerialName(value = "040000") _040000("040000"),
        @SerialName(value = "160000") _160000("160000"),
        @SerialName(value = "120000") _120000("120000");
    }
    /**
     * Either `blob`, `tree`, or `commit`.
     *
     * Values: blob,tree,commit
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "blob") blob("blob"),
        @SerialName(value = "tree") tree("tree"),
        @SerialName(value = "commit") commit("commit");
    }
}

