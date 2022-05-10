FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENV SERVER_PORT=9051
EXPOSE 9051
ENTRYPOINT ["java","-jar","/app.jar"]