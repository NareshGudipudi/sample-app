FROM openjdk:8
ADD target/App-0.0.1-SNAPSHOT.jar App.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "App.jar"]
