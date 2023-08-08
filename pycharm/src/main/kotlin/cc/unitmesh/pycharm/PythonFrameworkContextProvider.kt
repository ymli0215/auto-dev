package cc.unitmesh.pycharm

import cc.unitmesh.devti.provider.context.ChatContextItem
import cc.unitmesh.devti.provider.context.ChatContextProvider
import cc.unitmesh.devti.provider.context.ChatCreationContext
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.modules
import com.jetbrains.python.PythonLanguage
import com.jetbrains.python.packaging.PyPackage
import com.jetbrains.python.packaging.tryCreateCustomPackageManager
import com.jetbrains.python.sdk.configuration.PyProjectSdkConfigurationExtension

class PythonFrameworkContextProvider : ChatContextProvider {
    override fun isApplicable(project: Project, creationContext: ChatCreationContext): Boolean {
        println(creationContext.element?.language)
        return creationContext.element?.language is PythonLanguage
    }

    override suspend fun collect(project: Project, creationContext: ChatCreationContext): List<ChatContextItem> {
//        val configures: List<PyPackage> = project.modules.asSequence()
//            .mapNotNull {
//                val pair = PyProjectSdkConfigurationExtension.findForModule(it)
//                pair?.second?.createAndAddSdkForInspection(it)
//            }
//            .mapNotNull {
//                tryCreateCustomPackageManager(it)?.packages
//            }
//            .flatten().toList()
//
//        configures.forEach {
//            println(it)
//        }

        return listOf()
    }
}