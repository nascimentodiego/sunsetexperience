plugins {
    id("sunsetexperience.android.library")
}

android {
    namespace = "br.com.dfn.app.core.navigation"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}