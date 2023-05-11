plugins {
    id("sunsetexperience.android.feature")
    id("sunsetexperience.android.library.compose")
}

android {
    namespace = "br.com.dfn.app.feature.finance"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}