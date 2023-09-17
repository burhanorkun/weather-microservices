FROM openjdk:17-jdk-slim AS build

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package

FROM openjdk:17-jdk-slim
WORKDIR weather-microservices
COPY --from=build target/*.jar weather-microservices.jar
ENTRYPOINT ["java", "-jar", "weather-microservices.jar"]
