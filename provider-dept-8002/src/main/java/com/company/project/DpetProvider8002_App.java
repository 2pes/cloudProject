package com.company.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Chen
 * @created 2019-11-07-23:09.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DpetProvider8002_App {

    public static void main(String[] args) {
        SpringApplication.run(DpetProvider8002_App.class,args);
    }
}
