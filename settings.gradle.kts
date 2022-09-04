pluginManagement {
    val kotlinVersion: String = "1.6.21"
    val springBootVersion: String = "2.7.3"
    val springDependencyManagementVersion: String = "1.0.13.RELEASE"
    val entityPluginVersion = "1.5.10"

    plugins {
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version springDependencyManagementVersion

        kotlin("jvm") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion

        id ("org.jetbrains.kotlin.plugin.allopen") version entityPluginVersion
        id("org.jetbrains.kotlin.plugin.noarg") version entityPluginVersion
    }
}

rootProject.name = "hibernate-reactive-hexagonal-playground"

// adapters
include("adapters")
include("adapters:controller")
include("adapters:dao")

// ports
include("ports")
include("ports:repository")
include("ports:service")

// domains
include("domains")
include("domains:domain")

// commons
include("commons")
include("commons:common")