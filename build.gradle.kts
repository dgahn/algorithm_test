import io.gitlab.arturbosch.detekt.Detekt

plugins {
    jacoco
    kotlin("jvm") version "1.5.10"
    id("io.gitlab.arturbosch.detekt") version "1.18.0"
    id("org.jmailen.kotlinter") version "3.6.0"
}

group = "me.dgahn"
version = "0.1.0"

repositories {
    mavenCentral()
}

kotlinter {
    ignoreFailures = false
    indentSize = 4
    reporters = arrayOf("checkstyle", "plain")
    experimentalRules = false
    disabledRules = emptyArray()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
    testImplementation("io.kotest:kotest-assertions-core:5.4.2")
    testImplementation("io.kotest:kotest-runner-junit5:5.4.2")
    testImplementation("io.mockk:mockk:1.12.7")
}

jacoco {
    toolVersion = "0.8.7"
}


tasks {
    withType<Test> {
        useJUnitPlatform()
        finalizedBy(jacocoTestReport)
    }
    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    compileKotlin {
        kotlinOptions {
            jvmTarget = "11"
        }
    }
    compileTestKotlin {
        kotlinOptions {
            jvmTarget = "11"
        }
    }
    withType<Detekt> {
        dependsOn(formatKotlin)
    }
    jacocoTestReport {
        reports {
            html.required.set(true)
            xml.required.set(false)
            csv.required.set(false)
        }
        finalizedBy(jacocoTestCoverageVerification)
    }
    jacocoTestCoverageVerification {
        violationRules {
            rule {
                element = "SOURCEFILE"

                limit {
                    counter = "LINE"
                    value = "COVEREDRATIO"
                    minimum = (1.0).toBigDecimal()
                }
                excludes = listOf("me/dgahn/vms/App.kt", "me/dgahn/vms/ui/DocController.kt", "me/dgahn/vms/config/DemoDataRunner.kt")
            }
        }
        enabled = true
    }
}
