FROM openjdk:22-slim-bookworm
LABEL mentainer="t.h.minh101002@gmail.com"
WORKDIR /app
COPY target/springboot-tutorial-0.0.1-SNAPSHOT.jar /app/springboot-tutorial.jar
ENTRYPOINT ["java", "-jar", "springboot-tutorial.jar"]