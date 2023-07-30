FROM openjdk:17-jdk

WORKDIR /app

COPY target/crud-demo-1.0.0.jar /app/crud-demo.jar

EXPOSE 8080

CMD ["java", "-jar", "crud-demo.jar"]