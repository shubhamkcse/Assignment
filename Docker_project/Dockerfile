FROM openjdk:latest
EXPOSE 8086
ADD	target/Docker_project-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]