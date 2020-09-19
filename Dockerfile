FROM ubuntu:latest

RUN apt update
RUN apt install -y maven
RUN apt install -y git