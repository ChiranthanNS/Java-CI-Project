
FROM eclipse-temurin:25-jre

WORKDIR /app

COPY target/java-ci-project-1.0.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]