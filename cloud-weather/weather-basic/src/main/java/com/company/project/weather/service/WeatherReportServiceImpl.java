package com.company.project.weather.service;


import com.company.project.weather.model.Weather;
import com.company.project.weather.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Weather Report Service.
 * 
 * @since 1.0.0 2017年11月24日
 * @author ChenYong
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {
	@Autowired
	private WeatherDataService  weatherDataService;
	
	@Override
	public Weather getDataByCityId(String cityId) {
		WeatherResponse resp = weatherDataService.getDataByCityId(cityId);
		return resp.getData();
	}

}
