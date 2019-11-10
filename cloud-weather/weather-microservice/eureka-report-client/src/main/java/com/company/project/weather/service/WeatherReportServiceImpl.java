package com.company.project.weather.service;


import com.company.project.weather.model.Weather;
import com.company.project.weather.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Weather Report Service.
 *
 * @author ChenYong
 * @since 1.0.0 2017年11月24日
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Autowired
    private WeatherDataClient weatherDataClient;

    @Override
    public Weather getDataByCityId(String cityId) {
        // 改为由天气数据API微服务来提供
        WeatherResponse weatherResponse = weatherDataClient.getDataByCityId(cityId);
        Weather data = weatherResponse.getData();
        return data;
    }

}
