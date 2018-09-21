import java.net.URL
import org.openstreetmap.josm.gradle.plugin.config.JosmManifest

plugins {
  java
  id("org.openstreetmap.josm") version "0.5.0"
}

java {
  (sourceSets) {
    "main" {
      java.setSrcDirs(listOf("src"))
    }
  }
}

tasks {
  "processResources"(ProcessResources::class) {
    from(projectDir) {
      include("data/*")
      include("images/*")
      include("README*")
      include("GPL-*")
    }
  }

  withType(JavaCompile::class) {
    options.compilerArgs.addAll(arrayOf("-Xlint:all", "-Xlint:-serial"))
  }
}
