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
}

gradlePlugin {
    plugins {
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
