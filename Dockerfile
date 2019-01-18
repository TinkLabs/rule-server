FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
RUN mkdir /app
COPY target/${JAR_FILE} /app/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]