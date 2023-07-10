plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.6.0"
    id("io.freefair.lombok") version "6.1.0"
}

group = "com.yourcompany"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    // Serenity BDD dependencies
    implementation("net.serenity-bdd:serenity-core:2.5.5")
    implementation("net.serenity-bdd:serenity-screenplay:2.5.5")
    implementation("net.serenity-bdd:serenity-screenplay-webdriver:2.5.5")

    // Selenium WebDriver
    implementation("org.seleniumhq.selenium:selenium-java:4.10.0")

    // Other dependencies
    // ...

    testImplementation("junit:junit:4.13.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_9
    targetCompatibility = JavaVersion.VERSION_1_9
}