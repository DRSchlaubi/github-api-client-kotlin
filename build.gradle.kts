import com.vanniktech.maven.publish.SonatypeHost

plugins {
    kotlin("jvm") version "2.0.0"
    kotlin("plugin.serialization") version "2.0.0"
    `jvm-test-suite`
    id("com.vanniktech.maven.publish") version "0.28.0"
}
group = "dev.schlaubi"
version = "1.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.0")
    implementation(platform("io.ktor:ktor-bom:2.3.11"))
    implementation("io.ktor:ktor-client-core")
    implementation("io.ktor:ktor-client-okhttp")
    implementation("io.ktor:ktor-client-content-negotiation")
    implementation("io.ktor:ktor-serialization-kotlinx-json")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.0")
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
