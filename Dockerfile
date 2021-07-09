FROM ubuntu
MAINTAINER "prerit mathur"
#Install git
RUN apt-get update \        
     apt-get install -y git
RUN mkdir /home/sampleTest \      
           cd /home/sampleTest \        
           git clone https://github.com/prerit96/docker2.git
#Set working directory
WORKDIR /home/sampleTest