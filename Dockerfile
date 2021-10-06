FROM adoptopenjdk/openjdk11:latest

COPY build/libs/*.jar app.jar

CMD ["java", "-jar", "app.jar"]