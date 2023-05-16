pluginManagement {
    includeBuild("build-config")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
rootProject.name = "Sunset Experience"
include (":app")
include(":core:common")
include(":core:designsystem")
include(":core:ui")
include(":core:domain")
include(":core:data")
include(":core:test")
include(":core:navigation")
include(":core:network")
include(":feature:login")
include(":feature:settings")
include(":feature:guests")
include(":feature:finance")
include(":feature:condominium")
include(":feature:booking")
include(":feature:restaurant")
