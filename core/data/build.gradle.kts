plugins {
    id("sunsetexperience.android.library")
}

android {
    namespace = "br.com.dfn.app.core.data"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}