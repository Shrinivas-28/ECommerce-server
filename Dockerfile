# Use a lightweight base image with OpenJDK 17
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container (assuming you've built it as E-commerce.jar)
COPY target/E-commerce.jar app.jar

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Set environment variables for the database connection
# These can also be configured in Render's dashboard environment settings for better security
ENV MYSQL_HOST=mysql \
    MYSQL_PORT=3306 \
    MYSQL_DATABASE=E_commerce \
    MYSQL_USERNAME=root \
    MYSQL_PASSWORD=Root@123

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]

# Ensure that the image layers are minimized
# Optional: run the application as a non-root user for added security
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
