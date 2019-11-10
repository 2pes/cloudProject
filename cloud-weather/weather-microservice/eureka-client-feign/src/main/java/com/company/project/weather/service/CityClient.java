package com.company.project.weather.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Chen
 * @created 2019-11-10-21:01.
 */
@FeignClient("eureka-city-client")
public interface CityClient {

    @GetMapping("/cities")
    String listCity();
}