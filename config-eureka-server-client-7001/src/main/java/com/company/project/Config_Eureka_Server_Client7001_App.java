package com.company.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Chen
 * @created 2019-11-08-0:10.
 */
@SpringBootApplication
@EnableEurekaServer//EurekaServer服务器端启动类,接受其它微服务注册进来
public class Config_Eureka_Server_Client7001_App {
    public static void main(String[] args) {
        SpringApplication.run(Config_Eureka_Server_Client7001_App.class, args);
    }
}
