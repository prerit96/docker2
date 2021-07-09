FROM java:8
EXPOSE 8800
RUN mvn clean install
RUN git clone https://github.com/prerit96/docker2.git E:\Office\POC\dock-git
ADD /target/docker1-1.jar docker-git-jpa.jar
WORKDIR E:\Office\POC\dock-git
ENTRYPOINT ["java","-jar","dockerJpa.jar"]