FROM ubuntu
WORKDIR E:/Office/POC/dock-git
RUN apt-get install -y git
RUN git clone https://github.com/prerit96/docker2.git

FROM maven:3.5-jdk-8-alpine
WORKDIR E:/Office/POC/dock-git/docker2
RUN ls -la
WORKDIR E:/Office/POC
RUN ls -la