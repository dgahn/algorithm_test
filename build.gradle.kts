import io.gitlab.arturbosch.detekt.Detekt

plugins {
    jacoco
    kotlin("jvm") version "2.2.0"
    id("io.gitlab.arturbosch.detekt") version "1.23.8"
    id("org.jmailen.kotlinter") version "5.2.0"
}

group = "me.dgahn"
version = "0.1.0"

repositories {
    mavenCentral()
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
