plugins {
    id("sunsetexperience.android.library")
}

android {
    namespace = "br.com.dfn.app.core.ui"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}