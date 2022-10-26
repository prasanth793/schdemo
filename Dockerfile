FROM openjdk:11
COPY target/schdemo.jar schdemo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/schdemo.jar"]