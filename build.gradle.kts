plugins {
	java
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
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("io.rest-assured:spring-mock-mvc:5.3.2")
	testImplementation("junit:junit:4.13.1")

	testImplementation("io.cucumber:cucumber-java:7.14.0")
	testImplementation("io.cucumber:cucumber-junit:7.14.0")
}

tasks.withType<Test> {
	useJUnitPlatform()
	systemProperty("cucumber.junit-platform.naming-strategy", "long")
}
