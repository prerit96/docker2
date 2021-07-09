FROM java:8
EXPOSE 8800
RUN git clone https://github.com/prerit96/docker2.git E:\Office\POC\dock-git
WORKDIR E:\Office\POC\dock-git
RUN mvn clean install
ADD /target/docker1-1.jar docker-git-jpa.jar
ENTRYPOINT ["java","-jar","docker-git-jpa.jar"]