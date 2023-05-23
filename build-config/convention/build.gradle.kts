plugins {
    `kotlin-dsl`
}

group = "br.com.dfn.sunsetexperience.buildconfig"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}


dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.ktlint.gradlePlugin)
    compileOnly(libs.deteKt.gradlePlugin)
}

gradlePlugin {
    plugins {

        register("androidApplicationKtlint") {
            id = "sunsetexperience.android.application.ktlint"
            implementationClass = "AndroidApplicationKtLintConventionPlugin"
        }

        register("androidApplicationDeteKt") {
            id = "sunsetexperience.android.application.detekt"
            implementationClass = "AndroidApplicationDeteKtConventionPlugin"
        }

        register("androidApplicationCompose") {
            id = "sunsetexperience.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }

        register("androidApplication") {
            id = "sunsetexperience.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }

        register("androidApplicationJacoco") {
            id = "sunsetexperience.android.application.jacoco"
            implementationClass = "AndroidApplicationJacocoConventionPlugin"
        }

        register("androidFeature") {
            id = "sunsetexperience.android.feature"
            implementationClass = "AndroidFeatureConventionPlugin"
        }

        register("androidLibrary") {
            id = "sunsetexperience.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }

        register("androidLibraryCompose") {
            id = "sunsetexperience.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }

        register("androidLibraryJacoco") {
            id = "sunsetexperience.android.library.jacoco"
            implementationClass = "AndroidLibraryJacocoConventionPlugin"
        }
    }
}
