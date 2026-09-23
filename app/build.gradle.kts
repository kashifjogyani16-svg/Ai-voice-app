pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement { implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7")
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.9.0")
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Ai-voice-app"
include(":app")
