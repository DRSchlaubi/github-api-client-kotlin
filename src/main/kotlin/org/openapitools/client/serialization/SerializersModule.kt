package org.openapitools.client.serialization

import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.contextual

val SerializersModule = SerializersModule {
    contextual(URISerializer)
    contextual(AnySerializer)
}

val Json = Json {
    serializersModule = SerializersModule
}
