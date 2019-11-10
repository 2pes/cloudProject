package com.company.project.weather.web;

import com.company.project.weather.service.CityClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChenYong
 * @version 2019-5-13
 */
@RestController
public class CityController {

    @Autowired
    private CityClient cityClient;

    @GetMapping("/cities")
    public String listCity()   {
        String body = cityClient.listCity();
        return body;
    }
}
