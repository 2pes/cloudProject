package com.company.project;

import com.company.rule.SelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Chen
 * @created 2019-11-08-0:10.
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="PROVIDER-DEPT",configuration= SelfRule.class)  //在启动该微服务的时候加载我们的自定义Ribbon配置类，从而使配置生效
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}
