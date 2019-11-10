package com.company.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Chen
 * @created 2019-11-08-0:10.
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_App {
    public static void main(String[] args) {
        SpringApplication.run(Config_3344_App.class, args);
    }
}
