/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.8/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // mahdollistaa CLI-sovelluksen rakentamisen, eli mahdollisuus luoda ja ajaa komentorivisovelluksia
    application
    //Tuo Spirng Boot -tuoen ja lisää mahdollisuuden lisätä depencies kohtaan työkaluja
    id("org.springframework.boot") version "3.4.0"
    //tarjoaa tavan hallita riippuvuuksien versioita
    id("io.spring.dependency-management") version "1.1.6"
    id("java")
}

repositories {
    // Lataa riippuvuudet Maven Centralista
    mavenCentral()
}

dependencies {
    // Junit Jupiter testaukseen
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is used by the application.
    implementation(libs.guava)

    // Spring Bootin perusriippuvuus web-sovelluksille
    implementation("org.springframework.boot:spring-boot-starter-web")

    // Jos käytät tietokantaa, lisää Spring Data JPA
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    // Testauskirjastot
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    //tietokanta-ajuri
    implementation("org.xerial:sqlite-jdbc:3.47.1.0")

    //hibernate-ajuri
    implementation("org.hibernate.orm:hibernate-community-dialects:6.6.3.Final")

}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    // Define the main class for the application.
    mainClass = "tehtavienHallintasovellus.Paaluokka"
}

tasks.named<Test>("test") {
    // Ota käyttöön JUnit Platform
    useJUnitPlatform()
}
