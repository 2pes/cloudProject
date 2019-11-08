package com.company.project.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

/**
 * @author Chen
 * @created 2019-11-08-0:12.
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

   /*
   改为自定义的rule
   @Bean
    public IRule randomRule() {
        //轮询
        //return new RoundRobinRule();
        //随机
        return new RandomRule();
        //随机
        //return new RetryRule();
    }*/
}