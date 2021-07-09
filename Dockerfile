FROM java:8
EXPOSE 8800
WORKDIR /var/www/java
RUN git clone https://github.com/prerit96/docker2.git

FROM maven:3.5-jdk-8-alpine
WORKDIR /var/www/java/docker2
RUN ls
RUN mvn clean install