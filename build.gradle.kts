plugins {
	java
	id("idea") // optional (to generate IntelliJ IDEA project files)
	id("org.springframework.boot") version "3.1.5"
	id("io.spring.dependency-management") version "1.1.3"
}

group = "com.contract.producer"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web:3.1.0")
	testImplementation("org.springframework.boot:spring-boot-starter-test:3.1.0")
	testImplementation("io.rest-assured:spring-mock-mvc:5.3.2")
	testImplementation(platform("org.junit:junit-bom:5.10.0"))
	testImplementation("org.junit.jupiter:junit-jupiter")
	implementation("org.junit.platform:junit-platform-suite")
	implementation("io.cucumber:cucumber-junit-platform-engine:7.14.0")
	testImplementation("io.cucumber:cucumber-java:7.14.0")
	testImplementation("io.cucumber:cucumber-junit:7.14.0")
}

tasks.withType<Test> {
	useJUnitPlatform()
	systemProperty("cucumber.junit-platform.naming-strategy", "long")
}
