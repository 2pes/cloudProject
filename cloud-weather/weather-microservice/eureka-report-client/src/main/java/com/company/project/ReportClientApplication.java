package com.company.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ReportClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReportClientApplication.class, args);
    }

}
