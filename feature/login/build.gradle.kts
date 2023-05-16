plugins {
    id("sunsetexperience.android.feature")
    id("sunsetexperience.android.library.compose")
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