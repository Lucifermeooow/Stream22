allprojects {
    repositories {
        google()
        mavenCentral()
        maven {
            url = java.net.URI("https://jitpack.io")
        }
    }

    tasks.matching {
        it.name.contains("AarMetadata")
    }.configureEach {
        enabled = false
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
        compilerOptions {
            freeCompilerArgs.addAll(
                "-Xskip-metadata-version-check",
                "-Xskip-prerelease-check"
            )
        }
    }
}

subprojects {
    project.evaluationDependsOn(":app")
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
