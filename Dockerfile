FROM ubuntu
WORKDIR /var/www/java
RUN git clone https://github.com/prerit96/docker2.git

FROM maven:3.5-jdk-8-alpine
WORKDIR /var/www/java/docker2
RUN ls -la
WORKDIR /var/www/java
RUN ls -la
