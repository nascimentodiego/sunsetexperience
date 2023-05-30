package br.com.dfn.app.convention.core

@Suppress("unused")
enum class SunsetBuildType(val applicationIdSuffix: String? = null) {
    DEBUG(".debug"),
    TEST(".test"),
    RELEASE,
    BENCHMARK(".benchmark")
}
