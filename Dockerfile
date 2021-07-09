FROM java:8
EXPOSE 8800
ADD /target/docker1-1.jar dockerJpa.jar
ENTRYPOINT ["java","-jar","dockerJpa.jar"]