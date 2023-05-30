import br.com.dfn.app.convention.core.configureFlavors
import com.android.build.gradle.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidFeatureConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("sunsetexperience.android.library")
            }

            extensions.configure<LibraryExtension> {
                configureFlavors(this)
            }
        }
    }
}