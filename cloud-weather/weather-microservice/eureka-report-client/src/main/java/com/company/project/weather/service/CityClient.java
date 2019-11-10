package com.company.project.weather.service;

import com.company.project.city.model.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Chen
 * @created 2019-11-10-21:01.
 */
@FeignClient("eureka-city-client")
public interface CityClient {

    @GetMapping("/cities")
    List<City> listCity() throws Exception;
}