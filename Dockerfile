FROM java:8
EXPOSE 8990
ADD /target/docker1-1.jar docker-git.jar
ENTRYPOINT ["java","-jar","docker-git.jar"]