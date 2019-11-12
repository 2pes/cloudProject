package com.company.project.weather.service;

import com.company.project.city.model.City;
import com.company.project.weather.model.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author Chen
 * @created 2019-11-10-21:01.
 */
@FeignClient("zuul-gateway")
public interface DataClient {

    @GetMapping("/city/cities")
    List<City> listCity() throws Exception;

    @GetMapping("/data/weather/cityId/{cityId}")
    WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);

}