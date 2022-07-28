package com.github.shirman.helloideaplugin.services

import com.intellij.openapi.project.Project
import com.github.shirman.helloideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
