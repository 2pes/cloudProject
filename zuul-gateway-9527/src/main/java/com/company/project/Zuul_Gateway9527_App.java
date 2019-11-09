package com.company.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Chen
 * @created 2019-11-08-0:10.
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_Gateway9527_App {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_Gateway9527_App.class, args);
    }
}
