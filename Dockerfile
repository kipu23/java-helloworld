FROM maven:openjdk
RUN apt update
RUN apt install -y git