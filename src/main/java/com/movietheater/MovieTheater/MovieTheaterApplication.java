package com.movietheater.MovieTheater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableAutoConfiguration
public class MovieTheaterApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MovieTheaterApplication.class, args);
	}

}
