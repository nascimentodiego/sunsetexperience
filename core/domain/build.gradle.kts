plugins {
    id("sunsetexperience.android.library")
}

android {
    namespace = "br.com.dfn.app.core.domain"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}