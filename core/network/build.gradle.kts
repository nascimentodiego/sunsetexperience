plugins {
    id("sunsetexperience.android.library")
}

android {
    namespace = "br.com.dfn.app.core.network"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}