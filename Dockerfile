FROM openjdk:15
RUN mvn install
ADD target/movie-theater.jar movie-theater.jar
ENTRYPOINT ["java", "-jar", "movie-theater.jar"]