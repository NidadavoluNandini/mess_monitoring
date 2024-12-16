pluginManagement {
    repositories {
        google()  // Google's repository for Android-specific plugins and dependencies
        mavenCentral()  // Central Maven repository for open-source Java libraries
        gradlePluginPortal()  // Repository for Gradle plugins
    }
}

dependencyResolutionManagement {
    // Ensures repositories are managed consistently at the root level
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()  // Use Google's repository for Android dependencies
        mavenCentral()  // Use Maven Central for general dependencies
    }
}

rootProject.name = "mess"  // Set the root project name
include(":app")  // Include the "app" module in the project
