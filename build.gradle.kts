import com.vanniktech.maven.publish.SonatypeHost

plugins {
    kotlin("jvm") version "1.9.23"
    kotlin("plugin.serialization") version "1.9.23"
    `jvm-test-suite`
    id("com.vanniktech.maven.publish") version "0.28.0"
}
group = "dev.schlaubi"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}


dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
    implementation(platform("io.ktor:ktor-bom:2.3.9"))
    implementation("io.ktor:ktor-client-core")
    implementation("io.ktor:ktor-client-okhttp")
    implementation("io.ktor:ktor-client-content-negotiation")
    implementation("io.ktor:ktor-serialization-kotlinx-json")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.5.0")
    testImplementation(kotlin("test-junit5"))
    testImplementation("org.jetbrains.kotlinx", "kotlinx-coroutines-test", "1.8.0")
}

testing {
    suites {
        named<JvmTestSuite>("test") {
            useJUnitJupiter()
        }
    }
}

mavenPublishing {
    coordinates("dev.schlaubi.github", "github-api-client")
    publishToMavenCentral(SonatypeHost.S01)
}
