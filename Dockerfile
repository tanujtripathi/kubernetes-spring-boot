FROM openjdk:17-oracle
MAINTAINER baeldung.com
COPY target/kubernetes-learning-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]