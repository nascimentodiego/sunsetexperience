plugins {
    id("sunsetexperience.android.feature")
    id("sunsetexperience.android.library.compose")
    id("sunsetexperience.android.library.jacoco")
    id("sunsetexperience.android.application.ktlint")
}

android {
    namespace = "br.com.dfn.app.feature.login"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
//    testImplementation(libs.junit4)
//    androidTestImplementation(libs.androidx.compose.ui.test)
//    androidTestImplementation(libs.androidx.test.espresso.core)core
}