package br.com.dfn.app.convention.core

import org.gradle.api.Project
import org.jlleitschuh.gradle.ktlint.KtlintExtension
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

internal fun Project.configureKtLint(
    commonExtension: KtlintExtension,
) {
    commonExtension.apply{
        debug.set(true)
        verbose.set(true)
        android.set(true)
        ignoreFailures.set(false)
        outputToConsole.set(true)
        outputColorName.set("RED")
        disabledRules.set(setOf("final-newline"))
        reporters {
            reporter(ReporterType.PLAIN)
            reporter(ReporterType.CHECKSTYLE)
        }
    }
}
