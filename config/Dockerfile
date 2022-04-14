FROM openjdk:11-jdk
ARG JAR_FILE=build/libs/*.jar
#COPY ${JAR_FILE} config.jar
ENTRYPOINT ["java","-jar","/config.jar"]
