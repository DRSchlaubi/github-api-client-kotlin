@file:Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")

package org.openapitools.client.serialization

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonElementSerializer
import kotlinx.serialization.json.JsonEncoder
import kotlinx.serialization.json.JsonPrimitive

object AnySerializer : KSerializer<Any> {
    override val descriptor: SerialDescriptor
        get() = JsonElementSerializer.descriptor

    @OptIn(ExperimentalSerializationApi::class)
    override fun serialize(encoder: Encoder, value: Any) {
        val jsonElement = when (value) {
            is Number -> JsonPrimitive(value)
            is String -> JsonPrimitive(value)
            else -> error("Unexpected type: $value")
        }
        (encoder as JsonEncoder).encodeJsonElement(jsonElement)
    }

    override fun deserialize(decoder: Decoder): Any = (decoder as JsonDecoder).decodeJsonElement()
}
