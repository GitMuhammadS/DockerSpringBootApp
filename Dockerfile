FROM openjdk:17
COPY target/springboot-rest-app.jar /usr/app/
WORKDIR /usr/app/
ENTRYPOINT ["java","-jar","spring-rest-app.jar"]