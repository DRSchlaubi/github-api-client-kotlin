package org.openapitools.client.serialization

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.net.URI

object URISerializer : KSerializer<URI> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("java.net.URI", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: URI) = encoder.encodeString(value.toString())

    override fun deserialize(decoder: Decoder): URI = URI.create(decoder.decodeString())
}
