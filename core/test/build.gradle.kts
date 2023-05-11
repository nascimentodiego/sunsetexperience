plugins {
    id("sunsetexperience.android.library")
}

android {
    namespace = "br.com.dfn.app.core.test"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}