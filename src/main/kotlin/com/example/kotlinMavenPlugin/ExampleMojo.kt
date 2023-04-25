package com.example.kotlinMavenPlugin

import org.apache.maven.plugin.AbstractMojo
import org.apache.maven.plugin.MojoExecutionException
import org.apache.maven.plugins.annotations.LifecyclePhase
import org.apache.maven.plugins.annotations.Mojo
import org.apache.maven.plugins.annotations.Parameter

@Mojo(name = "example", defaultPhase = LifecyclePhase.PROCESS_CLASSES)
class ExampleMojo: AbstractMojo() {
    @Parameter(property = "name", required = true, defaultValue = "\${project.name}")
    private var name: String = ""

    @Throws(MojoExecutionException::class)
    override fun execute() {
        log.info("Plugin is running in Project ${name}")
    }
}