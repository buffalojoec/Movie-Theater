# Movie Theater

This is an example Spring Boot application that comes pre-packaged as a full-stack application.

### Function

The core functionality of this application is to store ticket sales in a database
and show customers only the number of seats that haven't been purchased for each
showtime.

Users select their showtime and number of tickets, click "Buy" and the application will
update the number of tickets available for a particular showtime.

### Design

Uses Maven to install `node` and `npm` and build the React front-end when the developer runs `mvn install`.

It also uses Docker to stand up a MySQL instance for data persistence 
and Prometheus & Grafana containers for monitoring the application's health.

To launch this application locally, run `mvn install && mvn spring-boot:run`.

To launch this application with Docker, run `docker-compose` on the `docker-compose.yml` file.

You will see the React pages generated at `localhost:8080/`.

### Demo

![](demo_1.png)
![](demo_2.png)
![](demo_3.png)
![](demo_4.png)