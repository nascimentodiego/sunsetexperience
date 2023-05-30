plugins {
    id("sunsetexperience.android.library")
}

android {
    namespace = "br.com.dfn.app.core.common"

/*    buildTypes {
        val debug by getting {
            enableAndroidTestCoverage = true
            enableUnitTestCoverage = true
        }

        val release by getting {
            enableAndroidTestCoverage = true
            enableUnitTestCoverage = true
        }
    }*/
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}