import br.com.dfn.app.convention.core.configureKtLint
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import org.jlleitschuh.gradle.ktlint.KtlintExtension

class AndroidApplicationDeteKtConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("io.gitlab.arturbosch.detektt")

            val extension = extensions.getByType<KtlintExtension>()
            configureKtLint(extension)
        }
    }

}
