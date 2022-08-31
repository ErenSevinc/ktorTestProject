object Versions {
    const val kotlin = "1.7.10"
    const val gradle = "7.2.2"
    const val ktor = "2.1.0"
    const val coroutines = "1.6.4"
    const val kotlinxSerializationCore = "1.3.3"
}

object Libraries {
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlinSerialization = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
    const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"

    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"

    object Shared {
        object Common {
            const val ktorCore = "io.ktor:ktor-client-core:${Versions.ktor}"
            const val ktorJson = "io.ktor:ktor-client-json:${Versions.ktor}"
            const val ktorLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
            const val ktorSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
            const val ktorSerializationJson = "io.ktor:ktor-serialization-kotlinx-json:${Versions.ktor}"
            const val ktorContentNegotiation = "io.ktor:ktor-client-content-negotiation:${Versions.ktor}"
            const val kotlinSerializationCore = "org.jetbrains.kotlinx:kotlinx-serialization-core:${Versions.kotlinxSerializationCore}"
        }

        object Android {
            const val ktorClient = "io.ktor:ktor-client-okhttp:${Versions.ktor}"
            const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        }

        object IOS {
            const val ktorClient = "io.ktor:ktor-client-ios:${Versions.ktor}"
        }
    }

    object AndroidApp {
        const val ktorCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    }

    object IOSApp {

    }
}