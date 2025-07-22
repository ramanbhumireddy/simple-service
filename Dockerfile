FROM eclipse-temurin:21

WORKDIR /app
COPY build/libs/simple-service.jar simple-service.jar

ENTRYPOINT ["java", "-jar", "/app/simple-service.jar"]
