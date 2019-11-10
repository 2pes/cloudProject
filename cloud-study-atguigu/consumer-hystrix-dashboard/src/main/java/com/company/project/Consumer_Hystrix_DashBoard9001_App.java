package com.company.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Chen
 * @created 2019-11-08-0:10.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class Consumer_Hystrix_DashBoard9001_App {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_Hystrix_DashBoard9001_App.class, args);
    }
}
