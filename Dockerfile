FROM openjdk:11
COPY target/HITHRON-0.0.1-SNAPSHOT.jar HITHRON-0.0.1.jar
ENTRYPOINT ["java","-jar","/HITHRON-0.0.1.jar"]