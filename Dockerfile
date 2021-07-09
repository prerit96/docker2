FROM java:8
EXPOSE 8080
ADD /target/docker1-0.0.1-SNAPSHOT.jar docker1.jar
ENTRYPOINT ["java","-jar","docker1.jar"]