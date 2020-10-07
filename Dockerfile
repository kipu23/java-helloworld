FROM alpine/git:latest as clone
WORKDIR /app
RUN git clone https://github.com/kipu23/java-helloworld.git

FROM maven:adoptopenjdk as build
WORKDIR /app
COPY --from=clone /app/java-helloworld /app
RUN mvn install

FROM openjdk:16-jdk-slim
WORKDIR /app
COPY --from=build /app/target/helloworld-1.0.jar /app
CMD ["java -jar helloworld-1.0.jar"]