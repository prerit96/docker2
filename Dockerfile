FROM java:8
EXPOSE 8080
ADD /target/docker1-1.jar docker-git.jar
ENTRYPOINT ["java","-jar","docker-git.jar"]