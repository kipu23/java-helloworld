FROM maven:3.6.3-openjdk-16

RUN useradd -m -u 1000 -s /bin/bash jenkins

RUN yum install openssh-clients