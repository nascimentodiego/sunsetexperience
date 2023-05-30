import br.com.dfn.app.convention.core.configureFlavors
import br.com.dfn.app.convention.core.configureKotlinAndroid
import br.com.dfn.app.convention.core.configureLintAndroid
import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.getting

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
                apply("sunsetexperience.android.application.ktlint")
                apply("sunsetexperience.android.application.jacoco")
                apply("sunsetexperience.android.application.detekt")
            }

            extensions.configure<ApplicationExtension> {
                configureKotlinAndroid(this)
                configureLintAndroid(this)
                defaultConfig.targetSdk = 33
                configureFlavors(this)
            }
        }
    }
}