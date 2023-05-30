plugins {
    id("sunsetexperience.android.library")
}

android {
    namespace = "br.com.dfn.app.core.common"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}