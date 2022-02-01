FROM openjdk:8
ADD target/docker4-0.0.1-SNAPSHOT.jar docker4-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","docker4-0.0.1-SNAPSHOT.jar"]