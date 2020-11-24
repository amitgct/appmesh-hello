FROM openjdk:8-jre
ADD target/called-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","/app.jar"]
