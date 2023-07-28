plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation ("junit:junit:4.13")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
    testImplementation("org.testng:testng:7.1.0")
}

tasks.test {
    useJUnit()
}