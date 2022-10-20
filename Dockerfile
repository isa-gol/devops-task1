FROM openjdk:17-alpine
EXPOSE 8080
COPY build/libs/task1-0.0.1-SNAPSHOT.jar task1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","task1-0.0.1-SNAPSHOT.jar"]
