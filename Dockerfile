FROM eclipse-temurin:17
COPY target/sampleweb.jar sampleweb.jar
CMD ["java","-jar","sampleweb.jar"]