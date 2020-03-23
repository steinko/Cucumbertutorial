FROM openjdk:13-jdk-alpine
ARG JAR_FILE=build/libs/backend.jar
# cd /usr/local/runme
WORKDIR /usr/local/runme
COPY ${JAR_FILE} backend.jar
ENTRYPOINT ["java","-jar","backend.jar"]