FROM java:8
EXPOSE 8800
RUN git clone https://github.com/prerit96/docker2.git /var/www/java

FROM maven:3.5-jdk-8-alpine
WORKDIR /var/www/java
RUN ls
RUN mvn clean install