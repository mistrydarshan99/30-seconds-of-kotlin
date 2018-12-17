ext["kotlintestVersion"] = "3.1.10"
ext["slf4jVersion"] = "1.7.25"

plugins {
    kotlin("jvm") version "1.3.11"
}

group = "com.30secondsofkotlin"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib"))
    testCompile("io.kotlintest:kotlintest-runner-junit5:${project.rootProject.ext["kotlintestVersion"]}")
    testRuntime("org.slf4j:slf4j-nop:${project.rootProject.ext["slf4jVersion"]}")
}
