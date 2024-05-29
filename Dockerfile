FROM openjdk:17
EXPOSE 8085
ADD ./target/ProyectoCine-1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]