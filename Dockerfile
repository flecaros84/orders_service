#/Dockerfile

# Java 17 runtime (más liviano que JDK)
FROM eclipse-temurin:17-jre

# Directorio de trabajo
WORKDIR /app

# Copiar jar generado por Maven/Gradle
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Puerto que usará la aplicación
EXPOSE 8080

# Ejecutar la aplicación
ENTRYPOINT ["java","-jar","app.jar"]