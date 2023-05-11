plugins {
    id("sunsetexperience.android.library")
}

android {
    namespace = "br.com.dfn.app.designsystem"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}