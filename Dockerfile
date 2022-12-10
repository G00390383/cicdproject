#Using java version 17 alpine(slimmed down)
FROM openjdk:17-jdk-alpine

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8081 available to the world outside this container
EXPOSE 8081

# The application's jar file
ARG JAR_FILE=target/microservices-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} microservices-0.0.1-SNAPSHOT.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/microservices-0.0.1-SNAPSHOT.jar"]