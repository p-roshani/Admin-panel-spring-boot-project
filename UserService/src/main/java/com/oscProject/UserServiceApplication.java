package com.oscProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.kafka.annotation.EnableKafkaStreams;

@EnableKafkaStreams
@SpringBootApplication
@EntityScan(basePackages = "com.oscProject.entities")

public class UserServiceApplication {
    public static void main(String[] args ){
        SpringApplication.run(UserServiceApplication.class, args);
    }
}
