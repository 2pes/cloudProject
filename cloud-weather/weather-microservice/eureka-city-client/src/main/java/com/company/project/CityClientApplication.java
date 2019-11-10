package com.company.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CityClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CityClientApplication.class, args);
    }

}