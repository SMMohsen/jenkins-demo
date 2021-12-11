FROM openjdk:8
EXPOSE 8080
COPY /target/*.jar /app.jar
ENTRYPOINT ["java","-jar","-DDB_HOST","/app.jar"]