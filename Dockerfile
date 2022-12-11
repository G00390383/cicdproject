#FROM initializes a new build stage in our case we're
#Using java version 17 alpine(slimmed down)
FROM openjdk:17-jdk-alpine

# ADD a volume pointing to /tmp to store persistent data
VOLUME /tmp

# Make port 8081 available to the world outside this container
EXPOSE 8081

# The application's jar file store in an ARG build time variable this is only
#accesable while the image is being built
ARG JAR_FILE=target/microservices-0.0.1-SNAPSHOT.jar

# ADD copys the application's jar to the container from the args directory
ADD ${JAR_FILE} microservices-0.0.1-SNAPSHOT.jar

# The ENTRYPOINT will set executable that will run when container is initiated
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/microservices-0.0.1-SNAPSHOT.jar"]