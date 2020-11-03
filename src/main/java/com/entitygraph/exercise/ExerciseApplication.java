package com.entitygraph.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebServlet;

@SpringBootApplication
@Configuration
public class ExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseApplication.class, args);
    }

}
