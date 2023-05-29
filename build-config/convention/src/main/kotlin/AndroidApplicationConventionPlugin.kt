import br.com.dfn.app.convention.core.configureFlavors
import br.com.dfn.app.convention.core.configureKotlinAndroid
import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
                apply("sunsetexperience.android.application.ktlint")
                apply("sunsetexperience.android.application.detekt")
            }

            extensions.configure<ApplicationExtension> {
                configureKotlinAndroid(this)
                lint {
                    // Turns off checks for the issue IDs you specify.
                    disable += "TypographyFractions" + "TypographyQuotes"

                    // If set to true, turns off analysis progress reporting by lint.
                    quiet = false

                    // If set to true (default), stops the build if errors are found.
                    abortOnError = true

                    // If set to true, lint only reports errors.
                    ignoreWarnings = false

                    // If set to true, lint also checks all dependencies as part of its analysis.
                    // Recommended for projects consisting of an app with library dependencies.
                    checkDependencies = true
                }
            defaultConfig.targetSdk = 33
            configureFlavors(this)
        }
    }
}
}