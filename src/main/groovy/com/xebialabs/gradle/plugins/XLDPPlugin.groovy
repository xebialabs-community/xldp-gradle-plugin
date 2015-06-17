package com.xebialabs.gradle.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.file.DuplicatesStrategy
import org.gradle.api.tasks.bundling.Zip

class XLDPPlugin implements Plugin<Project> {
  static final String CONFIGURATION_NAME = 'xldpplugin'

  @Override
  void apply(Project project) {
    project.plugins.apply("java")

    configureExtensions(project)
    setupDependencyBundling(project)

    configureTasks(project)
  }

  void configureTasks(Project project) {

    def xlPluginTask = project.tasks.create("xlPlugin", Zip).configure {
      group = 'Archive'
      duplicatesStrategy = DuplicatesStrategy.EXCLUDE
      extension = project.extensions.plugin.pluginExtension

      into(".") {
        from project.configurations.getByName("distBundle")
        from project.tasks.getByName("jar").outputs
      }
    }

    project.artifacts {
      archives xlPluginTask
    }
  }

  private static String configureExtensions(Project p) {
    p.extensions.create("plugin", XLDPPluginExtension).with {
      project = p
      pluginExtension = "xldp"
    }
  }

  static def setupDependencyBundling(Project project) {
    project.configurations.maybeCreate("distBundle")
  }
}