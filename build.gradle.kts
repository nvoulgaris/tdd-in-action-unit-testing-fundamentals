plugins {
  kotlin("jvm") version "2.1.20"
  id("groovy")
}

group = "com.nvoulgaris"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  testImplementation(kotlin("test"))

  implementation("org.codehaus.groovy:groovy-all:3.0.24")
  testImplementation("org.spockframework:spock-core:2.0-M5-groovy-3.0")
}

tasks.test {
  useJUnitPlatform()
}
kotlin {
  jvmToolchain(21)
}
