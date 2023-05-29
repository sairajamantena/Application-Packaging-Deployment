FROM openjdk:8
EXPOSE 8080
ADD target/current-time.jar current-time.jar
ENTRYPOINT ["java","jar","/current-time.jar"]